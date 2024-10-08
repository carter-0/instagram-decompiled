package X;

import com.facebook.react.animated.NativeAnimatedModule;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.webrtc.EglBase14Impl;

/* renamed from: X.S1n  reason: case insensitive filesystem */
public final class C10934S1n {
    public C10407Rrj A00 = null;
    public final Queue A01 = new ConcurrentLinkedQueue();
    public final /* synthetic */ NativeAnimatedModule A02;

    public C10934S1n(NativeAnimatedModule nativeAnimatedModule) {
        this.A02 = nativeAnimatedModule;
    }

    public final void A00(C11404SSb sSb, long j) {
        Queue queue = this.A01;
        if (!queue.isEmpty() || this.A00 != null) {
            ArrayList A1C = AnonymousClass7TE.A1C();
            while (true) {
                C10407Rrj rrj = this.A00;
                if (rrj != null) {
                    if (rrj.A00 > j) {
                        break;
                    }
                    A1C.add(rrj);
                    this.A00 = null;
                }
                C10407Rrj rrj2 = (C10407Rrj) queue.poll();
                if (rrj2 == null) {
                    break;
                } else if (rrj2.A00 > j) {
                    this.A00 = rrj2;
                    break;
                } else {
                    A1C.add(rrj2);
                }
            }
            Iterator it = A1C.iterator();
            while (it.hasNext()) {
                C10407Rrj rrj3 = (C10407Rrj) it.next();
                if (!(rrj3 instanceof C7826QYl)) {
                    if (!(rrj3 instanceof QYp)) {
                        if (!(rrj3 instanceof QYo)) {
                            if (!(rrj3 instanceof C7828QYn)) {
                                if (!(rrj3 instanceof C7827QYm)) {
                                    if (!(rrj3 instanceof C7825QYk)) {
                                        C7824QYj qYj = (C7824QYj) rrj3;
                                        switch (qYj.A00) {
                                            case 0:
                                                sSb.A05(qYj.A01);
                                                break;
                                            case 1:
                                                sSb.A04(qYj.A01);
                                                break;
                                            case 2:
                                                sSb.A07(qYj.A01);
                                                break;
                                            case 3:
                                                sSb.A06(qYj.A01);
                                                break;
                                            case 4:
                                                int i = qYj.A01;
                                                SIU A002 = C11404SSb.A00(sSb, i);
                                                if (A002 != null && (A002 instanceof QYz)) {
                                                    ((QYz) A002).A02 = null;
                                                    break;
                                                } else {
                                                    throw TQP.A00("startListeningToAnimatedNodeValue: Animated node [", "] does not exist, or is not a 'value' node", i);
                                                }
                                            default:
                                                int i2 = qYj.A01;
                                                sSb.A05.remove(i2);
                                                sSb.A06.remove(i2);
                                                break;
                                        }
                                    } else {
                                        C7825QYk qYk = (C7825QYk) rrj3;
                                        if (qYk.A01 != 0) {
                                            int i3 = qYk.A02;
                                            double d = qYk.A00;
                                            SIU A003 = C11404SSb.A00(sSb, i3);
                                            if (A003 == null || !(A003 instanceof QYz)) {
                                                throw TQP.A00("setAnimatedNodeOffset: Animated node [", "] does not exist, or is not a 'value' node", i3);
                                            }
                                            ((QYz) A003).A01 = d;
                                            sSb.A06.put(i3, A003);
                                        } else {
                                            sSb.A08(qYk.A02, qYk.A00);
                                        }
                                    }
                                } else {
                                    C7827QYm qYm = (C7827QYm) rrj3;
                                    sSb.A0H(qYm.A00, qYm.A03, qYm.A02);
                                }
                            } else {
                                C7828QYn qYn = (C7828QYn) rrj3;
                                sSb.A0G(qYn.A01, qYn.A03, qYn.A00);
                            }
                        } else {
                            QYo qYo = (QYo) rrj3;
                            int i4 = qYo.A01;
                            int i5 = qYo.A00;
                            sSb.A0I(qYo.A03, qYo.A04, i4, i5);
                        }
                    } else {
                        QYp qYp = (QYp) rrj3;
                        switch (qYp.A00) {
                            case 0:
                                sSb.A0D(qYp.A01, (Callback) qYp.A03);
                                break;
                            case 1:
                                NativeAnimatedModule nativeAnimatedModule = (NativeAnimatedModule) qYp.A02;
                                nativeAnimatedModule.getReactApplicationContextIfActiveOrWarn();
                                int i6 = 0;
                                while (i6 < qYp.A01) {
                                    ReadableArray readableArray = (ReadableArray) qYp.A03;
                                    int i7 = i6 + 1;
                                    int i8 = readableArray.getInt(i6);
                                    Integer[] numArr = C9124RPw.A00;
                                    if (numArr == null) {
                                        numArr = AnonymousClass05K.A00(21);
                                        C9124RPw.A00 = numArr;
                                    }
                                    switch (JTO.A0A(numArr, i8 - 1)) {
                                        case 0:
                                            int i9 = i7 + 1;
                                            i6 = i9 + 1;
                                            sSb.A0E(readableArray.getInt(i7), readableArray.getMap(i9));
                                            break;
                                        case 1:
                                            int i10 = i7 + 1;
                                            i6 = i10 + 1;
                                            sSb.A0F(readableArray.getInt(i7), readableArray.getMap(i10));
                                            break;
                                        case 2:
                                            i6 = i7 + 1;
                                            sSb.A0D(readableArray.getInt(i7), (Callback) null);
                                            break;
                                        case 3:
                                            i6 = i7 + 1;
                                            int i11 = readableArray.getInt(i7);
                                            C12206Sp4 sp4 = new C12206Sp4(qYp, i11);
                                            SIU A004 = C11404SSb.A00(sSb, i11);
                                            if (A004 != null && (A004 instanceof QYz)) {
                                                ((QYz) A004).A02 = sp4;
                                                break;
                                            } else {
                                                throw TQP.A00("startListeningToAnimatedNodeValue: Animated node [", "] does not exist, or is not a 'value' node", i11);
                                            }
                                        case 4:
                                            i6 = i7 + 1;
                                            int i12 = readableArray.getInt(i7);
                                            SIU A005 = C11404SSb.A00(sSb, i12);
                                            if (A005 != null && (A005 instanceof QYz)) {
                                                ((QYz) A005).A02 = null;
                                                break;
                                            } else {
                                                throw TQP.A00("startListeningToAnimatedNodeValue: Animated node [", "] does not exist, or is not a 'value' node", i12);
                                            }
                                        case 5:
                                            int i13 = i7 + 1;
                                            i6 = i13 + 1;
                                            sSb.A0A(readableArray.getInt(i7), readableArray.getInt(i13));
                                            break;
                                        case 6:
                                            int i14 = i7 + 1;
                                            i6 = i14 + 1;
                                            sSb.A0C(readableArray.getInt(i7), readableArray.getInt(i14));
                                            break;
                                        case 7:
                                            if (C18401Vr3.A00.lazyAnimationCallbacks()) {
                                                nativeAnimatedModule.enqueueFrameCallback();
                                            }
                                            int i15 = i7 + 1;
                                            int i16 = i15 + 1;
                                            i6 = i16 + 1;
                                            sSb.A0I((Callback) null, readableArray.getMap(i16), readableArray.getInt(i7), readableArray.getInt(i15));
                                            break;
                                        case 8:
                                            i6 = i7 + 1;
                                            sSb.A07(readableArray.getInt(i7));
                                            break;
                                        case 9:
                                        case 10:
                                            int i17 = i7 + 1;
                                            i6 = i17 + 1;
                                            sSb.A08(readableArray.getInt(i7), readableArray.getDouble(i17));
                                            break;
                                        case 11:
                                            i6 = i7 + 1;
                                            sSb.A05(readableArray.getInt(i7));
                                            break;
                                        case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                                            i6 = i7 + 1;
                                            sSb.A04(readableArray.getInt(i7));
                                            break;
                                        case 13:
                                            int i18 = i7 + 1;
                                            i6 = i18 + 1;
                                            sSb.A09(readableArray.getInt(i7), readableArray.getInt(i18));
                                            break;
                                        case 14:
                                            int i19 = i7 + 1;
                                            int i20 = readableArray.getInt(i7);
                                            i6 = i19 + 1;
                                            int i21 = readableArray.getInt(i19);
                                            nativeAnimatedModule.decrementInFlightAnimationsForViewTag(i21);
                                            sSb.A0B(i20, i21);
                                            break;
                                        case 15:
                                            i6 = i7 + 1;
                                            sSb.A06(readableArray.getInt(i7));
                                            break;
                                        case 16:
                                            i6 = i7 + 1;
                                            int i22 = readableArray.getInt(i7);
                                            sSb.A05.remove(i22);
                                            sSb.A06.remove(i22);
                                            break;
                                        case 17:
                                            int i23 = i7 + 1;
                                            int i24 = i23 + 1;
                                            i6 = i24 + 1;
                                            sSb.A0H(readableArray.getInt(i7), readableArray.getString(i23), readableArray.getMap(i24));
                                            break;
                                        case EglBase14Impl.EGLExt_SDK_VERSION /*18*/:
                                            int i25 = i7 + 1;
                                            int i26 = readableArray.getInt(i7);
                                            nativeAnimatedModule.decrementInFlightAnimationsForViewTag(i26);
                                            int i27 = i25 + 1;
                                            i6 = i27 + 1;
                                            sSb.A0G(i26, readableArray.getString(i25), readableArray.getInt(i27));
                                            break;
                                        case 19:
                                        case 20:
                                            i6 = i7 + 1;
                                            break;
                                        default:
                                            throw AnonymousClass7TE.A0w("Batch animation execution op: unknown op code");
                                    }
                                }
                                continue;
                            case 2:
                                sSb.A0E(qYp.A01, (ReadableMap) qYp.A03);
                                break;
                            case 3:
                                sSb.A0F(qYp.A01, (ReadableMap) qYp.A03);
                                break;
                            default:
                                int i28 = qYp.A01;
                                C13565Tck tck = (C13565Tck) qYp.A03;
                                SIU A006 = C11404SSb.A00(sSb, i28);
                                if (A006 != null && (A006 instanceof QYz)) {
                                    ((QYz) A006).A02 = tck;
                                    break;
                                } else {
                                    throw TQP.A00("startListeningToAnimatedNodeValue: Animated node [", "] does not exist, or is not a 'value' node", i28);
                                }
                                break;
                        }
                    }
                } else {
                    C7826QYl qYl = (C7826QYl) rrj3;
                    switch (qYl.A00) {
                        case 0:
                            sSb.A0A(qYl.A02, qYl.A01);
                            break;
                        case 1:
                            sSb.A0C(qYl.A02, qYl.A01);
                            break;
                        case 2:
                            sSb.A09(qYl.A01, qYl.A02);
                            break;
                        default:
                            sSb.A0B(qYl.A01, qYl.A02);
                            break;
                    }
                }
            }
        }
    }
}
