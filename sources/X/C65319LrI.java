package X;

/* renamed from: X.LrI  reason: case insensitive filesystem */
public final class C65319LrI implements C229132mt {
    public final int A00;
    public final Object A01;

    public C65319LrI(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void ACw() {
        C262224Cq r5;
        0sL r4;
        AnonymousClass0eM r0;
        String str;
        switch (this.A00) {
            case 0:
                2YL A0H = DbS.A0H(((K89) this.A01).A02);
                r5 = C318116oQ.A00(A0H);
                r4 = new MHA(A0H, (AnonymousClass4D7) null, 26);
                break;
            case 1:
                K8G k8g = (K8G) this.A01;
                2YL A0H2 = DbS.A0H(k8g.A09);
                String A012 = C320236s2.A01(k8g.requireArguments(), "arg_media_id");
                r5 = C51975G9x.A0R(A0H2, A012);
                r4 = new MGE(A0H2, A012, (AnonymousClass4D7) null, 7);
                break;
            case 2:
                ((C61364K4g) this.A01).A0B().A01();
                return;
            case 3:
                C61448K8c k8c = (C61448K8c) this.A01;
                if (k8c.A00 != null && !k8c.A03) {
                    k8c.A03 = true;
                    r5 = DbV.A0J(k8c);
                    r4 = new MH8((Object) k8c, (AnonymousClass4D7) null, 25);
                    break;
                } else {
                    return;
                }
                break;
            case 4:
                r0 = ((C61414K6l) this.A01).A0B;
                break;
            case 5:
                r0 = ((C61415K6m) this.A01).A0F;
                break;
            case 6:
                C64516LdI ldI = ((C64534Ldb) this.A01).A00;
                if (ldI == null) {
                    throw AnonymousClass7TE.A0z("mDelegate could not be null when scroll down");
                } else if (ldI.A03 != AnonymousClass05K.A01) {
                    return;
                } else {
                    if (ldI.A06 != null) {
                        ldI.A03 = AnonymousClass05K.A0C;
                        C64516LdI.A01(ldI);
                        return;
                    }
                    throw AnonymousClass7TE.A0z("selectedOptions could not be null when on scroll load more");
                }
            case 7:
                ((C60330JjZ) ((K70) this.A01).A0P.getValue()).CgO();
                return;
            case 8:
                ((C65512Lua) this.A01).A04.ACw();
                return;
            case 9:
                K7b.A01((K7b) this.A01);
                return;
            case 10:
                2YL A0H3 = DbS.A0H(((C61427K7c) this.A01).A0L);
                r5 = C318116oQ.A00(A0H3);
                r4 = new MG3((Object) A0H3, (AnonymousClass4D7) null, 27);
                break;
            case 11:
                LN7 ln7 = (LN7) ((C60209JhS) ((C15356Ub7) this.A01).A0I.getValue()).A02.getValue();
                Integer num = ((Jv4) ln7.A08.getValue()).A02;
                Integer num2 = AnonymousClass05K.A00;
                if (num == num2) {
                    JTO.A1Y(num2, new MG5(ln7, (AnonymousClass4D7) null, 16), ln7.A07);
                    return;
                }
                return;
            default:
                C61428K7d k7d = (C61428K7d) this.A01;
                String str2 = k7d.A08;
                if (str2 == null) {
                    str = "mediaId";
                } else {
                    LFJ lfj = k7d.A02;
                    if (lfj == null) {
                        str = "interactor";
                    } else {
                        lfj.A01(str2, false, k7d.A07);
                        return;
                    }
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
        }
        C60252Ji9 ji9 = (C60252Ji9) r0.getValue();
        05G r2 = ji9.A02.A03;
        r5 = C318116oQ.A00(ji9);
        r4 = new C66188MGz((Object) r2, (Object) ji9, (AnonymousClass4D7) null, 0);
        AnonymousClass7TE.A1Z(r4, r5);
    }
}
