package X;

import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.Execution;
import com.facebook.msys.mci.transcoder.DefaultMediaTranscoder;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* renamed from: X.TBw  reason: case insensitive filesystem */
public final class C12882TBw implements Runnable {
    public final C10830Ryq A00;

    public final void run() {
        ArrayList A1C;
        C10830Ryq ryq;
        C11259SHt A002;
        int i;
        try {
            A1C = AnonymousClass7TE.A1C();
            ryq = this.A00;
            int i2 = ryq.A03;
            if (i2 == -1 || (i = ryq.A02) == -1) {
                ByteArrayOutputStream A0b = Pxe.A0b();
                int i3 = ryq.A01;
                int i4 = ryq.A00;
                String str = ryq.A08;
                if (str != null) {
                    A002 = ryq.A04.A03(ryq.A05, A0b, str, i3, i4);
                } else {
                    A002 = C11259SHt.A00(AnonymousClass7TE.A0w("transcodeImageV2: missing inputFilePath"));
                }
                A1C.add(A002);
            } else {
                ByteArrayOutputStream A0b2 = Pxe.A0b();
                ByteArrayOutputStream A0b3 = Pxe.A0b();
                ExecutorService executorService = ryq.A0A;
                Future submit = executorService.submit(new C13144TNc(ryq, A0b2, ryq.A01, ryq.A00));
                Future submit2 = executorService.submit(new C13144TNc(ryq, A0b3, i2, i));
                A1C.add((C11259SHt) submit.get());
                A1C.add((C11259SHt) submit2.get());
            }
        } catch (InterruptedException | ExecutionException e) {
            0KC.A0F("ImageTranscodeOperation", "ImageTranscodeOperation: Failed to get primary/secondary transcode image future - ", e);
        } catch (Throwable th) {
            0KC.A0F("ImageTranscodeOperation", "ImageTranscodeOperation: Failed to transcode image - ", th);
            return;
        }
        SNT snt = ryq.A06;
        if (A1C.size() == 1) {
            C11259SHt sHt = (C11259SHt) A1C.get(0);
            try {
                Execution.executeAsync(new QQG(snt, SNT.A00(snt, sHt, true), DefaultMediaTranscoder.A01(snt.A01, sHt)), (AccountSession) null, 4);
            } catch (Exception unused) {
                0KC.A0C("DefaultMediaTranscoder", "transcodeImageV2: onComplete - Failed to write primary image to file");
                Execution.executeAsync(new QQL(snt.A00, snt.A02, JTO.A0u("Failed to write primary image to file"), (double) sHt.A06, (double) sHt.A04, -1.0d, -1.0d), (AccountSession) null, 4);
            }
        } else if (A1C.size() == 2) {
            C11259SHt sHt2 = (C11259SHt) A1C.get(0);
            C11259SHt sHt3 = (C11259SHt) A1C.get(1);
            try {
                String A003 = SNT.A00(snt, sHt2, true);
                String A004 = SNT.A00(snt, sHt2, false);
                C10734RxD rxD = snt.A01;
                Execution.executeAsync(new QQI(snt, A003, A004, DefaultMediaTranscoder.A01(rxD, sHt2), DefaultMediaTranscoder.A01(rxD, sHt3)), (AccountSession) null, 4);
            } catch (Exception unused2) {
                0KC.A0C("DefaultMediaTranscoder", "transcodeImageV2: onComplete - Failed to write primary AND secondary image to file");
                Execution.executeAsync(new QQL(snt.A00, snt.A02, JTO.A0u("Failed to write primary AND/OR secondary image to file"), (double) sHt2.A06, (double) sHt2.A04, (double) sHt3.A06, (double) sHt3.A04), (AccountSession) null, 4);
            }
        } else {
            0KC.A0O("DefaultMediaTranscoder", "transcodeImageV2: onComplete - Exceeded the expected number of TranscodeResults: %d", new Object[]{Integer.valueOf(A1C.size())});
            Execution.executeAsync(new QQL(snt.A00, snt.A02, JTO.A0u("Exceeded the expected number of TranscodeResults"), -1.0d, -1.0d, -1.0d, -1.0d), (AccountSession) null, 4);
        }
    }

    public C12882TBw(C10830Ryq ryq) {
        this.A00 = ryq;
    }
}
