package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.mediamap.fragment.LocationListFragmentMode;
import com.instagram.discovery.mediamap.fragment.MediaMapFragment;
import com.instagram.discovery.mediamap.intf.MediaMapQuery;

/* renamed from: X.W1f  reason: case insensitive filesystem */
public final class C18780W1f {
    public int A00 = -1;
    public int A01 = -1;
    public int A02 = -1;
    public final 0hq A03;
    public final AnonymousClass0iw A04;
    public final UserSession A05;
    public final String A06;
    public final Fragment A07;

    public static void A01(MediaMapFragment mediaMapFragment) {
        MediaMapFragment.A0A(mediaMapFragment, true);
        mediaMapFragment.A0B.A05();
        mediaMapFragment.A0B.A06((Bundle) null, mediaMapFragment.A0E, true);
    }

    public static 0s1 A00(Fragment fragment, C18780W1f w1f) {
        0s1 r2 = new 0s1(w1f.A03);
        r2.A07(R.anim.fade_in, R.anim.fade_out, R.anim.fade_in, R.anim.fade_out);
        r2.A0A(fragment, R.id.fragment_container);
        return r2;
    }

    public static boolean A02(C18780W1f w1f) {
        int i;
        0hq r2 = w1f.A03;
        int A0M = r2.A0M();
        if (A0M == 0) {
            i = -2;
        } else {
            i = r2.A0T(A0M - 1).A00;
        }
        if (i != w1f.A00) {
            return false;
        }
        r2.A0c();
        return true;
    }

    public final C15293UZz A03() {
        C15293UZz A0P = this.A03.A0P(R.id.fragment_container);
        if (A0P == null) {
            return null;
        }
        return A0P;
    }

    public final void A04() {
        Bundle bundle = new Bundle();
        DbU.A1D(bundle, this.A05);
        bundle.putString("arg_session_id", this.A06);
        bundle.putParcelable("arg_query", MediaMapQuery.A08);
        bundle.putParcelable("arg_list_mode", LocationListFragmentMode.QUERY_LIST);
        C15293UZz uZz = new C15293UZz();
        uZz.setArguments(bundle);
        A05();
        0s1 r1 = new 0s1(this.A03);
        r1.A0A(uZz, R.id.fragment_container);
        r1.A0I("HOME");
        this.A02 = r1.A0J(false);
    }

    public final void A05() {
        int i = this.A02;
        if (i != -1) {
            this.A03.A0e(i, 0, false);
        }
    }

    public final void A06(Bundle bundle, MediaMapQuery mediaMapQuery, boolean z) {
        Bundle bundle2 = new Bundle();
        DbU.A1D(bundle2, this.A05);
        bundle2.putParcelable("arg_query", mediaMapQuery);
        bundle2.putParcelable("arg_list_mode", LocationListFragmentMode.QUERY_LIST);
        bundle2.putString("arg_session_id", this.A06);
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        C15293UZz uZz = new C15293UZz();
        uZz.setArguments(bundle2);
        A05();
        0s1 r2 = new 0s1(this.A03);
        if (z) {
            r2.A07(R.anim.fade_in, R.anim.fade_out, R.anim.fade_in, R.anim.fade_out);
        }
        r2.A0A(uZz, R.id.fragment_container);
        r2.A0I("LIST");
        this.A01 = r2.A0J(false);
    }

    public C18780W1f(Fragment fragment, AnonymousClass0iw r3, UserSession userSession, String str) {
        this.A05 = userSession;
        this.A07 = fragment;
        this.A03 = fragment.getChildFragmentManager();
        this.A06 = str;
        this.A04 = r3;
    }
}
