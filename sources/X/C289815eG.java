package X;

import android.content.pm.PackageManager;
import com.google.common.collect.ImmutableList;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.5eG  reason: invalid class name and case insensitive filesystem */
public final class C289815eG implements Runnable {
    public final /* synthetic */ AnonymousClass3JC A00;
    public final /* synthetic */ 2KL A01;

    public C289815eG(AnonymousClass3JC r1, 2KL r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void run() {
        String optionalStringField;
        C250663lr r4 = (C250663lr) this.A00.A01;
        if (r4 != null) {
            ImmutableList requiredCompactedTreeListField = r4.getRequiredCompactedTreeListField(0, "ig_android_app_history_plist_query", C289825eH.class, -1375292589);
            0qQ.A07(requiredCompactedTreeListField);
            2KL r42 = this.A01;
            if (r42.A0B && requiredCompactedTreeListField.size() > 100) {
                long currentTimeMillis = System.currentTimeMillis();
                2KL.A01(r42, (Long) null, "start_app_history_scan_bit_mask");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                C249803kO it = requiredCompactedTreeListField.iterator();
                0qQ.A07(it);
                while (it.hasNext()) {
                    C250663lr r6 = (C250663lr) it.next();
                    String optionalStringField2 = r6.getOptionalStringField(1, "package_name");
                    if (!(optionalStringField2 == null || (optionalStringField = r6.getOptionalStringField(0, "app_id")) == null)) {
                        boolean z = false;
                        try {
                            r42.A04.getPackageManager().getPackageInfo(optionalStringField2, 128);
                            z = true;
                        } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
                        }
                        linkedHashMap.put(optionalStringField, Boolean.valueOf(z));
                    }
                }
                2KL.A01(r42, Long.valueOf(System.currentTimeMillis() - currentTimeMillis), "finish_app_history_scan_bit_mask");
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                int i = 0;
                int i2 = 0;
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                    i++;
                    int i3 = r42.A00;
                    if (i == i3) {
                        if (r42.A0C) {
                            2KL.A02(r42, linkedHashMap2, i2, (i3 + i2) - 1);
                        }
                        i2 += i3;
                        linkedHashMap2 = new LinkedHashMap();
                        i = 0;
                    }
                }
                if ((!linkedHashMap2.isEmpty()) && r42.A0C) {
                    2KL.A02(r42, linkedHashMap2, i2, (r42.A00 + i2) - 1);
                }
                2KL.A01(r42, (Long) null, "sent_app_history_by_bit_mask");
                requiredCompactedTreeListField = requiredCompactedTreeListField.subList(0, Math.min(r42.A01, requiredCompactedTreeListField.size()));
            }
            if (r42.A09) {
                00k.A0s(requiredCompactedTreeListField, new G4U(r42, 29), r42.A01);
            } else {
                2KL.A00(r42, requiredCompactedTreeListField);
            }
            2KL.A01(r42, (Long) null, "sent_app_history_by_falco");
        }
    }
}
