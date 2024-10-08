package com.instagram.music.common.model;

import X.1E6;
import X.1E9;
import X.C21917Xlu;
import X.C45436CwH;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.AudioMutingInfoIntf;
import com.instagram.api.schemas.MusicMuteAudioReason;
import com.instagram.user.model.User;
import java.util.List;

public interface MusicConsumptionModel extends Parcelable {
    public static final C21917Xlu A00 = C21917Xlu.A00;

    C45436CwH AKe();

    Boolean Ab6();

    Integer AdU();

    List Adc();

    AudioMutingInfoIntf Adi();

    Boolean AqO();

    List Ay7();

    User BEv();

    Integer BZg();

    Integer BfI();

    Boolean Bty();

    MusicMuteAudioReason BuG();

    Boolean BuU();

    Integer C9r();

    Boolean CPZ();

    Boolean Cde();

    MusicConsumptionModel EAF(1E9 r1);

    MusicConsumptionModelImpl FG6(1E9 r1);

    MusicConsumptionModelImpl FG7(1E6 r1);

    TreeUpdaterJNI FHC();

    String getDerivedContentId();

    String getFormattedClipsMediaCount();

    String getPlaceholderProfilePicUrl();

    boolean getShouldMuteAudio();

    String getShouldMuteAudioReason();
}
