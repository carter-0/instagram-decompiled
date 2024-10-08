package X;

import com.facebookpay.otc.models.OtcInput;

/* renamed from: X.SKk  reason: case insensitive filesystem */
public abstract class C11300SKk {
    public static final 2IV A00(OtcInput otcInput) {
        if (otcInput == null) {
            return null;
        }
        2IV A0R = Pxe.A0R();
        A0R.A09(otcInput.A00, "otc_session_id");
        A0R.A09(otcInput.A01, "otc_type");
        return A0R;
    }

    public static final SEB A01(OtcInput otcInput) {
        return new SEB(true, otcInput.A01);
    }

    public static void A02(QNI qni, OtcInput otcInput) {
        qni.A07(String.valueOf(C9960RkF.A00.getAndIncrement()), "client_mutation_id");
        qni.A06(A00(otcInput), "one_time_checkout_input");
        String str = AnonymousClass2E0.A01().A0H;
        if (!00l.A0W(str)) {
            qni.A07(str, "actor_id");
        }
    }
}
