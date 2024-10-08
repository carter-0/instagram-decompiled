package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.ESr  reason: case insensitive filesystem */
public final class C48048ESr extends C2806552w {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass0iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ String A04;

    public final void onClick(View view) {
        String A002;
        String A003;
        0qQ.A0B(view, 0);
        UserSession userSession = this.A02;
        Integer num = this.A03;
        AnonymousClass0iw r3 = this.A01;
        long A07 = DbZ.A07(userSession.A06);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r3, userSession), "ig_nme_benefits");
        if (num.intValue() != 0) {
            A002 = "BIZ_MULTIPLE_ADDRESSES";
            A003 = "ig_profile_edit_address_list_page";
        } else {
            A002 = C273654mx.A00(1241);
            A003 = C273654mx.A00(304);
        }
        if (A0e.isSampled()) {
            A0e.AAJ("event_type", "click");
            A0e.AAJ("benefit_type", A002);
            A0e.AAJ("subject_type", "subscriber");
            DbY.A1H(A0e, "benefit_usage_attribution_entrypoint", A07);
            DbS.A1M(A0e, A003);
            A0e.Cgf();
        }
        new SUL(this.A00, userSession, 2EG.A1V, this.A04, false).A0A();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48048ESr(Context context, AnonymousClass0iw r3, UserSession userSession, Integer num, String str, int i) {
        super(Integer.valueOf(i));
        this.A02 = userSession;
        this.A03 = num;
        this.A01 = r3;
        this.A00 = context;
        this.A04 = str;
    }
}
