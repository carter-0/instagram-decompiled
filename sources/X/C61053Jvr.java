package X;

import android.content.Context;
import android.content.res.Resources;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Jvr  reason: case insensitive filesystem */
public final class C61053Jvr extends AnonymousClass0T0 {
    public static final C63251Ktw A01;
    public final List A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C61053Jvr) && 0qQ.A0K(this.A00, ((C61053Jvr) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.Ktw, java.lang.Object] */
    static {
        ? obj = new Object();
        A01 = obj;
        0qQ.A07(C51968G9o.A16(obj));
    }

    public static final int A00(C61053Jvr jvr) {
        C61022JvM jvM = (C61022JvM) 00k.A0J(jvr.A00);
        if (jvM == null) {
            return 0;
        }
        int i = jvM.A05;
        if (Integer.valueOf(i) == null) {
            return 0;
        }
        if (i == 2) {
            return 1519;
        }
        if (i != 1) {
            return 0;
        }
        return 1520;
    }

    public static final long A01(C61053Jvr jvr) {
        Iterator it = jvr.A00.iterator();
        if (it.hasNext()) {
            long j = ((C61022JvM) it.next()).A07;
            while (true) {
                long j2 = j;
                while (true) {
                    if (!it.hasNext()) {
                        return j2;
                    }
                    j = ((C61022JvM) it.next()).A07;
                    if (j2 < j) {
                    }
                }
            }
        } else {
            throw new NoSuchElementException();
        }
    }

    public static final String A02(C61053Jvr jvr) {
        Resources resources;
        int i;
        List list = jvr.A00;
        C61022JvM jvM = (C61022JvM) 00k.A0J(list);
        if (jvM == null) {
            return "";
        }
        int i2 = jvM.A05;
        if (Integer.valueOf(i2) == null) {
            return "";
        }
        if (i2 == 2) {
            Context context = C60960kU.A00;
            0qQ.A07(context);
            resources = context.getResources();
            i = R.plurals.security_alert_bundle_login_alert_text;
        } else if (i2 != 1) {
            return "";
        } else {
            Context context2 = C60960kU.A00;
            0qQ.A07(context2);
            resources = context2.getResources();
            i = R.plurals.security_alert_bundle_keychange_alert_text;
        }
        String quantityString = resources.getQuantityString(i, list.size(), AnonymousClass7TF.A1b(list.size()));
        0qQ.A07(quantityString);
        return quantityString;
    }

    public final C283155Gi A04(UserSession userSession) {
        Map map;
        C283155Gi r3;
        String str;
        int i;
        List list = this.A00;
        if (!list.isEmpty()) {
            0eP A1L = AnonymousClass7TE.A1L("destination", A03(this));
            0eP A1L2 = AnonymousClass7TE.A1L("icon_url", "https://i.instagram.com/static/images/activity/info-1.5.png/3385260677b8.png");
            0eP A1L3 = AnonymousClass7TE.A1L("rich_text", A02(this));
            0eP A1L4 = AnonymousClass7TE.A1L("timestamp", Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(A01(this))));
            Map A0w = AnonymousClass7TF.A0w("action_type", "hide");
            if (182.A06(0Tu.A06, userSession, 36321481861375413L)) {
                map = AnonymousClass7TF.A0w("action_type", AnonymousClass000.A00(385));
            } else {
                map = null;
            }
            Map[] mapArr = {A0w, map};
            0qQ.A0B(mapArr, 0);
            LinkedHashMap A06 = 0Yt.A06(new 0eP[]{A1L, A1L2, A1L3, A1L4, AnonymousClass7TE.A1L("inline_controls", 03t.A0I(mapArr)), AnonymousClass7TE.A1L("highlight_config", AnonymousClass7TF.A0w(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "unseen"))});
            try {
                StringBuilder A1A = AnonymousClass7TE.A1A();
                A1A.append("security_alert/");
                C61022JvM jvM = (C61022JvM) 00k.A0J(list);
                if (jvM != null) {
                    i = jvM.A06;
                } else {
                    i = 0;
                }
                A1A.append(i);
                A1A.append('/');
                r3 = C283145Gh.parseFromJson(16P.A00(JTQ.A0c(0Yt.A06(new 0eP[]{AnonymousClass7TE.A1L("pk", AnonymousClass7TF.A0i(UUID.randomUUID(), A1A)), AnonymousClass7TE.A1L("args", A06), AnonymousClass7TE.A1L("notif_name", "local_bundle_security_alert"), AnonymousClass7TF.A0x("story_type", A00(this)), AnonymousClass7TF.A0x(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, C283195Gm.BUNDLE_WITH_ICON.A00)}))));
            } catch (Throwable th) {
                r3 = JTO.A1B(th);
            }
            Throwable A002 = 0eR.A00(r3);
            if (A002 != null) {
                A002.getMessage();
                r3 = null;
            }
            C283155Gi r32 = r3;
            if (r32 != null) {
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((C61022JvM) it.next()).A02 == null) {
                                str = "new_stories";
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                str = "old_stories";
                r32.A0D = str;
                return r32;
            }
        }
        return null;
    }

    public C61053Jvr(List list) {
        this.A00 = list;
    }

    public static final String A03(C61053Jvr jvr) {
        StringBuilder sb;
        C46518DgL dgL;
        int i;
        int A002 = A00(jvr);
        if (A002 == 1519) {
            sb = AnonymousClass7TF.A0n("ig://");
            dgL = C46518DgL.A2e;
        } else if (A002 != 1520) {
            return "";
        } else {
            sb = AnonymousClass7TF.A0n("ig://");
            dgL = C46518DgL.A2f;
        }
        sb.append(dgL);
        sb.append("?deviceId=");
        List list = jvr.A00;
        C61022JvM jvM = (C61022JvM) 00k.A0J(list);
        if (jvM != null) {
            i = jvM.A06;
        } else {
            i = 0;
        }
        sb.append(i);
        sb.append("&ids=");
        return AnonymousClass7TF.A0l(DbT.A0z(",", list, MOA.A00), sb);
    }

    public final String toString() {
        int i;
        C66726MbX A002 = C66725MbW.A00(this);
        List list = this.A00;
        A002.A01(DbT.A0z(",", list, MOA.A00), PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        C61022JvM jvM = (C61022JvM) 00k.A0J(list);
        if (jvM != null) {
            i = jvM.A06;
        } else {
            i = 0;
        }
        A002.A02("deviceId", i);
        A002.A03("createdTimestampMs", A01(this));
        A002.A01(A02(this), "label");
        A002.A02("notificationType", A00(this));
        A002.A01("local_bundle_security_alert", "notificationName");
        A002.A01(A03(this), "notificationDestination");
        A002.A01(list, "alerts");
        return DbT.A10(A002);
    }
}
