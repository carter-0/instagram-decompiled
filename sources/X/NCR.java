package X;

import com.facebook.rsys.audio.gen.AudioApi;
import com.facebook.rsys.audio.gen.AudioDeviceModule;
import com.facebook.rsys.audio.gen.AudioInputRoute;
import com.facebook.rsys.audio.gen.AudioOutputRoute;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.Executor;

public final class NCR extends NCS {
    public AudioApi A00;
    public C74295PsU A01;
    public String A02 = AudioOutputRoute.UNKNOWN.identifier;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public AudioDeviceModule A07;
    public Executor A08;
    public final ODF A09;
    public final OUV A0A;
    public final Collection A0B = Collections.synchronizedCollection(AnonymousClass7TE.A1C());
    public final boolean A0C;
    public final Object A0D = new Object();
    public volatile AudioOutputRoute A0E;

    public final void A00(AudioOutputRoute audioOutputRoute) {
        0qQ.A0B(audioOutputRoute, 0);
        OUV ouv = this.A0A;
        if (ouv != null) {
            ouv.A00(002.A0R("product route update ", audioOutputRoute.name), new Object[0]);
        }
        this.A0E = audioOutputRoute;
        C73166PY1 py1 = new C73166PY1(audioOutputRoute, this);
        if (this.A00 != null) {
            py1.run();
        } else {
            this.A0B.add(py1);
        }
    }

    public final void setApi(AudioApi audioApi) {
        0qQ.A0B(audioApi, 0);
        this.A00 = audioApi;
        Collection<Runnable> collection = this.A0B;
        0qQ.A06(collection);
        synchronized (collection) {
            for (Runnable run : collection) {
                run.run();
            }
            collection.clear();
        }
    }

    public final void setAudioDeviceModule(AudioDeviceModule audioDeviceModule) {
        0qQ.A0B(audioDeviceModule, 0);
        synchronized (this.A0D) {
            this.A07 = audioDeviceModule;
        }
    }

    public final void setAudioInputRoute(AudioInputRoute audioInputRoute) {
    }

    public final void setAudioOutputRoute(AudioOutputRoute audioOutputRoute, boolean z, boolean z2) {
        0qQ.A0B(audioOutputRoute, 0);
        C73283Pa1 pa1 = new C73283Pa1(audioOutputRoute, this, z);
        Executor executor = this.A08;
        if (executor == null) {
            pa1.run();
        } else {
            executor.execute(pa1);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: X.NDz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: X.NDy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: X.NDy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: X.NDy} */
    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, X.PvL] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public NCR(android.content.Context r27, X.C74295PsU r28, X.C69729NrE r29, X.C74437Pus r30, X.OUV r31, X.O27 r32, X.1XD r33, java.lang.Integer r34, java.util.concurrent.Executor r35, java.util.concurrent.ExecutorService r36, X.C262094Cc r37, boolean r38) {
        /*
            r26 = this;
            r2 = r26
            r2.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.A0D = r0
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            java.util.Collection r0 = java.util.Collections.synchronizedCollection(r0)
            r2.A0B = r0
            com.facebook.rsys.audio.gen.AudioOutputRoute r0 = com.facebook.rsys.audio.gen.AudioOutputRoute.UNKNOWN
            java.lang.String r0 = r0.identifier
            r2.A02 = r0
            r0 = r35
            r2.A08 = r0
            r0 = r38
            r2.A0C = r0
            r4 = 0
            r11 = r31
            r2.A0A = r11
            r0 = r28
            r2.A01 = r0
            X.OKC r7 = new X.OKC
            r7.<init>(r2)
            X.OqS r3 = new X.OqS
            r3.<init>()
            java.lang.String r0 = "audio"
            r5 = r27
            java.lang.Object r6 = r5.getSystemService(r0)
            r0 = 4
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r6, r0)
            android.media.AudioManager r6 = (android.media.AudioManager) r6
            X.OZz r1 = new X.OZz
            r9 = r29
            r10 = r30
            r15 = r37
            r17 = r5
            r18 = r6
            r19 = r9
            r20 = r10
            r21 = r11
            r22 = r15
            r16 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22)
            X.ONv r12 = new X.ONv
            r12.<init>(r6)
            int r0 = r34.intValue()
            r13 = r32
            r14 = r36
            if (r0 == r4) goto L_0x0096
            r24 = r33
            if (r33 == 0) goto L_0x00a1
            X.NDy r4 = new X.NDy
            r15 = r4
            r16 = r5
            r17 = r6
            r18 = r7
            r19 = r1
            r22 = r12
            r23 = r13
            r25 = r14
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
        L_0x0089:
            X.OW7 r1 = new X.OW7
            r1.<init>(r6, r11, r3)
            X.ODF r0 = new X.ODF
            r0.<init>(r4, r11, r1)
            r2.A09 = r0
            return
        L_0x0096:
            X.OYs r8 = new X.OYs
            r8.<init>(r1, r10, r11)
            X.NDz r4 = new X.NDz
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x0089
        L_0x00a1:
            java.lang.String r0 = "ConnectionServiceAudioOutputManagerImpl requires a CallAudioStateManager implementation"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NCR.<init>(android.content.Context, X.PsU, X.NrE, X.Pus, X.OUV, X.O27, X.1XD, java.lang.Integer, java.util.concurrent.Executor, java.util.concurrent.ExecutorService, X.4Cc, boolean):void");
    }

    public final ArrayList createAvailableAudioInputRoutes() {
        return 0sr.A1L(new AudioInputRoute[]{AudioInputRoute.DEFAULT});
    }

    public final ArrayList createAvailableAudioOutputRoutes() {
        return 0sr.A1L(new AudioOutputRoute[]{AudioOutputRoute.UNKNOWN, AudioOutputRoute.EARPIECE, AudioOutputRoute.SPEAKER, AudioOutputRoute.HEADSET, AudioOutputRoute.BLUETOOTH});
    }

    public final void setAudioOn(boolean z, boolean z2) {
        C73168PY3 py3 = new C73168PY3(this, z);
        Executor executor = this.A08;
        if (executor == null) {
            py3.run();
        } else {
            executor.execute(py3);
        }
    }

    public final void setIsCallActive(boolean z) {
        C73169PY4 py4 = new C73169PY4(this, z);
        Executor executor = this.A08;
        if (executor == null) {
            py4.run();
        } else {
            executor.execute(py4);
        }
    }
}
