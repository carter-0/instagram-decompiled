package X;

import android.content.Context;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution;
import com.facebook.cameracore.mediapipeline.services.multipeer.implementation.MultipeerBinaryMessageTopicHandlerHybrid;
import com.facebook.cameracore.mediapipeline.services.multipeer.implementation.MultipeerTopicHandlerHybrid;
import com.facebook.cameracore.mediapipeline.services.participant.implementation.ParticipantUpdateHandlerHybrid;
import com.facebook.cameracore.mediapipeline.services.participant.interfaces.ParticipantData;
import com.facebook.cameracore.mediapipeline.services.uicontrol.PickerConfiguration;
import com.facebook.rsys.rtc.RSVideoFrame;
import com.facebook.rsys.videoeffectcommunication.gen.GetGroupEffectConfirmationCompletion;
import com.facebook.rsys.videoeffectcommunication.gen.GroupEffectConfirmationPromptCompletion;
import com.facebook.rsys.videoeffectcommunication.gen.PeerConsentVideoEffectAlertCompletion;
import com.facebook.rsys.videoeffectcommunication.gen.UnapprovedEffectAlertCompletion;
import com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationApi;
import com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationParticipant;
import com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationProxy;
import com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationSharedEffectInfo;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import com.instagram.rtc.rsys.models.IgCallModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class NDr extends VideoEffectCommunicationProxy {
    public VideoEffectCommunicationApi A00;
    public C56908IHd A01;
    public C56909IHe A02;
    public Long A03;
    public Long A04;
    public String A05;
    public List A06 = AnonymousClass7TE.A1C();
    public final AR0 A07;
    public final UserSession A08;
    public final O9Y A09;

    public final void getGroupEffectConfirmationPromptState(GetGroupEffectConfirmationCompletion getGroupEffectConfirmationCompletion) {
    }

    public final void onActiveCallLayoutChanged(long j, long j2) {
    }

    public final void onCallLayoutRemoved(VideoEffectCommunicationSharedEffectInfo videoEffectCommunicationSharedEffectInfo, String str, boolean z) {
    }

    public final void onReadyForSplitScreenChanged(boolean z) {
    }

    public final void onReceiveGroupEffect(VideoEffectCommunicationSharedEffectInfo videoEffectCommunicationSharedEffectInfo) {
        String str;
        Object next;
        Context context;
        int i;
        Object[] objArr;
        VideoEffectCommunicationSharedEffectInfo videoEffectCommunicationSharedEffectInfo2 = videoEffectCommunicationSharedEffectInfo;
        0qQ.A0B(videoEffectCommunicationSharedEffectInfo2, 0);
        long j = videoEffectCommunicationSharedEffectInfo2.effectId;
        Long l = this.A03;
        if (l == null || j != l.longValue()) {
            O9Y o9y = this.A09;
            String str2 = videoEffectCommunicationSharedEffectInfo2.effectName;
            String str3 = videoEffectCommunicationSharedEffectInfo2.effectThumbnailUri;
            String str4 = videoEffectCommunicationSharedEffectInfo2.initiatorId;
            String str5 = videoEffectCommunicationSharedEffectInfo2.initiatorName;
            String str6 = videoEffectCommunicationSharedEffectInfo2.cryptoHash;
            C70989OVd oVd = o9y.A00;
            C69138NfJ nfJ = oVd.A0N;
            IgCallModel A012 = oVd.A01();
            if (A012 != null) {
                str = A012.localCallId;
            } else {
                str = null;
            }
            if (str6 != null || nfJ.A0J.A00()) {
                OK1 ok1 = nfJ.A0N;
                String str7 = str2;
                String str8 = str5;
                if (!(str2 == null && str3 == null && str5 == null)) {
                    if (str5 == null) {
                        str8 = "";
                    }
                    if (str2 == null) {
                        str7 = "";
                    }
                    if (str3 == null) {
                        str3 = "";
                    }
                    Integer num = AnonymousClass05K.A15;
                    C69134NfF nfF = ok1.A00;
                    long currentTimeMillis = System.currentTimeMillis();
                    nfF.A02(new N9C(num, AnonymousClass05K.A00, new String[]{str8, str7, str3}, currentTimeMillis, false));
                }
                Integer num2 = AnonymousClass05K.A01;
                Object value = nfJ.A0X.getValue();
                if (value != C69291Nir.ON && value != C69291Nir.PENDING && !DbX.A1b(nfJ.A0Y)) {
                    if (str != null && !nfJ.A0S.contains(str)) {
                        if (182.A06(0Tu.A05, nfJ.A0J.A00, 36324771805278574L)) {
                            if (str5 == null || str5.length() == 0) {
                                context = nfJ.A0D;
                                i = 2131972468;
                                objArr = new Object[]{str2};
                            } else {
                                context = nfJ.A0D;
                                i = 2131972470;
                                objArr = new Object[]{str5, str2};
                            }
                            String string = context.getString(i, objArr);
                            0qQ.A0A(string);
                            nfJ.A06 = new OGQ(num2, String.valueOf(j), str4, str6, str);
                            C69138NfJ.A0A(nfJ, N9P.A00((EffectAttribution) null, (PickerConfiguration) null, (CameraAREffect) null, (CameraAREffect) null, (CameraAREffect) null, (C69378NkI) null, C69138NfJ.A00(nfJ), (Integer) null, (Integer) null, (Integer) null, (Integer) null, (String) null, (String) null, string, (List) null, (List) null, (List) null, (List) null, (List) null, 0.0f, -12582913, false, false, false, false, false, false, true, false, false, false, false, false, false));
                            return;
                        }
                    }
                    CameraAREffect cameraAREffect = null;
                    N9P A002 = C69138NfJ.A00(nfJ);
                    if (str6 != null) {
                        Iterator it = A002.A0G.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            next = it.next();
                            if (C66580MXl.A08(((CameraAREffect) next).A0K) == j) {
                                break;
                            }
                        }
                    } else {
                        Iterator it2 = A002.A0H.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            next = it2.next();
                            if (C66580MXl.A08(((CameraAREffect) next).A0K) == j) {
                                break;
                            }
                        }
                    }
                    cameraAREffect = next;
                    CameraAREffect cameraAREffect2 = cameraAREffect;
                    if (cameraAREffect2 == null) {
                        nfJ.A0L(num2, String.valueOf(j), str6, (String) null, str4);
                        return;
                    }
                    C69138NfJ.A04(cameraAREffect2, nfJ, num2, str4);
                }
            }
        }
    }

    public final void onVideoFrameUpdated(RSVideoFrame rSVideoFrame, String str) {
    }

    public final void setApi(VideoEffectCommunicationApi videoEffectCommunicationApi) {
        0qQ.A0B(videoEffectCommunicationApi, 0);
        this.A00 = videoEffectCommunicationApi;
    }

    public final void showGroupEffectConfirmationPrompt(GroupEffectConfirmationPromptCompletion groupEffectConfirmationPromptCompletion) {
    }

    public final void showPeerConsentVideoEffectAlert(VideoEffectCommunicationSharedEffectInfo videoEffectCommunicationSharedEffectInfo, PeerConsentVideoEffectAlertCompletion peerConsentVideoEffectAlertCompletion) {
    }

    public final void showUnapprovedVideoEffectAlert(UnapprovedEffectAlertCompletion unapprovedEffectAlertCompletion) {
    }

    public NDr(AR0 ar0, UserSession userSession, O9Y o9y) {
        this.A08 = userSession;
        this.A07 = ar0;
        this.A09 = o9y;
    }

    public final void onEffectParticipantsUpdated(VideoEffectCommunicationParticipant videoEffectCommunicationParticipant, ArrayList arrayList, long j) {
        ParticipantUpdateHandlerHybrid participantUpdateHandlerHybrid;
        boolean A1Z = AnonymousClass7TG.A1Z(videoEffectCommunicationParticipant, arrayList);
        Long l = this.A04;
        if (l != null && j == l.longValue()) {
            this.A05 = videoEffectCommunicationParticipant.participantId;
            ArrayList A1C = AnonymousClass7TE.A1C();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                VideoEffectCommunicationParticipant videoEffectCommunicationParticipant2 = (VideoEffectCommunicationParticipant) it.next();
                String str = videoEffectCommunicationParticipant2.participantId;
                boolean z = videoEffectCommunicationParticipant2.isActiveInCall;
                boolean z2 = videoEffectCommunicationParticipant2.isActiveInSameEffect;
                int i = videoEffectCommunicationParticipant2.loadStatus;
                int i2 = 2;
                if (i == 0 || i == A1Z || i == 2) {
                    i2 = 0;
                } else if (i == 3) {
                    i2 = 1;
                } else if (i != 4) {
                    i2 = 3;
                }
                A1C.add(new ParticipantData(str, z, z2, i2));
            }
            this.A06 = A1C;
            C56909IHe iHe = this.A02;
            if (iHe != null && (participantUpdateHandlerHybrid = iHe.A00) != null) {
                participantUpdateHandlerHybrid.onParticipantDataUpdateNative(A1C);
            }
        }
    }

    public final void onMultipeerBinaryMessage(String str, byte[] bArr) {
        MultipeerBinaryMessageTopicHandlerHybrid multipeerBinaryMessageTopicHandlerHybrid;
        AnonymousClass7TG.A1N(str, bArr);
        C56908IHd iHd = this.A01;
        if (iHd != null && (multipeerBinaryMessageTopicHandlerHybrid = (MultipeerBinaryMessageTopicHandlerHybrid) iHd.A00.get(str)) != null) {
            multipeerBinaryMessageTopicHandlerHybrid.onMessageNative(bArr);
        }
    }

    public final void onMultipeerMessage(String str, String str2) {
        MultipeerTopicHandlerHybrid multipeerTopicHandlerHybrid;
        AnonymousClass7TG.A1N(str, str2);
        C56908IHd iHd = this.A01;
        if (iHd != null && (multipeerTopicHandlerHybrid = (MultipeerTopicHandlerHybrid) iHd.A01.get(str)) != null) {
            multipeerTopicHandlerHybrid.onMessageNative(str2);
        }
    }
}
