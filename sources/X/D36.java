package X;

import com.instagram.api.schemas.OriginalAudioSubtype;
import com.instagram.api.schemas.OriginalSoundConsumptionInfoIntf;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

public abstract class D36 {
    public static final void A01(String str, UserSession userSession, 1Xj r39) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 2);
        1Xj r0 = r39;
        if (r39 != null) {
            C67231sQ clipsMetadata = r0.A0C.getClipsMetadata();
            if (clipsMetadata != null) {
                C295345o0 r1 = new C295345o0(clipsMetadata);
                OriginalSoundDataIntf BZB = clipsMetadata.BZB();
                if (BZB != null) {
                    boolean allowCreatorToRename = BZB.getAllowCreatorToRename();
                    String audioAssetId = BZB.getAudioAssetId();
                    Integer AdU = BZB.AdU();
                    List Adc = BZB.Adc();
                    List Adj = BZB.Adj();
                    List Adk = BZB.Adk();
                    Boolean AkO = BZB.AkO();
                    Boolean AkP = BZB.AkP();
                    OriginalSoundConsumptionInfoIntf AqB = BZB.AqB();
                    String dashManifest = BZB.getDashManifest();
                    Integer AzJ = BZB.AzJ();
                    String formattedClipsMediaCount = BZB.getFormattedClipsMediaCount();
                    boolean hideRemixing = BZB.getHideRemixing();
                    User BEv = BZB.BEv();
                    boolean isAudioAutomaticallyAttributed = BZB.isAudioAutomaticallyAttributed();
                    Boolean CRq = BZB.CRq();
                    Boolean CSQ = BZB.CSQ();
                    boolean isExplicit = BZB.isExplicit();
                    Boolean CYh = BZB.CYh();
                    Boolean Caw = BZB.Caw();
                    Boolean Cf2 = BZB.Cf2();
                    String musicCanonicalId = BZB.getMusicCanonicalId();
                    Boolean BXg = BZB.BXg();
                    OriginalAudioSubtype BYy = BZB.BYy();
                    BZB.getOriginalAudioTitle();
                    String originalMediaId = BZB.getOriginalMediaId();
                    Integer BZg = BZB.BZg();
                    Integer BfI = BZB.BfI();
                    String progressiveDownloadUrl = BZB.getProgressiveDownloadUrl();
                    boolean shouldMuteAudio = BZB.getShouldMuteAudio();
                    r1.A09 = CbB.A00(BYy, AqB, BZB, BZB.CHN(), BEv, AkO, AkP, CRq, CSQ, CYh, Caw, Cf2, BXg, AdU, AzJ, BZg, BfI, BZB.C7I(), BZB.C9r(), audioAssetId, dashManifest, formattedClipsMediaCount, musicCanonicalId, str, originalMediaId, progressiveDownloadUrl, Adc, Adj, Adk, allowCreatorToRename, hideRemixing, isAudioAutomaticallyAttributed, isExplicit, shouldMuteAudio);
                    r0.A3v(r1.A00());
                }
            }
            r0.AE7(userSession2);
        }
    }

    public static final void A00(1Xj r35) {
        C67231sQ clipsMetadata;
        1Xj r1 = r35;
        if (r35 != null && (clipsMetadata = r1.A0C.getClipsMetadata()) != null) {
            C295345o0 r0 = new C295345o0(clipsMetadata);
            OriginalSoundDataIntf BZB = clipsMetadata.BZB();
            if (BZB != null) {
                BZB.getAllowCreatorToRename();
                String audioAssetId = BZB.getAudioAssetId();
                Integer AdU = BZB.AdU();
                List Adc = BZB.Adc();
                List Adj = BZB.Adj();
                List Adk = BZB.Adk();
                Boolean AkO = BZB.AkO();
                Boolean AkP = BZB.AkP();
                OriginalSoundConsumptionInfoIntf AqB = BZB.AqB();
                String dashManifest = BZB.getDashManifest();
                Integer AzJ = BZB.AzJ();
                String formattedClipsMediaCount = BZB.getFormattedClipsMediaCount();
                boolean hideRemixing = BZB.getHideRemixing();
                User BEv = BZB.BEv();
                boolean isAudioAutomaticallyAttributed = BZB.isAudioAutomaticallyAttributed();
                Boolean CRq = BZB.CRq();
                Boolean CSQ = BZB.CSQ();
                boolean isExplicit = BZB.isExplicit();
                Boolean CYh = BZB.CYh();
                Boolean Caw = BZB.Caw();
                Boolean Cf2 = BZB.Cf2();
                String musicCanonicalId = BZB.getMusicCanonicalId();
                Boolean BXg = BZB.BXg();
                OriginalAudioSubtype BYy = BZB.BYy();
                String originalAudioTitle = BZB.getOriginalAudioTitle();
                String originalMediaId = BZB.getOriginalMediaId();
                Integer BZg = BZB.BZg();
                Integer BfI = BZB.BfI();
                String progressiveDownloadUrl = BZB.getProgressiveDownloadUrl();
                boolean shouldMuteAudio = BZB.getShouldMuteAudio();
                r0.A09 = CbB.A00(BYy, AqB, BZB, BZB.CHN(), BEv, AkO, AkP, CRq, CSQ, CYh, Caw, Cf2, BXg, AdU, AzJ, BZg, BfI, BZB.C7I(), BZB.C9r(), audioAssetId, dashManifest, formattedClipsMediaCount, musicCanonicalId, originalAudioTitle, originalMediaId, progressiveDownloadUrl, Adc, Adj, Adk, false, hideRemixing, isAudioAutomaticallyAttributed, isExplicit, shouldMuteAudio);
                r1.A3v(r0.A00());
            }
        }
    }
}
