package com.facebook.browser.lite.ipc;

import X.AnonymousClass0fD;
import X.AnonymousClass7TF;
import X.AnonymousClass7TH;
import X.Pxg;
import X.Pxj;
import X.S8M;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.iabeventlogging.model.IABEvent;
import com.facebook.privacy.zone.policy.ZonePolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class BrowserLiteCallback$Stub$Proxy implements BrowserLiteCallback {
    public IBinder A00;

    public static void A00(Parcel parcel) {
        parcel.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
    }

    public static void A01(Parcel parcel, String str) {
        parcel.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
        parcel.writeString(str);
    }

    public final void AE8(Bundle bundle, ZonePolicy zonePolicy, String str, Map map) {
        int A03 = AnonymousClass0fD.A03(844923089);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A01(obtain, "INTEGRITY_LOGGER");
            obtain.writeMap(map);
            S8M.A01(obtain, bundle, 0);
            S8M.A01(obtain, zonePolicy, 0);
            this.A00.transact(45, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(-665243539, A03);
        }
    }

    public final void ChE(String str) {
        int A03 = AnonymousClass0fD.A03(-976938517);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A01(obtain, "CONTACT_USAGE_ON_HYBRID_PROMPT_ENABLED");
            AnonymousClass7TH.A0N(this.A00, obtain, obtain2, 29);
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(2044293651, A03);
        }
    }

    public static boolean A02(IInterface iInterface, Parcel parcel, Parcelable parcelable, String str, String str2) {
        parcel.writeString(str);
        parcel.writeString(str2);
        S8M.A01(parcel, parcelable, 0);
        parcel.writeStrongInterface(iInterface);
        return false;
    }

    public final void AUp(AutofillContactDataCallback autofillContactDataCallback) {
        int A03 = AnonymousClass0fD.A03(-1775449315);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A00(obtain);
            obtain.writeStrongInterface(autofillContactDataCallback);
            AnonymousClass7TH.A0N(this.A00, obtain, obtain2, 28);
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(-428878988, A03);
        }
    }

    public final void AUq(AutofillScriptCallback autofillScriptCallback) {
        int A03 = AnonymousClass0fD.A03(1850332226);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A00(obtain);
            obtain.writeStrongInterface(autofillScriptCallback);
            AnonymousClass7TH.A0N(this.A00, obtain, obtain2, 27);
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(-350602278, A03);
        }
    }

    public final PrefetchCacheEntry Bei(String str) {
        int A03 = AnonymousClass0fD.A03(-1265314492);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A01(obtain, str);
            AnonymousClass7TH.A0N(this.A00, obtain, obtain2, 20);
            return (PrefetchCacheEntry) Pxj.A0i(obtain2, PrefetchCacheEntry.CREATOR);
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(407969762, A03);
        }
    }

    public final ArrayList Bej() {
        int A03 = AnonymousClass0fD.A03(-306861057);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A00(obtain);
            AnonymousClass7TH.A0N(this.A00, obtain, obtain2, 19);
            return obtain2.createStringArrayList();
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(1495120046, A03);
        }
    }

    public final void CIO(String str) {
        int A03 = AnonymousClass0fD.A03(1448447463);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A01(obtain, str);
            AnonymousClass7TH.A0N(this.A00, obtain, obtain2, 78);
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(-1648740778, A03);
        }
    }

    public final void CIP(String str, String str2) {
        int A03 = AnonymousClass0fD.A03(85103887);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A01(obtain, str);
            obtain.writeString(str2);
            AnonymousClass7TH.A0N(this.A00, obtain, obtain2, 76);
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(897873897, A03);
        }
    }

    public final int CIl(String str) {
        int A03 = AnonymousClass0fD.A03(-375372880);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A01(obtain, str);
            AnonymousClass7TH.A0N(this.A00, obtain, obtain2, 1);
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(-1255314008, A03);
        }
    }

    public final boolean CIr(Bundle bundle, ZonePolicy zonePolicy, String str) {
        int A03 = AnonymousClass0fD.A03(-843864128);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A01(obtain, str);
            boolean z = false;
            S8M.A01(obtain, bundle, 0);
            S8M.A01(obtain, zonePolicy, 0);
            if (Pxg.A02(this.A00, obtain, obtain2, 42) != 0) {
                z = true;
            }
            return z;
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(-198971764, A03);
        }
    }

    public final boolean CJ3(String str) {
        int A03 = AnonymousClass0fD.A03(789039959);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A01(obtain, str);
            boolean z = false;
            if (Pxg.A02(this.A00, obtain, obtain2, 24) != 0) {
                z = true;
            }
            return z;
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(726175430, A03);
        }
    }

    public final boolean CJC(String str, String str2) {
        int A03 = AnonymousClass0fD.A03(-1970581553);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A01(obtain, str);
            obtain.writeString(str2);
            boolean z = false;
            if (Pxg.A02(this.A00, obtain, obtain2, 2) != 0) {
                z = true;
            }
            return z;
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(-828393000, A03);
        }
    }

    public final void CJD(Bundle bundle) {
        int A03 = AnonymousClass0fD.A03(-1001021873);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A00(obtain);
            S8M.A01(obtain, bundle, 0);
            this.A00.transact(66, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(1306193583, A03);
        }
    }

    public final void Cff(String str) {
        int A03 = AnonymousClass0fD.A03(-37818060);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A01(obtain, str);
            AnonymousClass7TH.A0N(this.A00, obtain, obtain2, 35);
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(1898825193, A03);
        }
    }

    public final void ChJ(long j, String str, String str2, Map map) {
        int A03 = AnonymousClass0fD.A03(1803477848);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A01(obtain, str);
            obtain.writeLong(j);
            obtain.writeString(str2);
            obtain.writeMap(map);
            AnonymousClass7TH.A0N(this.A00, obtain, obtain2, 79);
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(1470436474, A03);
        }
    }

    public final void ChK(long j, String str, String str2, Map map) {
        int A03 = AnonymousClass0fD.A03(1015320200);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A01(obtain, str);
            obtain.writeLong(j);
            obtain.writeString(str2);
            obtain.writeMap(map);
            AnonymousClass7TH.A0N(this.A00, obtain, obtain2, 77);
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(-450311687, A03);
        }
    }

    public final void CiT(Bundle bundle, String str, String str2, boolean z) {
        int A03 = AnonymousClass0fD.A03(-2060855814);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A01(obtain, str);
            obtain.writeString(str2);
            obtain.writeInt(AnonymousClass7TF.A1P(z ? 1 : 0) ? 1 : 0);
            S8M.A01(obtain, bundle, 0);
            this.A00.transact(9, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(-1186198032, A03);
        }
    }

    public final void Cj2(Bundle bundle, ZonePolicy zonePolicy, String str, String str2, Map map, Map map2, int i, long j, long j2, long j3, long j4, long j5, boolean z, boolean z2, boolean z3, boolean z4) {
        int A03 = AnonymousClass0fD.A03(453135490);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A01(obtain, str);
            obtain.writeLong(j);
            obtain.writeLong(j2);
            obtain.writeLong(j3);
            obtain.writeLong(j4);
            obtain.writeLong(j5);
            obtain.writeInt(i);
            int i2 = 1;
            int i3 = 0;
            obtain.writeInt(0);
            if (z2) {
                i3 = 1;
            }
            obtain.writeInt(i3);
            obtain.writeInt(AnonymousClass7TF.A1P(z3 ? 1 : 0) ? 1 : 0);
            obtain.writeMap(map);
            if (!z4) {
                i2 = 0;
            }
            obtain.writeInt(i2);
            obtain.writeString(str2);
            obtain.writeMap(map2);
            S8M.A01(obtain, bundle, 0);
            S8M.A01(obtain, zonePolicy, 0);
            this.A00.transact(10, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(-1915585145, A03);
        }
    }

    public final void CjG(Bundle bundle, String str, String str2, long j, boolean z) {
        int A03 = AnonymousClass0fD.A03(1342596760);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A01(obtain, str);
            obtain.writeInt(AnonymousClass7TF.A1P(z ? 1 : 0) ? 1 : 0);
            obtain.writeString(str2);
            obtain.writeLong(j);
            S8M.A01(obtain, bundle, 0);
            this.A00.transact(8, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(2138048330, A03);
        }
    }

    public final void Ckd(Bundle bundle, Map map) {
        int A03 = AnonymousClass0fD.A03(-1784579604);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A00(obtain);
            obtain.writeMap(map);
            S8M.A01(obtain, bundle, 0);
            this.A00.transact(18, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(-1661130105, A03);
        }
    }

    public final String Cn4(String str) {
        int A03 = AnonymousClass0fD.A03(-1704342652);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A01(obtain, str);
            AnonymousClass7TH.A0N(this.A00, obtain, obtain2, 25);
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(8888453, A03);
        }
    }

    public final void Cx9(AutofillOptOutCallback autofillOptOutCallback, String str) {
        int A03 = AnonymousClass0fD.A03(-1761575952);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A01(obtain, str);
            obtain.writeStrongInterface(autofillOptOutCallback);
            AnonymousClass7TH.A0N(this.A00, obtain, obtain2, 26);
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(710765706, A03);
        }
    }

    public final void D6X(String str, Bundle bundle) {
        int A03 = AnonymousClass0fD.A03(-1678923046);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A01(obtain, str);
            S8M.A01(obtain, bundle, 0);
            this.A00.transact(5, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(1685312379, A03);
        }
    }

    public final void DDK(Bundle bundle, ZonePolicy zonePolicy, String str, String str2, Map map) {
        int A03 = AnonymousClass0fD.A03(1284694047);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A01(obtain, str);
            obtain.writeString(str2);
            obtain.writeMap(map);
            S8M.A01(obtain, bundle, 0);
            S8M.A01(obtain, zonePolicy, 0);
            this.A00.transact(15, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(242326286, A03);
        }
    }

    public final void DFy() {
        int A03 = AnonymousClass0fD.A03(49581761);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A00(obtain);
            AnonymousClass7TH.A0N(this.A00, obtain, obtain2, 41);
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(660425260, A03);
        }
    }

    public final void DJY(String str, List list) {
        int A03 = AnonymousClass0fD.A03(1057898864);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A01(obtain, str);
            obtain.writeList(list);
            AnonymousClass7TH.A0N(this.A00, obtain, obtain2, 23);
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(375085294, A03);
        }
    }

    public final void DJa(Bundle bundle, IABBloksGraphQLCallback iABBloksGraphQLCallback, String str, String str2, String str3) {
        int A03 = AnonymousClass0fD.A03(-430571749);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A01(obtain, str);
            this.A00.transact(51, obtain, obtain2, A02(iABBloksGraphQLCallback, obtain, bundle, str2, str3) ? 1 : 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(-1788152348, A03);
        }
    }

    public final void DJb(Bundle bundle, IABEvent iABEvent, ZonePolicy zonePolicy) {
        int A03 = AnonymousClass0fD.A03(1515294289);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A00(obtain);
            S8M.A01(obtain, iABEvent, 0);
            S8M.A01(obtain, bundle, 0);
            S8M.A01(obtain, zonePolicy, 0);
            this.A00.transact(4, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(1984691087, A03);
        }
    }

    public final void DJc(Bundle bundle, IABExpandableFooterCallback iABExpandableFooterCallback, String str, String str2, String str3, String str4, boolean z) {
        int A03 = AnonymousClass0fD.A03(943600560);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A01(obtain, str);
            obtain.writeString(str2);
            obtain.writeString(str3);
            obtain.writeString(str4);
            obtain.writeInt(1);
            S8M.A01(obtain, bundle, 0);
            obtain.writeStrongInterface(iABExpandableFooterCallback);
            this.A00.transact(52, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(-533815345, A03);
        }
    }

    public final void DJd(Bundle bundle, IABExtensionEventHandlerCallback iABExtensionEventHandlerCallback, String str, String str2, String str3) {
        int A03 = AnonymousClass0fD.A03(97104008);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A01(obtain, str);
            this.A00.transact(53, obtain, obtain2, A02(iABExtensionEventHandlerCallback, obtain, bundle, str2, str3) ? 1 : 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(-946401730, A03);
        }
    }

    public final void DJe(Bundle bundle, IABExtensionPreExitHandlerBloksCallback iABExtensionPreExitHandlerBloksCallback, String str, String str2, String str3, String str4, List list) {
        int A03 = AnonymousClass0fD.A03(94082179);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A01(obtain, str);
            obtain.writeString(str2);
            obtain.writeStringList(list);
            this.A00.transact(56, obtain, obtain2, A02(iABExtensionPreExitHandlerBloksCallback, obtain, bundle, str3, str4) ? 1 : 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(-952337205, A03);
        }
    }

    public final void DJf(Bundle bundle, IABExtensionEventHandlerCallback iABExtensionEventHandlerCallback, String str, String str2, String str3) {
        int A03 = AnonymousClass0fD.A03(-1524664968);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A01(obtain, str);
            this.A00.transact(55, obtain, obtain2, A02(iABExtensionEventHandlerCallback, obtain, bundle, str2, str3) ? 1 : 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(-1830217815, A03);
        }
    }

    public final void DMa(BrowserLiteJSBridgeCall browserLiteJSBridgeCall, BrowserLiteJSBridgeCallback browserLiteJSBridgeCallback) {
        int A03 = AnonymousClass0fD.A03(2002744335);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A00(obtain);
            S8M.A01(obtain, browserLiteJSBridgeCall, 0);
            obtain.writeStrongInterface(browserLiteJSBridgeCallback);
            this.A00.transact(21, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(1361320787, A03);
        }
    }

    public final void DW2(int i, String str, Bundle bundle) {
        int A03 = AnonymousClass0fD.A03(-1302481321);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A01(obtain, str);
            S8M.A01(obtain, bundle, 0);
            obtain.writeInt(i);
            this.A00.transact(13, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(1191521422, A03);
        }
    }

    public final void DW5(Bundle bundle, String str, int i, long j) {
        int A03 = AnonymousClass0fD.A03(2086073855);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A01(obtain, str);
            S8M.A01(obtain, bundle, 0);
            obtain.writeInt(i);
            obtain.writeLong(j);
            this.A00.transact(12, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(-1456072416, A03);
        }
    }

    public final void DWC(Bundle bundle, String str, String str2) {
        int A03 = AnonymousClass0fD.A03(-1619222897);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A01(obtain, str);
            obtain.writeString(str2);
            S8M.A01(obtain, bundle, 0);
            this.A00.transact(11, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(-565490210, A03);
        }
    }

    public final void DWP(Bundle bundle, ZonePolicy zonePolicy, String str, boolean z) {
        int A03 = AnonymousClass0fD.A03(-1815910792);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A01(obtain, str);
            obtain.writeInt(AnonymousClass7TF.A1P(z ? 1 : 0) ? 1 : 0);
            S8M.A01(obtain, bundle, 0);
            S8M.A01(obtain, zonePolicy, 0);
            this.A00.transact(7, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(-1524282767, A03);
        }
    }

    public final void DbR(Map map) {
        int A03 = AnonymousClass0fD.A03(-1769196388);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A00(obtain);
            obtain.writeMap(map);
            AnonymousClass7TH.A0N(this.A00, obtain, obtain2, 16);
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(1160342537, A03);
        }
    }

    public final void Dfd(Bundle bundle, ZonePolicy zonePolicy, String str) {
        int A03 = AnonymousClass0fD.A03(1537631812);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A01(obtain, str);
            S8M.A01(obtain, bundle, 0);
            S8M.A01(obtain, zonePolicy, 0);
            this.A00.transact(6, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(-658421847, A03);
        }
    }

    public final void DjK() {
        int A03 = AnonymousClass0fD.A03(463162871);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A00(obtain);
            AnonymousClass7TH.A0N(this.A00, obtain, obtain2, 46);
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(-504628911, A03);
        }
    }

    public final void Dvt(String str, Bundle bundle) {
        int A03 = AnonymousClass0fD.A03(991632442);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A00(obtain);
            S8M.A01(obtain, bundle, 0);
            obtain.writeString(str);
            this.A00.transact(40, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(318205377, A03);
        }
    }

    public final void Dvy(Bundle bundle, Map map) {
        int A03 = AnonymousClass0fD.A03(59897858);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A00(obtain);
            obtain.writeMap(map);
            S8M.A01(obtain, bundle, 0);
            this.A00.transact(17, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(-1893171265, A03);
        }
    }

    public final void E1I(Bundle bundle, OnShopsLiteCallback onShopsLiteCallback) {
        int A03 = AnonymousClass0fD.A03(-1272321443);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A00(obtain);
            S8M.A01(obtain, bundle, 0);
            obtain.writeStrongInterface(onShopsLiteCallback);
            this.A00.transact(62, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(672175466, A03);
        }
    }

    public final void EGr(Bundle bundle, long[] jArr) {
        int A03 = AnonymousClass0fD.A03(989552937);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A00(obtain);
            obtain.writeLongArray(jArr);
            S8M.A01(obtain, bundle, 0);
            this.A00.transact(14, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(1238210430, A03);
        }
    }

    public final void EWJ() {
        int A03 = AnonymousClass0fD.A03(-13079558);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A00(obtain);
            AnonymousClass7TH.A0N(this.A00, obtain, obtain2, 30);
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(593532088, A03);
        }
    }

    public final void EzO() {
        int A03 = AnonymousClass0fD.A03(53440699);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A00(obtain);
            AnonymousClass7TH.A0N(this.A00, obtain, obtain2, 22);
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(-957228098, A03);
        }
    }

    public final IBinder asBinder() {
        int A03 = AnonymousClass0fD.A03(1291148035);
        IBinder iBinder = this.A00;
        AnonymousClass0fD.A0A(281641695, A03);
        return iBinder;
    }
}
