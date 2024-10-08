package X;

/* renamed from: X.KzE  reason: case insensitive filesystem */
public abstract class C63565KzE {
    public static final C270214gN A00;
    public static final C270214gN A01;
    public static final C270214gN A02;
    public static final C270214gN A03;

    static {
        C69414Nku nku = C69414Nku.A0C;
        A02 = new C270214gN(nku, "6", "na", "pending media not found", false, false);
        A00 = new C270214gN(nku, "6", "na", "pending media failure", false, true);
        A01 = new C270214gN(nku, "6", "na", "pending media never in progress failure", false, true);
        A03 = new C270214gN(nku, "6", "na", "pending media permanent failure", false, false);
    }
}
