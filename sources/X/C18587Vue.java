package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.Vue  reason: case insensitive filesystem */
public final class C18587Vue {
    public boolean A00 = true;
    public final int A01;
    public final int A02;
    public final Drawable A03;
    public final TransitionDrawable A04;
    public final View A05;
    public final ImageView A06;
    public final TextView A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final Drawable A0B;
    public final Drawable A0C;
    public final Drawable A0D;
    public final Drawable A0E;
    public final Drawable A0F;

    public final void A01(boolean z, boolean z2) {
        Drawable drawable;
        Drawable drawable2;
        int i;
        if (z) {
            if (z2) {
                drawable2 = this.A0D;
            } else {
                drawable2 = this.A0E;
            }
            this.A05.setBackground(this.A0B);
            this.A07.setTextColor(this.A02);
        } else {
            if (z2) {
                drawable = this.A03;
            } else {
                drawable = this.A0F;
            }
            View view = this.A05;
            view.setBackground(this.A0C);
            this.A07.setTextColor(this.A09);
            view.setAlpha(0.5f);
        }
        Drawable drawable3 = this.A0B;
        if (z2) {
            i = this.A08;
        } else {
            i = this.A0A;
        }
        A00(drawable3, i);
        this.A06.setBackground(drawable2);
        this.A00 = false;
    }

    public C18587Vue(View view, C21026XAf xAf, C265934Ww r13, int[] iArr, int i) {
        Context context = view.getContext();
        this.A05 = view;
        this.A01 = i;
        TextView A0G = DbU.A0G(view, R.id.quiz_sticker_answer_text);
        this.A07 = A0G;
        ImageView A0F2 = DbU.A0F(view, R.id.quiz_sticker_answer_icon);
        this.A06 = A0F2;
        Drawable drawable = context.getDrawable(R.drawable.instagram_circle_check_pano_filled_24);
        this.A0D = drawable;
        Drawable drawable2 = context.getDrawable(R.drawable.instagram_circle_x_pano_filled_24);
        this.A0E = drawable2;
        Drawable drawable3 = context.getDrawable(R.drawable.instagram_circle_check_pano_outline_24);
        this.A03 = drawable3;
        Drawable drawable4 = context.getDrawable(R.drawable.instagram_circle_x_pano_outline_24);
        this.A0F = drawable4;
        this.A04 = (TransitionDrawable) context.getDrawable(R.drawable.quiz_sticker_answer_row_background_refreshed);
        Drawable drawable5 = context.getDrawable(R.drawable.quiz_sticker_answer_row_background_unselected);
        this.A0C = drawable5;
        this.A0B = context.getDrawable(R.drawable.quiz_sticker_answer_row_background_selected_refreshed).mutate();
        int color = context.getColor(R.color.countdown_sticker_title_text_color);
        this.A09 = color;
        int A092 = AnonymousClass7TE.A09(context);
        this.A02 = A092;
        A00(drawable, A092);
        A00(drawable2, A092);
        int A032 = AnonymousClass7TF.A03(context, R.attr.igds_color_creation_tools_green);
        this.A08 = A032;
        int A033 = AnonymousClass7TF.A03(context, R.attr.igds_color_creation_tools_scarlet);
        this.A0A = A033;
        A00(drawable3, A032);
        A00(drawable4, A033);
        WBD.A00(this.A05, 32, r13, this);
        A0G.setText(xAf.getText());
        A0G.setTextColor(color);
        view.setBackground(drawable5);
        view.setAlpha(1.0f);
        C15834UjK ujK = new C15834UjK(context, context.getResources().getStringArray(R.array.quiz_sticker_answer_row_options)[i]);
        ujK.A08(iArr, iArr);
        A0F2.setBackground(ujK);
    }

    public static void A00(Drawable drawable, int i) {
        AnonymousClass7TE.A1R(drawable.mutate(), i);
    }
}
