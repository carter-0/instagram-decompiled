package X;

import android.view.View;
import android.view.ViewParent;
import androidx.compose.foundation.layout.WindowInsets;
import com.instagram.android.R;
import java.util.WeakHashMap;

public final class I4O {
    public static final C55898HpJ A0N = new Object();
    public static final WeakHashMap A0O = new WeakHashMap();
    public int A00;
    public final IF2 A01;
    public final IF2 A02;
    public final IF2 A03;
    public final IF2 A04;
    public final IF2 A05;
    public final C52953Gg6 A06;
    public final IF1 A07;
    public final IF1 A08;
    public final IF1 A09;
    public final IF1 A0A;
    public final WindowInsets A0B;
    public final boolean A0C;
    public final IF2 A0D = new IF2(4, "captionBar");
    public final IF2 A0E;
    public final IF2 A0F;
    public final IF2 A0G;
    public final IF1 A0H;
    public final IF1 A0I;
    public final IF1 A0J;
    public final IF1 A0K;
    public final WindowInsets A0L;
    public final WindowInsets A0M;

    public static IF1 A00(String str) {
        return new IF1(new C56116Ht3(0, 0, 0, 0), str);
    }

    public final void A01(04k r4) {
        this.A0D.A00(r4);
        this.A02.A00(r4);
        this.A01.A00(r4);
        this.A03.A00(r4);
        this.A04.A00(r4);
        this.A05.A00(r4);
        this.A0F.A00(r4);
        this.A0G.A00(r4);
        this.A0E.A00(r4);
        IF1 if1 = this.A0H;
        04h r2 = r4.A00;
        I2A.A01(if1, r2.A06(4));
        I2A.A01(this.A09, r2.A06(2));
        I2A.A01(this.A0A, r2.A06(1));
        I2A.A01(this.A0I, r2.A06(7));
        I2A.A01(this.A0J, r2.A06(64));
        02t A072 = r2.A07();
        if (A072 != null) {
            I2A.A01(this.A0K, A072.A00());
        }
        AnonymousClass5PH.A05();
    }

    public I4O(View view) {
        boolean z;
        Boolean bool;
        View view2;
        IF2 if2 = new IF2(128, "displayCutout");
        this.A01 = if2;
        IF2 if22 = new IF2(8, "ime");
        this.A02 = if22;
        IF2 if23 = new IF2(32, "mandatorySystemGestures");
        this.A0E = if23;
        this.A03 = new IF2(2, "navigationBars");
        this.A04 = new IF2(1, "statusBars");
        IF2 if24 = new IF2(7, "systemBars");
        this.A05 = if24;
        IF2 if25 = new IF2(16, "systemGestures");
        this.A0F = if25;
        IF2 if26 = new IF2(64, "tappableElement");
        this.A0G = if26;
        IF1 A002 = A00("waterfall");
        this.A0K = A002;
        IF0 if0 = new IF0(new IF0(if24, if22), if2);
        this.A0B = if0;
        IF0 if02 = new IF0(new IF0(new IF0(if26, if23), if25), A002);
        this.A0M = if02;
        this.A0L = new IF0(if0, if02);
        this.A0H = A00("captionBarIgnoringVisibility");
        this.A09 = A00("navigationBarsIgnoringVisibility");
        this.A0A = A00("statusBarsIgnoringVisibility");
        this.A0I = A00("systemBarsIgnoringVisibility");
        this.A0J = A00("tappableElementIgnoringVisibility");
        this.A08 = A00("imeAnimationTarget");
        this.A07 = A00("imeAnimationSource");
        ViewParent parent = view.getParent();
        Object obj = null;
        if ((parent instanceof View) && (view2 = (View) parent) != null) {
            obj = view2.getTag(R.id.consume_window_insets_tag);
        }
        if (!(obj instanceof Boolean) || (bool = (Boolean) obj) == null) {
            z = true;
        } else {
            z = bool.booleanValue();
        }
        this.A0C = z;
        this.A06 = new C52953Gg6(this);
    }
}
