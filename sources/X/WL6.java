package X;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

public final class WL6 implements C20888X2s, X6A {
    public C21046XBn A00;
    public int A01;
    public final WM2 A02;
    public final VR5 A03 = new Object();
    public final AtomicReference A04 = new AtomicReference();

    public final void D5h(C21046XBn xBn) {
    }

    /* JADX WARNING: type inference failed for: r0v16, types: [X.WL5, java.lang.Object, X.X2s] */
    public final void A71(C20889X2t x2t, C21046XBn xBn, Object obj) {
        int i;
        if (this.A00 != null) {
            if (this.A01 == 0) {
                this.A04.set(Thread.currentThread());
            }
            this.A01++;
            try {
                Iterator it = this.A02.iterator();
                while (it.hasNext()) {
                    ? obj2 = new Object();
                    obj2.A00 = this;
                    ((C20891X2x) it.next()).CtB(obj2, obj);
                }
                x2t.accept(obj);
                while (true) {
                    if (i == 0) {
                        VR5 vr5 = this.A03;
                        VV4 vv4 = vr5.A00;
                        if (vv4 == null) {
                            this.A04.set((Object) null);
                            return;
                        }
                        this.A01 = 1;
                        C21046XBn xBn2 = this.A00;
                        VV4 vv42 = vv4.A00;
                        vr5.A00 = vv42;
                        if (vv42 == null) {
                            vr5.A01 = null;
                        }
                        xBn2.APd(vv4.A01);
                    } else {
                        return;
                    }
                }
            } finally {
                this.A01--;
            }
        } else {
            throw new RuntimeException("setOuterStore must be called before the first dispatch");
        }
    }

    public final void APd(Object obj) {
        if (this.A04.get() == Thread.currentThread()) {
            VR5 vr5 = this.A03;
            VV4 vv4 = new VV4(vr5, obj);
            VV4 vv42 = vr5.A01;
            if (vv42 == null) {
                vr5.A01 = vv4;
                vr5.A00 = vv4;
                return;
            }
            vv42.A00 = vv4;
            vr5.A01 = vv4;
            return;
        }
        this.A00.APd(obj);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.VR5] */
    public WL6(WM2 wm2) {
        this.A02 = new WM2(wm2);
    }
}
