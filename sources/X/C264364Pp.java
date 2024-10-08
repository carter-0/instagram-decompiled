package X;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.os.Handler;
import com.google.android.exoplayer2.audio.DefaultAudioSink;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.4Pp  reason: invalid class name and case insensitive filesystem */
public class C264364Pp extends AnonymousClass4PJ implements C264374Pq {
    public int A00;
    public MediaFormat A01;
    public C256683wB A02;
    public C289895eP A03;
    public boolean A04;
    public boolean A05;
    public long A06;
    public boolean A07;
    public final Context A08;
    public final AnonymousClass4QF A09;
    public final AnonymousClass4Q2 A0A;
    public final boolean A0B;

    public C264364Pp(Context context, Handler handler, AnonymousClass4PH r11, AnonymousClass2SB r12, AnonymousClass4PB r13, AnonymousClass4Q2 r14, C265114Sp r15, C256823wP r16, boolean z) {
        super(r11, r12, r15, r16, 1, false);
        this.A08 = context.getApplicationContext();
        this.A0A = r14;
        this.A0B = z;
        this.A09 = new AnonymousClass4QF(handler, r13);
        DefaultAudioSink defaultAudioSink = (DefaultAudioSink) r14;
        defaultAudioSink.A0E = new AnonymousClass4QG(this);
        defaultAudioSink.A0M = r12.A06;
    }

    public void CIs(int i, Object obj) {
        DefaultAudioSink defaultAudioSink;
        C70412O5p o5p;
        AudioDeviceInfo audioDeviceInfo;
        if (i != 2) {
            if (i == 3) {
                AnonymousClass4QB r5 = (AnonymousClass4QB) obj;
                defaultAudioSink = (DefaultAudioSink) this.A0A;
                if (!defaultAudioSink.A0D.equals(r5)) {
                    defaultAudioSink.A0D = r5;
                    if (defaultAudioSink.A0U) {
                        return;
                    }
                } else {
                    return;
                }
            } else if (i != 6) {
                switch (i) {
                    case 9:
                        AnonymousClass4Q2 r2 = this.A0A;
                        DefaultAudioSink defaultAudioSink2 = (DefaultAudioSink) r2;
                        DefaultAudioSink.A06(DefaultAudioSink.A02(defaultAudioSink2).A02, defaultAudioSink2, ((Boolean) obj).booleanValue());
                        return;
                    case 10:
                        AnonymousClass4Q2 r22 = this.A0A;
                        int intValue = ((Number) obj).intValue();
                        defaultAudioSink = (DefaultAudioSink) r22;
                        if (defaultAudioSink.A01 != intValue) {
                            defaultAudioSink.A01 = intValue;
                            boolean z = false;
                            if (intValue != 0) {
                                z = true;
                            }
                            defaultAudioSink.A0N = z;
                            break;
                        } else {
                            return;
                        }
                    case 11:
                        this.A03 = (C289895eP) obj;
                        return;
                    case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                        AudioDeviceInfo audioDeviceInfo2 = (AudioDeviceInfo) obj;
                        DefaultAudioSink defaultAudioSink3 = (DefaultAudioSink) this.A0A;
                        if (audioDeviceInfo2 == null) {
                            o5p = null;
                        } else {
                            o5p = new C70412O5p(audioDeviceInfo2);
                        }
                        defaultAudioSink3.A0G = o5p;
                        AudioTrack audioTrack = defaultAudioSink3.A0B;
                        if (audioTrack != null) {
                            if (o5p == null) {
                                audioDeviceInfo = null;
                            } else {
                                audioDeviceInfo = o5p.A00;
                            }
                            audioTrack.setPreferredDevice(audioDeviceInfo);
                            return;
                        }
                        return;
                    default:
                        return;
                }
            } else {
                AnonymousClass4QC r52 = (AnonymousClass4QC) obj;
                DefaultAudioSink defaultAudioSink4 = (DefaultAudioSink) this.A0A;
                if (!defaultAudioSink4.A0F.equals(r52)) {
                    defaultAudioSink4.A0F = r52;
                    return;
                }
                return;
            }
            defaultAudioSink.flush();
            return;
        }
        AnonymousClass4Q2 r23 = this.A0A;
        float floatValue = ((Number) obj).floatValue();
        DefaultAudioSink defaultAudioSink5 = (DefaultAudioSink) r23;
        if (defaultAudioSink5.A00 != floatValue) {
            defaultAudioSink5.A00 = floatValue;
            AudioTrack audioTrack2 = defaultAudioSink5.A0B;
            if (audioTrack2 != null) {
                audioTrack2.setVolume(floatValue);
            }
        }
    }

    public final String getName() {
        return "MediaCodecAudioRenderer";
    }

    private void A00() {
        long AuK = this.A0A.AuK(CSi());
        if (AuK != Long.MIN_VALUE) {
            if (!this.A04) {
                AuK = Math.max(this.A06, AuK);
            }
            this.A06 = AuK;
            this.A04 = false;
        }
    }

    public final void A0K() {
        try {
            this.A0A.flush();
            super.A0K();
            synchronized (this.A09) {
            }
            this.A09.A00(this.A09);
        } catch (Throwable th) {
            synchronized (this.A09) {
                this.A09.A00(this.A09);
                throw th;
            }
        }
    }

    public final void A0V(AnonymousClass4PQ r8) {
        if (this.A07 && (r8.A00 & AnonymousClass972.MUTABLE_FLAG_MASK) != Integer.MIN_VALUE) {
            long j = r8.A01;
            if (Math.abs(j - this.A06) > 500000) {
                this.A06 = j;
            }
            this.A07 = false;
        }
    }

    public final AnonymousClass4P7 BdA() {
        return DefaultAudioSink.A02((DefaultAudioSink) this.A0A).A02;
    }

    public final long Bds() {
        if (this.A01 == 2) {
            A00();
        }
        return this.A06;
    }

    public boolean CSi() {
        if (!this.A0L) {
            return false;
        }
        DefaultAudioSink defaultAudioSink = (DefaultAudioSink) this.A0A;
        if (defaultAudioSink.A0B == null) {
            return true;
        }
        if (!defaultAudioSink.A0O || defaultAudioSink.CKN()) {
            return false;
        }
        return true;
    }

    public boolean CaO() {
        if (this.A0A.CKN() || super.CaO()) {
            return true;
        }
        return false;
    }

    public final void Efz(AnonymousClass4P7 r2) {
        this.A0A.Efz(r2);
    }

    public void A0I() {
        A00();
        this.A0A.pause();
    }

    public final void A0J() {
        try {
            super.A0J();
        } finally {
            this.A0A.reset();
        }
    }

    public void A0L(long j, boolean z) {
        super.A0L(j, z);
        this.A0A.flush();
        this.A06 = j;
        this.A07 = true;
        this.A04 = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0026, code lost:
        if (r2.A0U == false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0M(boolean r5, boolean r6) {
        /*
            r4 = this;
            super.A0M(r5, r6)
            X.4QF r3 = r4.A09
            X.4Xn r2 = r4.A09
            android.os.Handler r1 = r3.A00
            X.5fG r0 = new X.5fG
            r0.<init>(r3, r2)
            r1.post(r0)
            X.4RW r0 = r4.A03
            r0.getClass()
            boolean r0 = r0.A00
            X.4Q2 r2 = r4.A0A
            com.google.android.exoplayer2.audio.DefaultAudioSink r2 = (com.google.android.exoplayer2.audio.DefaultAudioSink) r2
            if (r0 == 0) goto L_0x0035
            r1 = 1
            boolean r0 = r2.A0N
            X.C256703wD.A04(r0)
            boolean r0 = r2.A0U
            if (r0 != 0) goto L_0x002d
        L_0x0028:
            r2.A0U = r1
            r2.flush()
        L_0x002d:
            X.4Rs r0 = r4.A04
            r0.getClass()
            r2.A0C = r0
            return
        L_0x0035:
            boolean r0 = r2.A0U
            if (r0 == 0) goto L_0x002d
            r1 = 0
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C264364Pp.A0M(boolean, boolean):void");
    }

    public final void A0U(C256683wB r5) {
        super.A0U(r5);
        this.A02 = r5;
        AnonymousClass4QF r3 = this.A09;
        r3.A00.post(new C296465q6(r5, r3, (C290365fC) null));
    }
}
