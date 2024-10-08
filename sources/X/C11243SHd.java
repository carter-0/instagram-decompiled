package X;

/* renamed from: X.SHd  reason: case insensitive filesystem */
public final class C11243SHd {
    public static final C11243SHd A05 = new C11243SHd(C269434f7.A03, Object.class, (Class) null, (Class) null, false);
    public final C269434f7 A00;
    public final Class A01;
    public final Class A02;
    public final Class A03;
    public final boolean A04;

    public C11243SHd(C269434f7 r1, Class cls, Class cls2, Class cls3, boolean z) {
        this.A00 = r1;
        this.A03 = cls;
        this.A01 = cls2;
        this.A04 = z;
        this.A02 = cls3 == null ? C12436SuR.class : cls3;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ObjectIdInfo: propName=");
        A1A.append(this.A00);
        A1A.append(", scope=");
        A1A.append(C269574fL.A06(this.A03));
        A1A.append(", generatorType=");
        A1A.append(C269574fL.A06(this.A01));
        A1A.append(", alwaysAsId=");
        A1A.append(this.A04);
        return A1A.toString();
    }
}
