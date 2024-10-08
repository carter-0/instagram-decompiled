package X;

import android.animation.ValueAnimator;
import android.view.View;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.Uo1  reason: case insensitive filesystem */
public final class C16074Uo1 extends AnonymousClass52D {
    public final ValueAnimator.AnimatorUpdateListener A00 = new W4Q((Object) this, 16);
    public final IgTextView A01;
    public final IgTextView A02;
    public final AnonymousClass529 A03;
    public final IgdsButton A04;
    public final IgdsButton A05;

    public final void A00(1sU r1) {
    }

    public final void A02(String str, View.OnClickListener onClickListener) {
        if (str == null || str.length() == 0 || onClickListener == null) {
            this.A04.setVisibility(8);
            return;
        }
        IgdsButton igdsButton = this.A04;
        igdsButton.setText(str);
        AnonymousClass0fU.A00(onClickListener, igdsButton);
        igdsButton.setVisibility(0);
    }

    public final void A03(String str, View.OnClickListener onClickListener) {
        if (str == null || str.length() == 0 || onClickListener == null) {
            this.A05.setVisibility(8);
            return;
        }
        IgdsButton igdsButton = this.A05;
        igdsButton.setText(str);
        AnonymousClass0fU.A00(onClickListener, igdsButton);
        igdsButton.setVisibility(0);
    }

    public final void A01(AnonymousClass523 r3) {
        AnonymousClass523 r0 = this.A00;
        if (r0 != null) {
            r0.A05.removeUpdateListener(this.A00);
        }
        this.A00 = r3;
        ((AnonymousClass528) this.A03).A00(r3.A00);
        AnonymousClass523 r02 = this.A00;
        if (r02 != null) {
            r02.A05.addUpdateListener(this.A00);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r5.length() == 0) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            com.instagram.common.ui.base.IgTextView r3 = r4.A02
            r3.setText(r5)
            r2 = 0
            if (r5 == 0) goto L_0x000f
            int r1 = r5.length()
            r0 = 0
            if (r1 != 0) goto L_0x0011
        L_0x000f:
            r0 = 8
        L_0x0011:
            r3.setVisibility(r0)
            com.instagram.common.ui.base.IgTextView r1 = r4.A01
            r1.setText(r6)
            if (r6 == 0) goto L_0x0021
            int r0 = r6.length()
            if (r0 != 0) goto L_0x0023
        L_0x0021:
            r2 = 8
        L_0x0023:
            r1.setVisibility(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16074Uo1.A04(java.lang.String, java.lang.String):void");
    }

    public C16074Uo1(IgTextView igTextView, IgTextView igTextView2, AnonymousClass529 r5, IgdsButton igdsButton, IgdsButton igdsButton2) {
        C51974G9v.A1P(r5, igTextView, igTextView2, igdsButton);
        0qQ.A0B(igdsButton2, 5);
        this.A03 = r5;
        this.A02 = igTextView;
        this.A01 = igTextView2;
        this.A04 = igdsButton;
        this.A05 = igdsButton2;
    }
}
