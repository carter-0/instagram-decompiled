package com.instagram.direct.inbox.notes;

import X.0Df;
import X.0qQ;
import X.17k;
import X.1NY;
import X.1XP;
import X.1XY;
import X.1vn;
import X.2IS;
import X.AnonymousClass0K0;
import X.AnonymousClass1vS;
import X.AnonymousClass2IY;
import X.AnonymousClass4D7;
import X.C42798BiY;
import X.C42800Bia;
import X.C42802Bic;
import X.C43820CEm;
import X.C45602CzE;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

public final class NotesApi {
    public final 1vn A00;
    public final UserSession A01;

    public NotesApi(UserSession userSession, 1vn r3) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r3, 2);
        this.A01 = userSession;
        this.A00 = r3;
    }

    public final Object A01(Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, AnonymousClass4D7 r24, long j) {
        2IS r2 = new 2IS();
        2IS r4 = new 2IS();
        AnonymousClass0K0 r3 = GraphQlCallInput.A02;
        String valueOf = String.valueOf(j);
        0Df A02 = r3.A02();
        0Df.A00(A02, valueOf, "note_id");
        0Df.A00(A02, str, "emoji");
        0Df.A00(A02, str2, "event_source");
        0Df.A00(A02, str3, "container_module");
        0Df.A00(A02, str4, "nav_chain");
        0Df.A00(A02, str5, "inventory_source");
        0Df.A00(A02, str6, "ranking_info_token");
        0Df.A00(A02, num, "media_client_position");
        0Df.A00(A02, str7, "carousel_media_id");
        0Df.A00(A02, num2, "carousel_index");
        r2.A00.A02().A0E(A02, "request");
        AnonymousClass2IY r0 = PandoGraphQLRequest.Companion;
        return this.A00.A04(new PandoGraphQLRequest(AnonymousClass1vS.A00(), "CreateInboxTrayReactionRequest", r2.getParamsCopy(), r4.getParamsCopy(), C42798BiY.class, true, (PandoRealtimeInfoJNI) null, 0, (String) null, "xdt_create_inbox_tray_reaction", new ArrayList()), r24);
    }

    public final Object A03(Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, AnonymousClass4D7 r23, long j) {
        2IS r2 = new 2IS();
        2IS r4 = new 2IS();
        AnonymousClass0K0 r3 = GraphQlCallInput.A02;
        String valueOf = String.valueOf(j);
        0Df A02 = r3.A02();
        0Df.A00(A02, valueOf, "note_id");
        0Df.A00(A02, str, "event_source");
        0Df.A00(A02, str2, "container_module");
        0Df.A00(A02, str3, "nav_chain");
        0Df.A00(A02, str4, "inventory_source");
        0Df.A00(A02, str5, "ranking_info_token");
        0Df.A00(A02, num, "media_client_position");
        0Df.A00(A02, str6, "carousel_media_id");
        0Df.A00(A02, num2, "carousel_index");
        r2.A00.A02().A0E(A02, "request");
        AnonymousClass2IY r0 = PandoGraphQLRequest.Companion;
        return this.A00.A04(new PandoGraphQLRequest(AnonymousClass1vS.A00(), "DeleteInboxTrayReactionRequest", r2.getParamsCopy(), r4.getParamsCopy(), C42802Bic.class, true, (PandoRealtimeInfoJNI) null, 0, (String) null, "xdt_delete_inbox_tray_reaction", new ArrayList()), r23);
    }

    public final Object A04(String str, AnonymousClass4D7 r16) {
        2IS r2 = new 2IS();
        2IS r1 = new 2IS();
        r2.A04("item_id", str);
        boolean z = false;
        if (str != null) {
            z = true;
        }
        17k.A0E(z);
        AnonymousClass2IY r0 = PandoGraphQLRequest.Companion;
        return this.A00.A04(new PandoGraphQLRequest(AnonymousClass1vS.A00(), "DeleteInboxTrayItemRequest", r2.getParamsCopy(), r1.getParamsCopy(), C42800Bia.class, true, (PandoRealtimeInfoJNI) null, 0, (String) null, "xdt_delete_inbox_tray_item", new ArrayList()), r16);
    }

    public final Object A00(Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, AnonymousClass4D7 r13, long j) {
        1NY r2 = new 1NY(this.A01, -2);
        r2.A04();
        r2.A0A("notes/create_emoji_reaction/");
        r2.A0D("note_id", j);
        r2.A9m("emoji", str);
        r2.A0G("event_source", str2);
        r2.A0G("container_module", str3);
        r2.A0G("nav_chain", str4);
        r2.A0G("inventory_source", str5);
        r2.A0G("ranking_info_token", str6);
        r2.A09(num, "media_client_position");
        r2.A0G("carousel_media_id", str7);
        r2.A09(num2, "carousel_index");
        r2.A0Q(1XP.class, 1XY.class);
        return r2.A0M().A00(154543310, r13);
    }

    public final Object A02(Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, AnonymousClass4D7 r12, long j) {
        1NY r2 = new 1NY(this.A01, -2);
        r2.A04();
        r2.A0A("notes/delete_emoji_reaction/");
        r2.A0D("note_id", j);
        r2.A0G("event_source", str);
        r2.A0G("container_module", str2);
        r2.A0G("nav_chain", str3);
        r2.A0G("inventory_source", str4);
        r2.A0G("ranking_info_token", str5);
        r2.A09(num, "media_client_position");
        r2.A0G("carousel_media_id", str6);
        r2.A09(num2, "carousel_index");
        r2.A0Q(1XP.class, 1XY.class);
        return r2.A0M().A00(24904279, r12);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.ME7, X.4D7] */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A05(java.lang.String r16, X.AnonymousClass4D7 r17) {
        /*
            r15 = this;
            r4 = 15
            r5 = r17
            boolean r0 = X.ME7.A02(r4, r5)
            if (r0 == 0) goto L_0x00a8
            r1 = r5
            X.ME7 r1 = (X.ME7) r1
            int r3 = r1.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r2
            if (r0 == 0) goto L_0x00a8
            int r3 = r3 - r2
            r1.A00 = r3
        L_0x0018:
            java.lang.Object r3 = r1.A01
            X.1Hj r2 = X.1Hj.A02
            int r0 = r1.A00
            r9 = 1
            if (r0 == 0) goto L_0x0053
            if (r0 != r9) goto L_0x00b7
            X.0eS.A00(r3)
        L_0x0026:
            X.3Ii r3 = (X.C239803Ii) r3
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0049
            X.3Ih r3 = (X.C239793Ih) r3
            java.lang.Object r0 = r3.A00
            X.3JC r0 = (X.AnonymousClass3JC) r0
            java.lang.Object r0 = r0.A01
            X.3Ih r3 = new X.3Ih
            r3.<init>(r0)
        L_0x0039:
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0048
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00b1
            X.0gF r0 = X.C60340gF.A00
            X.5sO r3 = new X.5sO
            r3.<init>(r0)
        L_0x0048:
            return r3
        L_0x0049:
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0039
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0053:
            X.0eS.A00(r3)
            r10 = 0
            X.2IS r6 = new X.2IS
            r6.<init>()
            X.2IS r5 = new X.2IS
            r5.<init>()
            X.0K0 r3 = com.facebook.graphql.calls.GraphQlCallInput.A02
            r0 = 3815(0xee7, float:5.346E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0Df r4 = r3.A02()
            r3 = r16
            X.0Df.A00(r4, r3, r0)
            java.lang.String r3 = "request"
            X.2IV r0 = r6.A00
            X.0Df r0 = r0.A02()
            r0.A0E(r4, r3)
            X.2IY r0 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1vR r4 = X.AnonymousClass1vS.A00()
            java.util.Map r6 = r6.getParamsCopy()
            java.util.Map r7 = r5.getParamsCopy()
            java.lang.Class<X.Biq> r8 = X.C42816Biq.class
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.lang.String r5 = "HidePromptNoteRequest"
            r11 = 0
            java.lang.String r13 = "xdt_hide_prompt_note"
            com.facebook.pando.PandoGraphQLRequest r3 = new com.facebook.pando.PandoGraphQLRequest
            r12 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            X.1vn r0 = r15.A00
            r1.A00 = r9
            java.lang.Object r3 = r0.A04(r3, r1)
            if (r3 != r2) goto L_0x0026
            return r2
        L_0x00a8:
            r0 = 42
            X.ME7 r1 = new X.ME7
            r1.<init>(r15, r5, r4, r0)
            goto L_0x0018
        L_0x00b1:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x00b7:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.inbox.notes.NotesApi.A05(java.lang.String, X.4D7):java.lang.Object");
    }

    public final Object A06(String str, AnonymousClass4D7 r5, long j) {
        1NY r2 = new 1NY(this.A01, -2);
        r2.A05();
        r2.A0A("notes/get_emoji_reactions/");
        r2.A0D("note_id", j);
        r2.A9m("max_id", str);
        r2.A0Q(C43820CEm.class, C45602CzE.class);
        return r2.A0M().A00(2077173395, r5);
    }
}
