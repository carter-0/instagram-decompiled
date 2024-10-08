package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public final class OW9 {
    public View A00;
    public View A01;
    public RecyclerView A02;
    public C72970PRd A03;
    public boolean A04;
    public List A05 = 0sn.A00;
    public boolean A06;
    public final Context A07;
    public final AnonymousClass2t9 A08;
    public final C70482O8h A09;
    public final C70747OJt A0A;
    public final C70483O8i A0B;
    public final C70748OJu A0C;
    public final C70484O8j A0D = new C70484O8j(this);

    public static final void A00(OW9 ow9) {
        C252553pI r0;
        ArrayList A1D = AnonymousClass7TE.A1D(ow9.A05);
        if (ow9.A06) {
            A1D.add(new Object());
        }
        float f = 0.4f;
        if (ow9.A04) {
            f = 1.0f;
        }
        A1D.add(new NPI(f));
        C72970PRd pRd = ow9.A03;
        if (pRd == null) {
            0qQ.A0F("directVisualTimelineScrollController");
            throw AnonymousClass00P.createAndThrow();
        }
        boolean A1b = AnonymousClass7TE.A1b(pRd.A03);
        pRd.A03 = A1D;
        if (A1b && pRd.A01 == -1) {
            ListIterator A18 = C51968G9o.A18(A1D);
            while (true) {
                if (!A18.hasPrevious()) {
                    break;
                } else if (A18.previous() instanceof NPI) {
                    int nextIndex = A18.nextIndex();
                    if (nextIndex != -1 && (r0 = pRd.A09.A0D) != null) {
                        r0.A1O(nextIndex);
                    }
                }
            }
            pRd.A01 = -1;
            pRd.A00 = 0.0f;
        }
        JTR.A1L(ow9.A08, A1D);
    }

    public final void A01() {
        String str;
        View view = this.A00;
        if (view == null) {
            str = "playIndicator";
        } else {
            view.setVisibility(0);
            C72970PRd pRd = this.A03;
            if (pRd == null) {
                str = "directVisualTimelineScrollController";
            } else {
                boolean z = pRd.A04;
                C70748OJu oJu = this.A0C;
                if (z) {
                    C68445NIi.A01(oJu.A00);
                    return;
                } else {
                    oJu.A00();
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.2tF, java.lang.Object] */
    public OW9(Context context, C70482O8h o8h, C70747OJt oJt, C70483O8i o8i, C70748OJu oJu) {
        this.A07 = context;
        this.A09 = o8h;
        this.A0A = oJt;
        this.A0B = o8i;
        this.A0C = oJu;
        AnonymousClass2tC A002 = AnonymousClass2t9.A00(context);
        A002.A01(new NO9(oJt));
        A002.A01(new NO8(o8h));
        this.A08 = DbU.A0U(A002, new Object());
    }

    public final void A02(List list) {
        boolean z;
        String str;
        C69618Np0 ncW;
        ArrayList<C68167N3h> A1C = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (true) {
            z = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((C68167N3h) next).A0K != null) {
                A1C.add(next);
            }
        }
        ArrayList A0r = AnonymousClass7TG.A0r(A1C);
        for (C68167N3h n3h : A1C) {
            if (AnonymousClass7TF.A1W(n3h.A0B, 1iA.A0a)) {
                ncW = new NcX(DbY.A04(n3h.A0F));
            } else {
                ImageUrl imageUrl = n3h.A04;
                if (imageUrl != null) {
                    str = imageUrl.getUrl();
                } else {
                    str = null;
                }
                ncW = new C68995NcW(str);
            }
            A0r.add(new C68188N5d(ncW, n3h.A01()));
        }
        this.A05 = AnonymousClass7TE.A1D(A0r);
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (((C68167N3h) it2.next()).A0K == null) {
                        break;
                    }
                } else {
                    break;
                }
            }
            this.A06 = z;
            A00(this);
        }
        z = false;
        this.A06 = z;
        A00(this);
    }
}
