package com.instagram.video.live.mvvm.model.repository;

import X.02z;
import X.05D;
import X.05G;
import X.0V1;
import X.0V2;
import X.0qQ;
import X.0sn;
import X.106;
import X.10D;
import X.10b;
import X.1vm;
import X.2IS;
import X.2Kw;
import X.AnonymousClass05K;
import X.AnonymousClass0Ud;
import X.AnonymousClass1EO;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.Br2;
import X.C262204Co;
import X.C262224Cq;
import X.C313816h4;
import X.C41845B3m;
import X.C41847B3o;
import X.C61001Jux;
import X.C61013JvD;
import X.C61770pa;
import X.C64398LbF;
import X.C68174N3p;
import X.DbS;
import X.JTQ;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.datasource.api.IgLiveLikesApi;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;

public final class IgLiveLikesRepository {
    public AnonymousClass1EO A00;
    public C68174N3p A01 = new C68174N3p();
    public String A02;
    public final UserSession A03;
    public final 05G A04;
    public final C61770pa A05;
    public final AnonymousClass0Ud A06;
    public final AnonymousClass0Ud A07;
    public final IgLiveLikesApi A08;
    public final IgLiveBroadcastInfoManager A09;
    public final C313816h4 A0A;
    public final 0V2 A0B;
    public final 05G A0C;

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDj, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.L7G r15, com.instagram.video.live.mvvm.model.repository.IgLiveLikesRepository r16, X.AnonymousClass4D7 r17) {
        /*
            r3 = 6
            r4 = r17
            boolean r0 = X.C66131MDj.A01(r3, r4)
            r6 = r16
            if (r0 == 0) goto L_0x002f
            r5 = r4
            X.MDj r5 = (X.C66131MDj) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002f
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0019:
            java.lang.Object r1 = r5.A03
            X.1Hj r4 = X.1Hj.A02
            int r0 = r5.A00
            r9 = 3
            r8 = 2
            r2 = 1
            if (r0 == 0) goto L_0x0035
            if (r0 == r2) goto L_0x0098
            if (r0 == r8) goto L_0x0098
            if (r0 == r9) goto L_0x0098
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x002f:
            X.MDj r5 = new X.MDj
            r5.<init>(r6, r4, r3)
            goto L_0x0019
        L_0x0035:
            X.0eS.A00(r1)
            com.instagram.common.session.UserSession r0 = r6.A03
            boolean r0 = X.C278264wZ.A01(r0)
            r7 = r15
            if (r0 == 0) goto L_0x0088
            X.L8X r1 = r15.A00
            if (r1 == 0) goto L_0x0074
            X.0V2 r3 = r6.A0B
            java.lang.String r14 = r1.A02
            java.lang.String r17 = ""
            if (r14 != 0) goto L_0x004f
            r14 = r17
        L_0x004f:
            java.lang.String r0 = r1.A00
            java.lang.String r15 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r1.A03
            com.instagram.common.typedurl.SimpleImageUrl r12 = X.DbS.A0V(r0)
            java.lang.String r0 = r1.A01
            if (r0 != 0) goto L_0x0061
            r0 = r17
        L_0x0061:
            r11 = 0
            X.KbX r10 = new X.KbX
            r13 = r11
            r16 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            X.C51966G9m.A1P(r6, r7, r5, r2)
        L_0x006d:
            java.lang.Object r0 = r3.emit(r10, r5)
            if (r0 != r4) goto L_0x009b
            return r4
        L_0x0074:
            java.lang.String r2 = r15.A02
            if (r2 == 0) goto L_0x009b
            X.0V2 r3 = r6.A0B
            r1 = 0
            r0 = 0
            X.KbW r10 = new X.KbW
            r10.<init>(r1, r2, r0)
            r5.A01 = r1
            r5.A02 = r1
            r5.A00 = r8
            goto L_0x006d
        L_0x0088:
            java.lang.String r2 = r15.A02
            if (r2 == 0) goto L_0x009b
            X.0V2 r3 = r6.A0B
            r1 = 0
            r0 = 0
            X.KbW r10 = new X.KbW
            r10.<init>(r1, r2, r0)
            r5.A00 = r9
            goto L_0x006d
        L_0x0098:
            X.0eS.A00(r1)
        L_0x009b:
            X.0gF r4 = X.C60340gF.A00
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveLikesRepository.A00(X.L7G, com.instagram.video.live.mvvm.model.repository.IgLiveLikesRepository, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDj, X.4D7] */
    /* JADX WARNING: type inference failed for: r12v0, types: [java.lang.Object, X.L7E] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.C62876Knq r18, X.AnonymousClass4D7 r19) {
        /*
            r17 = this;
            r6 = r18
            r3 = 7
            r4 = r19
            boolean r0 = X.C66131MDj.A01(r3, r4)
            r7 = r17
            if (r0 == 0) goto L_0x00b1
            r5 = r4
            X.MDj r5 = (X.C66131MDj) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00b1
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x001b:
            java.lang.Object r8 = r5.A03
            X.1Hj r4 = X.1Hj.A02
            int r0 = r5.A00
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L_0x002f
            if (r0 == r2) goto L_0x008a
            if (r0 != r3) goto L_0x00b8
            X.0eS.A00(r8)
        L_0x002c:
            X.0gF r4 = X.C60340gF.A00
        L_0x002e:
            return r4
        L_0x002f:
            X.0eS.A00(r8)
            X.0V2 r1 = r7.A0B
            com.instagram.common.session.UserSession r0 = r7.A03
            r8 = 0
            X.0qQ.A0B(r6, r2)
            com.instagram.user.model.User r9 = X.DbT.A0j(r0)
            X.L7E r12 = new X.L7E
            r12.<init>()
            r12.A00 = r2
            java.lang.String r0 = r9.getId()
            r12.A02 = r0
            com.instagram.common.typedurl.ImageUrl r0 = r9.Bh3()
            r12.A01 = r0
            boolean r0 = r6 instanceof X.C62174KbW
            if (r0 == 0) goto L_0x006c
            r0 = r6
            X.KbW r0 = (X.C62174KbW) r0
            java.lang.String r8 = r0.A02
            int r0 = r0.A00
            X.KbW r9 = new X.KbW
            r9.<init>(r12, r8, r0)
        L_0x0061:
            X.C51966G9m.A1P(r7, r6, r5, r2)
            java.lang.Object r0 = r1.emit(r9, r5)
            if (r0 == r4) goto L_0x002e
            r1 = r7
            goto L_0x0095
        L_0x006c:
            boolean r0 = r6 instanceof X.C62175KbX
            if (r0 == 0) goto L_0x00bd
            r0 = r6
            X.KbX r0 = (X.C62175KbX) r0
            java.lang.String r13 = r0.A06
            java.lang.String r14 = r0.A05
            com.instagram.common.typedurl.ImageUrl r11 = r0.A01
            java.lang.String r15 = r0.A03
            android.graphics.drawable.Drawable r10 = r0.A00
            java.lang.String r0 = r0.A04
            X.0qQ.A0B(r13, r8)
            X.KbX r9 = new X.KbX
            r16 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0061
        L_0x008a:
            java.lang.Object r6 = r5.A02
            X.Knq r6 = (X.C62876Knq) r6
            java.lang.Object r1 = r5.A01
            com.instagram.video.live.mvvm.model.repository.IgLiveLikesRepository r1 = (com.instagram.video.live.mvvm.model.repository.IgLiveLikesRepository) r1
            X.0eS.A00(r8)
        L_0x0095:
            com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager r0 = r1.A09
            X.JvD r0 = X.JTQ.A0Q(r0)
            if (r0 == 0) goto L_0x002c
            java.lang.String r2 = r0.A08
            if (r2 == 0) goto L_0x002c
            com.instagram.video.live.mvvm.model.datasource.api.IgLiveLikesApi r1 = r1.A08
            r0 = 0
            r5.A01 = r0
            r5.A02 = r0
            r5.A00 = r3
            java.lang.Object r0 = r1.A00(r6, r2, r5)
            if (r0 != r4) goto L_0x002c
            return r4
        L_0x00b1:
            X.MDj r5 = new X.MDj
            r5.<init>(r7, r4, r3)
            goto L_0x001b
        L_0x00b8:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00bd:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveLikesRepository.A01(X.Knq, X.4D7):java.lang.Object");
    }

    public final void A02(String str, C262224Cq r20) {
        C61013JvD A0Q;
        String str2 = str;
        if (str != null || ((A0Q = JTQ.A0Q(this.A09)) != null && (str2 = A0Q.A08) != null)) {
            if (!0qQ.A0K(this.A02, str2)) {
                AnonymousClass1EO r0 = this.A00;
                if (r0 != null) {
                    r0.cancel();
                }
                this.A00 = null;
            }
            if (this.A00 == null) {
                2IS A042 = C41845B3m.A04();
                this.A00 = 1vm.A01(this.A03).A01((2Kw) null, new C64398LbF(2, r20, this), new PandoGraphQLRequest(C41847B3o.A04(C41845B3m.A03(GraphQlCallInput.A02, str2, TraceFieldType.BroadcastId), A042, "input"), "LiveReactionSubscribe", A042.getParamsCopy(), C41845B3m.A04().getParamsCopy(), Br2.class, false, PandoRealtimeInfoJNI.forSubscription("xdt_live_reaction_subscribe"), 0, (String) null, "xdt_live_reaction_subscribe", AnonymousClass7TE.A1C()));
            }
            this.A02 = str2;
        }
    }

    public IgLiveLikesRepository(UserSession userSession, IgLiveLikesApi igLiveLikesApi, IgLiveBroadcastInfoManager igLiveBroadcastInfoManager, C313816h4 r8) {
        AnonymousClass7TG.A1Q(r8, igLiveBroadcastInfoManager);
        this.A03 = userSession;
        this.A0A = r8;
        this.A09 = igLiveBroadcastInfoManager;
        this.A08 = igLiveLikesApi;
        0sn r1 = 0sn.A00;
        02z A10 = DbS.A10(new C61001Jux(r1));
        this.A0C = A10;
        this.A07 = 10b.A03(A10);
        02z A012 = 106.A01(r1);
        this.A04 = A012;
        this.A06 = 10b.A03(A012);
        05D A013 = 10D.A01(AnonymousClass05K.A00, 0, 0);
        this.A0B = A013;
        this.A05 = new 0V1((C262204Co) null, A013);
    }
}
