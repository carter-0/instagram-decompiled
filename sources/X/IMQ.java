package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import org.json.JSONArray;

public final class IMQ implements C270754hF {
    public boolean A00;
    public final C270754hF A01;
    public final String A02;

    public final 1OC BCc(UserSession userSession, boolean z) {
        0qQ.A0B(userSession, 0);
        JSONArray jSONArray = new JSONArray();
        for (Object put : 00l.A0Q(this.A02, new char[]{','}, 0)) {
            jSONArray.put(put);
        }
        String A10 = DbT.A10(jSONArray);
        1NY A0b = AnonymousClass7TG.A0b(userSession);
        A0b.A0Q(C43880CGu.class, C45655D0f.class);
        A0b.A0A(AnonymousClass000.A00(2794));
        A0b.A0G(AnonymousClass000.A00(2804), A10);
        return A0b.A0M();
    }

    public final 1OC C42(UserSession userSession, String str) {
        0qQ.A0B(userSession, 0);
        if (!this.A00) {
            return this.A01.C42(userSession, str);
        }
        this.A00 = false;
        return this.A01.BCc(userSession, false);
    }

    public final /* synthetic */ void ES0(GEP gep) {
    }

    public final /* synthetic */ void ESn(Context context) {
    }

    public final /* synthetic */ void EiB(String str) {
    }

    public final /* synthetic */ void Elk(C290515fR r1) {
    }

    public IMQ(C270754hF r2, String str) {
        boolean A1Y = DbW.A1Y(r2);
        this.A02 = str;
        this.A01 = r2;
        this.A00 = A1Y;
    }

    public final /* synthetic */ boolean CTp(boolean z) {
        return false;
    }
}
