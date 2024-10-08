package X;

import android.media.MediaPlayer;
import java.util.Arrays;

/* renamed from: X.OgR  reason: case insensitive filesystem */
public final class C71260OgR implements MediaPlayer.OnErrorListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C71260OgR(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        int i3 = this.A00;
        String format = String.format("Media player error what: %d, extra: %d", Arrays.copyOf(C51968G9o.A1Z(Integer.valueOf(i), i2), 2));
        if (i3 != 0) {
            0qQ.A07(format);
            0wb.A03("NoteQuickReplySheetFragment:setNoteVideoPog", format);
            C68467NJf.A04((C68467NJf) this.A02, (C68770NWf) this.A01);
            return true;
        }
        0qQ.A07(format);
        0wb.A03("SelfNoteBottomSheetFragment:setNoteVideoPog", format);
        NKL.A04((NKL) this.A02, (C68766NWb) this.A01);
        return true;
    }
}
