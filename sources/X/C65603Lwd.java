package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.Lwd  reason: case insensitive filesystem */
public final class C65603Lwd implements C311336cW {
    public final /* synthetic */ LQh A00;

    public final void DDx(AnonymousClass3YP r5, C255773uh r6) {
        1Xj r0 = r6.A0b;
        if (r0 != null) {
            r0.A49(r5);
            C63769L6b l6b = this.A00.A05;
            CallerContext callerContext = C59719JVd.A01;
            IgdsButton A002 = l6b.A01.A00();
            A002.setLoading(false);
            A002.setEnabled(true);
            C14625TzX tzX = l6b.A02.mListAdapter;
            if (tzX != null) {
                tzX.A07();
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public C65603Lwd(LQh lQh) {
        this.A00 = lQh;
    }
}
