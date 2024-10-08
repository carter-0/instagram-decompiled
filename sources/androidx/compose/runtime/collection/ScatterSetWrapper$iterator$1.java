package androidx.compose.runtime.collection;

import X.0sL;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C267894cP;
import X.C285135Pw;
import X.C60340gF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.runtime.collection.ScatterSetWrapper$iterator$1", f = "ScatterSetWrapper.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {34}, m = "invokeSuspend", n = {"$this$iterator", "k$iv", "m$iv$iv", "lastIndex$iv$iv", "i$iv$iv", "slot$iv$iv", "bitCount$iv$iv", "j$iv$iv"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "J$0", "I$2", "I$3"})
public final class ScatterSetWrapper$iterator$1 extends C267894cP implements 0sL {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public Object A06;
    public Object A07;
    public /* synthetic */ Object A08;
    public final /* synthetic */ C285135Pw A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScatterSetWrapper$iterator$1(C285135Pw r2, AnonymousClass4D7 r3) {
        super(2, r3);
        this.A09 = r2;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.4D7, androidx.compose.runtime.collection.ScatterSetWrapper$iterator$1] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r4) {
        ? scatterSetWrapper$iterator$1 = new ScatterSetWrapper$iterator$1(this.A09, r4);
        scatterSetWrapper$iterator$1.A08 = obj;
        return scatterSetWrapper$iterator$1;
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [X.4D7, androidx.compose.runtime.collection.ScatterSetWrapper$iterator$1] */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0033  */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            X.1Hj r10 = X.1Hj.A02
            r11 = r18
            int r0 = r11.A04
            r9 = 8
            r8 = 1
            if (r0 == 0) goto L_0x0051
            int r13 = r11.A03
            int r0 = r11.A02
            long r1 = r11.A05
            int r7 = r11.A01
            int r3 = r11.A00
            java.lang.Object r6 = r11.A07
            long[] r6 = (long[]) r6
            java.lang.Object r5 = r11.A06
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            java.lang.Object r4 = r11.A08
            X.4qd r4 = (X.C275614qd) r4
            X.0eS.A00(r19)
        L_0x0024:
            long r1 = r1 >> r9
            int r13 = r13 + 1
        L_0x0027:
            if (r13 >= r0) goto L_0x0082
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r16 & r1
            r14 = 128(0x80, double:6.32E-322)
            int r12 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r12 >= 0) goto L_0x0024
            int r12 = r7 << 3
            int r12 = r12 + r13
            r12 = r5[r12]
            r11.A08 = r4
            r11.A06 = r5
            r11.A07 = r6
            r11.A00 = r3
            r11.A01 = r7
            r11.A05 = r1
            r11.A02 = r0
            r11.A03 = r13
            r11.A04 = r8
            X.1Hj r12 = r4.A02(r12, r11)
            if (r12 != r10) goto L_0x0024
            return r10
        L_0x0051:
            X.0eS.A00(r19)
            java.lang.Object r4 = r11.A08
            X.4qd r4 = (X.C275614qd) r4
            X.5Pw r0 = r11.A09
            X.01p r0 = r0.A00
            java.lang.Object[] r5 = r0.A03
            long[] r6 = r0.A02
            int r0 = r6.length
            int r3 = r0 + -2
            if (r3 < 0) goto L_0x0089
            r7 = 0
        L_0x0066:
            r1 = r6[r7]
            r14 = -1
            long r14 = r14 ^ r1
            r0 = 7
            long r14 = r14 << r0
            long r14 = r14 & r1
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r14 = r14 & r12
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x0084
            int r0 = r7 - r3
            r0 = r0 ^ -1
            int r0 = r0 >>> 31
            int r0 = 8 - r0
            r13 = 0
            goto L_0x0027
        L_0x0082:
            if (r0 != r9) goto L_0x0089
        L_0x0084:
            if (r7 == r3) goto L_0x0089
            int r7 = r7 + 1
            goto L_0x0066
        L_0x0089:
            X.0gF r10 = X.C60340gF.A00
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.collection.ScatterSetWrapper$iterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ScatterSetWrapper$iterator$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
