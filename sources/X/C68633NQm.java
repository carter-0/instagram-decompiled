package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.NQm  reason: case insensitive filesystem */
public final class C68633NQm extends C268694dq {
    public final RectF A00 = AnonymousClass7TE.A0Y();
    public final N4t A01;
    public final C67596MqU A02;
    public final C67591MqP A03;
    public final C62320sa A04;
    public final float A05;
    public final float A06;
    public final Context A07;

    public C68633NQm(Context context, UserSession userSession, N4t n4t, C62320sa r10, float f, float f2, int i, int i2) {
        0qQ.A0B(userSession, 2);
        this.A07 = context;
        this.A05 = f;
        this.A06 = f2;
        this.A01 = n4t;
        this.A04 = r10;
        Nd4 nd4 = Nd4.A00;
        this.A02 = nd4;
        this.A03 = new C67591MqP(context, userSession, C67589MqN.A00(n4t), nd4, new C58179Inj(this, 46));
        setBounds(0, 0, i, i2);
        A00();
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        A00();
        canvas.save();
        canvas.save();
        RectF rectF = this.A00;
        canvas.translate(rectF.left, rectF.top);
        this.A03.draw(canvas);
        canvas.restore();
        canvas.restore();
    }

    private final void A00() {
        C67591MqP mqP = this.A03;
        int A062 = AnonymousClass7TF.A06(mqP);
        int A063 = JTP.A06(mqP);
        RectF rectF = this.A00;
        float f = this.A05;
        float f2 = ((float) A062) / 2.0f;
        float f3 = this.A06;
        rectF.set(f - f2, f3 - ((float) A063), f + f2, f3);
    }

    public final List A07() {
        return 0sr.A1M(new Drawable[]{this.A03});
    }
}
