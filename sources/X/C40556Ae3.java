package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ae3  reason: case insensitive filesystem */
public final class C40556Ae3 implements MVB {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ AnonymousClass4DH A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C254783t2 A03;

    public final void onDismiss() {
    }

    public final void onShow() {
    }

    public final /* synthetic */ void onTextClick(View view) {
    }

    public C40556Ae3(FragmentActivity fragmentActivity, AnonymousClass4DH r2, UserSession userSession, C254783t2 r4) {
        this.A00 = fragmentActivity;
        this.A02 = userSession;
        this.A01 = r2;
        this.A03 = r4;
    }

    public final void onButtonClick(View view) {
        1pE A012 = 1pE.A01(this.A00, this.A01, this.A02, "follow_button_toast_view");
        A012.A0B = this.A03;
        A012.A06();
    }
}
