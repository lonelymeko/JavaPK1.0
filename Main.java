public class Main {
    public static void main(String arg[]){
        //PVP
        Role r1 = new Role(200,"张三",1);
        Role r2 = new Role(200,"李四",1);
        int j = 1;
        System.out.println("-----PVP开始!-----");
        System.out.println(r1.getName()+"血量:"+r1.getHP()+"  "+r2.getName()+"血量:"+r2.getHP());
        System.out.println(r1.getName()+"攻击力:"+r1.getATK()+"  "+r2.getName()+"攻击力:"+r2.getATK());
        while(r1.getHP()!=0 && r2.getHP()!=0){
            System.out.println("-----第"+j+"回合-----");
            r1.attack(r2);
            if(r2.getHP()==0){
                System.out.println(r1.getName()+"赢了");
                break;
            }
            r2.attack(r1);
            if(r1.getHP()==0){
                System.out.println(r2.getName()+"赢了");
                break;
            }
            j++;
        }
        //boss战

        Role boss1 = new Role(800,"赤鸢",2);
        Role r3 = new Role(288,"冲锋兵", 4F);
        Role r4 = new Role(400,"守卫兵",1.5F);
        int i = 1;
        System.out.println("-----BOSS战开始!-----");
        System.out.println(r3.getName()+"血量:"+r3.getHP()+"  "+r4.getName()+"血量:"+r4.getHP());
        System.out.println(boss1.getName()+"血量:"+boss1.getHP());
        while((r3.getHP()!=0 || r2.getHP()!=0) && boss1.getHP()!=0){//双方中一方全部倒下才算失败
            System.out.println("-----第"+i+"回合-----");
            //玩家回合
            if(boss1.getHP()!=0) r3.attack(boss1);
            if(boss1.getHP()==0){
                System.out.println("讨伐胜利!");
                break;
            }
            if(boss1.getHP()!=0) r4.attack(boss1);
            if(boss1.getHP()==0){
                System.out.println("讨伐胜利!");
                break;
            }
            //BOSS回合
            if(i%3==0) {
                System.out.println("BOSS"+ boss1.getName()+"释放终结技!!");
                boss1.setATK((float) (1.5* boss1.getATK()));
                if(r3.getHP()!=0 &&r4.getHP()!=0) {
                    boss1.attack(r3);
                    boss1.attack(r4);
                    boss1.setATK(2);//BOSS攻击力恢复正常
                    if(r3.getHP()==0 && r4.getHP()==0){
                        System.out.println("讨伐失败");
                        break;
                    }
                }
                else if(r3.getHP()==0 && r4.getHP()!=0){//r3死了就打2次r4
                    boss1.attack(r4);
                    boss1.attack(r4);
                    if(r3.getHP()==0 && r4.getHP()==0){
                        System.out.println("讨伐失败");
                        break;
                    }
                }
                else if(r3.getHP()!=0 && r4.getHP()==0){//r4死了就打2次r3
                    boss1.attack(r3);
                    boss1.attack(r3);
                    if(r3.getHP()==0 && r4.getHP()==0){
                        System.out.println("讨伐失败");
                        break;
                    }
                }
                else {
                    System.out.println("讨伐失败");
                    break;
                }
                boss1.setATK(2);
            }
            else if(i%3==1){//每三回合优先打r3
                if(r3.getHP()!=0 &&r4.getHP()!=0) {
                    boss1.attack(r3);
                    if(r3.getHP()==0 && r4.getHP()==0){
                        System.out.println("讨伐失败");
                        break;
                    }
                }
                else if(r3.getHP()==0 && r4.getHP()!=0){
                    boss1.attack(r4);
                    if(r3.getHP()==0 && r4.getHP()==0){
                        System.out.println("讨伐失败");
                        break;
                    }
                }
                else if(r3.getHP()!=0 && r4.getHP()==0){
                    boss1.attack(r3);
                    if(r3.getHP()==0 && r4.getHP()==0){
                        System.out.println("讨伐失败");
                        break;
                    }
                }
                else {
                    System.out.println("讨伐失败");
                    break;
                }
            }
            else if(i%3==2){//每三回合优先打r4
                if(r3.getHP()!=0 &&r4.getHP()!=0) {
                    boss1.attack(r4);
                    if(r3.getHP()==0 && r4.getHP()==0){
                        System.out.println("讨伐失败");
                        break;
                    }
                }
                else if(r3.getHP()==0 && r4.getHP()!=0){
                    boss1.attack(r4);
                    if(r3.getHP()==0 && r4.getHP()==0){
                        System.out.println("讨伐失败");
                        break;
                    }
                }
                else if(r3.getHP()!=0 && r4.getHP()==0){
                    boss1.attack(r3);
                    if(r3.getHP()==0 && r4.getHP()==0){
                        System.out.println("讨伐失败");
                        break;
                    }
                }
                else {
                    System.out.println("讨伐失败");
                    break;
                }
            }
            i++;

        }
    }

    }

