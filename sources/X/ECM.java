package X;

import android.view.ViewGroup;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.android.R;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public final class ECM extends 1P0 {
    public final /* synthetic */ E7Q A00;

    public ECM(E7Q e7q) {
        this.A00 = e7q;
    }

    public final void onFail(C268654dm r6) {
        int A0D = AnonymousClass7TG.A0D(r6, -2060826200);
        ECM.super.onFail(r6);
        E7Q e7q = this.A00;
        C47290DuJ duJ = e7q.A07;
        if (duJ != null) {
            duJ.A0E("fetch_request_fail");
            C47290DuJ duJ2 = e7q.A07;
            if (duJ2 != null) {
                duJ2.A00.A01();
                e7q.updateUi(JXP.ERROR, 0sn.A00);
                E7Q.A06(e7q);
                E7Q.A05(e7q);
                E7Q.A07(e7q);
                AnonymousClass0fD.A0A(-1525074910, A0D);
                return;
            }
        }
        0qQ.A0F("perfLogger");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onStart() {
        String str;
        int A03 = AnonymousClass0fD.A03(1390665435);
        ECM.super.onStart();
        E7Q e7q = this.A00;
        if (e7q.A0E) {
            ArrayList A1C = AnonymousClass7TE.A1C();
            int i = 1;
            do {
                A1C.add(new C47231DtI());
                i++;
            } while (i < 11);
            e7q.A0B(A1C);
            ShimmerFrameLayout shimmerFrameLayout = e7q.A03;
            if (shimmerFrameLayout == null) {
                str = "searchBarContainer";
            } else {
                shimmerFrameLayout.A02();
                ViewGroup viewGroup = e7q.A00;
                if (viewGroup == null) {
                    str = "searchBar";
                } else {
                    DbU.A11(e7q.requireContext(), viewGroup, R.drawable.searchbar_background_placeholder);
                    ShimmerFrameLayout shimmerFrameLayout2 = e7q.A02;
                    if (shimmerFrameLayout2 == null) {
                        str = "progressContainer";
                    } else {
                        shimmerFrameLayout2.A02();
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        e7q.updateUi(JXP.LOADING, 0sn.A00);
        AnonymousClass0fD.A0A(-1972129247, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C47192Dse dse;
        C47163Dre dre;
        List list;
        N5K n5k;
        List list2;
        ArrayList arrayList;
        int A03 = AnonymousClass0fD.A03(-940404409);
        C43821CEn cEn = (C43821CEn) obj;
        int A032 = AnonymousClass0fD.A03(-2139913836);
        0qQ.A0B(cEn, 0);
        ECM.super.onSuccess(cEn);
        E7Q e7q = this.A00;
        E7Q.A06(e7q);
        E7Q.A05(e7q);
        C47290DuJ duJ = e7q.A07;
        if (duJ != null) {
            duJ.A0E("get_users_end");
            C47290DuJ duJ2 = e7q.A07;
            if (duJ2 != null) {
                duJ2.A0E("fetch_request_end");
                C47144DrL A002 = cEn.FH3();
                1E4.A00(AnonymousClass7TE.A0l(e7q.A0R));
                List list3 = A002.A00;
                if (!(list3 == null || (dse = (C47192Dse) list3.get(0)) == null || (dre = dse.A00) == null || (list = dre.A01) == null || (n5k = (N5K) list.get(0)) == null || (list2 = n5k.A00) == null)) {
                    E7Q.A08(e7q, list2);
                    C47290DuJ duJ3 = e7q.A07;
                    if (duJ3 != null) {
                        duJ3.A0E("ui_render_start");
                        LinkedHashSet linkedHashSet = e7q.A0Q;
                        if (!linkedHashSet.isEmpty()) {
                            arrayList = E7Q.A02(e7q);
                        } else {
                            arrayList = e7q.A0L;
                        }
                        e7q.A0B(arrayList);
                        C47290DuJ duJ4 = e7q.A07;
                        if (duJ4 != null) {
                            duJ4.A0E("ui_render_end");
                            C47290DuJ duJ5 = e7q.A07;
                            if (duJ5 != null) {
                                C46329Dbx.A00(duJ5);
                                ProgressButton progressButton = e7q.A0A;
                                if (progressButton != null) {
                                    progressButton.setEnabled(AnonymousClass7TF.A1R(e7q.A0O.size() + linkedHashSet.size()));
                                }
                                E7Q.A07(e7q);
                            }
                        }
                    }
                }
                AnonymousClass0fD.A0A(-163017619, A032);
                AnonymousClass0fD.A0A(-1096422341, A03);
                return;
            }
        }
        0qQ.A0F("perfLogger");
        throw AnonymousClass00P.createAndThrow();
    }
}
