package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import java.io.File;
import java.util.List;

/* renamed from: X.SsO  reason: case insensitive filesystem */
public final class C12375SsO implements C13855Tia {
    public int A00 = -1;
    public long A01 = 0;
    public Context A02;
    public C249903kY A03;
    public C13724Tfu A04;
    public C13854TiZ A05;
    public C10862RzN A06;
    public C13726Tfw A07;
    public boolean A08;
    public long A09 = C10076RmE.A00;
    public boolean A0A;
    public final CallerContext A0B = CallerContext.A01("PhotoDemuxDecodeWrapper");

    public final S6U BPw() {
        return null;
    }

    public final boolean CRE() {
        return false;
    }

    public final void FM5(C266724aF r1) {
    }

    public final void FNL() {
    }

    public final void cancel() {
    }

    /* JADX INFO: finally extract failed */
    private void A00() {
        if (!this.A08) {
            try {
                C249903kY r0 = this.A03;
                r0.getClass();
                C13854TiZ tiZ = this.A05;
                tiZ.getClass();
                tiZ.FJk(this.A00, (Bitmap) r0.A05());
                C249903kY r02 = this.A03;
                if (r02 != null) {
                    r02.close();
                    this.A03 = null;
                }
                this.A08 = true;
            } catch (Throwable th) {
                C249903kY r03 = this.A03;
                if (r03 != null) {
                    r03.close();
                    this.A03 = null;
                }
                throw th;
            }
        }
    }

    public final void AIw(int i) {
        boolean z;
        this.A00 = i;
        C10862RzN rzN = this.A06;
        MediaComposition mediaComposition = rzN.A08;
        mediaComposition.getClass();
        C266794aM A042 = mediaComposition.A04(C266714aE.VIDEO, this.A00);
        if (A042 != null) {
            List list = A042.A04;
            if (!AnonymousClass7TE.A1D(list).isEmpty()) {
                int i2 = ((C266754aI) AnonymousClass7TE.A1D(list).get(0)).A00;
                AnonymousClass7TE.A1D(list).get(0);
                C7334Q4k q4k = rzN.A0B;
                if (q4k instanceof C7964QeC) {
                    C7964QeC qeC = (C7964QeC) q4k;
                    if (1 - qeC.A00 == 0) {
                        z = ((SJN) qeC.A01).A0n;
                    }
                    z = false;
                } else {
                    if (q4k instanceof C7967QeF) {
                        z = true;
                    }
                    z = false;
                }
                this.A0A = z;
                long j = C10076RmE.A00;
                if (i2 > 0) {
                    j = (long) (Pxg.A00() / ((double) i2));
                }
                this.A09 = j;
            }
        }
        this.A05 = this.A07.ALq();
    }

    public final long Avc() {
        return this.A01;
    }

    public final void release() {
        C13854TiZ tiZ = this.A05;
        if (tiZ != null) {
            tiZ.AVT();
        }
        C249903kY r0 = this.A03;
        if (r0 != null) {
            r0.close();
        }
    }

    public final void start() {
        MediaComposition mediaComposition = this.A06.A08;
        mediaComposition.getClass();
        C266794aM A042 = mediaComposition.A04(C266714aE.VIDEO, this.A00);
        A042.getClass();
        File file = ((C266754aI) AnonymousClass7TE.A12(AnonymousClass7TE.A1D(A042.A04))).A04;
        C266784aL.A05(file);
        Uri fromFile = Uri.fromFile(file);
        C13724Tfu tfu = this.A04;
        C266784aL.A05(tfu);
        C249903kY CgF = tfu.CgF(this.A02, fromFile, this.A0B);
        this.A03 = CgF;
        if (CgF == null) {
            throw JTO.A0u("Bitmap cannot be loaded");
        }
    }

    public C12375SsO(Context context, C13724Tfu tfu, C10862RzN rzN, C13726Tfw tfw) {
        this.A02 = context;
        this.A04 = tfu;
        this.A06 = rzN;
        this.A07 = tfw;
    }

    public final long ANt() {
        A00();
        long j = this.A01;
        this.A01 = this.A09 + j;
        return j;
    }

    public final void ANu(long j) {
        A00();
        if (!this.A0A) {
            this.A01 = j;
            return;
        }
        while (this.A01 <= j) {
            ANt();
        }
    }

    public final void EKz(long j) {
        A00();
        this.A01 = j;
    }
}
