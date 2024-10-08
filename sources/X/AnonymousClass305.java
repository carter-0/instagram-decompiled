package X;

import android.view.View;
import com.google.common.collect.MapMakerInternalMap;
import com.instagram.android.R;
import com.instagram.feed.widget.IgProgressImageView;
import java.util.Map;

/* renamed from: X.305  reason: invalid class name */
public final class AnonymousClass305 extends C235422zt {
    public final Map A00;

    public static final boolean A01(IgProgressImageView igProgressImageView) {
        return (igProgressImageView == null || igProgressImageView.getVisibility() != 0 || igProgressImageView.getIgImageView().A0C == null) ? false : true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c7 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ATF(X.AnonymousClass30Y r10, X.C252093oY r11) {
        /*
            r9 = this;
            r0 = 0
            X.0qQ.A0B(r10, r0)
            r5 = 1
            X.0qQ.A0B(r11, r5)
            java.lang.Integer r1 = r11.CEk(r10)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 == r0) goto L_0x010b
            java.lang.Object r0 = r10.A03
            X.0qQ.A06(r0)
            X.1Xj r0 = (X.1Xj) r0
            X.59J r7 = r9.A02(r0)
            X.1Xj r0 = r7.A0K
            java.util.List r0 = r0.A3W()
            r6 = 0
            int r4 = r0.size()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L_0x002b:
            if (r6 >= r4) goto L_0x0109
            X.B8f r2 = new X.B8f
            r2.<init>()
            if (r6 == 0) goto L_0x00ef
            if (r6 == r5) goto L_0x00d5
            r0 = 2
            if (r6 != r0) goto L_0x00c7
            java.util.Map r1 = r9.A00
            r0 = 2131430417(0x7f0b0c11, float:1.8482534E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r8 = r1.get(r0)
            com.instagram.feed.widget.IgProgressImageView r8 = (com.instagram.feed.widget.IgProgressImageView) r8
            boolean r0 = A01(r8)
            if (r0 != 0) goto L_0x005b
            r0 = 2131430430(0x7f0b0c1e, float:1.848256E38)
        L_0x0051:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r8 = r1.get(r0)
            com.instagram.feed.widget.IgProgressImageView r8 = (com.instagram.feed.widget.IgProgressImageView) r8
        L_0x005b:
            if (r8 == 0) goto L_0x00c7
            r0 = 2131434080(0x7f0b1a60, float:1.8489964E38)
            java.lang.Object r1 = r8.getTag(r0)
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x00cb
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x00cb
            java.lang.String r0 = "media_url"
            r2.A06(r0, r1)
            r0 = 1
        L_0x0073:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            r0 = 3426(0xd62, float:4.801E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r2.A05(r0, r1)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r8.getIgImageView()
            int r0 = r0.A01
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "media_height"
            r2.A05(r0, r1)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r8.getIgImageView()
            int r0 = r0.A02
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "media_width"
            r2.A05(r0, r1)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r8.getIgImageView()
            int r0 = r0.getMeasuredHeight()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "displayed_height"
            r2.A05(r0, r1)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r8.getIgImageView()
            int r0 = r0.getMeasuredWidth()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "displayed_width"
            r2.A05(r0, r1)
            r3.add(r2)
        L_0x00c7:
            int r6 = r6 + 1
            goto L_0x002b
        L_0x00cb:
            java.lang.String r1 = ""
            java.lang.String r0 = "media_url"
            r2.A06(r0, r1)
            r0 = 2
            goto L_0x0073
        L_0x00d5:
            java.util.Map r1 = r9.A00
            r0 = 2131430413(0x7f0b0c0d, float:1.8482526E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r8 = r1.get(r0)
            com.instagram.feed.widget.IgProgressImageView r8 = (com.instagram.feed.widget.IgProgressImageView) r8
            boolean r0 = A01(r8)
            if (r0 != 0) goto L_0x005b
            r0 = 2131430429(0x7f0b0c1d, float:1.8482559E38)
            goto L_0x0051
        L_0x00ef:
            java.util.Map r1 = r9.A00
            r0 = 2131430409(0x7f0b0c09, float:1.8482518E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r8 = r1.get(r0)
            com.instagram.feed.widget.IgProgressImageView r8 = (com.instagram.feed.widget.IgProgressImageView) r8
            boolean r0 = A01(r8)
            if (r0 != 0) goto L_0x005b
            r0 = 2131430428(0x7f0b0c1c, float:1.8482557E38)
            goto L_0x0051
        L_0x0109:
            r7.A0E = r3
        L_0x010b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass305.ATF(X.30Y, X.3oY):void");
    }

    public AnonymousClass305(Map map) {
        super(map);
        17j r1 = new 17j();
        r1.A04(MapMakerInternalMap.Strength.A01);
        r1.A01();
        this.A00 = 0Yt.A03(r1.A00());
    }

    public static final IgProgressImageView A00(View view, int i) {
        View requireViewById = view.requireViewById(i).requireViewById(R.id.collection_thumbnail_imageview);
        0qQ.A07(requireViewById);
        return (IgProgressImageView) requireViewById;
    }
}
