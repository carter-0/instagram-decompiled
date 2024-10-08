package X;

import com.instagram.ui.text.ConstrainedEditText;

/* renamed from: X.ApL  reason: case insensitive filesystem */
public final /* synthetic */ class C41161ApL implements Runnable {
    public final /* synthetic */ C386939lP A00;
    public final /* synthetic */ B25 A01;
    public final /* synthetic */ C352218Cl A02;

    public /* synthetic */ C41161ApL(C386939lP r1, B25 b25, C352218Cl r3) {
        this.A00 = r1;
        this.A01 = b25;
        this.A02 = r3;
    }

    public final void run() {
        C39889ADn A0J;
        C386939lP r0 = this.A00;
        B25 b25 = this.A01;
        C352218Cl r4 = this.A02;
        C353798Jc r3 = r0.A03;
        AIY aiy = r3.A0B;
        aiy.getClass();
        aiy.A04 = true;
        if (r3.A0F != null) {
            A0J = new C39889ADn(r3.A0P);
            ConstrainedEditText constrainedEditText = r3.A0D;
            if (constrainedEditText != null) {
                A0J.A04 = constrainedEditText.getText();
                C306386Ly r2 = r3.A0F;
                A0J.A05 = r2.A0E;
                A0J.A00 = r2.A0b.getTextSize();
                A0J.A08 = r3.A0c.A0O(r3.A0F);
                C360778f8 r1 = r3.A0A;
                r1.getClass();
                A0J.A07 = r1.A07();
            }
            r3.A0L(A0J);
            C353798Jc.A02(A0J, r3);
        } else {
            A0J = r3.A0J(false, true);
        }
        b25.Cxh(A0J, r4);
    }
}
