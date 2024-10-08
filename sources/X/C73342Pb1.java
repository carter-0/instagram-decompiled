package X;

import java.lang.reflect.Method;

/* renamed from: X.Pb1  reason: case insensitive filesystem */
public final class C73342Pb1 implements Runnable {
    public final /* synthetic */ 0HW A00;
    public final /* synthetic */ C289655dz A01;
    public final /* synthetic */ Method A02;
    public final /* synthetic */ Object[] A03;

    public C73342Pb1(0HW r1, C289655dz r2, Method method, Object[] objArr) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = method;
        this.A03 = objArr;
    }

    public final void run() {
        try {
            this.A00.A01(this.A02, this.A03);
        } catch (Throwable th) {
            this.A01.A00.A0C(th);
            throw C41845B3m.A0j(th);
        }
    }
}
