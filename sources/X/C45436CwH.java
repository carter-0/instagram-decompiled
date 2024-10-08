package X;

import com.instagram.api.schemas.AudioMutingInfoIntf;
import com.instagram.api.schemas.MusicMuteAudioReason;
import com.instagram.music.common.model.MusicConsumptionModel;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.CwH  reason: case insensitive filesystem */
public class C45436CwH {
    public AudioMutingInfoIntf A00;
    public MusicMuteAudioReason A01;
    public User A02;
    public Boolean A03;
    public Boolean A04;
    public Boolean A05;
    public Boolean A06;
    public Boolean A07;
    public Boolean A08;
    public Integer A09;
    public Integer A0A;
    public Integer A0B;
    public Integer A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public List A0H;
    public List A0I;
    public boolean A0J;
    public final MusicConsumptionModel A0K;

    public C45436CwH(MusicConsumptionModel musicConsumptionModel) {
        this.A0K = musicConsumptionModel;
        this.A03 = musicConsumptionModel.Ab6();
        this.A09 = musicConsumptionModel.AdU();
        this.A0H = musicConsumptionModel.Adc();
        this.A00 = musicConsumptionModel.Adi();
        this.A04 = musicConsumptionModel.AqO();
        this.A0D = musicConsumptionModel.getDerivedContentId();
        this.A0I = musicConsumptionModel.Ay7();
        this.A0E = musicConsumptionModel.getFormattedClipsMediaCount();
        this.A02 = musicConsumptionModel.BEv();
        this.A05 = musicConsumptionModel.CPZ();
        this.A06 = musicConsumptionModel.Cde();
        this.A0A = musicConsumptionModel.BZg();
        this.A0F = musicConsumptionModel.getPlaceholderProfilePicUrl();
        this.A0B = musicConsumptionModel.BfI();
        this.A07 = musicConsumptionModel.Bty();
        this.A0J = musicConsumptionModel.getShouldMuteAudio();
        this.A0G = musicConsumptionModel.getShouldMuteAudioReason();
        this.A01 = musicConsumptionModel.BuG();
        this.A08 = musicConsumptionModel.BuU();
        this.A0C = musicConsumptionModel.C9r();
    }
}
