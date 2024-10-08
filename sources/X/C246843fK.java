package X;

import android.text.style.ClickableSpan;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.SocialContextType;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.user.model.User;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: X.3fK  reason: invalid class name and case insensitive filesystem */
public final class C246843fK implements C246853fL {
    public final int A00;
    public final UserSession A01;
    public final AnonymousClass3WV A02;
    public final AnonymousClass416 A03;
    public final 1Xj A04;
    public final AnonymousClass4DU A05;
    public final AnonymousClass3W1 A06;
    public final C249763kK A07;

    public C246843fK(UserSession userSession, AnonymousClass3WV r3, AnonymousClass416 r4, 1Xj r5, AnonymousClass4DU r6, AnonymousClass3W1 r7, C249763kK r8) {
        0qQ.A0B(r5, 1);
        0qQ.A0B(r7, 2);
        0qQ.A0B(r6, 4);
        this.A04 = r5;
        this.A06 = r7;
        this.A01 = userSession;
        this.A05 = r6;
        this.A07 = r8;
        this.A03 = r4;
        this.A02 = r3;
        this.A00 = r7.getPosition();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: X.3gp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: X.3gp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: X.3gp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: X.3gp} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.2WX ApP(java.lang.String r10) {
        /*
            r9 = this;
            r8 = 0
            X.0qQ.A0B(r10, r8)
            X.1Xj r7 = r9.A04
            java.util.List r0 = r7.A3f()
            r6 = 0
            if (r0 == 0) goto L_0x005a
            java.util.Iterator r2 = r0.iterator()
        L_0x0011:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0027
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.3gp r0 = (X.C247733gp) r0
            java.lang.String r0 = r0.A0G
            boolean r0 = X.0qQ.A0K(r0, r10)
            if (r0 == 0) goto L_0x0011
            r6 = r1
        L_0x0027:
            X.3gp r6 = (X.C247733gp) r6
            if (r6 == 0) goto L_0x005a
            X.3WV r5 = r9.A02
            if (r5 == 0) goto L_0x005a
            com.instagram.common.session.UserSession r0 = r9.A01
            X.2rm r2 = X.C231492rl.A00(r0)
            X.2rq r1 = X.C231542rq.COALESCED_FOOTER
            X.4DU r0 = r9.A05
            java.lang.String r0 = r0.getModuleName()
            boolean r4 = r2.A03(r7, r1, r0)
            X.3XV r3 = X.2WX.A02
            X.3W1 r0 = r9.A06
            X.3dY r2 = new X.3dY
            r2.<init>(r6, r7, r0, r8)
            X.3ZH r1 = r7.A1Y()
            if (r4 == 0) goto L_0x0057
            X.2rv r0 = X.C231592rv.LITHO_COALESCED_FOOTER
        L_0x0052:
            X.2WX r0 = X.GAI.A00(r3, r5, r0, r1, r2)
            return r0
        L_0x0057:
            X.2rv r0 = X.C231592rv.LITHO_SOCIAL_CONTEXT_BUBBLES
            goto L_0x0052
        L_0x005a:
            X.3XV r0 = X.2WX.A02
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C246843fK.ApP(java.lang.String):X.2WX");
    }

    public final void CzB(SocialContextType socialContextType, int i, long j) {
        String str;
        SocialContextType socialContextType2 = socialContextType;
        0qQ.A0B(socialContextType, 0);
        AnonymousClass4DU r4 = this.A05;
        UserSession userSession = this.A01;
        C249763kK r0 = this.A07;
        if (r0 == null || (str = r0.getSessionId()) == null) {
            str = "";
        }
        C52310GNb.A02(socialContextType2, userSession, this.A04, r4, str, (String) null, this.A00, i, j, false);
    }

    public final void D1C(String str, String str2, boolean z, String str3) {
        UserSession userSession = this.A01;
        AnonymousClass1Nd.A00(userSession).A00(new C240343Kn(userSession, this.A04, this.A06, str3, str, str2, true));
    }

    public final void DG5(SocialContextType socialContextType, String str, int i, long j) {
        String str2;
        SocialContextType socialContextType2 = socialContextType;
        0qQ.A0B(socialContextType, 2);
        AnonymousClass4DU r4 = this.A05;
        UserSession userSession = this.A01;
        C249763kK r0 = this.A07;
        if (r0 == null || (str2 = r0.getSessionId()) == null) {
            str2 = "";
        }
        C52310GNb.A05(socialContextType2, userSession, this.A04, r4, str2, (String) null, str, this.A00, i, j, false);
    }

    public final void DIf(String str) {
        1Ng A002 = AnonymousClass1Nd.A00(this.A01);
        1Xj r4 = this.A04;
        String lowerCase = str.toLowerCase();
        0qQ.A07(lowerCase);
        A002.A00(new C240323Kl((ClickableSpan) null, (View) null, r4, lowerCase, false));
    }

    public final void DPG(FragmentActivity fragmentActivity, AnonymousClass0iw r15, UserSession userSession, C54693HOy hOy, long j) {
        C54693HOy hOy2 = hOy;
        0qQ.A0B(hOy2, 0);
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 2);
        0qQ.A0B(r15, 3);
        FragmentActivity fragmentActivity2 = fragmentActivity;
        0qQ.A0B(fragmentActivity, 4);
        int ordinal = hOy2.ordinal();
        if (ordinal == 2) {
            new AnonymousClass6W8(fragmentActivity2, C46447Df9.A03().A01.A01(userSession2, C46548Dgp.A01(userSession2, String.valueOf(j), "feed_social_context_bubble_long_press", r15.getModuleName()).A04()), userSession2, ModalActivity.class, "profile").A0C(fragmentActivity);
        } else if (ordinal == 3) {
            User A022 = 17h.A00(userSession2).A02(String.valueOf(j));
            if (A022 != null) {
                1Z4.A00.A00(fragmentActivity2, fragmentActivity, userSession2, A022, (G8B) null, r15.getModuleName(), (String) null, A022.getUsername());
            }
        } else if (ordinal == 4) {
            User A023 = 17h.A00(userSession2).A02(String.valueOf(j));
            if (A023 != null) {
                FragmentActivity fragmentActivity3 = fragmentActivity;
                C49960FGs.A04(fragmentActivity3, userSession2, new EU9(), A023, AnonymousClass000.A00(4018), r15.getModuleName(), (JSONObject) null, false);
            }
        } else if (ordinal == 0) {
            AnonymousClass3DI.A00();
            FC7.A02(fragmentActivity, userSession2, (String) null, "255779170859461", false);
        } else if (ordinal == 1) {
            FragmentActivity fragmentActivity4 = fragmentActivity;
            C327927Ct.A01(fragmentActivity4, userSession2, "Friendly Feed Launchers", AnonymousClass000.A00(2114), AnonymousClass3DI.A00(), C58315Ipw.A00);
        } else {
            throw new RuntimeException();
        }
    }

    public final void Ddz(SocialContextType socialContextType, int i, long j) {
        String str;
        SocialContextType socialContextType2 = socialContextType;
        0qQ.A0B(socialContextType, 2);
        AnonymousClass4DU r4 = this.A05;
        UserSession userSession = this.A01;
        C249763kK r0 = this.A07;
        if (r0 == null || (str = r0.getSessionId()) == null) {
            str = "";
        }
        C52310GNb.A03(socialContextType2, userSession, this.A04, r4, str, (String) null, this.A00, i, j, false);
    }

    public final void Dlf(SocialContextType socialContextType, List list) {
        String str;
        SocialContextType socialContextType2 = socialContextType;
        0qQ.A0B(socialContextType, 1);
        AnonymousClass4DU r4 = this.A05;
        UserSession userSession = this.A01;
        C249763kK r0 = this.A07;
        if (r0 == null || (str = r0.getSessionId()) == null) {
            str = "";
        }
        C52310GNb.A06(socialContextType2, userSession, this.A04, r4, str, (String) null, list, this.A00, false);
    }

    public final void DwK(String str) {
        1Ng A002 = AnonymousClass1Nd.A00(this.A01);
        1Xj r5 = this.A04;
        String lowerCase = str.toLowerCase(Locale.ROOT);
        0qQ.A07(lowerCase);
        A002.A00(new C240303Kj((ClickableSpan) null, (View) null, r5, lowerCase, false));
    }

    public final 2WX B57() {
        AnonymousClass3XV r2 = 2WX.A02;
        AnonymousClass3ZH A1Y = this.A04.A1Y();
        return C244223aq.A00(C238863Ds.USER_MESSAGE, r2, this.A01, A1Y, this.A05, Integer.valueOf(this.A06.A02), false, false);
    }

    public final void D4e(String str, String str2, boolean z) {
        DDf A002 = C65211bM.A00.A00();
        A002.A0r = str;
        A002.A0t = str2;
        A002.A0E = Boolean.valueOf(z);
        C247733gp r3 = new C247733gp(A002.A02());
        AnonymousClass416 r2 = this.A03;
        if (r2 != null) {
            r2.D4o(r3, this.A04, this.A06);
        }
    }

    public final void D4v(long j, int i, String str) {
        AnonymousClass1Nd.A00(this.A01).A00(new C240243Kd(AnonymousClass5OB.FEED_SOCIAL_CONTEXT_BUBBLE, this.A04, AnonymousClass05K.A00, str));
    }

    public final void DNa(long j, int i, boolean z) {
        String str;
        AnonymousClass4DU r3 = this.A05;
        UserSession userSession = this.A01;
        C249763kK r0 = this.A07;
        if (r0 == null || (str = r0.getSessionId()) == null) {
            str = "";
        }
        C52310GNb.A04(SocialContextType.LIKED_BY, userSession, this.A04, r3, str, (String) null, this.A00, i, j, false, z);
    }

    public final void Dqx() {
        AnonymousClass1Nd.A00(this.A01).A00(new C240263Kf(this.A04, this.A06, false, false));
    }

    public final void DwQ(long j, int i) {
        C52310GNb.A07(this.A01, this.A04, this.A05, j, false);
    }
}
