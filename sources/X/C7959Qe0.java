package X;

import android.net.Uri;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.Execution;
import com.facebook.msys.mci.TranscodeVideoCompletionCallback;
import com.facebook.msys.mci.transcoder.DefaultMediaTranscoder;
import java.util.List;

/* renamed from: X.Qe0  reason: case insensitive filesystem */
public final class C7959Qe0 extends C12327SrZ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ Uri A04;
    public final /* synthetic */ TranscodeVideoCompletionCallback A05;
    public final /* synthetic */ DefaultMediaTranscoder A06;

    public C7959Qe0(Uri uri, TranscodeVideoCompletionCallback transcodeVideoCompletionCallback, DefaultMediaTranscoder defaultMediaTranscoder, int i, int i2, int i3, int i4) {
        this.A06 = defaultMediaTranscoder;
        this.A04 = uri;
        this.A05 = transcodeVideoCompletionCallback;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = i3;
        this.A02 = i4;
    }

    public final /* bridge */ /* synthetic */ void DDE(SJL sjl, Object obj) {
        Throwable th = (Throwable) obj;
        0KC.A0F("DefaultMediaTranscoder", "transcodeVideo onException - TranscodeUtil.transcode() failed", th);
        DefaultMediaTranscoder.A02(this.A05, this.A06, th, this.A01, this.A00);
    }

    public final void D5E(List list) {
        if (list.size() != 1) {
            0KC.A0O("DefaultMediaTranscoder", "transcodeVideo: onCompleted - Transcoding operation produced multiple output files (%s)", AnonymousClass7TF.A1b(list.size()));
        }
        SRW srw = (SRW) list.get(0);
        Execution.executeAsync(new QQH(this, srw, Uri.fromFile(srw.A0N).toString(), ((double) srw.A0J) / 1000000.0d), (AccountSession) null, 4);
    }
}
