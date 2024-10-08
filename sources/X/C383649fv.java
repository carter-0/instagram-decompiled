package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.9fv  reason: invalid class name and case insensitive filesystem */
public final class C383649fv extends C250663lr implements C348577yg {
    public final ImmutableList AlI() {
        return getRequiredCompactedTreeListField(5, "capabilities_min_version_models", C383609fr.class, 1497816082);
    }

    public final String BOu() {
        return A09("manifest_json");
    }

    public final C348597yi Ba7() {
        return (C348597yi) getOptionalTreeField(3, AnonymousClass000.A00(733), C383639fu.class, -1040728851);
    }

    public final boolean CDA() {
        return getCoercedBooleanField(8, "uses_flm_capability");
    }

    public final String getId() {
        return A07("strong_id__");
    }

    public final AnonymousClass4Kx modelSelectionSet() {
        AnonymousClass4Kz r4 = AnonymousClass4Kz.A00;
        AnonymousClass4L7 A0I = AnonymousClass7TF.A0I(r4);
        AnonymousClass4Kp r6 = new AnonymousClass4Kp(AnonymousClass4Ks.A02(), C383619fs.class, "effect_instructions", 1937911875);
        AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(r4, "manifest_json");
        AnonymousClass4Kp r8 = new AnonymousClass4Kp(C383639fu.class, AnonymousClass000.A00(733), -1040728851);
        AnonymousClass4L7 A0f2 = AnonymousClass7TE.A0f(r4, "required_sdk_version");
        AnonymousClass4Kp r10 = new AnonymousClass4Kp(AnonymousClass4Ks.A02(), C383609fr.class, "capabilities_min_version_models", 1497816082);
        AnonymousClass4LF r1 = AnonymousClass4LF.A00;
        return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0I, r6, A0f, r8, A0f2, r10, AnonymousClass7TE.A0f(r1, "is_network_consent_required"), AnonymousClass7TE.A0f(r1, AnonymousClass000.A00(3469)), AnonymousClass7TE.A0f(r1, "uses_flm_capability")});
    }

    public C383649fv(int i) {
        super(i);
    }

    public C383649fv() {
        super(945878766);
    }
}
