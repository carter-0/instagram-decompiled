package X;

import android.os.Handler;
import com.instagram.common.session.UserSession;

/* renamed from: X.OnB  reason: case insensitive filesystem */
public final class C71574OnB implements AnonymousClass2Kv {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ O7O A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ 0r1 A04;
    public final /* synthetic */ 0r1 A05;

    public C71574OnB(Handler handler, UserSession userSession, O7O o7o, String str, 0r1 r5, 0r1 r6) {
        this.A05 = r5;
        this.A02 = o7o;
        this.A04 = r6;
        this.A00 = handler;
        this.A03 = str;
        this.A01 = userSession;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0218, code lost:
        if (r12 != null) goto L_0x007a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x00cc A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0032  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(X.AnonymousClass3JD r31) {
        /*
            r30 = this;
            if (r31 == 0) goto L_0x021f
            X.3lr r3 = X.C41845B3m.A0U(r31)
            if (r3 == 0) goto L_0x021f
            java.lang.Class<com.instagram.direct.request.graphql.IGDirectMessagingSearchMetaAISnippetQueryQueryResponseImpl$XfbMessagingSearchGenaiSnippet> r2 = com.instagram.direct.request.graphql.IGDirectMessagingSearchMetaAISnippetQueryQueryResponseImpl.XfbMessagingSearchGenaiSnippet.class
            X.3sh r0 = X.C250663lr.Companion
            r1 = -555376563(0xffffffffdee5a04d, float:-8.2731548E18)
            java.lang.String r0 = "xfb_messaging_search_genai_snippet(entry_point:$entry_point,user_prompt:$user_prompt)"
            X.3lr r3 = r3.A03(r2, r0, r1)
            if (r3 == 0) goto L_0x021f
            java.lang.Class<com.instagram.direct.request.graphql.IGDirectMessagingSearchMetaAISnippetQueryQueryResponseImpl$XfbMessagingSearchGenaiSnippet$Edges> r2 = com.instagram.direct.request.graphql.IGDirectMessagingSearchMetaAISnippetQueryQueryResponseImpl.XfbMessagingSearchGenaiSnippet.Edges.class
            r1 = 436543290(0x1a051f3a, float:2.752898E-23)
            java.lang.String r0 = "edges"
            com.google.common.collect.ImmutableList r0 = r3.A06(r2, r0, r1)
        L_0x0022:
            r1 = r30
            X.0r1 r14 = r1.A05
            X.O7O r6 = r1.A02
            X.0r1 r5 = r1.A04
            android.os.Handler r4 = r1.A00
            java.lang.String r15 = r1.A03
            com.instagram.common.session.UserSession r3 = r1.A01
            if (r0 == 0) goto L_0x00ce
            java.util.Iterator r17 = r0.iterator()
        L_0x0036:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x00ce
            X.3lr r7 = X.C41845B3m.A0V(r17)
            if (r7 == 0) goto L_0x0215
            java.lang.Class<com.instagram.direct.request.graphql.IGDirectMessagingSearchMetaAISnippetQueryQueryResponseImpl$XfbMessagingSearchGenaiSnippet$Edges$Node> r2 = com.instagram.direct.request.graphql.IGDirectMessagingSearchMetaAISnippetQueryQueryResponseImpl.XfbMessagingSearchGenaiSnippet.Edges.Node.class
            X.3sh r0 = X.C250663lr.Companion
            r1 = -654084169(0xffffffffd90377b7, float:-2.31280311E15)
            java.lang.String r0 = "node"
            X.3lr r12 = r7.A02(r2, r0, r1)
            if (r12 == 0) goto L_0x0216
            X.Nkm r1 = X.C69407Nkm.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r9 = 0
            java.lang.String r0 = "status"
            java.lang.Enum r2 = r12.getOptionalEnumField(r9, r0, r1)
            java.lang.Class<com.instagram.direct.request.graphql.IGDirectMessagingSearchMetaAISnippetQueryQueryResponseImpl$XfbMessagingSearchGenaiSnippet$Edges$Node$AgentResponse> r7 = com.instagram.direct.request.graphql.IGDirectMessagingSearchMetaAISnippetQueryQueryResponseImpl.XfbMessagingSearchGenaiSnippet.Edges.Node.AgentResponse.class
            r1 = -1157881651(0xffffffffbafc20cd, float:-0.001923585)
            java.lang.String r0 = "agent_response"
            X.3lr r8 = r12.A04(r7, r0, r1)
            if (r8 == 0) goto L_0x0217
            java.lang.Class<com.instagram.direct.request.graphql.IGDirectMessagingSearchMetaAISnippetQueryQueryResponseImpl$XfbMessagingSearchGenaiSnippet$Edges$Node$AgentResponse$Response> r7 = com.instagram.direct.request.graphql.IGDirectMessagingSearchMetaAISnippetQueryQueryResponseImpl.XfbMessagingSearchGenaiSnippet.Edges.Node.AgentResponse.Response.class
            r1 = -359384102(0xffffffffea943bda, float:-8.960183E25)
            java.lang.String r0 = "response"
            X.3lr r1 = r8.getOptionalTreeField(r9, r0, r7, r1)
            if (r1 == 0) goto L_0x0217
            java.lang.String r0 = "content"
            java.lang.String r1 = r1.A07(r0)
        L_0x007a:
            java.lang.Class<com.instagram.direct.request.graphql.IGDirectMessagingSearchMetaAISnippetQueryQueryResponseImpl$XfbMessagingSearchGenaiSnippet$Edges$Node$AgentResponse> r8 = com.instagram.direct.request.graphql.IGDirectMessagingSearchMetaAISnippetQueryQueryResponseImpl.XfbMessagingSearchGenaiSnippet.Edges.Node.AgentResponse.class
            r7 = -1157881651(0xffffffffbafc20cd, float:-0.001923585)
            java.lang.String r0 = "agent_response"
            X.3lr r9 = r12.A04(r8, r0, r7)
            if (r9 == 0) goto L_0x021c
            java.lang.Class<com.instagram.direct.request.graphql.IGDirectMessagingSearchMetaAISnippetQueryQueryResponseImpl$XfbMessagingSearchGenaiSnippet$Edges$Node$AgentResponse$PluginResponse> r8 = com.instagram.direct.request.graphql.IGDirectMessagingSearchMetaAISnippetQueryQueryResponseImpl.XfbMessagingSearchGenaiSnippet.Edges.Node.AgentResponse.PluginResponse.class
            r7 = -1565198237(0xffffffffa2b4f863, float:-4.9052087E-18)
            java.lang.String r0 = "plugin_response"
            X.3lr r10 = r9.A02(r8, r0, r7)
            if (r10 == 0) goto L_0x021c
            java.lang.Class<com.instagram.direct.request.graphql.IGDirectMessagingSearchMetaAISnippetQueryQueryResponseImpl$XfbMessagingSearchGenaiSnippet$Edges$Node$AgentResponse$PluginResponse$ProxyRefusal> r8 = com.instagram.direct.request.graphql.IGDirectMessagingSearchMetaAISnippetQueryQueryResponseImpl.XfbMessagingSearchGenaiSnippet.Edges.Node.AgentResponse.PluginResponse.ProxyRefusal.class
            r7 = -673399849(0xffffffffd7dcbbd7, float:-4.85398648E14)
            r9 = 0
            java.lang.String r0 = "proxy_refusal"
            X.3lr r8 = r10.getOptionalTreeField(r9, r0, r8, r7)
            if (r8 == 0) goto L_0x021c
            X.Nkf r7 = X.C69401Nkf.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r0 = 665(0x299, float:9.32E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            java.lang.Enum r10 = r8.getOptionalEnumField(r9, r0, r7)
        L_0x00ae:
            r8 = 1
            if (r10 == 0) goto L_0x00c8
            boolean r0 = r14.A00
            if (r0 != 0) goto L_0x00c8
            r14.A00 = r8
            X.OsH r0 = r6.A00
            X.OyY r0 = r0.A0F
            X.OO3 r9 = r0.A01
            if (r9 == 0) goto L_0x00c8
            r7 = 3
            X.Nkf r0 = X.C69401Nkf.IS_ERROR
            if (r10 != r0) goto L_0x0207
            r7 = 4
        L_0x00c5:
            r9.A01(r7)
        L_0x00c8:
            X.Nkm r0 = X.C69407Nkm.INELIGIBLE
            if (r2 != r0) goto L_0x00cf
            r5.A00 = r8
        L_0x00ce:
            return
        L_0x00cf:
            boolean r0 = r5.A00
            if (r0 != 0) goto L_0x00dd
            X.PZD r0 = new X.PZD
            r0.<init>(r6, r15)
            r4.post(r0)
            r5.A00 = r8
        L_0x00dd:
            if (r12 == 0) goto L_0x0112
            java.lang.Class<com.instagram.direct.request.graphql.IGDirectMessagingSearchMetaAISnippetQueryQueryResponseImpl$XfbMessagingSearchGenaiSnippet$Edges$Node$AgentResponse> r9 = com.instagram.direct.request.graphql.IGDirectMessagingSearchMetaAISnippetQueryQueryResponseImpl.XfbMessagingSearchGenaiSnippet.Edges.Node.AgentResponse.class
            r7 = -1157881651(0xffffffffbafc20cd, float:-0.001923585)
            java.lang.String r0 = "agent_response"
            X.3lr r10 = r12.A04(r9, r0, r7)
            if (r10 == 0) goto L_0x0112
            java.lang.Class<com.instagram.direct.request.graphql.IGDirectMessagingSearchMetaAISnippetQueryQueryResponseImpl$XfbMessagingSearchGenaiSnippet$Edges$Node$AgentResponse$ResponseMetadata> r9 = com.instagram.direct.request.graphql.IGDirectMessagingSearchMetaAISnippetQueryQueryResponseImpl.XfbMessagingSearchGenaiSnippet.Edges.Node.AgentResponse.ResponseMetadata.class
            r7 = -820079222(0xffffffffcf1e958a, float:-2.66060032E9)
            java.lang.String r0 = "response_metadata"
            X.3lr r9 = r10.A04(r9, r0, r7)
            if (r9 == 0) goto L_0x0112
            java.lang.String r0 = "response_id"
            java.lang.String r0 = r9.getOptionalStringField(r8, r0)
            java.lang.String r7 = "request_id"
            java.lang.String r28 = r9.A07(r7)
        L_0x0105:
            X.Nkm r7 = X.C69407Nkm.SNIPPET_ERROR
            if (r2 != r7) goto L_0x0116
            X.PZE r1 = new X.PZE
            r1.<init>(r3, r0)
            r4.post(r1)
            return
        L_0x0112:
            r0 = 0
            r28 = 0
            goto L_0x0105
        L_0x0116:
            X.Nkm r11 = X.C69407Nkm.SUGGESTED_PROMPT_ERROR
            if (r2 != r11) goto L_0x0122
            X.PWG r7 = new X.PWG
            r7.<init>(r3)
            r4.post(r7)
        L_0x0122:
            X.Nkm r7 = X.C69407Nkm.FETCHING
            if (r2 != r7) goto L_0x0130
            if (r1 == 0) goto L_0x0130
            X.Paf r7 = new X.Paf
            r7.<init>(r3, r1, r0)
            r4.post(r7)
        L_0x0130:
            if (r12 == 0) goto L_0x01f7
            java.lang.String r7 = "suggested_prompts"
            com.google.common.collect.ImmutableList r25 = r12.getRequiredCompactedStringListField(r8, r7)
            if (r25 == 0) goto L_0x01f7
            boolean r7 = r25.isEmpty()
            if (r7 != 0) goto L_0x01f7
            if (r0 == 0) goto L_0x01f7
            if (r28 == 0) goto L_0x01f7
            if (r1 == 0) goto L_0x01f7
            java.lang.Class<com.instagram.direct.request.graphql.IGDirectMessagingSearchMetaAISnippetQueryQueryResponseImpl$XfbMessagingSearchGenaiSnippet$Edges$Node$AgentResponse> r10 = com.instagram.direct.request.graphql.IGDirectMessagingSearchMetaAISnippetQueryQueryResponseImpl.XfbMessagingSearchGenaiSnippet.Edges.Node.AgentResponse.class
            r9 = -1157881651(0xffffffffbafc20cd, float:-0.001923585)
            java.lang.String r7 = "agent_response"
            X.3lr r13 = r12.A04(r10, r7, r9)
            if (r13 == 0) goto L_0x01d4
            java.lang.Class<com.instagram.direct.request.graphql.IGDirectMessagingSearchMetaAISnippetQueryQueryResponseImpl$XfbMessagingSearchGenaiSnippet$Edges$Node$AgentResponse$ViewModels> r12 = com.instagram.direct.request.graphql.IGDirectMessagingSearchMetaAISnippetQueryQueryResponseImpl.XfbMessagingSearchGenaiSnippet.Edges.Node.AgentResponse.ViewModels.class
            r9 = 1798107368(0x6b2cf0e8, float:2.0907289E26)
            r10 = 3
            java.lang.String r7 = "view_models"
            com.google.common.collect.ImmutableList r7 = r13.getRequiredCompactedTreeListField(r10, r7, r12, r9)
            if (r7 == 0) goto L_0x01d4
            java.util.Iterator r16 = r7.iterator()
            r23 = 0
            r22 = 0
            r19 = 0
            r20 = 0
            r21 = 0
        L_0x016f:
            boolean r7 = r16.hasNext()
            if (r7 == 0) goto L_0x01de
            X.3lr r9 = X.C41845B3m.A0V(r16)
            java.lang.String r7 = "__typename"
            java.lang.String r12 = r9.getStringValue(r7)
            java.lang.String r7 = "XFBGenAISearchViewModel"
            boolean r12 = X.0qQ.A0K(r12, r7)
            if (r12 == 0) goto L_0x016f
            java.lang.Class<com.instagram.direct.request.graphql.IGDirectMessagingSearchMetaAISnippetQueryQueryResponseImpl$XfbMessagingSearchGenaiSnippet$Edges$Node$AgentResponse$ViewModels$InlineXFBGenAISearchViewModel> r13 = com.instagram.direct.request.graphql.IGDirectMessagingSearchMetaAISnippetQueryQueryResponseImpl.XfbMessagingSearchGenaiSnippet.Edges.Node.AgentResponse.ViewModels.InlineXFBGenAISearchViewModel.class
            r12 = -1611493295(0xffffffff9ff29051, float:-1.0272974E-19)
            X.3lr r13 = r9.reinterpretIfFulfillsType(r8, r7, r13, r12)
            if (r13 == 0) goto L_0x01d1
            java.lang.Class<com.instagram.direct.request.graphql.IGDirectMessagingSearchMetaAISnippetQueryQueryResponseImpl$XfbMessagingSearchGenaiSnippet$Edges$Node$AgentResponse$ViewModels$InlineXFBGenAISearchViewModel$SearchData> r12 = com.instagram.direct.request.graphql.IGDirectMessagingSearchMetaAISnippetQueryQueryResponseImpl.XfbMessagingSearchGenaiSnippet.Edges.Node.AgentResponse.ViewModels.InlineXFBGenAISearchViewModel.SearchData.class
            r9 = -1115050810(0xffffffffbd89acc6, float:-0.06722407)
            java.lang.String r7 = "search_data"
            X.3lr r7 = r13.A03(r12, r7, r9)
            if (r7 == 0) goto L_0x01d2
            X.Nkb r13 = X.C69397Nkb.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r12 = 2
            java.lang.String r9 = "search_engine"
            java.lang.Enum r9 = r7.getOptionalEnumField(r12, r9, r13)
        L_0x01a8:
            java.lang.String r22 = java.lang.String.valueOf(r9)
            if (r7 == 0) goto L_0x01c8
            java.lang.String r9 = "search_query"
            java.lang.String r21 = r7.getOptionalStringField(r8, r9)
            java.lang.String r9 = "attribution_link"
            java.lang.String r23 = r7.A07(r9)
            java.lang.String r9 = "search_result_uri"
            com.google.common.collect.ImmutableList r20 = r7.getRequiredCompactedStringListField(r10, r9)
            r12 = 4
            java.lang.String r9 = "references_title"
            com.google.common.collect.ImmutableList r19 = r7.getRequiredCompactedStringListField(r12, r9)
            goto L_0x016f
        L_0x01c8:
            r21 = 0
            r23 = 0
            r20 = 0
            r19 = 0
            goto L_0x016f
        L_0x01d1:
            r7 = 0
        L_0x01d2:
            r9 = 0
            goto L_0x01a8
        L_0x01d4:
            r19 = 0
            r20 = 0
            r22 = 0
            r21 = 0
            r23 = 0
        L_0x01de:
            r24 = 8
            X.Jw0 r18 = new X.Jw0
            r18.<init>(r19, r20, r21, r22, r23, r24)
            X.Pc2 r7 = new X.Pc2
            r23 = r7
            r24 = r18
            r26 = r3
            r27 = r0
            r29 = r1
            r23.<init>(r24, r25, r26, r27, r28, r29)
            r4.post(r7)
        L_0x01f7:
            X.Nkm r1 = X.C69407Nkm.COMPLETE
            if (r2 == r1) goto L_0x01fd
            if (r2 != r11) goto L_0x0036
        L_0x01fd:
            X.PZF r1 = new X.PZF
            r1.<init>(r6, r0)
            r4.post(r1)
            goto L_0x0036
        L_0x0207:
            X.Nkf r0 = X.C69401Nkf.IS_REFUSAL
            if (r10 != r0) goto L_0x020e
            r7 = 5
            goto L_0x00c5
        L_0x020e:
            X.Nkf r0 = X.C69401Nkf.NEEDS_MORE_INFO
            if (r10 != r0) goto L_0x00c5
            r7 = 6
            goto L_0x00c5
        L_0x0215:
            r12 = 0
        L_0x0216:
            r2 = 0
        L_0x0217:
            r1 = 0
            if (r12 == 0) goto L_0x021c
            goto L_0x007a
        L_0x021c:
            r10 = 0
            goto L_0x00ae
        L_0x021f:
            r0 = 0
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71574OnB.invoke(X.3JD):void");
    }
}
