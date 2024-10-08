package X;

import com.instagram.realtimeclient.RealtimeProtocol;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: X.43r  reason: invalid class name and case insensitive filesystem */
public final class C2599443r implements C2598643j {
    public final 2Dm A00;

    public C2599443r(2Dm r2) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
    }

    public final AnonymousClass6BN E4Y(AnonymousClass651 r15, AnonymousClass653 r16, List list, Map map, 0sL r19, 0sL r20, boolean z) {
        boolean z2;
        boolean A0N;
        boolean z3;
        boolean z4;
        AnonymousClass3SZ Aue;
        String str;
        String str2;
        Map map2 = map;
        0qQ.A0B(map2, 0);
        0qQ.A0B(r15, 1);
        AnonymousClass653 r2 = r16;
        0qQ.A0B(r2, 2);
        0sL r4 = r20;
        0qQ.A0B(r4, 6);
        String str3 = (String) map2.get(RealtimeProtocol.THREAD_ID);
        String str4 = (String) map2.get(RealtimeProtocol.USER_ID);
        if (!(str3 == null || str4 == null)) {
            String str5 = r2.A00;
            if (0qQ.A0K(str5, "add") || 0qQ.A0K(str5, "replace")) {
                if (((Boolean) r4.invoke(str3, r15)).booleanValue()) {
                    return C21214XPc.A00;
                }
                try {
                    AnonymousClass3SZ parseFromJson = AnonymousClass3SY.parseFromJson(16P.A00(r2.A02));
                    0qQ.A07(parseFromJson);
                    2Dr r22 = this.A00;
                    AnonymousClass3U9 C60 = r22.C60(str3);
                    if (C60 != null) {
                        boolean z5 = r15.A06;
                        2Dr r23 = r22;
                        synchronized (r23) {
                            AnonymousClass48S A0P = r23.A0P(C60.BJz());
                            if (A0P == null) {
                                0wb.A03("DirectThreadStore", "Can't find thread to update seen messages.");
                                C60.A0N(parseFromJson, str4);
                            } else {
                                AnonymousClass3U9 r7 = A0P.A0I;
                                if (!0qQ.A0K(r7, C60)) {
                                    0wb.A03("DirectThreadStore", "There should be only one reference of thread thread.");
                                    z2 = C60.A0N(parseFromJson, str4);
                                } else {
                                    z2 = false;
                                }
                                synchronized (A0P) {
                                    A0N = r7.A0N(parseFromJson, str4);
                                    if (A0N) {
                                        A0P.A0R();
                                        if (str4.equals(A0P.A0H.A06)) {
                                            A0P.A0T();
                                        }
                                    }
                                    A0P.A0U();
                                    A0P.A0Q();
                                }
                                if (A0N || z2) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                    if (!(!0qQ.A0K(r23.A0A.A06, str4) || (Aue = C60.Aue(str4)) == null || (str = parseFromJson.A01) == null || (str2 = Aue.A01) == null)) {
                                        z3 = true;
                                        if (!str.equals(str2)) {
                                        }
                                        2Ka r72 = new 2Ka(parseFromJson, C60.BJz(), str4, z5, z4, z3);
                                        r23.A06.A00(r72);
                                        r23.A08.accept(r72);
                                        2Dr.A0G(r23, C60.BJz(), AnonymousClass05K.A0D, z, false);
                                    }
                                }
                                z3 = false;
                                2Ka r722 = new 2Ka(parseFromJson, C60.BJz(), str4, z5, z4, z3);
                                r23.A06.A00(r722);
                                r23.A08.accept(r722);
                                2Dr.A0G(r23, C60.BJz(), AnonymousClass05K.A0D, z, false);
                            }
                        }
                    }
                    return AnonymousClass6BL.A00;
                } catch (IOException e) {
                    String simpleName = getClass().getSimpleName();
                    0KC.A0F(simpleName, "Invalid DirectThreadSeenMarker format", e);
                    0qQ.A07(simpleName);
                    return new AnonymousClass6BQ(e, simpleName, "Invalid DirectThreadSeenMarker format");
                }
            }
        }
        return AnonymousClass6BO.A00;
    }
}
