package X;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: X.7J2  reason: invalid class name */
public final class AnonymousClass7J2 implements View.OnClickListener {
    public final /* synthetic */ C329457Iy A00;

    public AnonymousClass7J2(C329457Iy r1) {
        this.A00 = r1;
    }

    public final void onClick(View view) {
        String str;
        C329467Iz r2;
        Context context;
        int A05 = AnonymousClass0fD.A05(-1062714107);
        C329457Iy r0 = this.A00;
        View view2 = (View) r0.A07.getValue();
        if (!(view2 == null || (context = view2.getContext()) == null)) {
            C355148Ov r22 = (C355148Ov) r0.A02.invoke(context, Boolean.valueOf(r0.A03));
            r0.A01 = r22;
            if (r22 != null) {
                r22.setFocusable(true);
            }
            C355148Ov r23 = r0.A01;
            if (r23 != null) {
                r23.setOutsideTouchable(true);
            }
            C355148Ov r3 = r0.A01;
            if (r3 != null) {
                r3.setOnDismissListener(new APM(r0));
            }
        }
        int ordinal = r0.A00.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                0wc r4 = r0.A06.A00.A00;
                0Aj A002 = r4.A00(r4.A00, "direct_composer_thread_dismiss_plus");
                if (A002.isSampled()) {
                    A002.Cgf();
                }
                r2 = C329467Iz.CLOSED;
            }
            AnonymousClass0fD.A0C(-879003512, A05);
        }
        AnonymousClass7IO r7 = r0.A06;
        AnonymousClass7IM r24 = r0.A05;
        AnonymousClass7IR r8 = r7.A00;
        Set entrySet = r24.A00.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next : entrySet) {
            Object value = ((Map.Entry) next).getValue();
            Object obj = linkedHashMap.get(value);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(value, obj);
            }
            ((List) obj).add(next);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(0se.A0L(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(((AnonymousClass7JU) entry.getKey()).A00, entry.getValue());
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(0se.A0L(linkedHashMap2.size()));
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            Object key = entry2.getKey();
            Iterable<Map.Entry> iterable = (Iterable) entry2.getValue();
            ArrayList arrayList = new ArrayList(0Yv.A1E(iterable, 10));
            for (Map.Entry key2 : iterable) {
                arrayList.add(((AnonymousClass7JT) key2.getKey()).A00);
            }
            linkedHashMap3.put(key, arrayList);
        }
        String obj2 = new JSONObject(linkedHashMap3).toString();
        0qQ.A07(obj2);
        C62320sa r5 = r7.A02;
        2Eq r25 = (2Eq) r5.invoke();
        if (r25 != null) {
            str = r25.C6C();
        } else {
            str = null;
        }
        0wc r32 = r8.A00;
        0Aj A003 = r32.A00(r32.A00, "direct_composer_thread_tap_plus");
        if (A003.isSampled()) {
            A003.AAJ("extra_client_data", obj2);
            if (str != null) {
                A003.AAJ("open_thread_id", str);
            }
            A003.Cgf();
        }
        AnonymousClass2Ep r26 = (AnonymousClass2Ep) r5.invoke();
        if (r26 != null) {
            AnonymousClass7IQ r52 = r7.A01;
            String C6C = r26.C6C();
            String C6k = r26.C6k();
            int C6a = r26.C6a();
            int AdN = r26.AdN();
            if (C6a != 28) {
                if (C6a == 29) {
                    C72195OyG.A00((C72195OyG) r52.A02.getValue(), Integer.valueOf(AdN), C6C, C6k, "direct_composer_thread_tap_plus", "tap", "create_broadcast_chat_button", (Map) null);
                } else if (C6a != 61) {
                    r52.A05.getValue();
                }
            }
            C72196OyH.A00(C48147EZp.CREATE_BROADCAST_CHAT_BUTTON, C48146EZo.THREAD_VIEW, (C72196OyH) r52.A04.getValue(), "direct_composer_thread_tap_plus", "tap", (Map) null);
        }
        r2 = C329467Iz.EXPANDED;
        C329457Iy.A00(r2, r0);
        AnonymousClass0fD.A0C(-879003512, A05);
    }
}
