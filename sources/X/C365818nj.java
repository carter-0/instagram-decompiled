package X;

import android.content.Context;
import android.os.Parcelable;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.8nj  reason: invalid class name and case insensitive filesystem */
public final class C365818nj implements C3503584i {
    public C367398qg A00;
    public final AnonymousClass2Fj A01 = new AnonymousClass2Fj();
    public final C3497681r A02;
    public final C312196dz A03;
    public final AnonymousClass82W A04;
    public final UserSession A05;

    public C365818nj(Context context, C3497681r r6, AnonymousClass82W r7, UserSession userSession) {
        0qQ.A0B(context, 1);
        0qQ.A0B(userSession, 2);
        0qQ.A0B(r7, 3);
        0qQ.A0B(r6, 4);
        this.A05 = userSession;
        this.A04 = r7;
        this.A02 = r6;
        Context applicationContext = context.getApplicationContext();
        0qQ.A07(applicationContext);
        this.A03 = C312176dx.A00(applicationContext, C312126dr.A01, C312146dt.A00(userSession), new C365828nk(this), userSession);
    }

    public final /* synthetic */ void A7M(Parcelable parcelable) {
    }

    public final void EEG(AnonymousClass82C r3) {
        0qQ.A0B(r3, 0);
        C367398qg r0 = this.A00;
        if (r0 != null) {
            r0.EEG(r3);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A9X(AnonymousClass82C r3) {
        C367398qg r0 = this.A00;
        if (r0 != null) {
            r0.A9X(r3);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final /* synthetic */ Parcelable ANX() {
        return null;
    }

    public final C368528sn AXb() {
        return (C368528sn) this.A01.A02();
    }

    public final EffectAttribution Azz() {
        C367398qg r0 = this.A00;
        if (r0 != null) {
            return r0.Azz();
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final boolean CKj() {
        C312206e0 B0C;
        C312196dz r0 = this.A03;
        if (r0 == null || (B0C = r0.B0C()) == null || !B0C.A01(this.A05)) {
            return false;
        }
        return true;
    }

    public final void EHz() {
        C367398qg r0 = this.A00;
        if (r0 != null) {
            r0.EHv();
            return;
        }
        throw new IllegalStateException("ARRenderer has not been set!");
    }

    public final void ENP(C368528sn r2) {
        this.A01.A0A(r2);
        r2.A02 = this.A02;
    }

    public final void EUm(CameraAREffect cameraAREffect) {
        if (cameraAREffect == null || this.A00 != null) {
            C367398qg r0 = this.A00;
            if (r0 != null) {
                r0.ENO(cameraAREffect);
                return;
            }
            return;
        }
        throw new IllegalStateException("ARRenderer has not been set!");
    }

    public final void AVi(int i, int i2) {
        String str;
        C368528sn AXb = AXb();
        if (AXb != null) {
            AnonymousClass82T r3 = AXb.A0C;
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject.put(AnonymousClass000.A00(1690), i);
                jSONObject.put("total_media_duration", i2);
                jSONObject2.put("playback_info", jSONObject);
                AnonymousClass82T.A00(r3, jSONObject2);
            } catch (JSONException e) {
                if (e.getMessage() != null) {
                    str = e.getMessage();
                } else {
                    str = "";
                }
                0kD.A01("PlatformEventsController::fireVideoPlaybackInfoEvent", str);
            }
        }
    }

    public final void ENQ(C367398qg r1) {
        this.A00 = r1;
    }
}
