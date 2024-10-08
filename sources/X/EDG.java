package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class EDG extends 1P0 {
    public List A00;
    public List A01;
    public final /* synthetic */ C47488E4s A02;

    public EDG(C47488E4s e4s, List list, List list2) {
        this.A02 = e4s;
        this.A01 = list;
        this.A00 = list2;
    }

    public final void onFail(C268654dm r7) {
        int A03 = AnonymousClass0fD.A03(272370041);
        C47488E4s e4s = this.A02;
        C59689JTv.A01(e4s.getContext(), "UserListStatusCallback_request_error", 2131972232, 1);
        EyC A002 = C49090EpF.A00(e4s.A01);
        A002.A01.flowEndFail(A002.A00, "error", (String) null);
        AnonymousClass0fD.A0A(1449780848, A03);
    }

    public final void onFailInBackground(C268654dm r7) {
        int A03 = AnonymousClass0fD.A03(1040892151);
        C47488E4s e4s = this.A02;
        AnonymousClass1Nd.A00(e4s.A01).A00(new FWQ((List) null));
        EyC A002 = C49090EpF.A00(e4s.A01);
        A002.A01.flowEndFail(A002.A00, "error", (String) null);
        AnonymousClass0fD.A0A(2069096095, A03);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0fD.A03(-2004246492);
        EDG.super.onFinish();
        Dbb.A0x(this.A02);
        AnonymousClass0fD.A0A(151467355, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-1889906404);
        int A032 = AnonymousClass0fD.A03(401982943);
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            DbV.A0j(this.A02.A01, AnonymousClass7TE.A18(it)).A0z(true);
        }
        Iterator it2 = this.A00.iterator();
        while (it2.hasNext()) {
            DbV.A0j(this.A02.A01, AnonymousClass7TE.A18(it2)).A0z(false);
        }
        C47488E4s e4s = this.A02;
        e4s.requireActivity().getFragmentManager().popBackStack();
        EyC A002 = C49090EpF.A00(e4s.A01);
        A002.A01.flowEndSuccess(A002.A00);
        AnonymousClass0fD.A0A(827159979, A032);
        AnonymousClass0fD.A0A(1993100191, A03);
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [X.1qK, java.lang.Object] */
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = AnonymousClass0fD.A03(-1717775121);
        int A032 = AnonymousClass0fD.A03(-542918053);
        C47488E4s e4s = this.A02;
        1Ng A002 = AnonymousClass1Nd.A00(e4s.A01);
        E9D e9d = e4s.A03;
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = e9d.A05.iterator();
        while (it.hasNext()) {
            DbY.A1W(A1C, it);
        }
        A002.A00(new FWQ(A1C));
        AnonymousClass1Nd.A00(e4s.A01).A00(new Object());
        EyC A003 = C49090EpF.A00(e4s.A01);
        A003.A01.flowEndSuccess(A003.A00);
        AnonymousClass0fD.A0A(-472233782, A032);
        AnonymousClass0fD.A0A(-1504023614, A03);
    }
}
