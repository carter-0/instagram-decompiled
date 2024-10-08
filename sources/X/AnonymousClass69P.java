package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.NoteBackgroundColor;
import com.instagram.api.schemas.NoteCustomThemeImpl;
import com.instagram.api.schemas.NoteEmojiReactionInfo;
import com.instagram.api.schemas.NoteEmojiReactionInfoIntf;
import com.instagram.api.schemas.NoteFontStyle;
import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.models.NoteAudience;
import com.instagram.direct.inbox.notes.models.NoteStyle;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.69P  reason: invalid class name */
public abstract class AnonymousClass69P {
    public static final NoteEmojiReactionInfo A00(NoteEmojiReactionInfoIntf noteEmojiReactionInfoIntf) {
        0qQ.A0B(noteEmojiReactionInfoIntf, 0);
        String emoji = noteEmojiReactionInfoIntf.getEmoji();
        return new NoteEmojiReactionInfo(noteEmojiReactionInfoIntf.CCd(), noteEmojiReactionInfoIntf.Cdw(), emoji);
    }

    public static final C300865y4 A01(UserSession userSession, C3035969z r13) {
        User user;
        C276104sZ r5 = ((AnonymousClass6A0) r13.reinterpret(AnonymousClass6A0.class)).F6s(new 1E9(1E4.A00(userSession), new HashSet(), false)).A00;
        ImmutableList requiredCompactedTreeListField = r13.getRequiredCompactedTreeListField(0, "reactions", AnonymousClass6A4.class, -1048951654);
        0qQ.A07(requiredCompactedTreeListField);
        ArrayList arrayList = new ArrayList(0Yv.A1E(requiredCompactedTreeListField, 10));
        Iterator it = requiredCompactedTreeListField.iterator();
        while (it.hasNext()) {
            C250663lr r10 = (C250663lr) it.next();
            Class<BjF> cls = BjF.class;
            String requiredStringField = r10.reinterpretRequired(0, cls, 558195694).getRequiredStringField(0, "emoji");
            Boolean valueOf = Boolean.valueOf(r10.reinterpretRequired(0, cls, 558195694).getRequiredBooleanField(1, "is_unseen"));
            AnonymousClass69R r1 = (AnonymousClass69R) r10.reinterpretRequired(0, cls, 558195694).getRequiredTreeField(2, PublicKeyCredentialControllerUtility.JSON_KEY_USER, BjE.class, 566429378).reinterpretRequired(0, AnonymousClass69R.class, -1791809412);
            if (r1 != null) {
                user = r1.A0E(1E4.A00(userSession));
            } else {
                user = null;
            }
            arrayList.add(new NoteEmojiReactionInfo(user, valueOf, requiredStringField));
        }
        return new C300865y4(r5, arrayList);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0051, code lost:
        if (r20 != null) goto L_0x0053;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C279864zZ A03(com.instagram.common.session.UserSession r37, X.AnonymousClass69O r38, X.AnonymousClass69N r39, X.17i r40) {
        /*
            r1 = 0
            r8 = 2
            r4 = r40
            X.0qQ.A0B(r4, r8)
            r9 = 3
            r11 = 0
            r10 = r37
            r0 = r39
            if (r38 == 0) goto L_0x010d
            com.google.common.collect.ImmutableList r2 = r38.A0E()
            if (r2 == 0) goto L_0x010d
            java.util.Iterator r7 = r2.iterator()
        L_0x0019:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x010a
            java.lang.Object r6 = r7.next()
            r2 = r6
            X.69Q r2 = (X.AnonymousClass69Q) r2
            X.69R r5 = r2.A0E()
            r3 = 4
            java.lang.String r2 = "strong_id__"
            java.lang.String r5 = r5.getOptionalStringField(r3, r2)
            r3 = 11
            java.lang.String r2 = "author_id"
            java.lang.String r2 = r0.getRequiredStringField(r3, r2)
            boolean r2 = X.0qQ.A0K(r5, r2)
            if (r2 == 0) goto L_0x0019
        L_0x003f:
            X.69Q r6 = (X.AnonymousClass69Q) r6
            if (r6 == 0) goto L_0x010d
            X.69R r3 = r6.A0E()
            if (r3 == 0) goto L_0x010d
            X.1E5 r2 = X.1E4.A00(r10)
            com.instagram.user.model.User r20 = r3.A0E(r2)
            if (r20 == 0) goto L_0x010d
        L_0x0053:
            if (r20 == 0) goto L_0x023d
            r3 = 4
            java.lang.String r2 = "audience"
            int r31 = r0.getRequiredIntField(r3, r2)
            com.instagram.api.schemas.NoteBackgroundColor r12 = com.instagram.api.schemas.NoteBackgroundColor.WHITE
            r3 = 13
            java.lang.String r2 = "can_reply"
            boolean r37 = r0.getRequiredBooleanField(r3, r2)
            r3 = 8
            java.lang.String r2 = "created_at"
            long r33 = r0.getRequiredTimeField(r3, r2)
            java.lang.Class<X.69Y> r5 = X.AnonymousClass69Y.class
            r4 = 17
            java.lang.String r3 = "custom_theme"
            r2 = -1546487611(0xffffffffa3d278c5, float:-2.2819394E-17)
            X.3lr r4 = r0.getOptionalTreeField(r4, r3, r5, r2)
            if (r4 == 0) goto L_0x0108
            r16 = 0
            r14 = 0
            java.lang.Class<X.UQO> r3 = X.UQO.class
            r2 = 1820191152(0x6c7de9b0, float:1.22784716E27)
            X.3lr r7 = r4.reinterpretRequired(r1, r3, r2)
            X.UyY r6 = X.C16636UyY.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r5 = "activation_type"
            java.lang.Enum r5 = r7.getOptionalEnumField(r9, r5, r6)
            if (r5 == 0) goto L_0x00a3
            java.lang.String r6 = r5.toString()
            java.util.Map r5 = com.instagram.api.schemas.NoteActivationType.A01
            java.lang.Object r14 = r5.get(r6)
            com.instagram.api.schemas.NoteActivationType r14 = (com.instagram.api.schemas.NoteActivationType) r14
            if (r14 != 0) goto L_0x00a3
            com.instagram.api.schemas.NoteActivationType r14 = com.instagram.api.schemas.NoteActivationType.UNRECOGNIZED
        L_0x00a3:
            X.3lr r6 = r4.reinterpretRequired(r1, r3, r2)
            java.lang.String r5 = "background_color_hex"
            java.lang.String r15 = r6.getOptionalStringField(r1, r5)
            X.3lr r7 = r4.reinterpretRequired(r1, r3, r2)
            r6 = 1
            java.lang.String r5 = "stroke_color"
            java.lang.String r17 = r7.getOptionalStringField(r6, r5)
            X.3lr r3 = r4.reinterpretRequired(r1, r3, r2)
            java.lang.String r2 = "text_color_hex"
            java.lang.String r18 = r3.getOptionalStringField(r8, r2)
            com.instagram.api.schemas.NoteCustomThemeImpl r13 = new com.instagram.api.schemas.NoteCustomThemeImpl
            r13.<init>(r14, r15, r16, r17, r18)
        L_0x00c7:
            java.lang.Class<X.69V> r5 = X.AnonymousClass69V.class
            r4 = 14
            java.lang.String r3 = "e2ee_mentioned_user_list"
            r2 = 2019794762(0x78639f4a, float:1.8466909E34)
            com.google.common.collect.ImmutableList r3 = r0.getOptionalCompactedTreeListField(r4, r3, r5, r2)
            if (r3 == 0) goto L_0x011b
            r2 = 10
            int r2 = X.0Yv.A1E(r3, r2)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r2)
            java.util.Iterator r5 = r3.iterator()
        L_0x00e5:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x011c
            java.lang.Object r4 = r5.next()
            X.3lr r4 = (X.C250663lr) r4
            java.lang.Class<X.69R> r3 = X.AnonymousClass69R.class
            r2 = -1791809412(0xffffffff9533287c, float:-3.61807E-26)
            X.3lr r3 = r4.reinterpretRequired(r1, r3, r2)
            X.69R r3 = (X.AnonymousClass69R) r3
            X.1E5 r2 = X.1E4.A00(r10)
            com.instagram.user.model.User r2 = r3.A0E(r2)
            r6.add(r2)
            goto L_0x00e5
        L_0x0108:
            r13 = r11
            goto L_0x00c7
        L_0x010a:
            r6 = r11
            goto L_0x003f
        L_0x010d:
            r3 = 11
            java.lang.String r2 = "author_id"
            java.lang.String r2 = r0.getRequiredStringField(r3, r2)
            com.instagram.user.model.User r20 = r4.A02(r2)
            goto L_0x0053
        L_0x011b:
            r6 = r11
        L_0x011c:
            r3 = 7
            java.lang.String r2 = "expires_at"
            long r35 = r0.getRequiredTimeField(r3, r2)
            com.instagram.api.schemas.NoteFontStyle r15 = com.instagram.api.schemas.NoteFontStyle.STANDARD
            r3 = 9
            java.lang.String r2 = "has_translation"
            boolean r38 = r0.getRequiredBooleanField(r3, r2)
            r3 = 5
            java.lang.String r2 = "strong_id__"
            java.lang.String r24 = r0.getRequiredStringField(r3, r2)
            X.0qQ.A07(r24)
            r3 = 6
            java.lang.String r2 = "is_emoji_only"
            boolean r39 = r0.getRequiredBooleanField(r3, r2)
            r3 = 12
            java.lang.String r2 = "is_unseen"
            boolean r40 = r0.getRequiredBooleanField(r3, r2)
            java.lang.Class<X.69T> r4 = X.AnonymousClass69T.class
            java.lang.String r3 = "note_response_info"
            r2 = 2112469337(0x7de9b959, float:3.8834063E37)
            X.3lr r2 = r0.getOptionalTreeField(r9, r3, r4, r2)
            if (r2 == 0) goto L_0x0239
            java.lang.Class<X.69a> r4 = X.C3034969a.class
            r3 = 360174664(0x1577d448, float:5.0048713E-26)
            X.3lr r2 = r2.reinterpretRequired(r1, r4, r3)
            if (r2 == 0) goto L_0x0239
            X.1E5 r5 = X.1E4.A00(r10)
            java.lang.Class<X.69b> r3 = X.C3035069b.class
            com.facebook.pando.TreeJNI r2 = r2.reinterpret(r3)
            X.69b r2 = (X.C3035069b) r2
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            X.1E9 r3 = new X.1E9
            r3.<init>(r5, r4, r1)
            X.5y2 r17 = r2.F6x(r3)
        L_0x0178:
            r3 = 1
            java.lang.String r2 = "note_style"
            int r32 = r0.getRequiredIntField(r3, r2)
            java.lang.Class<X.69S> r4 = X.AnonymousClass69S.class
            java.lang.String r3 = "reaction_info"
            r2 = 309722357(0x1275fcf5, float:7.762016E-28)
            X.3lr r2 = r0.getOptionalTreeField(r8, r3, r4, r2)
            if (r2 == 0) goto L_0x0236
            java.lang.Class<X.69z> r4 = X.C3035969z.class
            r3 = 1829502336(0x6d0bfd80, float:2.707805E27)
            X.3lr r2 = r2.reinterpretRequired(r1, r4, r3)
            X.69z r2 = (X.C3035969z) r2
            if (r2 == 0) goto L_0x0236
            X.5y4 r14 = A01(r10, r2)
        L_0x019d:
            X.0sn r30 = X.0sn.A00
            java.lang.Class<X.69X> r5 = X.AnonymousClass69X.class
            r4 = 16
            java.lang.String r3 = "reshare_info"
            r2 = 21723481(0x14b7959, float:3.7372274E-38)
            X.3lr r2 = r0.getOptionalTreeField(r4, r3, r5, r2)
            if (r2 == 0) goto L_0x0233
            java.lang.Class<X.B75> r4 = X.B75.class
            r3 = -1528905752(0xffffffffa4debfe8, float:-9.6602255E-17)
            X.3lr r2 = r2.reinterpretRequired(r1, r4, r3)
            if (r2 == 0) goto L_0x0233
            X.1E5 r5 = X.1E4.A00(r10)
            java.lang.Class<X.B74> r3 = X.B74.class
            com.facebook.pando.TreeJNI r2 = r2.reinterpret(r3)
            X.B74 r2 = (X.B74) r2
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            X.1E9 r3 = new X.1E9
            r3.<init>(r5, r4, r1)
            X.60L r16 = r2.F6w(r3)
        L_0x01d3:
            java.lang.String r2 = "text"
            java.lang.String r26 = r0.getRequiredStringField(r1, r2)
            X.0qQ.A07(r26)
            r3 = 11
            java.lang.String r2 = "author_id"
            java.lang.String r27 = r0.getRequiredStringField(r3, r2)
            X.0qQ.A07(r27)
            java.lang.Class<X.69Z> r5 = X.AnonymousClass69Z.class
            r4 = 18
            java.lang.String r3 = "collab_note_info"
            r2 = 1233389782(0x498408d6, float:1081626.8)
            X.3lr r0 = r0.getOptionalTreeField(r4, r3, r5, r2)
            if (r0 == 0) goto L_0x021b
            java.lang.Class<X.BiV> r3 = X.C42795BiV.class
            r2 = 1207102294(0x47f2eb56, float:124374.67)
            X.3lr r0 = r0.reinterpretRequired(r1, r3, r2)
            if (r0 == 0) goto L_0x021b
            X.1E5 r4 = X.1E4.A00(r10)
            java.lang.Class<X.CJ2> r2 = X.CJ2.class
            com.facebook.pando.TreeJNI r0 = r0.reinterpret(r2)
            X.CJ2 r0 = (X.CJ2) r0
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            X.1E9 r2 = new X.1E9
            r2.<init>(r4, r3, r1)
            X.60J r11 = r0.F1s(r2)
        L_0x021b:
            r18 = 0
            java.lang.Boolean r21 = java.lang.Boolean.valueOf(r1)
            X.4zZ r10 = new X.4zZ
            r19 = r18
            r22 = r18
            r23 = r18
            r25 = r18
            r28 = r18
            r29 = r6
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r35, r37, r38, r39, r40)
            return r10
        L_0x0233:
            r16 = r11
            goto L_0x01d3
        L_0x0236:
            r14 = r11
            goto L_0x019d
        L_0x0239:
            r17 = r11
            goto L_0x0178
        L_0x023d:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass69P.A03(com.instagram.common.session.UserSession, X.69O, X.69N, X.17i):X.4zZ");
    }

    public static final C279864zZ A04(UserSession userSession, AnonymousClass69O r46, C42824Biy biy) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Integer num;
        User user;
        ImmutableList A0E;
        AnonymousClass69Q r3;
        AnonymousClass69R A0E2;
        String optionalStringField;
        ImmutableList A0E3;
        AnonymousClass69Q r1;
        AnonymousClass69R A0E4;
        ImmutableList A0E5;
        ImmutableList A0E6;
        C42824Biy biy2 = biy;
        String requiredStringField = biy2.getRequiredStringField(0, "strong_id__");
        if (requiredStringField == null) {
            return null;
        }
        int i = NoteAudience.MUTUAL_FOLLOWERS.A00;
        AnonymousClass69O r7 = r46;
        if (r46 == null || (A0E6 = r7.A0E()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(0Yv.A1E(A0E6, 10));
            Iterator it = A0E6.iterator();
            while (it.hasNext()) {
                arrayList.add(((AnonymousClass69Q) it.next()).A0E().A0E(1E4.A00(userSession)));
            }
        }
        NoteBackgroundColor noteBackgroundColor = NoteBackgroundColor.WHITE;
        NoteFontStyle noteFontStyle = NoteFontStyle.STANDARD;
        boolean coercedBooleanField = biy2.getCoercedBooleanField(2, "should_show_unseen_response_indicator");
        C45461Cws cws = new C45461Cws(DA0.A00());
        C45885D9e d9e = AnonymousClass60G.A00;
        String optionalStringField2 = biy2.getOptionalStringField(1, "prompt_text");
        if (optionalStringField2 == null) {
            optionalStringField2 = "";
        }
        C45459Cwq A00 = d9e.A00(requiredStringField, optionalStringField2);
        if (r46 == null || (A0E5 = r7.A0E()) == null) {
            arrayList2 = null;
        } else {
            arrayList2 = new ArrayList(0Yv.A1E(A0E5, 10));
            Iterator it2 = A0E5.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((AnonymousClass69Q) it2.next()).A0E().A0E(1E4.A00(userSession)));
            }
        }
        A00.A04 = arrayList2;
        if (r46 != null) {
            num = Integer.valueOf(r7.getRequiredIntField(0, "num_pog_users"));
        } else {
            num = null;
        }
        A00.A01 = num;
        A00.A00 = Boolean.valueOf(biy2.getCoercedBooleanField(2, "should_show_unseen_response_indicator"));
        cws.A0B = A00.A00();
        C300845y2 A002 = cws.A00();
        int i2 = NoteStyle.PROMPT_QUESTION.A00;
        0sn r37 = 0sn.A00;
        String optionalStringField3 = biy2.getOptionalStringField(1, "prompt_text");
        if (optionalStringField3 == null) {
            optionalStringField3 = "";
        }
        if (r46 == null || (A0E3 = r7.A0E()) == null || (r1 = (AnonymousClass69Q) A0E3.get(0)) == null || (A0E4 = r1.A0E()) == null) {
            user = null;
        } else {
            user = A0E4.A0E(1E4.A00(userSession));
        }
        if (user == null) {
            throw new IllegalStateException("Required value was null.");
        } else if (r46 != null && (A0E = r7.A0E()) != null && (r3 = (AnonymousClass69Q) A0E.get(0)) != null && (A0E2 = r3.A0E()) != null && (optionalStringField = A0E2.getOptionalStringField(4, "strong_id__")) != null) {
            return new C279864zZ((AnonymousClass60J) null, noteBackgroundColor, (NoteCustomThemeImpl) null, (C300865y4) null, noteFontStyle, (AnonymousClass60L) null, A002, (AnonymousClass60N) null, (User) null, user, false, (Integer) null, (String) null, requiredStringField, (String) null, optionalStringField3, optionalStringField, arrayList, (List) null, r37, i, i2, -1, -1, false, false, false, coercedBooleanField);
        } else {
            throw new IllegalStateException("Required value was null.");
        }
    }

    public static final User A05(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        User A02 = 17h.A00(userSession).A02(userSession.A06);
        if (A02 == null) {
            return 0eE.A00(userSession).A00();
        }
        return A02;
    }

    public static final C279864zZ A02(C279874za r45, UserSession userSession) {
        C300865y4 r9;
        C279864zZ r4 = (C279864zZ) r45;
        int i = r4.A00;
        List list = r4.A0L;
        Integer num = r4.A0F;
        NoteBackgroundColor noteBackgroundColor = NoteBackgroundColor.WHITE;
        boolean z = r4.A0O;
        long j = r4.A02;
        NoteCustomThemeImpl noteCustomThemeImpl = r4.A06;
        NoteCustomThemeImpl noteCustomThemeImpl2 = null;
        if (noteCustomThemeImpl != null) {
            noteCustomThemeImpl2 = noteCustomThemeImpl;
        }
        List list2 = r4.A0M;
        long j2 = r4.A03;
        NoteFontStyle noteFontStyle = NoteFontStyle.STANDARD;
        String str = r4.A0G;
        boolean z2 = r4.A0P;
        String str2 = r4.A0H;
        boolean z3 = r4.A0Q;
        boolean z4 = r4.A0R;
        C300845y2 r10 = r4.A0A;
        if (r10 != null) {
            1E4.A00(userSession);
        } else {
            r10 = null;
        }
        int i2 = r4.A01;
        C300865y4 r6 = r4.A07;
        if (r6 != null) {
            C276104sZ F7P = r6.A00.F7P();
            List<NoteEmojiReactionInfoIntf> list3 = r6.A01;
            ArrayList arrayList = new ArrayList(0Yv.A1E(list3, 10));
            for (NoteEmojiReactionInfoIntf noteEmojiReactionInfoIntf : list3) {
                String emoji = noteEmojiReactionInfoIntf.getEmoji();
                arrayList.add(new NoteEmojiReactionInfo(noteEmojiReactionInfoIntf.CCd(), noteEmojiReactionInfoIntf.Cdw(), emoji));
            }
            r9 = new C300865y4(F7P, arrayList);
        } else {
            r9 = null;
        }
        List<NoteEmojiReactionInfoIntf> list4 = r4.A0N;
        ArrayList arrayList2 = new ArrayList(0Yv.A1E(list4, 10));
        for (NoteEmojiReactionInfoIntf noteEmojiReactionInfoIntf2 : list4) {
            String emoji2 = noteEmojiReactionInfoIntf2.getEmoji();
            arrayList2.add(new NoteEmojiReactionInfo(noteEmojiReactionInfoIntf2.CCd(), noteEmojiReactionInfoIntf2.Cdw(), emoji2));
        }
        AnonymousClass60L r7 = r4.A09;
        if (r7 != null) {
            1E4.A00(userSession);
        } else {
            r7 = null;
        }
        User user = r4.A0C;
        String str3 = r4.A0I;
        String str4 = r4.A0J;
        Boolean bool = r4.A0E;
        User user2 = r4.A0D;
        String str5 = r4.A0K;
        AnonymousClass60J r42 = r4.A04;
        if (r42 != null) {
            1E4.A00(userSession);
        } else {
            r42 = null;
        }
        boolean z5 = z2;
        boolean z6 = z3;
        boolean z7 = z4;
        return new C279864zZ(r42, noteBackgroundColor, noteCustomThemeImpl2, r9, noteFontStyle, r7, r10, (AnonymousClass60N) null, user, user2, bool, num, str, str2, str3, str4, str5, list, list2, arrayList2, i, i2, j, j2, z, z5, z6, z7);
    }

    public static final String A06(NoteStyle noteStyle) {
        switch (noteStyle.ordinal()) {
            case 1:
                return "text";
            case 2:
                return "music";
            case 5:
                return "location";
            case 6:
                return "live";
            case 7:
                return "empty";
            case 8:
                return "prompt";
            case 9:
                return "note_chat";
            case 10:
                return "listening_now";
            case 11:
                return "gif";
            default:
                return "unknown";
        }
    }
}
