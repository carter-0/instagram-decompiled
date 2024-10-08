package X;

import com.instagram.api.schemas.UpcomingEventIDType;
import com.instagram.common.session.UserSession;
import com.instagram.upcomingevents.common.model.UpcomingEventReminderAction;
import com.instagram.user.model.UpcomingEvent;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.2fP  reason: invalid class name */
public final class AnonymousClass2fP extends 0px {
    public final 1NH A00;

    /* JADX WARNING: type inference failed for: r0v1, types: [X.Cwy, java.lang.Object] */
    public final C45465Cwy A0L(UpcomingEventIDType upcomingEventIDType, UpcomingEventReminderAction upcomingEventReminderAction, String str, String str2) {
        String str3;
        List list;
        String[] strArr;
        0qQ.A0B(str, 0);
        0qQ.A0B(upcomingEventIDType, 1);
        if (str2 != null) {
            List A03 = new 11S("_").A03(str2);
            if (!A03.isEmpty()) {
                ListIterator listIterator = A03.listIterator(A03.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        if (((String) listIterator.previous()).length() != 0) {
                            list = 00k.A0d(A03, listIterator.nextIndex() + 1);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            list = 0sn.A00;
            if (!(list == null || (strArr = (String[]) list.toArray(new String[0])) == null)) {
                str3 = strArr[0];
                ? obj = new Object();
                obj.A03 = str;
                obj.A00 = upcomingEventIDType;
                obj.A01 = upcomingEventReminderAction;
                obj.A02 = str3;
                A0D(str, obj);
                return obj;
            }
        }
        str3 = null;
        ? obj2 = new Object();
        obj2.A03 = str;
        obj2.A00 = upcomingEventIDType;
        obj2.A01 = upcomingEventReminderAction;
        obj2.A02 = str3;
        A0D(str, obj2);
        return obj2;
    }

    public final /* bridge */ /* synthetic */ 1OC A0G(Object obj) {
        C45465Cwy cwy = (C45465Cwy) obj;
        0qQ.A0B(cwy, 0);
        UserSession userSession = this.A02;
        0qQ.A06(userSession);
        return cwy.A00(userSession);
    }

    public final Integer A0H() {
        return AnonymousClass05K.A01;
    }

    public final void A0I() {
        List<C45465Cwy> list;
        1NH r6 = this.A00;
        String str = this.A02.A06;
        AnonymousClass47I r0 = (AnonymousClass47I) r6.A02(002.A0R("pending_upcoming_event_reminders_", str), true);
        if (!(r0 == null || (list = r0.A00) == null)) {
            HashMap hashMap = new HashMap();
            for (C45465Cwy cwy : list) {
                hashMap.put(cwy.A02(), cwy);
            }
            A0E(hashMap);
            A08();
        }
        r6.A04(002.A0R("pending_upcoming_event_reminders_", str));
    }

    public final void A0J() {
        this.A00.A04(002.A0R("pending_upcoming_event_reminders_", this.A02.A06));
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, X.47I] */
    public final void A0K() {
        ? obj = new Object();
        obj.A00 = A05();
        this.A00.A05(002.A0R("pending_upcoming_event_reminders_", this.A02.A06), obj);
    }

    public final Boolean A0M(UpcomingEvent upcomingEvent) {
        if (this.A00 == null) {
            A07();
        }
        String id = upcomingEvent.getId();
        if (!A0F(id)) {
            return null;
        }
        C45465Cwy cwy = (C45465Cwy) A03(id);
        if (cwy != null) {
            UpcomingEventReminderAction A01 = cwy.A01();
            boolean z = false;
            if (A01 == UpcomingEventReminderAction.SET_REMINDER) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        throw new IllegalStateException("Required value was null.");
    }

    public AnonymousClass2fP(1NH r1, UserSession userSession) {
        super(userSession);
        this.A00 = r1;
    }

    public final void A0N(C45465Cwy cwy) {
        if (cwy == A03(cwy.A02())) {
            A0B(cwy.A02());
        }
    }
}
