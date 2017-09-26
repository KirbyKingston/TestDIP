
package testdip;

/**
 *
 * @author Mitch
 */
public class RestaurantTipCalaculator implements TipCalculator {
    private double tipPercent;
    private double billAmt;

//    public double calcTip(double billAmt, QualityOfService qos){
//        switch(qos){
//            case POOR:
//                tipPercent = 0.10;
//                break;
//            case GOOD:
//                tipPercent = 0.15;
//                 break;
//            case EXCELLENT:
//                tipPercent = 0.20;
//                 break;   
//            default:
//                tipPercent = 0.15;
//        }
//        return billAmt * tipPercent;
//    }
    
    public RestaurantTipCalaculator(double billAmt, double tipPercent){
        this.billAmt = billAmt;
        this.tipPercent = tipPercent;
    }
    @Override
    public final double calcTip(){
        return tipPercent * billAmt;
    }
    
    public double getTipPercent() {
        return tipPercent;
    }

    public void setTipPercent(double tipPercent) {
        this.tipPercent = tipPercent;
    }
    
//    public double getBillAmt() {
//        return billAmt;
//    }
//
//    public void setBillAmt(double billAmt) {
//        this.billAmt = billAmt;
//    }

}
