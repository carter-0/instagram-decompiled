package X;

/* renamed from: X.PnP  reason: case insensitive filesystem */
public final class C73998PnP extends 0Yg implements 0sP {
    public static final C73998PnP A00 = new C73998PnP();

    public C73998PnP() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        OB2 ob2 = (OB2) obj;
        0qQ.A0B(ob2, 0);
        0fh.A01("SubscriptionInitializer.selectModel", -7317239);
        try {
            C71025OZc oZc = ob2.A01;
            C74560Px9 px9 = ob2.A00;
            synchronized (oZc) {
                0qQ.A0B(px9, 1);
                C71025OZc.A01(px9, oZc.A00);
            }
            0fh.A00(-927532919);
            return C60340gF.A00;
        } catch (Throwable th) {
            0fh.A00(1709631629);
            throw th;
        }
    }
}
