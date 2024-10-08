package X;

import com.instagram.model.payments.CurrencyAmountInfo;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class CmI {
    public static Map A00(CurrencyAmountInfo currencyAmountInfo) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (currencyAmountInfo.getAmount() != null) {
            A1H.put("amount", currencyAmountInfo.getAmount());
        }
        if (currencyAmountInfo.getAmountWithOffset() != null) {
            A1H.put("amount_with_offset", currencyAmountInfo.getAmountWithOffset());
        }
        if (currencyAmountInfo.getCurrency() != null) {
            A1H.put("currency", currencyAmountInfo.getCurrency());
        }
        if (currencyAmountInfo.BXp() != null) {
            A1H.put("offset", currencyAmountInfo.BXp());
        }
        return 0Yt.A0B(A1H);
    }
}
