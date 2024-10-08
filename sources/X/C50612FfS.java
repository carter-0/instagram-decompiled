package X;

import com.instagram.fx.access.constants.FxcalAccountType;

/* renamed from: X.FfS  reason: case insensitive filesystem */
public final class C50612FfS implements G63 {
    public final /* bridge */ /* synthetic */ Object ClM(0lg r9, Object obj, String str, String str2, String str3, AnonymousClass4D7 r14) {
        QP8 qp8 = (QP8) obj;
        String str4 = qp8.A04;
        FxcalAccountType fxcalAccountType = (FxcalAccountType) qp8.A00;
        if (fxcalAccountType == null) {
            fxcalAccountType = FxcalAccountType.FACEBOOK;
        }
        return FHA.A0A(r9, FHA.A0G(fxcalAccountType, qp8.A01, qp8.A03), (Boolean) null, str4, str, str2, "aymh", (String) null).A00(1073842685, r14);
    }
}
