package X;

import android.content.Context;
import com.aiplatform.processors.segmentanything.SegmentAnythingOnDeviceProcessorV2;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.instagram.common.session.UserSession;

/* renamed from: X.XaQ  reason: case insensitive filesystem */
public final class C21416XaQ {
    public final YAP A00;
    public final 02m A01;
    public final boolean A02;

    public C21416XaQ(Context context, UserSession userSession) {
        AnonymousClass84S A002;
        C22025XtK segmentAnythingOnDeviceProcessorV2;
        0Tu r4 = 0Tu.A05;
        if (182.A06(r4, userSession, 36330681680282333L)) {
            segmentAnythingOnDeviceProcessorV2 = new XHJ(new AnonymousClass8CO(userSession, AnonymousClass7TE.A1I(C352658Eh.A00(AnonymousClass8Eg.ET_SEGMENT_ANYTHING_MODEL))));
            segmentAnythingOnDeviceProcessorV2.A00 = new AQ9(userSession, 3);
        } else {
            if (182.A06(r4, userSession, 36322431048165561L)) {
                A002 = null;
            } else {
                A002 = AnonymousClass84S.A00(context, userSession);
            }
            segmentAnythingOnDeviceProcessorV2 = new SegmentAnythingOnDeviceProcessorV2(new AnonymousClass8CM(A002, userSession, AnonymousClass7TE.A1I(VersionedCapability.SegmentAnything), AnonymousClass7TE.A1I(new AnonymousClass8CI("SegmentAnything", "PYTORCH_MODEL", 0sn.A00, 10020))));
        }
        YAP yap = (YAP) segmentAnythingOnDeviceProcessorV2;
        this.A00 = yap;
        02m r0 = 02m.A0p;
        0qQ.A07(r0);
        this.A01 = r0;
        this.A02 = 182.A06(r4, userSession, 36330681680282333L);
        yap.Efa(new XZI(this));
        yap.CgM();
    }
}
