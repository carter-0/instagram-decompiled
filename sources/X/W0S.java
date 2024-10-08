package X;

import android.os.SystemClock;
import android.view.MotionEvent;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.intent.IntentModule;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.List;

public abstract class W0S {
    public static int A06;
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public boolean A04;
    public C13572Tcw A05;

    public int A04() {
        return 2;
    }

    public static WritableNativeMap A03(W0S w0s) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putInt("target", w0s.A02);
        return writableNativeMap;
    }

    public C13948Tm8 A05() {
        WritableNativeMap writableNativeMap;
        int i;
        String str;
        WritableNativeMap A032;
        String str2;
        String str3;
        if (this instanceof UTM) {
            UTM utm = (UTM) this;
            WritableNativeMap writableNativeMap2 = new WritableNativeMap();
            writableNativeMap2.putDouble("x", Pxe.A01(utm.A02));
            writableNativeMap2.putDouble("y", Pxe.A01(utm.A03));
            writableNativeMap2.putDouble(IgReactMediaPickerNativeModule.WIDTH, Pxe.A01(utm.A01));
            writableNativeMap2.putDouble(IgReactMediaPickerNativeModule.HEIGHT, Pxe.A01(utm.A00));
            writableNativeMap = new WritableNativeMap();
            writableNativeMap.putMap("layout", writableNativeMap2);
            i = utm.A02;
        } else if (this instanceof UTI) {
            UTI uti = (UTI) this;
            WritableNativeMap A033 = A03(uti);
            A033.putBoolean(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, uti.A00);
            return A033;
        } else if (this instanceof UT9) {
            return new WritableNativeMap();
        } else {
            if (this instanceof UTC) {
                UTC utc = (UTC) this;
                A032 = A03(utc);
                str2 = utc.A00;
            } else if (this instanceof UTF) {
                UTF utf = (UTF) this;
                WritableNativeMap writableNativeMap3 = new WritableNativeMap();
                WritableNativeMap writableNativeMap4 = new WritableNativeMap();
                writableNativeMap4.putInt("end", utf.A00);
                writableNativeMap4.putInt("start", utf.A01);
                writableNativeMap3.putMap("selection", writableNativeMap4);
                return writableNativeMap3;
            } else if (this instanceof UTB) {
                A032 = new WritableNativeMap();
                str2 = ((UTB) this).A00;
                str3 = "key";
                A032.putString(str3, str2);
                return A032;
            } else if (this instanceof UT8) {
                return A03(this);
            } else {
                if (this instanceof UTA) {
                    UTA uta = (UTA) this;
                    A032 = A03(uta);
                    str2 = uta.A00;
                } else if (this instanceof UT7) {
                    return A03(this);
                } else {
                    if (this instanceof UTE) {
                        UTE ute = (UTE) this;
                        writableNativeMap = new WritableNativeMap();
                        writableNativeMap.putString("text", ute.A01);
                        writableNativeMap.putInt("eventCount", ute.A00);
                        i = ute.A02;
                    } else if (this instanceof UTD) {
                        UTD utd = (UTD) this;
                        WritableNativeMap writableNativeMap5 = new WritableNativeMap();
                        WritableNativeMap writableNativeMap6 = new WritableNativeMap();
                        writableNativeMap6.putDouble(IgReactMediaPickerNativeModule.WIDTH, (double) utd.A01);
                        writableNativeMap6.putDouble(IgReactMediaPickerNativeModule.HEIGHT, (double) utd.A00);
                        writableNativeMap5.putMap("contentSize", writableNativeMap6);
                        writableNativeMap5.putInt("target", utd.A02);
                        return writableNativeMap5;
                    } else if (this instanceof UT6) {
                        return new WritableNativeMap();
                    } else {
                        if (this instanceof UTN) {
                            UTN utn = (UTN) this;
                            WritableNativeMap writableNativeMap7 = new WritableNativeMap();
                            writableNativeMap7.putDouble("top", 0.0d);
                            writableNativeMap7.putDouble("bottom", 0.0d);
                            writableNativeMap7.putDouble("left", 0.0d);
                            writableNativeMap7.putDouble("right", 0.0d);
                            WritableNativeMap writableNativeMap8 = new WritableNativeMap();
                            writableNativeMap8.putDouble("x", (double) W2U.A00(utn.A00));
                            writableNativeMap8.putDouble("y", (double) W2U.A00(utn.A01));
                            WritableNativeMap writableNativeMap9 = new WritableNativeMap();
                            writableNativeMap9.putDouble(IgReactMediaPickerNativeModule.WIDTH, Pxe.A01(utn.A05));
                            writableNativeMap9.putDouble(IgReactMediaPickerNativeModule.HEIGHT, Pxe.A01(utn.A04));
                            WritableNativeMap writableNativeMap10 = new WritableNativeMap();
                            writableNativeMap10.putDouble(IgReactMediaPickerNativeModule.WIDTH, Pxe.A01(utn.A07));
                            writableNativeMap10.putDouble(IgReactMediaPickerNativeModule.HEIGHT, Pxe.A01(utn.A06));
                            WritableNativeMap writableNativeMap11 = new WritableNativeMap();
                            writableNativeMap11.putDouble("x", (double) utn.A02);
                            writableNativeMap11.putDouble("y", (double) utn.A03);
                            WritableNativeMap writableNativeMap12 = new WritableNativeMap();
                            writableNativeMap12.putMap("contentInset", writableNativeMap7);
                            writableNativeMap12.putMap("contentOffset", writableNativeMap8);
                            writableNativeMap12.putMap("contentSize", writableNativeMap9);
                            writableNativeMap12.putMap("layoutMeasurement", writableNativeMap10);
                            writableNativeMap12.putMap("velocity", writableNativeMap11);
                            writableNativeMap12.putInt("target", utn.A02);
                            writableNativeMap12.putBoolean("responderIgnoreScroll", true);
                            return writableNativeMap12;
                        } else if (this instanceof UTL) {
                            UTL utl = (UTL) this;
                            WritableNativeMap writableNativeMap13 = new WritableNativeMap();
                            int i2 = utl.A00;
                            if (i2 == 1) {
                                writableNativeMap13.putString("error", utl.A03);
                                return writableNativeMap13;
                            } else if (i2 != 2) {
                                return writableNativeMap13;
                            } else {
                                WritableNativeMap writableNativeMap14 = new WritableNativeMap();
                                writableNativeMap14.putString("uri", utl.A04);
                                writableNativeMap14.putDouble(IgReactMediaPickerNativeModule.WIDTH, (double) utl.A02);
                                writableNativeMap14.putDouble(IgReactMediaPickerNativeModule.HEIGHT, (double) utl.A01);
                                writableNativeMap13.putMap("source", writableNativeMap14);
                                return writableNativeMap13;
                            }
                        } else if (this instanceof UTK) {
                            return ((UTK) this).A00;
                        } else {
                            if (this instanceof UTH) {
                                UTH uth = (UTH) this;
                                WritableNativeMap A034 = A03(uth);
                                A034.putDouble(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, uth.A00);
                                return A034;
                            } else if (!(this instanceof UTG)) {
                                return null;
                            } else {
                                writableNativeMap = new WritableNativeMap();
                                i = ((UTG) this).A00;
                                str = "position";
                                writableNativeMap.putInt(str, i);
                                return writableNativeMap;
                            }
                        }
                    }
                }
            }
            str3 = "text";
            A032.putString(str3, str2);
            return A032;
        }
        str = "target";
        writableNativeMap.putInt(str, i);
        return writableNativeMap;
    }

    public final C13572Tcw A06() {
        if (this instanceof UTO) {
            UTO uto = (UTO) this;
            C13572Tcw tcw = uto.A01;
            if (tcw != null) {
                return tcw;
            }
            WJa wJa = new WJa(uto);
            uto.A01 = wJa;
            return wJa;
        }
        C13572Tcw tcw2 = this.A05;
        if (tcw2 != null) {
            return tcw2;
        }
        WJZ wjz = new WJZ(this);
        this.A05 = wjz;
        return wjz;
    }

    public String A07() {
        if (this instanceof UTM) {
            return "topLayout";
        }
        if (this instanceof UTI) {
            return "topChange";
        }
        if (this instanceof UT9) {
            return "topClick";
        }
        if (this instanceof UTC) {
            return "topSubmitEditing";
        }
        if (this instanceof UTF) {
            return "topSelectionChange";
        }
        if (this instanceof UTB) {
            return "topKeyPress";
        }
        if (this instanceof UT8) {
            return "topFocus";
        }
        if (this instanceof UTA) {
            return "topEndEditing";
        }
        if (this instanceof UT7) {
            return "topBlur";
        }
        if (this instanceof UTE) {
            return "topChange";
        }
        if (this instanceof UTD) {
            return Pxd.A00(278);
        }
        if (this instanceof UT6) {
            return "topRefresh";
        }
        if (this instanceof UTN) {
            Integer num = ((UTN) this).A08;
            0Sd.A00(num);
            0qQ.A07(num);
            int intValue = num.intValue();
            if (intValue == 0) {
                return "topScrollBeginDrag";
            }
            if (intValue == 1) {
                return "topScrollEndDrag";
            }
            if (intValue == 2) {
                return "topScroll";
            }
            if (intValue == 3) {
                return "topMomentumScrollBegin";
            }
            if (intValue == 4) {
                return "topMomentumScrollEnd";
            }
            throw new RuntimeException();
        } else if (this instanceof UTL) {
            int i = ((UTL) this).A00;
            if (i == 1) {
                return "topError";
            }
            if (i == 2) {
                return "topLoad";
            }
            if (i == 3) {
                return "topLoadEnd";
            }
            if (i == 4) {
                return "topLoadStart";
            }
            throw DbW.A0b("Invalid image event: ", i);
        } else if (this instanceof UTO) {
            return ((UTO) this).A03;
        } else {
            if (this instanceof UTK) {
                return "topAccessibilityAction";
            }
            if (this instanceof UTH) {
                return "topSlidingComplete";
            }
            if (this instanceof UTJ) {
                return "topValueChange";
            }
            return "topSelect";
        }
    }

    public short A08() {
        if (this instanceof UTL) {
            return (short) ((UTL) this).A00;
        }
        if (this instanceof UTO) {
            return ((UTO) this).A05;
        }
        return 0;
    }

    public void A09() {
        String str;
        if (this instanceof UTM) {
            UTM.A04.ECR(this);
        } else if (this instanceof UTN) {
            try {
                UTN.A09.ECR(this);
            } catch (IllegalStateException e) {
                e = e;
                str = "ScrollEvent";
                ReactSoftExceptionLogger.logSoftException(str, e);
            }
        } else if (this instanceof UTO) {
            UTO uto = (UTO) this;
            uto.A04 = null;
            MotionEvent motionEvent = uto.A00;
            uto.A00 = null;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
            try {
                UTO.A06.ECR(uto);
            } catch (IllegalStateException e2) {
                e = e2;
                str = "PointerEvent";
                ReactSoftExceptionLogger.logSoftException(str, e);
            }
        }
    }

    @Deprecated
    public void A0B(RCTEventEmitter rCTEventEmitter) {
        int i;
        String A07;
        WritableNativeMap writableNativeMap;
        if (this instanceof UTO) {
            UTO uto = (UTO) this;
            if (uto.A00 == null) {
                ReactSoftExceptionLogger.logSoftException("PointerEvent", new IllegalStateException("Cannot dispatch a Pointer that has no MotionEvent; the PointerEvehas been recycled"));
                return;
            }
            List list = uto.A04;
            if (list == null) {
                list = UTO.A02(uto);
                uto.A04 = list;
                if (list == null) {
                    return;
                }
            }
            boolean z = true;
            if (list.size() <= 1) {
                z = false;
            }
            for (C13948Tm8 tm8 : uto.A04) {
                if (z) {
                    tm8 = tm8.copy();
                }
                rCTEventEmitter.receiveEvent(uto.A02, uto.A03, tm8);
            }
            return;
        }
        if (this instanceof UTJ) {
            UTJ utj = (UTJ) this;
            i = utj.A02;
            A07 = "topValueChange";
            WritableNativeMap A032 = A03(utj);
            A032.putDouble(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, utj.A00);
            A032.putBoolean("fromUser", utj.A01);
            writableNativeMap = A032;
        } else {
            i = this.A02;
            A07 = A07();
            writableNativeMap = A05();
        }
        rCTEventEmitter.receiveEvent(i, A07, writableNativeMap);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0076, code lost:
        r0 = r7.equals(r0);
        r11 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007e, code lost:
        r0 = r7.equals(r0);
        r11 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0083, code lost:
        if (r0 != false) goto L_0x005e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0C(com.facebook.react.uimanager.events.RCTModernEventEmitter r13) {
        /*
            r12 = this;
            boolean r0 = r12 instanceof X.UTO
            r4 = r13
            if (r0 == 0) goto L_0x0086
            r1 = r12
            X.UTO r1 = (X.UTO) r1
            android.view.MotionEvent r0 = r1.A00
            if (r0 != 0) goto L_0x0019
            java.lang.String r2 = "PointerEvent"
            java.lang.String r1 = "Cannot dispatch a Pointer that has no MotionEvent; the PointerEvehas been recycled"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            com.facebook.react.bridge.ReactSoftExceptionLogger.logSoftException(r2, r0)
        L_0x0018:
            return
        L_0x0019:
            java.util.List r0 = r1.A04
            if (r0 != 0) goto L_0x0026
            java.util.List r0 = X.UTO.A02(r1)
            r1.A04 = r0
            if (r0 != 0) goto L_0x0026
            return
        L_0x0026:
            int r2 = r0.size()
            r0 = 1
            boolean r3 = X.C51970G9q.A1W(r2, r0)
            java.util.List r0 = r1.A04
            java.util.Iterator r2 = r0.iterator()
        L_0x0035:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0018
            java.lang.Object r10 = r2.next()
            X.Tm8 r10 = (X.C13948Tm8) r10
            if (r3 == 0) goto L_0x0047
            X.Tm8 r10 = r10.copy()
        L_0x0047:
            int r5 = r1.A00
            int r6 = r1.A02
            java.lang.String r7 = r1.A03
            short r9 = r1.A05
            r0 = -1
            boolean r8 = X.JTQ.A1O(r9, r0)
            if (r7 == 0) goto L_0x005d
            int r0 = r7.hashCode()
            switch(r0) {
                case -1786514288: goto L_0x0062;
                case -1780335505: goto L_0x0065;
                case -1304584214: goto L_0x0068;
                case -1304316135: goto L_0x006b;
                case -1304250340: goto L_0x006e;
                case -1065042973: goto L_0x0071;
                case 383186882: goto L_0x0074;
                case 1343400710: goto L_0x007c;
                default: goto L_0x005d;
            }
        L_0x005d:
            r11 = 2
        L_0x005e:
            r4.receiveEvent(r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0035
        L_0x0062:
            java.lang.String r0 = "topPointerEnter"
            goto L_0x007e
        L_0x0065:
            java.lang.String r0 = "topPointerLeave"
            goto L_0x007e
        L_0x0068:
            java.lang.String r0 = "topPointerDown"
            goto L_0x0076
        L_0x006b:
            java.lang.String r0 = "topPointerMove"
            goto L_0x007e
        L_0x006e:
            java.lang.String r0 = "topPointerOver"
            goto L_0x007e
        L_0x0071:
            java.lang.String r0 = "topPointerUp"
            goto L_0x0076
        L_0x0074:
            java.lang.String r0 = "topPointerCancel"
        L_0x0076:
            boolean r0 = r7.equals(r0)
            r11 = 3
            goto L_0x0083
        L_0x007c:
            java.lang.String r0 = "topPointerOut"
        L_0x007e:
            boolean r0 = r7.equals(r0)
            r11 = 4
        L_0x0083:
            if (r0 != 0) goto L_0x005e
            goto L_0x005d
        L_0x0086:
            int r5 = r12.A00
            r0 = -1
            if (r5 == r0) goto L_0x00a5
            int r6 = r12.A02
            java.lang.String r7 = r12.A07()
            boolean r8 = r12.A0D()
            short r9 = r12.A08()
            X.Tm8 r10 = r12.A05()
            int r11 = r12.A04()
            r4.receiveEvent(r5, r6, r7, r8, r9, r10, r11)
            return
        L_0x00a5:
            r12.A0B(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W0S.A0C(com.facebook.react.uimanager.events.RCTModernEventEmitter):void");
    }

    public boolean A0D() {
        if ((this instanceof UT9) || (this instanceof UTC) || (this instanceof UTB) || (this instanceof UT8) || (this instanceof UTA) || (this instanceof UT7)) {
            return false;
        }
        if (this instanceof UTN) {
            return AnonymousClass7TF.A1W(((UTN) this).A08, AnonymousClass05K.A0C);
        }
        if (!(this instanceof UTH)) {
            return true;
        }
        return false;
    }

    public W0S(int i, int i2) {
        int i3 = A06;
        A06 = i3 + 1;
        this.A01 = i3;
        A0A(i, i2);
    }

    public final void A0A(int i, int i2) {
        long uptimeMillis = SystemClock.uptimeMillis();
        this.A00 = i;
        this.A02 = i2;
        this.A03 = uptimeMillis;
        this.A04 = true;
    }

    public W0S() {
        int i = A06;
        A06 = i + 1;
        this.A01 = i;
    }
}
