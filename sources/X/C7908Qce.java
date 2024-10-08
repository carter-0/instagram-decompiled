package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.smartcapture.ig.logging.IgSmartCaptureLoggerProvider;
import com.facebook.smartcapture.logging.CommonLoggingFields;
import com.facebook.smartcapture.logging.SmartCaptureLogger;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.Qce  reason: case insensitive filesystem */
public final class C7908Qce extends C10984S3u {
    public static WeakReference A00;
    public static final C7908Qce A01 = new C10984S3u();

    public static final Object A00(C307896Rx r29, AnonymousClass6Tm r30) {
        String str;
        String str2;
        C13664TeV t5e;
        LinkedHashMap A0y;
        Object obj;
        Object obj2;
        Object obj3;
        C307896Rx r11 = r29;
        C307786Rm A09 = C308206Td.A09(r11);
        C7908Qce qce = A01;
        Context context = A09.A00;
        A00 = C51965G9l.A0v(context);
        AnonymousClass6Tm r1 = r30;
        ArrayList A012 = qce.A01(r11, r1);
        if (A012 == null) {
            return null;
        }
        List list = r1.A00;
        Object obj4 = list.get(1);
        0qQ.A0C(obj4, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
        Map map = (Map) obj4;
        LinkedHashMap A0o = C51975G9x.A0o(map);
        Iterator A0u = AnonymousClass7TF.A0u(map);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            Object key = A1J.getKey();
            AnonymousClass6QE r0 = AnonymousClass6QE.A02;
            A0o.put(key, AnonymousClass6QJ.A01(DbT.A09(DbS.A0s(A1J)), true).toString());
        }
        Object obj5 = list.get(2);
        0qQ.A0C(obj5, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
        Map map2 = (Map) obj5;
        ArrayList A0r = AnonymousClass7TG.A0r(A012);
        Iterator it = A012.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                0sr.A1T();
                throw AnonymousClass00P.createAndThrow();
            }
            Object A0E = 00k.A0E(A0o.values(), i);
            0qQ.A07(A0E);
            Iterator A0s = AnonymousClass7TF.A0s(A0o);
            while (true) {
                if (!A0s.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = A0s.next();
                if (0qQ.A0K(((Map.Entry) obj2).getValue(), A0E)) {
                    break;
                }
            }
            Map.Entry entry = (Map.Entry) obj2;
            if (entry != null) {
                obj3 = entry.getKey();
            } else {
                obj3 = null;
            }
            0qQ.A0A(obj3);
            Object obj6 = map2.get(obj3);
            0qQ.A0A(obj6);
            A0r.add(new AnonymousClass59G(obj3, next, obj6));
            i = i2;
        }
        C277014uI A0P = DbW.A0P(r1, 3);
        C277014uI A0P2 = DbW.A0P(r1, 4);
        String A0t = DbU.A0t(list, 5);
        C276544tV r2 = (C276544tV) r1.A03(6);
        0qQ.A0A(r2);
        String A0D = r2.A0D();
        long A04 = r2.A04(38, 0);
        Long valueOf = Long.valueOf(A04);
        int i3 = (A04 > 0 ? 1 : (A04 == 0 ? 0 : -1));
        Long l = null;
        if (i3 != 0) {
            l = valueOf;
        }
        UserSession A0B = C308206Td.A0B(r11);
        SmartCaptureLogger smartCaptureLogger = new IgSmartCaptureLoggerProvider((0lg) A0B).get(context);
        Parcelable.Creator creator = CommonLoggingFields.CREATOR;
        RF2 rf2 = RF2.MID_END;
        String A0s2 = DbS.A0s((Map.Entry) 00k.A09(map2.entrySet()));
        Locale locale = Locale.ROOT;
        String A0n = Pxf.A0n(locale, A0s2);
        if (A0n.equals("SELFIE_VIDEO_NATIVE") || A0n.equals("SELFIE_PHOTO_NATIVE")) {
            str = "v1_selfie";
        } else {
            str = "v2_id";
        }
        0qQ.A0A(A0t);
        smartCaptureLogger.setCommonFields(new CommonLoggingFields(rf2, str, A0t, String.valueOf(l), (Bundle) null, String.valueOf(l)));
        String A0F = r2.A0F();
        0qQ.A0B(A0B, 2);
        if (A0F != null) {
            str2 = DbT.A12(locale, A0F);
        } else {
            str2 = null;
        }
        if (0qQ.A0K(str2, "graph_api") || str2 == null) {
            t5e = new C12744T5e(context);
        } else if (!str2.equals("upload_service")) {
            throw AnonymousClass7TF.A0W("Unknown uploader name: ", str2);
        } else if (A0B instanceof UserSession) {
            t5e = new C12745T5f(A0B);
        } else {
            throw AnonymousClass7TE.A0w("This session type isn't supported by upload service");
        }
        C13664TeV teV = t5e;
        if (A0F == null) {
            A0y = null;
        } else {
            A0y = C66582MXn.A0y("upload_infra", A0F);
        }
        smartCaptureLogger.logEvent("upload_started", A0y);
        C58707IwG iwG = new C58707IwG(new Object(), 49);
        C58728Iwb iwb = new C58728Iwb(A09, 14);
        Collection values = A0o.values();
        0qQ.A0B(values, 3);
        if (AnonymousClass7TE.A1a(iwG.invoke())) {
            obj = new C12284Sqi(smartCaptureLogger, (Collection) iwb.invoke(values));
        } else {
            obj = new Object();
        }
        teV.FMX(new C11002S4w(smartCaptureLogger, (C13584TdA) obj, A09, r11, A0P, A0P2, A0F), l, A0t, A0D, A0r);
        return null;
    }
}
