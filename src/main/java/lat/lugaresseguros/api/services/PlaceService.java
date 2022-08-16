package lat.lugaresseguros.api.services;

import lat.lugaresseguros.api.models.PlaceModel;

import java.util.Collection;
import java.util.List;

public interface PlaceService {
 //public   String getHello();

  //String getHello(String name);

  PlaceModel createPlace(PlaceModel place);

  PlaceModel updatePlace(Long id, PlaceModel place);

  Collection<PlaceModel> getPlace();
  PlaceModel createPlaceService(PlaceModel place);
  List<PlaceModel> getPlaceService();
  PlaceModel updatePlaceService(Long id, PlaceModel place);
  void deletePlaceService(Long id);
}
