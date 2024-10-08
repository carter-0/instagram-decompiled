package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import java.util.Map;

/* renamed from: X.EeO  reason: case insensitive filesystem */
public abstract class C48429EeO {
    public static final Object A00(C307896Rx r12, AnonymousClass6Tm r13) {
        Object A01 = r13.A01();
        0qQ.A0C(A01, Pxd.A00(2));
        Map map = (Map) A01;
        Object obj = map.get("bloks_app_id");
        String A0p = DbS.A0p(obj);
        String str = (String) obj;
        Object obj2 = map.get("obfuscated_user_id");
        0qQ.A0C(obj2, A0p);
        String str2 = (String) obj2;
        Object obj3 = map.get("initiator_name");
        0qQ.A0C(obj3, A0p);
        String str3 = (String) obj3;
        Object obj4 = map.get("entrypoint_name");
        0qQ.A0C(obj4, A0p);
        String str4 = (String) obj4;
        Object obj5 = map.get("xapp_session_id");
        0qQ.A0C(obj5, A0p);
        String str5 = (String) obj5;
        String A0r = DbU.A0r("destination_url", map);
        0lg A0R = DbW.A0R(r12);
        C307786Rm r0 = r12.A03;
        if (r0 != null) {
            Context context = r0.A00;
            FragmentActivity A08 = Dba.A08(r12);
            0qQ.A0B(A0R, 0);
            ((FBL) A0R.A01(FBL.class, new C73662Phb(A0R, 15))).A00(context, A08, CallerContext.A01("AccountSwitcherInstagramAppBindings"), str, str2, str3, str4, str5, A0r);
            return null;
        }
        throw AnonymousClass7TE.A0y();
    }
}
