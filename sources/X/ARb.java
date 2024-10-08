package X;

import com.facebook.cameracore.mediapipeline.dataproviders.facetracker.interfaces.FaceTrackerDataProviderConfiguration$FaceTrackerErrorHandler;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public final class ARb implements FaceTrackerDataProviderConfiguration$FaceTrackerErrorHandler {
    public final /* synthetic */ C368828tO A00;
    public final /* synthetic */ C371298xy A01;

    public ARb(C368828tO r1, C371298xy r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void handleLoadError(String str) {
        long j;
        IOException iOException = new IOException(str);
        HashMap hashMap = this.A01.A0I;
        StringBuilder A0n = AnonymousClass7TF.A0n("onFaceTrackerLoadModelFailed");
        for (Object next : hashMap.keySet()) {
            String str2 = (String) hashMap.get(next);
            if (str2 != null) {
                File A0t = AnonymousClass7TE.A0t(str2);
                if (A0t.exists()) {
                    j = A0t.length();
                } else {
                    j = 0;
                }
            } else {
                j = -1;
            }
            A0n.append(" ");
            A0n.append((String) hashMap.get(next));
            A0n.append(":");
            A0n.append(j);
        }
        String obj = A0n.toString();
        String A002 = Pxd.A00(497);
        0qQ.A0A(obj);
        0kD.A07(A002, obj, iOException);
    }
}
