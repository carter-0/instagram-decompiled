package X;

/* renamed from: X.Di5  reason: case insensitive filesystem */
public abstract class C46625Di5 {
    public static final C46627Di7 A00(String str) {
        for (C46627Di7 di7 : C46627Di7.A01) {
            if (0qQ.A0K(di7.toString(), str)) {
                return di7;
            }
        }
        2SK.A02(C46471DfZ.A0U, 002.A0R("Error finding DragToDismiss enum value for: ", str));
        return C46627Di7.AUTO;
    }
}
