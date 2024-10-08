package X;

import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import java.io.IOException;

public final class UJ4 extends UIT implements C226532gy {
    public static final Handler A0F = AnonymousClass7TF.A0D();
    public static final AnonymousClass1TM A0G;
    public int A00;
    public long A01;
    public C249903kY A02;
    public 1TY A03;
    public C226732hl A04;
    public WHX A05;
    public Object A06;
    public boolean A07;
    public boolean A08;
    public Runnable A09;
    public final UIV A0A;
    public final C226762ho A0B;
    public final C18413VrI A0C;
    public final Runnable A0D;
    public final C64711Tc A0E;

    public UJ4(C64711Tc r4) {
        0qQ.A0B(r4, 3);
        C226762ho r0 = new C226762ho();
        this.A0B = r0;
        if (r0.A00 != null) {
            throw new NullPointerException("trying to set localImagePerfStateListener without a localPerfStatePublisher");
        }
        this.A0E = r4;
        this.A0D = new C19933Wi6(this);
        Matrix matrix = AnonymousClass763.A03;
        this.A0A = new UIV(C14675U0w.A00, AnonymousClass1U5.A01);
        this.A0C = new C18413VrI(this);
        this.A00 = 1;
    }

    public final Drawable AYq() {
        Drawable A022 = A02(1);
        UIV uiv = this.A0A;
        if (A022 == uiv) {
            return uiv.A00;
        }
        return A022;
    }

    public final synchronized long BG9() {
        return this.A01;
    }

    public final void DUB(1TY r9) {
        boolean A1V;
        C226732hl r3 = this.A04;
        WHX whx = this.A05;
        1TY r2 = r9;
        if (r9 == this.A03 && r3 != null && whx != null) {
            synchronized (r2) {
                A1V = AnonymousClass7TF.A1V(r9.A02);
            }
            if (A1V) {
                C249903kY r1 = (C249903kY) r9.A02();
                try {
                    if (!C249903kY.A02(r1)) {
                        whx.A01(r9, r3, this);
                    } else {
                        WHX.A00(r1, r2, r3, whx, this, false, false);
                    }
                } finally {
                    C249903kY.A01(r1);
                }
            }
        }
    }

    public final synchronized void close() {
        synchronized (this) {
            A09();
            A08();
            this.A01 = 0;
            super.close();
            UIU.A00(this);
            invalidateSelf();
            this.A0A.A01(C14675U0w.A00);
            C249903kY.A01(this.A02);
            this.A02 = null;
            this.A05 = null;
            1TY r0 = this.A03;
            if (r0 != null) {
                r0.A04();
            }
            this.A03 = null;
            this.A08 = false;
            this.A04 = null;
            this.A00 = 1;
            try {
                this.A0B.A02 = null;
            } catch (IOException unused) {
            }
        }
    }

    public final void A08() {
        if (this.A07) {
            A0F.removeCallbacks(this.A0D);
            this.A07 = false;
        }
    }

    public final void A09() {
        AnonymousClass1TM r0 = A0G;
        synchronized (r0.A02) {
            r0.A00.remove(this);
        }
    }

    public final Object Ajd() {
        return this.A06;
    }

    public final C226732hl BGF() {
        return this.A04;
    }

    public final Runnable BlC() {
        return this.A09;
    }

    public final boolean CTa() {
        return this.A08;
    }

    public final void DEW(1TY r4) {
        C226732hl r2 = this.A04;
        WHX whx = this.A05;
        if (r4 == this.A03 && r2 != null && whx != null) {
            whx.A01(r4, r2, this);
        }
    }

    public final void DaR(1TY r4) {
        float f;
        C226732hl r2 = this.A04;
        WHX whx = this.A05;
        if (r4 == this.A03 && r2 != null && whx != null && !r4.A08()) {
            synchronized (r4) {
                f = r4.A00;
            }
            A06(f);
        }
    }

    public final void EiD(Runnable runnable) {
        this.A09 = runnable;
    }

    static {
        AnonymousClass1TM r0;
        synchronized (AnonymousClass1TM.class) {
            r0 = AnonymousClass1TM.A05;
            if (r0 == null) {
                r0 = new AnonymousClass1TM();
                AnonymousClass1TM.A05 = r0;
            }
        }
        A0G = r0;
    }

    public final void A0A() {
        C226732hl r4;
        A08();
        A0G.A00(this);
        if (this.A05 != null && (r4 = this.A04) != null) {
            this.A0B.Dd5(C16779V5m.A00((C249903kY) null, (1TY) null, r4, this), r4, BG9());
        }
    }

    public final void A0B(Drawable drawable, C249903kY r4) {
        C249903kY r0;
        A09();
        A08();
        UIV uiv = this.A0A;
        if (drawable != uiv) {
            uiv.A01(C14675U0w.A00);
        }
        C249903kY.A01(this.A02);
        if (r4 != null) {
            r0 = r4.A04();
        } else {
            r0 = null;
        }
        this.A02 = r0;
        A03(drawable, 1);
    }

    public final int getIntrinsicHeight() {
        return super.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        return super.getIntrinsicWidth();
    }

    public final void release() {
        close();
    }
}
