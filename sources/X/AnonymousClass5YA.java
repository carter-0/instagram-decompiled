package X;

import androidx.compose.ui.platform.AndroidComposeView;

/* renamed from: X.5YA  reason: invalid class name */
public abstract class AnonymousClass5YA {
    public static final C267314bM A00 = new C267304bL(AnonymousClass5YE.A00);
    public static final C267314bM A01 = new C267304bL(AnonymousClass5YG.A00);
    public static final C267314bM A02 = new C267304bL(AnonymousClass5YH.A00);
    public static final C267314bM A03 = new C267304bL(AnonymousClass5YJ.A00);
    public static final C267314bM A04 = new C267304bL(AnonymousClass5YF.A00);
    public static final C267314bM A05 = new C267304bL(AnonymousClass5YK.A00);
    public static final C267314bM A06 = new C267304bL(AnonymousClass5YL.A00);
    public static final C267314bM A07 = new C267304bL(AnonymousClass5YM.A00);
    public static final C267314bM A08 = new C267304bL(AnonymousClass5YT.A00);
    public static final C267314bM A09;
    public static final C267314bM A0A = new C267304bL(AnonymousClass5YO.A00);
    public static final C267314bM A0B = new C267304bL(AnonymousClass5YP.A00);
    public static final C267314bM A0C = new C267304bL(AnonymousClass5YQ.A00);
    public static final C267314bM A0D = new C267304bL(AnonymousClass5YR.A00);
    public static final C267314bM A0E = new C267304bL(AnonymousClass5YS.A00);
    public static final C267314bM A0F = new C267304bL(AnonymousClass5YB.A00);
    public static final C267314bM A0G = new C267304bL(AnonymousClass5YC.A00);
    public static final C267314bM A0H = new C267304bL(AnonymousClass5YD.A00);
    public static final C267314bM A0I = new C267304bL(AnonymousClass5YI.A00);
    public static final C267314bM A0J = new C267304bL(AnonymousClass5YN.A00);

    /* JADX WARNING: type inference failed for: r0v0, types: [X.4bM, X.4bL] */
    /* JADX WARNING: type inference failed for: r0v1, types: [X.4bM, X.4bL] */
    /* JADX WARNING: type inference failed for: r0v2, types: [X.4bM, X.4bL] */
    /* JADX WARNING: type inference failed for: r0v3, types: [X.4bM, X.4bL] */
    /* JADX WARNING: type inference failed for: r0v4, types: [X.4bM, X.4bL] */
    /* JADX WARNING: type inference failed for: r0v5, types: [X.4bM, X.4bL] */
    /* JADX WARNING: type inference failed for: r0v6, types: [X.4bM, X.4bL] */
    /* JADX WARNING: type inference failed for: r0v7, types: [X.4bM, X.4bL] */
    /* JADX WARNING: type inference failed for: r0v8, types: [X.4bM, X.4bL] */
    /* JADX WARNING: type inference failed for: r0v9, types: [X.4bM, X.4bL] */
    /* JADX WARNING: type inference failed for: r0v10, types: [X.4bM, X.4bL] */
    /* JADX WARNING: type inference failed for: r0v11, types: [X.4bM, X.4bL] */
    /* JADX WARNING: type inference failed for: r0v12, types: [X.4bM, X.4bL] */
    /* JADX WARNING: type inference failed for: r0v13, types: [X.4bM, X.4bL] */
    /* JADX WARNING: type inference failed for: r0v14, types: [X.4bM, X.4bL] */
    /* JADX WARNING: type inference failed for: r0v15, types: [X.4bM, X.4bL] */
    /* JADX WARNING: type inference failed for: r0v16, types: [X.4bM, X.4bL] */
    /* JADX WARNING: type inference failed for: r0v17, types: [X.4bM, X.4bL] */
    /* JADX WARNING: type inference failed for: r0v18, types: [X.4bM, X.4bL] */
    static {
        AnonymousClass5YU r2 = AnonymousClass5YU.A00;
        C284885Or r1 = C284885Or.A00;
        0qQ.A0C(r1, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        A09 = new C286765Xs(r1, r2);
    }

    public static final /* synthetic */ void A01(String str) {
        throw new IllegalStateException(002.A0g("CompositionLocal ", str, " not present"));
    }

    public static final void A00(C286575Wy r31, C268124co r32, C286835Xz r33, 0sL r34, int i) {
        int i2;
        boolean AGw;
        boolean AGw2;
        C286575Wy r2 = r31;
        r2.ExV(874662829);
        int i3 = i;
        C268124co r7 = r32;
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                AGw2 = r2.AGu(r7);
            } else {
                AGw2 = r2.AGw(r7);
            }
            int i4 = 2;
            if (AGw2) {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i3;
        }
        C286835Xz r6 = r33;
        if ((i & 48) == 0) {
            if ((i & 64) == 0) {
                AGw = r2.AGu(r6);
            } else {
                AGw = r2.AGw(r6);
            }
            int i5 = 16;
            if (AGw) {
                i5 = 32;
            }
            i2 |= i5;
        }
        0sL r10 = r34;
        if ((i3 & 384) == 0) {
            int i6 = 128;
            if (r2.AGw(r10)) {
                i6 = 256;
            }
            i2 |= i6;
        }
        if ((i2 & 147) != 146 || !r2.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(2047210048, "androidx.compose.ui.platform.ProvideCommonCompositionLocals (CompositionLocals.kt:214)");
            }
            AndroidComposeView androidComposeView = (AndroidComposeView) r7;
            C286705Xl A022 = A0F.A02(androidComposeView.A0c);
            C286705Xl A023 = A0G.A02(androidComposeView.A0P);
            C286705Xl A024 = A0H.A02(androidComposeView.A0Q);
            C286705Xl A025 = A00.A02(androidComposeView.A0d);
            C286705Xl A026 = A01.A02(r7.getDensity());
            C286705Xl A027 = A02.A02(androidComposeView.A0S);
            C286705Xl A028 = A0I.A02(androidComposeView.A0m);
            A028.A00 = false;
            C286705Xl A029 = A03.A02(r7.getFontFamilyResolver());
            A029.A00 = false;
            C286715Xm.A01(r2, r10, new C286705Xl[]{A022, A023, A024, A025, A026, A027, A028, A029, A05.A02(androidComposeView.A0U), A06.A02(androidComposeView.A0V), A07.A02(r7.getLayoutDirection()), A0J.A02(androidComposeView.A0n), A0A.A02(androidComposeView.A0h), A0B.A02(androidComposeView.A0i), A0C.A02(r6), A0D.A02(androidComposeView.A0j), A0E.A02(androidComposeView.A0k), A08.A02(androidComposeView.A0W), A04.A02(androidComposeView.A0T)}, ((i2 >> 3) & 112) | 8);
            if (0fL.A02()) {
                0fL.A00(-903877637);
            }
        } else {
            r2.Evl();
        }
        C286625Xd ASQ = r2.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new AnonymousClass9MK(i3, 2, r6, r7, r34);
        }
    }
}
