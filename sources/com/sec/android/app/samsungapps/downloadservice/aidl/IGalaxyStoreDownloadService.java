package com.sec.android.app.samsungapps.downloadservice.aidl;

import android.os.Bundle;
import android.os.IInterface;

public interface IGalaxyStoreDownloadService extends IInterface {
    void AGF(String str);

    void AQ7(Bundle bundle, IGalaxyStoreDownloadCallback iGalaxyStoreDownloadCallback);

    void CM1(Bundle bundle);
}
