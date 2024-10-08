package X;

import android.content.Context;
import android.os.Handler;
import com.instagram.registration.model.RegFlowExtras;

/* renamed from: X.Eo4  reason: case insensitive filesystem */
public abstract class C49028Eo4 {
    public static void A00(Context context, Handler handler, AnonymousClass4DH r17, AnonymousClass0aP r18, G69 g69, RegFlowExtras regFlowExtras, EEK eek, C46634DiE diE, String str, String str2, String str3) {
        RegFlowExtras regFlowExtras2 = regFlowExtras;
        regFlowExtras2.A0k = true;
        AnonymousClass0aP r7 = r18;
        C46634DiE diE2 = diE;
        C49886FBm A06 = 1Q0.A15.A02(r7).A06(regFlowExtras2.A01(), diE2);
        String str4 = str;
        A06.A04("existing_user_username", str4);
        A06.A02();
        C358248ab A0Y = DbS.A0Y(context);
        AnonymousClass4DH r6 = r17;
        A0Y.A0n(DbS.A0V(str2), r6);
        A0Y.A05 = DbW.A0h(context, str4, 2131969386);
        A0Y.A08(2131969383);
        Handler handler2 = handler;
        G69 g692 = g69;
        EEK eek2 = eek;
        String str5 = str3;
        A0Y.A0Y(new C50010FIv(handler2, r6, r7, g692, regFlowExtras2, eek2, diE2, str5, str4, 1), C358278ae.BLUE_BOLD, AnonymousClass7TF.A0e(context.getResources(), str4, 2131969385), true);
        A0Y.A0P(new C50010FIv(handler2, r6, r7, g692, regFlowExtras2, eek2, diE2, str5, str4, 0), C358278ae.DEFAULT, 2131969384);
        AnonymousClass7TH.A0a(A0Y, false);
    }
}
