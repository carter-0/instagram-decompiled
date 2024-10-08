package X;

import android.widget.TextView;
import java.util.ArrayList;

/* renamed from: X.GvY  reason: case insensitive filesystem */
public final class C53867GvY extends C251343mx {
    public final C52706GbJ A00;
    public final int A01;
    public final TextView.OnEditorActionListener A02;
    public final 2WX A03;
    public final C52734Gbl A04;
    public final HNO A05;
    public final C55551HjX A06;
    public final CharSequence A07 = "";
    public final CharSequence A08;
    public final C62320sa A09;
    public final C62320sa A0A;
    public final boolean A0B;

    public C53867GvY(TextView.OnEditorActionListener onEditorActionListener, 2WX r3, C52706GbJ gbJ, C52734Gbl gbl, HNO hno, C55551HjX hjX, CharSequence charSequence, C62320sa r9, C62320sa r10, int i, boolean z) {
        AnonymousClass7TG.A1O(charSequence, gbJ);
        this.A08 = charSequence;
        this.A00 = gbJ;
        this.A01 = i;
        this.A0B = z;
        this.A0A = r9;
        this.A09 = r10;
        this.A04 = gbl;
        this.A02 = onEditorActionListener;
        this.A06 = hjX;
        this.A03 = r3;
        this.A05 = hno;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r37) {
        C58708IwH A012;
        C57555Ich ich;
        Integer num;
        Integer num2;
        AnonymousClass3Y5 r10 = r37;
        C59535JNh A002 = I3I.A00(r10);
        boolean CRB = A002.CRB();
        JSK A003 = I41.A00(A002);
        boolean z = this.A0B;
        if (!z) {
            A012 = null;
        } else {
            A012 = C58708IwH.A01(this, 32);
        }
        C55551HjX hjX = this.A06;
        if (hjX == null) {
            ich = null;
        } else if (A003.EIa(hjX.A00)) {
            C54561HIw hIw = (C54561HIw) hjX;
            HNN hnn = hIw.A00;
            int EIY = A003.EIY(hIw.A02, CRB);
            int EIY2 = A003.EIY(hIw.A01, CRB);
            int EIZ = A003.EIZ(hIw.A03);
            C62320sa r8 = hIw.A07;
            HNN hnn2 = hnn;
            ich = new C57555Ich(C54561HIw.A00(A003, hIw), hnn2, Integer.valueOf(EIY2), Integer.valueOf(EIY), hIw.A05, hIw.A06, r8, EIZ, hIw.A08);
        } else {
            ich = null;
        }
        int max = Math.max(this.A01, 1);
        CharSequence charSequence = this.A07;
        CharSequence charSequence2 = this.A08;
        HMP hmp = HMP.CapSentences;
        HNO hno = this.A05;
        Integer num3 = C57546IcY.A08;
        if (hjX != null) {
            num = AnonymousClass05K.A06;
        } else {
            num = num3;
        }
        if (hjX != null) {
            num2 = ((C54561HIw) hjX).A04;
        } else {
            num2 = C57546IcY.A09;
        }
        C57546IcY icY = new C57546IcY(ich, hno, num3, num, num2, max);
        C52706GbJ gbJ = this.A00;
        C62320sa r7 = this.A0A;
        C62320sa r6 = this.A09;
        C52734Gbl gbl = this.A04;
        TextView.OnEditorActionListener onEditorActionListener = this.A02;
        AnonymousClass3XV r13 = this.A03;
        if (r13 == null) {
            r13 = 2WX.A02;
        }
        C53866GvX gvX = new C53866GvX(onEditorActionListener, r13, gbJ, gbl, hmp, icY, charSequence2, charSequence, r7, r6, A012, z);
        if (hjX == null || A003.EIa(hjX.A00)) {
            return gvX;
        }
        C243573Zh r31 = C243573Zh.CENTER;
        2V1 r1 = r10.A05;
        ArrayList A1C = AnonymousClass7TE.A1C();
        0qQ.A0B(r1, 1);
        A1C.add(gvX);
        C54561HIw hIw2 = (C54561HIw) hjX;
        HNN hnn3 = hIw2.A00;
        String str = hIw2.A06;
        A1C.add(new C53854GvL(C54561HIw.A00(A003, hIw2), hnn3, (HNN) null, Integer.valueOf(A003.EIY(hIw2.A01, CRB)), Integer.valueOf(A003.EIY(hIw2.A02, CRB)), str, hIw2.A07, A003.EIZ(hIw2.A03), true));
        return new 2Tp((C243573Zh) null, r31, (C243583Zi) null, (C244343b2) null, A1C, false);
    }
}
