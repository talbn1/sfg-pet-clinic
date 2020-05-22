package talbn1.spring.petclinic.model;


/***
 *  Tal Ben Arie 28/04/2020
 */
public class PetType extends BaseEntity{

    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
