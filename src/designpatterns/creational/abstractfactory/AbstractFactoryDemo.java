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
			runAbstractFactoryCreditCardExample();
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
	
	private static void runAbstractFactoryCreditCardExample() {
		CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(775);
		CreditCard card = abstractFactory.getCreditCard(CardType.PLATINUM);
		
		System.out.println(card.getClass());
		
		abstractFactory = CreditCardFactory.getCreditCardFactory(600);
		CreditCard anotherCard = abstractFactory.getCreditCard(CardType.GOLD);
		
		System.out.println(anotherCard.getClass());
	}
}
