package X;

import android.content.Context;

/* renamed from: X.Wck  reason: case insensitive filesystem */
public final class C19621Wck implements C20933X4y {
    public final /* synthetic */ C15334Uaj A00;

    public C19621Wck(C15334Uaj uaj) {
        this.A00 = uaj;
    }

    public final void DUn(C3034368u r4) {
        String str;
        C15334Uaj uaj = this.A00;
        AnonymousClass6NS r0 = uaj.A06;
        if (r0 != null) {
            r0.A04();
        }
        Context requireContext = uaj.requireContext();
        C229382nI r02 = uaj.A05;
        if (r02 == null) {
            str = "igBloksFragmentHost";
        } else {
            AnonymousClass6NS A002 = AnonymousClass6NS.A00(requireContext, r4, r02).A00();
            uaj.A06 = A002;
            C273694n2 r03 = uaj.A04;
            if (r03 == null) {
                str = "rootHostView";
            } else {
                A002.A07(r03);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
