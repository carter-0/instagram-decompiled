package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.fundraiser.NewFundraiserInfo;

/* renamed from: X.Eeg  reason: case insensitive filesystem */
public abstract class C48447Eeg {
    public static final Object A00(C307896Rx r14, AnonymousClass6Tm r15) {
        Object A02 = r15.A02();
        0qQ.A0C(A02, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        C276544tV r2 = (C276544tV) A02;
        C276544tV A07 = r2.A07(40);
        if (A07 != null) {
            AE3 ae3 = null;
            String str = "";
            String A0I = r2.A0I();
            if (A0I != null) {
                str = A0I;
            }
            String A11 = DbV.A11(r2, "", 44);
            String A0F = r2.A0F();
            AE3 A00 = C49232Erb.A00(A07);
            String A0G = r2.A0G();
            int A03 = r2.A03(35, 0);
            String str2 = "";
            String A0J = r2.A0J();
            if (A0J != null) {
                str2 = A0J;
            }
            C276544tV A072 = r2.A07(38);
            if (A072 != null) {
                ae3 = C49232Erb.A00(A072);
            }
            C3499082j r3 = new C3499082j((NewFundraiserInfo) null, ae3, A00, A0G, str2, A0F, str, "", A11, A03);
            UserSession A0Z = DbT.A0Z(r14);
            C18688Vwm.A01(C308206Td.A04(r14), 28D.A4T, A0Z, r3);
            return null;
        }
        throw AnonymousClass7TE.A0w("Requires valid creator model");
    }
}
