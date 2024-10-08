package X;

import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.SystemClock;
import com.facebook.proxygen.TraceFieldType;
import java.util.ArrayList;
import java.util.Map;

public final class FGJ {
    public static final FGJ A03 = new Object();
    public C51864G4y A00;
    public G68 A01;
    public C46662Diq A02;

    public static void A00(Activity activity, 0lg r8, FGJ fgj, String str) {
        Activity activity2 = activity;
        if (!activity.isFinishing() && !activity.isDestroyed()) {
            ArrayList A1C = AnonymousClass7TE.A1C();
            A1C.add("android.permission.RECEIVE_SMS");
            1DL.A04(activity2, new T7J(fgj, r8, activity2, str, 1), (String[]) A1C.toArray(new String[A1C.size()]));
        }
    }

    public final /* synthetic */ void A04(Activity activity, 0lg r8, String str, Map map) {
        if (map.get("android.permission.RECEIVE_SMS") == C346927vz.GRANTED) {
            G68 g68 = this.A01;
            g68.getClass();
            C46662Diq diq = new C46662Diq(r8, g68, str);
            this.A02 = diq;
            Context applicationContext = activity.getApplicationContext();
            0qQ.A0B(applicationContext, 0);
            0DH.A00(diq, applicationContext, new IntentFilter("android.provider.Telephony.SMS_RECEIVED"));
            double A002 = DbV.A00(r8, 0);
            double A003 = DbS.A00();
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(r8), "sms_permission_allowed");
            DbZ.A1G(A0e, A002, A003);
            DbY.A1I(A0e, "flow", "phone", A003);
            DbZ.A1J(A0e, "phone");
            FH8.A04(A0e);
            FH8.A08(A0e, r8);
            return;
        }
        C49886FBm A06 = 1Q0.A1q.A02(r8).A06(EXD.PHONE, C46634DiE.A1F);
        A06.A03("os_version", Build.VERSION.SDK_INT);
        A06.A02();
    }

    public static void A01(Context context, 0lg r7, String str, String str2, boolean z) {
        context.getClass();
        str.getClass();
        str2.getClass();
        String A002 = 0qv.A00(context);
        String A0s = DbT.A0s(context);
        1NY A0N = DbU.A0N(r7);
        A0N.A0A("accounts/validate_signup_sms_code/");
        A0N.A9m(Dbj.A00(), str);
        A0N.A9m(Dbj.A04(39, 17, 26), str2);
        DbU.A1O(A0N, A002);
        DbY.A1J(A0N, "guid", A0s);
        1OC A0N2 = DbY.A0N(A0N, ENL.class, C49768F6b.class);
        A0N2.A00 = new EDX(context, r7, str, str2, z);
        1ES.A03(A0N2);
    }

    public static void A02(0lg r7, C46634DiE diE, String str, long j) {
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(r7), "ig_android_sms_retriever_error");
        if (A0e.isSampled()) {
            double A002 = DbS.A00();
            double A012 = DbS.A01();
            A0e.A9F(TraceFieldType.Duration, Long.valueOf(j));
            FH8.A0E(A0e, "error_type", str);
            DbS.A1H(A0e, diE.A01);
            DbZ.A1E(A0e);
            DbY.A1D(A0e, A012, A002);
            0qQ.A0B(r7, 0);
            DbY.A1I(A0e, "source", DbZ.A0m(r7), A002);
            A0e.Cgf();
        }
    }

    public final void A03(Activity activity, 0lg r19, G68 g68, C46634DiE diE, String str) {
        C51864G4y g4y;
        11Z.A00();
        Activity activity2 = activity;
        activity2.getClass();
        String str2 = str;
        str2.getClass();
        11Z.A00();
        if (!(this.A02 == null || this.A01 == null || (g4y = this.A00) == null || !((C46663Dir) g4y).A03.get())) {
            A05(activity2);
        }
        G68 g682 = g68;
        this.A01 = g682;
        1WP instance = 1WP.getInstance();
        0lg r10 = r19;
        if (instance == null || !0oI.A0C(activity2) || 1DL.A07(activity2, "android.permission.RECEIVE_SMS")) {
            A00(activity2, r10, this, str2);
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C46634DiE diE2 = diE;
        String str3 = diE2.A01;
        boolean A1Z = AnonymousClass7TG.A1Z(r10, str3);
        double A012 = DbS.A01();
        double A002 = DbS.A00();
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(r10), "ig_android_sms_retriever_started");
        DbZ.A1G(A0e, A012, A002);
        FH8.A05(A0e);
        FH8.A06(A0e);
        DbW.A12(A0e, A002);
        DbS.A1H(A0e, str3);
        DbZ.A1E(A0e);
        FH8.A04(A0e);
        FH8.A0C(A0e, r10);
        C51864G4y listenForSmsResponse = instance.listenForSmsResponse(activity2, A1Z);
        this.A00 = listenForSmsResponse;
        ((C46663Dir) listenForSmsResponse).A00 = new Fdz(activity2, r10, g682, this, diE2, str2, elapsedRealtime);
    }

    public final void A05(Context context) {
        C51864G4y g4y;
        11Z.A00();
        context.getClass();
        11Z.A00();
        if (this.A02 != null && this.A01 != null && (g4y = this.A00) != null && ((C46663Dir) g4y).A03.get()) {
            if (this.A01 != null) {
                this.A01 = null;
            }
            C51864G4y g4y2 = this.A00;
            if (g4y2 != null && ((C46663Dir) g4y2).A03.get()) {
                C46663Dir.A00((C46663Dir) this.A00);
                this.A00 = null;
            }
            C46662Diq diq = this.A02;
            if (diq != null) {
                Context applicationContext = context.getApplicationContext();
                0qQ.A0B(applicationContext, 0);
                applicationContext.unregisterReceiver(diq);
                this.A02 = null;
            }
        }
    }
}
