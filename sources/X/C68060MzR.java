package X;

import android.app.Activity;
import android.graphics.Rect;
import android.view.LayoutInflater;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;

/* renamed from: X.MzR  reason: case insensitive filesystem */
public final class C68060MzR extends C249703kE implements C74330Pt6 {
    public C71003OWa A00;
    public final Activity A01;
    public final LayoutInflater A02;
    public final AnonymousClass0iw A03;
    public final UserSession A04;
    public final boolean A05;
    public final boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68060MzR(Activity activity, LayoutInflater layoutInflater, AnonymousClass0iw r4, UserSession userSession, IgFrameLayout igFrameLayout, boolean z, boolean z2) {
        super(igFrameLayout);
        C51974G9v.A1L(igFrameLayout, activity, userSession);
        0qQ.A0B(r4, 5);
        this.A01 = activity;
        this.A02 = layoutInflater;
        this.A04 = userSession;
        this.A03 = r4;
        this.A06 = z;
        this.A05 = z2;
    }

    public final boolean APx(float f, float f2) {
        Rect A0W = AnonymousClass7TE.A0W();
        this.itemView.getHitRect(A0W);
        return A0W.contains((int) f, (int) f2);
    }
}
