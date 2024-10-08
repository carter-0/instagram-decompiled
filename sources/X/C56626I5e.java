package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.I5e  reason: case insensitive filesystem */
public final class C56626I5e {
    public final Context A00;
    public final View A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;
    public final TextView A05;
    public final C59548JNu A06;
    public final String A07;
    public final String A08;
    public final GradientDrawable A09;
    public final View A0A;
    public final View A0B;

    public C56626I5e(View view, C59548JNu jNu, String str, String str2) {
        Object obj;
        0qQ.A0B(view, 1);
        this.A01 = view;
        this.A08 = str;
        this.A07 = str2;
        this.A06 = jNu;
        this.A00 = view.getContext();
        View A0b = AnonymousClass7TE.A0b(view, R.id.option_row);
        this.A0B = A0b;
        View A0b2 = AnonymousClass7TE.A0b(view, R.id.option_row_filled);
        this.A0A = A0b2;
        this.A03 = DbW.A0B(A0b, R.id.option_row_text);
        this.A02 = DbW.A0B(A0b2, R.id.option_row_text_filled);
        TextView A0B2 = DbW.A0B(A0b, R.id.option_row_vote_percentage);
        this.A05 = A0B2;
        TextView A0B3 = DbW.A0B(A0b2, R.id.option_row_vote_percentage_filled);
        this.A04 = A0B3;
        Drawable background = A0b2.getBackground();
        GradientDrawable gradientDrawable = null;
        if (background != null) {
            obj = background.mutate();
        } else {
            obj = null;
        }
        this.A09 = obj instanceof GradientDrawable ? (GradientDrawable) obj : gradientDrawable;
        A0B3.setAlpha(0.0f);
        A0B2.setAlpha(0.0f);
    }

    public final void A03(int i) {
        TextView textView = this.A05;
        Context context = this.A00;
        DbY.A12(textView, context);
        DbT.A17(context, this.A04, 2Yu.A0C(context));
        DbY.A12(this.A03, context);
        DbT.A17(context, this.A02, 2Yu.A0C(context));
        A00(1.0f, 0.0f, true);
        View view = this.A01;
        view.setEnabled(true);
        0nA.A0p(view, new C57940Iiv(this, (i * view.getWidth()) / 100, 0, C51968G9o.A04(context)));
    }

    public final void A04(int i) {
        A02(this, i, true);
        int A042 = C51968G9o.A04(this.A00);
        View view = this.A01;
        0nA.A0p(view, new C57940Iiv(this, 0, (i * view.getWidth()) / 100, A042));
    }

    private final void A00(float f, float f2, boolean z) {
        TextView textView = this.A04;
        if (z) {
            textView.setAlpha(f);
            0qQ.A07(textView.animate().setDuration(350).alpha(f2));
            TextView textView2 = this.A05;
            textView2.setAlpha(f);
            0qQ.A07(textView2.animate().setDuration(350).alpha(f2));
            return;
        }
        textView.setAlpha(1.0f);
        this.A05.setAlpha(1.0f);
    }

    public static final void A01(C56626I5e i5e, int i, int i2) {
        GradientDrawable gradientDrawable = i5e.A09;
        if (gradientDrawable != null) {
            gradientDrawable.setColors(new int[]{i2, i2});
        }
        i5e.A0A.setClipBounds(new Rect(0, 0, i, i5e.A01.getHeight()));
    }

    public static final void A02(C56626I5e i5e, int i, boolean z) {
        TextView textView = i5e.A05;
        Integer valueOf = Integer.valueOf(i);
        textView.setText(0mp.A06("%d%%", new Object[]{valueOf}));
        Context context = i5e.A00;
        DbY.A12(textView, context);
        TextView textView2 = i5e.A04;
        textView2.setText(0mp.A06("%d%%", new Object[]{valueOf}));
        DbT.A17(context, textView2, 2Yu.A0C(context));
        DbY.A12(i5e.A03, context);
        DbT.A17(context, i5e.A02, 2Yu.A0C(context));
        i5e.A00(0.0f, 1.0f, z);
        i5e.A01.setEnabled(false);
    }
}
