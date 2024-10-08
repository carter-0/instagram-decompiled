package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Fcy  reason: case insensitive filesystem */
public final class C50512Fcy implements C51877G5p {
    public final UserSession A00;

    public final void Csg(OIS ois, FBI fbi) {
        String A002 = fbi.A00("media_id");
        if (A002 != null) {
            ois.A08 = new C50504Fcq(this, A002, fbi.A00("target_comment_id"), 0);
        }
    }

    public C50512Fcy(UserSession userSession) {
        this.A00 = userSession;
    }
}
