package X;

import com.google.common.collect.ImmutableList;

public final class Q2I extends C250663lr implements C74558Px2 {
    public final C67553Mpn AYY() {
        return (C67553Mpn) getOptionalEnumField(0, "action_type", C67553Mpn.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
    }

    public final ImmutableList BNm() {
        return getRequiredCompactedEnumListField(1, "locations", C67554Mpo.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
    }

    public final AnonymousClass4Kx modelSelectionSet() {
        return AnonymousClass7TG.A0V(AnonymousClass4Kz.A02(), AnonymousClass7TE.A0f(AnonymousClass4Kz.A00, "action_type"), "locations");
    }

    public Q2I(int i) {
        super(i);
    }

    public Q2I() {
        super(960801641);
    }
}
