package X;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.rti.mqtt.manager.MqttPushServiceDelegate;
import com.facebook.rti.push.service.FbnsServiceDelegate;
import java.util.Collections;
import java.util.LinkedList;

/* renamed from: X.SqB  reason: case insensitive filesystem */
public final class C12257SqB implements C13838TiD {
    public final /* synthetic */ MqttPushServiceDelegate A00;

    public final void Dav(SBU sbu, Long l, String str, byte[] bArr, int i, long j) {
        this.A00.A0R(sbu, (Long) null, str, bArr, i, j);
    }

    public C12257SqB(MqttPushServiceDelegate mqttPushServiceDelegate) {
        this.A00 = mqttPushServiceDelegate;
    }

    public final void D5i() {
        this.A00.A0Q();
    }

    public final void D5k() {
        MqttPushServiceDelegate mqttPushServiceDelegate = this.A00;
        mqttPushServiceDelegate.A00 = SystemClock.elapsedRealtime();
        mqttPushServiceDelegate.A0Q();
    }

    public final void D5o(T9D t9d) {
        MqttPushServiceDelegate mqttPushServiceDelegate = this.A00;
        if (!(t9d instanceof C7860Qbk)) {
            Object A01 = t9d.A01();
            FbnsServiceDelegate fbnsServiceDelegate = (FbnsServiceDelegate) mqttPushServiceDelegate;
            boolean A1R = AnonymousClass7TF.A1R((C51966G9m.A07(((AnonymousClass45I) SRS.A00(fbnsServiceDelegate.A08)).getLong("auto_reg_retry", 0)) > 86400000 ? 1 : (C51966G9m.A07(((AnonymousClass45I) SRS.A00(fbnsServiceDelegate.A08)).getLong("auto_reg_retry", 0)) == 86400000 ? 0 : -1)));
            if (C8901REt.FAILED_CONNECTION_REFUSED_BAD_USER_NAME_OR_PASSWORD.equals(A01) && A1R) {
                C13849TiS AR1 = SRS.A00(fbnsServiceDelegate.A08).AR1();
                AR1.E5a("auto_reg_retry", System.currentTimeMillis());
                AR1.AIR("RegistrationState", "PreferencesManager failed to store auth failed register time.");
                LinkedList<SHZ> A04 = fbnsServiceDelegate.A08.A04();
                fbnsServiceDelegate.A08.A05();
                FbnsServiceDelegate.A02(fbnsServiceDelegate, "authfail_auto_register", "", "", (String) null, Collections.singletonMap("package_size", String.valueOf(A04.size())));
                for (SHZ shz : A04) {
                    Intent A0G = Pxe.A0G("com.facebook.rti.fbns.intent.REGISTER");
                    A0G.putExtra("pkg_name", shz.A02);
                    A0G.putExtra(PublicKeyCredentialControllerUtility.JSON_KEY_APPID, shz.A01);
                    A0G.setClassName(DbT.A05(fbnsServiceDelegate.A01).getPackageName(), C66581MXm.A0y(fbnsServiceDelegate));
                    fbnsServiceDelegate.A0V(A0G);
                }
            }
        }
        mqttPushServiceDelegate.A0Q();
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.S0N, java.lang.Object] */
    public final void D7E() {
        FbnsServiceDelegate fbnsServiceDelegate = (FbnsServiceDelegate) this.A00;
        LinkedList<SHZ> A04 = fbnsServiceDelegate.A08.A04();
        fbnsServiceDelegate.A08.A05();
        FbnsServiceDelegate.A02(fbnsServiceDelegate, "credentials_updated", "", "", (String) null, Collections.singletonMap("package_size", String.valueOf(A04.size())));
        ? obj = new Object();
        00f r5 = fbnsServiceDelegate.A01;
        Context A05 = DbT.A05(r5);
        0qQ.A07(r5.getApplicationContext());
        fbnsServiceDelegate.A0S(obj.A00(A05, ((AnonymousClass3RX) AnonymousClass3RD.A00).A02()), AnonymousClass05K.A05);
        for (SHZ shz : A04) {
            Intent A0G = Pxe.A0G("com.facebook.rti.fbns.intent.REGISTER");
            A0G.putExtra("pkg_name", shz.A02);
            A0G.putExtra(PublicKeyCredentialControllerUtility.JSON_KEY_APPID, shz.A01);
            A0G.setClassName(DbT.A05(r5).getPackageName(), C66581MXm.A0y(fbnsServiceDelegate));
            fbnsServiceDelegate.A0V(A0G);
        }
    }

    public final void DRj(C10938S1r s1r) {
        this.A00.A0O();
    }

    public final boolean Ero() {
        return this.A00.A0T();
    }

    public final void EFn(long j, String str, boolean z) {
    }
}
