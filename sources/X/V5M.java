package X;

import android.content.Context;
import android.view.ViewManager;
import android.view.WindowManager;
import android.view.animation.PathInterpolator;
import com.instagram.android.R;
import java.lang.ref.WeakReference;
import java.util.Map;

public abstract class V5M {
    public static final Object A00(C307896Rx r18, AnonymousClass6Tm r19) {
        Integer num;
        int i;
        int hashCode;
        AnonymousClass6Tm r4 = r19;
        C3034368u r12 = (C3034368u) r4.A03(0);
        C276544tV r2 = (C276544tV) r4.A00.get(1);
        C307896Rx r3 = r18;
        C307786Rm A00 = C276734to.A00(r3, r4, 2);
        if (r2 == null) {
            1Kn.A02("bk.action.toast.ShowToastV2", "Cannot show toast with invalid options.");
            return null;
        }
        C307476Qg.A02(A00).A09(r12, (Map) null);
        int A03 = r2.A03(35, 5000);
        int A032 = r2.A03(42, 100);
        int A033 = r2.A03(36, 100);
        PathInterpolator A002 = V53.A00(r2.A07(43));
        PathInterpolator A003 = V53.A00(r2.A07(38));
        WF4 wf4 = new WF4(r3, r2.A0A(41));
        WF2 wf2 = new WF2(r3, r2.A0A(40));
        boolean A0R = r2.A0R(54, false);
        String A0C = r12.A02.A0C();
        boolean equals = "mini".equals(r2.A0K(44));
        String A0K = r2.A0K(48);
        if (A0K == null || (hashCode = A0K.hashCode()) == -1383228885 || hashCode != 115029 || !A0K.equals("top")) {
            num = AnonymousClass05K.A01;
        } else {
            num = AnonymousClass05K.A00;
        }
        if (A03 != -1) {
            C17709Vce vce = new C17709Vce(A002, A003, wf2, wf4, A00, r12, num, A0C, A03, A032, A033, A0R, equals);
            C307786Rm r1 = vce.A07;
            Context context = r1.A00;
            boolean z = vce.A0B;
            Integer num2 = vce.A09;
            C14720U4e u4e = new C14720U4e(context, num2, z);
            u4e.setBloksContentViewFromParseResult(r1, vce.A08);
            u4e.A00 = vce.A00;
            u4e.A02 = vce.A02;
            u4e.A01 = vce.A01;
            u4e.A04 = vce.A04;
            u4e.A03 = vce.A03;
            u4e.A06 = new WF3(vce);
            u4e.A05 = new WF1(u4e, vce);
            u4e.A0A = vce.A0C;
            u4e.setTag(R.id.foa_toast_tag_server_id, vce.A0A);
            C14720U4e u4e2 = (C14720U4e) C18287VpA.A00.get();
            if (u4e2 != null) {
                u4e2.A03(u4e2.A01);
            }
            int i2 = -1;
            if (z) {
                i2 = -2;
            }
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(i2, -2, 99, 8, -3);
            if (z) {
                i = 17;
            } else {
                i = 80;
                if (num2.equals(AnonymousClass05K.A00)) {
                    i = 48;
                }
            }
            layoutParams.gravity = i;
            try {
                ViewManager viewManager = (ViewManager) context.getSystemService("window");
                if (viewManager != null) {
                    viewManager.addView(u4e, layoutParams);
                    C18287VpA.A00 = new WeakReference(u4e);
                    u4e.A02();
                    return null;
                }
                throw new IllegalStateException("Window manager required but not found.");
            } catch (WindowManager.BadTokenException unused) {
                return null;
            }
        } else {
            throw new IllegalArgumentException("Auto-dismiss duration must be >= 0ms");
        }
    }
}
