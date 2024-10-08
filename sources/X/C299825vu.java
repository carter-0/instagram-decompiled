package X;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;

/* renamed from: X.5vu  reason: invalid class name and case insensitive filesystem */
public final class C299825vu {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final C256683wB A07;
    public final boolean A08;
    public final C264394Ps[] A09;

    public static AudioAttributes A00(AnonymousClass4QB r1, boolean z) {
        if (z) {
            return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }
        C298965uM r0 = r1.A00;
        if (r0 == null) {
            r0 = new C298965uM(r1);
            r1.A00 = r0;
        }
        return r0.A00;
    }

    public static AudioTrack A01(AnonymousClass4QB r4, C299825vu r5, int i, boolean z) {
        int i2 = r5.A06;
        int i3 = r5.A02;
        AudioTrack.Builder audioFormat = new AudioTrack.Builder().setAudioAttributes(A00(r4, z)).setAudioFormat(new AudioFormat.Builder().setSampleRate(i2).setChannelMask(i3).setEncoding(r5.A03).build());
        boolean z2 = true;
        AudioTrack.Builder sessionId = audioFormat.setTransferMode(1).setBufferSizeInBytes(r5.A00).setSessionId(i);
        if (r5.A04 != 1) {
            z2 = false;
        }
        return sessionId.setOffloadedPlayback(z2).build();
    }

    public C299825vu(C256683wB r1, C264394Ps[] r2, int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        this.A07 = r1;
        this.A01 = i;
        this.A04 = i2;
        this.A05 = i3;
        this.A06 = i4;
        this.A02 = i5;
        this.A03 = i6;
        this.A00 = i7;
        this.A09 = r2;
        this.A08 = z;
    }
}
