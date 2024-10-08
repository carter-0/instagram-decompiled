package X;

import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.realtimeclient.RealtimeConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Ufk  reason: case insensitive filesystem */
public final class C15618Ufk extends 1P0 {
    public final /* synthetic */ C17978VjG A00;
    public final /* synthetic */ AnonymousClass507 A01;

    public C15618Ufk(C17978VjG vjG, AnonymousClass507 r2) {
        this.A01 = r2;
        this.A00 = vjG;
    }

    private void A00(C15629Ufv ufv) {
        String str;
        String A002 = C273654mx.A00(3504);
        A002.getClass();
        0xI A012 = 0xI.A01(A002, (String) null);
        A012.A0C("event_type", "ping");
        C17978VjG vjG = this.A00;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key", vjG.A01);
            jSONObject.put("url", vjG.A02);
            jSONObject.put("cooldown", vjG.A00);
            str = jSONObject.toString();
        } catch (JSONException e) {
            0KC.A0G("IgZeroCarrierSignalController", "Ping config serialization failure", e);
            str = null;
        }
        A012.A0C("config", str);
        A012.A0C("url", vjG.A02);
        if (ufv != null) {
            A012.A08(Integer.valueOf(ufv.mStatusCode), IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS);
            A012.A09(RealtimeConstants.SEND_SUCCESS, Boolean.valueOf(ufv.A01));
            A012.A09("state_changed", Boolean.valueOf(ufv.A00));
        } else {
            A012.A0C(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, (String) null);
            A012.A0C(RealtimeConstants.SEND_SUCCESS, (String) null);
            A012.A0C("state_changed", (String) null);
        }
        DbU.A1R(A012, this.A01.A00);
        A012.A03();
    }

    public final void onFail(C268654dm r3) {
        int A03 = AnonymousClass0fD.A03(353542289);
        A00((C15629Ufv) r3.A00());
        AnonymousClass0fD.A0A(536232826, A03);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0fD.A03(-557729027);
        this.A01.A02 = false;
        AnonymousClass0fD.A0A(1703164317, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        int A03 = AnonymousClass0fD.A03(-970040107);
        C15629Ufv ufv = (C15629Ufv) obj;
        int A032 = AnonymousClass0fD.A03(-1052576329);
        C15618Ufk.super.onSuccess(ufv);
        A00(ufv);
        1R0 r2 = this.A01.A06;
        if (r2 == null) {
            i = -235881528;
        } else {
            if (ufv.A01 && ufv.A00) {
                r2.AWJ(Pxd.A00(661), true);
            }
            i = -1358727160;
        }
        AnonymousClass0fD.A0A(i, A032);
        AnonymousClass0fD.A0A(144849575, A03);
    }
}
