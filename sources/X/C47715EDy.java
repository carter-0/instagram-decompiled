package X;

import android.content.Context;
import android.view.View;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.EDy  reason: case insensitive filesystem */
public final class C47715EDy extends C14097Tpp {
    public final /* bridge */ /* synthetic */ Object ALg(Context context) {
        0qQ.A0B(context, 1);
        return new C67681MsJ(context);
    }

    public final /* bridge */ /* synthetic */ Object A0K(View view, C307786Rm r14, C276544tV r15, Object obj) {
        User user;
        C67681MsJ msJ = (C67681MsJ) view;
        EtL etL = (EtL) C276544tV.A00(r15, 41);
        if (etL == null || (user = etL.A00) == null) {
            1Kn.A02("UserAvatarBinderUtils", "User is null in UserAvatar");
            return null;
        }
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        String A0J = r15.A0J();
        if (A0J != null) {
            try {
                num3 = Integer.valueOf((int) AnonymousClass6Su.A01(A0J));
            } catch (C258053yO e) {
                1Kn.A03("UserAvatarBinderUtils", e);
            }
        }
        C277014uI A09 = r15.A09();
        String A0H = r15.A0H();
        if (A0H != null) {
            try {
                num = Integer.valueOf((int) AnonymousClass6Su.A01(A0H));
            } catch (C258053yO e2) {
                1Kn.A03("UserAvatarBinderUtils", e2);
            }
        }
        String A0J2 = r15.A0J();
        if (A0J2 != null) {
            try {
                num3 = Integer.valueOf((int) AnonymousClass6Su.A01(A0J2));
            } catch (C258053yO e3) {
                1Kn.A03("UserAvatarBinderUtils", e3);
            }
        }
        String A0G = r15.A0G();
        if (A0G != null) {
            try {
                num2 = Integer.valueOf(AnonymousClass6Su.A03(A0G));
            } catch (C258053yO e4) {
                1Kn.A03("UserAvatarBinderUtils", e4);
            }
        }
        List A0N = r15.A0N(45);
        0qQ.A0B(A0N, 0);
        C70850OOe.A01(new C70712OHh(r15.A08(), A09, num, num2, num3, DbV.A11(r15, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT, 46), A0N, r15.A0R(40, false)), msJ, r14, r15, user);
        return null;
    }

    public final /* bridge */ /* synthetic */ void A0M(View view, C307786Rm r3, C276544tV r4, Object obj, Object obj2) {
        C67681MsJ msJ = (C67681MsJ) view;
        0qQ.A0B(msJ, 0);
        msJ.setRenderType(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT);
        msJ.setOnClickListener((View.OnClickListener) null);
    }

    public final /* bridge */ /* synthetic */ View A0J(Context context) {
        throw AnonymousClass00P.createAndThrow();
    }

    public C47715EDy(C307786Rm r1, C276544tV r2) {
        super(r1, r2);
    }
}
