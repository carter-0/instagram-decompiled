package X;

import android.os.Bundle;
import android.view.View;

public final class ERZ extends C47518E6c {
    public static final String __redex_internal_original_name = "NewsfeedFilterSelectorFragment";
    public F21 A00;
    public C46356DdJ A01;
    public final AnonymousClass0eM A02 = C227642jf.A02(this);
    public final String A03 = "newsfeed_filter_selector";

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        view.setBackgroundResource(2Yu.A02(getContext()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0100, code lost:
        if (r1 == null) goto L_0x0102;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList A00() {
        /*
            r11 = this;
            X.F21 r1 = r11.A00
            if (r1 == 0) goto L_0x001a
            X.DdJ r3 = r1.A01
            java.util.Map r0 = r3.A02
            r0.clear()
            com.instagram.newsfeed.fragment.NewsfeedFragment r1 = r1.A00
            X.7Pu r2 = r1.A03
            if (r2 == 0) goto L_0x001a
            r0 = 0
            X.7Pt r1 = com.instagram.newsfeed.fragment.NewsfeedFragment.A00(r1, r3, r0)
            r0 = 1
            r2.A0K(r1, r0)
        L_0x001a:
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            X.DdJ r0 = r11.A01
            if (r0 == 0) goto L_0x0124
            java.util.List r0 = r0.A01
            java.util.Iterator r10 = r0.iterator()
            r7 = 0
        L_0x0029:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0124
            java.lang.Object r6 = r10.next()
            int r9 = r7 + 1
            if (r7 >= 0) goto L_0x003f
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x003f:
            X.JwH r6 = (X.C61079JwH) r6
            java.lang.String r1 = r6.A02
            X.DfA r0 = new X.DfA
            r0.<init>((java.lang.CharSequence) r1)
            r8.add(r0)
            java.lang.Object r0 = r6.A01
            int r1 = X.AnonymousClass7TE.A0M(r0)
            r5 = 0
            r0 = 2
            if (r1 == r0) goto L_0x00ac
            r0 = 1
            if (r1 == r0) goto L_0x007b
            r0 = 0
            if (r1 != r0) goto L_0x010c
            java.lang.Object r4 = r6.A00
            java.util.List r4 = (java.util.List) r4
            java.util.ArrayList r3 = X.AnonymousClass7TG.A0r(r4)
            java.util.Iterator r2 = r4.iterator()
        L_0x0067:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00dc
            java.lang.Object r0 = r2.next()
            X.Dgg r0 = (X.C46539Dgg) r0
            java.lang.String r1 = r0.A01
            java.lang.String r0 = r0.A02
            X.DbV.A1V(r1, r0, r3)
            goto L_0x0067
        L_0x007b:
            java.lang.Object r0 = r6.A00
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r5 = r0.iterator()
        L_0x0083:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x010c
            java.lang.Object r4 = r5.next()
            X.Dgg r4 = (X.C46539Dgg) r4
            boolean r3 = r4.A03
            if (r3 == 0) goto L_0x009a
            X.F21 r0 = r11.A00
            if (r0 == 0) goto L_0x009a
            r0.A00(r6, r4, r3)
        L_0x009a:
            java.lang.String r2 = r4.A02
            r0 = 8
            X.FQP r1 = new X.FQP
            r1.<init>((int) r0, (java.lang.Object) r6, (java.lang.Object) r4, (java.lang.Object) r11)
            X.PR8 r0 = new X.PR8
            r0.<init>(r1, r2, r3)
            r8.add(r0)
            goto L_0x0083
        L_0x00ac:
            java.lang.Object r0 = r6.A00
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r5 = r0.iterator()
        L_0x00b4:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x010c
            java.lang.Object r4 = r5.next()
            X.Dgg r4 = (X.C46539Dgg) r4
            boolean r3 = r4.A03
            if (r3 == 0) goto L_0x00cb
            X.F21 r0 = r11.A00
            if (r0 == 0) goto L_0x00cb
            r0.A00(r6, r4, r3)
        L_0x00cb:
            java.lang.String r2 = r4.A02
            r0 = 7
            X.FQP r1 = new X.FQP
            r1.<init>((int) r0, (java.lang.Object) r6, (java.lang.Object) r4, (java.lang.Object) r11)
            X.PR9 r0 = new X.PR9
            r0.<init>((android.widget.CompoundButton.OnCheckedChangeListener) r1, (java.lang.CharSequence) r2, (boolean) r3)
            r8.add(r0)
            goto L_0x00b4
        L_0x00dc:
            java.util.Iterator r1 = r4.iterator()
        L_0x00e0:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0122
            java.lang.Object r2 = r1.next()
            r0 = r2
            X.Dgg r0 = (X.C46539Dgg) r0
            boolean r0 = r0.A03
            if (r0 == 0) goto L_0x00e0
        L_0x00f1:
            X.Dgg r2 = (X.C46539Dgg) r2
            if (r2 == 0) goto L_0x0102
            X.F21 r1 = r11.A00
            if (r1 == 0) goto L_0x00fe
            boolean r0 = r2.A03
            r1.A00(r6, r2, r0)
        L_0x00fe:
            java.lang.String r1 = r2.A01
            if (r1 != 0) goto L_0x0104
        L_0x0102:
            java.lang.String r1 = "NONE"
        L_0x0104:
            X.FQW r0 = new X.FQW
            r0.<init>(r6, r11, r3)
            X.DbU.A1F(r0, r1, r8, r3)
        L_0x010c:
            X.DdJ r0 = r11.A01
            if (r0 == 0) goto L_0x011d
            java.util.List r0 = r0.A01
            int r0 = r0.size()
            int r0 = r0 + -1
            if (r7 != r0) goto L_0x011d
        L_0x011a:
            r7 = r9
            goto L_0x0029
        L_0x011d:
            r0 = 1
            X.DbV.A1W(r8, r0)
            goto L_0x011a
        L_0x0122:
            r2 = r5
            goto L_0x00f1
        L_0x0124:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ERZ.A00():java.util.ArrayList");
    }

    public final String getModuleName() {
        return this.A03;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-585240065);
        super.onResume();
        setItems(A00());
        AnonymousClass0fD.A09(1706676334, A022);
    }
}
