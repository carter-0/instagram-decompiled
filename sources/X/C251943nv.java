package X;

import java.io.File;
import java.io.Writer;
import java.util.ArrayList;

/* renamed from: X.3nv  reason: invalid class name and case insensitive filesystem */
public final class C251943nv implements C251893nq {
    public final C251893nq A00;
    public final C251773ne A01;

    public final int B2C() {
        return this.A00.B2C();
    }

    public final boolean CK4() {
        return this.A00.CK4();
    }

    public final boolean CXo() {
        return this.A00.CXo();
    }

    public final void Cm1() {
        File file;
        boolean equals;
        this.A00.Cm1();
        C251773ne r4 = this.A01;
        String valueOf = String.valueOf(AnonymousClass1v8.A00() / AnonymousClass1v8.A00);
        String valueOf2 = String.valueOf(AnonymousClass1v8.A00() / AnonymousClass1v8.A01);
        ArrayList arrayList = r4.A00;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C251693nW r1 = (C251693nW) arrayList.get(i);
            if (r1 instanceof C251823nj) {
                file = r1.A00;
                equals = file.getName().equals(valueOf2);
            } else {
                boolean z = r1 instanceof C251803nh;
                file = r1.A00;
                if (z) {
                    equals = file.getName().equals(valueOf);
                }
                C251623nP.A00(file);
            }
            if (equals) {
            }
            C251623nP.A00(file);
        }
        arrayList.clear();
    }

    public final void FO1(Writer writer) {
        this.A00.FO1(writer);
    }

    public final void unlock() {
        this.A00.unlock();
    }

    public C251943nv(C251893nq r1, C251773ne r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
