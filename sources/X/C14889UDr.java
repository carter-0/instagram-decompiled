package X;

import android.content.Context;
import android.widget.FrameLayout;
import com.instagram.common.session.UserSession;

/* renamed from: X.UDr  reason: case insensitive filesystem */
public final class C14889UDr extends C249703kE {
    public final Context A00;
    public final FrameLayout A01;
    public final C273694n2 A02;
    public final C229382nI A03;
    public final UserSession A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14889UDr(FrameLayout frameLayout, C229382nI r4, UserSession userSession) {
        super(frameLayout);
        0qQ.A0B(frameLayout, 1);
        this.A01 = frameLayout;
        this.A04 = userSession;
        this.A03 = r4;
        Context A0S = AnonymousClass7TE.A0S(frameLayout);
        this.A00 = A0S;
        C273694n2 r0 = new C273694n2(A0S);
        frameLayout.addView(r0);
        this.A02 = r0;
    }
}
