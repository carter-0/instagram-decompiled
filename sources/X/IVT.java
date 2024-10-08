package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;

public final class IVT implements MVB {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    public final /* synthetic */ void onTextClick(View view) {
    }

    public IVT(int i, int i2, Object obj, Object obj2) {
        this.A00 = i2;
        this.A03 = obj2;
        this.A01 = i;
        this.A02 = obj;
    }

    public final void onButtonClick(View view) {
        String str;
        int i = this.A00;
        Object obj = this.A03;
        if (i != 0) {
            GIN gin = (GIN) obj;
            gin.A03.onBackPressed();
            AnonymousClass4DU r6 = gin.A08;
            UserSession userSession = gin.A06;
            1Xj r5 = ((C267324bN) this.A02).A02;
            AnonymousClass93T r4 = gin.A09;
            int i2 = this.A01;
            C51974G9v.A1K(r6, userSession, r4);
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r6, userSession), "instagram_clips_end_of_feed_toast_tap");
            if (A0e.isSampled()) {
                DbW.A16(A0e, r6);
                C51970G9q.A19(A0e, (long) i2);
                C51970G9q.A1G(A0e, r4);
                String str2 = null;
                C51965G9l.A1P(A0e, C51969G9p.A0u(r5));
                if (r5 != null) {
                    str = r5.A0C.getMezqlToken();
                } else {
                    str = null;
                }
                A0e.AAJ("mezql_token", str);
                if (r5 != null) {
                    str2 = DbT.A0x(r5);
                }
                C51965G9l.A1Q(A0e, str2);
                C51965G9l.A1R(A0e, r4.AmZ());
                AnonymousClass7TH.A0V(A0e);
                return;
            }
            return;
        }
        C70970OTr oTr = (C70970OTr) obj;
        NUM num = oTr.A03;
        num.A0B("RESTORE_REENGAGE_CTA_TAP");
        num.A07();
        oTr.A04.A02((Activity) this.A02, AnonymousClass7TE.A0a(), C69271NiX.BOTTOM_SHEET, AnonymousClass05K.A01, Integer.valueOf(this.A01));
    }

    public final void onDismiss() {
        if (this.A00 == 0) {
            ((C70970OTr) this.A03).A03.A07();
        }
    }

    public final void onShow() {
        if (this.A00 == 0) {
            NUM num = ((C70970OTr) this.A03).A03;
            num.A09();
            num.A0B("RESTORE_REENGAGE_TOAST_IMPRESSION");
            num.A0C("INTERVAL", this.A01);
        }
    }
}
