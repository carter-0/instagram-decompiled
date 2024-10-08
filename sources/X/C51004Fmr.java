package X;

import com.instagram.ui.widget.searchedittext.SearchEditText;
import com.instagram.ui.widget.typeahead.TypeaheadHeader;

/* renamed from: X.Fmr  reason: case insensitive filesystem */
public final class C51004Fmr implements AnonymousClass8Z4 {
    public final int A00;
    public final Object A01;

    public C51004Fmr(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onSearchSubmitted(SearchEditText searchEditText, String str) {
        SearchEditText searchEditText2;
        switch (this.A00) {
            case 0:
                E6U e6u = (E6U) this.A01;
                C47578E8q e8q = e6u.A00;
                e8q.A02.clear();
                C47578E8q.A00(e8q);
                e6u.A05 = str;
                e6u.A0c(str);
                searchEditText2 = e6u.A04;
                break;
            case 1:
                K5H k5h = (K5H) this.A01;
                k5h.A0C(searchEditText.getSearchString());
                searchEditText2 = k5h.A0J;
                if (searchEditText2 == null) {
                    return;
                }
                break;
            case 3:
                C50915Fku fku = (C50915Fku) this.A01;
                fku.A03.Dhk(fku.A01);
                return;
            case 7:
                0qQ.A0B(str, 1);
                TypeaheadHeader typeaheadHeader = (TypeaheadHeader) this.A01;
                G7N g7n = typeaheadHeader.A01;
                String A012 = 0mp.A01(str);
                if (!(A012 == null || g7n == null)) {
                    g7n.searchTextChanged(A012);
                }
                searchEditText2 = typeaheadHeader.A00;
                if (searchEditText2 == null) {
                    0qQ.A0F("searchEditText");
                    throw AnonymousClass00P.createAndThrow();
                }
                break;
            default:
                return;
        }
        searchEditText2.A04();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a4, code lost:
        if (r2.length() == 0) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ad, code lost:
        if (r6 == null) goto L_0x00af;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onSearchTextChanged(com.instagram.ui.widget.searchedittext.SearchEditText r12, java.lang.CharSequence r13, int r14, int r15, int r16) {
        /*
            r11 = this;
            int r0 = r11.A00
            switch(r0) {
                case 0: goto L_0x0158;
                case 1: goto L_0x0055;
                case 2: goto L_0x0134;
                case 3: goto L_0x001f;
                case 4: goto L_0x011a;
                case 5: goto L_0x0089;
                case 6: goto L_0x007d;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = 0
            X.0qQ.A0B(r12, r0)
            java.lang.Object r0 = r11.A01
            com.instagram.ui.widget.typeahead.TypeaheadHeader r0 = (com.instagram.ui.widget.typeahead.TypeaheadHeader) r0
            X.G7N r1 = r0.A01
            java.lang.String r0 = r12.getSearchString()
            java.lang.String r0 = X.0mp.A01(r0)
            if (r0 == 0) goto L_0x001e
            if (r1 == 0) goto L_0x001e
            r1.searchTextChanged(r0)
        L_0x001e:
            return
        L_0x001f:
            r0 = 0
            X.0qQ.A0B(r12, r0)
            java.lang.CharSequence r0 = r12.getTextForSearch()
            java.lang.String r2 = X.0mp.A01(r0)
            if (r2 != 0) goto L_0x002f
            java.lang.String r2 = ""
        L_0x002f:
            java.lang.Object r1 = r11.A01
            X.Fku r1 = (X.C50915Fku) r1
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x0045
            int r0 = r2.length()
            if (r0 <= 0) goto L_0x0045
            X.G7k r0 = r1.A03
            r0.DFx()
            r0 = 1
            r1.A02 = r0
        L_0x0045:
            java.lang.String r0 = r1.A01
            boolean r0 = X.0qQ.A0K(r0, r2)
            if (r0 != 0) goto L_0x001e
            r1.A01 = r2
            X.G7k r0 = r1.A03
            r0.Dhm(r2)
            return
        L_0x0055:
            java.lang.String r4 = r12.getSearchString()
            java.lang.Object r3 = r11.A01
            X.K5H r3 = (X.K5H) r3
            r3.A0C(r4)
            com.instagram.common.ui.base.IgTextView r0 = r3.A0C
            if (r0 == 0) goto L_0x001e
            boolean r0 = r3.A0N
            if (r0 == 0) goto L_0x0170
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x0170
            com.instagram.common.ui.base.IgTextView r2 = r3.A0C
            r0 = 2131976203(0x7f13600b, float:1.958952E38)
            r1 = 0
            X.DbX.A1F(r2, r3, r4, r0)
            com.instagram.common.ui.base.IgTextView r0 = r3.A0C
            r0.setVisibility(r1)
            return
        L_0x007d:
            r0 = 1
            X.0qQ.A0B(r13, r0)
            java.lang.Object r0 = r11.A01
            X.E0M r0 = (X.E0M) r0
            X.0eM r0 = r0.A00
            goto L_0x0124
        L_0x0089:
            r0 = 1
            X.0qQ.A0B(r13, r0)
            java.lang.Object r0 = r11.A01
            X.E2e r0 = (X.C47432E2e) r0
            X.0eM r0 = r0.A01
            java.lang.Object r7 = r0.getValue()
            X.JfY r7 = (X.C60092JfY) r7
            java.lang.String r2 = X.0mp.A01(r13)
            if (r2 == 0) goto L_0x00a6
            int r1 = r2.length()
            r0 = 0
            if (r1 != 0) goto L_0x00a7
        L_0x00a6:
            r0 = 1
        L_0x00a7:
            java.lang.String r1 = "languages"
            if (r0 == 0) goto L_0x00b7
            java.util.List r6 = r7.A00
            if (r6 != 0) goto L_0x010f
        L_0x00af:
            X.0qQ.A0F(r1)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00b7:
            java.util.Locale r8 = r7.A02
            java.lang.String r5 = X.DbT.A12(r8, r2)
            java.util.List r0 = r7.A00
            if (r0 == 0) goto L_0x00af
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r10 = r0.iterator()
        L_0x00c9:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x010f
            java.lang.Object r4 = r10.next()
            r0 = r4
            X.JwK r0 = (X.C61082JwK) r0
            java.lang.Object r2 = r0.A00
            X.Dtz r2 = (X.C47271Dtz) r2
            android.app.Application r1 = r7.A0D()
            java.lang.String r0 = r2.A02
            java.lang.String r9 = X.DbT.A12(r8, r0)
            int r0 = r2.A01
            java.lang.String r0 = X.AnonymousClass7TE.A16(r1, r0)
            java.lang.String r3 = X.DbT.A12(r8, r0)
            int r0 = r2.A00
            java.lang.String r0 = X.AnonymousClass7TE.A16(r1, r0)
            java.lang.String r2 = X.DbT.A12(r8, r0)
            r1 = 0
            boolean r0 = X.00l.A0d(r9, r5, r1)
            if (r0 != 0) goto L_0x010b
            boolean r0 = X.00l.A0d(r3, r5, r1)
            if (r0 != 0) goto L_0x010b
            boolean r0 = X.00l.A0d(r2, r5, r1)
            if (r0 == 0) goto L_0x00c9
        L_0x010b:
            r6.add(r4)
            goto L_0x00c9
        L_0x010f:
            X.05G r1 = r7.A05
            X.JzQ r0 = new X.JzQ
            r0.<init>(r6)
            r1.Epw(r0)
            return
        L_0x011a:
            r0 = 1
            X.0qQ.A0B(r13, r0)
            java.lang.Object r0 = r11.A01
            X.E2d r0 = (X.C47431E2d) r0
            X.0eM r0 = r0.A02
        L_0x0124:
            java.lang.Object r0 = r0.getValue()
            X.DkK r0 = (X.C46731DkK) r0
            java.lang.String r1 = X.0mp.A01(r13)
            X.05G r0 = r0.A05
            r0.Epw(r1)
            return
        L_0x0134:
            r0 = 0
            X.0qQ.A0B(r12, r0)
            java.lang.Object r0 = r11.A01
            X.FbW r0 = (X.C50423FbW) r0
            X.FPM r3 = r0.A06
            java.lang.CharSequence r0 = r12.getStrippedText()
            java.lang.String r2 = r0.toString()
            java.lang.Object r0 = r12.getTag()
            boolean r1 = X.DbW.A1a(r0)
            java.lang.Object r0 = r3.A01
            X.FEq r0 = (X.C49916FEq) r0
            X.G99 r0 = r0.A05
            r0.Dhx(r2, r1)
            return
        L_0x0158:
            java.lang.String r3 = r12.getSearchString()
            java.lang.Object r2 = r11.A01
            X.E6U r2 = (X.E6U) r2
            X.E8q r1 = r2.A00
            java.util.List r0 = r1.A02
            r0.clear()
            X.C47578E8q.A00(r1)
            r2.A05 = r3
            r2.A0c(r3)
            return
        L_0x0170:
            com.instagram.common.ui.base.IgTextView r1 = r3.A0C
            r0 = 8
            r1.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51004Fmr.onSearchTextChanged(com.instagram.ui.widget.searchedittext.SearchEditText, java.lang.CharSequence, int, int, int):void");
    }
}
