package X;

import android.media.MediaPlayer;
import java.util.Arrays;

/* renamed from: X.OgQ  reason: case insensitive filesystem */
public final class C71259OgQ implements MediaPlayer.OnErrorListener {
    public final /* synthetic */ AnonymousClass4AB A00;
    public final /* synthetic */ AnonymousClass50C A01;

    public C71259OgQ(AnonymousClass4AB r1, AnonymousClass50C r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        String format = String.format("Media player error what: %d, extra: %d", Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, 2));
        0qQ.A07(format);
        0wb.A03("CFHubPogItemDefinition:bindVideoInNote", format);
        AnonymousClass50C r1 = this.A01;
        AnonymousClass50C.A03(r1);
        AnonymousClass50C.A01(this.A00, r1);
        return true;
    }
}
