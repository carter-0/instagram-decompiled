package X;

/* renamed from: X.WDp  reason: case insensitive filesystem */
public final class C18936WDp implements 02U {
    public int A00;
    public final Object[] A01 = new Object[1024];

    public final synchronized void A00() {
        int i = this.A00;
        for (int i2 = 0; i2 < i; i2++) {
            this.A01[i2] = null;
        }
        this.A00 = 0;
    }

    public final synchronized Object A7A() {
        int i = this.A00;
        if (i == 0) {
            return null;
        }
        int i2 = i - 1;
        this.A00 = i2;
        Object[] objArr = this.A01;
        Object obj = objArr[i2];
        0qQ.A0C(obj, "null cannot be cast to non-null type T of com.facebook.react.common.ClearableSynchronizedPool");
        objArr[i2] = null;
        return obj;
    }

    public final synchronized boolean ECR(Object obj) {
        boolean z;
        z = false;
        0qQ.A0B(obj, 0);
        int i = this.A00;
        Object[] objArr = this.A01;
        if (i != 1024) {
            objArr[i] = obj;
            z = true;
            this.A00 = i + 1;
        }
        return z;
    }
}
