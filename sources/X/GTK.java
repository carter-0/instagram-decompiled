package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.JobSupport$children$1", f = "JobSupport.kt", i = {1, 1, 1}, l = {953, 955}, m = "invokeSuspend", n = {"$this$sequence", "this_$iv", "cur$iv"}, s = {"L$0", "L$1", "L$2"})
public final class GTK extends C267894cP implements 0sL {
    public int A00;
    public Object A01;
    public Object A02;
    public /* synthetic */ Object A03;
    public final /* synthetic */ C262214Cp A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GTK(AnonymousClass4D7 r2, C262214Cp r3) {
        super(2, r2);
        this.A04 = r3;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.GTK, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r4) {
        ? gtk = new GTK(r4, this.A04);
        gtk.A03 = obj;
        return gtk;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.GTK, X.4D7] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            X.1Hj r4 = X.1Hj.A02
            int r0 = r6.A00
            r5 = 2
            r2 = 1
            if (r0 == 0) goto L_0x0039
            if (r0 == r2) goto L_0x006f
            java.lang.Object r1 = r6.A02
            X.19R r1 = (X.AnonymousClass19R) r1
            java.lang.Object r2 = r6.A01
            java.lang.Object r3 = r6.A03
            X.4qd r3 = (X.C275614qd) r3
            X.0eS.A00(r7)
        L_0x0017:
            X.19R r1 = r1.A03()
        L_0x001b:
            boolean r0 = X.0qQ.A0K(r1, r2)
            if (r0 != 0) goto L_0x0072
            boolean r0 = r1 instanceof X.19N
            if (r0 == 0) goto L_0x0017
            r0 = r1
            X.19N r0 = (X.19N) r0
            X.4Cp r0 = r0.A00
            r6.A03 = r3
            r6.A01 = r2
            r6.A02 = r1
            r6.A00 = r5
            X.1Hj r0 = r3.A02(r0, r6)
            if (r0 != r4) goto L_0x0017
            return r4
        L_0x0039:
            X.0eS.A00(r7)
            java.lang.Object r3 = r6.A03
            X.4qd r3 = (X.C275614qd) r3
            X.4Cp r0 = r6.A04
            java.lang.Object r1 = r0.A0C()
            boolean r0 = r1 instanceof X.19N
            if (r0 == 0) goto L_0x0057
            X.19N r1 = (X.19N) r1
            X.4Cp r0 = r1.A00
            r6.A00 = r2
            X.1Hj r0 = r3.A02(r0, r6)
            if (r0 != r4) goto L_0x0072
            return r4
        L_0x0057:
            boolean r0 = r1 instanceof X.AnonymousClass19J
            if (r0 == 0) goto L_0x0072
            X.19J r1 = (X.AnonymousClass19J) r1
            X.1RV r2 = r1.BN5()
            if (r2 == 0) goto L_0x0072
            java.lang.Object r1 = r2.A02()
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            X.0qQ.A0C(r1, r0)
            X.19R r1 = (X.AnonymousClass19R) r1
            goto L_0x001b
        L_0x006f:
            X.0eS.A00(r7)
        L_0x0072:
            X.0gF r4 = X.C60340gF.A00
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GTK.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((GTK) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
