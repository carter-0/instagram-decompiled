package X;

import com.facebook.mobileconfig.factory.MobileConfigValueSource;
import com.instagram.common.session.UserSession;

/* renamed from: X.43Q  reason: invalid class name */
public final class AnonymousClass43Q {
    public final UserSession A00;
    public final AnonymousClass43R A01;

    public AnonymousClass43Q(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = (AnonymousClass43R) userSession.A01(AnonymousClass43R.class, new C73911Plm(userSession, 36));
    }

    public final boolean A00() {
        0xY AR4;
        MobileConfigValueSource mobileConfigValueSource;
        1AV A02;
        AnonymousClass43R r5 = this.A01;
        UserSession userSession = r5.A00;
        boolean A022 = AnonymousClass65A.A02(userSession, 36322409576540328L);
        0xa r1 = r5.A01;
        boolean contains = r1.contains("CUTOVER_ENABLED_PREF_KEY");
        boolean A023 = AnonymousClass65A.A02(userSession, 36322409573263504L);
        if (A022) {
            if (contains) {
                AR4 = r1.AR4();
                AR4.ED3("CUTOVER_ENABLED_PREF_KEY");
            }
            return A023;
        } else if (r1.contains("CUTOVER_ENABLED_PREF_KEY")) {
            boolean z = r1.getBoolean("CUTOVER_ENABLED_PREF_KEY", true);
            if (A023 == z) {
                return true;
            }
            0Tu A002 = 0Tu.A00(new 0Tu());
            A002.A02 = true;
            0Tu A003 = 0Tu.A00(A002);
            A003.A03 = true;
            183 r0 = 183.A01;
            if (r0 == null || (A02 = r0.A02(userSession)) == null) {
                mobileConfigValueSource = MobileConfigValueSource.UNKNOWN;
            } else {
                A02.A01.A00.Ah0(A003, 36322409573263504L);
                mobileConfigValueSource = A003.A00.A00;
            }
            0qQ.A0A(mobileConfigValueSource);
            StringBuilder sb = new StringBuilder();
            sb.append(36322409573263504L);
            sb.append(" had a client cache value of ");
            sb.append(z);
            sb.append(" but mc returned ");
            sb.append(A023);
            sb.append(C66579MXk.A00(420));
            sb.append(mobileConfigValueSource);
            String obj = sb.toString();
            0f9 AEf = 0wj.A01.AEf("ONE_WAY_GATING_HELPER_MISMATCH", 13637971);
            AEf.ERJ(new IllegalStateException(obj));
            AEf.ABP("mc_param", 36322409573263504L);
            AEf.report();
            return true;
        } else {
            if (A023) {
                AR4 = r1.AR4();
                AR4.E5T("CUTOVER_ENABLED_PREF_KEY", true);
            }
            return A023;
        }
        AR4.apply();
        return A023;
    }
}
