package com.instagram.avatars.suggestions;

import X.02m;
import X.05G;
import X.0Aj;
import X.0bb;
import X.0qQ;
import X.106;
import X.AnonymousClass0eM;
import X.AnonymousClass43D;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C252733pa;
import X.C273654mx;
import X.C335167cV;
import X.DbS;
import X.JTQ;
import X.MFS;
import X.MMP;
import X.Pxd;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public final class AvatarStickerSuggestionRepository extends C252733pa {
    public boolean A00;
    public final int A01;
    public final C335167cV A02;
    public final 02m A03;
    public final UserSession A04;
    public final String A05;
    public final ConcurrentHashMap A06 = new ConcurrentHashMap();
    public final AnonymousClass0eM A07 = MMP.A00(this, 23);
    public final AnonymousClass0eM A08 = MMP.A00(this, 24);
    public final 05G A09 = 106.A01((Object) null);
    public final 05G A0A = DbS.A10("");
    public final boolean A0B;

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDy, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0161 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.avatars.suggestions.AvatarStickerSuggestionRepository r14, java.lang.String r15, X.AnonymousClass4D7 r16) {
        /*
            r6 = r14
            r9 = r15
            r3 = 25
            r5 = r16
            boolean r0 = X.C66146MDy.A02(r3, r5)
            if (r0 == 0) goto L_0x0036
            r4 = r5
            X.MDy r4 = (X.C66146MDy) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0036
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x001a:
            java.lang.Object r12 = r4.A03
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A00
            r16 = 0
            r7 = 4
            r11 = 3
            r8 = 2
            r2 = 0
            r10 = 1
            if (r0 == 0) goto L_0x0045
            if (r0 == r10) goto L_0x003c
            if (r0 == r8) goto L_0x0162
            if (r0 == r11) goto L_0x0145
            if (r0 == r7) goto L_0x0162
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0036:
            X.MDy r4 = new X.MDy
            r4.<init>(r14, r5, r3)
            goto L_0x001a
        L_0x003c:
            java.lang.Object r9 = r4.A02
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r6 = r4.A01
            com.instagram.avatars.suggestions.AvatarStickerSuggestionRepository r6 = (com.instagram.avatars.suggestions.AvatarStickerSuggestionRepository) r6
            goto L_0x007a
        L_0x0045:
            X.0eS.A00(r12)
            java.lang.String r13 = " "
            java.util.List r14 = X.DbV.A18(r15, r13)
            com.instagram.common.session.UserSession r12 = r6.A04
            X.0Tu r5 = X.0Tu.A05
            r0 = 36603459348337571(0x820aa7000213a3, double:3.211513309964551E-306)
            int r0 = X.DbS.A04(r5, r12, r0)
            java.util.List r0 = X.00k.A0d(r14, r0)
            java.lang.String r5 = X.DbT.A0z(r13, r0, r2)
            X.0eM r0 = r6.A08     // Catch:{ all -> 0x0082 }
            java.lang.Object r1 = r0.getValue()     // Catch:{ all -> 0x0082 }
            com.facebook.avatar.stickerguide.lib.impl.StickerTypeaheadImpl r1 = (com.facebook.avatar.stickerguide.lib.impl.StickerTypeaheadImpl) r1     // Catch:{ all -> 0x0082 }
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ all -> 0x0082 }
            r0.toString()     // Catch:{ all -> 0x0082 }
            X.C66146MDy.A00(r6, r15, r4, r10)     // Catch:{ all -> 0x0082 }
            java.lang.Object r12 = r1.A00(r5, r2, r4)     // Catch:{ all -> 0x0082 }
            if (r12 != r3) goto L_0x007d
            return r3
        L_0x007a:
            X.0eS.A00(r12)     // Catch:{ all -> 0x0080 }
        L_0x007d:
            X.LOo r12 = (X.C64121LOo) r12     // Catch:{ all -> 0x0080 }
            goto L_0x0087
        L_0x0080:
            r0 = move-exception
            goto L_0x0083
        L_0x0082:
            r0 = move-exception
        L_0x0083:
            X.0eQ r12 = X.JTO.A1B(r0)
        L_0x0087:
            r5 = r12
            boolean r0 = r12 instanceof X.0eQ
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x014e
            r0 = r12
            X.LOo r0 = (X.C64121LOo) r0
            java.util.List r13 = r0.A01
            boolean r0 = X.AnonymousClass7TE.A1b(r13)
            if (r0 == 0) goto L_0x0137
            java.util.ArrayList r14 = X.AnonymousClass7TF.A0p(r13)
            java.util.Iterator r15 = r13.iterator()
        L_0x00a1:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x00bb
            java.lang.Object r0 = r15.next()
            X.LFl r0 = (X.C63961LFl) r0
            java.lang.String r0 = r0.A01
            long r0 = X.JTR.A0M(r0)
            java.lang.Long r0 = X.JTO.A0y(r0)
            r14.add(r0)
            goto L_0x00a1
        L_0x00bb:
            r6.A01(r9, r14, r10)
            java.util.ArrayList r10 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r14 = r13.iterator()
        L_0x00c6:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x00ef
            java.lang.Object r13 = r14.next()
            X.LFl r13 = (X.C63961LFl) r13
            java.lang.Integer r0 = r13.A00
            int r1 = r0.intValue()
            r0 = 0
            if (r1 == r11) goto L_0x00e1
            if (r1 != r7) goto L_0x00e9
            boolean r1 = r6.A0B
            if (r1 == 0) goto L_0x00e9
        L_0x00e1:
            java.util.concurrent.ConcurrentHashMap r1 = r6.A06
            java.lang.String r0 = r13.A01
            java.lang.Object r0 = r1.get(r0)
        L_0x00e9:
            if (r0 == 0) goto L_0x00c6
            r10.add(r0)
            goto L_0x00c6
        L_0x00ef:
            int r14 = r10.size()
            com.instagram.common.session.UserSession r15 = r6.A04
            X.0Tu r13 = X.0Tu.A05
            r0 = 36603571017487287(0x820ac1000213b7, double:3.211583929984487E-306)
            int r0 = X.DbS.A04(r13, r15, r0)
            if (r14 < r0) goto L_0x0137
            java.util.ArrayList r7 = X.AnonymousClass7TF.A0p(r10)
            java.util.Iterator r5 = r10.iterator()
        L_0x010a:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0125
            X.6o8 r0 = X.JTO.A0a(r5)
            java.lang.String r0 = r0.A0a
            X.0qQ.A07(r0)
            long r0 = X.DbZ.A07(r0)
            java.lang.Long r0 = X.JTO.A0y(r0)
            r7.add(r0)
            goto L_0x010a
        L_0x0125:
            r0 = r16
            r6.A01(r9, r7, r0)
            X.05G r0 = r6.A09
            r4.A01 = r2
            r4.A02 = r2
            r4.A00 = r8
            java.lang.Object r0 = r0.emit(r10, r4)
            goto L_0x015f
        L_0x0137:
            X.05G r1 = r6.A09
            X.0sn r0 = X.0sn.A00
            X.C66146MDy.A00(r6, r12, r4, r11)
            java.lang.Object r0 = r1.emit(r0, r4)
            if (r0 != r3) goto L_0x014e
            return r3
        L_0x0145:
            java.lang.Object r5 = r4.A02
            java.lang.Object r6 = r4.A01
            com.instagram.avatars.suggestions.AvatarStickerSuggestionRepository r6 = (com.instagram.avatars.suggestions.AvatarStickerSuggestionRepository) r6
            X.0eS.A00(r12)
        L_0x014e:
            java.lang.Throwable r0 = X.0eR.A00(r5)
            if (r0 == 0) goto L_0x0165
            X.05G r1 = r6.A09
            X.0sn r0 = X.0sn.A00
            X.C66146MDy.A00(r5, r2, r4, r7)
            java.lang.Object r0 = r1.emit(r0, r4)
        L_0x015f:
            if (r0 != r3) goto L_0x0165
            return r3
        L_0x0162:
            X.0eS.A00(r12)
        L_0x0165:
            X.0gF r3 = X.C60340gF.A00
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.avatars.suggestions.AvatarStickerSuggestionRepository.A00(com.instagram.avatars.suggestions.AvatarStickerSuggestionRepository, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AvatarStickerSuggestionRepository(02m r5, UserSession userSession, String str, int i, boolean z) {
        super("AvatarSuggestionRepository", AnonymousClass43D.A00(1342004349));
        C335167cV r2 = new C335167cV(userSession);
        0qQ.A0B(r5, 2);
        this.A04 = userSession;
        this.A03 = r5;
        this.A05 = str;
        this.A01 = i;
        this.A0B = z;
        this.A02 = r2;
        AnonymousClass7TE.A1Z(new MFS(this, (AnonymousClass4D7) null, 25), this.A01);
    }

    private final void A01(String str, List list, boolean z) {
        String str2;
        C335167cV r1 = this.A02;
        String str3 = this.A05;
        String valueOf = String.valueOf(((LexiconRecommendationProvider) this.A07.getValue()).A02);
        0qQ.A0B(str, 5);
        0Aj A0e = AnonymousClass7TE.A0e(r1.A00, "avatar_stickers_measurement_typeahead_recommendations");
        if (A0e.isSampled()) {
            0bb r3 = new 0bb();
            r3.A05("result_size", DbS.A0j(list.size()));
            r3.A06("referrer_surface", GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT);
            r3.A06("lexicon_version", valueOf);
            r3.A07("non_avatar_sticker_ids", list);
            if (z) {
                str2 = "raw";
            } else {
                str2 = "filtered";
            }
            r3.A06(C273654mx.A00(91), str2);
            r3.A06(Pxd.A00(8), str3);
            r3.A06("input_text", str);
            A0e.AAK(r3, "event_data");
            JTQ.A15(A0e, "typeahead");
        }
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MED, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0058 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(java.lang.String r9, X.AnonymousClass4D7 r10) {
        /*
            r8 = this;
            r3 = 20
            boolean r0 = X.MED.A04(r3, r10)
            if (r0 == 0) goto L_0x002f
            r4 = r10
            X.MED r4 = (X.MED) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002f
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r7 = r4.A04
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A00
            r6 = 4
            r5 = 3
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L_0x0043
            if (r0 == r1) goto L_0x0089
            if (r0 == r2) goto L_0x0035
            if (r0 == r5) goto L_0x0089
            if (r0 == r6) goto L_0x0089
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x002f:
            X.MED r4 = new X.MED
            r4.<init>(r8, r10, r3)
            goto L_0x0016
        L_0x0035:
            java.lang.Object r2 = r4.A03
            com.instagram.avatars.suggestions.AvatarStickerSuggestionRepository r2 = (com.instagram.avatars.suggestions.AvatarStickerSuggestionRepository) r2
            java.lang.Object r9 = r4.A02
            java.lang.Object r1 = r4.A01
            com.instagram.avatars.suggestions.AvatarStickerSuggestionRepository r1 = (com.instagram.avatars.suggestions.AvatarStickerSuggestionRepository) r1
            X.0eS.A00(r7)
            goto L_0x0069
        L_0x0043:
            X.0eS.A00(r7)
            boolean r0 = r8.A00
            if (r0 == 0) goto L_0x0059
            r4.A00 = r1
            X.05G r0 = r8.A0A
            java.lang.Object r0 = r0.emit(r9, r4)
        L_0x0052:
            if (r0 == r3) goto L_0x008e
            X.0gF r0 = X.C60340gF.A00
        L_0x0056:
            if (r0 != r3) goto L_0x008c
            return r3
        L_0x0059:
            r4.A01 = r8
            r4.A02 = r9
            r4.A03 = r8
            r4.A00 = r2
            java.lang.Object r7 = r8.A03(r4)
            if (r7 == r3) goto L_0x008e
            r1 = r8
            r2 = r8
        L_0x0069:
            boolean r0 = X.AnonymousClass7TE.A1a(r7)
            r2.A00 = r0
            boolean r0 = r1.A00
            if (r0 == 0) goto L_0x007d
            X.MED.A03(r4, r5)
            X.05G r0 = r1.A0A
            java.lang.Object r0 = r0.emit(r9, r4)
            goto L_0x0052
        L_0x007d:
            X.05G r1 = r1.A09
            X.0sn r0 = X.0sn.A00
            X.MED.A03(r4, r6)
            java.lang.Object r0 = r1.emit(r0, r4)
            goto L_0x0056
        L_0x0089:
            X.0eS.A00(r7)
        L_0x008c:
            X.0gF r3 = X.C60340gF.A00
        L_0x008e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.avatars.suggestions.AvatarStickerSuggestionRepository.A02(java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.ME4, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(X.AnonymousClass4D7 r6) {
        /*
            r5 = this;
            r3 = 31
            boolean r0 = X.ME4.A03(r3, r6)
            if (r0 == 0) goto L_0x0022
            r4 = r6
            X.ME4 r4 = (X.ME4) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0022
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r4.A01
            X.1Hj r2 = X.1Hj.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x002c
            if (r0 != r1) goto L_0x0027
            goto L_0x0040
        L_0x0022:
            X.ME4 r4 = X.ME4.A00(r5, r6, r3)
            goto L_0x0016
        L_0x0027:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x002c:
            X.0eS.A00(r3)
            X.0eM r0 = r5.A08     // Catch:{ all -> 0x0046 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0046 }
            com.facebook.avatar.stickerguide.lib.impl.StickerTypeaheadImpl r0 = (com.facebook.avatar.stickerguide.lib.impl.StickerTypeaheadImpl) r0     // Catch:{ all -> 0x0046 }
            r4.A00 = r1     // Catch:{ all -> 0x0046 }
            java.lang.Object r3 = r0.A01(r4)     // Catch:{ all -> 0x0046 }
            if (r3 != r2) goto L_0x0043
            return r2
        L_0x0040:
            X.0eS.A00(r3)     // Catch:{ all -> 0x0046 }
        L_0x0043:
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x0046 }
            goto L_0x004b
        L_0x0046:
            r0 = move-exception
            X.0eQ r3 = X.JTO.A1B(r0)
        L_0x004b:
            boolean r0 = r3 instanceof X.0eQ
            java.lang.Boolean r2 = X.DbT.A0l(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.avatars.suggestions.AvatarStickerSuggestionRepository.A03(X.4D7):java.lang.Object");
    }
}
