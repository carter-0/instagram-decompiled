package X;

import com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment;

/* renamed from: X.Ldp  reason: case insensitive filesystem */
public final class C64548Ldp implements C66429MRj {
    public final int A00;
    public final Object A01;

    public C64548Ldp(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DkF(AnonymousClass3YP r2) {
        switch (this.A00) {
            case 0:
                ((DirectShareSheetFragment) this.A01).A0J.notifyDataSetChanged();
                return;
            case 1:
                JTQ.A1I(((C63882LAl) this.A01).A05);
                return;
            default:
                ((C47522E6i) this.A01).A04();
                return;
        }
    }
}
