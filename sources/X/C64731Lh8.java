package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.Lh8  reason: case insensitive filesystem */
public final class C64731Lh8 implements 1DN {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C307786Rm A01;
    public final /* synthetic */ C307896Rx A02;
    public final /* synthetic */ C277014uI A03;
    public final /* synthetic */ String A04;

    public C64731Lh8(Activity activity, C307786Rm r2, C307896Rx r3, C277014uI r4, String str) {
        this.A04 = str;
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = r2;
        this.A00 = activity;
    }

    public final void DWm(Map map) {
        Object obj;
        String str;
        String str2 = this.A04;
        Object obj2 = map.get(str2);
        C346927vz r4 = C346927vz.GRANTED;
        boolean A1W = AnonymousClass7TF.A1W(obj2, r4);
        C307896Rx r3 = this.A02;
        C308206Td.A0E(r3, this.A03, this.A01, Boolean.valueOf(A1W));
        Activity activity = this.A00;
        boolean equals = str2.equals("android.permission.CAMERA");
        if (equals) {
            UserSession A0B = C308206Td.A0B(r3);
            if (!(activity.getApplicationContext() == null || (obj = map.get("android.permission.CAMERA")) == null)) {
                if (obj.equals(r4)) {
                    str = "app_permission_grant";
                } else {
                    str = "app_permission_deny";
                }
                JTU.A1F(new AnonymousClass4O6(new Le8(), A0B), AnonymousClass4O7.A00(A0B), str, "BLOKS_ACTION_REQUEST_PERMISSION_IMPL", AnonymousClass7TE.A1I(AnonymousClass4O8.UNKNOWN));
            }
        }
        if (equals && C346927vz.DENIED_DONT_ASK_AGAIN.equals(obj2)) {
            W38.A02(activity, 2131954557);
        }
    }
}
