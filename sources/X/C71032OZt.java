package X;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import com.facebook.rsys.call.gen.CallModel;
import com.instagram.common.session.UserSession;
import com.instagram.model.rtc.RtcCallAudience;
import com.instagram.model.rtc.RtcCallFunnelSessionId;
import com.instagram.model.rtc.RtcCallKey;
import com.instagram.model.rtc.RtcCallSource;
import com.instagram.model.rtc.RtcIgNotification;
import com.instagram.model.rtc.RtcJoinCallArgs;
import com.instagram.model.rtc.RtcThreadKey;
import com.instagram.rtc.signaling.models.RtcConnectionEntity;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.OZt  reason: case insensitive filesystem */
public final class C71032OZt {
    public final Context A00;
    public final UserSession A01;
    public final 1X9 A02;

    public static final RtcConnectionEntity.RtcCallConnectionEntity A00(C71032OZt oZt, String str) {
        RtcConnectionEntity rtcConnectionEntity;
        if (str != null) {
            ConcurrentMap concurrentMap = I4H.A01;
            rtcConnectionEntity = I4H.A00(002.A0T(oZt.A01.A06, str, '_'));
        } else {
            rtcConnectionEntity = null;
        }
        if (rtcConnectionEntity instanceof RtcConnectionEntity.RtcCallConnectionEntity) {
            return (RtcConnectionEntity.RtcCallConnectionEntity) rtcConnectionEntity;
        }
        return null;
    }

    public static final boolean A01(C71032OZt oZt) {
        if (Build.VERSION.SDK_INT >= 34 && !C51971G9r.A1b(oZt.A03().A00)) {
            Object systemService = oZt.A00.getSystemService("activity");
            0qQ.A0C(systemService, AnonymousClass000.A00(174));
            if (!((ActivityManager) systemService).isBackgroundRestricted()) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final Intent A02(Context context, String str) {
        String str2 = str;
        RtcConnectionEntity.RtcCallConnectionEntity A002 = A00(this, str2);
        if (A002 == null) {
            C71004OWb.A00.A04("IgRtcNotificationConfig", 002.A0R("Accept call | No connection entity for call with server info data: ", str2), (Throwable) null);
            return DbS.A09();
        }
        UserSession userSession = this.A01;
        C69277Nid nid = A002.A01;
        1oz r5 = AnonymousClass386.A00().A00;
        String str3 = A002.A0D;
        if (str3 == null) {
            str3 = "";
        }
        boolean z = A002.A0N;
        String str4 = A002.A0A;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = A002.A0C;
        if (str5 == null) {
            str5 = "";
        }
        RtcCallAudience A012 = r5.A01(str3, str4, str5, A002.A0B, z);
        C331537Rj r2 = C331537Rj.PUSH_NOTIFICATION;
        String A003 = A002.A00();
        if (A003 == null) {
            A003 = "";
        }
        RtcCallKey rtcCallKey = A002.A03;
        String str6 = A002.A0G;
        String A013 = C70907OQz.A01(A002);
        C69278Nie nie = A002.A02;
        return C70319O1x.A00(context, userSession, new RtcJoinCallArgs(nid, nie, A012, (RtcCallFunnelSessionId) null, rtcCallKey, new RtcCallSource((C69465Nm9) null, r2, new RtcThreadKey(A003, (String) null, (String) null, (String) null, (String) null)), (RtcIgNotification) null, str6, A013, 64278, !A002.A0L));
    }

    public final C68178N3t A03() {
        UserSession userSession = this.A01;
        0Tu r2 = 0Tu.A05;
        return new C68178N3t(C66580MXl.A15(this, 0), new C73912Pln(this, 21), 59373, 182.A06(r2, userSession, 36323951466524288L), 182.A06(r2, userSession, 2342168262055572252L));
    }

    public final String A04(CallModel callModel) {
        Resources resources;
        int i;
        int i2 = callModel.inCallState;
        if (i2 != 1) {
            if (i2 == 2) {
                if (C69724Nqo.A00(callModel) || callModel.inviteRequestedVideo) {
                    resources = this.A00.getResources();
                    i = 2131954450;
                } else {
                    resources = this.A00.getResources();
                    i = 2131954435;
                }
                return AnonymousClass7TF.A0d(resources, i);
            } else if (!(i2 == 4 || i2 == 5 || i2 == 7)) {
                return "";
            }
        }
        return AnonymousClass7TF.A0d(this.A00.getResources(), 2131954473);
    }

    public final String A05(CallModel callModel) {
        Resources resources;
        int i;
        RtcConnectionEntity.RtcCallConnectionEntity A002;
        String str;
        String str2 = callModel.sharedCallId;
        if (str2 != null && (A002 = A00(this, str2)) != null && (str = A002.A0C) != null && str.length() != 0) {
            return str;
        }
        if (C69724Nqo.A00(callModel) || callModel.inviteRequestedVideo) {
            resources = this.A00.getResources();
            i = 2131954450;
        } else {
            resources = this.A00.getResources();
            i = 2131954435;
        }
        return AnonymousClass7TF.A0d(resources, i);
    }

    public /* synthetic */ C71032OZt(Context context, UserSession userSession) {
        1X9 A002 = AnonymousClass38W.A00();
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = A002;
    }
}
