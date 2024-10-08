package X;

public final class IP6 implements C229222n2 {
    public final int A00;
    public final String A01;

    public IP6(String str, int i) {
        this.A00 = i;
        this.A01 = str;
    }

    public final String BK2(AnonymousClass30Y r3) {
        StringBuilder A0l;
        Integer num;
        String str;
        Object obj;
        Integer num2;
        Object obj2;
        switch (this.A00) {
            case 0:
                0qQ.A0B(r3, 0);
                return 002.A0R(C51966G9m.A1E(r3.A03), this.A01);
            case 1:
                A0l = C51975G9x.A0l(r3);
                A0l.append(this.A01);
                0eP r0 = (0eP) r3.A03;
                if (r0 == null || (obj = r0.A00) == null) {
                    num = null;
                } else {
                    num = C51969G9p.A0q(obj);
                }
                A0l.append(num);
                str = "_recommended_account_card_";
                break;
            default:
                A0l = C51975G9x.A0l(r3);
                A0l.append(this.A01);
                0eP r02 = (0eP) r3.A03;
                if (r02 == null || (obj2 = r02.A00) == null) {
                    num2 = null;
                } else {
                    num2 = C51969G9p.A0q(obj2);
                }
                A0l.append(num2);
                str = "_recommended_user_";
                break;
        }
        A0l.append(str);
        return AnonymousClass7TF.A0l(r3.A05, A0l);
    }
}
