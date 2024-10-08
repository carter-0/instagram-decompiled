package X;

import android.os.Bundle;
import android.webkit.JavascriptInterface;
import com.facebook.privacy.zone.policy.ZonePolicy;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.VhS  reason: case insensitive filesystem */
public final class C17875VhS {
    public final Bundle A00;
    public final SRY A01;
    public final C39896ADy A02;
    public final A9z A03;
    public final ZonePolicy A04;

    @JavascriptInterface
    public final String createAndSubmitConversionReport(int i) {
        C39896ADy aDy = this.A02;
        byte b = (byte) i;
        long A012 = aDy.A01();
        C39896ADy.A00(aDy);
        W1S w1s = VJQ.A00;
        long j = aDy.A01;
        int i2 = (int) A012;
        String str = aDy.A07;
        A8N a8n = aDy.A05;
        Map map = aDy.A02;
        if (map == null) {
            0qQ.A0F("keysetHandles");
            throw AnonymousClass00P.createAndThrow();
        }
        0qQ.A0B(a8n, 4);
        C18398Vqy.A00 = 824189150;
        02m r6 = C18398Vqy.A01;
        r6.markerStart(824189150);
        C18398Vqy.A00("get_encrypted_match_key_start");
        Integer num = AnonymousClass05K.A00;
        AnonymousClass59G A032 = w1s.A03(a8n, num, str, map, j);
        C18398Vqy.A00("get_encrypted_match_key_end");
        C18398Vqy.A00("get_encrypted_event_details_start");
        C17747VdG vdG = C18750Vzl.A03;
        AnonymousClass59G A002 = vdG.A00(C16479UvZ.A04, (long) i2);
        AnonymousClass59G A003 = vdG.A00(C16479UvZ.A02, 0);
        AnonymousClass59G A004 = vdG.A00(C16479UvZ.A05, (long) b);
        AnonymousClass59G A042 = w1s.A04(a8n, num, str, map, new AnonymousClass59G(V5W.A00((C18750Vzl) A002.A00, (C18750Vzl) A003.A00, (C18750Vzl) A004.A00), V5W.A00((C18750Vzl) A002.A01, (C18750Vzl) A003.A01, (C18750Vzl) A004.A01), V5W.A00((C18750Vzl) A002.A02, (C18750Vzl) A003.A02, (C18750Vzl) A004.A02)));
        C18398Vqy.A00("get_encrypted_event_details_end");
        C18398Vqy.A00("get_encrypted_reports_start");
        AnonymousClass59G A013 = W1S.A01(A032, A042);
        C18398Vqy.A00("get_encrypted_reports_end");
        r6.markerEnd(C18398Vqy.A00, 2);
        C10927S1f s1f = aDy.A06;
        s1f.A00.add(new 0eP(C8906REz.EncryptedReport, A013));
        this.A01.A06(this.A00, this.A03.A02((Long) null, aDy.A08, aDy.A02(AnonymousClass05K.A01), aDy.A01(), aDy.A04), this.A04);
        Integer num2 = AnonymousClass05K.A0C;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", "0.0");
        jSONObject.put("per_helper", new JSONArray(s1f.A00(num2, true, false)));
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("report", jSONObject);
        jSONObject2.put(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, "OK");
        return String.valueOf(jSONObject2);
    }

    public C17875VhS(Bundle bundle, SRY sry, C39896ADy aDy, A9z a9z, ZonePolicy zonePolicy) {
        C51974G9v.A1M(sry, a9z, bundle);
        0qQ.A0B(zonePolicy, 5);
        this.A02 = aDy;
        this.A01 = sry;
        this.A03 = a9z;
        this.A00 = bundle;
        this.A04 = zonePolicy;
    }
}
