package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Ih9  reason: case insensitive filesystem */
public final class C57830Ih9 implements Runnable {
    public final /* synthetic */ C3254872q A00;
    public final /* synthetic */ AnonymousClass2uE A01;

    public C57830Ih9(C3254872q r1, AnonymousClass2uE r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        String str;
        AnonymousClass2uE r0 = this.A01;
        if (AnonymousClass3WX.A00(r0.A07(), r0)) {
            1Xj A07 = r0.A07();
            String str2 = null;
            List list = A07.A0d.A00(A07.A1V()).A00;
            C3254872q r6 = this.A00;
            UserSession userSession = r0.A0T;
            C254523sc A0c = C51967G9n.A0c(userSession, r0.A07(), r0, "comment_button");
            A0c.A09(r0.A01);
            C249763kK r2 = r0.A0a;
            if (r2 == null) {
                str = null;
            } else if (r2 instanceof AnonymousClass93U) {
                str = ((AnonymousClass93U) r2).AmZ();
            } else {
                str = null;
            }
            A0c.A4g = str;
            if (r2 != null) {
                str2 = HWY.A00(r2);
            }
            A0c.A6a = str2;
            A0c.A3T = DbS.A0j(r6.A0G.A0N.getCurrentScans().get());
            A0c.A7t = list;
            C233822wX.A0E(userSession, A0c, r0.A07(), r0, r0.A00);
        }
        String id = r0.A07().getId();
        if (id != null) {
            String moduleName = r0.getModuleName();
            0eE r22 = AnonymousClass0t1.A01;
            UserSession userSession2 = r0.A0T;
            C53335GmL gmL = new C53335GmL(AnonymousClass5OB.PEEK_MEDIA_COMMENT, (Float) null, 0, (Integer) null, (Integer) null, (Integer) null, (Integer) null, id, (String) null, moduleName, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, r0.A07().A0r(), 0qQ.A0K(r22.A01(userSession2), r0.A07().A2A(userSession2)), r0.isOrganicEligible(), r0.isSponsoredEligible(), true, false, false, false, false, r0.A07().A5v(), false, false, false, false, false, false, true, false, r0.A07().A4l(), false, false, false, false, false, false, false, false);
            C3018960m.A00().A00().A01(r0.A0O, gmL, userSession2, 182.A06(0Tu.A05, userSession2, 36318771736287670L), r0.A07().CcK());
            r0.A0G = false;
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
