package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.models.NoteAudience;
import com.instagram.direct.inbox.notes.models.NoteAudienceItem;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Mtr  reason: case insensitive filesystem */
public final class C67738Mtr extends 2YL {
    public 05G A00 = JTO.A1J();
    public 05G A01;
    public 05G A02;
    public final UserSession A03;
    public final AnonymousClass0Ud A04;
    public final AnonymousClass0Ud A05;
    public final boolean A06;
    public final boolean A07;

    public C67738Mtr(UserSession userSession, boolean z, boolean z2) {
        0qQ.A0B(userSession, 1);
        this.A03 = userSession;
        this.A06 = z;
        this.A07 = z2;
        NoteAudience noteAudience = NoteAudience.MUTUAL_FOLLOWERS;
        02z A10 = DbS.A10(new NoteAudienceItem(noteAudience, (String) null, (List) null, 0));
        this.A01 = A10;
        this.A04 = 10b.A03(A10);
        02z A102 = DbS.A10(new NoteAudienceItem(noteAudience, (String) null, (List) null, 0));
        this.A02 = A102;
        this.A05 = 10b.A03(A102);
        ArrayList A1C = AnonymousClass7TE.A1C();
        A1C.add(new NoteAudienceItem(noteAudience, (String) null, (List) null, 0));
        A1C.add(new NoteAudienceItem(NoteAudience.CLOSE_FRIENDS, (String) null, (List) null, 0));
        boolean A002 = 1CI.A00(userSession);
        if (z ? !(!A002 || !182.A06(0Tu.A05, userSession, 36320652934849251L)) : A002) {
            A1C.add(new NoteAudienceItem(NoteAudience.INTERNAL_ONLY, (String) null, (List) null, 0));
        }
        this.A00.Epw(A1C);
    }

    public final void A00() {
        1An r0;
        String str;
        Object value = this.A02.getValue();
        0qQ.A0B(value, 0);
        this.A01.Epw(value);
        boolean z = this.A06;
        if (!z && !this.A07) {
            if (182.A06(0Tu.A05, this.A03, 36323891337113172L)) {
                return;
            }
        }
        1Am A012 = 1Al.A01(this.A03);
        if (z) {
            r0 = 1An.A0u;
        } else {
            r0 = 1An.A2K;
        }
        0xY AR4 = C51969G9p.A0n(A012, r0, this).AR4();
        NoteAudienceItem noteAudienceItem = (NoteAudienceItem) this.A05.getValue();
        if (noteAudienceItem != null) {
            str = noteAudienceItem.A00.name();
        } else {
            str = null;
        }
        AR4.E5g("AudiencePickerViewModel.DefaultNotesAudience", str);
        AR4.apply();
    }
}
