package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.play_billing.zzr;

/* renamed from: X.SVa  reason: case insensitive filesystem */
public final class C11439SVa implements ServiceConnection {
    public C13689Tf6 A00;
    public boolean A01 = false;
    public final Object A02 = Pxe.A0p();
    public final /* synthetic */ STX A03;

    public /* synthetic */ C11439SVa(STX stx, C13689Tf6 tf6) {
        this.A03 = stx;
        this.A00 = tf6;
    }

    public static final void A00(C11230SGo sGo, C11439SVa sVa) {
        synchronized (sVa.A02) {
            C13689Tf6 tf6 = sVa.A00;
            if (tf6 != null) {
                tf6.Cy1(sGo);
            }
        }
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        SUN.A09("BillingClient", "Billing service connected.");
        STX stx = this.A03;
        stx.A0K = zzr.A00(iBinder);
        TN1 tn1 = new TN1(this);
        if (STX.A02(STX.A00(stx), stx, new C12859TAz(this), tn1, 30000) == null) {
            C11230SGo A012 = STX.A01(stx);
            Pxf.A1C(A012, stx.A02, 25, 6);
            A00(A012, this);
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        SUN.A0A("BillingClient", "Billing service disconnected.");
        STX stx = this.A03;
        C13891TjE tjE = stx.A02;
        C8581QxJ A002 = C8581QxJ.A00();
        C11839ShR shR = (C11839ShR) tjE;
        if (A002 != null) {
            try {
                C8580QxI A003 = C8589QxR.A00();
                C8584QxM qxM = shR.A01;
                if (qxM != null) {
                    A003.A09(qxM);
                }
                A003.A0B(A002);
                shR.A00.A00((C8589QxR) A003.A01());
            } catch (Throwable th) {
                SUN.A0B("BillingLogger", "Unable to log.", th);
            }
        }
        stx.A0K = null;
        stx.A0I = 0;
        synchronized (this.A02) {
            C13689Tf6 tf6 = this.A00;
            if (tf6 != null) {
                tf6.Cy0();
            }
        }
    }
}
