package X;

import android.os.Handler;
import android.telephony.PhoneStateListener;
import java.util.List;

public final class NDz extends OOE {
    public PhoneStateListener A00;
    public Integer A01;
    public Runnable A02;
    public C262204Co A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final Handler A07 = AnonymousClass7TF.A0D();
    public final OKC A08;
    public final C71017OYs A09;
    public final C69729NrE A0A;
    public final AnonymousClass0eM A0B;
    public final C262094Cc A0C;
    public volatile boolean A0D;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public NDz(android.content.Context r13, android.media.AudioManager r14, X.OKC r15, X.C71017OYs r16, X.C69729NrE r17, X.C74437Pus r18, X.OUV r19, X.C70843ONv r20, X.O27 r21, java.util.concurrent.ExecutorService r22, X.C262094Cc r23) {
        /*
            r12 = this;
            r0 = 3
            r5 = r14
            X.0qQ.A0B(r14, r0)
            r3 = r12
            r4 = r13
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            r11 = r22
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r0 = r16
            r12.A09 = r0
            r12.A08 = r15
            r12.A0A = r6
            r0 = r23
            r12.A0C = r0
            android.os.Handler r0 = X.AnonymousClass7TF.A0D()
            r12.A07 = r0
            X.0eO r2 = X.0eO.A02
            r1 = 11
            X.Pln r0 = new X.Pln
            r0.<init>(r13, r1)
            X.0eM r0 = X.AnonymousClass0eN.A00(r2, r0)
            r12.A0B = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NDz.<init>(android.content.Context, android.media.AudioManager, X.OKC, X.OYs, X.NrE, X.Pus, X.OUV, X.ONv, X.O27, java.util.concurrent.ExecutorService, X.4Cc):void");
    }

    public final void A0C() {
        C69377NkH nkH;
        C69377NkH nkH2 = this.aomCurrentAudioOutput;
        int i = this.A09.A05.A00;
        if (i == 1 || i == 2) {
            nkH = C69377NkH.BLUETOOTH;
        } else if (this.A0D) {
            nkH = C69377NkH.SPEAKERPHONE;
        } else if (this.aomIsHeadsetAttached) {
            nkH = C69377NkH.HEADSET;
        } else {
            nkH = C69377NkH.EARPIECE;
        }
        this.aomCurrentAudioOutput = nkH;
        if (nkH2 != this.aomCurrentAudioOutput) {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("determineAndSetCurrentAudioOutput from ");
            A1A.append(nkH2);
            A1A.append(" to ");
            String A0i = AnonymousClass7TF.A0i(this.aomCurrentAudioOutput, A1A);
            this.A05.A00(A0i, new Object[0]);
            this.audioManagerQplLogger.CmO("current_audio_output_changed", A0i);
            A05();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0042, code lost:
        if (r6.aomIsHeadsetAttached != false) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03() {
        /*
            r6 = this;
            super.A03()
            X.OYs r4 = r6.A09
            android.content.Context r3 = r6.A01
            r5 = 0
            boolean r1 = X.C69733NrI.A00()
            r0 = 130(0x82, float:1.82E-43)
            java.lang.String r2 = X.AnonymousClass000.A00(r0)
            if (r1 == 0) goto L_0x001b
            int r1 = X.02K.A00(r3, r2)
            r0 = -1
            if (r1 == r0) goto L_0x0028
        L_0x001b:
            boolean r0 = X.C69733NrI.A00()
            if (r0 == 0) goto L_0x00a5
            int r1 = r3.checkSelfPermission(r2)
            r0 = -1
            if (r1 != r0) goto L_0x00a5
        L_0x0028:
            X.O5k r0 = new X.O5k
            r0.<init>(r6)
            r4.A01 = r0
            X.OZz r1 = r4.A05
            X.OJP r0 = r4.A04
            r1.A03(r0)
            X.ONv r2 = r6.A06
            r2.A00(r3)
            boolean r0 = r6.aomDisableEarpieceMode
            if (r0 == 0) goto L_0x0044
            boolean r1 = r6.aomIsHeadsetAttached
            r0 = 1
            if (r1 == 0) goto L_0x0045
        L_0x0044:
            r0 = 0
        L_0x0045:
            r6.A0D = r0
            boolean r0 = r6.A0D
            r2.A02(r0)
            r6.A0D()
            X.4Co r0 = r6.A03
            X.C51970G9q.A1S(r0)
            java.lang.Runnable r1 = r6.A02
            if (r1 == 0) goto L_0x005d
            android.os.Handler r0 = r6.A07
            r0.removeCallbacks(r1)
        L_0x005d:
            java.lang.Runnable r4 = r6.A02
            if (r4 != 0) goto L_0x0068
            X.PUb r4 = new X.PUb
            r4.<init>(r6)
            r6.A02 = r4
        L_0x0068:
            X.NrE r1 = r6.A0A
            boolean r0 = r1 instanceof X.NE0
            if (r0 == 0) goto L_0x00c7
            X.NE0 r1 = (X.NE0) r1
            com.instagram.common.session.UserSession r3 = r1.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36316173281005577(0x81055e00041009, double:3.029832444175657E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x009d
            X.4Cc r0 = r6.A0C
            X.19S r3 = X.19E.A02(r0)
            r2 = 0
            r1 = 33
            X.JTh r0 = new X.JTh
            r0.<init>((java.lang.Object) r4, (X.AnonymousClass4D7) r2, (int) r1)
            X.1Er r0 = X.C51966G9m.A1L(r0, r3)
            r6.A03 = r0
        L_0x0093:
            r6.A07()
            r6.A06()
            r6.A05()
            return
        L_0x009d:
            android.os.Handler r2 = r6.A07
            r0 = 1000(0x3e8, double:4.94E-321)
            r2.postDelayed(r4, r0)
            goto L_0x0093
        L_0x00a5:
            boolean r0 = r6.A04
            if (r0 == 0) goto L_0x00b8
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.String r2 = "RtcAudioOutputManager"
            java.lang.String r1 = "Missed unregistering PhoneStateListener."
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r5)
            X.0KC.A0O(r2, r1, r0)
            goto L_0x0028
        L_0x00b8:
            r0 = 1
            r6.A04 = r0
            X.PUc r1 = new X.PUc
            r1.<init>(r6)
            android.os.Handler r0 = r6.A07
            r0.post(r1)
            goto L_0x0028
        L_0x00c7:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NDz.A03():void");
    }

    public final void A04() {
        super.A04();
        this.A0D = false;
        C51970G9q.A1S(this.A03);
        Runnable runnable = this.A02;
        if (runnable != null) {
            this.A07.removeCallbacks(runnable);
        }
    }

    public final void A0D() {
        A0C();
        C71064Oaj.A02(this.audioRecordMonitor, "recording_config_on_updating_audio_output", (List) null);
        this.A08.A00(this.aomCurrentAudioOutput);
    }
}
