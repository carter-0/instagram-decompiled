package X;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import com.facebook.endtoend.EndToEnd;
import com.facebook.neko.directinstall.installer.SamsungDirectInstallAgentManager$iGalaxyStoreDownloadCallback$1;
import com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadCallback;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.concurrent.atomic.AtomicReference;

public final class QQU extends SJG {
    public final ServiceConnection A00;
    public final ServiceConnection A01;
    public final Handler A02;
    public final C13771Tgk A03;
    public final IGalaxyStoreDownloadCallback A04;
    public final AtomicReference A05;
    public final AtomicReference A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public QQU(Context context, C10806RyS ryS) {
        super(context, ryS, "galaxy_store");
        Object sny;
        if (C10072Rm9.A00.get() || EndToEnd.isRunningEndToEndTest()) {
            sny = new C12150Sny();
        } else {
            sny = new Object();
        }
        this.A03 = (C13771Tgk) sny;
        this.A02 = AnonymousClass7TF.A0D();
        AtomicReference atomicReference = new AtomicReference();
        this.A06 = atomicReference;
        AtomicReference atomicReference2 = new AtomicReference();
        this.A05 = atomicReference2;
        this.A00 = new SVW(this, atomicReference, true);
        this.A01 = new SVW(this, atomicReference2, false);
        this.A04 = new SamsungDirectInstallAgentManager$iGalaxyStoreDownloadCallback$1(this);
        this.A00 = -1;
    }

    public static final Bundle A00(QQU qqu, boolean z) {
        String str = qqu.A06;
        String A0g = 002.A0g("https://apps.samsung.com/appquery/appDetail.as?appId=", str, "&nonOrgType=fce692ba&ads=3b9e00d3&referrer=");
        String str2 = qqu.A07;
        try {
            str2 = URLEncoder.encode(str2, "utf-8");
            0KC.A0O("DirectInstallAgentManagerSamsung", "%s %s", new Object[]{A0g, str2});
        } catch (UnsupportedEncodingException e) {
            0KC.A0F("DirectInstallAgentManagerSamsung", "Referrer cannot be encoded.", e);
        }
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("linkInfo", 002.A0R(A0g, str2));
        if (z) {
            A0a.putString("packageName", str);
            A0a.putString("ads", "3b9e00d3");
            A0a.putString("installReferrer", "fb_direct");
        }
        return A0a;
    }

    public static final void A01(ServiceConnection serviceConnection, QQU qqu) {
        SOJ soj = qqu.A04;
        soj.A01("IPC_SERVICE_BIND_REQUESTED");
        try {
            Intent A09 = DbS.A09();
            A09.setClassName("com.sec.android.app.samsungapps", "com.sec.android.app.samsungapps.downloadservice.GalaxyStoreDownloadService");
            C13771Tgk tgk = qqu.A03;
            Context context = qqu.A01;
            0qQ.A06(context);
            if (!tgk.ADg(context, A09, serviceConnection)) {
                SOJ.A00(C8951RIq.ERROR_SERVICE_UNAVAILABLE, soj, (Long) null, "FAILED_SERVICE_CONNECTION", (String) null);
                qqu.A03.A00(C8896REo.FAILED_DOWNLOAD);
                qqu.A03();
            }
        } catch (SecurityException e) {
            SJG.A02(qqu, soj, "FAILED_SERVICE_CONNECTION", e.getMessage());
            qqu.A03();
        }
    }
}
