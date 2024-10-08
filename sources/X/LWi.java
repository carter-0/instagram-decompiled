package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.xme.threed.repository.Xme3dMediaRepository;
import com.instagram.xme.threed.view.IgGltfSceneLayoutView;

public final class LWi implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ AnonymousClass6WO A02;
    public final /* synthetic */ Xme3dMediaRepository A03;
    public final /* synthetic */ IgGltfSceneLayoutView A04;

    public final void onViewDetachedFromWindow(View view) {
    }

    public LWi(View view, UserSession userSession, AnonymousClass6WO r3, Xme3dMediaRepository xme3dMediaRepository, IgGltfSceneLayoutView igGltfSceneLayoutView) {
        this.A00 = view;
        this.A04 = igGltfSceneLayoutView;
        this.A03 = xme3dMediaRepository;
        this.A01 = userSession;
        this.A02 = r3;
    }

    public final void onViewAttachedToWindow(View view) {
        this.A00.removeOnAttachStateChangeListener(this);
        IgGltfSceneLayoutView igGltfSceneLayoutView = this.A04;
        AnonymousClass07Z A002 = C71362ch.A00(igGltfSceneLayoutView);
        if (A002 != null) {
            C51975G9x.A1E(this.A03, igGltfSceneLayoutView, DbW.A0E(A002), 26);
        }
        AnonymousClass07Z A003 = C71362ch.A00(igGltfSceneLayoutView);
        if (A003 != null) {
            AnonymousClass7TE.A1Z(new MGL(this.A01, this.A03, this.A02, igGltfSceneLayoutView, (AnonymousClass4D7) null, 5), DbW.A0E(A003));
        }
    }
}
