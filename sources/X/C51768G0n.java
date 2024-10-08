package X;

import android.content.Context;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.user.model.User;
import org.json.JSONObject;

/* renamed from: X.G0n  reason: case insensitive filesystem */
public final class C51768G0n extends 0Yg implements C62320sa {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ 1P0 A01;
    public final /* synthetic */ 1Xj A02;
    public final /* synthetic */ AnonymousClass3W1 A03;
    public final /* synthetic */ SearchContext A04;
    public final /* synthetic */ C294705mt A05;
    public final /* synthetic */ EWA A06;
    public final /* synthetic */ User A07;
    public final /* synthetic */ Boolean A08;
    public final /* synthetic */ Integer A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ String A0D;
    public final /* synthetic */ JSONObject A0E;
    public final /* synthetic */ boolean A0F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C51768G0n(Context context, 1P0 r3, 1Xj r4, AnonymousClass3W1 r5, SearchContext searchContext, C294705mt r7, EWA ewa, User user, Boolean bool, Integer num, String str, String str2, String str3, String str4, JSONObject jSONObject, boolean z) {
        super(0);
        this.A05 = r7;
        this.A00 = context;
        this.A07 = user;
        this.A0E = jSONObject;
        this.A06 = ewa;
        this.A0F = z;
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = r5;
        this.A09 = num;
        this.A04 = searchContext;
        this.A0B = str;
        this.A0A = str2;
        this.A08 = bool;
        this.A0D = str3;
        this.A0C = str4;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        C294705mt r12 = this.A05;
        Context context = this.A00;
        User user = this.A07;
        JSONObject jSONObject = this.A0E;
        EWA ewa = this.A06;
        boolean z = this.A0F;
        1P0 r8 = this.A01;
        1Xj r9 = this.A02;
        AnonymousClass3W1 r10 = this.A03;
        Integer num = this.A09;
        SearchContext searchContext = this.A04;
        String str = this.A0B;
        String str2 = this.A0A;
        Boolean bool = this.A08;
        Boolean A0u = AnonymousClass7TE.A0u();
        String str3 = this.A0D;
        String str4 = str3;
        String str5 = str2;
        String str6 = str;
        Integer num2 = num;
        C294705mt.A01(context, r8, r9, r10, searchContext, r12, ewa, user, bool, A0u, num2, str6, str5, str4, this.A0C, jSONObject, z);
        return C60340gF.A00;
    }
}
