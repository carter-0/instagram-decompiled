package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.Q9o  reason: case insensitive filesystem */
public final class C7377Q9o extends LinearLayout {
    public View.OnClickListener A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C7377Q9o(android.content.Context r16, X.C13857Tic r17, com.facebook.smartcapture.ui.SelfieCaptureUi r18, boolean r19) {
        /*
            r15 = this;
            r5 = r15
            r6 = r16
            r15.<init>(r6)
            r4 = 1
            r15.setOrientation(r4)
            r0 = 2130970977(0x7f040961, float:1.755068E38)
            int r3 = X.C11408SSf.A01(r6, r0)
            r0 = 2131165207(0x7f070017, float:1.7944625E38)
            float r2 = X.DbU.A00(r6, r0)
            float r1 = X.DbU.A00(r6, r0)
            r0 = 0
            android.graphics.drawable.GradientDrawable r0 = X.C9572RdC.A00(r2, r1, r0, r0, r3)
            r15.setBackground(r0)
            r1 = r18
            if (r18 == 0) goto L_0x0036
            boolean r0 = r1 instanceof com.facebook.smartcapture.ui.ig.XMDSIgSelfieCaptureUi
            android.view.LayoutInflater r2 = X.DbV.A0D(r15)
            if (r0 == 0) goto L_0x00f9
            r0 = 2131629893(0x7f0e1745, float:1.888712E38)
        L_0x0033:
            r2.inflate(r0, r15, r4)
        L_0x0036:
            X.SbD r0 = X.C11490SbD.A00
            r15.setOnClickListener(r0)
            r0 = 2131443836(0x7f0b407c, float:1.8509751E38)
            android.view.View r4 = X.SKW.A00(r15, r0)
            r0 = 2130970978(0x7f040962, float:1.7550681E38)
            int r3 = X.C11408SSf.A01(r6, r0)
            float r2 = X.Pxj.A06(r6)
            r0 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r0
            android.graphics.drawable.GradientDrawable r0 = X.C9572RdC.A00(r2, r2, r2, r2, r3)
            r4.setBackground(r0)
            r0 = 2131435085(0x7f0b1e4d, float:1.8492002E38)
            android.widget.ImageView r4 = X.SKW.A01(r15, r0)
            r0 = 2130970979(0x7f040963, float:1.7550683E38)
            int r0 = X.C11408SSf.A01(r6, r0)
            r4.setColorFilter(r0)
            r3 = r17
            if (r17 == 0) goto L_0x0073
            android.graphics.drawable.Drawable r0 = r3.Asy(r6)
            r4.setImageDrawable(r0)
        L_0x0073:
            r2 = 60
            X.SbK r0 = new X.SbK
            r0.<init>(r15, r2)
            r4.setOnClickListener(r0)
            r0 = 2131443279(0x7f0b3e4f, float:1.8508622E38)
            android.widget.TextView r0 = X.SKW.A02(r15, r0)
            r2 = 2130970980(0x7f040964, float:1.7550685E38)
            X.C11408SSf.A04(r6, r0, r2)
            r0 = 2131443278(0x7f0b3e4e, float:1.850862E38)
            android.widget.TextView r0 = X.SKW.A02(r15, r0)
            X.C11408SSf.A04(r6, r0, r2)
            r8 = 2131433888(0x7f0b19a0, float:1.8489574E38)
            r11 = 0
            if (r17 == 0) goto L_0x00f7
            android.graphics.drawable.Drawable r7 = r3.B3U(r6)
        L_0x009e:
            r9 = 2131951811(0x7f1300c3, float:1.9540047E38)
            r10 = 2131951806(0x7f1300be, float:1.9540037E38)
            r5.A00(r6, r7, r8, r9, r10)
            r12 = 2131433889(0x7f0b19a1, float:1.8489576E38)
            if (r17 == 0) goto L_0x00b0
            android.graphics.drawable.Drawable r11 = r3.AcU(r6)
        L_0x00b0:
            r13 = 2131951813(0x7f1300c5, float:1.9540051E38)
            r14 = 2131951807(0x7f1300bf, float:1.9540039E38)
            r9 = r15
            r10 = r6
            r9.A00(r10, r11, r12, r13, r14)
            if (r18 == 0) goto L_0x00f6
            r0 = 2131435617(0x7f0b2061, float:1.8493081E38)
            android.view.View r4 = X.SKW.A00(r15, r0)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            boolean r3 = r1 instanceof com.facebook.smartcapture.ui.ig.XMDSIgSelfieCaptureUi
            if (r3 != 0) goto L_0x00de
            r2 = 0
            X.0qQ.A0B(r4, r2)
            android.view.LayoutInflater r1 = X.DbV.A0D(r4)
            r0 = 2131626035(0x7f0e0833, float:1.8879295E38)
            android.view.View r0 = r1.inflate(r0, r4, r2)
            if (r0 == 0) goto L_0x00de
            r4.addView(r0, r2)
        L_0x00de:
            if (r3 != 0) goto L_0x00f6
            r2 = 0
            X.0qQ.A0B(r4, r2)
            android.view.LayoutInflater r1 = X.DbV.A0D(r4)
            r0 = 2131626034(0x7f0e0832, float:1.8879293E38)
            android.view.View r0 = r1.inflate(r0, r4, r2)
            if (r0 == 0) goto L_0x00f6
            if (r19 != 0) goto L_0x00f6
            r4.addView(r0)
        L_0x00f6:
            return
        L_0x00f7:
            r7 = r11
            goto L_0x009e
        L_0x00f9:
            r0 = 2131629346(0x7f0e1522, float:1.888601E38)
            goto L_0x0033
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7377Q9o.<init>(android.content.Context, X.Tic, com.facebook.smartcapture.ui.SelfieCaptureUi, boolean):void");
    }

    public final void setOnCloseClickListener(View.OnClickListener onClickListener) {
        this.A00 = onClickListener;
    }

    private final void A00(Context context, Drawable drawable, int i, int i2, int i3) {
        View A002 = SKW.A00(this, i);
        ImageView A01 = SKW.A01(A002, R.id.iv_item_icon);
        A01.setColorFilter(C11408SSf.A01(context, R.attr.selfie_help_icons_color));
        int A012 = C11408SSf.A01(context, R.attr.selfie_help_icons_background);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(A012);
        A01.setBackground(gradientDrawable);
        A01.setImageDrawable(drawable);
        TextView A02 = SKW.A02(A002, R.id.tv_item_title);
        A02.setText(i2);
        Context A0S = AnonymousClass7TE.A0S(this);
        C11408SSf.A04(A0S, A02, R.attr.sc_popover_primary_text);
        TextView A022 = SKW.A02(A002, R.id.tv_item_subtitle);
        A022.setText(i3);
        C11408SSf.A04(A0S, A022, R.attr.sc_popover_secondary_text);
    }
}
