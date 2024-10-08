package X;

/* renamed from: X.6t5  reason: invalid class name and case insensitive filesystem */
public abstract class C320866t5 {
    public static final C320896t8 A00(Object obj, Object obj2, String str, boolean z, boolean z2) {
        Integer num;
        boolean z3;
        String str2 = str;
        0qQ.A0B(str, 0);
        if (obj2 instanceof C320876t6) {
            C320876t6 r4 = (C320876t6) obj2;
            if (r4.A04) {
                num = AnonymousClass05K.A0N;
            } else if (r4.A02) {
                num = AnonymousClass05K.A0C;
            } else if (r4.A03) {
                num = AnonymousClass05K.A01;
            } else {
                num = AnonymousClass05K.A00;
            }
        } else {
            num = AnonymousClass05K.A0Y;
        }
        if (obj instanceof C320886t7) {
            z3 = ((C320886t7) obj).A02();
        } else {
            z3 = false;
        }
        return new C320896t8(num, str2, z3, z, z2);
    }
}
