package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

public final class Q6C extends BroadcastReceiver {
    public boolean A00;
    public boolean A01;
    public final boolean A02;
    public final /* synthetic */ C10770Rxo A03;

    public final synchronized void A01(Context context) {
        if (this.A00) {
            context.unregisterReceiver(this);
            this.A00 = false;
        } else {
            SUN.A0A("BillingBroadcastManager", "Receiver is not registered.");
        }
    }

    public final synchronized void A02(Context context, IntentFilter intentFilter) {
        if (!this.A00) {
            C10770Rxo rxo = this.A03;
            this.A01 = rxo.A00;
            C13891TjE tjE = rxo.A03;
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                SPi sPi = SPi.$redex_init_class;
                A1C.add((RDY) C13891TjE.A00.getOrDefault(action, RDY.BROADCAST_ACTION_UNSPECIFIED));
            }
            int i2 = 2;
            tjE.FPg(A1C, 2, false, this.A01);
            if (Build.VERSION.SDK_INT >= 33) {
                if (true != this.A02) {
                    i2 = 4;
                }
                context.registerReceiver(this, intentFilter, i2);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.A00 = true;
        }
    }

    public Q6C(C10770Rxo rxo, boolean z) {
        this.A03 = rxo;
        this.A02 = z;
    }

    private final void A00(Bundle bundle, C11230SGo sGo, int i) {
        if (bundle.getByteArray("FAILURE_LOGGING_PAYLOAD") != null) {
            try {
                this.A03.A03.FP8(C8588QxQ.A0A(C11371SQf.A00(), bundle.getByteArray("FAILURE_LOGGING_PAYLOAD")));
            } catch (Throwable unused) {
                SUN.A0A("BillingBroadcastManager", "Failed parsing Api failure.");
            }
        } else {
            Pxf.A1C(sGo, this.A03.A03, 23, i);
        }
    }

    public final void onReceive(Context context, Intent intent) {
        int i;
        C8590QxS qxS;
        Intent intent2 = intent;
        int A032 = C66580MXl.A03(this, context, intent2, -1027210209);
        Bundle extras = intent2.getExtras();
        if (extras == null) {
            SUN.A0A("BillingBroadcastManager", "Bundle is null.");
            C10770Rxo rxo = this.A03;
            C13891TjE tjE = rxo.A03;
            C11230SGo sGo = C10139RnG.A0B;
            Pxf.A1C(sGo, tjE, 11, 1);
            rxo.A02.Db3(sGo, (List) null);
            i = -1369780767;
        } else {
            C11230SGo A04 = SUN.A04(intent2, "BillingBroadcastManager");
            String action = intent2.getAction();
            int i2 = 2;
            if (true != 2Ob.A00(extras.getString("INTENT_SOURCE"), "LAUNCH_BILLING_FLOW")) {
                i2 = 1;
            }
            if (extras.getByteArray("BROADCAST_RECEIVER_LOGGING_PAYLOAD") != null) {
                try {
                    C13891TjE tjE2 = this.A03.A03;
                    ((C11839ShR) tjE2).A00(C8590QxS.A0A(C11371SQf.A00(), extras.getByteArray("BROADCAST_RECEIVER_LOGGING_PAYLOAD")));
                } catch (Throwable unused) {
                    SUN.A0A("BillingBroadcastManager", "Failed parsing Api failure.");
                }
            }
            if (action.equals("com.android.vending.billing.PURCHASES_UPDATED") || action.equals("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED")) {
                ArrayList A08 = SUN.A08(extras);
                if (A04.A00 == 0) {
                    this.A03.A03.FPK(SPi.A01(i2));
                } else {
                    A00(extras, A04, i2);
                }
                C10770Rxo rxo2 = this.A03;
                C13891TjE tjE3 = rxo2.A03;
                SPi sPi = SPi.$redex_init_class;
                C8553Qwr A012 = C8553Qwr.A01(C13891TjE.A00.getOrDefault(action, RDY.BROADCAST_ACTION_UNSPECIFIED));
                boolean z = this.A01;
                C11839ShR shR = (C11839ShR) tjE3;
                try {
                    C8579QxH A002 = C8590QxS.A00();
                    A002.A07(4);
                    A002.A0A(A012);
                    A002.A06();
                    A002.A0B(z);
                    Iterator it = A08.iterator();
                    while (it.hasNext()) {
                        Purchase purchase = (Purchase) it.next();
                        C8578QxG A003 = C8586QxO.A00();
                        A003.A07(Purchase.A00(purchase));
                        JSONObject jSONObject = purchase.A02;
                        int i3 = 1;
                        if (jSONObject.optInt("purchaseState", 1) == 4) {
                            i3 = 2;
                        }
                        A003.A06(i3);
                        A003.A08(jSONObject.optString("packageName"));
                        A002.A09(A003);
                    }
                    C8577QxF A004 = C8587QxP.A00();
                    A004.A06(A04.A00);
                    A004.A08(A04.A01);
                    A002.A08(A004);
                    qxS = (C8590QxS) A002.A01();
                } catch (Exception e) {
                    SUN.A0B("BillingLogger", "Unable to create logging payload", e);
                    qxS = null;
                } catch (Throwable th) {
                    SUN.A0B("BillingLogger", "Unable to log.", th);
                }
                shR.A00(qxS);
                rxo2.A02.Db3(A04, A08);
                i = -2016356730;
            } else if (action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
                C10770Rxo rxo3 = this.A03;
                C13891TjE tjE4 = rxo3.A03;
                SPi sPi2 = SPi.$redex_init_class;
                tjE4.FPg(C8553Qwr.A01(C13891TjE.A00.getOrDefault(action, RDY.BROADCAST_ACTION_UNSPECIFIED)), 4, false, this.A01);
                if (A04.A00 != 0) {
                    A00(extras, A04, i2);
                    rxo3.A02.Db3(A04, C8553Qwr.A00());
                    i = -213558919;
                } else {
                    SUN.A0A("BillingBroadcastManager", "AlternativeBillingListener and UserChoiceBillingListener is null.");
                    C11230SGo sGo2 = C10139RnG.A0B;
                    Pxf.A1C(sGo2, tjE4, 77, i2);
                    rxo3.A02.Db3(sGo2, C8553Qwr.A00());
                    i = 1473186187;
                }
            } else {
                i = 57605544;
            }
        }
        AnonymousClass0fD.A0E(i, A032, intent2);
    }
}
