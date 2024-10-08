package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.EGy  reason: case insensitive filesystem */
public final class C47787EGy extends C232232tF {
    public final E3G A00;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C46946Do0(DbT.A0D(layoutInflater, viewGroup, R.layout.profile_multiple_addresses_edit_list_add_address_item_view_holder, false));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r1 == 0) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void bind(X.C232262tL r4, X.C249703kE r5) {
        /*
            r3 = this;
            X.FY4 r4 = (X.FY4) r4
            X.AnonymousClass7TG.A1N(r4, r5)
            android.view.View r2 = r5.itemView
            java.lang.String r0 = r4.A00
            if (r0 == 0) goto L_0x0013
            int r1 = r0.length()
            r0 = 1056964608(0x3f000000, float:0.5)
            if (r1 != 0) goto L_0x0015
        L_0x0013:
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x0015:
            r2.setAlpha(r0)
            android.view.View r1 = r5.itemView
            r0 = 33
            X.FPG.A00(r1, r0, r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47787EGy.bind(X.2tL, X.3kE):void");
    }

    public final Class modelClass() {
        return FY4.class;
    }

    public C47787EGy(E3G e3g) {
        this.A00 = e3g;
    }
}
