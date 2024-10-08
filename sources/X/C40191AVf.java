package X;

import android.graphics.RectF;
import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.AVf  reason: case insensitive filesystem */
public final class C40191AVf implements MediaEffect {
    public final C391129sO A00;
    public final C344737sL A01;

    public C40191AVf(C391129sO r2, C344737sL r3) {
        0qQ.A0B(r3, 1);
        this.A01 = r3;
        this.A00 = r2;
    }

    public final void FJP(MediaEffect mediaEffect) {
    }

    public final boolean CRh() {
        C344737sL r5 = this.A01;
        if (!(r5 instanceof C382379db)) {
            return true;
        }
        C382379db r52 = (C382379db) r5;
        Iterator it = r52.A05.iterator();
        while (it.hasNext()) {
            A6X a6x = (A6X) r52.A02.get(AnonymousClass7TG.A0F(it));
            if (a6x != null) {
                boolean z = false;
                if (a6x.A00 != null) {
                    z = true;
                }
                if (!z) {
                    RectF rectF = a6x.A01;
                    RectF rectF2 = C382379db.A06;
                    if (rectF.equals(rectF2) && a6x.A02.equals(rectF2)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final boolean Esg() {
        return !(this.A01 instanceof C382379db);
    }

    public final JSONObject F00() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("class", "MediaGraphMediaEffect");
        } catch (JSONException unused) {
        }
        try {
            jSONObject.put("mediaEffectType", this.A00);
        } catch (JSONException unused2) {
        }
        return jSONObject;
    }
}
