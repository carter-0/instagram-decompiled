package X;

import com.facebook.cameracore.mediapipeline.services.networking.implementation.instagram.IgNetworkClientWorkerImplHost;
import java.util.Map;
import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;

/* renamed from: X.TPo  reason: case insensitive filesystem */
public final class C13207TPo implements ResponseHandler {
    public final /* synthetic */ IgNetworkClientWorkerImplHost A00;
    public final /* synthetic */ String A01;

    public C13207TPo(IgNetworkClientWorkerImplHost igNetworkClientWorkerImplHost, String str) {
        this.A00 = igNetworkClientWorkerImplHost;
        this.A01 = str;
    }

    public final Object handleResponse(HttpResponse httpResponse) {
        Map map = this.A00.A00;
        String str = this.A01;
        0qQ.A0A(httpResponse);
        return map.put(str, httpResponse);
    }
}
