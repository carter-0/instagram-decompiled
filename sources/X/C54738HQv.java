package X;

/* renamed from: X.HQv  reason: case insensitive filesystem */
public abstract class C54738HQv {
    public static final C284945Oz A00(C287615aU r6, C286575Wy r7, int i) {
        if (0fL.A02()) {
            0fL.A01(817983922, "androidx.compose.foundation.interaction.collectIsPressedAsState (PressInteraction.kt:83)");
        }
        Object ECw = r7.ECw();
        Object obj = AnonymousClass5XT.A00;
        boolean z = false;
        C284945Oz r2 = (C284945Oz) C51974G9v.A0Z(r7, ECw, obj, false);
        if ((((i & 14) ^ 6) > 4 && r7.AGu(r6)) || (i & 6) == 4) {
            z = true;
        }
        Object ECw2 = r7.ECw();
        if (z || ECw2 == obj) {
            ECw2 = new MH2((Object) r6, (Object) r2, (AnonymousClass4D7) null, 5);
            r7.FLL(ECw2);
        }
        C286645Xf.A04(r7, r6, (0sL) ECw2);
        if (0fL.A02()) {
            0fL.A00(-1743438095);
        }
        return r2;
    }
}
