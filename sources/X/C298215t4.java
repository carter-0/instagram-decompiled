package X;

import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.CellSignalStrengthCdma;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.location.platform.api.Location;
import com.instagram.realtimeclient.RealtimeConstants;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5t4  reason: invalid class name and case insensitive filesystem */
public final class C298215t4 extends C239133Fc {
    public static final C270934hd A00 = new C270934hd(AnonymousClass0Gt.A00, RealtimeSinceBootClock.A00);

    /* JADX WARNING: type inference failed for: r0v10, types: [X.5t4, X.3Fc] */
    public static C298215t4 A00(Boolean bool, Integer num, String str, String str2, List list, List list2) {
        String str3;
        C298285tB A01 = A01(bool, num, "0", str, str2, list, list2);
        try {
            StringWriter stringWriter = new StringWriter();
            17W A0A = AnonymousClass15o.A00.A0A(stringWriter);
            A0A.A0c();
            A0A.A0q("input");
            A0A.A0c();
            Integer num2 = A01.A06;
            if (num2 != null) {
                if (1 - num2.intValue() != 0) {
                    str3 = "FOREGROUND";
                } else {
                    str3 = "BACKGROUND";
                }
                A0A.A0R("app_use_state", str3);
            }
            String str4 = A01.A09;
            if (str4 != null) {
                A0A.A0R(XDX.A00(0, 9, 45), str4);
            }
            String str5 = A01.A0A;
            if (str5 != null) {
                A0A.A0R(AnonymousClass000.A00(3102), str5);
            }
            C298275tA r1 = A01.A03;
            if (r1 != null) {
                A0A.A0q("location_manager_info");
                A0A.A0c();
                List<C39751A7r> list3 = r1.A00;
                if (list3 != null) {
                    16P.A03(A0A, "locations");
                    for (C39751A7r a7r : list3) {
                        if (a7r != null) {
                            A0A.A0c();
                            A0A.A0Q("age_ms", a7r.A03);
                            A0A.A0N(Location.LATITUDE, a7r.A00);
                            A0A.A0N("longitude", a7r.A01);
                            A0A.A0O("accuracy_meters", a7r.A02);
                            Float f = a7r.A07;
                            if (f != null) {
                                A0A.A0O("speed_meters_per_second", f.floatValue());
                            }
                            Double d = a7r.A05;
                            if (d != null) {
                                A0A.A0N("altitude_meters", d.doubleValue());
                            }
                            Float f2 = a7r.A06;
                            if (f2 != null) {
                                A0A.A0O("bearing_degrees", f2.floatValue());
                            }
                            Boolean bool2 = a7r.A04;
                            if (bool2 != null) {
                                A0A.A0S("is_spoofed", bool2.booleanValue());
                            }
                            A0A.A0Z();
                        }
                    }
                    A0A.A0Y();
                }
                A0A.A0Z();
            }
            C298225t5 r12 = A01.A04;
            if (r12 != null) {
                A0A.A0q("wifi_info");
                C298305tD.A00(r12, A0A);
            }
            C298235t6 r13 = A01.A02;
            if (r13 != null) {
                A0A.A0q("bluetooth_info");
                C298325tF.A00(r13, A0A);
            }
            C298245t7 r5 = A01.A00;
            if (r5 != null) {
                A0A.A0q("cell_info");
                A0A.A0c();
                if (r5.A05 != null) {
                    16P.A03(A0A, "scan_results");
                    for (C21435Xal xal : r5.A05) {
                        if (xal != null) {
                            A0A.A0c();
                            A0A.A0Q("age_ms", xal.A00);
                            if (xal.A01 != null) {
                                A0A.A0q("cdma_info");
                                XV0.A00(xal.A01, A0A);
                            }
                            if (xal.A02 != null) {
                                A0A.A0q("gsm_info");
                                C21448Xb0 xb0 = xal.A02;
                                A0A.A0c();
                                A0A.A0P("cell_id", xb0.A01);
                                A0A.A0P("location_area_code", xb0.A02);
                                A0A.A0P("mobile_country_code", xb0.A03);
                                A0A.A0P("mobile_network_code", xb0.A04);
                                A0A.A0P("primary_scrambling_code", xb0.A05);
                                A0A.A0P("rssi_dbm", xb0.A06);
                                A0A.A0P("arfcn", xb0.A00);
                                A0A.A0Z();
                            }
                            if (xal.A03 != null) {
                                A0A.A0q("lte_info");
                                C21453Xb5 xb5 = xal.A03;
                                A0A.A0c();
                                A0A.A0P("cell_id", xb5.A00);
                                A0A.A0P("mobile_country_code", xb5.A02);
                                A0A.A0P("mobile_network_code", xb5.A03);
                                A0A.A0P("physical_cell_id", xb5.A04);
                                A0A.A0P("tracking_area_code", xb5.A07);
                                A0A.A0P("rssi_dbm", xb5.A05);
                                A0A.A0P("timing_advance", xb5.A06);
                                A0A.A0P("earfcn", xb5.A01);
                                A0A.A0Z();
                            }
                            if (xal.A04 != null) {
                                A0A.A0q("wcdma_info");
                                C21449Xb1 xb1 = xal.A04;
                                A0A.A0c();
                                A0A.A0P("cell_id", xb1.A00);
                                A0A.A0P("location_area_code", xb1.A01);
                                A0A.A0P("mobile_country_code", xb1.A02);
                                A0A.A0P("mobile_network_code", xb1.A03);
                                A0A.A0P("primary_scrambling_code", xb1.A04);
                                A0A.A0P("rssi_dbm", xb1.A05);
                                A0A.A0P("uarfcn", xb1.A06);
                                A0A.A0Z();
                            }
                            A0A.A0Z();
                        }
                    }
                    A0A.A0Y();
                }
                if (r5.A04 != null) {
                    16P.A03(A0A, RealtimeConstants.MQTT_CONNECTED);
                    for (C298265t9 r6 : r5.A04) {
                        if (r6 != null) {
                            A0A.A0c();
                            String str6 = r6.A04;
                            if (str6 != null) {
                                A0A.A0R(AnonymousClass000.A00(173), str6);
                            }
                            String str7 = r6.A01;
                            if (str7 != null) {
                                A0A.A0R(AnonymousClass000.A00(3621), str7);
                            }
                            String str8 = r6.A02;
                            if (str8 != null) {
                                A0A.A0R("network_operator_mcc_mnc", str8);
                            }
                            String str9 = r6.A03;
                            if (str9 != null) {
                                A0A.A0R("network_operator_name", str9);
                            }
                            A0A.A0S("is_network_roaming", r6.A05);
                            if (r6.A00 != null) {
                                A0A.A0q("cdma_info");
                                XV0.A00(r6.A00, A0A);
                            }
                            A0A.A0Z();
                        }
                    }
                    A0A.A0Y();
                }
                String str10 = r5.A00;
                if (str10 != null) {
                    A0A.A0R("phone_type", str10);
                }
                String str11 = r5.A01;
                if (str11 != null) {
                    A0A.A0R(AnonymousClass000.A00(4011), str11);
                }
                String str12 = r5.A02;
                if (str12 != null) {
                    A0A.A0R("sim_operator_mcc_mnc", str12);
                }
                String str13 = r5.A03;
                if (str13 != null) {
                    A0A.A0R(AnonymousClass000.A00(4012), str13);
                }
                A0A.A0S("has_icc_card", r5.A06);
                A0A.A0Z();
            }
            XZ5 xz5 = A01.A01;
            if (xz5 != null) {
                A0A.A0q("extra_info");
                A0A.A0c();
                XZ6 xz6 = xz5.A00;
                if (xz6 != null) {
                    A0A.A0q("live_location_sharing_data");
                    A0A.A0c();
                    List<Number> list4 = xz6.A00;
                    if (list4 != null) {
                        16P.A03(A0A, "session_ids");
                        for (Number number : list4) {
                            if (number != null) {
                                A0A.A0h(number.longValue());
                            }
                        }
                        A0A.A0Y();
                    }
                    A0A.A0Z();
                }
                A0A.A0Z();
            }
            String str14 = A01.A0B;
            if (str14 != null) {
                A0A.A0R("place_id", str14);
            }
            String str15 = A01.A08;
            if (str15 != null) {
                A0A.A0R("collection_source", str15);
            }
            Boolean bool3 = A01.A05;
            if (bool3 != null) {
                A0A.A0S("anonymous_signals", bool3.booleanValue());
            }
            if (A01.A07 != null) {
                A0A.A0R("use_case", "INTEGRITY");
            }
            A0A.A0R("client_mutation_id", A01.A01);
            String str16 = A01.A00;
            if (str16 != null) {
                A0A.A0R("actor_id", str16);
            }
            A0A.A0Z();
            A0A.A0Z();
            A0A.close();
            return new C239133Fc(C298335tG.class, "FbLocationUpdateMutation", stringWriter.toString(), true);
        } catch (IOException e) {
            String A002 = AnonymousClass000.A00(444);
            0KC.A0G("FbLocationUpdateMutation", A002, e);
            0wb.A06("FbLocationUpdateMutation", A002, e);
            return null;
        }
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [java.lang.Object, X.5t5] */
    /* JADX WARNING: type inference failed for: r7v0, types: [java.lang.Object, X.5t6] */
    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Object, X.5t7] */
    /* JADX WARNING: type inference failed for: r3v0, types: [X.5tA, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v1, types: [X.5tB, X.5tC] */
    /* JADX WARNING: type inference failed for: r1v3, types: [X.XZ6, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v3, types: [X.XZ5, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v4, types: [X.Xal, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v7, types: [java.lang.Object, X.Xb1] */
    /* JADX WARNING: type inference failed for: r2v8, types: [java.lang.Object, X.Xb5] */
    /* JADX WARNING: type inference failed for: r2v9, types: [java.lang.Object, X.Xb0] */
    /* JADX WARNING: type inference failed for: r5v5, types: [java.lang.Object, X.XbD] */
    /* JADX WARNING: type inference failed for: r10v0, types: [java.lang.Object, X.XZy] */
    /* JADX WARNING: type inference failed for: r5v6, types: [X.5t9, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v2, types: [java.lang.Object, X.XbD] */
    /* JADX WARNING: type inference failed for: r4v8, types: [java.lang.Object, X.XZy] */
    /* JADX WARNING: type inference failed for: r1v74, types: [java.lang.Object, X.Xad] */
    /* JADX WARNING: type inference failed for: r1v80, types: [java.lang.Object, X.5t8] */
    /* JADX WARNING: type inference failed for: r1v82, types: [java.lang.Object, X.5t8] */
    /* JADX WARNING: type inference failed for: r3v12, types: [java.lang.Object, X.A7r] */
    public static C298285tB A01(Boolean bool, Integer num, String str, String str2, String str3, List list, List list2) {
        Double d;
        boolean isFromMockProvider;
        Float valueOf;
        ArrayList arrayList = new ArrayList(list.size());
        ? obj = new Object();
        ? obj2 = new Object();
        ? obj3 = new Object();
        Iterator it = list.iterator();
        XZ5 xz5 = null;
        String str4 = null;
        String str5 = null;
        while (it.hasNext()) {
            SG0 sg0 = (SG0) it.next();
            C276164sm r4 = sg0.A02;
            if (r4 != null) {
                ? obj4 = new Object();
                android.location.Location location = r4.A00;
                obj4.A00 = location.getLatitude();
                obj4.A01 = location.getLongitude();
                obj4.A03 = (long) ((int) A00.A00(r4));
                Float A01 = r4.A01();
                if (A01 != null) {
                    obj4.A02 = A01.floatValue();
                }
                Double A002 = r4.A00();
                if (A002 != null) {
                    obj4.A05 = A002;
                }
                Float A02 = r4.A02();
                if (A02 != null) {
                    obj4.A06 = A02;
                }
                if (location.hasSpeed() && (valueOf = Float.valueOf(location.getSpeed())) != null) {
                    obj4.A07 = valueOf;
                }
                Boolean bool2 = r4.A01;
                if (bool2 != null) {
                    isFromMockProvider = bool2.booleanValue();
                } else {
                    isFromMockProvider = location.isFromMockProvider();
                }
                Boolean valueOf2 = Boolean.valueOf(isFromMockProvider);
                if (valueOf2 != null) {
                    obj4.A04 = valueOf2;
                }
                arrayList.add(obj4);
            }
            Boolean bool3 = sg0.A07;
            if (bool3 != null) {
                obj.A01 = bool3;
            }
            C11379SQr sQr = sg0.A03;
            if (sQr != null) {
                System.currentTimeMillis();
                String str6 = sQr.A07;
                int i = sQr.A02;
                String str7 = sQr.A08;
                Integer num2 = sQr.A00;
                ? obj5 = new Object();
                obj5.A01 = null;
                obj5.A03 = str6;
                obj5.A00 = i;
                obj5.A04 = str7;
                obj5.A02 = num2;
                obj.A00 = obj5;
            }
            List<C11379SQr> list3 = sg0.A0N;
            if (list3 != null) {
                if (obj.A02 == null) {
                    obj.A02 = new ArrayList(list3.size());
                }
                for (C11379SQr sQr2 : list3) {
                    List list4 = obj.A02;
                    Integer valueOf3 = Integer.valueOf((int) (System.currentTimeMillis() - sQr2.A03));
                    String str8 = sQr2.A07;
                    int i2 = sQr2.A02;
                    String str9 = sQr2.A08;
                    Integer num3 = sQr2.A00;
                    ? obj6 = new Object();
                    obj6.A01 = valueOf3;
                    obj6.A03 = str8;
                    obj6.A00 = i2;
                    obj6.A04 = str9;
                    obj6.A02 = num3;
                    list4.add(obj6);
                }
            }
            Boolean bool4 = sg0.A04;
            if (bool4 != null) {
                obj2.A00 = bool4;
            }
            List<C10726Rx4> list5 = sg0.A0I;
            if (list5 != null) {
                if (obj2.A01 == null) {
                    obj2.A01 = new ArrayList(list5.size());
                }
                for (C10726Rx4 rx4 : list5) {
                    List list6 = obj2.A01;
                    int currentTimeMillis = (int) (System.currentTimeMillis() - rx4.A02);
                    String str10 = rx4.A03;
                    int i3 = rx4.A00;
                    String str11 = rx4.A04;
                    ? obj7 = new Object();
                    obj7.A00 = currentTimeMillis;
                    obj7.A02 = str10;
                    obj7.A01 = i3;
                    obj7.A03 = str11;
                    list6.add(obj7);
                }
            }
            String str12 = sg0.A0C;
            if (str12 != null) {
                str4 = str12;
            }
            String str13 = sg0.A0E;
            if (str13 != null) {
                str5 = str13;
            }
            List<CellInfo> list7 = sg0.A0J;
            C21455XbI xbI = sg0.A00;
            if (xbI != null) {
                obj3.A00 = xbI.A05;
                obj3.A01 = xbI.A06;
                obj3.A02 = xbI.A07;
                obj3.A03 = xbI.A08;
                obj3.A06 = xbI.A09;
                ? obj8 = new Object();
                obj8.A04 = xbI.A04;
                obj8.A01 = xbI.A01;
                obj8.A02 = xbI.A02;
                obj8.A03 = xbI.A03;
                obj8.A05 = xbI.A0A;
                XnC xnC = xbI.A00;
                if (xnC != null) {
                    ? obj9 = new Object();
                    obj8.A00 = obj9;
                    obj9.A00 = xnC.A00;
                    Double d2 = xnC.A03;
                    if (!(d2 == null || (d = xnC.A04) == null)) {
                        ? obj10 = new Object();
                        obj9.A08 = obj10;
                        obj10.A00 = d2.doubleValue();
                        obj10.A01 = d.doubleValue();
                    }
                    obj9.A07 = xnC.A02;
                }
                ArrayList arrayList2 = new ArrayList();
                obj3.A04 = arrayList2;
                arrayList2.add(obj8);
            }
            obj3.A05 = new ArrayList();
            if (list7 != null) {
                for (CellInfo cellInfo : list7) {
                    ? obj11 = new Object();
                    obj11.A00 = cellInfo.getTimeStamp();
                    if (cellInfo instanceof CellInfoCdma) {
                        CellInfoCdma cellInfoCdma = (CellInfoCdma) cellInfo;
                        ? obj12 = new Object();
                        CellIdentityCdma cellIdentity = cellInfoCdma.getCellIdentity();
                        obj12.A00 = cellIdentity.getBasestationId();
                        ? obj13 = new Object();
                        obj12.A08 = obj13;
                        obj13.A00 = (double) cellIdentity.getLatitude();
                        obj12.A08.A01 = (double) cellIdentity.getLongitude();
                        obj12.A06 = cellIdentity.getNetworkId();
                        obj12.A07 = cellIdentity.getSystemId();
                        CellSignalStrengthCdma cellSignalStrength = cellInfoCdma.getCellSignalStrength();
                        obj12.A02 = cellSignalStrength.getDbm();
                        obj12.A01 = cellSignalStrength.getCdmaEcio();
                        obj12.A04 = cellSignalStrength.getEvdoDbm();
                        obj12.A03 = cellSignalStrength.getEvdoEcio();
                        obj12.A05 = cellSignalStrength.getEvdoSnr();
                        obj11.A01 = obj12;
                    } else if (cellInfo instanceof CellInfoGsm) {
                        CellInfoGsm cellInfoGsm = (CellInfoGsm) cellInfo;
                        ? obj14 = new Object();
                        CellIdentityGsm cellIdentity2 = cellInfoGsm.getCellIdentity();
                        obj14.A01 = cellIdentity2.getCid();
                        obj14.A02 = cellIdentity2.getLac();
                        obj14.A03 = cellIdentity2.getMcc();
                        obj14.A04 = cellIdentity2.getMnc();
                        obj14.A05 = cellIdentity2.getPsc();
                        obj14.A06 = cellInfoGsm.getCellSignalStrength().getDbm();
                        obj14.A00 = cellIdentity2.getArfcn();
                        obj11.A02 = obj14;
                    } else if (cellInfo instanceof CellInfoLte) {
                        CellInfoLte cellInfoLte = (CellInfoLte) cellInfo;
                        ? obj15 = new Object();
                        CellIdentityLte cellIdentity3 = cellInfoLte.getCellIdentity();
                        obj15.A00 = cellIdentity3.getCi();
                        obj15.A02 = cellIdentity3.getMcc();
                        obj15.A03 = cellIdentity3.getMnc();
                        obj15.A04 = cellIdentity3.getPci();
                        obj15.A07 = cellIdentity3.getTac();
                        obj15.A05 = cellInfoLte.getCellSignalStrength().getDbm();
                        obj15.A06 = cellInfoLte.getCellSignalStrength().getTimingAdvance();
                        obj15.A01 = cellIdentity3.getEarfcn();
                        obj11.A03 = obj15;
                    } else if (cellInfo instanceof CellInfoWcdma) {
                        CellInfoWcdma cellInfoWcdma = (CellInfoWcdma) cellInfo;
                        ? obj16 = new Object();
                        CellIdentityWcdma cellIdentity4 = cellInfoWcdma.getCellIdentity();
                        obj16.A00 = cellIdentity4.getCid();
                        obj16.A01 = cellIdentity4.getLac();
                        obj16.A02 = cellIdentity4.getMcc();
                        obj16.A03 = cellIdentity4.getMnc();
                        obj16.A04 = cellIdentity4.getPsc();
                        obj16.A05 = cellInfoWcdma.getCellSignalStrength().getDbm();
                        obj16.A06 = cellIdentity4.getUarfcn();
                        obj11.A04 = obj16;
                    }
                    obj3.A05.add(obj11);
                }
            }
        }
        List list8 = list2;
        if (list2 != null && !list8.isEmpty()) {
            ? obj17 = new Object();
            obj17.A00 = list8;
            ? obj18 = new Object();
            obj18.A00 = obj17;
            xz5 = obj18;
        }
        ? obj19 = new Object();
        obj19.A00 = arrayList;
        Integer num4 = AnonymousClass05K.A00;
        ? r1 = new C298295tC();
        String str14 = str;
        if (str != null) {
            r1.A00 = str14;
        }
        r1.A06 = num4;
        r1.A09 = str2;
        r1.A0A = str3;
        r1.A03 = obj19;
        r1.A04 = obj;
        r1.A02 = obj2;
        r1.A00 = obj3;
        r1.A0B = str4;
        r1.A08 = str5;
        r1.A07 = num;
        r1.A05 = bool;
        r1.A01 = xz5;
        return r1;
    }
}
