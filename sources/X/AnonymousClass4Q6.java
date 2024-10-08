package X;

import android.media.AudioTrack;
import android.os.SystemClock;
import com.google.android.exoplayer2.util.Util;
import java.lang.reflect.Method;

/* renamed from: X.4Q6  reason: invalid class name */
public final class AnonymousClass4Q6 {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public long A0D;
    public long A0E;
    public long A0F;
    public long A0G;
    public long A0H;
    public long A0I;
    public long A0J;
    public AudioTrack A0K;
    public C299845vw A0L;
    public Method A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public long A0R;
    public final AnonymousClass4Q5 A0S;
    public final long[] A0T;

    public AnonymousClass4Q6(AnonymousClass4Q5 r4) {
        this.A0S = r4;
        try {
            this.A0M = AudioTrack.class.getMethod("getLatency", (Class[]) null);
        } catch (NoSuchMethodException unused) {
        }
        this.A0T = new long[10];
    }

    public static long A00(AnonymousClass4Q6 r12) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = r12.A0J;
        if (j != -9223372036854775807L) {
            return Math.min(r12.A06, r12.A0I + ((Util.A05(r12.A00, (elapsedRealtime * 1000) - j) * ((long) r12.A03)) / 1000000));
        }
        if (elapsedRealtime - r12.A0R >= 5) {
            AudioTrack audioTrack = r12.A0K;
            audioTrack.getClass();
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = 4294967295L & ((long) audioTrack.getPlaybackHeadPosition());
                if (Util.A00 <= 29) {
                    if (playbackHeadPosition != 0 || r12.A0F <= 0 || playState != 3) {
                        r12.A07 = -9223372036854775807L;
                    } else if (r12.A07 == -9223372036854775807L) {
                        r12.A07 = elapsedRealtime;
                    }
                }
                if (r12.A0F > playbackHeadPosition) {
                    r12.A0G++;
                }
                r12.A0F = playbackHeadPosition;
            }
            r12.A0R = elapsedRealtime;
        }
        return r12.A0F + (r12.A0G << 32);
    }
}
