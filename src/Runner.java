import java.io.IOException;

public class Runner {
	public static void main(String[] args) {
		String[] paths = { "C:\\Users\\Dmytro_Veres@epam.com\\workspace\\ClassLoaderTest\\src" };
		
		while (true) {
			try {
				TestModuleClassLoader loader = new TestModuleClassLoader(paths);
				Class testModuleClass = Class.forName("TestModule", true,
						loader);
				Object test = testModuleClass.newInstance();
				System.out.println(test.toString());
				System.in.read();
				System.in.read();
			} catch (ClassNotFoundException e) {
				System.out.println("Class with such name could not be found");
			} catch (InstantiationException e) {
				System.out.println("Could not create the instance of class");
			} catch (IllegalAccessException e) {
				System.out.println("Don't have access for method toString() of class");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}
