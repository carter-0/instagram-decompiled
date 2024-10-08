package X;

/* renamed from: X.Pqc  reason: case insensitive filesystem */
public final class C74196Pqc extends 0Yg implements 0sL {
    public static final C74196Pqc A00 = new C74196Pqc();

    public C74196Pqc() {
        super(2);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        String str;
        String str2;
        AnonymousClass7TG.A1N(obj, obj2);
        if (!obj2.equals(OSS.A00)) {
            if (obj2 instanceof C69662Npk) {
                str = C69726Nr9.A00((C69662Npk) obj2).localCallId;
            } else {
                str = null;
            }
            C71004OWb oWb = C71004OWb.A00;
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("DISPATCH RECEIVED AFTER CALLSTATE == IDLE & CallUiFinished.");
            if (str != null) {
                str2 = 002.A0R("\nlocalCallId: ", str);
            } else {
                str2 = "";
            }
            A1A.append(str2);
            A1A.append("\naction: ");
            A1A.append(obj2);
            oWb.A04("RpStores", C51967G9n.A0r(A1A, ' '), (Throwable) null);
        }
        return obj;
    }
}
