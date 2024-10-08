package X;

/* renamed from: X.4LD  reason: invalid class name */
public final class AnonymousClass4LD extends C250663lr implements AnonymousClass4LE {
    public final boolean BJ0() {
        return getCoercedBooleanField(0, "is_basic_ads_opted_in");
    }

    public final boolean BJ1() {
        return getCoercedBooleanField(2, "is_basic_ads_youth");
    }

    public final 1Az C7A() {
        return getOptionalEnumField(1, "tier", 1Az.A0B);
    }

    public final boolean CJw() {
        return hasFieldValue("is_basic_ads_opted_in");
    }

    public final boolean CJx() {
        return hasFieldValue("is_basic_ads_youth");
    }

    public final AnonymousClass4Kx modelSelectionSet() {
        AnonymousClass4LF r4 = AnonymousClass4LF.A00;
        return new AnonymousClass4Kx(new AnonymousClass4Kr[]{new AnonymousClass4L7(r4, "is_basic_ads_opted_in"), new AnonymousClass4L7(AnonymousClass4Kz.A00, "tier"), new AnonymousClass4L7(r4, "is_basic_ads_youth")});
    }

    public AnonymousClass4LD(int i) {
        super(i);
    }

    public AnonymousClass4LD() {
        super(19589305);
    }
}
