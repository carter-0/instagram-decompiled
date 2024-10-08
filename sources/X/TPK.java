package X;

import android.net.Uri;
import com.fbpay.hub.paymentmethods.api.FbPayNewCreditCardOption;
import com.fbpay.hub.paymentmethods.api.FbPayNewPayPalOption;
import com.fbpay.hub.paymentmethods.api.FbPayPaymentMethod;
import com.fbpay.hub.paymentmethods.api.FbPayShopPay;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import java.util.Set;

public final class TPK implements AnonymousClass0eL, 0sP {
    public final int A00;
    public final Object A01;
    public final String A02;

    public TPK(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    /* JADX WARNING: type inference failed for: r0v16, types: [X.Reo, java.lang.Object] */
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Set set;
        int i;
        S2S s2s;
        FbPayNewPayPalOption fbPayNewPayPalOption;
        if (this.A00 != 0) {
            return C332407Ux.A01((C332407Ux) this.A01, this.A02, (AnonymousClass4D7) obj);
        }
        SUj sUj = (SUj) obj;
        if (!SUj.A0V(sUj)) {
            return ImmutableList.of();
        }
        Object obj2 = sUj.A01;
        obj2.getClass();
        C45455Cwm cwm = (C45455Cwm) obj2;
        C8269QnB qnB = (C8269QnB) this.A01;
        FbPayNewCreditCardOption fbPayNewCreditCardOption = cwm.A01;
        qnB.A05 = fbPayNewCreditCardOption;
        Set set2 = qnB.A0G;
        REG reg = REG.CREDIT_CARD;
        if (!set2.contains(reg) || fbPayNewCreditCardOption == null) {
            set = qnB.A0F;
            set.remove(reg);
        } else {
            set = qnB.A0F;
            set.add(reg);
        }
        REG reg2 = REG.PAYPAL;
        if (!set2.contains(reg2) || (fbPayNewPayPalOption = cwm.A02) == null) {
            set.remove(reg2);
        } else {
            qnB.A08 = fbPayNewPayPalOption.A00;
            set.add(reg2);
        }
        REG reg3 = REG.SHOP_PAY;
        if (!set2.contains(reg3) || cwm.A03 == null || (s2s = qnB.A07) == null) {
            set.remove(reg3);
        } else {
            String A002 = qnB.A04.A00();
            A002.getClass();
            s2s.A00(A002);
            set.add(reg3);
        }
        qnB.A03 = cwm.A00;
        ImmutableList immutableList = cwm.A04;
        String str = this.A02;
        ImmutableList.Builder A0Y = Pxe.A0Y();
        Qmj qmj = new Qmj();
        qmj.A02 = 2131969226;
        Qms.A00(qmj, A0Y);
        C249803kO it = immutableList.iterator();
        while (it.hasNext()) {
            FbPayPaymentMethod fbPayPaymentMethod = (FbPayPaymentMethod) it.next();
            Qml qml = new Qml(0);
            qml.A0G = fbPayPaymentMethod.A07;
            qml.A0F = fbPayPaymentMethod.A06;
            qml.A0B = new Object();
            qml.A08 = new C11486Sb9(qnB, fbPayPaymentMethod, str, 2);
            Uri uri = fbPayPaymentMethod.A01;
            if (uri != null) {
                qml.A0E = uri.toString();
            } else {
                int i2 = fbPayPaymentMethod.A00;
                if (i2 == 1) {
                    i = R.drawable.payment_paypal_hub;
                } else if (i2 == 2) {
                    i = R.drawable.rectangular_bank;
                } else if (i2 == 3) {
                    qml.A00 = R.attr.fbpay_shop_pay_hub_icon;
                    FbPayShopPay fbPayShopPay = fbPayPaymentMethod.A05;
                    if (fbPayShopPay != null && fbPayShopPay.A02) {
                        qml.A05 = R.attr.fbpay_error_text_color;
                    }
                }
                qml.A02 = i;
            }
            SEE.A00(qml);
            A0Y.add(new Qmq(qml));
        }
        Qmg qmg = new Qmg();
        qmg.A00 = 2131969225;
        qmg.A01 = C11496SbJ.A00(qnB, 63);
        Qmr.A00(qmg, A0Y);
        return A0Y.build();
    }
}
