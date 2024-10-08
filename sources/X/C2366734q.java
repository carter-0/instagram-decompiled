package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.34q  reason: invalid class name and case insensitive filesystem */
public final class C2366734q {
    public final AnonymousClass0iw A00;
    public final 0wc A01;
    public final UserSession A02;

    public C2366734q(AnonymousClass0iw r2, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
        this.A00 = r2;
        this.A01 = AnonymousClass0kN.A01(r2, userSession);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.EZX r5, java.lang.Integer r6, java.lang.Integer r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14) {
        /*
            r4 = this;
            r3 = 0
            X.0wc r2 = r4.A01
            java.lang.String r1 = "ig_shared_list_entity_tap"
            X.0kJ r0 = r2.A00
            X.0Aj r1 = r2.A00(r0, r1)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x008f
            if (r9 == 0) goto L_0x0027
            java.lang.String r0 = "_"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.util.List r2 = X.00l.A0R(r9, r0, r3)
            int r0 = r2.size()
            if (r0 <= 0) goto L_0x0027
            java.lang.Object r9 = r2.get(r3)
        L_0x0027:
            int r0 = r6.intValue()
            switch(r0) {
                case 0: goto L_0x0096;
                case 1: goto L_0x00a8;
                case 2: goto L_0x00a5;
                case 3: goto L_0x00a2;
                case 4: goto L_0x009f;
                case 5: goto L_0x009c;
                case 6: goto L_0x0099;
                default: goto L_0x002e;
            }
        L_0x002e:
            java.lang.String r2 = "view_members"
        L_0x0030:
            java.lang.String r0 = "action"
            r1.AAJ(r0, r2)
            r3 = 0
            if (r8 == 0) goto L_0x0094
            r0 = 10
            java.lang.Long r2 = X.00y.A0n(r0, r8)
        L_0x003e:
            java.lang.String r0 = "media_owner_id"
            r1.A9F(r0, r2)
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto L_0x0092
            r0 = 10
            java.lang.Long r2 = X.00y.A0n(r0, r9)
        L_0x004d:
            java.lang.String r0 = "media_id"
            r1.A9F(r0, r2)
            java.lang.String r0 = "tray_session_id"
            r1.AAJ(r0, r10)
            java.lang.String r0 = "viewer_session_id"
            r1.AAJ(r0, r11)
            if (r12 == 0) goto L_0x0090
            r0 = 10
            java.lang.Long r2 = X.00y.A0n(r0, r12)
        L_0x0064:
            java.lang.String r0 = "audience_list_id"
            r1.A9F(r0, r2)
            java.lang.String r0 = "audience_list_name"
            r1.AAJ(r0, r13)
            if (r7 == 0) goto L_0x0079
            int r0 = r7.intValue()
            long r2 = (long) r0
            java.lang.Long r3 = java.lang.Long.valueOf(r2)
        L_0x0079:
            java.lang.String r0 = "num_of_pogs_visible"
            r1.A9F(r0, r3)
            r0 = 53
            java.lang.String r0 = X.C273654mx.A00(r0)
            r1.AAJ(r0, r14)
            java.lang.String r0 = "entry_point"
            r1.A8M(r5, r0)
            r1.Cgf()
        L_0x008f:
            return
        L_0x0090:
            r2 = r3
            goto L_0x0064
        L_0x0092:
            r2 = r3
            goto L_0x004d
        L_0x0094:
            r2 = r3
            goto L_0x003e
        L_0x0096:
            java.lang.String r2 = "cta_tap"
            goto L_0x0030
        L_0x0099:
            java.lang.String r2 = "right_swipe"
            goto L_0x0030
        L_0x009c:
            java.lang.String r2 = "swipe"
            goto L_0x0030
        L_0x009f:
            java.lang.String r2 = "long_press"
            goto L_0x0030
        L_0x00a2:
            java.lang.String r2 = "view_members_tap"
            goto L_0x0030
        L_0x00a5:
            java.lang.String r2 = "tap"
            goto L_0x0030
        L_0x00a8:
            r0 = 3752(0xea8, float:5.258E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r0)
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2366734q.A00(X.EZX, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public final void A01(EZX ezx, String str) {
        String A002 = AnonymousClass000.A00(3301);
        0wc r4 = this.A01;
        0Aj A003 = r4.A00(r4.A00, "ig_shared_lists_impressions");
        if (A003.isSampled()) {
            A003.AAJ("action", "impression");
            A003.A8M(ezx, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A003.A9F("media_owner_id", (Long) null);
            A003.A9F("media_id", (Long) null);
            A003.AAJ("tray_session_id", (String) null);
            A003.AAJ("viewer_session_id", (String) null);
            A003.AAJ("nav_chain", str);
            A003.A9F("audience_list_id", (Long) null);
            A003.AAJ("audience_list_name", (String) null);
            A003.A9F("num_of_pogs_visible", (Long) null);
            A003.AAJ(C273654mx.A00(53), A002);
            A003.Cgf();
        }
    }

    public final void A02(Integer num, String str, boolean z) {
        Long l;
        Integer num2;
        String str2;
        0qQ.A0B(str, 0);
        0wc r2 = this.A01;
        0Aj A002 = r2.A00(r2.A00, "reel_tray_impression");
        if (A002.isSampled()) {
            if (num != null) {
                l = Long.valueOf((long) num.intValue());
            } else {
                l = null;
            }
            A002.A9F("tray_position", l);
            A002.AAJ("tray_session_id", str);
            if (z) {
                num2 = AnonymousClass05K.A00;
            } else {
                num2 = AnonymousClass05K.A01;
            }
            if (num2.intValue() != 0) {
                str2 = "group_story_no_faceswarm_peek_nux";
            } else {
                str2 = "group_story_faceswarm_peek_nux";
            }
            A002.AAJ("reel_type", str2);
            A002.A7p("is_group_story_pog", true);
            A002.Cgf();
        }
    }

    public final void A03(String str, String str2) {
        A00((EZX) null, AnonymousClass05K.A0C, (Integer) null, (String) null, (String) null, str, (String) null, (String) null, (String) null, str2);
    }
}
