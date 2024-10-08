package X;

import com.instagram.comments.mvvm.data.MediaCommentListRepository;
import java.util.HashMap;

/* renamed from: X.IbP  reason: case insensitive filesystem */
public final class C57479IbP implements C357138Wr {
    public final /* synthetic */ C53954Gwy A00;
    public final /* synthetic */ C357158Wt A01;

    public C57479IbP(C53954Gwy gwy, C357158Wt r2) {
        this.A00 = gwy;
        this.A01 = r2;
    }

    public final void DND() {
        C53954Gwy gwy = this.A00;
        C52971GgO ggO = gwy.A00;
        String str = gwy.A06;
        String str2 = gwy.A05;
        C337217fu r8 = gwy.A03;
        C337207ft r7 = gwy.A02;
        C357158Wt r9 = this.A01;
        DbZ.A0t(0, str, r8, r7);
        0wc r2 = ggO.A0C.A01;
        String A002 = C66579MXk.A00(729);
        String str3 = r7.A02;
        HashMap A0q = DbZ.A0q();
        0Aj A0e = AnonymousClass7TE.A0e(r2, AnonymousClass000.A00(3384));
        A0e.AAJ("source_of_action", A002);
        A0e.AAJ(C66579MXk.A00(173), str3);
        A0e.A7p("is_offensive", true);
        A0e.A9H("extra_values", A0q);
        A0e.Cgf();
        r9.A04(r8);
        MediaCommentListRepository mediaCommentListRepository = ggO.A0A;
        AnonymousClass7TE.A1Z(new C66187MGy(mediaCommentListRepository, str, (AnonymousClass4D7) null, 12), mediaCommentListRepository.A01);
        ggO.A0P.Epw(new C335297cj(r7, r8, r9, str, str2));
    }

    public final void DuW() {
        C53954Gwy gwy = this.A00;
        gwy.A00.A0R(gwy.A02, gwy.A06, gwy.A05);
    }
}
