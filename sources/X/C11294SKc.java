package X;

import com.facebookpay.common.models.CurrencyAmount;
import com.facebookpay.common.recyclerview.adapteritems.PuxEntityItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxPriceTableItem;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.facebookpay.expresscheckout.models.ItemDetails;
import com.facebookpay.expresscheckout.models.PriceInfo;
import com.facebookpay.expresscheckout.models.TransactionInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: X.SKc  reason: case insensitive filesystem */
public abstract class C11294SKc {
    public static final Map A02(ECPPaymentRequest eCPPaymentRequest, List list) {
        0qQ.A0B(eCPPaymentRequest, 1);
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        int i = 0;
        for (Object next : list) {
            int i2 = i + 1;
            if (i < 0) {
                0sr.A1T();
                throw AnonymousClass00P.createAndThrow();
            }
            PriceInfo priceInfo = (PriceInfo) next;
            String A0O = 002.A0O("ITEM_LIST", i);
            String str = priceInfo.A04;
            String str2 = priceInfo.A05;
            ItemDetails itemDetails = eCPPaymentRequest.A04.A09;
            CurrencyAmount currencyAmount = priceInfo.A00;
            String str3 = priceInfo.A03;
            AnonymousClass7TF.A1I(A0O, SUj.A09(new PuxEntityItem(currencyAmount, RH6.A0d, itemDetails, (String) null, str, str2, DbX.A0t(priceInfo.A02), str3)), A0r);
            i = i2;
        }
        return 0Yt.A08(A0r);
    }

    public static final SUj A00(SUj sUj, Integer num) {
        TransactionInfo transactionInfo = (TransactionInfo) sUj.A01;
        Integer num2 = null;
        if (transactionInfo != null) {
            ArrayList<PriceInfo> arrayList = transactionInfo.A08;
            num2 = transactionInfo.A04;
            if (arrayList != null) {
                return SUj.A09(new PuxPriceTableItem(RH6.A0i, num2, num, arrayList));
            }
        }
        return SUj.A06(sUj, new PuxPriceTableItem(RH6.A0i, num2, num, AnonymousClass7TE.A1C()));
    }

    public static final List A01(String str, Map map) {
        PuxEntityItem puxEntityItem;
        String str2;
        Collection<SUj> values = map.values();
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (SUj sUj : values) {
            Object obj = sUj.A01;
            if (!(!(obj instanceof PuxEntityItem) || (puxEntityItem = (PuxEntityItem) obj) == null || (str2 = puxEntityItem.A03) == null)) {
                A1C.add(str2);
            }
        }
        ArrayList A0U = 00k.A0U(A1C);
        if (A0U.isEmpty() && str != null) {
            A0U.add(str);
        }
        return 00k.A0a(A0U);
    }
}
