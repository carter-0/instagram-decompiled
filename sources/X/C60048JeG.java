package X;

import android.widget.BaseAdapter;
import java.util.List;

/* renamed from: X.JeG  reason: case insensitive filesystem */
public final class C60048JeG extends BaseAdapter {
    public final List A00;
    public final C63591Kze A01;
    public final AnonymousClass0iw A02;

    public final int getCount() {
        return this.A00.size();
    }

    public final Object getItem(int i) {
        return this.A00.get(i);
    }

    public final long getItemId(int i) {
        String id = DbZ.A0T(this.A00, i).getId();
        id.getClass();
        return (long) id.hashCode();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: android.view.View} */
    /* JADX WARNING: type inference failed for: r0v7, types: [java.lang.Object, X.KoZ] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View getView(int r7, com.instagram.common.ui.widget.imageview.IgImageView r8, android.view.ViewGroup r9) {
        /*
            r6 = this;
            if (r8 != 0) goto L_0x001a
            android.view.LayoutInflater r1 = X.DbV.A0D(r9)
            r0 = 2131624677(0x7f0e02e5, float:1.887654E38)
            android.view.View r8 = X.DbT.A0C(r1, r9, r0)
            r1 = r8
            com.instagram.common.ui.widget.imageview.IgImageView r1 = (com.instagram.common.ui.widget.imageview.IgImageView) r1
            X.KoZ r0 = new X.KoZ
            r0.<init>()
            r0.A00 = r1
            r8.setTag(r0)
        L_0x001a:
            java.lang.Object r0 = X.DbT.A0o(r8)
            X.KoZ r0 = (X.C62921KoZ) r0
            java.lang.Object r5 = r6.getItem(r7)
            X.1Xj r5 = (X.1Xj) r5
            X.0iw r4 = r6.A02
            X.Kze r3 = r6.A01
            com.instagram.common.ui.widget.imageview.IgImageView r2 = r0.A00
            r2.getClass()
            android.content.Context r1 = r2.getContext()
            r0 = 2131100246(0x7f060256, float:1.7812868E38)
            int r0 = r1.getColor(r0)
            r2.setPlaceHolderColor(r0)
            com.instagram.common.typedurl.ImageUrl r1 = r5.A1Q()
            boolean r0 = X.C253833rU.A02(r1)
            if (r0 != 0) goto L_0x004a
            r2.setUrl(r1, r4)
        L_0x004a:
            r0 = 12
            X.LY8.A00(r2, r0, r3, r5)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60048JeG.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public C60048JeG(C63591Kze kze, AnonymousClass0iw r2, List list) {
        this.A00 = list;
        this.A02 = r2;
        this.A01 = kze;
    }
}
