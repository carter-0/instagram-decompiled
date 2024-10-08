package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.google.common.util.concurrent.SettableFuture;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

/* renamed from: X.5gK  reason: invalid class name and case insensitive filesystem */
public final class C290985gK {
    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    public static final SettableFuture A00(2IV r19, UserSession userSession, boolean z) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 0);
        ? obj = new Object();
        1vn A01 = 1vm.A01(userSession2);
        2IS r4 = new 2IS();
        2IS r3 = new 2IS();
        r4.A00(r19, "input");
        Boolean valueOf = Boolean.valueOf(z);
        r4.A02("skipExtraFields", valueOf);
        boolean z2 = false;
        if (valueOf != null) {
            z2 = true;
        }
        17k.A0E(z2);
        AnonymousClass2IY r0 = PandoGraphQLRequest.Companion;
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AnonymousClass1vS.A00(), "IGGraphQLBanyanQuery", r4.getParamsCopy(), r3.getParamsCopy(), C43270BvW.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "get_paginated_ig_share_sheet_ranking_query", new ArrayList());
        0Tu r9 = 0Tu.A05;
        pandoGraphQLRequest.setMaxToleratedCacheAgeMs(Math.max(182.A01(r9, userSession2, 36594929543874540L), 182.A01(r9, userSession2, 36604885277545595L)));
        pandoGraphQLRequest.setFreshCacheAgeMs(TimeUnit.HOURS.toMillis(182.A01(r9, userSession2, 36604885277545595L)));
        A01.ATL(new C12085Smf(obj), new C40126ASr(obj), pandoGraphQLRequest);
        return obj;
    }

    public static final 1OC A01(UserSession userSession, Boolean bool, String str, List list, Map map, boolean z) {
        1NY r2 = new 1NY(userSession, -2);
        r2.A08(AnonymousClass05K.A0N);
        r2.A0A("banyan/banyan/");
        r2.A9m("views", new JSONArray(list).toString());
        r2.A0H("is_real_time", z);
        r2.A0O((15p) null, C290995gL.class, C291005gM.class, false);
        if (str != null) {
            r2.A9m(AnonymousClass000.A00(1577), str);
        }
        if (bool != null) {
            r2.A0H("is_private_share", bool.booleanValue());
        }
        if (map != null) {
            r2.A9m("IBCShareSheetParams", A02(map));
        }
        return r2.A0M();
    }

    public static final String A02(Map map) {
        try {
            StringWriter stringWriter = new StringWriter();
            17W A0A = AnonymousClass15o.A00.A0A(stringWriter);
            A0A.A0c();
            for (Map.Entry entry : map.entrySet()) {
                Integer valueOf = Integer.valueOf(((Number) entry.getValue()).intValue());
                A0A.A0q((String) entry.getKey());
                A0A.A0J(valueOf);
            }
            A0A.A0Z();
            A0A.close();
            return stringWriter.toString();
        } catch (IOException e) {
            0wb.A06(new 0Yh(C290985gK.class).toString(), C66579MXk.A00(53), e);
            return null;
        }
    }
}
