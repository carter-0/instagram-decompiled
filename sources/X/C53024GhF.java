package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.GhF  reason: case insensitive filesystem */
public final class C53024GhF extends 2YL {
    public final 05G A00;
    public final AnonymousClass0Ud A01;

    public static final void A00(C53024GhF ghF, AnonymousClass62O r6) {
        Object value;
        String str;
        String str2;
        05G r5 = ghF.A00;
        do {
            value = r5.getValue();
            GSY gsy = (GSY) value;
            str = gsy.A02;
            str2 = gsy.A03;
            0qQ.A0B(r6, 3);
        } while (!r5.AIY(value, new GSY((C381879cj) null, str, str2, r6)));
    }

    public final void A01(String str) {
        Object value;
        GSY gsy;
        String str2;
        AnonymousClass62O r1;
        05G r5 = this.A00;
        do {
            value = r5.getValue();
            gsy = (GSY) value;
            str2 = gsy.A02;
            r1 = (AnonymousClass62O) gsy.A00;
            0qQ.A0B(r1, 3);
        } while (!r5.AIY(value, new GSY((C381879cj) gsy.A01, str2, str, r1)));
    }

    public C53024GhF() {
        02z A10 = DbS.A10(new GSY((C381879cj) null, (String) null, (String) null, (DefaultConstructorMarker) null, (AnonymousClass62O) null, 15, 5));
        this.A00 = A10;
        this.A01 = A10;
    }
}
