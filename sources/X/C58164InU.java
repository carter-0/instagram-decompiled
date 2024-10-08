package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.InU  reason: case insensitive filesystem */
public final /* synthetic */ class C58164InU extends 03J implements 0sK {
    public static final C58164InU A00 = new C58164InU();

    public C58164InU() {
        super(3, C262214Cp.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C262214Cp r3 = (C262214Cp) obj;
        1Wm r4 = (1Wm) obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C262214Cp.A00;
        while (true) {
            Object A0C = r3.A0C();
            if (A0C instanceof AnonymousClass19J) {
                if (C262214Cp.A00(A0C, r3) >= 0) {
                    r4.A00 = r3.CO3(new C59474JKy(r3, r4));
                    break;
                }
            } else {
                if (!(A0C instanceof 1Hd)) {
                    A0C = 19H.A00(A0C);
                }
                r4.A01 = A0C;
            }
        }
        return C60340gF.A00;
    }
}
