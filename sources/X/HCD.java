package X;

import com.instagram.music.common.model.MusicDataSource;

public final class HCD extends IW4 {
    public final MusicDataSource A00;
    public final String A01;
    public final boolean A02;

    public HCD(MusicDataSource musicDataSource, String str, boolean z) {
        0qQ.A0B(musicDataSource, 1);
        this.A00 = musicDataSource;
        this.A02 = z;
        this.A01 = str;
    }

    public final MusicDataSource BUq() {
        return this.A00;
    }

    public final boolean Esc() {
        return this.A02;
    }

    public final String getShouldMuteAudioReason() {
        return this.A01;
    }
}
