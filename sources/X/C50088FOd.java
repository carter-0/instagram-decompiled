package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.facebook.privacy.zone.policy.ZonePolicy;
import com.instagram.common.session.UserSession;

/* renamed from: X.FOd  reason: case insensitive filesystem */
public final class C50088FOd implements View.OnClickListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ ZonePolicy A02;
    public final /* synthetic */ AnonymousClass4DH A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ 1as A05;
    public final /* synthetic */ C254743sy A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;

    public C50088FOd(Activity activity, Context context, ZonePolicy zonePolicy, AnonymousClass4DH r4, UserSession userSession, 1as r6, C254743sy r7, String str, String str2, String str3, String str4, String str5, String str6) {
        this.A04 = userSession;
        this.A01 = context;
        this.A05 = r6;
        this.A00 = activity;
        this.A03 = r4;
        this.A0C = str;
        this.A0A = str2;
        this.A0B = str3;
        this.A09 = str4;
        this.A07 = str5;
        this.A08 = str6;
        this.A06 = r7;
        this.A02 = zonePolicy;
    }

    public final void onClick(View view) {
        int A052 = AnonymousClass0fD.A05(1813951436);
        UserSession userSession = this.A04;
        C49855F9v.A00(C48804EkS.A00(userSession), "CLICK_INTERSTITIAL_CONTINUE");
        1Au.A00(userSession).A0z(AnonymousClass000.A00(1330), 2);
        AnonymousClass37D A022 = AnonymousClass37D.A00.A02(this.A01);
        if (A022 != null) {
            1as r7 = this.A05;
            Activity activity = this.A00;
            AnonymousClass4DH r5 = this.A03;
            String str = this.A0C;
            String str2 = this.A0A;
            String str3 = this.A0B;
            String str4 = this.A09;
            String str5 = this.A07;
            String str6 = this.A08;
            DbU.A1U(new C40657AgX(activity, this.A02, r5, userSession, r7, this.A06, str, str2, str3, str4, str5, str6), A022, A022);
        }
        AnonymousClass0fD.A0C(-1433011046, A052);
    }
}
