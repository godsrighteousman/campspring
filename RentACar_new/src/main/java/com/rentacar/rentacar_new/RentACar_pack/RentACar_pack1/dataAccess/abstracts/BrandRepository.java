package RentACar_pack1.dataAccess.abstracts;

import RentACar_pack1.entities.Brand;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BrandRepository  {
    List<Brand> getAll();
}
