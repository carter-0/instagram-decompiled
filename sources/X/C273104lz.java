package X;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.user.model.User;

/* renamed from: X.4lz  reason: invalid class name and case insensitive filesystem */
public abstract class C273104lz {
    public static final void A00(Context context, AnonymousClass9J2 r11, UserSession userSession, AnonymousClass4DU r13, C253993rl r14, AnonymousClass3W1 r15, int i) {
        SimpleImageUrl Bh3;
        String Bh8;
        0qQ.A0B(r11, 3);
        C252063oV r1 = r14.A0N;
        r1.setVisibility(8);
        r1.getView().setOnClickListener((View.OnClickListener) null);
        IgImageView igImageView = r14.A0I;
        igImageView.setVisibility(0);
        User user = (User) r11.A03;
        if (r11.A02 == AnonymousClass3QO.OPAL) {
            C267564bl BYD = user.A03.BYD();
            if (BYD == null || (Bh8 = BYD.Bh8()) == null) {
                Bh3 = new SimpleImageUrl((String) null);
            } else {
                Uri A03 = 0cp.A03(Bh8);
                0qQ.A07(A03);
                Bh3 = C253833rU.A00(A03, -1, -1);
            }
        } else {
            Bh3 = user.Bh3();
        }
        igImageView.setUrl(Bh3, r13);
        igImageView.setContentDescription(context.getString(2131963112, new Object[]{user.getUsername()}));
        igImageView.setPadding(0, 0, 0, 0);
        C244083ac.A05(igImageView, C244063aa.PROFILE_IMAGE);
        UserSession userSession2 = userSession;
        if (user.A2Q()) {
            AnonymousClass0fU.A00(new C244023aW(userSession2, (String) null, new C377409Ls(36, r15, r11), new AnonymousClass9M6(i, 4, (Object) r11, (Object) r15), true), igImageView);
            return;
        }
        if (r11.A05) {
            igImageView.setContentDescription(context.getString(2131976678, new Object[]{user.getUsername()}));
        }
        AnonymousClass0fU.A00(new C244023aW(userSession2, (String) null, new C377409Ls(37, r15, r11), new C377439Lv(10, r14, r11), true), igImageView);
        igImageView.setOnTouchListener(new C273114m0(r11));
    }
}
