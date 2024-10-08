package X;

import com.instagram.ui.widget.searchedittext.SearchEditText;

public final class PRP implements AnonymousClass8Z4 {
    public final int A00;
    public final Object A01;

    public PRP(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002e, code lost:
        r1 = (X.C68488NKh) r8.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onSearchSubmitted(com.instagram.ui.widget.searchedittext.SearchEditText r9, java.lang.String r10) {
        /*
            r8 = this;
            int r0 = r8.A00
            switch(r0) {
                case 0: goto L_0x0028;
                case 1: goto L_0x003a;
                case 2: goto L_0x0027;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = 1
            X.0qQ.A0B(r10, r0)
            java.lang.Object r2 = r8.A01
            X.TqX r2 = (X.C14137TqX) r2
            com.instagram.ui.widget.searchedittext.SearchEditText r0 = r2.A06
            r1 = 0
            if (r0 == 0) goto L_0x0015
            r0.setEndEmojiButtonEnabled(r1)
        L_0x0015:
            int r0 = r10.length()
            if (r0 != 0) goto L_0x001c
            r1 = 1
        L_0x001c:
            java.lang.String r0 = "keyboard"
            if (r1 == 0) goto L_0x0024
            java.lang.String r10 = r2.A08
            if (r10 == 0) goto L_0x0027
        L_0x0024:
            X.C14137TqX.A05(r2, r10, r0)
        L_0x0027:
            return
        L_0x0028:
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x0027
            java.lang.Object r1 = r8.A01
            X.NKh r1 = (X.C68488NKh) r1
            X.Pwd r0 = r1.A04
            if (r0 == 0) goto L_0x0027
            X.C74544Pwd.A00(r1, r0, r10)
            return
        L_0x003a:
            r0 = 1
            X.0qQ.A0B(r10, r0)
            java.lang.Object r4 = r8.A01
            X.NJA r4 = (X.NJA) r4
            androidx.fragment.app.FragmentActivity r3 = r4.requireActivity()
            r4.A00()
            X.0eM r0 = r4.A09
            java.lang.Object r7 = X.AnonymousClass7TE.A14(r0)
            X.OyM r7 = (X.C72200OyM) r7
            java.lang.String r6 = r4.A05
            java.lang.String r5 = "threadType"
            if (r6 == 0) goto L_0x0087
            java.lang.String r0 = r7.A00
            if (r0 == 0) goto L_0x007d
            X.0wc r1 = r7.A04
            java.lang.String r0 = "direct_message_search_clicked"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x007d
            java.lang.String r1 = r7.A00
            java.lang.String r0 = "message_search_session_id"
            r2.AAJ(r0, r1)
            java.lang.String r0 = "query_string"
            r2.AAJ(r0, r10)
            java.lang.String r0 = "thread_type"
            r2.AAJ(r0, r6)
            r2.Cgf()
        L_0x007d:
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            java.lang.String r1 = r4.A03
            if (r1 != 0) goto L_0x008f
            java.lang.String r5 = "threadId"
        L_0x0087:
            X.0qQ.A0F(r5)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x008f:
            java.lang.String r0 = "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_ID"
            r2.putString(r0, r1)
            java.lang.String r1 = r4.A04
            if (r1 != 0) goto L_0x009b
            java.lang.String r5 = "threadName"
            goto L_0x0087
        L_0x009b:
            java.lang.String r0 = "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_NAME"
            r2.putString(r0, r1)
            java.lang.String r0 = "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_QUERY"
            r2.putString(r0, r10)
            java.lang.String r1 = r4.A05
            if (r1 == 0) goto L_0x0087
            java.lang.String r0 = "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_TYPE"
            r2.putString(r0, r1)
            java.lang.String r1 = r4.A00
            java.lang.String r0 = "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_CUTOVER_OPEN_THREAD_ID"
            r2.putString(r0, r1)
            java.lang.String r1 = r4.A01
            if (r1 != 0) goto L_0x00bc
            java.lang.String r5 = "threadCategory"
            goto L_0x0087
        L_0x00bc:
            java.lang.String r0 = "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_CATEGORY"
            r2.putString(r0, r1)
            java.util.List r0 = r4.A06
            if (r0 == 0) goto L_0x00ce
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1D(r0)
            java.lang.String r0 = "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_PENDING_RECIPIENTS"
            r2.putParcelableArrayList(r0, r1)
        L_0x00ce:
            java.lang.String r1 = r4.A02
            java.lang.String r0 = "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_FBID"
            r2.putString(r0, r1)
            X.0eM r0 = r4.A0A
            X.0lg r1 = X.DbT.A0X(r0)
            java.lang.String r0 = "direct_message_search_message_list_fragment"
            X.DbY.A0u(r3, r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PRP.onSearchSubmitted(com.instagram.ui.widget.searchedittext.SearchEditText, java.lang.String):void");
    }

    public final void onSearchTextChanged(SearchEditText searchEditText, CharSequence charSequence, int i, int i2, int i3) {
        C52570GXv gXv;
        Integer num;
        String str;
        switch (this.A00) {
            case 0:
                C68488NKh nKh = (C68488NKh) this.A01;
                if (182.A06(0Tu.A05, nKh.getSession(), 36324720265802013L)) {
                    nKh.A0L.A01(charSequence.toString());
                    return;
                }
                return;
            case 1:
                return;
            case 2:
                0qQ.A0B(charSequence, 1);
                ((NdC) ((C68468NJg) this.A01).A07.getValue()).A0S(charSequence.toString());
                return;
            default:
                0qQ.A0B(searchEditText, 0);
                C14137TqX tqX = (C14137TqX) this.A01;
                String A012 = 0mp.A01(searchEditText.getTextForSearch());
                if (A012 == null) {
                    A012 = "";
                }
                tqX.A0A = A012;
                tqX.A0K();
                if (tqX.A0F || AnonymousClass7TF.A1Z(tqX.A0r)) {
                    if (searchEditText.A0P) {
                        gXv = tqX.A04;
                        if (gXv != null) {
                            num = AnonymousClass05K.A01;
                            str = tqX.A09;
                            if (str == null) {
                                throw AnonymousClass7TE.A0z("Required value was null.");
                            }
                            gXv.A01(num, str, searchEditText.getSearchString(), "");
                            return;
                        }
                    } else if (searchEditText.A0L) {
                        gXv = tqX.A04;
                        if (gXv != null) {
                            num = AnonymousClass05K.A00;
                            str = tqX.A09;
                            if (str == null) {
                                throw AnonymousClass7TE.A0z("Required value was null.");
                            }
                            gXv.A01(num, str, searchEditText.getSearchString(), "");
                            return;
                        }
                    } else {
                        return;
                    }
                    0qQ.A0F("metaSearchViewpointHelper");
                    throw AnonymousClass00P.createAndThrow();
                }
                return;
        }
    }
}
