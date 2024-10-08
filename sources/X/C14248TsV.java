package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.business.onelink.cache.FBPageCacheInfo;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.TsV  reason: case insensitive filesystem */
public final class C14248TsV implements AnonymousClass9F7 {
    public C46478Dfh A00;
    public final C10484Rsz A01;
    public final AnonymousClass9F5 A02;
    public final 1Ng A03;
    public final UserSession A04;

    public C14248TsV(AnonymousClass9F5 r2, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A04 = userSession;
        this.A02 = r2;
        this.A01 = new C10484Rsz(userSession);
        this.A03 = AnonymousClass1Nd.A00(userSession);
    }

    public final void AHV(AnonymousClass9JK r5) {
        0qQ.A0B(r5, 0);
        if (AnonymousClass9FF.A00.A00(this.A04, r5.A02)) {
            this.A00 = null;
            C10484Rsz rsz = this.A01;
            0xW.A09(rsz.A00, new C58728Iwb(rsz, 40));
            this.A03.A00(WQS.A00);
        }
    }

    public final void AUs(AnonymousClass9JK r20, AnonymousClass9F2 r21, AnonymousClass9FE r22) {
        AnonymousClass9JK r3 = r20;
        AnonymousClass9F2 r2 = r21;
        AnonymousClass7TF.A1H(r3, r2);
        AnonymousClass9FF r5 = AnonymousClass9FF.A00;
        UserSession userSession = this.A04;
        AnonymousClass9FE r1 = r22;
        if (!r5.A00(userSession, r3.A02)) {
            r1.onError(C20569Wum.A00);
            return;
        }
        0Df A0I = C13990Tnq.A0I(GraphQlCallInput.A02, C13990Tnq.A0J(r3), r2, r2);
        2IS r7 = new 2IS();
        1vm.A01(userSession).A06(new PandoGraphQLRequest(C41847B3o.A04(A0I, r7, "input"), "IGOneLinkMiddlewarePageQuery", r7.getParamsCopy(), new 2IS().getParamsCopy(), C14267Tsp.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xfb_one_link_monoschema", new ArrayList()), new C15599UfR(2, r3, this, r2, r1));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0010, code lost:
        r3 = r4.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object Au3(X.AnonymousClass9JK r5) {
        /*
            r4 = this;
            r0 = 0
            X.0qQ.A0B(r5, r0)
            X.9FF r2 = X.AnonymousClass9FF.A00
            com.instagram.common.session.UserSession r1 = r4.A04
            java.lang.String r0 = r5.A02
            boolean r0 = r2.A00(r1, r0)
            if (r0 == 0) goto L_0x0030
            X.Rsz r3 = r4.A01
            X.0xa r2 = r3.A00
            r1 = 0
            if (r2 == 0) goto L_0x0030
            java.lang.String r0 = "fb_page_info"
            java.lang.String r2 = r2.getString(r0, r1)
            if (r2 == 0) goto L_0x0030
            X.3mB r1 = r3.A01
            X.TsY r0 = X.C14251TsY.A00
            java.lang.Object r0 = r1.A00(r2, r0)
            com.instagram.business.onelink.cache.FBPageCacheInfo r0 = (com.instagram.business.onelink.cache.FBPageCacheInfo) r0
            if (r0 == 0) goto L_0x0030
            X.Dfh r0 = A00(r0)
            return r0
        L_0x0030:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14248TsV.Au3(X.9JK):java.lang.Object");
    }

    public static final C46478Dfh A00(FBPageCacheInfo fBPageCacheInfo) {
        C375999Gd r1;
        String str = fBPageCacheInfo.A03;
        String str2 = fBPageCacheInfo.A02;
        C375999Gd r2 = null;
        if (str2 != null) {
            r1 = new C375999Gd(str2);
        } else {
            r1 = null;
        }
        String str3 = fBPageCacheInfo.A04;
        String str4 = fBPageCacheInfo.A01;
        String str5 = fBPageCacheInfo.A00;
        if (str5 != null) {
            r2 = new C375999Gd(str5);
        }
        return new C46478Dfh(r1, r2, str, str3, str4, fBPageCacheInfo.A05);
    }
}
