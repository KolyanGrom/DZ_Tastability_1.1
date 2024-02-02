public class BonusMilesService {

    public int calculate(int price) {
        int result;
        int stepplus = 20;
        int bonuse = 1;
        result = (price / stepplus * bonuse);;
        return result;
    }
    }

