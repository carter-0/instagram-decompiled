package X;

public final class ONR {
    public final BTE A00;
    public final BTG A01;
    public final BTH A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ONR) {
                ONR onr = (ONR) obj;
                if (!0qQ.A0K(this.A00, onr.A00) || !0qQ.A0K(this.A02, onr.A02) || !0qQ.A0K(this.A01, onr.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31 * 31;
    }

    public ONR(BTE bte, BTG btg, BTH bth) {
        this.A00 = bte;
        this.A02 = bth;
        this.A01 = btg;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("FetchBackupGraphQLResponse(backup=");
        A1A.append(this.A00);
        A1A.append(", userPreferences=");
        A1A.append(this.A02);
        A1A.append(", user=");
        A1A.append(this.A01);
        A1A.append(", onboardingSoftNuxTimestamp=");
        A1A.append((Object) null);
        A1A.append(", onboardingHardNuxTimestamp=");
        return AnonymousClass7TG.A0n((Object) null, A1A);
    }
}
