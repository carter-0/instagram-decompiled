package X;

import android.net.Uri;
import com.facebook.browser.lite.pixelrequestbuffer.igpixelrequestbuffer.IGPixelRequestBuffer;
import java.net.URISyntaxException;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;

/* renamed from: X.SsZ  reason: case insensitive filesystem */
public final class C12385SsZ implements C13820Thp {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final C11224SFy A03;
    public final C10986S3y A04;
    public final S1R A05;
    public final String A06;

    public final void ELR(RQK rqk, C13727Tfx tfx) {
        if (this.A00) {
            Map emptyMap = Collections.emptyMap();
            0qQ.A07(emptyMap);
            tfx.D5I("", 0, emptyMap);
            return;
        }
        try {
            A00(tfx, "cancel", 0Yt.A0E());
        } catch (JSONException e) {
            Map emptyMap2 = Collections.emptyMap();
            0qQ.A07(emptyMap2);
            tfx.DEh(e, emptyMap2, 0, false);
        }
    }

    public final void ELd(RQK rqk, C13727Tfx tfx) {
        if (this.A01) {
            Map emptyMap = Collections.emptyMap();
            0qQ.A07(emptyMap);
            tfx.D5I("", 0, emptyMap);
            return;
        }
        try {
            A00(tfx, "end", this.A04.A01(rqk));
        } catch (JSONException e) {
            Map emptyMap2 = Collections.emptyMap();
            0qQ.A07(emptyMap2);
            tfx.DEh(e, emptyMap2, 0, false);
        }
    }

    public final C10986S3y BnD() {
        return this.A04;
    }

    public final void EMS(C11286SJe sJe, RQK rqk, C13727Tfx tfx, C11284SJc sJc) {
        int i;
        Map emptyMap;
        if (sJe != null) {
            i = sJe.A00;
            emptyMap = sJe.A0A;
        } else {
            i = 0;
            emptyMap = Collections.emptyMap();
            0qQ.A07(emptyMap);
        }
        tfx.D5I("", i, emptyMap);
    }

    public final void EMk(C7232Q0d q0d, C13727Tfx tfx) {
        LinkedHashMap A0E;
        if (this.A02) {
            Map emptyMap = Collections.emptyMap();
            0qQ.A07(emptyMap);
            tfx.D5I("", 0, emptyMap);
            return;
        }
        C10986S3y s3y = this.A04;
        if (s3y instanceof C7968QeG) {
            A0E = ((C7968QeG) s3y).A00.A00(true);
        } else {
            A0E = 0Yt.A0E();
        }
        A00(tfx, "start", A0E);
    }

    public C12385SsZ(C11224SFy sFy, C10986S3y s3y, S1R s1r, String str) {
        this.A03 = sFy;
        this.A04 = s3y;
        this.A05 = s1r;
        this.A06 = str;
    }

    private final void A00(C13727Tfx tfx, String str, Map map) {
        HashMap A1E = AnonymousClass7TE.A1E();
        C11224SFy sFy = this.A03;
        A1E.putAll(sFy.A0B);
        String str2 = this.A06;
        HashMap A0r = Pxf.A0r(str2, 1);
        Integer num = AnonymousClass05K.A01;
        A0r.put("X_FB_VIDEO_WATERFALL_ID", str2);
        A1E.putAll(A0r);
        try {
            A1E.putAll(map);
            S1R s1r = this.A05;
            String str3 = sFy.A09;
            if (str3 == null || str3.length() == 0) {
                str3 = 002.A0R("rupload.", IGPixelRequestBuffer.URL_PREFIX);
            }
            Uri.Builder A0I = Pxe.A0I();
            A0I.scheme("https").encodedAuthority(str3).appendPath(sFy.A03.A01).appendPath(AnonymousClass7TF.A0b()).appendQueryParameter("segmented", "true").appendQueryParameter("phase", str);
            String str4 = sFy.A0A;
            if (!(str4 == null || str4.length() == 0)) {
                A0I.appendQueryParameter("target", str4);
            }
            s1r.A00(new QN5(tfx), (C10392RrT) null, num, Pxg.A11(A0I), A1E);
        } catch (RuntimeException | URISyntaxException e) {
            Map emptyMap = Collections.emptyMap();
            0qQ.A07(emptyMap);
            tfx.DEh(e, emptyMap, 0, false);
        }
    }
}
