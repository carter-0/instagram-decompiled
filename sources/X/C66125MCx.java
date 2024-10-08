package X;

import androidx.paging.PagingConfig;
import androidx.paging.PagingSource;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(message = "PagedList is deprecated and has been replaced by PagingData")
/* renamed from: X.MCx  reason: case insensitive filesystem */
public abstract class C66125MCx<T> extends AbstractList<T> {
    public Runnable A00;
    public final C62957Kp9 A01;
    public final MCy A02;
    public final PagingSource A03;
    public final List A04 = AnonymousClass7TE.A1C();
    public final List A05 = AnonymousClass7TE.A1C();
    public final AnonymousClass4CZ A06;
    public final C262224Cq A07;

    public final void A05(C54724HQd hQd) {
        0qQ.A0B(hQd, 0);
        List list = this.A04;
        018.A1A(list, MN9.A00);
        list.add(C51965G9l.A0v(hQd));
    }

    public final Object A00() {
        if (this instanceof C60338Jjj) {
            return ((C60338Jjj) this).A00.A00();
        }
        C60339Jjk jjk = (C60339Jjk) this;
        MCy mCy = jjk.A02;
        0qQ.A0B(jjk.A01, 0);
        List list = mCy.A06;
        if (!list.isEmpty()) {
            List A0a = 00k.A0a(list);
            0qQ.A0C(A0a, "null cannot be cast to non-null type kotlin.collections.List<androidx.paging.PagingSource.LoadResult.Page<kotlin.Any, T of androidx.paging.PagedStorage>>");
            int i = mCy.A02;
            jjk.A05.A05(new C63967LFt(new PagingConfig(15, 15, 45, true), Integer.valueOf(mCy.A00 + i), A0a, i));
        }
        return jjk.A06;
    }

    public final void A01(int i) {
        if (i < 0 || i >= size()) {
            throw new IndexOutOfBoundsException(002.A02(i, size(), "Index: ", ", Size: "));
        }
        MCy mCy = this.A02;
        mCy.A00 = C229632nm.A03(i - mCy.A02, 0, mCy.A04 - 1);
        if (!(this instanceof C60338Jjj)) {
            C60339Jjk jjk = (C60339Jjk) this;
            MCy mCy2 = jjk.A02;
            int i2 = mCy2.A02;
            int i3 = 15 - (i - i2);
            int i4 = ((i + 15) + 1) - (i2 + mCy2.A04);
            int max = Math.max(i3, jjk.A03);
            jjk.A03 = max;
            if (max > 0) {
                LS9 ls9 = jjk.A04;
                C63569KzI kzI = ls9.A00.A02;
                if ((kzI instanceof C60332Jjb) && !kzI.A00) {
                    LS9.A01(ls9);
                }
            }
            int max2 = Math.max(i4, jjk.A00);
            jjk.A00 = max2;
            if (max2 > 0) {
                LS9 ls92 = jjk.A04;
                C63569KzI kzI2 = ls92.A00.A00;
                if ((kzI2 instanceof C60332Jjb) && !kzI2.A00) {
                    LS9.A00(ls92);
                }
            }
            jjk.A02 = Math.min(jjk.A02, i);
            jjk.A01 = Math.max(jjk.A01, i);
        }
    }

    public final void A02(int i, int i2) {
        if (i2 != 0) {
            Iterator it = 00k.A0Y(this.A04).iterator();
            while (it.hasNext()) {
                C54724HQd hQd = (C54724HQd) JTR.A10(it);
                if (hQd != null) {
                    hQd.A00(i, i2);
                }
            }
        }
    }

    public final void A03(int i, int i2) {
        if (i2 != 0) {
            Iterator it = 00k.A0Y(this.A04).iterator();
            while (it.hasNext()) {
                C54724HQd hQd = (C54724HQd) JTR.A10(it);
                if (hQd != null) {
                    hQd.A01(i, i2);
                }
            }
        }
    }

    public final void A04(C63569KzI kzI, C62448Kfy kfy) {
        if (this instanceof C60339Jjk) {
            0qQ.A0B(kfy, 0);
            ((C60339Jjk) this).A04.A00.A01(kzI, kfy);
        }
    }

    public final void A06(0sL r4) {
        if (!(this instanceof C60338Jjj)) {
            LEy lEy = ((C60339Jjk) this).A04.A00;
            r4.invoke(C62448Kfy.REFRESH, lEy.A01);
            r4.invoke(C62448Kfy.PREPEND, lEy.A02);
            r4.invoke(C62448Kfy.APPEND, lEy.A00);
        }
    }

    public final boolean A07() {
        if (this instanceof C60338Jjj) {
            return true;
        }
        return ((C60339Jjk) this).A04.A03.get();
    }

    public final Object get(int i) {
        return this.A02.get(i);
    }

    public final /* bridge */ int size() {
        return this.A02.size();
    }

    public C66125MCx(C62957Kp9 kp9, MCy mCy, PagingSource pagingSource, AnonymousClass4CZ r5, C262224Cq r6) {
        AnonymousClass7TG.A1U(pagingSource, r6, r5);
        0qQ.A0B(kp9, 5);
        this.A03 = pagingSource;
        this.A07 = r6;
        this.A06 = r5;
        this.A02 = mCy;
        this.A01 = kp9;
    }

    public final /* bridge */ Object remove(int i) {
        return super.remove(i);
    }
}
