package com.facebook.common.downloadondemand.js.interfaces;

import X.002;
import X.0Sd;
import X.0qQ;
import X.10M;
import X.17k;
import X.1Ks;
import X.1Lf;
import X.AnonymousClass05K;
import X.C10193Ro9;
import X.C10381RrI;
import X.C10382RrJ;
import X.C10929S1h;
import X.C10999S4t;
import X.C11171SDo;
import X.C11210SFk;
import X.C13418TZz;
import X.C13707TfR;
import X.C255183ti;
import X.JTO;
import X.Pxe;
import X.QZJ;
import X.QZK;
import X.S4S;
import X.Sm4;
import X.Sm5;
import X.Sm6;
import X.T0I;
import X.T0O;
import X.TKV;
import com.facebook.fbreact.specs.NativeSegmentFetcherSpec;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.dialog.DialogModule;
import java.io.File;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;

@ReactModule(name = "SegmentFetcher")
public class JsSegmentFetcherModule extends NativeSegmentFetcherSpec {
    public static final String NAME = "SegmentFetcher";
    public final C13418TZz mJsSegmentFetcher;

    public void fetchSegment(double d, ReadableMap readableMap, Callback callback) {
        fetchSegmentInternal(d, readableMap, new Sm6(this, callback, (int) d));
    }

    public String getName() {
        return "SegmentFetcher";
    }

    public void getSegment(double d, ReadableMap readableMap, Callback callback) {
        fetchSegmentInternal(d, readableMap, new Sm5(callback));
    }

    public JsSegmentFetcherModule(QZK qzk, C13418TZz tZz) {
        super(qzk);
        this.mJsSegmentFetcher = tZz;
    }

    public static ReadableMap createJsErrorObject(Throwable th) {
        WritableNativeMap A0U = Pxe.A0U();
        A0U.putString(DialogModule.KEY_MESSAGE, th.toString());
        return A0U;
    }

    private void fetchSegmentInternal(double d, ReadableMap readableMap, C13707TfR tfR) {
        MarkerEditor markerEditor;
        1Ks r2;
        ReadableMap readableMap2 = readableMap;
        String string = readableMap2.getString("requestedModuleName");
        String string2 = readableMap2.getString("segmentHash");
        C13418TZz tZz = this.mJsSegmentFetcher;
        S4S s4s = new S4S(string, string2, (int) d);
        Sm4 sm4 = (Sm4) tZz;
        C13707TfR tfR2 = tfR;
        0qQ.A0B(tfR2, 1);
        C10382RrJ rrJ = new C10382RrJ(s4s, sm4.A01);
        C11210SFk sFk = sm4.A00;
        String A0O = 002.A0O("hbc-seg-", s4s.A00);
        int A00 = sFk.A06.A00();
        String str = null;
        17k.A07(A0O, "resourceFlavor == null");
        C11171SDo sDo = C11171SDo.A01;
        String str2 = s4s.A02;
        if (str2 != null) {
            str = str2;
        }
        S4S s4s2 = rrJ.A01;
        C10929S1h s1h = rrJ.A00;
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = s1h.A02;
        if (lightweightQuickPerformanceLogger != null) {
            int i = s1h.A00;
            lightweightQuickPerformanceLogger.markerStart(18087937, i);
            markerEditor = lightweightQuickPerformanceLogger.withMarker(18087937, i);
        } else {
            markerEditor = 10M.A00;
        }
        markerEditor.annotate("bundle_name", "main.jsbundle");
        markerEditor.annotate("segment_id", s4s2.A00);
        markerEditor.annotate("event_tag", "critical_path");
        markerEditor.annotate("is_metadataless", true);
        String str3 = s4s2.A01;
        if (str3 != null) {
            markerEditor.annotate("requested_module_name", str3);
        }
        markerEditor.markerEditingCompleted();
        C10999S4t s4t = new C10999S4t(sDo, str, A0O, A00);
        ExecutorService executorService = sm4.A02;
        File A0s = JTO.A0s(JTO.A0s(sFk.A02.A02, String.valueOf(s4t.A00)), 002.A0g(s4t.A03, "__DELIM__", "main.jsbundle"));
        if (A0s.exists()) {
            r2 = new 1Ks(new C10381RrI(A0s, AnonymousClass05K.A00));
        } else {
            C10193Ro9 ro9 = sFk.A01;
            TKV tkv = new TKV(sFk, s4t, executorService);
            ConcurrentMap concurrentMap = ro9.A00;
            C10999S4t s4t2 = tkv.A02;
            TKV tkv2 = (TKV) concurrentMap.get(s4t2);
            if (tkv2 == null && (tkv2 = (TKV) concurrentMap.putIfAbsent(s4t2, tkv)) == null) {
                C255183ti.A04(new T0O(2, tkv, ro9), tkv.A03, 1Lf.A01);
                tkv.A04.execute(tkv);
            } else {
                tkv = tkv2;
            }
            r2 = tkv.A03;
        }
        C255183ti.A04(new T0I(rrJ, tfR2), r2, 1Lf.A01);
    }

    public static String getModuleName(ReadableMap readableMap) {
        return readableMap.getString("requestedModuleName");
    }

    public static String getSegmentHash(ReadableMap readableMap) {
        return readableMap.getString("segmentHash");
    }

    /* access modifiers changed from: private */
    public void registerSegmentInReactContext(int i, String str, Callback callback) {
        QZK reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            CatalystInstance catalystInstance = ((QZJ) reactApplicationContextIfActiveOrWarn).A00;
            0Sd.A00(catalystInstance);
            catalystInstance.registerSegment(i, str);
            0Sd.A00(callback);
            callback.invoke(Pxe.A1b());
        }
    }
}
