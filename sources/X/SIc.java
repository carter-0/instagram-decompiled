package X;

import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableList;

public final class SIc {
    public static final SIc A08 = new SIc(new Object(), new Object(), (C10995S4p) null, C10975S3j.A00, C21979XoR.A0W, "");
    public final RRB A00;
    @Deprecated
    public final C7435QDa A01;
    public final C10971S3d A02;
    public final C10995S4p A03;
    @Deprecated
    public final C10995S4p A04;
    public final C10975S3j A05;
    public final C21979XoR A06;
    public final String A07;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.QDa, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v0, types: [X.S3d, java.lang.Object] */
    static {
        ImmutableList.of();
        ImmutableList.of();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SIc)) {
            return false;
        }
        SIc sIc = (SIc) obj;
        return Util.A0E(this.A07, sIc.A07) && this.A00.equals(sIc.A00) && Util.A0E(this.A03, sIc.A03) && Util.A0E(this.A02, sIc.A02) && Util.A0E(this.A06, sIc.A06) && Util.A0E(this.A05, sIc.A05);
    }

    public final int hashCode() {
        return AnonymousClass7TF.A07(this.A06, AnonymousClass7TF.A07(this.A00, AnonymousClass7TF.A07(this.A02, (AnonymousClass7TE.A0O(this.A07) + C51971G9r.A0E(this.A03)) * 31)));
    }

    public SIc(C7435QDa qDa, C10971S3d s3d, C10995S4p s4p, C10975S3j s3j, C21979XoR xoR, String str) {
        this.A07 = str;
        this.A03 = s4p;
        this.A04 = s4p;
        this.A02 = s3d;
        this.A06 = xoR;
        this.A00 = qDa;
        this.A01 = qDa;
        this.A05 = s3j;
    }
}
