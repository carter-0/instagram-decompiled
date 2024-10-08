package X;

import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Srd  reason: case insensitive filesystem */
public final class C12331Srd implements MediaEffect {
    public String A00;

    public final boolean CRh() {
        return true;
    }

    public final boolean Esg() {
        return false;
    }

    public final void FJP(MediaEffect mediaEffect) {
        this.A00 = ((C12331Srd) mediaEffect).A00;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A00.equals(((C12331Srd) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final JSONObject F00() {
        JSONObject A11 = DbS.A11();
        try {
            A11.put("class", "FbaAudioEffect");
        } catch (JSONException unused) {
        }
        try {
            A11.put("path", this.A00);
        } catch (JSONException unused2) {
        }
        return A11;
    }

    public final String toString() {
        return F00().toString();
    }
}
