package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.NotesRepository;

/* renamed from: X.P3g  reason: case insensitive filesystem */
public final class C72367P3g implements C74399PuF {
    public final FragmentActivity A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final NotesRepository A03;
    public final boolean A04;

    public /* synthetic */ C72367P3g(FragmentActivity fragmentActivity, AnonymousClass0iw r5, UserSession userSession, int i, boolean z) {
        NotesRepository notesRepository = null;
        boolean A1Q = C51966G9m.A1Q(i & 8, z);
        notesRepository = (i & 16) != 0 ? AnonymousClass43C.A00(userSession) : notesRepository;
        0qQ.A0B(notesRepository, 5);
        this.A02 = userSession;
        this.A00 = fragmentActivity;
        this.A01 = r5;
        this.A04 = A1Q;
        this.A03 = notesRepository;
    }

    public final void DUW(OIR oir) {
        Long A10;
        0qQ.A0B(oir, 0);
        String str = oir.A09;
        if (str != null && (A10 = AnonymousClass7TE.A10(str)) != null) {
            long longValue = A10.longValue();
            FragmentActivity fragmentActivity = this.A00;
            UserSession userSession = this.A02;
            C46498Dg1 dg1 = new C46498Dg1(fragmentActivity, userSession);
            dg1.A02(new C71329Oia(this, longValue, 1), 2131954071);
            if (182.A06(0Tu.A05, userSession, 36321310062486791L)) {
                dg1.A04(new C71329Oia(this, longValue, 2), 2131954074);
            }
            C51969G9p.A11(fragmentActivity, dg1);
        }
    }

    public final void DUZ(OIR oir) {
        0qQ.A0B(oir, 0);
        if (this.A04) {
            NotesRepository notesRepository = this.A03;
            05G r2 = notesRepository.A0T;
            05G r1 = notesRepository.A0b;
            r2.Epw(r1.getValue());
            r1.Epw(0sn.A00);
            return;
        }
        NKE nke = new NKE();
        DbT.A1N(nke, new 0eP[]{AnonymousClass7TE.A1L("arg_prompt_id", oir.A09), AnonymousClass7TE.A1L("arg_prompt_title", oir.A0A), AnonymousClass7TE.A1L("arg_num_of_total_prompt_responses", oir.A06)});
        C331127Pr A0W = DbS.A0W(this.A02);
        A0W.A1R = true;
        A0W.A0T = nke;
        A0W.A0U = new C57373IZe(0, oir, this);
        A0W.A00().A02(this.A00, nke);
    }
}
