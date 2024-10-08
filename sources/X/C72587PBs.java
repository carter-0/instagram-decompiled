package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.instagram.android.R;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.model.mediasize.GifUrlImpl;
import com.instagram.model.mediasize.ImageInfo;
import java.util.List;

/* renamed from: X.PBs  reason: case insensitive filesystem */
public abstract class C72587PBs implements C74334PtA {
    public static final C328667Fr A00(Context context, AnonymousClass7FT r56, AnonymousClass7FE r57, C254883tD r58, MessagingUser messagingUser, C74552Pwl pwl, String str, String str2, String str3, int i) {
        String str4 = str;
        AnonymousClass7FE r10 = r57;
        0qQ.A0B(r10, 4);
        AnonymousClass7FT r11 = r56;
        0qQ.A0B(r11, 5);
        DirectMessageIdentifier directMessageIdentifier = new DirectMessageIdentifier((2FW) null, pwl.BSF(i), (String) null);
        0sn r35 = 0sn.A00;
        String str5 = "";
        if (str == null) {
            str4 = str5;
        }
        Context context2 = context;
        Drawable drawable = context2.getDrawable(R.drawable.instagram_app_instagram_pano_outline_24);
        if (drawable != null) {
            drawable.mutate().setTint(context2.getColor(2Yu.A05(context2)));
        } else {
            drawable = null;
        }
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TR_BL, new int[]{AnonymousClass7TF.A03(context2, R.attr.igds_color_gradient_purple), AnonymousClass7TF.A03(context2, R.attr.igds_color_gradient_lavender), AnonymousClass7TF.A03(context2, R.attr.igds_color_gradient_pink), context2.getColor(R.color.activator_card_progress_bad), AnonymousClass7TF.A03(context2, R.attr.igds_color_gradient_yellow)});
        Integer valueOf = Integer.valueOf(R.dimen.abc_button_inset_vertical_material);
        GradientDrawable gradientDrawable2 = gradientDrawable;
        AnonymousClass774 r24 = new AnonymousClass774(drawable, gradientDrawable2, str4, str2, valueOf, valueOf, valueOf, valueOf, Integer.valueOf(R.dimen.abc_action_bar_elevation_material), (String) null, r35);
        if (str3 != null) {
            str5 = str3;
        }
        String str6 = messagingUser.A03;
        0qQ.A07(str6);
        AnonymousClass7FT r21 = r11;
        AnonymousClass7FE r22 = r10;
        return new C328667Fr((C376649Iu) null, (C376649Iu) null, (AnonymousClass9J0) null, new AnonymousClass9J6(str5, str6, 5), (AnonymousClass9J6) null, (AnonymousClass9J6) null, (C61062Jw0) null, (C3259574v) null, r21, r22, (AnonymousClass74T) null, r24, (AnonymousClass777) null, (AnonymousClass778) null, (AnonymousClass77A) null, (AnonymousClass5FY) null, r58, (AnonymousClass779) null, directMessageIdentifier, (C254793t3) null, (GifUrlImpl) null, (ImageInfo) null, (CharSequence) null, (Long) null, (Long) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, 0, 0, 0, false, false, false, false, false, false, false, false, false, false);
    }
}
