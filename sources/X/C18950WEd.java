package X;

import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.views.swiperefresh.SwipeRefreshLayoutManager;

/* renamed from: X.WEd  reason: case insensitive filesystem */
public final class C18950WEd implements C227322j1 {
    public final /* synthetic */ QZL A00;
    public final /* synthetic */ C14913UEw A01;
    public final /* synthetic */ SwipeRefreshLayoutManager A02;

    public C18950WEd(QZL qzl, C14913UEw uEw, SwipeRefreshLayoutManager swipeRefreshLayoutManager) {
        this.A02 = swipeRefreshLayoutManager;
        this.A00 = qzl;
        this.A01 = uEw;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.view.View, X.UEw] */
    public final void Dcp() {
        QZL qzl = this.A00;
        ? r0 = this.A01;
        C20877X2e A0K = C13990Tnq.A0K(r0, qzl);
        if (A0K != null) {
            A0K.APe(new W0S(UIManagerHelper.A01(r0), r0.getId()));
        }
    }
}
