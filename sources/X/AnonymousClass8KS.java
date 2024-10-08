package X;

import android.view.Surface;

/* renamed from: X.8KS  reason: invalid class name */
public final class AnonymousClass8KS extends AnonymousClass8KT implements AnonymousClass8KG {
    public C365468nA A00;
    public boolean A01;
    public C365228mk A02;
    public AnonymousClass8KV A03 = AnonymousClass8KV.PREVIEW;
    public final AnonymousClass80G A04;
    public volatile boolean A05;

    public AnonymousClass8KS(AnonymousClass80G r2) {
        0qQ.A0B(r2, 1);
        this.A04 = r2;
    }

    public final synchronized boolean AFP() {
        boolean z;
        Surface A042;
        z = false;
        if (super.AFP() && (A042 = this.A04.A04()) != null && A042.isValid()) {
            z = true;
        }
        return z;
    }

    public final String BO5() {
        return "TextureViewOutput";
    }

    public final synchronized void CMW(C365228mk r2, C365248mm r3) {
        0qQ.A0B(r2, 0);
        this.A02 = r2;
        AnonymousClass80G r0 = this.A04;
        r0.A08(this);
        Surface A042 = r0.A04();
        if (A042 != null) {
            r2.EzB(A042, this);
        }
    }

    public final synchronized boolean ClU() {
        boolean ClU;
        ClU = super.ClU();
        if (this.A05) {
            this.A05 = false;
            swapBuffers();
        }
        return ClU;
    }

    public final synchronized void DpU(int i, int i2) {
        this.A05 = true;
    }

    public final synchronized void DpX(Surface surface, int i, int i2) {
        C365228mk r1 = this.A02;
        if (r1 != null) {
            r1.EzB(this.A04.A04(), this);
        }
    }

    public final synchronized void Dpb() {
        C365228mk r0 = this.A02;
        if (r0 != null) {
            r0.EzD(this);
        }
        release();
    }

    public final synchronized void destroy() {
        release();
        this.A04.A0E.A00.remove(this);
        this.A02 = null;
    }

    public final synchronized int getHeight() {
        int height;
        height = super.getHeight();
        if (height <= 0) {
            height = this.A04.A05().getHeight();
        }
        return height;
    }

    public final synchronized int getWidth() {
        int width;
        width = super.getWidth();
        if (width <= 0) {
            width = this.A04.A05().getWidth();
        }
        return width;
    }

    public final C365468nA BHU() {
        return this.A00;
    }

    public final AnonymousClass8KV CED() {
        return this.A03;
    }
}
