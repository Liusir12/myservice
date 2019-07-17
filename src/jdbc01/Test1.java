package jdbc01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.junit.Test;

public class Test1 {

	@Test
	public void test2() throws FileNotFoundException, IOException {
		//��һ�ַ�ʽ ͨ���������
		InputStream is = this.getClass().getClassLoader().getResourceAsStream("jdbc01/jdbc1.properties");
		
		Properties pps=new Properties();
		pps.load(is);
		String use  =pps.getProperty("jdbc.user");
		String password  =pps.getProperty("jdbc.password");
		System.out.println("�û�����"+use+"���룺"+password);
	}
	

	@Test
	public void test1() throws FileNotFoundException, IOException {
		
		Properties pps=new Properties();
		pps.load(new FileInputStream(new File("jdbc.properties")));
		String use  =pps.getProperty("jdbc.user");
		String password  =pps.getProperty("jdbc.password");
		System.out.println("�û�����"+use+"���룺"+password);
	}

}
