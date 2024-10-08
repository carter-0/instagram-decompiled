package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import com.instagram.android.R;
import com.instagram.reels.question.model.QuestionResponseReshareModel;
import com.instagram.user.model.User;

/* renamed from: X.9qC  reason: invalid class name and case insensitive filesystem */
public final class C389789qC extends C369738vF {
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
    public final C389769qA A0A;
    public final C306386Ly A0B;
    public final C306386Ly A0C;
    public final int A0D;

    public final int getIntrinsicHeight() {
        return this.A03 + this.A0A.A03;
    }

    public final int getIntrinsicWidth() {
        return this.A0D;
    }

    public final void setAlpha(int i) {
        this.A0A.setAlpha(i);
        this.A0B.setAlpha(i);
        this.A09.setAlpha(i);
        this.A0C.setAlpha(i);
        this.A00.setAlpha(i);
        invalidateSelf();
    }

    public C389789qC(Context context, QuestionResponseReshareModel questionResponseReshareModel, int i) {
        super(questionResponseReshareModel);
        this.A0D = i;
        Resources resources = context.getResources();
        this.A04 = AnonymousClass7TE.A0B(resources);
        this.A02 = resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
        this.A05 = resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
        this.A06 = resources.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
        this.A00 = AnonymousClass7TE.A0F(resources);
        this.A01 = resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width);
        U1N u1n = new U1N(context);
        u1n.A01 = AnonymousClass7TE.A01(resources, R.dimen.action_sheet_divider_margin_top);
        u1n.invalidateSelf();
        User user = questionResponseReshareModel.A06;
        if (user != null) {
            u1n.A00(user.Bh3());
        }
        int i2 = this.A01;
        u1n.setBounds(0, 0, i2, i2);
        this.A09 = u1n;
        int i3 = ((i - (this.A04 * 2)) - this.A01) - this.A00;
        Paint paint = this.A00;
        AnonymousClass7TE.A1Q(paint);
        AnonymousClass7TE.A1N(context, paint, 2Yu.A0A(context));
        this.A0A = new C389769qA(context, questionResponseReshareModel.A05, questionResponseReshareModel.A07, i);
        C306386Ly A0s = AnonymousClass7TE.A0s(context, i3);
        AnonymousClass7TF.A11(resources, A0s, R.dimen.account_group_management_row_text_size);
        String str = questionResponseReshareModel.A08;
        A0s.A0M(str == null ? "" : str);
        A0s.A0G(5, "…");
        AnonymousClass7TG.A0y(context, A0s, R.attr.igds_color_text_on_white);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        A0s.A0K(alignment);
        ABM.A00(context, A0s);
        this.A0B = A0s;
        C306386Ly A0s2 = AnonymousClass7TE.A0s(context, i3);
        AnonymousClass7TF.A11(resources, A0s2, R.dimen.add_payment_bottom_sheet_row_subtitle_size);
        if (user != null) {
            A0s2.A0M(user.getUsername());
        }
        A0s2.A0K(alignment);
        AnonymousClass7TG.A0y(context, A0s2, R.attr.igds_color_creation_tools_grey_05);
        AnonymousClass7TG.A1N(context, A0s2);
        AnonymousClass7TE.A1X(0qm.A12, AnonymousClass0qo.A00(context), A0s2);
        this.A0C = A0s2;
        int max = Math.max(this.A01, A0s2.A06 + this.A0B.A06) + (this.A04 * 2);
        this.A03 = max;
        float f = (float) i;
        this.A08 = new RectF(0.0f, 0.0f, f, (float) max);
        this.A07 = new RectF(0.0f, 0.0f, f, (float) (this.A03 - this.A02));
    }

    public final void draw(Canvas canvas) {
        Rect A0L = AnonymousClass7TG.A0L(this, canvas);
        canvas.save();
        AnonymousClass7TF.A13(canvas, A0L);
        C389769qA r0 = this.A0A;
        r0.draw(canvas);
        canvas.translate(0.0f, (float) r0.A03);
        RectF rectF = this.A08;
        float f = (float) this.A02;
        Paint paint = this.A00;
        canvas.drawRoundRect(rectF, f, f, paint);
        canvas.drawRect(this.A07, paint);
        canvas.save();
        float f2 = (float) this.A04;
        canvas.translate(f2, f2);
        AnonymousClass7TF.A14(canvas, this.A09);
        canvas.translate(f2 + ((float) this.A01) + ((float) this.A00), (float) this.A05);
        C306386Ly r02 = this.A0B;
        r02.draw(canvas);
        canvas.translate(0.0f, ((float) r02.A06) + ((float) this.A06));
        this.A0C.draw(canvas);
        canvas.restore();
        canvas.restore();
    }
}
