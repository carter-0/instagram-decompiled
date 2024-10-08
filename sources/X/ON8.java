package X;

public final class ON8 {
    public final Integer A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof ON8) && this.A00 == ((ON8) obj).A00);
    }

    public final int hashCode() {
        Integer num = this.A00;
        return C51971G9r.A0D(num, C69686Nq8.A00(num));
    }

    public final String toString() {
        return G9w.A0k("EncryptedBackupUserPreferences(onboardingDecision=", C69686Nq8.A00(this.A00));
    }

    public ON8(Integer num) {
        this.A00 = num;
    }
}
