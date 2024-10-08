package X;

import android.content.Context;
import android.widget.AbsListView;
import com.instagram.common.session.UserSession;

/* renamed from: X.Wei  reason: case insensitive filesystem */
public final class C19741Wei implements C229122ms, C229132mt, AbsListView.OnScrollListener {
    public Integer A00;
    public String A01;
    public boolean A02;
    public final UserSession A03;
    public final VP8 A04;
    public final C16581Uxb A05;
    public final String A06;
    public final Context A07;
    public final AnonymousClass07i A08;
    public final C14190TrU A09;

    public final void CgO() {
        A00(this, false);
    }

    public static final void A00(C19741Wei wei, boolean z) {
        String str;
        if (wei.A00 != AnonymousClass05K.A00) {
            1NY A0b = AnonymousClass7TG.A0b(wei.A03);
            A0b.A0A(AnonymousClass000.A00(2909));
            A0b.A0Q(UYA.class, C18252VoJ.class);
            if (!z && (str = wei.A01) != null) {
                A0b.A9m("max_id", str);
            }
            String str2 = wei.A06;
            if (str2 != null && str2.equals("entry_point_creator_swipe_up_to_shop")) {
                A0b.A9m("require_visible_profile_shop", "true");
                A0b.A9m("include_viewer_if_business", "true");
            }
            C16581Uxb uxb = wei.A05;
            if (uxb != null) {
                A0b.A9m("surface", uxb.A00);
            }
            1OC A0M = A0b.A0M();
            C15622Ufo.A00(A0M, wei, 8);
            1ES.A00(wei.A07, wei.A08, A0M);
        }
    }

    public final void ACw() {
        if (this.A00 == AnonymousClass05K.A0C && this.A02) {
            A00(this, false);
        }
    }

    public final boolean CJz() {
        C15473UdO udO = this.A04.A00.A02;
        if (udO != null) {
            return !udO.isEmpty();
        }
        DbS.A13();
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean CKB() {
        return this.A02;
    }

    public final boolean CT5() {
        return AnonymousClass7TF.A1W(this.A00, AnonymousClass05K.A01);
    }

    public final boolean isLoading() {
        return AnonymousClass7TF.A1W(this.A00, AnonymousClass05K.A00);
    }

    public C19741Wei(Context context, AnonymousClass07i r5, UserSession userSession, VP8 vp8, C16581Uxb uxb, String str) {
        AnonymousClass7TG.A1O(vp8, userSession);
        this.A04 = vp8;
        this.A03 = userSession;
        this.A07 = context;
        this.A08 = r5;
        this.A09 = new C14190TrU(userSession, this, AnonymousClass05K.A01, 5);
        this.A06 = str;
        this.A05 = uxb;
    }

    public final boolean CWV() {
        if (isLoading()) {
            return CJz();
        }
        return true;
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int A0D = AnonymousClass7TG.A0D(absListView, 558091180);
        this.A09.onScroll(absListView, i, i2, i3);
        AnonymousClass0fD.A0A(-1992627755, A0D);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int A0D = AnonymousClass7TG.A0D(absListView, 1753892475);
        this.A09.onScrollStateChanged(absListView, i);
        AnonymousClass0fD.A0A(-166907737, A0D);
    }
}
