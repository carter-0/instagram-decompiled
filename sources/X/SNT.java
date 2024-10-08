package X;

import android.net.Uri;
import com.facebook.msys.mci.TranscodeImageCompletionCallback;
import com.facebook.msys.mci.transcoder.DefaultMediaTranscoder;
import java.io.File;
import java.io.FileOutputStream;

public final class SNT {
    public final /* synthetic */ TranscodeImageCompletionCallback A00;
    public final /* synthetic */ C10734RxD A01;
    public final /* synthetic */ DefaultMediaTranscoder A02;
    public final /* synthetic */ String A03;

    public SNT(TranscodeImageCompletionCallback transcodeImageCompletionCallback, C10734RxD rxD, DefaultMediaTranscoder defaultMediaTranscoder, String str) {
        this.A02 = defaultMediaTranscoder;
        this.A03 = str;
        this.A01 = rxD;
        this.A00 = transcodeImageCompletionCallback;
    }

    public static final String A00(SNT snt, C11259SHt sHt, boolean z) {
        String A0R;
        Integer num = sHt.A0A;
        if (num == AnonymousClass05K.A00 || num == AnonymousClass05K.A0C) {
            byte[] bArr = sHt.A0B;
            if (z) {
                A0R = "primary_";
            } else {
                A0R = 002.A0R("secondary", snt.A03);
            }
            File createTempFile = File.createTempFile(A0R, (String) null);
            createTempFile.deleteOnExit();
            FileOutputStream A0t = JTO.A0t(createTempFile);
            A0t.write(bArr);
            A0t.close();
            return Uri.fromFile(createTempFile).toString();
        }
        throw AnonymousClass7TE.A0z("transcodeImageV2: onCompleted - null transcodeResult");
    }

    public SNT() {
    }
}
