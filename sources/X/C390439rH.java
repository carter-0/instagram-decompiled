package X;

import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.ViewGroup;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.reels.smb.model.ProfileStickerModel;

/* renamed from: X.9rH  reason: invalid class name and case insensitive filesystem */
public final class C390439rH extends C15291UZw {
    public static final String __redex_internal_original_name = "ReelProfileStickerFragment";
    public 28D A00 = 28D.A5J;
    public PendingRecipient A01;
    public ProfileStickerModel A02;
    public String A03;

    public final AnonymousClass80D A02(ViewGroup viewGroup) {
        AnonymousClass802 r3;
        Context context;
        0qQ.A0B(viewGroup, 0);
        Context requireContext = requireContext();
        RectF A0C = AnonymousClass7TF.A0C((float) 0nA.A09(requireContext), (float) 0nA.A08(requireContext));
        AnonymousClass80D A002 = AnonymousClass80D.A00();
        AnonymousClass80D.A0C(A002, this.A03, this);
        AnonymousClass80I r32 = AnonymousClass80H.A02;
        UserSession userSession = this.A00;
        0qQ.A06(userSession);
        boolean z = false;
        AnonymousClass80D.A08(userSession, r32, AnonymousClass9QA.A00, A002);
        AnonymousClass80D.A05(viewGroup, A002, this, true);
        A002.A0B = this.A00;
        AnonymousClass80D.A03(A0C, this, A002);
        A002.A3g = true;
        ProfileStickerModel profileStickerModel = this.A02;
        A002.A1l = profileStickerModel;
        if (!(profileStickerModel == null || profileStickerModel.A02 == null)) {
            z = true;
        }
        A002.A31 = z;
        String str = this.A03;
        if (str != null) {
            Medium A032 = C282665Eg.A03(AnonymousClass7TE.A0t(str), 1, 0);
            ProfileStickerModel profileStickerModel2 = this.A02;
            if (profileStickerModel2 == null || profileStickerModel2.A02 == null || (context = getContext()) == null) {
                r3 = null;
            } else {
                C39889ADn aDn = new C39889ADn(context);
                aDn.A0B = true;
                aDn.A0D = true;
                r3 = aDn.A01();
                r3.A0E = true;
                r3.A0A = 00k.A0S(AnonymousClass802.A03(context), AnonymousClass802.A04(context, str));
            }
            A002.A0P = A032;
            A002.A0w = r3;
            A002.A3y = true;
        }
        PendingRecipient pendingRecipient = this.A01;
        if (pendingRecipient != null) {
            A002.A0y = AnonymousClass80E.GROUP_PROFILE;
            A002.A1S = pendingRecipient;
            return A002;
        }
        A002.A0y = AnonymousClass80E.ALL;
        return A002;
    }

    public final String getModuleName() {
        return "reel_support_business_profile_sticker_fragment";
    }

    public final void onCreate(Bundle bundle) {
        28D r1;
        int A022 = AnonymousClass0fD.A02(906554537);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        Object obj = requireArguments.get("ReelProfileStickerConstants.ARGUMENTS_KEY_CAMERA_ENTRY_POINT");
        if (!(obj instanceof 28D) || (r1 = (28D) obj) == null) {
            r1 = 28D.A5J;
        }
        this.A00 = r1;
        this.A02 = (ProfileStickerModel) requireArguments.getParcelable("ReelProfileStickerConstants.ARGUMENTS_KEY_SUPPORT_BUSINESS_MODEL");
        this.A01 = (PendingRecipient) requireArguments.getParcelable("ReelProfileStickerConstants.ARGUMENTS_KEY_TARGET_GROUP_PROFILE");
        this.A03 = requireArguments.getString(AnonymousClass000.A00(2470));
        AnonymousClass0fD.A09(824476911, A022);
    }
}
