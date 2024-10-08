package X;

import androidx.media3.common.DrmInitData;
import androidx.media3.common.Metadata;
import com.google.common.collect.ImmutableList;
import java.util.List;

public final class SOW {
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
    public int A0K;
    public int A0L;
    public long A0M;
    public SRQ A0N;
    public DrmInitData A0O;
    public Metadata A0P;
    public Object A0Q;
    public String A0R;
    public String A0S;
    public String A0T;
    public String A0U;
    public String A0V;
    public String A0W;
    public List A0X;
    public List A0Y;
    public byte[] A0Z;

    public static SOW A00() {
        return new SOW();
    }

    public SOW(SJM sjm) {
        this.A0T = sjm.A0V;
        this.A0U = sjm.A0W;
        this.A0Y = sjm.A0a;
        this.A0V = sjm.A0X;
        this.A0H = sjm.A0J;
        this.A0E = sjm.A0G;
        this.A03 = sjm.A04;
        this.A0D = sjm.A0F;
        this.A0R = sjm.A0T;
        this.A0P = sjm.A0R;
        this.A0Q = sjm.A0S;
        this.A0S = sjm.A0U;
        this.A0W = sjm.A0Y;
        this.A0A = sjm.A0C;
        this.A0B = sjm.A0D;
        this.A0X = sjm.A0Z;
        this.A0O = sjm.A0Q;
        this.A0M = sjm.A0O;
        this.A0L = sjm.A0N;
        this.A09 = sjm.A0B;
        this.A00 = sjm.A01;
        this.A0F = sjm.A0H;
        this.A01 = sjm.A02;
        this.A0Z = sjm.A0b;
        this.A0I = sjm.A0K;
        this.A0N = sjm.A0P;
        this.A04 = sjm.A06;
        this.A0G = sjm.A0I;
        this.A0C = sjm.A0E;
        this.A07 = sjm.A09;
        this.A08 = sjm.A0A;
        this.A02 = sjm.A03;
        this.A06 = sjm.A08;
        this.A0J = sjm.A0L;
        this.A0K = sjm.A0M;
        this.A05 = sjm.A07;
    }

    public final void A01(String str) {
        this.A0W = SQX.A02(str);
    }

    public SOW() {
        this.A0Y = ImmutableList.of();
        this.A03 = -1;
        this.A0D = -1;
        this.A0A = -1;
        this.A0B = -1;
        this.A0M = Long.MAX_VALUE;
        this.A0L = -1;
        this.A09 = -1;
        this.A00 = -1.0f;
        this.A01 = 1.0f;
        this.A0I = -1;
        this.A04 = -1;
        this.A0G = -1;
        this.A0C = -1;
        this.A02 = -1;
        this.A06 = 1;
        this.A0J = -1;
        this.A0K = -1;
        this.A05 = 0;
    }
}
