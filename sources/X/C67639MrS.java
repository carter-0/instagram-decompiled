package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.ui.NoteBubbleView;
import com.instagram.user.model.User;

/* renamed from: X.MrS  reason: case insensitive filesystem */
public final class C67639MrS extends Drawable {
    public int A00;
    public NoteBubbleView A01;
    public C67591MqP A02;
    public final int A03;
    public final Context A04;
    public final UserSession A05;
    public final AnonymousClass4AB A06;
    public final C67596MqU A07;
    public final User A08;

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        canvas.save();
        float A042 = (float) AnonymousClass7TF.A04(this);
        C67591MqP mqP = this.A02;
        if (mqP == null) {
            0qQ.A0F("presencePogDrawable");
            throw AnonymousClass00P.createAndThrow();
        }
        canvas.translate(A042 - (((float) AnonymousClass7TF.A06(mqP)) / 2.0f), (float) this.A00);
        mqP.draw(canvas);
        canvas.restore();
        canvas.save();
        NoteBubbleView noteBubbleView = this.A01;
        if (noteBubbleView != null) {
            C66582MXn.A13(noteBubbleView, 0);
            noteBubbleView.draw(canvas);
        }
        canvas.restore();
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
        C67591MqP mqP = this.A02;
        if (mqP == null) {
            0qQ.A0F("presencePogDrawable");
            throw AnonymousClass00P.createAndThrow();
        }
        mqP.setAlpha(i);
        NoteBubbleView noteBubbleView = this.A01;
        if (noteBubbleView != null) {
            noteBubbleView.setAlpha(((float) i) / 255.0f);
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        C67591MqP mqP = this.A02;
        if (mqP == null) {
            0qQ.A0F("presencePogDrawable");
            throw AnonymousClass00P.createAndThrow();
        } else {
            mqP.setColorFilter(colorFilter);
        }
    }

    public /* synthetic */ C67639MrS(Context context, UserSession userSession, AnonymousClass4AB r15, C67596MqU mqU, User user) {
        int A022;
        int A023 = AnonymousClass7TF.A02(context, R.dimen.ad_not_delivering_thumbnail_height);
        C67596MqU mqU2 = mqU;
        User user2 = user;
        DbW.A1O(user2, 4, mqU2);
        this.A04 = context;
        this.A05 = userSession;
        this.A06 = r15;
        this.A08 = user2;
        this.A03 = A023;
        this.A07 = mqU2;
        this.A02 = new C67591MqP(context, userSession, C67589MqN.A01(user2), this.A07, new C58179Inj(this, 47));
        AnonymousClass4AB r9 = this.A06;
        if (r9 != null) {
            this.A01 = C70287O0r.A00(context, (C19879Wh8) null, userSession, r9, AnonymousClass05K.A0C, false);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int i = this.A03;
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i, SN3.MAX_SIGNED_POWER_OF_TWO);
        NoteBubbleView noteBubbleView = this.A01;
        if (noteBubbleView != null) {
            noteBubbleView.measure(makeMeasureSpec2, makeMeasureSpec);
        }
        C67591MqP mqP = this.A02;
        if (mqP != null) {
            int max = Math.max(AnonymousClass7TF.A06(mqP), i);
            NoteBubbleView noteBubbleView2 = this.A01;
            if (noteBubbleView2 == null) {
                Context context2 = this.A04;
                0qQ.A0B(context2, 0);
                A022 = AnonymousClass7TF.A02(context2, R.dimen.abc_select_dialog_padding_start_material);
            } else {
                int measuredHeight = noteBubbleView2.getMeasuredHeight();
                Context context3 = this.A04;
                0qQ.A0B(context3, 0);
                A022 = measuredHeight - AnonymousClass7TF.A02(context3, R.dimen.ad4ad_button_bottom_margin);
            }
            this.A00 = A022;
            C67591MqP mqP2 = this.A02;
            if (mqP2 != null) {
                setBounds(0, 0, max, JTP.A06(mqP2) + this.A00);
                return;
            }
        }
        0qQ.A0F("presencePogDrawable");
        throw AnonymousClass00P.createAndThrow();
    }
}
