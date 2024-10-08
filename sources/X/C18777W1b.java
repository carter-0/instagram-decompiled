package X;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: X.W1b  reason: case insensitive filesystem */
public final class C18777W1b {
    public UV8 A00;
    public final C20886X2q A01;
    public final LinkedHashSet A02 = new LinkedHashSet();
    public final C62320sa A03;
    public final 0sP A04;
    public final Set A05;
    public final C62320sa A06;
    public final C62320sa A07;
    public final 0sP A08;

    private final void A00(int i, int i2) {
        Iterator A1G = AnonymousClass7TE.A1G(this.A02);
        while (A1G.hasNext()) {
            VR1 vr1 = (VR1) AnonymousClass7TF.A0a(A1G);
            if (vr1.A00 == i2 && C16807V6o.A00(vr1.A01) > i) {
                A1G.remove();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006b, code lost:
        if (r1.contains(X.C15184UUn.A00) == false) goto L_0x006d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C18777W1b r6, X.VR1 r7, X.VR1 r8) {
        /*
            java.lang.Integer r4 = r7.A01
            int r0 = r4.intValue()
            r2 = 0
            r5 = 3
            if (r0 == r2) goto L_0x0078
            r1 = 1
            if (r0 == r1) goto L_0x0041
            java.util.LinkedHashSet r2 = r6.A02
            boolean r0 = r2.contains(r7)
            if (r0 != 0) goto L_0x0027
            X.0sa r0 = r6.A06
            boolean r0 = X.C51971G9r.A1b(r0)
            if (r0 != 0) goto L_0x0028
            java.util.Set r1 = r6.A05
            int r0 = r7.A00
            boolean r0 = X.Pxf.A1U(r1, r0)
            if (r0 == 0) goto L_0x0028
        L_0x0027:
            return
        L_0x0028:
            boolean r0 = r7 instanceof X.C15185UUo
            if (r0 == 0) goto L_0x0033
            java.lang.Integer r1 = r8.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x0033
            return
        L_0x0033:
            X.0sP r0 = r6.A08
            r0.invoke(r7)
            r2.add(r7)
            X.0sa r0 = r6.A07
            r0.invoke()
            return
        L_0x0041:
            java.lang.Integer r0 = r8.A01
            int r0 = r0.intValue()
            if (r0 == r2) goto L_0x006d
            if (r0 == r1) goto L_0x005d
            int r1 = X.C16807V6o.A00(r4)
            int r0 = r7.A00
            r6.A00(r1, r0)
            r6.A02(r7, r8)
        L_0x0057:
            java.util.LinkedHashSet r0 = r6.A02
            r0.add(r7)
            return
        L_0x005d:
            java.util.LinkedHashSet r1 = r6.A02
            boolean r0 = r1.contains(r7)
            if (r0 != 0) goto L_0x0057
            X.UUn r0 = X.C15184UUn.A00
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0057
        L_0x006d:
            X.0sP r0 = r6.A08
            r0.invoke(r7)
            X.0sa r0 = r6.A07
            r0.invoke()
            goto L_0x0057
        L_0x0078:
            java.lang.Integer r1 = r8.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x0089
            X.0sP r1 = r6.A08
            X.UV8 r0 = r6.A00
            if (r0 == 0) goto L_0x0085
            r7 = r0
        L_0x0085:
            r1.invoke(r7)
            return
        L_0x0089:
            int r3 = r7.A00
            r0 = 5
            if (r3 != r0) goto L_0x00ad
            java.util.Set r0 = r6.A05
            java.util.Iterator r2 = r0.iterator()
        L_0x0094:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00a6
            int r1 = X.AnonymousClass7TG.A0F(r2)
            int r0 = X.C16807V6o.A00(r4)
            r6.A00(r0, r1)
            goto L_0x0094
        L_0x00a6:
            int r0 = X.C16807V6o.A00(r4)
            r6.A00(r0, r5)
        L_0x00ad:
            int r0 = X.C16807V6o.A00(r4)
            r6.A00(r0, r3)
            r6.A02(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18777W1b.A01(X.W1b, X.VR1, X.VR1):void");
    }

    private final void A02(VR1 vr1, VR1 vr12) {
        LinkedHashSet linkedHashSet = this.A02;
        if (!(linkedHashSet instanceof Collection) || !linkedHashSet.isEmpty()) {
            Iterator it = linkedHashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (C16807V6o.A00(((VR1) it.next()).A01) > C16807V6o.A00(vr1.A01)) {
                    Object obj = null;
                    if (vr12.A00 == vr1.A00) {
                        Iterator it2 = linkedHashSet.iterator();
                        if (it2.hasNext()) {
                            Object next = it2.next();
                            if (it2.hasNext()) {
                                int A002 = C16807V6o.A00(((VR1) next).A01);
                                do {
                                    Object next2 = it2.next();
                                    int A003 = C16807V6o.A00(((VR1) next2).A01);
                                    if (A002 < A003) {
                                        next = next2;
                                        A002 = A003;
                                    }
                                } while (it2.hasNext());
                            }
                            int A004 = C16807V6o.A00(((VR1) next).A01);
                            boolean z = false;
                            for (Object next3 : linkedHashSet) {
                                if (C16807V6o.A00(((VR1) next3).A01) == A004) {
                                    obj = next3;
                                    z = true;
                                }
                            }
                            if (z) {
                                this.A08.invoke(obj);
                            } else {
                                throw new NoSuchElementException(AnonymousClass000.A00(3));
                            }
                        } else {
                            throw new NoSuchElementException();
                        }
                    } else {
                        return;
                    }
                }
            }
        }
        VR1 vr13 = this.A00;
        if (vr13 == null || vr1.A01 != AnonymousClass05K.A00) {
            vr13 = vr1;
        }
        this.A08.invoke(vr13);
        if (vr1.A00 == 5) {
            return;
        }
        this.A07.invoke();
    }

    public final void A03() {
        C62320sa r2 = this.A03;
        VR1 vr1 = (VR1) r2.invoke();
        if (vr1 == null || vr1.A00 != 3) {
            VR1 vr12 = (VR1) r2.invoke();
            if (vr12 == null || vr12.A00 != 8) {
                VR1 vr13 = (VR1) r2.invoke();
                if (vr13 == null || vr13.A00 != 9) {
                    VR1 vr14 = (VR1) r2.invoke();
                    if (vr14 == null || vr14.A00 != 10) {
                        this.A02.clear();
                    }
                }
            }
        }
    }

    public final void A05(VR1 vr1) {
        VR1 vr12;
        int i = vr1.A00;
        if (i == 1 && (vr1 instanceof UV8)) {
            this.A00 = (UV8) vr1;
        }
        if ((!C51971G9r.A1b(this.A06) || !this.A02.contains(C15186UUp.A00) || i != 3 || vr1.A01 == AnonymousClass05K.A0C) && (vr12 = (VR1) this.A03.invoke()) != null) {
            A01(this, vr1, vr12);
        }
    }

    public C18777W1b(C62320sa r2, C62320sa r3, C62320sa r4, 0sP r5, 0sP r6) {
        this.A03 = r2;
        this.A08 = r5;
        this.A06 = r3;
        this.A07 = r4;
        this.A04 = r6;
        Set singleton = Collections.singleton(7);
        0qQ.A07(singleton);
        this.A05 = singleton;
        this.A01 = new C19089WKw(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b1, code lost:
        if (r1.equals(r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b3, code lost:
        r0 = X.C15188UUr.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x011e, code lost:
        if (r1.equals(r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0120, code lost:
        r0 = X.UV3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x013e, code lost:
        if (r1.equals(r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0140, code lost:
        r0 = X.C15185UUo.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0142, code lost:
        A05(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0145, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(X.V4C r3) {
        /*
            r2 = this;
            java.lang.String r1 = r3.A00()
            int r0 = r1.hashCode()
            switch(r0) {
                case -2142600848: goto L_0x000c;
                case -1907274391: goto L_0x0010;
                case -1827018166: goto L_0x0014;
                case -1748158431: goto L_0x0018;
                case -1659914561: goto L_0x001c;
                case -1639263991: goto L_0x0020;
                case -1622789342: goto L_0x0024;
                case -1564554863: goto L_0x0028;
                case -1447972833: goto L_0x0034;
                case -1393327239: goto L_0x0038;
                case -1371358665: goto L_0x003b;
                case -1258081213: goto L_0x003f;
                case -1085472894: goto L_0x0043;
                case -1076491209: goto L_0x0047;
                case -956481827: goto L_0x004b;
                case -914743687: goto L_0x004f;
                case -792582493: goto L_0x005b;
                case -735657628: goto L_0x0067;
                case -712771762: goto L_0x006b;
                case -679949903: goto L_0x006f;
                case -646453283: goto L_0x0073;
                case -618496294: goto L_0x007f;
                case -536086858: goto L_0x0083;
                case -485608986: goto L_0x008f;
                case -473284920: goto L_0x0097;
                case -472195994: goto L_0x009b;
                case -259501732: goto L_0x00a7;
                case -241236408: goto L_0x00ab;
                case -195374854: goto L_0x00b7;
                case -106498639: goto L_0x00bb;
                case 35580499: goto L_0x00be;
                case 39350972: goto L_0x00c1;
                case 62482298: goto L_0x00c4;
                case 64254586: goto L_0x00c7;
                case 167229966: goto L_0x00ca;
                case 223933925: goto L_0x00cd;
                case 247259090: goto L_0x00d0;
                case 345573223: goto L_0x00d3;
                case 345971800: goto L_0x00d6;
                case 426664360: goto L_0x00d9;
                case 427425418: goto L_0x00dc;
                case 433141802: goto L_0x00df;
                case 496649534: goto L_0x00e2;
                case 554408463: goto L_0x00e5;
                case 624934087: goto L_0x00e8;
                case 720580000: goto L_0x00f3;
                case 743369482: goto L_0x00f6;
                case 764460121: goto L_0x00f9;
                case 879138356: goto L_0x00fc;
                case 933142426: goto L_0x00ff;
                case 937195223: goto L_0x0102;
                case 1051436370: goto L_0x0105;
                case 1072999339: goto L_0x0108;
                case 1112689461: goto L_0x010b;
                case 1237785799: goto L_0x010e;
                case 1430407976: goto L_0x0115;
                case 1483329954: goto L_0x0118;
                case 1483851953: goto L_0x0123;
                case 1596674987: goto L_0x0126;
                case 1684979281: goto L_0x0129;
                case 1808400106: goto L_0x012c;
                case 1935425562: goto L_0x012f;
                case 2104595036: goto L_0x0132;
                case 2109336670: goto L_0x0135;
                case 2124047836: goto L_0x0138;
                default: goto L_0x000b;
            }
        L_0x000b:
            return
        L_0x000c:
            java.lang.String r0 = "SOCKET_CONNECTION_CONNECT_TO_SOCKET_FAIL"
            goto L_0x013a
        L_0x0010:
            java.lang.String r0 = "STREAM_STOPPED_REASON_SYSTEM_PREEMPT"
            goto L_0x013a
        L_0x0014:
            java.lang.String r0 = "BUG_MUST_FIX"
            goto L_0x013a
        L_0x0018:
            java.lang.String r0 = "SOCKET_CONNECTION_CLOSED"
            goto L_0x013a
        L_0x001c:
            java.lang.String r0 = "DEVICE_ERROR"
            goto L_0x013a
        L_0x0020:
            java.lang.String r0 = "MEDIA_STREAM_SERVICE_MSG_SEND_FAIL"
            goto L_0x013a
        L_0x0024:
            java.lang.String r0 = "SNAM_MAXED_OUT_CONNECTION_ATTEMPTS"
            goto L_0x013a
        L_0x0028:
            java.lang.String r0 = "HOTSPOT_ENABLED"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000b
            X.UUs r0 = X.C15189UUs.A00
            goto L_0x0142
        L_0x0034:
            java.lang.String r0 = "SNAPP_STOP_APP_FAILED"
            goto L_0x013a
        L_0x0038:
            java.lang.String r0 = "STREAM_STOPPED_REASON_THERMAL_THRESHOLD"
            goto L_0x00ad
        L_0x003b:
            java.lang.String r0 = "SNAM_SHUTDOWN_ERROR"
            goto L_0x013a
        L_0x003f:
            java.lang.String r0 = "SNAPP_NOT_ENOUGH_BATTERY"
            goto L_0x011a
        L_0x0043:
            java.lang.String r0 = "SNAPP_PAYLOAD_CORRUPTED"
            goto L_0x013a
        L_0x0047:
            java.lang.String r0 = "BACKGROUNDED_DISCONNECT_ERROR"
            goto L_0x013a
        L_0x004b:
            java.lang.String r0 = "SOCKET_CONNECTION_ERROR_ESTABLISHING_DEVICE_CONNECTION"
            goto L_0x013a
        L_0x004f:
            java.lang.String r0 = "OUTDATED_MWA_VERSION"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000b
            X.UUv r0 = X.C15192UUv.A00
            goto L_0x0142
        L_0x005b:
            java.lang.String r0 = "OUTDATED_APP_VERSION"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000b
            X.UUt r0 = X.C15190UUt.A00
            goto L_0x0142
        L_0x0067:
            java.lang.String r0 = "SOCKET_CONNECTION_LINK_SETUP_DETACHED"
            goto L_0x013a
        L_0x006b:
            java.lang.String r0 = "SOCKET_CONNECTION_SET_LINK_TIMEOUT"
            goto L_0x013a
        L_0x006f:
            java.lang.String r0 = "INVALID_STATE_MESSAGE"
            goto L_0x013a
        L_0x0073:
            java.lang.String r0 = "LIVE_STREAM_START_DOFF_ERROR"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000b
            X.UUp r0 = X.C15186UUp.A00
            goto L_0x0142
        L_0x007f:
            java.lang.String r0 = "SNAPP_UNKNOWN_ERROR"
            goto L_0x013a
        L_0x0083:
            java.lang.String r0 = "VPN_ENABLED"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000b
            X.UV0 r0 = X.UV0.A00
            goto L_0x0142
        L_0x008f:
            r0 = 959(0x3bf, float:1.344E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            goto L_0x013a
        L_0x0097:
            java.lang.String r0 = "SNAPP_UNRECOGNIZED"
            goto L_0x013a
        L_0x009b:
            java.lang.String r0 = "WIFI_DISABLED"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000b
            X.UV2 r0 = X.UV2.A00
            goto L_0x0142
        L_0x00a7:
            java.lang.String r0 = "STREAM_STOPPED_REASON_MOBILE_STREAM_ERROR"
            goto L_0x013a
        L_0x00ab:
            java.lang.String r0 = "SNAPP_THERMAL_THROTTLING"
        L_0x00ad:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000b
            X.UUr r0 = X.C15188UUr.A00
            goto L_0x0142
        L_0x00b7:
            java.lang.String r0 = "LIVE_STREAM_START_UNSUPPORTED_PARAM"
            goto L_0x013a
        L_0x00bb:
            java.lang.String r0 = "SNAPP_START_APP_FAILED"
            goto L_0x013a
        L_0x00be:
            java.lang.String r0 = "STREAM_STOPPED_REASON_PEAK_POWER_INTERRUPT"
            goto L_0x013a
        L_0x00c1:
            java.lang.String r0 = "LIVE_STREAM_START_INVALID_PARAM"
            goto L_0x013a
        L_0x00c4:
            java.lang.String r0 = "SOCKET_CONNECTION_UNKNOWN_APPLINK_ERROR"
            goto L_0x013a
        L_0x00c7:
            java.lang.String r0 = "STREAM_STOPPED_REASON_TAMPER_DETECTED"
            goto L_0x013a
        L_0x00ca:
            java.lang.String r0 = "SNAPP_NOT_ENOUGH_PRIORITY"
            goto L_0x013a
        L_0x00cd:
            java.lang.String r0 = "CONNECTION_TIMED_OUT"
            goto L_0x013a
        L_0x00d0:
            java.lang.String r0 = "SNAPP_UNHANDLED_MESSAGE"
            goto L_0x013a
        L_0x00d3:
            java.lang.String r0 = "SNAM_CONNECTION_FAIL"
            goto L_0x013a
        L_0x00d6:
            java.lang.String r0 = "STREAM_STOPPED_REASON_BATTERY_LOW"
            goto L_0x011a
        L_0x00d9:
            java.lang.String r0 = "SNAPP_CHARGING_NOT_CONNECTED"
            goto L_0x013a
        L_0x00dc:
            java.lang.String r0 = "STREAMING_ALREADY_ACTIVE"
            goto L_0x013a
        L_0x00df:
            java.lang.String r0 = "UNKNOWN"
            goto L_0x013a
        L_0x00e2:
            java.lang.String r0 = "SOCKET_CONNECTION_UNKNOWN_ERROR"
            goto L_0x013a
        L_0x00e5:
            java.lang.String r0 = "LIVE_STREAM_START_INTERNAL_ERROR"
            goto L_0x013a
        L_0x00e8:
            java.lang.String r0 = "OUTDATED_GLASSES_FIRMWARE"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000b
            X.UUu r0 = X.C15191UUu.A00
            goto L_0x0142
        L_0x00f3:
            java.lang.String r0 = "STREAM_STOPPED_REASON_UNKNOWN"
            goto L_0x013a
        L_0x00f6:
            java.lang.String r0 = "SOCKET_CONNECTION_DEVICE_IO_EXCEPTION"
            goto L_0x013a
        L_0x00f9:
            java.lang.String r0 = "SNAPP_UNKNOWN_MESSAGE"
            goto L_0x013a
        L_0x00fc:
            java.lang.String r0 = "SOCKET_CONNECTION_BT_DISABLED"
            goto L_0x013a
        L_0x00ff:
            java.lang.String r0 = "SOCKET_CONNECTION_DEVICE_LINKAGE_ERROR"
            goto L_0x013a
        L_0x0102:
            java.lang.String r0 = "STREAM_STOPPED_REASON_AUDIO_FAILURE"
            goto L_0x013a
        L_0x0105:
            java.lang.String r0 = "MEDIA_STREAM_SERVICE_CHANNEL_NOT_CREATED"
            goto L_0x013a
        L_0x0108:
            java.lang.String r0 = "STREAMING_ERROR"
            goto L_0x013a
        L_0x010b:
            java.lang.String r0 = "SOCKET_CONNECTION_DEVICE_PROTOCOL_ERROR"
            goto L_0x013a
        L_0x010e:
            r0 = 2107(0x83b, float:2.953E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            goto L_0x013a
        L_0x0115:
            java.lang.String r0 = "LINKED_DEVICE_START_ERROR"
            goto L_0x013a
        L_0x0118:
            java.lang.String r0 = "SNAPP_DENIED_BY_PEAK_POWER"
        L_0x011a:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000b
            X.UV3 r0 = X.UV3.A00
            goto L_0x0142
        L_0x0123:
            java.lang.String r0 = "SNAPP_NOT_ENOUGH_STORAGE"
            goto L_0x013a
        L_0x0126:
            java.lang.String r0 = "SOCKET_CONNECTION_ENCRYPT_LINK_TIMEOUT"
            goto L_0x013a
        L_0x0129:
            java.lang.String r0 = "MEDIA_STREAM_SERVICE_CONNECTION_FAIL"
            goto L_0x013a
        L_0x012c:
            java.lang.String r0 = "MEDIA_STREAM_SERVICE_DISCONNECT"
            goto L_0x013a
        L_0x012f:
            java.lang.String r0 = "STREAM_STOPPED_REASON_CAMERA_FAILURE"
            goto L_0x013a
        L_0x0132:
            java.lang.String r0 = "SNAPP_APP_NOT_RUNNING"
            goto L_0x013a
        L_0x0135:
            java.lang.String r0 = "SNAPP_UNSUPPORTED_APP"
            goto L_0x013a
        L_0x0138:
            java.lang.String r0 = "STREAM_STOPPED_REASON_SYSTEM_SHUTDOWN"
        L_0x013a:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000b
            X.UUo r0 = X.C15185UUo.A00
        L_0x0142:
            r2.A05(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18777W1b.A04(X.V4C):void");
    }
}
