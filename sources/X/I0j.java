package X;

import com.instagram.comments.mvvm.data.MediaCommentListRepository;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class I0j {
    public final MediaCommentListRepository A00;
    public final UserSession A01;
    public final Map A02 = AnonymousClass7TE.A1H();
    public final boolean A03;

    public I0j(MediaCommentListRepository mediaCommentListRepository, UserSession userSession, String str, boolean z) {
        0qQ.A0B(str, 4);
        this.A00 = mediaCommentListRepository;
        this.A01 = userSession;
        this.A03 = z;
    }

    public final void A01(C333717a0 r21, C262224Cq r22, 05G r23) {
        C333717a0 r9 = r21;
        05G r11 = r23;
        int A022 = DbW.A02(0, r11, r9);
        MediaCommentListRepository mediaCommentListRepository = this.A00;
        C333867aH A0g = C51968G9o.A0g(mediaCommentListRepository);
        0qQ.A0B(A0g, 0);
        ArrayList A0A = C335067cK.A0A(A0g, J1R.A00);
        C61084JwM A002 = C335067cK.A00(A0A);
        if (!((Set) A002.A01).isEmpty() || !((Set) A002.A02).isEmpty()) {
            Set set = (Set) A002.A01;
            List A0a = 00k.A0a(set);
            boolean z = this.A03;
            r9.A0B("comments_bulk_delete_tapped", A0a.size());
            if (z) {
                C333717a0.A02(r9, "delete_comments_action", (String) null, A0a);
            }
            Integer num = AnonymousClass05K.A01;
            C59819JZr jZr = new C59819JZr(A002, r11, this, (AnonymousClass4D7) null, 21);
            19B r4 = 19B.A00;
            C262224Cq r6 = r22;
            this.A02.put(A002, 1Eo.A03(num, r4, jZr, r6));
            r11.Epw(new C334707bk(A002, A0A.size()));
            mediaCommentListRepository.A0P(set, (Set) A002.A02);
            1Eo.A05(r4, new MH4(r11, this, A002, (AnonymousClass4D7) null, 27), r6);
            if (!(A0A instanceof Collection) || !A0A.isEmpty()) {
                Iterator it = A0A.iterator();
                while (it.hasNext()) {
                    if (!C51966G9m.A1W(this.A01, ((C335907dj) it.next()).A0C.getId())) {
                        r11.Epw(new C376589Io("260308124595846", A022));
                        return;
                    }
                }
            }
        }
    }

    public static final void A00(C61084JwM jwM, I0j i0j, 0sJ r6) {
        i0j.A00.A0Q((Set) jwM.A01, (Set) jwM.A02, C58296Ipd.A00, r6);
    }
}
