package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.instagram.android.R;

public final class U4V extends FrameLayout {
    public int A00;
    public boolean A01;
    public int A02 = -1;
    public Drawable A03;
    public Drawable A04;
    public final Paint A05;

    public U4V(Context context) {
        super(context, (AttributeSet) null, 0);
        Paint A0D = JTP.A0D();
        this.A05 = A0D;
        setWillNotDraw(false);
        A0D.setStyle(Paint.Style.FILL_AND_STROKE);
        AnonymousClass7TE.A1N(getContext(), A0D, R.color.design_dark_default_color_on_background);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDraw(android.graphics.Canvas r5) {
        /*
            r4 = this;
            r0 = 0
            X.0qQ.A0B(r5, r0)
            super.onDraw(r5)
            int r0 = r4.A00
            float r3 = X.C13988Tno.A01(r0)
            boolean r0 = r4.isSelected()
            if (r0 == 0) goto L_0x0022
            android.graphics.Paint r2 = r4.A05
        L_0x0015:
            r5.drawCircle(r3, r3, r3, r2)
        L_0x0018:
            android.graphics.drawable.Drawable r0 = r4.getItemDrawable()
            if (r0 == 0) goto L_0x0021
            r0.draw(r5)
        L_0x0021:
            return
        L_0x0022:
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x0018
            android.graphics.Paint r2 = X.JTP.A0D()
            android.content.Context r1 = r4.getContext()
            r0 = 2131099832(0x7f0600b8, float:1.7812028E38)
            X.AnonymousClass7TE.A1N(r1, r2, r0)
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U4V.onDraw(android.graphics.Canvas):void");
    }

    public final void setIcon(int i) {
        this.A02 = i;
        this.A04 = null;
        this.A03 = null;
    }

    public final void setUtilityToolBarItem(boolean z) {
        this.A01 = z;
    }

    private final Drawable getItemDrawable() {
        if (isSelected()) {
            Drawable drawable = this.A03;
            if (drawable != null) {
                return drawable;
            }
            Drawable A002 = C347067wD.A00(AnonymousClass7TE.A0S(this), this.A02, this.A00, isSelected());
            this.A03 = A002;
            return A002;
        }
        Drawable drawable2 = this.A04;
        if (drawable2 != null) {
            return drawable2;
        }
        Drawable A003 = C347067wD.A00(AnonymousClass7TE.A0S(this), this.A02, this.A00, isSelected());
        this.A04 = A003;
        return A003;
    }

    public final void setItemViewState(boolean z) {
        if (z != isSelected()) {
            setSelected(z);
            invalidate();
        }
    }
}
