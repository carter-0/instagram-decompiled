package X;

import android.content.Context;
import com.aiplatform.modelloaders.nativemodelloader.ig.IgVoltronModelLoader;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.9xO  reason: invalid class name and case insensitive filesystem */
public abstract class C394009xO {
    public static final void A00(Context context, UserSession userSession) {
        List A1P;
        AnonymousClass8CI[] r3;
        AnonymousClass84S A00;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 1);
        if (182.A06(0Tu.A06, userSession2, 36329156966891354L)) {
            A1P = 0sr.A1P(new VersionedCapability[]{VersionedCapability.Saliency, VersionedCapability.SegmentAnything, VersionedCapability.UTwoNet});
            List list = 0sn.A00;
            r3 = new AnonymousClass8CI[]{new AnonymousClass8CI("Saliency", "PYTORCH_MODEL", list, 2020), new AnonymousClass8CI("SegmentAnything", "PYTORCH_MODEL", list, 10020), new AnonymousClass8CI("UTWONET", "ET_MODEL", list, 1), new AnonymousClass8CI("UTwoNet", "PYTORCH_MODEL", list, 1020)};
        } else {
            A1P = 0sr.A1P(new VersionedCapability[]{VersionedCapability.Saliency, VersionedCapability.SegmentAnything});
            List list2 = 0sn.A00;
            r3 = new AnonymousClass8CI[]{new AnonymousClass8CI("Saliency", "PYTORCH_MODEL", list2, 2020), new AnonymousClass8CI("SegmentAnything", "PYTORCH_MODEL", list2, 10020)};
        }
        List A1P2 = 0sr.A1P(r3);
        boolean A06 = 182.A06(0Tu.A05, userSession2, 36322431048165561L);
        IgVoltronModelLoader.Companion.A00(userSession2).fetchAllModules();
        if (A06) {
            A00 = null;
        } else {
            A00 = AnonymousClass84S.A00(context, userSession2);
        }
        new AnonymousClass8CM(A00, userSession2, A1P, A1P2).AUy(new AnonymousClass8CP(), true);
    }
}
