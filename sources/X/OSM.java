package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.user.model.User;
import java.util.List;

public abstract class OSM {
    public static long A00;

    public static final DirectShareTarget A00(C319736r8 r21, UserSession userSession, N4t n4t, String str) {
        AnonymousClass913 r0;
        C279864zZ BWY;
        String str2;
        Long A10;
        int i = ((System.currentTimeMillis() - A00) > 2000 ? 1 : ((System.currentTimeMillis() - A00) == 2000 ? 0 : -1));
        A00 = System.currentTimeMillis();
        if (i < 0) {
            return null;
        }
        N4t n4t2 = n4t;
        User user = n4t2.A06;
        List A0n = DbW.A0n(user);
        0qQ.A07(A0n);
        C291175gg r1 = new C291175gg(A0n);
        DirectShareTarget directShareTarget = new DirectShareTarget(r1, (String) null, r1.A00, false);
        AnonymousClass4AB r2 = n4t2.A05;
        UserSession userSession2 = userSession;
        String str3 = str;
        if (r2 != null) {
            List list = r2.A0J;
            if (list == null || (r0 = (AnonymousClass913) 00k.A0J(list)) == null || (BWY = r0.BWY()) == null || (str2 = n4t2.A0A) == null || (A10 = AnonymousClass7TE.A10(str2)) == null) {
                return null;
            }
            1as r6 = 1as.A04;
            String str4 = BWY.A0J;
            String fullName = user.getFullName();
            if (fullName == null) {
                fullName = "";
            }
            r6.A08(userSession2, (ImageUrl) null, directShareTarget, C66581MXm.A0f(user), user, Boolean.valueOf(1as.A04.A0I(userSession2, directShareTarget)), A10, str3, str4, fullName, str3, (String) null, (String) null, (String) null);
            C3018760k A01 = C3018660j.A01(userSession2);
            A01.A0J(r21, r2);
            A01.A0B(C69506Nmo.A0V);
        } else {
            String str5 = n4t2.A0B;
            0qQ.A0B(str5, 3);
            if (DbS.A0c(directShareTarget) instanceof C254773t1) {
                AnonymousClass7VU A002 = AnonymousClass7VT.A00(userSession2);
                C254783t2 A0c = DbS.A0c(directShareTarget);
                0qQ.A0C(A0c, AnonymousClass000.A00(30));
                A002.A02((C254773t1) A0c, DbW.A0m(directShareTarget), new C59094J6b(userSession2, directShareTarget, str5, str3, (String) null, 2), true);
                return directShareTarget;
            }
        }
        return directShareTarget;
    }

    public static final void A01(Context context, ViewGroup viewGroup, JOK jok, JSy jSy) {
        0qQ.A0B(viewGroup, 3);
        String[] stringArray = context.getResources().getStringArray(R.array.friend_map_presence_emoji_replies);
        0qQ.A07(stringArray);
        for (String str : stringArray) {
            IgTextView igTextView = new IgTextView(context);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.weight = 1.0f;
            igTextView.setLayoutParams(layoutParams);
            igTextView.setTextSize(2, 18.0f);
            igTextView.setText(str);
            igTextView.setGravity(17);
            viewGroup.addView(igTextView);
            AnonymousClass0fU.A00(new ICC(jok, jSy, igTextView, str, 2), igTextView);
        }
    }
}
