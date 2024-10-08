package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.ui.NoteBubbleView;
import java.util.List;

/* renamed from: X.NQn  reason: case insensitive filesystem */
public final class C68634NQn extends C268694dq {
    public float A00;
    public boolean A01;
    public final ValueAnimator A02;
    public final Paint A03;
    public final Path A04;
    public final RectF A05;
    public final RectF A06;
    public final NoteBubbleView A07;
    public final N4t A08;
    public final C68632NQl A09;
    public final C67596MqU A0A;
    public final C67591MqP A0B;
    public final C62320sa A0C;
    public final float A0D;
    public final float A0E;
    public final float A0F;
    public final int A0G;
    public final int A0H;
    public final Context A0I;

    private final void A00() {
        int i;
        float f;
        int i2 = 0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        NoteBubbleView noteBubbleView = this.A07;
        if (noteBubbleView != null) {
            noteBubbleView.measure(makeMeasureSpec, makeMeasureSpec);
        }
        C67591MqP mqP = this.A0B;
        int A062 = AnonymousClass7TF.A06(mqP);
        int A063 = JTP.A06(mqP);
        RectF rectF = this.A06;
        float f2 = this.A0D;
        float f3 = ((float) A062) / 2.0f;
        float f4 = this.A0E;
        rectF.set(f2 - f3, f4 - ((float) A063), f2 + f3, f4);
        if (noteBubbleView != null) {
            i = noteBubbleView.getMeasuredWidth();
        } else {
            i = 0;
        }
        int max = Math.max(A062, i);
        if (noteBubbleView != null) {
            i2 = noteBubbleView.getMeasuredHeight();
        }
        float f5 = ((float) max) / 2.0f;
        this.A05.set(f2 - f5, f4 - ((float) ((A063 + i2) - this.A0H)), f2 + f5, f4);
        Path path = this.A04;
        path.reset();
        float f6 = this.A0F;
        float f7 = f6 / 2.0f;
        float f8 = 0.0f;
        if (noteBubbleView != null) {
            f = (float) noteBubbleView.getMeasuredWidth();
        } else {
            f = 0.0f;
        }
        float f9 = f - f7;
        if (noteBubbleView != null) {
            f8 = (float) noteBubbleView.getMeasuredHeight();
        }
        path.addRoundRect(new RectF(f7, f7, f9, f8 - f7), f6, f6, Path.Direction.CW);
        C68632NQl nQl = this.A09;
        int i3 = nQl.A05;
        int i4 = nQl.A02;
        float f10 = f2 - ((float) (i3 / 2));
        float f11 = f4 + ((float) this.A0G);
        RectF rectF2 = new RectF(f10, f11, ((float) i3) + f10, ((float) i4) + f11);
        Rect A0W = AnonymousClass7TE.A0W();
        rectF2.roundOut(A0W);
        nQl.setBounds(A0W);
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        A00();
        canvas.save();
        float f = this.A00;
        RectF rectF = this.A05;
        canvas.rotate(f, rectF.centerX(), rectF.centerY());
        canvas.save();
        RectF rectF2 = this.A06;
        canvas.translate(rectF2.left, rectF2.top);
        this.A0B.draw(canvas);
        canvas.restore();
        NoteBubbleView noteBubbleView = this.A07;
        if (noteBubbleView != null) {
            canvas.save();
            canvas.translate(rectF.left, rectF.top);
            canvas.drawPath(this.A04, this.A03);
            C66582MXn.A13(noteBubbleView, 0);
            noteBubbleView.draw(canvas);
            canvas.restore();
        }
        if (!this.A01) {
            this.A09.draw(canvas);
        }
        canvas.restore();
    }

    public C68634NQn(Context context, UserSession userSession, N4t n4t, C62320sa r18, float f, float f2, int i, int i2) {
        C67596MqU mqU;
        UserSession userSession2 = userSession;
        boolean A1Y = DbW.A1Y(userSession2);
        Context context2 = context;
        this.A0I = context;
        this.A0D = f;
        this.A0E = f2;
        N4t n4t2 = n4t;
        this.A08 = n4t2;
        this.A0C = r18;
        if (n4t2.A05()) {
            mqU = Nd8.A00;
        } else if (n4t2.A05 != null) {
            mqU = Nd6.A00;
        } else {
            mqU = C67598MqW.A00;
        }
        this.A0A = mqU;
        this.A0B = new C67591MqP(context2, userSession2, C67589MqN.A00(n4t2), mqU, new C58179Inj(this, 45));
        this.A05 = AnonymousClass7TE.A0Y();
        this.A06 = AnonymousClass7TE.A0Y();
        this.A0H = AnonymousClass7TF.A02(context, R.dimen.ad4ad_button_bottom_margin);
        this.A0G = AnonymousClass7TF.A02(context, R.dimen.action_bar_item_spacing_left);
        float A022 = (float) AnonymousClass7TF.A02(context, R.dimen.abc_edit_text_inset_top_material);
        this.A0F = A022;
        Path A0C2 = C51965G9l.A0C();
        A0C2.setFillType(Path.FillType.WINDING);
        this.A04 = A0C2;
        Paint A0V = AnonymousClass7TE.A0V(A1Y ? 1 : 0);
        A0V.setColor(0);
        A0V.setShadowLayer(A022, 0.0f, 0.0f, context.getColor(R.color.black_30_transparent));
        this.A03 = A0V;
        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, -5.0f, 0.0f, 5.0f, 0.0f}).setDuration(250);
        C71170Oej.A00(duration, this, 9);
        C71161Oea.A00(duration, this, 6);
        C71161Oea.A00(duration, this, 5);
        C71161Oea.A00(duration, this, 7);
        this.A02 = duration;
        Context context3 = context;
        UserSession userSession3 = userSession2;
        this.A07 = C70287O0r.A00(context3, (C19879Wh8) null, userSession3, n4t2.A05, n4t2.A07, n4t2.A0K);
        this.A09 = new C68632NQl(context2, C67587MqL.A04(context, n4t2.A02()), JTR.A0L(), false);
        setBounds(0, 0, i, i2);
        A00();
    }

    public final List A07() {
        return 0sr.A1M(new Drawable[]{this.A0B, this.A09});
    }
}
