package X;

import android.content.ContentResolver;
import android.content.Context;
import android.media.AudioManager;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public final class OHF {
    public C67637MrQ A00;
    public C69729NrE A01;
    public Future A02;
    public final ContentResolver A03;
    public final AudioManager A04;
    public final ExecutorService A05;
    public final OUV A06;

    public OHF(Context context, AudioManager audioManager, C69729NrE nrE, OUV ouv, ExecutorService executorService) {
        this.A04 = audioManager;
        this.A06 = ouv;
        ContentResolver contentResolver = context.getContentResolver();
        0qQ.A07(contentResolver);
        this.A03 = contentResolver;
        this.A01 = nrE;
        this.A05 = executorService;
    }
}
