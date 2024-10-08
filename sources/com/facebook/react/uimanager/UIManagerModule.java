package com.facebook.react.uimanager;

import X.002;
import X.0I1;
import X.0Sd;
import X.0et;
import X.0fc;
import X.AnonymousClass000;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C11414SSm;
import X.C13773Tgo;
import X.C13948Tm8;
import X.C13990Tnq;
import X.C13991Tnr;
import X.C15148USe;
import X.C15152USi;
import X.C15153USj;
import X.C17177VLh;
import X.C17763VfZ;
import X.C17818VgX;
import X.C18291VpF;
import X.C18401Vr3;
import X.C18592Vuj;
import X.C18600Vut;
import X.C18715Vyl;
import X.C18773W0w;
import X.C18805W2w;
import X.C18936WDp;
import X.C19063WIt;
import X.C19064WIu;
import X.C19065WIv;
import X.C19066WIw;
import X.C19067WIx;
import X.C19944WiH;
import X.C19945WiI;
import X.C20832X0h;
import X.C20833X0i;
import X.C20834X0j;
import X.C20875X2b;
import X.C20877X2e;
import X.DbT;
import X.Dba;
import X.QZA;
import X.QZK;
import X.RFI;
import X.RH1;
import X.S9B;
import X.US3;
import X.US4;
import X.USa;
import X.USb;
import X.USc;
import X.W0R;
import X.W0Y;
import X.W0Z;
import X.W2L;
import X.W2U;
import X.W3K;
import X.W4S;
import X.W4T;
import X.WIy;
import X.WJb;
import X.X2X;
import X.X9N;
import android.util.SparseBooleanArray;
import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.queue.MessageQueueThread;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.systrace.SystraceMessage;
import com.facebook.yoga.YogaNative;
import com.facebook.yoga.YogaNodeJNIBase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

@ReactModule(name = "UIManager")
public class UIManagerModule extends ReactContextBaseJavaModule implements X9N, C13773Tgo {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final boolean DEBUG = false;
    public static final String NAME = "UIManager";
    public static final String TAG = "UIManagerModule";
    public int mBatchId = 0;
    public final Map mCustomDirectEvents;
    public final C20877X2e mEventDispatcher;
    public final List mListeners = new ArrayList();
    public final W4S mMemoryTrimCallback = new Object();
    public final Map mModuleConstants;
    public final W2L mUIImplementation;
    public final CopyOnWriteArrayList mUIManagerListeners = new CopyOnWriteArrayList();
    public final W4T mViewManagerRegistry;

    public int addRootView(View view) {
        return addRootView(view, (C13948Tm8) null);
    }

    public String getName() {
        return NAME;
    }

    public void markActiveTouchForTag(int i, int i2) {
    }

    public void receiveEvent(int i, String str, C13948Tm8 tm8) {
        receiveEvent(-1, i, str, tm8);
    }

    @ReactMethod
    public void sendAccessibilityEvent(int i, int i2) {
        if (i % 2 == 0) {
            X9N A03 = UIManagerHelper.A03(getReactApplicationContext(), 2, true);
            if (A03 != null) {
                A03.sendAccessibilityEvent(i, i2);
                return;
            }
            return;
        }
        C18592Vuj vuj = this.mUIImplementation.A05;
        vuj.A0F.add(new USb(vuj, i, i2));
    }

    public void sweepActiveTouchForTag(int i, int i2) {
    }

    public static Map createConstants(List list, Map map, Map map2) {
        ReactMarker.logMarker(RH1.A0R);
        0et A00 = SystraceMessage.A00(SystraceMessage.A00, "CreateUIManagerConstants", 8192);
        A00.A00(AnonymousClass7TE.A0u(), "Lazy");
        A00.A02();
        try {
            HashMap A01 = W0Y.A01();
            HashMap A002 = W0Y.A00();
            HashMap A02 = W0Y.A02();
            if (map != null) {
                map.putAll(A002);
            }
            if (map2 != null) {
                map2.putAll(A02);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ViewManager viewManager = (ViewManager) it.next();
                String name = viewManager.getName();
                HashMap A003 = W0Z.A00(viewManager, map, map2);
                if (!A003.isEmpty()) {
                    A01.put(name, A003);
                }
            }
            A01.put("genericBubblingEventTypes", A002);
            A01.put("genericDirectEventTypes", A02);
            return A01;
        } finally {
            0fc.A00(8192, 1998569504);
            ReactMarker.logMarker(RH1.A0Q);
        }
    }

    public void addUIBlock(C20875X2b x2b) {
        C18592Vuj vuj = this.mUIImplementation.A05;
        vuj.A0F.add(new C19064WIu(x2b, vuj));
    }

    public void addUIManagerEventListener(X2X x2x) {
        this.mUIManagerListeners.add(x2x);
    }

    @Deprecated
    public void addUIManagerListener(C20832X0h x0h) {
        this.mListeners.add(x0h);
    }

    @ReactMethod
    public void clearJSResponder() {
        C18592Vuj vuj = this.mUIImplementation.A05;
        vuj.A0F.add(new C15148USe(vuj, 0, 0, true, false));
    }

    @ReactMethod
    public void configureNextLayoutAnimation(ReadableMap readableMap, Callback callback, Callback callback2) {
        C18592Vuj vuj = this.mUIImplementation.A05;
        vuj.A0F.add(new C19065WIv(callback, readableMap, vuj));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0073, code lost:
        if (X.W3K.A07(r6) == false) goto L_0x0075;
     */
    @com.facebook.react.bridge.ReactMethod
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void createView(int r9, java.lang.String r10, int r11, com.facebook.react.bridge.ReadableMap r12) {
        /*
            r8 = this;
            X.W2L r4 = r8.mUIImplementation
            boolean r0 = r4.A09
            if (r0 == 0) goto L_0x0092
            java.lang.Object r3 = r4.A01
            monitor-enter(r3)
            X.W4T r0 = r4.A06     // Catch:{ all -> 0x008f }
            com.facebook.react.uimanager.ViewManager r0 = r0.A00(r10)     // Catch:{ all -> 0x008f }
            com.facebook.react.uimanager.ReactShadowNode r2 = r0.createShadowNodeInstance()     // Catch:{ all -> 0x008f }
            X.VgX r1 = r4.A04     // Catch:{ all -> 0x008f }
            com.facebook.react.uimanager.ReactShadowNode r6 = r1.A00(r11)     // Catch:{ all -> 0x008f }
            java.lang.String r5 = "Root node with tag "
            r0 = 433(0x1b1, float:6.07E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)     // Catch:{ all -> 0x008f }
            java.lang.String r0 = X.002.A0c(r5, r0, r11)     // Catch:{ all -> 0x008f }
            X.0Sd.A01(r6, r0)     // Catch:{ all -> 0x008f }
            r5 = r2
            com.facebook.react.uimanager.ReactShadowNodeImpl r5 = (com.facebook.react.uimanager.ReactShadowNodeImpl) r5     // Catch:{ all -> 0x008f }
            r5.A00 = r9     // Catch:{ all -> 0x008f }
            r5.A0E = r10     // Catch:{ all -> 0x008f }
            com.facebook.react.uimanager.ReactShadowNodeImpl r6 = (com.facebook.react.uimanager.ReactShadowNodeImpl) r6     // Catch:{ all -> 0x008f }
            int r0 = r6.A00     // Catch:{ all -> 0x008f }
            r5.A01 = r0     // Catch:{ all -> 0x008f }
            X.QZL r0 = r6.A0A     // Catch:{ all -> 0x008f }
            X.0Sd.A00(r0)     // Catch:{ all -> 0x008f }
            r2.EoS(r0)     // Catch:{ all -> 0x008f }
            X.VfY r0 = r1.A02     // Catch:{ all -> 0x008f }
            r0.A00()     // Catch:{ all -> 0x008f }
            android.util.SparseArray r1 = r1.A00     // Catch:{ all -> 0x008f }
            int r0 = r5.A00     // Catch:{ all -> 0x008f }
            r1.put(r0, r2)     // Catch:{ all -> 0x008f }
            r6 = 0
            if (r12 == 0) goto L_0x0054
            X.VfZ r6 = new X.VfZ     // Catch:{ all -> 0x008f }
            r6.<init>(r12)     // Catch:{ all -> 0x008f }
            r2.FLF(r6)     // Catch:{ all -> 0x008f }
        L_0x0054:
            boolean r0 = r2.Cem()     // Catch:{ all -> 0x008f }
            if (r0 != 0) goto L_0x008d
            X.W3K r7 = r4.A03     // Catch:{ all -> 0x008f }
            X.QZL r4 = r5.A0A     // Catch:{ all -> 0x008f }
            X.0Sd.A00(r4)     // Catch:{ all -> 0x008f }
            java.lang.String r1 = r5.A0E     // Catch:{ all -> 0x008f }
            X.0Sd.A00(r1)     // Catch:{ all -> 0x008f }
            java.lang.String r0 = "RCTView"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x008f }
            if (r0 == 0) goto L_0x0075
            boolean r1 = X.W3K.A07(r6)     // Catch:{ all -> 0x008f }
            r0 = 1
            if (r1 != 0) goto L_0x0076
        L_0x0075:
            r0 = 0
        L_0x0076:
            r2.EaK(r0)     // Catch:{ all -> 0x008f }
            java.lang.Integer r1 = r2.BVQ()     // Catch:{ all -> 0x008f }
            java.lang.Integer r0 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x008f }
            if (r1 == r0) goto L_0x008d
            X.Vuj r2 = r7.A02     // Catch:{ all -> 0x008f }
            int r1 = r5.A00     // Catch:{ all -> 0x008f }
            java.lang.String r0 = r5.A0E     // Catch:{ all -> 0x008f }
            X.0Sd.A00(r0)     // Catch:{ all -> 0x008f }
            r2.A01(r6, r4, r0, r1)     // Catch:{ all -> 0x008f }
        L_0x008d:
            monitor-exit(r3)     // Catch:{ all -> 0x008f }
            return
        L_0x008f:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x008f }
            throw r0
        L_0x0092:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.UIManagerModule.createView(int, java.lang.String, int, com.facebook.react.bridge.ReadableMap):void");
    }

    @Deprecated
    public void dispatchCommand(int i, int i2, ReadableArray readableArray) {
        W2L w2l = this.mUIImplementation;
        String A0O = 002.A0O("dispatchViewManagerCommand: ", i2);
        if (w2l.A04.A00(i) != null) {
            C18592Vuj vuj = w2l.A05;
            vuj.A0G.add(new C15152USi(readableArray, vuj, i, i2));
            return;
        }
        0I1.A04("ReactNative", 002.A09(i, "Unable to execute operation ", A0O, " on view with tag: ", ", since the view does not exist"));
    }

    @ReactMethod
    public void findSubviewIn(int i, ReadableArray readableArray, Callback callback) {
        W2L w2l = this.mUIImplementation;
        float round = (float) Math.round(W2U.A01((float) readableArray.getDouble(0)));
        float round2 = (float) Math.round(W2U.A01((float) readableArray.getDouble(1)));
        C18592Vuj vuj = w2l.A05;
        vuj.A0F.add(new WIy(callback, vuj, round, round2, i));
    }

    public Map getConstants() {
        return this.mModuleConstants;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public C13948Tm8 getConstantsForViewManager(String str) {
        ViewManager viewManager;
        W4T w4t = this.mUIImplementation.A06;
        synchronized (w4t) {
            viewManager = (ViewManager) w4t.A00.get(str);
            if (viewManager == null) {
                viewManager = null;
            }
        }
        if (viewManager == null) {
            return null;
        }
        return getConstantsForViewManager(viewManager, this.mCustomDirectEvents);
    }

    @Deprecated
    public C17177VLh getDirectEventNamesResolver() {
        return new C17177VLh(this);
    }

    public C20877X2e getEventDispatcher() {
        return this.mEventDispatcher;
    }

    public Map getPerformanceCounters() {
        C18592Vuj vuj = this.mUIImplementation.A05;
        HashMap hashMap = new HashMap();
        hashMap.put("CommitStartTime", Long.valueOf(vuj.A04));
        hashMap.put("CommitEndTime", Long.valueOf(vuj.A03));
        hashMap.put("LayoutTime", Long.valueOf(vuj.A06));
        hashMap.put("DispatchViewUpdatesTime", Long.valueOf(vuj.A05));
        hashMap.put("RunStartTime", Long.valueOf(vuj.A09));
        hashMap.put("RunEndTime", Long.valueOf(vuj.A08));
        hashMap.put("BatchedExecutionTime", Long.valueOf(vuj.A02));
        hashMap.put("NonBatchedExecutionTime", Long.valueOf(vuj.A07));
        hashMap.put("NativeModulesThreadCpuTime", Long.valueOf(vuj.A0A));
        hashMap.put("CreateViewCount", Long.valueOf(vuj.A00));
        hashMap.put("UpdatePropsCount", Long.valueOf(vuj.A0B));
        return hashMap;
    }

    @Deprecated
    public W2L getUIImplementation() {
        return this.mUIImplementation;
    }

    @Deprecated
    public W4T getViewManagerRegistry_DO_NOT_USE() {
        return this.mViewManagerRegistry;
    }

    public void invalidate() {
        ArrayList A0e;
        C18773W0w.A01(new C19945WiI((WJb) this.mEventDispatcher));
        W2L w2l = this.mUIImplementation;
        w2l.A09 = false;
        W4T w4t = w2l.A06;
        synchronized (w4t) {
            A0e = Dba.A0e(w4t.A00);
        }
        C19944WiH wiH = new C19944WiH(A0e);
        if (C18773W0w.A02()) {
            wiH.run();
        } else {
            C18773W0w.A01(wiH);
        }
        QZK reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.unregisterComponentCallbacks(this.mMemoryTrimCallback);
        reactApplicationContext.unregisterComponentCallbacks(this.mViewManagerRegistry);
        ((C18936WDp) C18291VpF.A00.getValue()).A00();
        C18805W2w.A00.clear();
        C18805W2w.A01.clear();
        C18715Vyl.A01.clear();
        C18715Vyl.A00.clear();
    }

    public void invalidateNodeLayout(int i) {
        ReactShadowNode A00 = this.mUIImplementation.A04.A00(i);
        if (A00 == null) {
            C13990Tnq.A1R("Warning : attempted to dirty a non-existent react shadow node. reactTag=", i);
            return;
        }
        A00.APB();
        this.mUIImplementation.A04(-1);
    }

    @ReactMethod
    public void manageChildren(int i, ReadableArray readableArray, ReadableArray readableArray2, ReadableArray readableArray3, ReadableArray readableArray4, ReadableArray readableArray5) {
        int i2;
        int size;
        int size2;
        QZA qza;
        boolean z;
        W2L w2l = this.mUIImplementation;
        if (w2l.A09) {
            synchronized (w2l.A01) {
                C17818VgX vgX = w2l.A04;
                int i3 = i;
                ReactShadowNode A00 = vgX.A00(i3);
                ReadableArray readableArray6 = readableArray;
                if (readableArray == null) {
                    i2 = 0;
                } else {
                    i2 = readableArray6.size();
                }
                ReadableArray readableArray7 = readableArray3;
                if (readableArray3 == null) {
                    size = 0;
                } else {
                    size = readableArray7.size();
                }
                ReadableArray readableArray8 = readableArray5;
                if (readableArray5 == null) {
                    size2 = 0;
                } else {
                    size2 = readableArray8.size();
                }
                ReadableArray readableArray9 = readableArray2;
                if (i2 == 0 || (readableArray2 != null && i2 == readableArray9.size())) {
                    ReadableArray readableArray10 = readableArray4;
                    if (size == 0 || (readableArray4 != null && size == readableArray10.size())) {
                        int i4 = i2 + size;
                        C18600Vut[] vutArr = new C18600Vut[i4];
                        int i5 = i2 + size2;
                        int[] iArr = new int[i5];
                        int[] iArr2 = new int[i5];
                        int[] iArr3 = new int[size2];
                        if (i2 > 0) {
                            0Sd.A00(readableArray6);
                            0Sd.A00(readableArray9);
                            int i6 = 0;
                            while (true) {
                                int i7 = readableArray6.getInt(i6);
                                int i8 = ((ReactShadowNodeImpl) A00).A06(i7).A00;
                                vutArr[i6] = new C18600Vut(i8, readableArray9.getInt(i6));
                                iArr[i6] = i7;
                                iArr2[i6] = i8;
                                i6++;
                                if (i6 >= i2) {
                                    break;
                                }
                            }
                        }
                        if (size > 0) {
                            0Sd.A00(readableArray7);
                            0Sd.A00(readableArray10);
                            int i9 = 0;
                            while (true) {
                                vutArr[i2 + i9] = new C18600Vut(readableArray7.getInt(i9), readableArray10.getInt(i9));
                                i9++;
                                if (i9 >= size) {
                                    break;
                                }
                            }
                        }
                        if (size2 > 0) {
                            0Sd.A00(readableArray8);
                            int i10 = 0;
                            while (true) {
                                int i11 = readableArray8.getInt(i10);
                                int i12 = ((ReactShadowNodeImpl) A00).A06(i11).A00;
                                int i13 = i2 + i10;
                                iArr[i13] = i11;
                                iArr2[i13] = i12;
                                iArr3[i10] = i12;
                                i10++;
                                if (i10 >= size2) {
                                    break;
                                }
                            }
                        }
                        Arrays.sort(vutArr, C18600Vut.A02);
                        Arrays.sort(iArr);
                        int i14 = i5 - 1;
                        int i15 = -1;
                        while (true) {
                            if (i14 >= 0) {
                                int i16 = iArr[i14];
                                if (i16 == i15) {
                                    qza = new QZA(002.A0O("Repeated indices in Removal list for view tag: ", i3));
                                    break;
                                }
                                A00.EDR(i16);
                                i15 = iArr[i14];
                                i14--;
                            } else {
                                int i17 = 0;
                                while (i17 < i4) {
                                    C18600Vut vut = vutArr[i17];
                                    ReactShadowNode A002 = vgX.A00(vut.A01);
                                    if (A002 != null) {
                                        A00.A83(A002, vut.A00);
                                        i17++;
                                    } else {
                                        qza = new QZA(002.A0O("Trying to add unknown view tag: ", vut.A01));
                                    }
                                }
                                W3K w3k = w2l.A03;
                                for (int i18 = 0; i18 < i5; i18++) {
                                    int i19 = iArr2[i18];
                                    int i20 = 0;
                                    while (true) {
                                        if (i20 >= size2) {
                                            z = false;
                                            break;
                                        } else if (iArr3[i20] == i19) {
                                            z = true;
                                            break;
                                        } else {
                                            i20++;
                                        }
                                    }
                                    W3K.A03(w3k, w3k.A01.A00(i19), z);
                                }
                                for (int i21 = 0; i21 < i4; i21++) {
                                    C18600Vut vut2 = vutArr[i21];
                                    W3K.A01(w3k, A00, w3k.A01.A00(vut2.A01), vut2.A00);
                                }
                                for (int i22 = 0; i22 < size2; i22++) {
                                    ReactShadowNode A003 = vgX.A00(iArr3[i22]);
                                    W2L.A02(A003, w2l);
                                    A003.dispose();
                                }
                            }
                        }
                    } else {
                        qza = new QZA("Size of addChildTags != size of addAtIndices!");
                    }
                } else {
                    qza = new QZA("Size of moveFrom != size of moveTo!");
                }
                throw qza;
            }
        }
    }

    @ReactMethod
    public void measure(int i, Callback callback) {
        W2L w2l = this.mUIImplementation;
        if (w2l.A09) {
            C18592Vuj vuj = w2l.A05;
            vuj.A0F.add(new C19067WIx(callback, vuj, i));
        }
    }

    @ReactMethod
    public void measureInWindow(int i, Callback callback) {
        W2L w2l = this.mUIImplementation;
        if (w2l.A09) {
            C18592Vuj vuj = w2l.A05;
            vuj.A0F.add(new C19066WIw(callback, vuj, i));
        }
    }

    @ReactMethod
    public void measureLayout(int i, int i2, Callback callback, Callback callback2) {
        QZA qza;
        int i3;
        int i4;
        W2L w2l = this.mUIImplementation;
        if (w2l.A09) {
            try {
                int[] iArr = w2l.A08;
                C17818VgX vgX = w2l.A04;
                ReactShadowNode A00 = vgX.A00(i);
                ReactShadowNode A002 = vgX.A00(i2);
                if (A00 != null) {
                    if (A002 == null) {
                        i = i2;
                    } else {
                        if (A00 != A002) {
                            ReactShadowNode reactShadowNode = A00;
                            do {
                                reactShadowNode = ((ReactShadowNodeImpl) reactShadowNode).A09;
                                if (reactShadowNode != A002) {
                                }
                            } while (reactShadowNode != null);
                            qza = new QZA(002.A02(i2, i, "Tag ", " is not an ancestor of tag "));
                            throw qza;
                        }
                        if (A00 == A002 || A00.Cem()) {
                            i3 = 0;
                            i4 = 0;
                        } else {
                            i3 = Math.round(A00.BM0());
                            i4 = Math.round(A00.BM1());
                            ReactShadowNodeImpl reactShadowNodeImpl = A00;
                            while (true) {
                                ReactShadowNodeImpl reactShadowNodeImpl2 = ((ReactShadowNodeImpl) reactShadowNodeImpl).A09;
                                if (reactShadowNodeImpl2 == A002) {
                                    break;
                                }
                                0Sd.A00(reactShadowNodeImpl2);
                                W2L.A01(reactShadowNodeImpl2, w2l);
                                i3 += Math.round(reactShadowNodeImpl2.BM0());
                                i4 += Math.round(reactShadowNodeImpl2.BM1());
                                reactShadowNodeImpl = reactShadowNodeImpl2;
                            }
                            W2L.A01(A002, w2l);
                        }
                        iArr[0] = i3;
                        iArr[1] = i4;
                        ReactShadowNodeImpl reactShadowNodeImpl3 = (ReactShadowNodeImpl) A00;
                        iArr[2] = reactShadowNodeImpl3.A03;
                        int i5 = reactShadowNodeImpl3.A02;
                        iArr[3] = i5;
                        callback2.invoke(Float.valueOf(W2U.A00((float) iArr[0])), Float.valueOf(W2U.A00((float) iArr[1])), Float.valueOf(W2U.A00((float) iArr[2])), Float.valueOf(W2U.A00((float) i5)));
                        return;
                    }
                }
                qza = new QZA(002.A0c("Tag ", AnonymousClass000.A00(1983), i));
                throw qza;
            } catch (QZA e) {
                callback.invoke(e.getMessage());
            }
        }
    }

    public void onBatchComplete() {
        int size;
        int i = this.mBatchId;
        this.mBatchId = i + 1;
        0et A00 = SystraceMessage.A00(SystraceMessage.A00, "onBatchCompleteUI", 8192);
        A00.A01("BatchId", i);
        A00.A02();
        Iterator it = this.mListeners.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException("willDispatchViewUpdates");
        }
        Iterator it2 = this.mUIManagerListeners.iterator();
        while (it2.hasNext()) {
            ((X2X) it2.next()).willDispatchViewUpdates(this);
        }
        try {
            W0R w0r = this.mUIImplementation.A05.A0L;
            synchronized (w0r) {
                size = w0r.A04.size();
            }
            if (size > 0) {
                this.mUIImplementation.A04(i);
            }
            0fc.A00(8192, -1232018120);
        } catch (Throwable th) {
            0fc.A00(8192, -1916767129);
            throw th;
        }
    }

    public void onHostDestroy() {
    }

    public void onHostPause() {
        C18592Vuj vuj = this.mUIImplementation.A05;
        vuj.A0H = false;
        S9B.A00().A03(vuj.A0M, RFI.DISPATCH_UI);
        C18592Vuj.A00(vuj);
    }

    public void onHostResume() {
        C18592Vuj vuj = this.mUIImplementation.A05;
        vuj.A0H = true;
        if (!C18401Vr3.A00.enableFabricRendererExclusively()) {
            S9B.A00().A02(vuj.A0M, RFI.DISPATCH_UI);
        }
    }

    public void prependUIBlock(C20875X2b x2b) {
        C18592Vuj vuj = this.mUIImplementation.A05;
        vuj.A0F.add(0, new C19064WIu(x2b, vuj));
    }

    public void profileNextBatch() {
        C18592Vuj vuj = this.mUIImplementation.A05;
        vuj.A0J = true;
        vuj.A04 = 0;
        vuj.A00 = 0;
        vuj.A0B = 0;
    }

    @ReactMethod
    public void removeRootView(int i) {
        W2L w2l = this.mUIImplementation;
        synchronized (w2l.A01) {
            C17818VgX vgX = w2l.A04;
            vgX.A02.A00();
            if (i != -1) {
                SparseBooleanArray sparseBooleanArray = vgX.A01;
                if (sparseBooleanArray.get(i)) {
                    vgX.A00.remove(i);
                    sparseBooleanArray.delete(i);
                } else {
                    throw new QZA(002.A0c("View with tag ", " is not registered as a root view", i));
                }
            }
        }
        C18592Vuj vuj = w2l.A05;
        vuj.A0F.add(new USa(vuj, i));
    }

    public void removeUIManagerEventListener(X2X x2x) {
        this.mUIManagerListeners.remove(x2x);
    }

    @Deprecated
    public void removeUIManagerListener(C20832X0h x0h) {
        this.mListeners.remove(x0h);
    }

    @Deprecated
    public String resolveCustomDirectEventName(String str) {
        Map map;
        if (str == null || (map = (Map) this.mCustomDirectEvents.get(str)) == null) {
            return str;
        }
        return DbT.A11("registrationName", map);
    }

    @Deprecated
    public int resolveRootTagFromReactTag(int i) {
        if (i % 10 != 1) {
            C17818VgX vgX = this.mUIImplementation.A04;
            vgX.A02.A00();
            if (!vgX.A01.get(i)) {
                ReactShadowNode A00 = vgX.A00(i);
                if (A00 != null) {
                    ReactShadowNodeImpl reactShadowNodeImpl = (ReactShadowNodeImpl) A00;
                    0Sd.A02(AnonymousClass7TF.A1P(reactShadowNodeImpl.A01));
                    return reactShadowNodeImpl.A01;
                }
                C13990Tnq.A1R("Warning : attempted to resolve a non-existent react shadow node. reactTag=", i);
                return 0;
            }
        }
        return i;
    }

    public View resolveView(int i) {
        return this.mUIImplementation.A05.A0L.A02(i);
    }

    @ReactMethod
    public void setChildren(int i, ReadableArray readableArray) {
        W2L w2l = this.mUIImplementation;
        if (w2l.A09) {
            synchronized (w2l.A01) {
                C17818VgX vgX = w2l.A04;
                ReactShadowNode A00 = vgX.A00(i);
                int i2 = 0;
                while (i2 < readableArray.size()) {
                    ReactShadowNode A002 = vgX.A00(readableArray.getInt(i2));
                    if (A002 != null) {
                        A00.A83(A002, i2);
                        i2++;
                    } else {
                        throw new QZA(002.A0O("Trying to add unknown view tag: ", readableArray.getInt(i2)));
                    }
                }
                W3K w3k = w2l.A03;
                for (int i3 = 0; i3 < readableArray.size(); i3++) {
                    W3K.A01(w3k, A00, w3k.A01.A00(readableArray.getInt(i3)), i3);
                }
            }
        }
    }

    @ReactMethod
    public void setJSResponder(int i, boolean z) {
        W2L w2l = this.mUIImplementation;
        int i2 = i;
        ReactShadowNode A00 = w2l.A04.A00(i);
        if (A00 != null) {
            while (A00.BVQ() == AnonymousClass05K.A0C) {
                A00 = ((ReactShadowNodeImpl) A00).A09;
            }
            C18592Vuj vuj = w2l.A05;
            vuj.A0F.add(new C15148USe(vuj, ((ReactShadowNodeImpl) A00).A00, i2, false, z));
        }
    }

    @ReactMethod
    public void setLayoutAnimationEnabledExperimental(boolean z) {
        C18592Vuj vuj = this.mUIImplementation.A05;
        vuj.A0F.add(new C19063WIt(vuj, z));
    }

    public void setViewHierarchyUpdateDebugListener(C20834X0j x0j) {
        this.mUIImplementation.A05.A0C = x0j;
    }

    public int startSurface(View view, String str, C13948Tm8 tm8, int i, int i2) {
        throw new UnsupportedOperationException();
    }

    public void stopSurface(int i) {
        throw new UnsupportedOperationException();
    }

    public void synchronouslyUpdateViewOnUIThread(int i, ReadableMap readableMap) {
        W2L w2l = this.mUIImplementation;
        w2l.A05.A0L.A08(new C17763VfZ(readableMap), i);
    }

    @ReactMethod
    public void updateView(int i, String str, ReadableMap readableMap) {
        W2L w2l = this.mUIImplementation;
        if (w2l.A09) {
            w2l.A06.A00(str);
            ReactShadowNode A00 = w2l.A04.A00(i);
            if (A00 == null) {
                throw new QZA(002.A0O("Trying to update non-existent view with tag ", i));
            } else if (readableMap != null) {
                C17763VfZ vfZ = new C17763VfZ(readableMap);
                A00.FLF(vfZ);
                if (!A00.Cem()) {
                    W3K w3k = w2l.A03;
                    ReactShadowNodeImpl reactShadowNodeImpl = (ReactShadowNodeImpl) A00;
                    if (reactShadowNodeImpl.A0H && !W3K.A07(vfZ)) {
                        W3K.A02(w3k, A00, vfZ);
                    } else if (!reactShadowNodeImpl.A0H) {
                        C18592Vuj vuj = w3k.A02;
                        int i2 = reactShadowNodeImpl.A00;
                        vuj.A0B++;
                        vuj.A0F.add(new USc(vfZ, vuj, i2));
                    }
                }
            }
        }
    }

    @Deprecated
    @ReactMethod
    public void viewIsDescendantOf(int i, int i2, Callback callback) {
        Object[] objArr;
        boolean z;
        boolean z2;
        C17818VgX vgX = this.mUIImplementation.A04;
        ReactShadowNode A00 = vgX.A00(i);
        ReactShadowNode A002 = vgX.A00(i2);
        if (A00 == null || A002 == null) {
            objArr = new Object[1];
            z = false;
        } else {
            objArr = new Object[1];
            ReactShadowNodeImpl reactShadowNodeImpl = ((ReactShadowNodeImpl) A00).A09;
            while (true) {
                if (reactShadowNodeImpl == null) {
                    z2 = false;
                    break;
                } else if (reactShadowNodeImpl == A002) {
                    z2 = true;
                    break;
                } else {
                    reactShadowNodeImpl = reactShadowNodeImpl.A09;
                }
            }
            z = Boolean.valueOf(z2);
        }
        objArr[0] = z;
        callback.invoke(objArr);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.W4S] */
    public UIManagerModule(QZK qzk, List list, int i) {
        super(qzk);
        C11414SSm.A04(qzk);
        WJb wJb = new WJb(qzk);
        this.mEventDispatcher = wJb;
        HashMap hashMap = new HashMap();
        this.mCustomDirectEvents = hashMap;
        this.mModuleConstants = createConstants(list, (Map) null, hashMap);
        W4T w4t = new W4T(list);
        this.mViewManagerRegistry = w4t;
        this.mUIImplementation = new W2L(qzk, w4t, wJb, i);
        qzk.A09(this);
    }

    @ReactMethod
    public void dispatchViewManagerCommand(int i, Dynamic dynamic, ReadableArray readableArray) {
        QZK reactApplicationContext = getReactApplicationContext();
        int i2 = 2;
        if (i % 2 != 0) {
            i2 = 1;
        }
        X9N A03 = UIManagerHelper.A03(reactApplicationContext, i2, true);
        if (A03 == null) {
            return;
        }
        if (dynamic.getType() == ReadableType.Number) {
            A03.dispatchCommand(i, dynamic.asInt(), readableArray);
        } else if (dynamic.getType() == ReadableType.String) {
            A03.dispatchCommand(i, dynamic.asString(), readableArray);
        }
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public C13948Tm8 getDefaultEventTypes() {
        return Arguments.makeNativeMap((Map) C13991Tnr.A0p("bubblingEventTypes", W0Y.A00(), "directEventTypes", W0Y.A02()));
    }

    public void initialize() {
        getReactApplicationContext().registerComponentCallbacks(this.mMemoryTrimCallback);
        getReactApplicationContext().registerComponentCallbacks(this.mViewManagerRegistry);
        ((WJb) this.mEventDispatcher).A0E.mDefaultEventEmitter = (RCTEventEmitter) getReactApplicationContext().A02(RCTEventEmitter.class);
    }

    public void setViewLocalData(int i, Object obj) {
        QZK reactApplicationContext = getReactApplicationContext();
        MessageQueueThread messageQueueThread = reactApplicationContext.A05;
        0Sd.A00(messageQueueThread);
        messageQueueThread.assertIsOnThread();
        reactApplicationContext.A0D(new US3(reactApplicationContext, this, obj, i));
    }

    public void updateInsetsPadding(int i, int i2, int i3, int i4, int i5) {
        getReactApplicationContext().A06();
        W2L w2l = this.mUIImplementation;
        ReactShadowNode A00 = w2l.A04.A00(i);
        if (A00 == null) {
            C13990Tnq.A1R("Tried to update size of non-existent tag: ", i);
            return;
        }
        A00.EfF(4, (float) i3);
        A00.EfF(1, (float) i2);
        A00.EfF(5, (float) i5);
        A00.EfF(3, (float) i4);
        W2L.A03(w2l);
    }

    public void updateNodeSize(int i, int i2, int i3) {
        getReactApplicationContext().A06();
        W2L w2l = this.mUIImplementation;
        ReactShadowNode A00 = w2l.A04.A00(i);
        if (A00 == null) {
            C13990Tnq.A1R("Tried to update size of non-existent tag: ", i);
            return;
        }
        YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) ((ReactShadowNodeImpl) A00).A0B;
        YogaNative.jni_YGNodeStyleSetWidthJNI(yogaNodeJNIBase.mNativePointer, (float) i2);
        YogaNative.jni_YGNodeStyleSetHeightJNI(yogaNodeJNIBase.mNativePointer, (float) i3);
        W2L.A03(w2l);
    }

    public void updateRootLayoutSpecs(int i, int i2, int i3, int i4, int i5) {
        QZK reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.A0D(new US4(reactApplicationContext, this, i, i2, i3));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.W4S] */
    public UIManagerModule(QZK qzk, C20833X0i x0i, int i) {
        super(qzk);
        C11414SSm.A04(qzk);
        this.mEventDispatcher = new WJb(qzk);
        createConstants(x0i);
        throw AnonymousClass00P.createAndThrow();
    }

    public static Map createConstants(C20833X0i x0i) {
        ReactMarker.logMarker(RH1.A0R);
        0et A00 = SystraceMessage.A00(SystraceMessage.A00, "CreateUIManagerConstants", 8192);
        A00.A00(AnonymousClass7TE.A0v(), "Lazy");
        A00.A02();
        try {
            W0Y.A01();
            throw new NullPointerException("getViewManagerNames");
        } catch (Throwable th) {
            0fc.A00(8192, -1768836471);
            ReactMarker.logMarker(RH1.A0Q);
            throw th;
        }
    }

    public static C13948Tm8 getConstantsForViewManager(ViewManager viewManager, Map map) {
        String str;
        0et A00 = SystraceMessage.A00(SystraceMessage.A00, "UIManagerModule.getConstantsForViewManager", 8192);
        A00.A00(viewManager.getName(), ViewManager.NAME);
        A00.A00(AnonymousClass7TE.A0v(), "Lazy");
        A00.A02();
        try {
            return Arguments.makeNativeMap((Map) W0Z.A00(viewManager, (Map) null, map));
        } finally {
            str = "";
            SystraceMessage.A00(SystraceMessage.A01, str, 8192).A02();
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public int addRootView(android.view.View r12, X.C13948Tm8 r13) {
        /*
            r11 = this;
            r1 = 8192(0x2000, double:4.0474E-320)
            java.lang.String r3 = "UIManagerModule.addRootView"
            r0 = 1178866234(0x4644123a, float:12548.557)
            X.0fc.A01(r1, r3, r0)
            java.lang.Class<X.Rk0> r3 = X.C9947Rk0.class
            monitor-enter(r3)
            int r7 = X.C9947Rk0.A00     // Catch:{ all -> 0x009c }
            int r0 = r7 + 10
            X.C9947Rk0.A00 = r0     // Catch:{ all -> 0x009c }
            monitor-exit(r3)
            X.QZK r5 = r11.getReactApplicationContext()
            android.content.Context r4 = r12.getContext()
            r0 = r12
            X.Tgp r0 = (X.C13774Tgp) r0
            r0.getSurfaceID()
            r3 = -1
            X.QZL r10 = new X.QZL
            r10.<init>(r4, r5)
            X.W2L r9 = r11.mUIImplementation
            java.lang.Object r4 = r9.A01
            monitor-enter(r4)
            com.facebook.react.uimanager.ReactShadowNodeImpl r8 = new com.facebook.react.uimanager.ReactShadowNodeImpl     // Catch:{ all -> 0x0099 }
            r8.<init>()     // Catch:{ all -> 0x0099 }
            com.facebook.react.modules.i18nmanager.I18nUtil r5 = com.facebook.react.modules.i18nmanager.I18nUtil.A00     // Catch:{ all -> 0x0099 }
            X.QZK r0 = r9.A02     // Catch:{ all -> 0x0099 }
            boolean r0 = r5.A01(r0)     // Catch:{ all -> 0x0099 }
            if (r0 == 0) goto L_0x0046
            X.3c8 r0 = r8.A0B     // Catch:{ all -> 0x0099 }
            com.facebook.yoga.YogaNodeJNIBase r0 = (com.facebook.yoga.YogaNodeJNIBase) r0     // Catch:{ all -> 0x0099 }
            long r5 = r0.mNativePointer     // Catch:{ all -> 0x0099 }
            r0 = 2
            com.facebook.yoga.YogaNative.jni_YGNodeStyleSetDirectionJNI(r5, r0)     // Catch:{ all -> 0x0099 }
        L_0x0046:
            java.lang.String r0 = "Root"
            r8.A0E = r0     // Catch:{ all -> 0x0099 }
            r8.A00 = r7     // Catch:{ all -> 0x0099 }
            r8.EoS(r10)     // Catch:{ all -> 0x0099 }
            X.Wm2 r0 = new X.Wm2     // Catch:{ all -> 0x0099 }
            r0.<init>(r8, r9)     // Catch:{ all -> 0x0099 }
            r10.A0D(r0)     // Catch:{ all -> 0x0099 }
            X.Vuj r0 = r9.A05     // Catch:{ all -> 0x0099 }
            X.W0R r5 = r0.A0L     // Catch:{ all -> 0x0099 }
            monitor-enter(r5)     // Catch:{ all -> 0x0099 }
            monitor-enter(r5)     // Catch:{ all -> 0x0096 }
            int r0 = r12.getId()     // Catch:{ all -> 0x0093 }
            if (r0 == r3) goto L_0x0074
            java.lang.String r8 = "NativeViewHierarchyManager"
            java.lang.String r6 = "Trying to add a root view with an explicit id ("
            int r3 = r12.getId()     // Catch:{ all -> 0x0093 }
            java.lang.String r0 = ") already set. React Native uses the id field to track react tags and will overwrite this field. If that is fine, explicitly overwrite the id field to View.NO_ID before calling addRootView."
            java.lang.String r0 = X.002.A0c(r6, r0, r3)     // Catch:{ all -> 0x0093 }
            X.0I1.A03(r8, r0)     // Catch:{ all -> 0x0093 }
        L_0x0074:
            android.util.SparseArray r0 = r5.A03     // Catch:{ all -> 0x0093 }
            r0.put(r7, r12)     // Catch:{ all -> 0x0093 }
            android.util.SparseArray r3 = r5.A02     // Catch:{ all -> 0x0093 }
            com.facebook.react.uimanager.RootViewManager r0 = r5.A06     // Catch:{ all -> 0x0093 }
            r3.put(r7, r0)     // Catch:{ all -> 0x0093 }
            android.util.SparseBooleanArray r3 = r5.A04     // Catch:{ all -> 0x0093 }
            r0 = 1
            r3.put(r7, r0)     // Catch:{ all -> 0x0093 }
            r12.setId(r7)     // Catch:{ all -> 0x0093 }
            monitor-exit(r5)     // Catch:{ all -> 0x0096 }
            monitor-exit(r5)     // Catch:{ all -> 0x0099 }
            monitor-exit(r4)     // Catch:{ all -> 0x0099 }
            r0 = -1278904987(0xffffffffb3c57565, float:-9.194881E-8)
            X.0fc.A00(r1, r0)
            return r7
        L_0x0093:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0096 }
            throw r0     // Catch:{ all -> 0x0096 }
        L_0x0096:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0099 }
            throw r0     // Catch:{ all -> 0x0099 }
        L_0x0099:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0099 }
            throw r0
        L_0x009c:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.UIManagerModule.addRootView(android.view.View, X.Tm8):int");
    }

    public void dispatchCommand(int i, String str, ReadableArray readableArray) {
        W2L w2l = this.mUIImplementation;
        String A0R = 002.A0R("dispatchViewManagerCommand: ", str);
        if (w2l.A04.A00(i) != null) {
            C18592Vuj vuj = w2l.A05;
            vuj.A0G.add(new C15153USj(readableArray, vuj, str, i));
            return;
        }
        0I1.A04("ReactNative", 002.A09(i, "Unable to execute operation ", A0R, " on view with tag: ", ", since the view does not exist"));
    }

    public void receiveEvent(int i, int i2, String str, C13948Tm8 tm8) {
        ((RCTEventEmitter) getReactApplicationContext().A02(RCTEventEmitter.class)).receiveEvent(i2, str, tm8);
    }
}
