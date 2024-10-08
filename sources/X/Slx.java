package X;

import android.os.Build;
import android.os.Bundle;
import com.facebook.cameracore.util.memory.VersionedSharedMemory;
import com.meta.arfx.engine.interfaces.ARNetworkClientWorkerResponse;
import com.meta.arfx.engine.interfaces.IARNetworkClientWorkerHost;
import java.io.ByteArrayInputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolVersion;
import org.apache.http.client.ResponseHandler;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.message.BasicHttpResponse;

public final class Slx implements C41794B0z {
    public IARNetworkClientWorkerHost A00;
    public final Map A01 = AnonymousClass7TE.A1H();
    public final Map A02 = AnonymousClass7TE.A1H();

    public final void EMb(2IR r9, String str, String str2, String str3, ResponseHandler responseHandler, String[] strArr, String[] strArr2, boolean z) {
        String str4 = str;
        String str5 = str2;
        String[] strArr3 = strArr;
        C51974G9v.A1K(str, str2, strArr);
        String[] strArr4 = strArr2;
        0qQ.A0B(strArr2, 4);
        String A0n = C51972G9s.A0n();
        this.A01.put(A0n, r9);
        this.A02.put(A0n, responseHandler);
        IARNetworkClientWorkerHost iARNetworkClientWorkerHost = this.A00;
        if (iARNetworkClientWorkerHost != null) {
            iARNetworkClientWorkerHost.EMa(A0n, str4, str5, str3, strArr3, strArr4, z);
        }
    }

    public final void A00() {
        Bundle Bnl;
        Object parcelable;
        Object parcelable2;
        Map map = this.A01;
        List A0a = 00k.A0a(map.keySet());
        IARNetworkClientWorkerHost iARNetworkClientWorkerHost = this.A00;
        if (iARNetworkClientWorkerHost != null && (Bnl = iARNetworkClientWorkerHost.Bnl()) != null) {
            Class<ARNetworkClientWorkerResponse> cls = ARNetworkClientWorkerResponse.class;
            Bnl.setClassLoader(cls.getClassLoader());
            Iterator it = A0a.iterator();
            while (it.hasNext()) {
                String A18 = AnonymousClass7TE.A18(it);
                if (Bnl.containsKey(A18)) {
                    Map map2 = this.A02;
                    if (map2.containsKey(A18)) {
                        int i = Build.VERSION.SDK_INT;
                        if (i >= 33) {
                            parcelable = Bnl.getParcelable(A18, cls);
                        } else {
                            parcelable = Bnl.getParcelable(A18);
                        }
                        ARNetworkClientWorkerResponse aRNetworkClientWorkerResponse = (ARNetworkClientWorkerResponse) parcelable;
                        if (i >= 33) {
                            parcelable2 = Bnl.getParcelable("bodyStream", VersionedSharedMemory.TAG);
                        } else {
                            parcelable2 = Bnl.getParcelable("bodyStream");
                        }
                        VersionedSharedMemory versionedSharedMemory = (VersionedSharedMemory) parcelable2;
                        if (versionedSharedMemory != null) {
                            int i2 = versionedSharedMemory.size;
                            ByteBuffer mapReadOnly = versionedSharedMemory.mapReadOnly();
                            byte[] bArr = new byte[i2];
                            if (mapReadOnly != null) {
                                mapReadOnly.get(bArr, 0, i2);
                            }
                            if (aRNetworkClientWorkerResponse != null) {
                                aRNetworkClientWorkerResponse.A03 = bArr;
                            }
                            versionedSharedMemory.unmap(mapReadOnly);
                            versionedSharedMemory.close();
                            IARNetworkClientWorkerHost iARNetworkClientWorkerHost2 = this.A00;
                            if (iARNetworkClientWorkerHost2 != null) {
                                iARNetworkClientWorkerHost2.AI8(A18);
                            }
                        }
                        2IR r5 = (2IR) map.get(A18);
                        ResponseHandler responseHandler = (ResponseHandler) map2.get(A18);
                        if (!(aRNetworkClientWorkerResponse == null || r5 == null || responseHandler == null)) {
                            ProtocolVersion protocolVersion = HttpVersion.HTTP_1_1;
                            int i3 = aRNetworkClientWorkerResponse.A00;
                            String str = aRNetworkClientWorkerResponse.A02;
                            if (str == null) {
                                str = "";
                            }
                            HttpResponse basicHttpResponse = new BasicHttpResponse(protocolVersion, i3, str);
                            byte[] bArr2 = aRNetworkClientWorkerResponse.A03;
                            0qQ.A06(bArr2);
                            basicHttpResponse.setEntity(new InputStreamEntity(new ByteArrayInputStream(bArr2), aRNetworkClientWorkerResponse.A01));
                            r5.onSuccess(responseHandler.handleResponse(basicHttpResponse));
                            map2.remove(A18);
                            map.remove(A18);
                        }
                    }
                }
            }
        }
    }
}
