package X;

import com.instagram.android.R;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.reels.Reel;
import com.instagram.profile.edithighlightsmigration.HighlightsMigrationFragment;
import com.instagram.reels.store.ReelStore;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.LwO  reason: case insensitive filesystem */
public final class C65588LwO implements AnonymousClass3PN {
    public final int A00;
    public final Object A01;

    public C65588LwO(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DOJ(String str) {
        AnonymousClass0eM r0;
        switch (this.A00) {
            case 0:
                r0 = ((K4G) this.A01).A04;
                break;
            case 1:
                r0 = ((K4T) this.A01).A05;
                break;
            default:
                return;
        }
        AnonymousClass3PO.A00(AnonymousClass7TE.A0l(r0)).A04(this, str);
    }

    public final void DOW(String str, boolean z) {
        String str2;
        Reel A0N;
        1Ns r0;
        ImageUrl Ary;
        1Ns r02;
        String name;
        Reel A0N2;
        Object obj;
        String str3 = str;
        switch (this.A00) {
            case 0:
                K4G k4g = (K4G) this.A01;
                AnonymousClass0eM r1 = k4g.A04;
                AnonymousClass3PO.A00(AnonymousClass7TE.A0l(r1)).A04(this, str3);
                if (str != null && (A0N = ReelStore.A03(AnonymousClass7TE.A0l(r1)).A0N(str3)) != null && (r0 = A0N.A0W) != null && (Ary = r0.Ary()) != null && (r02 = A0N.A0W) != null && (name = r02.getName()) != null) {
                    ArrayList A1C = AnonymousClass7TE.A1C();
                    Set A0Q = A0N.A0Q();
                    0qQ.A07(A0Q);
                    Iterator it = A0Q.iterator();
                    while (it.hasNext()) {
                        ImageUrl A1Q = C51966G9m.A0t(it).A1Q();
                        if (A1Q != null) {
                            A1C.add(new C61166JyI(A1Q, Ary, Integer.valueOf(R.drawable.instagram_story_pano_outline_24), name));
                        }
                    }
                    List list = k4g.A03;
                    list.addAll(A1C);
                    AnonymousClass2t9 r03 = k4g.A00;
                    if (r03 == null) {
                        str2 = "itemAdapter";
                        break;
                    } else {
                        r03.A08(list);
                        return;
                    }
                } else {
                    return;
                }
                break;
            case 1:
                K4T k4t = (K4T) this.A01;
                AnonymousClass0eM r12 = k4t.A05;
                AnonymousClass3PO.A00(AnonymousClass7TE.A0l(r12)).A04(this, str3);
                if (str != null && (A0N2 = ReelStore.A03(AnonymousClass7TE.A0l(r12)).A0N(str3)) != null) {
                    C250973mM r5 = new C250973mM(AnonymousClass7TE.A0l(r12), A0N2, false, (String) null, (String) null, 0sl.A00, -1, System.currentTimeMillis(), false);
                    List list2 = k4t.A04;
                    Iterator it2 = list2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj = it2.next();
                            if (obj instanceof C64749LhR) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    list2.add(list2.indexOf(obj), new C15072UNp(r5));
                    ViewModelListUpdate A0R = DbS.A0R();
                    A0R.A01(list2);
                    AnonymousClass2t9 r04 = k4t.A00;
                    if (r04 == null) {
                        str2 = "immersiveItemAdapter";
                        break;
                    } else {
                        r04.A05(A0R);
                        return;
                    }
                } else {
                    return;
                }
                break;
            case 2:
                if (str != null) {
                    HighlightsMigrationFragment.A01((HighlightsMigrationFragment) this.A01, str3);
                    return;
                }
                return;
            case 3:
                C60190Jh9 jh9 = (C60190Jh9) this.A01;
                Reel A0L = Dba.A0L(jh9.A00, str3);
                if (A0L != null) {
                    AnonymousClass7TE.A1Z(new C66166MGd(jh9, A0L, (AnonymousClass4D7) null, 18), C318116oQ.A00(jh9));
                    return;
                }
                return;
            default:
                return;
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }
}
