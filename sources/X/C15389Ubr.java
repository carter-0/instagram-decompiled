package X;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.TextView;
import com.facebook.common.dextricks.Constants;
import com.instagram.common.analytics.intf.AnalyticsEventDebugInfo;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.typeahead.TypeaheadHeader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ubr  reason: case insensitive filesystem */
public final class C15389Ubr extends AnonymousClass32G implements AnonymousClass4DR, G7N, AnonymousClass4DS, X38 {
    public static final String __redex_internal_original_name = "MediaLoggerListFragment";
    public UserSession A00;
    public TypeaheadHeader A01;
    public C15453Ud4 A02;
    public AnonymousClass0xM A03;
    public String A04;
    public final G6X A05 = new C19775WfI(this, 1);

    public final String getModuleName() {
        return "media_logger";
    }

    public final /* bridge */ /* synthetic */ 0lg A0Y() {
        return this.A00;
    }

    public final boolean onBackPressed() {
        TypeaheadHeader typeaheadHeader = this.A01;
        if (typeaheadHeader == null) {
            return false;
        }
        typeaheadHeader.A01();
        return false;
    }

    public final void registerTextViewLogging(TextView textView) {
        textView.addTextChangedListener(AnonymousClass4v0.A00(this.A00));
    }

    public final void searchTextChanged(String str) {
        C15453Ud4 ud4;
        ArrayList arrayList;
        ArrayList A0n = C13991Tnr.A0n(this.A03);
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.toLowerCase().split("\\s+");
            ArrayList arrayList2 = new ArrayList();
            Iterator it = A0n.iterator();
            while (it.hasNext()) {
                AnalyticsEventDebugInfo analyticsEventDebugInfo = (AnalyticsEventDebugInfo) it.next();
                int length = split.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        arrayList2.add(analyticsEventDebugInfo);
                        break;
                    }
                    String str2 = split[i];
                    String str3 = analyticsEventDebugInfo.A00;
                    str3.getClass();
                    if (!str3.contains(str2)) {
                        break;
                    }
                    i++;
                }
            }
            ud4 = this.A02;
            arrayList = C16945VBx.A00(this.A04, arrayList2);
        } else {
            ud4 = this.A02;
            arrayList = C16945VBx.A00(this.A04, A0n);
        }
        List list = ud4.A00;
        list.clear();
        list.addAll(arrayList);
        C15453Ud4.A00(ud4);
    }

    public final void DD6(AnalyticsEventDebugInfo analyticsEventDebugInfo) {
        C16816V6x.A00(getActivity(), analyticsEventDebugInfo, this.A00).A04();
    }

    public final void configureActionBar(2da r2) {
        DbW.A1B(r2, 2131965920);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(247775329);
        C15389Ubr.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = DbX.A0U(this);
        this.A04 = requireArguments.getString("media_id", "");
        this.A03 = AnonymousClass0xM.A00();
        C15453Ud4 ud4 = new C15453Ud4(requireContext(), this, this.A05, C16945VBx.A00(this.A04, C13991Tnr.A0n(this.A03)));
        this.A02 = ud4;
        A0V(ud4);
        AnonymousClass0fD.A09(1105038240, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1942086546);
        this.A01 = new TypeaheadHeader(layoutInflater.getContext());
        View onCreateView = C15389Ubr.super.onCreateView(layoutInflater, viewGroup, bundle);
        AnonymousClass0fD.A09(575437395, A022);
        return onCreateView;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1148573713);
        super.onDestroyView();
        0S7.A00(this);
        this.A04.setOnScrollListener((AbsListView.OnScrollListener) null);
        this.A01 = null;
        AnonymousClass0fD.A09(-929485548, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-671342286);
        C15389Ubr.super.onPause();
        TypeaheadHeader typeaheadHeader = this.A01;
        if (typeaheadHeader != null) {
            typeaheadHeader.A01();
        }
        AnonymousClass0fD.A09(1717444162, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(1204976597);
        super.onResume();
        C15453Ud4 ud4 = this.A02;
        ArrayList A002 = C16945VBx.A00(this.A04, C13991Tnr.A0n(this.A03));
        List list = ud4.A00;
        list.clear();
        list.addAll(A002);
        C15453Ud4.A00(ud4);
        AnonymousClass0fD.A09(20135133, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        TypeaheadHeader typeaheadHeader = this.A01;
        typeaheadHeader.getClass();
        typeaheadHeader.A02();
        typeaheadHeader.A01 = this;
        typeaheadHeader.A03(requireContext().getString(2131971290));
        0S7.A00(this);
        this.A04.setOnScrollListener(typeaheadHeader.A04);
        0S7.A00(this);
        this.A04.setDescendantFocusability(Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED);
    }
}
