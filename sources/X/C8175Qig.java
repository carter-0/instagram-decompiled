package X;

/* renamed from: X.Qig  reason: case insensitive filesystem */
public final class C8175Qig extends C8180Qil {
    public final Object A0E(C269674fV r11, Object[] objArr) {
        167 r3;
        long A0R;
        long A0R2;
        int A0M;
        int A0M2;
        167 r1 = objArr[0];
        if (r1 instanceof 167) {
            r3 = r1;
        } else {
            r3 = new 167(false, r1);
        }
        Object obj = objArr[1];
        if (obj == null) {
            A0R = 0;
        } else {
            A0R = AnonymousClass7TE.A0R(obj);
        }
        Object obj2 = objArr[2];
        if (obj2 == null) {
            A0R2 = 0;
        } else {
            A0R2 = AnonymousClass7TE.A0R(obj2);
        }
        Object obj3 = objArr[3];
        if (obj3 == null) {
            A0M = 0;
        } else {
            A0M = AnonymousClass7TE.A0M(obj3);
        }
        Object obj4 = objArr[4];
        if (obj4 == null) {
            A0M2 = 0;
        } else {
            A0M2 = AnonymousClass7TE.A0M(obj4);
        }
        return new C12837T9j(r3, A0M, A0M2, A0R, A0R2);
    }

    public C8175Qig() {
        super(C12837T9j.class);
    }

    public static C8174Qif A00(C268894eF r6, String str, int i) {
        return new C8174Qif((C12834T9g) null, r6, T9n.A08, C269434f7.A00(str), (C8202QkB) null, (C11287SJg) null, (C269114eb) null, i);
    }
}
