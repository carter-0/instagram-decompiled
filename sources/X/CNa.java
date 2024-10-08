package X;

import com.instagram.api.schemas.ProfileGridItemTypeEnum;
import com.instagram.feed.media.ImmutablePandoMediaDict;

public final class CNa extends 17P implements C46231DRm {
    public final UNQ F8A(1E9 r6) {
        AnonymousClass3HX r3;
        AnonymousClass3HY r0 = (AnonymousClass3HY) A05(-681210700, C44024CRg.class);
        1Xj r4 = null;
        if (r0 != null) {
            r3 = r0.FEq(r6);
        } else {
            r3 = null;
        }
        ProfileGridItemTypeEnum profileGridItemTypeEnum = (ProfileGridItemTypeEnum) A0N(-2141142810, C20732Wy5.A00);
        ImmutablePandoMediaDict immutablePandoMediaDict = (ImmutablePandoMediaDict) A05(103772132, ImmutablePandoMediaDict.class);
        if (immutablePandoMediaDict != null) {
            1Xv r02 = 1Xj.A0h;
            1Xj A00 = 1Xv.A00(r6, immutablePandoMediaDict);
            if (A00 != null) {
                r4 = C41846B3n.A0Y(r6, A00);
            }
        }
        return new UNQ(profileGridItemTypeEnum, r4, r3);
    }
}
