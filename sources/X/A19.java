package X;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.reels.smb.model.ProfileStickerAiAgentData;
import com.instagram.reels.smb.model.ProfileStickerModel;
import com.instagram.user.model.User;

public abstract class A19 {
    public static final void A00(Activity activity, 28D r19, UserSession userSession, ProfileStickerAiAgentData profileStickerAiAgentData, User user, Integer num) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 0);
        Bundle A0a = AnonymousClass7TE.A0a();
        User user2 = user;
        Integer num2 = num;
        ProfileStickerModel profileStickerModel = new ProfileStickerModel(C317876nz.A1Y, profileStickerAiAgentData, user2, ProfileStickerModel.A08, num2);
        A0a.putParcelable("ReelProfileStickerConstants.ARGUMENTS_KEY_SUPPORT_BUSINESS_MODEL", profileStickerModel);
        A0a.putSerializable("ReelProfileStickerConstants.ARGUMENTS_KEY_CAMERA_ENTRY_POINT", r19);
        A0a.putParcelable("ReelProfileStickerConstants.ARGUMENTS_KEY_TARGET_GROUP_PROFILE", (Parcelable) null);
        Activity activity2 = activity;
        if (num2 != AnonymousClass05K.A00) {
            ImageUrl Bh3 = user2.Bh3();
            String A01 = 2RR.A01();
            int color = activity2.getColor(R.color.sticker_background);
            FZF fzf = new FZF(activity2, A0a, userSession2, 3);
            int A03 = AnonymousClass7TF.A03(activity2, R.attr.igds_color_media_background);
            DisplayMetrics A0E = AnonymousClass7TF.A0E(activity2);
            0qQ.A07(A0E);
            0nY.A00().ATE(new KJF(A0E, Bh3, fzf, A01, 25, color, A03));
        } else {
            AnonymousClass6W8.A02(activity2, A0a, userSession2, TransparentModalActivity.class, C273654mx.A00(928)).A0C(activity2);
        }
        User user3 = profileStickerModel.A03;
        if (user3 != null && user3.A03.AaU() != null) {
            new LTH(userSession2).A07(user3.A03.AaX(), user3.A03.AaU(), true);
        }
    }
}
