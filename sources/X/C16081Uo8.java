package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.Uo8  reason: case insensitive filesystem */
public abstract class C16081Uo8 extends C249383je implements X43 {
    public final Fragment A00;
    public final C227762js A01;
    public final C231302rO A02;
    public final UserSession A03;
    public final C17856Vh9 A04;
    public final AnonymousClass4DV A05;
    public final AnonymousClass0iw A06;
    public final AnonymousClass3BQ A07;

    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object, X.3Jo] */
    public final void A02() {
        Fragment fragment = this.A00;
        AnonymousClass3K2 A0a = C13989Tnp.A0a(fragment);
        if (A0a != null && A0a.A0Z() && A0a.A0H == this.A07) {
            A0a.A0X(this.A06);
        }
        C227762js r4 = this.A01;
        float f = (float) this.A04.A00;
        r4.A04(2dZ.A0t.A03(fragment.getActivity()).A0P, new Object(), f);
    }

    public final void DIu() {
        if (this.A00.isResumed()) {
            C227762js r3 = this.A01;
            C238133Ar scrollingViewProxy = this.A05.getScrollingViewProxy();
            0qQ.A07(scrollingViewProxy);
            C231302rO r1 = this.A02;
            int i = this.A04.A00;
            r3.A07(r1, scrollingViewProxy, i, i);
        }
    }

    public C16081Uo8(Fragment fragment, C227762js r4, C231302rO r5, AnonymousClass0iw r6, UserSession userSession, AnonymousClass4DV r8, AnonymousClass3BQ r9) {
        C51972G9s.A1D(r5, r4);
        0qQ.A0B(userSession, 7);
        this.A00 = fragment;
        this.A05 = r8;
        this.A02 = r5;
        this.A01 = r4;
        this.A07 = r9;
        this.A06 = r6;
        this.A03 = userSession;
        this.A04 = new C17856Vh9(fragment.requireContext(), this);
    }

    public void onScroll(C238133Ar r3, int i, int i2, int i3, int i4, int i5) {
        AnonymousClass0fD.A0A(-1740213960, AnonymousClass0fD.A03(-1801341971));
    }

    public final void onScrollStateChanged(C238133Ar r3, int i) {
        AnonymousClass0fD.A0A(1878807388, AnonymousClass0fD.A03(-1367279544));
    }
}
