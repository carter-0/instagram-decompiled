package X;

/* renamed from: X.8cG  reason: invalid class name and case insensitive filesystem */
public abstract class C359198cG {
    public static final C279294yP A00(C279284yO r1) {
        0qQ.A0B(r1, 0);
        if (r1.equals(AnonymousClass80L.A00)) {
            return C279294yP.LIVE;
        }
        if (r1.equals(AnonymousClass9QA.A00)) {
            return C279294yP.STORY;
        }
        if (r1.equals(AnonymousClass80M.A00)) {
            return C279294yP.DIRECT_THREAD;
        }
        if (r1 instanceof AnonymousClass80O) {
            return C279294yP.CLIPS;
        }
        if (r1.equals(C363138jC.A00)) {
            return C279294yP.FEED;
        }
        if (r1.equals(C3493980f.A00)) {
            return C279294yP.IGTV;
        }
        if (r1.equals(C3494080g.A00)) {
            return C279294yP.TEMPLATES;
        }
        if (r1.equals(C3494180h.A00)) {
            return C279294yP.NOTE;
        }
        if (r1.equals(C3494280i.A00)) {
            return C279294yP.PROFILE;
        }
        if (r1.equals(AnonymousClass80J.A00)) {
            return C279294yP.POTATO;
        }
        if (r1.equals(AnonymousClass80K.A00)) {
            return C279294yP.QUICK_SNAP;
        }
        throw new RuntimeException();
    }

    public static final AnonymousClass849 A01(C279284yO r1) {
        0qQ.A0B(r1, 0);
        if (r1 instanceof AnonymousClass80O) {
            return AnonymousClass849.A06;
        }
        if (r1.equals(AnonymousClass80L.A00)) {
            return AnonymousClass849.A05;
        }
        if (r1.equals(AnonymousClass80M.A00)) {
            return AnonymousClass849.A04;
        }
        return AnonymousClass849.A08;
    }
}
