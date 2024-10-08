package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.GIk  reason: case insensitive filesystem */
public final class C52193GIk {
    public final ArrayList A01(UserSession userSession, 1Xj r28) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(0sr.A1P(new GJ2[]{GJ2.STORIES_TEMPLATE, GJ2.BIO_PRODUCT, GJ2.GEN_AI_DETECTION, GJ2.KEY_TAKEAWAYS, GJ2.CONTENT_APPRECIATION, GJ2.CREATOR_PICK, GJ2.HIGHLIGHT, GJ2.ICONIC_ENTRYPOINTS_AND_WORLD_PAGES, GJ2.ICONIC_ENTRYPOINTS, GJ2.WORLD_PAGES, GJ2.HORIZON_WORLDS, GJ2.META_QUEST, GJ2.RAY_BAN_STORIES, GJ2.UPCOMING_EVENT, GJ2.SHOPPING, GJ2.EXTERNAL_MEDIA, GJ2.PEOPLE, GJ2.STICKER_ANYTHING, GJ2.TEMPLATE, GJ2.LOCATION, GJ2.EFFECT, GJ2.THIRD_PARTY_SHARE_TO_CLIPS, GJ2.STICKER_RESULT, GJ2.SEE_MORE_PROMPTS}));
        UserSession userSession2 = userSession;
        A00(userSession2, r28, arrayList);
        if (182.A06(0Tu.A06, userSession2, 36322821892745697L)) {
            arrayList.add(GJ2.META_VERIFIED_LINK);
            return arrayList;
        }
        arrayList.add(0, GJ2.META_VERIFIED_LINK);
        return arrayList;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01b8, code lost:
        if (r3 != true) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01ba, code lost:
        r4 = r2.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01bc, code lost:
        if (r4 == null) goto L_0x01d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01c2, code lost:
        if (r4.CcK() == true) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01c8, code lost:
        if (r4.A4z() != false) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01ce, code lost:
        if (r4.A5l() == false) goto L_0x01d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01d2, code lost:
        r8 = X.0Tu.A05;
        r3 = 36322834776009202L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x021d, code lost:
        if (r3 == false) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0256, code lost:
        r3 = r1.A6d(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0288, code lost:
        if (X.182.A06(r8, r0, r3) == false) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A02(android.content.Context r31, X.C267324bN r32, com.instagram.common.session.UserSession r33, X.1Xj r34, boolean r35) {
        /*
            r30 = this;
            r6 = 1
            r0 = r33
            X.0qQ.A0B(r0, r6)
            r1 = 2
            r2 = r32
            X.0qQ.A0B(r2, r1)
            r3 = 3
            r1 = r34
            X.0qQ.A0B(r1, r3)
            if (r35 != 0) goto L_0x028f
            boolean r3 = X.C262624Fg.A00(r0)
            if (r3 == 0) goto L_0x028f
            X.GJ2 r3 = X.GJ2.GEN_AI_DETECTION
            java.util.List r3 = java.util.Collections.singletonList(r3)
            X.0qQ.A07(r3)
        L_0x0023:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r11 = r3.iterator()
        L_0x002c:
            boolean r3 = r11.hasNext()
            if (r3 == 0) goto L_0x030d
            java.lang.Object r7 = r11.next()
            X.GJ2 r7 = (X.GJ2) r7
            int r3 = r7.ordinal()
            switch(r3) {
                case 0: goto L_0x0220;
                case 1: goto L_0x005f;
                case 2: goto L_0x01ea;
                case 3: goto L_0x01f2;
                case 4: goto L_0x0074;
                case 5: goto L_0x025b;
                case 6: goto L_0x0265;
                case 7: goto L_0x0260;
                case 8: goto L_0x026c;
                case 9: goto L_0x009c;
                case 10: goto L_0x004b;
                case 11: goto L_0x0045;
                case 12: goto L_0x0108;
                case 13: goto L_0x00ce;
                case 14: goto L_0x00f6;
                case 15: goto L_0x0100;
                case 16: goto L_0x0212;
                case 17: goto L_0x0144;
                case 18: goto L_0x024b;
                case 19: goto L_0x016f;
                case 20: goto L_0x017c;
                case 21: goto L_0x0256;
                case 22: goto L_0x0250;
                case 23: goto L_0x0275;
                case 24: goto L_0x01db;
                default: goto L_0x003f;
            }
        L_0x003f:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0045:
            boolean r3 = r1.A4n()
            goto L_0x0269
        L_0x004b:
            boolean r3 = X.C243213Xw.A04(r0, r1)
            if (r3 != 0) goto L_0x028a
            boolean r3 = r1.CcK()
            if (r3 != 0) goto L_0x002c
            boolean r3 = r1.A6T(r0)
            if (r3 == 0) goto L_0x002c
            goto L_0x028a
        L_0x005f:
            boolean r3 = X.C243233Xy.A02(r1)
            if (r3 == 0) goto L_0x002c
            boolean r3 = r1.CcK()
            if (r3 == 0) goto L_0x028a
            X.0Tu r8 = X.0Tu.A05
            r3 = 36323023753587444(0x810b9900002af4, double:3.034164710621069E-306)
            goto L_0x0284
        L_0x0074:
            X.1Xj r3 = r2.A02
            if (r3 == 0) goto L_0x002c
            X.1Xy r3 = r3.A0C
            com.instagram.feed.media.CreativeConfigIntf r4 = r3.AsO()
            if (r4 == 0) goto L_0x002c
            java.util.List r3 = r4.B02()
            if (r3 == 0) goto L_0x008c
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x028a
        L_0x008c:
            r3 = r31
            java.util.List r3 = X.C284745Nt.A07(r3, r4)
            boolean r3 = r3.isEmpty()
            r3 = r3 ^ 1
            if (r3 == 0) goto L_0x002c
            goto L_0x028a
        L_0x009c:
            boolean r3 = X.2R8.A02(r0, r1)
            if (r3 == 0) goto L_0x002c
            X.3WT r3 = X.AnonymousClass3WT.POLLING
            java.util.List r4 = r1.A3o(r3)
            if (r4 == 0) goto L_0x00b8
            boolean r3 = r4.isEmpty()
            if (r3 != 0) goto L_0x00b8
            boolean r3 = X.AnonymousClass3YY.A05(r4)
            if (r3 != 0) goto L_0x00b8
            goto L_0x028a
        L_0x00b8:
            X.3WT r3 = X.AnonymousClass3WT.QUIZ
            java.util.List r3 = r1.A3o(r3)
            if (r3 == 0) goto L_0x00c6
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x028a
        L_0x00c6:
            X.3WT r3 = X.AnonymousClass3WT.SLIDER
            java.util.List r3 = r1.A3o(r3)
            goto L_0x0208
        L_0x00ce:
            X.1Xj r3 = r2.A02
            if (r3 == 0) goto L_0x002c
            X.1Xy r3 = r3.A0C
            X.1sQ r4 = r3.getClipsMetadata()
            if (r4 == 0) goto L_0x002c
            X.4gt r3 = r4.B3C()
            if (r3 == 0) goto L_0x002c
            X.4gt r3 = r4.B3C()
            if (r3 == 0) goto L_0x002c
            java.util.List r3 = r3.B9M()
            if (r3 == 0) goto L_0x002c
            boolean r3 = r3.isEmpty()
            r3 = r3 ^ 1
            if (r3 != r6) goto L_0x002c
            goto L_0x028a
        L_0x00f6:
            X.1Xj r3 = r2.A02
            if (r3 == 0) goto L_0x002c
            boolean r3 = X.B56.A01(r0, r3)
            goto L_0x0269
        L_0x0100:
            X.1Xj r3 = r2.A02
            boolean r3 = X.GJK.A02(r0, r3)
            goto L_0x021d
        L_0x0108:
            X.GKD r4 = X.GKD.DEFAULT_ON
            X.GKD r3 = X.GKD.NORMAL
            X.GKD[] r3 = new X.GKD[]{r4, r3}
            java.util.List r4 = X.0sr.A1P(r3)
            boolean r3 = r4 instanceof java.util.Collection
            if (r3 == 0) goto L_0x0120
            boolean r3 = r4.isEmpty()
            if (r3 == 0) goto L_0x0120
            goto L_0x002c
        L_0x0120:
            java.util.Iterator r10 = r4.iterator()
        L_0x0124:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L_0x002c
            java.lang.Object r9 = r10.next()
            X.GKD r9 = (X.GKD) r9
            X.1Z0 r3 = X.AnonymousClass2BF.A00()
            X.4kW r8 = r3.A03()
            X.1Xj r4 = r2.A02
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            boolean r3 = r8.A01(r9, r0, r4, r3)
            if (r3 == 0) goto L_0x0124
            goto L_0x028a
        L_0x0144:
            X.1Xj r3 = r2.A02
            if (r3 == 0) goto L_0x002c
            boolean r3 = r3.A6Y(r0)
            if (r3 != r6) goto L_0x002c
            X.1Xj r3 = r2.A02
            r13 = 0
            if (r3 == 0) goto L_0x016c
            java.lang.String r18 = r3.A2n()
        L_0x0157:
            X.9OT r12 = X.AnonymousClass9OT.REEL
            X.1Xj r3 = r2.A02
            if (r3 == 0) goto L_0x0161
            com.instagram.api.schemas.MediaGenAIDetectionMethod r13 = r3.A1I()
        L_0x0161:
            r15 = 0
            java.lang.String r16 = "X.3ZC"
            java.lang.String r17 = "genai_transparency_label_impression"
            r14 = r0
            X.C250563lf.A0e(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x028a
        L_0x016c:
            r18 = r13
            goto L_0x0157
        L_0x016f:
            X.1Xj r3 = r2.A02
            com.instagram.reels.prompt.model.PromptStickerModel r3 = X.C52200GIr.A00(r3)
            if (r3 == 0) goto L_0x002c
            boolean r3 = r3.A0K()
            goto L_0x01b8
        L_0x017c:
            X.1Xj r4 = r2.A02
            if (r4 == 0) goto L_0x002c
            X.3WT r3 = X.AnonymousClass3WT.CLIPS_PROMPT
            java.util.List r3 = r4.A3o(r3)
            if (r3 == 0) goto L_0x002c
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r9 = r3.iterator()
        L_0x0191:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L_0x01b2
            java.lang.Object r8 = r9.next()
            r3 = r8
            X.3ui r3 = (X.C255783ui) r3
            com.instagram.reels.prompt.model.PromptStickerModel r3 = r3.A0F()
            if (r3 == 0) goto L_0x01b0
            com.instagram.api.schemas.StoryPromptType r4 = r3.A03()
        L_0x01a8:
            com.instagram.api.schemas.StoryPromptType r3 = com.instagram.api.schemas.StoryPromptType.STORY_TEMPLATE
            if (r4 == r3) goto L_0x0191
            r10.add(r8)
            goto L_0x0191
        L_0x01b0:
            r4 = 0
            goto L_0x01a8
        L_0x01b2:
            boolean r3 = r10.isEmpty()
            r3 = r3 ^ 1
        L_0x01b8:
            if (r3 != r6) goto L_0x002c
            X.1Xj r4 = r2.A02
            if (r4 == 0) goto L_0x01d2
            boolean r3 = r4.CcK()
            if (r3 == r6) goto L_0x002c
            boolean r3 = r4.A4z()
            if (r3 != 0) goto L_0x002c
            boolean r3 = r4.A5l()
            if (r3 == 0) goto L_0x01d2
            goto L_0x002c
        L_0x01d2:
            X.0Tu r8 = X.0Tu.A05
            r3 = 36322834776009202(0x810b6d000f29f2, double:3.034045200439637E-306)
            goto L_0x0284
        L_0x01db:
            boolean r3 = r1.A68()
            if (r3 == 0) goto L_0x002c
            X.0Tu r8 = X.0Tu.A05
            r3 = 36329049592708871(0x81111400003f07, double:3.037975475545566E-306)
            goto L_0x0284
        L_0x01ea:
            com.instagram.model.venue.Venue r3 = r1.A23()
            if (r3 == 0) goto L_0x002c
            goto L_0x028a
        L_0x01f2:
            X.1Xj r3 = r2.A02
            if (r3 == 0) goto L_0x002c
            X.1Xy r3 = r3.A0C
            X.1sQ r3 = r3.getClipsMetadata()
            if (r3 == 0) goto L_0x002c
            X.4gw r3 = r3.C4a()
            if (r3 == 0) goto L_0x002c
            java.util.List r3 = r3.BrX()
        L_0x0208:
            if (r3 == 0) goto L_0x002c
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x028a
            goto L_0x002c
        L_0x0212:
            X.0Tu r8 = X.0Tu.A05
            r3 = 36324608596521141(0x810d0a000030b5, double:3.035166971673989E-306)
            boolean r3 = X.182.A06(r8, r0, r3)
        L_0x021d:
            if (r3 == 0) goto L_0x002c
            goto L_0x028a
        L_0x0220:
            boolean r3 = r1.A4s()
            if (r3 != 0) goto L_0x028a
            java.util.ArrayList r3 = r1.A39()
            if (r3 == 0) goto L_0x002c
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x002c
            X.LOQ r8 = X.LOQ.A00
            com.instagram.user.model.User r3 = r1.A2A(r0)
            if (r3 == 0) goto L_0x0249
            java.lang.String r4 = r3.getId()
        L_0x023e:
            boolean r3 = r1.A5G()
            boolean r3 = r8.A01(r0, r4, r3)
            if (r3 == 0) goto L_0x002c
            goto L_0x028a
        L_0x0249:
            r4 = 0
            goto L_0x023e
        L_0x024b:
            boolean r3 = r1.A6a(r0)
            goto L_0x0269
        L_0x0250:
            boolean r3 = r1.A6a(r0)
            if (r3 != r6) goto L_0x002c
        L_0x0256:
            boolean r3 = r1.A6d(r0)
            goto L_0x0269
        L_0x025b:
            boolean r3 = r1.A6Z(r0)
            goto L_0x0269
        L_0x0260:
            boolean r3 = r1.A6N()
            goto L_0x0269
        L_0x0265:
            boolean r3 = r1.A6c(r0)
        L_0x0269:
            if (r3 != r6) goto L_0x002c
            goto L_0x028a
        L_0x026c:
            X.1Xy r3 = r1.A0C
            X.DUF r3 = r3.Anr()
            if (r3 == 0) goto L_0x002c
            goto L_0x028a
        L_0x0275:
            X.1Xy r3 = r1.A0C
            X.1eb r3 = r3.BFi()
            if (r3 == 0) goto L_0x002c
            X.0Tu r8 = X.0Tu.A05
            r3 = 36317358692766806(0x81067200101456, double:3.0305821033467285E-306)
        L_0x0284:
            boolean r3 = X.182.A06(r8, r0, r3)
            if (r3 == 0) goto L_0x002c
        L_0x028a:
            r5.add(r7)
            goto L_0x002c
        L_0x028f:
            X.1Xy r3 = r1.A0C
            java.util.List r3 = r3.Av3()
            r8 = r30
            if (r3 == 0) goto L_0x0307
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x0307
            r7 = 0
            X.0Tu r5 = X.0Tu.A05
            r3 = 36323805437898263(0x810c4f00042e17, double:3.034659050926821E-306)
            boolean r3 = X.182.A06(r5, r0, r3)
            if (r3 == 0) goto L_0x0307
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            X.GJ2 r8 = X.GJ2.GEN_AI_DETECTION
            X.GJ2 r9 = X.GJ2.STICKER_ANYTHING
            X.GJ2 r10 = X.GJ2.KEY_TAKEAWAYS
            X.GJ2 r11 = X.GJ2.CONTENT_APPRECIATION
            X.GJ2 r12 = X.GJ2.CREATOR_PICK
            X.GJ2 r13 = X.GJ2.HIGHLIGHT
            X.GJ2 r14 = X.GJ2.ICONIC_ENTRYPOINTS
            X.GJ2 r15 = X.GJ2.HORIZON_WORLDS
            X.GJ2 r16 = X.GJ2.META_QUEST
            X.GJ2 r17 = X.GJ2.ICONIC_ENTRYPOINTS_AND_WORLD_PAGES
            X.GJ2 r18 = X.GJ2.WORLD_PAGES
            X.GJ2 r19 = X.GJ2.RAY_BAN_STORIES
            X.GJ2 r20 = X.GJ2.UPCOMING_EVENT
            X.GJ2 r21 = X.GJ2.SHOPPING
            X.GJ2 r22 = X.GJ2.EXTERNAL_MEDIA
            X.GJ2 r23 = X.GJ2.PEOPLE
            X.GJ2 r24 = X.GJ2.TEMPLATE
            X.GJ2 r25 = X.GJ2.LOCATION
            X.GJ2 r26 = X.GJ2.EFFECT
            X.GJ2 r27 = X.GJ2.THIRD_PARTY_SHARE_TO_CLIPS
            X.GJ2 r28 = X.GJ2.STICKER_RESULT
            X.GJ2 r29 = X.GJ2.SEE_MORE_PROMPTS
            X.GJ2[] r4 = new X.GJ2[]{r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29}
            java.util.List r4 = X.0sr.A1P(r4)
            r3.addAll(r4)
            A00(r0, r1, r3)
            X.0Tu r8 = X.0Tu.A06
            r4 = 36322821892745697(0x810b6a002829e1, double:3.03403705301192E-306)
            boolean r4 = X.182.A06(r8, r0, r4)
            if (r4 == 0) goto L_0x0300
            X.GJ2 r4 = X.GJ2.META_VERIFIED_LINK
            r3.add(r4)
            goto L_0x0023
        L_0x0300:
            X.GJ2 r4 = X.GJ2.META_VERIFIED_LINK
            r3.add(r7, r4)
            goto L_0x0023
        L_0x0307:
            java.util.ArrayList r3 = r8.A01(r0, r1)
            goto L_0x0023
        L_0x030d:
            java.util.List r0 = X.00k.A0a(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52193GIk.A02(android.content.Context, X.4bN, com.instagram.common.session.UserSession, X.1Xj, boolean):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0035, code lost:
        if (r3.contains(r4.A06) != true) goto L_0x0037;
     */
    @kotlin.Deprecated(message = "This is only for a learning test to remove People Tag from attribution row. This will be cleaned up after experiment wraps up.")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(com.instagram.common.session.UserSession r4, X.1Xj r5, java.util.List r6) {
        /*
            java.util.ArrayList r1 = r5.A3E()
            if (r1 == 0) goto L_0x0037
            r0 = 10
            int r0 = X.0Yv.A1E(r1, r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x0015:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x002d
            java.lang.Object r0 = r1.next()
            com.instagram.model.people.PeopleTag r0 = (com.instagram.model.people.PeopleTag) r0
            com.instagram.user.model.User r0 = r0.A07()
            java.lang.String r0 = r0.getId()
            r3.add(r0)
            goto L_0x0015
        L_0x002d:
            r2 = 1
            java.lang.String r0 = r4.A06
            boolean r0 = r3.contains(r0)
            r1 = 1
            if (r0 == r2) goto L_0x0038
        L_0x0037:
            r1 = 0
        L_0x0038:
            boolean r0 = X.2R8.A02(r4, r5)
            if (r0 != 0) goto L_0x0052
            if (r1 != 0) goto L_0x0052
            X.0Tu r2 = X.0Tu.A05
            r0 = 36328804779638365(0x8110db00013e5d, double:3.037820654773995E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x0052
            X.GJ2 r0 = X.GJ2.PEOPLE
            r6.remove(r0)
        L_0x0052:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52193GIk.A00(com.instagram.common.session.UserSession, X.1Xj, java.util.List):void");
    }
}
