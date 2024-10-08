package X;

import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import com.instagram.ui.widget.typeahead.TypeaheadHeader;
import com.instagram.user.model.User;
import java.util.Collection;

public final class K8N extends MYR implements X9V, G7N {
    public static final String __redex_internal_original_name = "IgLiveAddModeratorFragment";
    public X9V A00;
    public TypeaheadHeader A01;
    public String A02;
    public final AnonymousClass0eM A03 = C227642jf.A02(this);
    public final AnonymousClass0eM A04;

    public final /* synthetic */ void Ct1(User user) {
    }

    public final void Cu9(User user, String str) {
        AnonymousClass7TG.A1N(user, str);
        2YL A0H = DbS.A0H(this.A04);
        AnonymousClass7TE.A1Z(new C66173MGk(user, A0H, str, (AnonymousClass4D7) null, 21), C318116oQ.A00(A0H));
    }

    public final /* synthetic */ void D0X(User user) {
    }

    public final /* synthetic */ void DGW(String str) {
    }

    public final /* synthetic */ void DLc(User user, Integer num) {
    }

    public final /* synthetic */ void DNI() {
    }

    public final /* synthetic */ void DSL(G7P g7p, User user) {
    }

    public final /* synthetic */ void DdZ(User user) {
    }

    public final /* synthetic */ void Dw8(String str) {
    }

    public final /* synthetic */ void E0E(1P0 r1, C21478XcN xcN, User user, Integer num) {
    }

    public final Collection getDefinitions() {
        return JTT.A0s(new KG8(C66365MOw.A00), new C15796Uif(this, AnonymousClass7TE.A0l(this.A03), (G7P) null, C313666go.BROADCASTER, this, C66367MOy.A00));
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ViewStub A0F = DbS.A0F(view, R.id.recycler_top_view_stub);
        A0F.setLayoutResource(R.layout.top_search_bar);
        A0F.inflate();
        TypeaheadHeader typeaheadHeader = (TypeaheadHeader) view.findViewById(R.id.search_typeahead_header);
        this.A01 = typeaheadHeader;
        String str = "searchTypeahead";
        if (typeaheadHeader != null) {
            typeaheadHeader.A03(DbU.A0m(this, 2131972797));
            TypeaheadHeader typeaheadHeader2 = this.A01;
            if (typeaheadHeader2 != null) {
                typeaheadHeader2.A01 = this;
                SearchEditText searchEditText = typeaheadHeader2.A00;
                str = "searchEditText";
                if (searchEditText != null) {
                    searchEditText.A05();
                    SearchEditText searchEditText2 = typeaheadHeader2.A00;
                    if (searchEditText2 != null) {
                        searchEditText2.A06();
                        AnonymousClass0eM r4 = this.A04;
                        DbV.A1F(getViewLifecycleOwner(), DbT.A0G(((C62304Kdc) r4.getValue()).A05), new MPC(this, 12), 67);
                        ((C62304Kdc) r4.getValue()).A07();
                        return;
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void registerTextViewLogging(TextView textView) {
    }

    public final void searchTextChanged(String str) {
        0qQ.A0B(str, 0);
        int length = str.length();
        C62304Kdc kdc = (C62304Kdc) this.A04.getValue();
        if (length > 0) {
            AnonymousClass7TF.A1O(kdc.A06, AnonymousClass7TF.A1R(length));
            DbX.A1W(kdc, str, C318116oQ.A00(kdc), 35);
            return;
        }
        kdc.A07();
    }

    public final String getModuleName() {
        int i;
        String str = this.A02;
        if (str == null) {
            0qQ.A0F("source");
            throw AnonymousClass00P.createAndThrow();
        }
        if (str.equals("ufi_action_sheet")) {
            i = 2323;
        } else {
            i = 2322;
        }
        return AnonymousClass000.A00(i);
    }

    public final OID getRecyclerConfigBuilder() {
        return configBuilder(C66368MOz.A00);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    public K8N() {
        C66302MMl mMl = new C66302MMl(this, 10);
        AnonymousClass0eM A012 = C66302MMl.A01(new C66302MMl(this, 7), 0eO.A02, 8);
        this.A04 = DbS.A0I(new C66302MMl(A012, 9), mMl, C66304MMn.A01(A012, (Object) null, 41), DbS.A0z(C62304Kdc.class));
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(2084094999);
        K8N.super.onCreate(bundle);
        this.A02 = requireArguments().getString("live_add_moderator_tap_source", "0");
        AnonymousClass0fD.A09(-1488660524, A022);
    }
}
