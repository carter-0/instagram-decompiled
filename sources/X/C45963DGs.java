package X;

import com.instagram.feed.audio.AudioIntf;
import java.util.concurrent.TimeUnit;

/* renamed from: X.DGs  reason: case insensitive filesystem */
public final class C45963DGs implements C2814057m {
    public final /* synthetic */ AudioIntf A00;

    public C45963DGs(AudioIntf audioIntf) {
        this.A00 = audioIntf;
    }

    public final String Ado() {
        return this.A00.Adp();
    }

    public final Long B2i() {
        long j;
        AudioIntf audioIntf = this.A00;
        if (audioIntf.Adq() == null) {
            return null;
        }
        TimeUnit timeUnit = TimeUnit.MICROSECONDS;
        Long Adq = audioIntf.Adq();
        if (Adq != null) {
            j = Adq.longValue();
        } else {
            j = 0;
        }
        return Long.valueOf(timeUnit.toMillis(j));
    }

    public final /* bridge */ /* synthetic */ Object B3m() {
        return new C45962DGr(this.A00);
    }
}
