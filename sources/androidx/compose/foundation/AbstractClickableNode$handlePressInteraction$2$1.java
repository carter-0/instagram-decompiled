package androidx.compose.foundation;

import X.0sL;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass5WI;
import X.AnonymousClass7TE;
import X.C287605aT;
import X.C60340gF;
import X.MX4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1", f = "Clickable.kt", i = {0, 1, 2}, l = {1139, 1141, 1148, 1149, 1158}, m = "invokeSuspend", n = {"delayJob", "success", "release"}, s = {"L$0", "Z$0", "L$0"})
public final class AbstractClickableNode$handlePressInteraction$2$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public boolean A01;
    public /* synthetic */ Object A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ AnonymousClass5WI A04;
    public final /* synthetic */ MX4 A05;
    public final /* synthetic */ C287605aT A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractClickableNode$handlePressInteraction$2$1(AnonymousClass5WI r2, MX4 mx4, C287605aT r4, AnonymousClass4D7 r5, long j) {
        super(2, r5);
        this.A05 = mx4;
        this.A03 = j;
        this.A06 = r4;
        this.A04 = r2;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r9) {
        MX4 mx4 = this.A05;
        long j = this.A03;
        ? abstractClickableNode$handlePressInteraction$2$1 = new AbstractClickableNode$handlePressInteraction$2$1(this.A04, mx4, this.A06, r9, j);
        abstractClickableNode$handlePressInteraction$2$1.A02 = obj;
        return abstractClickableNode$handlePressInteraction$2$1;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.IEq, X.JL5, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0094 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0095  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            r9 = r16
            X.1Hj r3 = X.1Hj.A02
            int r0 = r15.A00
            r5 = 5
            r2 = 4
            r6 = 3
            r1 = 2
            r7 = 1
            r13 = 0
            if (r0 == 0) goto L_0x001e
            if (r0 == r7) goto L_0x0042
            if (r0 == r1) goto L_0x0063
            if (r0 == r6) goto L_0x0081
            X.0eS.A00(r9)
        L_0x0017:
            X.5WI r0 = r15.A04
            r0.A04 = r13
            X.0gF r3 = X.C60340gF.A00
            return r3
        L_0x001e:
            X.0eS.A00(r9)
            java.lang.Object r0 = r15.A02
            X.4Cq r0 = (X.C262224Cq) r0
            X.5WI r9 = r15.A04
            long r11 = r15.A03
            X.5aT r10 = r15.A06
            r14 = 0
            X.GPe r8 = new X.GPe
            r8.<init>((java.lang.Object) r9, (java.lang.Object) r10, (long) r11, (X.AnonymousClass4D7) r13, (int) r14)
            X.1Er r8 = X.C51966G9m.A1L(r8, r0)
            X.MX4 r0 = r15.A05
            r15.A02 = r8
            r15.A00 = r7
            java.lang.Object r9 = r0.FI7(r15)
            if (r9 != r3) goto L_0x0049
            return r3
        L_0x0042:
            java.lang.Object r8 = r15.A02
            X.4Co r8 = (X.C262204Co) r8
            X.0eS.A00(r9)
        L_0x0049:
            boolean r7 = X.AnonymousClass7TE.A1a(r9)
            boolean r0 = r8.isActive()
            if (r0 == 0) goto L_0x0095
            r15.A02 = r13
            r15.A01 = r7
            r15.A00 = r1
            r8.AG7(r13)
            java.lang.Object r0 = r8.CfH(r15)
            if (r0 != r3) goto L_0x0068
            return r3
        L_0x0063:
            boolean r7 = r15.A01
            X.0eS.A00(r9)
        L_0x0068:
            if (r7 == 0) goto L_0x0017
            X.IEq r1 = new X.IEq
            r1.<init>()
            X.GPY r5 = new X.GPY
            r5.<init>(r1)
            X.5aT r0 = r15.A06
            r15.A02 = r5
            r15.A00 = r6
            java.lang.Object r0 = r0.ARE(r1, r15)
            if (r0 != r3) goto L_0x0088
            return r3
        L_0x0081:
            java.lang.Object r5 = r15.A02
            X.GPY r5 = (X.GPY) r5
            X.0eS.A00(r9)
        L_0x0088:
            X.5aT r0 = r15.A06
            r15.A02 = r13
            r15.A00 = r2
            java.lang.Object r0 = r0.ARE(r5, r15)
            if (r0 != r3) goto L_0x0017
            return r3
        L_0x0095:
            X.5WI r0 = r15.A04
            X.IEq r2 = r0.A04
            if (r2 == 0) goto L_0x0017
            X.5aT r1 = r15.A06
            if (r7 == 0) goto L_0x00af
            X.GPY r0 = new X.GPY
            r0.<init>(r2)
        L_0x00a4:
            r15.A02 = r13
            r15.A00 = r5
            java.lang.Object r0 = r1.ARE(r0, r15)
            if (r0 != r3) goto L_0x0017
            return r3
        L_0x00af:
            X.IEt r0 = new X.IEt
            r0.<init>(r2)
            goto L_0x00a4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AbstractClickableNode$handlePressInteraction$2$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
