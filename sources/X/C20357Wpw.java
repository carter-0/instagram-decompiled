package X;

import android.view.ViewGroup;
import android.widget.ImageView;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.QPTooltipAnchor;

/* renamed from: X.Wpw  reason: case insensitive filesystem */
public final class C20357Wpw implements Runnable {
    public final /* synthetic */ ImageView A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C255773uh A02;
    public final /* synthetic */ C231002qi A03;
    public final /* synthetic */ C230882qT A04;
    public final /* synthetic */ C19475WaN A05;
    public final /* synthetic */ C255783ui A06;
    public final /* synthetic */ C309426Yf A07;
    public final /* synthetic */ C316716m6 A08;
    public final /* synthetic */ C317566nT A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ boolean A0B;

    public C20357Wpw(ImageView imageView, UserSession userSession, C255773uh r3, C231002qi r4, C230882qT r5, C19475WaN waN, C255783ui r7, C309426Yf r8, C316716m6 r9, C317566nT r10, String str, boolean z) {
        this.A08 = r9;
        this.A02 = r3;
        this.A06 = r7;
        this.A0B = z;
        this.A07 = r8;
        this.A00 = imageView;
        this.A05 = waN;
        this.A09 = r10;
        this.A01 = userSession;
        this.A0A = str;
        this.A03 = r4;
        this.A04 = r5;
    }

    public final void run() {
        C316716m6 r2 = this.A08;
        C255773uh r3 = this.A02;
        C255783ui r10 = this.A06;
        ImageView imageView = r2.A01;
        if (imageView != null) {
            ViewGroup viewGroup = r2.A00;
            if (viewGroup != null) {
                int width = viewGroup.getWidth();
                ViewGroup viewGroup2 = r2.A00;
                0qQ.A0A(viewGroup2);
                C306406Ma.A04(imageView, r10, r3.A00(), width, viewGroup2.getHeight(), true);
                if (!this.A0B && this.A07.A18) {
                    ImageView imageView2 = this.A00;
                    C19475WaN waN = this.A05;
                    C317566nT r6 = this.A09;
                    UserSession userSession = this.A01;
                    String str = this.A0A;
                    C231002qi r5 = this.A03;
                    C230882qT r4 = this.A04;
                    0xG r1 = new 0xG(str);
                    String str2 = waN.A00.A08;
                    0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r1, userSession), AnonymousClass000.A00(1433));
                    A0e.A9F("sticker_id", DbV.A0q(str2));
                    A0e.AAJ("source_name", "STORY");
                    A0e.A8M(XSG.IG_STICKER_FOR_CHARITY, AnonymousClass000.A00(151));
                    A0e.Cgf();
                    if (!(r5 == null || r4 == null)) {
                        r4.A00(imageView2, QPTooltipAnchor.FUNDRAISER_STICKER, r5);
                    }
                    r6.DnC(imageView2, r3, r10);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }
}
