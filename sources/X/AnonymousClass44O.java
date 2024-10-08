package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.realtimeclient.RealtimeProtocol;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.44O  reason: invalid class name */
public final class AnonymousClass44O implements C2598643j {
    public final UserSession A00;
    public final 2Dm A01;

    public AnonymousClass44O(UserSession userSession, 2Dm r3) {
        0qQ.A0B(r3, 2);
        this.A00 = userSession;
        this.A01 = r3;
    }

    public final AnonymousClass6BN E4Y(AnonymousClass651 r10, AnonymousClass653 r11, List list, Map map, 0sL r14, 0sL r15, boolean z) {
        0qQ.A0B(map, 0);
        0qQ.A0B(r10, 1);
        0qQ.A0B(r11, 2);
        0qQ.A0B(r14, 5);
        String str = (String) map.get(RealtimeProtocol.THREAD_ID);
        if (str != null) {
            String str2 = r11.A00;
            if ("add".equals(str2) || "remove".equals(str2) || "replace".equals(str2)) {
                2Eq r4 = (2Eq) r14.invoke(str, r10);
                if (r4 == null) {
                    return C21215XPd.A00;
                }
                UserSession userSession = this.A00;
                C70148Ny2.A00(userSession, r10, str, (String) null);
                try {
                    0c5 r1 = 0c9.A04;
                    String str3 = r11.A02;
                    0qQ.A06(str3);
                    C45341Cuj parseFromJson = C44669Cin.parseFromJson(r1.A01(userSession, str3));
                    0qQ.A07(parseFromJson);
                    2Dr r7 = this.A01;
                    r7.FLs(r4.BJy(), parseFromJson.A00);
                    String str4 = r11.A00;
                    if (str4 != null) {
                        int hashCode = str4.hashCode();
                        if (hashCode != -934610812) {
                            if (hashCode != 96417) {
                                if (hashCode == 1094496948 && str4.equals("replace")) {
                                    r7.FLs(r4.BJy(), parseFromJson.A00);
                                }
                            } else if (str4.equals("add")) {
                                DirectThreadKey BJy = r4.BJy();
                                List list2 = parseFromJson.A01;
                                List list3 = parseFromJson.A02;
                                2Dr r72 = r7;
                                AnonymousClass48S A0P = r72.A0P(BJy);
                                if (A0P != null) {
                                    AnonymousClass3U9 r3 = A0P.A0I;
                                    HashSet hashSet = new HashSet(r3.BRZ());
                                    C242243Te A0L = A0P.A0L();
                                    0qQ.A07(A0L);
                                    if (list2 != null) {
                                        A0L.A0C = AEL.A02(A0L.A0C, list2);
                                        hashSet.addAll(list2);
                                    }
                                    if (list3 != null) {
                                        A0L.A0E = AEL.A02(A0L.A0E, list3);
                                        hashSet.addAll(list3);
                                    }
                                    C370828x8.A01(r3, new ArrayList(hashSet));
                                    2Dr.A0E(A0P.A0M(A0L), r72, false);
                                }
                            }
                        } else if (str4.equals("remove")) {
                            DirectThreadKey BJy2 = r4.BJy();
                            List list4 = parseFromJson.A01;
                            List list5 = parseFromJson.A02;
                            2Dr r73 = r7;
                            AnonymousClass48S A0P2 = r73.A0P(BJy2);
                            if (A0P2 != null) {
                                AnonymousClass3U9 r32 = A0P2.A0I;
                                HashSet hashSet2 = new HashSet(r32.BRZ());
                                C242243Te A0L2 = A0P2.A0L();
                                0qQ.A07(A0L2);
                                if (list4 != null) {
                                    A0L2.A0C = AEL.A00(A0L2.A0C, list4);
                                    hashSet2.removeAll(AEL.A01(list4, A0L2.A0D));
                                }
                                if (list5 != null) {
                                    A0L2.A0E = AEL.A00(A0L2.A0E, list5);
                                    hashSet2.removeAll(list5);
                                }
                                C370828x8.A01(r32, new ArrayList(hashSet2));
                                2Dr.A0E(A0P2.A0M(A0L2), r73, false);
                            }
                        }
                    }
                    return AnonymousClass6BL.A00;
                } catch (IOException e) {
                    0wb.A01.Ew0("invalid broadcast moderator format", "Invalid Moderator format");
                    return new AnonymousClass6BR(e, "invalid broadcast moderator format", "Invalid Moderator format");
                }
            }
        }
        return AnonymousClass6BO.A00;
    }
}
