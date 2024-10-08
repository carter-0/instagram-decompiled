package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.facebook.react.modules.intent.IntentModule;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.8do  reason: invalid class name and case insensitive filesystem */
public final class C359988do {
    public static String A00 = "";
    public static String A01 = "";
    public static HashSet A02 = new HashSet();
    public static HashSet A03 = new HashSet();
    public static final C359988do A04 = new Object();

    public static final 1NY A00(0lg r6, boolean z) {
        String str;
        1Fe r0;
        1NY r3 = new 1NY(r6, -2);
        r3.A9m("bloks_versioning_id", "62c196cc283670265c8243af7482f62f8856499ba6f7f01c5067e75d05225969");
        ArrayList A012 = C359738dP.A01(new C379769Vf());
        try {
            StringWriter stringWriter = new StringWriter();
            17W A0A = AnonymousClass15o.A00.A0A(stringWriter);
            A0A.A0c();
            A0A.A0R("bloks_version", "62c196cc283670265c8243af7482f62f8856499ba6f7f01c5067e75d05225969");
            A0A.A0R("styles_id", "instagram");
            if (A012 != null) {
                16P.A03(A0A, "theme_params");
                Iterator it = A012.iterator();
                while (it.hasNext()) {
                    C376649Iu r2 = (C376649Iu) it.next();
                    if (r2 != null) {
                        A0A.A0c();
                        List<String> list = (List) r2.A00;
                        if (list != null) {
                            16P.A03(A0A, IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                            for (String str2 : list) {
                                if (str2 != null) {
                                    A0A.A0t(str2);
                                }
                            }
                            A0A.A0Y();
                        }
                        String str3 = r2.A01;
                        if (str3 != null) {
                            A0A.A0R("design_system_name", str3);
                        }
                        A0A.A0Z();
                    }
                }
                A0A.A0Y();
            }
            A0A.A0Z();
            A0A.close();
            str = stringWriter.toString();
        } catch (IOException e) {
            0wb.A06("IgBloksClientContext", "Error jsonizing IgBloksClientContext", e);
            str = "";
        }
        r3.A9m("bk_client_context", str);
        if (z) {
            r0 = 1Fe.A02;
        } else {
            r0 = 1Fe.A03;
        }
        r3.A05 = r0;
        r3.A06 = 1CE.A02;
        if (z) {
            r3.A09 = AnonymousClass05K.A01;
        }
        return r3;
    }

    public static final C360678ey A01(AnonymousClass1O9 r13, 0lg r14, String str, String str2, Map map, int i, long j, boolean z) {
        1vn r2;
        UserSession userSession;
        0lg r3 = r14;
        C359988do r5 = A04;
        String str3 = str;
        Map map2 = map;
        int i2 = i;
        long j2 = j;
        if (r5.A0A(r14, str)) {
            AnonymousClass0K0 r7 = GraphQlCallInput.A02;
            0Df A022 = r7.A02();
            0Df.A00(A022, str3, "app_id");
            0Df.A00(A022, "62c196cc283670265c8243af7482f62f8856499ba6f7f01c5067e75d05225969", "bloks_versioning_id");
            String A05 = 0qv.A02.A05(C60960kU.A00);
            String A023 = Dbp.A02(0, 9, 37);
            0Df A024 = r7.A02();
            0Df.A00(A024, A05, A023);
            A022.A0E(A024, "infra_params");
            if (map != null) {
                C250873mC r10 = C250863mB.A03;
                AnonymousClass40R r11 = r10.A02;
                Class<String> cls = String.class;
                0Ye A002 = 0tm.A00(cls);
                Integer num = AnonymousClass05K.A00;
                0Df.A00(A022, r10.A02(map2, C360038dt.A02(0tm.A02(new 0Dj(num, A002), new 0Dj(num, new 0Ye(Collections.emptyList(), new 0Yh(cls), true))), r11)), "params");
            }
            2IS r72 = new 2IS();
            2IS r6 = new 2IS();
            r72.A00.A02().A0E(A022, "params");
            r72.A00(C360628et.A00(), "bk_context");
            AnonymousClass2IY r4 = PandoGraphQLRequest.Companion;
            1Ef maxToleratedCacheAgeMs = new PandoGraphQLRequest(AnonymousClass1vS.A00(), "IGBloksAppRootQuery", r72.getParamsCopy(), r6.getParamsCopy(), C360648ev.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "bloks_app", new ArrayList()).setMaxToleratedCacheAgeMs(j2);
            int i3 = 2;
            if (i2 == 3) {
                i3 = 1;
            }
            1Ef requestPurpose = maxToleratedCacheAgeMs.setRequestPurpose(i3);
            if (!(r3 instanceof UserSession) || (userSession = (UserSession) r3) == null || (r2 = 1vm.A01(userSession)) == null) {
                r2 = 1vm.A00((AnonymousClass0aP) r3);
            }
            return new C360668ex(requestPurpose, new C360658ew(C307546Qn.A01), r2);
        }
        return new C379739Vc(r5.A07(r13, r3, str3, str2, "bloks/apps/", map2, i2, j2, z));
    }

    public static final C360678ey A02(AnonymousClass1O9 r8, 0lg r9, String str, Map map) {
        0lg r3 = r9;
        0qQ.A0B(r9, 0);
        String str2 = str;
        0qQ.A0B(str, 1);
        AnonymousClass1O9 r2 = r8;
        Map map2 = map;
        if (1AW.A06(0Tu.A05, 18315359752831296L)) {
            return A03(r8, r9, str, map);
        }
        return A01(r2, r3, str2, (String) null, map2, 0, 0, false);
    }

    public static final C360678ey A04(0lg r1, String str, Map map) {
        0qQ.A0B(r1, 0);
        0qQ.A0B(str, 1);
        return A02((AnonymousClass1O9) null, r1, str, map);
    }

    public static final C360678ey A05(0lg r1, String str, Map map) {
        return A02((AnonymousClass1O9) null, r1, str, map);
    }

    public static final C360678ey A06(0lg r6, String str, Map map) {
        0qQ.A0B(r6, 0);
        0qQ.A0B(str, 1);
        return A01((AnonymousClass1O9) null, r6, str, (String) null, map, 0, 0, false);
    }

    private final 1OC A07(AnonymousClass1O9 r9, 0lg r10, String str, String str2, String str3, Map map, int i, long j, boolean z) {
        Class cls;
        Class cls2;
        boolean z2 = false;
        boolean z3 = false;
        if (i == 3) {
            z3 = true;
        }
        1NY A002 = A00(r10, z3);
        A002.A08(AnonymousClass05K.A01);
        A002.A0A(002.A0S(str3, str, '/'));
        if (r9 != null) {
            A002.A00 = r9;
        }
        if (z) {
            cls = C43874CGo.class;
            cls2 = D0T.class;
        } else {
            cls = C41943B7u.class;
            cls2 = C41942B7t.class;
        }
        A002.A0O((15p) null, cls, cls2, false);
        long j2 = j;
        if (j >= TimeUnit.DAYS.toMillis(1)) {
            z2 = true;
        }
        boolean z4 = r10 instanceof UserSession;
        if (z4 && str2 != null && z2) {
            A002.A0A = str2;
            A002.A07(AnonymousClass05K.A0N);
            A002.A01 = j2;
        }
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                A002.A9m((String) entry.getKey(), (String) entry.getValue());
            }
        }
        0Tu r5 = 0Tu.A05;
        if (1AW.A06(r5, 2324147266476185954L)) {
            String A042 = 1AW.A04(r5, 18867207215776128L);
            if (!0qQ.A0K(A00, A042)) {
                A00 = A042;
                A02 = A08(A042);
            }
            if (A02.contains(str)) {
                A002.A03 = null;
                A002.A0L = true;
            }
        }
        if (1AW.A06(r5, 2324147266476251491L)) {
            String A043 = 1AW.A04(r5, 18867207215841665L);
            if (!0qQ.A0K(A01, A043)) {
                A01 = A043;
                A03 = A08(A043);
            }
            if (A03.contains(str)) {
                A002.A02 = null;
                A002.A0M = true;
            }
        }
        if (z4 && 182.A06(r5, r10, 36322942150191817L)) {
            A002.A0F("X-IG-BLOKS-SERIALIZE-PAYLOAD", "true");
        }
        return A002.A0M();
    }

    public static final boolean A09(String str, String str2) {
        if (str2.length() != 0) {
            try {
                JSONArray jSONArray = new JSONArray(str2);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    String string = jSONArray.getString(i);
                    0qQ.A0A(string);
                    if (00p.A0k(str, string, false)) {
                        return false;
                    }
                }
            } catch (JSONException unused) {
                0wj.A01.EFR(245701013, 002.A0g("Denylist ", str2, " for QE 'ig_android_bloks_graphql.app_id_prefix_denylist'"));
                return true;
            }
        }
        return true;
    }

    public final boolean A0A(0lg r5, String str) {
        if (!00p.A0k(str, "com.bloks.www", false)) {
            return false;
        }
        if (!(r5 instanceof AnonymousClass0aP)) {
            return A09(str, 182.A04(0Tu.A05, r5, 36883212043420143L));
        }
        if (!A09(str, 1AW.A04(0Tu.A06, 18876041963570035L)) || !1AW.A06(0Tu.A05, 18313092010097114L)) {
            return false;
        }
        return true;
    }

    public static final C360678ey A03(AnonymousClass1O9 r15, 0lg r16, String str, Map map) {
        1vn r2;
        UserSession userSession;
        0lg r3 = r16;
        C359988do r4 = A04;
        String str2 = str;
        Map map2 = map;
        if (r4.A0A(r3, str2)) {
            AnonymousClass0K0 r8 = GraphQlCallInput.A02;
            0Df A022 = r8.A02();
            0Df.A00(A022, str2, "app_id");
            0Df.A00(A022, "62c196cc283670265c8243af7482f62f8856499ba6f7f01c5067e75d05225969", "bloks_versioning_id");
            String A05 = 0qv.A02.A05(C60960kU.A00);
            String A023 = Dbp.A02(0, 9, 37);
            0Df A024 = r8.A02();
            0Df.A00(A024, A05, A023);
            A022.A0E(A024, "infra_params");
            if (map != null) {
                C250873mC r10 = C250863mB.A03;
                AnonymousClass40R r11 = r10.A02;
                Class<String> cls = String.class;
                0Ye A002 = 0tm.A00(cls);
                Integer num = AnonymousClass05K.A00;
                0Df.A00(A022, r10.A02(map2, C360038dt.A02(0tm.A02(new 0Dj(num, A002), new 0Dj(num, new 0Ye(Collections.emptyList(), new 0Yh(cls), true))), r11)), "params");
            }
            2IS r6 = new 2IS();
            2IS r5 = new 2IS();
            r6.A00.A02().A0E(A022, "params");
            r6.A00(C360628et.A00(), "bk_context");
            AnonymousClass2IY r22 = PandoGraphQLRequest.Companion;
            1Ef requestPurpose = new PandoGraphQLRequest(AnonymousClass1vS.A00(), "BloksAsyncActionQuery", r6.getParamsCopy(), r5.getParamsCopy(), C382919ej.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "bloks_action", new ArrayList()).setMaxToleratedCacheAgeMs(0).setRequestPurpose(2);
            if (!(r3 instanceof UserSession) || (userSession = (UserSession) r3) == null || (r2 = 1vm.A01(userSession)) == null) {
                r2 = 1vm.A00((AnonymousClass0aP) r3);
            }
            return new C379809Vj(requestPurpose, new C360658ew(C307546Qn.A01), r2);
        }
        AnonymousClass1O9 r7 = r15;
        if (00p.A0k(str2, "com.bloks.www", false)) {
            return new C379789Vh(r4.A07(r7, r3, str2, (String) null, "bloks/async_action/", map2, 0, 0, false));
        }
        return new C379739Vc(r4.A07(r7, r3, str2, (String) null, "bloks/apps/", map2, 0, 0, false));
    }

    public static final HashSet A08(String str) {
        List list;
        HashSet hashSet = new HashSet();
        int length = str.length();
        if (length > 0) {
            int i = length - 1;
            int i2 = 0;
            boolean z = false;
            while (i2 <= i) {
                int i3 = i;
                if (!z) {
                    i3 = i2;
                }
                int A002 = 0qQ.A00(str.charAt(i3), 32);
                boolean z2 = false;
                if (A002 <= 0) {
                    z2 = true;
                }
                if (z) {
                    if (!z2) {
                        break;
                    }
                    i--;
                } else if (!z2) {
                    z = true;
                } else {
                    i2++;
                }
            }
            List A032 = new 11S("\\s*,\\s*").A03(str.subSequence(i2, i + 1).toString());
            if (!A032.isEmpty()) {
                ListIterator listIterator = A032.listIterator(A032.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        if (((String) listIterator.previous()).length() != 0) {
                            list = 00k.A0d(A032, listIterator.nextIndex() + 1);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            list = 0sn.A00;
            for (String str2 : (String[]) list.toArray(new String[0])) {
                if (str2.length() > 0) {
                    hashSet.add(str2);
                }
            }
        }
        return hashSet;
    }
}
