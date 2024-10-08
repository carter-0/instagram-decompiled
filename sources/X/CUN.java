package X;

public abstract class CUN {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v63, resolved type: com.instagram.api.schemas.EarnedOnMediaState} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.instagram.api.schemas.Achievement parseFromJson(X.16F r44) {
        /*
            r0 = 0
            r2 = r44
            X.0qQ.A0B(r2, r0)
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            X.16L r0 = X.16L.A0D     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            r19 = 0
            if (r1 == r0) goto L_0x0014
            r2.A0z()     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            return r19
        L_0x0014:
            r18 = r19
            r28 = r19
            r29 = r19
            r12 = r19
            r17 = r12
            r30 = r12
            r31 = r12
            r32 = r12
            r33 = r12
            r34 = r12
            r16 = r12
            r35 = r12
            r20 = r12
            r36 = r12
            r37 = r12
            r11 = r12
            r21 = r12
            r26 = r12
            r22 = r12
            r38 = r12
            r27 = r12
            r39 = r12
            r40 = r12
        L_0x0041:
            X.16L r7 = r2.A1J()     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            X.16L r1 = X.16L.A09     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            java.lang.String r15 = "value"
            java.lang.String r14 = "unearned_image_url"
            java.lang.String r13 = "title"
            java.lang.String r10 = "name"
            java.lang.String r9 = "image_url"
            java.lang.String r8 = "hub_title"
            java.lang.String r6 = "category"
            r0 = 1091(0x443, float:1.529E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            java.lang.String r5 = "achievement_id"
            java.lang.String r4 = "about_achievement"
            java.lang.String r0 = "Achievement"
            if (r7 == r1) goto L_0x02ab
            java.lang.String r1 = X.AnonymousClass7TE.A17(r2)     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            boolean r0 = r4.equals(r1)     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            if (r0 == 0) goto L_0x0079
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            if (r1 != r0) goto L_0x02a2
            r28 = 0
            goto L_0x02a6
        L_0x0079:
            boolean r0 = r5.equals(r1)     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            if (r0 == 0) goto L_0x0085
            java.lang.Long r19 = X.AnonymousClass7TF.A0Z(r2)     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            goto L_0x02a6
        L_0x0085:
            boolean r0 = r3.equals(r1)     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            if (r0 == 0) goto L_0x009d
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            if (r1 != r0) goto L_0x0097
            r29 = 0
            goto L_0x02a6
        L_0x0097:
            java.lang.String r29 = r2.A1P()     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            goto L_0x02a6
        L_0x009d:
            boolean r0 = r6.equals(r1)     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            if (r0 == 0) goto L_0x00bf
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            if (r1 != r0) goto L_0x00ad
            r0 = 0
            goto L_0x00b1
        L_0x00ad:
            java.lang.String r0 = r2.A1P()     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
        L_0x00b1:
            java.util.Map r1 = com.instagram.api.schemas.AchievementCategory.A01     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            java.lang.Object r12 = r1.get(r0)     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            com.instagram.api.schemas.AchievementCategory r12 = (com.instagram.api.schemas.AchievementCategory) r12     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            if (r12 != 0) goto L_0x02a6
            com.instagram.api.schemas.AchievementCategory r12 = com.instagram.api.schemas.AchievementCategory.UNRECOGNIZED     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            goto L_0x02a6
        L_0x00bf:
            r0 = 1181(0x49d, float:1.655E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            if (r0 == 0) goto L_0x00ef
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            if (r1 != r0) goto L_0x00eb
            java.util.ArrayList r17 = X.AnonymousClass7TE.A1C()     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
        L_0x00d7:
            X.16L r1 = r2.A1J()     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            if (r1 == r0) goto L_0x02a6
            com.instagram.api.schemas.CloseToEarningAchievementMedia r1 = X.C44101CVs.parseFromJson(r2)     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            if (r1 == 0) goto L_0x00d7
            r0 = r17
            r0.add(r1)     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            goto L_0x00d7
        L_0x00eb:
            r17 = 0
            goto L_0x02a6
        L_0x00ef:
            r0 = 1253(0x4e5, float:1.756E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            if (r0 == 0) goto L_0x010d
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            if (r1 != r0) goto L_0x0107
            r30 = 0
            goto L_0x02a6
        L_0x0107:
            java.lang.String r30 = r2.A1P()     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            goto L_0x02a6
        L_0x010d:
            java.lang.String r0 = "earned_description"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            if (r0 == 0) goto L_0x0127
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            if (r1 != r0) goto L_0x0121
            r31 = 0
            goto L_0x02a6
        L_0x0121:
            java.lang.String r31 = r2.A1P()     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            goto L_0x02a6
        L_0x0127:
            r0 = 3038(0xbde, float:4.257E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            if (r0 == 0) goto L_0x0145
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            if (r1 != r0) goto L_0x013f
            r32 = 0
            goto L_0x02a6
        L_0x013f:
            java.lang.String r32 = r2.A1P()     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            goto L_0x02a6
        L_0x0145:
            java.lang.String r0 = "earned_on_media_error_title"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            if (r0 == 0) goto L_0x015f
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            if (r1 != r0) goto L_0x0159
            r33 = 0
            goto L_0x02a6
        L_0x0159:
            java.lang.String r33 = r2.A1P()     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            goto L_0x02a6
        L_0x015f:
            r0 = 3039(0xbdf, float:4.259E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            if (r0 == 0) goto L_0x017d
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            if (r1 != r0) goto L_0x0177
            r34 = 0
            goto L_0x02a6
        L_0x0177:
            java.lang.String r34 = r2.A1P()     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            goto L_0x02a6
        L_0x017d:
            java.lang.String r0 = "earned_on_media_state"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            if (r0 == 0) goto L_0x01a5
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            if (r1 != r0) goto L_0x018f
            r0 = 0
            goto L_0x0193
        L_0x018f:
            java.lang.String r0 = r2.A1P()     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
        L_0x0193:
            java.util.Map r1 = com.instagram.api.schemas.EarnedOnMediaState.A01     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            java.lang.Object r16 = r1.get(r0)     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            r0 = r16
            com.instagram.api.schemas.EarnedOnMediaState r0 = (com.instagram.api.schemas.EarnedOnMediaState) r0     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            r16 = r0
            if (r0 != 0) goto L_0x02a6
            com.instagram.api.schemas.EarnedOnMediaState r16 = com.instagram.api.schemas.EarnedOnMediaState.UNRECOGNIZED     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            goto L_0x02a6
        L_0x01a5:
            java.lang.String r0 = "earned_on_story_reel_id"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            if (r0 == 0) goto L_0x01bf
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            if (r1 != r0) goto L_0x01b9
            r35 = 0
            goto L_0x02a6
        L_0x01b9:
            java.lang.String r35 = r2.A1P()     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            goto L_0x02a6
        L_0x01bf:
            java.lang.String r0 = "hub_primary_button"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            if (r0 == 0) goto L_0x01cd
            com.instagram.api.schemas.AchievementButtonInfoImpl r20 = X.CUL.parseFromJson(r2)     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            goto L_0x02a6
        L_0x01cd:
            boolean r0 = r8.equals(r1)     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            if (r0 == 0) goto L_0x01e5
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            if (r1 != r0) goto L_0x01df
            r36 = 0
            goto L_0x02a6
        L_0x01df:
            java.lang.String r36 = r2.A1P()     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            goto L_0x02a6
        L_0x01e5:
            boolean r0 = r9.equals(r1)     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            if (r0 == 0) goto L_0x01fd
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            if (r1 != r0) goto L_0x01f7
            r37 = 0
            goto L_0x02a6
        L_0x01f7:
            java.lang.String r37 = r2.A1P()     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            goto L_0x02a6
        L_0x01fd:
            boolean r0 = r10.equals(r1)     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            if (r0 == 0) goto L_0x021f
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            if (r1 != r0) goto L_0x020d
            r0 = 0
            goto L_0x0211
        L_0x020d:
            java.lang.String r0 = r2.A1P()     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
        L_0x0211:
            java.util.Map r1 = com.instagram.api.schemas.AchievementName.A01     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            java.lang.Object r11 = r1.get(r0)     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            com.instagram.api.schemas.AchievementName r11 = (com.instagram.api.schemas.AchievementName) r11     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            if (r11 != 0) goto L_0x02a6
            com.instagram.api.schemas.AchievementName r11 = com.instagram.api.schemas.AchievementName.A4V     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            goto L_0x02a6
        L_0x021f:
            java.lang.String r0 = "primary_button"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            if (r0 == 0) goto L_0x022c
            com.instagram.api.schemas.AchievementButtonInfoImpl r21 = X.CUL.parseFromJson(r2)     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            goto L_0x02a6
        L_0x022c:
            java.lang.String r0 = "progress"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            if (r0 == 0) goto L_0x0239
            java.lang.Integer r26 = X.AnonymousClass7TF.A0X(r2)     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            goto L_0x02a6
        L_0x0239:
            java.lang.String r0 = "secondary_button"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            if (r0 == 0) goto L_0x0246
            com.instagram.api.schemas.AchievementButtonInfoImpl r22 = X.CUL.parseFromJson(r2)     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            goto L_0x02a6
        L_0x0246:
            java.lang.String r0 = "secondary_text"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            if (r0 == 0) goto L_0x025e
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            if (r1 != r0) goto L_0x0259
            r38 = 0
            goto L_0x02a6
        L_0x0259:
            java.lang.String r38 = r2.A1P()     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            goto L_0x02a6
        L_0x025e:
            r0 = 1894(0x766, float:2.654E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            if (r0 == 0) goto L_0x026f
            java.lang.Integer r27 = X.AnonymousClass7TF.A0X(r2)     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            goto L_0x02a6
        L_0x026f:
            boolean r0 = r13.equals(r1)     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            if (r0 == 0) goto L_0x0285
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            if (r1 != r0) goto L_0x0280
            r39 = 0
            goto L_0x02a6
        L_0x0280:
            java.lang.String r39 = r2.A1P()     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            goto L_0x02a6
        L_0x0285:
            boolean r0 = r14.equals(r1)     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            if (r0 == 0) goto L_0x029b
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            if (r1 != r0) goto L_0x0296
            r40 = 0
            goto L_0x02a6
        L_0x0296:
            java.lang.String r40 = r2.A1P()     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            goto L_0x02a6
        L_0x029b:
            r0 = r18
            java.lang.Integer r18 = X.C41847B3o.A13(r2, r0, r1, r15)     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            goto L_0x02a6
        L_0x02a2:
            java.lang.String r28 = r2.A1P()     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
        L_0x02a6:
            r2.A0z()     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            goto L_0x0041
        L_0x02ab:
            if (r28 != 0) goto L_0x02b5
            boolean r1 = r2 instanceof X.0c9     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            if (r1 == 0) goto L_0x02b5
            X.AnonymousClass7TF.A1L(r4, r2, r0)     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            goto L_0x030f
        L_0x02b5:
            if (r19 != 0) goto L_0x02b8
            goto L_0x0308
        L_0x02b8:
            if (r29 != 0) goto L_0x02c2
            boolean r1 = r2 instanceof X.0c9     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            if (r1 == 0) goto L_0x02c2
            X.AnonymousClass7TF.A1L(r3, r2, r0)     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            goto L_0x030f
        L_0x02c2:
            if (r12 != 0) goto L_0x02cc
            boolean r1 = r2 instanceof X.0c9     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            if (r1 == 0) goto L_0x02cc
            X.AnonymousClass7TF.A1L(r6, r2, r0)     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            goto L_0x030f
        L_0x02cc:
            if (r36 != 0) goto L_0x02d6
            boolean r1 = r2 instanceof X.0c9     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            if (r1 == 0) goto L_0x02d6
            X.AnonymousClass7TF.A1L(r8, r2, r0)     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            goto L_0x030f
        L_0x02d6:
            if (r37 != 0) goto L_0x02e0
            boolean r1 = r2 instanceof X.0c9     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            if (r1 == 0) goto L_0x02e0
            X.AnonymousClass7TF.A1L(r9, r2, r0)     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            goto L_0x030f
        L_0x02e0:
            if (r11 != 0) goto L_0x02ea
            boolean r1 = r2 instanceof X.0c9     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            if (r1 == 0) goto L_0x02ea
            X.AnonymousClass7TF.A1L(r10, r2, r0)     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            goto L_0x030f
        L_0x02ea:
            if (r39 != 0) goto L_0x02f4
            boolean r1 = r2 instanceof X.0c9     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            if (r1 == 0) goto L_0x02f4
            X.AnonymousClass7TF.A1L(r13, r2, r0)     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            goto L_0x030f
        L_0x02f4:
            if (r40 != 0) goto L_0x02fe
            boolean r1 = r2 instanceof X.0c9     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            if (r1 == 0) goto L_0x02fe
            X.AnonymousClass7TF.A1L(r14, r2, r0)     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            goto L_0x030f
        L_0x02fe:
            if (r18 != 0) goto L_0x0314
            boolean r1 = r2 instanceof X.0c9     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            if (r1 == 0) goto L_0x0314
            X.AnonymousClass7TF.A1L(r15, r2, r0)     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            goto L_0x030f
        L_0x0308:
            boolean r1 = r2 instanceof X.0c9     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            if (r1 == 0) goto L_0x02b8
            X.AnonymousClass7TF.A1L(r5, r2, r0)     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
        L_0x030f:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            throw r0     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
        L_0x0314:
            long r43 = r19.longValue()     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            int r42 = r18.intValue()     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            com.instagram.api.schemas.Achievement r19 = new com.instagram.api.schemas.Achievement     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            r23 = r12
            r24 = r11
            r25 = r16
            r41 = r17
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)     // Catch:{ IOException -> 0x0330, Exception -> 0x032a }
            return r19
        L_0x032a:
            r0 = move-exception
            X.1Pf r0 = X.AnonymousClass7TE.A0j(r0)
            throw r0
        L_0x0330:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CUN.parseFromJson(X.16F):com.instagram.api.schemas.Achievement");
    }
}
