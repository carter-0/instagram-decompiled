package com.xiaomi.market;

import android.os.Bundle;
import android.os.IInterface;

public interface IMarketDownloadService extends IInterface {
    boolean AG8(String str);

    boolean AQ6(Bundle bundle);

    int AXa();

    boolean CQd();

    boolean EBZ(IDownloadCallback iDownloadCallback);

    boolean FIM(IDownloadCallback iDownloadCallback);
}
