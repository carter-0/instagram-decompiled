package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.NotesRepository;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Nhn  reason: case insensitive filesystem */
public final class C69233Nhn extends C51086FoG {
    public final /* synthetic */ long A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ boolean A03;

    public C69233Nhn(FragmentActivity fragmentActivity, UserSession userSession, long j, boolean z) {
        this.A02 = userSession;
        this.A00 = j;
        this.A03 = z;
        this.A01 = fragmentActivity;
    }

    public final void Do1(String str) {
        List list;
        UserSession userSession = this.A02;
        NotesRepository A002 = AnonymousClass43C.A00(userSession);
        long j = this.A00;
        C279894zc r0 = (C279894zc) JTR.A0z(String.valueOf(j), A002.A0r);
        boolean z = false;
        if (r0 != null && (list = r0.A05) != null && (!(list instanceof Collection) || !list.isEmpty())) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (DbV.A1Z(AnonymousClass69P.A05(A002.A0B), ((C279864zZ) it.next()).A0D.getId())) {
                    z = true;
                    break;
                }
            }
        }
        if (this.A03) {
            if (182.A06(0Tu.A05, userSession, 36321310062683402L)) {
                AnonymousClass7TE.A1Z(new MGF(A002, userSession, (AnonymousClass4D7) null, 6, j), AnonymousClass07a.A00(this.A01));
            }
            if (z) {
                1xC r3 = 1xC.A01;
                C310336ap A0W = DbV.A0W();
                A0W.A0H = "prompt_note_response_deleted";
                DbT.A1D(this.A01.getResources(), A0W, 2131968623);
                DbY.A1K(r3, A0W);
            }
        }
    }
}
