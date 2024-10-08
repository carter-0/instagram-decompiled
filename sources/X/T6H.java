package X;

import com.facebook.proxygen.HTTPRequestHandler;

public final class T6H implements AnonymousClass1TD {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public T6H(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void A6x() {
        if (this.A00 != 0) {
            ((HTTPRequestHandler) this.A02).cancel();
        } else {
            ((AnonymousClass1QX) this.A02).A00();
        }
    }
}
