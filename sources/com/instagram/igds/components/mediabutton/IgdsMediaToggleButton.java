package com.instagram.igds.components.mediabutton;

import X.0qQ;
import X.2Yu;
import X.C13988Tno;
import X.C16608Uy4;
import X.C296235pj;
import X.C296245pk;
import X.C296255pl;
import X.C296265pm;
import X.C51974G9v;
import X.Dba;
import X.JTT;
import X.WBG;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class IgdsMediaToggleButton extends IgdsMediaButton {
    public C16608Uy4 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002a, code lost:
        if (r2 != 3) goto L_0x002c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036 A[Catch:{ all -> 0x003e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public IgdsMediaToggleButton(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            r5 = 1
            X.0qQ.A0B(r7, r5)
            r6.<init>(r7, r8, r9)
            X.Uy4 r4 = X.C16608Uy4.A05
            r6.A00 = r4
            if (r8 == 0) goto L_0x0046
            android.content.res.Resources$Theme r2 = r7.getTheme()
            int[] r1 = X.C71382cm.A1X
            r0 = 0
            android.content.res.TypedArray r3 = r2.obtainStyledAttributes(r8, r1, r9, r0)
            int r2 = r3.getInt(r0, r0)     // Catch:{ all -> 0x003e }
            if (r2 == r0) goto L_0x002c
            X.Uy4 r1 = X.C16608Uy4.A06     // Catch:{ all -> 0x003e }
            if (r2 == r5) goto L_0x002d
            X.Uy4 r1 = X.C16608Uy4.A07     // Catch:{ all -> 0x003e }
            r0 = 2
            if (r2 == r0) goto L_0x002d
            X.Uy4 r1 = X.C16608Uy4.A08     // Catch:{ all -> 0x003e }
            r0 = 3
            if (r2 == r0) goto L_0x002d
        L_0x002c:
            r1 = r4
        L_0x002d:
            r6.A00 = r1     // Catch:{ all -> 0x003e }
            r0 = 6
            boolean r0 = r3.hasValue(r0)     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x0043
            java.lang.String r1 = "IgdsMediaToggleButton"
            java.lang.String r0 = "For media toggle buttons, please set mediaToggleButtonStyle instead of mediaButtonStyle attribute."
            X.0wb.A03(r1, r0)     // Catch:{ all -> 0x003e }
            goto L_0x0043
        L_0x003e:
            r0 = move-exception
            r3.recycle()
            throw r0
        L_0x0043:
            r3.recycle()
        L_0x0046:
            X.Uy4 r0 = r6.A00
            r6.setToggleButtonStyle(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igds.components.mediabutton.IgdsMediaToggleButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final void setToggleButtonStyle(C16608Uy4 uy4) {
        0qQ.A0B(uy4, 0);
        this.A00 = uy4;
        A00(uy4);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(new WBG(41, this, onClickListener));
    }

    private final void A00(C16608Uy4 uy4) {
        C296235pj r0;
        GradientDrawable gradientDrawable;
        if (!isSelected()) {
            r0 = uy4.A01;
        } else if (this.A00.A00 == 0) {
            Drawable background = getBackground();
            if ((background instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) background) != null) {
                gradientDrawable.setColor(C13988Tno.A08(getContext()));
            }
            A06();
            return;
        } else {
            r0 = uy4.A02;
        }
        setButtonStyle(r0);
    }

    public int getLabelColor() {
        if (isSelected()) {
            if (Dba.A1X(C16608Uy4.A05, this.A00.toString())) {
                Context context = getContext();
                return context.getColor(2Yu.A0A(context));
            }
        }
        return super.getLabelColor();
    }

    public void setSelected(boolean z) {
        super.setSelected(z);
        A00(this.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgdsMediaToggleButton(Context context, C16608Uy4 uy4, C296245pk r10, C296255pl r11) {
        super(context, uy4.A01, r10, r11, (C296265pm) null);
        C51974G9v.A1P(context, uy4, r10, r11);
        this.A00 = C16608Uy4.A05;
        setToggleButtonStyle(uy4);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgdsMediaToggleButton(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public /* synthetic */ IgdsMediaToggleButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgdsMediaToggleButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }
}
