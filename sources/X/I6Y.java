package X;

import android.media.AudioManager;
import android.view.KeyEvent;
import androidx.fragment.app.FragmentActivity;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class I6Y {
    public static final void A00(FragmentActivity fragmentActivity, C270634h3 r9, UserSession userSession, 1Xj r11, AnonymousClass4DU r12, Long l, String str, String str2, String str3, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        UserSession userSession2 = userSession;
        1Xj r4 = r11;
        AnonymousClass4DU r2 = r12;
        AnonymousClass7TG.A1U(userSession, r12, r11);
        C51972G9s.A1E(str, str2);
        String id = r11.getId();
        if (!z3) {
            C52086GEg.A0Y(r2, userSession2, r4, (C249763kK) null, id, i);
        }
        r9.A1C = id;
        r9.A1B = str;
        r9.A1F = str2;
        r9.A1g = z2;
        r9.A1c = false;
        r9.A0Z = l;
        r9.A0j = str3;
        r9.A1t = z4;
        if (0qQ.A0K(userSession.A06, C51973G9u.A0k(r11))) {
            r9.A0n = fragmentActivity.getString(2131973052);
        }
        boolean z5 = z;
        if (z || r11.A5I()) {
            A01(fragmentActivity, r9, userSession, z5);
        } else {
            C243473Yx.A07(fragmentActivity, r9.A00(), userSession, false, false);
        }
    }

    public static final void A01(FragmentActivity fragmentActivity, C270634h3 r4, UserSession userSession, boolean z) {
        boolean A1U = AnonymousClass7TF.A1U(0, fragmentActivity, userSession);
        ClipsViewerConfig A00 = r4.A00();
        if (z) {
            C243473Yx.A07(fragmentActivity, A00, userSession, A1U, false);
        } else {
            C243473Yx.A07(fragmentActivity, A00, userSession, false, false);
        }
    }

    public static final void A02(FragmentActivity fragmentActivity, UserSession userSession, 1Xj r18, AnonymousClass4DU r19, Long l, String str, String str2, String str3, String str4, int i, boolean z, boolean z2, boolean z3) {
        boolean z4;
        ClipsViewerSource clipsViewerSource;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 1);
        String str5 = str;
        String str6 = str3;
        AnonymousClass7TF.A1F(str5, 4, str6);
        0Tu r4 = 0Tu.A05;
        if (!182.A06(r4, userSession2, 36326953648666718L) || ((182.A06(r4, userSession2, 36326953648732255L) && 1Bh.A00().A03()) || (182.A06(r4, userSession2, 36326953648797792L) && 1Bh.A00().A02()))) {
            z4 = true;
        } else {
            z4 = false;
        }
        1Xj r7 = r18;
        FragmentActivity fragmentActivity2 = fragmentActivity;
        if (r7.A50() && z4) {
            C51973G9u.A0w(fragmentActivity2, userSession2, r7.CEL(), str5, true);
        }
        if (r7.A4j()) {
            clipsViewerSource = ClipsViewerSource.GROUP_PROFILE;
        } else if (z) {
            clipsViewerSource = ClipsViewerSource.SELF_PROFILE;
        } else {
            clipsViewerSource = ClipsViewerSource.PROFILE;
        }
        A00(fragmentActivity2, C51965G9l.A0i(clipsViewerSource, userSession2), userSession2, r7, r19, l, str2, str6, str4, i, z2, false, false, z3);
    }

    public static final void A03(AnonymousClass4DH r9, UserSession userSession, String str, ArrayList arrayList) {
        String str2 = str;
        AnonymousClass7TG.A1P(userSession, str);
        C229352nF A00 = C229342nE.A00(userSession);
        ArrayList A15 = DbV.A15(A00);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            A15.add(C295375o3.A02(C51966G9m.A0t(it)));
        }
        C298855u9 A002 = C276114sa.A00.A00(true);
        A002.A00 = null;
        A00.A03(A002.A00(), C294895nD.DEFAULT, str2, A15, true, true);
        r9.registerLifecycleListener(new H5H(r9, A00, str));
    }

    public static final void A04(C62320sa r3, 0sP r4, int i) {
        float f;
        if (i == -3) {
            f = 0.5f;
        } else if (i == -2) {
            f = 0.0f;
        } else if (i == -1) {
            r3.invoke();
            return;
        } else if (i == 1 || i == 2 || i == 3 || i == 4) {
            f = 1.0f;
        } else {
            return;
        }
        C51967G9n.A1Q(r4, f);
    }

    public static final boolean A05(AudioManager audioManager, KeyEvent keyEvent, C62320sa r7, int i) {
        int i2;
        0qQ.A0B(audioManager, 2);
        if (keyEvent != null && keyEvent.getAction() == 0) {
            if (i == 25) {
                i2 = -1;
            } else if (i == 24) {
                i2 = 1;
            }
            audioManager.adjustStreamVolume(3, i2, 1);
            if (audioManager.getStreamVolume(3) == 0) {
                r7.invoke();
            }
            return true;
        }
        return false;
    }
}
