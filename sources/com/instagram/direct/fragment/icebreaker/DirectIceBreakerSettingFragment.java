package com.instagram.direct.fragment.icebreaker;

import X.0hq;
import X.0qQ;
import X.0s1;
import X.2dZ;
import X.2da;
import X.AnonymousClass05K;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass1Nd;
import X.AnonymousClass3JR;
import X.AnonymousClass4DR;
import X.AnonymousClass4DS;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C273374mT;
import X.C320156rr;
import X.C322776wO;
import X.C47518E6c;
import X.C48751Eja;
import X.C59689JTv;
import X.C68484NKb;
import X.C69863NtR;
import X.C70761OKh;
import X.C70814OMj;
import X.C70932OSf;
import X.C71407Ok6;
import X.C71889OsX;
import X.C74442Pux;
import X.DbS;
import X.DbT;
import X.DbX;
import X.OVT;
import X.OyN;
import X.P0c;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.ui.emptystaterow.EmptyStateView;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class DirectIceBreakerSettingFragment extends C47518E6c implements AnonymousClass4DR, C74442Pux, AnonymousClass4DS, C322776wO {
    public Context A00;
    public Bundle A01;
    public Toast A02;
    public FragmentActivity A03;
    public UserSession A04;
    public C70761OKh A05;
    public OVT A06;
    public C70932OSf A07;
    public OyN A08;
    public String A09;
    public boolean A0A = false;
    public boolean A0B = false;
    public final C74442Pux A0C = new P0c(this);
    public EmptyStateView mEmptyStateView;

    public static synchronized void A07(DirectIceBreakerSettingFragment directIceBreakerSettingFragment, boolean z) {
        synchronized (directIceBreakerSettingFragment) {
            directIceBreakerSettingFragment.A0A = z;
        }
    }

    public final void DBx() {
    }

    public final /* synthetic */ void DBz(C320156rr r1) {
    }

    public final String getModuleName() {
        return "direct_icebreaker_setting_fragment";
    }

    public static void A06(DirectIceBreakerSettingFragment directIceBreakerSettingFragment) {
        if (directIceBreakerSettingFragment.A09.equals("inbox_qp_creation_flow")) {
            Intent A092 = DbS.A09();
            A092.putExtra("is_icebreaker_added", AnonymousClass7TF.A1R(directIceBreakerSettingFragment.A08.A03()));
            directIceBreakerSettingFragment.A03.setResult(-1, A092);
        }
        directIceBreakerSettingFragment.A03.onBackPressed();
    }

    public final void A08() {
        C70932OSf oSf;
        HashMap A1E;
        String str;
        String str2;
        boolean z;
        this.mEmptyStateView.A0K();
        OyN oyN = this.A08;
        boolean z2 = oyN.A06;
        int intValue = oyN.A04().intValue();
        if (intValue == 3) {
            List list = Collections.EMPTY_LIST;
            if (!z2) {
                setItems(list);
                synchronized (this) {
                    z = this.A0A;
                }
                if (!z) {
                    A07(this, true);
                    this.A05.A00(this, (C70814OMj) null, this.A09, (String) null);
                    return;
                }
                return;
            }
            setItems(list);
            C70761OKh oKh = this.A05;
            Bundle bundle = this.A01;
            0qQ.A0B(bundle, 0);
            0hq r1 = oKh.A00;
            if (r1 != null) {
                bundle.putBoolean("show_set_up_preference", z2);
                C273374mT r3 = new C273374mT();
                r3.setArguments(bundle);
                0qQ.A0A(r1);
                0s1 r2 = new 0s1(r1);
                r2.A0D(r3, C68484NKb.__redex_internal_original_name, R.id.layout_listview_parent_container);
                r2.A01();
            }
            oSf = this.A07;
            boolean z3 = !this.A09.equals("business_settings");
            A1E = AnonymousClass7TE.A1E();
            String str3 = "0";
            if (z3) {
                str3 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            }
            A1E.put("from_qp", str3);
            A1E.put("show_import_option", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
            str = null;
            str2 = "icebreaker_settings_null_state_screen_impression";
        } else if (intValue == 2) {
            0hq r22 = this.A05.A00;
            if (r22 != null) {
                Fragment A0R = r22.A0R(C68484NKb.__redex_internal_original_name);
                if (A0R instanceof C68484NKb) {
                    0qQ.A0A(r22);
                    0s1 r0 = new 0s1(r22);
                    r0.A03(A0R);
                    r0.A01();
                }
            }
            setItems(this.A06.A01());
            oSf = this.A07;
            int A032 = this.A08.A03();
            boolean z4 = this.A08.A08;
            A1E = AnonymousClass7TE.A1E();
            A1E.put("icebreaker_num", String.valueOf(A032));
            String str4 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            String str5 = "0";
            if (z4) {
                str5 = str4;
            }
            A1E.put("enabled_status", str5);
            if (!z2) {
                str4 = "0";
            }
            A1E.put("show_import_option", str4);
            str = null;
            str2 = "icebreaker_settings_question_list_screen_impression";
        } else if (intValue != 0) {
            EmptyStateView emptyStateView = this.mEmptyStateView;
            C320156rr r23 = C320156rr.ERROR;
            emptyStateView.A0T(r23, 2131959379);
            this.mEmptyStateView.A0Q(r23, 2131959386);
            this.mEmptyStateView.A0O(this, r23);
            this.mEmptyStateView.A0J();
            oSf = this.A07;
            A1E = AnonymousClass7TE.A1E();
            A1E.put(TraceFieldType.ErrorCode, "FETCH_QUESTIONS_REQUEST_FAILURE");
            str = "There was a HTTP request failure to load icebreaker questions from server";
            str2 = "icebreaker_settings_error_screen_impression";
        } else {
            this.mEmptyStateView.A0P(C320156rr.LOADING);
            return;
        }
        C70932OSf.A00(oSf, str2, str, A1E);
    }

    public final void CtL() {
        Toast toast = this.A02;
        if (toast != null) {
            toast.cancel();
            this.A02 = null;
        }
        OVT.A00(this);
        C69863NtR.A00(this.A00, 2131974093);
        C70932OSf oSf = this.A07;
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put(TraceFieldType.ErrorCode, "TOGGLE_SHOW_QUESTIONS_STATUS_REQUEST_FAILURE");
        C70932OSf.A00(oSf, "icebreaker_settings_error_screen_impression", "There was a HTTP request failure to toggle icebreaker show questions switch button", A1E);
    }

    public final void CtU() {
        this.A02 = C59689JTv.A01(this.A00, (String) null, 2131959389, 1);
        2dZ.A0t.A03(this.A03).EVS(false);
    }

    public final void CtV() {
        Toast toast = this.A02;
        if (toast != null) {
            toast.cancel();
            this.A02 = null;
        }
        2dZ.A0t.A03(this.A03).EVS(true);
    }

    public final void DBy() {
        this.mEmptyStateView.A0P(C320156rr.LOADING);
        this.A08.A05();
    }

    public final void configureActionBar(2da r4) {
        OyN oyN = this.A08;
        if (oyN.A06 || oyN.A04() != AnonymousClass05K.A0N) {
            r4.Eom(2131959377);
            AnonymousClass3JR A0K = DbS.A0K();
            A0K.A00();
            DbX.A1A(new C71407Ok6(this, 66), A0K, r4);
        }
    }

    public final AnonymousClass0wW getSession() {
        return this.A04;
    }

    public final boolean onBackPressed() {
        if (!this.A0B) {
            return false;
        }
        this.A0B = false;
        C48751Eja.A00(requireActivity(), this.A04);
        return true;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 17465) {
            A07(this, false);
        }
        if (intent != null && intent.getIntExtra("should_seen_messaging_hub_afterparty_dialog", -1) == 504) {
            this.A0B = true;
        }
        if (i == 17465 && i2 == 0 && this.A08.A04() == AnonymousClass05K.A0N) {
            A06(this);
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-459228465);
        super.onCreate(bundle);
        this.A03 = requireActivity();
        this.A00 = requireContext();
        Bundle requireArguments = requireArguments();
        this.A01 = requireArguments;
        this.A04 = DbS.A0U(requireArguments);
        this.A09 = this.A01.getString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "business_settings");
        OyN A002 = OyN.A00(this.A04);
        this.A08 = A002;
        A002.A04 = this;
        A002.A03 = this.A0C;
        this.A07 = new C70932OSf(this, this.A04);
        UserSession userSession = this.A04;
        Context context = this.A00;
        FragmentActivity fragmentActivity = this.A03;
        OyN oyN = this.A08;
        this.A06 = new OVT(fragmentActivity, context, AnonymousClass1Nd.A00(userSession), userSession, this, this.A07, oyN, this.A09);
        UserSession userSession2 = this.A04;
        FragmentActivity fragmentActivity2 = this.A03;
        0hq childFragmentManager = getChildFragmentManager();
        AnonymousClass7TG.A1O(userSession2, fragmentActivity2);
        C70761OKh oKh = new C70761OKh(userSession2, fragmentActivity2);
        oKh.A00 = childFragmentManager;
        this.A05 = oKh;
        AnonymousClass0fD.A09(-1935793505, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(507197975);
        View A0C2 = DbT.A0C(layoutInflater, viewGroup, R.layout.layout_listview_with_empty_state);
        AnonymousClass0fD.A09(-595563091, A022);
        return A0C2;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(49496972);
        super.onDestroy();
        OyN oyN = this.A08;
        oyN.A04 = null;
        oyN.A03 = null;
        OVT ovt = this.A06;
        if (ovt != null) {
            ovt.A02.A02(ovt.A03, C71889OsX.class);
        }
        AnonymousClass0fD.A09(57037523, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(1463217217);
        super.onResume();
        A08();
        AnonymousClass0fD.A09(2138543227, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        View view2 = this.mEmptyView;
        view2.getClass();
        this.mEmptyStateView = (EmptyStateView) view2;
    }
}
