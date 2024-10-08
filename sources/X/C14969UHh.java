package X;

import com.facebook.common.time.RealtimeSinceBootClock;
import java.lang.ref.WeakReference;

/* renamed from: X.UHh  reason: case insensitive filesystem */
public final class C14969UHh extends C365208mi {
    public final WeakReference A00;
    public final C17616Vb8 A01;
    public final WeakReference A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14969UHh(LPE lpe, C21028XAh xAh, boolean z) {
        super(xAh.getSurface(), AnonymousClass8KV.CAPTURE, xAh.C3N(), xAh.C3K());
        C17616Vb8 vb8;
        0qQ.A0B(xAh, 1);
        this.A02 = new WeakReference(xAh);
        this.A00 = new WeakReference(lpe);
        if (z) {
            RealtimeSinceBootClock realtimeSinceBootClock = RealtimeSinceBootClock.A00;
            0qQ.A07(realtimeSinceBootClock);
            vb8 = new C17616Vb8(realtimeSinceBootClock, new C17296VPx(this));
        } else {
            vb8 = null;
        }
        this.A01 = vb8;
    }

    public final boolean AFP() {
        C21028XAh xAh = (C21028XAh) this.A02.get();
        Object obj = this.A00.get();
        if (!super.AFP() || xAh == null || xAh.CYx() || obj == null) {
            return false;
        }
        return true;
    }

    public final void Dpd() {
        LPE lpe;
        C17616Vb8 vb8 = this.A01;
        if (vb8 != null) {
            vb8.A06++;
        }
        super.Dpd();
        C21028XAh xAh = (C21028XAh) this.A02.get();
        if (!(xAh == null || (lpe = (LPE) this.A00.get()) == null)) {
            lpe.A0H(xAh);
        }
        if (vb8 != null) {
            vb8.A01++;
            C17475VXc vXc = vb8.A04;
            vXc.A02++;
            long now = vb8.A03.now();
            long j = vb8.A02;
            if (j == 0) {
                vXc.A00 = -1;
                vXc.A02 = 0;
                vXc.A01 = vXc.A03.now();
                vb8.A02 = now;
                j = now;
            }
            if (now - j >= 1000) {
                long now2 = vXc.A03.now();
                long j2 = now2 - vXc.A01;
                if (j2 >= 1000) {
                    vXc.A00 = (int) ((vXc.A02 * 1000) / j2);
                    vXc.A01 = now2;
                    vXc.A02 = 0;
                }
                vb8.A00 = vXc.A00;
                vb8.A02 = now;
                11Z.A02(new C20328WpP((LPE) vb8.A05.A00.A00.get(), vb8.A06, vb8.A01, vb8.A00));
            }
        }
    }

    public final void A00(long j) {
        super.A00(j);
        long j2 = this.A02;
        C21028XAh xAh = (C21028XAh) this.A02.get();
        if (xAh != null) {
            xAh.EiX(j2 / 1000000);
        }
        LPE lpe = (LPE) this.A00.get();
        if (lpe != null) {
            lpe.A0F(j2);
        }
    }
}
