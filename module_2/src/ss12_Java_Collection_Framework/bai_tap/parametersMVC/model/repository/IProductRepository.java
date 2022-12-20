package ss12_Java_Collection_Framework.bai_tap.parametersMVC.model.repository;

import ss12_Java_Collection_Framework.bai_tap.parametersMVC.model.model.Product;

public interface IProductRepository {
    void add(Product product);

    void display();

    Product checkID(int id);

    void update(Product product);

    void delete(int id);

    void search(String string);

    void sort(int num);
}
