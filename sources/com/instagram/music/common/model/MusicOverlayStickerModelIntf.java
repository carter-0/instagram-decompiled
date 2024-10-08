package com.instagram.music.common.model;

import X.1E6;
import X.1E9;
import X.C21918Xlv;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.AudioMutingInfoIntf;
import com.instagram.api.schemas.MusicMuteAudioReason;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.util.List;

public interface MusicOverlayStickerModelIntf extends Parcelable {
    public static final C21918Xlv A00 = C21918Xlv.A00;

    String Aab();

    Boolean Ab6();

    Integer AdU();

    Integer AdV();

    List Adc();

    AudioMutingInfoIntf Adi();

    String AiB();

    Boolean AqO();

    ImageUrl Arq();

    ImageUrl Arr();

    String Av6();

    Integer AwQ();

    List Ay7();

    Integer AzJ();

    Boolean BBW();

    Boolean BDF();

    List BDX();

    User BEv();

    String BNb();

    MusicProduct BUy();

    Integer BZg();

    Boolean BcJ();

    String Bjs();

    String BpH();

    Boolean Bty();

    MusicMuteAudioReason BuG();

    Boolean BuU();

    Boolean Bur();

    Integer C9r();

    String CGG();

    Boolean CPZ();

    Boolean CRq();

    Boolean CSQ();

    Boolean CWa();

    Boolean CYk();

    Boolean Cde();

    MusicOverlayStickerModelIntf EAG(1E9 r1);

    MusicOverlayStickerModel FG8(1E9 r1);

    MusicOverlayStickerModel FG9(1E6 r1);

    TreeUpdaterJNI FHC();

    boolean getAllowsSaving();

    String getArtistId();

    String getAudioAssetId();

    String getAudioClusterId();

    String getDashManifest();

    String getDerivedContentId();

    String getDisplayArtist();

    String getFastStartProgressiveDownloadUrl();

    String getFormattedClipsMediaCount();

    String getId();

    String getIgUsername();

    String getOriginalMediaId();

    String getPlaceholderProfilePicUrl();

    String getProgressiveDownloadUrl();

    boolean getShouldMuteAudio();

    String getShouldMuteAudioReason();

    String getSubtitle();

    String getTag();

    String getTitle();

    boolean isExplicit();
}
