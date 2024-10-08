package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.EditText;
import androidx.fragment.app.FragmentActivity;
import com.google.common.collect.ImmutableList;
import com.instagram.actionbar.ActionButton;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class E5J extends AnonymousClass4DH implements G9Y, C227272iw {
    public static final String __redex_internal_original_name = "DirectNewGroupCreationFragment";
    public Context A00;
    public EditText A01;
    public C48140EZi A02;
    public ActionButton A03;
    public UserSession A04;
    public C352178Ca A05;
    public EEP A06;
    public FZ0 A07;
    public IgdsButton A08;
    public String A09;
    public String A0A;
    public List A0B = AnonymousClass7TE.A1C();
    public boolean A0C;
    public boolean A0D;
    public String A0E;
    public String A0F;
    public final TextWatcher A0G = new FKk(this, 4);

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

    public static void A00(E5J e5j) {
        ActionButton actionButton;
        boolean z = false;
        if (e5j.A0B.size() >= 2) {
            z = true;
        }
        if (e5j.A0C) {
            actionButton = e5j.A03;
        } else {
            Dba.A0A(e5j).ARJ(z);
            actionButton = e5j.A08;
        }
        if (actionButton != null) {
            actionButton.setEnabled(z);
        }
    }

    public final /* synthetic */ C46730DkJ BIm() {
        return null;
    }

    public final boolean COC() {
        return !this.A0C;
    }

    public final void Dbv() {
        List A0N = this.A06.A0N();
        this.A0B = A0N;
        C352178Ca r2 = this.A05;
        if (r2 != null) {
            ImmutableList copyOf = ImmutableList.copyOf((Collection) A0N);
            0qQ.A0B(copyOf, 0);
            r2.A02.Epw(copyOf);
        }
        A00(this);
    }

    public final String getModuleName() {
        if (this.A0E.equals("reshare_sheet")) {
            return "direct_reshare_sheet";
        }
        return AnonymousClass000.A00(3012);
    }

    public final AnonymousClass0wW getSession() {
        return this.A04;
    }

    public final boolean onBackPressed() {
        if (this.A06.A0N() != null && EEP.A00(this.A06) > 1) {
            if (DbY.A1Y(0Tu.A05, this.A04, 36318917764848371L) && !this.A0D) {
                C358248ab A0U = DbW.A0U(this);
                A0U.A09(2131960132);
                A0U.A08(2131960131);
                A0U.A0K(C50023FJi.A00(this, 38), 2131960130);
                A0U.A0r(true);
                A0U.A0s(true);
                A0U.A05();
                DbT.A1V(A0U);
                return true;
            }
        }
        return this.A06.A0T();
    }

    public final void configureActionBar(2da r6) {
        r6.Eom(2131959842);
        UserSession userSession = this.A04;
        0Tu r4 = 0Tu.A05;
        if (Dbb.A1Y(r4, userSession)) {
            r6.Eom(2131959843);
        }
        boolean z = true;
        r6.Eu4(true);
        if (!DbY.A1Y(r4, this.A04, 36324385258287162L)) {
            ActionButton ErD = r6.ErD(FPI.A00(this, 52), R.drawable.instagram_check_pano_outline_24);
            if (this.A0B.size() < 2) {
                z = false;
            }
            ErD.setEnabled(z);
            DbT.A1A(DbV.A05(this), ErD, 2131959845);
        }
    }

    public final void onCreate(Bundle bundle) {
        ArrayList parcelableArrayList;
        int A022 = AnonymousClass0fD.A02(1703544252);
        E5J.super.onCreate(bundle);
        this.A00 = requireContext();
        Bundle requireArguments = requireArguments();
        this.A04 = DbX.A0U(this);
        this.A0E = requireArguments.getString("DirectVisualMessageCreateGroupFragment.DIRECT_MODULE", "reshare_sheet");
        this.A02 = (C48140EZi) requireArguments.getSerializable("bundle_extra_serializable_group_creation_entry_point");
        this.A0A = requireArguments.getString("bundle_query_share_sheet_session_id");
        this.A09 = AnonymousClass7TF.A0b();
        this.A07 = C49757F5i.A00(DbS.A0O(getModuleName()), this.A04);
        this.A0C = requireArguments.getBoolean("share_sheet_group_creation_bottom_sheet_mode", false);
        this.A0F = requireArguments.getString("DirectVisualMessageCreateGroupFragment.MEDIA_ID", (String) null);
        FragmentActivity activity = getActivity();
        if (!(activity == null || activity.getWindow() == null)) {
            if (DbY.A1Y(0Tu.A05, this.A04, 36324385258287162L)) {
                Dbb.A0w(this);
            }
        }
        UserSession userSession = this.A04;
        0Tu r4 = 0Tu.A05;
        if (DbY.A1Y(r4, userSession, 36324385258221625L) && (parcelableArrayList = requireArguments.getParcelableArrayList("bundle_extra_parcelable_new_group_selected_recipients")) != null) {
            Iterator it = parcelableArrayList.iterator();
            while (it.hasNext()) {
                this.A0B.add(new DirectShareTarget((PendingRecipient) it.next()));
            }
        }
        UserSession userSession2 = this.A04;
        this.A06 = new EEP((C48140EZi) null, userSession2, this, C67089Mi7.A00(userSession2, false), this.A0F, true, false, false, false, false, false, false, false, false);
        if (DbY.A1Y(r4, this.A04, 36324385259335753L)) {
            this.A06.A0G = AnonymousClass05K.A0C;
        }
        AnonymousClass0fD.A09(-134351729, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1650954467);
        View A0C2 = DbT.A0C(layoutInflater, viewGroup, R.layout.direct_story_create_group_fragment_layout);
        AnonymousClass0fD.A09(789612174, A022);
        return A0C2;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(936423132);
        super.onDestroy();
        this.A07.A08();
        AnonymousClass0fD.A09(-413372043, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1832052049);
        super.onDestroyView();
        this.A08 = null;
        AnonymousClass0fD.A09(793307504, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C49916FEq fEq;
        super.onViewCreated(view, bundle);
        UserSession userSession = this.A04;
        0Tu r4 = 0Tu.A05;
        if (DbY.A1Y(r4, userSession, 36324385258221625L)) {
            this.A06.A0R(this.A0B);
        }
        this.A01 = DbU.A0E(view, R.id.group_name);
        if (Dbb.A1Y(r4, this.A04)) {
            this.A01.setHint(2131960408);
        }
        if (this.A05 != null) {
            this.A01.addTextChangedListener(this.A0G);
        }
        if (this.A0C) {
            view.requireViewById(R.id.fake_action_bar).setVisibility(0);
            DbU.A0G(view, R.id.fake_action_bar_title).setText(2131959842);
            if (Dbb.A1Y(r4, this.A04)) {
                DbU.A0G(view, R.id.fake_action_bar_title).setText(2131959843);
            }
            ActionButton requireViewById = view.requireViewById(R.id.fake_action_bar_action_button);
            this.A03 = requireViewById;
            requireViewById.setButtonResource(R.drawable.instagram_check_pano_outline_24);
            DbT.A1A(DbV.A05(this), this.A03, 2131959845);
            FPI.A01(this.A03, 53, this);
            this.A03.setEnabled(false);
            ActionButton actionButton = this.A03;
            Context context = this.A00;
            actionButton.setColorFilter(DbV.A06(context, 2Yu.A0D(context)));
            FPI.A01(view.requireViewById(R.id.fake_action_bar_back_button), 54, this);
        } else {
            DbX.A1B(view, R.id.fake_action_bar);
            0nA.A0c(view, AnonymousClass3D4.A00(this.A00));
        }
        if (DbY.A1Y(r4, this.A04, 36318552692627685L) && (fEq = this.A06.A0B) != null) {
            fEq.A02.EHP();
            fEq.A02.Eug();
        }
        ViewStub A0F2 = DbS.A0F(view, R.id.send_to_group_button);
        if (A0F2 != null && DbY.A1Y(r4, this.A04, 36324385258287162L)) {
            IgdsButton igdsButton = (IgdsButton) A0F2.inflate();
            this.A08 = igdsButton;
            boolean z = false;
            igdsButton.setVisibility(0);
            IgdsButton igdsButton2 = this.A08;
            if (this.A0B.size() >= 2) {
                z = true;
            }
            igdsButton2.setEnabled(z);
            FPI.A01(this.A08, 51, this);
        }
    }
}
