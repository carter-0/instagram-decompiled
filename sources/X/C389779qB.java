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

/* renamed from: X.9qB  reason: invalid class name and case insensitive filesystem */
public final class C389779qB extends C369738vF {
    public final int A00;
    public final int A01;
    public final int A02;
    public final RectF A03;
    public final RectF A04;
    public final AnonymousClass6M4 A05;
    public final C389759q9 A06;
    public final C306386Ly A07;
    public final int A08;

    public final int getIntrinsicHeight() {
        return this.A01 + this.A06.A01;
    }

    public final int getIntrinsicWidth() {
        return this.A08;
    }

    public C389779qB(Context context, QuestionResponseReshareModel questionResponseReshareModel, int i) {
        super(questionResponseReshareModel);
        this.A08 = i;
        Resources resources = context.getResources();
        this.A02 = resources.getDimensionPixelSize(R.dimen.ai_agent_share_profile_sticker_padding);
        this.A00 = AnonymousClass7TE.A0F(resources);
        int A032 = AnonymousClass7TF.A03(context, R.attr.igds_color_creation_tools_grey_09);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material);
        Paint paint = this.A00;
        AnonymousClass7TE.A1Q(paint);
        AnonymousClass7TE.A1N(context, paint, 2Yu.A0A(context));
        this.A06 = new C389759q9(context, questionResponseReshareModel.A07, i);
        AnonymousClass6M3 r1 = new AnonymousClass6M3(context, this, -1);
        r1.A02(R.dimen.account_discovery_bottom_gap);
        this.A05 = r1.A00();
        C306386Ly A0P = AnonymousClass7TF.A0P(context, dimensionPixelSize, i);
        AnonymousClass7TF.A11(resources, A0P, R.dimen.backup_codes_text_size);
        String str = questionResponseReshareModel.A08;
        A0P.A0M(str == null ? "" : str);
        A0P.A0G(5, "…");
        A0P.A0F(A032);
        A0P.A0K(Layout.Alignment.ALIGN_CENTER);
        ABM.A00(context, A0P);
        this.A07 = A0P;
        int i2 = (this.A02 * 2) + A0P.A06;
        this.A01 = i2;
        float f = (float) i;
        this.A04 = new RectF(0.0f, 0.0f, f, (float) i2);
        this.A03 = new RectF(0.0f, 0.0f, f, (float) (this.A01 - this.A00));
    }

    public final void draw(Canvas canvas) {
        Rect A0L = AnonymousClass7TG.A0L(this, canvas);
        canvas.save();
        AnonymousClass7TF.A13(canvas, A0L);
        C389759q9 r0 = this.A06;
        r0.draw(canvas);
        canvas.translate(0.0f, (float) r0.A01);
        RectF rectF = this.A04;
        float f = (float) this.A00;
        Paint paint = this.A00;
        canvas.drawRoundRect(rectF, f, f, paint);
        canvas.drawRect(this.A03, paint);
        canvas.save();
        int i = this.A08;
        C306386Ly r2 = this.A07;
        AnonymousClass7TF.A15(canvas, r2, (float) ((i - r2.A0A) / 2), (float) this.A02);
        canvas.restore();
        this.A05.draw(canvas);
    }
}
