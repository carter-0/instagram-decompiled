package X;

import com.instagram.api.schemas.BeneficiaryType;

/* renamed from: X.DLw  reason: case insensitive filesystem */
public final class C46091DLw extends 0Yg implements 0sP {
    public static final C46091DLw A00 = new C46091DLw();

    public C46091DLw() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = BeneficiaryType.A01.get(obj);
        if (obj2 == null) {
            return BeneficiaryType.UNRECOGNIZED;
        }
        return obj2;
    }
}
