package com.instagram.direct.avatar.reactions.repository;

import X.02z;
import X.05G;
import X.0Tu;
import X.0nV;
import X.0qQ;
import X.0sn;
import X.106;
import X.10b;
import X.182;
import X.19B;
import X.1Eo;
import X.1L7;
import X.1LU;
import X.1Ng;
import X.1vm;
import X.1wn;
import X.25x;
import X.AnonymousClass0Ud;
import X.AnonymousClass12T;
import X.AnonymousClass1Nd;
import X.AnonymousClass27T;
import X.AnonymousClass27X;
import X.AnonymousClass27b;
import X.AnonymousClass43D;
import X.AnonymousClass4D7;
import X.AnonymousClass7T4;
import X.AnonymousClass7T5;
import X.AnonymousClass7T6;
import X.AnonymousClass7T7;
import X.C252733pa;
import X.C262094Cc;
import X.C262224Cq;
import X.C331877Su;
import X.C331887Sv;
import X.C58104ImQ;
import X.HA4;
import X.MMO;
import com.facebook.stash.core.FileStash;
import com.instagram.avatars.store.AvatarStore;
import com.instagram.common.session.UserSession;
import com.instagram.direct.avatar.reactions.api.AvatarReactionsApi;

public final class AvatarReactionsRepository extends C252733pa {
    public final FileStash A00;
    public final AvatarStore A01;
    public final 1wn A02;
    public final 1wn A03;
    public final 1wn A04;
    public final UserSession A05;
    public final C331887Sv A06;
    public final AvatarReactionsApi A07;
    public final C331877Su A08;
    public final AnonymousClass7T4 A09;
    public final C262094Cc A0A;
    public final 05G A0B;
    public final AnonymousClass0Ud A0C;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: X.JuF} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: X.JuF} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: X.JuF} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: X.JuF} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C60957JuF A02(java.lang.String r8) {
        /*
            r7 = this;
            r6 = 0
            X.0qQ.A0B(r8, r6)
            X.7Su r0 = r7.A08
            com.instagram.common.session.UserSession r3 = r0.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36322624321628458(0x810b3c0000292a, double:3.033912108241823E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r5 = 0
            if (r0 == 0) goto L_0x0050
            X.0Ud r0 = r7.A0C
            java.lang.Object r0 = r0.getValue()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r4 = r0.iterator()
        L_0x0022:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x004e
            java.lang.Object r3 = r4.next()
            r0 = r3
            X.JuF r0 = (X.C60957JuF) r0
            java.lang.String r0 = r0.A05
            int[] r2 = com.facebook.ui.emoji.model.Emoji.A02()
            int r0 = com.facebook.ui.emoji.model.Emoji.A00(r0, r2)
            int r0 = com.facebook.ui.emoji.model.Emoji.A01(r2, r0, r6)
            java.lang.String r1 = new java.lang.String
            r1.<init>(r2, r6, r0)
            X.0l2 r0 = com.facebook.ui.emoji.model.Emoji.A01
            r0.ECR(r2)
            boolean r0 = r1.equals(r8)
            if (r0 == 0) goto L_0x0022
            r5 = r3
        L_0x004e:
            X.JuF r5 = (X.C60957JuF) r5
        L_0x0050:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.avatar.reactions.repository.AvatarReactionsRepository.A02(java.lang.String):X.JuF");
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [X.MDh, X.4D7] */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.direct.avatar.reactions.repository.AvatarReactionsRepository r13, java.util.List r14, X.AnonymousClass4D7 r15) {
        /*
            r3 = 22
            r4 = r15
            boolean r0 = X.C66129MDh.A01(r3, r15)
            r9 = r13
            if (r0 == 0) goto L_0x0028
            r7 = r4
            X.MDh r7 = (X.C66129MDh) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0028
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x0018:
            java.lang.Object r1 = r7.A02
            X.1Hj r6 = X.1Hj.A02
            int r0 = r7.A00
            r5 = 1
            if (r0 == 0) goto L_0x003a
            if (r0 != r5) goto L_0x0032
            java.lang.Object r11 = r7.A01
            X.LMV r11 = (X.LMV) r11
            goto L_0x002e
        L_0x0028:
            X.MDh r7 = new X.MDh
            r7.<init>(r13, r15, r3)
            goto L_0x0018
        L_0x002e:
            X.0eS.A00(r1)     // Catch:{ Exception -> 0x0072 }
            goto L_0x0081
        L_0x0032:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x003a:
            X.0eS.A00(r1)
            X.7T4 r8 = r13.A09
            java.lang.Integer r4 = X.AnonymousClass05K.A01
            boolean r0 = r8.A00
            if (r0 != 0) goto L_0x0047
            r11 = 0
            goto L_0x005c
        L_0x0047:
            X.02m r3 = r8.A01
            r2 = 125763585(0x77f0001, float:1.9184069E-34)
            java.lang.String r1 = "assets_download"
            java.lang.String r0 = "_start"
            java.lang.String r0 = X.002.A0R(r1, r0)
            r3.markerPoint(r2, r0)
            X.LMV r11 = new X.LMV
            r11.<init>(r8, r4)
        L_0x005c:
            X.4Cc r0 = r13.A0A     // Catch:{ Exception -> 0x0072 }
            r12 = 0
            r13 = 18
            X.MHF r8 = new X.MHF     // Catch:{ Exception -> 0x0072 }
            r10 = r14
            r8.<init>(r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x0072 }
            r7.A01 = r11     // Catch:{ Exception -> 0x0072 }
            r7.A00 = r5     // Catch:{ Exception -> 0x0072 }
            java.lang.Object r0 = X.1Eo.A00(r7, r0, r8)     // Catch:{ Exception -> 0x0072 }
            if (r0 != r6) goto L_0x0081
            return r6
        L_0x0072:
            r2 = move-exception
            java.lang.String r1 = "AvatarReactionsRepository"
            java.lang.String r0 = "Failed to download avatar reactions assets"
            X.0KC.A0F(r1, r0, r2)
            if (r11 == 0) goto L_0x0081
            java.lang.String r0 = "fail"
            X.LMV.A00(r11, r0)
        L_0x0081:
            X.0gF r6 = X.C60340gF.A00
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.avatar.reactions.repository.AvatarReactionsRepository.A00(com.instagram.direct.avatar.reactions.repository.AvatarReactionsRepository, java.util.List, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [X.MDx, X.4D7] */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(com.instagram.direct.avatar.reactions.repository.AvatarReactionsRepository r10, X.AnonymousClass4D7 r11) {
        /*
            r3 = 9
            boolean r0 = X.C66145MDx.A02(r3, r11)
            if (r0 == 0) goto L_0x00d0
            r7 = r11
            X.MDx r7 = (X.C66145MDx) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00d0
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x0016:
            java.lang.Object r2 = r7.A03
            X.1Hj r6 = X.1Hj.A02
            int r0 = r7.A00
            r8 = 2
            r9 = 1
            if (r0 == 0) goto L_0x002a
            if (r0 == r9) goto L_0x0071
            if (r0 != r8) goto L_0x00d7
            java.lang.Object r1 = r7.A01
            X.0eS.A00(r2)
        L_0x0029:
            return r1
        L_0x002a:
            X.0eS.A00(r2)
            com.instagram.avatars.store.AvatarStore r0 = r10.A01
            X.27E r0 = r0.A01
            X.27H r1 = r0.A00
            X.5rf r0 = X.C297385rf.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            X.7T4 r5 = r10.A09
            if (r0 == 0) goto L_0x0045
            X.HA5 r0 = X.HA5.A00
            r5.A00(r0)
            X.0sn r0 = X.0sn.A00
            return r0
        L_0x0045:
            java.lang.Integer r4 = X.AnonymousClass05K.A00
            boolean r0 = r5.A00
            if (r0 != 0) goto L_0x005b
            r1 = 0
        L_0x004c:
            com.instagram.direct.avatar.reactions.api.AvatarReactionsApi r0 = r10.A07
            r7.A01 = r10
            r7.A02 = r1
            r7.A00 = r9
            java.lang.Object r2 = r0.A00(r7)
            if (r2 != r6) goto L_0x007c
            return r6
        L_0x005b:
            X.02m r3 = r5.A01
            r2 = 125763585(0x77f0001, float:1.9184069E-34)
            java.lang.String r1 = "artefacts_request"
            java.lang.String r0 = "_start"
            java.lang.String r0 = X.002.A0R(r1, r0)
            r3.markerPoint(r2, r0)
            X.LMV r1 = new X.LMV
            r1.<init>(r5, r4)
            goto L_0x004c
        L_0x0071:
            java.lang.Object r1 = r7.A02
            X.LMV r1 = (X.LMV) r1
            java.lang.Object r10 = r7.A01
            com.instagram.direct.avatar.reactions.repository.AvatarReactionsRepository r10 = (com.instagram.direct.avatar.reactions.repository.AvatarReactionsRepository) r10
            X.0eS.A00(r2)
        L_0x007c:
            X.3Ii r2 = (X.C239803Ii) r2
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00df
            if (r1 == 0) goto L_0x0089
            java.lang.String r0 = "success"
            X.LMV.A00(r1, r0)
        L_0x0089:
            X.3Ih r2 = (X.C239793Ih) r2
            java.lang.Object r1 = r2.A00
            java.util.List r1 = (java.util.List) r1
            X.7Su r5 = r10.A08
            java.util.List r0 = r5.A00()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00c2
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r1.iterator()
        L_0x00a4:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00c1
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.JuF r0 = (X.C60957JuF) r0
            java.util.List r1 = r5.A00()
            java.lang.String r0 = r0.A07
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x00a4
            r4.add(r2)
            goto L_0x00a4
        L_0x00c1:
            r1 = r4
        L_0x00c2:
            r7.A01 = r1
            r0 = 0
            r7.A02 = r0
            r7.A00 = r8
            java.lang.Object r0 = A00(r10, r1, r7)
            if (r0 != r6) goto L_0x0029
            return r6
        L_0x00d0:
            X.MDx r7 = new X.MDx
            r7.<init>(r10, r11, r3)
            goto L_0x0016
        L_0x00d7:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x00df:
            if (r1 == 0) goto L_0x00e6
            java.lang.String r0 = "fail"
            X.LMV.A00(r1, r0)
        L_0x00e6:
            X.0sn r1 = X.0sn.A00
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.avatar.reactions.repository.AvatarReactionsRepository.A01(com.instagram.direct.avatar.reactions.repository.AvatarReactionsRepository, X.4D7):java.lang.Object");
    }

    public final void A03() {
        if (182.A06(0Tu.A05, this.A08.A00, 36322624321628458L)) {
            AnonymousClass7T4 r2 = this.A09;
            r2.A00(HA4.A00);
            r2.A01.markerStart(125763585);
            r2.A00 = true;
            C262224Cq r3 = this.A01;
            1Eo.A05(19B.A00, new C58104ImQ(this, (AnonymousClass4D7) null, 33), r3);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AvatarReactionsRepository(UserSession userSession) {
        super("Direct", AnonymousClass43D.A01(972087568, 3));
        AvatarReactionsApi avatarReactionsApi = new AvatarReactionsApi(userSession, 1vm.A01(userSession));
        C331877Su r8 = new C331877Su(userSession);
        AvatarStore A002 = 25x.A00(userSession);
        1LU A052 = 1L7.A01().A05(1924902396);
        C331887Sv r5 = new C331887Sv(A052);
        0nV CO6 = AnonymousClass12T.A00.CO6(480314591, 3);
        0qQ.A0B(userSession, 0);
        1Ng A003 = AnonymousClass1Nd.A00(userSession);
        this.A05 = userSession;
        this.A07 = avatarReactionsApi;
        this.A08 = r8;
        this.A01 = A002;
        this.A00 = A052;
        this.A06 = r5;
        this.A0A = CO6;
        this.A09 = (AnonymousClass7T4) userSession.A01(AnonymousClass7T4.class, new MMO(userSession, 16));
        02z A012 = 106.A01(0sn.A00);
        this.A0B = A012;
        this.A0C = 10b.A03(A012);
        AnonymousClass7T5 r3 = new AnonymousClass7T5(this);
        this.A04 = r3;
        AnonymousClass7T6 r2 = new AnonymousClass7T6(this);
        this.A02 = r2;
        AnonymousClass7T7 r1 = new AnonymousClass7T7(this);
        this.A03 = r1;
        A003.A01(r3, AnonymousClass27T.class);
        A003.A01(r1, AnonymousClass27X.class);
        A003.A01(r2, AnonymousClass27b.class);
    }

    public final void onUserSessionWillEnd(boolean z) {
        close();
        this.A0B.Epw(0sn.A00);
    }
}
