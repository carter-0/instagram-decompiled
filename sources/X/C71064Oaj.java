package X;

import android.app.ActivityManager;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioRecordingConfiguration;
import android.os.Build;
import android.os.Handler;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Oaj  reason: case insensitive filesystem */
public final class C71064Oaj {
    public AudioManager.AudioRecordingCallback A00 = new C67655Mri(this);
    public final Context A01;
    public final AudioManager A02;
    public final Handler A03 = AnonymousClass7TF.A0D();
    public final C71762OqO A04;
    public final Runnable A05 = new PUY(this);
    public final OUV A06;
    public final ExecutorService A07;

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C71064Oaj r4, java.lang.String r5) {
        /*
            android.app.ActivityManager$RunningAppProcessInfo r3 = new android.app.ActivityManager$RunningAppProcessInfo     // Catch:{ JSONException -> 0x003e }
            r3.<init>()     // Catch:{ JSONException -> 0x003e }
            android.app.ActivityManager.getMyMemoryState(r3)     // Catch:{ JSONException -> 0x003e }
            org.json.JSONObject r2 = X.DbS.A11()     // Catch:{ JSONException -> 0x003e }
            java.lang.String r1 = "importance"
            int r0 = r3.importance     // Catch:{ JSONException -> 0x001a }
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x001a }
            java.lang.String r1 = "lastTrimLevel"
            int r0 = r3.lastTrimLevel     // Catch:{ JSONException -> 0x001a }
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x001a }
        L_0x001a:
            org.json.JSONObject r3 = X.DbS.A11()     // Catch:{ JSONException -> 0x003e }
            java.lang.String r0 = "process"
            r3.put(r0, r2)     // Catch:{ JSONException -> 0x003e }
            java.lang.String r2 = "mic_permission"
            android.content.Context r1 = r4.A01     // Catch:{ JSONException -> 0x003e }
            java.lang.String r0 = "android.permission.RECORD_AUDIO"
            int r0 = X.C9157RRi.A00(r1, r0)     // Catch:{ JSONException -> 0x003e }
            boolean r0 = X.AnonymousClass7TF.A1Q(r0)
            r3.put(r2, r0)     // Catch:{ JSONException -> 0x003e }
            X.OqO r1 = r4.A04     // Catch:{ JSONException -> 0x003e }
            java.lang.String r0 = r3.toString()     // Catch:{ JSONException -> 0x003e }
            r1.CmO(r5, r0)     // Catch:{ JSONException -> 0x003e }
            return
        L_0x003e:
            r4 = move-exception
            r3 = 0
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r2 = "AudioRecordMonitor"
            java.lang.String r1 = "Failed to create system info config json"
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r3)
            X.0KC.A0L(r2, r1, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71064Oaj.A00(X.Oaj, java.lang.String):void");
    }

    public static final void A01(C71064Oaj oaj, String str, List list) {
        String str2;
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AudioRecordingConfiguration audioRecordingConfiguration = (AudioRecordingConfiguration) it.next();
            JSONObject A11 = DbS.A11();
            AudioFormat format = audioRecordingConfiguration.getFormat();
            AudioFormat clientFormat = audioRecordingConfiguration.getClientFormat();
            AudioDeviceInfo audioDevice = audioRecordingConfiguration.getAudioDevice();
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                str2 = String.valueOf(audioRecordingConfiguration.isClientSilenced());
            } else {
                str2 = "unknown";
            }
            try {
                A11.put("source", audioRecordingConfiguration.getClientAudioSource()).put(Dbo.A00(), audioRecordingConfiguration.getClientAudioSessionId()).put("is_silenced", str2);
                if (format != null) {
                    A11.put("sample_rate", format.getSampleRate());
                }
                if (clientFormat != null) {
                    A11.put("client_sample_rate", clientFormat.getSampleRate());
                }
                if (audioDevice != null) {
                    A11.put(AnonymousClass000.A00(5132), audioDevice.getProductName()).put("device_type", audioDevice.getType()).put(Dbo.A01(0, 9, 117), audioDevice.getId());
                }
                if (i >= 29 && audioRecordingConfiguration.isClientSilenced()) {
                    ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                    ActivityManager.getMyMemoryState(runningAppProcessInfo);
                    JSONObject A112 = DbS.A11();
                    try {
                        A112.put("importance", runningAppProcessInfo.importance);
                        A112.put("lastTrimLevel", runningAppProcessInfo.lastTrimLevel);
                    } catch (JSONException unused) {
                    }
                    A11.put("process", A112);
                    A11.put("mic_permission", AnonymousClass7TF.A1Q(C9157RRi.A00(oaj.A01, "android.permission.RECORD_AUDIO")));
                }
            } catch (JSONException e) {
                0KC.A0L("AudioRecordMonitor", "Failed to create record config json", e, Arrays.copyOf(new Object[0], 0));
            }
            jSONArray.put(A11);
        }
        oaj.A04.CmO(str, jSONArray.toString());
    }

    public static final void A02(C71064Oaj oaj, String str, List list) {
        if (oaj.A04.A00 != null) {
            oaj.A07.execute(new C73284Pa2(oaj, str, list));
        }
    }

    public C71064Oaj(Context context, AudioManager audioManager, C74437Pus pus, OUV ouv, ExecutorService executorService) {
        this.A01 = context;
        this.A07 = executorService;
        this.A02 = audioManager;
        this.A06 = ouv;
        this.A04 = new C71762OqO(pus);
    }
}
