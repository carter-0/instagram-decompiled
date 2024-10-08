package X;

import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.video.ColorInfo;
import java.util.List;

/* renamed from: X.3w8  reason: invalid class name and case insensitive filesystem */
public final class C256653w8 {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public int A0J;
    public long A0K;
    public C256673wA A0L;
    public DrmInitData A0M;
    public Metadata A0N;
    public ColorInfo A0O;
    public String A0P;
    public String A0Q;
    public String A0R;
    public String A0S;
    public String A0T;
    public String A0U;
    public List A0V;
    public byte[] A0W;

    public final void A00(DrmInitData drmInitData) {
        this.A0M = drmInitData;
        if (drmInitData != null && this.A05 == 0) {
            this.A05 = 2;
        }
    }

    public C256653w8(C256683wB r3) {
        this.A0R = r3.A0T;
        this.A0S = r3.A0U;
        this.A0T = r3.A0V;
        this.A0F = r3.A0H;
        this.A0C = r3.A0E;
        this.A03 = r3.A04;
        this.A0B = r3.A0D;
        this.A0P = r3.A0R;
        this.A0N = r3.A0P;
        this.A0Q = r3.A0S;
        this.A0U = r3.A0W;
        this.A09 = r3.A0B;
        this.A0V = r3.A0X;
        this.A0M = r3.A0O;
        this.A0K = r3.A0M;
        this.A0J = r3.A0L;
        this.A08 = r3.A0A;
        this.A00 = r3.A01;
        this.A0D = r3.A0F;
        this.A01 = r3.A02;
        this.A0W = r3.A0Y;
        this.A0G = r3.A0I;
        this.A0O = r3.A0Q;
        this.A04 = r3.A06;
        this.A0E = r3.A0G;
        this.A0A = r3.A0C;
        this.A06 = r3.A08;
        this.A07 = r3.A09;
        this.A02 = r3.A03;
        this.A0H = r3.A0J;
        this.A0I = r3.A0K;
        this.A05 = r3.A07;
        this.A0L = r3.A0N;
    }

    public C256653w8() {
        this.A03 = -1;
        this.A0B = -1;
        this.A09 = -1;
        this.A0K = Long.MAX_VALUE;
        this.A0J = -1;
        this.A08 = -1;
        this.A00 = -1.0f;
        this.A01 = 1.0f;
        this.A0G = -1;
        this.A04 = -1;
        this.A0E = -1;
        this.A0A = -1;
        this.A02 = -1;
        this.A0H = -1;
        this.A0I = -1;
        this.A05 = 0;
        this.A0L = new C256673wA(new C256663w9());
    }
}
