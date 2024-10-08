package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.Lx5  reason: case insensitive filesystem */
public final class C65628Lx5 implements G7M {
    public final /* synthetic */ LQh A00;
    public final /* synthetic */ C255773uh A01;
    public final /* synthetic */ 0sP A02;

    public final void onAuthorizeFail() {
    }

    public C65628Lx5(LQh lQh, C255773uh r2, 0sP r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = lQh;
    }

    public final void onAuthorizeSuccess(String str) {
        this.A02.invoke(this.A01);
        C63769L6b l6b = this.A00.A05;
        l6b.A00.A01 = true;
        CallerContext callerContext = C59719JVd.A01;
        IgdsButton A002 = l6b.A01.A00();
        A002.setLoading(false);
        A002.setEnabled(true);
        C14625TzX tzX = l6b.A02.mListAdapter;
        if (tzX != null) {
            tzX.A07();
        }
    }
}
