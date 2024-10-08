package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.XEu  reason: case insensitive filesystem */
public final class C21105XEu implements C65071aK {
    public final AtomicReference A00;

    public final void Eyt(1aL r8) {
        C21075XDo xDo;
        XEv xEv = new XEv(r8);
        r8.Do4(xEv);
        loop0:
        while (true) {
            AtomicReference atomicReference = this.A00;
            xDo = (C21075XDo) atomicReference.get();
            if (xDo == null || xDo.A02.get() == C21075XDo.A05) {
                C21075XDo xDo2 = new C21075XDo(atomicReference);
                if (1FH.A00(xDo, xDo2, atomicReference)) {
                    xDo = xDo2;
                } else {
                    continue;
                }
            }
            while (true) {
                AtomicReference atomicReference2 = xDo.A02;
                XEv[] xEvArr = (XEv[]) atomicReference2.get();
                if (xEvArr == C21075XDo.A05) {
                    continue;
                    break;
                }
                int length = xEvArr.length;
                XEv[] xEvArr2 = new XEv[(length + 1)];
                System.arraycopy(xEvArr, 0, xEvArr2, 0, length);
                xEvArr2[length] = xEv;
                if (1FH.A00(xEvArr, xEvArr2, atomicReference2)) {
                    break loop0;
                }
            }
        }
        if (!xEv.compareAndSet((Object) null, xDo)) {
            xDo.A00(xEv);
        }
    }

    public C21105XEu(AtomicReference atomicReference) {
        this.A00 = atomicReference;
    }
}
