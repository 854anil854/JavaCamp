package interfaces;

public class CustomerManager {
	//manager sýnýfýnda interfaceimizi tanýmladýk ve constructor olusturduk
	//dependency injection
	//private Logger logger;
	private Logger[] loggers;
	
//	public CustomerManager(Logger logger) {
//		this.logger = logger;
//	}
	
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}

//	public void add(Customer customer) {
//		System.out.println(customer.getFirstName() +" customer added.");
//		logger.log(customer.getFirstName());
//	}
	
	public void add(Customer customer) {
		System.out.println(customer.getFirstName() +" customer added.");
		
		//static method
		Utils.runLoggers(loggers, customer.getFirstName());
//		for (Logger logger : loggers) {
//			logger.log(customer.getFirstName());
//		}
	}
	
	public void delete(Customer customer) {
		System.out.println(customer.getFirstName() +" customer deleted.");
		
		Utils.runLoggers(loggers, customer.getLastName());
	}

//	public Logger getLogger() {
//		return logger;
//	}
//
//	public void setLogger(Logger logger) {
//		this.logger = logger;
//	}

	public Logger[] getLoggers() {
		return loggers;
	}

	public void setLoggers(Logger[] loggers) {
		this.loggers = loggers;
	}
}
