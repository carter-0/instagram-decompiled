package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.instagram.common.session.UserSession;
import com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState;

public final class GOS extends GestureDetector.SimpleOnGestureListener {
    public final 2Wa A00;
    public final UserSession A01;
    public final AnonymousClass4GS A02;
    public final NotesPogThoughtBubbleUiState A03;
    public final String A04;
    public final C62320sa A05;
    public final C62320sa A06;
    public final 0sP A07;
    public final 0sK A08;

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        Integer num;
        MotionEvent motionEvent2 = motionEvent;
        0qQ.A0B(motionEvent2, 0);
        NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState = this.A03;
        if (notesPogThoughtBubbleUiState.A0M) {
            C51968G9o.A1O(this.A07, true);
            UserSession userSession = this.A01;
            String str = this.A04;
            String str2 = notesPogThoughtBubbleUiState.A0H;
            GPK gpk = GPK.DOUBLE_CLICK;
            String str3 = notesPogThoughtBubbleUiState.A0C;
            String str4 = notesPogThoughtBubbleUiState.A0D;
            String str5 = notesPogThoughtBubbleUiState.A0I;
            Integer valueOf = Integer.valueOf(notesPogThoughtBubbleUiState.A01);
            AnonymousClass4GS r0 = this.A02;
            String str6 = null;
            if (r0 != null) {
                str6 = r0.All();
                num = r0.Als();
            } else {
                num = null;
            }
            0qQ.A0B(userSession, 0);
            0qQ.A0B(str, 1);
            C51972G9s.A1C(str2, str3);
            AnonymousClass4JK A002 = AnonymousClass4JJ.A00(userSession);
            if (!A002.A05(str, str2)) {
                C247323g9.A00(userSession);
                A002.A02(gpk, valueOf, num, str, str2, str3, str4, str5, str6);
            }
            this.A00.A03(J23.A00);
            AnonymousClass2S0.A01.A04();
            0xY A0p = AnonymousClass7TE.A0p((1Av) C247333gA.A00(userSession).A07.getValue());
            A0p.E5T("content_note_has_double_tapped_to_like", true);
            A0p.apply();
            Integer num2 = notesPogThoughtBubbleUiState.A09;
            if (num2 == AnonymousClass05K.A01) {
                GPJ.A00.A05(userSession, num2, str3, str4, str5, str2);
            }
        }
        return super.onDoubleTap(motionEvent2);
    }

    public final void onLongPress(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        super.onLongPress(motionEvent);
        this.A06.invoke();
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        0sK r1 = this.A08;
        String str = this.A04;
        NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState = this.A03;
        UserSession userSession = this.A01;
        r1.invoke(str, notesPogThoughtBubbleUiState, userSession);
        0xY A0p = AnonymousClass7TE.A0p((1Av) C247333gA.A00(userSession).A07.getValue());
        A0p.E5T("content_note_has_tapped_to_reply", true);
        A0p.apply();
        Integer num = notesPogThoughtBubbleUiState.A09;
        if (num == AnonymousClass05K.A0C) {
            GPJ.A00.A05(userSession, num, notesPogThoughtBubbleUiState.A0C, notesPogThoughtBubbleUiState.A0D, notesPogThoughtBubbleUiState.A0I, notesPogThoughtBubbleUiState.A0H);
        }
        return super.onSingleTapConfirmed(motionEvent);
    }

    public final boolean onDown(MotionEvent motionEvent) {
        this.A05.invoke();
        return true;
    }

    public GOS(2Wa r1, UserSession userSession, AnonymousClass4GS r3, NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState, String str, C62320sa r6, C62320sa r7, 0sP r8, 0sK r9) {
        AnonymousClass7TG.A1U(str, notesPogThoughtBubbleUiState, userSession);
        this.A04 = str;
        this.A03 = notesPogThoughtBubbleUiState;
        this.A01 = userSession;
        this.A02 = r3;
        this.A00 = r1;
        this.A07 = r8;
        this.A08 = r9;
        this.A05 = r6;
        this.A06 = r7;
    }
}
