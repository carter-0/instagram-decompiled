package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.Ue1  reason: case insensitive filesystem */
public final class C15512Ue1 extends C231632rz {
    public final Context A00;

    public final int getViewTypeCount() {
        return 5;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r3, Object obj, Object obj2) {
        C15810Uit uit = (C15810Uit) obj2;
        DbY.A1S(r3, uit);
        for (Object obj3 : uit.A00) {
            if (obj3 instanceof HES) {
                r3.A7U(0);
            }
        }
    }

    public C15512Ue1(Context context) {
        this.A00 = context;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(-2136955936);
        0qQ.A0B(view, 1);
        0qQ.A0B(obj2, 3);
        if (i == 0 || i == 1) {
            Object tag = view.getTag();
            0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.shopping.adapter.destination.shimmer.ProductFeedShimmerViewBinder.Holder");
            C18248VoF.A01((UBY) tag, ((C15810Uit) obj2).A00());
        } else if (i == 3) {
            Object tag2 = view.getTag();
            0qQ.A0C(tag2, "null cannot be cast to non-null type com.instagram.shopping.adapter.destination.shimmer.ContentTileShimmerViewBinder.Holder");
            UC6 uc6 = (UC6) tag2;
            0qQ.A0B(uc6, 0);
            uc6.A00.A02();
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("Unsupported view type.");
            AnonymousClass0fD.A0A(-1093955046, A03);
            throw illegalStateException;
        }
        AnonymousClass0fD.A0A(-924555265, A03);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: android.widget.LinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: com.facebook.shimmer.ShimmerFrameLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: android.widget.LinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: android.widget.LinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: android.widget.LinearLayout} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View createView(int r9, android.view.ViewGroup r10) {
        /*
            r8 = this;
            r0 = -1962744400(0xffffffff8b02e5b0, float:-2.5209887E-32)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r1 = 1
            X.0qQ.A0B(r10, r1)
            if (r9 == 0) goto L_0x0077
            if (r9 == r1) goto L_0x0070
            r0 = 3
            if (r9 != r0) goto L_0x0089
            android.content.Context r7 = r8.A00
            r6 = 0
            android.view.LayoutInflater r1 = X.DbT.A0B(r7)
            r0 = 2131629389(0x7f0e154d, float:1.8886098E38)
            android.view.View r5 = r1.inflate(r0, r10, r6)
            java.lang.String r0 = "null cannot be cast to non-null type com.facebook.shimmer.ShimmerFrameLayout"
            X.0qQ.A0C(r5, r0)
            com.facebook.shimmer.ShimmerFrameLayout r5 = (com.facebook.shimmer.ShimmerFrameLayout) r5
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131165184(0x7f070000, float:1.7944578E38)
            int r0 = r1.getDimensionPixelOffset(r0)
            int r4 = X.0nA.A09(r7)
            int r0 = r0 * 2
            int r4 = r4 - r0
            float r1 = (float) r4
            r0 = 1068121457(0x3faa3d71, float:1.33)
            float r1 = r1 / r0
            int r2 = (int) r1
            r0 = -2
            X.C66581MXm.A1A(r5, r0)
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r7)
            r0 = 2131624654(0x7f0e02ce, float:1.8876494E38)
            android.view.View r0 = X.DbU.A0A(r1, r5, r0, r6)
            X.0nA.A0f(r0, r4)
            X.0nA.A0V(r0, r2)
            r5.addView(r0)
            X.UC6 r0 = new X.UC6
            r0.<init>(r5)
            r5.setTag(r0)
        L_0x005e:
            android.content.res.Resources r0 = r5.getResources()
            int r0 = X.AnonymousClass7TE.A0D(r0)
            X.0nA.A0T(r5, r0)
            r0 = 1781937645(0x6a3635ed, float:5.506979E25)
            X.AnonymousClass0fD.A0A(r0, r3)
            return r5
        L_0x0070:
            android.content.Context r0 = r8.A00
            android.widget.LinearLayout r5 = X.C18248VoF.A00(r0, r10, r1)
            goto L_0x005e
        L_0x0077:
            android.content.Context r2 = r8.A00
            int r1 = X.0nA.A08(r2)
            int r0 = X.0nA.A09(r2)
            int r0 = r0 / 2
            int r1 = r1 / r0
            android.widget.LinearLayout r5 = X.C18248VoF.A00(r2, r10, r1)
            goto L_0x005e
        L_0x0089:
            java.lang.String r0 = "Unsupported view type."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            r0 = -1784517193(0xffffffff95a26db7, float:-6.560438E-26)
            X.AnonymousClass0fD.A0A(r0, r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15512Ue1.createView(int, android.view.ViewGroup):android.view.View");
    }
}
