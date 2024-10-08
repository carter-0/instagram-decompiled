package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.api.schemas.SMBSupportStickerDict;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.user.model.User;

/* renamed from: X.E5v  reason: case insensitive filesystem */
public final class C47512E5v extends AnonymousClass4DH implements C273494mf {
    public static final String __redex_internal_original_name = "SmbSupportStickerBottomSheetFragment";
    public C331157Pu A00;
    public C255773uh A01;
    public C18603Vuw A02;
    public final AnonymousClass0eM A03 = C227642jf.A02(this);

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return "smb_support_sticker_bottom_sheet";
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        User user;
        int i;
        String str;
        String A0h;
        String str2;
        String str3;
        String str4;
        String str5;
        Integer num;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        TextView A0R = AnonymousClass7TG.A0R(view2, R.id.title);
        TextView A0R2 = AnonymousClass7TG.A0R(view2, R.id.subtitle);
        IgImageView A0b = DbX.A0b(view2, R.id.avatar);
        TextView A0R3 = AnonymousClass7TG.A0R(view2, R.id.action_text);
        View A0G = AnonymousClass7TF.A0G(view2, R.id.share_to_story);
        TextView A0R4 = AnonymousClass7TG.A0R(view2, R.id.text_disclaimer);
        AnonymousClass0eM r6 = this.A03;
        r6.getValue();
        requireActivity();
        C18603Vuw vuw = this.A02;
        String str12 = null;
        if (vuw != null) {
            user = vuw.A00();
            Integer A012 = vuw.A01();
            if (A012 != null) {
                i = A012.intValue();
            }
            i = -1;
        } else {
            user = null;
            i = -1;
        }
        Context A0S = AnonymousClass7TE.A0S(view2);
        if (i == 1) {
            if (user != null) {
                str = user.getUsername();
            } else {
                str = null;
            }
            A0h = DbW.A0h(A0S, str, 2131974056);
        } else if (i != 0) {
            if (user != null) {
                str11 = user.getUsername();
            } else {
                str11 = null;
            }
            A0h = DbW.A0h(A0S, str11, 2131974059);
        } else {
            if (user != null) {
                str10 = user.getUsername();
            } else {
                str10 = null;
            }
            A0h = DbW.A0h(A0S, str10, 2131974057);
        }
        0qQ.A0A(A0h);
        A0R.setText(A0h);
        if (vuw != null) {
            str2 = vuw.A00.A09;
        } else {
            str2 = null;
        }
        DbX.A13(A0S, A0R2, str2, 2131974058);
        if (vuw == null || (str9 = vuw.A00.A07) == null || str9.length() == 0) {
            A0R4.setVisibility(8);
        } else {
            A0R4.setText(str9);
            A0R4.setVisibility(0);
        }
        if (user != null) {
            DbU.A1S(this, A0b, user);
        }
        C50109FOz.A00(A0b, 36, this);
        if (!(vuw == null || (str8 = vuw.A00.A05) == null)) {
            A0R3.setText(str8);
        }
        C50109FOz.A00(A0R3, 37, this);
        C50109FOz.A00(A0G, 38, this);
        UserSession A0l = AnonymousClass7TE.A0l(r6);
        C255773uh r0 = this.A01;
        if (r0 != null) {
            str3 = r0.A0j;
        } else {
            str3 = null;
        }
        C18603Vuw vuw2 = this.A02;
        if (vuw2 != null) {
            str4 = vuw2.A00.A0A;
            User A002 = vuw2.A00();
            if (A002 != null) {
                str5 = AnonymousClass3ZA.A00(A002);
            }
            str5 = null;
        } else {
            str4 = null;
            str5 = null;
        }
        C18603Vuw vuw3 = this.A02;
        if (vuw3 != null) {
            num = vuw3.A01();
        } else {
            num = null;
        }
        C18603Vuw vuw4 = this.A02;
        if (vuw4 != null) {
            SMBSupportStickerDict sMBSupportStickerDict = vuw4.A00;
            str6 = sMBSupportStickerDict.A09;
            str7 = sMBSupportStickerDict.A06;
        } else {
            str6 = null;
            str7 = null;
        }
        0Aj A022 = C49959FGr.A02(DbT.A0Q(this, A0l, 0), A0l, "instagram_smb_partner_flow_consumer");
        DbS.A1H(A022, "story_viewer_bottom_sheet");
        DbS.A1J(A022, "view");
        A022.AAJ(C46346Dcp.A00(), AnonymousClass7TG.A0j());
        boolean z = true;
        if (str5 == null || !2R8.A07(A0l.A06, str5)) {
            z = false;
        }
        C49959FGr.A04(A022, str5, z);
        Dba.A1A(A022, str6, str7);
        if (num != null) {
            str12 = VG1.A00(num);
        }
        Dbc.A0d(A022, str12, str4, str3);
    }

    public final /* synthetic */ EVS backPressDestination() {
        return EVS.CLOSED_STATE;
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
        return DbS.A0T(this.A03);
    }

    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    public final /* synthetic */ boolean includeFragmentDragSpace() {
        return false;
    }

    public final /* synthetic */ boolean isElementAboveTitleEnabled() {
        return false;
    }

    public final /* synthetic */ boolean isScrolledToBottom() {
        return true;
    }

    public final /* synthetic */ boolean isScrolledToTop() {
        return true;
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-779785708);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.smb_support_sticker_bottom_sheet_view, viewGroup, false);
        AnonymousClass0fD.A09(651592626, A022);
        return inflate;
    }
}
