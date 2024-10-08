package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.view.View;
import com.instagram.realtimeclient.RealtimeConstants;

/* renamed from: X.MrN  reason: case insensitive filesystem */
public final class C67634MrN extends BroadcastReceiver {
    public final int A00;
    public final Object A01;

    public C67634MrN(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onReceive(Context context, Intent intent) {
        int A03;
        int i;
        String str;
        String str2;
        int i2;
        switch (this.A00) {
            case 0:
                A03 = C66580MXl.A03(this, context, intent, 2097541487);
                if (intent == null || !intent.getBooleanExtra("noConnectivity", false)) {
                    ((View) this.A01).invalidate();
                }
                i = -319591423;
                break;
            case 1:
                A03 = C66580MXl.A03(this, context, intent, 1266213740);
                boolean A1U = AnonymousClass7TF.A1U(0, context, intent);
                if ("android.media.ACTION_SCO_AUDIO_STATE_UPDATED".equals(intent.getAction())) {
                    OZz oZz = (OZz) this.A01;
                    int i3 = oZz.A00;
                    oZz.A00 = intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1);
                    OJP ojp = oZz.A0G;
                    if (ojp != null) {
                        int i4 = oZz.A00;
                        C71017OYs oYs = ojp.A00;
                        oYs.A07.A00(002.A02(i3, i4, "onScoAudioStateChanged: ", " --> "), new Object[0]);
                        C74437Pus pus = oYs.A06;
                        if (i3 == -1) {
                            str = "error";
                        } else if (i3 == 0) {
                            str = RealtimeConstants.MQTT_DISCONNECTED;
                        } else if (i3 == A1U) {
                            str = RealtimeConstants.MQTT_CONNECTED;
                        } else if (i3 != 2) {
                            str = "invalid";
                        } else {
                            str = RealtimeConstants.MQTT_CONNECTING;
                        }
                        if (i4 == -1) {
                            str2 = "error";
                        } else if (i4 == 0) {
                            str2 = RealtimeConstants.MQTT_DISCONNECTED;
                        } else if (i4 == A1U) {
                            str2 = RealtimeConstants.MQTT_CONNECTED;
                        } else if (i4 != 2) {
                            str2 = "invalid";
                        } else {
                            str2 = RealtimeConstants.MQTT_CONNECTING;
                        }
                        pus.CmO("on_sco_audio_state_changed", 002.A0u("previous_state=", str, " state=", str2));
                        if (i4 == 0) {
                            if (i3 == A1U || i3 == 2) {
                                C71017OYs.A01(oYs, false);
                            }
                            if (oYs.A02 && (i2 = oYs.A00) <= 3) {
                                pus.CmO("restart bluetooth sco", 002.A0O("attempts=", i2));
                                Handler handler = oYs.A03;
                                handler.removeMessages(A1U ? 1 : 0);
                                handler.sendEmptyMessage(A1U);
                            }
                        } else if (i4 == A1U) {
                            oYs.A03.removeMessages(2);
                        }
                        C70407O5k o5k = oYs.A01;
                        if (o5k == null) {
                            0qQ.A0F("callback");
                            throw AnonymousClass00P.createAndThrow();
                        }
                        o5k.A00.A0D();
                    }
                }
                i = -1300995082;
                break;
            default:
                A03 = C66580MXl.A03(this, context, intent, -152189397);
                AnonymousClass7TF.A1H(context, intent);
                if ("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
                    int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", 0);
                    if (intExtra == intent.getIntExtra("android.bluetooth.profile.extra.PREVIOUS_STATE", 0)) {
                        i = -155654456;
                        break;
                    } else {
                        OJP ojp2 = ((OZz) this.A01).A0G;
                        if (ojp2 != null) {
                            ojp2.A00(intExtra);
                        }
                    }
                }
                i = -1960729160;
                break;
        }
        AnonymousClass0fD.A0E(i, A03, intent);
    }
}
