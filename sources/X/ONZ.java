package X;

import java.util.Map;

public final class ONZ {
    public final long A00;
    public final long A01;
    public final String A02;
    public final String A03;
    public final Map A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ONZ) {
                ONZ onz = (ONZ) obj;
                if (!0qQ.A0K(this.A03, onz.A03) || !0qQ.A0K(this.A02, onz.A02) || !0qQ.A0K(this.A04, onz.A04) || this.A01 != onz.A01 || this.A00 != onz.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A012 = AnonymousClass7TF.A01(this.A01, AnonymousClass7TF.A07(this.A04, AnonymousClass7TF.A08(this.A02, AnonymousClass7TE.A0O(this.A03))));
        long j = this.A00;
        return A012 + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EventData(type=");
        sb.append(this.A03);
        sb.append(", renderStateId=");
        sb.append(this.A02);
        sb.append(", attributes=");
        sb.append(this.A04);
        sb.append(", timestamp=");
        sb.append(this.A01);
        sb.append(", startTime=");
        sb.append(this.A00);
        return AnonymousClass7TG.A0p(sb);
    }

    public /* synthetic */ ONZ(String str, Map map, String str2) {
        long currentTimeMillis = System.currentTimeMillis();
        long nanoTime = System.nanoTime();
        this.A03 = str;
        this.A02 = str2;
        this.A04 = map;
        this.A01 = currentTimeMillis;
        this.A00 = nanoTime;
    }
}
