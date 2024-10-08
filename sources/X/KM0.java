package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.LruCache;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.ui.widget.filmstriptimeline.FilmstripTimelineView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class KM0 extends C60398Jkr {
    public int A00;
    public int A01 = -2;
    public L0S A02;
    public AnonymousClass8RH A03 = new AnonymousClass8RG(false);
    public AnonymousClass8HH A04;
    public List A05 = 0sn.A00;
    public 0sP A06;
    public 0sP A07 = C66337MNu.A00;
    public final ClipsCreationViewModel A08;
    public final AnonymousClass8RL A09;
    public final C3516889w A0A;
    public final AnonymousClass2Fj A0B = JTO.A0K();
    public final UserSession A0C;
    public final L0R A0D;
    public final AnonymousClass8RF A0E;

    public KM0(UserSession userSession, L0R l0r, ClipsCreationViewModel clipsCreationViewModel, AnonymousClass8RL r7, AnonymousClass8RF r8, C3516889w r9) {
        0qQ.A0B(userSession, 1);
        this.A0C = userSession;
        this.A0A = r9;
        this.A0E = r8;
        this.A08 = clipsCreationViewModel;
        this.A0D = l0r;
        this.A09 = r7;
    }

    public static final void A01(KM0 km0, int i, int i2) {
        0sh it = C229632nm.A0C(i, i2 + i).iterator();
        while (it.hasNext()) {
            int A002 = it.A00();
            int i3 = (A002 * 2) + 1;
            if (A002 == km0.A01 / 2) {
                km0.notifyItemChanged(i3);
            }
        }
    }

    public final void A07(LruCache lruCache) {
        0eP r0;
        KMM kmm;
        AnonymousClass51P r9;
        LruCache lruCache2 = lruCache;
        0qQ.A0B(lruCache2, 0);
        List list = this.A03;
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : list) {
            if ((next instanceof KMM) || (next instanceof KMK)) {
                A1C.add(next);
            }
        }
        ArrayList A0r = AnonymousClass7TG.A0r(A1C);
        Iterator it = A1C.iterator();
        while (it.hasNext()) {
            C62761Klz klz = (C62761Klz) it.next();
            0eP r13 = null;
            if (!(klz instanceof KMK)) {
                if (!(klz instanceof KMM) || (kmm = (KMM) klz) == null || (r9 = kmm.A00) == null) {
                    r0 = null;
                    0kD.A07("ThumbnailRecyclerViewAdapterV3", "video segment is null", (Throwable) null);
                } else {
                    C3516889w r8 = this.A0A;
                    String str = (String) new C377089Km(r8.A00(), 0).invoke(r9);
                    int A0M = AnonymousClass7TE.A0M(r8.A00().A05.invoke(r9));
                    C60999Juv juv = new C60999Juv((double[]) null, A0M, r8.A00().A02, r8.A00().A01, true);
                    for (int i = 0; i < A0M; i++) {
                        Bitmap bitmap = (Bitmap) lruCache2.get(new C376619Ir(str, AnonymousClass7TE.A0M(r8.A00().A07.invoke(Integer.valueOf(i), r9)), 2));
                        if (bitmap != null) {
                            juv.A00(i, bitmap);
                        }
                    }
                    r0 = AnonymousClass7TE.A1L(str, juv);
                }
                r13 = r0;
            }
            A0r.add(r13);
        }
        C232362ta A002 = C232332tX.A00(new C60354Jk2(this.A05, A0r));
        this.A05 = A0r;
        A002.A02(new C64336LaB(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0024, code lost:
        if (java.lang.Integer.valueOf(r1) != null) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08(X.AnonymousClass8RH r8) {
        /*
            r7 = this;
            r1 = 0
            X.0qQ.A0B(r8, r1)
            boolean r0 = r8 instanceof X.C355878Rs
            r3 = 3
            r4 = 0
            if (r0 == 0) goto L_0x0038
            r7.A06(r3)
            r0 = 4
            r7.A06(r0)
            r7.A06(r1)
            X.8RH r1 = r7.A03
            boolean r0 = r1 instanceof X.AnonymousClass8RX
            if (r0 == 0) goto L_0x0029
            X.8RX r1 = (X.AnonymousClass8RX) r1
            if (r1 == 0) goto L_0x0029
            int r1 = r1.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L_0x0029
        L_0x0026:
            r7.notifyItemChanged(r1)
        L_0x0029:
            r7.A03 = r8
            X.2Fj r0 = r7.A0B
            r0.A0B(r8)
            X.0sP r1 = r7.A07
            X.8RH r0 = r7.A03
            r1.invoke(r0)
            return
        L_0x0038:
            X.8RH r6 = r7.A03
            boolean r1 = r6 instanceof X.AnonymousClass8RU
            boolean r0 = r8 instanceof X.AnonymousClass8RU
            if (r1 == r0) goto L_0x0047
            int r0 = r7.A00
            int r0 = r0 * 2
            int r1 = r0 + 1
            goto L_0x0026
        L_0x0047:
            boolean r5 = r8 instanceof X.AnonymousClass8RX
            if (r5 == 0) goto L_0x0054
            r0 = r8
            X.8RX r0 = (X.AnonymousClass8RX) r0
            int r1 = r0.A00
            r0 = -1
            if (r1 == r0) goto L_0x0054
            goto L_0x0026
        L_0x0054:
            boolean r0 = r8 instanceof X.AnonymousClass8RG
            if (r0 == 0) goto L_0x006b
            boolean r0 = r6 instanceof X.AnonymousClass8RG
            if (r0 == 0) goto L_0x006b
            r0 = r6
            X.8RG r0 = (X.AnonymousClass8RG) r0
            r2 = 1
            if (r0 == 0) goto L_0x009c
            boolean r1 = r0.A00
            r0 = r8
            X.8RG r0 = (X.AnonymousClass8RG) r0
            boolean r0 = r0.A00
            if (r1 != r0) goto L_0x009c
        L_0x006b:
            if (r5 == 0) goto L_0x0029
            boolean r0 = r6 instanceof X.AnonymousClass8RX
            if (r0 == 0) goto L_0x009a
            X.8RX r6 = (X.AnonymousClass8RX) r6
            if (r6 == 0) goto L_0x009a
            int r1 = r6.A00
            r0 = -1
            boolean r0 = X.JTQ.A1O(r1, r0)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
        L_0x0080:
            r0 = r8
            X.8RX r0 = (X.AnonymousClass8RX) r0
            if (r0 == 0) goto L_0x0090
            int r1 = r0.A00
            r0 = -1
            boolean r0 = X.JTQ.A1O(r1, r0)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
        L_0x0090:
            boolean r0 = X.0qQ.A0K(r2, r4)
            if (r0 != 0) goto L_0x0029
            r7.A06(r3)
            goto L_0x0029
        L_0x009a:
            r2 = r4
            goto L_0x0080
        L_0x009c:
            r7.A06(r2)
            goto L_0x0029
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KM0.A08(X.8RH):void");
    }

    public final void onBindViewHolder(C249703kE r13, int i) {
        View view;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        AnonymousClass8RG r0;
        int i2;
        C249703kE r10 = r13;
        0qQ.A0B(r13, 0);
        if (r13 instanceof C60691Jpc) {
            C60691Jpc jpc = (C60691Jpc) r10;
            int i3 = i;
            int i4 = i / 2;
            C62761Klz klz = (C62761Klz) 00k.A0O(this.A03, i4);
            AnonymousClass51M r11 = null;
            if (klz instanceof KMM) {
                AnonymousClass51P r02 = ((KMM) klz).A00;
                if (r02 != null) {
                    r11 = r02;
                }
                int i5 = 4;
                C60999Juv juv = null;
                if (r11 == null) {
                    0kD.A07("ThumbnailRecyclerViewAdapterV3", "video segment is null", (Throwable) null);
                    return;
                }
                if (this.A01) {
                    View view2 = jpc.itemView;
                    if (i4 != this.A00) {
                        i5 = 0;
                    }
                    view2.setVisibility(i5);
                }
                this.A0A.A01(r11, new JGN(i3, 22, (Object) this, (Object) jpc, (Object) r11));
                AnonymousClass8RH r3 = this.A03;
                if (r3 instanceof AnonymousClass8RG) {
                    r0 = (AnonymousClass8RG) r3;
                } else {
                    r0 = null;
                }
                boolean z = true;
                if ((r0 == null || !r0.A00) && !(r3 instanceof AnonymousClass8RX)) {
                    z = false;
                }
                View A0F = JTO.A0F(jpc);
                int i6 = 0;
                if (z) {
                    i2 = (int) jpc.A02;
                } else {
                    i2 = 0;
                }
                0nA.A0d(A0F, i2);
                View A0F2 = JTO.A0F(jpc);
                if (z) {
                    i6 = (int) jpc.A02;
                }
                0nA.A0U(A0F2, i6);
                0eP r03 = (0eP) 00k.A0O(this.A05, i4);
                if (r03 != null) {
                    juv = (C60999Juv) r03.A01;
                }
                jpc.A01 = juv;
                A02(this, jpc, i);
                FilmstripTimelineView filmstripTimelineView = jpc.A09;
                AnonymousClass51M r6 = r11;
                int i7 = r6.A09;
                int i8 = r6.A0F.A03;
                float f = (float) (i7 - i8);
                float A002 = (float) LIC.A00(r11);
                filmstripTimelineView.A01(f / A002, ((float) (r6.A08 - i8)) / A002);
                filmstripTimelineView.setDurationSlidingAllowed(true);
                filmstripTimelineView.setShowSeekbar(false);
                filmstripTimelineView.A00 = this.A04;
                filmstripTimelineView.setTrimmerMinimumRange(100.0f / ((float) LIC.A00(r11)));
                ClipsCreationViewModel clipsCreationViewModel = this.A08;
                int A0E2 = clipsCreationViewModel.A0E() - JTO.A07(clipsCreationViewModel);
                float A003 = (float) LIC.A00(r11);
                filmstripTimelineView.setTrimmerMaximumRange(Math.max(100.0f / A003, Math.min(((float) (JTP.A08(r6) + A0E2)) / A003, 1.0f)));
                filmstripTimelineView.setVisibility(0);
                TextView textView = jpc.A06;
                textView.setText(A00(AnonymousClass7TE.A0S(textView), (long) JTP.A08(r6)));
                jpc.A01(this.A03, this.A01);
                AnonymousClass0fU.A00(new LXI(i4, 0, this), jpc.A04);
                view = jpc.A03;
            } else if (klz instanceof KMK) {
                C60914JtY jtY = ((KMK) klz).A00;
                jpc.itemView.setVisibility(0);
                LY4.A01(jpc.itemView, 62, this);
                TextView textView2 = jpc.A06;
                textView2.setText(A00(AnonymousClass7TE.A0S(textView2), jtY.A02));
                textView2.setVisibility(0);
                C3516889w r1 = this.A0A;
                int i9 = r1.A00().A02;
                int i10 = r1.A00().A01;
                View view3 = jpc.A03;
                ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
                layoutParams.width = i9;
                layoutParams.height = i10;
                view3.setVisibility(0);
                ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                } else {
                    marginLayoutParams = null;
                }
                Context A062 = JTQ.A06(jpc);
                0qQ.A0B(jpc.A07, 1);
                C355298Pl r04 = C60691Jpc.A0B;
                if (r04 == null) {
                    r04 = new C40666Agg(A062, 0);
                    C60691Jpc.A0B = r04;
                }
                if (marginLayoutParams != null) {
                    marginLayoutParams.setMargins(0, r04.Br8(), 0, r04.Br6());
                }
                view3.setLayoutParams(marginLayoutParams);
                jpc.A09.setVisibility(8);
                jpc.A01 = null;
                jpc.A04.setVisibility(8);
                return;
            } else if (klz instanceof KML) {
                C60914JtY jtY2 = ((KML) klz).A00;
                jpc.itemView.setVisibility(0);
                TextView textView3 = jpc.A06;
                textView3.setText(A00(AnonymousClass7TE.A0S(textView3), jtY2.A02));
                textView3.setVisibility(0);
                C3516889w r12 = this.A0A;
                int i11 = r12.A00().A02;
                int i12 = r12.A00().A01;
                View view4 = jpc.A05;
                if (view4 != null) {
                    ViewGroup.LayoutParams layoutParams3 = view4.getLayoutParams();
                    layoutParams3.width = i11;
                    layoutParams3.height = i12;
                    view4.setVisibility(0);
                }
                AnonymousClass0fU.A00(C64264LXq.A00, jpc.itemView);
                return;
            } else {
                0kD.A07("ThumbnailRecyclerViewAdapterV3", "No associated segment when binding thumbnail view holder", (Throwable) null);
                return;
            }
        } else if (r13 instanceof C60497JmU) {
            view = r13.itemView;
        } else {
            0kD.A07("ThumbnailRecyclerViewAdapterV3", "No associated holder when binding thumbnail", (Throwable) null);
            return;
        }
        view.setVisibility(8);
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        0qQ.A0B(viewGroup, 0);
        if (i == 1) {
            return new C60691Jpc(DbT.A0D(JTP.A0G(viewGroup), viewGroup, R.layout.layout_thumbnail_v3_item, false), this.A02, new L0T(Integer.valueOf(R.id.thumbnail_loading_shimmer_background)), this.A0A.A00(), false);
        } else if (i == 2) {
            return new C249703kE(DbT.A0D(JTP.A0G(viewGroup), viewGroup, R.layout.layout_add_clip_button_item, false));
        } else {
            Context context = viewGroup.getContext();
            int A052 = JTR.A05(context) * 2;
            int i2 = this.A0A.A00().A02;
            int i3 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            return new C380589Yt(DbT.A0D(LayoutInflater.from(context), viewGroup, R.layout.layout_transition_selector, false), this.A0C, (AnonymousClass7TF.A0E(context).widthPixels - i2) - A052);
        }
    }

    public final void onViewAttachedToWindow(C249703kE r3) {
        0qQ.A0B(r3, 0);
        if ((r3 instanceof C60691Jpc) || (r3 instanceof KMZ)) {
            this.A07.invoke(this.A03);
        } else if (r3 instanceof C380589Yt) {
            this.A0B.A09(((C380589Yt) r3).A04);
        }
    }

    public final void onViewDetachedFromWindow(C249703kE r3) {
        0qQ.A0B(r3, 0);
        if (r3 instanceof C60691Jpc) {
            this.A07.invoke(this.A03);
        } else if (r3 instanceof C380589Yt) {
            this.A0B.A08(((C380589Yt) r3).A04);
        }
    }

    public final void onViewRecycled(C249703kE r5) {
        int absoluteAdapterPosition;
        AnonymousClass51P r2;
        0qQ.A0B(r5, 0);
        if ((r5 instanceof C60691Jpc) && (absoluteAdapterPosition = r5.getAbsoluteAdapterPosition() / 2) >= 0) {
            List list = this.A03;
            if (absoluteAdapterPosition < list.size()) {
                C62761Klz klz = (C62761Klz) list.get(absoluteAdapterPosition);
                if ((klz instanceof KMM) && (r2 = ((KMM) klz).A00) != null) {
                    C3516889w r0 = this.A0A;
                    AnonymousClass51M r22 = (AnonymousClass51M) r2;
                    0qQ.A0B(r22, 0);
                    JTP.A1A(r0.A05, new AnonymousClass8YW(r22));
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00e0, code lost:
        if (r1.A0P().A0H.A02() == X.AnonymousClass8YK.EMPTY_TIMELINE) goto L_0x00e2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.KM0 r11, X.C60691Jpc r12, int r13) {
        /*
            X.8RF r0 = r11.A0E
            r0.A0E()
            int r1 = r11.A01
            if (r13 != r1) goto L_0x00af
            X.861 r0 = new X.861
            r0.<init>()
            r0.A03()
            com.instagram.ui.widget.filmstriptimeline.FilmstripTimelineView r2 = r12.A09
            r11 = 0
            r2.setActivated(r11)
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.setAlpha(r3)
            android.content.Context r5 = X.AnonymousClass7TE.A0S(r2)
            X.8Pl r1 = X.C60691Jpc.A0C
            if (r1 != 0) goto L_0x002c
            r0 = 1
            X.Agg r1 = new X.Agg
            r1.<init>(r5, r0)
            X.C60691Jpc.A0C = r1
        L_0x002c:
            r2.setMeasureSpecBuilder(r1)
            r1 = 1
            r2.setShowTrimmer(r1)
            boolean r0 = r12.A0A
            if (r0 == 0) goto L_0x003d
            r2.setShowSeekbar(r1)
            r2.A03(r1, r1, r11)
        L_0x003d:
            r2.setScaleX(r3)
            r2.setScaleY(r3)
            r2.A00()
            int r4 = X.JTR.A05(r5)
            r2.setOnlyScrollXMargin(r4)
            X.89v r0 = r12.A08
            int r3 = r0.A02
            android.util.DisplayMetrics r0 = X.AnonymousClass7TF.A0E(r5)
            int r1 = r0.widthPixels
            int r1 = r1 - r3
            int r0 = r4 * 2
            int r1 = r1 - r0
            r2.setFilmstripTimelineWidth(r1)
            r6 = 0
            r7 = 0
            r4 = 0
            r5 = 0
            android.content.res.Resources r0 = r2.getResources()
            int r10 = X.AnonymousClass7TE.A0D(r0)
            int r9 = r2.A06
            int r8 = r2.A04
            boolean r0 = r2.A01
            if (r0 == 0) goto L_0x0076
            int r7 = r2.A05
            android.graphics.drawable.Drawable r6 = r2.A07
        L_0x0076:
            boolean r0 = r2.A02
            if (r0 == 0) goto L_0x007e
            int r5 = r2.A05
            android.graphics.drawable.Drawable r4 = r2.A07
        L_0x007e:
            X.8Ps r3 = r2.A0A
            r2 = -1
            X.8Px r1 = new X.8Px
            r1.<init>(r2, r10, r9, r11)
            if (r7 <= 0) goto L_0x0093
            X.9kW r0 = new X.9kW
            r0.<init>(r7, r2)
            r0.A00(r6, r11)
            r1.A08(r0)
        L_0x0093:
            if (r5 <= 0) goto L_0x00a0
            X.9kW r0 = new X.9kW
            r0.<init>(r5, r2)
            r0.A00(r4, r9)
            r1.A09(r0)
        L_0x00a0:
            r1.A06(r8)
            X.JTT.A1J(r1, r3)
            r3.invalidate()
            X.Juv r0 = r12.A01
        L_0x00ab:
            X.C60691Jpc.A00(r0, r12)
            return
        L_0x00af:
            int r0 = r1 + -2
            r2 = 1
            if (r13 == r0) goto L_0x00e9
            int r0 = r1 + 2
            if (r13 == r0) goto L_0x00e9
            X.8RH r0 = r11.A03
            boolean r0 = r0 instanceof X.AnonymousClass8RU
            if (r0 != 0) goto L_0x00e2
            int r0 = r11.A00
            int r0 = r0 * 2
            int r0 = r0 + 1
            if (r13 != r0) goto L_0x00e2
            X.L0R r0 = r11.A0D
            X.KLz r1 = r0.A00
            X.87s r0 = r1.A0P()
            boolean r0 = r0.A0I()
            if (r0 == 0) goto L_0x00e3
            X.87s r0 = r1.A0P()
            X.2Fk r0 = r0.A0H
            java.lang.Object r1 = r0.A02()
            X.8YK r0 = X.AnonymousClass8YK.EMPTY_TIMELINE
            if (r1 != r0) goto L_0x00e3
        L_0x00e2:
            r2 = 0
        L_0x00e3:
            r12.A02(r2)
        L_0x00e6:
            X.Juv r0 = r12.A00
            goto L_0x00ab
        L_0x00e9:
            if (r13 < r1) goto L_0x00ec
            r2 = 0
        L_0x00ec:
            com.instagram.ui.widget.filmstriptimeline.FilmstripTimelineView r5 = r12.A09
            r4 = 0
            r5.setActivated(r4)
            r0 = 1056964608(0x3f000000, float:0.5)
            r5.setAlpha(r0)
            android.content.Context r3 = X.AnonymousClass7TE.A0S(r5)
            X.L0T r1 = r12.A07
            r0 = 1
            X.0qQ.A0B(r1, r0)
            X.8Pl r0 = X.C60691Jpc.A0B
            if (r0 != 0) goto L_0x010c
            X.Agg r0 = new X.Agg
            r0.<init>(r3, r4)
            X.C60691Jpc.A0B = r0
        L_0x010c:
            r5.setMeasureSpecBuilder(r0)
            r5.setShowTrimmer(r4)
            r5.setShowSeekbar(r4)
            r5.A03(r4, r4, r4)
            if (r2 == 0) goto L_0x0136
            X.89v r0 = r12.A08
            int r0 = r0.A02
            float r0 = (float) r0
        L_0x011f:
            r5.setPivotX(r0)
            r0 = 1058642330(0x3f19999a, float:0.6)
            r5.setScaleX(r0)
            r5.setScaleY(r0)
            r5.A00()
            r5.setOnlyScrollXMargin(r4)
            r0 = -1
            r5.setFilmstripTimelineWidth(r0)
            goto L_0x00e6
        L_0x0136:
            r0 = 0
            goto L_0x011f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KM0.A02(X.KM0, X.Jpc, int):void");
    }

    public final void A05(int i, int i2) {
        int i3 = i2 / 2;
        int i4 = i / 2;
        super.A05(i4, i3);
        ArrayList A0U = 00k.A0U(this.A05);
        A0U.add(i3, A0U.remove(i4));
        this.A05 = A0U;
    }

    public static final String A00(Context context, long j) {
        String A0u = DbV.A0u(context, Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j)), Long.valueOf((j % 1000) / 100), 2131955447);
        0qQ.A07(A0u);
        return A0u;
    }

    public final void A06(int i) {
        int itemCount = getItemCount();
        for (int i2 = 0; i2 < itemCount; i2++) {
            if (getItemViewType(i2) == i) {
                try {
                    notifyItemChanged(i2);
                } catch (IllegalStateException unused) {
                }
            }
        }
    }

    public final int getItemCount() {
        int size;
        AnonymousClass8RG r1;
        int A032 = AnonymousClass0fD.A03(-75044988);
        AnonymousClass8RH r12 = this.A03;
        if (!(r12 instanceof AnonymousClass8RG) || (r1 = (AnonymousClass8RG) r12) == null || r1.A00) {
            size = (this.A03.size() * 2) + 1;
        } else {
            size = (this.A03.size() * 2) + 2;
        }
        AnonymousClass0fD.A0A(-1151650887, A032);
        return size;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long getItemId(int r9) {
        /*
            r8 = this;
            r0 = 1984478892(0x7648beac, float:1.0178971E33)
            int r3 = X.AnonymousClass0fD.A03(r0)
            int r2 = r8.getItemCount()
            int r0 = r9 % 2
            if (r0 != 0) goto L_0x0046
            X.LMG r7 = r8.A02
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "transition_selector"
        L_0x0017:
            r1.append(r0)
            r1.append(r9)
            java.lang.String r6 = r1.toString()
        L_0x0021:
            r0 = 0
            X.0qQ.A0B(r6, r0)
            java.util.HashMap r2 = r7.A01
            java.lang.Number r0 = X.JTO.A0z(r6, r2)
            if (r0 != 0) goto L_0x003b
            long r4 = r7.A00
            r0 = 1
            long r0 = r0 + r4
            r7.A00 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r2.put(r6, r0)
        L_0x003b:
            long r1 = r0.longValue()
            r0 = -1357605809(0xffffffffaf14944f, float:-1.3513211E-10)
            X.AnonymousClass0fD.A0A(r0, r3)
            return r1
        L_0x0046:
            X.8RH r1 = r8.A03
            boolean r0 = r1 instanceof X.AnonymousClass8RG
            if (r0 == 0) goto L_0x0061
            X.8RG r1 = (X.AnonymousClass8RG) r1
            if (r1 == 0) goto L_0x0061
            boolean r0 = r1.A00
            if (r0 != 0) goto L_0x0061
            int r0 = r2 + -1
            if (r9 != r0) goto L_0x0061
            X.LMG r7 = r8.A02
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "add_clip_button"
            goto L_0x0017
        L_0x0061:
            int r1 = r9 / 2
            java.util.List r0 = r8.A03
            java.lang.Object r1 = X.00k.A0O(r0, r1)
            X.Klz r1 = (X.C62761Klz) r1
            boolean r0 = r1 instanceof X.KMM
            if (r0 == 0) goto L_0x0086
            X.KMM r1 = (X.KMM) r1
            X.51P r0 = r1.A00
            X.51M r0 = (X.AnonymousClass51M) r0
            X.51R r0 = r0.A0F
            java.lang.String r0 = r0.A0F
            java.lang.String r6 = X.002.A0O(r0, r9)
            r6.getClass()
        L_0x0080:
            X.LMG r7 = r8.A02
            X.0qQ.A0A(r6)
            goto L_0x0021
        L_0x0086:
            boolean r0 = r1 instanceof X.KMK
            if (r0 == 0) goto L_0x0093
            X.KMK r1 = (X.KMK) r1
            X.JtY r0 = r1.A00
            java.lang.String r6 = X.AnonymousClass7TF.A0h(r0)
            goto L_0x0080
        L_0x0093:
            java.lang.String r2 = "ThumbnailRecyclerViewAdapterV3"
            java.lang.String r1 = "No associated segment with item"
            r0 = 0
            X.0kD.A07(r2, r1, r0)
            java.lang.String r6 = ""
            goto L_0x0080
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KM0.getItemId(int):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (r0 != false) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int getItemViewType(int r7) {
        /*
            r6 = this;
            r0 = -2141811686(0xffffffff80568c1a, float:-7.948112E-39)
            int r5 = X.AnonymousClass0fD.A03(r0)
            int r4 = r6.getItemCount()
            X.8RH r1 = r6.A03
            boolean r0 = r1 instanceof X.AnonymousClass8RG
            if (r0 == 0) goto L_0x0030
            X.8RG r1 = (X.AnonymousClass8RG) r1
        L_0x0013:
            r3 = 0
            r2 = 1
            if (r1 == 0) goto L_0x001c
            boolean r0 = r1.A00
            r1 = 1
            if (r0 == 0) goto L_0x001d
        L_0x001c:
            r1 = 0
        L_0x001d:
            r0 = 2
            if (r1 == 0) goto L_0x002b
            int r4 = r4 - r2
            if (r7 != r4) goto L_0x002b
            r3 = 2
        L_0x0024:
            r0 = 1739210707(0x67aa3fd3, float:1.6079593E24)
            X.AnonymousClass0fD.A0A(r0, r5)
            return r3
        L_0x002b:
            int r7 = r7 % r0
            if (r7 == 0) goto L_0x0024
            r3 = 1
            goto L_0x0024
        L_0x0030:
            r1 = 0
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KM0.getItemViewType(int):int");
    }
}
