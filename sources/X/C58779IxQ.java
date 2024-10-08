package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.save.model.SavedCollection;

/* renamed from: X.IxQ  reason: case insensitive filesystem */
public final class C58779IxQ extends 0Yg implements 0sP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ H1P A02;
    public final /* synthetic */ 1Xj A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ String A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58779IxQ(FragmentActivity fragmentActivity, H1P h1p, 1Xj r4, Integer num, String str, int i) {
        super(1);
        this.A02 = h1p;
        this.A03 = r4;
        this.A00 = i;
        this.A04 = num;
        this.A01 = fragmentActivity;
        this.A05 = str;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        SavedCollection savedCollection = (SavedCollection) obj;
        0qQ.A0B(savedCollection, 0);
        H1P h1p = this.A02;
        AnonymousClass0eM r4 = h1p.A0M;
        UserSession A0l = AnonymousClass7TE.A0l(r4);
        1Xj r7 = this.A03;
        int i = this.A00;
        Integer num = this.A04;
        I7Q.A07(A0l, r7, savedCollection, num, i);
        FragmentActivity fragmentActivity = this.A01;
        UserSession A0l2 = AnonymousClass7TE.A0l(r4);
        String A0t = DbS.A0t(h1p.A0N);
        String str = h1p.A0E;
        AnonymousClass7TF.A1E(A0l2, 5, str);
        C57273IVi iVi = new C57273IVi(fragmentActivity, A0l2, r7, h1p, savedCollection, A0t, str, i);
        ImageUrl A1Q = r7.A1Q();
        if (A1Q != null) {
            String str2 = savedCollection.A0G;
            String str3 = this.A05;
            boolean A1W = AnonymousClass7TF.A1W(num, AnonymousClass05K.A00);
            h1p.A0A();
            C54665HMw hMw = savedCollection.A07;
            0qQ.A07(hMw);
            I6V.A00(fragmentActivity, A1Q, iVi, hMw, str2, str3, true, A1W, false);
            return C60340gF.A00;
        }
        throw AnonymousClass7TE.A0y();
    }
}
