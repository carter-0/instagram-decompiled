package X;

public final class UUM extends W36 {
    public int A00 = 3;
    public C14940UGd A01;
    public C14941UGe A02;
    public C14943UGg A03;
    public C14944UGh A04;
    public C14947UGk A05;
    public C14948UGl A06;
    public C14950UGn A07;
    public C14951UGo A08;
    public final AnonymousClass0eM A09 = AnonymousClass0eN.A01(C20630WwO.A00);
    public final AnonymousClass0eM A0A = AnonymousClass0eN.A01(C20631WwP.A00);
    public final AnonymousClass0eM A0B = AnonymousClass0eN.A01(C20632WwQ.A00);
    public final AnonymousClass0eM A0C = AnonymousClass0eN.A01(C20633WwR.A00);
    public final AnonymousClass0eM A0D = AnonymousClass0eN.A01(C20634WwS.A00);
    public final AnonymousClass0eM A0E = AnonymousClass0eN.A01(C20635WwT.A00);
    public final AnonymousClass0eM A0F = AnonymousClass0eN.A01(C20636WwU.A00);
    public final AnonymousClass0eM A0G = AnonymousClass0eN.A01(C20637WwV.A00);

    public static final String A00(UUM uum) {
        boolean z;
        synchronized (uum) {
            z = uum.A00;
        }
        if (z) {
            return "call";
        }
        return "ringing";
    }

    public static final String A01(UUM uum) {
        boolean z;
        synchronized (uum) {
            z = uum.A00;
        }
        if (z) {
            return "live";
        }
        return "in_preview";
    }
}
