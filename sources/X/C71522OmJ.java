package X;

import com.facebook.messaging.lockbox.LockBoxStorageManager;
import org.json.JSONObject;

/* renamed from: X.OmJ  reason: case insensitive filesystem */
public final class C71522OmJ implements C74290PsI {
    public final /* synthetic */ C71087ObS A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ 0rm A03;

    public C71522OmJ(C71087ObS obS, String str, String str2, 0rm r4) {
        this.A00 = obS;
        this.A03 = r4;
        this.A01 = str;
        this.A02 = str2;
    }

    public final /* bridge */ /* synthetic */ void run(Object obj) {
        JSONObject jSONObject;
        C70551OAz oAz = (C70551OAz) obj;
        String str = null;
        if (oAz == null || oAz.A00 != null || (jSONObject = oAz.A01) == null || (!((str = jSONObject.optString((String) this.A03.A00)) == null || str.length() == 0) || !0qQ.A0K(this.A01, "rc"))) {
            LockBoxStorageManager.INSTANCE.nullableComplete(this.A00, str);
        } else {
            C71087ObS.A01(LockBoxStorageManager.INSTANCE.getRecoveryCodeFromLegacyLocation(this.A02), this.A00, 2);
        }
    }
}
