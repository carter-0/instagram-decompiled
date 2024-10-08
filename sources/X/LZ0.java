package X;

import android.view.ViewTreeObserver;

public final class LZ0 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int A00;
    public final Object A01;

    public LZ0(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(ViewTreeObserver viewTreeObserver, Object obj, int i) {
        viewTreeObserver.addOnGlobalLayoutListener(new LZ0(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00bc, code lost:
        r5.postDelayed(r2, 1000);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0139, code lost:
        X.0qQ.A0F(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0140, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0163, code lost:
        r0 = r3.getViewTreeObserver();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0167, code lost:
        r0.removeOnGlobalLayoutListener(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x016a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onGlobalLayout() {
        /*
            r6 = this;
            int r0 = r6.A00
            switch(r0) {
                case 0: goto L_0x0006;
                case 1: goto L_0x001a;
                case 2: goto L_0x0131;
                case 3: goto L_0x003b;
                case 4: goto L_0x0077;
                case 5: goto L_0x0141;
                case 6: goto L_0x0089;
                case 7: goto L_0x00c2;
                case 8: goto L_0x0101;
                case 9: goto L_0x0119;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            java.lang.Object r1 = r6.A01
            X.K4W r1 = (X.K4W) r1
            r0 = 0
            X.K4W.A00(r1, r0)
            android.widget.ListView r0 = r1.A00
            if (r0 == 0) goto L_0x0005
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            if (r0 == 0) goto L_0x0005
            goto L_0x0167
        L_0x001a:
            java.lang.Object r2 = r6.A01
            X.Lk8 r2 = (X.C64908Lk8) r2
            androidx.recyclerview.widget.RecyclerView r0 = r2.A04
            X.C51967G9n.A0y(r0, r6)
            X.3pI r1 = r0.A0D
            java.lang.String r0 = "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager"
            X.0qQ.A0C(r1, r0)
            androidx.recyclerview.widget.LinearLayoutManager r1 = (androidx.recyclerview.widget.LinearLayoutManager) r1
            int r1 = r1.A1c()
            r2.A00 = r1
            X.JmA r0 = r2.A01
            if (r0 == 0) goto L_0x0005
            X.KB5 r0 = r0.A00
            r0.A01 = r1
            return
        L_0x003b:
            java.lang.Object r4 = r6.A01
            com.instagram.creation.fragment.AlbumEditFragment r4 = (com.instagram.creation.fragment.AlbumEditFragment) r4
            androidx.recyclerview.widget.RecyclerView r0 = r4.A0A
            java.lang.String r2 = "audioList"
            if (r0 == 0) goto L_0x0139
            X.C51967G9n.A0y(r0, r6)
            androidx.recyclerview.widget.RecyclerView r1 = r4.A0A
            if (r1 == 0) goto L_0x0139
            r0 = 1
            android.view.View r5 = r1.getChildAt(r0)
            if (r5 == 0) goto L_0x0005
            X.0eM r0 = r4.A0e
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            if (r0 != 0) goto L_0x0005
            X.0eM r0 = r4.A0d
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.1Av r3 = X.1Au.A00(r0)
            X.0s0 r2 = r3.A47
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 481(0x1e1, float:6.74E-43)
            boolean r0 = X.AnonymousClass7TG.A1a(r3, r2, r1, r0)
            if (r0 != 0) goto L_0x0005
            X.M6z r2 = new X.M6z
            r2.<init>(r5, r4)
            goto L_0x00bc
        L_0x0077:
            java.lang.Object r1 = r6.A01
            com.instagram.creation.fragment.followersshare.FollowersShareFragment r1 = (com.instagram.creation.fragment.followersshare.FollowersShareFragment) r1
            X.LQa r0 = r1.mViewHolder
            if (r0 == 0) goto L_0x0005
            r0 = 1
            com.instagram.creation.fragment.followersshare.FollowersShareFragment.A0L(r1, r0)
            androidx.recyclerview.widget.RecyclerView r3 = X.LQa.A00(r1)
            goto L_0x0163
        L_0x0089:
            java.lang.Object r4 = r6.A01
            X.JcV r4 = (X.C59962JcV) r4
            androidx.recyclerview.widget.RecyclerView r0 = r4.A08
            java.lang.String r2 = "audioList"
            if (r0 == 0) goto L_0x0139
            X.C51967G9n.A0y(r0, r6)
            androidx.recyclerview.widget.RecyclerView r1 = r4.A08
            if (r1 == 0) goto L_0x0139
            r0 = 1
            android.view.View r5 = r1.getChildAt(r0)
            if (r5 == 0) goto L_0x0005
            X.0eM r0 = r4.A0i
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.1Av r3 = X.1Au.A00(r0)
            X.0s0 r2 = r3.A47
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 481(0x1e1, float:6.74E-43)
            boolean r0 = X.AnonymousClass7TG.A1a(r3, r2, r1, r0)
            if (r0 != 0) goto L_0x0005
            X.M7F r2 = new X.M7F
            r2.<init>(r5, r4)
        L_0x00bc:
            r0 = 1000(0x3e8, double:4.94E-321)
            r5.postDelayed(r2, r0)
            return
        L_0x00c2:
            java.lang.Object r2 = r6.A01
            X.JcV r2 = (X.C59962JcV) r2
            X.Jq4 r0 = r2.A0A
            if (r0 == 0) goto L_0x00d3
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            if (r0 == 0) goto L_0x00d3
            r0.removeOnGlobalLayoutListener(r6)
        L_0x00d3:
            X.0eM r0 = r2.A0i
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            boolean r0 = X.2Ht.A02(r0)
            if (r0 == 0) goto L_0x00f8
            X.JcW r0 = X.C59962JcV.A01(r2)
            X.MWw r1 = r0.A01
            if (r1 == 0) goto L_0x0005
            X.Jq4 r2 = r2.A0A
            if (r2 == 0) goto L_0x0005
            java.util.List r0 = r2.A03
            int r1 = r0.indexOf(r1)
            r0 = -1
            if (r1 <= r0) goto L_0x0005
            r2.A1I(r1)
            return
        L_0x00f8:
            X.Jq4 r1 = r2.A0A
            if (r1 == 0) goto L_0x0005
            r0 = 0
            r1.A1I(r0)
            return
        L_0x0101:
            java.lang.Object r1 = r6.A01
            X.JUw r1 = (X.C59713JUw) r1
            android.view.View r0 = r1.A00
            if (r0 == 0) goto L_0x0005
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            if (r0 == 0) goto L_0x0005
            boolean r0 = r0.isAlive()
            if (r0 == 0) goto L_0x0005
            X.C59713JUw.A00(r1)
            return
        L_0x0119:
            java.lang.Object r1 = r6.A01
            X.Luk r1 = (X.C65521Luk) r1
            android.view.View r0 = r1.A00
            if (r0 == 0) goto L_0x0005
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            if (r0 == 0) goto L_0x0005
            boolean r0 = r0.isAlive()
            if (r0 == 0) goto L_0x0005
            X.C65521Luk.A01(r1)
            return
        L_0x0131:
            java.lang.Object r0 = r6.A01
            X.JcE r0 = (X.C59948JcE) r0
            X.C59948JcE.A00(r0)
            return
        L_0x0139:
            X.0qQ.A0F(r2)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0141:
            android.graphics.Rect r2 = X.AnonymousClass7TE.A0W()
            java.lang.Object r0 = r6.A01
            X.3kE r0 = (X.C249703kE) r0
            X.JoL r0 = (X.C60612JoL) r0
            com.instagram.common.ui.base.IgTextView r3 = r0.A01
            r0 = 0
            r3.getLineBounds(r0, r2)
            int r1 = r2.bottom
            int r0 = r2.top
            int r1 = r1 - r0
            int r0 = r3.getHeight()
            int r0 = r0 / r1
            r3.setMaxLines(r0)
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
            r3.setEllipsize(r0)
        L_0x0163:
            android.view.ViewTreeObserver r0 = r3.getViewTreeObserver()
        L_0x0167:
            r0.removeOnGlobalLayoutListener(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LZ0.onGlobalLayout():void");
    }
}
