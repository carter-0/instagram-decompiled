package X;

import com.instagram.ui.widget.mediapicker.Folder;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.7y7  reason: invalid class name and case insensitive filesystem */
public final class C348237y7 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AnonymousClass8XY A02;
    public final /* synthetic */ AnonymousClass8XW A03;
    public final /* synthetic */ List A04;
    public final /* synthetic */ List A05;
    public final /* synthetic */ Map A06;
    public final /* synthetic */ AnonymousClass0eM A07;

    public C348237y7(AnonymousClass8XY r1, AnonymousClass8XW r2, List list, List list2, Map map, AnonymousClass0eM r6, int i, int i2) {
        this.A05 = list;
        this.A03 = r2;
        this.A02 = r1;
        this.A06 = map;
        this.A04 = list2;
        this.A01 = i;
        this.A00 = i2;
        this.A07 = r6;
    }

    public final void run() {
        List list;
        if (((Boolean) this.A07.getValue()).booleanValue() && (list = this.A05) != null) {
            AnonymousClass8XT r0 = this.A03.A0A.A0D;
            if (r0 != null) {
                r0.DpR(list);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        AnonymousClass8XW.A03(this.A03);
        AnonymousClass8XY r4 = this.A02;
        for (Folder folder : this.A06.values()) {
            Map map = r4.A03.A0B;
            Integer valueOf = Integer.valueOf(folder.A02);
            Folder folder2 = (Folder) map.get(valueOf);
            if (folder2 != null) {
                Set set = folder2.A05;
                set.clear();
                Set set2 = folder2.A06;
                set2.clear();
                folder2.A01 = null;
                folder2.A00 = 0;
                set.addAll(folder.A05);
                set2.addAll(folder.A06);
                folder2.A00 = folder.A00;
            } else {
                map.put(valueOf, folder);
            }
        }
        AnonymousClass8XW r2 = r4.A03;
        Map map2 = r2.A0B;
        0qQ.A0B(map2, 0);
        r2.A04 = map2;
        AnonymousClass8XY.A00(r4, this.A04, this.A01, this.A00);
    }
}
