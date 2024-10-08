package X;

import android.view.Choreographer;
import java.util.ArrayDeque;

/* renamed from: X.SOf  reason: case insensitive filesystem */
public final class C11346SOf {
    public static C11346SOf A05;
    public int A00;
    public C10225Roj A01;
    public boolean A02;
    public final ArrayDeque[] A03;
    public final Choreographer.FrameCallback A04;

    public final void A02(Choreographer.FrameCallback frameCallback, RFI rfi) {
        0qQ.A0B(frameCallback, 1);
        ArrayDeque[] arrayDequeArr = this.A03;
        synchronized (arrayDequeArr) {
            arrayDequeArr[rfi.A00].addLast(frameCallback);
            boolean z = true;
            int i = this.A00 + 1;
            this.A00 = i;
            if (i <= 0) {
                z = false;
            }
            0Sd.A02(z);
            A01(this);
        }
    }

    public static final void A00(C11346SOf sOf) {
        0Sd.A02(Pxf.A1R(sOf.A00));
        if (sOf.A00 == 0 && sOf.A02) {
            C10225Roj roj = sOf.A01;
            if (roj != null) {
                Choreographer.FrameCallback frameCallback = sOf.A04;
                0qQ.A0B(frameCallback, 0);
                roj.A00.removeFrameCallback(frameCallback);
            }
            sOf.A02 = false;
        }
    }

    public static final void A01(C11346SOf sOf) {
        if (!sOf.A02) {
            C10225Roj roj = sOf.A01;
            if (roj == null) {
                C18773W0w.A01(new TCN(sOf));
                return;
            }
            Choreographer.FrameCallback frameCallback = sOf.A04;
            0qQ.A0B(frameCallback, 0);
            roj.A00.postFrameCallback(frameCallback);
            sOf.A02 = true;
        }
    }

    public final void A03(Choreographer.FrameCallback frameCallback, RFI rfi) {
        ArrayDeque[] arrayDequeArr = this.A03;
        synchronized (arrayDequeArr) {
            if (arrayDequeArr[rfi.A00].removeFirstOccurrence(frameCallback)) {
                this.A00--;
                A00(this);
            } else {
                0I1.A03("ReactNative", "Tried to remove non-existent frame callback");
            }
        }
    }

    public C11346SOf(SBR sbr) {
        int size = RFI.A01.size();
        ArrayDeque[] arrayDequeArr = new ArrayDeque[size];
        for (int i = 0; i < size; i++) {
            arrayDequeArr[i] = new ArrayDeque();
        }
        this.A03 = arrayDequeArr;
        this.A04 = new W81(this, 1);
        C18773W0w.A01(new TG8(sbr, this));
    }
}
