public class BonusMilesService {

    public int calculate(int price) {
        int result;
        int stepPlus = 20;
        int bonus = 1;
        result = (price / stepPlus * bonus);;
        return result;
    }
    }

