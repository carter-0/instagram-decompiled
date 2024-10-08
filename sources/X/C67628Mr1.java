package X;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;

/* renamed from: X.Mr1  reason: case insensitive filesystem */
public final class C67628Mr1 extends Dialog {
    public static final int A02 = Color.argb(127, 28, 43, 51);
    public final int A00;
    public final 0sP A01;

    public C67628Mr1(Context context, 0sP r2, int i) {
        super(context);
        this.A00 = i;
        this.A01 = r2;
    }

    public static int A00(Dialog dialog, float f) {
        Context context = dialog.getContext();
        0qQ.A07(context);
        return (int) C18183Vmx.A00(context, f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003e, code lost:
        if (r5 == null) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r8) {
        /*
            r7 = this;
            super.onCreate(r8)
            android.view.Window r1 = r7.getWindow()
            r6 = 1120927744(0x42d00000, float:104.0)
            if (r1 == 0) goto L_0x0024
            r0 = 2
            r1.clearFlags(r0)
            r0 = 17170445(0x106000d, float:2.461195E-38)
            r1.setBackgroundDrawableResource(r0)
            android.view.View r2 = r1.getDecorView()
            int r1 = A00(r7, r6)
            int r0 = A00(r7, r6)
            X.C66581MXm.A1B(r2, r1, r0)
        L_0x0024:
            android.content.Context r0 = r7.getContext()
            androidx.constraintlayout.widget.ConstraintLayout r4 = new androidx.constraintlayout.widget.ConstraintLayout
            r4.<init>(r0)
            X.0sP r1 = r7.A01
            if (r1 == 0) goto L_0x0040
            android.content.Context r0 = r7.getContext()
            X.0qQ.A07(r0)
            java.lang.Object r5 = r1.invoke(r0)
            android.view.View r5 = (android.view.View) r5
            if (r5 != 0) goto L_0x0051
        L_0x0040:
            android.content.Context r0 = r7.getContext()
            android.widget.ProgressBar r5 = new android.widget.ProgressBar
            r5.<init>(r0)
            r0 = -1
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r5.setIndeterminateTintList(r0)
        L_0x0051:
            android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
            r2.<init>()
            int r0 = r7.A00
            r2.setColor(r0)
            android.content.Context r0 = r7.getContext()
            X.0qQ.A07(r0)
            r1 = 1103101952(0x41c00000, float:24.0)
            float r0 = X.C18183Vmx.A00(r0, r1)
            r2.setCornerRadius(r0)
            r4.setBackground(r2)
            int r1 = A00(r7, r1)
            X.2dQ r0 = new X.2dQ
            r0.<init>(r1, r1)
            r3 = 0
            r0.A0u = r3
            r0.A0F = r3
            r0.A0Y = r3
            r0.A0q = r3
            r4.addView(r5, r0)
            int r2 = A00(r7, r6)
            int r1 = A00(r7, r6)
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r0.<init>(r2, r1)
            r7.setContentView(r4, r0)
            r7.setCancelable(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67628Mr1.onCreate(android.os.Bundle):void");
    }
}
