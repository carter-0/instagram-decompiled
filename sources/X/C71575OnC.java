package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.Currency;

/* renamed from: X.OnC  reason: case insensitive filesystem */
public final /* synthetic */ class C71575OnC implements AnonymousClass2Kv {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C70573OBv A02;
    public final /* synthetic */ Boolean A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ Currency A08;

    public /* synthetic */ C71575OnC(Context context, UserSession userSession, C70573OBv oBv, Boolean bool, String str, String str2, String str3, String str4, Currency currency) {
        this.A04 = str;
        this.A01 = userSession;
        this.A00 = context;
        this.A05 = str2;
        this.A06 = str3;
        this.A08 = currency;
        this.A03 = bool;
        this.A07 = str4;
        this.A02 = oBv;
    }

    public final void invoke(AnonymousClass3JD r21) {
        String str;
        String string;
        String str2 = this.A04;
        UserSession userSession = this.A01;
        Context context = this.A00;
        String str3 = this.A05;
        String str4 = this.A06;
        Currency currency = this.A08;
        Boolean bool = this.A03;
        String str5 = this.A07;
        C70573OBv oBv = this.A02;
        AnonymousClass3FZ r2 = (AnonymousClass3FZ) r21.Bny();
        if (r2 != null && str2 != null) {
            DirectThreadKey A0e = C66581MXm.A0e(str2);
            AnonymousClass3FZ A002 = r2.A00(N20.class, "xfb_ig_p2m_create_order");
            if (A002 != null) {
                C333537Zi A003 = C333527Zh.A00(userSession);
                String string2 = context.getString(2131969127);
                String A052 = A002.A05("order_id");
                String str6 = userSession.A06;
                if (currency != null) {
                    str = currency.toString();
                } else {
                    str = "";
                }
                if (bool.booleanValue()) {
                    string = "Order placed";
                } else {
                    string = context.getString(2131969127);
                }
                A003.A0I(A0e, string2, str3, A052, str6, str4, str3, str, string, str5);
                1Av r5 = oBv.A01;
                0s0 r4 = r5.A1k;
                AnonymousClass0YZ[] r22 = 1Av.A8a;
                if (!AnonymousClass7TG.A1a(r5, r4, r22, 292)) {
                    AnonymousClass7TF.A1J(r5, r4, r22, 292, true);
                }
                oBv.A00.A04.A07();
                return;
            }
            C310336ap A0X = DbV.A0X();
            A0X.A0H = "create_order_send_failure";
            DbS.A19(oBv.A00.A01, A0X, 2131956878);
            A0X.A06();
            DbY.A1N(A0X);
        }
    }
}
