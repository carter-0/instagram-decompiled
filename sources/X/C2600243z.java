package X;

import com.facebook.react.modules.appstate.AppStateModule;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.realtimeclient.RealtimeProtocol;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.43z  reason: invalid class name and case insensitive filesystem */
public final class C2600243z implements C2598643j {
    public final UserSession A00;
    public final AnonymousClass440 A01;

    public final AnonymousClass6BN E4Y(AnonymousClass651 r16, AnonymousClass653 r17, List list, Map map, 0sL r20, 0sL r21, boolean z) {
        User A02;
        HashMap hashMap;
        HashSet hashSet;
        Map map2 = map;
        0qQ.A0B(map2, 0);
        AnonymousClass653 r3 = r17;
        0qQ.A0B(r3, 2);
        String str = (String) map2.get(RealtimeProtocol.USER_ID);
        if (str == null || !"replace".equals(r3.A00)) {
            return AnonymousClass6BO.A00;
        }
        try {
            0c5 r2 = 0c9.A04;
            UserSession userSession = this.A00;
            String str2 = r3.A02;
            0qQ.A06(str2);
            C61037Jvb parseFromJson = C70071Nwn.parseFromJson(r2.A01(userSession, str2));
            AnonymousClass440 r6 = this.A01;
            UserSession userSession2 = r6.A01;
            if (182.A06(0Tu.A05, userSession2, 2342153457303027822L) && (A02 = 17h.A00(userSession2).A02(str)) != null) {
                String str3 = "inactive";
                String str4 = str3;
                if (!0qQ.A0K(parseFromJson.A00, str3)) {
                    str3 = AppStateModule.APP_STATE_ACTIVE;
                }
                boolean equals = str4.equals(str3);
                if (A02.Cdl() != equals) {
                    C262184Cl r22 = A02.A03;
                    17N r1 = new 17N(r22.B8F());
                    r1.A0J = Boolean.valueOf(equals);
                    r22.EXD(r1.A00());
                    2Dr r7 = r6.A02;
                    synchronized (r7) {
                        hashMap = new HashMap();
                        for (Map.Entry entry : r7.A0F.A08()) {
                            DirectThreadKey directThreadKey = (DirectThreadKey) entry.getKey();
                            AnonymousClass48S r11 = (AnonymousClass48S) entry.getValue();
                            synchronized (r11) {
                                hashSet = null;
                                for (C254703su r12 : r11.A0K) {
                                    if (str.equals(r12.A1u)) {
                                        if (hashSet == null) {
                                            hashSet = new HashSet();
                                        }
                                        hashSet.add(r12);
                                    }
                                }
                            }
                            if (hashSet != null) {
                                hashMap.put(directThreadKey, hashSet);
                            }
                        }
                    }
                    if (!0qQ.A0K(parseFromJson.A00, str4)) {
                        str4 = AppStateModule.APP_STATE_ACTIVE;
                    }
                    Long BST = A02.BST();
                    if (BST == null) {
                        AnonymousClass440.A00(r6, str4, hashMap);
                    } else {
                        r6.A03.A01(new C47657EBr(r6, str4, hashMap), userSession2, BST.toString());
                    }
                }
            }
            return AnonymousClass6BL.A00;
        } catch (IOException e) {
            0wb.A01.Ew6("invalid_user_account_status_format", "Invalid DirectUserAccountStatus format", 1, e);
            return new AnonymousClass6BQ(e, "invalid_user_account_status_format", "Invalid DirectUserAccountStatus format");
        }
    }

    public C2600243z(UserSession userSession) {
        this.A00 = userSession;
        this.A01 = new AnonymousClass440(userSession);
    }
}
