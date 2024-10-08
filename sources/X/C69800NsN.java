package X;

/* renamed from: X.NsN  reason: case insensitive filesystem */
public abstract class C69800NsN {
    public static final Object A00(C307896Rx r6, AnonymousClass6Tm r7) {
        Object obj;
        String A0g = DbY.A0g(r7);
        if (r7.A00.get(1) == null) {
            obj = r6.A03;
            if (obj == null) {
                return null;
            }
        } else {
            obj = r7.A03(1);
            0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.common.bloks.BloksContext");
        }
        C277014uI r3 = ((C280064zw) r7.A00()).A00;
        return C71022OYy.A00(r6, A0g, new C58696Iw5(44, obj, r3, r6), new J6W(4, obj, r3, r6));
    }
}
