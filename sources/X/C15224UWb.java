package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.StateListDrawable;
import android.text.TextWatcher;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.textfield.TextInputLayout;
import com.instagram.android.R;

/* renamed from: X.UWb  reason: case insensitive filesystem */
public final class C15224UWb extends VV7 {
    public long A00 = Long.MAX_VALUE;
    public ValueAnimator A01;
    public ValueAnimator A02;
    public StateListDrawable A03;
    public AccessibilityManager A04;
    public C297875sV A05;
    public boolean A06 = false;
    public boolean A07 = false;
    public final TextWatcher A08 = new UWG(this);
    public final View.OnFocusChangeListener A09 = new WBI(this, 2);
    public final U7E A0A = new C15225UWc(this, this.A02);
    public final X35 A0B = new WMZ(this);
    public final X36 A0C = new C19121WMc(this);

    public static C297875sV A00(C15224UWb uWb, float f, float f2, float f3, int i) {
        C324126yg r1 = new C324126yg();
        r1.A02 = new C297925sa(f);
        r1.A03 = new C297925sa(f);
        r1.A00 = new C297925sa(f2);
        r1.A01 = new C297925sa(f2);
        C297895sX r4 = new C297895sX(r1);
        Context context = uWb.A00;
        Paint paint = C297875sV.A0M;
        int A002 = C298035sl.A00(context, C273654mx.A00(1301), R.attr.colorSurface);
        C297875sV r3 = new C297875sV();
        r3.A0E(context);
        r3.A0F(ColorStateList.valueOf(A002));
        r3.A0A(f3);
        r3.setShapeAppearanceModel(r4);
        C297955sd r12 = r3.A00;
        if (r12.A0I == null) {
            r12.A0I = new Rect();
        }
        r3.A00.A0I.set(0, i, 0, i);
        r3.invalidateSelf();
        return r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
        if (r4 > 300) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(android.widget.AutoCompleteTextView r6, X.C15224UWb r7) {
        /*
            if (r6 == 0) goto L_0x0031
            long r4 = java.lang.System.currentTimeMillis()
            long r0 = r7.A00
            long r4 = r4 - r0
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0016
            r2 = 300(0x12c, double:1.48E-321)
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 0
            if (r1 <= 0) goto L_0x0017
        L_0x0016:
            r0 = 1
        L_0x0017:
            r1 = 0
            if (r0 == 0) goto L_0x001c
            r7.A06 = r1
        L_0x001c:
            boolean r0 = r7.A06
            if (r0 != 0) goto L_0x0036
            boolean r0 = r7.A07
            r0 = r0 ^ 1
            A02(r7, r0)
            boolean r0 = r7.A07
            if (r0 == 0) goto L_0x0032
            r6.requestFocus()
            r6.showDropDown()
        L_0x0031:
            return
        L_0x0032:
            r6.dismissDropDown()
            return
        L_0x0036:
            r7.A06 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15224UWb.A01(android.widget.AutoCompleteTextView, X.UWb):void");
    }

    public static void A02(C15224UWb uWb, boolean z) {
        if (uWb.A07 != z) {
            uWb.A07 = z;
            uWb.A01.cancel();
            uWb.A02.start();
        }
    }

    public C15224UWb(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }
}
