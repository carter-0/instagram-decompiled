package com.instagram.direct.ui.thumbnailgrid;

import X.0nA;
import X.0qQ;
import X.AnonymousClass0iw;
import X.AnonymousClass3NG;
import X.AnonymousClass7TE;
import X.C47794EHf;
import X.C74258Prm;
import X.JTO;
import X.JTT;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ThumbnailGridView extends LinearLayout {
    public C74258Prm A00;
    public boolean A01;
    public final IgImageView[] A02;
    public final LinearLayout A03;
    public final LinearLayout A04;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ThumbnailGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    public final void setHorizontalGridDivider(Drawable drawable) {
        setShowDividers(2);
        setDividerDrawable(drawable);
    }

    public final void setThumbnailPreviews(List list, AnonymousClass0iw r8) {
        0qQ.A0B(r8, 1);
        if (list == null || list.isEmpty()) {
            this.A04.setVisibility(8);
            this.A03.setVisibility(8);
            return;
        }
        int size = list.size();
        this.A04.setVisibility(0);
        LinearLayout linearLayout = this.A03;
        if (size <= 3) {
            linearLayout.setVisibility(8);
        } else {
            linearLayout.setVisibility(0);
        }
        View[] viewArr = this.A02;
        for (View visibility : viewArr) {
            visibility.setVisibility(4);
        }
        int min = Math.min(list.size(), r3);
        for (int i = 0; i < min; i++) {
            ImageUrl imageUrl = (ImageUrl) list.get(i);
            if (imageUrl != null) {
                viewArr[i].setUrl(imageUrl, r8);
                viewArr[i].setVisibility(0);
            }
        }
    }

    public final void setListener(C74258Prm prm) {
        this.A00 = prm;
        if (prm != null && !this.A01) {
            for (View A0m : this.A02) {
                AnonymousClass3NG A0m2 = AnonymousClass7TE.A0m(A0m);
                A0m2.A04 = new C47794EHf(this, 2);
                A0m2.A00();
            }
            this.A01 = true;
        }
    }

    public final void setThumbnailHeight(int i) {
        0nA.A0V(this.A04, i);
        0nA.A0V(this.A03, i);
    }

    public final void setVerticalGridDivider(Drawable drawable) {
        LinearLayout linearLayout = this.A04;
        linearLayout.setShowDividers(2);
        linearLayout.setDividerDrawable(drawable);
        LinearLayout linearLayout2 = this.A03;
        linearLayout2.setShowDividers(2);
        linearLayout2.setDividerDrawable(drawable);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ThumbnailGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        setOrientation(1);
        LayoutInflater.from(context).inflate(R.layout.direct_thumbnail_grid, this, true);
        LinearLayout linearLayout = (LinearLayout) requireViewById(R.id.top_image_row);
        this.A04 = linearLayout;
        LinearLayout linearLayout2 = (LinearLayout) requireViewById(R.id.bottom_image_row);
        this.A03 = linearLayout2;
        this.A02 = new IgImageView[]{JTO.A0Y(linearLayout, R.id.image1), JTO.A0Y(linearLayout, R.id.image2), JTO.A0Y(linearLayout, R.id.image3), JTO.A0Y(linearLayout2, R.id.image4), JTO.A0Y(linearLayout2, R.id.image5), JTO.A0Y(linearLayout2, R.id.image6)};
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x004a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setThumbnailPreviews(java.util.List r8, X.AnonymousClass77D r9, X.AnonymousClass77D r10, X.AnonymousClass0iw r11) {
        /*
            r7 = this;
            r6 = 3
            X.0qQ.A0B(r11, r6)
            r2 = 8
            if (r8 == 0) goto L_0x0068
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x0068
            int r1 = r8.size()
            r5 = 0
            android.widget.LinearLayout r0 = r7.A04
            r0.setVisibility(r5)
            android.widget.LinearLayout r0 = r7.A03
            if (r1 > r6) goto L_0x002e
            r0.setVisibility(r2)
        L_0x001f:
            com.instagram.common.ui.widget.imageview.IgImageView[] r4 = r7.A02
            int r3 = r4.length
            r2 = 0
        L_0x0023:
            if (r2 >= r3) goto L_0x0032
            r1 = r4[r2]
            r0 = 4
            r1.setVisibility(r0)
            int r2 = r2 + 1
            goto L_0x0023
        L_0x002e:
            r0.setVisibility(r5)
            goto L_0x001f
        L_0x0032:
            int r0 = r8.size()
            int r3 = java.lang.Math.min(r0, r3)
            if (r3 > r6) goto L_0x005f
            r0 = r4[r5]
            r0.A0I = r9
            if (r3 != r6) goto L_0x0047
            r0 = 2
        L_0x0043:
            r0 = r4[r0]
            r0.A0I = r10
        L_0x0047:
            r2 = 0
        L_0x0048:
            if (r2 >= r3) goto L_0x0072
            java.lang.Object r1 = r8.get(r2)
            com.instagram.common.typedurl.ImageUrl r1 = (com.instagram.common.typedurl.ImageUrl) r1
            if (r1 == 0) goto L_0x005c
            r0 = r4[r2]
            r0.setUrl(r1, r11)
            r0 = r4[r2]
            r0.setVisibility(r5)
        L_0x005c:
            int r2 = r2 + 1
            goto L_0x0048
        L_0x005f:
            r0 = r4[r6]
            r0.A0I = r9
            r0 = 6
            if (r3 != r0) goto L_0x0047
            r0 = 5
            goto L_0x0043
        L_0x0068:
            android.widget.LinearLayout r0 = r7.A04
            r0.setVisibility(r2)
            android.widget.LinearLayout r0 = r7.A03
            r0.setVisibility(r2)
        L_0x0072:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.ui.thumbnailgrid.ThumbnailGridView.setThumbnailPreviews(java.util.List, X.77D, X.77D, X.0iw):void");
    }

    public /* synthetic */ ThumbnailGridView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ThumbnailGridView(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }
}
