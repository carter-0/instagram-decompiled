package androidx.test.core.app;

import X.AnonymousClass0fD;
import X.C41845B3m;
import X.Pxe;
import X.Pxf;
import X.Q63;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.test.internal.platform.ThreadChecker;
import androidx.test.internal.util.Checks;

public abstract class InstrumentationActivityInvoker {

    public class BootstrapActivity extends Activity {
        public boolean A00;
        public final BroadcastReceiver A01 = new Q63(this, 1);

        public final void onActivityResult(int i, int i2, Intent intent) {
            if (i == 0) {
                Intent A0G = Pxe.A0G("androidx.test.core.app.InstrumentationActivityInvoker.BOOTSTRAP_ACTIVITY_RESULT_RECEIVED");
                A0G.putExtra("androidx.test.core.app.InstrumentationActivityInvoker.BOOTSTRAP_ACTIVITY_RESULT_CODE_KEY", i2);
                if (intent != null) {
                    A0G.putExtra("androidx.test.core.app.InstrumentationActivityInvoker.BOOTSTRAP_ACTIVITY_RESULT_DATA_KEY", intent);
                }
                sendBroadcast(A0G);
                finish();
            }
        }

        public final void finish() {
            super.finish();
            overridePendingTransition(0, 0);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0020, code lost:
            if (r5.getBoolean("IS_TARGET_ACTIVITY_STARTED_KEY", false) == false) goto L_0x0022;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onCreate(android.os.Bundle r5) {
            /*
                r4 = this;
                r0 = 1716649766(0x6651ff26, float:2.4792031E23)
                int r3 = X.Pxf.A02(r4, r0)
                super.onCreate(r5)
                android.content.BroadcastReceiver r2 = r4.A01
                java.lang.String r1 = "androidx.test.core.app.InstrumentationActivityInvoker.FINISH_BOOTSTRAP_ACTIVITY"
                android.content.IntentFilter r0 = new android.content.IntentFilter
                r0.<init>(r1)
                androidx.test.core.app.InstrumentationActivityInvoker.A00(r2, r4, r0)
                r2 = 0
                if (r5 == 0) goto L_0x0022
                java.lang.String r0 = "IS_TARGET_ACTIVITY_STARTED_KEY"
                boolean r1 = r5.getBoolean(r0, r2)
                r0 = 1
                if (r1 != 0) goto L_0x0023
            L_0x0022:
                r0 = 0
            L_0x0023:
                r4.A00 = r0
                r4.overridePendingTransition(r2, r2)
                r0 = -1451946368(0xffffffffa9750e80, float:-5.4413505E-14)
                X.AnonymousClass0fD.A07(r0, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.test.core.app.InstrumentationActivityInvoker.BootstrapActivity.onCreate(android.os.Bundle):void");
        }

        public final void onDestroy() {
            int A002 = AnonymousClass0fD.A00(-897451316);
            super.onDestroy();
            unregisterReceiver(this.A01);
            AnonymousClass0fD.A07(31942809, A002);
        }

        public final void onResume() {
            int A002 = AnonymousClass0fD.A00(1698697661);
            super.onResume();
            if (!this.A00) {
                this.A00 = true;
                Parcelable parcelableExtra = getIntent().getParcelableExtra("androidx.test.core.app.InstrumentationActivityInvoker.START_TARGET_ACTIVITY_INTENT_KEY");
                ThreadChecker threadChecker = Checks.A00;
                parcelableExtra.getClass();
                PendingIntent pendingIntent = (PendingIntent) parcelableExtra;
                Bundle bundleExtra = getIntent().getBundleExtra("androidx.test.core.app.InstrumentationActivityInvoker.TARGET_ACTIVITY_OPTIONS_BUNDLE_KEY");
                if (bundleExtra != null) {
                    try {
                        startIntentSenderForResult(pendingIntent.getIntentSender(), 0, (Intent) null, 268435456, 0, 0, bundleExtra);
                    } catch (IntentSender.SendIntentException e) {
                        Log.e("androidx.test.core.app.InstrumentationActivityInvoker$BootstrapActivity", "Failed to start target activity.", e);
                        RuntimeException A0j = C41845B3m.A0j(e);
                        AnonymousClass0fD.A07(1849125782, A002);
                        throw A0j;
                    }
                } else {
                    startIntentSenderForResult(pendingIntent.getIntentSender(), 0, (Intent) null, 268435456, 0, 0);
                }
            }
            AnonymousClass0fD.A07(-1576145524, A002);
        }

        public final void onSaveInstanceState(Bundle bundle) {
            super.onSaveInstanceState(bundle);
            bundle.putBoolean("IS_TARGET_ACTIVITY_STARTED_KEY", this.A00);
        }
    }

    public class EmptyActivity extends Activity {
        public final BroadcastReceiver A00 = new Q63(this, 2);

        public final void finish() {
            super.finish();
            overridePendingTransition(0, 0);
        }

        public final void onCreate(Bundle bundle) {
            int A02 = Pxf.A02(this, 2007609749);
            super.onCreate(bundle);
            InstrumentationActivityInvoker.A00(this.A00, this, new IntentFilter("androidx.test.core.app.InstrumentationActivityInvoker.FINISH_EMPTY_ACTIVITIES"));
            overridePendingTransition(0, 0);
            AnonymousClass0fD.A07(131107804, A02);
        }

        public final void onDestroy() {
            int A002 = AnonymousClass0fD.A00(-2061992265);
            super.onDestroy();
            unregisterReceiver(this.A00);
            AnonymousClass0fD.A07(-1720267599, A002);
        }

        public final void onResume() {
            int A002 = AnonymousClass0fD.A00(465916527);
            super.onResume();
            sendBroadcast(Pxe.A0G("androidx.test.core.app.InstrumentationActivityInvoker.EMPTY_ACTIVITY_RESUMED"));
            AnonymousClass0fD.A07(-1766033802, A002);
        }
    }

    public class EmptyFloatingActivity extends Activity {
        public final BroadcastReceiver A00 = new Q63(this, 3);

        public final void finish() {
            super.finish();
            overridePendingTransition(0, 0);
        }

        public final void onCreate(Bundle bundle) {
            int A02 = Pxf.A02(this, 840797698);
            super.onCreate(bundle);
            InstrumentationActivityInvoker.A00(this.A00, this, new IntentFilter("androidx.test.core.app.InstrumentationActivityInvoker.FINISH_EMPTY_ACTIVITIES"));
            overridePendingTransition(0, 0);
            AnonymousClass0fD.A07(-1497505514, A02);
        }

        public final void onDestroy() {
            int A002 = AnonymousClass0fD.A00(-1365335671);
            super.onDestroy();
            unregisterReceiver(this.A00);
            AnonymousClass0fD.A07(345698783, A002);
        }

        public final void onResume() {
            int A002 = AnonymousClass0fD.A00(-673341291);
            super.onResume();
            sendBroadcast(Pxe.A0G("androidx.test.core.app.InstrumentationActivityInvoker.EMPTY_FLOATING_ACTIVITY_RESUMED"));
            AnonymousClass0fD.A07(-619770408, A002);
        }
    }

    public static void A00(BroadcastReceiver broadcastReceiver, Context context, IntentFilter intentFilter) {
        if (Build.VERSION.SDK_INT < 33) {
            context.registerReceiver(broadcastReceiver, intentFilter);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter, 2);
        }
    }
}
