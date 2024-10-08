package X;

import android.content.Context;
import android.util.Pair;
import java.net.Socket;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.SqD  reason: case insensitive filesystem */
public final class C12259SqD implements C13843TiJ {
    public AnonymousClass45J A00;
    public C13441TaU A01 = Q8K.A01;
    public CountDownLatch A02 = Pxf.A0y();
    public Context A03;
    public final boolean A04;

    public final String Ac5() {
        return "567310203415052";
    }

    public final synchronized String Aws() {
        A00();
        return (String) ((Q8K) this.A01).first;
    }

    public final synchronized String Awv() {
        A00();
        return (String) ((Q8K) this.A01).second;
    }

    public final String getAppName() {
        return "MQTT";
    }

    private void A00() {
        try {
            this.A02.await();
        } catch (InterruptedException e) {
            0KC.A0F("FbnsServiceIdManager", "Waiting for mqtt device id and secret was interrupted", e);
        }
    }

    public final String C84() {
        throw AnonymousClass7TE.A15("Tokenbinding not implemented for legacy auth");
    }

    public final boolean E2Y() {
        throw AnonymousClass7TE.A15("Tokenbinding not implemented for legacy auth");
    }

    public final byte[] E2d(Socket socket) {
        throw AnonymousClass7TE.A15("Tokenbinding not implemented for legacy auth");
    }

    public final void EaV(C10231Ror ror, boolean z) {
        TGH tgh;
        AnonymousClass45J r2 = this.A00;
        AnonymousClass45I r1 = (AnonymousClass45I) r2;
        if (r1.contains("/settings/mqtt/id/is_using_secure_auth")) {
            boolean z2 = false;
            if (z != r1.getBoolean("/settings/mqtt/id/is_using_secure_auth", false)) {
                z2 = true;
                C13849TiS AR1 = r2.AR1();
                AR1.E5R("/settings/mqtt/id/is_using_secure_auth", z);
                AR1.AIR("FbnsServiceIdManager", "PreferencesManager failed to store isSecureAuth");
            }
            tgh = ror.A00;
            if (!z2) {
                return;
            }
        } else {
            C13849TiS AR12 = r2.AR1();
            AR12.E5R("/settings/mqtt/id/is_using_secure_auth", z);
            AR12.AIR("FbnsServiceIdManager", "PreferencesManager failed to store isSecureAuth");
            tgh = ror.A00;
        }
        tgh.A00.A01.A0M.D7E();
    }

    public C12259SqD(Context context, AnonymousClass3RV r9, boolean z) {
        this.A04 = z;
        this.A03 = context;
        AnonymousClass45J A0N = Pxf.A0N(context, r9, "ids");
        this.A00 = A0N;
        this.A01 = new Q8K(((AnonymousClass45I) A0N).getString("/settings/mqtt/id/mqtt_device_id", ""), ((AnonymousClass45I) this.A00).getString("/settings/mqtt/id/mqtt_device_secret", ""), Long.valueOf(((AnonymousClass45I) this.A00).getLong("/settings/mqtt/id/timestamp", Long.MAX_VALUE)).longValue());
        this.A02.countDown();
        A00();
        String str = (String) ((Pair) this.A01).first;
        if ((str == null || str.equals("")) && this.A04) {
            FJT(new Q8K(AnonymousClass7TF.A0c(), "", System.currentTimeMillis()));
        }
    }

    public final boolean FJT(C13441TaU taU) {
        A00();
        if (this.A01.equals(taU)) {
            return false;
        }
        C13849TiS AR1 = this.A00.AR1();
        Q8K q8k = (Q8K) taU;
        AR1.E5e("/settings/mqtt/id/mqtt_device_id", (String) q8k.first);
        AR1.E5e("/settings/mqtt/id/mqtt_device_secret", (String) q8k.second);
        AR1.E5a("/settings/mqtt/id/timestamp", q8k.A00);
        AR1.AIR("FbnsServiceIdManager", "PreferencesManager failed to store device id, secret, and timestamp.");
        this.A01 = taU;
        return true;
    }
}
