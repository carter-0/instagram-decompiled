package X;

import android.net.Uri;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import java.util.LinkedHashMap;

/* renamed from: X.Pmd  reason: case insensitive filesystem */
public final class C73959Pmd extends 0Yg implements 0sP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C328667Fr A01;
    public final /* synthetic */ PB4 A02;
    public final /* synthetic */ N8J A03;
    public final /* synthetic */ PBN A04;
    public final /* synthetic */ boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73959Pmd(C328667Fr r2, PB4 pb4, N8J n8j, PBN pbn, int i, boolean z) {
        super(1);
        this.A02 = pb4;
        this.A00 = i;
        this.A01 = r2;
        this.A04 = pbn;
        this.A05 = z;
        this.A03 = n8j;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        PB4 pb4 = this.A02;
        AnonymousClass7Ws r6 = pb4.A02;
        if (!((C333107Xr) r6).CPk()) {
            int i = this.A00;
            C69482NmQ nmQ = null;
            AnonymousClass74P r1 = new AnonymousClass74P((C332847Wp) r6, i, i, false);
            C328667Fr r5 = this.A01;
            String str = null;
            r1.A00(r5, this.A04);
            if (this.A05) {
                N8J n8j = this.A03;
                C254703su r12 = n8j.A02.A0e;
                0qQ.A07(r12);
                AnonymousClass7I3 r2 = (AnonymousClass7I3) pb4.A04.getValue();
                String A0g = r12.A0g();
                String str2 = r12.A1u;
                0qQ.A07(str2);
                Long A10 = AnonymousClass7TE.A10(str2);
                AnonymousClass7AG r0 = r12.A0Q;
                if (r0 != null) {
                    str = r0.A05;
                }
                String C6X = ((C332877Wu) r6).C6X();
                String A002 = PB4.A00(n8j);
                String queryParameter = Uri.parse(r5.A08.A01).getQueryParameter("subscription_id");
                String str3 = null;
                if (0qQ.A0K(A002, "GENAI_SUBSCRIPTION")) {
                    nmQ = C69482NmQ.META_AI_SUBSCRIPTION;
                    str3 = "ai_bot_subscriptions";
                } else if (0qQ.A0K(A002, "GENAI_REMINDER")) {
                    nmQ = C69482NmQ.META_AI_REMINDER;
                    str3 = "ai_bot_reminders";
                }
                0Aj A0e = AnonymousClass7TE.A0e(r2.A01, "direct_thread_link_tap");
                if (A0e.isSampled()) {
                    LinkedHashMap A1H = AnonymousClass7TE.A1H();
                    if (str3 != null) {
                        A1H.put(TraceFieldType.ContentType, str3);
                    }
                    C66584MXp.A0t(A0e, A10, A0g, str, C6X);
                    N1G A003 = N1G.A00(i);
                    A003.A06(PublicKeyCredentialControllerUtility.JSON_KEY_ID, queryParameter);
                    A003.A01(nmQ, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                    A0e.AAK(A003, "content");
                    A0e.AAJ("tap_surface", "subscription");
                    C66583MXo.A18(A0e, A1H);
                }
            }
        }
        return C60340gF.A00;
    }
}
