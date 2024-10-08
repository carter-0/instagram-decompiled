package X;

/* renamed from: X.WWq  reason: case insensitive filesystem */
public final class C19375WWq implements AnonymousClass4DU {
    public static final String __redex_internal_original_name = "MiniBloksProductSaveButtonBinderUtils$1$1";
    public final /* synthetic */ C15663UgT A00;
    public final /* synthetic */ C307786Rm A01;
    public final /* synthetic */ C276544tV A02;

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public C19375WWq(C15663UgT ugT, C307786Rm r2, C276544tV r3) {
        this.A00 = ugT;
        this.A02 = r3;
        this.A01 = r2;
    }

    public final String getModuleName() {
        C276544tV r2 = this.A02;
        String moduleName = C308206Td.A07(this.A01).getModuleName();
        String A0E = r2.A0E();
        if (A0E != null) {
            return A0E;
        }
        return moduleName;
    }
}
