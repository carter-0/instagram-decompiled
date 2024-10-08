package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.Uo2  reason: case insensitive filesystem */
public final class C16075Uo2 extends AnonymousClass52D {
    public final ValueAnimator.AnimatorUpdateListener A00 = new W4Q((Object) this, 15);
    public final View A01;
    public final IgTextView A02;
    public final IgTextView A03;
    public final AnonymousClass529 A04;
    public final IgdsButton A05;
    public final IgdsButton A06;

    public final void A02(String str, View.OnClickListener onClickListener) {
        if (str == null || str.length() == 0 || onClickListener == null) {
            this.A05.setVisibility(8);
            return;
        }
        IgdsButton igdsButton = this.A05;
        igdsButton.setText(str);
        AnonymousClass0fU.A00(onClickListener, igdsButton);
        igdsButton.setVisibility(0);
    }

    public final void A03(String str, View.OnClickListener onClickListener) {
        if (str == null || str.length() == 0 || onClickListener == null) {
            this.A06.setVisibility(8);
            return;
        }
        IgdsButton igdsButton = this.A06;
        igdsButton.setText(str);
        AnonymousClass0fU.A00(onClickListener, igdsButton);
        igdsButton.setVisibility(0);
    }

    public final void A00(1sU r5) {
        View view = this.A01;
        Context context = view.getContext();
        1UQ r2 = r5.A00;
        Resources resources = context.getResources();
        int i = R.dimen.action_button_settings_height;
        if (r2 != null) {
            i = R.dimen.abc_select_dialog_padding_start_material;
        }
        float dimension = resources.getDimension(i);
        ViewGroup.MarginLayoutParams A0H = DbX.A0H(view);
        A0H.bottomMargin = (int) dimension;
        view.setLayoutParams(A0H);
    }

    public final void A01(AnonymousClass523 r3) {
        AnonymousClass523 r0 = this.A00;
        if (r0 != null) {
            r0.A05.removeUpdateListener(this.A00);
        }
        this.A00 = r3;
        ((AnonymousClass528) this.A04).A00(r3.A00);
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
            com.instagram.common.ui.base.IgTextView r3 = r4.A03
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
            com.instagram.common.ui.base.IgTextView r1 = r4.A02
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
        throw new UnsupportedOperationException("Method not decompiled: X.C16075Uo2.A04(java.lang.String, java.lang.String):void");
    }

    public C16075Uo2(View view, IgTextView igTextView, IgTextView igTextView2, AnonymousClass529 r6, IgdsButton igdsButton, IgdsButton igdsButton2) {
        AnonymousClass7TG.A1U(r6, igTextView, igTextView2);
        AnonymousClass7TG.A1S(igdsButton, igdsButton2);
        this.A04 = r6;
        this.A03 = igTextView;
        this.A02 = igTextView2;
        this.A01 = view;
        this.A05 = igdsButton;
        this.A06 = igdsButton2;
    }
}
