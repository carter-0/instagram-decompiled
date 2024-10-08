package X;

import com.instagram.foa.session.IgMetaSessionImpl;
import com.meta.foa.session.FoaUserSession;

public final class I45 {
    public C54674HOf A00;
    public final C58840Ae A01;
    public final C56507Hzd A02;
    public final C56568I1x A03;

    public /* synthetic */ I45(FoaUserSession foaUserSession, C56568I1x i1x) {
        C56507Hzd hzd = new C56507Hzd(foaUserSession, i1x.A01);
        0wc A022 = AnonymousClass0kN.A02(((IgMetaSessionImpl) foaUserSession).A00);
        this.A03 = i1x;
        this.A02 = hzd;
        this.A01 = A022;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00c2, code lost:
        if (new X.11S("@\\[\\d+:(.+?)]").A07(r7) != false) goto L_0x00c4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C54674HOf r11, X.C54675HOg r12, X.I45 r13, java.lang.Long r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18) {
        /*
            r7 = r16
            r1 = r13
            X.I1x r9 = r13.A03
            X.Hsf r10 = r9.A01
            r5 = 0
            java.lang.String r0 = "app_session_id"
            X.0eP r0 = X.AnonymousClass7TE.A1L(r0, r5)
            r13 = 0
            java.lang.String r6 = r9.A07
            java.lang.String r4 = "surface_session_id"
            java.util.LinkedHashMap r3 = X.DbY.A0p(r4, r6, r0)
            X.0Ae r1 = r1.A01
            java.lang.String r0 = "meta_ai_write_with_ai_events"
            X.0Aj r2 = X.C51969G9p.A0d(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x00de
            java.lang.String r0 = "event_name"
            r2.AAJ(r0, r15)
            java.lang.String r8 = ""
            java.lang.String r0 = "intent_session_id"
            r2.AAJ(r0, r8)
            java.lang.String r1 = r10.A00
            java.lang.String r0 = "bottom_sheet_session_id"
            r2.AAJ(r0, r1)
            java.lang.Integer r0 = r9.A05
            X.XSJ r0 = X.XXw.A00(r0)
            X.C51965G9l.A1A(r0, r2)
            java.lang.String r0 = "trigger_action"
            r2.A8M(r12, r0)
            r1 = r7
            if (r16 != 0) goto L_0x004a
            r1 = r8
        L_0x004a:
            java.lang.String r0 = "write_suggestion_content"
            r2.AAJ(r0, r1)
            java.lang.String r0 = "write_suggestion_id"
            r2.AAJ(r0, r8)
            r0 = 68
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r2.A8M(r11, r0)
            X.HtJ r1 = r9.A02
            java.lang.String r9 = r1.A02
            java.lang.String r0 = "initial_content"
            r2.AAJ(r0, r9)
            r0 = 355(0x163, float:4.97E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r10 = r17
            r2.AAJ(r0, r10)
            java.lang.String r0 = "prompt_request_id"
            r10 = r18
            r2.AAJ(r0, r10)
            java.lang.String r0 = "suggested_prompt_index"
            r2.A9F(r0, r14)
            X.JMY r12 = r1.A00
            java.util.LinkedHashMap r10 = X.AnonymousClass7TE.A1H()
            boolean r1 = r12 instanceof X.C57594IdL
            r0 = 3582(0xdfe, float:5.02E-42)
            java.lang.String r11 = X.AnonymousClass000.A00(r0)
            if (r1 == 0) goto L_0x00df
            X.IdL r12 = (X.C57594IdL) r12
            java.util.List r1 = r12.A00
            java.lang.String r0 = ", "
            java.lang.String r0 = X.00k.A0P(r0, r8, r8, r1, r5)
            r10.put(r11, r0)
        L_0x009a:
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L_0x00a1
            r10 = 0
        L_0x00a1:
            java.lang.String r0 = "write_context"
            r2.A9H(r0, r10)
            if (r9 != 0) goto L_0x00a9
            r9 = r8
        L_0x00a9:
            java.lang.String r1 = "@\\[\\d+:(.+?)]"
            X.11S r0 = new X.11S
            r0.<init>(r1)
            boolean r0 = r0.A07(r9)
            if (r0 != 0) goto L_0x00c4
            if (r16 != 0) goto L_0x00b9
            r7 = r8
        L_0x00b9:
            X.11S r0 = new X.11S
            r0.<init>(r1)
            boolean r0 = r0.A07(r7)
            if (r0 == 0) goto L_0x00c5
        L_0x00c4:
            r13 = 1
        L_0x00c5:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r13)
            java.lang.String r0 = "has_mentions"
            r2.A7p(r0, r1)
            java.lang.String r0 = "app_context_data"
            r2.A9H(r0, r3)
            r2.AAJ(r4, r6)
            java.lang.String r0 = "surface_string_override"
            r2.AAJ(r0, r5)
            r2.Cgf()
        L_0x00de:
            return
        L_0x00df:
            boolean r0 = r12 instanceof X.C57595IdM
            if (r0 == 0) goto L_0x00f2
            X.IdM r12 = (X.C57595IdM) r12
            java.lang.String r0 = r12.A00
            r10.put(r11, r0)
            java.lang.String r1 = r12.A01
            java.lang.String r0 = "text"
            r10.put(r0, r1)
            goto L_0x009a
        L_0x00f2:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I45.A00(X.HOf, X.HOg, X.I45, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public static final void A01(C54674HOf hOf, C54675HOg hOg, I45 i45, String str, String str2) {
        C54674HOf hOf2 = hOf;
        I45 i452 = i45;
        A00(hOf2, hOg, i452, (Long) null, "generate_write_suggestions", (String) null, str, str2);
        i452.A00 = hOf2;
    }
}
