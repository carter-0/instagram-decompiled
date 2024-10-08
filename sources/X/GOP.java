package X;

import com.instagram.common.session.UserSession;
import com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState;

public final class GOP extends 0Yg implements C62320sa {
    public final /* synthetic */ GMQ A00;
    public final /* synthetic */ AnonymousClass3Y5 A01;
    public final /* synthetic */ 2Wa A02;
    public final /* synthetic */ 2Wa A03;
    public final /* synthetic */ 2Wa A04;
    public final /* synthetic */ 2Wa A05;
    public final /* synthetic */ GOK A06;
    public final /* synthetic */ String A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GOP(GMQ gmq, AnonymousClass3Y5 r3, 2Wa r4, 2Wa r5, 2Wa r6, 2Wa r7, GOK gok, String str) {
        super(0);
        this.A07 = str;
        this.A06 = gok;
        this.A03 = r4;
        this.A01 = r3;
        this.A02 = r5;
        this.A00 = gmq;
        this.A04 = r6;
        this.A05 = r7;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        String str = this.A07;
        GOK gok = this.A06;
        NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState = gok.A07;
        UserSession userSession = gok.A04;
        AnonymousClass4GS r8 = gok.A05;
        2Wa r6 = this.A03;
        C58727Iwa iwa = new C58727Iwa(this.A02, 22);
        GMQ gmq = this.A00;
        AnonymousClass3Y5 r2 = this.A01;
        GMQ gmq2 = gmq;
        return new C70802Vt(C243803a8.A00(r2), new GOS(r6, userSession, r8, notesPogThoughtBubbleUiState, str, new MJ0(this.A04, 19), new C58208IoC(28, gmq2, gok, this.A05, r2), iwa, new C59361JGn(8, r2, gok, gmq)));
    }
}
