package X;

import androidx.paging.PagingSource;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public final class LS9 {
    public LEy A00 = new C60337Jji(this);
    public final C66369MPa A01;
    public final PagingSource A02;
    public final AtomicBoolean A03 = JTQ.A0k();
    public final AnonymousClass4CZ A04;
    public final AnonymousClass4CZ A05;
    public final C262224Cq A06;
    public final MPZ A07;
    public final C62957Kp9 A08;

    public LS9(MPZ mpz, C66369MPa mPa, C62957Kp9 kp9, PagingSource pagingSource, AnonymousClass4CZ r6, AnonymousClass4CZ r7, C262224Cq r8) {
        0qQ.A0B(mpz, 7);
        this.A06 = r8;
        this.A08 = kp9;
        this.A02 = pagingSource;
        this.A05 = r6;
        this.A04 = r7;
        this.A01 = mPa;
        this.A07 = mpz;
    }

    public static final void A00(LS9 ls9) {
        Object obj;
        LS9 ls92 = ls9;
        MCy mCy = (MCy) ls9.A07;
        if ((!mCy.A05 || mCy.A01 > 0) && (obj = ((C60347Jjs) 00k.A0K(mCy.A06)).A02) != null) {
            LEy lEy = ls9.A00;
            C62448Kfy kfy = C62448Kfy.APPEND;
            lEy.A01(C60334Jjd.A00, kfy);
            C60342Jjn jjn = new C60342Jjn(15, obj, true);
            1Eo.A05(ls9.A04, new MHG((AnonymousClass4D7) null, (Object) ls92, (Object) kfy, (Object) jjn, 7), ls9.A06);
            return;
        }
        C62448Kfy kfy2 = C62448Kfy.APPEND;
        C60347Jjs jjs = C60347Jjs.A05;
        0qQ.A0C(jjs, "null cannot be cast to non-null type androidx.paging.PagingSource.LoadResult.Page<Key of androidx.paging.PagingSource.LoadResult.Page.Companion.empty, Value of androidx.paging.PagingSource.LoadResult.Page.Companion.empty>");
        A02(ls9, kfy2, jjs);
    }

    public static final void A01(LS9 ls9) {
        Object obj;
        LS9 ls92 = ls9;
        MCy mCy = (MCy) ls9.A07;
        if ((!mCy.A05 || mCy.A02 + mCy.A03 > 0) && (obj = ((C60347Jjs) 00k.A0I(mCy.A06)).A03) != null) {
            LEy lEy = ls9.A00;
            C62448Kfy kfy = C62448Kfy.PREPEND;
            lEy.A01(C60334Jjd.A00, kfy);
            C60343Jjo jjo = new C60343Jjo(15, obj, true);
            1Eo.A05(ls9.A04, new MHG((AnonymousClass4D7) null, (Object) ls92, (Object) kfy, (Object) jjo, 7), ls9.A06);
            return;
        }
        C62448Kfy kfy2 = C62448Kfy.PREPEND;
        C60347Jjs jjs = C60347Jjs.A05;
        0qQ.A0C(jjs, "null cannot be cast to non-null type androidx.paging.PagingSource.LoadResult.Page<Key of androidx.paging.PagingSource.LoadResult.Page.Companion.empty, Value of androidx.paging.PagingSource.LoadResult.Page.Companion.empty>");
        A02(ls9, kfy2, jjs);
    }

    public static final void A02(LS9 ls9, C62448Kfy kfy, C60347Jjs jjs) {
        int size;
        C60332Jjb jjb;
        if (!ls9.A03.get()) {
            C60339Jjk jjk = (C60339Jjk) ls9.A01;
            boolean A1U = AnonymousClass7TF.A1U(0, kfy, jjs);
            List list = jjs.A04;
            MCy mCy = jjk.A02;
            if (kfy == C62448Kfy.APPEND) {
                int size2 = list.size();
                if (size2 != 0) {
                    mCy.A06.add(jjs);
                    int i = mCy.A04 + size2;
                    mCy.A04 = i;
                    int i2 = mCy.A01;
                    int min = Math.min(i2, size2);
                    int i3 = size2 - min;
                    if (min != 0) {
                        mCy.A01 = i2 - min;
                    }
                    int i4 = (mCy.A02 + i) - size2;
                    jjk.A02(i4, min);
                    jjk.A03(i4 + min, i3);
                }
                size = jjk.A00 - list.size();
                jjk.A00 = size;
            } else if (kfy == C62448Kfy.PREPEND) {
                int size3 = list.size();
                if (size3 != 0) {
                    mCy.A06.add(0, jjs);
                    mCy.A04 += size3;
                    int i5 = mCy.A02;
                    int min2 = Math.min(i5, size3);
                    int i6 = size3 - min2;
                    if (min2 != 0) {
                        i5 -= min2;
                        mCy.A02 = i5;
                    }
                    mCy.A03 -= i6;
                    jjk.A02(i5, min2);
                    jjk.A03(0, i6);
                    jjk.A02 += i6;
                    jjk.A01 += i6;
                }
                size = jjk.A03 - list.size();
                jjk.A03 = size;
            } else {
                throw C51973G9u.A0g(kfy, "unexpected result type ", AnonymousClass7TE.A1A());
            }
            if (size <= 0 || !AnonymousClass7TE.A1b(list)) {
                LEy lEy = ls9.A00;
                if (list.isEmpty()) {
                    jjb = C60332Jjb.A00;
                } else {
                    jjb = C60332Jjb.A01;
                }
                lEy.A01(jjb, kfy);
            } else if (kfy.ordinal() != A1U) {
                A00(ls9);
            } else {
                A01(ls9);
            }
        }
    }
}
