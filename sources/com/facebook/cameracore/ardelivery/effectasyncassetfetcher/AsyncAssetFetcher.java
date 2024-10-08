package com.facebook.cameracore.ardelivery.effectasyncassetfetcher;

import X.0KC;
import X.0dV;
import X.AnonymousClass6i7;
import X.AnonymousClass7TE;
import X.AnonymousClass8LN;
import X.C371118xc;
import X.C372148zp;
import android.os.Build;
import android.text.TextUtils;
import com.facebook.cameracore.ardelivery.effectasyncassetfetcher.listener.OnAsyncAssetFetchCompletedListener;
import com.facebook.cameracore.ardelivery.listener.CancelableToken;
import com.facebook.cameracore.ardelivery.model.ARAssetType;
import com.facebook.cameracore.ardelivery.model.ARRequestAsset;
import com.facebook.cameracore.ardelivery.model.EffectAssetType;
import com.facebook.cameracore.ardelivery.model.SparkVisionCapability;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.facebook.jni.HybridData;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AsyncAssetFetcher {
    public static final String TAG = "AsyncAssetFetcher";
    public final List mAsyncAssets;
    public final String mEffectId;
    public final String mEffectInstanceId;
    public final C372148zp mFetchCallback;
    public HybridData mHybridData;
    public final boolean mIsLoggingDisabled;

    private native HybridData initHybrid();

    public static ARAssetType fromAsyncAssetType(C371118xc r1) {
        if (r1 == C371118xc.Remote) {
            return ARAssetType.REMOTE;
        }
        if (r1 == C371118xc.Block || r1 == C371118xc.ShareableBlock || r1 == C371118xc.ExternalBlock) {
            return ARAssetType.ASYNC;
        }
        return null;
    }

    public CancelableToken fetchAsyncAsset(String str, String str2, String str3, int i, int i2, int i3, OnAsyncAssetFetchCompletedListener onAsyncAssetFetchCompletedListener) {
        AnonymousClass6i7 CwC;
        StringBuilder A1A;
        String obj;
        String str4 = str;
        AnonymousClass6i7 r9 = null;
        OnAsyncAssetFetchCompletedListener onAsyncAssetFetchCompletedListener2 = onAsyncAssetFetchCompletedListener;
        if (this.mFetchCallback == null) {
            0KC.A0E(TAG, "fetch asset async but AsyncAssetFetchCallback is null.");
            obj = "No AsyncAssetFetchCallback. Abort.";
        } else {
            int i4 = i;
            if (i4 == 1 || i4 == 0 || i4 == 2 || i4 == 3) {
                int i5 = i2;
                if (i5 == 0 || i5 == 1) {
                    C371118xc r10 = C371118xc.values()[i];
                    ARAssetType fromAsyncAssetType = fromAsyncAssetType(r10);
                    fromAsyncAssetType.getClass();
                    if (i4 == 3) {
                        if (i5 == 0) {
                            r9 = this.mFetchCallback.DFB(onAsyncAssetFetchCompletedListener2, str4, this.mEffectId);
                            return new CancelableLoadToken(r9);
                        }
                        CwC = this.mFetchCallback.CwC(onAsyncAssetFetchCompletedListener2, fromAsyncAssetType, r10, str4, this.mEffectId, this.mEffectInstanceId, this.mIsLoggingDisabled);
                    } else {
                        if (i4 != 2) {
                            String str5 = str3;
                            if (i4 == 0) {
                                str4 = TextUtils.join("_", Arrays.asList(new String[]{this.mEffectId, str5}));
                            }
                            String str6 = this.mEffectInstanceId;
                            CwC = this.mFetchCallback.CwB(onAsyncAssetFetchCompletedListener2, new ARRequestAsset(fromAsyncAssetType, ARRequestAsset.CompressionMethod.fromCompressionTypeCppValue(i3), (EffectAssetType) null, r10, (AnonymousClass8LN) null, (SparkVisionCapability) null, (VersionedCapability) null, (Integer) null, str4, str6, (String) null, str5, str2, (String) null, str5, (String) null, (List) null, (List) null, -1, -1, -1, this.mIsLoggingDisabled, false, false));
                        }
                        CwC = this.mFetchCallback.CwC(onAsyncAssetFetchCompletedListener2, fromAsyncAssetType, r10, str4, this.mEffectId, this.mEffectInstanceId, this.mIsLoggingDisabled);
                    }
                    return new CancelableLoadToken(CwC);
                }
                A1A = AnonymousClass7TE.A1A();
                A1A.append("Unsupported AsyncAssetRequestType: ");
                A1A.append(i5);
            } else {
                A1A = AnonymousClass7TE.A1A();
                A1A.append("unsupported async asset type: ");
                A1A.append(i4);
            }
            obj = A1A.toString();
        }
        onAsyncAssetFetchCompletedListener2.onAsyncAssetFetchCompleted((String) null, obj);
        return new CancelableLoadToken(r9);
    }

    public List getAsyncAssets() {
        List list = this.mAsyncAssets;
        if (list == null) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(list);
    }

    public AsyncAssetFetcher(String str, String str2, List list, C372148zp r6, boolean z) {
        HybridData hybridData;
        this.mEffectId = str;
        this.mEffectInstanceId = str2;
        this.mAsyncAssets = list;
        this.mFetchCallback = r6;
        this.mIsLoggingDisabled = z;
        if (!"robolectric".equals(Build.FINGERPRINT)) {
            0dV.A0C("ard-android-async-asset-fetcher");
            hybridData = initHybrid();
        } else {
            hybridData = null;
        }
        this.mHybridData = hybridData;
    }
}
