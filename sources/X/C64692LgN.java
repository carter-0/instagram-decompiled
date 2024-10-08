package X;

/* renamed from: X.LgN  reason: case insensitive filesystem */
public final class C64692LgN implements 1wn {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public C64692LgN(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A03 = str;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A032;
        int i;
        if (this.A00 != 0) {
            A032 = AnonymousClass0fD.A03(-591795708);
            C64674Lg0 lg0 = (C64674Lg0) obj;
            int A0D = AnonymousClass7TG.A0D(lg0, 578983320);
            String str = lg0.A01;
            String str2 = this.A03;
            if (0qQ.A0K(str, str2)) {
                ((AnonymousClass4D7) this.A01).resumeWith(lg0.A00);
                C63824L8f l8f = (C63824L8f) this.A02;
                AnonymousClass1Nd.A00(l8f.A00).A02((1wn) l8f.A02.remove(str2), C64674Lg0.class);
            }
            AnonymousClass0fD.A0A(-1293569310, A0D);
            i = -1580257839;
        } else {
            A032 = AnonymousClass0fD.A03(488789020);
            C64678Lg4 lg4 = (C64678Lg4) obj;
            int A0D2 = AnonymousClass7TG.A0D(lg4, 603532924);
            String str3 = lg4.A01;
            String str4 = this.A03;
            if (0qQ.A0K(str3, str4)) {
                ((AnonymousClass4D7) this.A01).resumeWith(lg4.A00);
                C359068bx r1 = (C359068bx) this.A02;
                AnonymousClass1Nd.A00(r1.A00).A02((1wn) r1.A03.remove(str4), C64678Lg4.class);
            }
            AnonymousClass0fD.A0A(-1786120838, A0D2);
            i = 49263139;
        }
        AnonymousClass0fD.A0A(i, A032);
    }
}
