package net.supdip.shoppingBackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.supdip.shoppingBackend.dao.CategoryDAO;
import net.supdip.shoppingBackend.dto.Category;


@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO{

	private static List<Category>  categories = new ArrayList<Category>();
	
	static {
		
		Category category = new Category();
		//adding first category
		category.setId(1);
		category.setName("Television");
		category.setDescription("This is some description for television!");
		category.setImageURL("CAT_1.png");

		categories.add(category);
		
		//second category
		category = new Category();
		//adding first category
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("This is some description for Mobile!");
		category.setImageURL("CAT_2.png");

		categories.add(category);
		//third Category
		category = new Category();
		//adding first category
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("This is some description for Laptop!");
		category.setImageURL("CAT_3.png");

		categories.add(category);
		
		
	}

	@Override
	public List<Category> list() {
		
	return categories;
	}

	@Override
	public Category get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(Category category) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Category category) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Category category) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
