package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.google.common.collect.ImmutableList;
import com.instagram.direct.fragment.writewithai.RewriteTextBubbleViewPager;

/* renamed from: X.Pc4  reason: case insensitive filesystem */
public final class C73407Pc4 implements Runnable {
    public final /* synthetic */ ImmutableList A00;
    public final /* synthetic */ C70834ONg A01;
    public final /* synthetic */ C42775BiB A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ C62320sa A05;
    public final /* synthetic */ 0sP A06;

    public C73407Pc4(ImmutableList immutableList, C70834ONg oNg, C42775BiB biB, String str, String str2, C62320sa r6, 0sP r7) {
        this.A01 = oNg;
        this.A02 = biB;
        this.A06 = r7;
        this.A00 = immutableList;
        this.A03 = str;
        this.A04 = str2;
        this.A05 = r6;
    }

    public final void run() {
        String str;
        C70834ONg oNg = this.A01;
        oNg.A01();
        C42775BiB biB = this.A02;
        if (biB != null) {
            String A07 = biB.A07(DialogModule.KEY_MESSAGE);
            if (A07 == null) {
                A07 = AnonymousClass7TE.A16(oNg.A04, 2131958804);
            }
            this.A06.invoke(A07);
        } else {
            ImmutableList immutableList = this.A00;
            if (immutableList != null && AnonymousClass7TE.A1b(immutableList)) {
                C249803kO A0J = C66580MXl.A0J(immutableList);
                while (A0J.hasNext()) {
                    String str2 = (String) A0J.next();
                    RewriteTextBubbleViewPager rewriteTextBubbleViewPager = oNg.A06;
                    if (rewriteTextBubbleViewPager != null) {
                        0qQ.A0A(str2);
                        String str3 = this.A03;
                        if ("REPHRASE".equals("REPHRASE")) {
                            str = AnonymousClass7TF.A0d(oNg.A04.getResources(), 2131972152);
                        } else {
                            str = "";
                        }
                        rewriteTextBubbleViewPager.A0T(1, str2, str3, str, this.A04);
                    }
                }
            }
        }
        this.A05.invoke();
    }
}
