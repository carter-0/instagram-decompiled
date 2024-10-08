package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Wea  reason: case insensitive filesystem */
public final class C19733Wea implements C229122ms {
    public final C324356z9 A00;
    public final WWM A01;

    public final void A00(boolean z) {
        String str;
        WWM wwm = this.A01;
        if (z) {
            str = null;
        } else {
            str = this.A00.A03.A07;
        }
        1NY A0O = DbU.A0O(wwm.A02);
        A0O.A0A("media/story_countdowns/");
        A0O.A0R(UY8.class, D29.class);
        if (str != null) {
            A0O.A9m("max_id", str);
        }
        this.A00.A03(A0O.A0M(), new C15961Uld(3, this, z));
    }

    public final boolean CJz() {
        return AnonymousClass7TF.A1R(this.A01.A05.A01.size());
    }

    public final boolean CKB() {
        return this.A00.A05();
    }

    public final boolean CT5() {
        return C51973G9u.A1Y(this.A00);
    }

    public final boolean CWV() {
        C324356z9 r1 = this.A00;
        if (C51973G9u.A1Y(r1) || C51973G9u.A1X(r1)) {
            return true;
        }
        return false;
    }

    public final void CgO() {
        A00(DbW.A1a(this.A00.A03.A07));
    }

    public final boolean isLoading() {
        return C51973G9u.A1X(this.A00);
    }

    public C19733Wea(Context context, AnonymousClass07i r3, UserSession userSession, WWM wwm) {
        this.A01 = wwm;
        this.A00 = new C324356z9(context, r3, userSession);
    }
}
