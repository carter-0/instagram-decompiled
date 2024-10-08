package X;

public final class WY2 implements G77 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public WY2(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj;
        this.A02 = obj3;
        this.A01 = obj2;
    }

    public final void onSearchCleared(String str) {
        if (this.A00 != 0) {
            Object obj = this.A01;
            0qQ.A0C(obj, "null cannot be cast to non-null type com.facebook.rendercore.simplelist.ListLayoutData<com.instagram.common.bloks.component.base.BloksModel>");
            WK2.A00((C14539Txz) obj, (C15168UTt) this.A02, "");
        }
    }

    public final void onSearchTextChanged(String str) {
        if (this.A00 != 0) {
            0qQ.A0B(str, 0);
            Object obj = this.A01;
            0qQ.A0C(obj, "null cannot be cast to non-null type com.facebook.rendercore.simplelist.ListLayoutData<com.instagram.common.bloks.component.base.BloksModel>");
            WK2.A00((C14539Txz) obj, (C15168UTt) this.A02, str);
            return;
        }
        0qQ.A0B(str, 0);
        ((C48238EbJ) this.A03).A02 = str;
        C276544tV r4 = (C276544tV) this.A02;
        C277014uI A0A = r4.A0A(40);
        if (A0A != null) {
            C308276Tl r2 = new C308276Tl();
            r2.A03(r4, 0);
            String A012 = 0mp.A01(str);
            if (A012 != null) {
                r2.A02(A012);
                C307786Rm r0 = (C307786Rm) this.A01;
                r2.A03(r0, 2);
                DbT.A1R(r0, r4, r2, A0A);
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }
}
