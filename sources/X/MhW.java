package X;

public abstract class MhW {
    public static final AnonymousClass4AA A00(AnonymousClass4UE r2) {
        String str;
        if (r2 == null) {
            return null;
        }
        AnonymousClass4UC r22 = (AnonymousClass4UC) r2;
        String str2 = r22.A09.A00;
        switch (str2.hashCode()) {
            case -1285049338:
                if (str2.equals("fixed_banner_ig")) {
                    return new NP3(r22);
                }
                break;
            case 453021476:
                str = "condensed_megaphone";
                break;
            case 897282998:
                if (str2.equals("inline_editing_standard_megaphone_ig")) {
                    return new EGX(r22);
                }
                break;
            case 1219174331:
                str = "social_context_condensed_megaphone_ig";
                break;
        }
        if (str2.equals(str)) {
            return new NP2(r22);
        }
        return new NP4(r22);
    }
}
