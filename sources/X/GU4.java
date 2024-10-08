package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.UpcomingEvent;

public final class GU4 implements C46217DQv {
    public final Fragment A00;
    public final AnonymousClass32N A01;
    public final C14192TrX A02;

    public final String CC4(1Xj r4) {
        C14192TrX trX = this.A02;
        Context requireContext = this.A00.requireContext();
        C55537HjJ A002 = ((C55946HqA) trX.A09.getValue()).A00(r4);
        if (A002 instanceof HGB) {
            return AnonymousClass7TE.A16(requireContext, 2131971941);
        }
        if (A002 instanceof HGC) {
            return AnonymousClass7TE.A16(requireContext, 2131976632);
        }
        String BMq = r4.A0C.BMq();
        if (BMq == null || BMq.length() <= 0 || BMq.equals(requireContext.getString(2131976020))) {
            return AnonymousClass7TE.A16(requireContext, 2131968770);
        }
        return BMq;
    }

    public final void DvL(1Xj r11, AnonymousClass3W1 r12) {
        C14192TrX trX = this.A02;
        AnonymousClass0iw r5 = this.A00;
        C55537HjJ A002 = ((C55946HqA) trX.A09.getValue()).A00(r11);
        if (A002 instanceof HGC) {
            A002.A00.A02(r11, r12);
        } else if (A002 instanceof HGB) {
            A002.A00.A03(r11, r12, AnonymousClass000.A00(2963));
        } else {
            C14192TrX trX2 = A002.A00;
            UserSession userSession = trX2.A01;
            2EG r9 = 2EG.A49;
            Q03 q03 = new Q03(r5, userSession, new C271794jb(userSession, r11), trX2.A02, r9);
            q03.A0J = r11;
            int i = -1;
            if (r11.A5D()) {
                i = 0;
            }
            q03.A09 = i;
            C51969G9p.A1L(q03);
            UpcomingEvent A27 = r11.A27(userSession);
            if (A27 != null && (r5 instanceof AnonymousClass0iw)) {
                new C310306am(r5, userSession, trX2.A03).A04(A27, r11.getId(), "offsite_link_click", "cta_bar_offsite_link");
            }
        }
    }

    public final void EC9(View view, 1Xj r3) {
        this.A01.A00(view, r3);
    }

    public GU4(Fragment fragment, AnonymousClass32N r2, C14192TrX trX) {
        AnonymousClass7TG.A1Q(trX, r2);
        this.A00 = fragment;
        this.A02 = trX;
        this.A01 = r2;
    }
}
