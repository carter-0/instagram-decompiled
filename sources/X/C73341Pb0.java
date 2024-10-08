package X;

import java.lang.reflect.Method;

/* renamed from: X.Pb0  reason: case insensitive filesystem */
public final /* synthetic */ class C73341Pb0 implements Runnable {
    public final /* synthetic */ 0HW A00;
    public final /* synthetic */ AnonymousClass19A A01;
    public final /* synthetic */ Method A02;
    public final /* synthetic */ Object[] A03;

    public /* synthetic */ C73341Pb0(0HW r1, AnonymousClass19A r2, Method method, Object[] objArr) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = method;
        this.A03 = objArr;
    }

    public final void run() {
        AnonymousClass19A r3 = this.A01;
        Object obj = this.A00.A00(this.A02, this.A03).A00;
        if (obj != null) {
            r3.A0A(AnonymousClass7TG.A0m(obj, "registerReceiver should not be async, result=", AnonymousClass7TE.A1A()));
        }
    }
}
