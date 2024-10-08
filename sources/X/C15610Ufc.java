package X;

import com.instagram.model.venue.LocationDict;

/* renamed from: X.Ufc  reason: case insensitive filesystem */
public final class C15610Ufc extends 1P0 {
    public final /* synthetic */ C18621VvE A00;

    public C15610Ufc(C18621VvE vvE) {
        this.A00 = vvE;
    }

    public final void onFail(C268654dm r3) {
        int A03 = AnonymousClass0fD.A03(1018966978);
        C15610Ufc.super.onFail(r3);
        AnonymousClass0fD.A0A(-933221553, A03);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0fD.A03(-1921495337);
        C20957X6k x6k = this.A00.A06;
        if (x6k != null) {
            x6k.onFinish();
        }
        AnonymousClass0fD.A0A(-43391354, A03);
    }

    public final void onStart() {
        AnonymousClass0fD.A0A(42440113, AnonymousClass0fD.A03(510178269));
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [com.instagram.model.venue.Venue, java.lang.Object] */
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-189338419);
        UXJ uxj = (UXJ) obj;
        int A032 = AnonymousClass0fD.A03(-595844626);
        C20957X6k x6k = this.A00.A06;
        if (x6k != null) {
            LocationDict locationDict = uxj.A00;
            locationDict.getClass();
            ? obj2 = new Object();
            obj2.A00 = locationDict;
            x6k.Dx5(obj2);
        }
        AnonymousClass0fD.A0A(-1045002468, A032);
        AnonymousClass0fD.A0A(-1085919803, A03);
    }
}
