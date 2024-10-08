package X;

import android.content.Context;

/* renamed from: X.Wcj  reason: case insensitive filesystem */
public final class C19620Wcj implements C20933X4y {
    public final /* synthetic */ C15338Uan A00;

    public C19620Wcj(C15338Uan uan) {
        this.A00 = uan;
    }

    public final void DUn(C3034368u r4) {
        C15338Uan uan = this.A00;
        AnonymousClass6NS r0 = uan.A03;
        if (r0 != null) {
            r0.A04();
        }
        Context context = uan.getContext();
        if (context != null) {
            C229382nI r02 = uan.A02;
            if (r02 == null) {
                0qQ.A0F("igBloksHost");
                throw AnonymousClass00P.createAndThrow();
            }
            AnonymousClass6NS A002 = AnonymousClass6NS.A00(context, r4, r02).A00();
            uan.A03 = A002;
            C273694n2 r03 = uan.A01;
            if (r03 != null) {
                A002.A07(r03);
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
