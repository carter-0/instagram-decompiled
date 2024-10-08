package X;

import android.content.Context;

/* renamed from: X.ECp  reason: case insensitive filesystem */
public final class C47680ECp extends 1P0 {
    public final /* synthetic */ E3E A00;

    public C47680ECp(E3E e3e) {
        this.A00 = e3e;
    }

    public final void onFail(C268654dm r3) {
        int A0D = AnonymousClass7TG.A0D(r3, -364729447);
        Context context = this.A00.getContext();
        if (context != null) {
            C49952FGh.A02(context, r3);
        }
        AnonymousClass0fD.A0A(1468762751, A0D);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0fD.A03(-1229188253);
        Dba.A0m(this.A00.getActivity(), 2dZ.A0t);
        AnonymousClass0fD.A0A(766816840, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(2050382774);
        Dba.A0n(this.A00.getActivity(), 2dZ.A0t);
        AnonymousClass0fD.A0A(1378479404, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(520475149);
        DwW dwW = (DwW) obj;
        int A0D = AnonymousClass7TG.A0D(dwW, -2127602261);
        E3E e3e = this.A00;
        e3e.requireView().post(new C51401FtX(dwW, e3e));
        AnonymousClass0fD.A0A(-996615574, A0D);
        AnonymousClass0fD.A0A(771709819, A03);
    }
}
