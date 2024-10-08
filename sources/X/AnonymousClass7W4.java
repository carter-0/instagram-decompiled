package X;

import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.7W4  reason: invalid class name */
public final class AnonymousClass7W4 implements 1wn {
    public final /* synthetic */ C332677Vy A00;

    public AnonymousClass7W4(C332677Vy r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = AnonymousClass0fD.A03(1826299867);
        AnonymousClass7MK r6 = (AnonymousClass7MK) obj;
        int A032 = AnonymousClass0fD.A03(1537353894);
        0qQ.A0B(r6, 0);
        DirectThreadKey directThreadKey = r6.A00;
        C332677Vy r1 = this.A00;
        if (0qQ.A0K(directThreadKey, C332677Vy.A00(r1))) {
            ((C274644oo) r1.A0X.get()).AZJ().notifyDataSetChanged();
        }
        AnonymousClass0fD.A0A(-610475365, A032);
        AnonymousClass0fD.A0A(-1142527545, A03);
    }
}
