package RentACar_pack1.dataAccess.concrents;


import RentACar_pack1.dataAccess.abstracts.BrandRepository;
import RentACar_pack1.entities.Brand;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository //Bu sınıf bir dataaccess nesnesidir
public class inMemoryBrandRepository implements BrandRepository{

List<Brand> brands;
public inMemoryBrandRepository()  {
    brands= new ArrayList<Brand>();
    brands.add(new Brand(1,"BMW"));
    brands.add(new Brand(2,"opel"));
    brands.add(new Brand(3,"fiat"));
    brands.add(new Brand(4,"seat"));
    brands.add(new Brand(5,"mercedes"));



}
    @Override
    public List<Brand> getAll() {
        return brands;
    }


}
