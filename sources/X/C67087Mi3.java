package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Mi3  reason: case insensitive filesystem */
public final class C67087Mi3 implements AnonymousClass1MK {
    public C226952iF A00;
    public C74454Pv9 A01;
    public C256223vQ A02;
    public final int A03;
    public final UserSession A04;

    public C67087Mi3(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A04 = userSession;
        this.A03 = DbS.A04(0Tu.A05, userSession, 36606388516427177L);
    }

    public final void A01(Context context, AnonymousClass0iw r13, C74454Pv9 pv9, C68167N3h n3h, AnonymousClass2Ep r16, String str, String str2) {
        String str3 = str2;
        0qQ.A0B(str3, 4);
        C74454Pv9 pv92 = pv9;
        this.A01 = pv9;
        C68167N3h n3h2 = n3h;
        AnonymousClass0iw r6 = r13;
        if (n3h.A0Z) {
            AnonymousClass2Ep r10 = r16;
            PF2 pf2 = new PF2(context, r6, pv92, this, n3h2, r10);
            UserSession userSession = this.A04;
            String C6C = r10.C6C();
            if (C6C != null) {
                C3265077a.A00(userSession, pf2, C6C, str, str3);
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
        A00(this, n3h, r13.getModuleName());
    }

    public final void CyF(C226952iF r2, AnonymousClass3LX r3) {
        0qQ.A0B(r2, 0);
        if (0qQ.A0K(this.A00, r2)) {
            this.A00 = null;
            C74454Pv9 pv9 = this.A01;
            if (pv9 != null) {
                pv9.DQX();
            }
        }
    }

    public final void DJx(C226952iF r2, C254673sr r3) {
        0qQ.A0B(r2, 0);
        if (0qQ.A0K(this.A00, r2)) {
            this.A00 = null;
            C74454Pv9 pv9 = this.A01;
            if (pv9 != null) {
                pv9.DQ2();
            }
        }
    }

    public final void DK4(C226952iF r1, int i) {
    }

    public static final void A00(C67087Mi3 mi3, C68167N3h n3h, String str) {
        ImageUrl imageUrl = n3h.A04;
        boolean A1W = AnonymousClass7TF.A1W(n3h.A0B, 1iA.A0a);
        boolean A022 = C253833rU.A02(imageUrl);
        if (A1W) {
            if (!A022) {
                if (imageUrl != null) {
                    1OO A0J = 1NK.A00().A0J(imageUrl, (String) null);
                    A0J.A05 = mi3.A04;
                    C226952iF A002 = A0J.A00();
                    mi3.A00 = A002;
                    A002.E5t();
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            }
            UserSession userSession = mi3.A04;
            AnonymousClass3WR A003 = n3h.A00();
            if (n3h.A0R) {
                C74454Pv9 pv9 = mi3.A01;
                if (pv9 != null && n3h.A0H != null) {
                    pv9.DQX();
                    return;
                }
                return;
            }
            C256203vO r2 = new C256203vO(A003, str);
            r2.A02 = 5242880;
            C72977PRk pRk = new C72977PRk(mi3, 0);
            mi3.A02 = pRk;
            r2.A01(pRk, mi3.A03);
            C255593uO.A00(userSession).A01(r2);
        } else if (A022) {
        } else {
            if (imageUrl != null) {
                1OO A0J2 = 1NK.A00().A0J(imageUrl, (String) null);
                A0J2.A05 = mi3.A04;
                A0J2.A02(mi3);
                C226952iF A004 = A0J2.A00();
                mi3.A00 = A004;
                A004.E5t();
                return;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
    }
}
