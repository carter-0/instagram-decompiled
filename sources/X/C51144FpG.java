package X;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.dextricks.DexOptimization;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeConstants;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.FpG  reason: case insensitive filesystem */
public final class C51144FpG implements 1aV {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ AnonymousClass0iw A01;
    public final /* synthetic */ C307786Rm A02;
    public final /* synthetic */ C307896Rx A03;
    public final /* synthetic */ 1a8 A04;
    public final /* synthetic */ UserSession A05;
    public final /* synthetic */ AnonymousClass2Ep A06;
    public final /* synthetic */ 2Dm A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ List A0B;

    public C51144FpG(FragmentActivity fragmentActivity, AnonymousClass0iw r2, C307786Rm r3, C307896Rx r4, 1a8 r5, UserSession userSession, AnonymousClass2Ep r7, 2Dm r8, String str, String str2, String str3, List list) {
        this.A02 = r3;
        this.A00 = fragmentActivity;
        this.A05 = userSession;
        this.A03 = r4;
        this.A09 = str;
        this.A0A = str2;
        this.A08 = str3;
        this.A04 = r5;
        this.A07 = r8;
        this.A06 = r7;
        this.A0B = list;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        Long l;
        IBinder iBinder;
        C74233PrM prM = (C74233PrM) obj;
        C307786Rm r0 = this.A02;
        C307786Rm r18 = r0;
        Context context = r0.A00;
        Context context2 = context;
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
        Long l2 = null;
        if (inputMethodManager != null) {
            View currentFocus = this.A00.getCurrentFocus();
            if (currentFocus != null) {
                iBinder = currentFocus.getWindowToken();
            } else {
                iBinder = null;
            }
            inputMethodManager.hideSoftInputFromWindow(iBinder, 0);
        }
        UserSession userSession = this.A05;
        WYZ wyz = new WYZ(C308206Td.A08(this.A03), userSession);
        User A0Q = AnonymousClass7TF.A0Q(userSession);
        String str = this.A09;
        String id = A0Q.getId();
        String fbidV2 = A0Q.A03.getFbidV2();
        if (fbidV2 != null) {
            l2 = AnonymousClass7TE.A10(fbidV2);
        }
        String str2 = this.A0A;
        String str3 = this.A08;
        Long l3 = null;
        UserSession userSession2 = wyz.A01;
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(wyz.A00, userSession2), "ig_lead_generation");
        A0e.AAJ("flow_name", "lead_gen_business_messaging");
        A0e.AAJ("flow_step", "initial_message_sent_to_lead");
        A0e.AAJ(TraceFieldType.AdhocEventName, RealtimeConstants.SEND_SUCCESS);
        A0e.AAJ("event_type", DexOptimization.OPT_KEY_CLIENT);
        A0e.A9F("ig_user_fbidv2", (Long) null);
        A0e.A7p(AnonymousClass000.A00(4931), true);
        DbS.A1N(A0e, "lead_management");
        A0e.A7p("is_employee", Boolean.valueOf(1CI.A00(userSession2)));
        if (str != null) {
            l = AnonymousClass7TE.A10(str);
        } else {
            l = null;
        }
        A0e.A9F("ig_user_id", l);
        A0e.A9F("consumer_ig_user_id", 00y.A0n(10, id));
        A0e.A9F(AnonymousClass000.A00(4646), l2);
        A0e.AAJ(AnonymousClass000.A00(305), str2);
        if (str3 != null) {
            l3 = 00y.A0n(10, str3);
        }
        A0e.A9F("form_id", l3);
        A0e.Cgf();
        if (prM instanceof C72176Oxl) {
            0wb.A07("IgBloksCustomNavigationExtensions_sendLeadMessage", (Throwable) C66996MgU.A01(prM));
        }
        if (str2 == null) {
            1a8 r5 = this.A04;
            2Dr r02 = this.A07;
            r5.A02(r02.A09.A0P((C269794fh) r02.A0L.getValue()), new C51141FpD(this.A01, r18, r5, userSession, this.A06, str, this.A0B));
            return;
        }
        C49742F4h.A01(context2, this.A01, userSession, this.A06, str, this.A0B);
        this.A04.A01();
    }
}
