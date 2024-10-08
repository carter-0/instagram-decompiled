package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ae5  reason: case insensitive filesystem */
public final class C40558Ae5 implements MVB {
    public final /* synthetic */ C52971GgO A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C247733gp A02;
    public final /* synthetic */ Runnable A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public final /* synthetic */ void onTextClick(View view) {
    }

    public C40558Ae5(C52971GgO ggO, UserSession userSession, C247733gp r3, Runnable runnable, String str, String str2) {
        this.A01 = userSession;
        this.A02 = r3;
        this.A03 = runnable;
        this.A00 = ggO;
        this.A04 = str;
        this.A05 = str2;
    }

    public final void onButtonClick(View view) {
        AAQ.A00(this.A01, this.A02, "undo_hide");
        A28.A00.removeCallbacks(this.A03);
        C52971GgO ggO = this.A00;
        ggO.A0A.A0M(this.A04, this.A05);
    }

    public final void onDismiss() {
        AAQ.A01(this.A01, this.A02, "undo_toast_presented");
    }

    public final void onShow() {
        AAQ.A01(this.A01, this.A02, "show_undo_toast");
    }
}
