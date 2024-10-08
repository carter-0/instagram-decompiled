package X;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.42V  reason: invalid class name */
public final class AnonymousClass42V extends AnonymousClass19P {
    public static final /* synthetic */ AtomicReferenceFieldUpdater A03 = AtomicReferenceFieldUpdater.newUpdater(AnonymousClass42V.class, Object.class, "_disposer$volatile");
    public AnonymousClass19L A00;
    public final 1IX A01;
    public final /* synthetic */ AnonymousClass42U A02;
    public volatile /* synthetic */ Object _disposer$volatile;

    public AnonymousClass42V(AnonymousClass42U r1, 1IX r2) {
        this.A02 = r1;
        this.A01 = r2;
    }

    public final void A05(Throwable th) {
        if (th != null) {
            1IW r4 = this.A01;
            0zk A022 = 1IW.A02(new 1Hd(false, th), (0sP) null, r4);
            if (A022 != null) {
                r4.AIb(A022);
                AnonymousClass42W r0 = (AnonymousClass42W) A03.get(this);
                if (r0 != null) {
                    r0.A06();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = AnonymousClass42U.A01;
        AnonymousClass42U r1 = this.A02;
        if (atomicIntegerFieldUpdater.decrementAndGet(r1) == 0) {
            1IX r5 = this.A01;
            ArrayList arrayList = new ArrayList(r3);
            for (AnonymousClass2Q9 r02 : r1.A00) {
                arrayList.add(((C262214Cp) r02).A0B());
            }
            r5.resumeWith(arrayList);
        }
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A05((Throwable) obj);
        return C60340gF.A00;
    }
}
