package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.NotesRepository;

/* renamed from: X.JiI  reason: case insensitive filesystem */
public final class C60261JiI extends 2YL {
    public final String A00;
    public final String A01;
    public final AnonymousClass0Ud A02;
    public final AnonymousClass0Ud A03;
    public final UserSession A04;
    public final C62033KWl A05;
    public final NotesRepository A06;
    public final C62034KWm A07;
    public final String A08;
    public final boolean A09;

    public C60261JiI(UserSession userSession, C62033KWl kWl, NotesRepository notesRepository, C62034KWm kWm, String str, String str2, String str3, boolean z) {
        AnonymousClass0Ud r1;
        int i;
        05F r0;
        AnonymousClass0Ud r12;
        int i2;
        0qQ.A0B(notesRepository, 6);
        this.A04 = userSession;
        this.A01 = str;
        this.A08 = str2;
        this.A00 = str3;
        this.A09 = z;
        this.A06 = notesRepository;
        this.A05 = kWl;
        this.A07 = kWm;
        if (str3 != null) {
            r1 = kWl.A07;
            i = 39;
        } else if (z) {
            r1 = kWm.A07;
            i = 40;
        } else {
            r1 = notesRepository.A0n;
            i = 41;
        }
        MCA A002 = MCA.A00(this, r1, i);
        C318136oS A003 = C318116oQ.A00(this);
        AnonymousClass109 r4 = AnonymousClass10A.A01;
        this.A02 = 10b.A02(0sn.A00, A003, A002, r4);
        if (str3 != null) {
            r12 = kWl.A08;
            i2 = 42;
        } else if (z) {
            r12 = kWm.A08;
            i2 = 43;
        } else {
            r0 = notesRepository.A0o;
            this.A03 = r0;
        }
        r0 = 10b.A02(false, C318116oQ.A00(this), MCA.A00(this, r12, i2), r4);
        this.A03 = r0;
    }

    public final void A00() {
        String str;
        String str2 = this.A00;
        if (str2 != null) {
            C62033KWl kWl = this.A05;
            C276114sa r1 = (C276114sa) kWl.A02.get(str2);
            if (r1 != null && r1.BU8()) {
                kWl.A00(str2, r1.BP8());
            }
        } else if (!this.A09 || (str = this.A01) == null) {
            String str3 = this.A01;
            if (str3 != null) {
                NotesRepository notesRepository = this.A06;
                String str4 = this.A08;
                C276114sa r12 = (C276114sa) notesRepository.A0J.get(str3);
                if (r12 != null && r12.BU8()) {
                    notesRepository.A0P(str3, str4, r12.BP8(), false);
                }
            }
        } else {
            C62034KWm kWm = this.A07;
            C276114sa r13 = (C276114sa) kWm.A02.get(str);
            if (r13 != null && r13.BU8()) {
                kWm.A00(str, r13.BP8());
            }
        }
    }

    public final void A01() {
        C262224Cq r4;
        0sL r3;
        C252733pa r2;
        AnonymousClass4D7 r1;
        int i;
        String str = this.A00;
        if (str != null) {
            r2 = this.A05;
            r4 = r2.A01;
            r1 = null;
            i = 15;
        } else if (!this.A09 || (str = this.A01) == null) {
            NotesRepository notesRepository = this.A06;
            r4 = notesRepository.A01;
            r3 = new C376909Ju(notesRepository, (AnonymousClass4D7) null, 10);
            AnonymousClass7TE.A1Z(r3, r4);
        } else {
            r2 = this.A07;
            r4 = r2.A01;
            r1 = null;
            i = 29;
        }
        r3 = new C66187MGy(r2, str, r1, i);
        AnonymousClass7TE.A1Z(r3, r4);
    }

    public final void A02(boolean z) {
        String str;
        String str2 = this.A00;
        if (str2 != null) {
            this.A05.A00(str2, (String) null);
        } else if (!this.A09 || (str = this.A01) == null) {
            String str3 = this.A01;
            if (str3 != null) {
                this.A06.A0P(str3, this.A08, (String) null, z);
            }
        } else {
            this.A07.A00(str, (String) null);
        }
    }
}
