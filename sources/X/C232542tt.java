package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.Arrays;

/* renamed from: X.2tt  reason: invalid class name and case insensitive filesystem */
public final class C232542tt extends C231632rz {
    public C231192r7 A00;
    public final Context A01;
    public final UserSession A02;

    public C232542tt(Context context, UserSession userSession) {
        0qQ.A0B(context, 1);
        this.A01 = context;
        this.A02 = userSession;
    }

    public final String getBinderGroupName() {
        return "IgShimmer";
    }

    public final void onViewAttachedToWindow(View view, int i, Object obj, Object obj2) {
        C231192r7 r0;
        0qQ.A0B(view, 0);
        0qQ.A0B(obj, 2);
        if (i == 8 && (r0 = this.A00) != null) {
            AnonymousClass2l3.A02(r0.A00, "SHIMMER_START");
        }
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        Integer num;
        C238263Be r3 = (C238263Be) obj;
        0qQ.A0B(r2, 0);
        0qQ.A0B(r3, 1);
        switch (r3.A00.intValue()) {
            case 5:
                num = AnonymousClass05K.A0Y;
                break;
            case 6:
                num = AnonymousClass05K.A0N;
                break;
            default:
                num = AnonymousClass05K.A1F;
                break;
        }
        r2.A7U(num.intValue());
    }

    public final int getIdentifier(int i, Object obj, Object obj2) {
        if (i == 9) {
            return Integer.MAX_VALUE;
        }
        return Arrays.hashCode(new Object[]{Integer.valueOf(i)});
    }

    public final int getViewModelHash(int i, Object obj, Object obj2) {
        C238273Bf r4 = (C238273Bf) obj2;
        if (r4 != null) {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(r4.A00)});
        }
        return 0;
    }

    public final int getViewTypeCount() {
        return AnonymousClass05K.A00(11).length;
    }

    public final String getViewTypeName(int i) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("IgShimmer");
        sb.append('[');
        switch (AnonymousClass05K.A00(11)[i].intValue()) {
            case 1:
                str = "hashtag_header";
                break;
            case 2:
                str = "profile_header";
                break;
            case 3:
                str = "two_by_two_grid";
                break;
            case 4:
                str = "one_by_one_grid";
                break;
            case 5:
                str = "newsfeed";
                break;
            case 6:
                str = "product_hscroll";
                break;
            case 7:
                str = "merchant_hscroll";
                break;
            case 8:
                str = "mainfeed";
                break;
            case 9:
                str = "immersive_media";
                break;
            case 10:
                str = "full_height_media";
                break;
            default:
                str = "refinements_header";
                break;
        }
        sb.append(str);
        sb.append(']');
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0039  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void bindView(int r5, android.view.View r6, java.lang.Object r7, java.lang.Object r8) {
        /*
            r4 = this;
            r0 = -731796323(0xffffffffd461ac9d, float:-3.87705445E12)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r0 = 1
            X.0qQ.A0B(r6, r0)
            r2 = 3
            X.0qQ.A0B(r8, r2)
            r0 = 10
            if (r5 != r0) goto L_0x003f
            java.lang.Object r1 = r6.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.igds.components.shimmer.IgShimmerViewBinder.Holder"
            X.0qQ.A0C(r1, r0)
            X.3Bf r8 = (X.C238273Bf) r8
            X.0qQ.A0B(r8, r2)
        L_0x0021:
            r1 = 0
            r0 = 1
            X.0qQ.A0B(r8, r0)
        L_0x0026:
            com.facebook.shimmer.ShimmerFrameLayout r6 = (com.facebook.shimmer.ShimmerFrameLayout) r6
            boolean r0 = r8.A00
            if (r0 == 0) goto L_0x0039
            r6.A02()
        L_0x002f:
            r6.setVisibility(r1)
            r0 = -1681215643(0xffffffff9bcaaf65, float:-3.3531443E-22)
            X.AnonymousClass0fD.A0A(r0, r3)
            return
        L_0x0039:
            r6.A03()
            r1 = 8
            goto L_0x002f
        L_0x003f:
            r0 = 9
            X.3Bf r8 = (X.C238273Bf) r8
            if (r5 != r0) goto L_0x0021
            r2 = 0
            r0 = 1
            X.0qQ.A0B(r8, r0)
            android.view.ViewGroup$LayoutParams r1 = r6.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x0059
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            if (r1 == 0) goto L_0x0059
            r1.setMargins(r2, r2, r2, r2)
        L_0x0059:
            r1 = 0
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C232542tt.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: android.view.ViewGroup} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: X.Tvr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v21, resolved type: android.view.ViewGroup} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v22, resolved type: com.facebook.shimmer.ShimmerFrameLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v23, resolved type: com.facebook.shimmer.ShimmerFrameLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v24, resolved type: android.view.ViewGroup} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v25, resolved type: com.facebook.shimmer.ShimmerFrameLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: X.Tvr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: X.Tvr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v15, resolved type: X.9p4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v18, resolved type: X.Tvr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v32, resolved type: com.facebook.shimmer.ShimmerFrameLayout} */
    /* JADX WARNING: type inference failed for: r0v38, types: [X.3kE, java.lang.Object, X.Dn0] */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x012b, code lost:
        r0 = new android.view.ViewGroup.LayoutParams(r3, r1);
        r5 = r5;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0130, code lost:
        r5.setLayoutParams(r0);
        r5 = r5;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0133, code lost:
        r2.addView(r5);
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0175, code lost:
        r2 = android.view.LayoutInflater.from(r6).inflate(com.instagram.android.R.layout.shimmer_header_layout, r11, r2);
        X.0qQ.A0C(r2, "null cannot be cast to non-null type com.facebook.shimmer.ShimmerFrameLayout");
        r2 = (android.view.ViewGroup) r2;
        r5.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, r3));
        r2.addView(r5);
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0193, code lost:
        X.AnonymousClass0fD.A0A(-1514389372, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0199, code lost:
        return r2;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View createView(int r10, android.view.ViewGroup r11) {
        /*
            r9 = this;
            r0 = 1815243537(0x6c326b11, float:8.627776E26)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r8 = 1
            X.0qQ.A0B(r11, r8)
            r0 = 11
            java.lang.Integer[] r0 = X.AnonymousClass05K.A00(r0)
            r0 = r0[r10]
            int r0 = r0.intValue()
            switch(r0) {
                case 0: goto L_0x0156;
                case 1: goto L_0x015f;
                case 2: goto L_0x0140;
                case 3: goto L_0x0137;
                case 4: goto L_0x010c;
                case 5: goto L_0x00ec;
                case 6: goto L_0x00a3;
                case 7: goto L_0x0085;
                case 8: goto L_0x0068;
                case 9: goto L_0x0026;
                case 10: goto L_0x003c;
                default: goto L_0x001a;
            }
        L_0x001a:
            X.Wub r1 = new X.Wub
            r1.<init>()
            r0 = -1017447189(0xffffffffc35afceb, float:-218.98796)
            X.AnonymousClass0fD.A0A(r0, r4)
            throw r1
        L_0x0026:
            android.content.Context r0 = r9.A01
            r2 = 0
            X.0qQ.A0B(r0, r2)
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r0)
            r0 = 2131629377(0x7f0e1541, float:1.8886073E38)
            android.view.View r2 = r1.inflate(r0, r11, r2)
            X.0qQ.A07(r2)
            goto L_0x0193
        L_0x003c:
            android.content.Context r1 = r9.A01
            r0 = 0
            X.0qQ.A0B(r1, r0)
            com.facebook.shimmer.ShimmerFrameLayout r2 = X.C241123Ny.A00(r1, r11)
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup"
            X.0qQ.A0C(r2, r0)
            X.UmV r3 = new X.UmV
            r3.<init>(r1)
            r1 = -1
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r0.<init>(r1, r1)
            r3.setLayoutParams(r0)
            r2.addView(r3)
            X.Dn0 r0 = new X.Dn0
            r0.<init>(r2)
            r0.A00 = r2
            r2.setTag(r0)
            goto L_0x0193
        L_0x0068:
            android.content.Context r6 = r9.A01
            r0 = 0
            X.0qQ.A0B(r6, r0)
            com.facebook.shimmer.ShimmerFrameLayout r2 = X.C241123Ny.A00(r6, r11)
            r3 = -1
            r1 = -2
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r0.<init>(r3, r1)
            r2.setLayoutParams(r0)
            X.3O6 r5 = new X.3O6
            r5.<init>(r6, r11)
            int r1 = r5.A0G
            goto L_0x012b
        L_0x0085:
            android.content.Context r5 = r9.A01
            r3 = 0
            X.0qQ.A0B(r5, r3)
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r5)
            r0 = 2131629376(0x7f0e1540, float:1.8886071E38)
            android.view.View r2 = r1.inflate(r0, r11, r3)
            java.lang.String r0 = "null cannot be cast to non-null type com.facebook.shimmer.ShimmerFrameLayout"
            X.0qQ.A0C(r2, r0)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            android.view.View r5 = X.VEA.A00(r5, r11, r3)
            goto L_0x0133
        L_0x00a3:
            android.content.Context r7 = r9.A01
            r6 = 0
            X.0qQ.A0B(r7, r6)
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r7)
            r0 = 2131629376(0x7f0e1540, float:1.8886071E38)
            android.view.View r2 = r1.inflate(r0, r11, r6)
            java.lang.String r0 = "null cannot be cast to non-null type com.facebook.shimmer.ShimmerFrameLayout"
            X.0qQ.A0C(r2, r0)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r7)
            r0 = 2131629389(0x7f0e154d, float:1.8886098E38)
            android.view.View r5 = r1.inflate(r0, r11, r6)
            r0 = 2131430668(0x7f0b0d0c, float:1.8483043E38)
            android.view.View r3 = r5.requireViewById(r0)
            X.0qQ.A07(r3)
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r3.setOrientation(r8)
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r7)
            r0 = 2131628280(0x7f0e10f8, float:1.8883848E38)
            android.view.View r0 = r1.inflate(r0, r3, r6)
            r3.addView(r0)
            X.Dmq r0 = new X.Dmq
            r0.<init>(r5)
            r5.setTag(r0)
            goto L_0x0133
        L_0x00ec:
            android.content.Context r1 = r9.A01
            r0 = 0
            X.0qQ.A0B(r1, r0)
            com.facebook.shimmer.ShimmerFrameLayout r2 = X.C241123Ny.A00(r1, r11)
            X.9p4 r5 = new X.9p4
            r5.<init>(r1)
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r3 = r0.heightPixels
            r1 = -1
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r0.<init>(r1, r3)
            goto L_0x0130
        L_0x010c:
            android.content.Context r1 = r9.A01
            r0 = 0
            X.0qQ.A0B(r1, r0)
            com.facebook.shimmer.ShimmerFrameLayout r2 = X.C241123Ny.A00(r1, r11)
            X.Tvr r5 = new X.Tvr
            r5.<init>(r1)
            X.Tvf r0 = X.C14411Tvf.ONE_BY_ONE
            r5.setLayoutType(r0)
            r3 = -1
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r1 = r0.heightPixels
        L_0x012b:
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r0.<init>(r3, r1)
        L_0x0130:
            r5.setLayoutParams(r0)
        L_0x0133:
            r2.addView(r5)
            goto L_0x0193
        L_0x0137:
            X.3Ny r1 = X.C241123Ny.A00
            android.content.Context r0 = r9.A01
            com.facebook.shimmer.ShimmerFrameLayout r2 = r1.A01(r0, r11)
            goto L_0x0193
        L_0x0140:
            android.content.Context r6 = r9.A01
            r2 = 0
            X.0qQ.A0B(r6, r2)
            X.9p3 r5 = new X.9p3
            r5.<init>(r6)
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r3 = r0.heightPixels
            goto L_0x0175
        L_0x0156:
            X.3Ny r1 = X.C241123Ny.A00
            android.content.Context r0 = r9.A01
            com.facebook.shimmer.ShimmerFrameLayout r2 = r1.A02(r0, r11)
            goto L_0x0193
        L_0x015f:
            android.content.Context r6 = r9.A01
            r2 = 0
            X.0qQ.A0B(r6, r2)
            X.9p2 r5 = new X.9p2
            r5.<init>(r6)
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131165324(0x7f07008c, float:1.7944862E38)
            int r3 = r1.getDimensionPixelSize(r0)
        L_0x0175:
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r6)
            r0 = 2131629376(0x7f0e1540, float:1.8886071E38)
            android.view.View r2 = r1.inflate(r0, r11, r2)
            java.lang.String r0 = "null cannot be cast to non-null type com.facebook.shimmer.ShimmerFrameLayout"
            X.0qQ.A0C(r2, r0)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r1 = -1
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r0.<init>(r1, r3)
            r5.setLayoutParams(r0)
            r2.addView(r5)
        L_0x0193:
            r0 = -1514389372(0xffffffffa5bc4084, float:-3.265652E-16)
            X.AnonymousClass0fD.A0A(r0, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C232542tt.createView(int, android.view.ViewGroup):android.view.View");
    }
}
