package X;

import java.util.LinkedHashMap;

/* renamed from: X.5FX  reason: invalid class name */
public final class AnonymousClass5FX extends 0Yg implements C62320sa {
    public static final AnonymousClass5FX A00 = new AnonymousClass5FX();

    public AnonymousClass5FX() {
        super(0);
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        int A0L = 0se.A0L(r4);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (AnonymousClass5FV r1 : AnonymousClass5FV.values()) {
            linkedHashMap.put(Integer.valueOf(r1.A00), r1);
        }
        return linkedHashMap;
    }
}
