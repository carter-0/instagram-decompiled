package X;

import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.facebook.cameracore.ardelivery.xplat.modelmanager.versionfetcher.RemoteModelVersionFetcher;
import com.facebook.cameracore.ardelivery.xplat.modelmanager.versionfetcher.XplatRemoteModelVersionFetchCompletionCallback;
import com.google.common.collect.ImmutableList;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6fY  reason: invalid class name and case insensitive filesystem */
public final class C312996fY implements RemoteModelVersionFetcher {
    public final C312946fT A00;
    public final C312956fU A01;
    public final 1vo A02;

    public C312996fY(C312946fT r2, C312956fU r3, 1vo r4) {
        0qQ.A0B(r4, 1);
        this.A02 = r4;
        this.A00 = r2;
        this.A01 = r3;
    }

    public final void fetchServerPreferredVersions(List list, XplatRemoteModelVersionFetchCompletionCallback xplatRemoteModelVersionFetchCompletionCallback) {
        0qQ.A0B(list, 0);
        0qQ.A0B(xplatRemoteModelVersionFetchCompletionCallback, 1);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String serverValue = ((VersionedCapability) it.next()).toServerValue();
            0qQ.A07(serverValue);
            arrayList.add(serverValue);
        }
        try {
            AnonymousClass8LI r3 = (AnonymousClass8LI) AnonymousClass8LH.class.getMethod("create", new Class[0]).invoke((Object) null, new Object[0]);
            ImmutableList copyOf = ImmutableList.copyOf((Collection) arrayList);
            r3.A00.A05("models", copyOf);
            boolean z = false;
            if (copyOf != null) {
                z = true;
            }
            r3.A02 = z;
            1Ef build = r3.build();
            this.A02.ATL(new C354618Ms(xplatRemoteModelVersionFetchCompletionCallback), new C354458Mc(this, xplatRemoteModelVersionFetchCompletionCallback, list, arrayList), build);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
