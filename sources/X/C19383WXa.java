package X;

import android.widget.BaseAdapter;
import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.WXa  reason: case insensitive filesystem */
public final class C19383WXa implements C230152p2 {
    public final int A00;
    public final Object A01;

    public C19383WXa(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DIh(C268654dm r5, Hashtag hashtag) {
        BaseAdapter baseAdapter;
        int i;
        switch (this.A00) {
            case 0:
                C15949UlK ulK = (C15949UlK) this.A01;
                int i2 = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
                C18767W0m.A00(ulK.A00.requireContext());
                ulK.A03(hashtag, false);
                C15949UlK.A01(ulK);
                return;
            case 1:
                UmI umI = (UmI) this.A01;
                C18767W0m.A00(umI.A01);
                C18023Vjz vjz = new C18023Vjz(hashtag);
                vjz.A09 = 0;
                vjz.A08 = 0;
                Hashtag A002 = vjz.A00();
                umI.A00 = A002;
                umI.A03.A01(A002);
                C51970G9q.A12(umI.A02);
                return;
            case 2:
                C15385Ubk ubk = (C15385Ubk) this.A01;
                C18767W0m.A00(ubk.requireContext());
                C18023Vjz vjz2 = new C18023Vjz(hashtag);
                vjz2.A08 = C51967G9n.A0k();
                ubk.A04 = vjz2.A00();
                baseAdapter = ubk.A01;
                i = 450946355;
                break;
            case 3:
                C18767W0m.A00(((Dd4) this.A01).A05);
                return;
            case 4:
                E6R e6r = (E6R) this.A01;
                C18767W0m.A00(e6r.requireContext());
                baseAdapter = e6r.A02;
                if (baseAdapter != null) {
                    i = -1336285967;
                    break;
                } else {
                    DbS.A13();
                    throw AnonymousClass00P.createAndThrow();
                }
            default:
                C15362UbE ubE = (C15362UbE) this.A01;
                C18767W0m.A00(ubE.requireContext());
                C18023Vjz vjz3 = new C18023Vjz(hashtag);
                vjz3.A08 = C51967G9n.A0k();
                Hashtag A003 = vjz3.A00();
                ubE.A04 = A003;
                ubE.A03.A01(ubE, ubE.A0F, A003);
                return;
        }
        0fE.A00(baseAdapter, i);
    }

    public final void DIk(C268654dm r5, Hashtag hashtag) {
        BaseAdapter baseAdapter;
        int i;
        switch (this.A00) {
            case 0:
                C15949UlK ulK = (C15949UlK) this.A01;
                int i2 = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
                C18767W0m.A01(ulK.A00.requireContext());
                ulK.A03(hashtag, true);
                C15949UlK.A01(ulK);
                return;
            case 1:
                UmI umI = (UmI) this.A01;
                C18767W0m.A01(umI.A01);
                C18023Vjz vjz = new C18023Vjz(hashtag);
                vjz.A09 = 1;
                vjz.A08 = 1;
                Hashtag A002 = vjz.A00();
                umI.A00 = A002;
                umI.A03.A01(A002);
                C51970G9q.A12(umI.A02);
                return;
            case 2:
                C15385Ubk ubk = (C15385Ubk) this.A01;
                C18767W0m.A00(ubk.requireContext());
                C18023Vjz vjz2 = new C18023Vjz(hashtag);
                vjz2.A08 = C13988Tno.A0R();
                ubk.A04 = vjz2.A00();
                baseAdapter = ubk.A01;
                i = 1869983347;
                break;
            case 3:
                C18767W0m.A01(((Dd4) this.A01).A05);
                return;
            case 4:
                E6R e6r = (E6R) this.A01;
                C18767W0m.A01(e6r.requireContext());
                baseAdapter = e6r.A02;
                if (baseAdapter != null) {
                    i = -1222505146;
                    break;
                } else {
                    DbS.A13();
                    throw AnonymousClass00P.createAndThrow();
                }
            default:
                C15362UbE ubE = (C15362UbE) this.A01;
                C18767W0m.A01(ubE.requireContext());
                C18023Vjz vjz3 = new C18023Vjz(hashtag);
                vjz3.A08 = C13988Tno.A0R();
                Hashtag A003 = vjz3.A00();
                ubE.A04 = A003;
                ubE.A03.A01(ubE, ubE.A0F, A003);
                return;
        }
        0fE.A00(baseAdapter, i);
    }

    public final void DIi(AnonymousClass1XT r1, Hashtag hashtag) {
    }

    public final void DIl(AnonymousClass1XT r1, Hashtag hashtag) {
    }
}
