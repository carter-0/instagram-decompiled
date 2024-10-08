package X;

import java.io.IOException;

/* renamed from: X.5xT  reason: invalid class name and case insensitive filesystem */
public abstract class C300595xT {
    public static C300585xS parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C300585xS r2 = new C300585xS();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A0q = r3.A0q();
                r3.A1J();
                A00(r3, r2, A0q);
                r3.A0z();
            }
            r2.A01();
            return r2;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v27, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v31, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v33, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v35, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v37, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v51, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v53, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v55, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v57, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r2v5, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r2v9, types: [java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r2v10 */
    /* JADX WARNING: type inference failed for: r2v19, types: [java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r2v20 */
    /* JADX WARNING: type inference failed for: r2v21, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r2v23, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r2v25, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r2v29, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r2v39, types: [java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r2v40 */
    /* JADX WARNING: type inference failed for: r2v41, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r2v43, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r2v45, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r2v47, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r2v49, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r2v59 */
    /* JADX WARNING: type inference failed for: r2v60 */
    /* JADX WARNING: type inference failed for: r2v61 */
    /* JADX WARNING: type inference failed for: r2v62 */
    /* JADX WARNING: type inference failed for: r2v63 */
    /* JADX WARNING: type inference failed for: r2v64 */
    /* JADX WARNING: type inference failed for: r2v65 */
    /* JADX WARNING: type inference failed for: r2v66 */
    /* JADX WARNING: type inference failed for: r2v67 */
    /* JADX WARNING: type inference failed for: r2v68 */
    /* JADX WARNING: type inference failed for: r2v69 */
    /* JADX WARNING: type inference failed for: r2v70 */
    /* JADX WARNING: type inference failed for: r2v71 */
    /* JADX WARNING: type inference failed for: r2v72 */
    /* JADX WARNING: type inference failed for: r2v73 */
    /* JADX WARNING: type inference failed for: r2v74 */
    /* JADX WARNING: type inference failed for: r2v75 */
    /* JADX WARNING: type inference failed for: r2v76 */
    /* JADX WARNING: type inference failed for: r2v77 */
    /* JADX WARNING: type inference failed for: r2v78 */
    /* JADX WARNING: type inference failed for: r2v79 */
    /* JADX WARNING: type inference failed for: r2v80 */
    /* JADX WARNING: type inference failed for: r2v81 */
    /* JADX WARNING: type inference failed for: r2v82 */
    /* JADX WARNING: type inference failed for: r2v83 */
    /* JADX WARNING: type inference failed for: r2v84 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.16F r5, X.C300585xS r6, java.lang.String r7) {
        /*
            java.lang.String r0 = "thread_id"
            boolean r0 = r0.equals(r7)
            r2 = 0
            if (r0 == 0) goto L_0x0018
            X.16L r1 = r5.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x0015
            java.lang.String r2 = r5.A1P()
        L_0x0015:
            r6.A1D = r2
            return
        L_0x0018:
            java.lang.String r0 = "last_mentioned_item_id"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x002f
            X.16L r1 = r5.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x002c
            java.lang.String r2 = r5.A1P()
        L_0x002c:
            r6.A1E = r2
            return
        L_0x002f:
            java.lang.String r0 = "thread_v2_id"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0046
            X.16L r1 = r5.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x0043
            java.lang.String r2 = r5.A1P()
        L_0x0043:
            r6.A1J = r2
            return
        L_0x0046:
            java.lang.String r0 = "group_thread_jid"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0059
            long r0 = r5.A0y()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.A18 = r0
            return
        L_0x0059:
            java.lang.String r0 = "thread_title"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0070
            X.16L r1 = r5.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x006d
            java.lang.String r2 = r5.A1P()
        L_0x006d:
            r6.A1K = r2
            return
        L_0x0070:
            java.lang.String r0 = "thread_image"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x007f
            X.4jH r0 = X.C271594jG.parseFromJson(r5)
            r6.A0h = r0
            return
        L_0x007f:
            java.lang.String r0 = "nicknames"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x00a9
            X.16L r1 = r5.A11()
            X.16L r0 = X.16L.A0C
            if (r1 != r0) goto L_0x00a6
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x0094:
            X.16L r1 = r5.A1J()
            X.16L r0 = X.16L.A08
            if (r1 == r0) goto L_0x00a6
            X.A5L r0 = X.C44670Cio.parseFromJson(r5)
            if (r0 == 0) goto L_0x0094
            r2.add(r0)
            goto L_0x0094
        L_0x00a6:
            r6.A1X = r2
            return
        L_0x00a9:
            java.lang.String r0 = "nicknames_setting"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x00d3
            X.16L r1 = r5.A11()
            X.16L r0 = X.16L.A0C
            if (r1 != r0) goto L_0x00d0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x00be:
            X.16L r1 = r5.A1J()
            X.16L r0 = X.16L.A08
            if (r1 == r0) goto L_0x00d0
            X.A5M r0 = X.C44671Cip.parseFromJson(r5)
            if (r0 == 0) goto L_0x00be
            r2.add(r0)
            goto L_0x00be
        L_0x00d0:
            r6.A1Y = r2
            return
        L_0x00d3:
            java.lang.String r0 = "users"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0100
            X.16L r1 = r5.A11()
            X.16L r0 = X.16L.A0C
            if (r1 != r0) goto L_0x00fd
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x00e8:
            X.16L r1 = r5.A1J()
            X.16L r0 = X.16L.A08
            if (r1 == r0) goto L_0x00fd
            android.os.Parcelable$Creator r0 = com.instagram.user.model.User.CREATOR
            r0 = 0
            com.instagram.user.model.User r0 = X.1aC.A00(r5, r0)
            if (r0 == 0) goto L_0x00e8
            r2.add(r0)
            goto L_0x00e8
        L_0x00fd:
            r6.A1c = r2
            return
        L_0x0100:
            java.lang.String r0 = "admin_user_ids"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0132
            X.16L r1 = r5.A11()
            X.16L r0 = X.16L.A0C
            if (r1 != r0) goto L_0x012f
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x0115:
            X.16L r1 = r5.A1J()
            X.16L r0 = X.16L.A08
            if (r1 == r0) goto L_0x012f
            X.16L r1 = r5.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x0115
            java.lang.String r0 = r5.A1P()
            if (r0 == 0) goto L_0x0115
            r2.add(r0)
            goto L_0x0115
        L_0x012f:
            r6.A1S = r2
            return
        L_0x0132:
            java.lang.String r0 = "left_users"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x015f
            X.16L r1 = r5.A11()
            X.16L r0 = X.16L.A0C
            if (r1 != r0) goto L_0x015c
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x0147:
            X.16L r1 = r5.A1J()
            X.16L r0 = X.16L.A08
            if (r1 == r0) goto L_0x015c
            android.os.Parcelable$Creator r0 = com.instagram.user.model.User.CREATOR
            r0 = 0
            com.instagram.user.model.User r0 = X.1aC.A00(r5, r0)
            if (r0 == 0) goto L_0x0147
            r2.add(r0)
            goto L_0x0147
        L_0x015c:
            r6.A1W = r2
            return
        L_0x015f:
            java.lang.String r0 = "last_seen_at"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x019d
            X.16L r1 = r5.A11()
            X.16L r0 = X.16L.A0D
            if (r1 != r0) goto L_0x019a
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
        L_0x0174:
            X.16L r1 = r5.A1J()
            X.16L r0 = X.16L.A09
            if (r1 == r0) goto L_0x0199
            java.lang.String r3 = r5.A1P()
            r5.A1J()
            X.16L r1 = r5.A11()
            X.16L r0 = X.16L.A0G
            if (r1 != r0) goto L_0x018f
            r4.put(r3, r2)
            goto L_0x0174
        L_0x018f:
            X.3SZ r0 = X.AnonymousClass3SY.parseFromJson(r5)
            if (r0 == 0) goto L_0x0174
            r4.put(r3, r0)
            goto L_0x0174
        L_0x0199:
            r2 = r4
        L_0x019a:
            r6.A1R = r2
            return
        L_0x019d:
            java.lang.String r0 = "last_activity_at"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x01b0
            long r0 = r5.A0y()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.A19 = r0
            return
        L_0x01b0:
            java.lang.String r0 = "locked_status"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x01bf
            int r0 = r5.A1D()
            r6.A07 = r0
            return
        L_0x01bf:
            java.lang.String r0 = "notification_preview_controls"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x01ce
            int r0 = r5.A1D()
            r6.A09 = r0
            return
        L_0x01ce:
            java.lang.String r0 = "reshare_send_count"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x01dd
            int r0 = r5.A1D()
            r6.A0D = r0
            return
        L_0x01dd:
            java.lang.String r0 = "reshare_receive_count"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x01ec
            int r0 = r5.A1D()
            r6.A0C = r0
            return
        L_0x01ec:
            java.lang.String r0 = "expiring_media_send_count"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x01fb
            int r0 = r5.A1D()
            r6.A03 = r0
            return
        L_0x01fb:
            java.lang.String r0 = "thread_subtype"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x020a
            int r0 = r5.A1D()
            r6.A0I = r0
            return
        L_0x020a:
            java.lang.String r0 = "seen_count"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0219
            int r0 = r5.A1D()
            r6.A0F = r0
            return
        L_0x0219:
            java.lang.String r0 = "active_count"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0228
            int r0 = r5.A1D()
            r6.A00 = r0
            return
        L_0x0228:
            java.lang.String r0 = "expiring_media_receive_count"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0237
            int r0 = r5.A1D()
            r6.A02 = r0
            return
        L_0x0237:
            java.lang.String r0 = "thread_label"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0246
            int r0 = r5.A1D()
            r6.A0H = r0
            return
        L_0x0246:
            java.lang.String r0 = "thread_has_audio_only_call"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0255
            boolean r0 = r5.A0d()
            r6.A1e = r0
            return
        L_0x0255:
            java.lang.String r0 = "marked_as_unread"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0264
            boolean r0 = r5.A0d()
            r6.A1n = r0
            return
        L_0x0264:
            java.lang.String r0 = "muted"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0273
            boolean r0 = r5.A0d()
            r6.A1p = r0
            return
        L_0x0273:
            java.lang.String r0 = "mentions_muted"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0282
            boolean r0 = r5.A0d()
            r6.A1o = r0
            return
        L_0x0282:
            java.lang.String r0 = "reactions_muted"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0291
            boolean r0 = r5.A0d()
            r6.A1s = r0
            return
        L_0x0291:
            java.lang.String r0 = "vc_muted"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x02a0
            boolean r0 = r5.A0d()
            r6.A1v = r0
            return
        L_0x02a0:
            java.lang.String r0 = "is_translation_enabled"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x02af
            boolean r0 = r5.A0d()
            r6.A1u = r0
            return
        L_0x02af:
            java.lang.String r0 = "named"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x02be
            boolean r0 = r5.A0d()
            r6.A1q = r0
            return
        L_0x02be:
            java.lang.String r0 = "canonical"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x02cd
            boolean r0 = r5.A0d()
            r6.A1d = r0
            return
        L_0x02cd:
            java.lang.String r0 = "pending"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x02e0
            boolean r0 = r5.A0d()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.A10 = r0
            return
        L_0x02e0:
            java.lang.String r0 = "spam"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x02f3
            boolean r0 = r5.A0d()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.A11 = r0
            return
        L_0x02f3:
            java.lang.String r0 = "approval_required_for_new_members"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0302
            boolean r0 = r5.A0d()
            r6.A1i = r0
            return
        L_0x0302:
            java.lang.String r0 = "has_restricted_user"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0311
            boolean r0 = r5.A0d()
            r6.A1g = r0
            return
        L_0x0311:
            java.lang.String r0 = "inviter"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0323
            android.os.Parcelable$Creator r0 = com.instagram.user.model.User.CREATOR
            r0 = 0
            com.instagram.user.model.User r0 = X.1aC.A00(r5, r0)
            r6.A0r = r0
            return
        L_0x0323:
            java.lang.String r0 = "video_call_id"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x033a
            X.16L r1 = r5.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x0337
            java.lang.String r2 = r5.A1P()
        L_0x0337:
            r6.A1M = r2
            return
        L_0x033a:
            java.lang.String r0 = "encoded_server_data_info"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0351
            X.16L r1 = r5.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x034e
            java.lang.String r2 = r5.A1P()
        L_0x034e:
            r6.A1N = r2
            return
        L_0x0351:
            java.lang.String r0 = "folder"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0360
            int r0 = r5.A1D()
            r6.A04 = r0
            return
        L_0x0360:
            java.lang.String r0 = "custom_folder_id"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0377
            X.16L r1 = r5.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x0374
            java.lang.String r2 = r5.A1P()
        L_0x0374:
            r6.A1B = r2
            return
        L_0x0377:
            java.lang.String r0 = "input_mode"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0386
            int r0 = r5.A1D()
            r6.A06 = r0
            return
        L_0x0386:
            java.lang.String r0 = "shh_mode_enabled"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0395
            boolean r0 = r5.A0d()
            r6.A1w = r0
            return
        L_0x0395:
            java.lang.String r0 = "shh_replay_enabled"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x03a4
            boolean r0 = r5.A0d()
            r6.A1x = r0
            return
        L_0x03a4:
            java.lang.String r0 = "is_fanclub_subscriber_thread"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x03b3
            boolean r0 = r5.A0d()
            r6.A1m = r0
            return
        L_0x03b3:
            java.lang.String r0 = "is_creator_thread"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x03c2
            boolean r0 = r5.A0d()
            r6.A1l = r0
            return
        L_0x03c2:
            java.lang.String r0 = "ai_agent_social_signal_message_count"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x03d1
            int r0 = r5.A1D()
            r6.A01 = r0
            return
        L_0x03d1:
            java.lang.String r0 = "is_business_thread"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x03e0
            boolean r0 = r5.A0d()
            r6.A1j = r0
            return
        L_0x03e0:
            java.lang.String r0 = "creator_subscriber_thread_response"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x03ef
            com.instagram.direct.model.thread.CreatorSubscriberThreadInfo r0 = X.C293615l4.parseFromJson(r5)
            r6.A0l = r0
            return
        L_0x03ef:
            java.lang.String r0 = "creator_broadcast_thread_data"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x03fe
            com.instagram.direct.model.thread.CreatorBroadcastThreadInfo r0 = X.C291115gY.parseFromJson(r5)
            r6.A0k = r0
            return
        L_0x03fe:
            java.lang.String r0 = "shh_toggler_userid"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0415
            X.16L r1 = r5.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x0412
            java.lang.String r2 = r5.A1P()
        L_0x0412:
            r6.A1I = r2
            return
        L_0x0415:
            java.lang.String r0 = "theme"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0424
            com.instagram.direct.model.DirectThreadThemeInfo r0 = X.AnonymousClass3T6.A00(r5)
            r6.A0e = r0
            return
        L_0x0424:
            java.lang.String r0 = "policy_violation"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0433
            X.5xW r0 = X.C370628wm.parseFromJson(r5)
            r6.A0a = r0
            return
        L_0x0433:
            java.lang.String r0 = "visual_thread"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0442
            X.8x9 r0 = X.C395239zR.parseFromJson(r5)
            r6.A0f = r0
            return
        L_0x0442:
            java.lang.String r0 = "message_request_status"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0451
            int r0 = r5.A1D()
            r6.A08 = r0
            return
        L_0x0451:
            java.lang.String r0 = "thread_context_items"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x047b
            X.16L r1 = r5.A11()
            X.16L r0 = X.16L.A0C
            if (r1 != r0) goto L_0x0478
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x0466:
            X.16L r1 = r5.A1J()
            X.16L r0 = X.16L.A08
            if (r1 == r0) goto L_0x0478
            X.3Tk r0 = X.C242273Ti.parseFromJson(r5)
            if (r0 == 0) goto L_0x0466
            r2.add(r0)
            goto L_0x0466
        L_0x0478:
            r6.A1b = r2
            return
        L_0x047b:
            java.lang.String r0 = "responsiveness_category"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0492
            X.16L r1 = r5.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x048f
            java.lang.String r2 = r5.A1P()
        L_0x048f:
            r6.A1H = r2
            return
        L_0x0492:
            java.lang.String r0 = "icebreakers"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x04bc
            X.16L r1 = r5.A11()
            X.16L r0 = X.16L.A0C
            if (r1 != r0) goto L_0x04b9
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x04a7:
            X.16L r1 = r5.A1J()
            X.16L r0 = X.16L.A08
            if (r1 == r0) goto L_0x04b9
            X.4ou r0 = X.C274684ot.parseFromJson(r5)
            if (r0 == 0) goto L_0x04a7
            r2.add(r0)
            goto L_0x04a7
        L_0x04b9:
            r6.A1U = r2
            return
        L_0x04bc:
            java.lang.String r0 = "persistent_menu_icebreakers"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x04cb
            X.9IV r0 = X.C242203Ta.parseFromJson(r5)
            r6.A0Q = r0
            return
        L_0x04cb:
            java.lang.String r0 = "public_chat_metadata"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x04da
            X.3Te r0 = X.C242223Tc.parseFromJson(r5)
            r6.A0b = r0
            return
        L_0x04da:
            java.lang.String r0 = "ig_school_metadata"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x04e9
            X.JwJ r0 = X.C44676Ciu.parseFromJson(r5)
            r6.A0U = r0
            return
        L_0x04e9:
            java.lang.String r0 = "ig_thread_capabilities"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x04f8
            X.3Tg r0 = X.C242253Tf.parseFromJson(r5)
            r6.A0d = r0
            return
        L_0x04f8:
            java.lang.String r0 = "welcome_message"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0507
            X.Cte r0 = X.C44653CiX.parseFromJson(r5)
            r6.A0Y = r0
            return
        L_0x0507:
            java.lang.String r0 = "pending_user_ids"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0539
            X.16L r1 = r5.A11()
            X.16L r0 = X.16L.A0C
            if (r1 != r0) goto L_0x0536
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x051c:
            X.16L r1 = r5.A1J()
            X.16L r0 = X.16L.A08
            if (r1 == r0) goto L_0x0536
            X.16L r1 = r5.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x051c
            java.lang.String r0 = r5.A1P()
            if (r0 == 0) goto L_0x051c
            r2.add(r0)
            goto L_0x051c
        L_0x0536:
            r6.A1V = r2
            return
        L_0x0539:
            java.lang.String r0 = "is_close_friend_thread"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x054c
            boolean r0 = r5.A0d()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.A0w = r0
            return
        L_0x054c:
            java.lang.String r0 = "is_group"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x055f
            boolean r0 = r5.A0d()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.A0y = r0
            return
        L_0x055f:
            java.lang.String r0 = "will_xac_be_readonly"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0572
            boolean r0 = r5.A0d()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.A17 = r0
            return
        L_0x0572:
            java.lang.String r0 = "is_xac_thread"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0585
            boolean r0 = r5.A0d()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.A14 = r0
            return
        L_0x0585:
            java.lang.String r0 = "is_xac_readonly"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0598
            boolean r0 = r5.A0d()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.A13 = r0
            return
        L_0x0598:
            java.lang.String r0 = "is_verified_thread"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x05ab
            boolean r0 = r5.A0d()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.A12 = r0
            return
        L_0x05ab:
            java.lang.String r0 = "is_limited"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x05be
            boolean r0 = r5.A0d()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.A0z = r0
            return
        L_0x05be:
            java.lang.String r0 = "label_items"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x05e8
            X.16L r1 = r5.A11()
            X.16L r0 = X.16L.A0C
            if (r1 != r0) goto L_0x05e5
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x05d3:
            X.16L r1 = r5.A1J()
            X.16L r0 = X.16L.A08
            if (r1 == r0) goto L_0x05e5
            X.9Iv r0 = X.C70000Nve.parseFromJson(r5)
            if (r0 == 0) goto L_0x05d3
            r2.add(r0)
            goto L_0x05d3
        L_0x05e5:
            r6.A1T = r2
            return
        L_0x05e8:
            java.lang.String r0 = "persistent_menu"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x05f7
            X.9IV r0 = X.C274704ov.parseFromJson(r5)
            r6.A0P = r0
            return
        L_0x05f7:
            java.lang.String r0 = "theme_data"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0606
            X.8wu r0 = X.C370638wn.parseFromJson(r5)
            r6.A0X = r0
            return
        L_0x0606:
            java.lang.String r0 = "system_folder"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0619
            int r0 = r5.A1D()
            X.2EN r0 = X.C242293Tl.A00(r0)
            r6.A0o = r0
            return
        L_0x0619:
            java.lang.String r0 = "thread_languages"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0657
            X.16L r1 = r5.A11()
            X.16L r0 = X.16L.A0D
            if (r1 != r0) goto L_0x0654
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
        L_0x062e:
            X.16L r1 = r5.A1J()
            X.16L r0 = X.16L.A09
            if (r1 == r0) goto L_0x0653
            java.lang.String r3 = r5.A1P()
            r5.A1J()
            X.16L r1 = r5.A11()
            X.16L r0 = X.16L.A0G
            if (r1 != r0) goto L_0x0649
            r4.put(r3, r2)
            goto L_0x062e
        L_0x0649:
            java.lang.String r0 = r5.A1P()
            if (r0 == 0) goto L_0x062e
            r4.put(r3, r0)
            goto L_0x062e
        L_0x0653:
            r2 = r4
        L_0x0654:
            r6.A1Q = r2
            return
        L_0x0657:
            java.lang.String r0 = "translation_banner_impression_count"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0666
            int r0 = r5.A1D()
            r6.A0J = r0
            return
        L_0x0666:
            java.lang.String r0 = "group_link_joinable_mode"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0675
            int r0 = r5.A1D()
            r6.A05 = r0
            return
        L_0x0675:
            java.lang.String r0 = "joinable_group_link"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x068c
            X.16L r1 = r5.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x0689
            java.lang.String r2 = r5.A1P()
        L_0x0689:
            r6.A1C = r2
            return
        L_0x068c:
            java.lang.String r0 = "smart_suggestion"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x069b
            com.instagram.direct.smartsuggestion.model.SmartSuggestion r0 = X.C255263tq.parseFromJson(r5)
            r6.A0q = r0
            return
        L_0x069b:
            java.lang.String r0 = "chat_activity_muted"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x06ae
            boolean r0 = r5.A0d()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.A0t = r0
            return
        L_0x06ae:
            java.lang.String r0 = "outgoing_chat_activity_muted"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x06c1
            boolean r0 = r5.A0d()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.A15 = r0
            return
        L_0x06c1:
            java.lang.String r0 = "outgoing_reels_together_activity_muted"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x06d4
            boolean r0 = r5.A0d()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.A0s = r0
            return
        L_0x06d4:
            java.lang.String r0 = "account_warning"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x06e3
            X.9J6 r0 = X.C370588wi.parseFromJson(r5)
            r6.A0S = r0
            return
        L_0x06e3:
            java.lang.String r0 = "snippet"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x06f2
            X.9IE r0 = X.AnonymousClass3T8.parseFromJson(r5)
            r6.A0M = r0
            return
        L_0x06f2:
            java.lang.String r0 = "is_3p_api_user"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0705
            boolean r0 = r5.A0d()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.A0u = r0
            return
        L_0x0705:
            java.lang.String r0 = "ad_context_data"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0714
            X.4zr r0 = X.C280004zq.parseFromJson(r5)
            r6.A0c = r0
            return
        L_0x0714:
            java.lang.String r0 = "professional_metadata"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0723
            X.9In r0 = X.C370708ww.parseFromJson(r5)
            r6.A0R = r0
            return
        L_0x0723:
            java.lang.String r0 = "is_appointment_booking_enabled"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0736
            boolean r0 = r5.A0d()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.A0v = r0
            return
        L_0x0736:
            java.lang.String r0 = "should_upsell_nudge"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0749
            boolean r0 = r5.A0d()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.A16 = r0
            return
        L_0x0749:
            java.lang.String r0 = "context_line"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0760
            X.16L r1 = r5.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x075d
            java.lang.String r2 = r5.A1P()
        L_0x075d:
            r6.A1A = r2
            return
        L_0x0760:
            java.lang.String r0 = "is_following_chat_creator"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0773
            boolean r0 = r5.A0d()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.A0x = r0
            return
        L_0x0773:
            java.lang.String r0 = "discoverable_thread_data"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0782
            com.instagram.direct.model.thread.DiscoverableThreadInfo r0 = X.C293625l5.parseFromJson(r5)
            r6.A0n = r0
            return
        L_0x0782:
            java.lang.String r0 = "shh_transport_mode"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0791
            int r0 = r5.A1D()
            r6.A0G = r0
            return
        L_0x0791:
            java.lang.String r0 = "wa_group_thread_id"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x07a8
            X.16L r1 = r5.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x07a5
            java.lang.String r2 = r5.A1P()
        L_0x07a5:
            r6.A1O = r2
            return
        L_0x07a8:
            java.lang.String r0 = "btv_enabled_map"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x07b7
            X.3Tu r0 = X.C242353Ts.parseFromJson(r5)
            r6.A0Z = r0
            return
        L_0x07b7:
            java.lang.String r0 = "dm_settings"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x07c6
            X.4li r0 = X.C272954lh.parseFromJson(r5)
            r6.A0m = r0
            return
        L_0x07c6:
            java.lang.String r0 = "takedown_data"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x07d5
            X.N2U r0 = X.C370608wk.parseFromJson(r5)
            r6.A0p = r0
            return
        L_0x07d5:
            java.lang.String r0 = "read_receipts_disabled"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x07e4
            int r0 = r5.A1D()
            r6.A0A = r0
            return
        L_0x07e4:
            java.lang.String r0 = "typing_indicator_disabled"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x07f3
            int r0 = r5.A1D()
            r6.A0K = r0
            return
        L_0x07f3:
            java.lang.String r0 = "unpublished_pro_page_id"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x080a
            X.16L r1 = r5.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x0807
            java.lang.String r2 = r5.A1P()
        L_0x0807:
            r6.A1L = r2
            return
        L_0x080a:
            java.lang.String r0 = "creator_agent_enabled"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0819
            boolean r0 = r5.A0d()
            r6.A1k = r0
            return
        L_0x0819:
            java.lang.String r0 = "creator_ai_enabled_map"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x085b
            X.16L r1 = r5.A11()
            X.16L r0 = X.16L.A0D
            if (r1 != r0) goto L_0x0858
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
        L_0x082e:
            X.16L r1 = r5.A1J()
            X.16L r0 = X.16L.A09
            if (r1 == r0) goto L_0x0857
            java.lang.String r3 = r5.A1P()
            r5.A1J()
            X.16L r1 = r5.A11()
            X.16L r0 = X.16L.A0G
            if (r1 != r0) goto L_0x0849
            r4.put(r3, r2)
            goto L_0x082e
        L_0x0849:
            boolean r0 = r5.A0d()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            if (r0 == 0) goto L_0x082e
            r4.put(r3, r0)
            goto L_0x082e
        L_0x0857:
            r2 = r4
        L_0x0858:
            r6.A1P = r2
            return
        L_0x085b:
            java.lang.String r0 = "has_creator_ai_msg"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x086a
            boolean r0 = r5.A0d()
            r6.A1h = r0
            return
        L_0x086a:
            java.lang.String r0 = "is_stale"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0879
            boolean r0 = r5.A0d()
            r6.A1t = r0
            return
        L_0x0879:
            java.lang.String r0 = "is_pin"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0888
            boolean r0 = r5.A0d()
            r6.A1r = r0
            return
        L_0x0888:
            java.lang.String r0 = "pinned_timestamp"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0897
            long r0 = r5.A0y()
            r6.A0L = r0
            return
        L_0x0897:
            java.lang.String r0 = "channels_context_lines_data"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x08a6
            com.instagram.direct.model.thread.ChannelsContextLine r0 = X.C291125ga.parseFromJson(r5)
            r6.A0j = r0
            return
        L_0x08a6:
            java.lang.String r0 = "instamadillo_cutover_metadata"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x08b5
            X.A5N r0 = X.C370618wl.parseFromJson(r5)
            r6.A0g = r0
            return
        L_0x08b5:
            java.lang.String r0 = "ctd_outcome_upsell_setting"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x08c4
            X.9IV r0 = X.AnonymousClass4E9.parseFromJson(r5)
            r6.A0O = r0
            return
        L_0x08c4:
            java.lang.String r0 = "reminder"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x08d3
            X.JwG r0 = X.C70070Nwm.parseFromJson(r5)
            r6.A0T = r0
            return
        L_0x08d3:
            java.lang.String r0 = "last_daily_prompt"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x08e2
            X.914 r0 = X.C395249zS.parseFromJson(r5)
            r6.A0i = r0
            return
        L_0x08e2:
            java.lang.String r0 = "last_challenge_prompt"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x08f1
            X.Ja7 r0 = X.C63242Ktn.parseFromJson(r5)
            r6.A0W = r0
            return
        L_0x08f1:
            java.lang.String r0 = "recurring_prompt_type"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0908
            X.16L r1 = r5.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x0905
            java.lang.String r2 = r5.A1P()
        L_0x0905:
            r6.A1G = r2
            return
        L_0x0908:
            java.lang.String r0 = "relevancy_score"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0917
            int r0 = r5.A1D()
            r6.A0B = r0
            return
        L_0x0917:
            java.lang.String r0 = "pinned_messages_metadata"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0941
            X.16L r1 = r5.A11()
            X.16L r0 = X.16L.A0C
            if (r1 != r0) goto L_0x093e
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x092c:
            X.16L r1 = r5.A1J()
            X.16L r0 = X.16L.A08
            if (r1 == r0) goto L_0x093e
            X.OHR r0 = X.C70087Nx3.parseFromJson(r5)
            if (r0 == 0) goto L_0x092c
            r2.add(r0)
            goto L_0x092c
        L_0x093e:
            r6.A1Z = r2
            return
        L_0x0941:
            java.lang.String r0 = "lightweight_intervention_appealable_entity_id"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0958
            X.16L r1 = r5.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x0955
            java.lang.String r2 = r5.A1P()
        L_0x0955:
            r6.A1F = r2
            return
        L_0x0958:
            java.lang.String r0 = "has_reached_message_request_limit"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0967
            boolean r0 = r5.A0d()
            r6.A1f = r0
            return
        L_0x0967:
            java.lang.String r0 = "most_recent_polls"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0991
            X.16L r1 = r5.A11()
            X.16L r0 = X.16L.A0C
            if (r1 != r0) goto L_0x098e
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x097c:
            X.16L r1 = r5.A1J()
            X.16L r0 = X.16L.A08
            if (r1 == r0) goto L_0x098e
            X.Jvt r0 = X.C63241Ktm.parseFromJson(r5)
            if (r0 == 0) goto L_0x097c
            r2.add(r0)
            goto L_0x097c
        L_0x098e:
            r6.A1a = r2
            return
        L_0x0991:
            java.lang.String r0 = "nudge"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x09a0
            X.9IM r0 = X.AnonymousClass3U6.parseFromJson(r5)
            r6.A0N = r0
            return
        L_0x09a0:
            java.lang.String r0 = "ongoing_live"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x09af
            X.N49 r0 = X.C70082Nwy.parseFromJson(r5)
            r6.A0V = r0
            return
        L_0x09af:
            java.lang.String r0 = "scheduled_message_count"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x09be
            int r0 = r5.A1D()
            r6.A0E = r0
            return
        L_0x09be:
            X.1XY.A01(r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C300595xT.A00(X.16F, X.5xS, java.lang.String):void");
    }
}
