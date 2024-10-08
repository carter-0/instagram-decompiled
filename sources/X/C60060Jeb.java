package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RadioGroup;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.Jeb  reason: case insensitive filesystem */
public final class C60060Jeb extends FrameLayout implements C66437MRr {
    public C64168LRo A00;
    public SpinnerImageView A01;
    public boolean A02;
    public C62592KiP A03 = C62592KiP.FILTER;
    public boolean A04;
    public final C60070Jez A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60060Jeb(Context context) {
        super(context);
        0qQ.A0B(context, 1);
        setBackground((Drawable) null);
        setClickable(true);
        setFocusable(true);
        C60070Jez jez = new C60070Jez(context, this.A03, getParent() instanceof RadioGroup);
        this.A05 = jez;
        addView(jez, new FrameLayout.LayoutParams(-2, -1));
    }

    public static final FrameLayout.LayoutParams A00(C60060Jeb jeb, int i) {
        jeb.A04 = false;
        Rect A0X = AnonymousClass7TE.A0X(jeb.A05.A02);
        FrameLayout.LayoutParams A0D = JTS.A0D();
        A0D.gravity = 1;
        A0D.topMargin = A0X.centerY() - (i / 2);
        if (A0X.centerY() == 0 || i == 0) {
            jeb.A04 = true;
        }
        return A0D;
    }

    public final void A03(C66568MWw mWw, boolean z) {
        0qQ.A0B(mWw, 0);
        C60070Jez jez = this.A05;
        jez.A09 = z;
        jez.A01 = mWw;
        jez.A04 = mWw.getName();
        jez.A02 = mWw.AWf(jez.getContext(), (Drawable) null, jez.A03);
        C60070Jez.A01(jez);
        A01(jez.isChecked());
    }

    public final void setConfig(C62592KiP kiP) {
        0qQ.A0B(kiP, 0);
        this.A03 = kiP;
        this.A05.A03 = kiP;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0033  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A01(boolean r6) {
        /*
            r5 = this;
            X.Jez r4 = r5.A05
            X.MWw r1 = r4.A01
            X.0qQ.A07(r1)
            boolean r0 = r1 instanceof X.C64943Lki
            if (r0 == 0) goto L_0x003a
            java.lang.Integer r0 = X.AnonymousClass05K.A02
            X.2eS.A04(r5, r0)
            if (r6 == 0) goto L_0x003b
            r0 = r1
            X.Lki r0 = (X.C64943Lki) r0
            X.L7l r0 = r0.A00
            X.8Kd r3 = r0.A01
            int r0 = r3.A00
            if (r0 == 0) goto L_0x003b
            android.content.Context r2 = r5.getContext()
            r1 = 2131962427(0x7f132a3b, float:1.9561579E38)
            java.lang.String r0 = r3.A03
            java.lang.String r0 = X.DbW.A0h(r2, r0, r1)
        L_0x002a:
            r5.setContentDescription(r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 30
            if (r1 < r0) goto L_0x003a
            java.lang.CharSequence r0 = r4.getStateDescription()
            X.03v.A0G(r5, r0)
        L_0x003a:
            return
        L_0x003b:
            X.Lki r1 = (X.C64943Lki) r1
            X.L7l r0 = r1.A00
            X.8Kd r0 = r0.A01
            java.lang.String r0 = r0.A03
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60060Jeb.A01(boolean):void");
    }

    public final void A02() {
        Drawable drawable;
        C60070Jez jez = this.A05;
        C66568MWw mWw = jez.A01;
        Context context = jez.getContext();
        C59974Jcj jcj = jez.A02;
        if (jcj != null) {
            drawable = jcj.A00;
        } else {
            drawable = null;
        }
        jez.A02 = mWw.AWf(context, drawable, jez.A03);
        C60070Jez.A00(jez);
        jez.postInvalidate();
    }

    public final void CyV(int i, Bitmap bitmap) {
        this.A05.CyV(i, bitmap);
    }

    public final int getTileId() {
        return C66568MWw.A00(this.A05);
    }

    public final C66568MWw getTileInfo() {
        C66568MWw mWw = this.A05.A01;
        0qQ.A07(mWw);
        return mWw;
    }

    public final void setChecked(boolean z) {
        C60070Jez jez = this.A05;
        if (z != jez.isChecked()) {
            jez.setChecked(z);
            jez.invalidate();
            A01(z);
        }
    }

    public final void setDraggable(boolean z) {
        this.A05.A05 = z;
    }

    public final void setShouldShowSlidersIcon(boolean z) {
        this.A05.A06 = z;
    }

    public final void setShowTextBelowPreviewThumbnail(boolean z) {
        this.A05.A08 = z;
    }

    public final void onMeasure(int i, int i2) {
        float size = (float) View.MeasureSpec.getSize(i2);
        int min = Math.min(C63994LHs.A00(AnonymousClass7TE.A0S(this), this.A03), AnonymousClass7TE.A05(0.85f, size));
        this.A05.A00 = min;
        int round = Math.round(size);
        setMeasuredDimension(min, round);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            getChildAt(i3).measure(i, i2);
        }
        if (this.A04) {
            SpinnerImageView spinnerImageView = this.A01;
            if (spinnerImageView != null) {
                spinnerImageView.setLayoutParams(A00(this, round));
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public final void setBlurIconCache(C64168LRo lRo) {
        this.A00 = lRo;
    }

    public final void setIsChecked(boolean z) {
        setChecked(z);
    }

    public final void setShouldUseBlurIcons(boolean z) {
        this.A02 = z;
    }
}
