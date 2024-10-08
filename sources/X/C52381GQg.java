package X;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState;

/* renamed from: X.GQg  reason: case insensitive filesystem */
public abstract class C52381GQg {
    public static final void A00(LazyListState lazyListState, C286575Wy r7, C62320sa r8) {
        A01(lazyListState, r7, r8, 0, 0, 1);
    }

    public static final void A01(LazyListState lazyListState, C286575Wy r11, C62320sa r12, int i, int i2, int i3) {
        int i4;
        LazyListState lazyListState2 = lazyListState;
        C62320sa r6 = r12;
        int i5 = i;
        DbY.A1S(lazyListState, r12);
        C286575Wy r2 = r11;
        r11.ExV(-1768530169);
        int i6 = i3;
        int i7 = i2;
        if ((Integer.MIN_VALUE & i3) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = G9t.A0O(r11, lazyListState) | i2;
        } else {
            i4 = i2;
        }
        int i8 = i3 & 1;
        if (i8 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= G9t.A06(r11, i);
        }
        if ((i3 & 2) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= G9t.A0G(r11, r12);
        }
        if ((i4 & 147) != 146 || !r11.Bwn()) {
            if (i8 != 0) {
                i5 = 5;
            }
            if (0fL.A02()) {
                0fL.A01(-1284798676, "com.instagram.compose.ui.loading.AutoLoadMore (AutoLoadMore.kt:37)");
            }
            if (i5 >= 0) {
                C284945Oz A00 = C287175Zh.A00(r11, r12);
                Integer valueOf = Integer.valueOf(i5);
                boolean A1U = C51968G9o.A1U(r11, A00, C51968G9o.A1S(i4), C51973G9u.A1N(r11, -869089739, i4));
                Object ECw = r11.ECw();
                if (A1U || ECw == AnonymousClass5XT.A00) {
                    ECw = new JTZ(lazyListState2, A00, (AnonymousClass4D7) null, i5, 3);
                    r2.FLL(ECw);
                }
                C51972G9s.A10(r2, ECw, valueOf);
                if (0fL.A02()) {
                    0fL.A00(-1891421840);
                }
            } else {
                throw AnonymousClass7TE.A0w("loadMoreThreshold must be positive");
            }
        } else {
            r11.Evl();
        }
        C286625Xd ASQ = r2.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J8Q(lazyListState2, r6, i5, i7, i6, 1);
        }
    }

    public static final void A03(LazyGridState lazyGridState, C286575Wy r12, C62320sa r13, int i, int i2, int i3) {
        int i4;
        int i5 = i;
        LazyGridState lazyGridState2 = lazyGridState;
        C62320sa r6 = r13;
        int A02 = DbW.A02(0, lazyGridState, r13);
        C286575Wy r2 = r12;
        r12.ExV(408448863);
        int i6 = i3;
        int i7 = i2;
        if ((Integer.MIN_VALUE & i3) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = G9t.A0O(r12, lazyGridState) | i2;
        } else {
            i4 = i2;
        }
        int i8 = i6 & 1;
        if (i8 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= G9t.A06(r12, i);
        }
        if ((i6 & 2) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= G9t.A0G(r12, r13);
        }
        if ((i4 & 147) != 146 || !r12.Bwn()) {
            if (i8 != 0) {
                i5 = 5;
            }
            if (0fL.A02()) {
                0fL.A01(-25488611, "com.instagram.compose.ui.loading.AutoLoadMore (AutoLoadMore.kt:72)");
            }
            if (i5 >= 0) {
                C284945Oz A00 = C287175Zh.A00(r12, r13);
                Integer valueOf = Integer.valueOf(i5);
                boolean A1U = C51968G9o.A1U(r12, A00, C51968G9o.A1S(i4), C51973G9u.A1N(r12, -869053003, i4));
                Object ECw = r12.ECw();
                if (A1U || ECw == AnonymousClass5XT.A00) {
                    ECw = new JTZ(lazyGridState2, A00, (AnonymousClass4D7) null, i5, 4);
                    r2.FLL(ECw);
                }
                C51972G9s.A0z(r2, ECw, valueOf);
                if (0fL.A02()) {
                    0fL.A00(387924209);
                }
            } else {
                throw AnonymousClass7TE.A0w("loadMoreThreshold must be positive");
            }
        } else {
            r12.Evl();
        }
        C286625Xd ASQ = r2.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J8Q(lazyGridState2, r6, i5, i7, i6, A02);
        }
    }

    public static final void A04(LazyStaggeredGridState lazyStaggeredGridState, C286575Wy r12, C62320sa r13, int i, int i2, int i3) {
        int i4;
        boolean z;
        LazyStaggeredGridState lazyStaggeredGridState2 = lazyStaggeredGridState;
        C62320sa r7 = r13;
        int i5 = i;
        DbY.A1S(lazyStaggeredGridState, r13);
        C286575Wy r2 = r12;
        r12.ExV(1685274999);
        int i6 = i3;
        int i7 = i2;
        if ((Integer.MIN_VALUE & i3) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = C51970G9q.A05(G9t.A1T(r12, lazyStaggeredGridState, i2) ? 1 : 0) | i2;
        } else {
            i4 = i2;
        }
        int i8 = i3 & 1;
        if (i8 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= G9t.A06(r12, i);
        }
        if ((i3 & 2) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= G9t.A0G(r12, r13);
        }
        if ((i4 & 147) != 146 || !r12.Bwn()) {
            if (i8 != 0) {
                i5 = 5;
            }
            if (0fL.A02()) {
                0fL.A01(-51873411, "com.instagram.compose.ui.loading.AutoLoadMore (AutoLoadMore.kt:93)");
            }
            if (i5 >= 0) {
                C284945Oz A00 = C287175Zh.A00(r12, r13);
                Integer valueOf = Integer.valueOf(i5);
                r12.ExS(-869026859);
                if ((i4 & 14) == 4 || ((i4 & 8) != 0 && r12.AGw(lazyStaggeredGridState))) {
                    z = true;
                } else {
                    z = false;
                }
                boolean A1U = C51968G9o.A1U(r12, A00, C51968G9o.A1S(i4), z);
                Object ECw = r12.ECw();
                if (A1U || ECw == AnonymousClass5XT.A00) {
                    ECw = new JTZ(lazyStaggeredGridState2, A00, (AnonymousClass4D7) null, i5, 5);
                    r2.FLL(ECw);
                }
                C51972G9s.A10(r2, ECw, valueOf);
                if (0fL.A02()) {
                    0fL.A00(972357662);
                }
            } else {
                throw AnonymousClass7TE.A0w("loadMoreThreshold must be positive");
            }
        } else {
            r12.Evl();
        }
        C286625Xd ASQ = r2.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J8Q(lazyStaggeredGridState2, r7, i5, i7, i6, 3);
        }
    }

    public static final void A02(LazyListState lazyListState, C286575Wy r7, C62320sa r8, C62320sa r9, int i) {
        int i2;
        AnonymousClass7TG.A1T(lazyListState, r8, r9);
        r7.ExV(124121991);
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r7, lazyListState) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r7, r8);
        }
        if ((i & 384) == 0) {
            i2 |= G9t.A0G(r7, r9);
        }
        if ((i2 & 147) != 146 || !r7.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(511858399, "com.instagram.compose.ui.loading.AutoLoadMorePrevious (AutoLoadMore.kt:58)");
            }
            Object A0m = C51967G9n.A0m(r7, -935238070);
            Object obj = AnonymousClass5XT.A00;
            if (A0m == obj) {
                A0m = C51969G9p.A0R(r7, new GNG(23, r8, lazyListState));
            }
            C286565Wx A0G = C51965G9l.A0G(r7);
            if (C51971G9r.A1X((C270284gU) A0m)) {
                C60340gF r3 = C60340gF.A00;
                boolean A1P = C51973G9u.A1P(r7, -935232202, i2);
                Object ECw = r7.ECw();
                if (A1P || ECw == obj) {
                    ECw = new MG0(r9, (AnonymousClass4D7) null, 5);
                    r7.FLL(ECw);
                }
                C286565Wx.A0I(A0G);
                C286645Xf.A04(r7, r3, (0sL) ECw);
            }
            if (0fL.A02()) {
                0fL.A00(-1821454393);
            }
        } else {
            r7.Evl();
        }
        C286625Xd ASQ = r7.ASQ();
        if (ASQ != null) {
            ASQ.A06 = JGN.A01(lazyListState, r8, r9, i, 19);
        }
    }
}
