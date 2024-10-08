package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.save.model.SavedCollection;
import java.util.List;

/* renamed from: X.GiB  reason: case insensitive filesystem */
public final class C53078GiB extends 2Rw {
    public List A00;
    public boolean A01;
    public boolean A02;
    public final Context A03;
    public final AnonymousClass0iw A04;
    public final JOT A05;
    public final List A06 = AnonymousClass7TE.A1C();

    public C53078GiB(Context context, AnonymousClass0iw r3, JOT jot, Boolean bool, boolean z) {
        0qQ.A0B(context, 1);
        this.A03 = context;
        this.A04 = r3;
        this.A05 = jot;
        this.A02 = z;
        if (bool != null) {
            this.A01 = bool.booleanValue();
        }
    }

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        0qQ.A0B(viewGroup, 0);
        String A002 = C273654mx.A00(1);
        LayoutInflater from = LayoutInflater.from(this.A03);
        if (i == 1) {
            View inflate = from.inflate(R.layout.save_to_collections_empty_wishlist_collection_tile, viewGroup, false);
            0qQ.A0C(inflate, A002);
            return new HE5(inflate);
        }
        View inflate2 = from.inflate(R.layout.save_to_collections_saved_collection, viewGroup, false);
        0qQ.A0C(inflate2, A002);
        return new HE4(inflate2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0070, code lost:
        if (X.0qQ.A0K(r3.A0F, X.C54665HMw.EMPTY_PRODUCT_AUTO_COLLECTION.A01) != false) goto L_0x0072;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onBindViewHolder(X.C249703kE r10, int r11) {
        /*
            r9 = this;
            X.Gj2 r10 = (X.C53130Gj2) r10
            r6 = 0
            X.0qQ.A0B(r10, r6)
            int r1 = r9.getItemViewType(r11)
            java.util.List r0 = r9.A06
            java.lang.Object r3 = r0.get(r11)
            com.instagram.save.model.SavedCollection r3 = (com.instagram.save.model.SavedCollection) r3
            android.widget.TextView r0 = r10.A02
            r5 = 0
            r0.setVisibility(r6)
            r8 = 1
            if (r1 != 0) goto L_0x00bf
            X.HE4 r10 = (X.HE4) r10
            android.content.Context r2 = r9.A03
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131165565(0x7f07017d, float:1.794535E38)
            int r1 = r1.getDimensionPixelSize(r0)
            X.1Xj r0 = r3.A04
            if (r0 == 0) goto L_0x00b8
            com.instagram.model.mediasize.ExtendedImageUrl r1 = r0.A1m(r1)
            if (r1 == 0) goto L_0x00b8
            com.instagram.ui.widget.selectableview.RoundedCornerCheckMarkSelectableImageView r4 = r10.A00
            X.0iw r0 = r9.A04
            r4.setUrl(r1, r0)
        L_0x003b:
            X.HMU r1 = r3.A06
            X.HMU r0 = X.HMU.A04
            if (r1 != r0) goto L_0x00b6
            r0 = 2131238685(0x7f081f1d, float:1.8093656E38)
            android.graphics.drawable.Drawable r0 = r2.getDrawable(r0)
        L_0x0048:
            r4.setTypeIconDrawable(r0)
            java.util.List r1 = r9.A00
            if (r1 == 0) goto L_0x0058
            java.lang.String r0 = r3.A0F
            boolean r0 = r1.contains(r0)
            r4.setSelected(r0)
        L_0x0058:
            android.widget.TextView r7 = r10.A02
            java.lang.String r0 = r3.A0G
            r7.setText(r0)
            X.HMw r0 = r3.A07
            X.HMw r2 = X.C54665HMw.PRODUCT_AUTO_COLLECTION
            if (r0 != r2) goto L_0x0072
            java.lang.String r1 = r3.A0F
            X.HMw r0 = X.C54665HMw.EMPTY_PRODUCT_AUTO_COLLECTION
            java.lang.String r0 = r0.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            r1 = 1
            if (r0 == 0) goto L_0x0073
        L_0x0072:
            r1 = 0
        L_0x0073:
            boolean r0 = r9.A02
            if (r0 == 0) goto L_0x00f3
            if (r1 == 0) goto L_0x00f3
            boolean r0 = r9.A01
            if (r0 == 0) goto L_0x0080
            r4.setSelected(r8)
        L_0x0080:
            r0 = 2131972521(0x7f1351a9, float:1.9582052E38)
            r7.setText(r0)
            java.util.List r0 = r3.A0M
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            java.util.ArrayList r8 = X.C51970G9q.A0m(r0)
            java.util.List r0 = r3.A0M
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            java.util.Iterator r7 = r0.iterator()
        L_0x009a:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00e2
            java.lang.Object r0 = r7.next()
            com.instagram.model.shopping.productimagecontainer.ProductImageContainer r0 = (com.instagram.model.shopping.productimagecontainer.ProductImageContainer) r0
            com.instagram.model.mediasize.ImageInfo r1 = r0.BGO()
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            com.instagram.model.mediasize.ExtendedImageUrl r0 = X.1iI.A04(r1, r0)
            if (r0 == 0) goto L_0x009a
            r8.add(r0)
            goto L_0x009a
        L_0x00b6:
            r0 = 0
            goto L_0x0048
        L_0x00b8:
            com.instagram.ui.widget.selectableview.RoundedCornerCheckMarkSelectableImageView r4 = r10.A00
            r4.A02()
            goto L_0x003b
        L_0x00bf:
            if (r1 != r8) goto L_0x010d
            X.HE5 r10 = (X.HE5) r10
            com.instagram.common.ui.base.IgSimpleImageView r2 = r10.A00
            android.content.Context r1 = r9.A03
            r0 = 2131238789(0x7f081f85, float:1.8093867E38)
            X.DbU.A13(r1, r2, r0)
            android.widget.TextView r1 = r10.A02
            r0 = 2131972521(0x7f1351a9, float:1.9582052E38)
            r1.setText(r0)
            android.view.View r1 = r10.A00
            r0 = 44
            X.ID2.A02(r1, r0, r3, r9)
            r0 = 8
            X.C56815IDm.A00(r1, r0, r10)
            return
        L_0x00e2:
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x00f3
            java.lang.Object r1 = r8.get(r6)
            com.instagram.common.typedurl.ImageUrl r1 = (com.instagram.common.typedurl.ImageUrl) r1
            X.0iw r0 = r9.A04
            r4.setUrl(r1, r0)
        L_0x00f3:
            android.view.View r1 = r10.A00
            r0 = 43
            X.ID2.A02(r1, r0, r3, r9)
            r0 = 7
            X.C56815IDm.A00(r1, r0, r10)
            r4.setSelected(r6)
            X.HMw r0 = r3.A07
            if (r0 != r2) goto L_0x010a
            boolean r0 = r9.A01
            if (r0 == 0) goto L_0x010a
            r5 = 1
        L_0x010a:
            r4.setSelected(r5)
        L_0x010d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53078GiB.onBindViewHolder(X.3kE, int):void");
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(-637598490);
        int size = this.A06.size();
        AnonymousClass0fD.A0A(1843699246, A032);
        return size;
    }

    public final int getItemViewType(int i) {
        int A032 = AnonymousClass0fD.A03(-680968242);
        boolean A0K = 0qQ.A0K(((SavedCollection) this.A06.get(i)).A0F, C54665HMw.EMPTY_PRODUCT_AUTO_COLLECTION.A01);
        AnonymousClass0fD.A0A(-238226062, A032);
        return A0K ? 1 : 0;
    }
}
