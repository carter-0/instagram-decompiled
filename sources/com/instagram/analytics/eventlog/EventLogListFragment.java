package com.instagram.analytics.eventlog;

import X.0S7;
import X.0lg;
import X.2da;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass0xM;
import X.AnonymousClass32G;
import X.AnonymousClass4DR;
import X.AnonymousClass4DS;
import X.AnonymousClass4v0;
import X.C13991Tnr;
import X.C15453Ud4;
import X.C16816V6x;
import X.C18887WAz;
import X.C19775WfI;
import X.C227642jf;
import X.DbS;
import X.G6X;
import X.G7N;
import X.X38;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.common.dextricks.Constants;
import com.instagram.common.analytics.intf.AnalyticsEventDebugInfo;
import com.instagram.ui.widget.typeahead.TypeaheadHeader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class EventLogListFragment extends AnonymousClass32G implements AnonymousClass4DR, G7N, AnonymousClass4DS, X38 {
    public C15453Ud4 A00;
    public AnonymousClass0xM A01;
    public AnonymousClass0wW A02;
    public TypeaheadHeader A03;
    public String A04 = "";
    public final G6X A05 = new C19775WfI(this, 0);

    public final void configureActionBar(2da r3) {
        r3.Eu4(true);
        r3.setTitle("Events List");
        r3.AA8("CLEAR LOGS", new C18887WAz(this, 13));
    }

    public final String getModuleName() {
        return "events_list";
    }

    public final /* bridge */ /* synthetic */ 0lg A0Y() {
        return this.A02;
    }

    public final boolean onBackPressed() {
        TypeaheadHeader typeaheadHeader = this.A03;
        if (typeaheadHeader == null) {
            return false;
        }
        typeaheadHeader.A01();
        return false;
    }

    public final void registerTextViewLogging(TextView textView) {
        textView.addTextChangedListener(AnonymousClass4v0.A00(this.A02));
    }

    public final void searchTextChanged(String str) {
        C15453Ud4 ud4;
        this.A04 = str;
        ArrayList A0n = C13991Tnr.A0n(this.A01);
        if (!TextUtils.isEmpty(this.A04)) {
            String[] split = str.toLowerCase().trim().split("\\s+");
            ArrayList arrayList = new ArrayList();
            Iterator it = A0n.iterator();
            while (it.hasNext()) {
                AnalyticsEventDebugInfo analyticsEventDebugInfo = (AnalyticsEventDebugInfo) it.next();
                int length = split.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        arrayList.add(analyticsEventDebugInfo);
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
            ud4 = this.A00;
            List list = ud4.A00;
            list.clear();
            list.addAll(arrayList);
        } else {
            ud4 = this.A00;
            List list2 = ud4.A00;
            list2.clear();
            list2.addAll(A0n);
        }
        C15453Ud4.A00(ud4);
    }

    public final void DD6(AnalyticsEventDebugInfo analyticsEventDebugInfo) {
        C16816V6x.A00(getActivity(), analyticsEventDebugInfo, this.A02).A04();
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1615736047);
        EventLogListFragment.super.onCreate(bundle);
        this.A02 = DbS.A0T(C227642jf.A01(this));
        this.A01 = AnonymousClass0xM.A00();
        C15453Ud4 ud4 = new C15453Ud4(requireContext(), this, this.A05, C13991Tnr.A0n(this.A01));
        this.A00 = ud4;
        A0V(ud4);
        AnonymousClass0fD.A09(-547921649, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1528049296);
        TypeaheadHeader typeaheadHeader = new TypeaheadHeader(layoutInflater.getContext());
        this.A03 = typeaheadHeader;
        typeaheadHeader.A01 = this;
        View onCreateView = EventLogListFragment.super.onCreateView(layoutInflater, viewGroup, bundle);
        AnonymousClass0fD.A09(1687399578, A022);
        return onCreateView;
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-1880443609);
        EventLogListFragment.super.onPause();
        TypeaheadHeader typeaheadHeader = this.A03;
        if (typeaheadHeader != null) {
            typeaheadHeader.A01();
        }
        AnonymousClass0fD.A09(-382181437, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-5564384);
        super.onResume();
        C15453Ud4 ud4 = this.A00;
        ArrayList A0n = C13991Tnr.A0n(this.A01);
        List list = ud4.A00;
        list.clear();
        list.addAll(A0n);
        C15453Ud4.A00(ud4);
        this.A03.A04(this.A04);
        AnonymousClass0fD.A09(1125711930, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A03.A03(requireContext().getString(2131971290));
        0S7.A00(this);
        this.A04.setOnScrollListener(this.A03.A04);
        0S7.A00(this);
        this.A04.setDescendantFocusability(Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED);
    }
}
