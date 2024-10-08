package X;

import android.graphics.Rect;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.instagram.ui.widget.tooltippopup.MaskingFrameLayout;

public final class LZ4 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C275794rx A02;
    public final /* synthetic */ boolean A03;

    public LZ4(C275794rx r1, int i, int i2, boolean z) {
        this.A02 = r1;
        this.A00 = i;
        this.A01 = i2;
        this.A03 = z;
    }

    public final boolean onPreDraw() {
        int paddingBottom;
        MaskingFrameLayout maskingFrameLayout;
        MaskingFrameLayout maskingFrameLayout2;
        float A032;
        C275794rx r6 = this.A02;
        C60064Jem jem = r6.A0G;
        jem.getViewTreeObserver().removeOnPreDrawListener(this);
        int i = this.A00;
        int i2 = this.A01;
        boolean z = this.A03;
        if (!z) {
            i2 -= jem.getHeight();
        }
        int[] iArr = new int[2];
        FrameLayout frameLayout = r6.A0C;
        frameLayout.getLocationOnScreen(iArr);
        int paddingTop = (i2 - iArr[1]) - frameLayout.getPaddingTop();
        if (z) {
            paddingBottom = -jem.getPaddingTop();
        } else {
            paddingBottom = jem.getPaddingBottom();
        }
        jem.setTranslationY((float) (paddingTop + paddingBottom));
        if (z) {
            maskingFrameLayout = jem.A04;
        } else {
            maskingFrameLayout = jem.A03;
        }
        int width = jem.getWidth();
        int width2 = i - (maskingFrameLayout.getWidth() / 2);
        Rect rect = r6.A0A;
        int paddingLeft = ((width2 - (width / 2)) + (jem.getPaddingLeft() / 2)) - rect.left;
        Integer num = r6.A0J;
        Integer num2 = AnonymousClass05K.A01;
        int i3 = 0;
        if (num.equals(num2) && paddingLeft < 0) {
            paddingLeft = -jem.getPaddingLeft();
        }
        int A09 = 0nA.A09(jem.getContext());
        if (r6.A0K.equals(num2) && paddingLeft + width > A09) {
            paddingLeft = (A09 - width) + jem.getPaddingRight();
        }
        jem.setX((float) paddingLeft);
        int x = (width2 - rect.left) - ((int) jem.getX());
        r6.A02 = x;
        maskingFrameLayout.setX((float) x);
        jem.A04.setVisibility(JTQ.A00(z ? 1 : 0));
        MaskingFrameLayout maskingFrameLayout3 = jem.A03;
        if (z) {
            i3 = 4;
        }
        maskingFrameLayout3.setVisibility(i3);
        if (z) {
            maskingFrameLayout2 = jem.A04;
        } else {
            maskingFrameLayout2 = jem.A03;
        }
        int width3 = r6.A02 + (maskingFrameLayout2.getWidth() / 2);
        C311686d5 r5 = r6.A03;
        r6.A02 = width3;
        r6.A07 = z;
        C71392co r0 = C315596kB.A02;
        C294975nL A0c = JTP.A0c(jem, 0);
        A0c.A0U(0.0f, 1.0f, (float) width3);
        if (z) {
            A032 = 0.0f;
        } else {
            A032 = AnonymousClass7TE.A03(jem);
        }
        A0c.A0V(0.0f, 1.0f, A032);
        A0c.A0M(0.0f, 1.0f);
        A0c.A04 = 0;
        A0c.A06 = new PQS(r6, 4);
        A0c.A05 = new C65718LyY(4, r6, r5);
        A0c.A0H();
        return false;
    }
}
