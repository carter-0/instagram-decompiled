package X;

import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Srg  reason: case insensitive filesystem */
public final class C12334Srg implements MediaEffect {
    public String A00;

    public final boolean CRh() {
        return true;
    }

    public final boolean Esg() {
        return false;
    }

    public final void FJP(MediaEffect mediaEffect) {
        0qQ.A0B(mediaEffect, 0);
        this.A00 = ((C12334Srg) mediaEffect).A00;
    }

    public C12334Srg(String str) {
        this.A00 = str;
    }

    public final JSONObject F00() {
        JSONObject A11 = DbS.A11();
        try {
            A11.put("class", "CTVoiceEffect");
        } catch (JSONException unused) {
        }
        try {
            A11.put("userParameterValue", Float.valueOf(0.9f));
        } catch (JSONException unused2) {
        }
        try {
            A11.put("effectFromJsonPath", this.A00);
        } catch (JSONException unused3) {
        }
        return A11;
    }

    public final String toString() {
        return DbT.A10(F00());
    }
}
