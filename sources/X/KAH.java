package X;

import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.store.PendingMediaStore;
import com.instagram.pendingmedia.store.PendingMediaStoreSerializer;

public final class KAH extends 1P0 {
    public final /* synthetic */ 1fs A00;
    public final /* synthetic */ AnonymousClass1fq A01;

    public KAH(1fs r1, AnonymousClass1fq r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void onFail(C268654dm r5) {
        int A0D = AnonymousClass7TG.A0D(r5, -1468281784);
        KAH.super.onFail(r5);
        UserSession userSession = this.A00.A00;
        String str = this.A01.A07().A00;
        if (str == null) {
            str = "";
        }
        O01.A00(C62670KkW.FILE_SENT_IN_ERROR, userSession, str);
        AnonymousClass0fD.A0A(-509134957, A0D);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-1638372762);
        int A0D = AnonymousClass7TG.A0D(obj, 802398735);
        KAH.super.onSuccess(obj);
        1fs r6 = this.A00;
        UserSession userSession = r6.A00;
        AnonymousClass1fq r2 = this.A01;
        String str = r2.A07().A00;
        if (str == null) {
            str = "";
        }
        O01.A00(C62670KkW.FILE_SENT_IN_SUCCESS, userSession, str);
        AnonymousClass3Q2 A032 = ((PendingMediaStore) r6.A02.getValue()).A03(r2.A02);
        if (A032 != null) {
            A032.A0b(AnonymousClass3QD.CONFIGURED);
            ((PendingMediaStoreSerializer) r6.A03.getValue()).A04();
        }
        AnonymousClass0fD.A0A(262242871, A0D);
        AnonymousClass0fD.A0A(1765292180, A03);
    }
}
