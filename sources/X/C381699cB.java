package X;

/* renamed from: X.9cB  reason: invalid class name and case insensitive filesystem */
public final class C381699cB extends AnonymousClass0T0 {
    public int A00 = 0;
    public long A01 = 0;
    public String A02 = null;
    public String A03 = null;
    public String A04 = null;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C381699cB) {
                C381699cB r8 = (C381699cB) obj;
                if (!0qQ.A0K(this.A04, r8.A04) || this.A00 != r8.A00 || !0qQ.A0K(this.A02, r8.A02) || !0qQ.A0K(this.A03, r8.A03) || this.A01 != r8.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int A0E = ((((AnonymousClass7TG.A0E(this.A04) * 31) + this.A00) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31;
        String str = this.A03;
        if (str != null) {
            i = str.hashCode();
        }
        long j = this.A01;
        return ((A0E + i) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ClipsSoundEffectInfo(sfxName=");
        A1A.append(this.A04);
        A1A.append(", effectDurationMs=");
        A1A.append(this.A00);
        A1A.append(", audioAssetId=");
        A1A.append(this.A02);
        A1A.append(C273654mx.A00(1036));
        A1A.append(this.A03);
        A1A.append(", startTimeMs=");
        A1A.append(this.A01);
        return AnonymousClass7TG.A0p(A1A);
    }
}
