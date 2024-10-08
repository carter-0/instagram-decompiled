package X;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.proxygen.LigerSamplePolicy;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.inappbrowser.service.BrowserLiteCallbackService;
import com.instagram.wellbeing.timeinapp.instrumentation.IgTimeInAppActivityListener;

/* renamed from: X.Mrs  reason: case insensitive filesystem */
public final class C67662Mrs extends Handler {
    public final BrowserLiteCallbackService A00;

    public final void handleMessage(Message message) {
        String str;
        2MJ r1;
        2Oj r0;
        String str2;
        try {
            BrowserLiteCallbackService browserLiteCallbackService = this.A00;
            UserSession A08 = 09i.A0A.A08(browserLiteCallbackService);
            int i = message.what;
            if (i != 0) {
                String A002 = Pxd.A00(798);
                boolean z = true;
                if (i == 1) {
                    0kR.A0D(browserLiteCallbackService, Intent.createChooser(new Intent("android.intent.action.SEND").putExtra("android.intent.extra.TEXT", (String) message.obj).setType("text/plain"), browserLiteCallbackService.getString(R.string.f0nameremoved)).addFlags(276824064));
                } else if (i != 2) {
                    if (i == 3) {
                        Object obj = message.obj;
                        if (obj == null || !AnonymousClass7TE.A1a(obj)) {
                            z = false;
                        }
                        C46641DiM diM = C46641DiM.A00;
                        if (!z) {
                            C46641DiM.A01(C48080EUy.ON_APP_BACKGROUNDED);
                        }
                        boolean z2 = 14i.A05;
                        if (!z) {
                            11Z.A06("This operation must be run on UI thread.");
                            14i.A04 = true;
                            Handler handler = 14i.A07;
                            Runnable runnable = 14i.A0A;
                            handler.removeCallbacks(runnable);
                            handler.postDelayed(runnable, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
                        }
                        1We r02 = 1We.A02;
                        if (r02 != null) {
                            r1 = IgTimeInAppActivityListener.A00(r02.A00, A08).A04;
                            r0 = 2Oj.A01;
                            r1.A01(r0);
                            return;
                        }
                        return;
                    } else if (i == 4) {
                        int i2 = message.arg1;
                        String str3 = null;
                        if (i2 == 2) {
                            str3 = "back";
                        } else if (i2 == 1) {
                            str3 = "up";
                        }
                        boolean z3 = message.getData().getBoolean(A002, true);
                        Object obj2 = message.obj;
                        obj2.getClass();
                        String str4 = (String) obj2;
                        0qQ.A0B(str4, 2);
                        2cc A003 = C71342cb.A00(A08);
                        A003.A0G = z3;
                        A003.A0D(new C12800T7n(str4, (String) null), str3, 0);
                        return;
                    } else {
                        throw DbW.A0b("Illegal action specified: ", i);
                    }
                }
                Bundle data = message.getData();
                String string = data.getString("moduleName");
                if (string == null) {
                    0wb.A03("IAB Logging", "Error getting null module name");
                    return;
                }
                if (data.getString("url") != null) {
                    str2 = data.getString("url");
                } else {
                    str2 = "";
                }
                boolean z4 = data.getBoolean(A002, true);
                if (!182.A06(0Tu.A05, A08, 36318209095309305L)) {
                    SCL.A00(A08, str2, string, z4);
                }
                C46641DiM.A01(C48080EUy.ON_APP_FOREGROUNDED);
                14i.A02();
                1We r03 = 1We.A02;
                if (r03 != null) {
                    r1 = IgTimeInAppActivityListener.A00(r03.A00, A08).A04;
                    r0 = 2Oj.A02;
                    r1.A01(r0);
                    return;
                }
                return;
            }
            Object obj3 = message.obj;
            obj3.getClass();
            0nC.A00(browserLiteCallbackService, (String) obj3);
            C59689JTv.A07(browserLiteCallbackService, R.string.f0nameremoved);
        } catch (Throwable th) {
            if (th.getMessage() != null) {
                str = th.getMessage();
            } else {
                str = "Error on loadUserSession: empty message";
            }
            0wb.A03("UITaskHandler", str);
        }
    }

    public C67662Mrs(BrowserLiteCallbackService browserLiteCallbackService) {
        super(Looper.getMainLooper());
        this.A00 = browserLiteCallbackService;
    }
}
