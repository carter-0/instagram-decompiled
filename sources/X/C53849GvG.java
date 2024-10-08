package X;

import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState;

/* renamed from: X.GvG  reason: case insensitive filesystem */
public final class C53849GvG extends C251343mx {
    public final C52977GgU A00;
    public final long A01;
    public final long A02;
    public final SpannableStringBuilder A03;
    public final AnonymousClass0iw A04;
    public final UserSession A05;
    public final AnonymousClass4GS A06;
    public final NotesPogThoughtBubbleUiState A07;
    public final AnonymousClass33B A08;
    public final AnonymousClass4DU A09;

    public C53849GvG(SpannableStringBuilder spannableStringBuilder, AnonymousClass0iw r3, UserSession userSession, AnonymousClass4GS r5, NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState, AnonymousClass33B r7, C52977GgU ggU, AnonymousClass4DU r9, long j, long j2) {
        0qQ.A0B(userSession, 2);
        C51972G9s.A1E(r7, r3);
        0qQ.A0B(ggU, 9);
        this.A07 = notesPogThoughtBubbleUiState;
        this.A05 = userSession;
        this.A09 = r9;
        this.A08 = r7;
        this.A04 = r3;
        this.A06 = r5;
        this.A00 = ggU;
        this.A02 = j;
        this.A01 = j2;
        this.A03 = spannableStringBuilder;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r28) {
        AnonymousClass3Y5 r26 = r28;
        boolean A1Z = C51966G9m.A1Z(r26);
        Integer num = AnonymousClass05K.A00;
        2WX A10 = G9t.A10(C51965G9l.A0X((2WX) null, C51968G9o.A0c(num, A1Z ? 1 : 0)), AnonymousClass05K.A04, new C58727Iwa(this, 13));
        2Wb A0Q = C51972G9s.A0Q(r26);
        NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState = this.A07;
        UserSession userSession = this.A05;
        AnonymousClass4DU r14 = this.A09;
        AnonymousClass33B r13 = this.A08;
        AnonymousClass0iw r12 = this.A04;
        AnonymousClass4GS r11 = this.A06;
        NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState2 = notesPogThoughtBubbleUiState;
        AnonymousClass33B r18 = r13;
        AnonymousClass4GS r16 = r11;
        AnonymousClass0iw r142 = r12;
        A0Q.A00(new C53848GvF(r142, userSession, r16, notesPogThoughtBubbleUiState2, r18, r14, this.A02, this.A01, A1Z, A1Z));
        2WX A002 = AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A05, A1Z, C51970G9q.A0D());
        SpannableStringBuilder spannableStringBuilder = this.A03;
        2V1 r122 = A0Q.A00;
        int A082 = C51968G9o.A08(r122.A0C, A0Q, R.attr.igds_color_secondary_text_on_media);
        long A0I = C51970G9q.A0I();
        Typeface typeface = Typeface.DEFAULT;
        long A0D = C51969G9p.A0D();
        C244103ae A0b = C51971G9r.A0b(r122, (2V5) null, spannableStringBuilder, A1Z);
        C51973G9u.A17(A0Q, A0b, A082, A0I);
        A0b.A0R(A1Z);
        G9w.A12(typeface, A0Q, A0b, A0D);
        C51974G9v.A19(A0b, num, A1Z);
        A0b.A0E();
        C51973G9u.A19(A002, A0b, A1Z);
        C51967G9n.A1G(A0Q, A0b);
        return C243563Zg.A01(A0Q, r26, A10);
    }
}
