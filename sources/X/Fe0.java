package X;

public final class Fe0 implements C51881G5t {
    public final int A00;

    public Fe0(int i) {
        this.A00 = i;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [android.content.Context, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        X.FHD.A0F(r2, r7, r3, r8, r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x014b, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        return true;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean AQ2(android.os.Bundle r16, com.instagram.base.activity.BaseFragmentActivity r17, com.instagram.common.session.UserSession r18) {
        /*
            r15 = this;
            int r0 = r15.A00
            r2 = r16
            r7 = r17
            r8 = r18
            switch(r0) {
                case 0: goto L_0x0058;
                case 1: goto L_0x0017;
                case 2: goto L_0x0183;
                case 3: goto L_0x0046;
                case 4: goto L_0x0065;
                case 5: goto L_0x006a;
                case 6: goto L_0x0076;
                case 7: goto L_0x00a2;
                case 8: goto L_0x00de;
                case 9: goto L_0x00fc;
                case 10: goto L_0x0105;
                case 11: goto L_0x01df;
                case 12: goto L_0x0134;
                case 13: goto L_0x013d;
                case 14: goto L_0x0142;
                case 15: goto L_0x014e;
                default: goto L_0x000b;
            }
        L_0x000b:
            com.instagram.clips.intf.ClipsViewerSource r3 = com.instagram.clips.intf.ClipsViewerSource.PUSH_NOTIF
            r6 = 1
        L_0x000e:
            r5 = 0
        L_0x000f:
            r1 = r2
            r2 = r7
            r4 = r8
            X.FHD.A0F(r1, r2, r3, r4, r5, r6)
        L_0x0015:
            r1 = 1
        L_0x0016:
            return r1
        L_0x0017:
            java.lang.String r0 = "uri_string"
            java.lang.String r0 = r2.getString(r0)
            android.net.Uri r2 = X.0cp.A03(r0)
            java.lang.String r0 = "push_category"
            java.lang.String r1 = r2.getQueryParameter(r0)
            java.lang.String r0 = "album_type"
            java.lang.String r5 = r2.getQueryParameter(r0)
            java.lang.String r0 = "meta_gallery_meta_quest_media_ready"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0043
            X.28D r2 = X.28D.A3T
        L_0x0037:
            if (r5 == 0) goto L_0x0015
            java.lang.String r4 = "stories"
            X.AJ5 r0 = X.C49307Esq.A00
            r1 = r7
            r3 = r8
            r0.A07(r1, r2, r3, r4, r5)
            goto L_0x0015
        L_0x0043:
            X.28D r2 = X.28D.A5J
            goto L_0x0037
        L_0x0046:
            java.lang.String r0 = "note_pk"
            java.lang.String r1 = r2.getString(r0)
            java.lang.String r0 = "prompt_id"
            java.lang.String r0 = r2.getString(r0)
            if (r0 == 0) goto L_0x0015
            X.C69983NvN.A00(r7, r8, r0, r1)
            goto L_0x0015
        L_0x0058:
            r1 = 0
            java.lang.String r0 = "id"
            java.lang.String r0 = r2.getString(r0)
            if (r0 == 0) goto L_0x0016
            X.C250563lf.A0c(r7, r8, r0)
            goto L_0x0015
        L_0x0065:
            r0 = 0
            X.FHD.A0J(r7, r2, r8, r0)
            goto L_0x0015
        L_0x006a:
            java.lang.Class<com.instagram.modal.ModalActivity> r1 = com.instagram.modal.ModalActivity.class
            r0 = 3186(0xc72, float:4.465E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.DbU.A0w(r7, r2, r8, r1, r0)
            goto L_0x0015
        L_0x0076:
            boolean r0 = X.C318996ps.A01()
            r13 = 0
            if (r0 == 0) goto L_0x01f1
            X.1q7 r0 = X.C318996ps.A00()
            boolean r0 = r0.A04(r8)
            if (r0 == 0) goto L_0x01f1
            java.lang.String r0 = "opal_user_id"
            java.lang.String r10 = r2.getString(r0)
            if (r10 == 0) goto L_0x01f1
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x01f1
            X.FBp r6 = X.DbU.A0d()
            r9 = 0
            r12 = 1
            java.lang.String r11 = "profile_notification"
            r6.A04(r7, r8, r9, r10, r11, r12, r13)
            goto L_0x0015
        L_0x00a2:
            boolean r0 = X.C318996ps.A01()
            r1 = 0
            if (r0 == 0) goto L_0x0016
            X.1q7 r0 = X.C318996ps.A00()
            boolean r0 = r0.A04(r8)
            if (r0 == 0) goto L_0x0016
            java.lang.String r0 = "media_ids"
            java.lang.String r2 = r2.getString(r0)
            if (r2 == 0) goto L_0x0016
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0016
            java.lang.String r0 = ","
            java.lang.String[] r0 = r2.split(r0)
            java.util.List r2 = java.util.Arrays.asList(r0)
            if (r2 == 0) goto L_0x0016
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0016
            X.FBp r1 = X.DbU.A0d()
            java.lang.String r0 = "push"
            r1.A06(r7, r8, r0, r2)
            goto L_0x0015
        L_0x00de:
            X.1Zy r1 = X.C65001Zz.A00()
            X.AnonymousClass7TG.A1N(r2, r8)
            java.lang.String r0 = "wall_uri_to_bundle"
            java.lang.String r0 = r2.getString(r0)
            if (r0 == 0) goto L_0x00fa
            android.net.Uri r0 = android.net.Uri.parse(r0)
        L_0x00f1:
            com.instagram.wonderwall.model.WallLaunchConfig r0 = X.C49255Ery.A00(r0, r8)
            r1.Cfg(r7, r8, r0)
            goto L_0x0015
        L_0x00fa:
            r0 = 0
            goto L_0x00f1
        L_0x00fc:
            X.1Zy r0 = X.C65001Zz.A00()
            r0.CfU(r7, r8)
            goto L_0x0015
        L_0x0105:
            X.1q6 r5 = X.AnonymousClass3HE.A00()
            java.lang.Integer r4 = X.AnonymousClass05K.A01
            X.FAr r3 = com.instagram.friendmap.configs.FriendMapLaunchConfig.A0C
            X.AnonymousClass7TG.A1N(r8, r2)
            java.lang.String r0 = "friend_map_uri_param"
            java.lang.String r0 = r2.getString(r0)
            r2 = 0
            if (r0 == 0) goto L_0x0132
            android.net.Uri r1 = android.net.Uri.parse(r0)
            if (r1 == 0) goto L_0x0123
            java.lang.String r2 = r1.getHost()
        L_0x0123:
            java.lang.String r0 = "friend_map_audience_settings"
            boolean r0 = X.0qQ.A0K(r2, r0)
            com.instagram.friendmap.configs.FriendMapLaunchConfig r0 = r3.A01(r1, r8, r4, r0)
            r5.A02(r7, r8, r0)
            goto L_0x0015
        L_0x0132:
            r1 = r2
            goto L_0x0123
        L_0x0134:
            com.instagram.clips.intf.ClipsViewerSource r3 = com.instagram.clips.intf.ClipsViewerSource.PLAYLIST_PUSH_NOTIF
            java.lang.String r0 = "playlist_title"
            java.lang.String r5 = r2.getString(r0)
            goto L_0x014b
        L_0x013d:
            com.instagram.clips.intf.ClipsViewerSource r3 = com.instagram.clips.intf.ClipsViewerSource.PUSH_NOTIF
            r6 = 0
            goto L_0x000e
        L_0x0142:
            com.instagram.clips.intf.ClipsViewerSource r3 = com.instagram.clips.intf.ClipsViewerSource.BREAKING_CREATOR_LABEL
            r0 = 2131955339(0x7f130e8b, float:1.9547203E38)
            java.lang.String r5 = r7.getString(r0)
        L_0x014b:
            r6 = 0
            goto L_0x000f
        L_0x014e:
            X.17i r1 = X.17h.A00(r8)
            java.lang.String r0 = r8.A06
            com.instagram.user.model.User r4 = r1.A02(r0)
            if (r4 != 0) goto L_0x0163
            java.lang.String r1 = "AppStartupUtil"
            java.lang.String r0 = "invalidNotification: Barcelona notif doesn't contain a user"
            X.0wb.A03(r1, r0)
            goto L_0x0015
        L_0x0163:
            java.lang.String r0 = "get_app_entrypoint"
            java.lang.String r5 = r2.getString(r0)
            java.lang.String r0 = "injected_actor_ids"
            java.lang.String r6 = r2.getString(r0)
            r14 = 0
            X.FTd r2 = new X.FTd
            r9 = r2
            r12 = r4
            r13 = r5
            r10 = r7
            r11 = r8
            r9.<init>(r10, r11, r12, r13, r14)
            X.FEg r0 = X.C49908FEg.A00
            r1 = r7
            r3 = r8
            r0.A01(r1, r2, r3, r4, r5, r6)
            goto L_0x0015
        L_0x0183:
            java.lang.String r0 = "uri_string"
            java.lang.String r0 = r2.getString(r0)
            r11 = 0
            android.net.Uri r1 = X.0cp.A03(r0)
            java.lang.String r6 = "persona_id"
            java.lang.String r5 = r1.getQueryParameter(r6)
            java.lang.String r4 = "bot_id"
            java.lang.String r12 = r1.getQueryParameter(r4)
            java.lang.String r0 = "is_approved"
            java.lang.String r1 = r1.getQueryParameter(r0)
            X.1Av r2 = X.1Au.A00(r8)
            java.lang.String r0 = "True"
            boolean r0 = r1.equals(r0)
            r1 = 1
            if (r0 == 0) goto L_0x01c9
            X.0xa r3 = r2.A01
            java.lang.String r2 = "has_seen_ai_approved_nux"
            boolean r0 = X.DbT.A1a(r3, r2)
            if (r0 != 0) goto L_0x01c9
            X.DbX.A1V(r3, r2, r1)
            android.os.Bundle r3 = X.DbV.A0C(r6, r5)
            r3.putString(r4, r12)
            java.lang.Class<com.instagram.modal.ModalActivity> r2 = com.instagram.modal.ModalActivity.class
            java.lang.String r0 = "AI_APPROVED"
            X.DbU.A0w(r7, r3, r8, r2, r0)
            return r1
        L_0x01c9:
            com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher r6 = new com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher
            r6.<init>(r8)
            java.lang.String r0 = "AppStartupUtil"
            X.0xG r8 = X.DbS.A0O(r0)
            java.lang.String r10 = ""
            com.instagram.common.typedurl.SimpleImageUrl r9 = X.DbS.A0V(r10)
            r13 = r11
            r6.A05(r7, r8, r9, r10, r11, r12, r13)
            return r1
        L_0x01df:
            java.lang.String r0 = "quick_snap_media_id"
            java.lang.String r0 = r2.getString(r0)
            if (r0 != 0) goto L_0x01e9
            java.lang.String r0 = ""
        L_0x01e9:
            boolean r1 = X.DbW.A1Y(r0)
            X.C49086EpB.A00(r7, r8, r0, r1)
            return r1
        L_0x01f1:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Fe0.AQ2(android.os.Bundle, com.instagram.base.activity.BaseFragmentActivity, com.instagram.common.session.UserSession):boolean");
    }
}
