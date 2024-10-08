package X;

import android.content.Context;
import com.facebook.avatar.autogen.facetracker.AEFaceTrackerManager;
import com.facebook.avatar.autogen.flow.AESelfieCaptureConfig;
import com.facebook.smartcapture.facetracker.FaceTrackerModelsProvider;

/* renamed from: X.Sln  reason: case insensitive filesystem */
public final class C12060Sln implements C41825B2g {
    public RFO A00;
    public boolean A01;
    public boolean A02;
    public final AEFaceTrackerManager A03;
    public final AESelfieCaptureConfig A04;
    public final C11254SHo A05;
    public final 05G A06;
    public final AnonymousClass4CZ A07;

    public C12060Sln(Context context, AESelfieCaptureConfig aESelfieCaptureConfig, C11254SHo sHo, AnonymousClass4CZ r9) {
        this.A04 = aESelfieCaptureConfig;
        this.A05 = sHo;
        this.A07 = r9;
        FaceTrackerModelsProvider faceTrackerModelsProvider = aESelfieCaptureConfig.A00;
        AEFaceTrackerManager aEFaceTrackerManager = AEFaceTrackerManager.faceTrackerManager;
        aEFaceTrackerManager = aEFaceTrackerManager == null ? new AEFaceTrackerManager(DbT.A05(context), faceTrackerModelsProvider, (C13413TZt) null) : aEFaceTrackerManager;
        AEFaceTrackerManager.faceTrackerManager = aEFaceTrackerManager;
        AEFaceTrackerManager.delegate = this;
        this.A03 = aEFaceTrackerManager;
        this.A06 = 106.A01((Object) null);
        this.A01 = true;
        AnonymousClass7TE.A1Z(new C59676JTh((Object) this, (AnonymousClass4D7) null, 25), 19E.A02(r9));
    }

    public final void D07(Exception exc) {
    }

    public final void D0B() {
    }

    public final void D0C(String str, String str2) {
    }

    public final void D0G() {
    }
}
