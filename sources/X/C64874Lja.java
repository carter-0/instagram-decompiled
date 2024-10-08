package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.Lja  reason: case insensitive filesystem */
public final class C64874Lja implements C252213ok {
    public C262204Co A00;
    public final Fragment A01;
    public final UserSession A02;
    public final AnonymousClass3E6 A03;
    public final C313666go A04;
    public final AnonymousClass0eM A05 = AnonymousClass0eN.A01(new C66293MMc(this, 49));
    public final AnonymousClass0eM A06 = C66307MMq.A02(this, 0);
    public final AnonymousClass0eM A07 = C66307MMq.A02(this, 1);
    public final AnonymousClass0eM A08 = C66307MMq.A02(this, 2);
    public final AnonymousClass0eM A09 = C66307MMq.A01(this, 3);
    public final AnonymousClass0eM A0A = C66307MMq.A02(this, 4);
    public final AnonymousClass0eM A0B = C66307MMq.A02(this, 5);
    public final AnonymousClass0eM A0C = C66307MMq.A02(this, 6);
    public final AnonymousClass0eM A0D = C66307MMq.A02(this, 7);
    public final AnonymousClass0eM A0E;
    public final AnonymousClass0eM A0F = C66307MMq.A02(this, 9);
    public final AnonymousClass0eM A0G;

    public C64874Lja(Fragment fragment, UserSession userSession, C313666go r12) {
        0qQ.A0B(userSession, 2);
        this.A01 = fragment;
        this.A02 = userSession;
        this.A04 = r12;
        C66307MMq mMq = new C66307MMq(this, 13);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C66307MMq(new C66307MMq(fragment, 10), 11));
        this.A0G = DbS.A0I(new C66307MMq(A002, 12), mMq, C66304MMn.A01(A002, (Object) null, 33), DbS.A0z(C60279Jia.class));
        AnonymousClass3E5 A012 = AnonymousClass3E4.A01(this, false, false);
        this.A03 = A012;
        this.A0E = C66307MMq.A01(this, 8);
        A012.A9Y(this);
        if (r12 != C313666go.VIEWER) {
            A01();
        }
    }

    public static final void A00(C294975nL r0, float f) {
        if (r0 != null) {
            JTS.A1T(r0, f);
        }
    }

    public final void A01() {
        this.A00 = AnonymousClass11O.A03(DbV.A0J(this.A01), MHB.A02(this, new AnonymousClass0qC(((C60279Jia) this.A0G.getValue()).A06), 0));
    }

    public final void DMr(int i, boolean z) {
        ((C60279Jia) this.A0G.getValue()).A05.Epw(Float.valueOf((float) i));
    }
}
