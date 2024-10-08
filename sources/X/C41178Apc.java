package X;

import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Apc  reason: case insensitive filesystem */
public final class C41178Apc implements Runnable {
    public final /* synthetic */ ViewGroup A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ IgImageView A02;

    public C41178Apc(ViewGroup viewGroup, UserSession userSession, IgImageView igImageView) {
        this.A02 = igImageView;
        this.A00 = viewGroup;
        this.A01 = userSession;
    }

    public final void run() {
        IgImageView igImageView = this.A02;
        AnonymousClass5Gt r0 = new AnonymousClass5Gt(AnonymousClass7TE.A0S(igImageView), this.A00, new C315476jx(2131963200));
        r0.A03(igImageView);
        r0.A02();
        r0.A00().A07(this.A01);
    }
}
