package X;

import com.facebook.proxygen.TraceFieldType;
import java.util.Map;

/* renamed from: X.4t5  reason: invalid class name and case insensitive filesystem */
public final class C276344t5 extends AnonymousClass475 {
    public final C284815Oa A00;
    public final String A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C276344t5(X.C284815Oa r2, java.lang.String r3) {
        /*
            r1 = this;
            r0 = 1
            X.0qQ.A0B(r3, r0)
            java.lang.String r0 = r2.A02
            X.0qQ.A06(r0)
            r1.<init>(r0)
            r1.A01 = r3
            r1.A00 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C276344t5.<init>(X.5Oa, java.lang.String):void");
    }

    public final int A00() {
        return 2;
    }

    public final Map A01() {
        0eP r6 = new 0eP("video_id", this.A01);
        C284815Oa r2 = this.A00;
        return 0Yt.A06(new 0eP[]{r6, new 0eP(AnonymousClass000.A00(34), r2.A01.name()), new 0eP(TraceFieldType.ErrorCode, r2.A00.name()), new 0eP("error_message", r2.A02), new 0eP("proxy_status", r2.A03)});
    }

    public final void A02(StringBuilder sb) {
        sb.append(this.A01);
        sb.append("|");
        C284815Oa r1 = this.A00;
        sb.append(r1.A01);
        sb.append("|");
        sb.append(r1.A00);
        sb.append("|");
        sb.append(r1.A02);
        sb.append("|");
        sb.append(r1.A03);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("video(");
        sb.append(this.A01);
        sb.append(") had a playback error: ");
        C284815Oa r2 = this.A00;
        sb.append(r2.A01);
        sb.append(':');
        sb.append(r2.A00);
        sb.append(':');
        sb.append(r2.A02);
        sb.append(':');
        sb.append(r2.A03);
        sb.append(' ');
        return sb.toString();
    }
}
