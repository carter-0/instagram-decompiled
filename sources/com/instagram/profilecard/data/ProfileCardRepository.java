package com.instagram.profilecard.data;

import X.05G;
import X.17h;
import X.17i;
import X.AnonymousClass43D;
import X.AnonymousClass4DH;
import X.C234502xy;
import X.C252733pa;
import X.C322306va;
import X.C322606w6;
import X.C61070Jw8;
import X.C64126LOx;
import X.DbS;
import X.DbT;
import X.JVM;
import android.app.Application;
import com.instagram.common.session.UserSession;
import com.instagram.music.profile.musiconprofile.MusicOnProfileProvider;
import com.instagram.user.model.User;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ProfileCardRepository extends C252733pa {
    public C234502xy A00;
    public final C64126LOx A01;
    public final UserSession A02;
    public final MusicOnProfileProvider A03;
    public final 17i A04;
    public final String A05;
    public final String A06;
    public final 05G A07;
    public final Application A08;
    public final AnonymousClass4DH A09;

    public ProfileCardRepository(Application application, AnonymousClass4DH r11, UserSession userSession, String str) {
        super("ProfileCard", AnonymousClass43D.A00(248870630));
        String str2;
        this.A02 = userSession;
        this.A08 = application;
        this.A09 = r11;
        this.A06 = str;
        this.A04 = 17h.A00(userSession);
        this.A03 = C322306va.A00(userSession);
        this.A01 = new C64126LOx(DbT.A05(application), r11, userSession);
        if (C322606w6.A02(userSession)) {
            str2 = "https://www.instagram.com/%s/profilecard?r=nametag";
        } else {
            str2 = "https://www.instagram.com/%s/?r=nametag";
        }
        this.A05 = str2;
        this.A07 = DbS.A10(new C61070Jw8((JVM) null, (C234502xy) null, (User) null, (String) null, (DefaultConstructorMarker) null, 15, 7));
    }

    /* JADX WARNING: type inference failed for: r11v1, types: [X.4D7, X.ME1] */
    /* JADX WARNING: type inference failed for: r3v17, types: [X.4DH] */
    /* JADX WARNING: type inference failed for: r11v5 */
    /* JADX WARNING: type inference failed for: r11v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01ce A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.AnonymousClass4D7 r22) {
        /*
            r21 = this;
            r3 = 13
            r4 = r22
            boolean r0 = X.ME1.A02(r3, r4)
            r6 = r21
            if (r0 == 0) goto L_0x01c7
            r11 = r4
            X.ME1 r11 = (X.ME1) r11
            int r2 = r11.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x01c7
            int r2 = r2 - r1
            r11.A00 = r2
        L_0x001a:
            java.lang.Object r3 = r11.A06
            X.1Hj r9 = X.1Hj.A02
            int r0 = r11.A00
            r12 = 2
            r4 = 1
            r14 = 0
            if (r0 == 0) goto L_0x009b
            if (r0 == r4) goto L_0x00dc
            if (r0 != r12) goto L_0x01d8
            java.lang.Object r2 = r11.A03
            X.0rm r2 = (X.0rm) r2
            java.lang.Object r1 = r11.A02
            X.0rm r1 = (X.0rm) r1
            java.lang.Object r0 = r11.A01
            com.instagram.profilecard.data.ProfileCardRepository r0 = (com.instagram.profilecard.data.ProfileCardRepository) r0
            X.0eS.A00(r3)
        L_0x0038:
            r2.A00 = r3
        L_0x003a:
            android.app.Application r12 = r0.A08
            com.instagram.common.session.UserSession r13 = r0.A02
            X.2xu r15 = new X.2xu
            r15.<init>(r12, r13)
            X.4DH r3 = r0.A09
            boolean r2 = r3 instanceof X.AnonymousClass4DU
            if (r2 == 0) goto L_0x004c
            r14 = r3
            X.4DU r14 = (X.AnonymousClass4DU) r14
        L_0x004c:
            r2 = 596(0x254, float:8.35E-43)
            java.lang.String r16 = X.C66579MXk.A00(r2)
            r8 = 0
            r17 = r4
            X.2xy r4 = X.C234472xv.A00(r12, r13, r14, r15, r16, r17)
            r0.A00 = r4
            java.lang.Object r3 = r1.A00
            X.JVM r3 = (X.JVM) r3
            if (r3 == 0) goto L_0x0079
            com.instagram.music.common.model.MusicAssetModel r2 = r3.A02
            X.JVX r2 = X.JVW.A01(r2)
            com.instagram.music.common.model.MusicDataSource r5 = r2.BUq()
            X.KUh r6 = new X.KUh
            r6.<init>()
            java.lang.String r7 = r3.A03
            r9 = -1
            r10 = r9
            r11 = r8
            r12 = r8
            r4.ETw(r5, r6, r7, r8, r9, r10, r11, r12)
        L_0x0079:
            X.05G r4 = r0.A07
        L_0x007b:
            java.lang.Object r3 = r4.getValue()
            r2 = r3
            X.Jw8 r2 = (X.C61070Jw8) r2
            java.lang.Object r7 = r1.A00
            X.2xy r8 = r0.A00
            if (r8 == 0) goto L_0x01ce
            java.lang.Object r6 = r2.A00
            java.lang.String r9 = r2.A03
            r10 = 7
            X.Jw8 r5 = new X.Jw8
            r5.<init>((java.lang.Object) r6, (java.lang.Object) r7, (java.lang.Object) r8, (java.lang.String) r9, (int) r10)
            boolean r2 = r4.AIY(r3, r5)
            if (r2 == 0) goto L_0x007b
            X.0gF r9 = X.C60340gF.A00
        L_0x009a:
            return r9
        L_0x009b:
            X.0eS.A00(r3)
            java.lang.String r1 = r6.A06
            if (r1 == 0) goto L_0x00d7
            X.17i r0 = r6.A04
            com.instagram.user.model.User r10 = r0.A02(r1)
        L_0x00a8:
            X.0rm r8 = X.C51965G9l.A11()
            X.0rm r1 = X.C51965G9l.A11()
            if (r10 == 0) goto L_0x01c4
            X.4DH r0 = r6.A09
            java.lang.Integer r5 = X.AnonymousClass05K.A0A
            X.ME1.A00(r6, r10, r8, r1, r11)
            r11.A05 = r10
            r11.A00 = r4
            com.instagram.common.session.UserSession r3 = r6.A02
            java.lang.String r2 = r10.getUsername()
            java.lang.String r0 = r0.getModuleName()
            X.1OC r2 = X.C49124Epn.A00(r3, r5, r2, r0)
            if (r2 == 0) goto L_0x00d9
            r0 = 248870630(0xed576e6, float:5.262305E-30)
            java.lang.Object r3 = r2.A00(r0, r11)
            if (r3 != r9) goto L_0x00da
            return r9
        L_0x00d7:
            r10 = r14
            goto L_0x00a8
        L_0x00d9:
            r3 = 0
        L_0x00da:
            r0 = r6
            goto L_0x00ef
        L_0x00dc:
            java.lang.Object r10 = r11.A05
            com.instagram.user.model.User r10 = (com.instagram.user.model.User) r10
            java.lang.Object r1 = r11.A04
            X.0rm r1 = (X.0rm) r1
            java.lang.Object r8 = r11.A03
            X.0rm r8 = (X.0rm) r8
            java.lang.Object r0 = r11.A01
            com.instagram.profilecard.data.ProfileCardRepository r0 = (com.instagram.profilecard.data.ProfileCardRepository) r0
            X.0eS.A00(r3)
        L_0x00ef:
            X.3Ii r3 = (X.C239803Ii) r3
            if (r3 == 0) goto L_0x0129
            boolean r2 = r3 instanceof X.C239793Ih
            if (r2 == 0) goto L_0x01bb
            X.3Ih r3 = (X.C239793Ih) r3
            java.lang.Object r2 = r3.A00
            X.DvK r2 = (X.DvK) r2
            java.lang.String r2 = r2.A00
            r8.A00 = r2
            X.05G r7 = r0.A07
        L_0x0103:
            java.lang.Object r6 = r7.getValue()
            r2 = r6
            X.Jw8 r2 = (X.C61070Jw8) r2
            java.lang.Object r5 = r8.A00
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r13 = r2.A00
            java.lang.Object r3 = r2.A01
            java.lang.Object r2 = r2.A02
            r20 = 7
            X.Jw8 r15 = new X.Jw8
            r16 = r13
            r17 = r3
            r18 = r2
            r19 = r5
            r15.<init>((java.lang.Object) r16, (java.lang.Object) r17, (java.lang.Object) r18, (java.lang.String) r19, (int) r20)
            boolean r2 = r7.AIY(r6, r15)
            if (r2 == 0) goto L_0x0103
        L_0x0129:
            X.4DH r2 = r0.A09
            android.content.Context r3 = r2.requireContext()
            X.0gy r2 = X.AnonymousClass07i.A00(r2)
            X.2lw r6 = new X.2lw
            r6.<init>(r3, r2, r14)
            r11.A01 = r0
            r11.A02 = r1
            r11.A03 = r1
            r11.A04 = r14
            r11.A05 = r14
            r11.A00 = r12
            boolean r2 = r10.A1U()
            if (r2 == 0) goto L_0x01b9
            boolean r2 = r10.CPV()
            if (r2 != 0) goto L_0x01b9
            com.instagram.common.session.UserSession r2 = r0.A02
            boolean r2 = X.AnonymousClass30D.A0A(r2)
            if (r2 == 0) goto L_0x01b9
            com.instagram.music.profile.musiconprofile.MusicOnProfileProvider r5 = r0.A03
            java.lang.String r3 = r10.getId()
            com.instagram.common.session.UserSession r2 = r5.A02
            boolean r20 = X.C51966G9m.A1W(r2, r3)
            X.0eM r10 = r5.A05
            boolean r2 = X.AnonymousClass7TF.A1Z(r10)
            if (r2 == 0) goto L_0x019e
            java.util.Map r2 = r5.A03
            java.lang.Number r2 = X.C51966G9m.A14(r3, r2)
            if (r2 == 0) goto L_0x0183
            long r7 = r2.longValue()
            long r12 = X.C51966G9m.A07(r7)
            r7 = 600000(0x927c0, double:2.964394E-318)
            int r2 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r2 <= 0) goto L_0x01a5
        L_0x0183:
            X.3Pl r17 = X.JTQ.A0m(r11)
            X.NM4 r15 = new X.NM4
            r16 = r5
            r18 = r3
            r19 = r4
            r15.<init>(r16, r17, r18, r19, r20)
            r5.A03(r15, r6, r3)
            java.lang.Object r3 = r17.A00()
        L_0x0199:
            if (r3 == r9) goto L_0x009a
            r2 = r1
            goto L_0x0038
        L_0x019e:
            if (r20 == 0) goto L_0x0183
            boolean r2 = r5.A00
            if (r2 != 0) goto L_0x01a5
            goto L_0x0183
        L_0x01a5:
            boolean r2 = X.AnonymousClass7TF.A1Z(r10)
            if (r2 == 0) goto L_0x01b2
            java.util.Map r2 = r5.A04
            java.lang.Object r3 = r2.get(r3)
            goto L_0x0199
        L_0x01b2:
            X.2Fj r2 = r5.A01
            java.lang.Object r3 = r2.A02()
            goto L_0x0199
        L_0x01b9:
            r3 = 0
            goto L_0x0199
        L_0x01bb:
            boolean r2 = r3 instanceof X.C297815sO
            if (r2 != 0) goto L_0x0129
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x01c4:
            r0 = r6
            goto L_0x003a
        L_0x01c7:
            X.ME1 r11 = new X.ME1
            r11.<init>(r6, r4, r3)
            goto L_0x001a
        L_0x01ce:
            java.lang.String r0 = "musicPlayer"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x01d8:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.profilecard.data.ProfileCardRepository.A00(X.4D7):java.lang.Object");
    }
}
