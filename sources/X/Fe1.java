package X;

public final class Fe1 implements C51881G5t {
    public final int A00;
    public final Object A01;

    public Fe1(FHD fhd, int i) {
        this.A00 = i;
        if (i != 0) {
            this.A01 = fhd;
        } else {
            this.A01 = fhd;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: androidx.fragment.app.FragmentActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: android.app.Activity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v80, resolved type: com.instagram.mainactivity.InstagramMainActivity} */
    /* JADX WARNING: type inference failed for: r2v52, types: [X.Eba, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0436, code lost:
        r0 = X.DbS.A0b(r1, r3, r14, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x043a, code lost:
        r0.A0C(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0116, code lost:
        r6.A02(r3, r2);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean AQ2(android.os.Bundle r32, com.instagram.base.activity.BaseFragmentActivity r33, com.instagram.common.session.UserSession r34) {
        /*
            r31 = this;
            r5 = r31
            int r2 = r5.A00
            r0 = r32
            r1 = r33
            r14 = r34
            switch(r2) {
                case 0: goto L_0x019b;
                case 1: goto L_0x052a;
                case 2: goto L_0x051f;
                case 3: goto L_0x0514;
                case 4: goto L_0x04ea;
                case 5: goto L_0x04cc;
                case 6: goto L_0x0535;
                case 7: goto L_0x011b;
                case 8: goto L_0x04c1;
                case 9: goto L_0x053b;
                case 10: goto L_0x0096;
                case 11: goto L_0x04a2;
                case 12: goto L_0x005d;
                case 13: goto L_0x0493;
                case 14: goto L_0x046f;
                case 15: goto L_0x0460;
                case 16: goto L_0x043f;
                case 17: goto L_0x0422;
                case 18: goto L_0x040c;
                case 19: goto L_0x03de;
                case 20: goto L_0x03be;
                case 21: goto L_0x03ad;
                case 22: goto L_0x0399;
                case 23: goto L_0x0361;
                case 24: goto L_0x001d;
                case 25: goto L_0x030f;
                case 26: goto L_0x02ed;
                case 27: goto L_0x02d4;
                case 28: goto L_0x02bb;
                default: goto L_0x000d;
            }
        L_0x000d:
            java.util.HashMap r3 = X.AnonymousClass7TE.A1E()
            java.lang.String r2 = "origin"
            java.lang.String r0 = "deep_link"
            r3.put(r2, r0)
            X.FHB.A0E(r1, r14, r3)
        L_0x001b:
            r0 = 1
            return r0
        L_0x001d:
            java.lang.String r3 = "id"
            java.lang.String r2 = ""
            java.lang.String r7 = r0.getString(r3, r2)
            X.1aw r2 = X.1aw.A00
            if (r2 == 0) goto L_0x0543
            r2.A00(r14, r7)
            X.61K r3 = X.AnonymousClass61K.APP_START
            X.MYc r2 = X.C66594MYg.A03
            X.MYg r2 = r2.A02(r14, r3)
            X.MYb r4 = r2.A01
            r2 = 0
            X.1a8 r6 = new X.1a8
            r6.<init>(r2)
            long r2 = java.lang.Long.parseLong(r7)
            X.1aU r8 = r4.A09
            r7 = 1
            X.Our r4 = new X.Our
            r4.<init>(r2, r7)
            X.1aU r2 = r8.A0M(r4)
            X.1aU r3 = r2.A0H()
            r8 = 3
            X.FpA r2 = new X.FpA
            r7 = r2
            r9 = r0
            r10 = r1
            r11 = r14
            r12 = r5
            r7.<init>(r8, r9, r10, r11, r12)
            goto L_0x0116
        L_0x005d:
            java.lang.String r2 = "bloks_app_id"
            java.lang.String r7 = r0.getString(r2)
            java.lang.String r2 = "params"
            java.lang.String r0 = r0.getString(r2)
            if (r0 == 0) goto L_0x0070
            java.util.HashMap r2 = X.F5I.A01(r14, r0)     // Catch:{ IOException -> 0x054e }
            goto L_0x0071
        L_0x0070:
            r2 = 0
        L_0x0071:
            X.FUl r0 = new X.FUl
            r0.<init>(r5)
            X.2nI r6 = X.DbT.A0N(r1, r0, r14)
            X.6ST r4 = new X.6ST
            r4.<init>(r1)
            X.DbX.A15(r1, r4)
            X.AnonymousClass0fN.A00(r4)
            X.0gy r3 = X.AnonymousClass07i.A00(r1)
            X.8ey r2 = X.C359988do.A04(r14, r7, r2)
            r0 = 9
            X.E85.A00(r2, r5, r4, r6, r0)
            X.1ES.A00(r1, r3, r2)
            goto L_0x001b
        L_0x0096:
            java.lang.String r8 = "is_e2ee_mandated"
            boolean r6 = r0.getBoolean(r8)
            com.instagram.common.session.UserSession r3 = X.DbS.A0U(r0)
            java.lang.String r2 = "surface_id"
            java.lang.String r2 = r0.getString(r2)
            android.os.Bundle r7 = X.AnonymousClass7TE.A0a()
            java.lang.String r4 = "id"
            r7.putString(r4, r2)
            java.lang.String r3 = r3.A06
            java.lang.String r2 = "current_user_id"
            r7.putString(r2, r3)
            boolean r2 = r0.getBoolean(r8)
            r7.putBoolean(r8, r2)
            java.lang.String r3 = "action_call_back"
            boolean r2 = r0.getBoolean(r3)
            r7.putBoolean(r3, r2)
            java.lang.String r2 = "missed_call"
            boolean r0 = r0.getBoolean(r2)
            if (r0 == 0) goto L_0x00df
            if (r6 != 0) goto L_0x00e1
            java.lang.Object r0 = r5.A01
            X.FHD r0 = (X.FHD) r0
            X.Exn r0 = r0.A00
            X.G5t r0 = r0.A00
            if (r0 == 0) goto L_0x0561
            boolean r0 = r0.AQ2(r7, r1, r14)
            return r0
        L_0x00df:
            if (r6 == 0) goto L_0x0561
        L_0x00e1:
            java.lang.String r0 = ""
            java.lang.String r0 = r7.getString(r4, r0)
            r8 = 1
            long r2 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0555 }
            X.61K r4 = X.AnonymousClass61K.APP_START
            X.MYc r0 = X.C66594MYg.A03
            X.MYg r0 = r0.A02(r14, r4)
            X.MYb r4 = r0.A01
            r0 = 0
            X.1a8 r6 = new X.1a8
            r6.<init>(r0)
            X.1aU r4 = r4.A09
            X.Our r0 = new X.Our
            r0.<init>(r2, r8)
            X.1aU r0 = r4.A0M(r0)
            X.1aU r3 = r0.A0H()
            r9 = 2
            X.FpA r2 = new X.FpA
            r8 = r2
            r10 = r7
            r11 = r1
            r12 = r14
            r13 = r5
            r8.<init>(r9, r10, r11, r12, r13)
        L_0x0116:
            r6.A02(r3, r2)
            goto L_0x001b
        L_0x011b:
            java.lang.String r2 = X.AnonymousClass7TF.A0b()
            java.lang.String r3 = "reason"
            java.lang.String r6 = r0.getString(r3)
            r12 = 0
            if (r6 == 0) goto L_0x0142
            X.8ZN r12 = X.AnonymousClass8ZN.valueOf(r6)     // Catch:{ IllegalArgumentException -> 0x012d }
            goto L_0x0138
        L_0x012d:
            java.lang.String r3 = "Failed to parse reason: "
            java.lang.String r4 = X.002.A0R(r3, r6)
            java.lang.String r3 = "AppStartupUtil"
            X.0wb.A03(r3, r4)
        L_0x0138:
            java.lang.String r3 = "music_drop"
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L_0x0142
            X.8ZN r12 = X.AnonymousClass8ZN.MUSIC_DROP_NOTIF
        L_0x0142:
            java.lang.String r3 = "id"
            java.lang.String r4 = r0.getString(r3)
            if (r4 == 0) goto L_0x0183
            r29 = -1
            long r27 = java.lang.Long.parseLong(r4)     // Catch:{ NumberFormatException -> 0x017d }
            int r4 = (r27 > r29 ? 1 : (r27 == r29 ? 0 : -1))
            if (r4 == 0) goto L_0x0183
            X.Fbv r13 = new X.Fbv
            r13.<init>(r5)
            java.lang.String r21 = X.AnonymousClass7TF.A0b()
            X.HOu r11 = X.C54689HOu.A0M
            r15 = 0
            com.instagram.search.common.analytics.SearchContext r16 = new com.instagram.search.common.analytics.SearchContext
            r16.<init>()
            java.lang.Boolean r17 = X.AnonymousClass7TE.A0u()
            r18 = r17
            r19 = r17
            r20 = r15
            r22 = r15
            r23 = r15
            r24 = r2
            r25 = r15
            r26 = r15
            X.C52086GEg.A0K(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r29)
            goto L_0x0183
        L_0x017d:
            r5 = move-exception
            java.lang.String r4 = "app_startup"
            X.0wb.A07(r4, r5)
        L_0x0183:
            java.lang.Class<com.instagram.modal.ModalActivity> r4 = com.instagram.modal.ModalActivity.class
            java.lang.String r0 = r0.getString(r3)
            com.instagram.clips.model.metadata.AudioPageMetadata r3 = X.LT9.A06(r0)
            X.HOu r0 = X.C54689HOu.A0a
            android.os.Bundle r2 = X.C250563lf.A02(r0, r12, r3, r2)
            java.lang.String r0 = "audio_page"
            X.6W8 r0 = X.DbS.A0b(r1, r2, r14, r4, r0)
            goto L_0x043a
        L_0x019b:
            java.lang.Object r3 = r5.A01
            X.FHD r3 = (X.FHD) r3
            boolean r2 = r1 instanceof com.instagram.mainactivity.InstagramMainActivity
            if (r2 == 0) goto L_0x022e
            r2 = r1
            com.instagram.mainactivity.InstagramMainActivity r2 = (com.instagram.mainactivity.InstagramMainActivity) r2
            X.0iw r5 = r2.A0n()
        L_0x01aa:
            com.instagram.direct.inbox.notes.NotesRepository r2 = X.AnonymousClass43C.A00(r14)
            java.lang.String r9 = "note_id"
            java.lang.String r8 = r0.getString(r9)
            java.lang.String r7 = "prompt_id"
            r15 = 0
            java.lang.String r6 = r0.getString(r7, r15)
            if (r8 == 0) goto L_0x0225
            if (r6 != 0) goto L_0x0220
            X.4zZ r3 = r2.A06(r8)
        L_0x01c3:
            if (r3 == 0) goto L_0x0226
            java.lang.String r2 = r14.A06
            java.lang.String r0 = r3.A0K
            boolean r0 = r2.equals(r0)
        L_0x01cd:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r13 = r0.booleanValue()
            if (r13 != 0) goto L_0x01db
            if (r8 != 0) goto L_0x01db
            if (r6 == 0) goto L_0x001b
        L_0x01db:
            r2 = 2
            X.0qQ.A0B(r5, r2)
            r0 = 9
            X.9M3 r12 = new X.9M3
            r12.<init>(r0, r14, r5)
            java.lang.Class<X.49u> r0 = X.C2614949u.class
            X.0Yh r11 = X.DbS.A0z(r0)
            X.9LO r10 = new X.9LO
            r10.<init>(r1, r2)
            r0 = 0
            r4 = 8
            X.9M3 r2 = new X.9M3
            r2.<init>(r4, r1, r15)
            X.2kA r2 = X.DbS.A0I(r10, r12, r2, r11)
            r4 = 0
            X.P3k r10 = new X.P3k
            r10.<init>(r2, r4)
            if (r13 == 0) goto L_0x024b
            if (r3 == 0) goto L_0x0235
            X.P3h r2 = new X.P3h
            r11 = r2
            r12 = r1
            r13 = r5
            r16 = r10
            r11.<init>(r12, r13, r14, r15, r16)
            r7 = r15
            r8 = r3
            r9 = r6
            r10 = r15
            r11 = r4
            r12 = r4
            X.OIR r0 = X.C71047OaP.A03(r7, r8, r9, r10, r11, r12)
            r2.DUZ(r0)
            goto L_0x001b
        L_0x0220:
            X.4zZ r3 = r2.A07(r6, r8)
            goto L_0x01c3
        L_0x0225:
            r3 = r15
        L_0x0226:
            r4 = 0
            java.lang.String r2 = "is_self_note"
            boolean r0 = r0.getBoolean(r2, r4)
            goto L_0x01cd
        L_0x022e:
            X.FUm r5 = new X.FUm
            r5.<init>(r3)
            goto L_0x01aa
        L_0x0235:
            X.NKL r5 = new X.NKL
            r5.<init>()
            r5.A0J = r10
            android.os.Bundle r4 = X.AnonymousClass7TE.A0a()
            if (r8 == 0) goto L_0x0245
            r4.putString(r9, r8)
        L_0x0245:
            if (r6 == 0) goto L_0x0263
            r4.putString(r7, r6)
            goto L_0x0263
        L_0x024b:
            if (r3 != 0) goto L_0x026c
            if (r6 != 0) goto L_0x0276
            X.NJf r5 = new X.NJf
            r5.<init>()
            android.os.Bundle r4 = X.AnonymousClass7TE.A0a()
            if (r8 == 0) goto L_0x0263
            long r2 = java.lang.Long.parseLong(r8)
            java.lang.String r0 = "arg_note_id"
            r4.putLong(r0, r2)
        L_0x0263:
            X.7Pr r0 = X.DbV.A0V(r4, r5, r14)
            X.DbU.A0y(r1, r5, r0)
            goto L_0x001b
        L_0x026c:
            if (r6 == 0) goto L_0x027b
            boolean r0 = X.AnonymousClass4AJ.A0A(r14)
            if (r0 == 0) goto L_0x027b
            java.lang.String r0 = r3.A0H
        L_0x0276:
            X.C69983NvN.A00(r1, r14, r6, r0)
            goto L_0x001b
        L_0x027b:
            X.P3f r2 = new X.P3f
            r11 = r2
            r12 = r1
            r13 = r5
            r16 = r10
            r11.<init>(r12, r13, r14, r15, r16)
            X.Oe5 r0 = X.C71147Oe5.A00
            X.N5y r19 = r0.A08(r1, r3)
            boolean r21 = X.AnonymousClass7TF.A1V(r6)
            X.5y2 r0 = r3.A0A
            if (r0 == 0) goto L_0x02b9
            X.60C r0 = r0.A09
            if (r0 == 0) goto L_0x02b9
            com.instagram.api.schemas.NotePogVideoDict r1 = r0.A01
        L_0x0299:
            com.instagram.user.model.User r0 = r3.A0D
            java.lang.Integer r0 = r0.Bjj()
            if (r0 == 0) goto L_0x02a4
            r0.intValue()
        L_0x02a4:
            r18 = r15
            r20 = r4
            r22 = r4
            r23 = r4
            r17 = r3
            r16 = r1
            X.OIR r0 = X.C71047OaP.A01(r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r2.DUZ(r0)
            goto L_0x001b
        L_0x02b9:
            r1 = 0
            goto L_0x0299
        L_0x02bb:
            java.lang.String r2 = "entry_point"
            java.lang.String r3 = "push_notification"
            r0.putString(r2, r3)
            java.lang.String r2 = "edit_profile_entry"
            r0.putString(r2, r3)
            java.lang.Class<com.instagram.modal.ModalActivity> r3 = com.instagram.modal.ModalActivity.class
            r2 = 242(0xf2, float:3.39E-43)
            java.lang.String r2 = X.C273654mx.A00(r2)
            X.AnonymousClass6W8.A06(r1, r0, r3, r2)
            goto L_0x001b
        L_0x02d4:
            java.lang.String r2 = "id"
            java.lang.String r4 = r0.getString(r2)
            java.lang.String r2 = X.Dbf.A00()
            java.lang.String r3 = r0.getString(r2)
            java.lang.String r2 = "transaction_source"
            java.lang.String r0 = r0.getString(r2)
            X.C324476zN.A0J(r1, r14, r4, r3, r0)
            goto L_0x001b
        L_0x02ed:
            java.lang.String r2 = "business_id"
            java.lang.String r5 = r0.getString(r2)
            java.lang.String r2 = "business_name"
            java.lang.String r6 = r0.getString(r2)
            java.lang.String r2 = "banhammer_state"
            java.lang.String r7 = r0.getString(r2)
            java.lang.String r2 = "banhammer_action_date"
            java.lang.String r8 = r0.getString(r2)
            java.lang.String r3 = "app_startup"
            java.lang.String r4 = "push_notification"
            r2 = r14
            X.C324476zN.A0M(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x001b
        L_0x030f:
            X.FHD.A0G(r14, r1)
            java.lang.String r4 = X.DbS.A0l(r0)
            java.lang.String r2 = "content_type"
            java.lang.String r2 = r0.getString(r2)
            if (r2 == 0) goto L_0x0350
            java.lang.String r0 = "APPROVED"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x032e
            java.lang.String r0 = "APPROVED_NO_PRODUCTS"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0350
        L_0x032e:
            X.W3U r0 = X.W3U.A00
            X.0xa r0 = X.W3U.A02(r14, r0)
            X.0xY r2 = r0.AR4()
            r0 = 3214(0xc8e, float:4.504E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.DbW.A1L(r2, r0)
            java.lang.String r3 = "app_startup"
            X.0xN r2 = X.C60510iO.A00(r14)
            java.lang.String r0 = "instagram_shopping_post_onboarding_nux_approval_push_notification_tap"
            X.0xI r0 = X.0xI.A01(r0, r3)
            r2.EFq(r0)
        L_0x0350:
            if (r4 != 0) goto L_0x0354
            java.lang.String r4 = "push_notification"
        L_0x0354:
            X.0eE r0 = X.AnonymousClass0t1.A01
            r0.A01(r14)
            r2 = 1
            java.lang.String r0 = "app_startup"
            X.C324476zN.A0P(r1, r14, r0, r4, r2)
            goto L_0x001b
        L_0x0361:
            java.lang.String r4 = "UTF-8"
            java.lang.String r2 = "nonce"
            java.lang.String r2 = r0.getString(r2)     // Catch:{ UnsupportedEncodingException -> 0x038f }
            java.lang.String r3 = java.net.URLEncoder.encode(r2, r4)     // Catch:{ UnsupportedEncodingException -> 0x038f }
            java.lang.String r2 = "encoded_email"
            java.lang.String r0 = r0.getString(r2)     // Catch:{ UnsupportedEncodingException -> 0x038f }
            java.lang.String r0 = java.net.URLEncoder.encode(r0, r4)     // Catch:{ UnsupportedEncodingException -> 0x038f }
            X.Eba r2 = new X.Eba     // Catch:{ UnsupportedEncodingException -> 0x038f }
            r2.<init>()     // Catch:{ UnsupportedEncodingException -> 0x038f }
            r2.A01 = r1     // Catch:{ UnsupportedEncodingException -> 0x038f }
            r2.A04 = r3     // Catch:{ UnsupportedEncodingException -> 0x038f }
            r2.A03 = r0     // Catch:{ UnsupportedEncodingException -> 0x038f }
            android.os.Handler r0 = X.AnonymousClass7TF.A0D()     // Catch:{ UnsupportedEncodingException -> 0x038f }
            r2.A00 = r0     // Catch:{ UnsupportedEncodingException -> 0x038f }
            r2.A02 = r14     // Catch:{ UnsupportedEncodingException -> 0x038f }
            r2.A00()     // Catch:{ UnsupportedEncodingException -> 0x038f }
            goto L_0x001b
        L_0x038f:
            r2 = 2131961935(0x7f13284f, float:1.956058E38)
            java.lang.String r0 = "fail_confirm_email"
            X.C59689JTv.A0F(r1, r0, r2)
            goto L_0x001b
        L_0x0399:
            android.os.Bundle r3 = X.AnonymousClass7TE.A0a()
            java.lang.String r2 = "edit_profile_entry"
            java.lang.String r0 = "push_notification"
            r3.putString(r2, r0)
            java.lang.Class<com.instagram.modal.ModalActivity> r2 = com.instagram.modal.ModalActivity.class
            java.lang.String r0 = "edit_profile"
            X.AnonymousClass6W8.A06(r1, r3, r2, r0)
            goto L_0x001b
        L_0x03ad:
            java.lang.Class<com.instagram.modal.ModalActivity> r4 = com.instagram.modal.ModalActivity.class
            X.EWD r3 = X.EWD.SHARE_PROFILE_PUSH
            r2 = 0
            r0 = 0
            android.os.Bundle r2 = X.C343547qO.A00(r2, r3, r0)
            java.lang.String r0 = "nametag"
            X.AnonymousClass6W8.A06(r1, r2, r4, r0)
            goto L_0x001b
        L_0x03be:
            java.lang.String r2 = "media_list"
            java.lang.String r3 = r0.getString(r2)
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.CLIPS_NEARBY_PUSH
            X.4h3 r2 = new X.4h3
            r2.<init>(r0, r14)
            if (r3 == 0) goto L_0x03d9
            java.lang.String r0 = ","
            java.lang.String[] r0 = r3.split(r0)
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf((java.lang.Object[]) r0)
            r2.A0B = r0
        L_0x03d9:
            X.DbU.A1M(r1, r2, r14)
            goto L_0x001b
        L_0x03de:
            java.lang.String r3 = "draft_id"
            java.lang.String r2 = r0.getString(r3)
            if (r2 == 0) goto L_0x001b
            java.lang.String r3 = r0.getString(r3)
            java.lang.String r2 = "is_share_sheet_page"
            boolean r9 = r0.getBoolean(r2)
            X.AnonymousClass7TG.A1T(r1, r3, r14)
            X.12T r2 = X.AnonymousClass12T.A00
            r7 = 0
            r0 = 875171464(0x342a0e88, float:1.583777E-7)
            X.19S r2 = X.DbY.A0r(r2, r0)
            X.AwC r0 = new X.AwC
            r5 = r14
            r6 = r3
            r8 = r2
            r3 = r0
            r4 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9)
            X.AnonymousClass7TE.A1Z(r0, r2)
            goto L_0x001b
        L_0x040c:
            android.os.Bundle r3 = X.AnonymousClass7TE.A0a()
            java.lang.String r2 = "target_user_id"
            java.lang.String r0 = r0.getString(r2)
            r3.putString(r2, r0)
            java.lang.Class<com.instagram.modal.ModalActivity> r2 = com.instagram.modal.ModalActivity.class
            r0 = 911(0x38f, float:1.277E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            goto L_0x0436
        L_0x0422:
            X.FHD.A0G(r14, r1)
            android.os.Bundle r3 = X.AnonymousClass7TE.A0a()
            java.lang.String r2 = "recommender_user_id"
            java.lang.String r0 = r0.getString(r2)
            r3.putString(r2, r0)
            java.lang.Class<com.instagram.modal.ModalActivity> r2 = com.instagram.modal.ModalActivity.class
            java.lang.String r0 = "recommend_accounts_receiver"
        L_0x0436:
            X.6W8 r0 = X.DbS.A0b(r1, r3, r14, r2, r0)
        L_0x043a:
            r0.A0C(r1)
            goto L_0x001b
        L_0x043f:
            X.C48729EjE.A00()
            r5 = 0
            android.content.Intent r4 = X.DbU.A04(r1)
            X.DbU.A1D(r0, r14)
            java.lang.String r3 = "entry_point"
            java.lang.String r2 = "push_notification"
            r0.putString(r3, r2)
            java.lang.String r2 = "intro_entry_position"
            r0.putInt(r2, r5)
            X.DbV.A1C(r4, r5, r0)
            r0 = 11
            X.0kR.A07(r1, r4, r0)
            goto L_0x001b
        L_0x0460:
            java.lang.String r2 = "browser_url"
            java.lang.String r3 = X.DbU.A0l(r0, r2)
            X.2EG r2 = X.2EG.A1S
            java.lang.String r0 = "app_startup"
            X.FHB.A04(r1, r14, r2, r3, r0)
            goto L_0x001b
        L_0x046f:
            java.lang.String r2 = "product_id"
            java.lang.String r3 = r0.getString(r2)
            java.lang.String r2 = "merchant_id"
            java.lang.String r4 = r0.getString(r2)
            java.lang.String r2 = "prefilled_rating"
            java.lang.String r5 = r0.getString(r2)
            java.lang.String r2 = "survey_entry_point"
            java.lang.String r6 = r0.getString(r2)
            java.lang.String r2 = "referral_surface"
            java.lang.String r7 = r0.getString(r2)
            r2 = r14
            X.C324476zN.A0L(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x001b
        L_0x0493:
            java.lang.String r2 = "timestamp"
            java.lang.String r0 = r0.getString(r2)
            if (r0 != 0) goto L_0x049d
            java.lang.String r0 = ""
        L_0x049d:
            X.C49250Ert.A00(r1, r14, r0)
            goto L_0x001b
        L_0x04a2:
            java.lang.String r2 = "ar_effect_id"
            r3 = 0
            java.lang.String r4 = r0.getString(r2, r3)
            java.lang.String r2 = "ar_effect_test_link_crypto_hash"
            java.lang.String r5 = r0.getString(r2, r3)
            java.lang.String r2 = "ar_effect_test_link_revision_id"
            java.lang.String r6 = r0.getString(r2, r3)
            java.lang.String r0 = "AppStartupUtil"
            X.0xG r2 = X.DbS.A0O(r0)
            r3 = r14
            X.C49895FBy.A00(r1, r2, r3, r4, r5, r6)
            goto L_0x001b
        L_0x04c1:
            java.lang.String r2 = "id"
            java.lang.String r0 = r0.getString(r2)
            X.C324476zN.A0F(r1, r14, r0)
            goto L_0x001b
        L_0x04cc:
            java.lang.String r2 = "referrer_surface"
            java.lang.String r3 = r0.getString(r2)
            java.lang.String r2 = "additional_logging_data"
            java.lang.String r4 = r0.getString(r2)
            java.lang.String r2 = "deeplink_destination"
            java.lang.String r5 = r0.getString(r2)
            java.lang.String r2 = "deeplink_destination_params"
            java.lang.String r6 = r0.getString(r2)
            r2 = r14
            X.C324476zN.A0K(r1, r2, r3, r4, r5, r6)
            goto L_0x001b
        L_0x04ea:
            java.lang.String r2 = "order_id"
            java.lang.String r3 = r0.getString(r2)
            java.lang.String r2 = "referrer_surface"
            java.lang.String r4 = r0.getString(r2)
            java.lang.String r2 = "order_item_ids"
            java.lang.String r5 = r0.getString(r2)
            java.lang.String r2 = "additional_logging_data"
            java.lang.String r6 = r0.getString(r2)
            java.lang.String r2 = "deeplink_destination"
            java.lang.String r7 = r0.getString(r2)
            java.lang.String r2 = "deeplink_destination_params"
            java.lang.String r8 = r0.getString(r2)
            r2 = r14
            X.C324476zN.A0N(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x001b
        L_0x0514:
            java.lang.String r2 = "id"
            java.lang.String r0 = r0.getString(r2)
            X.C324476zN.A0D(r1, r14, r0)
            goto L_0x001b
        L_0x051f:
            java.lang.String r2 = "id"
            java.lang.String r0 = r0.getString(r2)
            X.C324476zN.A0G(r1, r14, r0)
            goto L_0x001b
        L_0x052a:
            java.lang.String r2 = "id"
            java.lang.String r0 = r0.getString(r2)
            X.C324476zN.A0E(r1, r14, r0)
            goto L_0x001b
        L_0x0535:
            r2 = 0
            boolean r0 = X.FHD.A0J(r1, r0, r14, r2)
            return r0
        L_0x053b:
            X.DbS.A15()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0543:
            r0 = 982(0x3d6, float:1.376E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x054e:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0555:
            r3 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[]{r0}
            java.lang.String r1 = "AppStartupUtil"
            java.lang.String r0 = "IgNotificationAction.VIDEO_CALL failed to parse ThreadId to Long : %s"
            X.0KC.A0L(r1, r0, r3, r2)
        L_0x0561:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Fe1.AQ2(android.os.Bundle, com.instagram.base.activity.BaseFragmentActivity, com.instagram.common.session.UserSession):boolean");
    }
}
