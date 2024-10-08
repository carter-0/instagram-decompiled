package X;

import com.facebook.common.dextricks.Constants;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;

public final class TGY implements Runnable {
    public final /* synthetic */ S3O A00;
    public final /* synthetic */ List A01;

    public TGY(S3O s3o, List list) {
        this.A01 = list;
        this.A00 = s3o;
    }

    public final void run() {
        S3O s3o;
        ExecutionException executionException;
        Throwable th;
        try {
            List<SRW> list = this.A01;
            if (list.size() > 1) {
                LinkedHashMap A1H = AnonymousClass7TE.A1H();
                for (SRW srw : list) {
                    ((List) JTS.A0h(srw.A0M, A1H)).add(srw.A0N.getPath());
                }
                0sn A1B = Pxe.A1B(C266714aE.VIDEO, A1H);
                if (A1B == null) {
                    A1B = 0sn.A00;
                }
                0sn A1B2 = Pxe.A1B(C266714aE.AUDIO, A1H);
                if (A1B2 == null) {
                    A1B2 = 0sn.A00;
                }
                if (A1B2.size() <= 1) {
                    S3O s3o2 = this.A00;
                    ArrayList A0p = AnonymousClass7TF.A0p(A1B2);
                    Iterator it = A1B2.iterator();
                    while (it.hasNext()) {
                        A0p.add(new SE7(AnonymousClass7TE.A0t(AnonymousClass7TE.A18(it)), 0));
                    }
                    ArrayList A0p2 = AnonymousClass7TF.A0p(A1B);
                    Iterator it2 = A1B.iterator();
                    while (it2.hasNext()) {
                        A0p2.add(new SE7(AnonymousClass7TE.A0t(AnonymousClass7TE.A18(it2))));
                    }
                    File A0t = AnonymousClass7TE.A0t(s3o2.A06);
                    C13589TdH tdH = STf.A01;
                    try {
                        STf sTf = STf.A00;
                        STf.A05(A0p2);
                        STf.A04(sTf, tdH, A0t, A0p2, A0p, Constants.LOAD_RESULT_NEED_REOPTIMIZATION);
                    } catch (C351748Af e) {
                        0qQ.A0B("Exception thrown while stitching the media files", 1);
                        th = new Exception("Exception thrown while stitching the media files", e);
                    } catch (IOException e2) {
                        0qQ.A0B("Exception thrown while stitching the media files", 1);
                        th = new Exception("Exception thrown while stitching the media files", e2);
                    }
                } else {
                    th = AnonymousClass7TE.A0z("Cannot stitch a video file with multiple audio tracks");
                    throw th;
                }
            }
            s3o = this.A00;
            AnonymousClass3Q2 r1 = s3o.A05;
            r1.A0j.A02 = true;
            String str = s3o.A06;
            r1.A0i(str);
            r1.A0h(str);
            r1.A0P();
            28K.A00(s3o.A04).A0A();
        } catch (IOException e3) {
            s3o = this.A00;
            executionException = new ExecutionException(e3);
            s3o.A00 = executionException;
        } catch (RuntimeException e4) {
            s3o = this.A00;
            executionException = new ExecutionException(e4);
            s3o.A00 = executionException;
        } catch (C351748Af e5) {
            s3o = this.A00;
            s3o.A00 = new ExecutionException(e5);
            0wb.A07("IGVideoResultProcessor", e5);
        } catch (Throwable th2) {
            S3O s3o3 = this.A00;
            s3o3.A01 = false;
            s3o3.A07.countDown();
            throw th2;
        }
        s3o.A01 = false;
        s3o.A07.countDown();
    }
}
