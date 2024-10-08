package X;

import com.instagram.business.fragment.CategorySearchFragment;
import com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment;
import com.instagram.fanclub.memberlist.viewmodel.FanClubMemberListViewModel;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import java.util.ArrayList;
import java.util.List;

public final class Fd1 implements G77 {
    public final int A00;
    public final Object A01;

    public Fd1(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onSearchCleared(String str) {
        switch (this.A00) {
            case 0:
                CategorySearchFragment categorySearchFragment = (CategorySearchFragment) this.A01;
                CategorySearchFragment.A08(categorySearchFragment, "clear_category_search_box", (String) null);
                IgdsInlineSearchBox igdsInlineSearchBox = categorySearchFragment.searchBox;
                if (igdsInlineSearchBox != null) {
                    igdsInlineSearchBox.A0E.setText("");
                }
                CategorySearchFragment.A07(categorySearchFragment);
                return;
            case 7:
                E7T e7t = (E7T) this.A01;
                ((C46777Dl4) e7t.A09.getValue()).A01.A01.Epw(DbV.A12(""));
                e7t.A05 = true;
                return;
            default:
                return;
        }
    }

    public final void onSearchTextChanged(String str) {
        String A12;
        String str2;
        switch (this.A00) {
            case 0:
                return;
            case 1:
                0qQ.A0B(str, 0);
                ((G9Z) this.A01).Dhv(str);
                return;
            case 2:
                0qQ.A0B(str, 0);
                if (str.length() == 0) {
                    A12 = null;
                } else {
                    A12 = DbT.A12(AnonymousClass1Q2.A02(), str);
                }
                F15 f15 = (F15) this.A01;
                C337257fy r0 = f15.A01;
                if (r0 != null) {
                    r0.EhX(A12);
                }
                FRO fro = f15.A00;
                if (fro == null) {
                    str2 = "dataController";
                    break;
                } else {
                    Integer num = AnonymousClass05K.A00;
                    0qQ.A0B(num, 0);
                    fro.A00 = num;
                    return;
                }
            case 3:
                DirectShareSheetFragment directShareSheetFragment = (DirectShareSheetFragment) this.A01;
                DirectShareSheetFragment.A0E(directShareSheetFragment);
                directShareSheetFragment.Dhv(str);
                return;
            case 4:
                0qQ.A0B(str, 0);
                C46826Dm2 dm2 = ((E3M) this.A01).A01;
                if (dm2 == null) {
                    str2 = "adapter";
                    break;
                } else {
                    List list = dm2.A01;
                    ArrayList A1C = AnonymousClass7TE.A1C();
                    for (Object next : list) {
                        if (00l.A0d(((C53374Gn4) next).A03, str, true)) {
                            A1C.add(next);
                        }
                    }
                    dm2.A00 = A1C;
                    dm2.notifyDataSetChanged();
                    return;
                }
            case 5:
                0qQ.A0B(str, 0);
                C50422FbV fbV = (C50422FbV) this.A01;
                FPM fpm = fbV.A01;
                ((C49916FEq) fpm.A01).A05.Dhx(str, DbW.A1a(fbV.A03.getTag()));
                return;
            case 6:
                0qQ.A0B(str, 0);
                int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                FanClubMemberListViewModel fanClubMemberListViewModel = (FanClubMemberListViewModel) ((C46965DoJ) this.A01).A01.A02.getValue();
                fanClubMemberListViewModel.A0G.Epw(str);
                fanClubMemberListViewModel.A06.A01(str);
                return;
            case 7:
                0qQ.A0B(str, 0);
                E7T e7t = (E7T) this.A01;
                ((C46777Dl4) e7t.A09.getValue()).A01.A01.Epw(DbV.A12(str));
                e7t.A05 = true;
                return;
            case 8:
                0qQ.A0B(str, 0);
                C46763Dkq dkq = (C46763Dkq) ((E4F) this.A01).A05.getValue();
                String A012 = 0mp.A01(str);
                dkq.A00 = A012;
                if (A012 == null || 00l.A0W(A012)) {
                    dkq.A05.A02();
                    return;
                }
                C14221Ts1 ts1 = dkq.A05;
                if (ts1.A06.BiX(A012).A06 != null) {
                    Dba.A1S(dkq, C318116oQ.A00(dkq), 34, true);
                    return;
                } else {
                    ts1.A06(A012);
                    return;
                }
            default:
                0qQ.A0B(str, 0);
                C337257fy r1 = ((C47505E5n) this.A01).A08;
                if (r1 == null) {
                    str2 = "searchResultsProvider";
                    break;
                } else {
                    r1.EhX(0mp.A01(str));
                    return;
                }
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }
}
