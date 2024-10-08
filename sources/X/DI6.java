package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.direct.fragment.writewithai.RewriteTextBubbleViewPager;

public final class DI6 implements Runnable {
    public final /* synthetic */ C70834ONg A00;
    public final /* synthetic */ C42781BiH A01;
    public final /* synthetic */ C42782BiI A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ C62320sa A06;
    public final /* synthetic */ 0sP A07;

    public DI6(C70834ONg oNg, C42781BiH biH, C42782BiI biI, String str, String str2, String str3, C62320sa r7, 0sP r8) {
        this.A00 = oNg;
        this.A01 = biH;
        this.A07 = r8;
        this.A04 = str;
        this.A02 = biI;
        this.A05 = str2;
        this.A03 = str3;
        this.A06 = r7;
    }

    public final void run() {
        String str;
        C70834ONg oNg = this.A00;
        oNg.A01();
        C42781BiH biH = this.A01;
        if (biH != null) {
            String A072 = biH.A07(DialogModule.KEY_MESSAGE);
            if (A072 == null) {
                A072 = oNg.A04.getString(2131958804);
                0qQ.A07(A072);
            }
            this.A07.invoke(A072);
        } else {
            String str2 = this.A04;
            if (str2.length() > 0) {
                C42782BiI biI = this.A02;
                if (biI != null) {
                    str = biI.A08("response_id");
                } else {
                    str = null;
                }
                RewriteTextBubbleViewPager rewriteTextBubbleViewPager = oNg.A06;
                if (rewriteTextBubbleViewPager != null) {
                    rewriteTextBubbleViewPager.A0T((Integer) null, str2, str, this.A05, this.A03);
                }
            }
        }
        this.A06.invoke();
    }
}
