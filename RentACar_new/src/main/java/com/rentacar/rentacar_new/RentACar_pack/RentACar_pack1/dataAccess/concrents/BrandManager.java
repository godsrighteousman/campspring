package RentACar_pack1.dataAccess.concrents;

import RentACar_pack1.dataAccess.abstracts.BrandRepository;
import RentACar_pack1.dataAccess.abstracts.BrandService;
import RentACar_pack1.entities.Brand;
import jakarta.websocket.server.ServerEndpoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // bu sınıf bir business nesnesidir
public class BrandManager implements BrandService {

    private BrandRepository brandRepository;
    private List<Brand> inMemoryBrandRepository;

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    public BrandManager(BrandRepository brandRepository) {

    }

    @Override
    public List<Brand> getAll() {
        return null;
    }
}
