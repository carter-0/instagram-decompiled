package X;

import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.ReelViewerConfig;
import java.util.List;

public final class FkX implements AnonymousClass6WJ {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ RecyclerView A03;
    public final /* synthetic */ AnonymousClass3BQ A04;
    public final /* synthetic */ C230212pD A05;
    public final /* synthetic */ AnonymousClass3K2 A06;
    public final /* synthetic */ AnonymousClass3N2 A07;
    public final /* synthetic */ Integer A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ List A0B;
    public final /* synthetic */ boolean A0C;
    public final /* synthetic */ boolean A0D;

    public FkX(RecyclerView recyclerView, AnonymousClass3BQ r2, C230212pD r3, AnonymousClass3K2 r4, AnonymousClass3N2 r5, Integer num, String str, String str2, List list, float f, int i, long j, boolean z, boolean z2) {
        this.A05 = r3;
        this.A0B = list;
        this.A04 = r2;
        this.A09 = str;
        this.A08 = num;
        this.A02 = j;
        this.A0C = z;
        this.A00 = f;
        this.A0A = str2;
        this.A01 = i;
        this.A03 = recyclerView;
        this.A0D = z2;
        this.A07 = r5;
        this.A06 = r4;
    }

    public final void DaE(float f) {
        ((C241103Nw) this.A07).CLE();
    }

    public final void Dfo(String str) {
        C230212pD r9 = this.A05;
        C227812jx r6 = r9.A03;
        if (!r6.isResumed()) {
            onCancel();
            return;
        }
        if (r9.A00 == null) {
            UserSession userSession = r9.A04;
            1OP r0 = 1OP.$redex_init_class;
            0qQ.A0B(userSession, 0);
            r9.A00 = new C315656kI(userSession);
        }
        C309416Ye A0i = DbS.A0i();
        List list = this.A0B;
        UserSession userSession2 = r9.A04;
        A0i.A02(userSession2, str, list);
        AnonymousClass3BQ r8 = this.A04;
        A0i.A03(r8);
        A0i.A08(r9.A07.A04);
        A0i.A0F = this.A09;
        A0i.A08 = this.A08;
        A0i.A01(userSession2);
        C317766nn r02 = r9.A00;
        0qQ.A0A(r02);
        A0i.A06(r02.A02);
        A0i.A01 = this.A02;
        A0i.A0d = this.A0C;
        A0i.A07 = Float.valueOf(this.A00);
        A0i.A0I = this.A0A;
        int i = this.A01;
        if (i != -1) {
            A0i.A04(Integer.valueOf(i));
        }
        RecyclerView recyclerView = this.A03;
        if (recyclerView != null) {
            C14513TxZ txZ = new C14513TxZ(r6.requireActivity(), recyclerView, r6, userSession2, r8, r9, this.A0D);
            r9.A01 = txZ;
            A0i.A07(txZ.A03);
            A0i.A05(this.A06.A0x);
            A0i.A03 = ReelViewerConfig.A00();
            DbU.A1K(r6, AnonymousClass6W8.A01(r6.requireActivity(), A0i.A00(), userSession2));
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void onCancel() {
        ((C241103Nw) this.A07).Eu3(this.A05.A03);
    }
}
