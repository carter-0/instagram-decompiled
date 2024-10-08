package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.NotesRepository;

/* renamed from: X.P3l  reason: case insensitive filesystem */
public final class C72372P3l implements AnonymousClass4AY {
    public final /* synthetic */ C67756MuB A00;

    public final void Dyw(AnonymousClass4AB r6) {
        0qQ.A0B(r6, 0);
        for (AnonymousClass913 r3 : r6.A0J) {
            String str = r6.A0G;
            if (str != null) {
                NotesRepository notesRepository = this.A00.A09;
                notesRepository.A0O(r3.BWY().A0H, str);
                notesRepository.A0M(str);
            }
        }
    }

    public final void FJa(AnonymousClass4AB r1, boolean z) {
    }

    public C72372P3l(C67756MuB muB) {
        this.A00 = muB;
    }

    public final void Cj8(AnonymousClass4AB r2, long j) {
        if (r2 != null) {
            C3018660j.A01(this.A00.A08).A0M(r2, j);
        }
    }

    public final void DLq(AnonymousClass4AB r5, long j) {
        UserSession userSession = this.A00.A08;
        if (182.A06(0Tu.A05, userSession, 36321310061962495L) && r5 != null) {
            C3018660j.A01(userSession).A0N(r5, j);
        }
    }

    public final void FHX(AnonymousClass4AB r3, long j) {
        if (r3 != null) {
            C3018660j.A01(this.A00.A08).A0D.add(AnonymousClass7TF.A0y(r3, j));
        }
    }
}
