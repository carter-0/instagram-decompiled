package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.meta.foa.session.FoaUserSession;

/* renamed from: X.Grs  reason: case insensitive filesystem */
public final class C53639Grs extends C251343mx {
    public final 2WX A00;

    public final C251263mp A0X(AnonymousClass3Y5 r12) {
        0qQ.A0B(r12, 0);
        Object A06 = r12.A05.A06(FoaUserSession.class);
        if (A06 != null) {
            FoaUserSession foaUserSession = (FoaUserSession) A06;
            Drawable A002 = C55218He9.A00(r12, C58708IwH.A01(r12, 8), C51966G9m.A1b());
            2WX r8 = this.A00;
            C243803a8.A00(r12);
            0qQ.A0B(foaUserSession, 1);
            return new C53958Gx2(A002, (Drawable) null, ImageView.ScaleType.CENTER_CROP, (AnonymousClass579) null, C226672hf.A04, AnonymousClass6QK.A01(DbT.A0j(C56316HwT.A00(foaUserSession)).A0D().getUrl()), (C268764dx) null, r8, "MetaAiProfilePictureComponent", 0);
        }
        throw AnonymousClass7TE.A0y();
    }

    public C53639Grs(2WX r1) {
        this.A00 = r1;
    }
}
