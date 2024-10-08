package X;

import android.view.Choreographer;
import com.instagram.feed.widget.IgProgressImageView;

/* renamed from: X.6g5  reason: invalid class name */
public class AnonymousClass6g5 {
    public static final int A0B = AnonymousClass6g5.class.hashCode();
    public float A00;
    public float A01;
    public long A02;
    public long A03;
    public long A04 = -1;
    public Object A05;
    public Runnable A06;
    public boolean A07;
    public IgProgressImageView A08;
    public final C313206g3 A09;
    public final C313236g7 A0A = new C313236g7(this);

    public final void A03(IgProgressImageView igProgressImageView, Object obj, long j, boolean z) {
        0qQ.A0B(igProgressImageView, 1);
        float f = (float) j;
        this.A01 = f;
        this.A08 = igProgressImageView;
        this.A05 = obj;
        this.A09.DK9(obj, f);
        this.A07 = z;
        this.A06 = new C305816Jr(this);
        IgProgressImageView igProgressImageView2 = this.A08;
        if (igProgressImageView2 == null) {
            throw new IllegalStateException("Required value was null.");
        } else if (igProgressImageView2.getIgImageView().A0N) {
            Runnable runnable = this.A06;
            if (runnable != null) {
                runnable.run();
                this.A06 = null;
                return;
            }
            throw new IllegalStateException("Required value was null.");
        } else {
            igProgressImageView.A0A(new PGM(this), A0B);
        }
    }

    public final void A04(Object obj, long j) {
        this.A07 = true;
        this.A01 = (float) j;
        this.A05 = obj;
        C313236g7 r3 = this.A0A;
        r3.A00.A02 = System.currentTimeMillis();
        Choreographer.getInstance().postFrameCallback(r3);
    }

    public final void A00() {
        if (this.A07) {
            this.A07 = false;
            Choreographer.getInstance().removeFrameCallback(this.A0A);
            this.A04 = System.currentTimeMillis();
        }
    }

    public final void A01() {
        Object obj = this.A05;
        if (obj != null && !this.A07) {
            this.A07 = true;
            IgProgressImageView igProgressImageView = this.A08;
            if (igProgressImageView == null || igProgressImageView.getIgImageView().A0N) {
                C313236g7 r3 = this.A0A;
                r3.A00.A02 = System.currentTimeMillis();
                Choreographer.getInstance().postFrameCallback(r3);
            }
            long j = this.A04;
            if (j > 0) {
                this.A03 += System.currentTimeMillis() - j;
            }
            this.A09.DKA(obj, ((double) this.A03) / 1000.0d);
        }
    }

    public AnonymousClass6g5(C313206g3 r3) {
        this.A09 = r3;
    }

    public final void A02() {
        A00();
        Object obj = this.A05;
        if (obj != null) {
            this.A09.DKB(obj);
        }
        IgProgressImageView igProgressImageView = this.A08;
        if (igProgressImageView != null) {
            igProgressImageView.A06(A0B);
            this.A08 = null;
        }
        this.A00 = 0.0f;
        this.A03 = 0;
        this.A04 = -1;
        this.A06 = null;
        this.A05 = null;
    }
}
