package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.smartcapture.capture.SelfieEvidenceRecorderProvider;
import com.facebook.smartcapture.config.ChallengeProvider;
import com.facebook.smartcapture.facetracker.FaceTrackerModelsProvider;
import com.facebook.smartcapture.facetracker.FaceTrackerProvider;
import com.facebook.smartcapture.flow.SelfieCaptureConfig;
import com.facebook.smartcapture.logging.SelfieCaptureLogger;
import com.facebook.smartcapture.logging.SelfieCaptureStep;
import com.facebook.smartcapture.logging.SmartCaptureLoggerProvider;
import com.facebook.smartcapture.resources.ResourcesProvider;
import com.facebook.smartcapture.resources.stringoverride.StringOverrideFactory;
import com.facebook.smartcapture.ui.SelfieCaptureUi;
import com.facebook.smartcapture.view.SelfieOnboardingActivity;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public abstract class RhU {
    public static Intent A00(Context context, SelfieEvidenceRecorderProvider selfieEvidenceRecorderProvider, ChallengeProvider challengeProvider, REX rex, FaceTrackerModelsProvider faceTrackerModelsProvider, FaceTrackerProvider faceTrackerProvider, SmartCaptureLoggerProvider smartCaptureLoggerProvider, ResourcesProvider resourcesProvider, StringOverrideFactory stringOverrideFactory, SelfieCaptureUi selfieCaptureUi, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, Map map, int i, long j, boolean z, boolean z2) {
        ChallengeProvider challengeProvider2 = challengeProvider;
        if (challengeProvider != null) {
            Bundle A0a = AnonymousClass7TE.A0a();
            if (map != null) {
                Iterator A0u = AnonymousClass7TF.A0u(map);
                while (A0u.hasNext()) {
                    Pxh.A17(A0a, A0u);
                }
            }
            StringOverrideFactory stringOverrideFactory2 = null;
            HashSet A1F = AnonymousClass7TE.A1F();
            SelfieEvidenceRecorderProvider selfieEvidenceRecorderProvider2 = selfieEvidenceRecorderProvider;
            0qQ.A0A(selfieEvidenceRecorderProvider2);
            0qQ.A0A(challengeProvider2);
            String str7 = str4;
            0qQ.A0A(str7);
            C11367SPk.A03(str7, "product");
            if (!A1F.contains("designSystem")) {
                A1F = C66580MXl.A12(A1F);
                A1F.add("designSystem");
            }
            Boolean valueOf = Boolean.valueOf(z);
            if (stringOverrideFactory != null) {
                stringOverrideFactory2 = stringOverrideFactory;
                if (!A1F.contains("stringOverrideFactory")) {
                    A1F = C66580MXl.A12(A1F);
                    A1F.add("stringOverrideFactory");
                }
            }
            SelfieCaptureUi selfieCaptureUi2 = selfieCaptureUi;
            ResourcesProvider resourcesProvider2 = resourcesProvider;
            SmartCaptureLoggerProvider smartCaptureLoggerProvider2 = smartCaptureLoggerProvider;
            FaceTrackerProvider faceTrackerProvider2 = faceTrackerProvider;
            FaceTrackerModelsProvider faceTrackerModelsProvider2 = faceTrackerModelsProvider;
            REX rex2 = rex;
            int i2 = i;
            String str8 = str6;
            String str9 = str5;
            String str10 = str3;
            String str11 = str2;
            String str12 = str;
            Integer num3 = num2;
            Boolean bool5 = bool4;
            String str13 = str7;
            HashSet hashSet = A1F;
            SelfieCaptureConfig selfieCaptureConfig = new SelfieCaptureConfig(A0a, selfieEvidenceRecorderProvider2, challengeProvider2, rex2, faceTrackerModelsProvider2, faceTrackerProvider2, smartCaptureLoggerProvider2, resourcesProvider2, stringOverrideFactory2, selfieCaptureUi2, bool, bool3, valueOf, bool2, bool5, num, num3, str12, str11, str10, str13, str9, str8, hashSet, i2, j, z2);
            Context context2 = context;
            if (!C9577RdH.A00(selfieCaptureConfig, new C10242Rp2(context2))) {
                return C9584RdO.A00(context2, selfieCaptureConfig, SelfieCaptureStep.INITIAL);
            }
            SelfieCaptureStep selfieCaptureStep = SelfieCaptureStep.INITIAL;
            Intent A0A = C66580MXl.A0A(context2, SelfieOnboardingActivity.class);
            A0A.putExtra("selfie_capture_config", selfieCaptureConfig);
            A0A.putExtra(SelfieCaptureLogger.ARG_PREVIOUS_STEP, selfieCaptureStep);
            return A0A;
        }
        throw AnonymousClass7TE.A0w("Required value was null.");
    }
}
