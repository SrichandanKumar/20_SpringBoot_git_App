package in.Insurance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

Map<String,Object> chache=new HashMap<String,Object>();
public String restUrl="http//web/mic/resource";

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
	
		//changes for HIS-134
		
	context.close();
	
	
	}
	
public void chache(){

//logic
}

}
