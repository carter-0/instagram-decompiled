package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeConstants;
import java.util.Map;

public final class KAP extends 1P0 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ AnonymousClass0iw A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ C255773uh A04;
    public final /* synthetic */ C311336cW A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;

    public KAP(Context context, AnonymousClass0iw r2, UserSession userSession, C255773uh r4, C311336cW r5, String str, int i, boolean z) {
        this.A02 = r2;
        this.A06 = str;
        this.A03 = userSession;
        this.A04 = r4;
        this.A05 = r5;
        this.A00 = i;
        this.A01 = context;
        this.A07 = z;
    }

    public final void onFail(C268654dm r13) {
        String A30;
        int i;
        int A032 = AnonymousClass0fD.A03(459447451);
        KAP.super.onFail(r13);
        AnonymousClass0iw r3 = this.A02;
        String str = this.A06;
        UserSession userSession = this.A03;
        C255773uh r2 = this.A04;
        1Xj r0 = r2.A0b;
        if (r0 == null) {
            A30 = "";
        } else {
            A30 = r0.A30();
        }
        if (r2.A0C() == null) {
            i = -1;
        } else {
            i = r2.A0C().A00;
        }
        LT0.A01(r3, userSession, str, A30, "one_tap_share", r13.A01(), i);
        C63394KwF.A00(userSession, "failure", "self_story", AnonymousClass7TF.A0g(userSession), str, (Map) null);
        C311336cW r5 = this.A05;
        Context context = this.A01;
        CallerContext callerContext = C64371Lan.A00;
        r5.DDx(AnonymousClass3YP.NOT_SHARED, r2);
        C59689JTv.A08(context, 2131973645, 0);
        AnonymousClass0fD.A0A(-559844972, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String A30;
        int i;
        int A032 = AnonymousClass0fD.A03(1433957780);
        int A033 = AnonymousClass0fD.A03(-121153653);
        KAP.super.onSuccess(obj);
        AnonymousClass0iw r5 = this.A02;
        String str = this.A06;
        UserSession userSession = this.A03;
        C255773uh r3 = this.A04;
        1Xj r0 = r3.A0b;
        if (r0 == null) {
            A30 = "";
        } else {
            A30 = r0.A30();
        }
        if (r3.A0C() == null) {
            i = -1;
        } else {
            i = r3.A0C().A00;
        }
        LT0.A03(userSession, r5, str, A30, "one_tap_share", i);
        C63394KwF.A00(userSession, RealtimeConstants.SEND_SUCCESS, "self_story", AnonymousClass7TF.A0g(userSession), str, (Map) null);
        C311336cW r7 = this.A05;
        int i2 = this.A00;
        Context context = this.A01;
        boolean z = this.A07;
        CallerContext callerContext = C64371Lan.A00;
        r7.DDx(AnonymousClass3YP.SHARING, r3);
        if (z) {
            C59689JTv.A08(context, i2, 0);
        }
        AnonymousClass0fD.A0A(25250952, A033);
        AnonymousClass0fD.A0A(-321497427, A032);
    }
}
