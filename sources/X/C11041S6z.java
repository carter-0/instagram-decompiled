package X;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: X.S6z  reason: case insensitive filesystem */
public final class C11041S6z {
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public RF9 A04;
    public File A05;
    public String A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !DbY.A1b(this, obj)) {
                return false;
            }
            C11041S6z s6z = (C11041S6z) obj;
            if (!(this.A02 == s6z.A02 && this.A03 == s6z.A03 && 0qQ.A0K(this.A05.getPath(), s6z.A05.getPath()) && this.A04 == s6z.A04 && 0qQ.A0K(this.A06, s6z.A06) && this.A00 == s6z.A00 && this.A01 == s6z.A01)) {
                return false;
            }
        }
        return true;
    }

    public C11041S6z(JSONObject jSONObject) {
        RF9 rf9;
        RC3 rc3 = new RC3(jSONObject.getString("filePath"), false);
        long parseLong = Long.parseLong(Pxe.A0y("mFileSize", jSONObject));
        int A08 = Pxg.A08("mSegmentType", jSONObject);
        if (A08 == 1) {
            rf9 = RF9.Audio;
        } else if (A08 != 2) {
            rf9 = RF9.Mixed;
        } else {
            rf9 = RF9.Video;
        }
        String A0y = Pxe.A0y("mMimeType", jSONObject);
        long parseLong2 = Long.parseLong(Pxe.A0y("mSegmentStartOffset", jSONObject));
        int A082 = Pxg.A08("mSegmentId", jSONObject);
        long parseLong3 = Long.parseLong(Pxe.A0y("mEstimatedFileSize", jSONObject));
        this.A05 = rc3;
        this.A02 = parseLong;
        this.A04 = rf9;
        this.A06 = A0y;
        this.A03 = parseLong2;
        this.A00 = A082;
        this.A01 = parseLong3;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A05, Long.valueOf(this.A02), this.A04, this.A06, Long.valueOf(this.A03), Integer.valueOf(this.A00), Long.valueOf(this.A01)});
    }

    public final JSONObject A00() {
        JSONObject A11 = DbS.A11();
        A11.put("filePath", this.A05.getPath());
        A11.put("mFileSize", this.A02);
        A11.put("mSegmentType", this.A04.A00);
        A11.put("mMimeType", this.A06);
        A11.put("mSegmentStartOffset", this.A03);
        A11.put("mSegmentId", this.A00);
        A11.put("mEstimatedFileSize", this.A01);
        return A11;
    }

    public final String toString() {
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("mSegmentType", this.A04.name());
        A1E.put("filePath", JTP.A0t(this.A05));
        A1E.put("mFileSize", String.valueOf(this.A02));
        A1E.put("mMimeType", this.A06);
        A1E.put("mSegmentStartOffset", String.valueOf(this.A03));
        A1E.put("mSegmentId", String.valueOf(this.A00));
        A1E.put("mEstimatedFileSize", String.valueOf(this.A01));
        return A1E.toString();
    }
}
