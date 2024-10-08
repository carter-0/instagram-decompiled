package X;

import android.graphics.Typeface;
import com.instagram.common.session.UserSession;
import com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState;

/* renamed from: X.Gud  reason: case insensitive filesystem */
public final class C53810Gud extends C251343mx {
    public final C376459Ib A00;
    public final UserSession A01;
    public final AnonymousClass4GS A02;
    public final C52976GgT A03;
    public final NotesPogThoughtBubbleUiState A04;
    public final AnonymousClass33B A05;
    public final AnonymousClass4DU A06;

    public final C251263mp A0X(AnonymousClass3Y5 r33) {
        AnonymousClass3Y5 r31 = r33;
        0qQ.A0B(r31, 0);
        C243573Zh r9 = C243573Zh.STRETCH;
        C243583Zi r8 = C243583Zi.FLEX_END;
        AnonymousClass3XV r0 = 2WX.A02;
        2WX A002 = C51972G9s.A0T(AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A1I, 0, C51970G9q.A0D()), 0, Double.doubleToRawLongBits(146.0d)).A00((2WX) null);
        2Wb A0Q = C51972G9s.A0Q(r31);
        C52976GgT ggT = this.A03;
        NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState = this.A04;
        UserSession userSession = this.A01;
        AnonymousClass4DU r3 = this.A06;
        IQ5 iq5 = IQ5.A00;
        C52296GMm gMm = C52296GMm.A00;
        C376459Ib r13 = this.A00;
        AnonymousClass4GS r2 = this.A02;
        A0Q.A00(new GOK(r13, (2WX) null, (AnonymousClass0iw) null, userSession, r2, ggT, notesPogThoughtBubbleUiState, gMm, this.A05, iq5, r3, J20.A00, 65584, 0, false, false, false));
        C243573Zh r02 = C243573Zh.CENTER;
        Integer num = AnonymousClass05K.A00;
        2WX A0z = G9t.A0z((2WX) null, num, r02);
        String B8Q = notesPogThoughtBubbleUiState.A06.B8Q();
        2V1 r14 = A0Q.A00;
        int A07 = C51968G9o.A07(r14.A0C, A0Q);
        long A0G = C51972G9s.A0G(12.0f);
        Typeface typeface = Typeface.DEFAULT;
        long A0D = C51969G9p.A0D();
        C244103ae A0b = C51971G9r.A0b(r14, (2V5) null, B8Q, 0);
        C51973G9u.A17(A0Q, A0b, A07, A0G);
        A0b.A0R(0);
        G9w.A12(typeface, A0Q, A0b, A0D);
        C51974G9v.A19(A0b, num, false);
        A0b.A0M(1);
        C51973G9u.A19(A0z, A0b, false);
        C51967G9n.A1G(A0Q, A0b);
        return C243563Zg.A07(A0Q, r31, A002, r9, r8);
    }

    public C53810Gud(C376459Ib r2, UserSession userSession, AnonymousClass4GS r4, C52976GgT ggT, NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState, AnonymousClass33B r7, AnonymousClass4DU r8) {
        C51974G9v.A1P(ggT, notesPogThoughtBubbleUiState, userSession, r8);
        0qQ.A0B(r7, 10);
        this.A03 = ggT;
        this.A04 = notesPogThoughtBubbleUiState;
        this.A01 = userSession;
        this.A06 = r8;
        this.A00 = r2;
        this.A02 = r4;
        this.A05 = r7;
    }
}
