package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.9pz  reason: invalid class name and case insensitive filesystem */
public final class C389659pz extends C299875vz implements C268714ds, C3724991d {
    public final C387309m0 A00;
    public final C306386Ly A01;
    public final Context A02;
    public final UserSession A03;
    public final AnonymousClass6M4 A04;
    public final List A05;

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        this.A01.draw(canvas);
    }

    public C389659pz(Context context, UserSession userSession, C387309m0 r20) {
        this.A00 = r20;
        Context context2 = context;
        this.A02 = context2;
        this.A03 = userSession;
        Resources resources = context2.getResources();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(resources.getString(2131968686));
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material);
        int A0A = AnonymousClass7TE.A0A(context2);
        AnonymousClass7TG.A18(spannableStringBuilder, new C379489Uc(A0A, AnonymousClass7TE.A0C(resources), dimensionPixelSize, false, dimensionPixelSize2, dimensionPixelSize2), AnonymousClass7TF.A03(context2, R.attr.igds_color_gradient_blue));
        int A0H = 2Yu.A0H(context2, R.attr.igds_color_gradient_blue);
        Paint paint = AnonymousClass3JT.A00;
        Drawable A052 = AnonymousClass3JT.A05(context2, R.drawable.instagram_alert_pano_filled_24, context2.getColor(A0H));
        C263324Kh.A01(resources, A052, R.dimen.abc_dialog_padding_material);
        C263324Kh.A03(A052, spannableStringBuilder, AnonymousClass05K.A00, 0, 0, resources.getDimensionPixelSize(R.dimen.accent_edge_thickness));
        Spannable spannable = C306386Ly.A0d;
        C306386Ly A0s = AnonymousClass7TE.A0s(context2, resources.getDimensionPixelSize(R.dimen.clips_grid_page_thumbnail_height_vertical));
        A0s.A0L(spannableStringBuilder);
        AJB.A08(context2, A0s, AnonymousClass7TE.A01(resources, R.dimen.mk_title_font_size), (float) dimensionPixelSize, (float) dimensionPixelSize2);
        this.A01 = A0s;
        AnonymousClass6M4 A0A2 = AnonymousClass7TH.A0A(context2, this);
        this.A04 = A0A2;
        this.A05 = 0sr.A1P(new Drawable[]{A0s, A0A2});
    }

    public final List A07() {
        return this.A05;
    }

    public final C2802350v BzV() {
        return this.A00;
    }

    public final void Dre(int i, int i2) {
        C387309m0 r1 = this.A00;
        r1.A01 = (float) i;
        r1.A00 = (float) i2;
    }

    public final int getIntrinsicHeight() {
        return this.A01.A06;
    }

    public final int getIntrinsicWidth() {
        return this.A01.A0A;
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float f = ((float) (i + i3)) / 2.0f;
        float f2 = ((float) (i2 + i4)) / 2.0f;
        C306386Ly r4 = this.A01;
        float f3 = ((float) r4.A0A) / 2.0f;
        float f4 = ((float) r4.A06) / 2.0f;
        r4.setBounds((int) (f - f3), (int) (f2 - f4), (int) (f + f3), (int) (f2 + f4));
    }
}
