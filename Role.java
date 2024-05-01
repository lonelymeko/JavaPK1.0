import java.util.Random;

public class Role {
private int HP;
private int MAXHP;
private float ATK;
private String name;

    public Role() {
    }


    public Role(int HP, String name,float ATK) {
        this.HP = HP;
        this.name = name;
        this.MAXHP = HP;
        this.ATK = ATK;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void attack(Role role){
        if(getHP()!=0){
            if(getHP()<=0.2*getMAXHP()) {
                Random atk = new Random();
                float nowATK = (atk.nextInt(2) + 2)*getATK();
                setATK(nowATK);
                System.out.println("低血量状态,"+getName()+"的攻击力不断大幅度提升");
            }
            Random r = new Random();
            float attacker = (r.nextInt(15)+10) * getATK();
            float remainHP = role.getHP() - attacker;
            remainHP = remainHP < 0 ? 0 : remainHP;
            role.setHP((int) remainHP);
            System.out.println( getName() +"对"+role.getName() +"造成了"+attacker+"点伤害,"+role.getName()+"还剩"+remainHP +"点血");

        }
        else System.out.println(getName()+"阵亡");
    }




    public float getATK() {
        return ATK;
    }


    public void setATK(float ATK) {
        this.ATK = ATK;
    }
    public int getMAXHP() {
        return MAXHP;
    }


}
