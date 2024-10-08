package com.facebookpay.coroutines.util;

import X.0eS;
import X.0rl;
import X.0rm;
import X.0sL;
import X.19B;
import X.1Eo;
import X.1Hj;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C252683pV;
import X.C262204Co;
import X.C60340gF;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebookpay.coroutines.util.FlowUtilsKt$throttle$1$1", f = "FlowUtils.kt", i = {0}, l = {23}, m = "invokeSuspend", n = {"currentTime"}, s = {"J$0"})
public final class FlowUtilsKt$throttle$1$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public long A01;
    public /* synthetic */ Object A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ 0rl A04;
    public final /* synthetic */ 0rm A05;
    public final /* synthetic */ C252683pV A06;

    @DebugMetadata(c = "com.facebookpay.coroutines.util.FlowUtilsKt$throttle$1$1$1", f = "FlowUtils.kt", i = {}, l = {29, 30}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.facebookpay.coroutines.util.FlowUtilsKt$throttle$1$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass1Ek implements 0sL {
        public int A00;

        /* JADX WARNING: type inference failed for: r0v0, types: [X.4D7, com.facebookpay.coroutines.util.FlowUtilsKt$throttle$1$1$1] */
        public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r10) {
            long j = currentTimeMillis;
            0rl r3 = r9;
            int i = i;
            return new AnonymousClass1(obj2, r10, r3, r10, i, j);
        }

        /* JADX WARNING: type inference failed for: r7v0, types: [X.4D7, com.facebookpay.coroutines.util.FlowUtilsKt$throttle$1$1$1] */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0036 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                X.1Hj r6 = X.1Hj.A02
                int r0 = r7.A00
                r5 = 2
                r4 = 1
                if (r0 == 0) goto L_0x0010
                if (r0 == r4) goto L_0x0027
                X.0eS.A00(r8)
            L_0x000d:
                X.0gF r6 = X.C60340gF.A00
                return r6
            L_0x0010:
                X.0eS.A00(r8)
                long r2 = r12
                X.0rl r0 = r9
                long r0 = r0.A00
                long r2 = r2 - r0
                int r0 = r11
                long r0 = (long) r0
                long r2 = r2 + r0
                r7.A00 = r4
                java.lang.Object r0 = X.C241603Pv.A01(r7, r2)
                if (r0 != r6) goto L_0x002a
                return r6
            L_0x0027:
                X.0eS.A00(r8)
            L_0x002a:
                X.3pV r1 = r10
                java.lang.Object r0 = r7
                r7.A00 = r5
                java.lang.Object r0 = r1.ELH(r0, r7)
                if (r0 != r6) goto L_0x000d
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebookpay.coroutines.util.FlowUtilsKt$throttle$1$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowUtilsKt$throttle$1$1(AnonymousClass4D7 r2, 0rl r3, 0rm r4, C252683pV r5, int i) {
        super(2, r2);
        this.A04 = r3;
        this.A03 = i;
        this.A06 = r5;
        this.A05 = r4;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebookpay.coroutines.util.FlowUtilsKt$throttle$1$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r8) {
        0rl r2 = this.A04;
        int i = this.A03;
        AnonymousClass4D7 r1 = r8;
        ? flowUtilsKt$throttle$1$1 = new FlowUtilsKt$throttle$1$1(r1, r2, this.A05, this.A06, i);
        flowUtilsKt$throttle$1$1.A02 = obj;
        return flowUtilsKt$throttle$1$1;
    }

    /* JADX WARNING: type inference failed for: r14v0, types: [com.facebookpay.coroutines.util.FlowUtilsKt$throttle$1$1, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        final long currentTimeMillis;
        1Hj r4 = 1Hj.A02;
        if (this.A00 != 0) {
            currentTimeMillis = this.A01;
            0eS.A00(obj);
        } else {
            0eS.A00(obj);
            final Object obj2 = this.A02;
            currentTimeMillis = System.currentTimeMillis();
            final 0rl r9 = this.A04;
            final int i = this.A03;
            if (currentTimeMillis - r9.A00 > ((long) i)) {
                C252683pV r0 = this.A06;
                this.A01 = currentTimeMillis;
                this.A00 = 1;
                if (r0.ELH(obj2, this) == r4) {
                    return r4;
                }
            } else {
                0rm r1 = this.A05;
                C262204Co r02 = (C262204Co) r1.A00;
                if (r02 != null) {
                    r02.AG7((CancellationException) null);
                }
                final C252683pV r10 = this.A06;
                r1.A00 = 1Eo.A04(19B.A00, new AnonymousClass1((AnonymousClass4D7) null), r10);
                return C60340gF.A00;
            }
        }
        C262204Co r03 = (C262204Co) this.A05.A00;
        if (r03 != null) {
            r03.AG7((CancellationException) null);
        }
        this.A04.A00 = currentTimeMillis;
        return C60340gF.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FlowUtilsKt$throttle$1$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
