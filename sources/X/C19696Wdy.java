package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Wdy  reason: case insensitive filesystem */
public final class C19696Wdy implements C322776wO {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C323906yI A01;

    public final /* synthetic */ void DBz(C320156rr r1) {
    }

    public C19696Wdy(Context context, C323906yI r2) {
        this.A01 = r2;
        this.A00 = context;
    }

    public final void DBx() {
        C322216vR r4 = this.A01.A03.A0C;
        UserSession userSession = r4.A03;
        if (182.A06(AnonymousClass7TF.A0H(userSession), userSession, 36325274316976952L)) {
            C2366634p r3 = r4.A07;
            r3.A01.A0K("is_regulated_profile", true);
            r4.A0C.A00();
            Integer num = r3.A00;
            Integer num2 = AnonymousClass05K.A01;
            if (num == num2) {
                r3.A05();
            } else {
                r3.A03();
            }
            C2366634p r1 = r4.A08;
            if (r1.A00 == num2) {
                r1.A05();
            } else {
                r1.A03();
            }
        }
    }

    public final void DBy() {
        Object obj;
        C323906yI r5 = this.A01;
        if (!r5.A00.isDestroyed()) {
            Context context = this.A00;
            0qQ.A0A(context);
            C322486vu r2 = r5.A03;
            if (r2.A0j) {
                0eE r0 = AnonymousClass0t1.A01;
                UserSession userSession = r5.A01;
                List BlN = r0.A01(userSession).A03.BlN();
                if (BlN != null) {
                    obj = 00k.A0J(BlN);
                } else {
                    obj = null;
                }
                C360678ey A05 = C359988do.A05(userSession, "com.instagram.sensitivity.see_why_sheets.publisher_news_sheet_action", DbY.A0q("country", obj, new 0eP("media_id", "0"), new 0eP("module", r2.A0b.getModuleName())));
                A05.A00(new C15409UcL(1, context, r5));
                1ES.A03(A05);
                return;
            }
            Dbb.A0k(context, r5.A01, 2EG.A1V, AnonymousClass000.A00(3248));
        }
    }
}
