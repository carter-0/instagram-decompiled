package X;

import com.facebook.cameracore.ardelivery.model.ARModelMetadataRequest;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.facebook.cameracore.ardelivery.xplat.modelmanager.XplatModelMetadataCompletionCallback;
import com.facebook.cameracore.ardelivery.xplat.modelmanager.XplatModelMetadataResponse;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Slk  reason: case insensitive filesystem */
public final class C12057Slk implements DQV {
    public final List A00 = Pxf.A0v();
    public final AtomicBoolean A01 = JTQ.A0k();
    public final /* synthetic */ XplatModelMetadataCompletionCallback A02;

    public final void D5B(Exception exc, List list, Map map) {
        List A13;
        if (exc == null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ARModelMetadataRequest aRModelMetadataRequest = (ARModelMetadataRequest) it.next();
                if (!(map == null || (A13 = C66580MXl.A13(aRModelMetadataRequest.mCapability, map)) == null)) {
                    List list2 = this.A00;
                    int i = aRModelMetadataRequest.mRequestId;
                    VersionedCapability versionedCapability = aRModelMetadataRequest.mCapability;
                    0qQ.A07(versionedCapability);
                    list2.add(new XplatModelMetadataResponse(i, versionedCapability, aRModelMetadataRequest.mPreferredVersion, A13));
                }
            }
            if (this.A01.compareAndSet(false, true)) {
                XplatModelMetadataCompletionCallback xplatModelMetadataCompletionCallback = this.A02;
                List list3 = this.A00;
                0qQ.A06(list3);
                xplatModelMetadataCompletionCallback.onSuccess(list3);
            }
        } else if (this.A01.compareAndSet(false, true)) {
            String message = exc.getMessage();
            if (message != null) {
                this.A02.onFailure(message);
            } else {
                this.A02.onFailure("ModelMetadata fetch failed");
            }
        }
    }

    public C12057Slk(XplatModelMetadataCompletionCallback xplatModelMetadataCompletionCallback) {
        this.A02 = xplatModelMetadataCompletionCallback;
    }
}
