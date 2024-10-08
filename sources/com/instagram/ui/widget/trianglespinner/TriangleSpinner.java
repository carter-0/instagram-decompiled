package com.instagram.ui.widget.trianglespinner;

import X.0lg;
import X.0mk;
import X.0nA;
import X.C14241TsO;
import X.C22542Y8p;
import X.C298065sp;
import X.C331127Pr;
import X.C331157Pu;
import X.C46498Dg1;
import X.C49945FFy;
import X.C59743JWb;
import X.C61424K6y;
import X.C65805Lzx;
import X.C71382cm;
import X.JX3;
import X.LXA;
import X.MRI;
import X.MRJ;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.widget.Adapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.ui.widget.mediapicker.Folder;

public class TriangleSpinner extends Spinner {
    public MRI A00;
    public MRJ A01;
    public int A02;
    public int A03;
    public Activity A04;
    public Path A05 = new Path();
    public Fragment A06;
    public C22542Y8p A07;
    public C298065sp A08 = C298065sp.CORNER;
    public boolean A09;
    public boolean A0A;
    public final Paint A0B = new Paint(1);

    public int getPaddedTriangleSize() {
        return this.A03 + (this.A02 * 2);
    }

    public final boolean performClick() {
        MRI mri = this.A00;
        if (mri != null) {
            C61424K6y k6y = ((C65805Lzx) mri).A00;
            C46498Dg1 dg1 = new C46498Dg1(k6y.requireContext(), (0lg) k6y.A0F.getValue());
            for (Folder folder : k6y.getFolders()) {
                dg1.A0C(folder.getName(), new LXA(k6y, folder));
            }
            new C49945FFy(dg1).A05(getContext());
            return true;
        }
        MRJ mrj = this.A01;
        if (mrj == null || this.A06 == null || this.A04 == null) {
            return super.performClick();
        }
        JX3 jx3 = (JX3) mrj;
        C59743JWb jWb = jx3.A00;
        C331127Pr r1 = new C331127Pr(jWb.A03);
        jx3.A01.invoke();
        C331157Pu A002 = r1.A00();
        jWb.A00 = A002;
        A002.A02(this.A04, this.A06);
        return true;
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        C14241TsO tsO;
        if (spinnerAdapter != null) {
            tsO = new C14241TsO(spinnerAdapter, this);
        } else {
            tsO = null;
        }
        super.setAdapter(tsO);
    }

    public void setAlignToEdge(boolean z) {
        this.A09 = z;
        invalidate();
    }

    public void setBottomSheetBuilder(Fragment fragment, Activity activity, MRJ mrj) {
        this.A01 = mrj;
        this.A06 = fragment;
        this.A04 = activity;
    }

    public void setTriangleAlpha(int i) {
        this.A0B.setAlpha(i);
        invalidate();
    }

    public void setTriangleColor(int i) {
        this.A0B.setColor(i);
        invalidate();
    }

    public void setTriangleSize(int i) {
        this.A03 = i;
        setTriangleStyle(this.A08);
        0nA.A0b(this, this.A02 + this.A03);
    }

    public void setTriangleStyle(C298065sp r4) {
        this.A08 = r4;
        Path path = new Path();
        this.A05 = path;
        if (r4 == C298065sp.CORNER) {
            path.moveTo(0.0f, (float) this.A03);
            Path path2 = this.A05;
            float f = (float) this.A03;
            path2.lineTo(f, f);
            this.A05.lineTo((float) this.A03, 0.0f);
            this.A05.lineTo(0.0f, (float) this.A03);
        } else {
            path.moveTo(0.0f, 0.0f);
            this.A05.lineTo((float) this.A03, 0.0f);
            Path path3 = this.A05;
            float f2 = (float) (this.A03 / 2);
            path3.lineTo(f2, f2);
            this.A05.lineTo(0.0f, 0.0f);
        }
        this.A05.close();
        invalidate();
    }

    public TriangleSpinner(Context context) {
        super(context);
        A00((AttributeSet) null, 0);
    }

    private void A00(AttributeSet attributeSet, int i) {
        Context context = getContext();
        this.A0A = 0mk.A02(context);
        int A042 = (int) 0nA.A04(context, 12);
        C298065sp r5 = C298065sp.CORNER;
        int i2 = -16777216;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C71382cm.A2O, i, 0);
            try {
                i2 = obtainStyledAttributes.getColor(0, -16777216);
                A042 = obtainStyledAttributes.getDimensionPixelSize(2, A042);
                int i3 = obtainStyledAttributes.getInt(3, 0);
                if (i3 != 0) {
                    r5 = C298065sp.DOWNWARD_ARROW;
                    if (i3 != 2) {
                        r5 = C298065sp.DOWNWARD;
                    }
                }
                this.A02 = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        Paint paint = this.A0B;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(i2);
        setTriangleSize(A042);
        setTriangleStyle(r5);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00c8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDraw(android.graphics.Canvas r7) {
        /*
            r6 = this;
            super.onDraw(r7)
            int r0 = r6.getChildCount()
            if (r0 == 0) goto L_0x006f
            r7.save()
            boolean r0 = r6.A09
            r3 = 0
            if (r0 == 0) goto L_0x0078
            int r2 = r6.getScrollX()
            int r0 = r7.getWidth()
            int r2 = r2 + r0
            int r0 = r6.A03
            int r2 = r2 - r0
            X.5sp r1 = r6.A08
            X.5sp r0 = X.C298065sp.CORNER
            if (r1 != r0) goto L_0x00b2
            int r1 = r6.getScrollY()
            int r0 = r7.getHeight()
            int r1 = r1 + r0
            double r4 = (double) r1
            int r0 = r6.A03
            float r1 = (float) r0
            r0 = 1069547520(0x3fc00000, float:1.5)
            float r1 = r1 * r0
            double r0 = (double) r1
            double r0 = java.lang.Math.ceil(r0)
            double r4 = r4 - r0
            int r1 = (int) r4
        L_0x003a:
            float r2 = (float) r2
            float r0 = (float) r1
            r7.translate(r2, r0)
            X.5sp r1 = r6.A08
            X.5sp r0 = X.C298065sp.DOWNWARD_ARROW
            if (r1 != r0) goto L_0x0070
            android.content.Context r1 = r6.getContext()
            r0 = 2131238076(0x7f081cbc, float:1.809242E38)
            android.graphics.drawable.Drawable r2 = r1.getDrawable(r0)
            android.graphics.Paint r1 = r6.A0B
            int r0 = r1.getColor()
            android.graphics.ColorFilter r0 = X.AnonymousClass37O.A00(r0)
            r2.setColorFilter(r0)
            int r0 = r1.getAlpha()
            r2.setAlpha(r0)
            int r0 = r6.A03
            r2.setBounds(r3, r3, r0, r0)
            r2.draw(r7)
        L_0x006c:
            r7.restore()
        L_0x006f:
            return
        L_0x0070:
            android.graphics.Path r1 = r6.A05
            android.graphics.Paint r0 = r6.A0B
            r7.drawPath(r1, r0)
            goto L_0x006c
        L_0x0078:
            boolean r0 = r6.A0A
            if (r0 == 0) goto L_0x00a1
            android.view.View r0 = r6.getChildAt(r3)
            int r2 = r0.getLeft()
            int r0 = r6.A02
            int r2 = r2 - r0
            int r0 = r6.A03
            int r2 = r2 - r0
        L_0x008a:
            X.5sp r1 = r6.A08
            X.5sp r0 = X.C298065sp.CORNER
            if (r1 != r0) goto L_0x00b2
            int r1 = r6.getScrollY()
            int r0 = r7.getHeight()
            int r0 = r0 / 2
            int r1 = r1 + r0
            int r0 = r6.A03
            int r0 = r0 / 2
            int r1 = r1 + r0
            goto L_0x003a
        L_0x00a1:
            int r2 = r6.getScrollX()
            android.view.View r0 = r6.getChildAt(r3)
            int r0 = r0.getRight()
            int r2 = r2 + r0
            int r0 = r6.A02
            int r2 = r2 + r0
            goto L_0x008a
        L_0x00b2:
            X.5sp r0 = X.C298065sp.DOWNWARD_ARROW
            if (r1 != r0) goto L_0x00c8
            int r1 = r6.getScrollY()
            int r0 = r7.getHeight()
            int r0 = r0 / 2
            int r1 = r1 + r0
            int r0 = r6.A03
            int r0 = r0 / 2
        L_0x00c5:
            int r1 = r1 - r0
            goto L_0x003a
        L_0x00c8:
            int r1 = r6.getScrollY()
            int r0 = r7.getHeight()
            int r0 = r0 / 2
            int r1 = r1 + r0
            int r0 = r6.A03
            int r0 = r0 / 4
            goto L_0x00c5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.trianglespinner.TriangleSpinner.onDraw(android.graphics.Canvas):void");
    }

    public void setActionSheetBuilder(MRI mri) {
        this.A00 = mri;
    }

    public void setClickInterceptedListener(C22542Y8p y8p) {
        this.A07 = y8p;
    }

    public TriangleSpinner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(attributeSet, i);
    }

    public /* bridge */ /* synthetic */ void setAdapter(Adapter adapter) {
        setAdapter((SpinnerAdapter) adapter);
    }

    public TriangleSpinner(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A00(attributeSet, i);
    }

    public TriangleSpinner(Context context, int i) {
        super(context, i);
        A00((AttributeSet) null, 0);
    }

    public TriangleSpinner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.triangleSpinnerStyle);
        A00(attributeSet, R.attr.triangleSpinnerStyle);
    }
}
