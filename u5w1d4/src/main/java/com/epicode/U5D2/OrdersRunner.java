package com.epicode.U5D2;

import com.epicode.U5D2.dao.ItemsService;
import com.epicode.U5D2.entities.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class OrdersRunner implements CommandLineRunner {

	@Autowired
	ItemsService itemsService;

	@Override
	public void run(String... args) throws Exception {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5D2Application.class);
		try {
//			Menu m = (Menu) ctx.getBean("menu");
//			m.printMenu();
//
//			Table t1 =  ctx.getBean("Tavolo1", Table.class);
//
//			Order o1 = new Order(4, t1);
//
//			o1.addItem(ctx.getBean("pizza_margherita", Pizza.class));
//			o1.addItem(ctx.getBean("hawaiian_pizza", Pizza.class));
//			o1.addItem(ctx.getBean("salami_pizza_xl", Pizza.class));
//			o1.addItem(ctx.getBean("lemonade", Drink.class));
//			o1.addItem(ctx.getBean("lemonade", Drink.class));
//			o1.addItem(ctx.getBean("wine", Drink.class));
//
//			System.out.println("DETTAGLI TAVOLO 1:");
//			t1.print();
//			System.out.println();
//			o1.print();
//
//			System.out.println("CONTO TAVOLO 1");
//			System.out.println(o1.getTotal())

			System.out.println("----------- SAVE -----------");
			itemsService.saveItem(ctx.getBean("toppings_salami", Item.class));
			itemsService.saveItem(ctx.getBean("toppings_cheese", Item.class));
			itemsService.saveItem(ctx.getBean("toppings_tomato", Item.class));
			itemsService.saveItem(ctx.getBean("pizza_margherita", Item.class));
			itemsService.saveItem(ctx.getBean("salami_pizza", Item.class));






		} catch (Exception ex) {
			System.err.println(ex.getMessage());
		} finally {
			ctx.close();
		}
	}
}
