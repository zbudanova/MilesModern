public class BonusMilesService {
    public int calculate (int cost) {
        int bonusRuble = 20;
        int miles = cost / bonusRuble;
        return miles;
    }
}
