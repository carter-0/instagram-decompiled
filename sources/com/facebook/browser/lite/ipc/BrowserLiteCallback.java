package com.facebook.browser.lite.ipc;

import android.os.Bundle;
import android.os.IInterface;
import com.facebook.iabeventlogging.model.IABEvent;
import com.facebook.privacy.zone.policy.ZonePolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface BrowserLiteCallback extends IInterface {
    void AE8(Bundle bundle, ZonePolicy zonePolicy, String str, Map map);

    void AUp(AutofillContactDataCallback autofillContactDataCallback);

    void AUq(AutofillScriptCallback autofillScriptCallback);

    PrefetchCacheEntry Bei(String str);

    ArrayList Bej();

    void CIO(String str);

    void CIP(String str, String str2);

    int CIl(String str);

    boolean CIr(Bundle bundle, ZonePolicy zonePolicy, String str);

    boolean CJ3(String str);

    boolean CJC(String str, String str2);

    void CJD(Bundle bundle);

    void Cff(String str);

    void ChE(String str);

    void ChJ(long j, String str, String str2, Map map);

    void ChK(long j, String str, String str2, Map map);

    void CiT(Bundle bundle, String str, String str2, boolean z);

    void Cj2(Bundle bundle, ZonePolicy zonePolicy, String str, String str2, Map map, Map map2, int i, long j, long j2, long j3, long j4, long j5, boolean z, boolean z2, boolean z3, boolean z4);

    void CjG(Bundle bundle, String str, String str2, long j, boolean z);

    void Ckd(Bundle bundle, Map map);

    String Cn4(String str);

    void Cx9(AutofillOptOutCallback autofillOptOutCallback, String str);

    void D6X(String str, Bundle bundle);

    void DDK(Bundle bundle, ZonePolicy zonePolicy, String str, String str2, Map map);

    void DFy();

    void DJY(String str, List list);

    void DJa(Bundle bundle, IABBloksGraphQLCallback iABBloksGraphQLCallback, String str, String str2, String str3);

    void DJb(Bundle bundle, IABEvent iABEvent, ZonePolicy zonePolicy);

    void DJc(Bundle bundle, IABExpandableFooterCallback iABExpandableFooterCallback, String str, String str2, String str3, String str4, boolean z);

    void DJd(Bundle bundle, IABExtensionEventHandlerCallback iABExtensionEventHandlerCallback, String str, String str2, String str3);

    void DJe(Bundle bundle, IABExtensionPreExitHandlerBloksCallback iABExtensionPreExitHandlerBloksCallback, String str, String str2, String str3, String str4, List list);

    void DJf(Bundle bundle, IABExtensionEventHandlerCallback iABExtensionEventHandlerCallback, String str, String str2, String str3);

    void DMa(BrowserLiteJSBridgeCall browserLiteJSBridgeCall, BrowserLiteJSBridgeCallback browserLiteJSBridgeCallback);

    void DW2(int i, String str, Bundle bundle);

    void DW5(Bundle bundle, String str, int i, long j);

    void DWC(Bundle bundle, String str, String str2);

    void DWP(Bundle bundle, ZonePolicy zonePolicy, String str, boolean z);

    void DbR(Map map);

    void Dfd(Bundle bundle, ZonePolicy zonePolicy, String str);

    void DjK();

    void Dvt(String str, Bundle bundle);

    void Dvy(Bundle bundle, Map map);

    void E1I(Bundle bundle, OnShopsLiteCallback onShopsLiteCallback);

    void EGr(Bundle bundle, long[] jArr);

    void EWJ();

    void EzO();
}
