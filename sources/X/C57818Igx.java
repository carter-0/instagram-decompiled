package X;

import com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState;

/* renamed from: X.Igx  reason: case insensitive filesystem */
public final class C57818Igx implements Runnable {
    public final /* synthetic */ 2Wa A00;
    public final /* synthetic */ GOK A01;

    public C57818Igx(2Wa r1, GOK gok) {
        this.A00 = r1;
        this.A01 = gok;
    }

    public final void run() {
        String str;
        2Wa r5 = this.A00;
        if (!C51969G9p.A1V(r5)) {
            GOK gok = this.A01;
            NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState = gok.A07;
            AnonymousClass33B r3 = gok.A0A;
            AnonymousClass4GS r2 = gok.A05;
            Integer num = null;
            if (r2 != null) {
                str = r2.All();
                num = r2.Als();
            } else {
                str = null;
            }
            r3.Euu(notesPogThoughtBubbleUiState, num, str);
            r5.A00();
        }
    }
}
