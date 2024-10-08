package X;

import com.instagram.android.R;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import com.instagram.save.model.SavedCollection;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.HrA  reason: case insensitive filesystem */
public final class C56004HrA {
    public final AnonymousClass2t9 A00;
    public final AnonymousClass4DH A01;
    public final UserSession A02;
    public final C229122ms A03;
    public final Integer A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    /* JADX WARNING: type inference failed for: r0v10, types: [X.2tL, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v15, types: [X.2tL, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v17, types: [X.2tL, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v18, types: [X.2tL, java.lang.Object] */
    public final void A00(1Xj r19, List list) {
        List<SavedCollection> list2 = list;
        0qQ.A0B(list2, 0);
        ViewModelListUpdate viewModelListUpdate = new ViewModelListUpdate();
        if (this.A07) {
            viewModelListUpdate.A00(new Object());
            viewModelListUpdate.A00(new IOZ((SavedCollection) null, this.A05, false, false, true));
        }
        if (this.A08) {
            viewModelListUpdate.A00(new Object());
        }
        Integer num = this.A04;
        Integer num2 = AnonymousClass05K.A01;
        boolean A1W = AnonymousClass7TF.A1W(num, num2);
        0xa r9 = AnonymousClass4k9.A00(this.A02).A00;
        boolean A1T = AnonymousClass7TF.A1T(r9.getInt("direct_collab_collection_creation_row_impression_count", 0), 4);
        if (A1W && A1T) {
            viewModelListUpdate.A00(new Object());
            AnonymousClass7TG.A0g(r9, "direct_collab_collection_creation_row_impression_count").apply();
        }
        ArrayList A0r = AnonymousClass7TG.A0r(list2);
        for (SavedCollection savedCollection : list2) {
            if (r19 != null) {
                savedCollection.A09 = Boolean.valueOf(r19.A3i().contains(savedCollection.A0F));
            }
            A0r.add(new IOZ(savedCollection, this.A05, AnonymousClass7TF.A1W(num, num2), this.A06, false));
        }
        viewModelListUpdate.A01(A0r);
        C229122ms r3 = this.A03;
        viewModelListUpdate.A00(C14036Toc.A00(r3));
        if (A1W && !A1T && !r3.CKB() && !r3.isLoading()) {
            viewModelListUpdate.A00(new Object());
        }
        this.A00.A05(viewModelListUpdate);
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [X.2tF, java.lang.Object] */
    public C56004HrA(AnonymousClass4DH r4, UserSession userSession, C55477HiL hiL, C55478HiM hiM, C55479HiN hiN, C229122ms r9, Integer num, String str, boolean z, boolean z2, boolean z3) {
        C51974G9v.A1S(str, userSession, hiN, hiM, hiL);
        AnonymousClass7TF.A1G(r9, 7, num);
        this.A01 = r4;
        this.A05 = str;
        this.A02 = userSession;
        this.A03 = r9;
        this.A08 = z;
        this.A04 = num;
        this.A06 = z2;
        this.A07 = z3;
        AnonymousClass2tC A0S = DbV.A0S(r4);
        A0S.A01(new H7B(userSession, hiN));
        A0S.A01(new H76(hiM));
        A0S.A01(new C66610MYw(r9, R.layout.save_to_collection_empty_view));
        A0S.A01(new H75(hiL));
        this.A00 = DbU.A0U(A0S, new Object());
    }
}
