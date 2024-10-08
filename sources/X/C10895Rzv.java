package X;

import android.content.Context;
import android.graphics.ColorSpace;
import android.hardware.display.DisplayManager;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import android.os.PowerManager;
import android.view.Display;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.Rzv  reason: case insensitive filesystem */
public final class C10895Rzv {
    public final void A00(Context context) {
        IllegalStateException th;
        DisplayManager displayManager;
        int i;
        ColorSpace preferredWideGamutColorSpace;
        String name;
        02m r4 = 02m.A0p;
        try {
            r4.markerStart(115358944);
            LinkedHashMap A1H = AnonymousClass7TE.A1H();
            Object systemService = context.getSystemService("display");
            if (!(systemService instanceof DisplayManager) || (displayManager = (DisplayManager) systemService) == null) {
                th = AnonymousClass7TE.A0z("cannot get display service");
            } else {
                A1H.put("display_count", Integer.valueOf(displayManager.getDisplays().length));
                boolean z = false;
                Display display = displayManager.getDisplay(0);
                if (display != null) {
                    A1H.put("display_info", display);
                    A1H.put("display_width", Integer.valueOf(display.getWidth()));
                    A1H.put("display_height", Integer.valueOf(display.getHeight()));
                    int i2 = Build.VERSION.SDK_INT;
                    if (!(i2 < 29 || (preferredWideGamutColorSpace = display.getPreferredWideGamutColorSpace()) == null || (name = preferredWideGamutColorSpace.getName()) == null)) {
                        A1H.put("preferred_wide_gamut_colorspace", name);
                    }
                    A1H.put("is_wide_gamut", Boolean.valueOf(display.isWideColorGamut()));
                    Display.HdrCapabilities hdrCapabilities = display.getHdrCapabilities();
                    int[] supportedHdrTypes = hdrCapabilities.getSupportedHdrTypes();
                    0qQ.A07(supportedHdrTypes);
                    List A0G = 03t.A0G(supportedHdrTypes);
                    int size = A0G.size();
                    if (size > 0) {
                        z = true;
                    }
                    A1H.put("hdr_support", Boolean.valueOf(z));
                    A1H.put("hdr_type_count", Integer.valueOf(size));
                    A1H.put("hdr_types", A0G);
                    A1H.put("luma_min", Float.valueOf(hdrCapabilities.getDesiredMinLuminance()));
                    A1H.put("luma_max", Float.valueOf(hdrCapabilities.getDesiredMaxLuminance()));
                    A1H.put("luma_avg", Float.valueOf(hdrCapabilities.getDesiredMaxAverageLuminance()));
                    if (i2 >= 34) {
                        A1H.put("hdr_sdr_ratio_available", Boolean.valueOf(display.isHdrSdrRatioAvailable()));
                        A1H.put("hdr_sdr_ratio", Float.valueOf(display.getHdrSdrRatio()));
                    }
                }
                LinkedHashMap A1H2 = AnonymousClass7TE.A1H();
                Object systemService2 = context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                0qQ.A0C(systemService2, AnonymousClass000.A00(4));
                AudioDeviceInfo[] devices = ((AudioManager) systemService2).getDevices(2);
                A1H2.put("audio_output_dev_count", Integer.valueOf(devices.length));
                JSONArray A1E = Pxe.A1E();
                0sC r6 = new 0sC(devices);
                while (r6.hasNext()) {
                    Object next = r6.next();
                    0qQ.A07(next);
                    AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) next;
                    JSONObject A11 = DbS.A11();
                    int[] channelCounts = audioDeviceInfo.getChannelCounts();
                    0qQ.A07(channelCounts);
                    A11.put("channel_count", 03t.A0G(channelCounts));
                    A11.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, audioDeviceInfo.getType());
                    int[] encodings = audioDeviceInfo.getEncodings();
                    0qQ.A07(encodings);
                    A11.put("encoding", 03t.A0G(encodings));
                    int[] sampleRates = audioDeviceInfo.getSampleRates();
                    0qQ.A07(sampleRates);
                    A1E.put(A11.put("sample_rate", 03t.A0G(sampleRates)));
                }
                A1H2.put("audio_dev_json", A1E);
                LinkedHashMap A1H3 = AnonymousClass7TE.A1H();
                PowerManager powerManager = (PowerManager) context.getSystemService("power");
                if (powerManager != null && (i = Build.VERSION.SDK_INT) >= 29) {
                    A1H3.put("thermal_stat", String.valueOf(powerManager.getCurrentThermalStatus()));
                    if (i >= 30) {
                        A1H3.put("thermal_headroom_30", String.valueOf(powerManager.getThermalHeadroom(30)));
                    }
                }
                0eP A1L = AnonymousClass7TE.A1L("emoji_bright_bug", Boolean.valueOf(SGY.A00.A00()));
                0eP A1L2 = AnonymousClass7TE.A1L("light_sensor_lux", Float.valueOf(AnonymousClass3FQ.A00));
                LinkedHashMap A1H4 = AnonymousClass7TE.A1H();
                A1H4.put("fingerprint", Build.FINGERPRINT);
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 31) {
                    C11154SCj sCj = C11154SCj.A00;
                    C10716Rwu rwu = C11154SCj.A01;
                    if (rwu == null) {
                        synchronized (sCj) {
                            rwu = C11154SCj.A01;
                            if (rwu == null) {
                                rwu = new C10716Rwu(DbT.A05(context));
                                C11154SCj.A01 = rwu;
                            }
                        }
                    }
                    A1H4.put("playservice_mpc", Integer.valueOf(DbX.A07(rwu.A04)));
                    A1H4.put("sdk_mpc", Integer.valueOf(Build.VERSION.MEDIA_PERFORMANCE_CLASS));
                }
                0Ym r2 = new 0Ym();
                r2.put("physical_ram_kb", Integer.valueOf(DbX.A07(C3729193f.A07)));
                r2.put("cpu_core_count", Integer.valueOf(DbX.A07(C3729193f.A02)));
                0Ym A0N = 0se.A0N(r2);
                0Ym r12 = new 0Ym();
                if (i3 >= 33) {
                    try {
                        r12.put("dv_dec_supported", Boolean.valueOf(SUE.A05()));
                        r12.put("dv_enc_supported", Boolean.valueOf(SUE.A06()));
                        String A00 = SUE.A00();
                        if (A00 == null) {
                            A00 = NetInfoModule.CONNECTION_TYPE_NONE;
                        }
                        r12.put("dv_enc_name", A00);
                        r12.put("dv_screen_supported", Boolean.valueOf(SUE.A07()));
                        r12.put("dv_camera_supported", Boolean.valueOf(SUE.A04()));
                        r12.put("dv_dec_list", SUE.A02());
                        r12.put("dv_all_codec_list", SUE.A01());
                    } catch (Throwable th2) {
                        new 0eQ(th2);
                    }
                }
                0Ym A0N2 = 0se.A0N(r12);
                LinkedHashMap linkedHashMap = new LinkedHashMap(A1H2);
                linkedHashMap.putAll(A1H);
                Iterator A0s = AnonymousClass7TF.A0s(0Yt.A04(0Yt.A04(0Yt.A04(0Yt.A0C(0Yt.A0C(0Yt.A04(linkedHashMap, A1H3), A1L), A1L2), A1H4), A0N), A0N2));
                while (A0s.hasNext()) {
                    Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
                    r4.markerAnnotate(115358944, DbT.A13(A1J), A1J.getValue().toString());
                }
                r4.markerEnd(115358944, 2);
                return;
            }
        } catch (Throwable th3) {
            Pxf.A1I(r4, "error", th3.toString(), 115358944);
            0wb.A07("screen_hdr_qpl_err", th3);
            return;
        }
        throw th;
    }
}
