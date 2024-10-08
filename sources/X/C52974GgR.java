package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.clips.audio.soundsync.repository.ClipsSoundSyncBeatsInfoRepository;
import com.instagram.clips.audio.soundsync.repository.ClipsSoundSyncMediaImportRepository;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.CancellationException;

/* renamed from: X.GgR  reason: case insensitive filesystem */
public final class C52974GgR extends C361478gI implements AnonymousClass4DR {
    public boolean A00;
    public final int A01;
    public final AnonymousClass2gO A02;
    public final AnonymousClass2gO A03;
    public final C55963HqU A04;
    public final C55451Hhv A05;
    public final UserSession A06;
    public final 0nV A07;
    public final C357638Yz A08;
    public final 27r A09;
    public final C356988Vz A0A;
    public final C361278fx A0B;
    public final AnonymousClass8ZP A0C;
    public final AnonymousClass8A2 A0D;
    public final ClipsCreationViewModel A0E;
    public final C3495780x A0F;
    public final AnonymousClass8J5 A0G;
    public final C56569I1z A0H;
    public final List A0I;
    public final List A0J;
    public final List A0K;
    public final Queue A0L;
    public final C249513ju A0M;
    public final AnonymousClass0r6 A0N;
    public final 05G A0O;
    public final 05G A0P;
    public final 05G A0Q;
    public final 05G A0R;
    public final 05G A0S;
    public final 05G A0T;
    public final 05G A0U;
    public final AnonymousClass0Ud A0V;
    public final boolean A0W;
    public final C53401GnY A0X;
    public final C55914Hpb A0Y;
    public final ClipsSoundSyncBeatsInfoRepository A0Z;
    public final AnonymousClass12T A0a;
    public final AnonymousClass0r6 A0b;
    public final AnonymousClass0r6 A0c;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C52974GgR(android.app.Application r33, X.C53401GnY r34, X.C55914Hpb r35, com.instagram.clips.audio.soundsync.repository.ClipsSoundSyncBeatsInfoRepository r36, X.C55963HqU r37, com.instagram.clips.audio.soundsync.repository.ClipsSoundSyncMediaImportRepository r38, X.C55451Hhv r39, com.instagram.common.session.UserSession r40, X.C357638Yz r41, X.C356988Vz r42, com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r43, X.C3495780x r44, X.AnonymousClass8J5 r45, java.util.List r46, int r47, boolean r48) {
        /*
            r32 = this;
            r3 = 1
            r17 = 2
            r0 = 3
            r9 = r44
            r10 = r43
            r4 = r42
            r2 = r45
            X.C51974G9v.A0d(r0, r4, r10, r2, r9)
            r0 = 10
            r5 = r37
            X.0qQ.A0B(r5, r0)
            r0 = 11
            r12 = r41
            r6 = r35
            X.DbW.A1P(r12, r0, r6)
            r1 = 14
            r21 = r34
            r0 = r21
            X.0qQ.A0B(r0, r1)
            r20 = r33
            r11 = r32
            r0 = r20
            r11.<init>(r0)
            r19 = r40
            r0 = r19
            r11.A06 = r0
            r11.A0A = r4
            r11.A0E = r10
            r11.A0G = r2
            r11.A0F = r9
            r0 = r36
            r11.A0Z = r0
            r0 = r39
            r11.A05 = r0
            r11.A04 = r5
            r11.A08 = r12
            r11.A0Y = r6
            r0 = r47
            r11.A01 = r0
            r0 = r21
            r11.A0X = r0
            r0 = r48
            r11.A0W = r0
            r18 = r46
            r0 = r18
            r11.A0J = r0
            com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore r0 = r10.A0K
            X.2Fk r0 = r0.A06
            java.lang.Object r0 = r0.A02()
            X.8fx r0 = (X.C361278fx) r0
            if (r0 != 0) goto L_0x006d
            X.8fw r0 = X.C361268fw.A00
        L_0x006d:
            r11.A0B = r0
            X.2gB r0 = r10.A0G
            java.lang.Object r0 = r0.A02()
            X.831 r0 = (X.AnonymousClass831) r0
            if (r0 == 0) goto L_0x0194
            java.util.ArrayList r0 = r0.A05()
        L_0x007d:
            r11.A0I = r0
            X.12T r2 = X.AnonymousClass12T.A00
            r11.A0a = r2
            r1 = 2088859822(0x7c8178ae, float:5.378032E36)
            X.0nV r1 = r2.AOJ(r1, r3)
            r11.A07 = r1
            X.27r r1 = X.27p.A01(r19)
            r11.A09 = r1
            X.8A2 r1 = X.AnonymousClass8A1.A01(r19)
            r11.A0D = r1
            X.8ZP r1 = X.AnonymousClass8ZO.A00(r19)
            r11.A0C = r1
            r15 = 0
            r8 = 0
            X.1HR r13 = new X.1HR
            r13.<init>(r15)
            r11.A0M = r13
            X.02z r7 = X.106.A01(r8)
            r11.A0T = r7
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r15)
            X.02z r6 = X.DbS.A10(r16)
            r11.A0R = r6
            X.02z r5 = X.DbS.A10(r16)
            r11.A0S = r5
            X.02z r4 = X.DbS.A10(r16)
            r11.A0Q = r4
            X.02z r3 = X.DbS.A10(r16)
            r11.A0P = r3
            r29 = 0
            java.lang.Double r1 = java.lang.Double.valueOf(r29)
            X.02z r2 = X.DbS.A10(r1)
            r11.A0U = r2
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            r11.A0K = r1
            r14 = 4
            X.IHH r1 = new X.IHH
            r1.<init>(r11, r14)
            r11.A02 = r1
            r14 = 5
            X.IHH r1 = new X.IHH
            r1.<init>(r11, r14)
            r11.A03 = r1
            X.05Y r1 = X.0u9.A04(r13)
            r11.A0N = r1
            X.02z r1 = X.DbS.A10(r16)
            r11.A0O = r1
            java.util.LinkedList r13 = new java.util.LinkedList
            r13.<init>()
            r11.A0L = r13
            X.0sn r14 = X.0sn.A00
            X.8fw r13 = X.C361268fw.A00
            r10.A0a(r13, r14, r15)
            X.6oS r28 = X.C318116oQ.A00(r11)
            X.80m r12 = r12.A08
            java.lang.Object r12 = r12.A00
            X.4yO r12 = (X.C279284yO) r12
            X.28D r13 = r9.A00
            X.I1z r9 = new X.I1z
            r22 = r38
            r23 = r19
            r24 = r12
            r25 = r10
            r26 = r0
            r27 = r18
            r18 = r9
            r19 = r20
            r20 = r13
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            X.0r6 r12 = r9.A0F
            X.ImR r10 = new X.ImR
            r0 = r17
            r10.<init>(r11, r8, r0)
            X.DbY.A19(r11, r10, r12)
            X.05G r12 = r9.A0H
            r10 = 43
            X.MG9 r0 = new X.MG9
            r0.<init>(r11, r8, r10)
            X.DbY.A19(r11, r0, r12)
            r11.A0H = r9
            X.05G r13 = r9.A0I
            X.05G r12 = r9.A0G
            X.Imi r10 = new X.Imi
            r10.<init>(r11, r8)
            X.Imo r0 = X.C58122Imo.A00
            X.0pt r5 = X.AnonymousClass10H.A00(r0, r13, r6, r5)
            X.Imp r0 = X.C58123Imp.A00
            X.0pt r4 = X.AnonymousClass10H.A00(r0, r4, r3, r12)
            r3 = 47
            X.MHk r0 = new X.MHk
            r0.<init>((X.AnonymousClass4D7) r8, (java.lang.Object) r10, (int) r3)
            X.0pm r4 = X.AnonymousClass10H.A03(r0, r5, r4)
            r11.A0c = r4
            X.05G r3 = r9.A0J
            X.ImV r0 = new X.ImV
            r0.<init>(r11, r8)
            X.0pm r2 = X.AnonymousClass10H.A03(r0, r3, r2)
            r11.A0b = r2
            X.Imc r0 = new X.Imc
            r0.<init>(r11, r8)
            X.0pq r3 = X.AnonymousClass10H.A01(r0, r4, r7, r2, r1)
            X.6oS r2 = X.C318116oQ.A00(r11)
            X.109 r1 = X.AnonymousClass10A.A01
            X.HKq r28 = X.C54607HKq.A08
            X.GmQ r0 = new X.GmQ
            r27 = r8
            r31 = r15
            r26 = r0
            r26.<init>(r27, r28, r29, r31)
            X.05F r0 = X.10b.A02(r0, r2, r3, r1)
            r11.A0V = r0
            return
        L_0x0194:
            X.0sn r0 = X.0sn.A00
            goto L_0x007d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52974GgR.<init>(android.app.Application, X.GnY, X.Hpb, com.instagram.clips.audio.soundsync.repository.ClipsSoundSyncBeatsInfoRepository, X.HqU, com.instagram.clips.audio.soundsync.repository.ClipsSoundSyncMediaImportRepository, X.Hhv, com.instagram.common.session.UserSession, X.8Yz, X.8Vz, com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel, X.80x, X.8J5, java.util.List, int, boolean):void");
    }

    public static final void A02(AudioOverlayTrack audioOverlayTrack, C52974GgR ggR) {
        C52974GgR ggR2 = ggR;
        ggR.A0U.Epw(Double.valueOf(0.4d));
        AudioOverlayTrack audioOverlayTrack2 = audioOverlayTrack;
        int i = audioOverlayTrack.A03;
        int i2 = audioOverlayTrack2.A02 + i;
        int i3 = ggR2.A01 + i;
        if (i2 > i3) {
            i2 = i3;
        }
        ggR2.A0K.add(C51966G9m.A1L(new C58096ImI(audioOverlayTrack2, ggR2, (AnonymousClass4D7) null, i, i2), C318116oQ.A00(ggR2)));
    }

    /* JADX WARNING: type inference failed for: r12v1, types: [X.Iku, X.4D7] */
    /* JADX WARNING: type inference failed for: r12v4 */
    /* JADX WARNING: type inference failed for: r12v5 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.api.schemas.MusicCanonicalType r14, X.C52974GgR r15, java.lang.String r16, X.AnonymousClass4D7 r17, int r18, int r19) {
        /*
            r3 = r18
            r2 = r19
            r5 = 1
            r6 = r17
            boolean r0 = r6 instanceof X.C58062Iku
            if (r0 == 0) goto L_0x0111
            r12 = r6
            X.Iku r12 = (X.C58062Iku) r12
            int r0 = r12.A05
            if (r0 != r5) goto L_0x0111
            int r4 = r12.A02
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r1
            if (r0 == 0) goto L_0x0111
            int r4 = r4 - r1
            r12.A02 = r4
        L_0x001d:
            java.lang.Object r1 = r12.A04
            X.1Hj r4 = X.1Hj.A02
            int r0 = r12.A02
            if (r0 == 0) goto L_0x008d
            if (r0 != r5) goto L_0x016b
            int r2 = r12.A01
            int r3 = r12.A00
            java.lang.Object r15 = r12.A03
            X.GgR r15 = (X.C52974GgR) r15
            X.0eS.A00(r1)
        L_0x0032:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0155
            java.lang.Object r4 = X.C51972G9s.A0m(r1)
            X.0qQ.A07(r4)
            X.GlK r4 = (X.C53272GlK) r4
            java.lang.String r1 = r4.A01
            if (r1 == 0) goto L_0x004a
            X.05G r0 = r15.A0S
            X.AnonymousClass7TF.A1O(r0, r5)
        L_0x004a:
            X.GnY r0 = r15.A0X
            r0.A04 = r1
            java.util.List r5 = r4.A02
            if (r5 == 0) goto L_0x0118
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x0118
            int r1 = r5.size()
            X.I1z r0 = r15.A0H
            java.util.ArrayList r0 = r0.A02()
            int r0 = r0.size()
            if (r1 != r0) goto L_0x0118
            java.util.ArrayList r4 = X.AnonymousClass7TF.A0p(r5)
            java.util.Iterator r3 = r5.iterator()
        L_0x0070:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0171
            java.lang.Object r0 = r3.next()
            X.DSO r0 = (X.DSO) r0
            int r2 = r0.Bys()
            int r1 = r0.B1h()
            X.HsQ r0 = new X.HsQ
            r0.<init>(r2, r1)
            r4.add(r0)
            goto L_0x0070
        L_0x008d:
            X.0eS.A00(r1)
            r10 = r16
            if (r16 == 0) goto L_0x0170
            X.I1z r9 = r15.A0H
            java.util.ArrayList r6 = r9.A02()
            java.util.List r0 = r9.A0B
            java.util.ArrayList r7 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r8 = r0.iterator()
        L_0x00a4:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00bc
            java.lang.Object r0 = r8.next()
            X.51M r0 = (X.AnonymousClass51M) r0
            X.51R r0 = r0.A0F
            boolean r1 = r0.A0K
            r0 = 2
            if (r1 == 0) goto L_0x00b8
            r0 = 1
        L_0x00b8:
            X.AnonymousClass7TF.A1M(r7, r0)
            goto L_0x00a4
        L_0x00bc:
            com.instagram.clips.audio.soundsync.repository.ClipsSoundSyncMediaImportRepository r0 = r9.A07
            java.util.List r0 = r0.A02
            java.util.ArrayList r0 = X.00k.A0S(r0, r7)
            java.util.ArrayList r0 = X.00k.A0R(r6, r0)
            java.util.ArrayList r11 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r8 = r0.iterator()
        L_0x00d0:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00f3
            java.lang.Object r1 = r8.next()
            X.0eP r1 = (X.0eP) r1
            int r0 = X.C51970G9q.A0B(r1)
            int r7 = X.C51969G9p.A0A(r1)
            float r0 = (float) r0
            java.lang.Float r6 = X.C51965G9l.A0q(r0)
            r1 = 3
            X.JwA r0 = new X.JwA
            r0.<init>((int) r7, (int) r1, (java.lang.Object) r6)
            r11.add(r0)
            goto L_0x00d0
        L_0x00f3:
            X.Hpb r7 = r15.A0Y
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS
            int r0 = r15.A01
            long r0 = (long) r0
            long r0 = r6.toSeconds(r0)
            int r13 = (int) r0
            com.instagram.api.schemas.ClipsTrimmingStrategy r8 = com.instagram.api.schemas.ClipsTrimmingStrategy.TEMPLATE
            r12.A03 = r15
            r12.A00 = r3
            r12.A01 = r2
            r12.A02 = r5
            r9 = r14
            java.lang.Object r1 = r7.A00(r8, r9, r10, r11, r12, r13)
            if (r1 != r4) goto L_0x0032
            return r4
        L_0x0111:
            X.Iku r12 = new X.Iku
            r12.<init>(r15, r6, r5)
            goto L_0x001d
        L_0x0118:
            java.util.List r1 = r4.A03
            if (r1 == 0) goto L_0x0170
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0170
            X.I1z r0 = r15.A0H
            java.util.ArrayList r5 = r0.A02()
            java.util.ArrayList r4 = X.AnonymousClass7TF.A0p(r1)
            java.util.Iterator r1 = r1.iterator()
        L_0x0130:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x014f
            java.lang.Object r0 = r1.next()
            X.Gld r0 = (X.C53291Gld) r0
            int r8 = r0.A00
            boolean r7 = r0.A03
            boolean r9 = r0.A01
            boolean r10 = r0.A02
            boolean r11 = r0.A04
            com.instagram.music.common.model.MusicAssetBeatInfo r6 = new com.instagram.music.common.model.MusicAssetBeatInfo
            r6.<init>(r7, r8, r9, r10, r11)
            r4.add(r6)
            goto L_0x0130
        L_0x014f:
            int r2 = r2 - r3
            java.util.ArrayList r4 = X.C18185Vmz.A00(r5, r4, r3, r2)
            return r4
        L_0x0155:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0166
            X.I1z r0 = r15.A0H
            java.util.ArrayList r1 = r0.A02()
            int r0 = r15.A01
            java.util.List r4 = X.C18185Vmz.A01(r1, r0)
            return r4
        L_0x0166:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x016b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0170:
            r4 = 0
        L_0x0171:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52974GgR.A00(com.instagram.api.schemas.MusicCanonicalType, X.GgR, java.lang.String, X.4D7, int, int):java.lang.Object");
    }

    public static final void A03(AudioOverlayTrack audioOverlayTrack, C52974GgR ggR) {
        if (ggR.A00 || !ggR.A0H.A01) {
            A02(audioOverlayTrack, ggR);
        } else {
            ggR.A0L.add(new C57868Ihl(audioOverlayTrack, ggR));
        }
        AnonymousClass7TF.A1O(ggR.A0Q, false);
    }

    public static final void A04(C52974GgR ggR) {
        Iterator it = ggR.A0K.iterator();
        while (it.hasNext()) {
            C262204Co r1 = (C262204Co) it.next();
            if (r1.isActive()) {
                r1.AG7((CancellationException) null);
            }
            it.remove();
        }
    }

    public static final void A05(C52974GgR ggR) {
        ggR.A0E.A08 = true;
        A04(ggR);
        C56569I1z i1z = ggR.A0H;
        AnonymousClass7TF.A1O(i1z.A0G, true);
        if (i1z.A04 == 28D.A3a) {
            if (182.A06(0Tu.A05, i1z.A08, 36320768895755089L)) {
                i1z.A07.A01(AnonymousClass05K.A0Y, i1z.A03());
                AnonymousClass7TE.A1Z(new C58105ImR(ggR, (AnonymousClass4D7) null, 4), C318116oQ.A00(ggR));
            }
        }
        i1z.A07.A01(AnonymousClass05K.A00, i1z.A03());
        i1z.A01 = false;
        AnonymousClass7TE.A1Z(new C58105ImR(ggR, (AnonymousClass4D7) null, 4), C318116oQ.A00(ggR));
    }

    public static final void A06(C52974GgR ggR, Exception exc) {
        0f9 AEf = 0wj.A01.AEf("ClipsSoundSyncViewModel", 817902720);
        String message = exc.getMessage();
        if (message == null) {
            message = "";
        }
        AnonymousClass7TF.A19(AEf, DialogModule.KEY_MESSAGE, message, exc);
        C58099ImL.A01(ggR, C318116oQ.A00(ggR), 16);
    }

    public final void onCleared() {
        2Fk r1 = this.A0E.A0C;
        r1.A08(this.A02);
        r1.A08(this.A03);
        C56569I1z i1z = this.A0H;
        ClipsCreationViewModel clipsCreationViewModel = i1z.A0A;
        clipsCreationViewModel.A0K.A06.A08(i1z.A03);
        AnonymousClass831 r0 = (AnonymousClass831) clipsCreationViewModel.A0G.A02();
        if (r0 != null) {
            ClipsSoundSyncMediaImportRepository clipsSoundSyncMediaImportRepository = i1z.A07;
            ArrayList A052 = r0.A05();
            ArrayList A0r = AnonymousClass7TG.A0r(A052);
            Iterator it = A052.iterator();
            while (it.hasNext()) {
                A0r.add(new File(((AnonymousClass51M) it.next()).A0F.A0F).getAbsolutePath());
            }
            HashSet hashSet = clipsSoundSyncMediaImportRepository.A0A;
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                File file = (File) it2.next();
                if (!A0r.contains(file.getAbsolutePath())) {
                    file.delete();
                }
            }
            hashSet.clear();
        }
        i1z.A01 = false;
        i1z.A06.A00.D8U();
    }

    public static final void A01(C361278fx r5, C52974GgR ggR, List list, List list2, boolean z) {
        if (list.size() == list2.size()) {
            Iterator it = 00k.A0R(list, list2).iterator();
            while (it.hasNext()) {
                0eP r0 = (0eP) it.next();
                AnonymousClass51N r3 = (AnonymousClass51N) r0.A00;
                C56077HsQ hsQ = (C56077HsQ) r0.A01;
                if (r3 instanceof AnonymousClass51M) {
                    AnonymousClass51M r32 = (AnonymousClass51M) r3;
                    r32.A09 = hsQ.A01;
                    r32.A08 = hsQ.A00;
                } else if (r3 instanceof KN4) {
                    ((KN4) r3).A00 = hsQ.A00 - hsQ.A01;
                } else {
                    throw AnonymousClass7TE.A1K();
                }
            }
            ArrayList A0r = AnonymousClass7TG.A0r(list);
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                AnonymousClass7TF.A1M(A0r, ((AnonymousClass51N) it2.next()).BrP());
            }
            int A022 = 00k.A02(A0r);
            ArrayList A012 = C3495980z.A01(ggR.A06);
            int i = 0;
            while (i < A012.size() - 1 && ((C3495880y) A012.get(i)).A01 < A022) {
                i++;
            }
            C3495880y r4 = (C3495880y) A012.get(i);
            AnonymousClass2Fj r33 = ggR.A0F.A05;
            C3495880y r2 = (C3495880y) r33.A02();
            if (r2 != null) {
                if (r4.A01 > r2.A01) {
                    r33.A0B(r4);
                } else {
                    r4 = r2;
                }
                if ((r5 instanceof AnonymousClass8Y4) && ((AudioOverlayTrack) r5.A00()).A08 != null) {
                    AudioOverlayTrack audioOverlayTrack = (AudioOverlayTrack) r5.A00();
                    int i2 = r4.A01;
                    MusicAssetModel musicAssetModel = audioOverlayTrack.A08;
                    0qQ.A0A(musicAssetModel);
                    audioOverlayTrack.A02 = Math.min(i2, musicAssetModel.A00);
                }
            }
            ggR.A0E.A0a(r5, list, z);
            return;
        }
        throw AnonymousClass7TE.A0z(002.A02(list.size(), list2.size(), "segment size mismatch: ", ", "));
    }

    public final boolean onBackPressed() {
        C58099ImL.A01(this, C318116oQ.A00(this), 17);
        return true;
    }
}
