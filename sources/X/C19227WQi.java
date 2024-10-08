package X;

import android.view.View;

/* renamed from: X.WQi  reason: case insensitive filesystem */
public final class C19227WQi implements 1wn, C20914X4f, C20916X4h {
    public final /* synthetic */ C15939Ul6 A00;

    public C19227WQi(C15939Ul6 ul6) {
        this.A00 = ul6;
    }

    public static final void A00(C19227WQi wQi) {
        C15939Ul6 ul6 = wQi.A00;
        C15487Udc udc = ul6.A01;
        if (udc == null) {
            0qQ.A0F("locationSearchHistoryAdapter");
            throw AnonymousClass00P.createAndThrow();
        }
        udc.A00 = C15939Ul6.A01(ul6);
        udc.A00();
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = AnonymousClass0fD.A03(2024685567);
        int A032 = AnonymousClass0fD.A03(1582103920);
        A00(this);
        View view = this.A00.A00;
        if (view == null) {
            0qQ.A0F("clearAllButton");
            throw AnonymousClass00P.createAndThrow();
        }
        view.setVisibility(8);
        AnonymousClass0fD.A0A(889989906, A032);
        AnonymousClass0fD.A0A(-319995867, A03);
    }

    public final void CLP(String str) {
        A00(this);
    }

    public final void CLi(String str) {
        A00(this);
    }
}
