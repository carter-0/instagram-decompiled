package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.android.R;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

public final class NJV extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS, G6V {
    public static final String __redex_internal_original_name = "DirectSearchSeeAllMessagesFragment";
    public int A00;
    public int A01;
    public AnonymousClass2t9 A02;
    public ViewModelListUpdate A03;
    public 2el A04;
    public C72200OyM A05;
    public C70786OLg A06;
    public String A07;
    public ArrayList A08;
    public int A09;
    public RecyclerView A0A;
    public String A0B;
    public final C74316Pss A0C = new P1Y(this);
    public final AnonymousClass0eM A0D = C227642jf.A02(this);
    public final C249403jg A0E = new C67837Mvh(this, 10);
    public final C74448Pv3 A0F = new P1V(this);

    public final void configureActionBar(2da r3) {
        0qQ.A0B(r3, 0);
        r3.Etr(true);
        String str = this.A0B;
        if (str == null) {
            0qQ.A0F(DialogModule.KEY_TITLE);
            throw AnonymousClass00P.createAndThrow();
        }
        r3.setTitle(str);
        r3.Eu4(true);
    }

    public final String getModuleName() {
        return "DIRECT_SEARCH_INBOX_SEE_ALL_MESSAGES_FRAGMENT";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        2el r3 = this.A04;
        if (r3 == null) {
            str = "viewpointManager";
        } else {
            AnonymousClass3DZ A002 = AnonymousClass3DZ.A00(this);
            RecyclerView recyclerView = this.A0A;
            if (recyclerView == null) {
                str = "recyclerView";
            } else {
                r3.A08(recyclerView, A002, new AnonymousClass2eo[0]);
                C66583MXo.A0z(this);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void Dhj() {
        C70786OLg oLg = this.A06;
        if (oLg != null) {
            oLg.A00(this.A00);
            A00();
            return;
        }
        0qQ.A0F("messageSearchProvider");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0D);
    }

    public final boolean onBackPressed() {
        C72200OyM oyM = this.A05;
        if (oyM == null) {
            0qQ.A0F("messageSearchLogger");
            throw AnonymousClass00P.createAndThrow();
        }
        oyM.A02("thread_list");
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00() {
        /*
            r11 = this;
            com.instagram.common.recyclerview.ViewModelListUpdate r0 = X.DbS.A0R()
            r11.A03 = r0
            java.util.ArrayList r0 = r11.A08
            if (r0 != 0) goto L_0x0014
            java.lang.String r0 = "messageResults"
        L_0x000c:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0014:
            java.util.Iterator r3 = X.AnonymousClass7TE.A1G(r0)
            r4 = 0
            r7 = 0
            r8 = 0
        L_0x001b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x003d
            java.lang.Object r6 = X.AnonymousClass7TF.A0a(r3)
            com.instagram.model.direct.DirectSearchResult r6 = (com.instagram.model.direct.DirectSearchResult) r6
            com.instagram.common.recyclerview.ViewModelListUpdate r2 = r11.A03
            if (r2 == 0) goto L_0x0094
            int r1 = r7 + 1
            int r0 = r8 + 1
            r9 = -1
            int r10 = r11.A09
            X.Ou5 r5 = new X.Ou5
            r5.<init>(r6, r7, r8, r9, r10)
            r2.A00(r5)
            r7 = r1
            r8 = r0
            goto L_0x001b
        L_0x003d:
            X.OLg r0 = r11.A06
            if (r0 == 0) goto L_0x009c
            java.lang.Integer r1 = r0.A00
            if (r1 == 0) goto L_0x0098
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r5 = 1
            if (r1 != r0) goto L_0x006a
            com.instagram.common.recyclerview.ViewModelListUpdate r3 = r11.A03
            if (r3 == 0) goto L_0x0094
            android.content.Context r1 = r11.requireContext()
            r0 = 2131972868(0x7f135304, float:1.9582756E38)
            java.lang.String r1 = r1.getString(r0)
            int r0 = r11.A01
            X.EGc r2 = new X.EGc
            r2.<init>(r1, r0, r5)
        L_0x0060:
            r3.A00(r2)
        L_0x0063:
            X.2t9 r1 = r11.A02
            if (r1 != 0) goto L_0x008c
            java.lang.String r0 = "adapter"
            goto L_0x000c
        L_0x006a:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x0063
            com.instagram.common.recyclerview.ViewModelListUpdate r3 = r11.A03
            if (r3 == 0) goto L_0x0094
            android.content.Context r2 = r11.requireContext()
            r1 = 2131972817(0x7f1352d1, float:1.9582652E38)
            java.lang.String r0 = r11.A07
            if (r0 != 0) goto L_0x0080
            java.lang.String r0 = "query"
            goto L_0x000c
        L_0x0080:
            java.lang.String r1 = X.DbW.A0h(r2, r0, r1)
            int r0 = r11.A01
            X.EGc r2 = new X.EGc
            r2.<init>(r1, r0, r4)
            goto L_0x0060
        L_0x008c:
            com.instagram.common.recyclerview.ViewModelListUpdate r0 = r11.A03
            if (r0 == 0) goto L_0x0094
            r1.A05(r0)
            return
        L_0x0094:
            java.lang.String r0 = "viewModelListUpdater"
            goto L_0x000c
        L_0x0098:
            java.lang.String r0 = "state"
            goto L_0x000c
        L_0x009c:
            java.lang.String r0 = "messageSearchProvider"
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NJV.A00():void");
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [X.07Z, androidx.fragment.app.Fragment, X.NJV] */
    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1636878109);
        NJV.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A01 = Dbb.A05(this);
        this.A0B = requireArguments.getString(AnonymousClass000.A00(104), "");
        this.A07 = requireArguments.getString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_QUERY", "");
        this.A00 = requireArguments.getInt("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_NEXT_OFFSET", 0);
        this.A09 = requireArguments.getInt("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_SEE_ALL_SECTION_RANK_INDEX");
        ArrayList parcelableArrayList = requireArguments.getParcelableArrayList("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_MESSAGES");
        if (parcelableArrayList == null) {
            parcelableArrayList = AnonymousClass7TE.A1C();
        }
        this.A08 = parcelableArrayList;
        AnonymousClass0eM r5 = this.A0D;
        UserSession A0l = AnonymousClass7TE.A0l(r5);
        C228602lw A0I = JTU.A0I(requireContext(), this);
        O7V o7v = new O7V(this);
        String str = this.A07;
        if (str == null) {
            0qQ.A0F("query");
            throw AnonymousClass00P.createAndThrow();
        }
        C70786OLg oLg = new C70786OLg(A0l, A0I, o7v, str);
        this.A06 = oLg;
        oLg.A00(this.A00);
        this.A05 = C72200OyM.A00(AnonymousClass7TE.A0l(r5));
        this.A04 = 2el.A00();
        AnonymousClass0fD.A09(856942542, A022);
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [X.2tF, java.lang.Object] */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1822127676);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.inbox_search_see_all_fragment, viewGroup, false);
        this.A0A = DbZ.A0F(inflate, R.id.recycler_view);
        AnonymousClass2tC A002 = AnonymousClass2t9.A00(requireActivity());
        A002.A01(new Object());
        A002.A01(new EG8(requireContext(), this));
        this.A02 = DbU.A0U(A002, new NOU(requireContext(), this, AnonymousClass7TE.A0l(this.A0D), this.A0F));
        RecyclerView recyclerView = this.A0A;
        String str = "recyclerView";
        if (recyclerView != null) {
            DbY.A15(this, recyclerView);
            RecyclerView recyclerView2 = this.A0A;
            if (recyclerView2 != null) {
                AnonymousClass2t9 r0 = this.A02;
                if (r0 == null) {
                    str = "adapter";
                } else {
                    recyclerView2.setAdapter(r0);
                    RecyclerView recyclerView3 = this.A0A;
                    if (recyclerView3 != null) {
                        recyclerView3.A15(this.A0E);
                        A00();
                        AnonymousClass0fD.A09(1570506818, A022);
                        return inflate;
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
