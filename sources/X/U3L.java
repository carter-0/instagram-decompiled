package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class U3L extends View {
    public long A00;
    public 0sP A01;
    public final float A02;
    public final C18730Vz9 A03 = C18730Vz9.A00(this, 10);
    public final Runnable A04 = new C19962WiZ(this);
    public final List A05 = new ArrayList();

    public U3L(Context context) {
        super(context, (AttributeSet) null, 0);
        this.A02 = (float) C18092VlM.A00(context, -150.0f);
    }

    public final void onDraw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        super.onDraw(canvas);
        for (C17561VaF vaF : this.A05) {
            int save = canvas.save();
            try {
                vaF.A04.A01(canvas);
                vaF.A02.draw(canvas);
            } finally {
                canvas.restoreToCount(save);
            }
        }
    }

    public final void onVisibilityChanged(View view, int i) {
        0qQ.A0B(view, 0);
        super.onVisibilityChanged(view, i);
        C18730Vz9.A01(this.A03);
    }

    public final boolean verifyDrawable(Drawable drawable) {
        0qQ.A0B(drawable, 0);
        List<C17561VaF> list = this.A05;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (C17561VaF vaF : list) {
                if (0qQ.A0K(vaF.A02, drawable)) {
                    return true;
                }
            }
        }
        if (!super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public final void setOnFinishListener(0sP r1) {
        this.A01 = r1;
    }

    public static final void A00(U3L u3l) {
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = u3l.A00;
        if (j == 0) {
            j = uptimeMillis - 16;
            u3l.A00 = j;
        }
        float f = ((float) (uptimeMillis - j)) / 1000.0f;
        u3l.A00 = uptimeMillis;
        float width = ((float) u3l.getWidth()) * 0.5f;
        List list = u3l.A05;
        int A06 = C51966G9m.A06(list);
        if (A06 >= 0) {
            while (true) {
                int i = A06 - 1;
                C17561VaF vaF = (C17561VaF) list.get(A06);
                C18619VvC vvC = vaF.A03;
                C18573VuP vuP = vaF.A04;
                vaF.A00 += f;
                vvC.A07 = -15.0f * vuP.A02;
                Rect A0X = AnonymousClass7TE.A0X(vaF.A02);
                float centerX = (((width - (((float) A0X.centerX()) + vuP.A05)) * 0.35f) + (((float) C18092VlM.A01(C66580MXl.A0B(u3l), vuP.A02)) * 20.0f)) - vvC.A08;
                vvC.A00 = centerX;
                vvC.A00 = centerX * (vaF.A00 + 1.0f);
                vvC.A01(f);
                vvC.A02(vuP, f);
                if (vaF.A05) {
                    float cos = (((float) Math.cos((double) ((vaF.A00 * 1.5f) + vaF.A01))) * 0.45f) + 0.75f;
                    vuP.A03 = cos;
                    vuP.A04 = cos;
                }
                if (((float) A0X.top) + vuP.A06 + (vuP.A04 * ((float) A0X.height())) < 0.0f) {
                    list.remove(A06);
                }
                if (i < 0) {
                    break;
                }
                A06 = i;
            }
        }
        u3l.invalidate();
        if (AnonymousClass7TE.A1b(list)) {
            u3l.postOnAnimation(u3l.A04);
            return;
        }
        u3l.A00 = 0;
        0sP r0 = u3l.A01;
        if (r0 != null) {
            r0.invoke(u3l);
        }
    }

    public final void onWindowVisibilityChanged(int i) {
        int A06 = AnonymousClass0fD.A06(353451267);
        super.onWindowVisibilityChanged(i);
        C18730Vz9 vz9 = this.A03;
        vz9.A00 = i;
        C18730Vz9.A01(vz9);
        AnonymousClass0fD.A0D(1893156031, A06);
    }
}
