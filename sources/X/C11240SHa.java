package X;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.os.Build;
import android.os.OutcomeReceiver;
import android.view.InputEvent;
import com.facebook.quicklog.reliability.UserFlowConfig;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.instagram.common.session.UserSession;
import java.net.URLEncoder;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: X.SHa  reason: case insensitive filesystem */
public final class C11240SHa {
    public final 1QP A00;
    public final UserSession A01;
    public final Context A02;
    public final ExecutorService A03 = Executors.newSingleThreadExecutor();
    public final ExecutorService A04 = Executors.newSingleThreadExecutor();

    public final void A01(String str, Long l) {
        1QP r3 = this.A00;
        long generateNewFlowId = r3.generateNewFlowId(635764737);
        r3.flowStart(generateNewFlowId, new UserFlowConfig("MeasurementManagerUtil", false));
        String str2 = str;
        if (str != null) {
            if (182.A06(0Tu.A05, this.A01, 36324960783970839L)) {
                if (Build.VERSION.SDK_INT < 31) {
                    r3.flowMarkPoint(generateNewFlowId, "NOT_PASS_LOWEST_VERSION_CHECK");
                } else {
                    try {
                        Class.forName("android.adservices.measurement.MeasurementManager");
                        r3.flowMarkPoint(generateNewFlowId, "DEVICE_ELIGIBLE");
                        this.A03.execute(new C13065TJv(this, l, str2, generateNewFlowId));
                        return;
                    } catch (ClassNotFoundException | NoClassDefFoundError unused) {
                        r3.flowMarkPoint(generateNewFlowId, "DEVICE_INELIGIBLE");
                    }
                }
            }
        }
        r3.flowEndFail(generateNewFlowId, "CLICK_REGISTRATION_FAILED", (String) null);
    }

    public static final void A00(InputEvent inputEvent, C11240SHa sHa, Long l, String str, long j) {
        1QP r2;
        String str2;
        String str3;
        long j2;
        String encode = URLEncoder.encode(str, ReactWebViewManager.HTML_ENCODING);
        try {
            Context context = sHa.A02;
            MeasurementManager measurementManager = (MeasurementManager) context.getApplicationContext().getSystemService(MeasurementManager.class);
            if (measurementManager == null && (measurementManager = MeasurementManager.get(context.getApplicationContext())) == null) {
                sHa.A00.flowEndFail(j, "MEASUREMENT_MANAGER_NULL", (String) null);
                return;
            }
            OutcomeReceiver swm = new SWM(sHa, j);
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("https://www.facebook.com/privacy_sandbox/mobile/register/source?tracking_token=");
            A1A.append(encode);
            A1A.append("&event_time=");
            if (l != null) {
                j2 = l.longValue();
            } else {
                j2 = -1;
            }
            A1A.append(j2);
            measurementManager.registerSource(0cp.A03(AnonymousClass7TF.A0l("&platform=ig", A1A)), inputEvent, sHa.A04, swm);
        } catch (Exception e) {
            r2 = sHa.A00;
            str2 = e.getMessage();
            str3 = "REGISTRATION_INTERNAL_EXCEPTION";
            r2.flowEndFail(j, str3, str2);
        } catch (NoClassDefFoundError e2) {
            r2 = sHa.A00;
            str2 = e2.getMessage();
            str3 = "REGISTRATION_NO_CLASS_FOUND";
            r2.flowEndFail(j, str3, str2);
        } catch (NoSuchMethodError e3) {
            r2 = sHa.A00;
            str2 = e3.getMessage();
            str3 = "REGISTRATION_NO_METHOD_FOUND";
            r2.flowEndFail(j, str3, str2);
        }
    }

    public C11240SHa(UserSession userSession, Context context) {
        AnonymousClass7TG.A1O(userSession, context);
        this.A01 = userSession;
        this.A02 = context;
        this.A00 = AnonymousClass1QO.A00(userSession);
    }
}
