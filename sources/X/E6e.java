package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;

public final class E6e extends C227812jx implements AnonymousClass4DS, AnonymousClass32K {
    public static final String __redex_internal_original_name = "AccountDiscoveryOneCategoryFragment";
    public EEU A00;
    public E9M A01;
    public String A02;
    public String A03;
    public String A04;
    public 2el A05;
    public C49624Ezh A06;
    public String A07;
    public String A08;
    public final AnonymousClass0eM A09 = C227642jf.A02(this);

    public final void configureActionBar(2da r3) {
        0qQ.A0B(r3, 0);
        DbX.A1A(FP8.A00(this, 62), DbV.A0K(), r3);
        String str = this.A08;
        if (str == null) {
            0qQ.A0F("pageTitle");
            throw AnonymousClass00P.createAndThrow();
        } else {
            r3.setTitle(str);
        }
    }

    public final void onRecyclerViewCreated(RecyclerView recyclerView) {
        0qQ.A0B(recyclerView, 0);
        EEU eeu = this.A00;
        if (eeu == null) {
            0qQ.A0F("accountDiscoveryController");
            throw AnonymousClass00P.createAndThrow();
        }
        DbU.A15(eeu.A06.requireContext(), recyclerView, 1, false);
        recyclerView.A0S = true;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        E9M e9m = this.A01;
        if (e9m == null) {
            str = "oneCategoryAdapter";
        } else {
            setAdapter(e9m);
            2el r3 = this.A05;
            if (r3 == null) {
                str = "viewPointManager";
            } else {
                r3.A08(((C238143As) getScrollingViewProxy()).CFN(), AnonymousClass3DZ.A00(this), new AnonymousClass2eo[0]);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final String getModuleName() {
        String str = this.A07;
        if (str != null) {
            return str;
        }
        0qQ.A0F("moduleName");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A09);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(450298119);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A08 = C320236s2.A01(requireArguments, "AccountDiscoveryFragment.title");
        this.A02 = C320236s2.A01(requireArguments, "AccountDiscoveryFragment.category");
        this.A03 = DbS.A0l(requireArguments);
        String str = this.A02;
        String str2 = "category";
        if (str != null) {
            this.A07 = 002.A0R("account_discovery_", str);
            this.A04 = requireArguments.getString("AccountDiscoveryFragment.forcedUserIds");
            AnonymousClass0eM r4 = this.A09;
            EKJ ekj = new EKJ(AnonymousClass7TE.A0l(r4), this);
            2el A012 = C71682ef.A01((0lg) null, C71682ef.A00());
            this.A05 = A012;
            this.A06 = new C49624Ezh(A012, new F2S(this, AnonymousClass7TE.A0l(r4), (String) null));
            UserSession A0l = AnonymousClass7TE.A0l(r4);
            Context requireContext = requireContext();
            String str3 = this.A02;
            if (str3 != null) {
                C49624Ezh ezh = this.A06;
                if (ezh == null) {
                    str2 = "recommendedUserCardsViewpointHelper";
                } else {
                    this.A01 = new E9M(requireContext, this, A0l, ezh, ekj, str3);
                    this.A00 = new EEU(this, AnonymousClass7TE.A0l(r4), new C50432Fbf(this));
                    AnonymousClass0fD.A09(1514561357, A022);
                    return;
                }
            }
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1508693746);
        0qQ.A0B(layoutInflater, 0);
        EEU eeu = this.A00;
        if (eeu == null) {
            0qQ.A0F("accountDiscoveryController");
            throw AnonymousClass00P.createAndThrow();
        }
        View A012 = eeu.A01(layoutInflater, viewGroup);
        AnonymousClass0fD.A09(-2090843599, A022);
        return A012;
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(-1645268149);
        E6e.super.onStop();
        C49624Ezh ezh = this.A06;
        if (ezh == null) {
            0qQ.A0F("recommendedUserCardsViewpointHelper");
            throw AnonymousClass00P.createAndThrow();
        }
        ezh.A04.clear();
        AnonymousClass0fD.A09(-1276298554, A022);
    }

    public final C358248ab ALt(C358248ab r1) {
        Dba.A1K(this, r1);
        return r1;
    }
}
