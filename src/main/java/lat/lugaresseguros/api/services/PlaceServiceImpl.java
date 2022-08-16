package lat.lugaresseguros.api.services;
import lat.lugaresseguros.api.models.PlaceModel;
import lat.lugaresseguros.api.repositories.PlacejpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
  public class PlaceServiceImpl implements PlaceService {
   @Autowired
   PlacejpaRepository repository;
   //@Override
    //public String getHello() {
     //   return "Hello World desde un servidor";
    //}

   // @Override
   // public String getHello(String name) {
       // return name;  }

    @Override
    public PlaceModel createPlace(PlaceModel place) {

        return repository.save(place);
    }

    @Override
    public PlaceModel updatePlace(Long id, PlaceModel place) {
        return null;
    }

    @Override
    public Collection<PlaceModel> getPlace() {
        return null;
    }

    @Override
    public PlaceModel createPlaceService(PlaceModel place) {
        return null;
    }

    @Override
    public PlaceModel updatePlaceService(Long id, PlaceModel place) {
        return repository.findById(id)
                .map(placefound -> {
                    placefound.setName(place.getName());
                    return repository.save(placefound);
                })
                .orElseGet(() -> {
                    place.setId(id);
                    return repository.save(place);
                });
    }






    @Override
    public List<PlaceModel> getPlaceService() {
        return repository.findAll();
    }




    @Override
    public void deletePlaceService(Long id) {
        repository.deleteById(id);

    }

    // @Override
           //public Collection<PlaceModel> getPlace() {
    //  return null;
    //  }

    //@Override
           //public void updatePlace(Long id, PlaceModel place) {
           // repository.remove(id);
           // place.setId(id);
    // repository.put (id, place);
    // }

    // @Override
           // public Collection<PlaceModel> getPlace() {
    //   return repository.values();
    // }




}
