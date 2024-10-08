package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.view.Choreographer;
import com.instagram.android.R;

public final class WJl implements C252203oj {
    public static final C71392co A0A = C71392co.A01();
    public static final C71392co A0B = C71392co.A04(50.0d, 7.0d);
    public static final C71392co A0C = C71392co.A04(20.0d, 9.0d);
    public int A00;
    public boolean A01;
    public final Matrix A02 = new Matrix();
    public final Paint A03;
    public final Drawable A04;
    public final C330607Nm A05;
    public final 2cs A06;
    public final 2cs A07;
    public final VVV A08;
    public final C306386Ly A09;

    public WJl(Context context, Drawable.Callback callback, Drawable drawable, VVV vvv) {
        Resources resources = context.getResources();
        this.A08 = vvv;
        2cs A0J = AnonymousClass7TF.A0J();
        A0J.A06 = true;
        A0J.A0A(this);
        this.A06 = A0J;
        2cs A0J2 = AnonymousClass7TF.A0J();
        A0J2.A06 = true;
        A0J2.A0A(this);
        this.A07 = A0J2;
        this.A04 = drawable;
        Paint paint = new Paint();
        this.A03 = paint;
        paint.setColor(-16777216);
        C306386Ly r2 = new C306386Ly(context, vvv.A00);
        r2.setCallback(callback);
        r2.A0M(vvv.A01);
        r2.A0K(Layout.Alignment.ALIGN_CENTER);
        r2.A0F(-1);
        AnonymousClass7TF.A11(resources, r2, R.dimen.achievements_only_you_bottom_margin);
        r2.A0I(AnonymousClass7TG.A0N(context));
        this.A09 = r2;
        this.A05 = new C15159UTk(this);
        this.A00 = context.getResources().getDimensionPixelOffset(R.dimen.achievements_only_you_bottom_margin);
    }

    public final void DmB(2cs r1) {
    }

    public final void DmC(2cs r7) {
        0qQ.A0B(r7, 0);
        if (r7 == this.A06) {
            if (r7.A09.A00 == 1.0d) {
                C14086Tpc tpc = C14086Tpc.A01;
                C330607Nm r4 = this.A05;
                Choreographer.FrameCallback frameCallback = r4.A00;
                if (frameCallback == null) {
                    frameCallback = new W81(r4, 2);
                    r4.A00 = frameCallback;
                }
                tpc.A00.postFrameCallbackDelayed(frameCallback, 300);
            }
        } else if (r7 == this.A07 && this.A01 && r7.A09.A00 == 0.0d) {
            this.A01 = false;
        }
    }

    public final void DmD(2cs r1) {
    }

    public final void DmE(2cs r2) {
        this.A04.invalidateSelf();
    }
}
