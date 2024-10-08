package com.instagram.api.schemas;

import X.1E6;
import X.1E9;
import X.C21791XiG;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;
import java.util.List;

public interface OriginalSoundDataIntf extends Parcelable {
    public static final C21791XiG A00 = C21791XiG.A00;

    Integer AdU();

    List Adc();

    List Adj();

    List Adk();

    Boolean AkO();

    Boolean AkP();

    OriginalSoundConsumptionInfoIntf AqB();

    Integer AzJ();

    User BEv();

    Boolean BXg();

    OriginalAudioSubtype BYy();

    Integer BZg();

    Integer BfI();

    Integer C7I();

    Integer C9r();

    XpostOriginalSoundFBCreatorInfo CHN();

    Boolean CRq();

    Boolean CSQ();

    Boolean CYh();

    Boolean Caw();

    Boolean Cf2();

    OriginalSoundDataIntf E7q(1E9 r1);

    OriginalSoundData F7E(1E9 r1);

    OriginalSoundData F7F(1E6 r1);

    TreeUpdaterJNI FHC();

    boolean getAllowCreatorToRename();

    String getAudioAssetId();

    String getDashManifest();

    String getFormattedClipsMediaCount();

    boolean getHideRemixing();

    String getMusicCanonicalId();

    String getOriginalAudioTitle();

    String getOriginalMediaId();

    String getProgressiveDownloadUrl();

    boolean getShouldMuteAudio();

    boolean isAudioAutomaticallyAttributed();

    boolean isExplicit();
}
