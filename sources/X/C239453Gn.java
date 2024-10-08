package X;

import android.app.Notification;
import android.content.Context;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import androidx.core.app.NotificationCompat$InboxStyle;
import com.google.common.collect.EvictingQueue;
import com.google.common.collect.Synchronized;
import com.instagram.android.R;
import com.instagram.realtimeclient.RealtimeConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/* renamed from: X.3Gn  reason: invalid class name and case insensitive filesystem */
public final class C239453Gn {
    public final 1Xz A00;
    public final Queue A01 = new Synchronized.SynchronizedObject(new EvictingQueue(25));

    public final void A01(String str) {
        0qQ.A0B(str, 0);
        this.A01.add(str);
    }

    public final void A00() {
        HashSet A0V;
        1Xz r5;
        HashMap A012;
        Object obj;
        try {
            A0V = 00k.A0V(this.A01);
            r5 = this.A00;
            A012 = r5.A01();
            Collection values = A012.values();
            ArrayList arrayList = new ArrayList();
            for (Object next : values) {
                if (((StatusBarNotification) next).getNotification().getChannelId().equals("ig_direct")) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object next2 : arrayList) {
                if (((StatusBarNotification) next2).isGroup()) {
                    arrayList2.add(next2);
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object next3 : arrayList2) {
                String group = ((StatusBarNotification) next3).getNotification().getGroup();
                if (group == null) {
                    group = "";
                }
                Object obj2 = linkedHashMap.get(group);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap.put(group, obj2);
                }
                ((List) obj2).add(next3);
            }
            ArrayList arrayList3 = new ArrayList();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                Iterator it = ((Iterable) entry.getValue()).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    StatusBarNotification statusBarNotification = (StatusBarNotification) obj;
                    if (0qQ.A0K(statusBarNotification.getTag(), statusBarNotification.getNotification().getGroup())) {
                        break;
                    }
                }
                StatusBarNotification statusBarNotification2 = (StatusBarNotification) obj;
                if (statusBarNotification2 != null) {
                    arrayList3.add(new 0eP(statusBarNotification2, entry.getValue()));
                }
            }
            for (Map.Entry entry2 : 0Yt.A08(arrayList3).entrySet()) {
                if (((List) entry2.getValue()).size() <= 1) {
                    r5.A03((Runnable) null, ((StatusBarNotification) entry2.getKey()).getTag(), ((StatusBarNotification) entry2.getKey()).getId());
                } else {
                    Context context = C60960kU.A00;
                    0qQ.A07(context);
                    StatusBarNotification statusBarNotification3 = (StatusBarNotification) entry2.getKey();
                    List list = (List) entry2.getValue();
                    0qQ.A0B(statusBarNotification3, 1);
                    0qQ.A0B(list, 2);
                    Bundle bundle = statusBarNotification3.getNotification().extras;
                    if (0qQ.A0K(bundle.getString("category"), RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING)) {
                        ArrayList<StatusBarNotification> arrayList4 = new ArrayList<>();
                        for (Object next4 : list) {
                            StatusBarNotification statusBarNotification4 = (StatusBarNotification) next4;
                            if (!0qQ.A0K(statusBarNotification4.getTag(), statusBarNotification4.getNotification().getGroup())) {
                                arrayList4.add(next4);
                            }
                        }
                        int i = 0;
                        for (StatusBarNotification notification : arrayList4) {
                            i += notification.getNotification().number;
                        }
                        int size = arrayList4.size();
                        String A002 = AnonymousClass000.A00(3592);
                        if (bundle.getInt(A002) != i || bundle.getInt("chat_count") != size) {
                            String quantityString = context.getResources().getQuantityString(R.plurals.direct_messages, i, new Object[]{Integer.valueOf(i)});
                            0qQ.A07(quantityString);
                            String quantityString2 = context.getResources().getQuantityString(R.plurals.direct_threads, size, new Object[]{Integer.valueOf(size)});
                            0qQ.A07(quantityString2);
                            String string = context.getString(2131963232, new Object[]{quantityString, quantityString2});
                            0qQ.A07(string);
                            Bundle bundle2 = statusBarNotification3.getNotification().extras;
                            bundle2.putInt(A002, i);
                            bundle2.putInt("chat_count", size);
                            AnonymousClass9T8 r2 = new AnonymousClass9T8(statusBarNotification3.getNotification(), context);
                            NotificationCompat$InboxStyle notificationCompat$InboxStyle = new NotificationCompat$InboxStyle();
                            notificationCompat$InboxStyle.A02 = AnonymousClass9T8.A00(string);
                            notificationCompat$InboxStyle.A03 = true;
                            r2.A0A(notificationCompat$InboxStyle);
                            r2.A0F = bundle2;
                            AnonymousClass9T8.A01(r2, 8, true);
                            Notification A03 = r2.A03();
                            if (A03 != null) {
                                r5.A00.A00(statusBarNotification3.getTag(), statusBarNotification3.getId(), A03);
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            new 0eQ(th);
            return;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry3 : A012.entrySet()) {
            StatusBarNotification statusBarNotification5 = (StatusBarNotification) entry3.getValue();
            if (statusBarNotification5.isGroup() && !statusBarNotification5.getNotification().getChannelId().equals("ig_direct")) {
                linkedHashMap3.put(entry3.getKey(), entry3.getValue());
            }
        }
        for (Map.Entry entry4 : linkedHashMap3.entrySet()) {
            String str = (String) entry4.getKey();
            String group2 = ((StatusBarNotification) entry4.getValue()).getNotification().getGroup();
            if (group2 == null) {
                group2 = "";
            }
            int i2 = linkedHashMap2.get(group2);
            if (i2 == null) {
                i2 = 0;
                linkedHashMap2.put(group2, 0);
            }
            int intValue = ((Number) i2).intValue();
            if (!0qQ.A0K(str, group2) && !A0V.contains(str)) {
                linkedHashMap2.put(group2, Integer.valueOf(intValue + 1));
            }
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        for (Map.Entry entry5 : linkedHashMap2.entrySet()) {
            if (((Number) entry5.getValue()).intValue() == 0) {
                linkedHashMap4.put(entry5.getKey(), entry5.getValue());
            }
        }
        for (Map.Entry key : linkedHashMap4.entrySet()) {
            StatusBarNotification statusBarNotification6 = (StatusBarNotification) A012.get((String) key.getKey());
            if (statusBarNotification6 != null) {
                r5.A03((Runnable) null, statusBarNotification6.getTag(), statusBarNotification6.getId());
            }
        }
    }

    public C239453Gn(1Xz r3) {
        this.A00 = r3;
    }
}
