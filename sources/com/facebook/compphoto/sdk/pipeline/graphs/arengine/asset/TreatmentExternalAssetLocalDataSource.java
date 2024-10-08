package com.facebook.compphoto.sdk.pipeline.graphs.arengine.asset;

import X.C9153RRe;
import com.facebook.cameracore.mediapipeline.services.externalasset.ExternalAssetLocalDataSource;
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

public class TreatmentExternalAssetLocalDataSource implements ExternalAssetLocalDataSource {
    private String getLocalFilePath(String str) {
        if (str == null) {
            return null;
        }
        try {
            URL url = new URI(str).toURL();
            String protocol = url.getProtocol();
            String host = url.getHost();
            if (protocol != null && protocol.equals("file") && host != null && host.equals("file.path")) {
                return url.getPath();
            }
        } catch (MalformedURLException | URISyntaxException unused) {
        }
        return null;
    }

    public String getStreamingURI(String str, String str2) {
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
}
