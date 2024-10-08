package X;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import com.google.android.exoplayer2.audio.DefaultAudioSink;
import com.google.common.collect.ImmutableList;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.Collection;
import java.util.List;

/* renamed from: X.4Xp  reason: invalid class name and case insensitive filesystem */
public class C266114Xp extends AnonymousClass4TZ implements C264374Pq {
    public int A00;
    public C256683wB A01;
    public C256683wB A02;
    public C289895eP A03;
    public boolean A04;
    public long A05;
    public boolean A06;
    public boolean A07;
    public final Context A08;
    public final AnonymousClass4QF A09;
    public final AnonymousClass4Q2 A0A;
    public final boolean A0B;

    public final void A0J() {
        try {
            super.A0J();
        } finally {
            if (this.A07) {
                this.A07 = false;
                this.A0A.reset();
            }
        }
    }

    public final void A0K() {
        this.A07 = true;
        this.A02 = null;
        try {
            this.A0A.flush();
            super.A0K();
        } catch (Throwable th) {
            super.A0K();
            throw th;
        } finally {
            this.A09.A00(this.A0E);
        }
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
        return "MediaCodecAudioRenderer2";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C266114Xp(android.content.Context r14, android.os.Handler r15, X.AnonymousClass4PH r16, X.AnonymousClass2SB r17, X.AnonymousClass4PB r18, X.AnonymousClass4Q2 r19, X.C284785Nx r20, X.C256823wP r21, boolean r22, boolean r23) {
        /*
            r13 = this;
            r1 = r19
            r11 = 0
            r10 = 1
            r8 = 0
            r9 = 1194083328(0x472c4400, float:44100.0)
            r3 = r13
            r4 = r16
            r5 = r17
            r6 = r20
            r7 = r21
            r12 = r23
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            android.content.Context r0 = r14.getApplicationContext()
            r13.A08 = r0
            r13.A0A = r1
            r0 = r22
            r13.A0B = r0
            X.4QF r0 = new X.4QF
            r2 = r18
            r0.<init>(r15, r2)
            r13.A09 = r0
            X.5O0 r0 = new X.5O0
            r0.<init>(r13)
            com.google.android.exoplayer2.audio.DefaultAudioSink r1 = (com.google.android.exoplayer2.audio.DefaultAudioSink) r1
            r1.A0E = r0
            boolean r0 = r5.A06
            r1.A0M = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C266114Xp.<init>(android.content.Context, android.os.Handler, X.4PH, X.2SB, X.4PB, X.4Q2, X.5Nx, X.3wP, boolean, boolean):void");
    }

    public static ImmutableList A00(C256683wB r3, AnonymousClass4Q2 r4, C256823wP r5, boolean z) {
        2Km A012;
        String str = r3.A0W;
        if (str == null) {
            return ImmutableList.of();
        }
        if (((DefaultAudioSink) r4).B7U(r3) != 0 && (A012 = 2BR.A01("audio/raw")) != null) {
            return ImmutableList.of(A012);
        }
        List Ave = r5.Ave(str, z, false);
        String A032 = 2BR.A03(r3);
        if (A032 == null) {
            return ImmutableList.copyOf((Collection) Ave);
        }
        List Ave2 = r5.Ave(A032, z, false);
        ImmutableList.Builder builder = ImmutableList.builder();
        builder.addAll(Ave);
        builder.addAll(Ave2);
        return builder.build();
    }

    private void A01() {
        long AuK = this.A0A.AuK(CSi());
        if (AuK != Long.MIN_VALUE) {
            if (!this.A04) {
                AuK = Math.max(this.A05, AuK);
            }
            this.A05 = AuK;
            this.A04 = false;
        }
    }

    public final C290365fC A0R(AnonymousClass4PO r6) {
        C256683wB r0 = r6.A00;
        r0.getClass();
        this.A02 = r0;
        C290365fC A0R = super.A0R(r6);
        AnonymousClass4QF r3 = this.A09;
        r3.A00.post(new C296465q6(this.A02, r3, A0R));
        return A0R;
    }

    public final void A0i(AnonymousClass4PQ r8) {
        if (this.A06 && (r8.A00 & AnonymousClass972.MUTABLE_FLAG_MASK) != Integer.MIN_VALUE) {
            long j = r8.A01;
            if (Math.abs(j - this.A05) > 500000) {
                this.A05 = j;
            }
            this.A06 = false;
        }
    }

    public final AnonymousClass4P7 BdA() {
        return DefaultAudioSink.A02((DefaultAudioSink) this.A0A).A02;
    }

    public final long Bds() {
        if (this.A01 == 2) {
            A01();
        }
        return this.A05;
    }

    public boolean CSi() {
        if (!this.A0Z) {
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
        A01();
        this.A0A.pause();
    }

    public void A0L(long j, boolean z) {
        super.A0L(j, z);
        this.A0A.flush();
        this.A05 = j;
        this.A06 = true;
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
            X.4Xn r2 = r4.A0E
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
        throw new UnsupportedOperationException("Method not decompiled: X.C266114Xp.A0M(boolean, boolean):void");
    }
}
