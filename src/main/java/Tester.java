import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Tester {
	public static void main(String[] args) {
		
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		System.out.println("Called");
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		Product product=new Product();
		product.setId(3);
		product.setName("TestNew");
		product.setCost(2345);
		session.save(product);
		transaction.commit();
		System.out.println("Insertion Done");
		
		
		
	}

}
