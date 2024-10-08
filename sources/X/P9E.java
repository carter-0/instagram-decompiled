package X;

import android.net.Uri;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import java.util.LinkedHashMap;

public final class P9E implements AnonymousClass7XD {
    public final 0wc A00;
    public final UserSession A01;
    public final AnonymousClass0eM A02 = C73909Plk.A00(this, 24);
    public final C62320sa A03;
    public final 0bY A04 = DbW.A0G();

    public P9E(UserSession userSession, C62320sa r3) {
        0qQ.A0B(r3, 2);
        this.A01 = userSession;
        this.A03 = r3;
        this.A00 = DbW.A0J(userSession, "direct_thread");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a3, code lost:
        if (r9.contains("reel") != true) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x004a, code lost:
        if ((r15 instanceof X.C254763t0) != true) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Ch6(X.C254793t3 r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.util.List r21) {
        /*
            r14 = this;
            r3 = 1
            r4 = r17
            r7 = r18
            r5 = r21
            X.AnonymousClass7TG.A0w(r3, r4, r7, r5)
            com.instagram.common.session.UserSession r6 = r14.A01
            X.0Tu r2 = X.0Tu.A05
            r0 = 36327288656378182(0x810f7a00043946, double:3.036861852319317E-306)
            boolean r0 = X.182.A06(r2, r6, r0)
            if (r0 == 0) goto L_0x014b
            X.0wc r1 = r14.A00
            java.lang.String r0 = "direct_thread_link_impression"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x0148
            java.lang.String r0 = "bot_response_id"
            r2.AAJ(r0, r7)
            X.0sa r0 = r14.A03
            java.lang.Object r1 = r0.invoke()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "thread_session_id"
            r2.AAJ(r0, r1)
            java.lang.String r0 = "message_id"
            r2.AAJ(r0, r4)
            java.lang.String r0 = "entrypoint"
            r1 = r19
            r2.AAJ(r0, r1)
            if (r15 == 0) goto L_0x004c
            boolean r1 = r15 instanceof X.C254763t0
            r0 = 1
            if (r1 == r3) goto L_0x004d
        L_0x004c:
            r0 = 0
        L_0x004d:
            r13 = 0
            if (r0 == 0) goto L_0x0130
            X.3t0 r0 = X.C300965yF.A02(r15)
            if (r0 == 0) goto L_0x012d
            java.lang.String r0 = r0.A00
        L_0x0058:
            X.C66580MXl.A1K(r2, r0)
        L_0x005b:
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r12 = r5.iterator()
            r1 = 0
        L_0x0064:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0143
            java.lang.Object r0 = r12.next()
            int r11 = r1 + 1
            if (r1 >= 0) goto L_0x007a
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x007a:
            X.7Fr r0 = (X.C328667Fr) r0
            X.N1G r5 = X.N1G.A00(r1)
            X.9J6 r0 = r0.A08
            java.lang.String r1 = r0.A01
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x0128
            X.0bY r0 = r14.A04
            android.net.Uri r6 = X.0cp.A01(r0, r1)
            if (r6 == 0) goto L_0x0129
            java.util.List r9 = r6.getPathSegments()
            java.util.Set r10 = r6.getQueryParameterNames()
            if (r9 == 0) goto L_0x00a5
            java.lang.String r0 = "reel"
            boolean r1 = r9.contains(r0)
            r0 = 1
            if (r1 == r3) goto L_0x00a6
        L_0x00a5:
            r0 = 0
        L_0x00a6:
            java.lang.String r8 = ""
            if (r0 == 0) goto L_0x00c2
            X.NmQ r1 = X.C69482NmQ.REELS
            java.lang.String r0 = "type"
            r5.A01(r1, r0)
            java.lang.String r1 = "id"
            java.lang.String r0 = r6.getQueryParameter(r1)
            if (r0 == 0) goto L_0x00ba
            r8 = r0
        L_0x00ba:
            r5.A06(r1, r8)
        L_0x00bd:
            r4.add(r5)
            r1 = r11
            goto L_0x0064
        L_0x00c2:
            java.lang.String r7 = "igid"
            if (r10 == 0) goto L_0x0105
            boolean r0 = r10.contains(r7)
            if (r0 != r3) goto L_0x00e0
            X.NmQ r1 = X.C69482NmQ.USER
            java.lang.String r0 = "type"
            r5.A01(r1, r0)
            java.lang.String r0 = r6.getQueryParameter(r7)
            if (r0 == 0) goto L_0x00da
            r8 = r0
        L_0x00da:
            java.lang.String r0 = "id"
            r5.A06(r0, r8)
            goto L_0x00bd
        L_0x00e0:
            r0 = 70
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r10.contains(r0)
            if (r0 != r3) goto L_0x0105
            X.NmQ r1 = X.C69482NmQ.CAROUSEL
            java.lang.String r0 = "type"
            r5.A01(r1, r0)
            java.lang.String r0 = r6.getLastPathSegment()
            if (r0 == 0) goto L_0x0103
            java.lang.String r1 = X.C70282O0m.A00(r0)
        L_0x00fd:
            java.lang.String r0 = "id"
            r5.A06(r0, r1)
            goto L_0x00bd
        L_0x0103:
            r1 = r13
            goto L_0x00fd
        L_0x0105:
            if (r9 == 0) goto L_0x00bd
            java.lang.String r0 = "p"
            boolean r0 = r9.contains(r0)
            if (r0 != r3) goto L_0x00bd
            X.NmQ r1 = X.C69482NmQ.PHOTO
            java.lang.String r0 = "type"
            r5.A01(r1, r0)
            java.lang.String r0 = r6.getLastPathSegment()
            if (r0 == 0) goto L_0x0126
            java.lang.String r1 = X.C70282O0m.A00(r0)
        L_0x0120:
            java.lang.String r0 = "id"
            r5.A06(r0, r1)
            goto L_0x00bd
        L_0x0126:
            r1 = r13
            goto L_0x0120
        L_0x0128:
            r6 = r13
        L_0x0129:
            r9 = r13
            r10 = r13
            goto L_0x00a5
        L_0x012d:
            r0 = r13
            goto L_0x0058
        L_0x0130:
            if (r15 == 0) goto L_0x005b
            boolean r0 = r15 instanceof com.instagram.model.direct.threadkey.impl.MsysThreadId
            if (r0 != r3) goto L_0x005b
            com.instagram.model.direct.threadkey.impl.MsysThreadId r0 = X.C300965yF.A03(r15)
            java.lang.Long r1 = r0.A02
            java.lang.String r0 = "armadillo_thread_id"
            r2.A9F(r0, r1)
            goto L_0x005b
        L_0x0143:
            java.lang.String r0 = "content_list"
            r2.AAe(r0, r4)
        L_0x0148:
            r2.Cgf()
        L_0x014b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P9E.Ch6(X.3t3, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List):void");
    }

    public final void Ch7(C254793t3 r11, String str, String str2, String str3, int i) {
        String str4;
        AnonymousClass7TF.A1C(str, 0, str3);
        this.A02.getValue();
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        A1H.put(TraceFieldType.ContentType, C273654mx.A00(1445));
        A1H.put("agent_id", str);
        A1H.put("bot_response_id", str2);
        A1H.put("xma_tap_index", String.valueOf(i));
        0Aj A0e = AnonymousClass7TE.A0e(this.A00, "direct_thread_link_impression");
        Uri A09 = DbT.A09(str3);
        String queryParameter = A09.getQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        if (queryParameter == null) {
            queryParameter = "";
        }
        if (A0e.isSampled()) {
            A0e.AAJ("media_id", queryParameter);
            if (r11 != null) {
                if (r11 instanceof C254763t0) {
                    C254763t0 A022 = C300965yF.A02(r11);
                    if (A022 != null) {
                        str4 = A022.A00;
                    } else {
                        str4 = null;
                    }
                    C66580MXl.A1K(A0e, str4);
                } else if (r11 instanceof MsysThreadId) {
                    A0e.A9F("armadillo_thread_id", C300965yF.A03(r11).A02);
                }
            }
            if (A1H.get("bot_response_id") != null) {
                if (182.A06(0Tu.A05, this.A01, 36327288656378182L)) {
                    String str5 = (String) this.A03.invoke();
                    if (str5 != null) {
                        A0e.AAJ("thread_session_id", str5);
                    }
                    A0e.AAJ("bot_response_id", DbS.A0r("bot_response_id", A1H));
                    N1G A002 = N1G.A00(i);
                    if (A09.getPathSegments().contains("reel")) {
                        A002.A01(C69482NmQ.REELS, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                        A002.A06(PublicKeyCredentialControllerUtility.JSON_KEY_ID, queryParameter);
                        A0e.AAe("content_list", AnonymousClass7TE.A1I(A002));
                    }
                }
            }
            C66583MXo.A18(A0e, A1H);
        }
    }
}
