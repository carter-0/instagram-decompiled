package X;

import android.text.style.ClickableSpan;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.ESp  reason: case insensitive filesystem */
public final class C48047ESp extends C2806552w {
    public final /* synthetic */ ClickableSpan A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C314466iJ A03;

    public final void onClick(View view) {
        0qQ.A0B(view, 0);
        View view2 = this.A01;
        C314466iJ r1 = this.A03;
        view2.setVisibility(8);
        r1.DUr();
        1Ln A0J = 1Ln.A0J(new AnonymousClass7I3(this.A02).A01);
        if (DbT.A1Y(A0J)) {
            A0J.A0Z(23);
            A0J.A0X(0);
            A0J.A0M(C69503Nml.A05, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A0J.Cgf();
        }
        this.A00.onClick(view);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48047ESp(ClickableSpan clickableSpan, View view, UserSession userSession, C314466iJ r5, int i) {
        super(Integer.valueOf(i));
        this.A01 = view;
        this.A03 = r5;
        this.A02 = userSession;
        this.A00 = clickableSpan;
    }
}
