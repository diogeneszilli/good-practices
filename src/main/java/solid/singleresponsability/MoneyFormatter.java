package solid.singleresponsability;

import db.WalletEntity;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class MoneyFormatter {

    public static String getWalletValueInBRText (WalletEntity walletEntity){
        NumberFormat nf = new DecimalFormat("¤ #,##0.00", new DecimalFormatSymbols(new Locale("pt", "BR")));
        return nf.format(walletEntity.getValue());
    }
}
