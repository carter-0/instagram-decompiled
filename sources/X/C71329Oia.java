package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.NotesRepository;

/* renamed from: X.Oia  reason: case insensitive filesystem */
public final class C71329Oia implements View.OnClickListener {
    public final int A00;
    public final long A01;
    public final Object A02;

    public C71329Oia(Object obj, long j, int i) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = j;
    }

    public final void onClick(View view) {
        int A05;
        int i;
        switch (this.A00) {
            case 0:
                A05 = AnonymousClass0fD.A05(1896581076);
                ((AnonymousClass4AD) this.A02).AOX(this.A01);
                i = 1949046665;
                break;
            case 1:
                A05 = AnonymousClass0fD.A05(-2080572049);
                C72367P3g p3g = (C72367P3g) this.A02;
                C71147Oe5.A03(p3g.A00, p3g.A01, p3g.A02, this.A01, true);
                i = -33878802;
                break;
            default:
                A05 = AnonymousClass0fD.A05(-1159509498);
                C72367P3g p3g2 = (C72367P3g) this.A02;
                UserSession userSession = p3g2.A02;
                FragmentActivity fragmentActivity = p3g2.A00;
                NotesRepository notesRepository = p3g2.A03;
                String valueOf = String.valueOf(this.A01);
                C358248ab A0X = DbS.A0X(fragmentActivity);
                DbT.A19(fragmentActivity, A0X, 2131968585);
                DbU.A17(fragmentActivity, A0X, 2131968584);
                A0X.A0r(true);
                A0X.A0s(true);
                A0X.A0G(new C71190Of9(fragmentActivity, userSession, notesRepository, valueOf, 3), 2131968772);
                A0X.A0H(C71228Oft.A00, 2131968595);
                DbT.A1V(A0X);
                C3018660j.A01(userSession).A0B(C69506Nmo.A0C);
                i = 175970817;
                break;
        }
        AnonymousClass0fD.A0C(i, A05);
    }
}
