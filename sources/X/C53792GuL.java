package X;

import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;

/* renamed from: X.GuL  reason: case insensitive filesystem */
public final class C53792GuL extends C251343mx {
    public final UserSession A00;
    public final AnonymousClass33B A01;
    public final AnonymousClass3WV A02;
    public final AnonymousClass416 A03;
    public final AnonymousClass4DU A04;
    public final C62320sa A05;

    public final C251263mp A0X(AnonymousClass3Y5 r36) {
        AnonymousClass3Y5 r9 = r36;
        0qQ.A0B(r9, 0);
        C376459Ib r11 = (C376459Ib) this.A05.invoke();
        if (r11 == null) {
            return null;
        }
        AnonymousClass3XV r0 = 2WX.A02;
        2WX A0R = C51972G9s.A0R(G9t.A10((2WX) null, AnonymousClass05K.A0C, false), 0, C244013aV.A09(r9));
        Integer num = AnonymousClass05K.A00;
        2WX A0X = C51971G9r.A0X(A0R, num, 100.0f, 0);
        2Wb A0Q = C51972G9s.A0Q(r9);
        GMH gmh = null;
        C246653ex r3 = (C246653ex) r11.A01;
        if (r3 != null) {
            UserSession userSession = this.A00;
            AnonymousClass4DU r16 = this.A04;
            C376459Ib r1 = new C376459Ib((C62320sa) C58338IqJ.A00, (0sP) J21.A00, (0sP) J22.A00, 3);
            AnonymousClass33B r10 = this.A01;
            2WX A0X2 = C51971G9r.A0X((2WX) null, num, 100.0f, 0);
            GK1 A002 = C52064GDk.A00(userSession);
            J3I j3i = J3I.A00;
            J3J j3j = J3J.A00;
            C58986J1x j1x = C58986J1x.A00;
            UserSession userSession2 = userSession;
            C246653ex r17 = r3;
            C376459Ib r12 = r1;
            gmh = new GMH(r12, A0X2, userSession2, A002, (AnonymousClass4GS) null, r17, r10, (C246853fL) ((0sL) ((AnonymousClass9IE) r11.A00).A00).invoke(this.A03, this.A02), r16, (AnonymousClass3W1) r11.A02, (AnonymousClass4DV) null, (WeakReference) null, C58332IqD.A00, C52293GMj.A00, j1x, j3i, j3j, 0, 0, false, false, false, false);
        }
        return C51967G9n.A0N(gmh, A0Q, r9, A0X);
    }

    public C53792GuL(UserSession userSession, AnonymousClass33B r2, AnonymousClass3WV r3, AnonymousClass416 r4, AnonymousClass4DU r5, C62320sa r6) {
        C51974G9v.A1S(r5, userSession, r2, r4, r3);
        this.A05 = r6;
        this.A04 = r5;
        this.A00 = userSession;
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
    }
}
