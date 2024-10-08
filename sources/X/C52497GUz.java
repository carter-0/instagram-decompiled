package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.GUz  reason: case insensitive filesystem */
public final class C52497GUz extends C57212ISz {
    public final UserSession A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public final /* bridge */ /* synthetic */ void Cir(0jB r6, 1Nv r7, AnonymousClass4DU r8, int i, int i2) {
        0Aj A0e;
        Long A10;
        1Xj r72 = (1Xj) r7;
        if (!r72.CcK() && this.A03) {
            UserSession userSession = this.A00;
            HashMap A002 = A00();
            AnonymousClass7TG.A1N(userSession, r8);
            A0e = AnonymousClass7TE.A0e(C51973G9u.A0b(r8, userSession), "instagram_organic_impression_second_channel");
            if (A0e.isSampled()) {
                C51974G9v.A0p(A0e, r72, "m_pk", r72.getId());
                A0e.A9H("two_measurement_debugging_fields", A002);
            } else {
                return;
            }
        } else if (r72.CcK() && this.A01) {
            UserSession userSession2 = this.A00;
            HashMap A003 = A00();
            AnonymousClass7TG.A1N(userSession2, r8);
            A0e = AnonymousClass7TE.A0e(C51972G9s.A0Z(r8, new AnonymousClass0kM(userSession2)), "instagram_ad_impression_second_channel");
            if (A0e.isSampled()) {
                C51974G9v.A0p(A0e, r72, "m_pk", r72.getId());
                C51965G9l.A1L(A0e, C231122qu.A0F(userSession2, r72));
                C51965G9l.A1D(A0e, DbZ.A0d(C231122qu.A07(userSession2, r72)));
                A0e.A9H("two_measurement_debugging_fields", A003);
                String A0H = C231122qu.A0H(userSession2, r72.getId());
                if (!(A0H == null || (A10 = AnonymousClass7TE.A10(A0H)) == null)) {
                    A0e.A9F("host_profile_id", A10);
                }
            } else {
                return;
            }
        } else {
            return;
        }
        A0e.Cgf();
    }

    public final /* bridge */ /* synthetic */ void Cke(0jB r5, 1Nv r6, AnonymousClass4DU r7, int i, int i2) {
        0Aj A0e;
        Long A10;
        1Xj r62 = (1Xj) r6;
        if (!r62.CcK() && this.A04) {
            UserSession userSession = this.A00;
            HashMap A002 = A00();
            AnonymousClass7TG.A1N(userSession, r7);
            A0e = AnonymousClass7TE.A0e(C51973G9u.A0b(r7, userSession), "instagram_organic_sub_impression_second_channel");
            if (A0e.isSampled()) {
                C51974G9v.A0p(A0e, r62, "m_pk", r62.getId());
                A0e.A9H("two_measurement_debugging_fields", A002);
            } else {
                return;
            }
        } else if (r62.CcK() && this.A02) {
            UserSession userSession2 = this.A00;
            AnonymousClass7TG.A1N(userSession2, r7);
            A0e = AnonymousClass7TE.A0e(C51972G9s.A0Z(r7, new AnonymousClass0kM(userSession2)), "instagram_ad_sub_impression_second_channel");
            if (A0e.isSampled()) {
                C51974G9v.A0p(A0e, r62, "m_pk", r62.getId());
                C51965G9l.A1L(A0e, C231122qu.A0F(userSession2, r62));
                C51965G9l.A1D(A0e, DbZ.A0d(C231122qu.A07(userSession2, r62)));
                String A0H = C231122qu.A0H(userSession2, r62.getId());
                if (!(A0H == null || (A10 = AnonymousClass7TE.A10(A0H)) == null)) {
                    A0e.A9F("host_profile_id", A10);
                }
            } else {
                return;
            }
        } else {
            return;
        }
        A0e.Cgf();
    }

    public C52497GUz(UserSession userSession, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A00 = userSession;
        this.A03 = z;
        this.A01 = z3;
        this.A04 = z2;
        this.A02 = z4;
    }

    private HashMap A00() {
        double d;
        HashMap A1E = AnonymousClass7TE.A1E();
        C2370236a A002 = C2370236a.A00(this.A00);
        A1E.put("last_action", A002.A01());
        A1E.put(AnonymousClass000.A00(4989), A002.A02());
        synchronized (A002) {
            d = A002.A00;
        }
        A1E.put(AnonymousClass000.A00(5203), String.valueOf(d));
        A1E.put("nav_chain", DbS.A0k());
        return A1E;
    }
}
