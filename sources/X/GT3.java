package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import com.instagram.sponsored.analytics.SourceModelInfoParams;

public abstract class GT3 {
    public static final Q03 A00(Fragment fragment, UserSession userSession, IgImageView igImageView, 1Xl r18, AnonymousClass4DU r19, SourceModelInfoParams sourceModelInfoParams, 2EG r21, String str) {
        1Xl r5 = r18;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 1);
        SourceModelInfoParams sourceModelInfoParams2 = sourceModelInfoParams;
        AnonymousClass7TF.A1C(r5, 2, sourceModelInfoParams2);
        String str2 = sourceModelInfoParams2.A04;
        Fragment fragment2 = fragment;
        AnonymousClass4DU r15 = r19;
        2EG r16 = r21;
        String str3 = str;
        if (str2 != null) {
            1OP r0 = 1OP.$redex_init_class;
            ReelStore A03 = ReelStore.A03(userSession2);
            0qQ.A07(A03);
            Reel A0M = A03.A0M(str2);
            if (A0M != null) {
                Q03 q03 = new Q03(fragment2, userSession2, new C296215pf(userSession2, A0M, sourceModelInfoParams2.A05, sourceModelInfoParams2.A09, sourceModelInfoParams2.A01, sourceModelInfoParams2.A03), r15, r16);
                q03.A02(sourceModelInfoParams2);
                q03.A0w = new int[]{0, 0};
                q03.A0b = str3;
                q03.A0M = A0M;
                return q03;
            }
        }
        C271794jb r14 = new C271794jb(userSession2, r5);
        r14.A00 = sourceModelInfoParams2.A00;
        r14.A01 = sourceModelInfoParams2.A02;
        Q03 q032 = new Q03(fragment2, userSession2, r14, r15, r16);
        q032.A01(r5.BPf());
        q032.A02(sourceModelInfoParams2);
        q032.A00(igImageView, r14, r5.BPf());
        q032.A0b = str3;
        if (!(r5 instanceof AnonymousClass3OA)) {
            return q032;
        }
        q032.A0O = (AnonymousClass3OA) r5;
        return q032;
    }
}
