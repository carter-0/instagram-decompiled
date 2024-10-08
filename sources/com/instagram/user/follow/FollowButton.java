package com.instagram.user.follow;

import X.0nA;
import X.0qQ;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.instagram.android.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class FollowButton extends FollowButtonBase {
    public boolean A00;
    public boolean A01;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FollowButton(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    private final void A00(Drawable drawable) {
        if (!this.A01 && drawable != null) {
            int i = R.dimen.abc_dialog_padding_material;
            if (!this.A00) {
                i = R.dimen.ab_test_media_thumbnail_preview_item_internal_padding;
            }
            0nA.A0l(this, i, R.dimen.abc_edit_text_inset_bottom_material, R.dimen.ab_test_media_thumbnail_preview_item_internal_padding, R.dimen.abc_edit_text_inset_bottom_material);
            setMinimumHeight(getResources().getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width));
            setGravity(17);
        } else if (this.A00) {
            0nA.A0l(this, R.dimen.abc_dialog_padding_material, R.dimen.abc_action_bar_elevation_material, R.dimen.ab_test_media_thumbnail_preview_item_internal_padding, R.dimen.abc_action_bar_elevation_material);
        } else if (this.A05) {
            A03();
        }
    }

    public final void setDisableImmersivePadding(boolean z) {
        if (z) {
            this.A08 = true;
        }
        if (!A07()) {
            this.A01 = z;
        }
    }

    public void setBackground(Drawable drawable) {
        super.setBackground(drawable);
        A00(drawable);
    }

    public final void setEnableCollaborationButtonPadding(boolean z) {
        this.A00 = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FollowButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        A00(getBackground());
        setTextSize(2, 14.0f);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FollowButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FollowButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
