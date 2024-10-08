package X;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import java.util.Arrays;

/* renamed from: X.6FW  reason: invalid class name */
public abstract class AnonymousClass6FW {
    public static final C284945Oz A00(C286575Wy r15, 07U r16, AnonymousClass07V r17, Object obj, C262094Cc r19, AnonymousClass0r6 r20, int i) {
        r15.ExT(1977777920);
        if (0fL.A02()) {
            0fL.A01(1574164650, "androidx.lifecycle.compose.collectAsStateWithLifecycle (FlowExt.kt:169)");
        }
        boolean z = false;
        07U r10 = r16;
        AnonymousClass07V r11 = r17;
        C262094Cc r13 = r19;
        AnonymousClass0r6 r14 = r20;
        Object[] objArr = {r14, r11, r10, r13};
        r15.ExT(710004817);
        boolean AGw = r15.AGw(r11);
        int i2 = i;
        if ((((i2 & 7168) ^ 3072) > 2048 && r15.AGu(r10)) || (i2 & 3072) == 2048) {
            z = true;
        }
        boolean AGw2 = z | AGw | r15.AGw(r13) | r15.AGw(r14);
        Object ECw = r15.ECw();
        if (AGw2 || ECw == AnonymousClass5XT.A00) {
            ECw = new AnonymousClass9KP(r10, r11, (AnonymousClass4D7) null, r13, r14);
            r15.FLL(ECw);
        }
        C286565Wx r5 = (C286565Wx) r15;
        C286565Wx.A0L(r5, false);
        if (0fL.A02()) {
            0fL.A01(1195955882, "androidx.compose.runtime.produceState (ProduceState.kt:214)");
        }
        Object ECw2 = r15.ECw();
        Object obj2 = AnonymousClass5XT.A00;
        if (ECw2 == obj2) {
            C284885Or r1 = C284885Or.A00;
            0qQ.A0C(r1, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
            AnonymousClass0eM r0 = C284905Ot.A01;
            ECw2 = new ParcelableSnapshotMutableState(r1, obj);
            r5.A0Q(ECw2);
        }
        C284945Oz r3 = (C284945Oz) ECw2;
        Object[] copyOf = Arrays.copyOf(objArr, 4);
        boolean AGw3 = r15.AGw(ECw);
        Object ECw3 = r15.ECw();
        if (AGw3 || ECw3 == obj2) {
            ECw3 = new MHP(ECw, (Object) r3, (AnonymousClass4D7) null, 17);
            r15.FLL(ECw3);
        }
        C286645Xf.A07(r15, (0sL) ECw3, copyOf);
        if (0fL.A02()) {
            0fL.A00(619777764);
        }
        if (0fL.A02()) {
            0fL.A00(1224249212);
        }
        C286565Wx.A0L(r5, false);
        return r3;
    }

    public static final C270284gU A01(C286575Wy r10, Object obj, AnonymousClass0r6 r12, int i) {
        C286575Wy r4 = r10;
        r10.ExT(-1485997211);
        C286565Wx r3 = (C286565Wx) r4;
        AnonymousClass07Z r2 = (AnonymousClass07Z) C286615Xc.A01(AnonymousClass5YV.A00, C286565Wx.A04(r3));
        07U r5 = 07U.A05;
        19B r8 = 19B.A00;
        if (0fL.A02()) {
            0fL.A01(1946537185, "androidx.lifecycle.compose.collectAsStateWithLifecycle (FlowExt.kt:133)");
        }
        C284945Oz A00 = A00(r4, r5, r2.getLifecycle(), obj, r8, r12, (i & 14) | (((i >> 3) & 8) << 3) | (i & 112) | (i & 7168) | (i & 57344));
        if (0fL.A02()) {
            0fL.A00(-929311021);
        }
        C286565Wx.A0L(r3, false);
        return A00;
    }

    public static final C270284gU A02(C286575Wy r9, AnonymousClass0Ud r10, int i) {
        C286575Wy r4 = r9;
        r9.ExT(743249048);
        C286565Wx r3 = (C286565Wx) r4;
        AnonymousClass07Z r2 = (AnonymousClass07Z) C286615Xc.A01(AnonymousClass5YV.A00, C286565Wx.A04(r3));
        07U r5 = 07U.A05;
        19B r8 = 19B.A00;
        if (0fL.A02()) {
            0fL.A01(-940507653, "androidx.lifecycle.compose.collectAsStateWithLifecycle (FlowExt.kt:60)");
        }
        Object value = r10.getValue();
        int i2 = i << 3;
        C284945Oz A00 = A00(r4, r5, r2.getLifecycle(), value, r8, r10, (i & 14) | (i2 & 7168) | (i2 & 57344));
        if (0fL.A02()) {
            0fL.A00(-400038336);
        }
        C286565Wx.A0L(r3, false);
        return A00;
    }
}
