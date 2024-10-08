package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.fxcal.browser.FxChromeCustomTabsActivity;

/* renamed from: X.F4k  reason: case insensitive filesystem */
public abstract class C49745F4k {
    /* JADX WARNING: type inference failed for: r2v1, types: [android.content.Context, com.instagram.base.activity.IgFragmentActivity] */
    public static final Object A00(C307896Rx r11, AnonymousClass6Tm r12) {
        String A0g = DbY.A0g(r12);
        C277014uI A0P = DbW.A0P(r12, 2);
        Fragment A02 = C308206Td.A02(r11);
        FragmentActivity A04 = C308206Td.A04(r11);
        0lg A0B = C308206Td.A0B(r11);
        if ((A04 instanceof BaseFragmentActivity) || (182.A06(0Tu.A05, A0B, 2342167235558125457L) && (A04 instanceof IgFragmentActivity))) {
            ? r2 = (IgFragmentActivity) A04;
            r2.registerOnActivityResultListener(new EED(3, A04, r11, A0P));
            Context A05 = DbT.A05(r2);
            0qQ.A0B(A0B, 1);
            0qQ.A0B(A0g, 2);
            Intent intent = new Intent(A05, FxChromeCustomTabsActivity.class);
            intent.putExtra("url_param", A0g);
            DbW.A0s(intent, A0B);
            0kR.A07(A04, intent, 2884);
            return null;
        } else if (A02 == null) {
            return null;
        } else {
            C308206Td.A0K(r11, new EEI(r11, A0P, 3));
            Context requireContext = A02.requireContext();
            0qQ.A0B(A0B, 1);
            0qQ.A0B(A0g, 2);
            Intent intent2 = new Intent(requireContext, FxChromeCustomTabsActivity.class);
            intent2.putExtra("url_param", A0g);
            DbW.A0s(intent2, A0B);
            0kR.A05(A02, intent2, 2884);
            return null;
        }
    }

    public static final void A01(Intent intent, C307896Rx r5, C277014uI r6, int i) {
        String str;
        Uri uri;
        String str2 = null;
        if (intent != null) {
            str = intent.getStringExtra(Pxd.A00(154));
        } else {
            str = null;
        }
        if (0mp.A0B(str)) {
            uri = null;
        } else if (str != null) {
            uri = 0cp.A03(str);
        } else {
            throw AnonymousClass7TE.A0y();
        }
        C308276Tl A0P = DbS.A0P();
        if (i == -1 && uri != null) {
            str2 = uri.toString();
        }
        DbX.A1O(r5, A0P, r6, str2);
    }
}
