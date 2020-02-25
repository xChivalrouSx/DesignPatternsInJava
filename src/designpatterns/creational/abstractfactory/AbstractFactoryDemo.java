package designpatterns.creational.abstractfactory;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class AbstractFactoryDemo {

	public static void run() {
		try {
			runAbstractFactoryDocumentBuilderExample();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void runAbstractFactoryDocumentBuilderExample() throws Exception {
		String xml = "<document><body>test</body></document>";
		ByteArrayInputStream bais = new ByteArrayInputStream(xml.getBytes());
		
		DocumentBuilderFactory abstractFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder factory = abstractFactory.newDocumentBuilder();
		Document doc = factory.parse(bais);
		
		System.out.println("Root Element : " + doc.getDocumentElement().getNodeName());
		System.out.println(abstractFactory.getClass());
		System.out.println(factory.getClass());
	}
}
