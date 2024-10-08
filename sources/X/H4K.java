package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

public final class H4K extends 1P0 {
    public final /* synthetic */ 1jh A00;
    public final /* synthetic */ C66121jf A01;
    public final /* synthetic */ DirectThreadKey A02;

    public H4K(1jh r1, C66121jf r2, DirectThreadKey directThreadKey) {
        this.A00 = r1;
        this.A02 = directThreadKey;
        this.A01 = r2;
    }

    public final void onFail(C268654dm r7) {
        int A0D = AnonymousClass7TG.A0D(r7, 867115000);
        H4K.super.onFail(r7);
        UserSession userSession = this.A00.A00;
        I34.A01(userSession, AnonymousClass05K.A05, "direct_send_collection_share_message_mutation_processor", Dbb.A0b(r7), I35.A00(userSession, this.A01));
        AnonymousClass0fD.A0A(-804036621, A0D);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(50358887);
        int A0D = AnonymousClass7TG.A0D(obj, -1382587808);
        H4K.super.onSuccess(obj);
        UserSession userSession = this.A00.A00;
        Integer A0c = C51975G9x.A0c(this.A02);
        I34.A01(userSession, AnonymousClass05K.A04, "direct_send_collection_share_message_mutation_processor", DbX.A0t(A0c), I35.A00(userSession, this.A01));
        AnonymousClass0fD.A0A(187173665, A0D);
        AnonymousClass0fD.A0A(1862591022, A03);
    }
}
