package X;

import android.media.MediaFormat;
import com.facebook.common.dextricks.Constants;
import com.facebook.proxygen.TraceFieldType;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.Rhm  reason: case insensitive filesystem */
public abstract class C9824Rhm {
    public static final void A00(AnonymousClass2Np r13, File file, File file2, File file3, int i) {
        C351748Af r0;
        IOException iOException;
        int i2 = i;
        AnonymousClass7TG.A1R(file, file2);
        File file4 = file3;
        0qQ.A0B(file4, 7);
        List singletonList = Collections.singletonList(new SE7(file));
        ArrayList A15 = DbV.A15(singletonList);
        if (i < 0) {
            int i3 = -i2;
            Q0V A00 = Q0V.A00("audio_burn_in_util");
            try {
                A00.ETt(file2.getPath());
                MediaFormat trackFormat = A00.A00.getTrackFormat(0);
                0qQ.A07(trackFormat);
                int integer = trackFormat.getInteger(TraceFieldType.Bitrate);
                int integer2 = trackFormat.getInteger("sample-rate");
                int integer3 = trackFormat.getInteger("channel-count");
                File A0s = JTO.A0s(r13.C4W(), "silent_audio.mp4");
                new STP().A06(new SFQ(integer, integer3, integer2), A0s, (long) i3);
                SE7 se7 = new SE7(A0s);
                A00.release();
                A15.add(se7);
                i2 = 0;
            } catch (NullPointerException e) {
                iOException = new IOException(e);
            } catch (AnonymousClass4ZS e2) {
                iOException = new IOException(e2);
            } catch (Throwable th) {
                A00.release();
                throw th;
            }
        }
        A15.add(new SE7(file2, i2));
        try {
            C13589TdH tdH = STf.A01;
            try {
                STf sTf = STf.A00;
                STf.A05(singletonList);
                STf.A04(sTf, tdH, file4, singletonList, A15, Constants.LOAD_RESULT_NEED_REOPTIMIZATION);
                return;
            } catch (C351748Af e3) {
                r0 = Pxi.A0H("Exception thrown while stitching the media files", e3);
                throw r0;
            } catch (IOException e4) {
                r0 = Pxi.A0H("Exception thrown while stitching the media files", e4);
                throw r0;
            }
        } catch (C351748Af e5) {
            throw new IOException(e5);
        }
        throw iOException;
    }
}
