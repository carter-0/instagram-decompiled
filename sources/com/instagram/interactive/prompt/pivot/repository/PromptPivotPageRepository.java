package com.instagram.interactive.prompt.pivot.repository;

import X.02z;
import X.05G;
import X.0qQ;
import X.AnonymousClass07i;
import X.AnonymousClass0Ud;
import X.AnonymousClass0iw;
import X.C51967G9n;
import X.C51970G9q;
import X.C51972G9s;
import X.C56449Hyh;
import X.DbS;
import X.H34;
import X.IMN;
import android.content.Context;
import com.instagram.api.schemas.MediaPromptPrefType;
import com.instagram.api.schemas.PromptFirstMediaType;
import com.instagram.common.session.UserSession;

public final class PromptPivotPageRepository {
    public final H34 A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final 05G A03;
    public final 05G A04;
    public final 05G A05;
    public final 05G A06;
    public final 05G A07;
    public final 05G A08;
    public final AnonymousClass0Ud A09;
    public final AnonymousClass0Ud A0A;
    public final AnonymousClass0Ud A0B;
    public final AnonymousClass0Ud A0C;
    public final AnonymousClass0Ud A0D;
    public final Context A0E;
    public final AnonymousClass07i A0F;
    public final C56449Hyh A0G;
    public final String A0H;
    public final AnonymousClass0Ud A0I;

    public PromptPivotPageRepository(Context context, AnonymousClass07i r11, AnonymousClass0iw r12, UserSession userSession, C56449Hyh hyh, String str, String str2) {
        C51972G9s.A1E(r11, hyh);
        String str3 = str2;
        this.A0H = str3;
        this.A0E = context;
        this.A02 = userSession;
        this.A01 = r12;
        this.A0F = r11;
        this.A0G = hyh;
        IMN imn = new IMN(this, str, str3);
        this.A00 = new H34(context, r11, imn, r12, userSession, 0);
        02z A10 = C51970G9q.A10(false);
        this.A05 = A10;
        this.A0B = A10;
        02z A102 = C51970G9q.A10(true);
        this.A07 = A102;
        this.A0I = A102;
        02z A0u = C51967G9n.A0u();
        this.A06 = A0u;
        0qQ.A0C(A0u, "null cannot be cast to non-null type kotlinx.coroutines.flow.StateFlow<com.instagram.clips.pivot.header.data.PivotPageDefaultHeaderModel?>");
        this.A0C = A0u;
        MediaPromptPrefType mediaPromptPrefType = MediaPromptPrefType.NOT_APPLICABLE;
        02z A103 = DbS.A10(mediaPromptPrefType);
        this.A03 = A103;
        this.A09 = A103;
        02z A104 = DbS.A10(mediaPromptPrefType);
        this.A08 = A104;
        this.A0D = A104;
        02z A105 = DbS.A10(PromptFirstMediaType.A04);
        this.A04 = A105;
        this.A0A = A105;
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.4D7, X.MDp] */
    /* JADX WARNING: type inference failed for: r5v6 */
    /* JADX WARNING: type inference failed for: r5v7 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.AnonymousClass4D7 r15) {
        /*
            r14 = this;
            r3 = 39
            boolean r0 = X.C66137MDp.A02(r3, r15)
            if (r0 == 0) goto L_0x00f1
            r5 = r15
            X.MDp r5 = (X.C66137MDp) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00f1
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r5.A02
            X.1Hj r6 = X.1Hj.A02
            int r1 = r5.A00
            r7 = 1
            r4 = 3
            if (r1 == 0) goto L_0x00ae
            if (r1 != r7) goto L_0x010d
            java.lang.Object r7 = r5.A01
            com.instagram.interactive.prompt.pivot.repository.PromptPivotPageRepository r7 = (com.instagram.interactive.prompt.pivot.repository.PromptPivotPageRepository) r7
            X.0eS.A00(r0)
        L_0x0029:
            boolean r1 = r0 instanceof X.C239793Ih
            r8 = 0
            if (r1 == 0) goto L_0x00f8
            X.0Ud r0 = r7.A09
            java.lang.Object r0 = r0.getValue()
            com.instagram.api.schemas.MediaPromptPrefType r0 = (com.instagram.api.schemas.MediaPromptPrefType) r0
            com.instagram.api.schemas.MediaPromptPrefType r2 = X.C358188aV.A00(r0)
            X.05G r1 = r7.A03
        L_0x003c:
            java.lang.Object r0 = r1.getValue()
            boolean r0 = r1.AIY(r0, r2)
            if (r0 == 0) goto L_0x003c
            X.0Ud r0 = r7.A0C
            java.lang.Object r1 = r0.getValue()
            X.GnB r1 = (X.C53381GnB) r1
            if (r1 == 0) goto L_0x0095
            X.PhZ r0 = new X.PhZ
            r0.<init>(r7, r4)
            X.0t0 r6 = X.AnonymousClass0eN.A01(r0)
            int r5 = r2.ordinal()
            r3 = 2
            if (r5 == r4) goto L_0x00a3
            if (r5 == r3) goto L_0x00a1
            java.lang.String r12 = r1.A08
        L_0x0064:
            if (r5 == r4) goto L_0x0096
            if (r5 == r3) goto L_0x006c
            java.lang.Object r8 = r1.A03
            com.instagram.common.typedurl.ImageUrl r8 = (com.instagram.common.typedurl.ImageUrl) r8
        L_0x006c:
            X.05G r4 = r7.A06
        L_0x006e:
            java.lang.Object r3 = r4.getValue()
            java.lang.String r11 = r1.A07
            java.lang.String r13 = r1.A06
            java.lang.Object r9 = r1.A02
            com.instagram.common.typedurl.ImageUrl r9 = (com.instagram.common.typedurl.ImageUrl) r9
            java.lang.Object r6 = r1.A04
            X.HsR r6 = (X.C56078HsR) r6
            java.lang.Object r7 = r1.A05
            X.HsR r7 = (X.C56078HsR) r7
            java.lang.Object r10 = r1.A01
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            r0 = 0
            X.AnonymousClass7TF.A1D(r11, r0, r9)
            X.GnB r5 = new X.GnB
            r5.<init>((X.C56078HsR) r6, (X.C56078HsR) r7, (com.instagram.common.typedurl.ImageUrl) r8, (com.instagram.common.typedurl.ImageUrl) r9, (java.lang.Boolean) r10, (java.lang.String) r11, (java.lang.String) r12, (java.lang.String) r13)
            boolean r0 = r4.AIY(r3, r5)
            if (r0 == 0) goto L_0x006e
        L_0x0095:
            return r2
        L_0x0096:
            java.lang.Object r0 = r6.getValue()
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            com.instagram.common.typedurl.ImageUrl r8 = r0.Bh3()
            goto L_0x006c
        L_0x00a1:
            r12 = r8
            goto L_0x006c
        L_0x00a3:
            java.lang.Object r0 = r6.getValue()
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            java.lang.String r12 = r0.getUsername()
            goto L_0x0064
        L_0x00ae:
            X.0eS.A00(r0)
            com.instagram.common.session.UserSession r3 = r14.A02
            java.lang.String r2 = r14.A0H
            X.0Ud r0 = r14.A09
            java.lang.Object r1 = r0.getValue()
            r5.A01 = r14
            r5.A00 = r7
            X.1NY r3 = X.AnonymousClass7TG.A0a(r3)
            java.lang.String r0 = "clips/prompt_stickers/update_author_attribution/"
            r3.A0A(r0)
            java.lang.String r0 = "prompt_sticker_id"
            r3.A9m(r0, r2)
            com.instagram.api.schemas.MediaPromptPrefType r0 = com.instagram.api.schemas.MediaPromptPrefType.ON
            if (r1 != r0) goto L_0x00eb
            java.lang.String r1 = "off"
        L_0x00d3:
            java.lang.String r0 = "value"
            r3.A9m(r0, r1)
            java.lang.Class<X.1XP> r1 = X.1XP.class
            java.lang.Class<X.1XY> r0 = X.1XY.class
            r2 = 0
            X.1OC r1 = X.DbU.A0S(r3, r1, r0)
            r0 = 1838122037(0x6d8f8435, float:5.552023E27)
            java.lang.Object r0 = r1.A02(r5, r0, r4, r2)
            if (r0 != r6) goto L_0x00ee
            return r6
        L_0x00eb:
            java.lang.String r1 = "on"
            goto L_0x00d3
        L_0x00ee:
            r7 = r14
            goto L_0x0029
        L_0x00f1:
            X.MDp r5 = new X.MDp
            r5.<init>(r14, r15, r3)
            goto L_0x0016
        L_0x00f8:
            boolean r0 = r0 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0108
            X.0iw r0 = r7.A01
            java.lang.String r1 = r0.getModuleName()
            java.lang.String r0 = "author attribution setting update failed"
            X.0wb.A03(r1, r0)
            return r8
        L_0x0108:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x010d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.interactive.prompt.pivot.repository.PromptPivotPageRepository.A00(X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.4D7, X.MDp] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.AnonymousClass4D7 r7) {
        /*
            r6 = this;
            r3 = 40
            boolean r0 = X.C66137MDp.A02(r3, r7)
            if (r0 == 0) goto L_0x007a
            r5 = r7
            X.MDp r5 = (X.C66137MDp) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x007a
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r5.A02
            X.1Hj r3 = X.1Hj.A02
            int r1 = r5.A00
            r4 = 1
            if (r1 == 0) goto L_0x0045
            if (r1 != r4) goto L_0x0096
            java.lang.Object r2 = r5.A01
            com.instagram.interactive.prompt.pivot.repository.PromptPivotPageRepository r2 = (com.instagram.interactive.prompt.pivot.repository.PromptPivotPageRepository) r2
            X.0eS.A00(r0)
        L_0x0028:
            boolean r1 = r0 instanceof X.C239793Ih
            if (r1 == 0) goto L_0x0080
            X.0Ud r0 = r2.A0D
            java.lang.Object r0 = r0.getValue()
            com.instagram.api.schemas.MediaPromptPrefType r0 = (com.instagram.api.schemas.MediaPromptPrefType) r0
            com.instagram.api.schemas.MediaPromptPrefType r3 = X.C358188aV.A00(r0)
            X.05G r1 = r2.A08
        L_0x003a:
            java.lang.Object r0 = r1.getValue()
            boolean r0 = r1.AIY(r0, r3)
            if (r0 == 0) goto L_0x003a
        L_0x0044:
            return r3
        L_0x0045:
            X.0eS.A00(r0)
            com.instagram.common.session.UserSession r2 = r6.A02
            X.0Ud r0 = r6.A0D
            java.lang.Object r1 = r0.getValue()
            r5.A01 = r6
            r5.A00 = r4
            X.1NY r2 = X.AnonymousClass7TG.A0a(r2)
            java.lang.String r0 = "clips/prompt_stickers/update_notification_settings/"
            r2.A0A(r0)
            com.instagram.api.schemas.MediaPromptPrefType r0 = com.instagram.api.schemas.MediaPromptPrefType.ON
            if (r1 != r0) goto L_0x0077
            java.lang.String r1 = "off"
        L_0x0063:
            java.lang.String r0 = "value"
            X.DbX.A1M(r2, r0, r1)
            X.1OC r1 = r2.A0M()
            r0 = 1115933683(0x4283cbf3, float:65.89834)
            java.lang.Object r0 = r1.A00(r0, r5)
            if (r0 == r3) goto L_0x0044
            r2 = r6
            goto L_0x0028
        L_0x0077:
            java.lang.String r1 = "on"
            goto L_0x0063
        L_0x007a:
            X.MDp r5 = new X.MDp
            r5.<init>(r6, r7, r3)
            goto L_0x0016
        L_0x0080:
            boolean r0 = r0 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0091
            r3 = 0
            X.0iw r0 = r2.A01
            java.lang.String r1 = r0.getModuleName()
            java.lang.String r0 = "notification setting update failed"
            X.0wb.A03(r1, r0)
            return r3
        L_0x0091:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0096:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.interactive.prompt.pivot.repository.PromptPivotPageRepository.A01(X.4D7):java.lang.Object");
    }
}
