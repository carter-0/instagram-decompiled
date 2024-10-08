package X;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: X.SJc  reason: case insensitive filesystem */
public final class C11284SJc {
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final RF9 A04;
    public final File A05;
    public final String A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !DbY.A1b(this, obj)) {
                return false;
            }
            C11284SJc sJc = (C11284SJc) obj;
            long j = this.A02;
            long j2 = sJc.A02;
            return (j == -1 || j2 == -1 || j == j2) && this.A03 == sJc.A03 && 0qQ.A0K(this.A05.getPath(), sJc.A05.getPath()) && this.A04 == sJc.A04 && this.A00 == sJc.A00 && 0qQ.A0K(this.A06, sJc.A06) && this.A01 == sJc.A01;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A05, this.A04, Integer.valueOf(this.A00), this.A06, Long.valueOf(this.A03), Long.valueOf(this.A01)});
    }

    public C11284SJc(JSONObject jSONObject) {
        RF9 rf9;
        this.A05 = AnonymousClass7TE.A0t(jSONObject.getString("filePath"));
        this.A02 = Long.parseLong(Pxe.A0y("mFileSize", jSONObject));
        int A08 = Pxg.A08("mSegmentType", jSONObject);
        if (A08 == 1) {
            rf9 = RF9.Audio;
        } else if (A08 != 2) {
            rf9 = RF9.Mixed;
        } else {
            rf9 = RF9.Video;
        }
        this.A04 = rf9;
        this.A00 = Pxg.A08("mSegmentId", jSONObject);
        this.A06 = Pxe.A0y("mMimeType", jSONObject);
        this.A03 = Long.parseLong(Pxe.A0y("mSegmentStartOffset", jSONObject));
        this.A01 = Long.parseLong(Pxe.A0y("mEstimatedFileSize", jSONObject));
    }

    public final JSONObject A00() {
        JSONObject A11 = DbS.A11();
        A11.put("filePath", this.A05.getPath());
        A11.put("mFileSize", this.A02);
        A11.put("mMimeType", this.A06);
        A11.put("mSegmentType", this.A04.A00);
        A11.put("mSegmentId", this.A00);
        A11.put("mSegmentStartOffset", this.A03);
        A11.put("mEstimatedFileSize", this.A01);
        return A11;
    }

    public final String toString() {
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("mSegmentType", this.A04.name());
        A1E.put("mSegmentId", String.valueOf(this.A00));
        A1E.put("filePath", JTP.A0t(this.A05));
        A1E.put("mFileSize", String.valueOf(this.A02));
        A1E.put("mMimeType", this.A06);
        A1E.put("mSegmentStartOffset", String.valueOf(this.A03));
        A1E.put("mEstimatedFileSize", String.valueOf(this.A01));
        return A1E.toString();
    }

    public C11284SJc(RF9 rf9, File file, String str, int i, long j, long j2, long j3) {
        AnonymousClass7TG.A1P(file, rf9);
        0qQ.A0B(str, 5);
        this.A05 = file;
        this.A02 = j;
        this.A04 = rf9;
        this.A00 = i;
        this.A06 = str;
        this.A03 = j2;
        this.A01 = j3;
    }
}
