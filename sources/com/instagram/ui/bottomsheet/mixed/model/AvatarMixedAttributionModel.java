package com.instagram.ui.bottomsheet.mixed.model;

import X.0qQ;
import X.AnonymousClass7TF;
import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.ui.bottomsheet.mixed.model.MixedAttributionModel;

public final class AvatarMixedAttributionModel extends MixedAttributionModel {
    public final Integer A00;
    public final String A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarMixedAttributionModel(Context context, ImageUrl imageUrl, Integer num, Object obj, String str) {
        super(imageUrl, MixedAttributionModel.MixedAttributionType.AVATAR_ATTRIBUTION, AnonymousClass7TF.A0d(context.getResources(), 2131953521), AnonymousClass7TF.A0d(context.getResources(), 2131953520));
        0qQ.A0B(obj, 2);
        this.A01 = str;
        this.A00 = num;
        A00(context.getDrawable(R.drawable.instagram_sticker_pano_filled_24), obj);
    }

    public final boolean A01(MixedAttributionModel mixedAttributionModel) {
        if (!super.isContentSame(mixedAttributionModel) || !(mixedAttributionModel instanceof AvatarMixedAttributionModel) || !0qQ.A0K(this.A02, mixedAttributionModel.A02) || this.A00 != ((AvatarMixedAttributionModel) mixedAttributionModel).A00) {
            return false;
        }
        return true;
    }
}
