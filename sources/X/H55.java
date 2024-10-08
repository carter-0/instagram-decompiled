package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.model.showreelnative.IgShowreelNativeAnimation;
import com.instagram.model.showreelnative.IgShowreelNativeAssetImpl;
import com.instagram.showreelnative.ui.common.ShowreelNativeMediaView;
import java.util.Iterator;
import java.util.LinkedList;

public final class H55 extends C14097Tpp {
    public final /* bridge */ /* synthetic */ Object A0K(View view, C307786Rm r21, C276544tV r22, Object obj) {
        String str;
        ShowreelNativeMediaView showreelNativeMediaView = (ShowreelNativeMediaView) view;
        UserSession A01 = 0Gl.A01(C308206Td.A0A(r21));
        if (A01 == null) {
            1Kn.A02("IgShowreelNativeBinderUtils", "Attempt to render Bloks showreel native component outside a logged in user context.");
        } else {
            C276544tV r5 = r22;
            if (!(r5.A0F() == null || r5.A0E() == null || r5.A0K(38) == null)) {
                LinkedList linkedList = new LinkedList();
                Iterator it = r5.A0N(44).iterator();
                while (true) {
                    str = "";
                    if (!it.hasNext()) {
                        break;
                    }
                    C276544tV r1 = (C276544tV) it.next();
                    Integer valueOf = Integer.valueOf(r1.A03(35, 0));
                    String A0F = r1.A0F();
                    if (A0F != null) {
                        str = A0F;
                    }
                    linkedList.add(new IgShowreelNativeAssetImpl(valueOf, Integer.valueOf(r1.A03(38, 0)), str));
                }
                IgShowreelNativeAnimation igShowreelNativeAnimation = new IgShowreelNativeAnimation((Integer) null, (Integer) null, (String) null, r5.A0F(), r5.A0K(38), r5.A0E(), r5.A0N(35), linkedList);
                AnonymousClass6Q6 r6 = new AnonymousClass6Q6(r5.A0I(), r5.A0G());
                if (r5.A0R(45, false)) {
                    showreelNativeMediaView.A00 = Integer.MAX_VALUE;
                    C226492gu keyframesAnimatable = showreelNativeMediaView.A0J.getKeyframesAnimatable();
                    if (keyframesAnimatable != null) {
                        keyframesAnimatable.EFK();
                    }
                } else {
                    showreelNativeMediaView.A00 = 1;
                    C226492gu keyframesAnimatable2 = showreelNativeMediaView.A0J.getKeyframesAnimatable();
                    if (keyframesAnimatable2 != null) {
                        keyframesAnimatable2.EFJ(1);
                    }
                }
                showreelNativeMediaView.E2p();
                C52507GVk A00 = B7C.A00(igShowreelNativeAnimation);
                String A0K = r5.A0K(48);
                if (A0K != null) {
                    str = A0K;
                }
                showreelNativeMediaView.setShowreelAnimation(A00, A01, str, r6);
                return null;
            }
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ void A0M(View view, C307786Rm r2, C276544tV r3, Object obj, Object obj2) {
        ((AnonymousClass59L) view).stop();
    }

    public final /* bridge */ /* synthetic */ Object ALg(Context context) {
        return new ShowreelNativeMediaView(context, new AnonymousClass9J6(C273654mx.A00(393), "IG_FEED", 0), (AnonymousClass623) null, (AnonymousClass621) null);
    }

    public H55(C307786Rm r1, C276544tV r2) {
        super(r1, r2);
    }

    public final /* bridge */ /* synthetic */ View A0J(Context context) {
        throw AnonymousClass00P.createAndThrow();
    }
}
