package X;

/* renamed from: X.MuT  reason: case insensitive filesystem */
public final class C67769MuT extends C252303ot {
    public final int A00;

    public C67769MuT(int i) {
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ boolean areContentsTheSame(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
            case 2:
                AnonymousClass7TG.A1N(obj, obj2);
                return obj.equals(obj2);
            case 1:
                N4R n4r = (N4R) obj;
                N4R n4r2 = (N4R) obj2;
                AnonymousClass7TG.A1N(n4r, n4r2);
                return 0qQ.A0K(n4r.A04(), n4r2.A04());
            default:
                AnonymousClass7TG.A1N(obj, obj2);
                return obj.equals(obj2);
        }
    }

    public final /* bridge */ /* synthetic */ boolean areItemsTheSame(Object obj, Object obj2) {
        String A03;
        String A032;
        switch (this.A00) {
            case 0:
                Object obj3 = (C74240PrT) obj;
                Object obj4 = (C74240PrT) obj2;
                AnonymousClass7TG.A1N(obj3, obj4);
                if ((obj3 instanceof N8C) && (obj4 instanceof N8C)) {
                    obj3 = ((N8C) obj3).A00.A06;
                    obj4 = ((N8C) obj4).A00.A06;
                }
                return 0qQ.A0K(obj3, obj4);
            case 1:
                N4R n4r = (N4R) obj;
                N4R n4r2 = (N4R) obj2;
                AnonymousClass7TG.A1N(n4r, n4r2);
                A03 = n4r.A03();
                A032 = n4r2.A03();
                break;
            case 2:
                Object obj5 = (C66415MQv) obj;
                Object obj6 = (C66415MQv) obj2;
                boolean A1U = AnonymousClass7TF.A1U(0, obj5, obj6);
                if ((C61228JzM.A00(0, obj5) && C61228JzM.A00(0, obj6)) || (C61228JzM.A00(A1U ? 1 : 0, obj5) && C61228JzM.A00(A1U, obj6))) {
                    obj5 = ((C61228JzM) obj5).A01;
                    obj6 = ((C61228JzM) obj6).A01;
                }
                return 0qQ.A0K(obj5, obj6);
            default:
                C68295N9i n9i = (C68295N9i) obj;
                C68295N9i n9i2 = (C68295N9i) obj2;
                AnonymousClass7TG.A1N(n9i, n9i2);
                A03 = n9i.A0D;
                A032 = n9i2.A0D;
                break;
        }
        return 0qQ.A0K(A03, A032);
    }
}
