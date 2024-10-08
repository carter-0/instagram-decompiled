package X;

import com.instagram.model.reels.Reel;

/* renamed from: X.6wl  reason: invalid class name and case insensitive filesystem */
public final class C322996wl implements 1wn {
    public final /* synthetic */ C322936we A00;

    public C322996wl(C322936we r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = AnonymousClass0fD.A03(1670329949);
        AnonymousClass6UQ r6 = (AnonymousClass6UQ) obj;
        int A032 = AnonymousClass0fD.A03(782404702);
        0qQ.A0B(r6, 0);
        Reel reel = r6.A00;
        if (reel != null) {
            C322936we r1 = this.A00;
            if (reel.A15(r1.A0A)) {
                C322126vI r12 = r1.A07;
                String id = reel.getId();
                0qQ.A07(id);
                r12.A07(id);
            }
        }
        AnonymousClass0fD.A0A(-114936824, A032);
        AnonymousClass0fD.A0A(1861198558, A03);
    }
}
