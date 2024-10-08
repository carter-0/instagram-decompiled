package X;

import android.net.Uri;
import com.fbpay.hub.paymentmethods.api.FbPayCreditCard;
import com.fbpay.hub.paymentmethods.api.FbPayPaymentMethod;
import com.fbpay.w3c.Address;
import com.fbpay.w3c.CardDetails;
import com.fbpay.w3c.W3CCardDetail;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;

public final class TXV extends 0Yg implements 0sP {
    public static final TXV A00 = new TXV();

    public TXV() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ArrayList arrayList;
        Integer num;
        ImmutableList immutableList = ((C45455Cwm) obj).A04;
        if (immutableList != null) {
            ArrayList<FbPayPaymentMethod> A1C = AnonymousClass7TE.A1C();
            Iterator it = immutableList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                FbPayCreditCard fbPayCreditCard = ((FbPayPaymentMethod) next).A03;
                if (fbPayCreditCard == null || (!fbPayCreditCard.A0F)) {
                    A1C.add(next);
                }
            }
            arrayList = AnonymousClass7TG.A0r(A1C);
            for (FbPayPaymentMethod fbPayPaymentMethod : A1C) {
                JTQ.A1K(fbPayPaymentMethod);
                FbPayCreditCard fbPayCreditCard2 = fbPayPaymentMethod.A03;
                0qQ.A0A(fbPayCreditCard2);
                Integer num2 = null;
                String str = null;
                Address address = new Address((String) null, (String) null, fbPayCreditCard2.A05, (String) null, (String) null, (String) null, (String) null, fbPayCreditCard2.A0E);
                String str2 = fbPayCreditCard2.A06;
                Uri uri = fbPayPaymentMethod.A01;
                Boolean bool = null;
                if (uri != null) {
                    str = uri.toString();
                }
                String name = fbPayCreditCard2.A01.name();
                String str3 = fbPayCreditCard2.A07;
                if (str3 != null) {
                    num = Pxf.A0Z(str3);
                } else {
                    num = null;
                }
                String str4 = fbPayCreditCard2.A08;
                if (str4 != null) {
                    num2 = Pxf.A0Z(str4);
                }
                String str5 = fbPayCreditCard2.A0A;
                ImmutableList immutableList2 = fbPayCreditCard2.A02;
                CardDetails cardDetails = new CardDetails(address, immutableList2, (Boolean) null, num, num2, name, str, (String) null, str2, (String) null, str5);
                if (immutableList2 != null) {
                    bool = Boolean.valueOf(AnonymousClass7TE.A1b(immutableList2));
                }
                boolean A1X = AnonymousClass7TG.A1X(fbPayCreditCard2.A03);
                String str6 = fbPayCreditCard2.A0B;
                if (str6 == null) {
                    str6 = "";
                }
                C11367SPk.A03(str6, "latestBoundDevice");
                arrayList.add(new W3CCardDetail(cardDetails, bool, str6, fbPayCreditCard2.A0C, fbPayCreditCard2.A0D, A1X));
            }
        } else {
            arrayList = null;
        }
        0qQ.A0A(arrayList);
        return arrayList;
    }
}
