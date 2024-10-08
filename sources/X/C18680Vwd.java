package X;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.shopping.intf.ProductDetailsPageArguments;
import java.util.Map;

/* renamed from: X.Vwd  reason: case insensitive filesystem */
public abstract class C18680Vwd {
    public static final C308196Tc A01(View view, 2Th r5, int i, int i2) {
        0qQ.A0B(view, 1);
        view.measure(i, i2);
        return new C308196Tc(r5, (Object) null, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public static final FrameLayout A00(View view) {
        FrameLayout frameLayout = new FrameLayout(view.getContext());
        JTQ.A0w(frameLayout, -1, -2);
        frameLayout.addView(view);
        frameLayout.setTag(view.getTag());
        return frameLayout;
    }

    public static final VZO A02(C307786Rm r7, UserSession userSession, String str) {
        boolean A1Z = AnonymousClass7TG.A1Z(r7, userSession);
        Object obj = r7.A01.get(R.id.bk_context_key_pdp_arguments);
        if (!Map.class.isInstance(obj)) {
            obj = null;
        }
        Map map = (Map) obj;
        VZO vzo = null;
        if (map != null) {
            ProductDetailsPageArguments productDetailsPageArguments = (ProductDetailsPageArguments) map.get("cpdp_mvp_bloks_pdp_arguments");
            String A11 = DbT.A11("shopping_session_id", map);
            if (A11 == null) {
                A11 = C228022kf.A00((Bundle) null);
            }
            String A112 = DbT.A11("arg_cpdp_mvp_bloks_session_id", map);
            if (!(productDetailsPageArguments == null || A112 == null)) {
                vzo = new VZO(productDetailsPageArguments, A11, A112, 182.A06(0Tu.A05, userSession, 36311835363771167L));
            }
        }
        String A0R = 002.A0R("Unable to get CpdpArguments for RenderUnit ", str);
        0qQ.A0B(A0R, A1Z ? 1 : 0);
        if (vzo == null) {
            1Kn.A02("CPDP_MVP", A0R);
        }
        return vzo;
    }
}
