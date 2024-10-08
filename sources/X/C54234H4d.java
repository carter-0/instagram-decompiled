package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.H4d  reason: case insensitive filesystem */
public final class C54234H4d extends 1P0 {
    public final /* synthetic */ C74551Pwk A00;
    public final /* synthetic */ 1jh A01;
    public final /* synthetic */ C66121jf A02;
    public final /* synthetic */ DirectThreadKey A03;
    public final /* synthetic */ String A04;

    public C54234H4d(C74551Pwk pwk, 1jh r2, C66121jf r3, DirectThreadKey directThreadKey, String str) {
        this.A01 = r2;
        this.A03 = directThreadKey;
        this.A02 = r3;
        this.A04 = str;
        this.A00 = pwk;
    }

    public final void onFail(C268654dm r7) {
        int A0D = AnonymousClass7TG.A0D(r7, 2018803586);
        UserSession userSession = this.A01.A00;
        I34.A01(userSession, AnonymousClass05K.A02, "direct_send_collection_share_message_mutation_processor", Dbb.A0b(r7), I35.A00(userSession, this.A02));
        AnonymousClass0fD.A0A(2011128309, A0D);
    }

    public final void onStart() {
        int A032 = AnonymousClass0fD.A03(-364328851);
        UserSession userSession = this.A01.A00;
        Integer A0c = C51975G9x.A0c(this.A03);
        I34.A01(userSession, AnonymousClass05K.A1F, "direct_send_collection_share_message_mutation_processor", DbX.A0t(A0c), I35.A00(userSession, this.A02));
        AnonymousClass0fD.A0A(-137725457, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(568321036);
        C300585xS r11 = (C300585xS) obj;
        int A0D = AnonymousClass7TG.A0D(r11, -1790364395);
        1jh r7 = this.A01;
        UserSession userSession = r7.A00;
        DirectThreadKey directThreadKey = this.A03;
        Integer A0c = C51975G9x.A0c(directThreadKey);
        C66121jf r6 = this.A02;
        I34.A01(userSession, AnonymousClass05K.A1I, "direct_send_collection_share_message_mutation_processor", DbX.A0t(A0c), I35.A00(userSession, r6));
        DirectThreadKey directThreadKey2 = new DirectThreadKey(r11.A1D, directThreadKey.A02);
        1ES.A03(1jh.A01(r7, r6, directThreadKey2, this.A04));
        1ES.A03(1jh.A00(this.A00, r7, r6, directThreadKey2));
        AnonymousClass0fD.A0A(701114978, A0D);
        AnonymousClass0fD.A0A(-1381939597, A032);
    }
}
