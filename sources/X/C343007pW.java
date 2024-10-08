package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;

/* renamed from: X.7pW  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C343007pW implements Runnable {
    public final /* synthetic */ Exception A00;
    public final /* synthetic */ Object A01;
    public final /* synthetic */ ArrayList A02;
    public final /* synthetic */ boolean A03;

    public /* synthetic */ C343007pW(Exception exc, Object obj, ArrayList arrayList, boolean z) {
        this.A03 = z;
        this.A02 = arrayList;
        this.A00 = exc;
        this.A01 = obj;
    }

    public final void run() {
        boolean z = this.A03;
        ArrayList arrayList = this.A02;
        Exception exc = this.A00;
        Object obj = this.A01;
        if (z || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AnonymousClass8GD r1 = (AnonymousClass8GD) it.next();
                if (z) {
                    r1.A02(obj);
                } else {
                    if (!(exc instanceof CancellationException)) {
                        exc.getClass();
                    }
                    r1.A01(exc);
                }
            }
            return;
        }
        throw new RuntimeException(exc);
    }
}
