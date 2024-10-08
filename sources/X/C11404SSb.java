package X;

import android.util.SparseArray;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.animated.EventAnimationDriver;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.intent.IntentModule;
import com.facebook.react.uimanager.UIManagerHelper;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* renamed from: X.SSb  reason: case insensitive filesystem */
public final class C11404SSb {
    public boolean A00 = false;
    public boolean A01 = false;
    public int A02 = 0;
    public boolean A03 = false;
    public final SparseArray A04 = Pxe.A0L();
    public final SparseArray A05 = Pxe.A0L();
    public final SparseArray A06 = Pxe.A0L();
    public final QZK A07;
    public final List A08 = AnonymousClass7TE.A1C();
    public final List A09 = Pxe.A1A();

    private void A01(SIU siu) {
        WritableNativeArray writableNativeArray = null;
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.A04;
            if (i >= sparseArray.size()) {
                break;
            }
            S2L s2l = (S2L) sparseArray.valueAt(i);
            if (siu.equals(s2l.A01)) {
                if (s2l.A02 != null) {
                    WritableNativeMap A0U = Pxe.A0U();
                    QYz.A00(s2l, A0U, false);
                    Pxh.A1E(s2l.A02, A0U);
                } else {
                    WritableNativeMap A0U2 = Pxe.A0U();
                    A0U2.putInt("animationId", s2l.A00);
                    QYz.A00(s2l, A0U2, false);
                    if (writableNativeArray == null) {
                        writableNativeArray = new WritableNativeArray();
                    }
                    writableNativeArray.pushMap(A0U2);
                }
                sparseArray.removeAt(i);
                i--;
            }
            i++;
        }
        if (writableNativeArray != null) {
            this.A07.A0E("onNativeAnimatedModuleAnimationFinished", writableNativeArray);
        }
    }

    public final void A07(int i) {
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.A04;
            WritableNativeArray writableNativeArray = null;
            if (i2 < sparseArray.size()) {
                S2L s2l = (S2L) sparseArray.valueAt(i2);
                if (s2l.A00 == i) {
                    Callback callback = s2l.A02;
                    WritableNativeMap A0U = Pxe.A0U();
                    if (callback != null) {
                        QYz.A00(s2l, A0U, false);
                        Pxh.A1E(s2l.A02, A0U);
                    } else {
                        A0U.putInt("animationId", s2l.A00);
                        QYz.A00(s2l, A0U, false);
                        writableNativeArray = new WritableNativeArray();
                        writableNativeArray.pushMap(A0U);
                    }
                    sparseArray.removeAt(i2);
                    if (writableNativeArray != null) {
                        this.A07.A0E("onNativeAnimatedModuleAnimationFinished", writableNativeArray);
                        return;
                    }
                    return;
                }
                i2++;
            } else {
                return;
            }
        }
    }

    public static SIU A00(C11404SSb sSb, int i) {
        return (SIU) sSb.A05.get(i);
    }

    public static void A02(C11404SSb sSb, W0S w0s) {
        List<EventAnimationDriver> list = sSb.A08;
        if (!list.isEmpty()) {
            boolean z = false;
            C13572Tcw A062 = w0s.A06();
            for (EventAnimationDriver eventAnimationDriver : list) {
                if (A062.CmP(eventAnimationDriver.viewTag, eventAnimationDriver.eventName)) {
                    z = true;
                    sSb.A01(eventAnimationDriver.valueNode);
                    w0s.A0C(eventAnimationDriver);
                    sSb.A09.add(eventAnimationDriver.valueNode);
                }
            }
            if (z) {
                List list2 = sSb.A09;
                A03(sSb, list2);
                list2.clear();
            }
        }
    }

    public static void A03(C11404SSb sSb, List list) {
        String str;
        String str2;
        String str3;
        QYz qYz;
        C13565Tck tck;
        IllegalArgumentException A0w;
        C12220SpN spN;
        int A052;
        Object obj;
        int A053;
        Object obj2;
        double d;
        int i;
        C11404SSb sSb2 = sSb;
        int i2 = sSb2.A02 + 1;
        sSb2.A02 = i2;
        if (i2 == 0) {
            sSb2.A02 = 1;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        Iterator it = list.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            SIU siu = (SIU) it.next();
            int i4 = siu.A00;
            int i5 = sSb2.A02;
            if (i4 != i5) {
                siu.A00 = i5;
                i3++;
                arrayDeque.add(siu);
            }
        }
        while (!arrayDeque.isEmpty()) {
            SIU siu2 = (SIU) arrayDeque.poll();
            if (siu2.A03 != null) {
                for (int i6 = 0; i6 < siu2.A03.size(); i6++) {
                    SIU siu3 = (SIU) siu2.A03.get(i6);
                    siu3.A01++;
                    int i7 = siu3.A00;
                    int i8 = sSb2.A02;
                    if (i7 != i8) {
                        siu3.A00 = i8;
                        i3++;
                        arrayDeque.add(siu3);
                    }
                }
            }
        }
        int i9 = sSb2.A02 + 1;
        sSb2.A02 = i9;
        if (i9 == 0) {
            sSb2.A02 = 1;
        }
        Iterator it2 = list.iterator();
        int i10 = 0;
        while (it2.hasNext()) {
            SIU siu4 = (SIU) it2.next();
            if (siu4.A01 == 0 && siu4.A00 != (i = sSb2.A02)) {
                siu4.A00 = i;
                i10++;
                arrayDeque.add(siu4);
            }
        }
        int i11 = 0;
        while (!arrayDeque.isEmpty()) {
            SIU siu5 = (SIU) arrayDeque.poll();
            try {
                siu5.A04();
                if (siu5 instanceof C7817QYc) {
                    C7817QYc qYc = (C7817QYc) siu5;
                    if (qYc.A00 != -1) {
                        Iterator A0u = AnonymousClass7TF.A0u(qYc.A04);
                        while (A0u.hasNext()) {
                            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                            String A13 = DbT.A13(A1J);
                            SIU A002 = A00(qYc.A02, C66582MXn.A08(A1J));
                            if (A002 == null) {
                                A0w = AnonymousClass7TE.A0w("Mapped property node does not exist");
                            } else if (A002 instanceof C7815QYa) {
                                C7815QYa qYa = (C7815QYa) A002;
                                C12220SpN spN2 = qYc.A03;
                                0qQ.A0B(spN2, 0);
                                Iterator A0u2 = AnonymousClass7TF.A0u(qYa.A01);
                                while (A0u2.hasNext()) {
                                    Map.Entry A1J2 = AnonymousClass7TE.A1J(A0u2);
                                    String A132 = DbT.A13(A1J2);
                                    SIU A003 = A00(qYa.A00, C66582MXn.A08(A1J2));
                                    if (A003 == null) {
                                        A0w = AnonymousClass7TE.A0w("Mapped style node does not exist");
                                    } else if (A003 instanceof C7816QYb) {
                                        C7816QYb qYb = (C7816QYb) A003;
                                        List list2 = qYb.A01;
                                        int size = list2.size();
                                        ArrayList A0v = DbS.A0v(size);
                                        for (int i12 = 0; i12 < size; i12++) {
                                            C10408Rrk rrk = (C10408Rrk) list2.get(i12);
                                            if (rrk instanceof QYq) {
                                                SIU A004 = A00(qYb.A00, ((QYq) rrk).A00);
                                                if (A004 == null) {
                                                    A0w = AnonymousClass7TE.A0w("Mapped style node does not exist");
                                                } else if (A004 instanceof QYz) {
                                                    d = ((QYz) A004).A05();
                                                } else {
                                                    StringBuilder A1A = AnonymousClass7TE.A1A();
                                                    A1A.append("Unsupported type of node used as a transform child node ");
                                                    A0w = C66582MXn.A0j(A004.getClass(), A1A);
                                                }
                                            } else {
                                                0qQ.A0C(rrk, "null cannot be cast to non-null type com.facebook.react.animated.TransformAnimatedNode.StaticTransformConfig");
                                                d = ((QYr) rrk).A00;
                                            }
                                            A0v.add(new C12220SpN(rrk.A00, Double.valueOf(d)));
                                        }
                                        spN2.putArray("transform", new C12219SpM(A0v));
                                    } else {
                                        if (A003 instanceof QYz) {
                                            QYz qYz2 = (QYz) A003;
                                            if (qYz2 instanceof QYy) {
                                                obj2 = ((QYy) qYz2).A02;
                                            } else {
                                                obj2 = null;
                                            }
                                            if (obj2 instanceof Integer) {
                                                A053 = AnonymousClass7TE.A0M(obj2);
                                            } else if (obj2 instanceof String) {
                                                spN2.putString(A132, (String) obj2);
                                            } else {
                                                spN2.putDouble(A132, qYz2.A05());
                                            }
                                        } else if (A003 instanceof C7819QYe) {
                                            A053 = ((C7819QYe) A003).A05();
                                        } else if (A003 instanceof C7820QYf) {
                                            ((C7820QYf) A003).A05(spN2, A132);
                                        } else {
                                            StringBuilder A1A2 = AnonymousClass7TE.A1A();
                                            A1A2.append("Unsupported type of node used in property node ");
                                            A0w = C66582MXn.A0j(A003.getClass(), A1A2);
                                        }
                                        spN2.A01(A132, A053);
                                    }
                                }
                                continue;
                            } else {
                                if (A002 instanceof QYz) {
                                    QYz qYz3 = (QYz) A002;
                                    if (qYz3 instanceof QYy) {
                                        obj = ((QYy) qYz3).A02;
                                    } else {
                                        obj = null;
                                    }
                                    if (obj instanceof Integer) {
                                        spN = qYc.A03;
                                        A052 = AnonymousClass7TE.A0M(obj);
                                    } else if (obj instanceof String) {
                                        qYc.A03.putString(A13, (String) obj);
                                    } else {
                                        qYc.A03.putDouble(A13, qYz3.A05());
                                    }
                                } else if (A002 instanceof C7819QYe) {
                                    spN = qYc.A03;
                                    A052 = ((C7819QYe) A002).A05();
                                } else if (A002 instanceof C7820QYf) {
                                    ((C7820QYf) A002).A05(qYc.A03, A13);
                                } else {
                                    StringBuilder A1A3 = AnonymousClass7TE.A1A();
                                    A1A3.append("Unsupported type of node used in property node ");
                                    A0w = C66582MXn.A0j(A002.getClass(), A1A3);
                                }
                                spN.A01(A13, A052);
                            }
                            throw A0w;
                        }
                        X9N x9n = qYc.A01;
                        if (x9n != null) {
                            x9n.synchronouslyUpdateViewOnUIThread(qYc.A00, qYc.A03);
                        }
                    }
                }
            } catch (TQP e) {
                0I1.A05("NativeAnimatedNodesManager", "Native animation workaround, frame lost as result of race condition", e);
            }
            if ((siu5 instanceof QYz) && (tck = qYz.A02) != null) {
                tck.Dx1((qYz = (QYz) siu5).A05());
            }
            if (siu5.A03 != null) {
                for (int i13 = 0; i13 < siu5.A03.size(); i13++) {
                    SIU siu6 = (SIU) siu5.A03.get(i13);
                    int i14 = siu6.A01 - 1;
                    siu6.A01 = i14;
                    int i15 = siu6.A00;
                    int i16 = sSb2.A02;
                    if (i15 != i16 && i14 == 0) {
                        siu6.A00 = i16;
                        i10++;
                        arrayDeque.add(siu6);
                    } else if (i15 == i16) {
                        i11++;
                    }
                }
            }
        }
        if (i3 == i10) {
            sSb2.A03 = false;
        } else if (!sSb2.A03) {
            sSb2.A03 = true;
            0I1.A03("NativeAnimatedNodesManager", "Detected animation cycle or disconnected graph. ");
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                SIU siu7 = (SIU) it3.next();
                List list3 = siu7.A03;
                if (list3 != null) {
                    str2 = C66581MXm.A0w(" ", list3);
                } else {
                    str2 = null;
                }
                String A032 = siu7.A03();
                if (str2 == null || 00l.A0W(str2)) {
                    str3 = "";
                } else {
                    str3 = 002.A0R(" children: ", str2);
                }
                0I1.A03("NativeAnimatedNodesManager", 002.A0R(A032, str3));
            }
            if (i11 > 0) {
                str = 002.A0c("cycles (", ")", i11);
            } else {
                str = "disconnected regions";
            }
            IllegalStateException A0z = AnonymousClass7TE.A0z(002.A0y("Looks like animated nodes graph has ", str, ", there are ", " but toposort visited only ", i3, i10));
            if (sSb2.A00) {
                ReactSoftExceptionLogger.logSoftException("NativeAnimatedNodesManager", new RuntimeException(A0z));
                return;
            }
            throw A0z;
        }
    }

    public final void A0A(int i, int i2) {
        SparseArray sparseArray = this.A05;
        SIU siu = (SIU) sparseArray.get(i);
        if (siu != null) {
            SIU siu2 = (SIU) sparseArray.get(i2);
            if (siu2 != null) {
                List list = siu.A03;
                if (list == null) {
                    list = DbS.A0v(1);
                    siu.A03 = list;
                }
                list.add(siu2);
                if (siu2 instanceof QYy) {
                    QYy qYy = (QYy) siu2;
                    if (qYy.A00 != null) {
                        throw AnonymousClass7TE.A0z("Parent already attached");
                    } else if (siu instanceof QYz) {
                        qYy.A00 = (QYz) siu;
                    } else {
                        throw AnonymousClass7TE.A0w("Parent is of an invalid type");
                    }
                }
                this.A06.put(i2, siu2);
                return;
            }
            throw TQP.A00("connectAnimatedNodes: Animated node with tag (child) [", "] does not exist", i2);
        }
        throw TQP.A00("connectAnimatedNodes: Animated node with tag (parent) [", "] does not exist", i);
    }

    public final void A0C(int i, int i2) {
        SparseArray sparseArray = this.A05;
        SIU siu = (SIU) sparseArray.get(i);
        if (siu != null) {
            SIU siu2 = (SIU) sparseArray.get(i2);
            if (siu2 != null) {
                List list = siu.A03;
                if (list != null) {
                    if (siu2 instanceof QYy) {
                        QYy qYy = (QYy) siu2;
                        if (siu == qYy.A00) {
                            qYy.A00 = null;
                        } else {
                            throw AnonymousClass7TE.A0w("Invalid parent node provided");
                        }
                    }
                    list.remove(siu2);
                }
                this.A06.put(i2, siu2);
                return;
            }
            throw TQP.A00("disconnectAnimatedNodes: Animated node with tag (child) [", "] does not exist", i2);
        }
        throw TQP.A00("disconnectAnimatedNodes: Animated node with tag (parent) [", "] does not exist", i);
    }

    public final void A0E(int i, ReadableMap readableMap) {
        SIU qYf;
        SparseArray sparseArray = this.A05;
        if (sparseArray.get(i) == null) {
            String string = readableMap.getString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
            if ("style".equals(string)) {
                qYf = new C7815QYa(this, readableMap);
            } else if (IntentModule.EXTRA_MAP_KEY_FOR_VALUE.equals(string)) {
                qYf = new QYz(readableMap);
            } else if ("color".equals(string)) {
                qYf = new C7819QYe(this, this.A07, readableMap);
            } else if ("props".equals(string)) {
                qYf = new C7817QYc(this, readableMap);
            } else if ("interpolation".equals(string)) {
                qYf = new QYy(readableMap);
            } else if ("addition".equals(string)) {
                qYf = new QYs(this, readableMap);
            } else if ("subtraction".equals(string)) {
                qYf = new QYv(this, readableMap);
            } else if ("division".equals(string)) {
                qYf = new QYt(this, readableMap);
            } else if ("multiplication".equals(string)) {
                qYf = new QYu(this, readableMap);
            } else if ("modulus".equals(string)) {
                qYf = new QYw(this, readableMap);
            } else if ("diffclamp".equals(string)) {
                qYf = new C7829QYx(this, readableMap);
            } else if ("transform".equals(string)) {
                qYf = new C7816QYb(this, readableMap);
            } else if ("tracking".equals(string)) {
                qYf = new C7818QYd(this, readableMap);
            } else if ("object".equals(string)) {
                qYf = new C7820QYf(this, readableMap);
            } else {
                throw new RuntimeException(002.A0R("Unsupported node type: ", string));
            }
            qYf.A02 = i;
            sparseArray.put(i, qYf);
            this.A06.put(i, qYf);
            return;
        }
        throw TQP.A00("createAnimatedNode: Animated node [", "] already exists", i);
    }

    public final void A0H(int i, String str, ReadableMap readableMap) {
        int i2 = readableMap.getInt("animatedValueTag");
        SIU A002 = A00(this, i2);
        if (A002 == null) {
            throw TQP.A00("addAnimatedEventToView: Animated node with tag [", "] does not exist", i2);
        } else if (A002 instanceof QYz) {
            ReadableArray array = readableMap.getArray("nativeEventPath");
            ArrayList A0v = DbS.A0v(array.size());
            for (int i3 = 0; i3 < array.size(); i3++) {
                A0v.add(array.getString(i3));
            }
            if (str.startsWith("on")) {
                str = 002.A0R("top", str.substring(2));
            }
            this.A08.add(new EventAnimationDriver(str, i, A0v, (QYz) A002));
            if (str.equals("topScroll")) {
                A0H(i, "topScrollEnded", readableMap);
            }
        } else {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("addAnimatedEventToView: Animated node on view [");
            A1A.append(i);
            A1A.append("] connected to event handler (");
            A1A.append(str);
            A1A.append(") should be of type ");
            throw new RuntimeException(AnonymousClass7TF.A0l(QYz.class.getName(), A1A));
        }
    }

    public C11404SSb(QZK qzk) {
        this.A07 = qzk;
    }

    public final void A04(int i) {
        SIU A002 = A00(this, i);
        if (A002 == null || !(A002 instanceof QYz)) {
            throw TQP.A00("extractAnimatedNodeOffset: Animated node [", "] does not exist, or is not a 'value' node", i);
        }
        QYz qYz = (QYz) A002;
        qYz.A01 += qYz.A00;
        qYz.A00 = 0.0d;
    }

    public final void A05(int i) {
        SIU A002 = A00(this, i);
        if (A002 == null || !(A002 instanceof QYz)) {
            throw TQP.A00("flattenAnimatedNodeOffset: Animated node [", "] does not exist, or is not a 'value' node", i);
        }
        QYz qYz = (QYz) A002;
        qYz.A00 += qYz.A01;
        qYz.A01 = 0.0d;
    }

    public final void A06(int i) {
        SIU A002 = A00(this, i);
        if (A002 == null) {
            return;
        }
        if (A002 instanceof C7817QYc) {
            C7817QYc qYc = (C7817QYc) A002;
            int i2 = qYc.A00;
            if (i2 != -1 && i2 % 2 != 0) {
                C12220SpN spN = qYc.A03;
                ReadableMapKeySetIterator keySetIterator = spN.keySetIterator();
                while (keySetIterator.CKI()) {
                    spN.A00.put(keySetIterator.Crc(), (Object) null);
                }
                X9N x9n = qYc.A01;
                if (x9n != null) {
                    x9n.synchronouslyUpdateViewOnUIThread(qYc.A00, spN);
                    return;
                }
                return;
            }
            return;
        }
        throw new RuntimeException(Pxf.A0e(C7817QYc.class, "Animated node connected to view [?] should be of type "));
    }

    public final void A08(int i, double d) {
        SIU A002 = A00(this, i);
        if (A002 == null || !(A002 instanceof QYz)) {
            throw TQP.A00("setAnimatedNodeValue: Animated node [", "] does not exist, or is not a 'value' node", i);
        }
        A01(A002);
        ((QYz) A002).A00 = d;
        this.A06.put(i, A002);
    }

    public final void A09(int i, int i2) {
        SIU A002 = A00(this, i);
        if (A002 == null) {
            throw TQP.A00("connectAnimatedNodeToView: Animated node with tag [", "] does not exist", i);
        } else if (A002 instanceof C7817QYc) {
            QZK qzk = this.A07;
            int i3 = 2;
            if (i2 % 2 != 0) {
                i3 = 1;
            }
            X9N A032 = UIManagerHelper.A03(qzk, i3, true);
            if (A032 == null) {
                ReactSoftExceptionLogger.logSoftException("NativeAnimatedNodesManager", new RuntimeException(002.A0O("connectAnimatedNodeToView: Animated node could not be connected to UIManager - uiManager disappeared for tag: ", i2)));
                return;
            }
            C7817QYc qYc = (C7817QYc) A002;
            int i4 = qYc.A00;
            if (i4 == -1) {
                qYc.A00 = i2;
                qYc.A01 = A032;
                this.A06.put(i, A002);
                return;
            }
            throw new RuntimeException(002.A02(qYc.A02, i4, "Animated node ", " is already attached to a view: "));
        } else {
            throw new RuntimeException(002.A05(i2, "connectAnimatedNodeToView: Animated node connected to view [", "] should be of type ", C7817QYc.class.getName()));
        }
    }

    public final void A0B(int i, int i2) {
        SIU A002 = A00(this, i);
        if (A002 == null) {
            throw TQP.A00("disconnectAnimatedNodeFromView: Animated node with tag [", "] does not exist", i);
        } else if (A002 instanceof C7817QYc) {
            C7817QYc qYc = (C7817QYc) A002;
            int i3 = qYc.A00;
            if (i3 == i2 || i3 == -1) {
                qYc.A00 = -1;
                return;
            }
            throw new RuntimeException(002.A02(i2, i3, "Attempting to disconnect view that has not been connected with the given animated node: ", " but is connected to view "));
        } else {
            throw new RuntimeException(002.A05(i2, "disconnectAnimatedNodeFromView: Animated node connected to view [", "] should be of type ", C7817QYc.class.getName()));
        }
    }

    public final void A0D(int i, Callback callback) {
        SIU A002 = A00(this, i);
        if (A002 == null || !(A002 instanceof QYz)) {
            throw TQP.A00("getValue: Animated node with tag [", "] does not exist or is not a 'value' node", i);
        }
        double A052 = ((QYz) A002).A05();
        if (callback != null) {
            Pxh.A1E(callback, Double.valueOf(A052));
            return;
        }
        QZK qzk = this.A07;
        WritableNativeMap A0U = Pxe.A0U();
        A0U.putInt("tag", i);
        A0U.putDouble(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, A052);
        qzk.A0E("onNativeAnimatedModuleGetValue", A0U);
    }

    public final void A0F(int i, ReadableMap readableMap) {
        SIU A002 = A00(this, i);
        if (A002 == null) {
            throw TQP.A00("updateAnimatedNode: Animated node [", "] does not exist", i);
        } else if (A002 instanceof C7819QYe) {
            A01(A002);
            ((C7819QYe) A002).A06(readableMap);
            this.A06.put(i, A002);
        }
    }

    public final void A0G(int i, String str, int i2) {
        if (str.startsWith("on")) {
            str = 002.A0R("top", str.substring(2));
        }
        ListIterator listIterator = this.A08.listIterator();
        while (true) {
            if (!listIterator.hasNext()) {
                break;
            }
            EventAnimationDriver eventAnimationDriver = (EventAnimationDriver) listIterator.next();
            if (str.equals(eventAnimationDriver.eventName) && i == eventAnimationDriver.viewTag && i2 == eventAnimationDriver.valueNode.A02) {
                listIterator.remove();
                break;
            }
        }
        if (str.equals("topScroll")) {
            A0G(i, "topScrollEnded", i2);
        }
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.QYg, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v4, types: [X.QYh, java.lang.Object] */
    public final void A0I(Callback callback, ReadableMap readableMap, int i, int i2) {
        C7823QYi qYi;
        C7823QYi qYi2;
        SIU A002 = A00(this, i2);
        if (A002 == null) {
            throw TQP.A00("startAnimatingNode: Animated node [", "] does not exist", i2);
        } else if (A002 instanceof QYz) {
            SparseArray sparseArray = this.A04;
            S2L s2l = (S2L) sparseArray.get(i);
            if (s2l != null) {
                s2l.A01(readableMap);
                return;
            }
            String string = readableMap.getString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
            if ("frames".equals(string)) {
                ? obj = new Object();
                obj.A05 = -1;
                obj.A06 = new double[0];
                obj.A03 = 1;
                obj.A02 = 1;
                qYi2 = obj;
            } else if ("spring".equals(string)) {
                qYi = new C7823QYi(readableMap);
                qYi.A00 = i;
                qYi.A02 = callback;
                qYi.A01 = (QYz) A002;
                sparseArray.put(i, qYi);
            } else if ("decay".equals(string)) {
                ? obj2 = new Object();
                obj2.A06 = -1;
                obj2.A05 = 1;
                obj2.A04 = 1;
                qYi2 = obj2;
            } else {
                throw new RuntimeException(002.A05(i2, "startAnimatingNode: Unsupported animation type [", "]: ", string));
            }
            qYi2.A01(readableMap);
            qYi = qYi2;
            qYi.A00 = i;
            qYi.A02 = callback;
            qYi.A01 = (QYz) A002;
            sparseArray.put(i, qYi);
        } else {
            throw new RuntimeException(002.A05(i2, "startAnimatingNode: Animated node [", "] should be of type ", QYz.class.getName()));
        }
    }
}
