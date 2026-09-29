import org.hibernate.Session;

public class HibernateDemoMain {
    public static void main(String[] args) {
        Session session = HibernateUtill.getSession();

        try{
            UserClassHibernate user=
                    new UserClassHibernate("Musaib SHAKEEL");
            session.beginTransaction();
            session.persist(user);
            session.getTransaction().commit();
            System.out.println("'user saved: " +user.getId());
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            HibernateUtill.close();
        }
    }

}

