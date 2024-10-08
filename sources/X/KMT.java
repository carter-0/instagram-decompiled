package X;

import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineTimedElementsController$scrollingLinearLayoutManager$1;
import java.util.List;

public final class KMT extends LPJ {
    public int A00;
    public int A01;
    public List A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final int A06;
    public final Context A07;
    public final LinearLayout A08;
    public final RecyclerView A09;
    public final UserSession A0A;
    public final C64163LRe A0B;
    public final C60434JlR A0C;
    public final ClipsStackedTimelineTimedElementsController$scrollingLinearLayoutManager$1 A0D;
    public final C62517Kh8 A0E;
    public final LBF A0F;
    public final AnonymousClass8RL A0G;
    public final AnonymousClass8RF A0H;
    public final C60108Jfo A0I;
    public final C61806KMu A0J;
    public final boolean A0K;
    public final Handler A0L;

    public KMT(Context context, LinearLayout linearLayout, UserSession userSession, LBF lbf, AnonymousClass8RL r24, AnonymousClass8RF r25, C60108Jfo jfo, C61806KMu kMu, int i, int i2, boolean z, boolean z2) {
        RecyclerView recyclerView;
        LBF lbf2 = lbf;
        0qQ.A0B(lbf2, 10);
        UserSession userSession2 = userSession;
        this.A0A = userSession2;
        Context context2 = context;
        this.A07 = context2;
        C60108Jfo jfo2 = jfo;
        this.A0I = jfo2;
        this.A0H = r25;
        this.A0G = r24;
        this.A0J = kMu;
        this.A01 = i;
        boolean z3 = z;
        this.A0K = z3;
        LinearLayout linearLayout2 = linearLayout;
        this.A08 = linearLayout2;
        this.A0F = lbf2;
        int i3 = i2;
        this.A06 = i3;
        View inflate = LayoutInflater.from(context2).inflate(R.layout.layout_timedelements_recyclerview, linearLayout2, false);
        if (inflate instanceof RecyclerView) {
            recyclerView = (RecyclerView) inflate;
        } else {
            recyclerView = null;
        }
        this.A09 = recyclerView;
        C60434JlR jlR = new C60434JlR(context2, new MIW(jfo2, 68), i3, z2, jfo2.A0l);
        this.A0C = jlR;
        this.A0E = C62517Kh8.TIMED_ELEMENTS_TRACK;
        this.A04 = true;
        ClipsStackedTimelineTimedElementsController$scrollingLinearLayoutManager$1 clipsStackedTimelineTimedElementsController$scrollingLinearLayoutManager$1 = new ClipsStackedTimelineTimedElementsController$scrollingLinearLayoutManager$1(context2, this);
        this.A0D = clipsStackedTimelineTimedElementsController$scrollingLinearLayoutManager$1;
        this.A00 = -1;
        UserSession userSession3 = userSession2;
        this.A0B = new C64163LRe(userSession3, jfo2, MMB.A00(this, 39), MMB.A00(this, 40), new MIW(this, 69));
        this.A0L = new Handler(context2.getMainLooper());
        jlR.A01 = this;
        jlR.A08 = z3;
        jlR.A05 = true;
        jlR.A00 = JTO.A07(jfo2.A0E);
        jlR.notifyDataSetChanged();
        jlR.A06 = 0mk.A02(context2);
        jlR.A04 = 182.A06(0Tu.A05, userSession2, 36322169055160301L);
        if (recyclerView != null) {
            recyclerView.setLayoutManager(clipsStackedTimelineTimedElementsController$scrollingLinearLayoutManager$1);
            recyclerView.setAdapter(jlR);
            recyclerView.setItemAnimator((AnonymousClass3AS) null);
            recyclerView.A11(new C60451Jlj(jlR.A03));
            C64340LaF laF = new C64340LaF(recyclerView, new LnG(this, 1), true, true);
            laF.A02.setIsLongpressEnabled(false);
            recyclerView.A13(laF);
            A0K(context2, jfo2, MMB.A00(this, 36));
            jlR.A02 = new C65097LnK(recyclerView, this);
            linearLayout2.addView(recyclerView);
            recyclerView.setVisibility(0);
        }
        A0F();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        if (r12.A0K != false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        if (r5 < r13.size()) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0P(java.util.List r13) {
        /*
            r12 = this;
            r10 = 0
            androidx.recyclerview.widget.RecyclerView r9 = r12.A09
            r3 = 0
            if (r9 == 0) goto L_0x00f5
            X.3pI r0 = r9.A0D
            if (r0 == 0) goto L_0x00f5
            android.os.Parcelable r2 = r0.A1M()
        L_0x000e:
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineTimedElementsController$scrollingLinearLayoutManager$1 r0 = r12.A0D
            int r5 = r0.A1a()
            r0 = -1
            r8 = 1
            if (r5 == r0) goto L_0x001f
            int r1 = r13.size()
            r0 = 1
            if (r5 >= r1) goto L_0x0020
        L_0x001f:
            r0 = 0
        L_0x0020:
            r12.A05 = r0
            X.LSE r4 = X.LSE.A00
            android.content.Context r1 = r12.A07
            java.util.List r0 = r12.A02
            int r6 = r4.A02(r1, r13, r0, r5)
            X.Jfo r5 = r12.A0I
            boolean r0 = r5.A07
            if (r0 != 0) goto L_0x003d
            boolean r0 = r12.A05
            if (r0 != 0) goto L_0x003d
            if (r6 == 0) goto L_0x003d
            boolean r0 = r12.A0K
            r11 = 1
            if (r0 == 0) goto L_0x003e
        L_0x003d:
            r11 = 0
        L_0x003e:
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1D(r13)
            if (r11 == 0) goto L_0x0052
            X.018.A15(r7)
            r1 = 2147483647(0x7fffffff, float:NaN)
            X.KMD r0 = new X.KMD
            r0.<init>(r1)
            r7.add(r0)
        L_0x0052:
            X.8RF r0 = r12.A0H
            X.8RH r4 = r0.A0E()
            if (r11 == 0) goto L_0x0086
            boolean r0 = r4 instanceof X.AnonymousClass8Rc
            if (r0 == 0) goto L_0x0086
            r0 = r4
            X.8Rc r0 = (X.AnonymousClass8Rc) r0
            int r1 = r0.A01()
            int r0 = r12.A01
            if (r1 != r0) goto L_0x0086
            X.KMu r0 = r12.A0J
            X.LTY r0 = r0.A01
            int r0 = X.JTS.A03(r0)
            int r0 = r0 * 2
            int r1 = r0 + 2
            if (r9 == 0) goto L_0x007f
            X.3kE r0 = r9.A0W(r1)
            if (r0 == 0) goto L_0x007f
            android.view.View r3 = r0.itemView
        L_0x007f:
            X.JlR r0 = r12.A0C
            java.util.List r0 = r0.A03
            X.LSE.A01(r3, r7, r0, r1)
        L_0x0086:
            boolean r3 = r4 instanceof X.AnonymousClass8Rc
            if (r3 == 0) goto L_0x00d2
            r0 = r4
            X.8Rc r0 = (X.AnonymousClass8Rc) r0
            int r1 = r0.A01()
            int r0 = r12.A01
            if (r1 != r0) goto L_0x00d2
            X.JlR r1 = r12.A0C
            if (r9 == 0) goto L_0x00d0
            boolean r0 = r9.A1E()
            if (r0 != r8) goto L_0x00d0
        L_0x009f:
            r1.A02(r7, r8)
            if (r9 == 0) goto L_0x00ae
            X.3pI r0 = r9.A0D
            if (r0 == 0) goto L_0x00ab
            r0.A1P(r2)
        L_0x00ab:
            r9.scrollBy(r10, r10)
        L_0x00ae:
            if (r11 == 0) goto L_0x00cf
            int r0 = r12.A08()
            r5.A02 = r0
            float r0 = (float) r6
            r12.A0G(r0)
            if (r3 == 0) goto L_0x00cf
            X.8Rc r4 = (X.AnonymousClass8Rc) r4
            int r0 = r4.A01()
            int r2 = r12.A01
            if (r0 == r2) goto L_0x00cf
            boolean r1 = r12.A0K
            X.KMu r0 = r12.A0J
            if (r1 == 0) goto L_0x00f8
            r0.A0T(r2)
        L_0x00cf:
            return
        L_0x00d0:
            r8 = 0
            goto L_0x009f
        L_0x00d2:
            X.JlR r2 = r12.A0C
            if (r9 == 0) goto L_0x00e4
            boolean r0 = r9.A1E()
            if (r0 != r8) goto L_0x00e4
        L_0x00dc:
            r2.A03 = r7
            if (r8 != 0) goto L_0x00e6
            r2.notifyDataSetChanged()
            goto L_0x00ae
        L_0x00e4:
            r8 = 0
            goto L_0x00dc
        L_0x00e6:
            X.0eM r0 = r2.A0C
            android.os.Handler r1 = X.JTO.A0E(r0)
            X.M2z r0 = new X.M2z
            r0.<init>(r2)
            r1.post(r0)
            goto L_0x00ae
        L_0x00f5:
            r2 = r3
            goto L_0x000e
        L_0x00f8:
            r0.A0I(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KMT.A0P(java.util.List):void");
    }

    public static final void A00(KMT kmt) {
        C61786KMa kMa;
        RecyclerView recyclerView = kmt.A09;
        if (recyclerView != null && !recyclerView.A1E()) {
            int i = 0;
            for (Object next : kmt.A0C.A03) {
                int i2 = i + 1;
                if (i < 0) {
                    0sr.A1T();
                    throw AnonymousClass00P.createAndThrow();
                }
                L40 l40 = (L40) next;
                if (l40 instanceof KMF) {
                    C61194Jyn jyn = ((KMF) l40).A04;
                    if (jyn.A0A == AnonymousClass05K.A15) {
                        int i3 = kmt.A00;
                        int i4 = kmt.A06 / 2;
                        int i5 = 0;
                        if (i3 > i4) {
                            i5 = i3 - i4;
                        }
                        jyn.A00 = i5;
                        C249703kE A0W = recyclerView.A0W(i);
                        if ((A0W instanceof C61786KMa) && (kMa = (C61786KMa) A0W) != null) {
                            int i6 = kmt.A00;
                            int i7 = 0;
                            if (i6 > i4) {
                                i7 = i6 - i4;
                            }
                            TextView textView = kMa.A00;
                            DbX.A1C(textView, DbY.A01(kMa.A00) + i7, textView.getPaddingTop());
                        }
                    }
                }
                i = i2;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r2 >= r1) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.KMT r5) {
        /*
            X.Jfo r0 = r5.A0I
            java.util.ArrayList r4 = r0.A0H()
            X.JlR r3 = r5.A0C
            java.util.List r0 = r3.A03
            int r1 = r0.size()
            int r2 = r5.A00
            if (r2 < 0) goto L_0x0015
            r0 = 1
            if (r2 < r1) goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            r1 = 0
            if (r0 == 0) goto L_0x002f
            java.util.List r0 = r3.A03
            java.lang.Object r0 = X.00k.A0O(r0, r2)
            boolean r0 = r0 instanceof X.KMF
            if (r0 == 0) goto L_0x002f
            int r0 = r5.A00
            X.Jyn r0 = r3.A00(r0)
            if (r0 == 0) goto L_0x002f
            java.util.List r1 = X.C61194Jyn.A02(r0)
        L_0x002f:
            X.LRe r0 = r5.A0B
            r0.A02()
            r0.A04(r4, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KMT.A01(X.KMT):void");
    }

    public static final void A03(KMT kmt, int i, int i2) {
        C60688JpZ jpZ;
        RecyclerView recyclerView = kmt.A09;
        C249703kE r1 = null;
        if (recyclerView != null) {
            r1 = recyclerView.A0W(kmt.A00);
        }
        if ((r1 instanceof C61786KMa) && (jpZ = (C60688JpZ) r1) != null) {
            C60059Jea jea = jpZ.A01;
            jea.A0H = i;
            jea.A0G = i2;
        }
    }

    public final void A0N() {
        C60434JlR jlR = this.A0C;
        0sn r3 = 0sn.A00;
        RecyclerView recyclerView = this.A09;
        boolean z = true;
        if (recyclerView == null || !recyclerView.A1E()) {
            z = false;
        }
        jlR.A02(r3, z);
        AnonymousClass7TH.A0R(recyclerView);
        if (!jlR.A0A && !jlR.A07) {
            C60108Jfo jfo = this.A0I;
            if (!jfo.A0a() && !jfo.A0Z()) {
                jfo.A0K();
            }
        }
    }

    public final void A0O(Integer num, float f, float f2) {
        Context context;
        int i;
        int i2;
        C61194Jyn A002;
        int i3;
        int A1a = this.A0D.A1a();
        float f3 = 0.0f;
        for (int i4 = 0; i4 < A1a; i4++) {
            C60434JlR jlR = this.A0C;
            int itemViewType = jlR.getItemViewType(i4);
            int i5 = 0;
            if (itemViewType == 0) {
                context = this.A07;
                i = 0;
                if (!(i4 == 0 || i4 == jlR.getItemCount() - 1)) {
                    if (jlR.A03.isEmpty()) {
                        if (i4 == 1) {
                            i = jlR.A00;
                        }
                    } else if (!jlR.A08) {
                        int i6 = i4 % 2;
                        if (i6 == 0) {
                            C61194Jyn A003 = jlR.A00(i4);
                            if (A003 != null) {
                                i2 = A003.A05;
                            }
                            i2 = 0;
                        } else {
                            if (!(i4 == 1 || (A002 = jlR.A00(i4 - 1)) == null)) {
                                i2 = A002.A02;
                            }
                            i2 = 0;
                        }
                        if (!jlR.A08 ? i6 == 0 : i4 == 1) {
                            C61194Jyn A004 = jlR.A00(i4);
                            if (A004 != null) {
                                i3 = A004.A02;
                            }
                            i3 = 0;
                        } else if (i4 == jlR.A03.size() - 2) {
                            i3 = jlR.A00;
                        } else {
                            C61194Jyn A005 = jlR.A00(i4 + 1);
                            if (A005 != null) {
                                i3 = A005.A05;
                            }
                            i3 = 0;
                        }
                        i = i3 - i2;
                        if (i < 0) {
                            i = 0;
                        }
                    }
                }
            } else {
                if (itemViewType == 1) {
                    context = this.A07;
                    C61194Jyn A006 = jlR.A00(i4);
                    if (A006 != null) {
                        i = A006.A02 - A006.A05;
                    }
                }
                f3 -= (float) i5;
            }
            float f4 = (float) i;
            i5 = ((int) (JTS.A01(context, f2) * f4)) - ((int) (JTS.A01(context, f) * f4));
            f3 -= (float) i5;
        }
        if (num != null) {
            Context context2 = this.A07;
            float intValue = (float) num.intValue();
            f3 += (JTS.A01(context2, f2) * intValue) - (JTS.A01(context2, f) * intValue);
            this.A00 = (int) (JTS.A01(context2, f2) * intValue);
        }
        boolean z = this.A0K;
        C61806KMu kMu = this.A0J;
        if (z) {
            kMu.A0T(this.A01);
        } else {
            kMu.A0I(this.A01);
        }
        A00(this);
        A0G(f3);
    }

    public final boolean A0Q() {
        AnonymousClass8RH A0E2 = this.A0H.A0E();
        if ((A0E2 instanceof AnonymousClass8RU) || (A0E2 instanceof AnonymousClass8RW) || (A0E2 instanceof C355708Ra) || (A0E2 instanceof C355718Rb) || (A0E2 instanceof AnonymousClass8RY) || (A0E2 instanceof AnonymousClass8RV) || (A0E2 instanceof C355828Rn) || (A0E2 instanceof AnonymousClass8RX)) {
            return false;
        }
        return true;
    }

    public static final void A02(KMT kmt, int i) {
        C359548d5 r0;
        if (kmt.A0Q()) {
            C60434JlR jlR = kmt.A0C;
            if (!jlR.A0A) {
                boolean z = kmt.A0K;
                if (!z) {
                    UserSession userSession = kmt.A0A;
                    if (182.A06(AnonymousClass7TF.A0H(userSession), userSession, 36322169055094764L)) {
                        C61806KMu kMu = kmt.A0J;
                        if (kMu.A01.A0G(kmt.A01, (i - 2) / 2).A0A == AnonymousClass05K.A15) {
                            return;
                        }
                    }
                }
                kmt.A0D();
                jlR.A09 = true;
                C61806KMu kMu2 = kmt.A0J;
                LTY lty = kMu2.A01;
                C61194Jyn A0F2 = lty.A0F();
                if (A0F2 != null) {
                    C62529KhL khL = A0F2.A09;
                    C62529KhL khL2 = C62529KhL.TEXT;
                    C3501583m r1 = kMu2.A07;
                    if (khL == khL2) {
                        r0 = C359548d5.STICKER_TEXT_DRAGGED;
                    } else {
                        r0 = C359548d5.STICKER_DRAGGED;
                    }
                    r1.A01(r0);
                }
                kMu2.A0E.Epw(C62478KgT.Dragging);
                if (C51966G9m.A1a(lty.A04, LTY.A0C) && JTR.A0E(lty) == kmt.A01) {
                    kmt.A00 = (JTS.A03(lty) * 2) + 2;
                }
                kMu2.A0S();
                if (z) {
                    int i2 = kmt.A01;
                    lty.A0S(i2, true);
                    kMu2.A0T(i2);
                } else {
                    int i3 = kmt.A01;
                    lty.A0Q(i3, (i - 2) / 2, true);
                    kMu2.A0I(i3);
                }
                A01(kmt);
            }
        }
    }
}
