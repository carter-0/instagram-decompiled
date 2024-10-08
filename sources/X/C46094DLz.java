package X;

import com.instagram.api.schemas.FundraiserVisibilityOnProfileStatus;

/* renamed from: X.DLz  reason: case insensitive filesystem */
public final class C46094DLz extends 0Yg implements 0sP {
    public static final C46094DLz A00 = new C46094DLz();

    public C46094DLz() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = FundraiserVisibilityOnProfileStatus.A01.get(obj);
        if (obj2 == null) {
            return FundraiserVisibilityOnProfileStatus.UNRECOGNIZED;
        }
        return obj2;
    }
}
