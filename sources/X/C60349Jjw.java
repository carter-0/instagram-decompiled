package X;

import androidx.paging.PagingSource;
import com.instagram.api.schemas.ClipsTemplateBrowserV2Type;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.Jjw  reason: case insensitive filesystem */
public final class C60349Jjw extends PagingSource {
    public final String A00;
    public final Map A01;
    public final ClipsTemplateBrowserV2Type A02;
    public final UserSession A03;

    public C60349Jjw(ClipsTemplateBrowserV2Type clipsTemplateBrowserV2Type, UserSession userSession, String str, Map map) {
        0qQ.A0B(map, 3);
        this.A03 = userSession;
        this.A00 = str;
        this.A01 = map;
        this.A02 = clipsTemplateBrowserV2Type;
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.JYA, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C60349Jjw r11, java.lang.String r12, X.AnonymousClass4D7 r13) {
        /*
            r3 = 4
            boolean r0 = X.JYA.A01(r3, r13)
            if (r0 == 0) goto L_0x00e2
            r5 = r13
            X.JYA r5 = (X.JYA) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00e2
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0015:
            java.lang.Object r3 = r5.A04
            X.1Hj r6 = X.1Hj.A02
            int r0 = r5.A00
            r8 = 1
            if (r0 == 0) goto L_0x006f
            if (r0 != r8) goto L_0x011c
            long r1 = r5.A01
            java.lang.Object r4 = r5.A03
            X.Hng r4 = (X.C55800Hng) r4
            X.0eS.A00(r3)
        L_0x0029:
            X.3Ii r3 = (X.C239803Ii) r3
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0106
            X.0eM r0 = r4.A04
            com.facebook.quicklog.reliability.UserFlowLoggerImpl r0 = X.C51965G9l.A0a(r0)
            r0.flowEndSuccess(r1)
            java.lang.Object r0 = X.C51972G9s.A0m(r3)
            X.0qQ.A07(r0)
            X.L3H r0 = (X.L3H) r0
            X.Jw2 r3 = r0.A00
            if (r3 == 0) goto L_0x00e9
            java.lang.Object r0 = r3.A00
            X.JwI r0 = (X.C61080JwI) r0
            if (r0 == 0) goto L_0x00e9
            java.lang.Object r0 = r0.A00
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x00e9
            java.util.ArrayList r2 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0059:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00eb
            java.lang.Object r0 = r1.next()
            X.4sL r0 = (X.C276014sL) r0
            X.1Xj r0 = r0.A00
            X.4bN r0 = X.C295375o3.A02(r0)
            r2.add(r0)
            goto L_0x0059
        L_0x006f:
            X.0eS.A00(r3)
            com.instagram.common.session.UserSession r7 = r11.A03
            X.Hng r4 = X.HWS.A00(r7)
            java.lang.String r9 = r11.A00
            r10 = 0
            X.0eM r3 = r4.A04
            com.facebook.quicklog.reliability.UserFlowLoggerImpl r2 = X.C51965G9l.A0a(r3)
            r1 = 357635090(0x15511412, float:4.2223047E-26)
            java.lang.String r0 = "user"
            long r1 = r2.flowStartForMarker(r1, r0, r10)
            com.facebook.quicklog.reliability.UserFlowLoggerImpl r3 = X.C51965G9l.A0a(r3)
            java.lang.String r0 = "section_id"
            r3.flowAnnotate(r1, r0, r9)
            java.util.Set r3 = r4.A03
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            r3.add(r0)
            com.instagram.api.schemas.ClipsTemplateBrowserV2Type r9 = r11.A02
            r5.A02 = r11
            r5.A03 = r4
            r5.A01 = r1
            r5.A00 = r8
            X.1NY r8 = X.DbU.A0M(r7)
            java.lang.String r7 = "default"
            java.lang.String r3 = "clips/"
            java.lang.String r0 = "templates_browser_v2/"
            r8.A04()
            X.JTS.A1L(r8, r3, r0)
            java.lang.Class<X.CDs> r3 = X.C43800CDs.class
            java.lang.Class<X.Cye> r0 = X.C45566Cye.class
            r8.A0Q(r3, r0)
            if (r12 == 0) goto L_0x00c4
            java.lang.String r0 = "max_id"
            r8.A9m(r0, r12)
        L_0x00c4:
            if (r9 == 0) goto L_0x00cd
            java.lang.String r3 = r9.A00
            java.lang.String r0 = "template_browser_type"
            r8.A9m(r0, r3)
        L_0x00cd:
            java.lang.String r0 = "template_category"
            X.1OC r3 = X.DbT.A0T(r8, r0, r7)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.GetClipsTemplatesBrowserResponseV2>, com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.GetClipsTemplatesBrowserResponseV2>>"
            X.0qQ.A0C(r3, r0)
            r0 = 397594746(0x17b2d07a, float:1.1555607E-24)
            java.lang.Object r3 = r3.A00(r0, r5)
            if (r3 != r6) goto L_0x0029
            return r6
        L_0x00e2:
            X.JYA r5 = new X.JYA
            r5.<init>(r11, r13, r3)
            goto L_0x0015
        L_0x00e9:
            X.0sn r2 = X.0sn.A00
        L_0x00eb:
            r0 = 0
            if (r3 == 0) goto L_0x00fe
            java.lang.Object r1 = r3.A01
            X.4sa r1 = (X.C276114sa) r1
            if (r1 == 0) goto L_0x00fe
            boolean r0 = r1.BU8()
            if (r0 == 0) goto L_0x0104
            java.lang.String r0 = r1.BP8()
        L_0x00fe:
            X.Jjs r1 = new X.Jjs
            r1.<init>(r0, r2)
            return r1
        L_0x0104:
            r0 = 0
            goto L_0x00fe
        L_0x0106:
            java.lang.String r3 = "Browser result cannot be fetched"
            X.0eM r0 = r4.A04
            com.facebook.quicklog.reliability.UserFlowLoggerImpl r0 = X.C51965G9l.A0a(r0)
            r0.flowEndFail(r1, r3, r3)
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>(r3)
            X.Jjr r1 = new X.Jjr
            r1.<init>(r0)
            return r1
        L_0x011c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60349Jjw.A00(X.Jjw, java.lang.String, X.4D7):java.lang.Object");
    }
}
