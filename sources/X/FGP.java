package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.CompoundButton;
import androidx.fragment.app.FragmentActivity;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.bugreporter.model.BugReport;
import com.instagram.bugreporter.source.BugReportSource;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;

public abstract class FGP {
    public static final void A00(Activity activity, BugReportSource bugReportSource, UserSession userSession) {
        Activity activity2 = activity;
        0qQ.A0B(activity2, 0);
        BugReportSource bugReportSource2 = bugReportSource;
        UserSession userSession2 = userSession;
        if (!AnonymousClass2Bh.A00()) {
            DbW.A0T(userSession2).A02(activity2, ((C64901Yc) HWC.A00()).A01.CrE(activity2, (C74547Pwg) null, bugReportSource2, userSession2, (String) null, 2cc.A0T.A01(userSession2), DbS.A0k(), true, false, false));
            return;
        }
        Context applicationContext = activity2.getApplicationContext();
        C49673F1f f1f = new C49673F1f(userSession2, (String) null);
        0Aj A0e = AnonymousClass7TE.A0e(f1f.A00, "rage_shake_impression");
        if (A0e.isSampled()) {
            DbV.A1G(A0e, "menu");
        }
        FF8 ff8 = new FF8(activity2);
        ff8.A01(2131972206);
        ff8.A04(new FIh(5, activity2, applicationContext, f1f, bugReportSource, userSession), new CharSequence[]{applicationContext.getString(2131951990), applicationContext.getString(2131973088), applicationContext.getString(2131971293)});
        C49968FHb fHb = new C49968FHb(f1f, 8);
        C46659Dig dig = ff8.A0D;
        dig.setOnCancelListener(fHb);
        dig.setCanceledOnTouchOutside(true);
        AnonymousClass0fN.A00(ff8.A00());
    }

    public static final void A01(Activity activity, BugReportSource bugReportSource, UserSession userSession, String str, String str2) {
        OWB owb = new OWB();
        owb.A0I = userSession.A06;
        owb.A00 = bugReportSource;
        owb.A0B = DbS.A0k();
        owb.A0H = 2cc.A0T.A01(userSession);
        BugReport A01 = owb.A01();
        OLY oly = new OLY(activity);
        oly.A01 = str2;
        oly.A00 = str;
        new NMP(activity, (Bitmap) null, oly.A00(), (C74547Pwg) null, A01, userSession).A02(new Void[0]);
    }

    public static final void A02(Activity activity, UserSession userSession, String str, String str2) {
        0qQ.A0B(activity, 0);
        AnonymousClass7TG.A1U(userSession, str, str2);
        Bundle A0a = AnonymousClass7TE.A0a();
        String str3 = userSession.A05;
        DbS.A1A(A0a, str3);
        String A0R = 002.A0R(str, "_entered");
        0qQ.A07(A0R);
        FCT.A01((AnonymousClass0iw) null, userSession, "notifications", A0R, (String) null);
        C309516Yo A0Q = DbU.A0Q((FragmentActivity) activity, userSession);
        A0Q.A0B(A0a, SAY.A01(str3, str, str2));
        A0Q.A04();
    }

    public static final void A03(Context context, AnonymousClass07i r9, UserSession userSession, G7L g7l, String str, boolean z) {
        Long A01;
        String str2;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 4);
        C2605045x A00 = C2605045x.A00();
        boolean z2 = z;
        if (z) {
            A01 = A00.A02(true);
        } else {
            A01 = A00.A01(true);
        }
        0qQ.A0A(A01);
        String valueOf = String.valueOf(A01.longValue());
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0A("accounts/set_presence_disabled/");
        if (z) {
            str2 = "0";
        } else {
            str2 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        }
        A0a.A9m(str, str2);
        A0a.A0G(TraceFieldType.RequestID, valueOf);
        1OC A0L = DbW.A0L(A0a, C47350Dvk.class, C49786F6u.class, true);
        G7L g7l2 = g7l;
        A0L.A00 = new EC8(g7l2, userSession2, context, str, 1, z2);
        1ES.A00(context, r9, A0L);
    }

    public static final void A04(Context context, 0lg r18, String str, String str2) {
        String str3 = str;
        0lg r2 = r18;
        0qQ.A0B(r2, 1);
        Context context2 = context;
        if (!00p.A0k(str3, "http", false)) {
            str3 = SQU.A02(context2, 1Ma.A03(str3));
        }
        SimpleWebViewActivity.A02.A02(context2, r2, new SimpleWebViewConfig((String) null, (String) null, false, false, false, false, false, true, false, false, true, false, false, false, str2, str3));
    }

    public static final void A05(CompoundButton.OnCheckedChangeListener onCheckedChangeListener, CompoundButton compoundButton, boolean z) {
        DbY.A1S(compoundButton, onCheckedChangeListener);
        compoundButton.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        compoundButton.setChecked(z);
        compoundButton.setOnCheckedChangeListener(onCheckedChangeListener);
    }
}
