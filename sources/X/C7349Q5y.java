package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.facebook.rti.push.service.FbnsServiceDelegate;

/* renamed from: X.Q5y  reason: case insensitive filesystem */
public final class C7349Q5y extends BroadcastReceiver {
    public final /* synthetic */ SP2 A00;

    public C7349Q5y(SP2 sp2) {
        this.A00 = sp2;
    }

    public final void onReceive(Context context, Intent intent) {
        int i;
        String str;
        String A0R;
        int A03 = C66580MXl.A03(this, context, intent, -1961278261);
        SP2 sp2 = this.A00;
        if (intent == null) {
            sp2.A05.A0a((String) null, "no_intent_present");
            i = 764955254;
        } else {
            C241903Rv r2 = sp2.A03;
            String A002 = C241903Rv.A00(intent);
            if (!C9556Rct.A00(intent.getAction(), "com.facebook.rti.intent.ACTION_NOTIFICATION_ACK")) {
                sp2.A05.A0a(A002, "incorrect_intent_action");
                i = 1705175804;
            } else if (!((AnonymousClass3RX) AnonymousClass3RD.A00).A00(intent, r2).CeP()) {
                sp2.A05.A0a(A002, C66579MXk.A00(1127));
                i = 1435405643;
            } else {
                String stringExtra = intent.getStringExtra(C66579MXk.A00(34));
                if (!TextUtils.isEmpty(stringExtra)) {
                    if (!intent.getBooleanExtra("extra_processor_completed", true)) {
                        String stringExtra2 = intent.getStringExtra("processor_failed_reason");
                        if (TextUtils.isEmpty(stringExtra2)) {
                            A0R = "processor_failed";
                        } else {
                            A0R = 002.A0R("processor_failed_", stringExtra2);
                        }
                        sp2.A05.A0a(A002, A0R);
                    }
                    FbnsServiceDelegate fbnsServiceDelegate = sp2.A05;
                    String str2 = stringExtra;
                    if (A002 != null) {
                        str2 = 002.A0T(stringExtra, A002, '_');
                    }
                    T9D A0U = fbnsServiceDelegate.A0U(str2);
                    if (A0U instanceof C7860Qbk) {
                        C11375SQk A032 = sp2.A03();
                        synchronized (A032) {
                            A0U = C11375SQk.A00(A032, stringExtra);
                            A032.A03.remove(stringExtra);
                            C13849TiS AR1 = A032.A02.AR1();
                            AR1.ED1(stringExtra);
                            AR1.AIO();
                        }
                    }
                    if (A0U instanceof C7860Qbk) {
                        str = "not_found_in_fbns_notif_store";
                    } else {
                        fbnsServiceDelegate.A0Z((C10793RyF) A0U.A01(), stringExtra, A002);
                        i = 1341752853;
                    }
                } else {
                    str = "notif_id_not_present_in_intent";
                }
                sp2.A05.A0a(A002, str);
                i = 1341752853;
            }
        }
        AnonymousClass0fD.A0E(i, A03, intent);
    }
}
