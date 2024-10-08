package X;

import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.6FP  reason: invalid class name */
public final class AnonymousClass6FP extends C267794cD implements C268024cd, AnonymousClass6FQ, AnonymousClass6FR {
    public long A00 = 0;
    public C304926Ft A01 = C304916Fs.A00;
    public Object A02;
    public Object A03;
    public 0sL A04;
    public C304926Ft A05;
    public C262204Co A06;
    public final C285045Pl A07 = new C285045Pl(new SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine[16]);
    public final C285045Pl A08 = new C285045Pl(new SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine[16]);

    public final /* synthetic */ int EJS(float f) {
        return C289055cw.A01(this, f);
    }

    public final /* synthetic */ float Ezu(long j) {
        return C291905i4.A00(this, j);
    }

    public final /* synthetic */ float Ezw(int i) {
        return ((float) i) / AwL();
    }

    public final /* synthetic */ long Ezx(long j) {
        return C289055cw.A03(this, j);
    }

    public final /* synthetic */ float F05(long j) {
        return C289055cw.A00(this, j);
    }

    public final /* synthetic */ long FH8(long j) {
        return C289055cw.A04(this, j);
    }

    public final /* synthetic */ long FH9(float f) {
        return C291905i4.A01(this, f);
    }

    private final void A00(C304926Ft r8, GWN gwn) {
        C285045Pl r6;
        1IX r1;
        int i;
        1IX r12;
        C285045Pl r13 = this.A07;
        synchronized (r13) {
            r6 = this.A08;
            r6.A06(r13, r6.A00);
        }
        try {
            int ordinal = gwn.ordinal();
            if (ordinal == 0 || ordinal == 2) {
                int i2 = r6.A00;
                if (i2 > 0) {
                    int i3 = 0;
                    Object[] objArr = r6.A02;
                    do {
                        SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine = (SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine) objArr[i3];
                        if (gwn == suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine.A00 && (r1 = suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine.A01) != null) {
                            suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine.A01 = null;
                            r1.resumeWith(r8);
                        }
                        i3++;
                    } while (i3 < i2);
                }
            } else if (ordinal == 1 && (i = r6.A00) > 0) {
                int i4 = i - 1;
                Object[] objArr2 = r6.A02;
                do {
                    SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine2 = (SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine) objArr2[i4];
                    if (gwn == suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine2.A00 && (r12 = suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine2.A01) != null) {
                        suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine2.A01 = null;
                        r12.resumeWith(r8);
                    }
                    i4--;
                } while (i4 >= 0);
            }
        } finally {
            r6.A01();
        }
    }

    public final Object AD1(AnonymousClass4D7 r7, 0sL r8) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = 1IW.A02;
        1IW r5 = new 1IW(1, 1Ey.A02(r7));
        r5.A0I();
        SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine = new SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine(this, r5);
        C285045Pl r3 = this.A07;
        synchronized (r3) {
            r3.A09(suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C241503Pl.A01;
            new C241503Pl(1Hj.A02, 1Ey.A02(1Ey.A01(suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine, suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine, r8))).resumeWith(C60340gF.A00);
        }
        r5.CO0(new AnonymousClass9L6(suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine, 48));
        return r5.A0E();
    }

    public final /* synthetic */ boolean CNf() {
        return false;
    }

    public final void D0Z() {
        C304926Ft r6 = this.A05;
        if (r6 != null) {
            List list = r6.A03;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (!(!((GPU) list.get(i)).A0B)) {
                    List list2 = r6.A03;
                    ArrayList arrayList = new ArrayList(list2.size());
                    int size2 = list2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        GPU gpu = (GPU) list2.get(i2);
                        long j = gpu.A05;
                        long j2 = gpu.A06;
                        long j3 = gpu.A0A;
                        float f = gpu.A03;
                        boolean z = gpu.A0B;
                        arrayList.add(new GPU(f, 1, j, j3, j2, j3, j2, 0, false, z, z));
                    }
                    C304926Ft r2 = new C304926Ft((GPV) null, arrayList);
                    this.A01 = r2;
                    A00(r2, GWN.Initial);
                    A00(r2, GWN.Main);
                    A00(r2, GWN.Final);
                    this.A05 = null;
                    return;
                }
            }
        }
    }

    public final void DXw(C304926Ft r6, GWN gwn, long j) {
        this.A00 = j;
        if (gwn == GWN.Initial) {
            this.A01 = r6;
        }
        if (this.A06 == null) {
            this.A06 = 1Eo.A03(AnonymousClass05K.A0N, 19B.A00, new C376889Js(this, (AnonymousClass4D7) null, 2), A05());
        }
        A00(r6, gwn);
        List list = r6.A03;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i < size) {
                if (!GPS.A02((GPU) list.get(i))) {
                    break;
                }
                i++;
            } else {
                r6 = null;
                break;
            }
        }
        this.A05 = r6;
    }

    public final void EI9() {
        C262204Co r1 = this.A06;
        if (r1 != null) {
            r1.AG7(new PzW());
            this.A06 = null;
        }
    }

    public final /* synthetic */ boolean Era() {
        return false;
    }

    public AnonymousClass6FP(Object obj, Object obj2, 0sL r6) {
        this.A02 = obj;
        this.A03 = obj2;
        this.A04 = r6;
    }

    public final void A0F() {
        EI9();
    }

    public final float AwL() {
        return AnonymousClass5WH.A02(this).A0C.AwL();
    }

    public final float B77() {
        return AnonymousClass5WH.A02(this).A0C.B77();
    }

    public final void D8P() {
        EI9();
    }

    public final void Dyp() {
        EI9();
    }

    public final /* synthetic */ float Ezv(float f) {
        return f / AwL();
    }

    public final /* synthetic */ float F06(float f) {
        return f * AwL();
    }

    public final /* synthetic */ long FHA(float f) {
        return FH9(Ezv(f));
    }
}
