package X;

import android.content.Context;
import android.os.Bundle;
import android.webkit.CookieSyncManager;
import com.facebook.browser.lite.ipc.BrowserLiteCallback;
import com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCall;
import com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCallback;
import com.facebook.browser.lite.ipc.OnShopsLiteCallback;
import com.facebook.privacy.zone.policy.ZonePolicy;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: X.S3o  reason: case insensitive filesystem */
public abstract class C10980S3o {
    public final /* synthetic */ SRY A00;

    public C10980S3o(SRY sry) {
        this.A00 = sry;
    }

    public void A00(BrowserLiteCallback browserLiteCallback) {
        BrowserLiteCallback browserLiteCallback2 = browserLiteCallback;
        if (this instanceof C7558QJi) {
            C7558QJi qJi = (C7558QJi) this;
            browserLiteCallback2.DJb(qJi.A00, qJi.A02, qJi.A03);
        } else if (this instanceof QJx) {
            QJx qJx = (QJx) this;
            switch (qJx.A00) {
                case 0:
                    browserLiteCallback2.EGr((Bundle) qJx.A03, (long[]) qJx.A02);
                    return;
                case 1:
                    browserLiteCallback2.Dvy((Bundle) qJx.A03, (Map) qJx.A02);
                    return;
                case 2:
                    browserLiteCallback2.Ckd((Bundle) qJx.A03, (Map) qJx.A02);
                    return;
                case 3:
                    browserLiteCallback2.E1I((Bundle) qJx.A02, (OnShopsLiteCallback) qJx.A03);
                    return;
                default:
                    browserLiteCallback2.DMa((BrowserLiteJSBridgeCall) qJx.A03, (BrowserLiteJSBridgeCallback) qJx.A02);
                    return;
            }
        } else if (this instanceof QJm) {
            QJm qJm = (QJm) this;
            browserLiteCallback2.DW2(qJm.A00, qJm.A03, qJm.A01);
        } else if (this instanceof C7561QJl) {
            C7561QJl qJl = (C7561QJl) this;
            browserLiteCallback2.DWC(qJl.A00, qJl.A03, qJl.A02);
        } else if (this instanceof QJe) {
            if (((QJe) this).A00 != 0) {
                browserLiteCallback2.DjK();
            } else {
                browserLiteCallback2.DFy();
            }
        } else if (this instanceof C7566QJu) {
            C7566QJu qJu = (C7566QJu) this;
            long[] jArr = qJu.A05;
            if (jArr.length > 0) {
                browserLiteCallback2.EGr(qJu.A00, jArr);
            }
            browserLiteCallback2.DWP(qJu.A00, qJu.A02, qJu.A03, qJu.A04);
        } else if (this instanceof C7560QJk) {
            C7560QJk qJk = (C7560QJk) this;
            browserLiteCallback2.Dfd(qJk.A00, qJk.A02, qJk.A03);
        } else if (this instanceof QJg) {
            QJg qJg = (QJg) this;
            browserLiteCallback2.D6X(qJg.A02, qJg.A00);
        } else if (this instanceof QJc) {
            Context context = ((QJc) this).A00;
            Pattern pattern = SCX.A01;
            CookieSyncManager.createInstance(context);
            try {
                RUF.A00().flush();
            } catch (Exception unused) {
            }
            browserLiteCallback2.EzO();
        } else if (this instanceof C7559QJj) {
            C7559QJj qJj = (C7559QJj) this;
            browserLiteCallback2.AE8(qJj.A00, qJj.A02, "INTEGRITY_LOGGER", qJj.A03);
        } else if (this instanceof QJo) {
            QJo qJo = (QJo) this;
            String str = qJo.A04;
            browserLiteCallback2.DW5(qJo.A02, str, qJo.A00, qJo.A01);
        } else if (this instanceof C7562QJq) {
            C7562QJq qJq = (C7562QJq) this;
            String str2 = qJq.A04;
            String str3 = qJq.A03;
            Map map = qJq.A05;
            browserLiteCallback2.DDK(qJq.A00, qJq.A02, str2, str3, map);
        } else if (this instanceof C7568QJw) {
            C7568QJw qJw = (C7568QJw) this;
            String str4 = qJw.A0A;
            long j = qJw.A04;
            long j2 = qJw.A05;
            long j3 = qJw.A01;
            long j4 = qJw.A03;
            long j5 = qJw.A02;
            int i = qJw.A00;
            boolean z = qJw.A0G;
            boolean z2 = qJw.A0F;
            HashMap hashMap = qJw.A0C;
            boolean z3 = qJw.A0E;
            String str5 = qJw.A0B;
            Map map2 = qJw.A0D;
            boolean z4 = z;
            boolean z5 = z2;
            boolean z6 = z3;
            Bundle bundle = qJw.A07;
            ZonePolicy zonePolicy = qJw.A09;
            String str6 = str4;
            String str7 = str5;
            browserLiteCallback2.Cj2(bundle, zonePolicy, str6, str7, hashMap, map2, i, j, j2, j3, j4, j5, false, z4, z5, z6);
        } else if (this instanceof C7567QJv) {
            C7567QJv qJv = (C7567QJv) this;
            if (qJv.A00 != 0) {
                String str8 = qJv.A04;
                browserLiteCallback2.ChJ(qJv.A01, str8, qJv.A05, (Map) qJv.A03);
                return;
            }
            String str9 = qJv.A04;
            browserLiteCallback2.ChK(qJv.A01, str9, qJv.A05, (Map) qJv.A03);
        } else if (this instanceof QJd) {
            browserLiteCallback2.CIO(((QJd) this).A01);
        } else if (this instanceof C7557QJh) {
            C7557QJh qJh = (C7557QJh) this;
            browserLiteCallback2.CIP(qJh.A01, qJh.A02);
        } else if (this instanceof C7565QJt) {
            C7565QJt qJt = (C7565QJt) this;
            String str10 = qJt.A04;
            String str11 = qJt.A03;
            String str12 = qJt.A05;
            browserLiteCallback2.DJf(qJt.A00, qJt.A02, str10, str11, str12);
        } else if (this instanceof C7564QJs) {
            C7564QJs qJs = (C7564QJs) this;
            String str13 = qJs.A04;
            String str14 = qJs.A03;
            String str15 = qJs.A05;
            browserLiteCallback2.DJd(qJs.A00, qJs.A02, str13, str14, str15);
        } else if (this instanceof C7563QJr) {
            C7563QJr qJr = (C7563QJr) this;
            String str16 = qJr.A04;
            String str17 = qJr.A03;
            String str18 = qJr.A05;
            browserLiteCallback2.DJa(qJr.A00, qJr.A02, str16, str17, str18);
        } else if (this instanceof QJf) {
            QJf qJf = (QJf) this;
            browserLiteCallback2.DJY(qJf.A01, qJf.A02);
        } else if (this instanceof QJb) {
            browserLiteCallback2.CJD(((QJb) this).A00);
        } else if (this instanceof QJn) {
            QJn qJn = (QJn) this;
            browserLiteCallback2.CiT(qJn.A00, qJn.A03, qJn.A02, qJn.A04);
        } else {
            QJp qJp = (QJp) this;
            String str19 = qJp.A03;
            boolean z7 = qJp.A05;
            String str20 = qJp.A04;
            long j6 = qJp.A00;
            browserLiteCallback2.CjG(qJp.A01, str19, str20, j6, z7);
        }
    }

    public final void A01(Exception exc) {
        String str;
        String str2;
        if (this instanceof C7568QJw) {
            0KC.A0J("BrowserLiteCallbacker", "Error in logInitialUrlTiming", exc);
            try {
                JTO.A0s(((C7568QJw) this).A06.getFilesDir(), "browser_ipc_failed").createNewFile();
            } catch (IOException unused) {
            }
        } else {
            if ((this instanceof QJn) || (this instanceof QJp)) {
                str = "BrowserLiteCallbacker";
                str2 = "Error in logMAIPlayStoreEvent";
            } else {
                str = "BrowserLiteCallbacker";
                str2 = "BrowserLiteService remote exception happened";
            }
            0KC.A0J(str, str2, exc);
        }
    }
}
