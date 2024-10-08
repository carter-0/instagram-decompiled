package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.H4b  reason: case insensitive filesystem */
public final class C54232H4b extends 1P0 {
    public final /* synthetic */ 1jh A00;
    public final /* synthetic */ C66121jf A01;
    public final /* synthetic */ DirectThreadKey A02;

    public C54232H4b(1jh r1, C66121jf r2, DirectThreadKey directThreadKey) {
        this.A00 = r1;
        this.A02 = directThreadKey;
        this.A01 = r2;
    }

    public final void onFail(C268654dm r7) {
        int A0D = AnonymousClass7TG.A0D(r7, 1666175697);
        UserSession userSession = this.A00.A00;
        I34.A01(userSession, AnonymousClass05K.A15, "direct_send_collection_share_message_mutation_processor", Dbb.A0b(r7), I35.A00(userSession, this.A01));
        AnonymousClass0fD.A0A(-1977294753, A0D);
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(247951617);
        UserSession userSession = this.A00.A00;
        Integer A0c = C51975G9x.A0c(this.A02);
        I34.A01(userSession, AnonymousClass05K.A0j, "direct_send_collection_share_message_mutation_processor", DbX.A0t(A0c), I35.A00(userSession, this.A01));
        AnonymousClass0fD.A0A(-522286220, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(424708723);
        int A032 = AnonymousClass0fD.A03(906734964);
        UserSession userSession = this.A00.A00;
        Integer A0c = C51975G9x.A0c(this.A02);
        I34.A01(userSession, AnonymousClass05K.A0u, "direct_send_collection_share_message_mutation_processor", DbX.A0t(A0c), I35.A00(userSession, this.A01));
        AnonymousClass0fD.A0A(551132424, A032);
        AnonymousClass0fD.A0A(1594921853, A03);
    }
}
