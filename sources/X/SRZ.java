package X;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.realtimeclient.RealtimeConstants;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

public final class SRZ {
    public static final AtomicLong A0B = Pxe.A1D(0);
    public final Context A00;
    public final C13893TjG A01;
    public final C10228Roo A02;
    public final SJJ A03;
    public final long A04;
    public final long A05;
    public final long A06 = SystemClock.elapsedRealtime();
    public final C2596542n A07;
    public final AnonymousClass458 A08;
    public final String A09;
    public final String A0A;

    public final void A04(String str, long j, int i, int i2, int i3, long j2) {
        A06("mqtt_publish_debug", S9J.A01("result", RealtimeConstants.SEND_SUCCESS, "operation", str, TraceFieldType.QoS, Integer.toString(i), TraceFieldType.MsgId, Integer.toString(i2), "original_ops_id", Integer.toString(i3), "timespan_ms", Long.toString(j), "retry_cnt", Integer.toString(0), "mqtt_session_id", Long.toString(j2)));
    }

    public final void A05(String str, String str2, Throwable th, int i, int i2, int i3, long j) {
        HashMap A012 = S9J.A01("result", str, "operation", str2, TraceFieldType.QoS, Integer.toString(i), TraceFieldType.MsgId, Integer.toString(i2), "original_ops_id", Integer.toString(i3), "retry_cnt", Integer.toString(0), "mqtt_session_id", Long.toString(j));
        if (th != null) {
            A012.put("error_message", th.toString());
        }
        A06("mqtt_publish_debug", A012);
    }

    public static void A01(NetworkInfo networkInfo, SRZ srz, Map map) {
        if (networkInfo != null) {
            String obj = networkInfo.getState().toString();
            String typeName = networkInfo.getTypeName();
            if (typeName == null) {
                typeName = "";
            }
            String subtypeName = networkInfo.getSubtypeName();
            if (subtypeName == null) {
                subtypeName = "";
            }
            String extraInfo = networkInfo.getExtraInfo();
            if (extraInfo == null) {
                extraInfo = "";
            }
            map.put(C66579MXk.A00(979), obj);
            map.put(AnonymousClass000.A00(173), typeName);
            map.put(AnonymousClass000.A00(1612), subtypeName);
            map.put("network_extra_info", extraInfo);
        } else {
            map.put("network_info", "null");
        }
        boolean z = false;
        try {
            T9D A002 = srz.A03.A03.A00(PowerManager.class, "power");
            if (!(A002 instanceof C7860Qbk) && ((PowerManager) A002.A01()).isDeviceIdleMode()) {
                z = true;
            }
        } catch (Exception unused) {
            0KC.A0C("MqttNetworkManager", "Exception in getting DeviceIdleMode");
        }
        map.put("is_in_idle_mode", Boolean.toString(z));
    }

    public final void A02(NetworkInfo networkInfo, T9D t9d, T9D t9d2, String str, String str2, long j, boolean z) {
        HashMap A012 = S9J.A01("act", str, "running", String.valueOf(z));
        A012.put("process_id", Long.toString(this.A05));
        A012.put(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, Long.toString(Thread.currentThread().getId()));
        A012.put("mqtt_persistence_string", "FBNS_ALWAYS");
        A00(j, A012);
        A01(networkInfo, this, A012);
        if (!TextUtils.isEmpty(str2)) {
            A012.put("calr", str2);
        }
        if (!(t9d instanceof C7860Qbk)) {
            A012.put("flg", String.valueOf(t9d.A01()));
        }
        if (!(t9d2 instanceof C7860Qbk)) {
            A012.put("sta_id", String.valueOf(t9d2.A01()));
        }
        A06("mqtt_service_state", A012);
    }

    public final void A06(String str, Map map) {
        map.put(C273654mx.A00(390), this.A0A);
        map.put("service_session_id", Long.toString(this.A06));
        map.put("process_id", Long.toString(this.A05));
        map.put("logger_object_id", Long.toString(this.A04));
        if (!map.containsKey("network_session_id")) {
            map.put("network_session_id", Long.toString(this.A03.A06.get()));
        }
        SRO sro = new SRO(str, this.A09);
        sro.A03(map);
        this.A07.reportEvent(sro);
    }

    public SRZ(Context context, C2596542n r4, C13893TjG tjG, AnonymousClass458 r6, C10228Roo roo, SJJ sjj, String str) {
        this.A00 = context;
        this.A0A = str;
        this.A03 = sjj;
        this.A02 = roo;
        this.A09 = context.getPackageName();
        this.A07 = r4;
        this.A08 = r6;
        this.A05 = (long) Process.myPid();
        this.A04 = A0B.incrementAndGet();
        this.A01 = tjG;
    }

    public static void A00(long j, Map map) {
        map.put("network_session_id", Long.toString(j));
    }

    public final void A03(NetworkInfo networkInfo, T9D t9d, String str, int i, long j, long j2, long j3) {
        HashMap A012 = S9J.A01("timespan_ms", String.valueOf(j), TraceFieldType.Port, String.valueOf(i), "he_state", str);
        if (!(t9d instanceof C7860Qbk)) {
            String obj = t9d.A01().toString();
            if (((Throwable) t9d.A01()).getCause() != null) {
                obj = 002.A0g(obj, " Caused by: ", ((Throwable) t9d.A01()).getCause().toString());
            }
            A012.put("error_message", obj);
        }
        A012.put("mqtt_session_id", Long.toString(j2));
        A00(j3, A012);
        A01(networkInfo, this, A012);
        A06("mqtt_socket_connect", A012);
    }
}
