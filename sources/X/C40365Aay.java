package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Aay  reason: case insensitive filesystem */
public final /* synthetic */ class C40365Aay implements MS6 {
    public final /* synthetic */ AnonymousClass8K4 A00;

    public /* synthetic */ C40365Aay(AnonymousClass8K4 r1) {
        this.A00 = r1;
    }

    public final void Dgl(boolean z, String str) {
        String str2;
        AnonymousClass8K4 r4 = this.A00;
        UserSession userSession = r4.A0D;
        02m r2 = 02m.A0p;
        short s = 3;
        if (z) {
            s = 2;
        }
        r2.markerEnd(18948745, s);
        AnonymousClass7TF.A1N(r4.A0l);
        int i = 2131961740;
        if (z) {
            i = 2131969418;
        }
        Activity activity = r4.A0A;
        if (z) {
            str2 = null;
        } else {
            str2 = "save_screenshot_failed";
        }
        C59689JTv.A0F(activity, str2, i);
        AnonymousClass8VQ.A04(userSession, new AnonymousClass9U5(str));
    }
}
