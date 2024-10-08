package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.Lh7  reason: case insensitive filesystem */
public final class C64730Lh7 implements 1DN {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final boolean A03;
    public final boolean A04;

    public C64730Lh7(Object obj, Object obj2, int i, boolean z, boolean z2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
        this.A04 = z;
        this.A03 = z2;
    }

    public final void DWm(Map map) {
        int i;
        String str;
        int i2;
        if (this.A00 != 0) {
            C59867Jal jal = (C59867Jal) this.A01;
            boolean z = this.A03;
            Activity activity = (Activity) this.A02;
            boolean z2 = this.A04;
            Object obj = map.get("android.permission.CAMERA");
            Object obj2 = map.get("android.permission.RECORD_AUDIO");
            C346927vz r0 = C346927vz.GRANTED;
            if (obj == r0 && obj2 == r0) {
                jal.A0A();
                return;
            }
            C346927vz r02 = C346927vz.DENIED_DONT_ASK_AGAIN;
            if (obj == r02 && !z) {
                i2 = 2131954557;
            } else if (obj2 == r02 && !z2) {
                i2 = 2131966510;
            } else {
                return;
            }
            W38.A02(activity, i2);
            return;
        }
        0qQ.A0B(map, 0);
        Object obj3 = map.get("android.permission.CAMERA");
        Object obj4 = map.get("android.permission.WRITE_EXTERNAL_STORAGE");
        C346927vz r4 = C346927vz.GRANTED;
        if (obj3 == r4 && obj4 == r4) {
            C50349FZg.A01((C50349FZg) this.A02);
        } else {
            Activity activity2 = (Activity) this.A01;
            boolean z3 = !1DL.A05(activity2, "android.permission.CAMERA");
            boolean z4 = !1DL.A05(activity2, "android.permission.WRITE_EXTERNAL_STORAGE");
            if (z3 && !this.A04) {
                i = 2131954557;
            } else if (z4 && !this.A03) {
                i = 2131974228;
            }
            W38.A03(activity2, i);
        }
        C50349FZg fZg = (C50349FZg) this.A02;
        Object obj5 = map.get("android.permission.CAMERA");
        if (obj5 != null) {
            if (obj5 == r4) {
                str = "app_permission_grant";
            } else {
                str = "app_permission_deny";
            }
            UserSession userSession = fZg.A07;
            new AnonymousClass4O6(new C64566Le7(), userSession).A00(new AnonymousClass9JF(AnonymousClass4O9.CAMERA, AnonymousClass4OA.UNSPECIFIED), AnonymousClass4O7.A00(userSession), str, "ADD_AVATAR_HELPER", (String) null, AnonymousClass7TE.A1I(AnonymousClass4O8.UNKNOWN));
        }
    }
}
