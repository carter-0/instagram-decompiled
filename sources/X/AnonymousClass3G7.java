package X;

import android.os.Handler;
import android.os.Looper;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeConstants;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.3G7  reason: invalid class name */
public final class AnonymousClass3G7 implements AnonymousClass0lh {
    public final Handler A00 = new Handler(Looper.getMainLooper());
    public final UserSession A01;
    public final HashSet A02 = new HashSet();

    public AnonymousClass3G7(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
    }

    public static final synchronized void A00(02m r1, AnonymousClass3G7 r2, int i, short s) {
        synchronized (r2) {
            r1.markerEnd(974456648, i, s);
            r2.A02.remove(Integer.valueOf(i));
        }
    }

    public static final synchronized void A01(AnonymousClass3G7 r6, String str) {
        synchronized (r6) {
            02m r5 = 02m.A0p;
            HashSet hashSet = r6.A02;
            Iterator it = hashSet.iterator();
            0qQ.A07(it);
            while (it.hasNext()) {
                Object next = it.next();
                0qQ.A07(next);
                int intValue = ((Number) next).intValue();
                0qQ.A0A(r5);
                r5.markerAnnotate(974456648, intValue, "CANCEL_REASON", str);
            }
            r5.endAllInstancesOfMarker(974456648, 4);
            hashSet.clear();
        }
    }

    public static final synchronized void A02(AnonymousClass3G7 r4, String str) {
        synchronized (r4) {
            02m r3 = 02m.A0p;
            Iterator it = r4.A02.iterator();
            0qQ.A07(it);
            while (it.hasNext()) {
                Object next = it.next();
                0qQ.A07(next);
                r3.markerPoint(974456648, ((Number) next).intValue(), str);
            }
        }
    }

    public final synchronized void A03(C268654dm r6, AnonymousClass49H r7) {
        String localizedMessage;
        0qQ.A0B(r7, 0);
        02m r4 = 02m.A0p;
        Throwable A012 = r6.A01();
        if (!(A012 == null || (localizedMessage = A012.getLocalizedMessage()) == null)) {
            0qQ.A0A(r4);
            r4.markerAnnotate(974456648, r7.A03, "NETWORK_FAILURE_REASON", localizedMessage);
        }
        C250903mF r0 = (C250903mF) r6.A00();
        if (r0 != null) {
            0qQ.A0A(r4);
            r4.markerAnnotate(974456648, r7.A03, "RESPONSE_CODE", r0.mStatusCode);
        }
        0qQ.A0A(r4);
        A00(r4, this, r7.A03, 3);
    }

    public final synchronized void A04(AnonymousClass49H r12) {
        0qQ.A0B(r12, 0);
        UserSession userSession = this.A01;
        0Tu r5 = 0Tu.A05;
        if (182.A06(r5, userSession, 36313265587947361L)) {
            int i = r12.A03;
            HashSet hashSet = this.A02;
            Integer valueOf = Integer.valueOf(i);
            if (!hashSet.contains(valueOf)) {
                02m r3 = 02m.A0p;
                0qQ.A0A(r3);
                r3.markerStart(974456648, i);
                this.A00.postDelayed(new AnonymousClass5FN(this, r12), 182.A01(r5, userSession, 36594740564592456L) * 1000);
                hashSet.add(valueOf);
                r3.markerPoint(974456648, i, "REQUEST_SENT");
                r3.markerAnnotate(974456648, i, "REELS_REQUESTED", r12.A05.size());
                r3.markerAnnotate(974456648, i, "CONTAINER_MODULE", r12.A04);
                r3.markerAnnotate(974456648, i, "FETCH_REASON", String.valueOf(r12.A02));
            }
        }
    }

    public final synchronized void A05(AnonymousClass49H r5) {
        0qQ.A0B(r5, 0);
        int i = r5.A03;
        if (this.A02.contains(Integer.valueOf(i)) || !C278404wp.A00(this.A01).booleanValue()) {
            02m.A0p.markerPoint(974456648, i, "RESPONSE_RECEIVED");
        }
    }

    public final synchronized void A06(AnonymousClass49H r12, C250903mF r13) {
        short s;
        Collection<AnonymousClass3HX> values;
        int i;
        int i2;
        Integer num;
        0qQ.A0B(r12, 0);
        int i3 = r12.A03;
        if (this.A02.contains(Integer.valueOf(i3)) || !C278404wp.A00(this.A01).booleanValue()) {
            UserSession userSession = this.A01;
            02m r2 = 02m.A0p;
            r2.markerPoint(974456648, i3, "RESPONSE_PARSED");
            r2.markerAnnotate(974456648, i3, "REELS_RECEIVED", r13.A03(userSession).size());
            int i4 = 0;
            if (182.A06(0Tu.A05, 1NM.A00(userSession).A00, 36324651546194122L)) {
                HashMap A03 = r13.A03(userSession);
                0qQ.A07(A03);
                if (A03.isEmpty()) {
                    i2 = 0;
                } else {
                    i2 = 0;
                    for (Map.Entry entry : A03.entrySet()) {
                        Integer num2 = ((AnonymousClass3HX) entry.getValue()).A17;
                        List list = ((AnonymousClass3HX) entry.getValue()).A1j;
                        if (list != null) {
                            num = Integer.valueOf(list.size());
                        } else {
                            num = null;
                        }
                        if (!0qQ.A0K(num2, num)) {
                            i2++;
                        }
                    }
                }
                r2.markerAnnotate(974456648, i3, "PARTIAL_REELS_RECEIVED", i2);
            }
            HashMap A032 = r13.A03(userSession);
            if (!(A032 == null || (values = A032.values()) == null)) {
                for (AnonymousClass3HX r0 : values) {
                    List list2 = r0.A1k;
                    if (list2 != null) {
                        i = list2.size();
                    } else {
                        i = 0;
                    }
                    i4 += i;
                }
            }
            r2.markerAnnotate(974456648, i3, "MEDIA_IDS_RECEIVED", i4);
            r2.markerAnnotate(974456648, i3, "RESPONSE_CODE", r13.mStatusCode);
            if (0qQ.A0K(r13.getStatus(), RealtimeConstants.SEND_FAIL)) {
                r2.markerAnnotate(974456648, i3, "failure_type", "SERVER");
                r2.markerAnnotate(974456648, i3, "NETWORK_FAILURE_REASON", "Client received a 200 response with a fail");
                s = 3;
            } else {
                s = 2;
            }
            A00(r2, this, i3, s);
        }
    }

    public final void onSessionWillEnd() {
        A01(this, "Session Ending");
    }
}
