package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: X.SJh  reason: case insensitive filesystem */
public final class C11288SJh {
    public static final AnonymousClass0JR A02;
    public final 1yd A00;
    public final QuickPerformanceLogger A01;

    public final void A04(JSONObject jSONObject) {
        int i;
        Iterator<String> keys;
        if (this.A00.A09(true)) {
            String optString = jSONObject.optString("markerID");
            String optString2 = jSONObject.optString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
            0qQ.A0A(optString);
            switch (optString.hashCode()) {
                case -1302779920:
                    if (optString.equals("JS_MARKER")) {
                        i = 772802650;
                        break;
                    } else {
                        return;
                    }
                case -774331922:
                    if (optString.equals("JS_SET_PAYMENT_VALUES")) {
                        i = 772810608;
                        break;
                    } else {
                        return;
                    }
                case -404306583:
                    if (optString.equals("JS_AUTOFILL_PING")) {
                        i = 772803488;
                        break;
                    } else {
                        return;
                    }
                case -230162796:
                    if (optString.equals("JS_SET_CONTACT_VALUES")) {
                        i = 772807851;
                        break;
                    } else {
                        return;
                    }
                case 997599488:
                    if (optString.equals("JS_FIND_ALL_PAYMENT_FIELDS")) {
                        i = 772802242;
                        break;
                    } else {
                        return;
                    }
                case 1242941368:
                    if (optString.equals("JS_REQUEST_AUTOFILL")) {
                        i = 772812940;
                        break;
                    } else {
                        return;
                    }
                case 2118983270:
                    if (optString.equals("JS_PAGE_FORM_CALLBACK")) {
                        i = 772816680;
                        break;
                    } else {
                        return;
                    }
                default:
                    return;
            }
            Integer valueOf = Integer.valueOf(i);
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                int optInt = jSONObject.optInt("instanceKey", 0);
                JSONObject optJSONObject = jSONObject.optJSONObject(AnonymousClass000.A00(2609));
                if (!(optJSONObject == null || (keys = optJSONObject.keys()) == null)) {
                    while (keys.hasNext()) {
                        String A18 = AnonymousClass7TE.A18(keys);
                        this.A01.markerAnnotate(intValue, optInt, A18, optJSONObject.optString(A18));
                    }
                }
                if (optString2 != null) {
                    int hashCode = optString2.hashCode();
                    if (hashCode != 68795) {
                        if (hashCode != 76307824) {
                            if (hashCode == 79219778 && optString2.equals("START")) {
                                this.A01.markerStart(intValue, optInt);
                            }
                        } else if (optString2.equals("POINT")) {
                            this.A01.markerPoint(intValue, optInt, jSONObject.optString("point"));
                        }
                    } else if (optString2.equals("END")) {
                        this.A01.markerEnd(intValue, optInt, 2);
                    }
                }
            }
        }
    }

    static {
        AwakeTimeSinceBootClock awakeTimeSinceBootClock = AwakeTimeSinceBootClock.INSTANCE;
        0qQ.A07(awakeTimeSinceBootClock);
        A02 = awakeTimeSinceBootClock;
    }

    public final Integer A00(Long l, int i, int i2) {
        int i3;
        if (this.A00.A09(true)) {
            if (i2 == 0) {
                i3 = AnonymousClass0HM.A00().hashCode();
            } else {
                i3 = i2;
            }
            int i4 = i;
            QuickPerformanceLogger quickPerformanceLogger = this.A01;
            if (l == null) {
                quickPerformanceLogger.markerStart(i, i3, false);
            } else {
                quickPerformanceLogger.markerStartWithCancelPolicy(i4, false, i3, l.longValue(), TimeUnit.MILLISECONDS);
            }
        } else {
            i3 = i2;
        }
        if (i2 == 0) {
            return Integer.valueOf(i3);
        }
        return null;
    }

    public final void A01(Integer num, Long l, int i) {
        if (this.A00.A09(true) && num != null) {
            int i2 = i;
            QuickPerformanceLogger quickPerformanceLogger = this.A01;
            if (l == null) {
                quickPerformanceLogger.markerEnd(i, num.intValue(), 2);
            } else {
                quickPerformanceLogger.markerEnd(i2, num.intValue(), 2, l.longValue(), TimeUnit.MILLISECONDS);
            }
        }
    }

    public final void A02(Integer num, Long l, String str, int i) {
        if (this.A00.A09(true) && num != null) {
            String str2 = str;
            int i2 = i;
            QuickPerformanceLogger quickPerformanceLogger = this.A01;
            if (l == null) {
                quickPerformanceLogger.markerPoint(i, num.intValue(), str);
            } else {
                quickPerformanceLogger.markerPoint(i2, num.intValue(), str2, l.longValue(), TimeUnit.MILLISECONDS);
            }
        }
    }

    public final void A03(Integer num, String str, String str2, int i) {
        if (this.A00.A09(true) && num != null) {
            this.A01.markerAnnotate(i, num.intValue(), str, str2);
        }
    }

    public C11288SJh(1yd r1, QuickPerformanceLogger quickPerformanceLogger) {
        this.A01 = quickPerformanceLogger;
        this.A00 = r1;
    }
}
