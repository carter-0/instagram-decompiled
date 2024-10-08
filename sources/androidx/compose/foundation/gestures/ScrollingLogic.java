package androidx.compose.foundation.gestures;

import X.0sL;
import X.0sP;
import X.1Hj;
import X.AnonymousClass4D7;
import X.AnonymousClass6Gj;
import X.AnonymousClass6H1;
import X.AnonymousClass6HS;
import X.AnonymousClass6IW;
import X.AnonymousClass9KF;
import X.AnonymousClass9L6;
import X.C289295dM;
import X.C289325dP;
import X.C305096Gn;
import X.C305386Hs;
import X.C54609HKs;
import X.C60340gF;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollNode;

public final class ScrollingLogic {
    public int A00 = 1;
    public C305386Hs A01;
    public AnonymousClass6HS A02;
    public AnonymousClass6Gj A03;
    public AnonymousClass6H1 A04 = ScrollableKt.A00;
    public C305096Gn A05;
    public NestedScrollDispatcher A06;
    public boolean A07;
    public final AnonymousClass6IW A08 = new AnonymousClass6IW(this);
    public final 0sP A09 = new AnonymousClass9L6(this, 11);

    public final long A02(float f) {
        if (f == 0.0f) {
            return 0;
        }
        if (this.A03 == AnonymousClass6Gj.Horizontal) {
            return C289325dP.A00(f, 0.0f);
        }
        return C289325dP.A00(0.0f, f);
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.9JX, X.4D7] */
    /* JADX WARNING: type inference failed for: r8v0, types: [X.0rl, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A04(X.AnonymousClass4D7 r12, long r13) {
        /*
            r11 = this;
            r4 = 1
            boolean r0 = X.AnonymousClass9JX.A00(r4, r12)
            r6 = r11
            if (r0 == 0) goto L_0x004d
            r3 = r12
            X.9JX r3 = (X.AnonymousClass9JX) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x004d
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r3.A02
            X.1Hj r2 = X.1Hj.A02
            int r0 = r3.A00
            if (r0 == 0) goto L_0x002f
            if (r0 != r4) goto L_0x0053
            java.lang.Object r8 = r3.A01
            X.0rl r8 = (X.0rl) r8
            X.0eS.A00(r1)
        L_0x0027:
            long r0 = r8.A00
            X.GQ9 r2 = new X.GQ9
            r2.<init>(r0)
            return r2
        L_0x002f:
            X.0eS.A00(r1)
            X.0rl r8 = new X.0rl
            r8.<init>()
            r9 = r13
            r8.A00 = r13
            X.HKs r0 = X.C54609HKs.A01
            r7 = 0
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2 r5 = new androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2
            r5.<init>(r6, r7, r8, r9)
            r3.A01 = r8
            r3.A00 = r4
            java.lang.Object r0 = r11.A03(r0, r3, r5)
            if (r0 != r2) goto L_0x0027
            return r2
        L_0x004d:
            X.9JX r3 = new X.9JX
            r3.<init>(r11, r12, r4)
            goto L_0x0016
        L_0x0053:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollingLogic.A04(X.4D7, long):java.lang.Object");
    }

    public static final long A00(AnonymousClass6H1 r12, ScrollingLogic scrollingLogic, int i, long j) {
        long j2;
        long j3;
        NestedScrollNode A002 = scrollingLogic.A06.A00();
        int i2 = i;
        long j4 = j;
        if (A002 != null) {
            j2 = A002.DYf(j4, i);
        } else {
            j2 = 0;
        }
        long A062 = C289295dM.A06(j4, j2);
        int i3 = 2;
        if (scrollingLogic.A03 == AnonymousClass6Gj.Horizontal) {
            i3 = 1;
        }
        long A032 = C289295dM.A03(0.0f, i3, A062);
        if (scrollingLogic.A07) {
            A032 = C289295dM.A05(-1.0f, A032);
        }
        long A022 = scrollingLogic.A02(r12.EKW(scrollingLogic.A01(A032)));
        if (scrollingLogic.A07) {
            A022 = C289295dM.A05(-1.0f, A022);
        }
        long A063 = C289295dM.A06(A062, A022);
        NestedScrollNode A003 = scrollingLogic.A06.A00();
        if (A003 != null) {
            j3 = A003.DYX(A022, A063, i2);
        } else {
            j3 = 0;
        }
        return C289295dM.A07(C289295dM.A07(j2, A022), j3);
    }

    public final float A01(long j) {
        if (this.A03 == AnonymousClass6Gj.Horizontal) {
            return C289295dM.A01(j);
        }
        return C289295dM.A02(j);
    }

    public final Object A03(C54609HKs hKs, AnonymousClass4D7 r6, 0sL r7) {
        Object EKT = this.A05.EKT(hKs, r6, new AnonymousClass9KF((Object) r7, (AnonymousClass4D7) null, (Object) this, 3));
        if (EKT != 1Hj.A02) {
            return C60340gF.A00;
        }
        return EKT;
    }

    public ScrollingLogic(C305386Hs r3, AnonymousClass6HS r4, AnonymousClass6Gj r5, C305096Gn r6, NestedScrollDispatcher nestedScrollDispatcher, boolean z) {
        this.A05 = r6;
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = r5;
        this.A07 = z;
        this.A06 = nestedScrollDispatcher;
    }
}
