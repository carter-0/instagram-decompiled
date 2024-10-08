package X;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import com.instagram.ui.widget.nametag.NametagCardView;

/* renamed from: X.9Nb  reason: invalid class name and case insensitive filesystem */
public final class C377749Nb implements Drawable.Callback {
    public final int A00;
    public final Object A01;

    public C377749Nb(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void invalidateDrawable(Drawable drawable) {
        long j;
        switch (this.A00) {
            case 0:
                C287985bB r4 = (C287985bB) this.A01;
                C284945Oz r1 = r4.A01;
                r1.Epw(Integer.valueOf(AnonymousClass7TE.A0M(r1.getValue()) + 1));
                Drawable drawable2 = r4.A00;
                AnonymousClass0eM r0 = C287995bC.A00;
                if (drawable2.getIntrinsicWidth() < 0 || drawable2.getIntrinsicHeight() < 0) {
                    j = 9205357640488583168L;
                } else {
                    j = C288015bE.A00((float) drawable2.getIntrinsicWidth(), (float) drawable2.getIntrinsicHeight());
                }
                r4.A02.Epw(new C288025bF(j));
                return;
            case 1:
                C389529pm r2 = (C389529pm) this.A01;
                C306386Ly r12 = r2.A0k;
                if (drawable == r12) {
                    r2.A05 = r12.A0A;
                    r2.A02 = r12.A06;
                    return;
                }
                C306386Ly r13 = r2.A0l;
                if (drawable == r13) {
                    r2.A09 = r13.A0A;
                    r2.A06 = r13.A06;
                    return;
                }
                C306386Ly r02 = r2.A0C;
                if (drawable == r02) {
                    r02.getClass();
                    r2.A04 = r02.A0A;
                    r2.A03 = r2.A0C.A06;
                    return;
                }
                C306386Ly r03 = r2.A0D;
                if (drawable == r03) {
                    r03.getClass();
                    r2.A08 = r03.A0A;
                    r2.A07 = r2.A0D.A06;
                    return;
                }
                return;
            default:
                11Z.A02(((NametagCardView) this.A01).A0A);
                return;
        }
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (this.A00 == 0) {
            0qQ.A0B(runnable, 1);
            ((Handler) C287995bC.A00.getValue()).postAtTime(runnable, j);
        }
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (this.A00 == 0) {
            0qQ.A0B(runnable, 1);
            ((Handler) C287995bC.A00.getValue()).removeCallbacks(runnable);
        }
    }
}
