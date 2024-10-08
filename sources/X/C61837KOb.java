package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.KOb  reason: case insensitive filesystem */
public final class C61837KOb extends LSR {
    public ArrayList A00 = AnonymousClass7TE.A1C();
    public boolean A01;
    public final C3499682q A02;
    public final KO3 A03;
    public final List A04 = AnonymousClass7TE.A1C();
    public final 05G A05;
    public final AnonymousClass0Ud A06;
    public final UserSession A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61837KOb(UserSession userSession, C3499682q r10, KO3 ko3) {
        super(ko3);
        DbZ.A0t(1, userSession, r10, ko3);
        this.A07 = userSession;
        this.A02 = r10;
        this.A03 = ko3;
        02z A10 = DbS.A10(new C61067Jw5((List) null, (List) null, (DefaultConstructorMarker) null, 15, 1, false, false));
        this.A05 = A10;
        this.A06 = A10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0073, code lost:
        if (r10 == null) goto L_0x0075;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0A(java.util.List r62) {
        /*
            r61 = this;
            r7 = 0
            r1 = r62
            boolean r0 = r1.isEmpty()
            r6 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0039
            int r0 = r1.size()
            r4 = r61
            if (r0 != r6) goto L_0x003a
            java.lang.Object r6 = r1.get(r7)
            com.instagram.tagging.activity.mediaTaggingInfo.MediaTaggingInfo r6 = (com.instagram.tagging.activity.mediaTaggingInfo.MediaTaggingInfo) r6
            X.JwD r5 = r4.A06()
            java.util.ArrayList r3 = r6.A0B
            java.util.ArrayList r0 = r6.A0E
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1D(r0)
            java.lang.String r1 = r6.A05
            com.instagram.pendingmedia.model.ClipInfo r0 = r6.A04
            if (r0 != 0) goto L_0x0032
            X.JwD r0 = r4.A06()
            com.instagram.pendingmedia.model.ClipInfo r0 = r0.A0G
        L_0x0032:
            X.JwD r0 = X.C61075JwD.A00((X.AnonymousClass9J6) null, (X.C61080JwI) null, (X.C61066Jw4) null, (X.C59721JVf) null, (X.C61046Jvk) null, (X.C61077JwF) null, (X.C61079JwH) null, (X.C61062Jw0) null, (X.C61100JxB) null, (com.instagram.api.schemas.MediaGenAIDetectionMethod) null, (X.C61000Juw) null, (X.Jv3) null, r5, (X.AnonymousClass3QO) null, (com.instagram.model.venue.Venue) null, (com.instagram.music.common.model.AudioOverlayTrack) null, r0, (X.C272024jy) null, (com.instagram.user.model.UpcomingEvent) null, (java.lang.String) null, r1, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, r3, r2, (java.util.List) null, (java.util.List) null, (java.util.List) null, (X.0eP) null, -33554489, 262143, false, false, false, false, false, false, false, false, false, false, false, false, false)
        L_0x0036:
            r4.A09(r0)
        L_0x0039:
            return
        L_0x003a:
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r9 = r1.iterator()
        L_0x0042:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00f7
            java.lang.Object r8 = r9.next()
            com.instagram.tagging.activity.mediaTaggingInfo.MediaTaggingInfo r8 = (com.instagram.tagging.activity.mediaTaggingInfo.MediaTaggingInfo) r8
            X.JwD r0 = r4.A06()
            java.util.List r0 = r0.A0S
            if (r0 == 0) goto L_0x0075
            java.util.Iterator r2 = r0.iterator()
        L_0x005a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00f4
            java.lang.Object r10 = r2.next()
            r0 = r10
            X.JwD r0 = (X.C61075JwD) r0
            java.lang.String r1 = r8.A06
            java.lang.String r0 = r0.A0N
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x005a
        L_0x0071:
            X.JwD r10 = (X.C61075JwD) r10
            if (r10 != 0) goto L_0x00db
        L_0x0075:
            java.lang.String r0 = r8.A06
            r11 = 0
            java.lang.String r31 = ""
            X.JwD r10 = new X.JwD
            r12 = r11
            r13 = r11
            r14 = r11
            r15 = r11
            r16 = r11
            r17 = r11
            r18 = r11
            r19 = r11
            r20 = r11
            r21 = r11
            r22 = r11
            r23 = r11
            r24 = r11
            r25 = r11
            r26 = r11
            r27 = r11
            r28 = r11
            r29 = r11
            r30 = r0
            r32 = r11
            r33 = r11
            r34 = r11
            r35 = r11
            r36 = r11
            r37 = r11
            r38 = r11
            r39 = r11
            r40 = r11
            r41 = r11
            r42 = r11
            r43 = r11
            r44 = r11
            r45 = r11
            r46 = r7
            r47 = r6
            r48 = r7
            r49 = r7
            r50 = r7
            r51 = r7
            r52 = r7
            r53 = r7
            r54 = r7
            r55 = r7
            r56 = r6
            r57 = r7
            r58 = r7
            r59 = r6
            r60 = r6
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60)
        L_0x00db:
            java.util.ArrayList r5 = r8.A0B
            java.util.ArrayList r0 = r8.A0E
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1D(r0)
            java.lang.String r1 = r8.A05
            com.instagram.pendingmedia.model.ClipInfo r0 = r8.A04
            if (r0 != 0) goto L_0x00eb
            com.instagram.pendingmedia.model.ClipInfo r0 = r10.A0G
        L_0x00eb:
            X.JwD r0 = X.C61075JwD.A00((X.AnonymousClass9J6) null, (X.C61080JwI) null, (X.C61066Jw4) null, (X.C59721JVf) null, (X.C61046Jvk) null, (X.C61077JwF) null, (X.C61079JwH) null, (X.C61062Jw0) null, (X.C61100JxB) null, (com.instagram.api.schemas.MediaGenAIDetectionMethod) null, (X.C61000Juw) null, (X.Jv3) null, r10, (X.AnonymousClass3QO) null, (com.instagram.model.venue.Venue) null, (com.instagram.music.common.model.AudioOverlayTrack) null, r0, (X.C272024jy) null, (com.instagram.user.model.UpcomingEvent) null, (java.lang.String) null, r1, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, r5, r2, (java.util.List) null, (java.util.List) null, (java.util.List) null, (X.0eP) null, -33554489, 262143, false, false, false, false, false, false, false, false, false, false, false, false, false)
            r3.add(r0)
            goto L_0x0042
        L_0x00f4:
            r10 = 0
            goto L_0x0071
        L_0x00f7:
            X.JwD r6 = r4.A06()
            r5 = 0
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r1 = r3.iterator()
        L_0x0104:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0118
            java.lang.Object r0 = r1.next()
            X.JwD r0 = (X.C61075JwD) r0
            java.util.List r0 = r0.A0V
            if (r0 == 0) goto L_0x0104
            r2.add(r0)
            goto L_0x0104
        L_0x0118:
            java.util.ArrayList r8 = X.0Yv.A1F(r2)
            java.lang.Object r0 = X.00k.A0K(r3)
            X.JwD r0 = (X.C61075JwD) r0
            java.lang.String r0 = r0.A0M
            r10 = -67108913(0xfffffffffbffffcf, float:-2.6584482E36)
            r7 = r0
            r9 = r3
            X.JwD r0 = X.C61075JwD.A00((X.AnonymousClass9J6) null, (X.C61080JwI) null, (X.C61066Jw4) null, r5, (X.C61046Jvk) null, (X.C61077JwF) null, (X.C61079JwH) null, (X.C61062Jw0) null, (X.C61100JxB) null, (com.instagram.api.schemas.MediaGenAIDetectionMethod) null, (X.C61000Juw) null, (X.Jv3) null, r6, (X.AnonymousClass3QO) null, (com.instagram.model.venue.Venue) null, (com.instagram.music.common.model.AudioOverlayTrack) null, (com.instagram.pendingmedia.model.ClipInfo) null, (X.C272024jy) null, (com.instagram.user.model.UpcomingEvent) null, (java.lang.String) null, r7, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, r8, (java.util.List) null, r9, (java.util.List) null, (X.0eP) null, r10, 262143, false, false, false, false, false, false, false, false, false, false, false, false, false)
            goto L_0x0036
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61837KOb.A0A(java.util.List):void");
    }
}
