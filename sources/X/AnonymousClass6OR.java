package X;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: X.6OR  reason: invalid class name */
public final class AnonymousClass6OR implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ Context A02;
    public final /* synthetic */ AnonymousClass2TS A03;
    public final /* synthetic */ C307996Sh A04;
    public final /* synthetic */ Object A05;
    public final /* synthetic */ Object A06;
    public final /* synthetic */ C245603dB[] A07;

    public AnonymousClass6OR(Context context, AnonymousClass2TS r2, C307996Sh r3, Object obj, Object obj2, C245603dB[] r6, int i, long j) {
        this.A04 = r3;
        this.A03 = r2;
        this.A01 = j;
        this.A06 = obj;
        this.A05 = obj2;
        this.A02 = context;
        this.A00 = i;
        this.A07 = r6;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C307996Sh r2 = this.A04;
        if (r2 != null) {
            AnonymousClass2TS r4 = this.A03;
            long j = this.A01;
            C245663dH r3 = r2.A01;
            if (r4 == r2.A00 && C245063cG.A02(j, r3.A01, C245133cN.A00(r3.A01(), r3.A00()))) {
                return new C307996Sh(r4, r3, this.A06, r2.A03);
            }
        }
        C308006Si r0 = C307996Sh.A04;
        Object obj = this.A05;
        return r0.A03(r0.A01(this.A02, r2, obj, this.A07, this.A00), this.A03, this.A06, this.A01);
    }
}
