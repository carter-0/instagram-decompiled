package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.model.showreelnative.IgShowreelNativeAnimation;
import com.instagram.showreelnative.ui.common.ShowreelNativeMediaView;
import java.util.List;

public final class H53 extends C14097Tpp {
    public final /* bridge */ /* synthetic */ Object A0K(View view, C307786Rm r15, C276544tV r16, Object obj) {
        ShowreelNativeMediaView showreelNativeMediaView = (ShowreelNativeMediaView) view;
        UserSession A01 = 0Gl.A01(C308206Td.A0A(r15));
        if (A01 == null) {
            1Kn.A02("BKShowreelNativeBinderUtils", "Attempt to render Bloks showreel native component outside a logged in user context.");
        } else {
            C276544tV r2 = r16;
            String A0H = r2.A0H();
            String A0G = r2.A0G();
            String A0E = r2.A0E();
            if (!(A0H == null || A0G == null || A0E == null)) {
                IgShowreelNativeAnimation igShowreelNativeAnimation = new IgShowreelNativeAnimation((Integer) null, (Integer) null, (String) null, A0H, A0E, A0G, r2.A0N(36), (List) null);
                showreelNativeMediaView.setShowreelAnimation(B7C.A00(igShowreelNativeAnimation), A01, C308206Td.A07(r15).getModuleName(), new AnonymousClass6Q6(r2.A0D(), r2.A0J()));
                return null;
            }
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ Object ALg(Context context) {
        return new ShowreelNativeMediaView(context, new AnonymousClass9J6(C273654mx.A00(393), "IG_FEED", 0), (AnonymousClass623) null, (AnonymousClass621) C56993IKl.A00);
    }

    public H53(C307786Rm r1, C276544tV r2) {
        super(r1, r2);
    }

    public final /* bridge */ /* synthetic */ View A0J(Context context) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ void A0M(View view, C307786Rm r2, C276544tV r3, Object obj, Object obj2) {
    }
}
