package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel;
import com.instagram.creation.fragment.EditMediaInfoFragment;
import com.instagram.creation.fragment.ShareLaterFragment;
import com.instagram.creation.fragment.followersshare.FollowersShareFragment;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.ui.widget.textview.IgAutoCompleteTextView;
import instagram.features.clips.edit.ClipsEditMetadataController;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class M17 implements AnonymousClass8Wm {
    public final int A00;
    public final Object A01;

    public M17(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final String AbO() {
        switch (this.A00) {
            case 1:
                return "caption_edit";
            case 2:
                return "caption_repost";
            default:
                return AnonymousClass000.A00(2770);
        }
    }

    public final /* synthetic */ void Cxz() {
        Fragment fragment;
        switch (this.A00) {
            case 0:
                return;
            case 1:
                fragment = (EditMediaInfoFragment) this.A01;
                fragment.A0r = true;
                EditMediaInfoFragment.A0F(fragment);
                AnonymousClass7TF.A16(fragment.mPostOverlayView);
                IgAutoCompleteTextView igAutoCompleteTextView = fragment.mCaption;
                if (igAutoCompleteTextView != null) {
                    igAutoCompleteTextView.clearFocus();
                    break;
                }
                break;
            case 2:
                fragment = (ShareLaterFragment) this.A01;
                IgAutoCompleteTextView igAutoCompleteTextView2 = fragment.A05;
                if (igAutoCompleteTextView2 != null) {
                    igAutoCompleteTextView2.clearFocus();
                    DbU.A0L(fragment, 2dZ.A0t).setIsLoading(false);
                    break;
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            case 3:
                FollowersShareFragment followersShareFragment = (FollowersShareFragment) this.A01;
                FollowersShareFragment.A0K(followersShareFragment, true);
                0nA.A0N(followersShareFragment.mView);
                LQa.A01(followersShareFragment).clearFocus();
                return;
            case 4:
                LBG lbg = ((K66) this.A01).A06;
                if (lbg == null) {
                    0qQ.A0F("viewHolder");
                    throw AnonymousClass00P.createAndThrow();
                }
                View view = lbg.A00;
                C63892LAv lAv = lbg.A08;
                IgdsButton igdsButton = lAv.A07;
                IgdsButton igdsButton2 = lAv.A06;
                AnonymousClass7TG.A1Q(igdsButton, igdsButton2);
                view.setVisibility(0);
                igdsButton.setEnabled(false);
                igdsButton2.setEnabled(false);
                return;
            default:
                ClipsEditMetadataController clipsEditMetadataController = (ClipsEditMetadataController) this.A01;
                clipsEditMetadataController.A0b = true;
                ClipsEditMetadataController.A0C(clipsEditMetadataController);
                return;
        }
        View view2 = fragment.mView;
        if (view2 != null) {
            0nA.A0N(view2);
        }
    }

    public final /* synthetic */ void DND() {
        if (3 - this.A00 == 0) {
            CallerContext callerContext = FollowersShareFragment.A10;
            ((FollowersShareFragment) this.A01).A0N = "475590606393264";
        }
    }

    public final /* synthetic */ void DuW() {
        IgAutoCompleteTextView igAutoCompleteTextView;
        switch (this.A00) {
            case 1:
                igAutoCompleteTextView = ((EditMediaInfoFragment) this.A01).mCaption;
                if (igAutoCompleteTextView == null) {
                    return;
                }
                break;
            case 2:
                igAutoCompleteTextView = ((ShareLaterFragment) this.A01).A05;
                if (igAutoCompleteTextView == null) {
                    throw AnonymousClass7TE.A0y();
                }
                break;
            case 3:
                FollowersShareFragment followersShareFragment = (FollowersShareFragment) this.A01;
                LQa.A01(followersShareFragment).requestFocus();
                if (!"475590606393264".equals(followersShareFragment.A0N)) {
                    followersShareFragment.A0N = "2420199268222207";
                    return;
                }
                return;
            case 5:
                igAutoCompleteTextView = ((ClipsEditMetadataController) this.A01).A0J();
                break;
            default:
                return;
        }
        igAutoCompleteTextView.requestFocus();
    }

    public final /* synthetic */ void E09() {
        switch (this.A00) {
            case 1:
                EditMediaInfoFragment editMediaInfoFragment = (EditMediaInfoFragment) this.A01;
                editMediaInfoFragment.A0r = false;
                EditMediaInfoFragment.A0F(editMediaInfoFragment);
                AnonymousClass7TH.A0R(editMediaInfoFragment.mPostOverlayView);
                return;
            case 3:
                FollowersShareFragment.A0K((FollowersShareFragment) this.A01, false);
                return;
            case 4:
                LBG lbg = ((K66) this.A01).A06;
                if (lbg == null) {
                    0qQ.A0F("viewHolder");
                    throw AnonymousClass00P.createAndThrow();
                }
                View view = lbg.A00;
                C63892LAv lAv = lbg.A08;
                IgdsButton igdsButton = lAv.A07;
                IgdsButton igdsButton2 = lAv.A06;
                AnonymousClass7TG.A1Q(igdsButton, igdsButton2);
                view.setVisibility(8);
                igdsButton.setEnabled(true);
                igdsButton2.setEnabled(true);
                return;
            case 5:
                ClipsEditMetadataController clipsEditMetadataController = (ClipsEditMetadataController) this.A01;
                clipsEditMetadataController.A0b = false;
                ClipsEditMetadataController.A0C(clipsEditMetadataController);
                return;
            default:
                return;
        }
    }

    public final /* synthetic */ void E0A() {
        if (3 - this.A00 == 0) {
            FollowersShareFragment followersShareFragment = (FollowersShareFragment) this.A01;
            CallerContext callerContext = FollowersShareFragment.A10;
            String str = followersShareFragment.A0N;
            if (str == null || str.length() == 0) {
                followersShareFragment.A0N = "683412648733504";
            }
        }
    }

    public final void E3I() {
        List list;
        C63801L7h l7h;
        switch (this.A00) {
            case 0:
                C61438K7n k7n = (C61438K7n) this.A01;
                k7n.A07 = true;
                C61438K7n.A04(k7n);
                return;
            case 1:
                EditMediaInfoFragment editMediaInfoFragment = (EditMediaInfoFragment) this.A01;
                editMediaInfoFragment.A0r = false;
                EditMediaInfoFragment.A0F(editMediaInfoFragment);
                if (!editMediaInfoFragment.A0n || editMediaInfoFragment.A0N.A01.getBoolean("has_seen_boost_edit_caption_confirmation_dialog", false)) {
                    EditMediaInfoFragment.A08(editMediaInfoFragment);
                    return;
                } else {
                    EditMediaInfoFragment.A01(editMediaInfoFragment.requireActivity(), editMediaInfoFragment);
                    return;
                }
            case 2:
                2dY r1 = 2dZ.A0t;
                ShareLaterFragment shareLaterFragment = (ShareLaterFragment) this.A01;
                Dba.A0n(shareLaterFragment.requireActivity(), r1);
                shareLaterFragment.A09 = JTQ.A0k();
                0mM r12 = new 0mM(AnonymousClass7TF.A0D(), new C64889Ljp(shareLaterFragment, 6), 15000);
                shareLaterFragment.A01 = r12;
                r12.A01(AnonymousClass7TF.A0b());
                return;
            case 3:
                FollowersShareFragment.A0G((FollowersShareFragment) this.A01);
                return;
            case 4:
                K66 k66 = (K66) this.A01;
                boolean z = ClipsSharingDraftViewModel.A00(k66).A17;
                String A07 = K66.A07(k66);
                K1L k1l = K66.A06(k66).A00;
                if (k1l == null || (l7h = k1l.A00) == null) {
                    list = null;
                } else {
                    list = l7h.A02;
                }
                K66.A0O(k66, A07, ClipsSharingDraftViewModel.A00(k66).A0X, k66.getModuleName(), list, z);
                return;
            default:
                ClipsEditMetadataController clipsEditMetadataController = (ClipsEditMetadataController) this.A01;
                clipsEditMetadataController.A0b = false;
                ClipsEditMetadataController.A0C(clipsEditMetadataController);
                ClipsEditMetadataController.A09(clipsEditMetadataController);
                return;
        }
    }

    public final List getContent() {
        String str;
        String A07;
        switch (this.A00) {
            case 0:
                AnonymousClass3Q2 A002 = C61438K7n.A00((C61438K7n) this.A01);
                ArrayList A1C = AnonymousClass7TE.A1C();
                if (A002 != null) {
                    for (C282705Ek r0 : A002.A4h) {
                        String str2 = r0.A09;
                        if (str2 != null) {
                            A1C.add(str2);
                        }
                    }
                }
                if (!A1C.isEmpty()) {
                    return A1C;
                }
                A1C.add("");
                return A1C;
            case 1:
                EditMediaInfoFragment editMediaInfoFragment = (EditMediaInfoFragment) this.A01;
                IgAutoCompleteTextView igAutoCompleteTextView = editMediaInfoFragment.mCaption;
                if (igAutoCompleteTextView == null || igAutoCompleteTextView.getText() == null) {
                    str = "";
                } else {
                    str = AnonymousClass7TF.A0f(editMediaInfoFragment.mCaption);
                }
                return Collections.singletonList(str);
            case 2:
                IgAutoCompleteTextView igAutoCompleteTextView2 = ((ShareLaterFragment) this.A01).A05;
                if (igAutoCompleteTextView2 != null) {
                    A07 = AnonymousClass7TF.A0f(igAutoCompleteTextView2);
                    break;
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            case 3:
                A07 = FollowersShareFragment.A06((FollowersShareFragment) this.A01);
                break;
            case 4:
                A07 = K66.A07((K66) this.A01);
                break;
            default:
                A07 = ClipsEditMetadataController.A00((ClipsEditMetadataController) this.A01);
                break;
        }
        return AnonymousClass7TE.A1I(A07);
    }
}
