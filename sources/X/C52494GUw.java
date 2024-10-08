package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.GUw  reason: case insensitive filesystem */
public final class C52494GUw extends C234532y8 {
    public final UserSession A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public C52494GUw(UserSession userSession, String str, String str2, String str3) {
        AnonymousClass7TG.A1O(userSession, str);
        this.A00 = userSession;
        this.A02 = str;
        this.A03 = str2;
        this.A01 = str3;
    }

    public final void Dcw(View view, int i, Object obj, Object obj2) {
        AnonymousClass7TG.A1Q(obj, obj2);
        if ((obj instanceof 1Xj) && (obj2 instanceof AnonymousClass3W1) && C51966G9m.A1Y(obj)) {
            AnonymousClass3W1 r8 = (AnonymousClass3W1) obj2;
            String str = r8.A1I;
            if (str != null) {
                String str2 = this.A01;
                if (!str.equals(str2)) {
                    0f9 AEf = 0wj.A01.AEf("action appender host_profile_id_delivered_to overwrite", 817896121);
                    AEf.ABQ("module_name", this.A02);
                    AEf.ABQ(AnonymousClass000.A00(3686), str2);
                    AEf.ABQ(AnonymousClass000.A00(3624), r8.A1I);
                    AEf.report();
                }
            }
            r8.A1K = this.A03;
            r8.A1I = this.A01;
        }
    }
}
