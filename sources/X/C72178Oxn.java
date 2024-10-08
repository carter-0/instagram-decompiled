package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.model.direct.DirectThreadKey;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Oxn  reason: case insensitive filesystem */
public final class C72178Oxn implements AnonymousClass3KO {
    public final UserSession A00;
    public final AnonymousClass0eM A01 = C73907Pli.A00(this, 12);
    public final PCP A02;
    public final C254743sy A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;

    public C72178Oxn(UserSession userSession, PCP pcp, C254743sy r4, String str, String str2, String str3, boolean z) {
        AnonymousClass7TF.A1E(userSession, 1, pcp);
        this.A00 = userSession;
        this.A03 = r4;
        this.A04 = str;
        this.A05 = str2;
        this.A07 = z;
        this.A06 = str3;
        this.A02 = pcp;
    }

    public final void DhB(long j) {
        String str;
        UserSession userSession = this.A00;
        if (!0qQ.A0K(userSession.A06, this.A06)) {
            C254743sy r2 = this.A03;
            DirectThreadKey A042 = C66647MaG.A04(r2);
            if (A042 != null) {
                2Dm A002 = 1bJ.A00(userSession);
                String str2 = this.A04;
                C254703su BRz = A002.BRz(A042, str2);
                boolean z = false;
                if (BRz != null) {
                    DirectThreadKey A032 = C66647MaG.A03(r2);
                    0qQ.A0B(A032, 0);
                    String str3 = A032.A00;
                    String A0g = BRz.A0g();
                    0qQ.A0A(A0g);
                    BRz.A0f();
                    0qQ.A0B(A0g, 2);
                    String A0s = DbV.A0s();
                    long micros = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
                    0xF r12 = new 0xF();
                    "direct_message_mark_waterfall".getClass();
                    0xI A012 = 0xI.A01("direct_message_mark_waterfall", (String) null);
                    A012.A0C(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "visual_item_screenshotted");
                    A012.A0C("client_context", A0s);
                    A012.A0C(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str3);
                    A012.A0C("message_id", A0g);
                    A012.A0B(AnonymousClass000.A00(4689), Long.valueOf(micros));
                    A012.A0C("action", "sent");
                    A012.A04(r12);
                    DbU.A1R(A012, userSession);
                    if (BRz.A1S()) {
                        C70938OSl oSl = (C70938OSl) this.A01.getValue();
                        boolean z2 = this.A07;
                        UserSession userSession2 = userSession;
                        1OS r7 = new 1OS(C66669Mac.A04(userSession2, OQO.A00(userSession, A042), C66061iy.class, (String) null, (String) null, z2));
                        r7.A00 = A042;
                        if (str2 != null) {
                            String str4 = this.A05;
                            N4L n4l = BRz.A0D;
                            if (n4l != null && n4l.A06) {
                                z = true;
                            }
                            C70938OSl.A00(new PD9(), r7, oSl, A042, str4, z);
                            return;
                        }
                        throw AnonymousClass7TE.A0y();
                    }
                }
            }
            if (r2 != null) {
                String str5 = this.A04;
                if (str5 == null || C66647MaG.A0F(r2)) {
                    DirectThreadKey A033 = C66647MaG.A03(r2);
                    if (A033 != null) {
                        str = A033.A00;
                        String str6 = this.A04;
                        String str7 = this.A05;
                        boolean z3 = this.A07;
                        1NY A0M = DbU.A0M(userSession);
                        A0M.A0R = true;
                        A0M.A04();
                        A0M.A0K("direct_v2/visual_threads/%s/items/%s/screenshot/", new Object[]{str, str6});
                        A0M.A0G("original_message_client_context", str7);
                        A0M.A0I("is_shh_mode", z3);
                        1ES.A03(DbT.A0S(A0M, 1XP.class, 1XY.class));
                    }
                } else {
                    PCP pcp = this.A02;
                    pcp.A00.A02(C66582MXn.A0N(PCP.A00(pcp).A02.A0M(new C72017Our(Long.parseLong(str5), 5)), "tam_mark_visual_message_screenshotted"), C73040PTx.A00);
                    return;
                }
            }
            str = null;
            String str62 = this.A04;
            String str72 = this.A05;
            boolean z32 = this.A07;
            1NY A0M2 = DbU.A0M(userSession);
            A0M2.A0R = true;
            A0M2.A04();
            A0M2.A0K("direct_v2/visual_threads/%s/items/%s/screenshot/", new Object[]{str, str62});
            A0M2.A0G("original_message_client_context", str72);
            A0M2.A0I("is_shh_mode", z32);
            1ES.A03(DbT.A0S(A0M2, 1XP.class, 1XY.class));
        }
    }
}
