package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.reels.ui.views.reelavatar.view.ReelAvatarWithBadgeView;

/* renamed from: X.Dp6  reason: case insensitive filesystem */
public final class C47014Dp6 extends C249703kE {
    public final View A00;
    public final TextView A01;
    public final AnonymousClass0iw A02;
    public final ReelAvatarWithBadgeView A03;
    public final AnonymousClass170 A04;
    public final 0sP A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47014Dp6(View view, AnonymousClass0iw r8, AnonymousClass170 r9, 0sP r10) {
        super(view);
        AnonymousClass7TG.A0w(1, r9, r10, r8);
        this.A04 = r9;
        this.A00 = view;
        this.A05 = r10;
        this.A02 = r8;
        ReelAvatarWithBadgeView reelAvatarWithBadgeView = (ReelAvatarWithBadgeView) AnonymousClass7TF.A0F(view, R.id.direct_recipient_pog_avatar);
        this.A03 = reelAvatarWithBadgeView;
        this.A01 = AnonymousClass7TG.A0R(view, R.id.direct_recipient_pog_name);
        Context context = reelAvatarWithBadgeView.getContext();
        Resources resources = context.getResources();
        Drawable A052 = AnonymousClass3JT.A05(context, R.drawable.instagram_circle_x_pano_filled_24, AnonymousClass7TF.A03(context, R.attr.glyphColorPrimary));
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_dialog_padding_material);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.activation_card_icon_container_width);
        reelAvatarWithBadgeView.A02(A052, dimensionPixelSize);
        int i = dimensionPixelSize / 2;
        reelAvatarWithBadgeView.setBadgeOffsetX(i);
        reelAvatarWithBadgeView.setBadgeOffsetY(dimensionPixelSize2 - i);
        reelAvatarWithBadgeView.setFrontAvatarPunchRadius(resources.getDimensionPixelSize(R.dimen.action_bar_item_spacing_right));
        reelAvatarWithBadgeView.setFrontAvatarPunchOffsetY((-dimensionPixelSize2) + i);
        reelAvatarWithBadgeView.setFrontAvatarPunchOffsetX((-dimensionPixelSize) / 2);
    }
}
