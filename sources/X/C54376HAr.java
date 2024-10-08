package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.HAr  reason: case insensitive filesystem */
public final class C54376HAr extends GAR {
    public C324356z9 A00;
    public String A01;
    public String A02;
    public List A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final Fragment A07;
    public final UserSession A08;
    public final JRI A09;
    public final AnonymousClass6ST A0A;
    public final String A0B;
    public final AnonymousClass0eM A0C;
    public final String A0D;
    public final boolean A0E;

    public C54376HAr(Fragment fragment, UserSession userSession, JRI jri, String str, String str2, List list, boolean z) {
        List A18;
        this.A07 = fragment;
        this.A08 = userSession;
        this.A09 = jri;
        this.A0D = str;
        this.A0E = z;
        this.A03 = list;
        this.A01 = str2;
        boolean z2 = true;
        String str3 = null;
        if (!(str == null || (A18 = DbV.A18(str, "_")) == null)) {
            str3 = (String) 00k.A0J(A18);
        }
        this.A0B = str3;
        this.A04 = this.A01 == null ? false : z2;
        this.A0A = new AnonymousClass6ST(fragment.requireContext(), true);
        this.A0C = AnonymousClass0eN.A00(0eO.A02, new C20607Wvo(this, 6));
    }

    public static final void A02(C54376HAr hAr, boolean z) {
        String str = hAr.A0B;
        if (str != null) {
            new I0v(hAr.A08).A02(new C54243H4m(5, hAr, z), C54662HMt.ALL, str, hAr.A01);
        }
    }

    public static final void A03(C54376HAr hAr, boolean z) {
        String str;
        FragmentActivity activity = hAr.A07.getActivity();
        if (activity != null && (str = hAr.A0B) != null) {
            if (z) {
                UserSession userSession = hAr.A08;
                1Xj A022 = 1E7.A00(userSession).A02(hAr.A0D);
                if (A022 != null) {
                    A022.A3s();
                    A022.AE7(userSession);
                }
            }
            if (hAr.A0E) {
                activity.onBackPressed();
                UserSession userSession2 = hAr.A08;
                F3W A0k = C51971G9r.A0k(str);
                A0k.A0E = "open_carousel_review_page";
                A0k.A0N = true;
                DbY.A0u(activity, A0k.A00(), userSession2, "single_media_feed");
                return;
            }
            activity.onBackPressed();
        }
    }
}
