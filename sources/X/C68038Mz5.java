package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.imagebutton.IgImageButton;

/* renamed from: X.Mz5  reason: case insensitive filesystem */
public final class C68038Mz5 extends C249703kE {
    public C66819MdB A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final C252063oV A03;
    public final 2el A04;
    public final O7M A05;
    public final AnonymousClass7HA A06;
    public final IgImageButton A07;
    public final 0sP A08;

    /* JADX WARNING: type inference failed for: r1v2, types: [com.instagram.igds.components.imagebutton.IgImageButton, android.view.View] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C68038Mz5(View view, AnonymousClass0iw r4, UserSession userSession, 0sP r6) {
        super(view);
        AnonymousClass7HA r1 = new AnonymousClass7HA(userSession, new AnonymousClass7H9(userSession));
        O7M o7m = new O7M(userSession);
        this.A08 = r6;
        this.A02 = userSession;
        this.A01 = r4;
        this.A06 = r1;
        this.A05 = o7m;
        ? r12 = (IgImageButton) AnonymousClass7TF.A0F(view, R.id.image_button);
        this.A07 = r12;
        this.A03 = DbU.A0Z(view, R.id.privacy_overlay_stub);
        this.A04 = AnonymousClass2hM.A00(r12);
    }
}
