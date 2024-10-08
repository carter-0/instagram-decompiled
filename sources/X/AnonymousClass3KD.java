package X;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.3KD  reason: invalid class name */
public final class AnonymousClass3KD {
    public static C46583DhP A00;
    public static C46645DiQ A01;
    public static C229382nI A02;
    public static 0lg A03;
    public static AnonymousClass3KD A04;
    public static HashMap A05 = new HashMap();
    public static final AnonymousClass3KE A06 = new Object();

    public static final void A00(Context context, UserSession userSession, 1Xj r24, C20921X4m x4m, String str) {
        String str2;
        String str3;
        String str4;
        C229382nI r10;
        C250513lZ injected;
        Context context2 = context;
        0qQ.A0B(context2, 0);
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 1);
        if (context2 instanceof FragmentActivity) {
            List A042 = ((FragmentActivity) context2).getSupportFragmentManager().A0U.A04();
            0qQ.A07(A042);
            if (!A042.isEmpty()) {
                Bundle bundle = new Bundle();
                bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession2.A05);
                AnonymousClass3KE r2 = A06;
                A03 = 09i.A0A.A04(bundle);
                1Xj r1 = r24;
                String A2n = r1.A2n();
                if (A2n != null) {
                    User CCd = r1.A0C.CCd();
                    if (CCd != null) {
                        str2 = CCd.getId();
                    } else {
                        str2 = null;
                    }
                    C250513lZ injected2 = r1.A0C.getInjected();
                    if (injected2 != null) {
                        str3 = injected2.AZ4();
                    } else {
                        str3 = null;
                    }
                    C250513lZ injected3 = r1.A0C.getInjected();
                    if (injected3 != null) {
                        str4 = injected3.C9L();
                    } else {
                        str4 = null;
                    }
                    ArrayList arrayList = new ArrayList();
                    HashMap hashMap = new HashMap();
                    hashMap.put("media_id", A2n);
                    hashMap.put("injection_trigger", str);
                    C250513lZ injected4 = r1.A0C.getInjected();
                    if ((injected4 != null && 0qQ.A0K(injected4.Cc3(), true)) || ((injected = r1.A0C.getInjected()) != null && 0qQ.A0K(injected.CPM(), true))) {
                        if (str2 != null) {
                            hashMap.put("media_owner_id", str2);
                        }
                        if (str3 != null) {
                            hashMap.put("ad_id", str3);
                        }
                        if (str4 != null) {
                            hashMap.put("ad_tracking_token", str4);
                        }
                    }
                    A01 = new C46645DiQ((SparseArray) null, (Object) null, "com.instagram.bloks.feed.injected_units.products_entrypoint", (String) null, (String) null, hashMap, arrayList, (Map) null, (Map) null, (Map) null, 0, false);
                    r2.A01("started", userSession2, r1);
                    0lg r22 = A03;
                    if (r22 != null && A01 != null && (r10 = A02) != null) {
                        0qQ.A0C(r22, AnonymousClass000.A00(333));
                        0qQ.A0B(r22, 1);
                        C359618dD r0 = new C359618dD(r22, false, false, false);
                        Context context3 = context2;
                        C46583DhP A002 = C46583DhP.A00(context3, new SparseArray(), A01, (C3034368u) null, r10, r0);
                        A00 = A002;
                        A002.A08(context2, new WF0(userSession2, r1));
                        A05.put(A2n, A002.A04(context2).first);
                        x4m.DvM();
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
        }
    }
}
