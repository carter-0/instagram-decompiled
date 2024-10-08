package X;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.M7y  reason: case insensitive filesystem */
public final class C66013M7y implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C64839Lj1 A01;

    public C66013M7y(Activity activity, C64839Lj1 lj1) {
        this.A01 = lj1;
        this.A00 = activity;
    }

    public final void run() {
        Fragment fragment;
        String str;
        int i;
        C64839Lj1 lj1 = this.A01;
        Activity activity = this.A00;
        if (activity.isFinishing() || activity.isDestroyed()) {
            if (182.A06(0Tu.A05, lj1.A0E, 36325768237692109L)) {
                return;
            }
        }
        if (lj1 instanceof KYZ) {
            KYZ kyz = (KYZ) lj1;
            UserSession userSession = kyz.A0E;
            boolean A002 = C363018iu.A00(userSession);
            boolean A003 = C363558jv.A00(userSession);
            AnonymousClass818 r11 = kyz.A00;
            if (r11 != null) {
                AnonymousClass819 r10 = kyz.A00;
                if (r10 == null) {
                    str = "upsellVariant";
                } else {
                    int A07 = kyz.A07();
                    C49887FBn fBn = kyz.A04;
                    if (fBn != null) {
                        i = fBn.A00;
                    } else {
                        i = 0;
                    }
                    boolean z = kyz.A0C;
                    String str2 = kyz.A09;
                    String str3 = "";
                    if (str2 == null) {
                        str2 = str3;
                    }
                    String str4 = kyz.A0A;
                    if (str4 != null) {
                        str3 = str4;
                    }
                    Bundle A0a = AnonymousClass7TE.A0a();
                    A0a.putBoolean("args_is_story_enabled", A002);
                    A0a.putBoolean("args_is_post_enabled", A003);
                    C64839Lj1.A00(A0a, r11, r10, A07);
                    A0a.putInt("arg_nux_attempt_qpl_instance_key", i);
                    A0a.putBoolean("args_is_after_fbc", z);
                    A0a.putString("args_media_id", str2);
                    A0a.putString("args_waterfall_id", str3);
                    fragment = C63429Kwp.A00(A0a, userSession);
                }
            } else {
                str = "entrypoint";
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        UserSession userSession2 = lj1.A0E;
        Bundle A012 = lj1.A01();
        UserSession A072 = 09i.A0A.A07(A012);
        if (A072 != null) {
            userSession2 = A072;
        }
        fragment = new KYc(A012, userSession2);
        fragment.setArguments(A012);
        UserSession userSession3 = lj1.A0E;
        boolean A06 = 182.A06(0Tu.A05, userSession3, 36331093997142938L);
        C331127Pr A0W = DbS.A0W(userSession3);
        if (A06) {
            DbS.A1S(A0W, false);
            A0W.A0k = false;
            A0W.A0U = new C65739Lyt(lj1);
            A0W.A0X = new C65754Lz8(lj1, 4);
        } else {
            DbS.A1S(A0W, false);
            A0W.A0U = new C65739Lyt(lj1);
        }
        C331157Pu A02 = A0W.A00().A02(activity, fragment);
        lj1.A01 = A02;
        if (A02 == null) {
            C49887FBn fBn2 = lj1.A04;
            if (fBn2 != null) {
                fBn2.A03(AnonymousClass05K.A0C);
            }
            new C65739Lyt(lj1).Cyc();
        }
    }
}
