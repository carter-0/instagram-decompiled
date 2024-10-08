package X;

/* renamed from: X.6HJ  reason: invalid class name */
public final class AnonymousClass6HJ implements AnonymousClass2DP, AnonymousClass6HK {
    public C305556In A00;
    public AnonymousClass5Y2 A01;
    public C286015Tp A02;
    public Object A03;
    public String A04;
    public Object[] A05;
    public final C62320sa A06 = new AnonymousClass9L8(this, 19);

    public static final void A00(AnonymousClass6HJ r5) {
        StringBuilder sb;
        String str;
        String obj;
        AnonymousClass5Y2 r4 = r5.A01;
        C305556In r2 = r5.A00;
        if (r2 != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("entry(");
            sb2.append(r2);
            sb2.append(") is not null");
            throw new IllegalArgumentException(sb2.toString());
        } else if (r4 != null) {
            C62320sa r1 = r5.A06;
            Object invoke = r1.invoke();
            if (invoke == null || r4.AFI(invoke)) {
                r5.A00 = r4.EC0(r5.A04, r1);
                return;
            }
            if (invoke instanceof C284935Oy) {
                C284935Oy r3 = (C284935Oy) invoke;
                C284895Os BdR = r3.BdR();
                C305206Gy r12 = C305206Gy.A00;
                0qQ.A0C(r12, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.neverEqualPolicy>");
                if (BdR != r12) {
                    C284895Os BdR2 = r3.BdR();
                    C284885Or r13 = C284885Or.A00;
                    0qQ.A0C(r13, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
                    if (BdR2 != r13) {
                        C284895Os BdR3 = r3.BdR();
                        AnonymousClass5QM r14 = AnonymousClass5QM.A00;
                        0qQ.A0C(r14, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.referentialEqualityPolicy>");
                        if (BdR3 != r14) {
                            obj = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                        }
                    }
                }
                sb = new StringBuilder();
                sb.append("MutableState containing ");
                sb.append(r3.getValue());
                str = " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                sb.append(str);
                obj = sb.toString();
            } else {
                sb = new StringBuilder();
                sb.append(invoke);
                str = " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
                sb.append(str);
                obj = sb.toString();
            }
            throw new IllegalArgumentException(obj);
        }
    }

    public final void Csx() {
        C305556In r0 = this.A00;
        if (r0 != null) {
            r0.FIq();
        }
    }

    public final void DGg() {
        C305556In r0 = this.A00;
        if (r0 != null) {
            r0.FIq();
        }
    }

    public AnonymousClass6HJ(AnonymousClass5Y2 r3, C286015Tp r4, Object obj, String str, Object[] objArr) {
        this.A02 = r4;
        this.A01 = r3;
        this.A04 = str;
        this.A03 = obj;
        this.A05 = objArr;
    }

    public final void DdA() {
        A00(this);
    }
}
