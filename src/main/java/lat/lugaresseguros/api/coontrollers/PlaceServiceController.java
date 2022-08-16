package lat.lugaresseguros.api.coontrollers;
import java.util.List;
import lat.lugaresseguros.api.models.PlaceModel;
import lat.lugaresseguros.api.services.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

   @RestController
   @RequestMapping("/places")
   public class PlaceServiceController {
   @Autowired
   PlaceService placeService;

   @GetMapping("/")
       public PlaceModel createPlaceController(@RequestBody PlaceModel place){
       return placeService.createPlace(place);
   }

   @GetMapping("/")
    public Collection index() {
       return placeService.getPlace();
   }

       @GetMapping("/")

       public List<PlaceModel> readPlace() {
           return placeService.getPlaceService();
       }
       @PatchMapping("/{id}")

       public PlaceModel updatePlace(@PathVariable("id") Long id, @RequestBody PlaceModel place) {
           return placeService.updatePlaceService(id,place);
       }
       @DeleteMapping("/{id}")
       public void deletePlace(@PathVariable("id") Long id) {
           placeService.deletePlaceService(id);
       }


  //  @GetMapping("/{name}")
  //  public String getHello(@PathVariable("name")String name) {
  // return placeService.getHello(name);}

}

