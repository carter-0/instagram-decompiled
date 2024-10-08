package X;

import com.facebook.messaging.lockbox.LockBoxStorageManager;
import org.json.JSONObject;

/* renamed from: X.OmD  reason: case insensitive filesystem */
public final class C71516OmD implements C74290PsI {
    public final /* synthetic */ C71087ObS A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ 0rm A02;

    public C71516OmD(C71087ObS obS, String str, 0rm r3) {
        this.A00 = obS;
        this.A02 = r3;
        this.A01 = str;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.PsV, X.N55, java.lang.Object] */
    public final /* bridge */ /* synthetic */ void run(Object obj) {
        JSONObject jSONObject;
        C70551OAz oAz = (C70551OAz) obj;
        Integer num = null;
        if (oAz != null) {
            num = oAz.A00;
        }
        if (!(num != null || oAz == null || (jSONObject = oAz.A01) == null)) {
            0rm r1 = this.A02;
            if (jSONObject.has((String) r1.A00)) {
                jSONObject.remove((String) r1.A00);
                String A10 = DbT.A10(jSONObject);
                ? obj2 = new Object();
                obj2.A00 = A10;
                C3024663k r0 = LockBoxStorageManager.backupManager;
                if (r0 == null) {
                    0qQ.A0F("backupManager");
                    throw AnonymousClass00P.createAndThrow();
                }
                C71087ObS.A01(C3024463i.A00(obj2, C69508Nmq.A04, r0.A00.A00, this.A01, false), this.A00, 1);
                return;
            }
        }
        this.A00.A05(false);
    }
}
