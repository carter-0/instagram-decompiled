package X;

import com.instagram.api.schemas.DirectAudioFallbackUrl;
import com.instagram.feed.audio.AudioIntf;

/* renamed from: X.DGr  reason: case insensitive filesystem */
public final class C45962DGr implements C2814057m {
    public final /* synthetic */ AudioIntf A00;

    public final Long B2i() {
        return null;
    }

    public C45962DGr(AudioIntf audioIntf) {
        this.A00 = audioIntf;
    }

    public final String Ado() {
        String Adp;
        DirectAudioFallbackUrl B3k = this.A00.B3k();
        if (B3k == null || (Adp = B3k.Adp()) == null) {
            return "";
        }
        return Adp;
    }

    public final /* bridge */ /* synthetic */ Object B3m() {
        return null;
    }
}
