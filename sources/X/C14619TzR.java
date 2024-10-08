package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import androidx.appcompat.widget.SwitchCompat;

/* renamed from: X.TzR  reason: case insensitive filesystem */
public final class C14619TzR extends FrameLayout implements X9E {
    public final SwitchCompat A00;

    public void setChecked(boolean z) {
        this.A00.setChecked(z);
    }

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.A00.setOnCheckedChangeListener(onCheckedChangeListener);
    }

    public void setTag(Object obj) {
        this.A00.setTag(obj);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setThumbScale(float r5) {
        /*
            r4 = this;
            androidx.appcompat.widget.SwitchCompat r3 = r4.A00
            android.graphics.drawable.Drawable r2 = r3.A0A
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0039
            boolean r0 = r2 instanceof X.C14630Tzc
            if (r0 != 0) goto L_0x0039
            X.0qQ.A0A(r2)
            X.Tzc r0 = new X.Tzc
            r0.<init>(r2)
        L_0x0016:
            r3.setThumbDrawable(r0)
        L_0x0019:
            android.graphics.drawable.Drawable r1 = r3.A0A
            boolean r0 = r1 instanceof X.C14630Tzc
            if (r0 == 0) goto L_0x0038
            X.Tzc r1 = (X.C14630Tzc) r1
            if (r1 == 0) goto L_0x0038
            float r0 = r1.A00
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            boolean r0 = X.AnonymousClass7TF.A1Q(r0)
            r0 = r0 ^ 1
            r1.A00 = r5
            if (r0 == 0) goto L_0x0038
            android.graphics.Rect r0 = X.AnonymousClass7TE.A0X(r1)
            r1.onBoundsChange(r0)
        L_0x0038:
            return
        L_0x0039:
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0019
            boolean r0 = r2 instanceof X.C14630Tzc
            if (r0 == 0) goto L_0x0019
            X.Tzc r2 = (X.C14630Tzc) r2
            android.graphics.drawable.Drawable r0 = r2.A01
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14619TzR.setThumbScale(float):void");
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.A00.setThumbTintList(colorStateList);
    }

    public C14619TzR(Context context) {
        super(context);
        SwitchCompat switchCompat = new SwitchCompat(context, (AttributeSet) null);
        this.A00 = switchCompat;
        addView(switchCompat, -2, -2);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.A00.setEnabled(z);
    }

    public final void setTag(int i, Object obj) {
        this.A00.setTag(i, obj);
    }
}
