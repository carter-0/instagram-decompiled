package com.instagram.realtimeclient;

import X.16F;
import X.16L;
import X.16P;
import X.AnonymousClass1FD;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41845B3m;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.realtimeclient.DirectRealtimePayload;
import com.instagram.realtimeclient.RealtimeEvent;
import java.util.ArrayList;

public final class RealtimeEvent__JsonHelper {
    public static RealtimeEvent parseFromJson(16F r1) {
        return (RealtimeEvent) 16P.A01(r1, new AnonymousClass1FD() {
            public RealtimeEvent invoke(16F r2) {
                return RealtimeEvent__JsonHelper.unsafeParseFromJson(r2);
            }
        });
    }

    public static boolean processSingleField(RealtimeEvent realtimeEvent, String str, 16F r6) {
        if ("event".equals(str)) {
            realtimeEvent.type = RealtimeEvent.Type.fromServerValue(r6.A1P());
            return true;
        }
        ArrayList arrayList = null;
        if ("topic".equals(str)) {
            realtimeEvent.topic = AnonymousClass7TG.A0l(r6);
            return true;
        } else if ("must_refresh".equals(str)) {
            realtimeEvent.mustRefresh = r6.A0d();
            return true;
        } else if ("sequence".equals(str)) {
            realtimeEvent.sequence = AnonymousClass7TG.A0l(r6);
            return true;
        } else if ("interval".equals(str)) {
            realtimeEvent.interval = r6.A0U();
            return true;
        } else if ("data".equals(str)) {
            if (r6.A11() == 16L.A0C) {
                arrayList = new ArrayList();
                while (r6.A1J() != 16L.A08) {
                    RealtimeOperation parseFromJson = RealtimeOperation__JsonHelper.parseFromJson(r6);
                    if (parseFromJson != null) {
                        arrayList.add(parseFromJson);
                    }
                }
            }
            realtimeEvent.operations = arrayList;
            return true;
        } else if (C41845B3m.A17(str)) {
            realtimeEvent.id = AnonymousClass7TG.A0l(r6);
            return true;
        } else if (DialogModule.KEY_MESSAGE.equals(str)) {
            realtimeEvent.message = AnonymousClass7TG.A0l(r6);
            return true;
        } else if (IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE.equals(str)) {
            realtimeEvent.code = AnonymousClass7TF.A0X(r6);
            return true;
        } else if ("action".equals(str)) {
            realtimeEvent.action = DirectRealtimePayload.Action.fromServerValue(r6.A1P());
            return true;
        } else if (IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS.equals(str)) {
            realtimeEvent.status = AnonymousClass7TG.A0l(r6);
            return true;
        } else if (TraceFieldType.StatusCode.equals(str)) {
            realtimeEvent.statusCode = AnonymousClass7TF.A0X(r6);
            return true;
        } else if (!"payload".equals(str)) {
            return false;
        } else {
            realtimeEvent.payload = DirectRealtimePayload__JsonHelper.parseFromJson(r6);
            return true;
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, com.instagram.realtimeclient.RealtimeEvent] */
    public static RealtimeEvent unsafeParseFromJson(16F r3) {
        ? obj = new Object();
        if (r3.A11() != 16L.A0D) {
            r3.A0z();
            return null;
        }
        while (r3.A1J() != 16L.A09) {
            String A0q = r3.A0q();
            r3.A1J();
            processSingleField(obj, A0q, r3);
            r3.A0z();
        }
        return obj;
    }

    public static RealtimeEvent parseFromJson(String str) {
        return parseFromJson(16P.A00(str));
    }
}
