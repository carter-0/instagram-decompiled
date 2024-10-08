package com.facebook.react.animated;

import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C13947Tm7;
import X.C13948Tm8;
import X.C51966G9m;
import X.C51967G9n;
import X.C66582MXn;
import X.C7842QbP;
import X.QYz;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.events.RCTModernEventEmitter;
import java.util.List;

public final class EventAnimationDriver implements RCTModernEventEmitter {
    public String eventName;
    public final List eventPath;
    public QYz valueNode;
    public int viewTag;

    public EventAnimationDriver(String str, int i, List list, QYz qYz) {
        AnonymousClass7TG.A0w(1, str, list, qYz);
        this.eventName = str;
        this.viewTag = i;
        this.eventPath = list;
        this.valueNode = qYz;
    }

    public void receiveEvent(int i, String str, C13948Tm8 tm8) {
        0qQ.A0B(str, 1);
        receiveEvent(-1, i, str, tm8);
    }

    public void receiveTouches(String str, C13947Tm7 tm7, C13947Tm7 tm72) {
        throw AnonymousClass7TE.A1B("receiveTouches is not support by native animated events");
    }

    public void receiveTouches(C7842QbP qbP) {
        throw AnonymousClass7TE.A1B("receiveTouches is not support by native animated events");
    }

    public void receiveEvent(int i, int i2, String str, boolean z, int i3, C13948Tm8 tm8, int i4) {
        QYz qYz;
        double d;
        ReadableMap readableMap;
        ReadableType readableType;
        ReadableMap readableMap2;
        if (tm8 != null) {
            int i5 = 0;
            int A06 = C51966G9m.A06(this.eventPath);
            ReadableArray readableArray = null;
            ReadableMap readableMap3 = tm8;
            while (i5 < A06) {
                List list = this.eventPath;
                if (readableMap3 != null) {
                    String A19 = AnonymousClass7TE.A19(list, i5);
                    ReadableType type = readableMap3.getType(A19);
                    if (type == ReadableType.Map) {
                        readableMap2 = readableMap3.getMap(A19);
                    } else if (type == ReadableType.Array) {
                        readableArray = readableMap3.getArray(A19);
                        readableMap = null;
                        i5++;
                        readableMap3 = readableMap;
                    } else {
                        StringBuilder A0n = AnonymousClass7TF.A0n("Unexpected type ");
                        A0n.append(type);
                        A0n.append(" for key '");
                        A0n.append(A19);
                        String A0r = C51967G9n.A0r(A0n, '\'');
                        0qQ.A0B(A0r, 1);
                        throw new RuntimeException(A0r);
                    }
                } else {
                    int parseInt = Integer.parseInt(AnonymousClass7TE.A19(list, i5));
                    if (readableArray != null) {
                        readableType = readableArray.getType(parseInt);
                    } else {
                        readableType = null;
                    }
                    if (readableType == ReadableType.Map) {
                        if (readableArray != null) {
                            readableMap2 = readableArray.getMap(parseInt);
                        } else {
                            readableMap2 = null;
                        }
                    } else if (readableType == ReadableType.Array) {
                        if (readableArray != null) {
                            readableArray = readableArray.getArray(parseInt);
                        } else {
                            readableArray = null;
                        }
                        readableMap = null;
                        i5++;
                        readableMap3 = readableMap;
                    } else {
                        StringBuilder A0n2 = AnonymousClass7TF.A0n("Unexpected type ");
                        A0n2.append(readableType);
                        A0n2.append(" for index '");
                        A0n2.append(parseInt);
                        String A0r2 = C51967G9n.A0r(A0n2, '\'');
                        0qQ.A0B(A0r2, 1);
                        throw new RuntimeException(A0r2);
                    }
                }
                readableArray = null;
                readableMap = readableMap2;
                i5++;
                readableMap3 = readableMap;
            }
            String str2 = (String) C66582MXn.A0r(this.eventPath);
            if (readableMap3 != null) {
                qYz = this.valueNode;
                d = readableMap3.getDouble(str2);
            } else {
                int parseInt2 = Integer.parseInt(str2);
                qYz = this.valueNode;
                d = readableArray != null ? readableArray.getDouble(parseInt2) : 0.0d;
            }
            qYz.A00 = d;
            return;
        }
        throw AnonymousClass7TE.A0w("Native animated events must have event data.");
    }

    public void receiveEvent(int i, int i2, String str, C13948Tm8 tm8) {
        0qQ.A0B(str, 2);
        receiveEvent(i, i2, str, false, 0, tm8, 2);
    }
}
