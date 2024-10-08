package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.9Wf  reason: invalid class name and case insensitive filesystem */
public final class C380019Wf extends Drawable {
    public float A00;
    public float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final Context A0A;
    public final Drawable A0B;
    public final Drawable A0C;
    public final UserSession A0D;
    public final C306386Ly A0E;

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        float f = this.A00 + ((float) this.A07);
        float f2 = (float) (this.A05 / 2);
        float f3 = f - f2;
        float f4 = (this.A01 + ((float) this.A08)) - f2;
        canvas.save();
        canvas.translate(f3, f4);
        C306386Ly r6 = this.A0E;
        r6.setBounds(0, 0, this.A09, this.A06);
        AnonymousClass7TF.A14(canvas, r6);
        int i = this.A04;
        float f5 = (float) i;
        canvas.translate((((float) r6.A0A) + f3) - (0.6f * f5), f4 - (f5 / 4.0f));
        Drawable drawable = this.A0C;
        drawable.setBounds(0, 0, i, i);
        AnonymousClass7TF.A14(canvas, drawable);
        canvas.translate(f3 - (f5 / 3.0f), (f4 + ((float) r6.A06)) - (f5 * 0.85f));
        Drawable drawable2 = this.A0B;
        drawable2.setBounds(0, 0, i, i);
        drawable2.draw(canvas);
        canvas.restore();
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        this.A00 = (((float) (i + i3)) / 2.0f) - (((float) this.A03) / 2.0f);
        this.A01 = (((float) (i2 + i4)) / 2.0f) - (((float) this.A02) / 2.0f);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final int getIntrinsicHeight() {
        return this.A02;
    }

    public final int getIntrinsicWidth() {
        return this.A03;
    }

    public C380019Wf(Context context, UserSession userSession, int i) {
        UserSession userSession2 = userSession;
        this.A0D = userSession2;
        Context context2 = context;
        this.A0A = context2;
        this.A03 = context2.getResources().getDimensionPixelSize(R.dimen.bottom_button_layout_height_with_secondary);
        this.A02 = AnonymousClass7TF.A02(context2, R.dimen.bottom_button_layout_height_with_secondary);
        this.A07 = context2.getResources().getDimensionPixelSize(R.dimen.ad4ad_button_bottom_margin);
        this.A08 = context2.getResources().getDimensionPixelSize(R.dimen.account_group_management_clickable_width);
        this.A09 = context2.getResources().getDimensionPixelSize(R.dimen.abc_list_item_height_large_material);
        this.A06 = context2.getResources().getDimensionPixelSize(R.dimen.album_preview_add_item_margin);
        this.A04 = context2.getResources().getDimensionPixelSize(R.dimen.abc_dialog_padding_material);
        int A052 = AnonymousClass7TG.A05(context2);
        this.A05 = A052;
        int dimensionPixelSize = context2.getResources().getDimensionPixelSize(R.dimen.backup_codes_text_size);
        Drawable A002 = AnonymousClass2dd.A00(context2.getResources(), R.drawable.valentines_heart_left);
        0qQ.A07(A002);
        this.A0B = A002;
        Drawable A003 = AnonymousClass2dd.A00(context2.getResources(), R.drawable.valentines_heart_right);
        0qQ.A07(A003);
        this.A0C = A003;
        C306386Ly A0s = AnonymousClass7TE.A0s(context2, i);
        this.A0E = A0s;
        A0s.A0M(02K.A01(context2).getString(2131966140));
        float f = (float) A052;
        AJB.A05(context2, userSession2, A0s, (float) dimensionPixelSize, f, f);
        Spannable spannable = A0s.A0F;
        0qQ.A07(spannable);
        Resources A0A2 = AnonymousClass7TF.A0A(context2);
        int color = context2.getColor(R.color.pink_0);
        AnonymousClass7TG.A18(spannable, new C379489Uc(color, AnonymousClass7TE.A0C(A0A2), A052, false, A052, A052), context2.getColor(R.color.pink_6));
        if (A002 instanceof C262364Dk) {
            ((C262364Dk) A002).A01(new AZK(this, 4));
        }
        if (A003 instanceof C262364Dk) {
            ((C262364Dk) A003).A01(new AZK(this, 5));
        }
    }
}
