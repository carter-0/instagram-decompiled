package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.ui.emptystaterow.EmptyStateView;
import com.instagram.ui.widget.refresh.RefreshableListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Ubj  reason: case insensitive filesystem */
public final class C15384Ubj extends AnonymousClass32G implements AbsListView.OnScrollListener, C21048XBp, C230222pE, CallerContextable {
    public static final CallerContext A08 = CallerContext.A00(C15384Ubj.class);
    public static final String __redex_internal_original_name = "ArchiveLiveFragment";
    public C15467UdI A00;
    public UserSession A01;
    public C324356z9 A02;
    public AnonymousClass32A A03;
    public EmptyStateView A04;
    public String A05;
    public final Map A06 = new LinkedHashMap();
    public final C228172ku A07 = new C228172ku();

    public final /* synthetic */ void DFj(Reel reel, AnonymousClass6UY r2) {
    }

    public final void DVy() {
    }

    public final void DW7() {
    }

    public final String getModuleName() {
        return "archive_live";
    }

    public static void A01(C15384Ubj ubj) {
        C45408Cvo cvo;
        ArrayList arrayList = new ArrayList();
        Iterator A0v = AnonymousClass7TF.A0v(ubj.A06);
        while (A0v.hasNext()) {
            C45408Cvo cvo2 = (C45408Cvo) A0v.next();
            C270194gL r3 = cvo2.A02;
            if (!(r3 == null || r3.A02() == null)) {
                String str = cvo2.A04;
                str.getClass();
                r3.A07 = new C278134wK(str, cvo2.A05);
                arrayList.add(new VXR(cvo2, AnonymousClass05K.A0C));
            }
        }
        C15467UdI udI = ubj.A00;
        UYI uyi = udI.A02;
        uyi.A04();
        Map map = udI.A06;
        map.clear();
        int size = arrayList.size();
        udI.A00 = size;
        if (size > 9) {
            int i = size % 3;
            if (i != 0) {
                int i2 = 3 - i;
                for (int i3 = 0; i3 < i2; i3++) {
                    AnonymousClass2rW.A01(uyi, new VXR((C45408Cvo) null, AnonymousClass05K.A00), uyi.A02.size(), true);
                }
            }
        }
        uyi.A0A(arrayList);
        udI.A06();
        uyi.A06();
        Map map2 = udI.A07;
        map2.clear();
        if (!udI.isEmpty()) {
            udI.A08(udI.A05, (Object) null);
            int A022 = uyi.A02();
            int count = udI.getCount();
            for (int i4 = 0; i4 < A022; i4++) {
                C3251571g A0e = C13989Tnp.A0e(uyi, i4);
                int i5 = i4 + count;
                for (int i6 = 0; i6 < A0e.A01(); i6++) {
                    VXR vxr = (VXR) A0e.A02(i6);
                    if (vxr.A01 == AnonymousClass05K.A0C && (cvo = vxr.A00) != null && !map2.containsKey(cvo.A04)) {
                        C66580MXl.A1T(cvo.A04, map2, i5);
                    }
                }
                AnonymousClass6u8 A0P = C13991Tnr.A0P(AnonymousClass7TF.A0h(A0e), map);
                A0P.A00(i5, AnonymousClass7TF.A1S(i4, A022 - 1));
                udI.A09(udI.A04, new VRG(A0e), A0P);
            }
            udI.A08(udI.A03, (Object) null);
        }
        udI.A07();
        A02(ubj);
    }

    public static void A02(C15384Ubj ubj) {
        EmptyStateView emptyStateView = ubj.A04;
        if (emptyStateView != null) {
            if (ubj.A00.isEmpty()) {
                emptyStateView.A0I();
            } else if (ubj.A02.A03.A03 == AnonymousClass05K.A01) {
                emptyStateView.A0J();
            } else {
                emptyStateView.A0K();
            }
            emptyStateView.A0H();
        }
    }

    public final /* bridge */ /* synthetic */ 0lg A0Y() {
        return this.A01;
    }

    public final void DcC(Reel reel) {
        Map map = this.A06;
        Iterator A0u = AnonymousClass7TF.A0u(map);
        while (true) {
            if (!A0u.hasNext()) {
                break;
            }
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            C45408Cvo cvo = (C45408Cvo) A1J.getValue();
            if (cvo.A02 != null) {
                String id = reel.getId();
                String str = cvo.A02.A0X;
                str.getClass();
                if (id == str) {
                    map.remove(A1J.getKey());
                    break;
                }
            }
        }
        A01(this);
    }

    public final void EKl() {
        0S7.A00(this);
        C17118VIo.A00(this.A04, this);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1289756988);
        C15384Ubj.super.onCreate(bundle);
        this.A01 = DbX.A0U(this);
        this.A05 = AnonymousClass7TF.A0b();
        C15467UdI udI = new C15467UdI(requireContext(), this, this);
        this.A00 = udI;
        A0V(udI);
        C324356z9 A0g = C51970G9q.A0g(requireContext(), requireActivity(), this.A01);
        this.A02 = A0g;
        UserSession userSession = this.A01;
        0qQ.A0B(userSession, 0);
        1NY A0b = AnonymousClass7TG.A0b(userSession);
        A0b.A0A("archive/live/lives_archived/");
        A0g.A03(DbU.A0S(A0b, CGP.class, D0P.class), new C15957UlZ(this, 0));
        AnonymousClass0fD.A09(1815556602, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1353716907);
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.layout_feed);
        AnonymousClass0fD.A09(1626789748, A022);
        return A0C;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1361286393);
        super.onDestroyView();
        this.A04 = null;
        AnonymousClass0fD.A09(-264557344, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(88005977);
        super.onResume();
        EmptyStateView emptyStateView = this.A04;
        if (emptyStateView == null) {
            emptyStateView = C13989Tnp.A0d(this);
            this.A04 = emptyStateView;
        }
        C320156rr r2 = C320156rr.EMPTY;
        emptyStateView.A0T(r2, 2131965149);
        this.A04.A0S(r2, 2131965148);
        this.A04.A0U(r2, "");
        A01(this);
        UserSession userSession = this.A01;
        int i = this.A00.A00;
        0Aj A0e = AnonymousClass7TE.A0e(DbT.A0Q(this, userSession, 0), "ig_live_archive_main_screen_impression");
        A0e.A9F("archive_items_count", Long.valueOf((long) i));
        DbS.A1O(A0e, "archive_live");
        A0e.Cgf();
        AnonymousClass0fD.A09(493101032, A022);
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int A032 = AnonymousClass0fD.A03(1458205281);
        this.A07.onScroll(absListView, i, i2, i3);
        AnonymousClass0fD.A0A(-694897865, A032);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int A032 = AnonymousClass0fD.A03(-1063039862);
        this.A07.onScrollStateChanged(absListView, i);
        AnonymousClass0fD.A0A(-1333736770, A032);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        0S7.A00(this);
        this.A04 = (EmptyStateView) this.A04.getEmptyView();
        0S7.A00(this);
        RefreshableListView refreshableListView = (RefreshableListView) this.A04;
        refreshableListView.APL();
        boolean z = false;
        refreshableListView.A07 = false;
        refreshableListView.setOnScrollListener(this);
        if (this.A02.A03.A03 == AnonymousClass05K.A00 && !this.A00.isEmpty()) {
            z = true;
        }
        C46445Df7.A01(this, z);
        A02(this);
        C363388je.A00(this.A01).A01(A08, (C363658k8) null, "archive_live");
    }

    public final void Dcl(Reel reel) {
        A01(this);
    }
}
