package com.facebook.cameracore.mediapipeline.services.externalasset;

import X.C9153RRe;
import com.facebook.native_bridge.NativeDataPromise;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class ExampleExternalAssetLocalDataSource implements ExternalAssetLocalDataSource {
    private String getLocalFilePath(String str) {
        if (str == null) {
            return null;
        }
        try {
            URL url = new URI(str).toURL();
            String protocol = url.getProtocol();
            if (protocol != null && protocol.equals("file")) {
                return url.getPath();
            }
        } catch (MalformedURLException | URISyntaxException unused) {
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.facebook.cameracore.mediapipeline.services.externalasset.ExternalAssetResponse, java.lang.Object] */
    public boolean getAsset(NativeDataPromise nativeDataPromise, String str, String str2) {
        DataInputStream dataInputStream;
        String localFilePath = getLocalFilePath(str);
        if (localFilePath == null) {
            return false;
        }
        File file = new File(localFilePath);
        byte[] bArr = new byte[((int) file.length())];
        try {
            dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
            dataInputStream.readFully(bArr);
            ? obj = new Object();
            obj.buffer = bArr;
            obj.length = (int) file.length();
            obj.completed = true;
            nativeDataPromise.setValue(obj);
            dataInputStream.close();
            return true;
        } catch (IOException unused) {
            nativeDataPromise.setException("ExampleExternalAssetLocalDataSource fails to load file.");
            return false;
        } catch (Throwable th) {
            C9153RRe.A00(th, th);
        }
        throw th;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getStreamingURI(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            int r0 = r5.hashCode()
            switch(r0) {
                case -384488815: goto L_0x0028;
                case 452781974: goto L_0x0033;
                case 1911932022: goto L_0x0042;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
        L_0x0009:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r2 = 0
            if (r1 != r0) goto L_0x0027
            java.lang.String r0 = r3.getLocalFilePath(r4)
            if (r0 == 0) goto L_0x0027
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            boolean r0 = r1.isFile()
            if (r0 == 0) goto L_0x0027
            java.net.URI r0 = r1.toURI()
            java.lang.String r2 = r0.toString()
        L_0x0027:
            return r2
        L_0x0028:
            java.lang.String r0 = "model/gltf-binary"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0007
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            goto L_0x0009
        L_0x0033:
            r0 = 105(0x69, float:1.47E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0007
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            goto L_0x0009
        L_0x0042:
            java.lang.String r0 = "image/*"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0007
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.mediapipeline.services.externalasset.ExampleExternalAssetLocalDataSource.getStreamingURI(java.lang.String, java.lang.String):java.lang.String");
    }
}
