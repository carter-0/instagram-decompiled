package X;

import android.content.Context;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import java.io.File;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;

/* renamed from: X.Rdc  reason: case insensitive filesystem */
public abstract class C9598Rdc {
    /* JADX WARNING: type inference failed for: r2v1, types: [X.SHv, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v15, types: [X.Tgv, X.Srl, java.lang.Object] */
    public static final File A00(Context context, C66093MBb mBb, C11354SOn sOn, C13589TdH tdH, MediaComposition mediaComposition, SFQ sfq, File file, ExecutorService executorService, int i, int i2, int i3, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        long j2;
        STP stp;
        Object srk;
        0rm A11 = C51965G9l.A11();
        0rm A112 = C51965G9l.A11();
        C7956Qdx qdx = new C7956Qdx(mBb, A11, A112);
        SQv sQv = new SQv();
        sQv.A0D = file;
        sQv.A08 = mediaComposition;
        sQv.A06 = sOn;
        sQv.A0C = sfq;
        sQv.A07 = qdx;
        long j3 = -1;
        int i4 = i;
        if (i > 0) {
            j2 = (long) i4;
        } else {
            j2 = -1;
        }
        sQv.A04 = j2;
        int i5 = i2;
        if (i2 > 0) {
            j3 = (long) i5;
        }
        sQv.A00 = j3;
        boolean z10 = z7;
        boolean z11 = z6;
        boolean z12 = z5;
        boolean z13 = z4;
        boolean z14 = z3;
        boolean z15 = z2;
        boolean z16 = z;
        sQv.A0B = new C7966QeE(i3, j, z16, z14, z13, z15, z12, z11, z10, z8, z9);
        C10862RzN rzN = new C10862RzN(sQv);
        ? obj = new Object();
        obj.A0C = rzN;
        obj.A00 = context;
        if (sfq == null) {
            stp = null;
        } else {
            stp = new STP();
        }
        obj.A05 = stp;
        obj.A07 = tdH;
        obj.A0E = executorService;
        C7235Q0h q0h = C9955RkA.A00;
        obj.A0A = new C12350Srw(q0h);
        if (mediaComposition == null) {
            srk = new Object();
        } else {
            srk = new C12338Srk();
        }
        obj.A08 = (C13590TdI) srk;
        ? obj2 = new Object();
        obj2.A00 = q0h;
        obj.A09 = obj2;
        try {
            SRj.A00(obj.A01()).FNH();
            Throwable th = (Throwable) A112.A00;
            if (th == null) {
                File file2 = (File) A11.A00;
                if (file2 != null) {
                    return file2;
                }
                throw new Exception("Failed to generate file");
            }
            throw Pxi.A0H("Failure when trimming video", th);
        } catch (ExecutionException e) {
            throw Pxi.A0H("Failure when trimming video", e);
        } catch (InterruptedException e2) {
            throw Pxi.A0H("Failure when trimming video", e2);
        }
    }
}
