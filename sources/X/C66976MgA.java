package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.MgA  reason: case insensitive filesystem */
public final class C66976MgA implements C2614849t {
    public AnonymousClass07V A00;
    public 0h9 A01;
    public C67159MjH A02;
    public AnonymousClass4AE A03;
    public final Fragment A04;
    public final AnonymousClass0iw A05;
    public final UserSession A06;
    public final AnonymousClass4AD A07;
    public final AnonymousClass0eM A08;
    public final 02o A09 = new C73529PeL(this, 43);
    public final AnonymousClass4AF A0A;

    public C66976MgA(Fragment fragment, AnonymousClass0iw r14, UserSession userSession, C67159MjH mjH) {
        this.A06 = userSession;
        this.A05 = r14;
        Fragment fragment2 = fragment;
        this.A04 = fragment;
        this.A02 = mjH;
        0h9 r0 = new 0h9(this);
        this.A01 = r0;
        this.A00 = r0;
        C73924Pm4 A012 = C73924Pm4.A01(this, 2);
        AnonymousClass0eM A002 = C73924Pm4.A00(C73924Pm4.A01(fragment, 3), 0eO.A02, 4);
        C227862kA A0I = DbS.A0I(C73924Pm4.A01(A002, 5), A012, new C73916Plr(18, (Object) null, A002), DbS.A0z(C2614949u.class));
        this.A08 = A0I;
        C2614949u A0X = C66580MXl.A0X(A0I);
        AnonymousClass4AE r02 = this.A03;
        0qQ.A0B(A0X, 0);
        AnonymousClass4AC r9 = new AnonymousClass4AC(A0X, r02);
        this.A07 = r9;
        this.A0A = new AnonymousClass4AF(fragment2, r14, userSession, r9, (String) null, false);
        C67231MkR.A00(fragment, new C73565Pfm(this, (AnonymousClass4D7) null, 39));
        C67231MkR.A00(fragment, new C73565Pfm(this, (AnonymousClass4D7) null, 40));
        C67231MkR.A00(fragment, new C73565Pfm(this, (AnonymousClass4D7) null, 41));
        C67231MkR.A00(fragment, new C73565Pfm(this, (AnonymousClass4D7) null, 42));
        C67231MkR.A00(fragment, new C73565Pfm(this, (AnonymousClass4D7) null, 43));
    }

    public final AnonymousClass4AF AmV() {
        return this.A0A;
    }

    public final AnonymousClass4AD BWa() {
        return this.A07;
    }

    public final boolean E2u() {
        return C66580MXl.A0X(this.A08).A07();
    }

    public final void FJa(AnonymousClass4AB r2, boolean z) {
        if (AnonymousClass4AJ.A0F(this.A06)) {
            C66580MXl.A0X(this.A08).A05(r2, z);
        }
    }

    public final AnonymousClass07V getLifecycle() {
        return this.A00;
    }

    public final void EjK(AnonymousClass4AE r1) {
        this.A03 = r1;
    }
}
