package X;

/* renamed from: X.5Xc  reason: invalid class name and case insensitive filesystem */
public abstract class C286615Xc {
    /* JADX WARNING: type inference failed for: r5v0, types: [java.util.Map, X.5Ya, X.5YZ] */
    public static final AnonymousClass5RL A00(AnonymousClass5RM r6, AnonymousClass5RM r7, C286705Xl[] r8) {
        AnonymousClass5RL r0 = AnonymousClass5RL.A00;
        ? r5 = new C286845Ya(r0);
        r5.A00 = r0;
        for (C286705Xl r2 : r8) {
            C267304bL r1 = r2.A01;
            0qQ.A0C(r1, "null cannot be cast to non-null type androidx.compose.runtime.ProvidableCompositionLocal<kotlin.Any?>");
            if (!r2.A00) {
                0qQ.A0C(r1, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
                if (r6.containsKey(r1)) {
                }
            }
            r5.put(r1, r1.A01(r2, (C286605Xb) r7.get(r1)));
        }
        return r5.A06();
    }

    public static final Object A01(C267304bL r1, AnonymousClass5RM r2) {
        0qQ.A0C(r1, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        Object obj = r2.get(r1);
        if (obj == null) {
            obj = r1.A00();
        }
        return ((C286605Xb) obj).E6r(r2);
    }
}
