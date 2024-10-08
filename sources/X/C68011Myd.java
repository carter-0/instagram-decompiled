package X;

import android.view.View;
import android.view.ViewStub;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.banner.IgdsBanner;

/* renamed from: X.Myd  reason: case insensitive filesystem */
public final class C68011Myd extends C249703kE {
    public View A00;
    public final View A01;
    public final ViewStub A02;
    public final UserSession A03;
    public final IgdsBanner A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68011Myd(View view, UserSession userSession) {
        super(view);
        0qQ.A0B(userSession, 2);
        this.A01 = view;
        this.A03 = userSession;
        this.A04 = (IgdsBanner) AnonymousClass7TF.A0F(view, R.id.encrypted_backup_banner);
        this.A02 = JTR.A0X(view, R.id.megaphone_view_stub);
    }
}
