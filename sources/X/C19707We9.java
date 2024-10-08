package X;

import com.instagram.igds.components.search.IgdsInlineSearchBox;

/* renamed from: X.We9  reason: case insensitive filesystem */
public final class C19707We9 implements G6V {
    public final int A00;
    public final Object A01;

    public C19707We9(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void Dhj() {
        String str;
        switch (this.A00) {
            case 0:
                ((EEP) this.A01).A0l.Dhj();
                return;
            case 1:
                return;
            case 2:
                C15363UbF ubF = (C15363UbF) this.A01;
                if (ubF.A0A) {
                    ubF.A0C = true;
                    C14221Ts1 ts1 = ubF.A04;
                    if (ts1 == null) {
                        str = "queuedTypeAheadManager";
                        break;
                    } else {
                        String str2 = ubF.A07;
                        0qQ.A0B(str2, 0);
                        C14221Ts1.A00(new C15050ULg(str2), ts1);
                        ubF.CLU();
                        return;
                    }
                } else {
                    return;
                }
            case 3:
                C14138TqY tqY = (C14138TqY) this.A01;
                if (tqY.A0H) {
                    C14221Ts1 ts12 = tqY.A0A;
                    if (ts12 != null) {
                        C14221Ts1.A00(tqY.A01, ts12);
                        tqY.A0l.CLU();
                        return;
                    }
                } else {
                    return;
                }
                break;
            case 4:
                ((C15286UZq) this.A01).A07().A05();
                return;
            default:
                C15401Uc7 uc7 = ((C18012Vjo) this.A01).A01.A00;
                C14221Ts1 ts13 = uc7.A04;
                String str3 = null;
                if (ts13 != null) {
                    if (!ts13.A04()) {
                        IgdsInlineSearchBox igdsInlineSearchBox = uc7.A03;
                        if (igdsInlineSearchBox != null) {
                            str3 = igdsInlineSearchBox.getSearchString();
                        }
                        String A012 = 0mp.A01(str3);
                        IgdsInlineSearchBox igdsInlineSearchBox2 = uc7.A03;
                        if (igdsInlineSearchBox2 != null) {
                            igdsInlineSearchBox2.clearFocus();
                        }
                        if (A012 == null || A012.length() == 0) {
                            X76 x76 = uc7.A05;
                            if (x76 != null) {
                                x76.AVW();
                            }
                        } else {
                            C14221Ts1 ts14 = uc7.A04;
                            if (ts14 != null) {
                                ts14.A06(A012);
                            }
                        }
                        IgdsInlineSearchBox igdsInlineSearchBox3 = uc7.A03;
                        if (igdsInlineSearchBox3 != null) {
                            igdsInlineSearchBox3.A03();
                            return;
                        }
                        return;
                    }
                    return;
                }
                break;
        }
        str = "queuedTypeaheadManager";
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
