package X;

import android.widget.EditText;
import com.instagram.common.ui.base.IgLinearLayout;

public final class ET1 extends W7f {
    public final /* synthetic */ int A00;
    public final /* synthetic */ EditText A01;
    public final /* synthetic */ E30 A02;
    public final /* synthetic */ IgLinearLayout A03;

    public ET1(EditText editText, E30 e30, IgLinearLayout igLinearLayout, int i) {
        this.A01 = editText;
        this.A02 = e30;
        this.A00 = i;
        this.A03 = igLinearLayout;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002c, code lost:
        if (r4 == false) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void afterTextChanged(android.text.Editable r9) {
        /*
            r8 = this;
            android.widget.EditText r3 = r8.A01
            X.0qQ.A0A(r3)
            boolean r0 = X.FC0.A02(r3)
            r4 = r0 ^ 1
            if (r4 != 0) goto L_0x001c
            X.E30 r0 = r8.A02
            android.content.Context r2 = r0.requireContext()
            X.0qQ.A0A(r3)
            int r1 = r8.A00
            r0 = 0
            X.FC0.A00(r2, r3, r1, r0)
        L_0x001c:
            com.instagram.common.ui.base.IgLinearLayout r3 = r8.A03
            int r2 = r8.A00
            r7 = 0
            r0 = 2131437883(0x7f0b293b, float:1.8497677E38)
            android.view.View r1 = r3.findViewById(r0)
            r0 = 1
            if (r2 <= r0) goto L_0x002e
            r0 = 0
            if (r4 != 0) goto L_0x0030
        L_0x002e:
            r0 = 8
        L_0x0030:
            r1.setVisibility(r0)
            X.E30 r6 = r8.A02
            android.content.Context r1 = r6.requireContext()
            r0 = 2131231444(0x7f0802d4, float:1.807897E38)
            if (r4 == 0) goto L_0x0041
            r0 = 2131231443(0x7f0802d3, float:1.8078967E38)
        L_0x0041:
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
            if (r0 == 0) goto L_0x00b1
            r3.setBackground(r0)
            android.view.ViewGroup r3 = r6.A01
            if (r3 == 0) goto L_0x00b0
            int r1 = r3.getChildCount()
            r0 = 3
            if (r1 < r0) goto L_0x00b0
            r0 = 2
            android.view.View r0 = r3.getChildAt(r0)
            r5 = 2131437337(0x7f0b2719, float:1.849657E38)
            android.view.View r0 = X.AnonymousClass7TE.A0b(r0, r5)
            android.widget.EditText r0 = (android.widget.EditText) r0
            boolean r4 = X.FC0.A02(r0)
            int r0 = r3.getChildCount()
            r2 = 4
            if (r0 >= r2) goto L_0x007c
            if (r4 != 0) goto L_0x007c
            int r1 = r3.getChildCount()
            r0 = 0
            com.instagram.common.ui.base.IgLinearLayout r0 = X.E30.A00(r6, r0, r1, r7)
            r3.addView(r0)
        L_0x007c:
            int r0 = r3.getChildCount()
            if (r0 != r2) goto L_0x00b0
            if (r4 == 0) goto L_0x00b0
            int r0 = r3.getChildCount()
            int r0 = r0 + -1
            android.view.View r0 = r3.getChildAt(r0)
            android.view.View r0 = X.AnonymousClass7TE.A0b(r0, r5)
            android.widget.EditText r0 = (android.widget.EditText) r0
            boolean r0 = X.FC0.A02(r0)
            if (r0 == 0) goto L_0x00b0
            int r0 = r3.getChildCount()
            int r0 = r0 + -1
            r3.removeViewAt(r0)
            int r0 = r3.getChildCount()
            int r0 = r0 + -1
            android.view.View r0 = r3.getChildAt(r0)
            r0.requestFocus()
        L_0x00b0:
            return
        L_0x00b1:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ET1.afterTextChanged(android.text.Editable):void");
    }
}
