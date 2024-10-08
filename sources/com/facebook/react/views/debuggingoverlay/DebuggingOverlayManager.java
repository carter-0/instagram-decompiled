package com.facebook.react.views.debuggingoverlay;

import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C10555Ru9;
import X.C9548Rcl;
import X.Pxk;
import X.Q8c;
import X.QZK;
import X.QZL;
import X.TQR;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.bridge.NoSuchKeyException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UnexpectedNativeTypeException;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.SimpleViewManager;
import java.util.ArrayList;

@ReactModule(name = "DebuggingOverlay")
public final class DebuggingOverlayManager extends SimpleViewManager {
    public static final C9548Rcl Companion = new Object();
    public static final String REACT_CLASS = "DebuggingOverlay";

    public DebuggingOverlayManager() {
        super((QZK) null);
    }

    public Q8c createViewInstance(QZL qzl) {
        0qQ.A0B(qzl, 0);
        return new Q8c(qzl);
    }

    public String getName() {
        return REACT_CLASS;
    }

    public void receiveCommand(Q8c q8c, String str, ReadableArray readableArray) {
        RuntimeException runtimeException;
        AnonymousClass7TF.A1H(q8c, str);
        int hashCode = str.hashCode();
        if (hashCode != -1942063165) {
            if (hashCode != 1326903961) {
                if (hashCode == 1385348555 && str.equals("highlightElements")) {
                    if (readableArray != null) {
                        ReadableArray array = readableArray.getArray(0);
                        ArrayList A1C = AnonymousClass7TE.A1C();
                        int size = array.size();
                        boolean z = true;
                        for (int i = 0; i < size; i++) {
                            try {
                                A1C.add(Pxk.A0B(array.getMap(i)));
                            } catch (Exception e) {
                                e = e;
                                if ((e instanceof NoSuchKeyException) || (e instanceof UnexpectedNativeTypeException)) {
                                    TQR.A00("Unexpected payload for highlighting elements: every element should have x, y, width, height fields", REACT_CLASS);
                                    z = false;
                                } else {
                                    throw e;
                                }
                            }
                        }
                        if (z) {
                            q8c.setHighlightedElementsRectangles(A1C);
                            return;
                        }
                        return;
                    }
                    return;
                }
            } else if (str.equals("highlightTraceUpdates")) {
                if (readableArray != null) {
                    ReadableArray array2 = readableArray.getArray(0);
                    ArrayList A1C2 = AnonymousClass7TE.A1C();
                    int size2 = array2.size();
                    boolean z2 = true;
                    for (int i2 = 0; i2 < size2; i2++) {
                        ReadableMap map = array2.getMap(i2);
                        ReadableMap map2 = map.getMap("rectangle");
                        if (map2 == null) {
                            runtimeException = new RuntimeException("Unexpected payload for highlighting trace updates: rectangle field is null");
                            ReactSoftExceptionLogger.logSoftException(REACT_CLASS, runtimeException);
                        }
                        try {
                            A1C2.add(new C10555Ru9(Pxk.A0B(map2), map.getInt(PublicKeyCredentialControllerUtility.JSON_KEY_ID), map.getInt("color")));
                        } catch (Exception e2) {
                            e = e2;
                            if ((e instanceof NoSuchKeyException) || (e instanceof UnexpectedNativeTypeException)) {
                                TQR.A00("Unexpected payload for highlighting trace updates: rectangle field should have x, y, width, height fields", REACT_CLASS);
                                z2 = false;
                            } else {
                                throw e;
                            }
                        }
                    }
                    if (z2) {
                        q8c.setTraceUpdates(A1C2);
                        return;
                    }
                    return;
                }
                return;
            }
        } else if (str.equals("clearElementsHighlights")) {
            q8c.A00.clear();
            q8c.invalidate();
            return;
        }
        runtimeException = new RuntimeException("Received unexpected command in DebuggingOverlayManager");
        ReactSoftExceptionLogger.logSoftException(REACT_CLASS, runtimeException);
    }
}
