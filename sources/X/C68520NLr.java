package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.NLr  reason: case insensitive filesystem */
public final class C68520NLr extends 1P0 {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ DirectThreadKey A01;

    public C68520NLr(UserSession userSession, DirectThreadKey directThreadKey) {
        this.A00 = userSession;
        this.A01 = directThreadKey;
    }

    public final void onFail(C268654dm r6) {
        int A0D = AnonymousClass7TG.A0D(r6, -1708455951);
        C68520NLr.super.onFail(r6);
        C313746gw.A00(this.A00).A0S(this.A01.A00, AnonymousClass000.A00(2914), C71115Od8.A01(r6, C71115Od8.A00).toString());
        AnonymousClass0fD.A0A(1174465874, A0D);
    }
}
