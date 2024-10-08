package X;

import java.util.ArrayList;

/* renamed from: X.5pL  reason: invalid class name and case insensitive filesystem */
public final class C296035pL {
    public static int A00;
    public static final ArrayList A01 = new ArrayList();

    public static synchronized void A00(byte[] bArr) {
        synchronized (C296035pL.class) {
            A00--;
            ArrayList arrayList = A01;
            if (arrayList.size() < 4) {
                arrayList.add(bArr);
            }
        }
    }
}
