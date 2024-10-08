package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;

/* renamed from: X.AgU  reason: case insensitive filesystem */
public final class C40654AgU implements C332277Ui {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C334127ai A01;
    public final /* synthetic */ UserSession A02;

    public final void D9a() {
    }

    public C40654AgU(FragmentActivity fragmentActivity, C334127ai r2, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A02 = userSession;
        this.A01 = r2;
    }

    public final void D9V() {
        FragmentActivity fragmentActivity = this.A00;
        if (!fragmentActivity.isFinishing()) {
            C250563lf.A0X(fragmentActivity, (ClipsViewerConfig) ((AnonymousClass9IK) this.A01).A01, this.A02);
        }
    }
}
