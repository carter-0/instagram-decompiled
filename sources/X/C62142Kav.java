package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.Kav  reason: case insensitive filesystem */
public final class C62142Kav extends C2806552w {
    public final /* synthetic */ LSN A00;
    public final /* synthetic */ String A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62142Kav(LSN lsn, Integer num, String str) {
        super(num);
        this.A00 = lsn;
        this.A01 = str;
    }

    public final void onClick(View view) {
        String str;
        long j;
        Long A10;
        HashMap A1E = AnonymousClass7TE.A1E();
        LSN lsn = this.A00;
        String[] split = lsn.A0M.split("_");
        A1E.put("ig_media_id", split[0]);
        A1E.put("action", this.A01);
        A1E.put("source", "product_tagging_edit_flow");
        UserSession userSession = lsn.A0K;
        String str2 = split[0];
        Integer num = lsn.A07;
        String str3 = null;
        if (num != null) {
            str = C49158EqP.A00(num);
        } else {
            str = null;
        }
        if (split.length > 1) {
            str3 = split[1];
        }
        0qQ.A0B(userSession, 1);
        if (str2 == null || (A10 = AnonymousClass7TE.A10(str2)) == null) {
            j = -1;
        } else {
            j = A10.longValue();
        }
        if (str == null) {
            str = "";
        }
        if (str3 == null) {
            str3 = "-1";
        }
        C263944Ny A002 = C263944Ny.A00(str3);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01((AnonymousClass0iw) null, userSession), "instagram_shopping_commerce_media_untagging_interaction");
        if (A0e.isSampled()) {
            A0e.A9F("ig_media_id", Long.valueOf(j));
            JTU.A0v(A002, A0e, "appeals_flow_entry_tapped", str);
        }
        AnonymousClass3M3 A02 = C49891FBs.A02(DbS.A0N(userSession), C46649DiU.A04("com.bloks.www.commerce.media_untagging_appeals", A1E));
        C309516Yo A0M = DbS.A0M(lsn.A0I, userSession);
        A0M.A0E(A02);
        A0M.A0A = lsn.A0J.getModuleName();
        A0M.A04();
    }
}
