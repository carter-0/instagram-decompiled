package X;

import android.util.SparseArray;
import com.facebook.react.modules.core.TimingModule;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.SpG  reason: case insensitive filesystem */
public final class C12216SpG implements C13773Tgo {
    public C13024TIg A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final SparseArray A04 = Pxe.A0L();
    public final QZK A05;
    public final C11467SaV A06 = new C11467SaV(this);
    public final C11469SaX A07 = new C11469SaX(this);
    public final C11346SOf A08;
    public final TimingModule A09;
    public final Object A0A = Pxe.A0p();
    public final Object A0B = Pxe.A0p();
    public final PriorityQueue A0C = new PriorityQueue(11, C13106TLp.A00);
    public final AtomicBoolean A0D = new AtomicBoolean(true);
    public final AtomicBoolean A0E = JTQ.A0k();
    public final C13946Tlt A0F;

    public C12216SpG(QZK qzk, C13946Tlt tlt, C11346SOf sOf, TimingModule timingModule) {
        this.A05 = qzk;
        this.A09 = timingModule;
        this.A08 = sOf;
        this.A0F = tlt;
        qzk.A09(this);
    }

    public static final void A00(C12216SpG spG) {
        SNf A002 = SNf.A00(spG.A05);
        if (spG.A01 && spG.A0D.get() && A002.A02.size() <= 0) {
            spG.A08.A03(spG.A07, RFI.TIMERS_EVENTS);
            spG.A01 = false;
        }
    }

    public static final void A01(C12216SpG spG) {
        if (spG.A0D.get() && !spG.A0E.get()) {
            A00(spG);
        }
    }

    public static final void A02(C12216SpG spG) {
        synchronized (spG.A0A) {
            if (spG.A03 && !spG.A02) {
                spG.A08.A02(spG.A06, RFI.IDLE_EVENT);
                spG.A02 = true;
            }
        }
    }

    public void deleteTimer(int i) {
        synchronized (this.A0B) {
            SparseArray sparseArray = this.A04;
            C10674RwD rwD = (C10674RwD) sparseArray.get(i);
            if (rwD != null) {
                sparseArray.remove(i);
                this.A0C.remove(rwD);
            }
        }
    }

    public final void onHostPause() {
        this.A0D.set(true);
        A00(this);
        A01(this);
    }

    public final void onHostResume() {
        this.A0D.set(false);
        if (!this.A01) {
            this.A08.A02(this.A07, RFI.TIMERS_EVENTS);
            this.A01 = true;
        }
        A02(this);
    }

    public void setSendIdleEvents(boolean z) {
        synchronized (this.A0A) {
            this.A03 = z;
        }
        C18773W0w.A01(new TG7(this, z));
    }

    public void createTimer(int i, long j, boolean z) {
        int i2 = i;
        C10674RwD rwD = new C10674RwD(i2, (int) j, z, (System.nanoTime() / 1000000) + j);
        synchronized (this.A0B) {
            this.A0C.add(rwD);
            this.A04.put(i, rwD);
        }
    }

    public final void onHostDestroy() {
        A00(this);
        A01(this);
    }
}
