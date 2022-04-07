package practice;

// Function interface and lambda function

interface lambda_interface
{
	void show();
}

public class function_interface {

	public static void main(String[] args) {
		lambda_interface obj = () -> System.out.println("Im the best");
		obj.show();

	}

}
