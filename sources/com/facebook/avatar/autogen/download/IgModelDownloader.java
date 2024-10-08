package com.facebook.avatar.autogen.download;

import X.0qQ;
import X.1Lf;
import X.1RH;
import X.1US;
import X.AnonymousClass05K;
import X.AnonymousClass7TE;
import X.C255183ti;
import X.C363048j0;
import X.PyB;
import X.PyC;
import X.SWS;
import X.T0P;
import X.T82;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.models.IgModelLoader;
import com.facebook.smartcapture.facetracker.FaceTrackerModelsProvider;
import com.google.common.util.concurrent.ListenableFuture;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

public final class IgModelDownloader implements FaceTrackerModelsProvider {
    public static final Parcelable.Creator CREATOR = SWS.A00(11);
    public final UserSession A00;

    public IgModelDownloader(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeValue(this.A00);
    }

    public final Map BTj(Context context) {
        Object obj = new Object();
        PyC pyC = new PyC(1US.A1D);
        pyC.A03 = AnonymousClass05K.A01;
        pyC.A02 = new T82(obj, 0);
        1RH A002 = 1RH.A00();
        UserSession userSession = this.A00;
        A002.A03(userSession, new PyB(pyC));
        IgModelLoader A003 = C363048j0.A00(userSession);
        if (A003 != null) {
            1Lf r8 = 1Lf.A01;
            HashMap A1E = AnonymousClass7TE.A1E();
            CountDownLatch countDownLatch = new CountDownLatch(3);
            ListenableFuture load = A003.load("face_detection_autogen_frame_selection", 4);
            0qQ.A07(load);
            C255183ti.A04(new T0P("FaceDetectorWithBundledImage", "bc_face_detector", A1E, countDownLatch), load, r8);
            ListenableFuture load2 = A003.load("face_landmarks_autogen_frame_selection", 5);
            0qQ.A07(load2);
            C255183ti.A04(new T0P("E2eLandmarksModel", "bc_landmarks_detector", A1E, countDownLatch), load2, r8);
            ListenableFuture load3 = A003.load("blur_autogen_frame_selection", 3);
            0qQ.A07(load3);
            C255183ti.A04(new T0P("ModelWithOptimizedSize", "blur_model", A1E, countDownLatch), load3, r8);
            countDownLatch.await();
            if (A1E.size() >= 3) {
                return A1E;
            }
            throw new Exception("Failed to download autogen models", (Throwable) null);
        }
        throw new Exception("modelLoader not available", (Throwable) null);
    }
}
