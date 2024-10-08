package X;

import com.instagram.common.session.UserSession;
import com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState;

/* renamed from: X.GvF  reason: case insensitive filesystem */
public final class C53848GvF extends C251343mx {
    public final long A00;
    public final long A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final AnonymousClass4GS A04;
    public final NotesPogThoughtBubbleUiState A05;
    public final AnonymousClass33B A06;
    public final AnonymousClass4DU A07;
    public final boolean A08;
    public final boolean A09;

    public final C251263mp A0X(AnonymousClass3Y5 r34) {
        AnonymousClass3Y5 r12 = r34;
        0qQ.A0B(r12, 0);
        C243573Zh r11 = C243573Zh.FLEX_END;
        C243583Zi r8 = C243583Zi.CENTER;
        AnonymousClass3XV r0 = 2WX.A02;
        2WX A0T = C51972G9s.A0T(AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A00, 0, this.A01), 0, this.A00);
        2Wb A0Q = C51972G9s.A0Q(r12);
        NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState = this.A05;
        UserSession userSession = this.A03;
        AnonymousClass4DU r16 = this.A07;
        AnonymousClass0iw r15 = this.A02;
        C58988J1z j1z = C58988J1z.A00;
        IQ4 iq4 = IQ4.A00;
        C52296GMm gMm = C52296GMm.A00;
        boolean z = this.A08;
        boolean z2 = this.A09;
        C376459Ib r02 = new C376459Ib((C62320sa) C58338IqJ.A00, (0sP) J21.A00, (0sP) J22.A00, 3);
        C376459Ib r152 = r02;
        A0Q.A00(new GOK(r152, (2WX) null, r15, userSession, this.A04, (C52976GgT) null, notesPogThoughtBubbleUiState, gMm, this.A06, iq4, r16, j1z, 65568, 0, false, z, z2));
        return C243563Zg.A0I(A0Q, r12, A0T, r11, r8);
    }

    public C53848GvF(AnonymousClass0iw r2, UserSession userSession, AnonymousClass4GS r4, NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState, AnonymousClass33B r6, AnonymousClass4DU r7, long j, long j2, boolean z, boolean z2) {
        AnonymousClass7TG.A1U(notesPogThoughtBubbleUiState, userSession, r7);
        C51973G9u.A0s(6, r6, r2, r4);
        this.A05 = notesPogThoughtBubbleUiState;
        this.A03 = userSession;
        this.A07 = r7;
        this.A08 = z;
        this.A09 = z2;
        this.A06 = r6;
        this.A02 = r2;
        this.A04 = r4;
        this.A01 = j;
        this.A00 = j2;
    }
}
