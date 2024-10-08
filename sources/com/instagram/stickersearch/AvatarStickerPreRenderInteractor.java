package com.instagram.stickersearch;

import X.002;
import X.02m;
import X.0qQ;
import X.0xa;
import X.25x;
import X.C317846nw;
import X.C317866ny;
import X.C318056oJ;
import X.C318076oL;
import X.C369368uU;
import X.C63509KyK;
import android.app.Application;
import com.facebook.quicklog.MarkerEditor;
import com.instagram.avatars.graphql.AvatarStickerGraphQLRepository;
import com.instagram.avatars.graphql.UserAvatarInfoGraphQLRepository;
import com.instagram.avatars.store.AvatarStore;
import com.instagram.common.session.UserSession;
import com.instagram.stickersearch.api.ODRAvatarStickerRepository;
import java.util.concurrent.TimeUnit;

public final class AvatarStickerPreRenderInteractor {
    public final Application A00;
    public final AvatarStickerGraphQLRepository A01;
    public final UserAvatarInfoGraphQLRepository A02;
    public final AvatarStore A03;
    public final UserSession A04;
    public final C318056oJ A05;
    public final ODRAvatarStickerRepository A06;

    public /* synthetic */ AvatarStickerPreRenderInteractor(Application application, UserSession userSession, int i) {
        UserAvatarInfoGraphQLRepository userAvatarInfoGraphQLRepository;
        AvatarStickerGraphQLRepository avatarStickerGraphQLRepository;
        C318056oJ r4 = null;
        AvatarStore avatarStore = null;
        if ((i & 2) != 0) {
            userAvatarInfoGraphQLRepository = new UserAvatarInfoGraphQLRepository(userSession);
        } else {
            userAvatarInfoGraphQLRepository = null;
        }
        r4 = (i & 4) != 0 ? new C318056oJ(userSession) : r4;
        avatarStore = (i & 8) != 0 ? 25x.A00(userSession) : avatarStore;
        if ((i & 16) != 0) {
            avatarStickerGraphQLRepository = new AvatarStickerGraphQLRepository(userSession);
        } else {
            avatarStickerGraphQLRepository = null;
        }
        ODRAvatarStickerRepository oDRAvatarStickerRepository = null;
        application = (i & 32) != 0 ? null : application;
        if (!((i & 64) == 0 || !C318076oL.A00(userSession) || application == null)) {
            0qQ.A0B(userSession, 0);
            oDRAvatarStickerRepository = new ODRAvatarStickerRepository(C63509KyK.A00(application, userSession));
        }
        0qQ.A0B(userSession, 1);
        0qQ.A0B(userAvatarInfoGraphQLRepository, 2);
        0qQ.A0B(r4, 3);
        0qQ.A0B(avatarStore, 4);
        0qQ.A0B(avatarStickerGraphQLRepository, 5);
        this.A04 = userSession;
        this.A02 = userAvatarInfoGraphQLRepository;
        this.A05 = r4;
        this.A03 = avatarStore;
        this.A01 = avatarStickerGraphQLRepository;
        this.A00 = application;
        this.A06 = oDRAvatarStickerRepository;
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDr, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A05(X.AnonymousClass4D7 r8) {
        /*
            r7 = this;
            r3 = 7
            boolean r0 = X.C66139MDr.A01(r3, r8)
            if (r0 == 0) goto L_0x0060
            r5 = r8
            X.MDr r5 = (X.C66139MDr) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0060
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0015:
            java.lang.Object r1 = r5.A02
            X.1Hj r4 = X.1Hj.A02
            int r0 = r5.A00
            r6 = 2
            r3 = 1
            if (r0 == 0) goto L_0x0031
            if (r0 == r3) goto L_0x0029
            if (r0 != r6) goto L_0x0066
            X.0eS.A00(r1)
        L_0x0026:
            X.0gF r4 = X.C60340gF.A00
            return r4
        L_0x0029:
            java.lang.Object r0 = r5.A01
            com.instagram.stickersearch.AvatarStickerPreRenderInteractor r0 = (com.instagram.stickersearch.AvatarStickerPreRenderInteractor) r0
            X.0eS.A00(r1)
            goto L_0x004a
        L_0x0031:
            X.0eS.A00(r1)
            com.instagram.stickersearch.api.ODRAvatarStickerRepository r2 = r7.A06
            if (r2 == 0) goto L_0x0049
            com.instagram.api.schemas.StickerPack r0 = com.instagram.api.schemas.StickerPack.MUSIC_AVATAR_STICKERS_ICON
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "STORIES"
            r5.A01 = r7
            r5.A00 = r3
            java.lang.Object r0 = r2.A01(r1, r0, r5)
            if (r0 != r4) goto L_0x0049
            return r4
        L_0x0049:
            r0 = r7
        L_0x004a:
            com.instagram.stickersearch.api.ODRAvatarStickerRepository r3 = r0.A06
            if (r3 == 0) goto L_0x0026
            com.instagram.api.schemas.StickerPack r0 = com.instagram.api.schemas.StickerPack.MUSIC_AVATAR_STICKERS_ANIMATED_DEFAULT_STICKER
            java.lang.String r2 = r0.A00
            java.lang.String r1 = "STORIES"
            r0 = 0
            r5.A01 = r0
            r5.A00 = r6
            java.lang.Object r0 = r3.A01(r2, r1, r5)
            if (r0 != r4) goto L_0x0026
            return r4
        L_0x0060:
            X.MDr r5 = new X.MDr
            r5.<init>(r7, r8, r3)
            goto L_0x0015
        L_0x0066:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.stickersearch.AvatarStickerPreRenderInteractor.A05(X.4D7):java.lang.Object");
    }

    public final boolean A06(String str, String str2) {
        0qQ.A0B(str, 0);
        0xa r4 = this.A05.A01.A00;
        String string = r4.getString(002.A0R("KEY_AVATAR_VERSION", str), (String) null);
        if (string == null || string.length() == 0 || !0qQ.A0K(r4.getString(002.A0R("KEY_AVATAR_VERSION", str), (String) null), str2)) {
            return true;
        }
        return false;
    }

    private final void A00(C317846nw r16, C317866ny r17, Integer num, String str) {
        if (num != null) {
            String str2 = str;
            if (str != null) {
                int intValue = num.intValue();
                String A002 = C317846nw.A01.A00(r16, r17, this.A04, false);
                0qQ.A0B(A002, 2);
                02m r7 = 02m.A0p;
                0qQ.A0A(r7);
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                0qQ.A0B(r7, 0);
                r7.markerStartWithCancelPolicy(129906472, true, intValue, -1, timeUnit, str2);
                MarkerEditor withMarker = r7.withMarker(129906472, intValue);
                long currentTimeMillis = System.currentTimeMillis();
                withMarker.annotate("join_id", str2);
                withMarker.annotate("qpl_join__source_clock", "unreliable");
                withMarker.annotate("qpl_join__absolute_time_origin_ms", currentTimeMillis);
                withMarker.annotate("qpl_join__source_is_primary", false);
                withMarker.markerEditingCompleted();
                r7.markerAnnotate(129906472, intValue, "sticker_pack", A002);
                r7.markerAnnotate(129906472, intValue, "qpl_client_source", "client_android");
                02m r3 = 02m.A0p;
                0qQ.A0A(r3);
                0qQ.A0B(r3, 0);
                r3.markerPoint(129906472, intValue, 002.A0R("join_request_", "avatar_e2e_qpl_request_id"), -1, timeUnit);
            }
        }
    }

    private final void A01(C317846nw r6, C317866ny r7, Integer num, boolean z) {
        if (z) {
            this.A05.A00(true, C317846nw.A01.A00(r6, r7, this.A04, false));
        }
        if (num != null) {
            int intValue = num.intValue();
            C369368uU.A00(intValue);
            02m.A0p.markerEnd(129906472, intValue, 87);
        }
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.9PB, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: type inference failed for: r5v6 */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006c, code lost:
        if (X.0qQ.A0K(r1, r0.A00().get(r9)) == false) goto L_0x006e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(X.C317846nw r12, X.C317866ny r13, X.AnonymousClass4D7 r14, boolean r15) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof X.AnonymousClass9PB
            if (r0 == 0) goto L_0x011c
            r5 = r14
            X.9PB r5 = (X.AnonymousClass9PB) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x011c
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0012:
            java.lang.Object r1 = r5.A06
            X.1Hj r6 = X.1Hj.A02
            int r0 = r5.A00
            r4 = 0
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L_0x00aa
            if (r0 == r2) goto L_0x00d0
            if (r0 != r3) goto L_0x0123
            boolean r10 = r5.A05
            boolean r15 = r5.A04
            java.lang.Object r9 = r5.A02
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r8 = r5.A01
            com.instagram.stickersearch.AvatarStickerPreRenderInteractor r8 = (com.instagram.stickersearch.AvatarStickerPreRenderInteractor) r8
            X.0eS.A00(r1)
        L_0x0030:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00a0
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r1 = r1.A00
            X.3lr r1 = (X.C250663lr) r1
            r3 = 0
            if (r1 == 0) goto L_0x009d
            java.lang.String r0 = "avatar_revision_id"
            java.lang.String r4 = r1.getOptionalStringField(r3, r0)
            java.lang.String r0 = "config_hash"
            java.lang.String r5 = r1.getOptionalStringField(r2, r0)
            if (r10 != 0) goto L_0x006e
            java.lang.String r2 = "AvatarRefreshAPIVersionInfo(avatarRevision="
            java.lang.String r1 = ", configHash="
            r0 = 41
            java.lang.String r1 = X.002.A0v(r2, r4, r1, r5, r0)
            com.instagram.common.session.UserSession r0 = r8.A04
            X.26t r0 = X.26G.A00(r0)
            X.0qQ.A0B(r9, r3)
            java.util.HashMap r0 = r0.A00()
            java.lang.Object r0 = r0.get(r9)
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x009d
        L_0x006e:
            if (r15 == 0) goto L_0x0083
            com.instagram.common.session.UserSession r0 = r8.A04
            X.26t r3 = X.26G.A00(r0)
            java.lang.String r2 = "AvatarRefreshAPIVersionInfo(avatarRevision="
            java.lang.String r1 = ", configHash="
            r0 = 41
            java.lang.String r0 = X.002.A0v(r2, r4, r1, r5, r0)
            r3.A03(r9, r0)
        L_0x0083:
            X.7fq r0 = X.C337187fq.A00
        L_0x0085:
            X.3Ih r1 = new X.3Ih
            r1.<init>(r0)
        L_0x008a:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0093
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r6 = r1.A00
        L_0x0092:
            return r6
        L_0x0093:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0102
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x009d:
            X.7fo r0 = X.C337167fo.A00
            goto L_0x0085
        L_0x00a0:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x008a
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x00aa:
            X.0eS.A00(r1)
            com.instagram.common.session.UserSession r8 = r11.A04
            X.0Tu r7 = X.0Tu.A05
            r0 = 36319858362752697(0x8108b800011eb9, double:3.032162904711169E-306)
            boolean r0 = X.182.A06(r7, r8, r0)
            if (r0 != 0) goto L_0x012b
            com.instagram.avatars.store.AvatarStore r0 = r11.A03
            r5.A01 = r11
            r5.A02 = r12
            r5.A03 = r13
            r5.A04 = r15
            r5.A00 = r2
            java.lang.Object r1 = r0.A01(r5)
            if (r1 == r6) goto L_0x0092
            r8 = r11
            goto L_0x00e1
        L_0x00d0:
            boolean r15 = r5.A04
            java.lang.Object r13 = r5.A03
            X.6ny r13 = (X.C317866ny) r13
            java.lang.Object r12 = r5.A02
            X.6nw r12 = (X.C317846nw) r12
            java.lang.Object r8 = r5.A01
            com.instagram.stickersearch.AvatarStickerPreRenderInteractor r8 = (com.instagram.stickersearch.AvatarStickerPreRenderInteractor) r8
            X.0eS.A00(r1)
        L_0x00e1:
            X.5vi r0 = X.C299715vi.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x012b
            X.6nx r1 = X.C317846nw.A01
            com.instagram.common.session.UserSession r7 = r8.A04
            r0 = 0
            java.lang.String r9 = r1.A00(r12, r13, r7, r0)
            X.26t r0 = X.26G.A00(r7)
            java.util.HashMap r0 = r0.A00()
            boolean r10 = r0.isEmpty()
            if (r10 == 0) goto L_0x0105
            if (r15 != 0) goto L_0x0105
        L_0x0102:
            X.7fq r6 = X.C337187fq.A00
            return r6
        L_0x0105:
            com.instagram.avatars.graphql.UserAvatarInfoGraphQLRepository r1 = r8.A02
            java.lang.String r0 = r7.A06
            r5.A01 = r8
            r5.A02 = r9
            r5.A03 = r4
            r5.A04 = r15
            r5.A05 = r10
            r5.A00 = r3
            java.lang.Object r1 = r1.A00(r0, r5)
            if (r1 != r6) goto L_0x0030
            return r6
        L_0x011c:
            X.9PB r5 = new X.9PB
            r5.<init>(r11, r14)
            goto L_0x0012
        L_0x0123:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x012b:
            X.935 r6 = X.AnonymousClass935.A00
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.stickersearch.AvatarStickerPreRenderInteractor.A02(X.6nw, X.6ny, X.4D7, boolean):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r10v1, types: [X.8qC, X.4D7] */
    /* JADX WARNING: type inference failed for: r10v5 */
    /* JADX WARNING: type inference failed for: r10v6 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(X.C317846nw r18, X.C317866ny r19, X.AnonymousClass4D7 r20, boolean r21, boolean r22) {
        /*
            r17 = this;
            r5 = r19
            r3 = r18
            r7 = r20
            r4 = r21
            r6 = r22
            boolean r0 = r7 instanceof X.C367108qC
            r11 = r17
            if (r0 == 0) goto L_0x0162
            r10 = r7
            X.8qC r10 = (X.C367108qC) r10
            int r2 = r10.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0162
            int r2 = r2 - r1
            r10.A00 = r2
        L_0x001e:
            java.lang.Object r14 = r10.A08
            X.1Hj r9 = X.1Hj.A02
            int r0 = r10.A00
            r8 = 2
            r7 = 1
            r2 = 0
            if (r0 == 0) goto L_0x007a
            if (r0 == r7) goto L_0x005e
            if (r0 != r8) goto L_0x0175
            boolean r6 = r10.A07
            boolean r4 = r10.A06
            java.lang.Object r12 = r10.A04
            java.lang.Integer r12 = (java.lang.Integer) r12
            java.lang.Object r3 = r10.A03
            X.6nw r3 = (X.C317846nw) r3
            java.lang.Object r5 = r10.A02
            X.6ny r5 = (X.C317866ny) r5
            java.lang.Object r13 = r10.A01
            com.instagram.stickersearch.AvatarStickerPreRenderInteractor r13 = (com.instagram.stickersearch.AvatarStickerPreRenderInteractor) r13
            X.0eS.A00(r14)
        L_0x0044:
            X.3Ii r14 = (X.C239803Ii) r14
            boolean r0 = r14 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0169
            X.3Ih r14 = (X.C239793Ih) r14
            java.lang.Object r9 = r14.A00
            X.8rs r9 = (X.C367978rs) r9
            X.8sR r2 = r9.A01
            if (r2 != 0) goto L_0x017e
            java.lang.String r0 = "response"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x005e:
            boolean r6 = r10.A07
            boolean r4 = r10.A06
            java.lang.Object r1 = r10.A05
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r12 = r10.A04
            java.lang.Integer r12 = (java.lang.Integer) r12
            java.lang.Object r3 = r10.A03
            X.6nw r3 = (X.C317846nw) r3
            java.lang.Object r5 = r10.A02
            X.6ny r5 = (X.C317866ny) r5
            java.lang.Object r13 = r10.A01
            com.instagram.stickersearch.AvatarStickerPreRenderInteractor r13 = (com.instagram.stickersearch.AvatarStickerPreRenderInteractor) r13
            X.0eS.A00(r14)
            goto L_0x00ce
        L_0x007a:
            X.0eS.A00(r14)
            com.instagram.common.session.UserSession r13 = r11.A04
            X.0Tu r12 = X.0Tu.A05
            r0 = 36319858362752697(0x8108b800011eb9, double:3.032162904711169E-306)
            boolean r0 = X.182.A06(r12, r13, r0)
            if (r0 != 0) goto L_0x01f4
            r0 = 36319622139485734(0x81088100001e26, double:3.032013516165947E-306)
            boolean r0 = X.182.A06(r12, r13, r0)
            if (r0 == 0) goto L_0x00eb
            java.util.UUID r0 = X.AnonymousClass0HM.A00()
            int r0 = r0.hashCode()
            java.lang.Integer r12 = new java.lang.Integer
            r12.<init>(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "129906472"
            r1.append(r0)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
        L_0x00b5:
            com.instagram.avatars.store.AvatarStore r0 = r11.A03
            r10.A01 = r11
            r10.A02 = r5
            r10.A03 = r3
            r10.A04 = r12
            r10.A05 = r1
            r10.A06 = r4
            r10.A07 = r6
            r10.A00 = r7
            java.lang.Object r14 = r0.A01(r10)
            if (r14 == r9) goto L_0x017d
            r13 = r11
        L_0x00ce:
            X.5vi r0 = X.C299715vi.A00
            boolean r0 = X.0qQ.A0K(r14, r0)
            if (r0 == 0) goto L_0x01f4
            com.instagram.common.session.UserSession r0 = r13.A04
            boolean r0 = X.C318076oL.A00(r0)
            if (r0 == 0) goto L_0x00ee
            r0 = 0
            X.0qQ.A0B(r3, r0)
            X.6nw r0 = X.C317846nw.MUSIC_AVATAR_STICKERS_ANIMATED_DEFAULT_STICKER
            if (r3 == r0) goto L_0x01f4
            X.6nw r0 = X.C317846nw.MUSIC_AVATAR_STICKERS_ICON
            if (r3 != r0) goto L_0x00ee
            return r2
        L_0x00eb:
            r12 = r2
            r1 = r2
            goto L_0x00b5
        L_0x00ee:
            r13.A00(r3, r5, r12, r1)
            X.6oJ r0 = r13.A05
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r4)
            r10.A01 = r13
            r10.A02 = r5
            r10.A03 = r3
            r10.A04 = r12
            r10.A05 = r2
            r10.A06 = r4
            r10.A07 = r6
            r10.A00 = r8
            X.6oK r0 = r0.A02
            com.instagram.common.session.UserSession r15 = r0.A00
            r11 = 0
            X.0qQ.A0B(r5, r7)
            X.0qQ.A0B(r3, r8)
            r0 = -2
            X.1NY r14 = new X.1NY
            r14.<init>(r15, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            r14.A08(r0)
            java.lang.String r0 = "creatives/refresh_avatar_stickers/"
            r14.A0A(r0)
            X.6nx r0 = X.C317846nw.A01
            java.lang.String r15 = r0.A00(r3, r5, r15, r11)
            java.lang.String r0 = "sticker_pack_id"
            r14.A9m(r0, r15)
            java.lang.String r15 = r5.A00
            java.lang.String r0 = "surface"
            r14.A9m(r0, r15)
            java.lang.Class<X.8rs> r15 = X.C367978rs.class
            java.lang.Class<X.8rt> r0 = X.C367988rt.class
            r14.A0O(r2, r15, r0, r11)
            if (r1 == 0) goto L_0x0142
            java.lang.String r0 = "qpl_join_id"
            r14.A9m(r0, r1)
        L_0x0142:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r7)
            r0 = r16
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 == 0) goto L_0x0155
            java.lang.String r1 = "is_async"
            java.lang.String r0 = "false"
            r14.A9m(r1, r0)
        L_0x0155:
            X.1OC r2 = r14.A0M()
            r1 = -5
            r0 = 3
            java.lang.Object r14 = r2.A02(r10, r1, r0, r11)
            if (r14 != r9) goto L_0x0044
            return r9
        L_0x0162:
            X.8qC r10 = new X.8qC
            r10.<init>(r11, r7)
            goto L_0x001e
        L_0x0169:
            boolean r0 = r14 instanceof X.C297815sO
            if (r0 == 0) goto L_0x016f
            r2 = r14
            goto L_0x01e0
        L_0x016f:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0175:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x017d:
            return r9
        L_0x017e:
            X.6nx r0 = X.C317846nw.A01
            com.instagram.common.session.UserSession r14 = r13.A04
            r1 = 0
            java.lang.String r10 = r0.A00(r3, r5, r14, r1)
            if (r6 == 0) goto L_0x01b3
            X.8sQ r0 = r2.A00
            if (r0 == 0) goto L_0x01f5
            java.lang.String r11 = r0.A00
        L_0x018f:
            boolean r0 = r13.A06(r10, r11)
            if (r0 == 0) goto L_0x019a
            X.6oJ r0 = r13.A05
            r0.A00(r7, r10)
        L_0x019a:
            X.6oJ r0 = r13.A05
            X.0qQ.A0B(r10, r1)
            X.26t r0 = r0.A01
            X.0xa r0 = r0.A00
            X.0xY r1 = r0.AR4()
            java.lang.String r0 = "KEY_AVATAR_VERSION"
            java.lang.String r0 = X.002.A0R(r0, r10)
            r1.E5g(r0, r11)
            r1.apply()
        L_0x01b3:
            if (r4 == 0) goto L_0x01ca
            X.26t r11 = X.26G.A00(r14)
            java.lang.String r7 = r2.A01
            java.lang.String r4 = r2.A02
            java.lang.String r2 = "AvatarRefreshAPIVersionInfo(avatarRevision="
            java.lang.String r1 = ", configHash="
            r0 = 41
            java.lang.String r0 = X.002.A0v(r2, r7, r1, r4, r0)
            r11.A03(r10, r0)
        L_0x01ca:
            if (r12 == 0) goto L_0x01db
            int r2 = r12.intValue()
            X.C369368uU.A00(r2)
            X.02m r1 = X.02m.A0p
            r0 = 129906472(0x7be3728, float:2.862044E-34)
            r1.markerEnd(r0, r2, r8)
        L_0x01db:
            X.3Ih r2 = new X.3Ih
            r2.<init>(r9)
        L_0x01e0:
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x01f4
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 == 0) goto L_0x01f7
            X.5sO r2 = (X.C297815sO) r2
            java.lang.Object r0 = r2.A00
            r13.A01(r3, r5, r12, r6)
            X.5sO r2 = new X.5sO
            r2.<init>(r0)
        L_0x01f4:
            return r2
        L_0x01f5:
            r11 = 0
            goto L_0x018f
        L_0x01f7:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.stickersearch.AvatarStickerPreRenderInteractor.A03(X.6nw, X.6ny, X.4D7, boolean, boolean):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.8ry, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v15 */
    /* JADX WARNING: type inference failed for: r5v16 */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x010e, code lost:
        if (r13 != null) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0173, code lost:
        if (r6 != X.C317846nw.MUSIC_AVATAR_STICKERS_ICON) goto L_0x0176;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A04(X.C317846nw r30, X.C317866ny r31, X.AnonymousClass4D7 r32, boolean r33, boolean r34) {
        /*
            r29 = this;
            r7 = r32
            r3 = r31
            r6 = r30
            r8 = r33
            r4 = r34
            boolean r0 = r7 instanceof X.C368038ry
            r11 = r29
            if (r0 == 0) goto L_0x0243
            r5 = r7
            X.8ry r5 = (X.C368038ry) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0243
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x001e:
            java.lang.Object r1 = r5.A07
            X.1Hj r10 = X.1Hj.A02
            int r2 = r5.A00
            r16 = 2
            r9 = 1
            if (r2 == 0) goto L_0x011e
            if (r2 == r9) goto L_0x0146
            r0 = r16
            if (r2 != r0) goto L_0x0250
            boolean r4 = r5.A06
            boolean r8 = r5.A05
            java.lang.Object r7 = r5.A04
            java.lang.Integer r7 = (java.lang.Integer) r7
            java.lang.Object r6 = r5.A03
            X.6nw r6 = (X.C317846nw) r6
            java.lang.Object r3 = r5.A02
            X.6ny r3 = (X.C317866ny) r3
            java.lang.Object r2 = r5.A01
            com.instagram.stickersearch.AvatarStickerPreRenderInteractor r2 = (com.instagram.stickersearch.AvatarStickerPreRenderInteractor) r2
            X.0eS.A00(r1)
        L_0x0046:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0114
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r0 = r1.A00
            X.3JC r0 = (X.AnonymousClass3JC) r0
            java.lang.Object r13 = r0.A01
            X.3lr r13 = (X.C250663lr) r13
            X.6nx r0 = X.C317846nw.A01
            com.instagram.common.session.UserSession r14 = r2.A04
            r11 = 0
            r12 = 0
            java.lang.String r10 = r0.A00(r6, r3, r14, r12)
            if (r4 == 0) goto L_0x00a8
            if (r13 == 0) goto L_0x0111
            java.lang.Class<X.BqB> r5 = X.BqB.class
            java.lang.String r1 = "xig_refresh_avatar_stickers(input:$input)"
            r0 = -449779097(0xffffffffe530ea67, float:-5.221628E22)
            X.3lr r15 = r13.getOptionalTreeField(r12, r1, r5, r0)
            if (r15 == 0) goto L_0x0111
            java.lang.Class<X.BqA> r5 = X.BqA.class
            java.lang.String r1 = "avatar_version_info"
            r0 = 312360653(0x129e3ecd, float:9.986683E-28)
            X.3lr r1 = r15.getOptionalTreeField(r12, r1, r5, r0)
            if (r1 == 0) goto L_0x0111
            java.lang.String r0 = "avatar_version"
            java.lang.String r5 = r1.getOptionalStringField(r12, r0)
        L_0x0084:
            boolean r0 = r2.A06(r10, r5)
            if (r0 == 0) goto L_0x008f
            X.6oJ r0 = r2.A05
            r0.A00(r9, r10)
        L_0x008f:
            X.6oJ r0 = r2.A05
            X.0qQ.A0B(r10, r12)
            X.26t r0 = r0.A01
            X.0xa r0 = r0.A00
            X.0xY r1 = r0.AR4()
            java.lang.String r0 = "KEY_AVATAR_VERSION"
            java.lang.String r0 = X.002.A0R(r0, r10)
            r1.E5g(r0, r5)
            r1.apply()
        L_0x00a8:
            if (r8 == 0) goto L_0x00e5
            X.26t r9 = X.26G.A00(r14)
            if (r13 == 0) goto L_0x010d
            java.lang.Class<X.BqB> r5 = X.BqB.class
            java.lang.String r1 = "xig_refresh_avatar_stickers(input:$input)"
            r0 = -449779097(0xffffffffe530ea67, float:-5.221628E22)
            X.3lr r5 = r13.getOptionalTreeField(r12, r1, r5, r0)
            if (r5 == 0) goto L_0x010d
            r1 = 3
            java.lang.String r0 = "avatar_revision_id"
            java.lang.String r8 = r5.getOptionalStringField(r1, r0)
        L_0x00c4:
            java.lang.Class<X.BqB> r5 = X.BqB.class
            java.lang.String r1 = "xig_refresh_avatar_stickers(input:$input)"
            r0 = -449779097(0xffffffffe530ea67, float:-5.221628E22)
            X.3lr r5 = r13.getOptionalTreeField(r12, r1, r5, r0)
            if (r5 == 0) goto L_0x00d8
            r1 = 4
            java.lang.String r0 = "config_hash"
            java.lang.String r11 = r5.getOptionalStringField(r1, r0)
        L_0x00d8:
            java.lang.String r5 = "AvatarRefreshAPIVersionInfo(avatarRevision="
            java.lang.String r1 = ", configHash="
            r0 = 41
            java.lang.String r0 = X.002.A0v(r5, r8, r1, r11, r0)
            r9.A03(r10, r0)
        L_0x00e5:
            if (r7 == 0) goto L_0x00f8
            int r8 = r7.intValue()
            X.C369368uU.A00(r8)
            X.02m r5 = X.02m.A0p
            r1 = 129906472(0x7be3728, float:2.862044E-34)
            r0 = r16
            r5.markerEnd(r1, r8, r0)
        L_0x00f8:
            X.0gF r0 = X.C60340gF.A00
            X.3Ih r1 = new X.3Ih
            r1.<init>(r0)
        L_0x00ff:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x010a
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x024a
            r2.A01(r6, r3, r7, r4)
        L_0x010a:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x010d:
            r8 = r11
            if (r13 == 0) goto L_0x00d8
            goto L_0x00c4
        L_0x0111:
            r5 = r11
            goto L_0x0084
        L_0x0114:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x00ff
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x011e:
            X.0eS.A00(r1)
            com.instagram.common.session.UserSession r7 = r11.A04
            X.0Tu r2 = X.0Tu.A05
            r0 = 36319858362752697(0x8108b800011eb9, double:3.032162904711169E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 != 0) goto L_0x010a
            com.instagram.avatars.store.AvatarStore r0 = r11.A03
            r5.A01 = r11
            r5.A02 = r3
            r5.A03 = r6
            r5.A05 = r8
            r5.A06 = r4
            r5.A00 = r9
            java.lang.Object r1 = r0.A01(r5)
            if (r1 == r10) goto L_0x0258
            r2 = r11
            goto L_0x0159
        L_0x0146:
            boolean r4 = r5.A06
            boolean r8 = r5.A05
            java.lang.Object r6 = r5.A03
            X.6nw r6 = (X.C317846nw) r6
            java.lang.Object r3 = r5.A02
            X.6ny r3 = (X.C317866ny) r3
            java.lang.Object r2 = r5.A01
            com.instagram.stickersearch.AvatarStickerPreRenderInteractor r2 = (com.instagram.stickersearch.AvatarStickerPreRenderInteractor) r2
            X.0eS.A00(r1)
        L_0x0159:
            X.5vi r0 = X.C299715vi.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x010a
            com.instagram.common.session.UserSession r12 = r2.A04
            boolean r0 = X.C318076oL.A00(r12)
            if (r0 == 0) goto L_0x0176
            r0 = 0
            X.0qQ.A0B(r6, r0)
            X.6nw r0 = X.C317846nw.MUSIC_AVATAR_STICKERS_ANIMATED_DEFAULT_STICKER
            if (r6 == r0) goto L_0x010a
            X.6nw r0 = X.C317846nw.MUSIC_AVATAR_STICKERS_ICON
            if (r6 != r0) goto L_0x0176
            goto L_0x010a
        L_0x0176:
            X.0Tu r11 = X.0Tu.A05
            r0 = 36319622139485734(0x81088100001e26, double:3.032013516165947E-306)
            boolean r0 = X.182.A06(r11, r12, r0)
            r24 = 0
            if (r0 == 0) goto L_0x023e
            java.util.UUID r0 = X.AnonymousClass0HM.A00()
            int r0 = r0.hashCode()
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "129906472"
            r1.append(r0)
            r1.append(r7)
            java.lang.String r13 = r1.toString()
        L_0x01a3:
            r0 = 36327460454808011(0x810fa2000039cb, double:3.0369704983381174E-306)
            boolean r0 = X.182.A06(r11, r12, r0)
            if (r0 == 0) goto L_0x010a
            r2.A00(r6, r3, r7, r13)
            com.instagram.avatars.graphql.AvatarStickerGraphQLRepository r1 = r2.A01
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r8)
            r5.A01 = r2
            r5.A02 = r3
            r5.A03 = r6
            r5.A04 = r7
            r5.A05 = r8
            r5.A06 = r4
            r0 = r16
            r5.A00 = r0
            com.instagram.stickersearch.api.AvatarStickerGraphQLApi r0 = r1.A03
            X.0K0 r12 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.String r11 = r3.A00
            java.lang.String r1 = "surface"
            X.0Df r12 = r12.A02()
            X.0Df.A00(r12, r11, r1)
            X.6nx r11 = X.C317846nw.A01
            com.instagram.common.session.UserSession r1 = r0.A00
            r15 = 0
            java.lang.String r11 = r11.A00(r6, r3, r1, r15)
            java.lang.String r1 = "sticker_pack_id"
            X.0Df.A00(r12, r11, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r15)
            boolean r1 = X.0qQ.A0K(r14, r1)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r1)
            java.lang.String r1 = "is_async"
            X.0Df.A00(r12, r11, r1)
            java.lang.String r1 = "qpl_join_id"
            X.0Df.A00(r12, r13, r1)
            X.2IS r11 = new X.2IS
            r11.<init>()
            X.2IS r14 = new X.2IS
            r14.<init>()
            java.lang.String r13 = "input"
            X.2IV r1 = r11.A00
            X.0Df r1 = r1.A02()
            r1.A0E(r12, r13)
            X.2IY r1 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1vR r18 = X.AnonymousClass1vS.A00()
            java.util.Map r20 = r11.getParamsCopy()
            java.util.Map r21 = r14.getParamsCopy()
            java.lang.Class<X.8sg> r22 = X.C368478sg.class
            java.util.ArrayList r28 = new java.util.ArrayList
            r28.<init>()
            java.lang.String r19 = "IGRefreshAvatarStickersDataMutation"
            java.lang.String r27 = "xig_refresh_avatar_stickers"
            com.facebook.pando.PandoGraphQLRequest r1 = new com.facebook.pando.PandoGraphQLRequest
            r23 = r9
            r25 = r15
            r26 = r24
            r17 = r1
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            X.1vn r0 = r0.A01
            java.lang.Object r1 = r0.A04(r1, r5)
            if (r1 != r10) goto L_0x0046
            return r10
        L_0x023e:
            r7 = r24
            r13 = r7
            goto L_0x01a3
        L_0x0243:
            X.8ry r5 = new X.8ry
            r5.<init>(r11, r7)
            goto L_0x001e
        L_0x024a:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0250:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0258:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.stickersearch.AvatarStickerPreRenderInteractor.A04(X.6nw, X.6ny, X.4D7, boolean, boolean):java.lang.Object");
    }
}
