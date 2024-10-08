package X;

public final class Mf5 implements C3032668b {
    public final C67282MlH A00;

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        Object[] objArr = (Object[]) obj;
        int length = objArr.length;
        if (length == 8) {
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            Object obj4 = objArr[2];
            Object obj5 = objArr[3];
            Object obj6 = objArr[4];
            Object obj7 = objArr[5];
            Object obj8 = objArr[6];
            C257443xP r5 = (C257443xP) obj2;
            2EM r6 = (2EM) obj3;
            boolean A1a = AnonymousClass7TE.A1a(obj4);
            boolean A1a2 = AnonymousClass7TE.A1a(obj5);
            boolean A1a3 = AnonymousClass7TE.A1a(obj6);
            boolean A1a4 = AnonymousClass7TE.A1a(obj7);
            C254743sy r8 = (C254743sy) obj8;
            AnonymousClass7TG.A1N(r5, r6);
            0qQ.A0B(r8, 6);
            return new Mf6(r6, (C74549Pwi) r5.A04(), r8, A1a, A1a2, A1a3, A1a4);
        }
        throw DbW.A0a("Array of size 8 expected but got ", length);
    }

    public Mf5(C67282MlH mlH) {
        this.A00 = mlH;
    }
}
