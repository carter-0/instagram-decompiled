package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import com.facebook.perf.background.BackgroundStartupDetector;
import com.facebook.pushlite.model.PushInfraMetaData;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.react.modules.dialog.DialogModule;

/* renamed from: X.PZy  reason: case insensitive filesystem */
public final /* synthetic */ class C73280PZy implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ Intent A01;
    public final /* synthetic */ C67636MrP A02;

    public /* synthetic */ C73280PZy(Context context, Intent intent, C67636MrP mrP) {
        this.A02 = mrP;
        this.A00 = context;
        this.A01 = intent;
    }

    public final void run() {
        String str;
        MZw mZw;
        N4x n4x;
        0fA r4;
        QuickPerformanceLogger quickPerformanceLogger;
        C67636MrP mrP = this.A02;
        Context context = this.A00;
        Intent intent = this.A01;
        String action = intent.getAction();
        if (!"com.facebook.rti.fbns.intent.RECEIVE".equals(action)) {
            quickPerformanceLogger = mrP.A00;
            if (quickPerformanceLogger != null) {
                quickPerformanceLogger.markerAnnotate(875309620, "intent_action", action);
            } else {
                return;
            }
        } else if (!AnonymousClass0Ph.A00(context, intent)) {
            quickPerformanceLogger = mrP.A00;
            if (quickPerformanceLogger != null) {
                quickPerformanceLogger.markerAnnotate(875309620, "intent_auth_failed", true);
            } else {
                return;
            }
        } else {
            String stringExtra = intent.getStringExtra("receive_type");
            if (DialogModule.KEY_MESSAGE.equals(stringExtra)) {
                if (AnonymousClass1w6.A00 == null && (r4 = AnonymousClass1w6.A01) != null) {
                    r4.AEf("PushManager was not initialized before access", 817901599);
                }
                C67721wA r0 = AnonymousClass1w6.A00;
                if (!(r0 == null || (mZw = (MZw) r0.A08.getValue()) == null)) {
                    PushInfraMetaData A012 = PushInfraMetaData.Companion.A01(intent);
                    MZw.A01(mZw, A012);
                    QuickPerformanceLogger quickPerformanceLogger2 = mZw.A04;
                    if (quickPerformanceLogger2 != null) {
                        quickPerformanceLogger2.markerAnnotate(875309620, "is_background", AnonymousClass7TE.A0v().equals(BackgroundStartupDetector.A0G));
                    }
                    MarkerEditor A002 = MZw.A00(mZw);
                    if (A002 != null) {
                        A002.annotate("push_channel", "FBNS");
                        A002.point("received_start");
                    }
                    String stringExtra2 = intent.getStringExtra("data");
                    String stringExtra3 = intent.getStringExtra("bin");
                    1vl r02 = mZw.A05;
                    N4x n4x2 = null;
                    if (r02 != null) {
                        if (182.A06(0Tu.A05, r02.A00, 36321335832487202L)) {
                            Context context2 = mZw.A00;
                            if (stringExtra2 != null) {
                                n4x = new N4x(stringExtra2);
                            } else {
                                n4x = null;
                            }
                            if (stringExtra3 != null) {
                                n4x2 = new N4x(stringExtra3);
                            }
                            mZw.A05(new N31(context2, A012, n4x, n4x2, (Integer) null, "FBNS", false, false));
                        }
                    }
                    MarkerEditor A003 = MZw.A00(mZw);
                    if (A003 != null) {
                        A003.point("received_logging_start");
                    }
                    MZx mZx = mZw.A03;
                    if (mZx != null) {
                        0qQ.A0B(A012, 0);
                        MZx.A00(mZx, A012, "notif_received_push", "FBNS", AnonymousClass7TE.A1H());
                    }
                    MarkerEditor A004 = MZw.A00(mZw);
                    if (A004 != null) {
                        A004.point("received_logging_end");
                    }
                    mZw.A04(A012, A012.A08);
                    mZw.A06.A00(new BBV("FBNS", 3), mZw.A02(A012, stringExtra2, (String) null, "FBNS"));
                    MarkerEditor A005 = MZw.A00(mZw);
                    if (A005 != null) {
                        A005.point("received_end");
                    }
                }
                QuickPerformanceLogger quickPerformanceLogger3 = mrP.A00;
                if (quickPerformanceLogger3 != null) {
                    quickPerformanceLogger3.markerPoint(875309620, "ack_notification_start");
                }
                String stringExtra4 = intent.getStringExtra("extra_notification_sender");
                String stringExtra5 = intent.getStringExtra("extra_notification_id");
                if (stringExtra4 == null || stringExtra4.isEmpty()) {
                    if (quickPerformanceLogger3 != null) {
                        str = "ack_notification_pkg_empty";
                    } else {
                        return;
                    }
                } else if (stringExtra5 != null && !stringExtra5.isEmpty()) {
                    Intent intent2 = new Intent(Pxd.A00(199));
                    intent2.putExtra("extra_notification_id", stringExtra5);
                    intent2.putExtra(Pxd.A00(721), true);
                    if (AnonymousClass000.A00(4622).equals(stringExtra4) || "com.facebook.services.dev".equals(stringExtra4)) {
                        try {
                            intent2.setPackage(stringExtra4);
                            0Sy r2 = new 0Sy();
                            r2.A0D = true;
                            r2.A0B = context.getPackageName();
                            PendingIntent A013 = r2.A01(context, 0, 134217728);
                            Bundle A0a = AnonymousClass7TE.A0a();
                            A0a.putParcelable("auth_pending_intent", A013);
                            intent2.putExtra("auth_bundle", A0a);
                            context.sendBroadcast(intent2);
                        } catch (RuntimeException e) {
                            if (!(e.getCause() instanceof DeadObjectException)) {
                                throw e;
                            }
                        }
                    } else {
                        0KC.A0O("FBNSPreloadIPC", "Unknown package %s", new Object[]{stringExtra4});
                    }
                    if (quickPerformanceLogger3 != null) {
                        quickPerformanceLogger3.markerPoint(875309620, "ack_notification_end");
                        quickPerformanceLogger3.markerEnd(875309620, 2);
                        return;
                    }
                    return;
                } else if (quickPerformanceLogger3 != null) {
                    str = "ack_notification_notif_id_empty";
                } else {
                    return;
                }
                quickPerformanceLogger3.markerAnnotate(875309620, str, true);
                return;
            } else if ("registered".equals(stringExtra)) {
                intent.getStringExtra("data");
                throw new C318126oR("Push token registration not yet supported in PushSDK");
            } else if ("unregistered".equals(stringExtra)) {
                throw new C318126oR("Push token registration not yet supported in PushSDK");
            } else if ("reg_error".equals(stringExtra)) {
                intent.getStringExtra("data");
                throw new C318126oR("Push token registration not yet supported in PushSDK");
            } else {
                return;
            }
        }
        quickPerformanceLogger.markerEnd(875309620, 3);
    }
}
