package X;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.UAz  reason: case insensitive filesystem */
public final class C14820UAz extends C249403jg {
    public ValueAnimator A00;
    public Runnable A01;
    public boolean A02;
    public final C14811UAh A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C14820UAz uAz = (C14820UAz) obj;
            if (this.A04 == uAz.A04) {
                return this.A03.equals(uAz.A03);
            }
        }
        return false;
    }

    public final int hashCode() {
        return Pxf.A0A(this.A03, Boolean.valueOf(this.A04));
    }

    public C14820UAz(C14811UAh uAh, boolean z) {
        this.A03 = uAh;
        uAh.A01 = this;
        this.A02 = AnonymousClass7TF.A1P((uAh.A00 > 0.0f ? 1 : (uAh.A00 == 0.0f ? 0 : -1)));
        this.A04 = z;
        if (z) {
            uAh.A00 = 1.0f;
        }
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int i2;
        int A032 = AnonymousClass0fD.A03(-955028286);
        if (this.A04) {
            i2 = 1978403082;
        } else {
            if (i == 0) {
                C20124Wlk wlk = new C20124Wlk(recyclerView, this);
                this.A01 = wlk;
                recyclerView.postDelayed(wlk, 1500);
            } else {
                recyclerView.removeCallbacks(this.A01);
                if (!this.A02) {
                    ValueAnimator valueAnimator = this.A00;
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        this.A00.cancel();
                    }
                    C14811UAh uAh = this.A03;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{uAh.A00, 1.0f});
                    ofFloat.addUpdateListener(new W4C(recyclerView, uAh));
                    ofFloat.setDuration(200);
                    ofFloat.start();
                    this.A02 = true;
                }
            }
            i2 = -125924888;
        }
        AnonymousClass0fD.A0A(i2, A032);
    }
}
