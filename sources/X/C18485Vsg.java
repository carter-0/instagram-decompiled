package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Vsg  reason: case insensitive filesystem */
public final class C18485Vsg {
    public final UserSession A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final List A04;

    public C18485Vsg(X6K x6k, UserSession userSession, Integer num, Integer num2, String str, String str2) {
        String str3;
        Object[] objArr;
        String str4;
        String str5;
        ArrayList arrayList = new ArrayList();
        this.A04 = arrayList;
        UserSession userSession2 = userSession;
        this.A00 = userSession2;
        String str6 = userSession2.A06;
        this.A03 = 002.A0R("POST_GRID", str6);
        this.A01 = AnonymousClass05K.A0N;
        String str7 = str;
        String str8 = str2;
        if (str2 == null) {
            if (str != null) {
                str5 = 002.A0E(str7, '\"', '\"');
            } else {
                str5 = null;
            }
            objArr = new Object[]{360, 15, str5, "CREATION_TIME", VA5.A00(num), C63986LHe.A01(num2), "USER", "CREATED_BEFORE_TRACKING_INCLUDED", true, str6};
            str4 = "{\"IgInsightsGridMediaImage_SIZE\":%d,\"count\":%d,\"cursor\":%s,\"dataOrdering\":\"%s\",\"postType\":\"%s\",\"timeframe\":\"%s\",\"search_base\":\"%s\",\"trackingCondition\":\"%s\",\"is_user\":\"%s\",\"queryParams\":{\"access_token\":\"\",\"id\":\"%s\"}}";
        } else {
            if (str != null) {
                str3 = 002.A0E(str7, '\"', '\"');
            } else {
                str3 = null;
            }
            objArr = new Object[]{360, 15, str3, "CREATION_TIME", VA5.A00(num), C63986LHe.A01(num2), "USER", str8, "CREATED_BEFORE_TRACKING_INCLUDED", true, str6};
            str4 = "{\"IgInsightsGridMediaImage_SIZE\":%d,\"count\":%d,\"cursor\":%s,\"dataOrdering\":\"%s\",\"postType\":\"%s\",\"timeframe\":\"%s\",\"search_base\":\"%s\",\"promoteEligibility\":\"%s\",\"trackingCondition\":\"%s\",\"is_user\":\"%s\",\"queryParams\":{\"access_token\":\"\",\"id\":\"%s\"}}";
        }
        this.A02 = 0mp.A06(str4, objArr);
        arrayList.add(x6k);
    }

    public C18485Vsg(X6K x6k, UserSession userSession, Integer num, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        this.A04 = arrayList;
        this.A00 = userSession;
        String str3 = userSession.A06;
        this.A03 = 002.A0R("STORY_GRID", str3);
        this.A01 = AnonymousClass05K.A0Y;
        this.A02 = 0mp.A06("{\"count\":%d,\"cursor\":%s,\"timeframe\":\"%s\",\"searchBase\":\"%s\",\"promoteEligibility\":\"%s\",\"trackingCondition\":\"%s\",\"is_user\":\"%s\",\"queryParams\":{\"access_token\":\"\",\"id\":\"%s\"}}", new Object[]{15, str != null ? 002.A0E(str, '\"', '\"') : null, C63986LHe.A01(num), "USER", str2, "CREATED_BEFORE_TRACKING_INCLUDED", AnonymousClass7TE.A0v(), str3});
        arrayList.add(x6k);
    }
}
