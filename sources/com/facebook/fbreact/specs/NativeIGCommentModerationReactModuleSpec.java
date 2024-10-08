package com.facebook.fbreact.specs;

import X.C13904TjR;
import X.QZK;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeIGCommentModerationReactModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "IGCommentModerationReactModule";

    @ReactMethod
    public abstract void fetchBlockedCommenters(C13904TjR tjR);

    @ReactMethod
    public abstract void fetchCommentAudienceControlType(C13904TjR tjR);

    @ReactMethod
    public abstract void fetchCommentCategoryFilterDisabled(C13904TjR tjR);

    @ReactMethod
    public abstract void fetchCommentFilter(C13904TjR tjR);

    @ReactMethod
    public abstract void fetchCommentFilterKeywords(C13904TjR tjR);

    @ReactMethod
    public abstract void fetchCurrentUser(C13904TjR tjR);

    public abstract String getName();

    @ReactMethod
    public abstract void openCommenterBlockingViewControllerWithReactTag(double d, ReadableArray readableArray, Callback callback);

    @ReactMethod
    public abstract void setBlockedCommenters(ReadableMap readableMap, C13904TjR tjR);

    @ReactMethod
    public abstract void setCommentAudienceControlType(String str, C13904TjR tjR);

    @ReactMethod
    public abstract void setCommentCategoryFilterDisabled(boolean z, C13904TjR tjR);

    @ReactMethod
    public abstract void setCustomKeywords(String str, C13904TjR tjR);

    @ReactMethod
    public abstract void setCustomKeywordsWithDisabled(String str, boolean z, C13904TjR tjR);

    @ReactMethod
    public abstract void setUseDefaultKeywords(boolean z, C13904TjR tjR);

    public NativeIGCommentModerationReactModuleSpec(QZK qzk) {
        super(qzk);
    }
}
