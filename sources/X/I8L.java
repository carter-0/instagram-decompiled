package X;

import android.content.DialogInterface;
import com.instagram.comments.mvvm.data.MediaCommentListRepository;
import com.instagram.common.session.UserSession;

public final class I8L implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public I8L(C52971GgO ggO, String str, String str2, int i, boolean z) {
        this.A00 = i;
        this.A01 = ggO;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = z;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.A00 != 0) {
            I21 i21 = I21.A00;
            C52971GgO ggO = (C52971GgO) this.A01;
            UserSession userSession = ggO.A0E;
            C51965G9l.A0l().markerPoint(309476254, "unpin_confirmation_click");
            i21.A01(userSession);
            C333717a0 r3 = ggO.A0C;
            String str = this.A02;
            r3.A0D("unpin_dialog_confirm", str, this.A03, this.A04);
            C20611Wvs wvs = new C20611Wvs(ggO, 3);
            C20611Wvs wvs2 = new C20611Wvs(ggO, 2);
            MediaCommentListRepository mediaCommentListRepository = ((C55465Hi9) ggO.A0N.getValue()).A00;
            AnonymousClass7TE.A1Z(new MH7((Object) wvs, (Object) wvs2, (Object) mediaCommentListRepository, str, (AnonymousClass4D7) null, 7), mediaCommentListRepository.A01);
            return;
        }
        I21 i212 = I21.A00;
        C52971GgO ggO2 = (C52971GgO) this.A01;
        i212.A00(ggO2.A0E);
        ggO2.A0C.A0D("unpin_dialog_cancel", this.A02, this.A03, this.A04);
    }
}
