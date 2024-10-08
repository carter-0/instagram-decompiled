package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.Sc0  reason: case insensitive filesystem */
public final /* synthetic */ class C11539Sc0 implements 1MD {
    public final Object apply(Object obj) {
        String str;
        String str2 = ((C11027S6f) obj).A00;
        if ("PIN".equalsIgnoreCase(str2)) {
            str = "VERIFY_PIN_TO_PAY";
        } else if ("BIO".equalsIgnoreCase(str2)) {
            str = "VERIFY_BIO_TO_PAY";
        } else if ("CSC".equalsIgnoreCase(str2)) {
            str = "CONNECT_FROM_CHECKOUT_CVV_VERIFICATION";
        } else {
            str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
        }
        return new 2Fk(SUj.A09(str));
    }
}
