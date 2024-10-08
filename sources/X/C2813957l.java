package X;

import java.lang.ref.WeakReference;
import java.util.HashMap;

/* renamed from: X.57l  reason: invalid class name and case insensitive filesystem */
public final class C2813957l {
    public final C242593Vc A00;
    public final WeakReference A01;
    public final 0sP A02;
    public final 0sK A03;

    public C2813957l(C242593Vc r2, C270434gj r3, 0sP r4, 0sK r5) {
        0qQ.A0B(r2, 2);
        0qQ.A0B(r3, 3);
        0qQ.A0B(r4, 4);
        this.A00 = r2;
        this.A02 = r4;
        this.A03 = r5;
        this.A01 = new WeakReference(r3);
    }

    public static final IP3 A00(H7z h7z, C2813957l r6, C62320sa r7, int i) {
        HashMap hashMap = h7z.A01;
        Integer valueOf = Integer.valueOf(i);
        IP3 ip3 = (IP3) hashMap.get(valueOf);
        if (ip3 == null && (ip3 = (IP3) r7.invoke()) != null) {
            hashMap.put(valueOf, ip3);
            C242593Vc r4 = r6.A00;
            C242723Vr r3 = (C242723Vr) ip3.A09.get(ip3.A01);
            0sP r2 = r6.A02;
            0qQ.A0B(r3, 1);
            0qQ.A0B(r2, 2);
            r3.CfE(new J6W(13, r2, ip3, r4));
        }
        return ip3;
    }
}
