package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.HrI  reason: case insensitive filesystem */
public final class C56010HrI {
    public boolean A00;
    public Integer A01;
    public final int A02;
    public final View A03;
    public final LinearLayout A04;
    public final TextView A05;
    public final TextView A06;
    public final TextView A07;
    public final TextView A08;
    public final Context A09;
    public final TextView A0A;
    public final TextView A0B;
    public final C265874Wq A0C;
    public final Integer A0D;

    public C56010HrI(View view, C272014jx r16, C265874Wq r17, Integer num, Integer num2, int i, int i2) {
        0qQ.A0B(view, 1);
        this.A03 = view;
        this.A02 = i;
        C265874Wq r7 = r17;
        this.A0C = r7;
        this.A0D = num;
        this.A01 = num2;
        Context A0S = AnonymousClass7TE.A0S(view);
        this.A09 = A0S;
        TextView A0R = AnonymousClass7TG.A0R(view, R.id.poll_v2_sticker_answer_text);
        this.A0A = A0R;
        TextView A0R2 = AnonymousClass7TG.A0R(view, R.id.poll_v2_sticker_answer_text_white);
        this.A0B = A0R2;
        TextView A0R3 = AnonymousClass7TG.A0R(view, R.id.poll_v2_sticker_result_percentage);
        this.A07 = A0R3;
        TextView A0R4 = AnonymousClass7TG.A0R(view, R.id.poll_v2_sticker_result_percentage_white);
        this.A08 = A0R4;
        TextView A0R5 = AnonymousClass7TG.A0R(view, R.id.poll_v2_sticker_result_percentage_sign);
        this.A05 = A0R5;
        TextView A0R6 = AnonymousClass7TG.A0R(view, R.id.poll_v2_sticker_result_percentage_sign_white);
        this.A06 = A0R6;
        LinearLayout linearLayout = (LinearLayout) AnonymousClass7TF.A0F(view, R.id.white_text_layout);
        this.A04 = linearLayout;
        int color = A0S.getColor(R.color.poll_v2_sticker_option_text);
        int color2 = A0S.getColor(R.color.poll_v2_sticker_option_text_white);
        A0R.setText(r16.getText());
        A0R.setTextColor(color);
        A0R2.setText(r16.getText());
        A0R2.setTextColor(color2);
        A0R3.setTextColor(color);
        A0R4.setTextColor(color2);
        A0R5.setTextColor(color);
        A0R6.setTextColor(color2);
        C306466Mg.A00(A0R3);
        C306466Mg.A00(A0R4);
        C306466Mg.A00(A0R5);
        C306466Mg.A00(A0R6);
        C51969G9p.A12(PorterDuff.Mode.SRC_IN, linearLayout.getBackground().mutate(), A0S.getColor(i2));
        Integer num3 = this.A01;
        if (num3 == null) {
            num3 = C51967G9n.A0k();
            this.A01 = num3;
        }
        0nA.A0p(this.A03, new C57852IhV(this, num3.intValue()));
        float f = num == null ? 0.0f : 1.0f;
        A0R3.setAlpha(f);
        A0R4.setAlpha(f);
        A0R5.setAlpha(f);
        A0R6.setAlpha(f);
        if (r17 != null) {
            ID2.A02(this.A03, 40, r7, this);
        }
        this.A00 = true;
    }

    public final void A00(int i, Runnable runnable) {
        TextView textView = this.A07;
        Integer valueOf = Integer.valueOf(i);
        textView.setText(0mp.A06("%d", new Object[]{valueOf}));
        TextView textView2 = this.A08;
        textView2.setText(0mp.A06("%d", new Object[]{valueOf}));
        TextView textView3 = this.A05;
        textView3.setText(0mp.A06("%%", new Object[0]));
        TextView textView4 = this.A06;
        textView4.setText(0mp.A06("%%", new Object[0]));
        if (this.A0D == null) {
            textView2.animate().setDuration(350).alpha(1.0f);
            textView4.animate().setDuration(350).alpha(1.0f);
            textView.animate().setDuration(350).alpha(1.0f);
            textView3.animate().setDuration(350).alpha(1.0f);
            0nA.A0p(this.A03, new C57914IiV(this, runnable, i));
        }
        this.A00 = false;
    }
}
