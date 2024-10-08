package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import java.util.Map;

/* renamed from: X.Fi7  reason: case insensitive filesystem */
public final class C50765Fi7 implements G6H {
    public final Fragment A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        UserSession userSession = this.A01;
        if (C375479Ds.A01(userSession)) {
            C50337FYu A002 = C48796EkJ.A00(userSession);
            C50337FYu.A02(A002);
            C50337FYu.A01(C48147EZp.CREATE_GROUP_CHAT_BUTTON, C48146EZo.PROFILE_QUICK_PROMOTION, A002, "chat_creation_sheet_rendered", "tap", (Map) null);
            Class<ModalActivity> cls = ModalActivity.class;
            if (bundle == null) {
                bundle = AnonymousClass7TE.A0a();
            }
            Fragment fragment = this.A00;
            DbS.A0b(fragment.requireActivity(), bundle, userSession, cls, C273654mx.A00(2218)).A0C(fragment.getContext());
        }
    }

    public C50765Fi7(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
