package X;

import com.instagram.music.common.model.MusicConsumptionModel;

/* renamed from: X.4Kc  reason: invalid class name and case insensitive filesystem */
public final class C263294Kc implements C2606146j {
    public final String A00;
    public final /* synthetic */ MusicConsumptionModel A01;

    public C263294Kc(MusicConsumptionModel musicConsumptionModel) {
        this.A01 = musicConsumptionModel;
        this.A00 = musicConsumptionModel.getShouldMuteAudioReason();
    }

    public final boolean Esc() {
        return this.A01.getShouldMuteAudio();
    }

    public final String getShouldMuteAudioReason() {
        return this.A00;
    }
}
