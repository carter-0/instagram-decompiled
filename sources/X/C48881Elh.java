package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import kotlin.Deprecated;

@Deprecated(message = "Replaced by item definition")
/* renamed from: X.Elh  reason: case insensitive filesystem */
public abstract class C48881Elh {
    public static final void A00(C47004Dow dow, 2FW r7, String str, String str2, String str3) {
        int i;
        AnonymousClass7TF.A1C(dow, 0, r7);
        Context A07 = DbS.A07(dow);
        TextView textView = dow.A03;
        if (str2 == null) {
            str2 = AnonymousClass7TE.A16(A07, 2131960029);
        }
        textView.setText(str2);
        TextView textView2 = dow.A02;
        if (str3 == null) {
            C48880Elg elg = C48880Elg.$redex_init_class;
            int ordinal = r7.ordinal();
            if (ordinal == 28) {
                i = 2131960034;
            } else if (ordinal == 32) {
                i = 2131960032;
            } else if (ordinal != 79) {
                i = 2131960030;
                if (ordinal != 85) {
                    i = 2131960033;
                }
            } else {
                i = 2131960031;
            }
            str3 = DbY.A0c(A07, str, i);
        }
        textView2.setText(str3);
        IgSimpleImageView igSimpleImageView = dow.A04;
        0qQ.A0A(A07);
        igSimpleImageView.setImageDrawable(F62.A01(A07, R.drawable.instagram_lock_outline_96));
        dow.A00.setVisibility(8);
        dow.A01.setVisibility(0);
        int dimensionPixelSize = A07.getResources().getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
        ViewGroup.LayoutParams layoutParams = igSimpleImageView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = dimensionPixelSize;
            layoutParams.height = dimensionPixelSize;
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
