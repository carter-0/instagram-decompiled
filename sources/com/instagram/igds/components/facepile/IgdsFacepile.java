package com.instagram.igds.components.facepile;

import X.00k;
import X.0qQ;
import X.AnonymousClass05K;
import X.AnonymousClass7TE;
import X.C244323b0;
import X.C71382cm;
import X.DbX;
import X.Dbb;
import X.FCA;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.List;

public final class IgdsFacepile extends FrameLayout {
    public int A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgdsFacepile(Context context) {
        super(context);
        0qQ.A0B(context, 1);
        A00(context, (AttributeSet) null);
    }

    public final void setImageBitmaps(List list, String str) {
        0qQ.A0B(list, 0);
        setImageBitmaps(list, 3, str);
    }

    public final void setImageDrawables(List list) {
        0qQ.A0B(list, 0);
        if (list.size() >= 1) {
            ImageView A0J = DbX.A0J(this, R.id.facepile_avatar_left);
            A0J.setImageDrawable((Drawable) 00k.A0O(list, 0));
            A0J.setVisibility(0);
            ImageView A0J2 = DbX.A0J(this, R.id.facepile_avatar_center);
            A0J2.setImageDrawable((Drawable) 00k.A0O(list, 1));
            A0J2.setVisibility(0);
            ImageView A0J3 = DbX.A0J(this, R.id.facepile_avatar_right);
            A0J3.setImageDrawable((Drawable) 00k.A0O(list, 2));
            A0J3.setVisibility(0);
        }
    }

    public final void setImageUris(List list, String str) {
        0qQ.A0B(list, 0);
        setImageUris(list, 3, str);
    }

    private final void setStandardPileBitmaps(List list, int i, String str) {
        int i2 = i;
        ImageView A0J = DbX.A0J(this, R.id.facepile_holder);
        Context A0S = AnonymousClass7TE.A0S(this);
        List list2 = list;
        0qQ.A0B(list2, 1);
        Resources resources = A0S.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.biz_sign_up_divider_bottom_margin);
        ArrayList A1C = AnonymousClass7TE.A1C();
        int size = list2.size();
        if (i2 > size) {
            i2 = size;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            Context context = A0S;
            A1C.add(FCA.A00(context, (Bitmap) 00k.A0O(list2, i3), str, resources.getDimensionPixelSize(R.dimen.biz_sign_up_divider_bottom_margin), resources.getDimensionPixelSize(R.dimen.audience_lists_text_in_badge_horizontal_margin_right), A0S.getColor(R.color.barcelona_story_share_light_mode)));
        }
        A0J.setImageDrawable(new C244323b0(A0S, AnonymousClass05K.A00, A1C, 0.42f, dimensionPixelSize, true));
    }

    private final void A00(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C71382cm.A17, 0, 0);
        0qQ.A07(obtainStyledAttributes);
        this.A00 = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        int i = this.A00;
        int i2 = R.layout.facepile_standard;
        if (i == 1) {
            i2 = R.layout.facepile_large;
        }
        View.inflate(context, i2, this);
    }

    private final void setLargePileBitmaps(List list, String str) {
        ImageView A0J = DbX.A0J(this, R.id.facepile_avatar_left);
        Context A0S = AnonymousClass7TE.A0S(this);
        String str2 = str;
        A0J.setImageDrawable(FCA.A00(A0S, (Bitmap) 00k.A0O(list, 0), str2, Dbb.A01(A0S), 0, 0));
        A0J.setVisibility(0);
        ImageView A0J2 = DbX.A0J(this, R.id.facepile_avatar_center);
        Resources resources = A0S.getResources();
        A0J2.setImageDrawable(FCA.A00(A0S, (Bitmap) 00k.A0O(list, 1), str2, resources.getDimensionPixelSize(R.dimen.bio_product_sticker_width), resources.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material), A0S.getColor(R.color.canvas_bottom_sheet_description_text_color)));
        A0J2.setVisibility(0);
        ImageView A0J3 = DbX.A0J(this, R.id.facepile_avatar_right);
        A0J3.setImageDrawable(FCA.A00(A0S, (Bitmap) 00k.A0O(list, 2), str2, Dbb.A01(A0S), 0, 0));
        A0J3.setVisibility(0);
    }

    private final void setLargePileUris(List list, String str) {
        ImageView A0J = DbX.A0J(this, R.id.facepile_avatar_left);
        Context A0S = AnonymousClass7TE.A0S(this);
        String str2 = str;
        A0J.setImageDrawable(FCA.A01(A0S, (ImageUrl) 00k.A0O(list, 0), str2, Dbb.A01(A0S), 0, 0));
        A0J.setVisibility(0);
        ImageView A0J2 = DbX.A0J(this, R.id.facepile_avatar_center);
        Resources resources = A0S.getResources();
        A0J2.setImageDrawable(FCA.A01(A0S, (ImageUrl) 00k.A0O(list, 1), str2, resources.getDimensionPixelSize(R.dimen.bio_product_sticker_width), resources.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material), A0S.getColor(R.color.canvas_bottom_sheet_description_text_color)));
        A0J2.setVisibility(0);
        ImageView A0J3 = DbX.A0J(this, R.id.facepile_avatar_right);
        A0J3.setImageDrawable(FCA.A01(A0S, (ImageUrl) 00k.A0O(list, 2), str2, Dbb.A01(A0S), 0, 0));
        A0J3.setVisibility(0);
    }

    private final void setStandardPileUris(List list, int i, String str) {
        ImageView A0J = DbX.A0J(this, R.id.facepile_holder);
        0qQ.A0B(list, 1);
        A0J.setImageDrawable(FCA.A02(AnonymousClass7TE.A0S(this), str, list, i, R.dimen.biz_sign_up_divider_bottom_margin, R.dimen.audience_lists_text_in_badge_horizontal_margin_right));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgdsFacepile(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        A00(context, attributeSet);
    }

    public final void setImageBitmaps(List list, int i, String str) {
        0qQ.A0B(list, 0);
        if (i >= 1 && list.size() >= 1) {
            if (this.A00 == 1) {
                setLargePileBitmaps(list, str);
            } else {
                setStandardPileBitmaps(list, i, str);
            }
        }
    }

    public final void setImageUris(List list, int i, String str) {
        0qQ.A0B(list, 0);
        if (i >= 1 && list.size() >= 1) {
            if (this.A00 == 1) {
                setLargePileUris(list, str);
            } else {
                setStandardPileUris(list, i, str);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgdsFacepile(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        A00(context, attributeSet);
    }
}
