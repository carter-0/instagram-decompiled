package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.business.onelink.cache.WhatsAppBusinessCacheInfo;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;

/* renamed from: X.9F6  reason: invalid class name */
public final class AnonymousClass9F6 implements AnonymousClass9F7 {
    public C376009Ge A00;
    public final AnonymousClass9F8 A01;
    public final AnonymousClass9F5 A02;
    public final 1Ng A03;
    public final UserSession A04;

    public AnonymousClass9F6(AnonymousClass9F5 r2, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A04 = userSession;
        this.A02 = r2;
        this.A01 = new AnonymousClass9F8(userSession);
        this.A03 = AnonymousClass1Nd.A00(userSession);
    }

    public final void AHV(AnonymousClass9JK r5) {
        0qQ.A0B(r5, 0);
        if (AnonymousClass9FF.A00.A00(this.A04, r5.A02)) {
            this.A00 = null;
            AnonymousClass9F8 r3 = this.A01;
            0xW.A09(r3.A00, new C377189Kw(r3, 43));
            this.A03.A00(C376029Gg.A00);
        }
    }

    public final void AUs(AnonymousClass9JK r21, AnonymousClass9F2 r22, AnonymousClass9FE r23) {
        AnonymousClass9JK r5 = r21;
        0qQ.A0B(r5, 0);
        AnonymousClass9F2 r4 = r22;
        0qQ.A0B(r4, 1);
        AnonymousClass9FF r1 = AnonymousClass9FF.A00;
        UserSession userSession = this.A04;
        AnonymousClass9FE r3 = r23;
        if (!r1.A00(userSession, r5.A02)) {
            r3.onError(C20569Wum.A00);
            return;
        }
        User A012 = AnonymousClass0t1.A01.A01(userSession);
        if (A012.A1x() || A012.A2L() || !182.A06(0Tu.A05, userSession, 36323384530840694L)) {
            String str = ((CallerContext) r5.A01).A02;
            0qQ.A07(str);
            2IV r8 = new 2IV();
            r8.A09(str, "caller");
            r8.A09("function_credential", "function_credential");
            0Df A022 = GraphQlCallInput.A02.A02();
            0Df.A00(A022, "1L1D", "key");
            A022.A0E(r8.A02(), "caller_context");
            if (r4 instanceof AnonymousClass9GV) {
                2IV r7 = new 2IV();
                2IV r82 = new 2IV();
                r82.A09(((AnonymousClass9GV) r4).A00, AnonymousClass000.A00(1798));
                r7.A06(r82, "facebook_token_auth_from_cal");
                r7.A08("fallback_to_business_person", false);
                A022.A0E(r7.A02(), "fb_token_auth");
            }
            2IS r83 = new 2IS();
            2IS r72 = new 2IS();
            r83.A00.A02().A0E(A022, "input");
            AnonymousClass2IY r0 = PandoGraphQLRequest.Companion;
            1vm.A01(userSession).A06(new PandoGraphQLRequest(AnonymousClass1vS.A00(), "IGOneLinkMiddlewareWhatsAppBusinessQuery", r83.getParamsCopy(), r72.getParamsCopy(), AnonymousClass9GW.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, AnonymousClass000.A00(5391), new ArrayList()), new AnonymousClass9GX(r5, this, r4, r3));
        }
    }

    public final /* bridge */ /* synthetic */ Object Au3(AnonymousClass9JK r8) {
        WhatsAppBusinessCacheInfo whatsAppBusinessCacheInfo;
        C375999Gd r2;
        0qQ.A0B(r8, 0);
        if (!AnonymousClass9FF.A00.A00(this.A04, r8.A02)) {
            return null;
        }
        AnonymousClass9F8 r3 = this.A01;
        String string = r3.A00.getString("whatsapp_business_info", (String) null);
        if (string == null || (whatsAppBusinessCacheInfo = (WhatsAppBusinessCacheInfo) r3.A01.A00(string, C376019Gf.A00)) == null) {
            return null;
        }
        String str = whatsAppBusinessCacheInfo.A01;
        if (str != null) {
            r2 = new C375999Gd(str);
        } else {
            r2 = null;
        }
        return new C376009Ge(r2, whatsAppBusinessCacheInfo.A00, whatsAppBusinessCacheInfo.A03, whatsAppBusinessCacheInfo.A04, whatsAppBusinessCacheInfo.A02);
    }
}
