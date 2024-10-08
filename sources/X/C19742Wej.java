package X;

import android.content.Context;
import android.widget.AbsListView;
import com.instagram.common.session.UserSession;

/* renamed from: X.Wej  reason: case insensitive filesystem */
public final class C19742Wej implements C229122ms, C229132mt, AbsListView.OnScrollListener {
    public Integer A00 = AnonymousClass05K.A0C;
    public final C324356z9 A01;
    public final C21000X8x A02;
    public final UserSession A03;
    public final C14190TrU A04;

    public C19742Wej(Context context, AnonymousClass07i r8, UserSession userSession, C21000X8x x8x, String str) {
        0qQ.A0B(userSession, 3);
        this.A03 = userSession;
        this.A02 = x8x;
        this.A04 = new C14190TrU(userSession, this, AnonymousClass05K.A01, 5);
        this.A01 = new C324356z9(context, r8, userSession, str, false);
    }

    public final void CgO() {
        A01(false, false);
    }

    public final void A01(boolean z, boolean z2) {
        String str;
        Integer num = this.A00;
        Integer num2 = AnonymousClass05K.A00;
        if (num != num2) {
            this.A00 = num2;
            C15962Ule ule = new C15962Ule(this, z, z2);
            C324356z9 r2 = this.A01;
            if (z) {
                str = null;
            } else {
                str = r2.A03.A07;
            }
            1NY Abz = this.A02.Abz();
            C3724090s.A06(Abz, str);
            r2.A03(Abz.A0M(), ule);
        }
    }

    public final void ACw() {
        if (this.A00 == AnonymousClass05K.A0C && this.A01.A05()) {
            A01(false, false);
        }
    }

    public final boolean CJz() {
        return !this.A02.isEmpty();
    }

    public final boolean CKB() {
        return this.A01.A05();
    }

    public final boolean CT5() {
        return AnonymousClass7TF.A1W(this.A00, AnonymousClass05K.A01);
    }

    public final boolean isLoading() {
        return AnonymousClass7TF.A1W(this.A00, AnonymousClass05K.A00);
    }

    public static void A00(AnonymousClass0eM r1) {
        ((C19742Wej) r1.getValue()).A01(true, true);
    }

    public final boolean CWV() {
        if (isLoading()) {
            return !this.A02.isEmpty();
        }
        return true;
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int A0D = AnonymousClass7TG.A0D(absListView, -856283703);
        this.A04.onScroll(absListView, i, i2, i3);
        AnonymousClass0fD.A0A(604609091, A0D);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int A0D = AnonymousClass7TG.A0D(absListView, -2062936399);
        this.A04.onScrollStateChanged(absListView, i);
        AnonymousClass0fD.A0A(996114239, A0D);
    }
}
