package X;

import java.util.ArrayList;
import java.util.List;
import org.webrtc.CameraCapturer;

/* renamed from: X.51W  reason: invalid class name */
public final class AnonymousClass51W extends AnonymousClass0T0 {
    public final AnonymousClass9IV A00;
    public final AnonymousClass51I A01;
    public final AnonymousClass3QS A02;
    public final List A03;
    public final List A04;
    public final AnonymousClass0eM A05 = AnonymousClass0eN.A01(new AnonymousClass9LU(this, 34));
    public final AnonymousClass0eM A06 = AnonymousClass0eN.A01(new AnonymousClass9LU(this, 36));
    public final AnonymousClass0eM A07 = AnonymousClass0eN.A01(new AnonymousClass9LU(this, 35));

    public AnonymousClass51W(AnonymousClass9IV r3, AnonymousClass51I r4, AnonymousClass3QS r5, List list, List list2) {
        0qQ.A0B(list, 1);
        this.A04 = list;
        this.A01 = r4;
        this.A02 = r5;
        this.A00 = r3;
        this.A03 = list2;
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [X.9bh, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v14, types: [X.9bh, java.lang.Object] */
    public final ArrayList A00() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (AnonymousClass51M r6 : (List) this.A06.getValue()) {
            String str = r6.A0L;
            if (str != null) {
                int i2 = i - 250;
                if (arrayList.isEmpty() || ((!arrayList.isEmpty()) && ((C381399bh) 00k.A0K(arrayList)).A01 != i2)) {
                    ? obj = new Object();
                    obj.A02 = str;
                    obj.A00 = CameraCapturer.OPEN_CAMERA_DELAY_MS;
                    obj.A01 = i2;
                    arrayList.add(obj);
                }
            }
            String str2 = r6.A0M;
            if (str2 != null) {
                int i3 = ((r6.A08 - r6.A09) + i) - 250;
                if (arrayList.isEmpty() || ((!arrayList.isEmpty()) && ((C381399bh) 00k.A0K(arrayList)).A01 != i3)) {
                    ? obj2 = new Object();
                    obj2.A02 = str2;
                    obj2.A00 = CameraCapturer.OPEN_CAMERA_DELAY_MS;
                    obj2.A01 = i3;
                    arrayList.add(obj2);
                }
            }
            i += r6.A08 - r6.A09;
        }
        return arrayList;
    }

    public final List A01() {
        return (List) this.A07.getValue();
    }
}
