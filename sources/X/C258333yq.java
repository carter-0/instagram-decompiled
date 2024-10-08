package X;

import android.content.Context;
import android.widget.FrameLayout;
import com.instagram.common.session.UserSession;

/* renamed from: X.3yq  reason: invalid class name and case insensitive filesystem */
public final class C258333yq extends C249703kE {
    public final Context A00;
    public final FrameLayout A01;
    public final C273694n2 A02;
    public final C229382nI A03;
    public final UserSession A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C258333yq(FrameLayout frameLayout, C229382nI r4, UserSession userSession) {
        super(frameLayout);
        0qQ.A0B(frameLayout, 1);
        this.A01 = frameLayout;
        this.A04 = userSession;
        this.A03 = r4;
        Context context = frameLayout.getContext();
        0qQ.A07(context);
        this.A00 = context;
        C273694n2 r0 = new C273694n2(context);
        frameLayout.addView(r0);
        this.A02 = r0;
    }
}
