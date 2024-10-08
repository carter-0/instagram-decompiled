package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectMessageSearchMessage;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.NKh  reason: case insensitive filesystem */
public final class C68488NKh extends C273374mT implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "MessageSearchMessageListFragment";
    public RecyclerView A00;
    public AnonymousClass2t9 A01;
    public ViewModelListUpdate A02;
    public 2el A03;
    public C74544Pwd A04;
    public C72200OyM A05;
    public C14036Toc A06;
    public Long A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public List A0D;
    public List A0E = AnonymousClass7TE.A1C();
    public boolean A0F;
    public boolean A0G;
    public int A0H = 0;
    public Context A0I;
    public AnonymousClass4D6 A0J;
    public final Handler A0K = AnonymousClass7TF.A0D();
    public final 0mM A0L = new 0mM(AnonymousClass7TF.A0D(), new C72255OzQ(this, 0), 300);
    public final C74316Pss A0M = new P1X(this);
    public final O6T A0N = new O6T(this);
    public final C229122ms A0O = new PRL(this, 4);
    public final Runnable A0P = new PVD(this);
    public final C249403jg A0Q = new C67837Mvh(this, 5);
    public final C74448Pv3 A0R = new P1U(this);

    public final void configureActionBar(2da r6) {
        r6.Eu4(true);
        if (182.A06(0Tu.A05, getSession(), 36324720265670939L)) {
            SearchEditText ErO = r6.ErO();
            ErO.setSearchIconEnabled(false);
            ErO.requestFocus();
            ErO.A06();
            ErO.setHint(2131966186);
            ErO.A0C = new PRP(this, 0);
            return;
        }
        r6.Etr(true);
        r6.setTitle(this.A09);
    }

    public final String getModuleName() {
        return "message_search_message_list_fragment";
    }

    public final boolean onBackPressed() {
        this.A05.A02("message_list");
        return false;
    }

    public static void A00(C68488NKh nKh, List list) {
        ViewModelListUpdate viewModelListUpdate;
        nKh.A02 = DbS.A0R();
        if (list != null && !list.isEmpty() && nKh.A02 != null) {
            List list2 = nKh.A0E;
            int i = nKh.A0H;
            ArrayList A1C = AnonymousClass7TE.A1C();
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                A1C.add(new Ou5((DirectMessageSearchMessage) list.get(i2), i2, -1, -1, i));
            }
            list2.addAll(A1C);
            nKh.A02.A01(list2);
        } else if (!nKh.A0E.isEmpty() || nKh.getContext() == null || (viewModelListUpdate = nKh.A02) == null) {
            C46445Df7.A00(nKh.mView, false);
            return;
        } else {
            viewModelListUpdate.A00(new EGY(nKh.getContext().getString(2131968420)));
        }
        C46445Df7.A00(nKh.mView, false);
        ViewModelListUpdate viewModelListUpdate2 = nKh.A02;
        if (viewModelListUpdate2 != null) {
            nKh.A01.A05(viewModelListUpdate2);
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-486987115);
        C68488NKh.super.onCreate(bundle);
        this.A0B = DbU.A0l(requireArguments(), "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_ID");
        this.A09 = requireArguments().getString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_QUERY", "");
        this.A0C = DbU.A0l(requireArguments(), "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_TYPE");
        this.A0H = requireArguments().getInt("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_SEE_ALL_SECTION_RANK_INDEX");
        this.A0A = DbU.A0l(requireArguments(), "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_CATEGORY");
        Long l = null;
        this.A08 = requireArguments().getString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_CUTOVER_OPEN_THREAD_ID", (String) null);
        UserSession session = getSession();
        0Tu r5 = 0Tu.A05;
        this.A0G = 182.A06(r5, session, 36317521902834971L);
        this.A0F = 182.A06(r5, getSession(), 36317521903031581L);
        this.A0D = requireArguments().getParcelableArrayList("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_PENDING_RECIPIENTS");
        String string = requireArguments().getString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_FBID", (String) null);
        if (string != null) {
            l = DbV.A0q(string);
        }
        this.A07 = l;
        this.A05 = C72200OyM.A00(getSession());
        this.A03 = 2el.A00();
        this.A0J = 1ES.A01();
        AnonymousClass0fD.A09(2069140294, A022);
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [X.2tF, java.lang.Object] */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1513963905);
        View inflate = layoutInflater.inflate(R.layout.message_search_result_list_layout, viewGroup, false);
        this.A0I = requireContext();
        this.A00 = DbT.A0I(inflate, R.id.message_result_list);
        AnonymousClass2tC A002 = AnonymousClass2t9.A00(this.A0I);
        A002.A01(new NOU(this.A0I, this, getSession(), this.A0R));
        A002.A01(new C66610MYw(this.A0O, R.layout.direct_search_load_more_empty));
        this.A01 = DbU.A0U(A002, new Object());
        DbU.A15(inflate.getContext(), this.A00, 1, false);
        this.A00.setAdapter(this.A01);
        this.A00.A15(this.A0Q);
        AnonymousClass0fD.A09(-2007823422, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-1283506879);
        super.onDestroy();
        C74544Pwd pwd = this.A04;
        if (pwd != null) {
            pwd.onDestroy();
        }
        AnonymousClass0fD.A09(-1662667095, A022);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0034  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r9, android.os.Bundle r10) {
        /*
            r8 = this;
            super.onViewCreated(r9, r10)
            X.2el r2 = r8.A03
            if (r2 == 0) goto L_0x0010
            X.3DZ r1 = X.AnonymousClass3DZ.A00(r8)
            androidx.recyclerview.widget.RecyclerView r0 = r8.A00
            r2.A06(r0, r1)
        L_0x0010:
            java.lang.String r1 = r8.A0A
            java.lang.String r0 = "open"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0040
            com.instagram.common.session.UserSession r1 = r8.getSession()
            java.lang.String r4 = r8.A09
            java.lang.String r5 = r8.A0B
            X.O6T r2 = r8.A0N
            r3 = 0
            X.NVZ r0 = new X.NVZ
            r0.<init>(r1, r2, r3, r4, r5)
        L_0x002a:
            r8.A04 = r0
        L_0x002c:
            java.lang.String r0 = r8.A09
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x003f
            r0 = 1
            X.C46445Df7.A00(r9, r0)
            X.Pwd r0 = r8.A04
            if (r0 == 0) goto L_0x0083
            r0.CgL()
        L_0x003f:
            return
        L_0x0040:
            java.lang.String r0 = "e2ee"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0061
            boolean r0 = r8.A0G
            if (r0 == 0) goto L_0x0061
            com.instagram.common.session.UserSession r1 = r8.getSession()
            java.lang.String r4 = r8.A09
            java.lang.String r5 = r8.A0B
            java.lang.String r6 = r8.A0C
            java.util.List r7 = r8.A0D
            X.O6T r2 = r8.A0N
            r3 = 0
            X.NVa r0 = new X.NVa
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x002a
        L_0x0061:
            java.lang.String r0 = "cutover"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x002c
            boolean r0 = r8.A0F
            if (r0 == 0) goto L_0x002c
            com.instagram.common.session.UserSession r1 = r8.getSession()
            java.lang.String r3 = r8.A09
            java.lang.String r4 = r8.A0B
            java.lang.String r5 = r8.A08
            java.lang.String r6 = r8.A0C
            java.util.List r7 = r8.A0D
            X.O6T r2 = r8.A0N
            X.P1a r0 = new X.P1a
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x002a
        L_0x0083:
            r0 = 0
            A00(r8, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68488NKh.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
