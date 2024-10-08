package com.android.billingclient.api;

import X.AnonymousClass0fD;
import X.C13891TjE;
import X.C8553Qwr;
import X.DbS;
import X.Pxe;
import X.Pxf;
import X.RDY;
import X.SPi;
import X.SUN;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;

public class ProxyBillingActivity extends Activity {
    public ResultReceiver A00;
    public ResultReceiver A01;
    public boolean A02;
    public boolean A03;

    private Intent A00() {
        Intent A0G = Pxe.A0G("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        Pxe.A1L(getApplicationContext(), A0G);
        String action = A0G.getAction();
        SPi sPi = SPi.$redex_init_class;
        A0G.putExtra("BROADCAST_RECEIVER_LOGGING_PAYLOAD", SPi.A02(C8553Qwr.A01(C13891TjE.A00.getOrDefault(action, RDY.BROADCAST_ACTION_UNSPECIFIED))).A0J());
        return A0G;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
        if (r0 != null) goto L_0x001b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0051  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onActivityResult(int r10, int r11, android.content.Intent r12) {
        /*
            r9 = this;
            super.onActivityResult(r10, r11, r12)
            r5 = 0
            r3 = 0
            r6 = 110(0x6e, float:1.54E-43)
            java.lang.String r2 = "ProxyBillingActivity"
            r0 = 100
            if (r10 == r0) goto L_0x0036
            if (r10 == r6) goto L_0x0036
            r0 = 101(0x65, float:1.42E-43)
            if (r10 != r0) goto L_0x002a
            int r4 = X.SUN.A00(r12)
            android.os.ResultReceiver r0 = r9.A00
            if (r0 == 0) goto L_0x0024
        L_0x001b:
            if (r12 == 0) goto L_0x0021
            android.os.Bundle r5 = r12.getExtras()
        L_0x0021:
            r0.send(r4, r5)
        L_0x0024:
            r9.A03 = r3
            r9.finish()
            return
        L_0x002a:
            java.lang.String r1 = "Got onActivityResult with wrong requestCode: "
            java.lang.String r0 = "; skipping..."
            java.lang.String r0 = X.002.A0c(r1, r0, r10)
            X.SUN.A0A(r2, r0)
            goto L_0x0024
        L_0x0036:
            X.SGo r0 = X.SUN.A04(r12, r2)
            int r4 = r0.A00
            r0 = -1
            if (r11 != r0) goto L_0x0042
            if (r4 == 0) goto L_0x00e1
            r11 = -1
        L_0x0042:
            java.lang.String r1 = "Activity finished with resultCode "
            java.lang.String r0 = " and billing's responseCode: "
            java.lang.String r0 = X.002.A02(r11, r4, r1, r0)
            X.SUN.A0A(r2, r0)
        L_0x004d:
            android.os.ResultReceiver r0 = r9.A01
            if (r0 != 0) goto L_0x001b
            if (r12 == 0) goto L_0x00dc
            android.os.Bundle r0 = r12.getExtras()
            java.lang.String r7 = "LAUNCH_BILLING_FLOW"
            java.lang.String r5 = "INTENT_SOURCE"
            if (r0 == 0) goto L_0x00b4
            android.os.Bundle r0 = r12.getExtras()
            java.lang.String r2 = "ALTERNATIVE_BILLING_USER_CHOICE_DATA"
            java.lang.String r1 = r0.getString(r2)
            if (r1 == 0) goto L_0x00a8
            java.lang.String r0 = "com.android.vending.billing.ALTERNATIVE_BILLING"
            android.content.Intent r4 = X.Pxe.A0G(r0)
            android.content.Context r0 = r9.getApplicationContext()
            X.Pxe.A1L(r0, r4)
            r4.putExtra(r2, r1)
            java.lang.String r2 = r4.getAction()
            X.SPi r0 = X.SPi.$redex_init_class
            X.TMy r1 = X.C13891TjE.A00
            X.RDY r0 = X.RDY.BROADCAST_ACTION_UNSPECIFIED
            java.lang.Object r0 = r1.getOrDefault(r2, r0)
            X.Qwr r0 = X.C8553Qwr.A01(r0)
            X.QxS r0 = X.SPi.A02(r0)
            byte[] r1 = r0.A0J()
            java.lang.String r0 = "BROADCAST_RECEIVER_LOGGING_PAYLOAD"
        L_0x0095:
            r4.putExtra(r0, r1)
        L_0x0098:
            r4.putExtra(r5, r7)
        L_0x009b:
            if (r10 != r6) goto L_0x00a3
            r1 = 1
            java.lang.String r0 = "IS_FIRST_PARTY_PURCHASE"
            r4.putExtra(r0, r1)
        L_0x00a3:
            r9.sendBroadcast(r4)
            goto L_0x0024
        L_0x00a8:
            android.content.Intent r4 = r9.A00()
            android.os.Bundle r0 = r12.getExtras()
            r4.putExtras(r0)
            goto L_0x0098
        L_0x00b4:
            android.content.Intent r4 = r9.A00()
            java.lang.String r0 = "Got null bundle!"
            X.SUN.A0A(r2, r0)
            java.lang.String r0 = "RESPONSE_CODE"
            r8 = 6
            r4.putExtra(r0, r8)
            java.lang.String r1 = "DEBUG_MESSAGE"
            java.lang.String r0 = "An internal error occurred."
            r4.putExtra(r1, r0)
            r2 = 22
            r1 = 2
            X.SGo r0 = X.C11230SGo.A00(r0, r8)
            X.QxQ r0 = X.SPi.A00(r0, r2, r1)
            byte[] r1 = r0.A0J()
            java.lang.String r0 = "FAILURE_LOGGING_PAYLOAD"
            goto L_0x0095
        L_0x00dc:
            android.content.Intent r4 = r9.A00()
            goto L_0x009b
        L_0x00e1:
            r4 = 0
            goto L_0x004d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.ProxyBillingActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    public final void onCreate(Bundle bundle) {
        int i;
        int i2;
        PendingIntent pendingIntent;
        int A022 = Pxf.A02(this, -1052723710);
        Bundle bundle2 = bundle;
        super.onCreate(bundle2);
        if (bundle == null) {
            SUN.A09("ProxyBillingActivity", "Launching Play Store billing flow");
            boolean hasExtra = getIntent().hasExtra("BUY_INTENT");
            Intent intent = getIntent();
            if (hasExtra) {
                pendingIntent = (PendingIntent) intent.getParcelableExtra("BUY_INTENT");
                if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                    this.A02 = true;
                    i2 = 110;
                    this.A03 = true;
                    startIntentSenderForResult(pendingIntent.getIntentSender(), i2, DbS.A09(), 0, 0, 0);
                    i = 164295875;
                }
            } else {
                boolean hasExtra2 = intent.hasExtra("SUBS_MANAGEMENT_INTENT");
                Intent intent2 = getIntent();
                if (hasExtra2) {
                    pendingIntent = (PendingIntent) intent2.getParcelableExtra("SUBS_MANAGEMENT_INTENT");
                    this.A01 = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
                } else if (intent2.hasExtra("IN_APP_MESSAGE_INTENT")) {
                    pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
                    this.A00 = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
                    i2 = 101;
                    this.A03 = true;
                    startIntentSenderForResult(pendingIntent.getIntentSender(), i2, DbS.A09(), 0, 0, 0);
                    i = 164295875;
                } else {
                    pendingIntent = null;
                }
            }
            i2 = 100;
            try {
                this.A03 = true;
                startIntentSenderForResult(pendingIntent.getIntentSender(), i2, DbS.A09(), 0, 0, 0);
                i = 164295875;
            } catch (IntentSender.SendIntentException e) {
                SUN.A0B("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", e);
                ResultReceiver resultReceiver = this.A01;
                if (resultReceiver != null) {
                    resultReceiver.send(6, (Bundle) null);
                } else {
                    ResultReceiver resultReceiver2 = this.A00;
                    if (resultReceiver2 != null) {
                        resultReceiver2.send(0, (Bundle) null);
                    } else {
                        Intent A002 = A00();
                        if (this.A02) {
                            A002.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                        }
                        A002.putExtra("RESPONSE_CODE", 6);
                        A002.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                        sendBroadcast(A002);
                    }
                }
                this.A03 = false;
                finish();
                i = 1330266237;
            }
        } else {
            SUN.A09("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.A03 = bundle2.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle2.containsKey("result_receiver")) {
                this.A01 = (ResultReceiver) bundle2.getParcelable("result_receiver");
            } else if (bundle2.containsKey("in_app_message_result_receiver")) {
                this.A00 = (ResultReceiver) bundle2.getParcelable("in_app_message_result_receiver");
            }
            this.A02 = bundle2.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
            i = 2129764559;
        }
        AnonymousClass0fD.A07(i, A022);
    }

    public final void onDestroy() {
        int i;
        int A002 = AnonymousClass0fD.A00(-354970116);
        super.onDestroy();
        if (!isFinishing() || !this.A03) {
            i = 447854104;
        } else {
            Intent A003 = A00();
            A003.putExtra("RESPONSE_CODE", 1);
            A003.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            sendBroadcast(A003);
            i = -1791009161;
        }
        AnonymousClass0fD.A07(i, A002);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.A01;
        if (resultReceiver != null) {
            bundle.putParcelable("result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.A00;
        if (resultReceiver2 != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver2);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.A03);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.A02);
    }
}
