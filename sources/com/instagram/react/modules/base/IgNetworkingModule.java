package com.instagram.react.modules.base;

import X.002;
import X.0KC;
import X.0cp;
import X.0lg;
import X.0qQ;
import X.1ES;
import X.1Fc;
import X.1Fn;
import X.1GK;
import X.1HV;
import X.1NU;
import X.1OC;
import X.1Pq;
import X.1QS;
import X.1QY;
import X.AnonymousClass05K;
import X.AnonymousClass1O8;
import X.AnonymousClass1Px;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass9D0;
import X.B5C;
import X.C13152TNk;
import X.C13773Tgo;
import X.C13948Tm8;
import X.C239203Fj;
import X.DbS;
import X.DbW;
import X.Pxe;
import X.Pxf;
import X.QZK;
import X.T6C;
import X.T6E;
import X.T6Z;
import X.T7Z;
import android.content.ContentResolver;
import android.net.Uri;
import android.util.Base64;
import android.util.SparseArray;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.fbreact.specs.NativeNetworkingAndroidSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.google.common.io.Closeables;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

@ReactModule(name = "Networking")
public class IgNetworkingModule extends NativeNetworkingAndroidSpec implements C13773Tgo {
    public static final String CONTENT_LENGTH_HEADER_NAME = "content-length";
    public static final String CONTENT_TYPE_HEADER_NAME = "content-type";
    public static final String MODULE_NAME = "Networking";
    public static final String REQUEST_BODY_KEY_FORMDATA = "formData";
    public static final String REQUEST_BODY_KEY_STRING = "string";
    public static final String REQUEST_BODY_KEY_URI = "uri";
    public static final Class TAG = IgNetworkingModule.class;
    public final Object mEnqueuedRequestMonitor = Pxe.A0p();
    public final SparseArray mEnqueuedRequests = Pxe.A0L();
    public final 1NU mResponseHandler = new T7Z(this, 4);
    public final 0lg mSession;

    public static void buildSimpleRequest(1Pq r6, 1Fn[] r7, String str) {
        String str2 = null;
        if (r7 != null) {
            for (1Fn r2 : r7) {
                if (r2.A00.equalsIgnoreCase(CONTENT_TYPE_HEADER_NAME)) {
                    str2 = r2.A01;
                } else {
                    r6.A06.add(r2);
                }
            }
            if (str2 != null) {
                r6.A00 = new T6Z(str, str2);
                return;
            }
        }
        throw AnonymousClass7TE.A0w("Payload is set but no content-type header specified");
    }

    public void abortRequest(double d) {
        AnonymousClass1O8 removeRequest = removeRequest((int) d);
        if (removeRequest != null) {
            removeRequest.A00();
        }
    }

    public void addListener(String str) {
    }

    public void clearCookies(Callback callback) {
    }

    public String getName() {
        return "Networking";
    }

    public void onHostPause() {
    }

    public void onHostResume() {
    }

    public void removeListeners(double d) {
    }

    public void sendRequest(String str, String str2, double d, ReadableArray readableArray, ReadableMap readableMap, String str3, boolean z, double d2, boolean z2) {
        int i = (int) d;
        try {
            sendRequestInternal(str, str2, i, readableArray, readableMap, str3);
        } catch (Exception e) {
            0KC.A05(TAG, "Error while preparing request", e);
            onRequestError(i, e.getMessage());
        }
    }

    public static void addAllHeaders(1Pq r4, 1Fn[] r5) {
        if (r5 != null) {
            for (1Fn r1 : r5) {
                0qQ.A0B(r1, 0);
                r4.A06.add(r1);
            }
        }
    }

    private void buildMultipartRequest(1Pq r13, 1Fn[] r14, ReadableArray readableArray) {
        1Fc r3 = new 1Fc();
        int size = readableArray.size();
        int i = 0;
        while (i < size) {
            ReadableMap map = readableArray.getMap(i);
            String string = map.getString("fieldName");
            if (string != null) {
                if (map.hasKey(REQUEST_BODY_KEY_STRING)) {
                    r3.A05(string, map.getString(REQUEST_BODY_KEY_STRING));
                } else if (map.hasKey("uri")) {
                    String string2 = map.getString("uri");
                    String string3 = map.getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                    String string4 = map.getString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                    if (string3 == null || string4 == null || string2 == null) {
                        throw AnonymousClass7TE.A0w("Incomplete payload for URI formData part");
                    }
                    Uri A03 = 0cp.A03(string2);
                    ContentResolver contentResolver = Pxe.A0T(this).getContentResolver();
                    r3.A00.put(string, new T6C(contentResolver, A03, string3, string4, getBinaryContentLength(contentResolver, A03)));
                } else {
                    throw AnonymousClass7TE.A0w("Unrecognized FormData part.");
                }
                i++;
            } else {
                throw DbW.A0a("Attribute 'name' missing for formData part at index ", i);
            }
        }
        addAllHeaders(r13, r14);
        AnonymousClass1Px A00 = r3.A00(true);
        if (A00 != null) {
            r13.A03(CONTENT_LENGTH_HEADER_NAME, String.valueOf(A00.getContentLength()));
            r13.A00 = A00;
        }
    }

    /* access modifiers changed from: private */
    public 1QS buildRequest(String str, String str2, ReadableArray readableArray, ReadableMap readableMap) {
        1Pq r3 = new 1Pq(new 1HV(this.mSession));
        1Fn[] extractHeaders = extractHeaders(readableArray);
        if ("GET".equalsIgnoreCase(str)) {
            r3.A01(AnonymousClass05K.A0N);
            r3.A02(str2);
            addAllHeaders(r3, extractHeaders);
        } else if ("POST".equalsIgnoreCase(str)) {
            r3.A01(AnonymousClass05K.A01);
            r3.A02(str2);
            if (readableMap.hasKey(REQUEST_BODY_KEY_STRING)) {
                buildSimpleRequest(r3, extractHeaders, readableMap.getString(REQUEST_BODY_KEY_STRING));
            } else if (readableMap.hasKey(REQUEST_BODY_KEY_FORMDATA)) {
                buildMultipartRequest(r3, extractHeaders, readableMap.getArray(REQUEST_BODY_KEY_FORMDATA));
            } else {
                throw AnonymousClass7TE.A0w("Unsupported POST data type");
            }
        } else {
            throw AnonymousClass7TF.A0W("Unsupported HTTP request method ", str);
        }
        return r3.A00();
    }

    public static 1Fn[] extractHeaders(ReadableArray readableArray) {
        if (readableArray == null) {
            return null;
        }
        ArrayList A0v = DbS.A0v(readableArray.size());
        int size = readableArray.size();
        for (int i = 0; i < size; i++) {
            ReadableArray array = readableArray.getArray(i);
            if (array == null || array.size() != 2) {
                throw new RuntimeException("Unexpected structure of headers array");
            }
            Pxf.A1M(array.getString(0), array.getString(1), A0v);
        }
        return (1Fn[]) A0v.toArray(new 1Fn[A0v.size()]);
    }

    public static long getBinaryContentLength(ContentResolver contentResolver, Uri uri) {
        long j;
        try {
            InputStream openInputStream = contentResolver.openInputStream(uri);
            if (openInputStream != null) {
                j = (long) openInputStream.available();
            } else {
                j = -1;
            }
            Closeables.A01(openInputStream);
            return j;
        } catch (IOException unused) {
            return -1;
        }
    }

    private void onDataReceived(int i, String str) {
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        writableNativeArray.pushInt(i);
        writableNativeArray.pushString(str);
        DeviceEventManagerModule.RCTDeviceEventEmitter eventEmitter = getEventEmitter();
        if (eventEmitter != null) {
            eventEmitter.emit("didReceiveNetworkData", writableNativeArray);
        }
    }

    /* access modifiers changed from: private */
    public void onRequestError(int i, String str) {
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        writableNativeArray.pushInt(i);
        writableNativeArray.pushString(str);
        DeviceEventManagerModule.RCTDeviceEventEmitter eventEmitter = getEventEmitter();
        if (eventEmitter != null) {
            eventEmitter.emit("didCompleteNetworkResponse", writableNativeArray);
        }
    }

    private void onResponseReceived(int i, T6E t6e) {
        C13948Tm8 translateHeaders = translateHeaders(t6e.A02);
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        writableNativeArray.pushInt(i);
        writableNativeArray.pushInt(t6e.A00);
        writableNativeArray.pushMap(translateHeaders);
        DeviceEventManagerModule.RCTDeviceEventEmitter eventEmitter = getEventEmitter();
        if (eventEmitter != null) {
            eventEmitter.emit("didReceiveNetworkResponse", writableNativeArray);
        }
    }

    private void registerRequest(int i, AnonymousClass1O8 r4) {
        synchronized (this.mEnqueuedRequestMonitor) {
            this.mEnqueuedRequests.put(i, r4);
        }
    }

    /* access modifiers changed from: private */
    public AnonymousClass1O8 removeRequest(int i) {
        AnonymousClass1O8 r0;
        synchronized (this.mEnqueuedRequestMonitor) {
            SparseArray sparseArray = this.mEnqueuedRequests;
            r0 = (AnonymousClass1O8) sparseArray.get(i);
            sparseArray.remove(i);
        }
        return r0;
    }

    private void sendRequestInternal(String str, String str2, int i, ReadableArray readableArray, ReadableMap readableMap, String str3) {
        AnonymousClass1O8 r1 = new AnonymousClass1O8();
        C239203Fj A02 = 1GK.A06.A00(new C13152TNk(readableArray, readableMap, this, str, str2), -12, 2, false, true).A02(new 1QY(r1.A00), 565, 2, true, true).A02(this.mResponseHandler, 566, 2, false, true);
        int i2 = i;
        registerRequest(i2, r1);
        1OC A00 = AnonymousClass9D0.A00(A02);
        A00.A00 = new B5C(this, str3, i2, 0);
        1ES.A03(A00);
    }

    public void onHostDestroy() {
        synchronized (this.mEnqueuedRequestMonitor) {
            int size = this.mEnqueuedRequests.size();
            for (int i = 0; i < size; i++) {
                AnonymousClass1O8 r0 = (AnonymousClass1O8) this.mEnqueuedRequests.valueAt(i);
                if (r0 != null) {
                    r0.A00();
                }
            }
            this.mEnqueuedRequests.clear();
        }
    }

    public IgNetworkingModule(QZK qzk, 0lg r4) {
        super(qzk);
        this.mSession = r4;
    }

    private DeviceEventManagerModule.RCTDeviceEventEmitter getEventEmitter() {
        QZK reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            return (DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContextIfActiveOrWarn.A02(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
        }
        return null;
    }

    public static byte[] inputStreamToByteArray(InputStream inputStream) {
        ByteArrayOutputStream A0b = Pxe.A0b();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return A0b.toByteArray();
            }
            A0b.write(bArr, 0, read);
        }
    }

    /* access modifiers changed from: private */
    public void onRequestSuccess(int i, T6E t6e, String str) {
        String str2;
        onResponseReceived(i, t6e);
        if (str.equals("text")) {
            str2 = new String(t6e.A01, Pxe.A17());
        } else if (str.equals("base64")) {
            str2 = Base64.encodeToString(t6e.A01, 2);
        } else {
            str2 = "";
        }
        onDataReceived(i, str2);
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        writableNativeArray.pushInt(i);
        writableNativeArray.pushNull();
        DeviceEventManagerModule.RCTDeviceEventEmitter eventEmitter = getEventEmitter();
        if (eventEmitter != null) {
            eventEmitter.emit("didCompleteNetworkResponse", writableNativeArray);
        }
    }

    public static C13948Tm8 translateHeaders(1Fn[] r8) {
        String str;
        WritableNativeMap A0U = Pxe.A0U();
        for (1Fn r4 : r8) {
            String str2 = r4.A00;
            if (A0U.hasKey(str2)) {
                str = 002.A0g(A0U.getString(str2), ", ", r4.A01);
            } else {
                str = r4.A01;
            }
            A0U.putString(str2, str);
        }
        return A0U;
    }

    public void initialize() {
        Pxe.A0T(this).A09(this);
    }
}
