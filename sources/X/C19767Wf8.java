package X;

import com.instagram.ui.widget.searchedittext.SearchEditText;

/* renamed from: X.Wf8  reason: case insensitive filesystem */
public final class C19767Wf8 implements X5H {
    public final /* synthetic */ C14137TqX A00;
    public final /* synthetic */ SearchEditText A01;

    public C19767Wf8(C14137TqX tqX, SearchEditText searchEditText) {
        this.A00 = tqX;
        this.A01 = searchEditText;
    }

    public final void DRy() {
        int i;
        String str;
        C14137TqX tqX = this.A00;
        0wc r6 = (0wc) tqX.A0j.getValue();
        String A0a = DbY.A0a();
        String str2 = tqX.A09;
        if (str2 != null) {
            C14428Tvx.A01(r6, A0a, str2, tqX.A0A, "");
            if (this.A01.getSearchString().length() == 0) {
                i = 632;
            } else {
                i = 635;
            }
            String A002 = C273654mx.A00(i);
            C14437TwL twL = (C14437TwL) tqX.A0h.getValue();
            String str3 = tqX.A01.A01;
            if (!C51966G9m.A1X(str3) || !tqX.A0J) {
                str = null;
            } else {
                str = tqX.A01.A01;
            }
            twL.A0A(A002, str3, str, (String) null);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
