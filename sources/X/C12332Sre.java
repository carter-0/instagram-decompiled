package X;

import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Sre  reason: case insensitive filesystem */
public final class C12332Sre implements MediaEffect {
    public float A00;

    public final boolean Esg() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && getClass() == obj.getClass() && Float.compare(((C12332Sre) obj).A00, this.A00) == 0;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new float[]{this.A00});
    }

    public final boolean CRh() {
        return AnonymousClass7TF.A1P((this.A00 > 1.0f ? 1 : (this.A00 == 1.0f ? 0 : -1)));
    }

    public final void FJP(MediaEffect mediaEffect) {
        this.A00 = ((C12332Sre) mediaEffect).A00;
    }

    public final JSONObject F00() {
        JSONObject A11 = DbS.A11();
        try {
            A11.put("class", "PitchEffect");
        } catch (JSONException unused) {
        }
        try {
            A11.put("pitch", Float.valueOf(this.A00));
        } catch (JSONException unused2) {
        }
        return A11;
    }

    public final String toString() {
        return F00().toString();
    }
}
