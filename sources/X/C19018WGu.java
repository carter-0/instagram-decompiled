package X;

import android.content.Context;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.WGu  reason: case insensitive filesystem */
public final class C19018WGu implements X7R, X2O {
    public static C19018WGu A05;
    public static final C16773V5g A06 = new Object();
    public C17973VjA A00;
    public 0QV A01;
    public final Context A02;
    public final Set A03 = new LinkedHashSet();
    public final C18609Vv2 A04;

    public final synchronized void AOt() {
        C18609Vv2 vv2 = this.A04;
        vv2.A01();
        synchronized (vv2) {
            vv2.A03.remove(this);
        }
        this.A00 = null;
        for (X2N Cv0 : this.A03) {
            Cv0.Cv0(this.A00);
        }
        0QV r1 = this.A01;
        if (r1 != null) {
            this.A02.unregisterReceiver(r1);
        }
        this.A01 = null;
    }

    public final synchronized void CMo(C15046UKz uKz) {
        if (this.A00 == null) {
            C18609Vv2 vv2 = this.A04;
            this.A00 = vv2.A00(uKz);
            synchronized (vv2) {
                vv2.A03.add(this);
            }
            for (X2N Cv0 : this.A03) {
                Cv0.Cv0(this.A00);
            }
            this.A01 = new 0QV(new C59900bo[]{new C71782Oqi(this, 1)});
            0b6.A00();
            0b6.A02(this.A02, this.A01);
        }
    }

    public final synchronized void Cv0(C17973VjA vjA) {
        this.A00 = vjA;
    }

    public final synchronized void EBP(X2N x2n) {
        this.A03.add(x2n);
    }

    public C19018WGu(Context context, C18609Vv2 vv2) {
        this.A04 = vv2;
        this.A02 = context.getApplicationContext();
    }
}
