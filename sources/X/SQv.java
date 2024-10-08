package X;

import android.graphics.RectF;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import java.io.File;
import java.util.HashSet;

public final class SQv {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public RectF A05;
    public C11354SOn A06;
    public C13834Ti9 A07;
    public MediaComposition A08;
    public C10954S2m A09;
    public C9608Rdm A0A;
    public C7334Q4k A0B;
    public SFQ A0C;
    public File A0D;
    public String A0E;
    public String A0F;
    public HashSet A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;

    public static void A01(SQv sQv) {
        sQv.A05 = new RectF(0.0f, 0.0f, 1.0f, 1.0f);
        sQv.A04 = -1;
        sQv.A00 = -1;
        sQv.A0H = false;
        sQv.A0I = false;
        sQv.A02 = -1;
        sQv.A0G = new HashSet();
        sQv.A09 = null;
    }

    public static C10862RzN A00(MediaComposition mediaComposition, C10862RzN rzN) {
        SQv sQv = new SQv(rzN);
        sQv.A08 = mediaComposition;
        return new C10862RzN(sQv);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, X.Rdm] */
    public SQv(C10862RzN rzN) {
        A01(this);
        try {
            this.A0A = new Object();
            this.A0D = rzN.A0D;
            String str = rzN.A0F;
            if (str != null) {
                this.A0F = str;
            }
            this.A08 = rzN.A08;
            this.A05 = rzN.A05;
            this.A04 = rzN.A04;
            this.A00 = rzN.A00;
            this.A0H = rzN.A0H;
            this.A0I = rzN.A0I;
            this.A07 = rzN.A07;
            this.A06 = rzN.A06;
            this.A0C = rzN.A0C;
            this.A0L = rzN.A0L;
            this.A0K = rzN.A0K;
            this.A0J = rzN.A0J;
            this.A0B = rzN.A0B;
            this.A0P = rzN.A0O;
            this.A0Q = rzN.A0P;
            this.A0M = rzN.A0M;
            this.A02 = rzN.A03;
            this.A0A = rzN.A0A;
            this.A0N = rzN.A0N;
            this.A0O = rzN.A0Q;
            this.A0G = rzN.A0G;
            this.A09 = rzN.A09;
            this.A0E = rzN.A0E;
        } catch (AnonymousClass4ZS e) {
            throw C41845B3m.A0j(e);
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, X.Rdm] */
    public SQv() {
        A01(this);
        try {
            this.A0A = new Object();
        } catch (AnonymousClass4ZS e) {
            throw C41845B3m.A0j(e);
        }
    }
}
