package X;

import java.io.File;
import java.net.URL;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.4aI  reason: invalid class name and case insensitive filesystem */
public final class C266754aI {
    public final int A00;
    public final long A01;
    public final long A02;
    public final C266724aF A03;
    public final File A04;
    public final URL A05;

    public final boolean equals(Object obj) {
        URL url;
        File file;
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C266754aI r7 = (C266754aI) obj;
            if (this.A02 != r7.A02 || this.A01 != r7.A01 || this.A00 != r7.A00) {
                return false;
            }
            File file2 = this.A04;
            if ((file2 != null || r7.A04 != null) && file2 != (file = r7.A04) && (file2 == null || !file2.equals(file))) {
                return false;
            }
            URL url2 = this.A05;
            if (!((url2 == null && r7.A05 == null) || url2 == (url = r7.A05) || (url2 != null && url2.equals(url))) || !this.A03.equals(r7.A03)) {
                return false;
            }
        }
        return true;
    }

    public final JSONObject A00() {
        JSONObject jSONObject = new JSONObject();
        File file = this.A04;
        if (file != null) {
            jSONObject.put("mSourceFile", file.getPath());
        }
        URL url = this.A05;
        if (url != null) {
            jSONObject.put("mUrl", url.toString());
        }
        jSONObject.put("mSourceTimeRange", this.A03.A04());
        jSONObject.put("mPhotoDurationUs", this.A02);
        jSONObject.put("mMediaOriginalDurationMs", this.A01);
        jSONObject.put("mOutputFps", this.A00);
        return jSONObject;
    }

    public final boolean A01(boolean z) {
        File file = this.A04;
        if (file == null) {
            return false;
        }
        if (this.A02 >= 0 || Q1U.A00(file.getPath(), "video/mp4", z).contains("image")) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A04, this.A05, this.A03, Long.valueOf(this.A02), Long.valueOf(this.A01), Integer.valueOf(this.A00)});
    }

    public C266754aI(C266744aH r3) {
        this.A04 = r3.A04;
        C266724aF r0 = r3.A03;
        r0.getClass();
        this.A03 = r0;
        this.A02 = r3.A02;
        this.A01 = r3.A01;
        this.A00 = r3.A00;
        this.A05 = r3.A05;
    }

    public final String toString() {
        try {
            return A00().toString();
        } catch (JSONException unused) {
            return "";
        }
    }
}
