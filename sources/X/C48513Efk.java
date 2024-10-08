package X;

/* renamed from: X.Efk  reason: case insensitive filesystem */
public abstract class C48513Efk {
    public static String A00(AnonymousClass6Tm r4) {
        int i;
        String str;
        C276544tV r3 = (C276544tV) DbW.A0e(r4);
        C307786Rm r2 = (C307786Rm) r4.A02();
        if (r3 == null || !((i = r3.A04) == 13616 || i == 13697)) {
            throw AnonymousClass7TE.A0w("Incorrect component type for bk.action.search_bar.GetText");
        }
        C48238EbJ ebJ = (C48238EbJ) C307476Qg.A06(r2, r3);
        if (ebJ == null || (str = ebJ.A02) == null) {
            return "";
        }
        return str;
    }
}
