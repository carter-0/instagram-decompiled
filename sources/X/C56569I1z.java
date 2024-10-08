package X;

import android.app.Application;
import com.instagram.clips.audio.soundsync.repository.ClipsSoundSyncMediaImportRepository;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.I1z  reason: case insensitive filesystem */
public final class C56569I1z {
    public List A00;
    public boolean A01;
    public final Application A02;
    public final AnonymousClass2gO A03;
    public final 28D A04;
    public final C53401GnY A05;
    public final C353768Iz A06;
    public final ClipsSoundSyncMediaImportRepository A07;
    public final UserSession A08;
    public final AnonymousClass836 A09;
    public final ClipsCreationViewModel A0A;
    public final List A0B;
    public final List A0C;
    public final C262224Cq A0D;
    public final C249513ju A0E;
    public final AnonymousClass0r6 A0F;
    public final 05G A0G = DbS.A10(false);
    public final 05G A0H = DbS.A10(false);
    public final 05G A0I = DbS.A10(false);
    public final 05G A0J = DbS.A10(Double.valueOf(0.0d));
    public final C279284yO A0K;

    public C56569I1z(Application application, 28D r9, C53401GnY gnY, ClipsSoundSyncMediaImportRepository clipsSoundSyncMediaImportRepository, UserSession userSession, C279284yO r13, ClipsCreationViewModel clipsCreationViewModel, List list, List list2, C262224Cq r17) {
        0qQ.A0B(r13, 9);
        this.A02 = application;
        this.A08 = userSession;
        this.A0A = clipsCreationViewModel;
        this.A07 = clipsSoundSyncMediaImportRepository;
        this.A0B = list;
        C262224Cq r4 = r17;
        this.A0D = r4;
        this.A05 = gnY;
        this.A0K = r13;
        this.A0C = list2;
        this.A04 = r9;
        AnonymousClass836 r6 = C3500382y.A00(application, userSession).A00(clipsCreationViewModel.A0S).A05;
        this.A09 = r6;
        1HR r2 = new 1HR(0);
        this.A0E = r2;
        this.A06 = ((A7H) userSession.A01(A7H.class, new MMW(32, application, userSession))).A00;
        this.A0F = 0u9.A04(r2);
        IHH ihh = new IHH(this, 6);
        this.A03 = ihh;
        C51968G9o.A1P(new C58099ImL(this, (AnonymousClass4D7) null, 20), r4, r6.A03);
        clipsCreationViewModel.A0K.A06.A09(ihh);
    }

    public static final C349307zv A00(Medium medium, C56569I1z i1z) {
        try {
            C349307zv A002 = new JZ5(i1z.A02, medium, i1z.A08, false).call();
            int i = A002.A09;
            if (i == 90 || i == 270) {
                return new C349307zv(medium, A002.A08, A002.A0K, i);
            }
            return A002;
        } catch (Exception unused) {
            return new C349307zv(medium, medium.A0B, medium.A04, medium.A07);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v10, resolved type: X.51M} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v11, resolved type: X.51M} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v12, resolved type: X.51M} */
    /* JADX WARNING: type inference failed for: r5v1, types: [X.Il1, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.AnonymousClass4D7 r38, boolean r39) {
        /*
            r37 = this;
            r3 = r38
            r10 = r39
            boolean r0 = r3 instanceof X.C58069Il1
            r8 = r37
            if (r0 == 0) goto L_0x0184
            r5 = r3
            X.Il1 r5 = (X.C58069Il1) r5
            int r2 = r5.A01
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0184
            int r2 = r2 - r1
            r5.A01 = r2
        L_0x0018:
            java.lang.Object r9 = r5.A09
            X.1Hj r11 = X.1Hj.A02
            int r0 = r5.A01
            r7 = 1
            if (r0 == 0) goto L_0x0147
            if (r0 != r7) goto L_0x019d
            int r4 = r5.A00
            boolean r10 = r5.A08
            java.lang.Object r3 = r5.A07
            java.util.Collection r3 = (java.util.Collection) r3
            java.lang.Object r2 = r5.A06
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r2 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel) r2
            java.lang.Object r15 = r5.A05
            X.51N r15 = (X.AnonymousClass51N) r15
            java.lang.Object r6 = r5.A04
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r1 = r5.A03
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.Object r0 = r5.A02
            X.I1z r0 = (X.C56569I1z) r0
            X.0eS.A00(r9)
        L_0x0042:
            X.7zv r9 = (X.C349307zv) r9
            X.GnY r8 = r0.A05
            java.lang.Object r13 = r8.A00
            com.instagram.api.schemas.ACRType r13 = (com.instagram.api.schemas.ACRType) r13
            java.lang.String r12 = r8.A03
            int r24 = X.I5p.A00(r13, r12, r7)
            X.KN4 r15 = (X.KN4) r15
            int r13 = r15.A00
            r12 = 0
            r26 = 0
            r17 = 0
            java.lang.String r23 = r9.A06()
            r22 = r9
            r25 = r13
            r27 = r13
            r28 = r13
            X.51R r19 = X.C39821AAs.A01(r22, r23, r24, r25, r26, r27, r28)
            r25 = 0
            java.lang.String r14 = r8.A03
            X.GnY r9 = r15.A02
            if (r9 == 0) goto L_0x0144
            java.lang.Object r12 = r9.A01
            java.lang.Object r13 = r9.A02
        L_0x0075:
            java.lang.Object r9 = r8.A00
            java.lang.String r8 = r8.A04
            r33 = 4
            X.GnY r16 = new X.GnY
            r27 = r16
            r28 = r9
            r29 = r13
            r30 = r12
            r31 = r14
            r32 = r8
            r27.<init>(r28, r29, r30, r31, r32, r33)
            java.lang.String r8 = r15.A04
            r32 = 805273598(0x2fff7ffe, float:4.6475174E-10)
            X.51M r15 = new X.51M
            r18 = r17
            r20 = r17
            r21 = r17
            r22 = r17
            r23 = r17
            r24 = r8
            r27 = r26
            r28 = r26
            r29 = r26
            r30 = r26
            r31 = r26
            r33 = r26
            r34 = r26
            r35 = r26
            r36 = r26
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            if (r10 != 0) goto L_0x00de
            com.instagram.common.session.UserSession r13 = r0.A08
            X.0Tu r12 = X.0Tu.A05
            r8 = 36318204800276471(0x810737000017f7, double:3.031117185142842E-306)
            boolean r8 = X.182.A06(r12, r13, r8)
            if (r8 == 0) goto L_0x00de
            X.51S r9 = r15.A0E
            com.instagram.api.schemas.CameraTool r13 = com.instagram.api.schemas.CameraTool.SOUND_SYNC
            java.lang.Float r8 = java.lang.Float.valueOf(r25)
            com.instagram.feed.media.CameraToolInfo r12 = new com.instagram.feed.media.CameraToolInfo
            r12.<init>(r13, r8, r8, r8)
            X.51S r8 = r15.A0E
            java.util.List r8 = r8.A03
            if (r8 == 0) goto L_0x013b
            java.util.ArrayList r8 = X.00k.A0T(r12, r8)
        L_0x00dc:
            r9.A03 = r8
        L_0x00de:
            r3.add(r15)
            r3 = r1
        L_0x00e2:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x0195
            java.lang.Object r15 = r6.next()
            int r12 = r4 + 1
            if (r4 >= 0) goto L_0x00f8
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00f8:
            X.51N r15 = (X.AnonymousClass51N) r15
            boolean r8 = r15 instanceof X.AnonymousClass51M
            if (r8 == 0) goto L_0x0100
            r4 = r12
            goto L_0x00de
        L_0x0100:
            boolean r8 = r15 instanceof X.KN4
            if (r8 == 0) goto L_0x0190
            java.util.List r8 = r0.A0B
            int r8 = r8.size()
            if (r4 < r8) goto L_0x018b
            com.instagram.clips.audio.soundsync.repository.ClipsSoundSyncMediaImportRepository r9 = r0.A07
            java.util.List r13 = r0.A03()
            java.util.List r8 = r0.A0B
            int r8 = r8.size()
            int r4 = r4 - r8
            java.lang.Object r4 = r13.get(r4)
            com.instagram.common.gallery.Medium r4 = (com.instagram.common.gallery.Medium) r4
            r5.A02 = r0
            r5.A03 = r1
            r5.A04 = r6
            r5.A05 = r15
            r5.A06 = r2
            r5.A07 = r1
            r5.A08 = r10
            r5.A00 = r12
            r5.A01 = r7
            java.lang.Object r9 = r9.A00(r4, r5)
            if (r9 != r11) goto L_0x0138
            return r11
        L_0x0138:
            r4 = r12
            goto L_0x0042
        L_0x013b:
            com.instagram.feed.media.CameraToolInfo[] r8 = new com.instagram.feed.media.CameraToolInfo[]{r12}
            java.util.ArrayList r8 = X.0sr.A1M(r8)
            goto L_0x00dc
        L_0x0144:
            r13 = r12
            goto L_0x0075
        L_0x0147:
            X.0eS.A00(r9)
            X.836 r0 = r8.A09
            X.0Ud r0 = r0.A03
            java.lang.Object r0 = r0.getValue()
            X.831 r0 = (X.AnonymousClass831) r0
            java.util.ArrayList r4 = r0.A05()
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r4.iterator()
        L_0x0160:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0172
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.AnonymousClass51M
            if (r0 == 0) goto L_0x0160
            r3.add(r1)
            goto L_0x0160
        L_0x0172:
            r3.isEmpty()
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r2 = r8.A0A
            java.util.ArrayList r1 = X.AnonymousClass7TG.A0r(r4)
            java.util.Iterator r6 = r4.iterator()
            r0 = r8
            r3 = r1
            r4 = 0
            goto L_0x00e2
        L_0x0184:
            X.Il1 r5 = new X.Il1
            r5.<init>(r8, r3)
            goto L_0x0018
        L_0x018b:
            java.lang.IllegalStateException r0 = X.DbT.A0m()
            throw r0
        L_0x0190:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0195:
            java.util.List r3 = (java.util.List) r3
            r2.A0j(r3)
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x019d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56569I1z.A01(X.4D7, boolean):java.lang.Object");
    }

    public final ArrayList A02() {
        List<AnonymousClass51M> list = this.A0B;
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        for (AnonymousClass51M r0 : list) {
            AnonymousClass7TF.A1M(A0r, r0.A0F.A04);
        }
        return 00k.A0S(this.A07.A00, A0r);
    }

    public final List A03() {
        List list = this.A00;
        if (list != null) {
            return list;
        }
        0qQ.A0F("media");
        throw AnonymousClass00P.createAndThrow();
    }
}
