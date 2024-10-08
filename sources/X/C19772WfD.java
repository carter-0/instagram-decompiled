package X;

import com.instagram.ui.widget.searchedittext.SearchEditText;

/* renamed from: X.WfD  reason: case insensitive filesystem */
public final class C19772WfD implements AnonymousClass8Z4 {
    public boolean A00;
    public final AnonymousClass9PD A01 = new AnonymousClass9PD();
    public final X4Y A02 = new C19539WbP(this);
    public final /* synthetic */ C15669Uga A03;
    public final /* synthetic */ C307786Rm A04;
    public final /* synthetic */ SearchEditText A05;

    public final void onSearchSubmitted(SearchEditText searchEditText, String str) {
        0qQ.A0B(str, 1);
        if (C51966G9m.A1X(str)) {
            C15669Uga uga = this.A03;
            if (!uga.A00) {
                C15669Uga.A00(uga, str);
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x000e: MOVE  (r3v1 com.instagram.common.session.UserSession) = (r3v0 com.instagram.common.session.UserSession)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final void onSearchTextChanged(com.instagram.ui.widget.searchedittext.SearchEditText r11, java.lang.CharSequence r12, int r13, int r14, int r15) {
        /*
            r10 = this;
            r2 = 0
            X.0qQ.A0B(r11, r2)
            X.6Rm r0 = r10.A04
            X.0lg r3 = X.C308206Td.A0A(r0)
            boolean r0 = r3 instanceof com.instagram.common.session.UserSession
            if (r0 == 0) goto L_0x003c
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            if (r3 == 0) goto L_0x003c
            java.lang.String r4 = r11.getSearchString()
            X.0eM r0 = X.0mp.A09
            if (r4 == 0) goto L_0x003c
            int r1 = r4.length()
            r0 = 2
            if (r1 < r0) goto L_0x003c
            r6 = 0
            r9 = 1
            java.lang.String r5 = "meta_ai_qp"
            java.lang.String r8 = "fbsearch/keyword_typeahead/"
            r7 = r6
            X.1OC r1 = X.C14501TxN.A00(r3, r4, r5, r6, r7, r8, r9)
            X.NM2 r0 = new X.NM2
            r0.<init>(r4, r10, r2)
            r1.A00 = r0
            r0 = 879992394(0x34739e4a, float:2.2688724E-7)
            X.1ES.A05(r1, r0, r9, r9, r9)
            A00(r10)
        L_0x003c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19772WfD.onSearchTextChanged(com.instagram.ui.widget.searchedittext.SearchEditText, java.lang.CharSequence, int, int, int):void");
    }

    public C19772WfD(C15669Uga uga, C307786Rm r3, SearchEditText searchEditText) {
        this.A03 = uga;
        this.A04 = r3;
        this.A05 = searchEditText;
    }

    public static final void A00(C19772WfD wfD) {
        X4Y x4y = wfD.A02;
        SearchEditText searchEditText = wfD.A05;
        Boolean CXV = x4y.CXV(searchEditText.getSearchString());
        C15669Uga uga = wfD.A03;
        String searchString = searchEditText.getSearchString();
        AnonymousClass0eM r0 = 0mp.A09;
        int A052 = DbX.A05(searchString);
        boolean z = false;
        if (A052 > 2 && (CXV == null ? !wfD.A00 : CXV.equals(false))) {
            z = true;
        }
        uga.A00 = z;
        searchEditText.setDisableButtonsForIntegrity(z);
    }
}
