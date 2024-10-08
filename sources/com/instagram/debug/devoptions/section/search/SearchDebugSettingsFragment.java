package com.instagram.debug.devoptions.section.search;

import X.0eO;
import X.0qQ;
import X.0sP;
import X.1Au;
import X.1Av;
import X.1wn;
import X.2Fk;
import X.2da;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass0fD;
import X.AnonymousClass0fN;
import X.AnonymousClass1Nd;
import X.AnonymousClass4DS;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass9Fi;
import X.C13990Tnq;
import X.C14408Tvb;
import X.C14471Twt;
import X.C18080Vl9;
import X.C227642jf;
import X.C293655l8;
import X.C363288jT;
import X.C363368jb;
import X.C46448DfA;
import X.C47518E6c;
import X.C50989Fmc;
import X.C59689JTv;
import X.C66583MXo;
import X.DbV;
import X.DbW;
import X.FGF;
import X.JTQ;
import X.PR9;
import X.Pxe;
import X.UKV;
import android.content.Context;
import android.content.DialogInterface;
import android.text.format.DateUtils;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.NumberPicker;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class SearchDebugSettingsFragment extends C47518E6c implements AnonymousClass4DS {
    public static final Companion Companion = new Object();
    public static final int MAX_CACHE_ALLOWANCE = 10;
    public static final int MIN_CACHE_ALLOWANCE = 0;
    public static final String TAG = "SearchDebugSettingsFragment";
    public final AnonymousClass0eM searchDebugPreferences$delegate = AnonymousClass0eN.A00(0eO.A02, new SearchDebugSettingsFragment$searchDebugPreferences$2(this));
    public final AnonymousClass0eM session$delegate = C227642jf.A02(this);
    public final AnonymousClass0eM settingsModel$delegate = AnonymousClass0eN.A00(0eO.A03, new SearchDebugSettingsFragment$settingsModel$2(this));
    public final 1wn userBootstrapListener = new SearchDebugSettingsFragment$userBootstrapListener$1(this);

    public void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131958277);
    }

    public String getModuleName() {
        return "search_debug_settings";
    }

    private final List createMenuOptions(UKV ukv) {
        ArrayList arrayList = new ArrayList();
        appendDisplayOptions(ukv, arrayList);
        DbV.A1W(arrayList, true);
        appendBootstrapOptions(ukv, arrayList);
        DbV.A1W(arrayList, true);
        appendClientSideMatchingOptions(ukv, arrayList);
        DbV.A1W(arrayList, true);
        arrayList.add(new C50989Fmc(C66583MXo.A07(this, new C46448DfA(2131958276), arrayList), (View.OnClickListener) new SearchDebugSettingsFragment$createMenuOptions$1(this), (CharSequence) getString(2131958263)));
        return arrayList;
    }

    /* access modifiers changed from: private */
    public final C14471Twt getSearchDebugPreferences() {
        return (C14471Twt) this.searchDebugPreferences$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final 2Fk getSettingsModel() {
        return (2Fk) this.settingsModel$delegate.getValue();
    }

    private final String timeToString(long j) {
        if (j < 0) {
            return "TIME_NOT_SET";
        }
        String formatDateTime = DateUtils.formatDateTime(requireActivity(), j, 524289);
        0qQ.A07(formatDateTime);
        return formatDateTime;
    }

    private final void appendBootstrapOptions(UKV ukv, List list) {
        JTQ.A0t(2131958262, list);
        C13990Tnq.A0l(requireContext(), new SearchDebugSettingsFragment$appendBootstrapOptions$1(this), getString(2131958281), list);
        C13990Tnq.A0l(requireContext(), new SearchDebugSettingsFragment$appendBootstrapOptions$2(this), getString(2131958280), list);
        boolean z = ukv.A03;
        list.add(new PR9((CompoundButton.OnCheckedChangeListener) new SearchDebugSettingsFragment$appendBootstrapOptions$3(this), 2131958270, z));
        if (z) {
            C13990Tnq.A0l(requireContext(), new SearchDebugSettingsFragment$appendBootstrapOptions$4(this, ukv), getString(2131958269, AnonymousClass7TF.A1b(ukv.A00)), list);
        }
        Context requireContext = requireContext();
        C363368jb r6 = C363288jT.A00(AnonymousClass7TE.A0l(this.session$delegate)).A02;
        long j = r6.A01;
        if (j == -1) {
            j = r6.A03.getLong("last_fetched_time_ms", -1);
            r6.A01 = j;
        }
        C13990Tnq.A0l(requireContext, new SearchDebugSettingsFragment$appendBootstrapOptions$5(this), DbV.A0z(this, timeToString(j), 2131958274), list);
        Context requireContext2 = requireContext();
        C363368jb r62 = (C363368jb) C293655l8.A00(AnonymousClass7TE.A0l(this.session$delegate)).A06.getValue();
        long j2 = r62.A01;
        if (j2 == -1) {
            j2 = r62.A03.getLong("last_fetched_time_ms", -1);
            r62.A01 = j2;
        }
        C13990Tnq.A0l(requireContext2, new SearchDebugSettingsFragment$appendBootstrapOptions$6(this), DbV.A0z(this, timeToString(j2), 2131958272), list);
        Context requireContext3 = requireContext();
        C363368jb r63 = C14408Tvb.A00(AnonymousClass7TE.A0l(this.session$delegate)).A02;
        long j3 = r63.A01;
        if (j3 == -1) {
            j3 = r63.A03.getLong("last_fetched_time_ms", -1);
            r63.A01 = j3;
        }
        C13990Tnq.A0l(requireContext3, new SearchDebugSettingsFragment$appendBootstrapOptions$7(this), DbV.A0z(this, timeToString(j3), 2131958273), list);
        Context requireContext4 = requireContext();
        1Av A00 = 1Au.A00(AnonymousClass7TE.A0l(this.session$delegate));
        C13990Tnq.A0l(requireContext4, new SearchDebugSettingsFragment$appendBootstrapOptions$8(this), DbV.A0z(this, timeToString(AnonymousClass7TE.A0R(Pxe.A0s(A00, A00.A6t, 1Av.A8a, 5))), 2131958271), list);
        list.add(new FGF((CharSequence) getString(2131958261)));
    }

    private final void appendClientSideMatchingOptions(UKV ukv, List list) {
        JTQ.A0t(2131958265, list);
        boolean z = ukv.A04;
        list.add(new PR9((CompoundButton.OnCheckedChangeListener) new SearchDebugSettingsFragment$appendClientSideMatchingOptions$1(this), 2131958270, z));
        if (z) {
            C13990Tnq.A0l(requireContext(), new SearchDebugSettingsFragment$appendClientSideMatchingOptions$2(this, ukv), getString(2131958269, AnonymousClass7TF.A1b(ukv.A01)), list);
        }
        list.add(new FGF((CharSequence) getString(2131958264)));
    }

    private final void appendDisplayOptions(UKV ukv, List list) {
        JTQ.A0t(2131958266, list);
        list.add(new PR9((CompoundButton.OnCheckedChangeListener) new SearchDebugSettingsFragment$appendDisplayOptions$1(this), 2131958267, ukv.A02));
        list.add(new FGF((CharSequence) getString(2131958268)));
    }

    /* access modifiers changed from: private */
    public final void showCacheLimitSelectionDialog(int i, 0sP r6) {
        NumberPicker numberPicker = new NumberPicker(requireActivity());
        numberPicker.setWrapSelectorWheel(false);
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(10);
        numberPicker.setValue(i);
        C18080Vl9 vl9 = new C18080Vl9(requireActivity());
        vl9.A07(numberPicker);
        vl9.A03((DialogInterface.OnClickListener) null, 2131954722);
        vl9.A04(new SearchDebugSettingsFragment$showCacheLimitSelectionDialog$1(r6, numberPicker), 2131968772);
        AnonymousClass0fN.A00(vl9.A00());
    }

    /* access modifiers changed from: private */
    public final void toast(String str) {
        C59689JTv.A09(getActivity(), str);
    }

    /* access modifiers changed from: private */
    public final void updateItems(UKV ukv) {
        ukv.toString();
        setItems(createMenuOptions(ukv));
    }

    public void onPause() {
        int A02 = AnonymousClass0fD.A02(1594842746);
        SearchDebugSettingsFragment.super.onPause();
        getSettingsModel().A08(new SearchDebugSettingsFragment$sam$androidx_lifecycle_Observer$0(new SearchDebugSettingsFragment$onPause$1(this)));
        AnonymousClass1Nd.A00(AnonymousClass7TE.A0l(this.session$delegate)).A02(this.userBootstrapListener, AnonymousClass9Fi.class);
        AnonymousClass0fD.A09(-727597239, A02);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.07Z, X.2jx, java.lang.Object, com.instagram.debug.devoptions.section.search.SearchDebugSettingsFragment] */
    public void onResume() {
        int A02 = AnonymousClass0fD.A02(-39237189);
        super.onResume();
        UKV ukv = (UKV) getSettingsModel().A02();
        if (ukv != null) {
            updateItems(ukv);
        }
        getSettingsModel().A06(this, new SearchDebugSettingsFragment$sam$androidx_lifecycle_Observer$0(new SearchDebugSettingsFragment$onResume$2(this)));
        AnonymousClass1Nd.A00(AnonymousClass7TE.A0l(this.session$delegate)).A01(this.userBootstrapListener, AnonymousClass9Fi.class);
        AnonymousClass0fD.A09(2135988857, A02);
    }

    public final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public UserSession getSession() {
        return AnonymousClass7TE.A0l(this.session$delegate);
    }
}
