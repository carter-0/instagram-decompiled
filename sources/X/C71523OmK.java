package X;

import com.facebook.messaging.lockbox.LockBoxStorageManager;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.OmK  reason: case insensitive filesystem */
public final class C71523OmK implements C74290PsI {
    public final /* synthetic */ C71087ObS A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public C71523OmK(C71087ObS obS, String str, String str2, String str3) {
        this.A00 = obS;
        this.A01 = str;
        this.A03 = str2;
        this.A02 = str3;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.PsV, X.N55, java.lang.Object] */
    public final /* bridge */ /* synthetic */ void run(Object obj) {
        JSONObject jSONObject;
        C70551OAz oAz = (C70551OAz) obj;
        Integer num = null;
        if (oAz == null || oAz.A00 != null || (jSONObject = oAz.A01) == null) {
            LockBoxStorageManager lockBoxStorageManager = LockBoxStorageManager.INSTANCE;
            C71087ObS obS = this.A00;
            if (oAz != null) {
                num = oAz.A00;
            }
            lockBoxStorageManager.nullableComplete(obS, num);
            return;
        }
        try {
            String str = this.A01;
            String A11 = DbT.A11(str, C3024763l.A02);
            if (A11 != null) {
                str = A11;
            }
            jSONObject.putOpt(str, this.A03);
            String A10 = DbT.A10(jSONObject);
            ? obj2 = new Object();
            obj2.A00 = A10;
            C3024663k r0 = LockBoxStorageManager.backupManager;
            if (r0 == null) {
                0qQ.A0F("backupManager");
                throw AnonymousClass00P.createAndThrow();
            }
            C71087ObS.A01(C3024463i.A00(obj2, C69508Nmq.A04, r0.A00.A00, this.A02, false), this.A00, 3);
        } catch (JSONException unused) {
            this.A00.A05(7);
        }
    }
}
