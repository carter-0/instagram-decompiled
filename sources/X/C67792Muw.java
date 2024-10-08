package X;

import android.content.Context;
import android.view.ViewGroup;
import com.instagram.api.schemas.RIXUCoverSize;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectSearchResharedContent;
import com.instagram.model.direct.DirectSearchResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.Muw  reason: case insensitive filesystem */
public final class C67792Muw extends 2Rw {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Context A04;
    public AnonymousClass0iw A05;
    public UserSession A06;
    public C294875nB A07;
    public C294575mg A08;
    public String A09;
    public String A0A;
    public List A0B;
    public List A0C;
    public List A0D;

    public final void onBindViewHolder(C249703kE r32, int i) {
        C249703kE r5 = r32;
        List list = this.A0C;
        List list2 = this.A0B;
        List list3 = this.A0D;
        C294875nB r11 = this.A07;
        if ((r5 instanceof C297595s1) && r11 != null && list3 != null && list2 != null && !list2.isEmpty()) {
            int i2 = i;
            if (((C267324bN) list2.get(i2)).A02 != null && list != null && !list.isEmpty() && this.A08 != null) {
                r11.DpB(r5.itemView, (C67058MhZ) null, (DirectSearchResult) list3.get(i2), "inbox_search", this.A00, this.A01 + i, i2, this.A02, false);
                C267324bN r13 = (C267324bN) list2.get(i2);
                ArrayList A1D = AnonymousClass7TE.A1D((Collection) list.get(i2));
                r13.A08 = A1D;
                1Xj r1 = ((C267324bN) list2.get(i2)).A02;
                Context context = this.A04;
                UserSession userSession = this.A06;
                AnonymousClass3W1 r3 = new AnonymousClass3W1(r1.A0o(), r1.A4o());
                C229332nD r2 = new C229332nD(userSession, context);
                C297595s1 r18 = (C297595s1) r5;
                C229332nD r19 = r2;
                AnonymousClass3W1 r16 = r3;
                C297575ry.A01(context, (C61074JwC) null, r13, this.A05, userSession, r16, new C68154N2u((DirectSearchResharedContent) list3.get(i2), this.A00, this.A01 + i, i2, this.A03, this.A02), r18, r19, C292805jY.A04, AnonymousClass05K.A00, A1D, false, false);
            }
        }
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        C294575mg r5 = this.A08;
        if (r5 != null) {
            return C297575ry.A00(this.A04, viewGroup, RIXUCoverSize.EXTRA_SMALL, this.A05, this.A06, r5, C292805jY.A04, false, true, false);
        }
        throw AnonymousClass7TE.A0w("Delegate is null");
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(-1870002883);
        int A0H = C51971G9r.A0H(this.A0B);
        AnonymousClass0fD.A0A(20740818, A032);
        return A0H;
    }

    public final int getItemViewType(int i) {
        AnonymousClass0fD.A0A(1455558879, AnonymousClass0fD.A03(-18049669));
        return 1;
    }
}
