package X;

import java.util.Arrays;

/* renamed from: X.9Af  reason: invalid class name and case insensitive filesystem */
public final class C374639Af extends AnonymousClass99T {
    public final AnonymousClass99T A00;
    public final C39881ADd A01;
    public final String A02;
    public final C39882ADe A03;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C374639Af)) {
            return false;
        }
        C374639Af r4 = (C374639Af) obj;
        if (!r4.A03.equals(this.A03) || !r4.A00.equals(this.A00) || !r4.A02.equals(this.A02) || !r4.A01.equals(this.A01)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{C374639Af.class, this.A02, this.A03, this.A00, this.A01});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LegacyKmsEnvelopeAead Parameters (kekUri: ");
        sb.append(this.A02);
        sb.append(", dekParsingStrategy: ");
        sb.append(this.A03);
        sb.append(", dekParametersForNewKeys: ");
        sb.append(this.A00);
        sb.append(", variant: ");
        sb.append(this.A01);
        sb.append(")");
        return sb.toString();
    }

    public C374639Af(AnonymousClass99T r1, C39882ADe aDe, C39881ADd aDd, String str) {
        this.A01 = aDd;
        this.A02 = str;
        this.A03 = aDe;
        this.A00 = r1;
    }
}
