package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.modal.ModalActivity;

public final class WYE implements MVB {
    public final int A00;
    public final Object A01;

    public WYE(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onButtonClick(View view) {
        switch (this.A00) {
            case 0:
                C39963ALf.A02((C39963ALf) this.A01, false);
                return;
            case 1:
                return;
            case 2:
                DbS.A1U(this.A01);
                return;
            default:
                C15372UbQ ubQ = (C15372UbQ) this.A01;
                ubQ.A0E.getValue();
                C56058Hs7 hs7 = (C56058Hs7) ubQ.A0D.getValue();
                String str = ubQ.A07;
                AnonymousClass7TG.A1N(hs7, str);
                hs7.A02(C66579MXk.A00(43), str, "comment_block_comments_from", "block_account_review");
                Bundle bundle = new Bundle();
                DbT.A1M(ubQ, new AnonymousClass6W8(ubQ.getActivity(), bundle, DbT.A0X(ubQ.A0A), ModalActivity.class, C273654mx.A00(2097)));
                return;
        }
    }

    public final void onDismiss() {
    }

    public final void onShow() {
        if (1 - this.A00 == 0) {
            JTS.A1S(AnonymousClass7TE.A0q(AnonymousClass7TE.A0l(((C15381Ube) this.A01).A0i)), "hashtag_unified_snackbar_shown_count", 0);
        }
    }

    public final /* synthetic */ void onTextClick(View view) {
    }
}
