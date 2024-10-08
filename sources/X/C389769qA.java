package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import com.instagram.android.R;
import com.instagram.user.model.User;

/* renamed from: X.9qA  reason: invalid class name and case insensitive filesystem */
public final class C389769qA extends AnonymousClass9WS {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final RectF A07;
    public final RectF A08;
    public final U1N A09;
    public final C306386Ly A0A;
    public final C306386Ly A0B;
    public final int A0C;

    public final int getIntrinsicHeight() {
        return this.A03;
    }

    public final int getIntrinsicWidth() {
        return this.A0C;
    }

    public final void setAlpha(int i) {
        this.A0A.setAlpha(i);
        this.A0B.setAlpha(i);
        this.A00.setAlpha(i);
        this.A09.setAlpha(i);
    }

    public C389769qA(Context context, User user, String str, int i) {
        String str2;
        this.A0C = i;
        Resources resources = context.getResources();
        this.A04 = AnonymousClass7TE.A0B(resources);
        this.A05 = AnonymousClass7TE.A0F(resources);
        this.A06 = resources.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
        this.A02 = resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
        this.A00 = resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
        this.A01 = resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width);
        U1N u1n = new U1N(context);
        if (user != null) {
            u1n.A00(user.Bh3());
        }
        u1n.A01 = AnonymousClass7TE.A01(resources, R.dimen.action_sheet_divider_margin_top);
        u1n.invalidateSelf();
        int i2 = this.A01;
        u1n.setBounds(0, 0, i2, i2);
        this.A09 = u1n;
        Paint paint = this.A00;
        AnonymousClass7TE.A1Q(paint);
        AnonymousClass7TE.A1N(context, paint, 2Yu.A0H(context, R.attr.igds_color_media_background));
        int i3 = ((i - (this.A04 * 2)) - this.A01) - this.A00;
        C306386Ly A0s = AnonymousClass7TE.A0s(context, i3);
        AnonymousClass7TF.A11(resources, A0s, R.dimen.account_group_management_row_text_size);
        A0s.A0M(str);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        A0s.A0K(alignment);
        AnonymousClass7TE.A1O(context, A0s, 2Yu.A0A(context));
        ABM.A00(context, A0s);
        this.A0A = A0s;
        if (user != null) {
            str2 = user.getUsername();
        } else {
            str2 = "";
        }
        C306386Ly A0s2 = AnonymousClass7TE.A0s(context, i3);
        AnonymousClass7TF.A11(resources, A0s2, R.dimen.add_payment_bottom_sheet_row_subtitle_size);
        A0s2.A0M(str2);
        A0s2.A0K(alignment);
        AnonymousClass7TG.A0y(context, A0s2, R.attr.igds_color_creation_tools_grey_05);
        AnonymousClass7TG.A1N(context, A0s2);
        AnonymousClass7TE.A1X(0qm.A12, AnonymousClass0qo.A00(context), A0s2);
        this.A0B = A0s2;
        int max = Math.max(this.A01, A0s2.A06 + this.A0A.A06) + (this.A04 * 2);
        this.A03 = max;
        float f = (float) i;
        this.A08 = new RectF(0.0f, 0.0f, f, (float) max);
        this.A07 = new RectF(0.0f, (float) this.A02, f, (float) this.A03);
    }

    public final void draw(Canvas canvas) {
        Rect A0L = AnonymousClass7TG.A0L(this, canvas);
        canvas.save();
        AnonymousClass7TF.A13(canvas, A0L);
        RectF rectF = this.A08;
        float f = (float) this.A02;
        Paint paint = this.A00;
        canvas.drawRoundRect(rectF, f, f, paint);
        canvas.drawRect(this.A07, paint);
        canvas.save();
        float f2 = (float) this.A04;
        canvas.translate(f2, f2);
        this.A09.draw(canvas);
        canvas.restore();
        canvas.translate(f2 + ((float) this.A01) + ((float) this.A00), (float) this.A05);
        C306386Ly r0 = this.A0A;
        r0.draw(canvas);
        canvas.translate(0.0f, ((float) r0.A06) + ((float) this.A06));
        this.A0B.draw(canvas);
        canvas.restore();
    }
}
