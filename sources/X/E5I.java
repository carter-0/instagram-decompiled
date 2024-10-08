package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import java.util.ArrayList;
import java.util.List;

public final class E5I extends AnonymousClass4DH implements G9Y, AbsListView.OnScrollListener, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "DirectThreadMemberPickFragment";
    public int A00 = 0;
    public int A01 = 0;
    public UserSession A02;
    public FBR A03;
    public C67089Mi7 A04;
    public C254793t3 A05;
    public C67350MmR A06 = C67350MmR.DEFAULT;
    public String A07;
    public ArrayList A08 = AnonymousClass7TE.A1C();
    public ArrayList A09 = AnonymousClass7TE.A1C();
    public boolean A0A;
    public boolean A0B;
    public C252243on A0C;
    public AnonymousClass7ZA A0D;
    public String A0E;
    public List A0F;
    public boolean A0G;
    public boolean A0H;

    public final /* synthetic */ void CxV() {
    }

    public final /* synthetic */ void Dbt() {
    }

    public final /* synthetic */ void Dhe() {
    }

    public final /* synthetic */ void Dhg(View view, boolean z) {
    }

    public final /* synthetic */ void E0n() {
    }

    public final void E0p(String str, String str2) {
    }

    public final /* synthetic */ void E0q() {
    }

    public final /* synthetic */ void E0v() {
    }

    public final void E1C(DirectShareTarget directShareTarget) {
    }

    public final void E1L(DirectShareTarget directShareTarget) {
    }

    public final void E1M(DirectShareTarget directShareTarget) {
    }

    public final String getModuleName() {
        return "direct_thread_add_member";
    }

    public final /* synthetic */ C46730DkJ BIm() {
        return null;
    }

    public final void Dbv() {
        0KC.A0E(__redex_internal_original_name, "RecipientPickerController is null");
    }

    public final void configureActionBar(2da r5) {
        int i;
        if (!this.A08.isEmpty()) {
            int i2 = 2131958700;
            if (this.A01 == 29) {
                i2 = 2131958923;
            }
            r5.AA9(FP8.A00(this, 35), i2);
        } else if (this.A0E != null) {
            if (DbY.A1Y(0Tu.A05, this.A02, 36324578531815590L)) {
                String str = this.A0E;
                AnonymousClass3JR A0K = DbS.A0K();
                A0K.A06 = R.drawable.instagram_link_pano_outline_24;
                A0K.A05 = 2131963172;
                DbX.A19(new C50101FOr(this, str, 6), A0K, r5);
            }
        }
        if (this.A01 == 29) {
            i = 2131958924;
            if (this.A06 == C67350MmR.ADMINS_AND_MODERATORS) {
                i = 2131958925;
            }
        } else {
            i = 2131958570;
        }
        DbW.A1B(r5, i);
    }

    public final AnonymousClass0wW getSession() {
        return this.A02;
    }

    public final boolean onBackPressed() {
        String str;
        C252243on r4 = this.A0C;
        if (r4 == null || !(r4 instanceof EEO)) {
            return false;
        }
        EEO eeo = (EEO) r4;
        C67089Mi7 mi7 = eeo.A09;
        UserSession userSession = eeo.A07;
        AnonymousClass0iw r1 = eeo.A06;
        C337257fy r0 = eeo.A01;
        if (r0 == null || (str = r0.BiY()) == null) {
            str = "";
        }
        mi7.A07(r1, userSession, str);
        return false;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(526276078);
        E5I.super.onCreate(bundle);
        this.A02 = DbX.A0U(this);
        C254783t2 A002 = AnonymousClass9H0.A00(requireArguments(), "DirectThreadMemberPickFragment.THREAD_ID");
        A002.getClass();
        this.A05 = (C254793t3) A002;
        this.A07 = requireArguments().getString("DirectThreadMemberPickFragment.THREAD_V2_ID");
        this.A0H = requireArguments().getBoolean("DirectThreadMemberPickFragment.ARGUMENT_IS_ADMIN_APPROVAL_REQUIRED");
        ArrayList<String> stringArrayList = requireArguments().getStringArrayList("DirectThreadMemberPickFragment.ARGUMENT_EXCLUDED_IDS");
        stringArrayList.getClass();
        this.A0F = stringArrayList;
        this.A0B = requireArguments().getBoolean("DirectThreadMemberPickFragment.ARGUMENT_IS_INTEROP_THREAD");
        this.A0G = requireArguments().getBoolean("DirectThreadMemberPickFragment.ARGUMENT_HAS_EPD_RESTRICTED_MEMBER");
        ArrayList parcelableArrayList = requireArguments().getParcelableArrayList(C66579MXk.A00(94));
        parcelableArrayList.getClass();
        this.A09 = parcelableArrayList;
        this.A01 = requireArguments().getInt("DirectThreadMemberPickFragment.THREAD_SUBTYPE");
        this.A00 = requireArguments().getInt("DirectThreadMemberPickFragment.AUDIENCE_TYPE");
        this.A0E = requireArguments().getString("DirectThreadMemberPickFragment.GROUP_INVITE_LINK");
        this.A0A = requireArguments().getBoolean("DirectThreadMemberPickFragment.IS_ADMIN");
        String string = requireArguments().getString("DirectThreadMemberPickFragment.ARGUMENT_HEADER_TYPE");
        if (string != null) {
            this.A06 = C67350MmR.valueOf(string);
        }
        this.A0D = C69942Nui.A00(this.A02, this.A05);
        this.A04 = C67089Mi7.A00(this.A02, false);
        Context requireContext = requireContext();
        0gy A003 = AnonymousClass07i.A00(this);
        UserSession userSession = this.A02;
        List list = this.A0F;
        int i = requireArguments().getInt("DirectThreadMemberPickFragment.ARGUMENT_COLLABORATOR_COUNT");
        int i2 = requireArguments().getInt("DirectThreadMemberPickFragment.ARGUMENT_MODERATOR_COUNT");
        C254793t3 r1 = this.A05;
        0qQ.A0B(r1, 0);
        int i3 = this.A01;
        C67350MmR mmR = this.A06;
        EEO eeo = new EEO(requireContext, A003, this, userSession, this, this.A04, mmR, list, i, i2, i3, r1 instanceof MsysThreadId);
        this.A0C = eeo;
        registerLifecycleListener(eeo);
        UserSession userSession2 = this.A02;
        C254793t3 r11 = this.A05;
        String str = this.A07;
        ArrayList arrayList = this.A09;
        AnonymousClass7ZA r9 = this.A0D;
        boolean z = this.A0H;
        boolean z2 = this.A0B;
        boolean z3 = this.A0G;
        int i4 = this.A01;
        int i5 = this.A00;
        this.A03 = new FBR(this, userSession2, r9, this.A04, r11, this.A06, str, arrayList, i4, i5, z, z2, z3);
        AnonymousClass0fD.A09(-276592092, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1245030185);
        FragmentActivity requireActivity = requireActivity();
        if (requireActivity.getParent() != null && (requireActivity.getParent() instanceof AnonymousClass2ZP)) {
            ((AnonymousClass2ZP) requireActivity.getParent()).Enj(8);
        }
        View A0C2 = DbT.A0C(layoutInflater, viewGroup, R.layout.fragment_direct_thread_member_pick);
        AnonymousClass0fD.A09(-1318995996, A022);
        return A0C2;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-866704952);
        super.onDestroy();
        this.A03.A04.A01();
        AnonymousClass0fD.A09(510516776, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1766190165);
        super.onDestroyView();
        FragmentActivity requireActivity = requireActivity();
        if (requireActivity.getParent() != null && (requireActivity.getParent() instanceof AnonymousClass2ZP)) {
            ((AnonymousClass2ZP) requireActivity.getParent()).Enj(0);
        }
        AnonymousClass0fD.A09(1980488104, A022);
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        AnonymousClass0fD.A0A(877054195, AnonymousClass0fD.A03(869369081));
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        AnonymousClass0fD.A0A(1520292410, AnonymousClass0fD.A03(1489746597));
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        View requireViewById = view.requireViewById(R.id.direct_invite_link_row);
        String str = this.A0E;
        if (str != null) {
            UserSession userSession = this.A02;
            0Tu r5 = 0Tu.A05;
            if (DbY.A1Y(r5, userSession, 36314562668464817L) && this.A01 != 29 && !DbY.A1Y(r5, this.A02, 36324578531815590L)) {
                requireViewById.setVisibility(0);
                ((IgdsListCell) requireViewById.requireViewById(R.id.invite_link_text_cell)).A0H(str);
                AnonymousClass0fU.A00(new C50101FOr(this, str, 5), requireViewById);
                return;
            }
        }
        requireViewById.setVisibility(8);
    }
}
