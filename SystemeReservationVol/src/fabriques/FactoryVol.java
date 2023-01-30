package fabriques;

import vols.Vol;
import vols.VolInternational;
import vols.VolNational;

public class FactoryVol {

    public Vol getVols(String typeVols) {
        if (typeVols == null) {
            return null;
        }
        if (typeVols.equalsIgnoreCase("NATIONAUX")) {
            return new VolNational("1", "sfax", "tunis", "12-01-2023", "12-01-2023");
        } else if (typeVols.equalsIgnoreCase("INTERNATIONAUX")) {
            return new VolInternational("2", "sfax", "paris", "12-01-2023", "13-01-2023");
        }
        return null;
    }
}
