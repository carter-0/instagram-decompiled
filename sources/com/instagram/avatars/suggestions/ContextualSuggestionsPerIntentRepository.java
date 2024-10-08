package com.instagram.avatars.suggestions;

import X.00k;
import X.02m;
import X.02z;
import X.0Yv;
import X.0eP;
import X.0qQ;
import X.106;
import X.10b;
import X.1Er;
import X.AnonymousClass000;
import X.AnonymousClass05K;
import X.AnonymousClass0r6;
import X.AnonymousClass27E;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C250663lr;
import X.C252733pa;
import X.C254573sh;
import X.C273654mx;
import X.C293135kC;
import X.C297395rg;
import X.C317846nw;
import X.C317866ny;
import X.C317966o8;
import X.C51966G9m;
import X.C60946Ju4;
import X.C61410nE;
import X.C62618Kip;
import X.C63449KxE;
import X.C63944LEj;
import X.C63961LFl;
import X.DbV;
import X.GNY;
import X.MFS;
import X.MHG;
import X.MVY;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.common.collect.ImmutableList;
import com.instagram.avatars.store.AvatarStore;
import com.instagram.avatars.suggestions.graphql.RankedStickerImpl;
import com.instagram.avatars.suggestions.interactor.IGContextualSuggestionsAPI;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public final class ContextualSuggestionsPerIntentRepository extends C252733pa implements MVY {
    public long A00;
    public AnonymousClass27E A01;
    public final C317846nw A02;
    public final C317866ny A03;
    public final AvatarStore A04;
    public final C63944LEj A05 = new C63944LEj();
    public final C63944LEj A06 = new C63944LEj();
    public final IGContextualSuggestionsAPI A07;
    public final 02m A08;
    public final UserSession A09;
    public final C61410nE A0A;
    public final Integer A0B;
    public final ConcurrentHashMap A0C = new ConcurrentHashMap();
    public final AtomicBoolean A0D;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ContextualSuggestionsPerIntentRepository(X.C317846nw r10, X.C317866ny r11, X.02m r12, com.instagram.common.session.UserSession r13) {
        /*
            r9 = this;
            r0 = 2
            int r6 = X.DbW.A03(r0, r12, r10)
            com.instagram.avatars.store.AvatarStore r5 = X.25x.A00(r13)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.HOURS
            X.0Tu r2 = X.0Tu.A05
            r0 = 36603571018339258(0x820ac1000f13ba, double:3.211583930523277E-306)
            long r0 = X.182.A01(r2, r13, r0)
            long r0 = r3.toMillis(r0)
            com.instagram.avatars.suggestions.interactor.IGContextualSuggestionsAPI r7 = new com.instagram.avatars.suggestions.interactor.IGContextualSuggestionsAPI
            r7.<init>(r13, r0)
            X.0nE r8 = X.C61410nE.A00
            r0 = 5
            X.AnonymousClass7TF.A1E(r5, r0, r8)
            r3 = 0
            r4 = 0
            r0 = 1342004349(0x4ffd5c7d, float:8.5013939E9)
            X.19S r1 = X.AnonymousClass43D.A01(r0, r6)
            java.lang.String r0 = "ContextualSuggestionsStickersRepository"
            r9.<init>(r0, r1)
            r9.A09 = r13
            r9.A08 = r12
            r9.A02 = r10
            r9.A03 = r11
            r9.A04 = r5
            r9.A07 = r7
            r9.A0A = r8
            X.LEj r0 = new X.LEj
            r0.<init>()
            r9.A06 = r0
            X.LEj r0 = new X.LEj
            r0.<init>()
            r9.A05 = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r9.A0C = r0
            r0 = 36603571018273721(0x820ac1000e13b9, double:3.211583930481831E-306)
            int r1 = X.DbS.A04(r2, r13, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L_0x007c
            if (r1 != 0) goto L_0x007c
        L_0x0067:
            r9.A0B = r4
            X.27C r0 = X.AnonymousClass27C.A00
            r9.A01 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r3)
            r9.A0D = r0
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r9.A00 = r0
            return
        L_0x007c:
            r4 = r0
            goto L_0x0067
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.avatars.suggestions.ContextualSuggestionsPerIntentRepository.<init>(X.6nw, X.6ny, X.02m, com.instagram.common.session.UserSession):void");
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [X.MDs, X.4D7] */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0053 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A02(com.instagram.avatars.suggestions.ContextualSuggestionsPerIntentRepository r12, java.util.List<java.lang.Object> r13, X.AnonymousClass4D7 r14, boolean r15) {
        /*
            r8 = 2
            boolean r0 = X.C66140MDs.A01(r8, r14)
            if (r0 == 0) goto L_0x0083
            r7 = r14
            X.MDs r7 = (X.C66140MDs) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0083
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x0015:
            java.lang.Object r9 = r7.A03
            X.1Hj r6 = X.1Hj.A02
            int r0 = r7.A00
            r5 = 0
            r4 = 1
            if (r0 == 0) goto L_0x002f
            if (r0 == r4) goto L_0x0042
            if (r0 != r8) goto L_0x0089
            java.lang.Object r12 = r7.A01
            com.instagram.avatars.suggestions.ContextualSuggestionsPerIntentRepository r12 = (com.instagram.avatars.suggestions.ContextualSuggestionsPerIntentRepository) r12
            X.0eS.A00(r9)
        L_0x002a:
            X.Ju4 r9 = (X.C60946Ju4) r9
            if (r9 != 0) goto L_0x008e
            return r5
        L_0x002f:
            X.0eS.A00(r9)
            r0 = 0
            r7.A01 = r12
            r7.A02 = r13
            r7.A05 = r15
            r7.A00 = r4
            java.lang.Object r9 = A03(r12, r13, r7, r15, r0)
            if (r9 != r6) goto L_0x004f
            return r6
        L_0x0042:
            boolean r15 = r7.A05
            java.lang.Object r13 = r7.A02
            java.util.List r13 = (java.util.List) r13
            java.lang.Object r12 = r7.A01
            com.instagram.avatars.suggestions.ContextualSuggestionsPerIntentRepository r12 = (com.instagram.avatars.suggestions.ContextualSuggestionsPerIntentRepository) r12
            X.0eS.A00(r9)
        L_0x004f:
            X.Ju4 r9 = (X.C60946Ju4) r9
            if (r9 != 0) goto L_0x0054
            return r5
        L_0x0054:
            long r2 = A00(r9)
            long r10 = X.AnonymousClass7TG.A0I()
            int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r0 > 0) goto L_0x0092
            if (r13 == 0) goto L_0x0076
            java.util.Iterator r2 = r13.iterator()
        L_0x0066:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0076
            java.lang.Object r1 = r2.next()
            java.util.concurrent.ConcurrentHashMap r0 = r12.A0C
            r0.remove(r1)
            goto L_0x0066
        L_0x0076:
            r7.A01 = r12
            r7.A02 = r5
            r7.A00 = r8
            java.lang.Object r9 = A03(r12, r13, r7, r15, r4)
            if (r9 != r6) goto L_0x002a
            return r6
        L_0x0083:
            X.MDs r7 = new X.MDs
            r7.<init>(r12, r14, r8)
            goto L_0x0015
        L_0x0089:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x008e:
            long r2 = A00(r9)
        L_0x0092:
            long r0 = r12.A00
            long r0 = java.lang.Math.min(r2, r0)
            r12.A00 = r0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.avatars.suggestions.ContextualSuggestionsPerIntentRepository.A02(com.instagram.avatars.suggestions.ContextualSuggestionsPerIntentRepository, java.util.List, X.4D7, boolean):java.lang.Object");
    }

    public final List AjS(List list) {
        0qQ.A0B(list, 0);
        0eP A042 = A04(list);
        String str = (String) A042.A00;
        List list2 = (List) A042.A01;
        List A002 = this.A05.A00(list2, str);
        if (!AnonymousClass7TE.A1b(A002)) {
            return this.A06.A00(list2, str);
        }
        return A002;
    }

    public final AnonymousClass0r6 FIB(List list) {
        List list2 = list;
        0qQ.A0B(list, 0);
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = ((List) A04(list).A01).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            DbV.A1U(next, A1C, this.A0C.containsKey(next) ? 1 : 0);
        }
        if (!00k.A0t(A1C)) {
            return null;
        }
        02z A012 = 106.A01(AjS(list));
        AnonymousClass7TE.A1Z(new MHG(A012, list2, this, A1C, (AnonymousClass4D7) null, 19), this.A01);
        return 10b.A03(A012);
    }

    public static final long A00(C60946Ju4 ju4) {
        long j;
        long j2;
        Iterator it = 00k.A0S(0Yv.A1F(ju4.A03.values()), 0Yv.A1F(ju4.A02.values())).iterator();
        if (!it.hasNext()) {
            return Long.MAX_VALUE;
        }
        ImageUrl imageUrl = ((C317966o8) ((GNY) it.next()).A01).A0H;
        0qQ.A07(imageUrl);
        Long A002 = C63449KxE.A00(imageUrl);
        if (A002 != null) {
            j = A002.longValue();
        } else {
            j = Long.MAX_VALUE;
        }
        Long valueOf = Long.valueOf(j);
        while (it.hasNext()) {
            ImageUrl imageUrl2 = ((C317966o8) ((GNY) it.next()).A01).A0H;
            0qQ.A07(imageUrl2);
            Long A003 = C63449KxE.A00(imageUrl2);
            if (A003 != null) {
                j2 = A003.longValue();
            } else {
                j2 = Long.MAX_VALUE;
            }
            Long valueOf2 = Long.valueOf(j2);
            if (valueOf.compareTo(valueOf2) > 0) {
                valueOf = valueOf2;
            }
        }
        if (valueOf != null) {
            return valueOf.longValue();
        }
        return Long.MAX_VALUE;
    }

    public static final GNY A01(RankedStickerImpl rankedStickerImpl) {
        C250663lr optionalTreeField;
        String A072;
        String A082;
        String str;
        C254573sh r0 = C250663lr.Companion;
        RankedStickerImpl rankedStickerImpl2 = rankedStickerImpl;
        C250663lr reinterpretIfFulfillsType = rankedStickerImpl2.reinterpretIfFulfillsType(0, AnonymousClass000.A00(2549), RankedStickerImpl.InlineXIGRankedAvatarSticker.class, 1297693564);
        if (reinterpretIfFulfillsType == null || (optionalTreeField = reinterpretIfFulfillsType.getOptionalTreeField(0, "sticker", RankedStickerImpl.InlineXIGRankedAvatarSticker.Sticker.class, 1928639229)) == null || (A072 = optionalTreeField.A07(PublicKeyCredentialControllerUtility.JSON_KEY_ID)) == null || (A082 = optionalTreeField.A08("cdn_url")) == null) {
            return null;
        }
        int coercedIntField = optionalTreeField.getCoercedIntField(5, IgReactMediaPickerNativeModule.WIDTH);
        int coercedIntField2 = optionalTreeField.getCoercedIntField(6, IgReactMediaPickerNativeModule.HEIGHT);
        String A0D2 = optionalTreeField.A0D("accessibility_label");
        Enum optionalEnumField = optionalTreeField.getOptionalEnumField(9, "media_type", C62618Kip.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
        int coercedIntField3 = optionalTreeField.getCoercedIntField(10, C273654mx.A00(3096));
        String A0B2 = optionalTreeField.A0B("instruction_key_id");
        ImmutableList requiredCompactedStringListField = optionalTreeField.getRequiredCompactedStringListField(11, "tags");
        String A092 = optionalTreeField.A09("template");
        float coercedDoubleField = (float) reinterpretIfFulfillsType.getCoercedDoubleField(1, "weight");
        C317966o8 A002 = C317966o8.A00(new SimpleImageUrl(A082, coercedIntField, coercedIntField2), A072, "avatar_sticker", (float) coercedIntField, (float) coercedIntField2, 1.0f);
        A002.A0M = A0D2;
        A002.A0C = coercedIntField3;
        if (optionalEnumField == C62618Kip.CLIP) {
            str = "animation";
        } else {
            str = "image";
        }
        A002.A0h = str;
        if (A0B2 != null) {
            A002.A0a = A0B2;
        }
        if (A092 != null) {
            A002.A0b = A092;
        }
        A002.A0j = requiredCompactedStringListField;
        return new GNY((Object) A002, coercedDoubleField, 1);
    }

    /* JADX WARNING: type inference failed for: r13v1, types: [X.MDH, X.4D7] */
    /* JADX WARNING: type inference failed for: r13v7 */
    /* JADX WARNING: type inference failed for: r13v8 */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0288  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x02d7  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x02df  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0151 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A03(com.instagram.avatars.suggestions.ContextualSuggestionsPerIntentRepository r16, java.util.List r17, X.AnonymousClass4D7 r18, boolean r19, boolean r20) {
        /*
            r8 = r17
            r14 = r19
            r15 = r20
            r4 = r18
            r0 = r16
            boolean r1 = r4 instanceof X.MDH
            if (r1 == 0) goto L_0x0155
            r13 = r4
            X.MDH r13 = (X.MDH) r13
            int r3 = r13.A01
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L_0x0155
            int r3 = r3 - r2
            r13.A01 = r3
        L_0x001c:
            java.lang.Object r7 = r13.A06
            X.1Hj r6 = X.1Hj.A02
            int r1 = r13.A01
            r5 = 0
            r4 = 2
            r2 = 1
            r3 = 192481029(0xb790705, float:4.7960937E-32)
            if (r1 == 0) goto L_0x00bf
            if (r1 == r2) goto L_0x00fb
            if (r1 != r4) goto L_0x0315
            int r1 = r13.A00
            java.lang.Object r0 = r13.A02
            com.instagram.avatars.suggestions.ContextualSuggestionsPerIntentRepository r0 = (com.instagram.avatars.suggestions.ContextualSuggestionsPerIntentRepository) r0
            X.0eS.A00(r7)
        L_0x0037:
            X.3Ii r7 = (X.C239803Ii) r7
            boolean r6 = r7 instanceof X.C239793Ih
            if (r6 == 0) goto L_0x0288
            X.3Ih r7 = (X.C239793Ih) r7
            java.lang.Object r7 = r7.A00
            com.instagram.avatars.suggestions.graphql.IGContextualSuggestionsQueryResponseImpl r7 = (com.instagram.avatars.suggestions.graphql.IGContextualSuggestionsQueryResponseImpl) r7
            X.02m r6 = r0.A08
            r6.markerEnd(r3, r1, r4)
            if (r7 == 0) goto L_0x02cf
            com.instagram.avatars.suggestions.graphql.IGContextualSuggestionsQueryResponseImpl$XigContextualSuggestionsData r10 = r7.A0E()
            if (r10 == 0) goto L_0x015c
            java.lang.Class<com.instagram.avatars.suggestions.graphql.IGContextualSuggestionsQueryResponseImpl$XigContextualSuggestionsData$StickersRanking> r9 = com.instagram.avatars.suggestions.graphql.IGContextualSuggestionsQueryResponseImpl.XigContextualSuggestionsData.StickersRanking.class
            r8 = -805091010(0xffffffffd003493e, float:-8.8104612E9)
            java.lang.String r6 = "stickers_ranking"
            X.3lr r10 = r10.A04(r9, r6, r8)
            if (r10 == 0) goto L_0x015c
            java.lang.Class<com.instagram.avatars.suggestions.graphql.IGContextualSuggestionsQueryResponseImpl$XigContextualSuggestionsData$StickersRanking$IntentRanking> r9 = com.instagram.avatars.suggestions.graphql.IGContextualSuggestionsQueryResponseImpl.XigContextualSuggestionsData.StickersRanking.IntentRanking.class
            r8 = -1431638724(0xffffffffaaaaed3c, float:-3.036268E-13)
            r6 = 1486(0x5ce, float:2.082E-42)
            java.lang.String r6 = X.AnonymousClass000.A00(r6)
            com.google.common.collect.ImmutableList r6 = r10.A06(r9, r6, r8)
            if (r6 == 0) goto L_0x015c
            java.util.ArrayList r13 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r15 = r6.iterator()
        L_0x0076:
            boolean r6 = r15.hasNext()
            if (r6 == 0) goto L_0x015e
            X.3lr r10 = X.C41845B3m.A0V(r15)
            r12 = 0
            java.lang.String r6 = "intent"
            java.lang.String r11 = r10.getOptionalStringField(r12, r6)
            if (r11 == 0) goto L_0x0076
            java.lang.Class<com.instagram.avatars.suggestions.graphql.IGContextualSuggestionsQueryResponseImpl$XigContextualSuggestionsData$StickersRanking$IntentRanking$Stickers> r9 = com.instagram.avatars.suggestions.graphql.IGContextualSuggestionsQueryResponseImpl.XigContextualSuggestionsData.StickersRanking.IntentRanking.Stickers.class
            r8 = -57436586(0xfffffffffc939656, float:-6.1305345E36)
            java.lang.String r6 = "stickers"
            com.google.common.collect.ImmutableList r6 = r10.getRequiredCompactedTreeListField(r2, r6, r9, r8)
            java.util.ArrayList r10 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r14 = r6.iterator()
        L_0x009c:
            boolean r6 = r14.hasNext()
            if (r6 == 0) goto L_0x00bb
            X.3lr r9 = X.C41845B3m.A0V(r14)
            java.lang.Class<com.instagram.avatars.suggestions.graphql.RankedStickerImpl> r8 = com.instagram.avatars.suggestions.graphql.RankedStickerImpl.class
            r6 = -1231237410(0xffffffffb69ccede, float:-4.673245E-6)
            X.3lr r6 = r9.reinterpretRequired(r12, r8, r6)
            com.instagram.avatars.suggestions.graphql.RankedStickerImpl r6 = (com.instagram.avatars.suggestions.graphql.RankedStickerImpl) r6
            X.GNY r6 = A01(r6)
            if (r6 == 0) goto L_0x009c
            r10.add(r6)
            goto L_0x009c
        L_0x00bb:
            X.AnonymousClass7TF.A1I(r11, r10, r13)
            goto L_0x0076
        L_0x00bf:
            X.0eS.A00(r7)
            if (r17 == 0) goto L_0x00e7
            java.util.concurrent.ConcurrentHashMap r10 = r0.A0C
            java.util.ArrayList r11 = X.AnonymousClass7TG.A0r(r8)
            java.util.Iterator r9 = r8.iterator()
        L_0x00ce:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x00e0
            java.lang.Object r7 = r9.next()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            X.AnonymousClass7TF.A1I(r7, r1, r11)
            goto L_0x00ce
        L_0x00e0:
            java.util.Map r1 = X.0Yt.A08(r11)
            r10.putAll(r1)
        L_0x00e7:
            com.instagram.avatars.store.AvatarStore r7 = r0.A04
            r13.A02 = r0
            r13.A03 = r8
            r13.A04 = r14
            r13.A05 = r15
            r13.A01 = r2
            r1 = 0
            java.lang.Object r7 = r7.A02(r13, r1, r1)
            if (r7 != r6) goto L_0x010a
            return r6
        L_0x00fb:
            boolean r15 = r13.A05
            boolean r14 = r13.A04
            java.lang.Object r8 = r13.A03
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.lang.Object r0 = r13.A02
            com.instagram.avatars.suggestions.ContextualSuggestionsPerIntentRepository r0 = (com.instagram.avatars.suggestions.ContextualSuggestionsPerIntentRepository) r0
            X.0eS.A00(r7)
        L_0x010a:
            X.27E r7 = (X.AnonymousClass27E) r7
            r0.A01 = r7
            boolean r1 = r7 instanceof X.C293135kC
            if (r1 == 0) goto L_0x0152
            X.5kC r7 = (X.C293135kC) r7
            X.5kB r1 = r7.A00
            java.lang.String r11 = r1.A02
        L_0x0118:
            X.2SP r1 = X.2SP.A01
            int r1 = r1.A03()
            X.02m r9 = r0.A08
            r9.markerStart(r3, r1)
            r7 = 1521(0x5f1, float:2.131E-42)
            java.lang.String r7 = X.AnonymousClass000.A00(r7)
            r9.markerAnnotate(r3, r1, r7, r14)
            java.lang.String r7 = "forceNetwork"
            r9.markerAnnotate(r3, r1, r7, r15)
            com.instagram.avatars.suggestions.interactor.IGContextualSuggestionsAPI r7 = r0.A07
            if (r8 == 0) goto L_0x013b
            java.util.List r12 = X.00k.A0Z(r8)
            if (r12 != 0) goto L_0x013d
        L_0x013b:
            X.0sn r12 = X.0sn.A00
        L_0x013d:
            X.6ny r9 = r0.A03
            X.6nw r8 = r0.A02
            java.lang.Integer r10 = r0.A0B
            r13.A02 = r0
            r13.A03 = r5
            r13.A00 = r1
            r13.A01 = r4
            java.lang.Object r7 = r7.A00(r8, r9, r10, r11, r12, r13, r14, r15)
            if (r7 != r6) goto L_0x0037
            return r6
        L_0x0152:
            java.lang.String r11 = ""
            goto L_0x0118
        L_0x0155:
            X.MDH r13 = new X.MDH
            r13.<init>(r0, r4)
            goto L_0x001c
        L_0x015c:
            r15 = r5
            goto L_0x0162
        L_0x015e:
            java.util.Map r15 = X.0Yt.A08(r13)
        L_0x0162:
            com.instagram.avatars.suggestions.graphql.IGContextualSuggestionsQueryResponseImpl$XigContextualSuggestionsData r10 = r7.A0E()
            if (r10 == 0) goto L_0x01db
            java.lang.Class<com.instagram.avatars.suggestions.graphql.IGContextualSuggestionsQueryResponseImpl$XigContextualSuggestionsData$StickersRanking> r9 = com.instagram.avatars.suggestions.graphql.IGContextualSuggestionsQueryResponseImpl.XigContextualSuggestionsData.StickersRanking.class
            r8 = -805091010(0xffffffffd003493e, float:-8.8104612E9)
            java.lang.String r6 = "stickers_ranking"
            X.3lr r10 = r10.A04(r9, r6, r8)
            if (r10 == 0) goto L_0x01db
            java.lang.Class<com.instagram.avatars.suggestions.graphql.IGContextualSuggestionsQueryResponseImpl$XigContextualSuggestionsData$StickersRanking$PhraseRanking> r9 = com.instagram.avatars.suggestions.graphql.IGContextualSuggestionsQueryResponseImpl.XigContextualSuggestionsData.StickersRanking.PhraseRanking.class
            r8 = 1831790809(0x6d2ee8d9, float:3.383243E27)
            r6 = 1683(0x693, float:2.358E-42)
            java.lang.String r6 = X.AnonymousClass000.A00(r6)
            com.google.common.collect.ImmutableList r6 = r10.getRequiredCompactedTreeListField(r2, r6, r9, r8)
            if (r6 == 0) goto L_0x01db
            java.util.ArrayList r12 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r14 = r6.iterator()
        L_0x018e:
            boolean r5 = r14.hasNext()
            if (r5 == 0) goto L_0x01d7
            X.3lr r9 = X.C41845B3m.A0V(r14)
            r11 = 0
            java.lang.String r5 = "phrase"
            java.lang.String r10 = r9.getOptionalStringField(r11, r5)
            if (r10 == 0) goto L_0x018e
            java.lang.Class<com.instagram.avatars.suggestions.graphql.IGContextualSuggestionsQueryResponseImpl$XigContextualSuggestionsData$StickersRanking$PhraseRanking$Stickers> r8 = com.instagram.avatars.suggestions.graphql.IGContextualSuggestionsQueryResponseImpl.XigContextualSuggestionsData.StickersRanking.PhraseRanking.Stickers.class
            r6 = -332698846(0xffffffffec2b6b22, float:-8.2892894E26)
            java.lang.String r5 = "stickers"
            com.google.common.collect.ImmutableList r5 = r9.getRequiredCompactedTreeListField(r2, r5, r8, r6)
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r13 = r5.iterator()
        L_0x01b4:
            boolean r5 = r13.hasNext()
            if (r5 == 0) goto L_0x01d3
            X.3lr r8 = X.C41845B3m.A0V(r13)
            java.lang.Class<com.instagram.avatars.suggestions.graphql.RankedStickerImpl> r6 = com.instagram.avatars.suggestions.graphql.RankedStickerImpl.class
            r5 = -1231237410(0xffffffffb69ccede, float:-4.673245E-6)
            X.3lr r5 = r8.reinterpretRequired(r11, r6, r5)
            com.instagram.avatars.suggestions.graphql.RankedStickerImpl r5 = (com.instagram.avatars.suggestions.graphql.RankedStickerImpl) r5
            X.GNY r5 = A01(r5)
            if (r5 == 0) goto L_0x01b4
            r9.add(r5)
            goto L_0x01b4
        L_0x01d3:
            X.AnonymousClass7TF.A1I(r10, r9, r12)
            goto L_0x018e
        L_0x01d7:
            java.util.Map r5 = X.0Yt.A08(r12)
        L_0x01db:
            com.instagram.avatars.suggestions.graphql.IGContextualSuggestionsQueryResponseImpl$XigContextualSuggestionsData r10 = r7.A0E()
            if (r10 == 0) goto L_0x0231
            java.lang.Class<com.instagram.avatars.suggestions.graphql.IGContextualSuggestionsQueryResponseImpl$XigContextualSuggestionsData$StickersRanking> r9 = com.instagram.avatars.suggestions.graphql.IGContextualSuggestionsQueryResponseImpl.XigContextualSuggestionsData.StickersRanking.class
            r8 = -805091010(0xffffffffd003493e, float:-8.8104612E9)
            java.lang.String r6 = "stickers_ranking"
            X.3lr r10 = r10.A04(r9, r6, r8)
            if (r10 == 0) goto L_0x0231
            java.lang.Class<com.instagram.avatars.suggestions.graphql.IGContextualSuggestionsQueryResponseImpl$XigContextualSuggestionsData$StickersRanking$IntentRanking> r9 = com.instagram.avatars.suggestions.graphql.IGContextualSuggestionsQueryResponseImpl.XigContextualSuggestionsData.StickersRanking.IntentRanking.class
            r8 = -1431638724(0xffffffffaaaaed3c, float:-3.036268E-13)
            r11 = 0
            r6 = 1486(0x5ce, float:2.082E-42)
            java.lang.String r6 = X.AnonymousClass000.A00(r6)
            com.google.common.collect.ImmutableList r6 = r10.getRequiredCompactedTreeListField(r11, r6, r9, r8)
            if (r6 == 0) goto L_0x0231
            java.util.ArrayList r10 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r12 = r6.iterator()
        L_0x0208:
            boolean r6 = r12.hasNext()
            if (r6 == 0) goto L_0x022c
            X.3lr r9 = X.C41845B3m.A0V(r12)
            java.lang.String r8 = "is_complete"
            boolean r6 = r9.hasFieldValue(r8)
            if (r6 == 0) goto L_0x0208
            boolean r6 = r9.getCoercedBooleanField(r4, r8)
            if (r6 == 0) goto L_0x0208
            java.lang.String r6 = "intent"
            java.lang.String r6 = r9.getOptionalStringField(r11, r6)
            if (r6 == 0) goto L_0x0208
            r10.add(r6)
            goto L_0x0208
        L_0x022c:
            java.util.Set r17 = X.00k.A0k(r10)
            goto L_0x0233
        L_0x0231:
            X.0sl r17 = X.0sl.A00
        L_0x0233:
            com.instagram.avatars.suggestions.graphql.IGContextualSuggestionsQueryResponseImpl$XigContextualSuggestionsData r10 = r7.A0E()
            if (r10 == 0) goto L_0x0291
            java.lang.Class<com.instagram.avatars.suggestions.graphql.IGContextualSuggestionsQueryResponseImpl$XigContextualSuggestionsData$StickersRanking> r9 = com.instagram.avatars.suggestions.graphql.IGContextualSuggestionsQueryResponseImpl.XigContextualSuggestionsData.StickersRanking.class
            r8 = -805091010(0xffffffffd003493e, float:-8.8104612E9)
            java.lang.String r6 = "stickers_ranking"
            X.3lr r10 = r10.A04(r9, r6, r8)
            if (r10 == 0) goto L_0x0291
            java.lang.Class<com.instagram.avatars.suggestions.graphql.IGContextualSuggestionsQueryResponseImpl$XigContextualSuggestionsData$StickersRanking$PhraseRanking> r9 = com.instagram.avatars.suggestions.graphql.IGContextualSuggestionsQueryResponseImpl.XigContextualSuggestionsData.StickersRanking.PhraseRanking.class
            r8 = 1831790809(0x6d2ee8d9, float:3.383243E27)
            r6 = 1683(0x693, float:2.358E-42)
            java.lang.String r6 = X.AnonymousClass000.A00(r6)
            com.google.common.collect.ImmutableList r6 = r10.getRequiredCompactedTreeListField(r2, r6, r9, r8)
            if (r6 == 0) goto L_0x0291
            java.util.ArrayList r10 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r11 = r6.iterator()
        L_0x025f:
            boolean r6 = r11.hasNext()
            if (r6 == 0) goto L_0x0283
            X.3lr r9 = X.C41845B3m.A0V(r11)
            java.lang.String r8 = "is_complete"
            boolean r6 = r9.hasFieldValue(r8)
            if (r6 == 0) goto L_0x025f
            boolean r6 = r9.getCoercedBooleanField(r4, r8)
            if (r6 == 0) goto L_0x025f
            java.lang.String r6 = "phrase"
            java.lang.String r6 = r9.A07(r6)
            if (r6 == 0) goto L_0x025f
            r10.add(r6)
            goto L_0x025f
        L_0x0283:
            java.util.Set r18 = X.00k.A0k(r10)
            goto L_0x0293
        L_0x0288:
            boolean r2 = r7 instanceof X.C297815sO
            if (r2 != 0) goto L_0x02d3
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0291:
            X.0sl r18 = X.0sl.A00
        L_0x0293:
            com.instagram.avatars.suggestions.graphql.IGContextualSuggestionsQueryResponseImpl$XigContextualSuggestionsData r6 = r7.A0E()
            if (r6 == 0) goto L_0x02dc
            java.lang.String r4 = "lexicon_version"
            java.lang.String r4 = r6.A07(r4)
            if (r4 == 0) goto L_0x02dc
            java.lang.Integer r4 = X.00y.A0l(r4)
            if (r4 == 0) goto L_0x02dc
            int r19 = r4.intValue()
        L_0x02ab:
            com.instagram.avatars.suggestions.graphql.IGContextualSuggestionsQueryResponseImpl$XigContextualSuggestionsData r6 = r7.A0E()
            if (r6 == 0) goto L_0x02b9
            java.lang.String r4 = "model_name"
            java.lang.String r14 = r6.getOptionalStringField(r2, r4)
            if (r14 != 0) goto L_0x02bb
        L_0x02b9:
            java.lang.String r14 = ""
        L_0x02bb:
            if (r15 != 0) goto L_0x02c1
            X.0sm r15 = X.0Yt.A0E()
        L_0x02c1:
            if (r5 != 0) goto L_0x02c7
            X.0sm r5 = X.0Yt.A0E()
        L_0x02c7:
            X.Ju4 r13 = new X.Ju4
            r16 = r5
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r5 = r13
        L_0x02cf:
            X.3Ih r7 = X.C41845B3m.A0d(r5)
        L_0x02d3:
            boolean r2 = r7 instanceof X.C239793Ih
            if (r2 == 0) goto L_0x02df
            X.3Ih r7 = (X.C239793Ih) r7
            java.lang.Object r6 = r7.A00
            return r6
        L_0x02dc:
            r19 = -1
            goto L_0x02ab
        L_0x02df:
            boolean r2 = r7 instanceof X.C297815sO
            if (r2 == 0) goto L_0x0310
            X.4dm r4 = X.JTP.A0N(r7)
            boolean r2 = r4 instanceof X.C268664dn
            if (r2 == 0) goto L_0x030b
            X.02m r6 = r0.A08
            X.4dn r4 = (X.C268664dn) r4
            java.lang.Throwable r5 = r4.A00
            java.lang.String r4 = X.2Og.A00(r5)
            java.lang.String r2 = "fail_stacktrace"
            r6.markerAnnotate(r3, r1, r2, r4)
            java.lang.String r4 = r5.getMessage()
        L_0x02fe:
            X.02m r2 = r0.A08
            java.lang.String r0 = "fail_reason"
            r2.markerAnnotate(r3, r1, r0, r4)
            r0 = 3
            r2.markerEnd(r3, r1, r0)
            r6 = 0
            return r6
        L_0x030b:
            java.lang.String r4 = r4.toString()
            goto L_0x02fe
        L_0x0310:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0315:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.avatars.suggestions.ContextualSuggestionsPerIntentRepository.A03(com.instagram.avatars.suggestions.ContextualSuggestionsPerIntentRepository, java.util.List, X.4D7, boolean, boolean):java.lang.Object");
    }

    public final boolean BAc() {
        if (this.A06.A01() || this.A05.A01()) {
            return true;
        }
        return false;
    }

    public final boolean CKi() {
        if (this.A00 <= AnonymousClass7TG.A0I()) {
            return false;
        }
        AnonymousClass27E r1 = this.A04.A01;
        if (!0qQ.A0K(r1, C297395rg.A00)) {
            return 0qQ.A0K(this.A01, r1);
        }
        if (!(this.A01 instanceof C293135kC) || !BAc()) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.MDy, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: type inference failed for: r6v6 */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00f2, code lost:
        if (r1 == null) goto L_0x00fb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object E3g(X.AnonymousClass4D7 r11) {
        /*
            r10 = this;
            r3 = 26
            boolean r0 = X.C66146MDy.A02(r3, r11)
            if (r0 == 0) goto L_0x009b
            r6 = r11
            X.MDy r6 = (X.C66146MDy) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x009b
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r6.A03
            X.1Hj r5 = X.1Hj.A02
            int r0 = r6.A00
            r8 = 1
            if (r0 == 0) goto L_0x007b
            if (r0 != r8) goto L_0x00f5
            java.lang.Object r4 = r6.A02
            X.0rm r4 = (X.0rm) r4
            java.lang.Object r7 = r6.A01
            com.instagram.avatars.suggestions.ContextualSuggestionsPerIntentRepository r7 = (com.instagram.avatars.suggestions.ContextualSuggestionsPerIntentRepository) r7
            X.0eS.A00(r1)
        L_0x002c:
            java.lang.Object r5 = r4.A00
            X.Ju4 r5 = (X.C60946Ju4) r5
            if (r5 == 0) goto L_0x00fa
            X.LEj r3 = r7.A06
            java.util.Map r2 = r5.A02
            r1 = 0
            X.0qQ.A0B(r2, r1)
            java.util.concurrent.ConcurrentHashMap r0 = r3.A00
            r0.putAll(r2)
            java.util.Map r9 = r5.A03
            X.0qQ.A0B(r9, r1)
            java.util.concurrent.ConcurrentHashMap r0 = r3.A01
            r0.putAll(r9)
            java.util.Set r3 = r5.A04
            r4 = 10
            int r0 = X.0Yv.A1E(r3, r4)
            int r1 = X.0se.A0L(r0)
            r0 = 16
            if (r1 >= r0) goto L_0x005b
            r1 = 16
        L_0x005b:
            java.util.LinkedHashMap r6 = X.DbS.A0x(r1)
            java.util.Iterator r2 = r3.iterator()
        L_0x0063:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00a2
            java.lang.Object r1 = r2.next()
            java.util.Map r0 = r5.A02
            java.lang.Object r0 = r0.get(r1)
            if (r0 != 0) goto L_0x0077
            X.0sn r0 = X.0sn.A00
        L_0x0077:
            r6.put(r1, r0)
            goto L_0x0063
        L_0x007b:
            X.0eS.A00(r1)
            X.0rm r4 = X.C51965G9l.A11()
            X.4Cq r3 = r10.A01
            r2 = 0
            r1 = 41
            X.MHH r0 = new X.MHH
            r0.<init>((X.AnonymousClass4D7) r2, (java.lang.Object) r10, (java.lang.Object) r4, (int) r1)
            X.1Er r0 = X.C51966G9m.A1L(r0, r3)
            X.C66146MDy.A00(r10, r4, r6, r8)
            java.lang.Object r0 = r0.CfH(r6)
            if (r0 == r5) goto L_0x0104
            r7 = r10
            goto L_0x002c
        L_0x009b:
            X.MDy r6 = new X.MDy
            r6.<init>(r10, r11, r3)
            goto L_0x0016
        L_0x00a2:
            java.util.Set r1 = r5.A05
            int r0 = X.0Yv.A1E(r1, r4)
            int r0 = X.DbY.A00(r0)
            java.util.LinkedHashMap r4 = X.DbS.A0x(r0)
            java.util.Iterator r2 = r1.iterator()
        L_0x00b4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00ca
            java.lang.Object r1 = r2.next()
            java.lang.Object r0 = r9.get(r1)
            if (r0 != 0) goto L_0x00c6
            X.0sn r0 = X.0sn.A00
        L_0x00c6:
            r4.put(r1, r0)
            goto L_0x00b4
        L_0x00ca:
            java.util.Iterator r3 = r3.iterator()
        L_0x00ce:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00e2
            java.lang.Object r2 = r3.next()
            java.util.concurrent.ConcurrentHashMap r1 = r7.A0C
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            r1.put(r2, r0)
            goto L_0x00ce
        L_0x00e2:
            X.LEj r1 = r7.A05
            java.util.concurrent.ConcurrentHashMap r0 = r1.A00
            r0.putAll(r6)
            java.util.concurrent.ConcurrentHashMap r0 = r1.A01
            r0.putAll(r4)
            int r2 = r5.A00
            java.lang.String r1 = r5.A01
            if (r1 != 0) goto L_0x00fd
            goto L_0x00fb
        L_0x00f5:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00fa:
            r2 = -1
        L_0x00fb:
            java.lang.String r1 = "unknown"
        L_0x00fd:
            r0 = 8
            X.N4G r5 = new X.N4G
            r5.<init>((int) r2, (java.lang.String) r1, (int) r0)
        L_0x0104:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.avatars.suggestions.ContextualSuggestionsPerIntentRepository.E3g(X.4D7):java.lang.Object");
    }

    public final 1Er EBC() {
        if (!this.A0D.compareAndSet(false, true)) {
            return null;
        }
        return C51966G9m.A1L(new MFS(this, (AnonymousClass4D7) null, 28), this.A01);
    }

    public static final 0eP A04(List list) {
        Object obj;
        String str;
        ArrayList<C63961LFl> A1C = AnonymousClass7TE.A1C();
        for (Object next : list) {
            if (((C63961LFl) next).A00 == AnonymousClass05K.A15) {
                A1C.add(next);
            }
        }
        ArrayList A0r = AnonymousClass7TG.A0r(A1C);
        for (C63961LFl lFl : A1C) {
            A0r.add(lFl.A01);
        }
        Iterator it = list.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            obj = it.next();
        } while (((C63961LFl) obj).A00 != AnonymousClass05K.A1F);
        C63961LFl lFl2 = (C63961LFl) obj;
        if (lFl2 != null) {
            str = lFl2.A01;
        } else {
            str = "";
        }
        return AnonymousClass7TE.A1L(str, A0r);
    }
}
