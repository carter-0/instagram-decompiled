package com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository;

import X.002;
import X.00k;
import X.0Tu;
import X.0kD;
import X.0qQ;
import X.182;
import X.19B;
import X.1Av;
import X.1Eo;
import X.1Hj;
import X.2Fk;
import X.2Nn;
import X.AnonymousClass05K;
import X.AnonymousClass12T;
import X.AnonymousClass2BF;
import X.AnonymousClass2Fj;
import X.AnonymousClass3Q2;
import X.AnonymousClass3QO;
import X.AnonymousClass43D;
import X.AnonymousClass4D7;
import X.AnonymousClass51M;
import X.AnonymousClass55Q;
import X.AnonymousClass8Y4;
import X.AnonymousClass9P8;
import X.B1S;
import X.C252733pa;
import X.C262224Cq;
import X.C2801950r;
import X.C293505kq;
import X.C361268fw;
import X.C361278fx;
import X.C361308g1;
import X.C361318g2;
import X.C361328g3;
import X.C361338g4;
import X.C361348g5;
import X.C376909Ju;
import X.C39908AIz;
import X.C59764JXc;
import X.C59765JXe;
import X.C59774JXr;
import X.C59775JXt;
import X.C60340gF;
import X.C63174Ksh;
import X.JXu;
import android.content.Context;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.clips.drafts.model.datasource.ClipsDraftLocalDataSource;
import com.instagram.clips.drafts.model.datasource.ClipsDraftLocalDataSource$getTempCoverImage$2$1;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.pendingmedia.store.PendingMediaStore;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public final class ClipsDraftRepository extends C252733pa {
    public C361278fx A00 = C361268fw.A00;
    public C293505kq A01;
    public final AnonymousClass2Fj A02 = new 2Fk(C361338g4.A00);
    public final ClipsDraftLocalDataSource A03;
    public final UserSession A04;
    public final C361348g5 A05 = new C361348g5();
    public final PendingMediaStore A06;
    public final 2Nn A07;
    public final 1Av A08;
    public final Context A09;
    public final C361308g1 A0A;
    public final C361328g3 A0B;
    public final C361318g2 A0C;
    public final boolean A0D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClipsDraftRepository(Context context, C361308g1 r7, ClipsDraftLocalDataSource clipsDraftLocalDataSource, UserSession userSession, C361328g3 r10, C361318g2 r11, PendingMediaStore pendingMediaStore, 2Nn r13, 1Av r14, boolean z) {
        super("Reels", AnonymousClass43D.A01(513339792, 3));
        0qQ.A0B(r13, 3);
        0qQ.A0B(pendingMediaStore, 4);
        0qQ.A0B(clipsDraftLocalDataSource, 5);
        0qQ.A0B(r7, 6);
        0qQ.A0B(r14, 10);
        this.A09 = context;
        this.A04 = userSession;
        this.A07 = r13;
        this.A06 = pendingMediaStore;
        this.A03 = clipsDraftLocalDataSource;
        this.A0A = r7;
        this.A0C = r11;
        this.A0B = r10;
        this.A0D = z;
        this.A08 = r14;
        C262224Cq r3 = this.A01;
        C376909Ju r2 = new C376909Ju(this, (AnonymousClass4D7) null, 4);
        1Eo.A03(AnonymousClass05K.A00, 19B.A00, r2, r3);
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.9Jh, X.4D7] */
    /* JADX WARNING: type inference failed for: r7v2, types: [X.0r1, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0A(X.B2W r9, X.C293505kq r10, X.AnonymousClass4D7 r11) {
        /*
            r8 = this;
            r4 = 0
            r6 = 1
            boolean r0 = r11 instanceof X.C376779Jh
            if (r0 == 0) goto L_0x00a3
            r3 = r11
            X.9Jh r3 = (X.C376779Jh) r3
            int r0 = r3.A08
            if (r0 != r6) goto L_0x00a3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00a3
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0018:
            java.lang.Object r0 = r3.A05
            X.1Hj r2 = X.1Hj.A02
            int r1 = r3.A00
            r5 = 2
            if (r1 == 0) goto L_0x002b
            if (r1 == r6) goto L_0x0053
            if (r1 != r5) goto L_0x00aa
            X.0eS.A00(r0)
        L_0x0028:
            X.0gF r2 = X.C60340gF.A00
        L_0x002a:
            return r2
        L_0x002b:
            X.0eS.A00(r0)
            X.0r1 r7 = new X.0r1
            r7.<init>()
            r7.A00 = r6
            boolean r0 = r8.A0D
            if (r0 == 0) goto L_0x0051
            com.instagram.clips.drafts.model.datasource.ClipsDraftLocalDataSource r1 = r8.A03
            java.lang.String r0 = r10.A0T
            r3.A01 = r8
            r3.A02 = r10
            r3.A03 = r9
            r3.A04 = r7
            r3.A07 = r4
            r3.A00 = r6
            java.lang.Object r0 = r1.A07(r0, r3)
            if (r0 == r2) goto L_0x002a
            r6 = r8
            goto L_0x0068
        L_0x0051:
            r6 = r8
            goto L_0x0072
        L_0x0053:
            boolean r4 = r3.A07
            java.lang.Object r7 = r3.A04
            X.0r1 r7 = (X.0r1) r7
            java.lang.Object r9 = r3.A03
            X.B2W r9 = (X.B2W) r9
            java.lang.Object r10 = r3.A02
            X.5kq r10 = (X.C293505kq) r10
            java.lang.Object r6 = r3.A01
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r6 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository) r6
            X.0eS.A00(r0)
        L_0x0068:
            X.5kq r0 = (X.C293505kq) r0
            if (r0 == 0) goto L_0x0072
            boolean r0 = r6.A08(r0, r10)
            r7.A00 = r0
        L_0x0072:
            boolean r0 = r7.A00
            if (r0 == 0) goto L_0x0028
            X.8g1 r1 = r6.A0A
            r0 = 0
            X.0qQ.A0B(r10, r0)
            java.util.Map r1 = r1.A01
            java.lang.String r0 = r10.A0T
            r1.put(r0, r10)
            X.JXu r1 = r10.A0G
            X.JXu r0 = X.JXu.A02
            if (r1 != r0) goto L_0x0028
            X.50r r1 = r10.A0H
            X.50r r0 = X.C2801950r.FEED_POST
            if (r1 == r0) goto L_0x0028
            com.instagram.clips.drafts.model.datasource.ClipsDraftLocalDataSource r1 = r6.A03
            r0 = 0
            r3.A01 = r0
            r3.A02 = r0
            r3.A03 = r0
            r3.A04 = r0
            r3.A00 = r5
            java.lang.Object r0 = r1.A01(r9, r10, r3, r4)
            if (r0 != r2) goto L_0x0028
            return r2
        L_0x00a3:
            X.9Jh r3 = new X.9Jh
            r3.<init>(r8, r11)
            goto L_0x0018
        L_0x00aa:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository.A0A(X.B2W, X.5kq, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [X.Avm, X.4D7] */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0077 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0F(X.B1S r12, X.B24 r13, X.AnonymousClass4D7 r14, X.0sP r15, boolean r16, boolean r17) {
        /*
            r11 = this;
            r5 = r13
            r8 = r15
            r9 = r16
            r10 = r17
            r4 = 1
            boolean r0 = r14 instanceof X.C41544Avm
            if (r0 == 0) goto L_0x0078
            r7 = r14
            X.Avm r7 = (X.C41544Avm) r7
            int r0 = r7.A08
            if (r0 != r4) goto L_0x0078
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0078
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x001d:
            java.lang.Object r3 = r7.A04
            X.1Hj r2 = X.1Hj.A02
            int r0 = r7.A00
            r1 = 2
            if (r0 == 0) goto L_0x0050
            if (r0 == r4) goto L_0x003c
            if (r0 != r1) goto L_0x007e
            boolean r10 = r7.A06
            java.lang.Object r6 = r7.A01
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r6 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository) r6
            X.0eS.A00(r3)
        L_0x0033:
            if (r10 == 0) goto L_0x0039
            X.8fw r0 = X.C361268fw.A00
            r6.A00 = r0
        L_0x0039:
            X.0gF r2 = X.C60340gF.A00
        L_0x003b:
            return r2
        L_0x003c:
            boolean r10 = r7.A07
            boolean r9 = r7.A06
            java.lang.Object r8 = r7.A03
            X.0sP r8 = (X.0sP) r8
            java.lang.Object r5 = r7.A02
            X.B24 r5 = (X.B24) r5
            java.lang.Object r6 = r7.A01
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r6 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository) r6
            X.0eS.A00(r3)
            goto L_0x0066
        L_0x0050:
            X.0eS.A00(r3)
            r7.A01 = r11
            r7.A02 = r13
            r7.A03 = r15
            r7.A06 = r9
            r7.A07 = r10
            r7.A00 = r4
            java.lang.Object r0 = r11.A0G(r12, r7, r10)
            if (r0 == r2) goto L_0x003b
            r6 = r11
        L_0x0066:
            r7.A01 = r6
            r0 = 0
            r7.A02 = r0
            r7.A03 = r0
            r7.A06 = r10
            r7.A00 = r1
            java.lang.Object r0 = A03(r5, r6, r7, r8, r9, r10)
            if (r0 != r2) goto L_0x0033
            return r2
        L_0x0078:
            X.Avm r7 = new X.Avm
            r7.<init>(r11, r14)
            goto L_0x001d
        L_0x007e:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository.A0F(X.B1S, X.B24, X.4D7, X.0sP, boolean, boolean):java.lang.Object");
    }

    public final String A0I(AnonymousClass9P8 r9, C2801950r r10, AnonymousClass3QO r11, AudioOverlayTrack audioOverlayTrack, PendingRecipient pendingRecipient, List list) {
        List list2;
        boolean z;
        0qQ.A0B(r10, 0);
        C59765JXe jXe = new C59765JXe();
        jXe.A05(JXu.A02);
        jXe.A06(new ArrayList());
        jXe.A02 = new C59764JXc(audioOverlayTrack);
        if (list == null) {
            list = new ArrayList();
        }
        jXe.A0b = new C59764JXc(list);
        jXe.A0j = new C59764JXc(r9);
        if (pendingRecipient != null) {
            list2 = Collections.singletonList(pendingRecipient);
            0qQ.A07(list2);
        } else {
            list2 = null;
        }
        jXe.A0o = new C59764JXc(list2);
        jXe.A00 = new C59764JXc(r11);
        AnonymousClass2BF.A00();
        UserSession userSession = this.A04;
        new C59774JXr(userSession);
        C59775JXt jXt = new C59775JXt(userSession);
        if (!AnonymousClass2BF.A00().A03().A02(userSession)) {
            z = false;
        } else if (!182.A06(0Tu.A05, userSession, 36330638730609361L)) {
            z = true;
        } else {
            z = jXt.A00.getBoolean("media_level_settings_on", true);
        }
        jXe.A0R = new C59764JXc(Boolean.valueOf(z));
        C293505kq A022 = jXe.A02(r10, UUID.randomUUID().toString());
        this.A01 = null;
        this.A02.A0B(new AnonymousClass8Y4(A022));
        if (this.A01 == null) {
            this.A01 = A022;
        }
        return A022.A0T;
    }

    public final void A0N(C293505kq r3) {
        0qQ.A0B(r3, 0);
        C293505kq A092 = A09();
        if (A092 != null) {
            A08(A092, r3);
        }
        this.A02.A0B(new AnonymousClass8Y4(r3));
        if (this.A01 == null) {
            this.A01 = r3;
        }
    }

    public final void A0O(C293505kq r3) {
        0qQ.A0B(r3, 0);
        C293505kq A092 = A09();
        if (A092 != null) {
            A08(A092, r3);
        }
        this.A02.A0A(new AnonymousClass8Y4(r3));
        if (this.A01 == null) {
            this.A01 = r3;
        }
    }

    public final void A0P(C2801950r r8, AnonymousClass3QO r9) {
        A0I((AnonymousClass9P8) null, r8, r9, (AudioOverlayTrack) null, (PendingRecipient) null, (List) null);
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.9Ja, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v1, types: [X.0r1, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C293505kq r6, com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r7, X.AnonymousClass4D7 r8) {
        /*
            r3 = 20
            boolean r0 = X.C376709Ja.A00(r3, r8)
            if (r0 == 0) goto L_0x0071
            r5 = r8
            X.9Ja r5 = (X.C376709Ja) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0071
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r5.A03
            X.1Hj r4 = X.1Hj.A02
            int r0 = r5.A00
            r2 = 1
            if (r0 == 0) goto L_0x0052
            if (r0 != r2) goto L_0x0077
            java.lang.Object r3 = r5.A02
            X.0r1 r3 = (X.0r1) r3
            java.lang.Object r6 = r5.A01
            X.5kq r6 = (X.C293505kq) r6
            X.0eS.A00(r1)
        L_0x002c:
            X.5kq r1 = (X.C293505kq) r1
            if (r1 == 0) goto L_0x003f
            X.JXu r1 = r1.A0G
            X.JXu r0 = X.JXu.A03
            if (r1 != r0) goto L_0x003f
            X.JXu r1 = r6.A0G
            X.JXu r0 = X.JXu.A02
            if (r1 != r0) goto L_0x003f
            r0 = 0
            r3.A00 = r0
        L_0x003f:
            boolean r0 = r3.A00
            if (r0 != 0) goto L_0x004b
            java.lang.String r2 = "ClipsDraftRepository"
            java.lang.String r1 = "ClipsDraft delete validation error"
            r0 = 0
            X.0kD.A07(r2, r1, r0)
        L_0x004b:
            boolean r0 = r3.A00
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x0052:
            X.0eS.A00(r1)
            X.0r1 r3 = new X.0r1
            r3.<init>()
            r3.A00 = r2
            boolean r0 = r7.A0D
            if (r0 == 0) goto L_0x003f
            com.instagram.clips.drafts.model.datasource.ClipsDraftLocalDataSource r1 = r7.A03
            java.lang.String r0 = r6.A0T
            r5.A01 = r6
            r5.A02 = r3
            r5.A00 = r2
            java.lang.Object r1 = r1.A07(r0, r5)
            if (r1 != r4) goto L_0x002c
            return r4
        L_0x0071:
            X.9Ja r5 = new X.9Ja
            r5.<init>(r7, r8, r3)
            goto L_0x0016
        L_0x0077:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository.A00(X.5kq, com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.9Ja, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(X.B1S r8, com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r9, X.AnonymousClass4D7 r10) {
        /*
            r3 = 22
            boolean r0 = X.C376709Ja.A00(r3, r10)
            if (r0 == 0) goto L_0x009e
            r6 = r10
            X.9Ja r6 = (X.C376709Ja) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x009e
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r4 = r6.A03
            X.1Hj r5 = X.1Hj.A02
            int r0 = r6.A00
            r7 = 2
            r2 = 1
            if (r0 == 0) goto L_0x002a
            if (r0 == r2) goto L_0x004c
            if (r0 != r7) goto L_0x00a5
            X.0eS.A00(r4)
        L_0x0027:
            X.0gF r5 = X.C60340gF.A00
            return r5
        L_0x002a:
            X.0eS.A00(r4)
            X.2Fj r0 = r9.A02
            java.lang.Object r1 = r0.A02()
            X.8fx r1 = (X.C361278fx) r1
            boolean r0 = r1 instanceof X.AnonymousClass8Y4
            if (r0 == 0) goto L_0x0027
            java.lang.Object r0 = r1.A00()
            X.5kq r0 = (X.C293505kq) r0
            r6.A01 = r9
            r6.A02 = r1
            r6.A00 = r2
            java.lang.Object r4 = r8.Cor(r0, r6)
            if (r4 != r5) goto L_0x0057
            return r5
        L_0x004c:
            java.lang.Object r1 = r6.A02
            X.8fx r1 = (X.C361278fx) r1
            java.lang.Object r9 = r6.A01
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r9 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository) r9
            X.0eS.A00(r4)
        L_0x0057:
            X.5kq r4 = (X.C293505kq) r4
            java.lang.Object r0 = r1.A00()
            X.5kq r0 = (X.C293505kq) r0
            r9.A08(r0, r4)
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0085
            X.2Fj r1 = r9.A02
            X.8Y4 r0 = new X.8Y4
            r0.<init>(r4)
            r1.A0B(r0)
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.5kq r0 = r9.A01
            if (r0 != 0) goto L_0x0027
            r9.A01 = r4
            goto L_0x0027
        L_0x0085:
            X.12T r0 = X.AnonymousClass12T.A00
            X.4CZ r3 = r0.A04
            r2 = 0
            r1 = 44
            X.MGV r0 = new X.MGV
            r0.<init>(r9, r4, r2, r1)
            r6.A01 = r2
            r6.A02 = r2
            r6.A00 = r7
            java.lang.Object r0 = X.1Eo.A00(r6, r3, r0)
            if (r0 != r5) goto L_0x0027
            return r5
        L_0x009e:
            X.9Ja r6 = new X.9Ja
            r6.<init>(r9, r10, r3)
            goto L_0x0016
        L_0x00a5:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository.A01(X.B1S, com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.MDy, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0074 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A02(X.B1S r8, com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r9, X.AnonymousClass4D7 r10) {
        /*
            r3 = 46
            boolean r0 = X.C66146MDy.A02(r3, r10)
            if (r0 == 0) goto L_0x0075
            r6 = r10
            X.MDy r6 = (X.C66146MDy) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0075
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r4 = r6.A03
            X.1Hj r5 = X.1Hj.A02
            int r0 = r6.A00
            r7 = 2
            r2 = 1
            if (r0 == 0) goto L_0x002a
            if (r0 == r2) goto L_0x0046
            if (r0 != r7) goto L_0x007b
            X.0eS.A00(r4)
        L_0x0027:
            X.0gF r5 = X.C60340gF.A00
            return r5
        L_0x002a:
            X.0eS.A00(r4)
            X.8fx r1 = r9.A00
            boolean r0 = r1 instanceof X.AnonymousClass8Y4
            if (r0 == 0) goto L_0x0027
            java.lang.Object r0 = r1.A00()
            X.5kq r0 = (X.C293505kq) r0
            r6.A01 = r9
            r6.A02 = r1
            r6.A00 = r2
            java.lang.Object r4 = r8.Cor(r0, r6)
            if (r4 != r5) goto L_0x0051
            return r5
        L_0x0046:
            java.lang.Object r1 = r6.A02
            X.8fx r1 = (X.C361278fx) r1
            java.lang.Object r9 = r6.A01
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r9 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository) r9
            X.0eS.A00(r4)
        L_0x0051:
            X.5kq r4 = (X.C293505kq) r4
            java.lang.Object r0 = r1.A00()
            X.5kq r0 = (X.C293505kq) r0
            r9.A08(r0, r4)
            X.12T r0 = X.AnonymousClass12T.A00
            X.4CZ r3 = r0.A04
            r2 = 0
            r1 = 45
            X.MGV r0 = new X.MGV
            r0.<init>(r9, r4, r2, r1)
            r6.A01 = r2
            r6.A02 = r2
            r6.A00 = r7
            java.lang.Object r0 = X.1Eo.A00(r6, r3, r0)
            if (r0 != r5) goto L_0x0027
            return r5
        L_0x0075:
            X.MDy r6 = new X.MDy
            r6.<init>(r9, r10, r3)
            goto L_0x0016
        L_0x007b:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository.A02(X.B1S, com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDy, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A03(X.B24 r7, com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r8, X.AnonymousClass4D7 r9, X.0sP r10, boolean r11, boolean r12) {
        /*
            r3 = 45
            boolean r0 = X.C66146MDy.A02(r3, r9)
            if (r0 == 0) goto L_0x009c
            r4 = r9
            X.MDy r4 = (X.C66146MDy) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x009c
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r4.A03
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A00
            r6 = 2
            r5 = 1
            if (r0 == 0) goto L_0x0037
            if (r0 == r5) goto L_0x0033
            if (r0 != r6) goto L_0x00a3
            java.lang.Object r2 = r4.A02
            java.lang.Object r10 = r4.A01
            X.0sP r10 = (X.0sP) r10
            X.0eS.A00(r1)
        L_0x002d:
            r10.invoke(r2)
        L_0x0030:
            X.0gF r3 = X.C60340gF.A00
            return r3
        L_0x0033:
            X.0eS.A00(r1)
            goto L_0x0030
        L_0x0037:
            X.0eS.A00(r1)
            if (r12 == 0) goto L_0x0066
            X.8fx r0 = r8.A00
            java.lang.Object r2 = r0.A00()
        L_0x0042:
            X.5kq r2 = (X.C293505kq) r2
            boolean r0 = r8.A0D
            if (r0 == 0) goto L_0x0077
            java.util.List r0 = r2.A0v
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0077
            com.instagram.common.session.UserSession r0 = r8.A04
            X.8A2 r0 = X.AnonymousClass8A1.A01(r0)
            java.lang.String r4 = "Saved draft cannot have empty video segments"
            X.29E r3 = r0.A0K
            long r1 = r0.A03
            r0 = 820(0x334, float:1.149E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.A09(r1, r0, r4)
            goto L_0x0030
        L_0x0066:
            X.2Fj r0 = r8.A02
            java.lang.Object r1 = r0.A02()
            X.8fx r1 = (X.C361278fx) r1
            boolean r0 = r1 instanceof X.AnonymousClass8Y4
            if (r0 == 0) goto L_0x00b1
            java.lang.Object r2 = r1.A00()
            goto L_0x0042
        L_0x0077:
            X.JXu r0 = r2.A0G
            int[] r1 = X.C63521KyW.A00
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r5) goto L_0x0092
            if (r0 != r6) goto L_0x00ab
            r4.A01 = r10
            r4.A02 = r2
            r4.A00 = r6
            java.lang.Object r0 = r8.A0B(r2, r7, r4, r11)
            if (r0 != r3) goto L_0x002d
            return r3
        L_0x0092:
            r0 = 0
            r4.A00 = r5
            java.lang.Object r0 = r8.A0A(r0, r2, r4)
            if (r0 != r3) goto L_0x0030
            return r3
        L_0x009c:
            X.MDy r4 = new X.MDy
            r4.<init>(r8, r9, r3)
            goto L_0x0016
        L_0x00a3:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x00ab:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x00b1:
            java.lang.String r1 = "Trying to update draft, but draft is not initialized"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository.A03(X.B24, com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository, X.4D7, X.0sP, boolean, boolean):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: X.0rm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: X.0rm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: X.0rm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: X.0rm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: X.0rm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: X.0rm} */
    /* JADX WARNING: type inference failed for: r6v1, types: [X.ME0, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v7 */
    /* JADX WARNING: type inference failed for: r6v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A04(com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r17, com.instagram.music.common.model.AudioOverlayTrack r18, java.lang.String r19, X.AnonymousClass4D7 r20) {
        /*
            r5 = r18
            r3 = 13
            r4 = r20
            boolean r0 = X.ME0.A02(r3, r4)
            r7 = r17
            if (r0 == 0) goto L_0x00b2
            r6 = r4
            X.ME0 r6 = (X.ME0) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00b2
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x001c:
            java.lang.Object r0 = r6.A05
            X.1Hj r4 = X.1Hj.A02
            int r2 = r6.A00
            r3 = 0
            r1 = 1
            if (r2 == 0) goto L_0x008f
            if (r2 != r1) goto L_0x00b9
            java.lang.Object r2 = r6.A04
            X.0rm r2 = (X.0rm) r2
            java.lang.Object r8 = r6.A03
            com.instagram.music.common.model.DownloadedTrack r8 = (com.instagram.music.common.model.DownloadedTrack) r8
            java.lang.Object r1 = r6.A02
            X.0rm r1 = (X.0rm) r1
            java.lang.Object r5 = r6.A01
            com.instagram.music.common.model.AudioOverlayTrack r5 = (com.instagram.music.common.model.AudioOverlayTrack) r5
            X.0eS.A00(r0)
        L_0x003b:
            r2.A00 = r0
            java.lang.Object r0 = r1.A00
            java.io.File r0 = (java.io.File) r0
            if (r0 == 0) goto L_0x00c1
            if (r5 == 0) goto L_0x00c1
            int r4 = r5.A03
            int r3 = r5.A02
            int r2 = r5.A04
            int r1 = r5.A01
            java.lang.String r12 = r5.A0B
            java.lang.String r13 = r5.A0A
            java.lang.String r14 = r5.A0E
            com.instagram.music.common.model.MusicBrowseCategory r11 = r5.A09
            com.instagram.music.common.model.MusicAssetModel r10 = r5.A08
            int r7 = r8.A01
            r6 = -1
            if (r7 == r6) goto L_0x0082
            int r6 = r8.A00
            java.lang.String r0 = r0.getPath()
            X.0qQ.A07(r0)
            com.instagram.music.common.model.DownloadedTrack r8 = new com.instagram.music.common.model.DownloadedTrack
            r8.<init>(r0, r7, r6)
        L_0x006a:
            X.8IJ r7 = r5.A05
            float r0 = r5.A00
            java.lang.String r15 = r5.A0C
            com.instagram.music.common.model.InstagramAudioApplySource r9 = r5.A07
            com.instagram.music.common.model.AudioOverlayTrack r6 = new com.instagram.music.common.model.AudioOverlayTrack
            r20 = r1
            r19 = r2
            r18 = r3
            r17 = r4
            r16 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r6
        L_0x0082:
            java.lang.String r0 = r0.getPath()
            X.0qQ.A07(r0)
            com.instagram.music.common.model.DownloadedTrack r8 = new com.instagram.music.common.model.DownloadedTrack
            r8.<init>(r0, r6, r6)
            goto L_0x006a
        L_0x008f:
            X.0eS.A00(r0)
            X.0rm r2 = new X.0rm
            r2.<init>()
            com.instagram.music.common.model.DownloadedTrack r8 = r5.A06
            if (r8 == 0) goto L_0x00c1
            java.lang.String r0 = r8.A02
            r6.A01 = r5
            r6.A02 = r2
            r6.A03 = r8
            r6.A04 = r2
            r6.A00 = r1
            r1 = r19
            java.lang.Object r0 = A05(r7, r0, r1, r6)
            if (r0 != r4) goto L_0x00b0
            return r4
        L_0x00b0:
            r1 = r2
            goto L_0x003b
        L_0x00b2:
            X.ME0 r6 = new X.ME0
            r6.<init>(r7, r4, r3)
            goto L_0x001c
        L_0x00b9:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x00c1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository.A04(com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository, com.instagram.music.common.model.AudioOverlayTrack, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: X.0r1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: X.0r1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: X.0r1} */
    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDy, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0089 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A05(com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r11, java.lang.String r12, java.lang.String r13, X.AnonymousClass4D7 r14) {
        /*
            r3 = 44
            boolean r0 = X.C66146MDy.A02(r3, r14)
            if (r0 == 0) goto L_0x0083
            r4 = r14
            X.MDy r4 = (X.C66146MDy) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0083
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r4.A03
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A00
            r10 = 0
            r5 = 1
            if (r0 == 0) goto L_0x0030
            if (r0 != r5) goto L_0x008a
            java.lang.Object r8 = r4.A02
            X.0r1 r8 = (X.0r1) r8
            java.lang.Object r9 = r4.A01
            X.0eS.A00(r1)
        L_0x002b:
            boolean r0 = r8.A00
            if (r0 == 0) goto L_0x0089
            return r9
        L_0x0030:
            X.0eS.A00(r1)
            java.io.File r7 = new java.io.File
            r7.<init>(r12)
            X.2Nn r0 = r11.A07
            java.io.File r0 = r0.A01()
            java.io.File r2 = new java.io.File
            r2.<init>(r0, r13)
            r2.mkdirs()
            java.lang.String r0 = "audio"
            java.io.File r1 = new java.io.File
            r1.<init>(r2, r0)
            r1.mkdirs()
            java.lang.String r0 = r7.getName()
            java.io.File r9 = new java.io.File
            r9.<init>(r1, r0)
            boolean r0 = r9.exists()
            if (r0 == 0) goto L_0x0060
            return r9
        L_0x0060:
            X.0r1 r8 = new X.0r1
            r8.<init>()
            X.12T r2 = X.AnonymousClass12T.A00
            r1 = 465496004(0x1bbee7c4, float:3.1582638E-22)
            r0 = 2
            X.0nV r0 = r2.AOJ(r1, r0)
            r11 = 40
            X.JZr r6 = new X.JZr
            r6.<init>(r7, r8, r9, r10, r11)
            r4.A01 = r9
            r4.A02 = r8
            r4.A00 = r5
            java.lang.Object r0 = X.1Eo.A00(r4, r0, r6)
            if (r0 != r3) goto L_0x002b
            return r3
        L_0x0083:
            X.MDy r4 = new X.MDy
            r4.<init>(r11, r14, r3)
            goto L_0x0016
        L_0x0089:
            return r10
        L_0x008a:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository.A05(com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository, java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.9JX, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A06(com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r6, X.AnonymousClass4D7 r7) {
        /*
            r3 = 30
            boolean r0 = X.AnonymousClass9JX.A00(r3, r7)
            if (r0 == 0) goto L_0x0065
            r5 = r7
            X.9JX r5 = (X.AnonymousClass9JX) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0065
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r5.A02
            X.1Hj r4 = X.1Hj.A02
            int r1 = r5.A00
            r3 = 2
            r2 = 1
            if (r1 == 0) goto L_0x0037
            if (r1 == r2) goto L_0x0049
            if (r1 != r3) goto L_0x006b
            java.lang.Object r6 = r5.A01
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r6 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository) r6
            X.0eS.A00(r0)
        L_0x002b:
            if (r0 == 0) goto L_0x0034
            X.8Y4 r1 = new X.8Y4
            r1.<init>(r0)
            r6.A00 = r1
        L_0x0034:
            X.0gF r4 = X.C60340gF.A00
            return r4
        L_0x0037:
            X.0eS.A00(r0)
            X.50r r1 = X.C2801950r.CLIPS
            r5.A01 = r6
            r5.A00 = r2
            com.instagram.clips.drafts.model.datasource.ClipsDraftLocalDataSource r0 = r6.A03
            java.lang.Object r0 = r0.A04(r1, r5)
            if (r0 != r4) goto L_0x0050
            return r4
        L_0x0049:
            java.lang.Object r6 = r5.A01
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r6 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository) r6
            X.0eS.A00(r0)
        L_0x0050:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0034
            X.50r r0 = X.C2801950r.CLIPS
            r5.A01 = r6
            r5.A00 = r3
            java.lang.Object r0 = r6.A0E(r0, r5)
            if (r0 != r4) goto L_0x002b
            return r4
        L_0x0065:
            X.9JX r5 = new X.9JX
            r5.<init>(r6, r7, r3)
            goto L_0x0016
        L_0x006b:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository.A06(com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [X.55Q, java.lang.Object] */
    public static final void A07(UserSession userSession, C293505kq r11, ClipsDraftRepository clipsDraftRepository, AnonymousClass3Q2 r13) {
        AnonymousClass55Q r2;
        PendingMediaStore pendingMediaStore = clipsDraftRepository.A06;
        AnonymousClass3Q2 A032 = pendingMediaStore.A03(r11.A0i);
        if (A032 != null) {
            String str = r11.A0V;
            if (str != null) {
                File file = new File(str);
                if (!file.exists() || !file.canRead() || file.length() <= 0) {
                    String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("cover photo file path is not accessible. path=%s exists=%s canRead=%s file size=%s", str, Boolean.valueOf(file.exists()), Boolean.valueOf(file.canRead()), Long.valueOf(file.length()));
                    0qQ.A07(formatStrLocaleSafe);
                    0kD.A07("apply_draft_files_to_pending_media_error", formatStrLocaleSafe, (Throwable) null);
                } else {
                    A032.A33 = str;
                }
            }
            AnonymousClass55Q r22 = A032.A1O;
            String str2 = r11.A0T;
            if (r22 == null) {
                ? obj = new Object();
                obj.A03 = str2;
                obj.A01 = null;
                obj.A00 = null;
                obj.A02 = null;
                r2 = obj;
            } else {
                r22.A03 = str2;
                r2 = r22;
            }
            A032.A1O = r2;
            A032.A2Z = r11.A0S;
            A032.A2w = r11.A0X;
            if (A032.A1P != null && 182.A06(0Tu.A05, userSession, 36317955692304077L)) {
                A032.A1P = null;
            }
            A032.A0r = null;
            C63174Ksh.A00(clipsDraftRepository.A09, userSession, r11, A032, clipsDraftRepository.A07);
            if (r13 != null && A032.A4a == null) {
                A032.A4a = r13.A4a;
            }
            pendingMediaStore.A0D(A032, A032.A35);
        }
    }

    private final boolean A08(C293505kq r4, C293505kq r5) {
        if (!this.A0D) {
            return true;
        }
        0qQ.A0B(r4, 0);
        0qQ.A0B(r5, 1);
        if (!0qQ.A0K(r4.A0T, r5.A0T) || r4.A0G != JXu.A03 || r5.A0G != JXu.A02) {
            return true;
        }
        0kD.A07("ClipsDraftRepository", 002.A0R("ClipsDraft update validation error: ", "INVALID_DRAFT_STATE_CHANGE"), (Throwable) null);
        return false;
    }

    public final C293505kq A09() {
        C361278fx r2;
        Object A022 = this.A02.A02();
        if (!(A022 instanceof AnonymousClass8Y4) || (r2 = (C361278fx) A022) == null) {
            return null;
        }
        return (C293505kq) r2.A01;
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.9Jl, X.4D7] */
    /* JADX WARNING: type inference failed for: r9v8, types: [X.0rm, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v19, types: [X.0r1, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0093, code lost:
        if (r12.A0D != false) goto L_0x003a;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0210  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x021a  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0249  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0286 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x020e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0B(X.C293505kq r19, X.B24 r20, X.AnonymousClass4D7 r21, boolean r22) {
        /*
            r18 = this;
            r2 = r19
            r8 = r20
            r4 = r22
            r11 = 2
            r5 = r21
            boolean r0 = r5 instanceof X.C376819Jl
            r12 = r18
            if (r0 == 0) goto L_0x028d
            r6 = r5
            X.9Jl r6 = (X.C376819Jl) r6
            int r0 = r6.A0A
            if (r0 != r11) goto L_0x028d
            int r3 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x028d
            int r3 = r3 - r1
            r6.A00 = r3
        L_0x0021:
            java.lang.Object r3 = r6.A08
            X.1Hj r5 = X.1Hj.A02
            int r1 = r6.A00
            r17 = 4
            r10 = 3
            r9 = 1
            if (r1 == 0) goto L_0x0053
            if (r1 == r9) goto L_0x003d
            if (r1 == r11) goto L_0x0119
            if (r1 == r10) goto L_0x01a9
            r0 = r17
            if (r1 != r0) goto L_0x0294
            X.0eS.A00(r3)
        L_0x003a:
            X.0gF r5 = X.C60340gF.A00
        L_0x003c:
            return r5
        L_0x003d:
            boolean r4 = r6.A09
            java.lang.Object r1 = r6.A04
            X.0r1 r1 = (X.0r1) r1
            java.lang.Object r8 = r6.A03
            X.B24 r8 = (X.B24) r8
            java.lang.Object r2 = r6.A02
            X.5kq r2 = (X.C293505kq) r2
            java.lang.Object r7 = r6.A01
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r7 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository) r7
            X.0eS.A00(r3)
            goto L_0x00b4
        L_0x0053:
            X.0eS.A00(r3)
            com.instagram.common.session.UserSession r3 = r12.A04
            com.instagram.clips.drafts.model.datasource.ClipsDraftLocalDataSource r13 = r12.A03
            java.lang.Integer r0 = X.AnonymousClass05K.A0u
            com.instagram.clips.drafts.model.validation.ClipsDraftValidator r15 = new com.instagram.clips.drafts.model.validation.ClipsDraftValidator
            r15.<init>(r13, r3, r0)
            r0 = 0
            X.0qQ.A0B(r2, r0)
            java.lang.String r7 = r2.A0T
            java.util.List r14 = r2.A0v
            r1 = 17
            X.JwJ r0 = new X.JwJ
            r0.<init>((java.util.List) r14, (int) r1, (java.lang.String) r7)
            X.GO1 r1 = r15.A00(r0)
            java.util.List r0 = r1.A00
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0096
            X.8A2 r0 = X.AnonymousClass8A1.A01(r3)
            java.lang.String r15 = r1.toString()
            X.29E r14 = r0.A0K
            long r0 = r0.A03
            r3 = 820(0x334, float:1.149E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r3)
            r14.A09(r0, r3, r15)
            boolean r0 = r12.A0D
            if (r0 == 0) goto L_0x0096
            goto L_0x003a
        L_0x0096:
            X.0r1 r1 = new X.0r1
            r1.<init>()
            r1.A00 = r9
            boolean r0 = r12.A0D
            if (r0 == 0) goto L_0x018d
            r6.A01 = r12
            r6.A02 = r2
            r6.A03 = r8
            r6.A04 = r1
            r6.A09 = r4
            r6.A00 = r9
            java.lang.Object r3 = r13.A07(r7, r6)
            if (r3 == r5) goto L_0x003c
            r7 = r12
        L_0x00b4:
            X.5kq r3 = (X.C293505kq) r3
            if (r3 == 0) goto L_0x00be
            boolean r0 = r7.A08(r3, r2)
            r1.A00 = r0
        L_0x00be:
            boolean r0 = r1.A00
            if (r0 == 0) goto L_0x003a
            X.8g1 r1 = r7.A0A
            r0 = 0
            X.0qQ.A0B(r2, r0)
            java.util.Map r0 = r1.A01
            java.lang.String r13 = r2.A0T
            r0.remove(r13)
            X.0rm r9 = new X.0rm
            r9.<init>()
            r9.A00 = r2
            com.instagram.common.session.UserSession r12 = r7.A04
            X.0Tu r3 = X.0Tu.A05
            r0 = 36327387440953749(0x810f9100093995, double:3.036924324082679E-306)
            boolean r0 = X.182.A06(r3, r12, r0)
            if (r0 == 0) goto L_0x022c
            java.util.List r0 = r2.A0p
            if (r0 == 0) goto L_0x0190
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r15 = r0.iterator()
        L_0x00f2:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0212
            java.lang.Object r14 = r15.next()
            com.instagram.music.common.model.AudioOverlayTrack r14 = (com.instagram.music.common.model.AudioOverlayTrack) r14
            java.lang.String r0 = r2.A0T
            r6.A01 = r7
            r6.A02 = r2
            r6.A03 = r8
            r6.A04 = r9
            r6.A05 = r10
            r6.A06 = r15
            r6.A07 = r14
            r6.A09 = r4
            r6.A00 = r11
            java.lang.Object r3 = A04(r7, r14, r0, r6)
            if (r3 != r5) goto L_0x013a
            return r5
        L_0x0119:
            boolean r4 = r6.A09
            java.lang.Object r14 = r6.A07
            com.instagram.music.common.model.AudioOverlayTrack r14 = (com.instagram.music.common.model.AudioOverlayTrack) r14
            java.lang.Object r15 = r6.A06
            java.util.Iterator r15 = (java.util.Iterator) r15
            java.lang.Object r10 = r6.A05
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r9 = r6.A04
            X.0rm r9 = (X.0rm) r9
            java.lang.Object r8 = r6.A03
            X.B24 r8 = (X.B24) r8
            java.lang.Object r2 = r6.A02
            X.5kq r2 = (X.C293505kq) r2
            java.lang.Object r7 = r6.A01
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r7 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository) r7
            X.0eS.A00(r3)
        L_0x013a:
            com.instagram.music.common.model.AudioOverlayTrack r3 = (com.instagram.music.common.model.AudioOverlayTrack) r3
            if (r3 == 0) goto L_0x0188
            if (r14 == 0) goto L_0x0186
            com.instagram.music.common.model.DownloadedTrack r0 = r14.A06
            if (r0 == 0) goto L_0x0186
            java.lang.String r13 = r0.A02
        L_0x0146:
            com.instagram.music.common.model.DownloadedTrack r0 = r3.A06
            if (r0 == 0) goto L_0x0184
            java.lang.String r12 = r0.A02
        L_0x014c:
            if (r13 == 0) goto L_0x0188
            if (r12 == 0) goto L_0x0188
            X.8vh r0 = r2.A0C
            if (r0 == 0) goto L_0x0188
            X.8pV r0 = r0.A01
            if (r0 == 0) goto L_0x0188
            X.3QS r0 = r0.A07
            if (r0 == 0) goto L_0x0188
            java.util.List r0 = r0.A03
            java.util.Iterator r16 = r0.iterator()
        L_0x0162:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0182
            java.lang.Object r1 = r16.next()
            r0 = r1
            X.51I r0 = (X.AnonymousClass51I) r0
            java.lang.String r0 = r0.A05
            boolean r0 = X.0qQ.A0K(r0, r13)
            if (r0 == 0) goto L_0x0162
        L_0x0177:
            X.51I r1 = (X.AnonymousClass51I) r1
            if (r1 == 0) goto L_0x0188
            r10.add(r3)
            r1.A05 = r12
            goto L_0x00f2
        L_0x0182:
            r1 = 0
            goto L_0x0177
        L_0x0184:
            r12 = 0
            goto L_0x014c
        L_0x0186:
            r13 = 0
            goto L_0x0146
        L_0x0188:
            r10.add(r14)
            goto L_0x00f2
        L_0x018d:
            r7 = r12
            goto L_0x00be
        L_0x0190:
            com.instagram.music.common.model.AudioOverlayTrack r0 = r2.A0N
            if (r0 == 0) goto L_0x022c
            r6.A01 = r7
            r6.A02 = r2
            r6.A03 = r8
            r6.A04 = r9
            r6.A05 = r0
            r6.A09 = r4
            r6.A00 = r10
            java.lang.Object r3 = A04(r7, r0, r13, r6)
            if (r3 != r5) goto L_0x01c2
            return r5
        L_0x01a9:
            boolean r4 = r6.A09
            java.lang.Object r0 = r6.A05
            com.instagram.music.common.model.AudioOverlayTrack r0 = (com.instagram.music.common.model.AudioOverlayTrack) r0
            java.lang.Object r9 = r6.A04
            X.0rm r9 = (X.0rm) r9
            java.lang.Object r8 = r6.A03
            X.B24 r8 = (X.B24) r8
            java.lang.Object r2 = r6.A02
            X.5kq r2 = (X.C293505kq) r2
            java.lang.Object r7 = r6.A01
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r7 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository) r7
            X.0eS.A00(r3)
        L_0x01c2:
            com.instagram.music.common.model.AudioOverlayTrack r3 = (com.instagram.music.common.model.AudioOverlayTrack) r3
            com.instagram.music.common.model.DownloadedTrack r0 = r0.A06
            if (r0 == 0) goto L_0x0210
            java.lang.String r12 = r0.A02
        L_0x01ca:
            if (r3 == 0) goto L_0x022c
            com.instagram.music.common.model.DownloadedTrack r0 = r3.A06
            if (r0 == 0) goto L_0x022c
            java.lang.String r11 = r0.A02
            if (r12 == 0) goto L_0x022c
            X.8vh r0 = r2.A0C
            if (r0 == 0) goto L_0x022c
            X.8pV r0 = r0.A01
            if (r0 == 0) goto L_0x022c
            X.3QS r0 = r0.A07
            if (r0 == 0) goto L_0x022c
            java.util.List r0 = r0.A03
            java.util.Iterator r10 = r0.iterator()
        L_0x01e6:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x020e
            java.lang.Object r1 = r10.next()
            r0 = r1
            X.51I r0 = (X.AnonymousClass51I) r0
            java.lang.String r0 = r0.A05
            boolean r0 = X.0qQ.A0K(r0, r12)
            if (r0 == 0) goto L_0x01e6
        L_0x01fb:
            X.51I r1 = (X.AnonymousClass51I) r1
            if (r1 == 0) goto L_0x022c
            r1.A05 = r11
            X.JXe r1 = new X.JXe
            r1.<init>()
            X.JXc r0 = new X.JXc
            r0.<init>(r3)
            r1.A02 = r0
            goto L_0x0226
        L_0x020e:
            r1 = 0
            goto L_0x01fb
        L_0x0210:
            r12 = 0
            goto L_0x01ca
        L_0x0212:
            boolean r0 = r10.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x022c
            X.JXe r1 = new X.JXe
            r1.<init>()
            X.JXc r0 = new X.JXc
            r0.<init>(r10)
            r1.A0b = r0
        L_0x0226:
            X.5kq r0 = r1.A01(r2)
            r9.A00 = r0
        L_0x022c:
            java.lang.Object r0 = r9.A00
            X.5kq r0 = (X.C293505kq) r0
            java.lang.String r0 = r0.A0e
            if (r0 == 0) goto L_0x023a
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0287
        L_0x023a:
            com.instagram.common.session.UserSession r3 = r7.A04
            X.0Tu r2 = X.0Tu.A05
            r0 = 36328237843954790(0x81105700013c66, double:3.037462122364835E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0287
            r10 = 1
            java.lang.Object r9 = r9.A00
            X.5kq r9 = (X.C293505kq) r9
            X.JXe r3 = new X.JXe
            r3.<init>()
            X.1Av r2 = r7.A08
            long r0 = r9.A01
            java.lang.String r1 = X.C393739wv.A00(r2, r0)
            X.JXc r0 = new X.JXc
            r0.<init>(r1)
            r3.A0c = r0
            X.5kq r3 = r3.A01(r9)
        L_0x0266:
            com.instagram.clips.drafts.model.datasource.ClipsDraftLocalDataSource r2 = r7.A03
            X.AXW r1 = new X.AXW
            r1.<init>(r3, r8, r7, r10)
            r0 = 0
            r6.A01 = r0
            r6.A02 = r0
            r6.A03 = r0
            r6.A04 = r0
            r6.A05 = r0
            r6.A06 = r0
            r6.A07 = r0
            r0 = r17
            r6.A00 = r0
            java.lang.Object r0 = r2.A01(r1, r3, r6, r4)
            if (r0 != r5) goto L_0x003a
            return r5
        L_0x0287:
            r10 = 0
            java.lang.Object r3 = r9.A00
            X.5kq r3 = (X.C293505kq) r3
            goto L_0x0266
        L_0x028d:
            X.9Jl r6 = new X.9Jl
            r6.<init>(r12, r5, r11)
            goto L_0x0021
        L_0x0294:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository.A0B(X.5kq, X.B24, X.4D7, boolean):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.9Ja, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: type inference failed for: r6v6 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0C(X.C293505kq r8, X.AnonymousClass4D7 r9) {
        /*
            r7 = this;
            r3 = 21
            boolean r0 = X.C376709Ja.A00(r3, r9)
            if (r0 == 0) goto L_0x00dc
            r6 = r9
            X.9Ja r6 = (X.C376709Ja) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00dc
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r6.A03
            X.1Hj r5 = X.1Hj.A02
            int r0 = r6.A00
            r3 = 2
            r4 = 1
            if (r0 == 0) goto L_0x00a8
            if (r0 == r4) goto L_0x009c
            if (r0 != r3) goto L_0x00e3
            java.lang.Object r8 = r6.A02
            X.5kq r8 = (X.C293505kq) r8
            java.lang.Object r2 = r6.A01
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r2 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository) r2
            X.0eS.A00(r1)
        L_0x002f:
            com.instagram.common.session.UserSession r0 = r2.A04
            X.27r r5 = X.27p.A01(r0)
            java.lang.String r6 = r8.A0T
            X.0wc r2 = r5.A01
            java.lang.String r1 = "ig_camera_draft_delete_auto_saved"
            X.0kJ r0 = r2.A00
            X.0Aj r2 = r2.A00(r0, r1)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x0099
            X.283 r3 = r5.A04
            java.lang.String r1 = r3.A0L
            if (r1 != 0) goto L_0x004f
            java.lang.String r1 = ""
        L_0x004f:
            java.lang.String r0 = "camera_session_id"
            r2.AAJ(r0, r1)
            X.28D r1 = r3.A09
            java.lang.String r0 = "entry_point"
            r2.A8M(r1, r0)
            java.lang.String r1 = "event_type"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r2.A8k(r1, r0)
            X.28t r1 = r3.A0A
            java.lang.String r0 = "media_type"
            r2.A8M(r1, r0)
            X.0iw r0 = X.27x.A08
            java.lang.String r1 = r0.getModuleName()
            java.lang.String r0 = "module"
            r2.AAJ(r0, r1)
            java.lang.String r0 = "composition_str_id"
            r2.AAJ(r0, r6)
            X.4yP r1 = r5.A0J()
            java.lang.String r0 = "camera_destination"
            r2.A8M(r1, r0)
            X.JVj r1 = r3.A0C
            java.lang.String r0 = "surface"
            r2.A8M(r1, r0)
            X.1QJ r0 = X.AnonymousClass1QI.A00
            X.1QM r0 = r0.A02
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "nav_chain"
            r2.AAJ(r0, r1)
            r2.Cgf()
        L_0x0099:
            X.0gF r5 = X.C60340gF.A00
        L_0x009b:
            return r5
        L_0x009c:
            java.lang.Object r8 = r6.A02
            X.5kq r8 = (X.C293505kq) r8
            java.lang.Object r2 = r6.A01
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r2 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository) r2
            X.0eS.A00(r1)
            goto L_0x00b8
        L_0x00a8:
            X.0eS.A00(r1)
            r6.A01 = r7
            r6.A02 = r8
            r6.A00 = r4
            java.lang.Object r1 = A00(r8, r7, r6)
            if (r1 == r5) goto L_0x009b
            r2 = r7
        L_0x00b8:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            if (r0 == 0) goto L_0x0099
            X.8g1 r1 = r2.A0A
            r0 = 0
            X.0qQ.A0B(r8, r0)
            java.util.Map r0 = r1.A01
            java.lang.String r1 = r8.A0T
            r0.remove(r1)
            com.instagram.clips.drafts.model.datasource.ClipsDraftLocalDataSource r0 = r2.A03
            r6.A01 = r2
            r6.A02 = r8
            r6.A00 = r3
            java.lang.Object r0 = r0.A06(r1, r6)
            if (r0 != r5) goto L_0x002f
            return r5
        L_0x00dc:
            X.9Ja r6 = new X.9Ja
            r6.<init>(r7, r9, r3)
            goto L_0x0016
        L_0x00e3:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository.A0C(X.5kq, X.4D7):java.lang.Object");
    }

    public final Object A0D(C293505kq r7, AnonymousClass4D7 r8) {
        String str;
        ClipsDraftLocalDataSource clipsDraftLocalDataSource = this.A03;
        AnonymousClass51M r0 = (AnonymousClass51M) 00k.A0J(r7.A0v);
        if (r0 == null || (str = r0.A0F.A0F) == null) {
            return null;
        }
        if (!182.A06(0Tu.A05, clipsDraftLocalDataSource.A00, 36323586394500373L)) {
            return C39908AIz.A01(str, 0);
        }
        Object A002 = 1Eo.A00(r8, AnonymousClass12T.A00.CO6(480314591, 3), new ClipsDraftLocalDataSource$getTempCoverImage$2$1(str, (AnonymousClass4D7) null));
        1Hj r02 = 1Hj.A02;
        return A002;
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.9JX, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0E(X.C2801950r r6, X.AnonymousClass4D7 r7) {
        /*
            r5 = this;
            r3 = 28
            boolean r0 = X.AnonymousClass9JX.A00(r3, r7)
            if (r0 == 0) goto L_0x0048
            r4 = r7
            X.9JX r4 = (X.AnonymousClass9JX) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0048
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r4.A02
            X.1Hj r2 = X.1Hj.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x0036
            if (r0 != r1) goto L_0x0050
            java.lang.Object r0 = r4.A01
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r0 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository) r0
            X.0eS.A00(r3)
        L_0x0028:
            X.5kq r3 = (X.C293505kq) r3
            if (r3 == 0) goto L_0x004e
            X.8g1 r0 = r0.A0A
            java.util.Map r1 = r0.A01
            java.lang.String r0 = r3.A0T
            r1.put(r0, r3)
            return r3
        L_0x0036:
            X.0eS.A00(r3)
            com.instagram.clips.drafts.model.datasource.ClipsDraftLocalDataSource r0 = r5.A03
            r4.A01 = r5
            r4.A00 = r1
            java.lang.Object r3 = r0.A02(r6, r4)
            if (r3 != r2) goto L_0x0046
            return r2
        L_0x0046:
            r0 = r5
            goto L_0x0028
        L_0x0048:
            X.9JX r4 = new X.9JX
            r4.<init>(r5, r7, r3)
            goto L_0x0016
        L_0x004e:
            r3 = 0
            return r3
        L_0x0050:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository.A0E(X.50r, X.4D7):java.lang.Object");
    }

    public final Object A0G(B1S b1s, AnonymousClass4D7 r4, boolean z) {
        Object A012;
        if (z) {
            A012 = A02(b1s, this, r4);
        } else {
            A012 = A01(b1s, this, r4);
        }
        if (A012 != 1Hj.A02) {
            return C60340gF.A00;
        }
        return A012;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ae, code lost:
        if (X.Q0Y.A03(r1) == false) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0H(X.LO6 r8, java.lang.String r9, X.AnonymousClass4D7 r10) {
        /*
            r7 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.C241503Pl.A01
            X.4D7 r0 = X.1Ey.A02(r10)
            X.3Pl r10 = new X.3Pl
            r10.<init>(r0)
            com.instagram.common.session.UserSession r2 = r7.A04
            X.0Tu r3 = X.0Tu.A05
            r0 = 36327387441084823(0x810f91000b3997, double:3.0369243241655706E-306)
            boolean r4 = X.182.A06(r3, r2, r0)
            X.8g1 r0 = r7.A0A     // Catch:{ Exception -> 0x00da }
            X.5kq r6 = r0.A00(r9)     // Catch:{ Exception -> 0x00da }
            if (r6 != 0) goto L_0x003f
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.L42 r1 = new X.L42
            r1.<init>(r6, r0)
            X.5sO r0 = new X.5sO
            r0.<init>(r1)
            r10.resumeWith(r0)
            X.8A2 r2 = X.AnonymousClass8A1.A01(r2)
            java.lang.String r1 = "clipsDraftRepository"
            r0 = 1293(0x50d, float:1.812E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A0N(r1, r0)
            goto L_0x0055
        L_0x003f:
            X.8g2 r0 = r7.A0C
            java.lang.String r3 = r6.A0i
            if (r3 != 0) goto L_0x008c
            java.lang.Integer r5 = X.AnonymousClass05K.A00
        L_0x0047:
            if (r5 != 0) goto L_0x005a
            r0 = 0
            A07(r2, r6, r7, r0)
            X.3Ih r0 = new X.3Ih
            r0.<init>(r6)
            r10.resumeWith(r0)
        L_0x0055:
            java.lang.Object r0 = r10.A00()
            return r0
        L_0x005a:
            X.8A2 r1 = X.AnonymousClass8A1.A01(r2)
            int r0 = r5.intValue()
            switch(r0) {
                case 1: goto L_0x0083;
                case 2: goto L_0x0086;
                case 3: goto L_0x0089;
                default: goto L_0x0065;
            }
        L_0x0065:
            java.lang.String r5 = "no_pending_media_id"
        L_0x0067:
            X.29E r4 = r1.A0K
            long r0 = r1.A01
            java.lang.String r2 = "sharesheet_validation_error"
            r4.A09(r0, r2, r5)
            com.instagram.pendingmedia.store.PendingMediaStore r1 = r7.A06
            java.lang.String r0 = java.lang.String.valueOf(r3)
            X.3Q2 r9 = r1.A04(r0, r5)
            X.LoY r5 = new X.LoY
            r5.<init>(r6, r7, r8, r9, r10)
            r8.A01(r6, r5)
            goto L_0x0055
        L_0x0083:
            java.lang.String r5 = "stitched_video_file_missing"
            goto L_0x0067
        L_0x0086:
            java.lang.String r5 = "audio_track_file_missing"
            goto L_0x0067
        L_0x0089:
            java.lang.String r5 = "audio_track_file_invalid"
            goto L_0x0067
        L_0x008c:
            r5 = 0
            if (r4 != 0) goto L_0x00b4
            com.instagram.pendingmedia.store.PendingMediaStore r0 = r0.A00
            X.3Q2 r0 = r0.A03(r3)
            if (r0 == 0) goto L_0x00b1
            com.instagram.pendingmedia.model.ClipInfo r0 = r0.A1N
            if (r0 == 0) goto L_0x00b1
            java.lang.String r1 = r0.A0F
            if (r1 == 0) goto L_0x00b1
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x00b1
            boolean r0 = X.Q0Y.A03(r1)
            if (r0 != 0) goto L_0x00b4
            goto L_0x0047
        L_0x00b1:
            java.lang.Integer r5 = X.AnonymousClass05K.A01
            goto L_0x0047
        L_0x00b4:
            java.util.List r0 = r6.A0p
            if (r0 == 0) goto L_0x00d0
            java.util.Iterator r1 = r0.iterator()
        L_0x00bc:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0047
            java.lang.Object r0 = r1.next()
            com.instagram.music.common.model.AudioOverlayTrack r0 = (com.instagram.music.common.model.AudioOverlayTrack) r0
            java.lang.Integer r0 = X.C361318g2.A00(r0, r4)
            if (r0 == 0) goto L_0x00bc
            r5 = r0
            goto L_0x00bc
        L_0x00d0:
            com.instagram.music.common.model.AudioOverlayTrack r0 = r6.A0N
            if (r0 == 0) goto L_0x0047
            java.lang.Integer r5 = X.C361318g2.A00(r0, r4)
            goto L_0x0047
        L_0x00da:
            r3 = move-exception
            X.8A2 r2 = X.AnonymousClass8A1.A01(r2)
            java.lang.Class r0 = r3.getClass()
            java.lang.String r1 = r0.getSimpleName()
            X.0qQ.A07(r1)
            java.lang.String r0 = r3.getMessage()
            r2.A0N(r1, r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository.A0H(X.LO6, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C60340gF A0J(X.C293505kq r6, X.AnonymousClass4D7 r7) {
        /*
            r5 = this;
            r3 = 29
            boolean r0 = X.AnonymousClass9JX.A00(r3, r7)
            if (r0 == 0) goto L_0x0061
            r4 = r7
            X.9JX r4 = (X.AnonymousClass9JX) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0061
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r4.A02
            int r0 = r4.A00
            r3 = 1
            if (r0 == 0) goto L_0x0044
            if (r0 != r3) goto L_0x0067
            java.lang.Object r2 = r4.A01
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r2 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository) r2
            X.0eS.A00(r1)
        L_0x0026:
            X.2Fj r1 = r2.A02
            X.8g4 r0 = X.C361338g4.A00
            r1.A0A(r0)
            r0 = 0
            r2.A01 = r0
            com.instagram.common.session.UserSession r1 = r2.A04
            X.6tY r0 = X.C353578Ie.A00(r1)
            boolean r0 = r0.A04()
            if (r0 == 0) goto L_0x0041
            X.2Nn r0 = r2.A07
            X.C39907AIy.A05(r1, r0)
        L_0x0041:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0044:
            X.0eS.A00(r1)
            X.8g1 r1 = r5.A0A
            r0 = 0
            X.0qQ.A0B(r6, r0)
            java.util.Map r0 = r1.A01
            java.lang.String r2 = r6.A0T
            r0.remove(r2)
            com.instagram.clips.drafts.model.datasource.ClipsDraftLocalDataSource r1 = r5.A03
            r4.A01 = r5
            r4.A00 = r3
            X.50r r0 = r6.A0H
            com.instagram.clips.drafts.model.datasource.ClipsDraftLocalDataSource.A00(r1, r0, r2)
            r2 = r5
            goto L_0x0026
        L_0x0061:
            X.9JX r4 = new X.9JX
            r4.<init>(r5, r7, r3)
            goto L_0x0016
        L_0x0067:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository.A0J(X.5kq, X.4D7):X.0gF");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C60340gF A0K(X.C293505kq r6, X.AnonymousClass4D7 r7) {
        /*
            r5 = this;
            r3 = 44
            boolean r0 = X.C66128MDg.A01(r3, r7)
            if (r0 == 0) goto L_0x0057
            r4 = r7
            X.MDg r4 = (X.C66128MDg) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0057
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r4.A02
            int r0 = r4.A00
            r3 = 1
            if (r0 == 0) goto L_0x003a
            if (r0 != r3) goto L_0x005d
            java.lang.Object r2 = r4.A01
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r2 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository) r2
            X.0eS.A00(r1)
        L_0x0026:
            com.instagram.common.session.UserSession r1 = r2.A04
            X.6tY r0 = X.C353578Ie.A00(r1)
            boolean r0 = r0.A04()
            if (r0 == 0) goto L_0x0037
            X.2Nn r0 = r2.A07
            X.C39907AIy.A05(r1, r0)
        L_0x0037:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x003a:
            X.0eS.A00(r1)
            X.8g1 r1 = r5.A0A
            r0 = 0
            X.0qQ.A0B(r6, r0)
            java.util.Map r0 = r1.A01
            java.lang.String r2 = r6.A0T
            r0.remove(r2)
            com.instagram.clips.drafts.model.datasource.ClipsDraftLocalDataSource r1 = r5.A03
            r4.A01 = r5
            r4.A00 = r3
            X.50r r0 = r6.A0H
            com.instagram.clips.drafts.model.datasource.ClipsDraftLocalDataSource.A00(r1, r0, r2)
            r2 = r5
            goto L_0x0026
        L_0x0057:
            X.MDg r4 = new X.MDg
            r4.<init>(r5, r7, r3)
            goto L_0x0016
        L_0x005d:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository.A0K(X.5kq, X.4D7):X.0gF");
    }

    public final void A0L() {
        this.A02.A0B(C361268fw.A00);
        this.A01 = null;
        this.A05.A00();
    }

    public final void A0M(C293505kq r3) {
        this.A0A.A01.remove(r3.A0T);
        A0P(C2801950r.CLIPS, (AnonymousClass3QO) null);
        this.A05.A00();
    }
}
