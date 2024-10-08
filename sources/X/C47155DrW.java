package X;

import com.instagram.api.schemas.UserMonetizationProductType;
import java.util.List;

/* renamed from: X.DrW  reason: case insensitive filesystem */
public final class C47155DrW extends AnonymousClass0T0 {
    public final C47143DrK A00;
    public final UserMonetizationProductType A01;
    public final List A02;
    public final C61084JwM A03;
    public final Cb5 A04;

    public C47155DrW(C61084JwM jwM, Cb5 cb5, C47143DrK drK, UserMonetizationProductType userMonetizationProductType, List list) {
        AnonymousClass7TF.A1D(list, 2, userMonetizationProductType);
        this.A03 = jwM;
        this.A02 = list;
        this.A04 = cb5;
        this.A01 = userMonetizationProductType;
        this.A00 = drK;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47155DrW) {
                C47155DrW drW = (C47155DrW) obj;
                if (!0qQ.A0K(this.A03, drW.A03) || !0qQ.A0K(this.A02, drW.A02) || !0qQ.A0K(this.A04, drW.A04) || this.A01 != drW.A01 || !0qQ.A0K(this.A00, drW.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0C = AnonymousClass7TG.A0C(this.A03) * 31;
        return AnonymousClass7TF.A07(this.A01, (AnonymousClass7TF.A07(this.A02, A0C) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TE.A0L(this.A00);
    }
}
