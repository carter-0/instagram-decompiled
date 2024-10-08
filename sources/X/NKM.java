package X;

import android.content.Context;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.igds.components.segmentedtabs.IgSegmentedTabLayout2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class NKM extends AnonymousClass4DH implements C273504mg {
    public static final String __redex_internal_original_name = "DirectReactionsPickerFragment";
    public OZV A00;
    public C74460PvF A01;
    public IgSegmentedTabLayout2 A02;
    public final AnonymousClass0eM A03 = AnonymousClass1YB.A00(C73921Pm1.A00(this, 34));
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05 = C227642jf.A02(this);
    public final AnonymousClass9HB A06 = new AnonymousClass9HB();

    public final String getModuleName() {
        return "direct_reactions_picker_fragment";
    }

    public final /* synthetic */ boolean includeFragmentDragSpace() {
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        List list;
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        if (requireArguments().getInt("fragment_thread_subtype", 0) == 29) {
            C67752Mu6 mu6 = (C67752Mu6) this.A04.getValue();
            ArrayList<String> stringArrayList = requireArguments().getStringArrayList("blocked_emojis_from_server");
            if (stringArrayList != null) {
                list = 00k.A0a(stringArrayList);
            } else {
                list = 0sn.A00;
            }
            05G r5 = mu6.A06;
            ArrayList A1C = AnonymousClass7TE.A1C();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A1C.add(C336957fS.A01(AnonymousClass7TE.A18(it)));
            }
            r5.Epw(00k.A0j(C67752Mu6.A00(A1C)));
        }
        Context requireContext = requireContext();
        UserSession A0l = AnonymousClass7TE.A0l(this.A05);
        0h9 r0 = this.mLifecycleRegistry;
        0qQ.A07(r0);
        boolean z = requireArguments().getBoolean("should_disable_reaction_edit_ability", false);
        String string = requireArguments().getString(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID);
        String string2 = requireArguments().getString("thread_v2_id");
        int i = requireArguments().getInt("audience_type", 0);
        boolean z2 = requireArguments().getBoolean("can_user_change_hidden_emoji", false);
        OZV ozv = new OZV(requireContext, view2, C71772f0.A00(r0), this, A0l, new O89(this), (C67752Mu6) this.A04.getValue(), this.A02, string, string2, i, requireArguments().getInt("fragment_thread_subtype", 0), z, z2);
        this.A00 = ozv;
        ozv.A02();
    }

    public final /* synthetic */ boolean doNotDismissOnDraggingDown() {
        return false;
    }

    public final /* synthetic */ boolean doNotDragWhenDismissLocked() {
        return false;
    }

    public final /* synthetic */ boolean doNotFlingWhenDismissLocked() {
        return false;
    }

    public final /* synthetic */ int dragLockBouncePx() {
        return 0;
    }

    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A05);
    }

    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    public final boolean isScrolledToBottom() {
        OZV ozv = this.A00;
        if (ozv != null) {
            return C2808154f.A02(ozv.A09);
        }
        0qQ.A0F("reactionsPickerController");
        throw AnonymousClass00P.createAndThrow();
    }

    public NKM() {
        C73921Pm1 A002 = C73921Pm1.A00(this, 35);
        AnonymousClass0eM A003 = AnonymousClass0eN.A00(0eO.A02, C73921Pm1.A00(C73921Pm1.A00(this, 36), 37));
        this.A04 = DbS.A0I(C73921Pm1.A00(A003, 38), A002, new C73667Phg(14, (Object) null, A003), DbS.A0z(C67752Mu6.class));
    }

    public final Context getContext() {
        int i = requireArguments().getInt("fragment_theme_override", 0);
        if (i == 0) {
            return NKM.super.getContext();
        }
        Context context = NKM.super.getContext();
        if (context != null) {
            return new ContextThemeWrapper(context, i);
        }
        throw AnonymousClass7TE.A0y();
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1462272855);
        0qQ.A0B(layoutInflater, 0);
        this.A06.A02(viewGroup);
        if (requireArguments().getInt("fragment_theme_override", 0) != 0) {
            layoutInflater = layoutInflater.cloneInContext(requireContext());
        }
        View inflate = layoutInflater.inflate(R.layout.fragment_reactions_picker, viewGroup, false);
        ViewGroup A0I = DbX.A0I(inflate, R.id.emoji_list_fragment_container);
        A0I.setBackgroundColor(2Yu.A0F(requireContext(), R.attr.elevatedBackgroundColor));
        0nA.A0r(A0I, new PWC(A0I));
        ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
        int i = requireArguments().getInt("fragment_max_height");
        if (i >= 0) {
            i += AnonymousClass2uJ.A00;
        }
        layoutParams.height = i;
        if (182.A06(0Tu.A05, DbT.A0X(this.A05), 36326816209844210L)) {
            C252063oV A0T = DbV.A0T(inflate, R.id.emoji_category_tabs_container_stub, false);
            this.A02 = (IgSegmentedTabLayout2) A0T.getView();
            A0T.getView().setBackgroundColor(2Yu.A0F(requireContext(), R.attr.elevatedBackgroundColor));
            Number A0r = C66580MXl.A0r(this.A03);
            if (A0r != null) {
                0nA.A0X(AnonymousClass7TF.A0G(inflate, R.id.recycler_view), A0r.intValue());
            }
        }
        AnonymousClass0fD.A09(-1807779499, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1423223866);
        this.A06.A01();
        this.A02 = null;
        super.onDestroyView();
        AnonymousClass0fD.A09(877573695, A022);
    }
}
