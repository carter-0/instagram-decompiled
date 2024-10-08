package X;

import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import org.webrtc.ScreenCapturerAndroid;

/* renamed from: X.Aqp  reason: case insensitive filesystem */
public final class C41253Aqp implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C379599Un A01;
    public final /* synthetic */ QuickPerformanceLogger A02;
    public final /* synthetic */ C379619Up A03;
    public final /* synthetic */ ImmutableMap A04;
    public final /* synthetic */ Integer A05;
    public final /* synthetic */ String A06;

    public C41253Aqp(C379599Un r1, QuickPerformanceLogger quickPerformanceLogger, C379619Up r3, ImmutableMap immutableMap, Integer num, String str, long j) {
        this.A02 = quickPerformanceLogger;
        this.A01 = r1;
        this.A00 = j;
        this.A03 = r3;
        this.A05 = num;
        this.A06 = str;
        this.A04 = immutableMap;
    }

    public final void run() {
        String str;
        String str2;
        int i;
        QuickPerformanceLogger quickPerformanceLogger = this.A02;
        C379599Un r2 = this.A01;
        int hashCode = r2.hashCode();
        long j = this.A00;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put(Py0.A00(), r2.A05);
        A1E.put(AnonymousClass000.A00(1170), r2.A02);
        A1E.put("placement", r2.A04);
        A1E.put("template_name", r2.A06);
        A1E.put(AnonymousClass000.A00(1561), r2.A03);
        A1E.put(AnonymousClass000.A00(1220), String.valueOf(r2.A01));
        A1E.put("custom_logging_info", this.A03.A00());
        int intValue = this.A05.intValue();
        switch (intValue) {
            case 0:
            case 1:
                str = "network";
                break;
            case 6:
            case 7:
                str = "rendering";
                break;
            default:
                str = "data";
                break;
        }
        A1E.put(AnonymousClass000.A00(3067), str);
        switch (intValue) {
            case 1:
                str2 = "ASSETS_FETCH_FAIL";
                break;
            case 2:
                str2 = "IMAGE_DIM_MISMATCH";
                break;
            case 6:
            case 7:
                str2 = "PREPARE_RENDER_FAIL";
                break;
            default:
                str2 = "DOCUMENT_FETCH_FAIL";
                break;
        }
        A1E.put(AnonymousClass000.A00(1313), str2);
        switch (intValue) {
            case 0:
                i = 200;
                break;
            case 1:
                i = 210;
                break;
            case 2:
                i = 300;
                break;
            case 3:
                i = 310;
                break;
            case 4:
                i = 311;
                break;
            case 5:
                i = 312;
                break;
            case 6:
                i = ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI;
                break;
            default:
                i = 401;
                break;
        }
        A1E.put(TraceFieldType.ErrorCode, String.valueOf(i));
        A1E.put("error_message", this.A06);
        ImmutableMap immutableMap = this.A04;
        0qQ.A0C(immutableMap, Pxd.A00(95));
        A1E.put("error_data", new JSONObject(immutableMap).toString());
        AnonymousClass6QC.A03(quickPerformanceLogger, A1E, timeUnit, 51527556, hashCode, j);
        ImmutableMap immutableMap2 = RegularImmutableMap.A02;
        0qQ.A07(immutableMap2);
        AnonymousClass6QC.A04(quickPerformanceLogger, immutableMap2, timeUnit, 51527556, hashCode, j, 2);
    }
}
