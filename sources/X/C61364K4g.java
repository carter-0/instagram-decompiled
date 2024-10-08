package X;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.android.R;
import com.instagram.avatars.stickergrid.AvatarStickerGridFragment$setUpRecyclerView$2;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.K4g  reason: case insensitive filesystem */
public abstract class C61364K4g extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "AvatarStickerGridFragment";
    public int A00;
    public ViewStub A01;
    public GridLayoutManager A02;
    public RecyclerView A03;
    public C317866ny A04;
    public AnonymousClass2t9 A05;
    public ViewModelListUpdate A06;
    public C252063oV A07;
    public C252063oV A08;
    public C252063oV A09;
    public IgdsInlineSearchBox A0A;
    public SpinnerImageView A0B;
    public Integer A0C;
    public String A0D;
    public C62320sa A0E = new MMP(this, 21);
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public final View.OnTouchListener A0P;
    public final C63831L8m A0Q = new C63831L8m();
    public final AnonymousClass0eM A0R;
    public final AnonymousClass0eM A0S = C227642jf.A02(this);
    public final C63593Kzg A0T;
    public final AnonymousClass0eM A0U;

    public void A0J(ULT ult, C62719KlJ klJ, C62723KlN klN, List list) {
        0qQ.A0B(list, 0);
        ViewModelListUpdate A0R2 = DbS.A0R();
        this.A06 = A0R2;
        C62719KlJ klJ2 = klJ;
        C62723KlN klN2 = klN;
        A02(klJ2, klN2, this, A0R2, list, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        boolean z;
        String str;
        IgdsInlineSearchBox igdsInlineSearchBox;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        RecyclerView A0I2 = DbT.A0I(view, R.id.avatar_sticker_grid);
        0qQ.A0B(A0I2, 0);
        this.A03 = A0I2;
        this.A0A = (IgdsInlineSearchBox) view.requireViewById(R.id.avatar_sticker_grid_search_box);
        this.A0B = (SpinnerImageView) view.requireViewById(R.id.avatar_sticker_grid_loading_spinner);
        int i = 0;
        ViewGroup.LayoutParams layoutParams = null;
        this.A07 = 2b1.A01(view.requireViewById(R.id.avatar_sticker_grid_back_button), false, false);
        this.A08 = DbV.A0T(view, R.id.avatar_sticker_grid_empty_view, false);
        this.A09 = DbV.A0T(view, R.id.avatar_sticker_grid_title, false);
        if (this instanceof K3N) {
            z = ((K3N) this).A03;
        } else {
            z = this.A0L;
        }
        C252063oV r0 = this.A07;
        if (r0 != null) {
            if (z) {
                r0.setVisibility(0);
                C252063oV r02 = this.A07;
                if (r02 != null) {
                    LYC.A00(r02.getView(), 60, this);
                }
            } else {
                r0.setVisibility(8);
            }
            A03(this);
            View A0G2 = AnonymousClass7TF.A0G(view, R.id.bottom_sheet_drag_handle);
            if (!this.A0M) {
                i = 8;
            }
            A0G2.setVisibility(i);
            if (this.A0K) {
                IgdsInlineSearchBox igdsInlineSearchBox2 = this.A0A;
                if (igdsInlineSearchBox2 != null) {
                    layoutParams = igdsInlineSearchBox2.getLayoutParams();
                }
                if ((layoutParams instanceof C71492dQ) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    marginLayoutParams.setMargins(marginLayoutParams.leftMargin, (int) (((float) marginLayoutParams.topMargin) + 0nA.A04(AnonymousClass7TE.A0S(view), 12)), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                }
            }
            if (this.A0M && 2eO.A00(getContext())) {
                LYC.A00(A0G2, 61, this);
                2eQ.A06(A0G2, 500);
                DbU.A12(requireContext(), A0G2, 2131956164);
            }
            boolean z2 = this.A0F;
            int i2 = R.id.avatar_sticker_grid_no_avatar_nux;
            if (z2) {
                i2 = R.id.avatar_sticker_grid_avatar_creation_upsell;
            }
            ViewStub A0D2 = DbU.A0D(view, i2);
            0qQ.A0B(A0D2, 0);
            this.A01 = A0D2;
            A0D2.setOnInflateListener(new C64290LYq(this, 0));
            AnonymousClass2tC A0S2 = DbV.A0S(this);
            A0K(A0S2);
            this.A05 = A0S2.A00();
            A07().setAdapter(A0C());
            A07().setItemAnimator(new C60352Jk0());
            AvatarStickerGridFragment$setUpRecyclerView$2 avatarStickerGridFragment$setUpRecyclerView$2 = new AvatarStickerGridFragment$setUpRecyclerView$2(requireContext(), this, this.A00);
            this.A02 = avatarStickerGridFragment$setUpRecyclerView$2;
            avatarStickerGridFragment$setUpRecyclerView$2.A01 = new C60365JkD(this);
            RecyclerView A072 = A07();
            GridLayoutManager gridLayoutManager = this.A02;
            if (gridLayoutManager != null) {
                A072.setLayoutManager(gridLayoutManager);
                A07().A11(A06());
                A07().setOnTouchListener(this.A0P);
                int i3 = this.A00 * 4;
                C65319LrI lrI = new C65319LrI(this, 2);
                Integer num = AnonymousClass05K.A00;
                A07().A15(new C3251871j(A07().A0D, lrI, new C3251771i(num, AnonymousClass05K.A01, i3), false, false));
                if (this.A0N && (igdsInlineSearchBox = this.A0A) != null) {
                    igdsInlineSearchBox.A02 = new C65353Lrt(this, 0);
                }
                if (this.A0O) {
                    C252063oV r1 = this.A07;
                    if (r1 != null) {
                        View view2 = r1.getView();
                        C252063oV r12 = this.A07;
                        if (r12 != null) {
                            ViewGroup.LayoutParams layoutParams2 = r12.getView().getLayoutParams();
                            0qQ.A0C(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                            marginLayoutParams2.setMargins(0, 0, 0, AnonymousClass7TG.A07(requireContext()));
                            view2.setLayoutParams(marginLayoutParams2);
                            String str2 = this.A0D;
                            if (str2 != null) {
                                C252063oV r13 = this.A09;
                                if (r13 != null) {
                                    ((TextView) r13.getView()).setText(str2);
                                } else {
                                    str = DialogModule.KEY_TITLE;
                                }
                            }
                        }
                    }
                }
                A0G();
                if (A0B().A0A) {
                    C60294Jir A0B2 = A0B();
                    if (!A0B2.A0L.A00.getBoolean("key_has_seen_avatar_mentions_tooltip_v4", false)) {
                        A0B2.A0T.Epw(K3U.A00);
                    }
                    C60294Jir A0B3 = A0B();
                    K3F k3f = K3F.A00;
                    05G r4 = A0B3.A0S;
                    ArrayList arrayList = A0B3.A0R;
                    boolean isEmpty = arrayList.isEmpty();
                    List list = arrayList;
                    if (isEmpty) {
                        list = A0B3.A07;
                    }
                    r4.Epw(new K3X((ULT) null, A0B3.A03, k3f, list));
                    A0B3.A04 = k3f;
                    1Eo.A03(num, DbX.A0c(AnonymousClass12T.A00), new MFS(A0B3, (AnonymousClass4D7) null, 22), C318116oQ.A00(A0B3));
                }
                if (this.A0G) {
                    AnonymousClass0eM r2 = this.A0R;
                    if (AnonymousClass7TF.A1Z(DbZ.A0O(r2).A08)) {
                        07U r7 = 07U.A05;
                        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
                        JTO.A1Y(num, new MHH(r7, this, viewLifecycleOwner, (AnonymousClass4D7) null, 38), AnonymousClass07a.A00(viewLifecycleOwner));
                        DbZ.A0O(r2).A02(C317846nw.CONVERGENCE_2_UPSELL_BANNER_STICKER_PACK);
                    }
                }
                07U r72 = 07U.A05;
                AnonymousClass07Z viewLifecycleOwner2 = getViewLifecycleOwner();
                AnonymousClass0xx A002 = AnonymousClass07a.A00(viewLifecycleOwner2);
                MHH mhh = new MHH(r72, this, viewLifecycleOwner2, (AnonymousClass4D7) null, 37);
                19B r22 = 19B.A00;
                1Eo.A03(num, r22, mhh, A002);
                AnonymousClass07Z viewLifecycleOwner3 = getViewLifecycleOwner();
                1Eo.A03(num, r22, new MHH(r72, this, viewLifecycleOwner3, (AnonymousClass4D7) null, 39), AnonymousClass07a.A00(viewLifecycleOwner3));
                C60294Jir A0B4 = A0B();
                C61082JwK jwK = A0B4.A0B;
                if (jwK != null && jwK.A01) {
                    A0B4.A0K.A00(KQE.A00);
                    return;
                }
                return;
            }
            str = "gridLayoutManager";
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        str = "backButton";
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v34, resolved type: X.Jy6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v56, resolved type: X.JyL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v1, resolved type: X.JyL} */
    /* JADX WARNING: type inference failed for: r2v35 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ff  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.C62719KlJ r21, X.C62723KlN r22, X.C61364K4g r23, com.instagram.common.recyclerview.ViewModelListUpdate r24, java.util.List r25, boolean r26) {
        /*
            r2 = r22
            r1 = r24
            if (r22 == 0) goto L_0x000e
            X.Jy3 r0 = new X.Jy3
            r0.<init>(r2)
            r1.A00(r0)
        L_0x000e:
            r0 = r23
            r15 = r25
            if (r25 == 0) goto L_0x01fa
            boolean r4 = r0 instanceof X.K3S
            if (r4 == 0) goto L_0x00f4
            r3 = r0
            X.K3S r3 = (X.K3S) r3
            if (r26 != 0) goto L_0x00f1
            boolean r2 = A05(r3)
            if (r2 == 0) goto L_0x00f1
        L_0x0023:
            X.0eM r5 = r0.A0R
            X.6i2 r2 = X.DbZ.A0O(r5)
            X.0eM r2 = r2.A06
            java.lang.Object r3 = r2.getValue()
            X.EWK r3 = (X.EWK) r3
            r6 = r21
            if (r21 == 0) goto L_0x004f
            boolean r2 = r0.A0G
            if (r2 == 0) goto L_0x004f
            X.6i2 r2 = X.DbZ.A0O(r5)
            X.0eM r2 = r2.A08
            boolean r2 = X.AnonymousClass7TF.A1Z(r2)
            if (r2 == 0) goto L_0x004f
            if (r3 == 0) goto L_0x004f
            X.Lho r2 = new X.Lho
            r2.<init>(r3, r6)
            r1.A00(r2)
        L_0x004f:
            r2 = 17
            X.MIh r5 = new X.MIh
            r5.<init>(r0, r2)
            if (r4 == 0) goto L_0x00e7
            r4 = r0
            X.K3S r4 = (X.K3S) r4
            if (r26 != 0) goto L_0x00e2
            boolean r2 = A05(r4)
            if (r2 == 0) goto L_0x00e2
            X.0eM r2 = r4.A0K
            com.instagram.common.session.UserSession r8 = X.AnonymousClass7TE.A0l(r2)
            boolean r12 = r4.A0O()
            int r3 = r4.A00
            android.content.Context r7 = r4.requireContext()
            r2 = 57
            X.MId r9 = X.JTO.A1C(r4, r2)
            X.K3d r6 = new X.K3d
            r10 = r5
            r11 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12)
        L_0x0080:
            boolean r2 = r6 instanceof X.C61342K3d
            if (r2 == 0) goto L_0x01cf
            X.K3d r6 = (X.C61342K3d) r6
            r26 = 0
            r10 = 1
            X.L6W r9 = r6.A01
            java.util.LinkedHashMap r5 = X.AnonymousClass7TE.A1H()
            X.KiO r8 = X.C62591KiO.POPULAR
            X.7IJ r2 = r9.A02
            com.instagram.common.session.UserSession r7 = r2.A00
            X.0Tu r4 = X.0Tu.A05
            r2 = 36611181700323540(0x8211ad000e18d4, double:3.2163969564558936E-306)
            int r3 = X.DbS.A04(r4, r7, r2)
            if (r3 >= r10) goto L_0x00a3
            r3 = 1
        L_0x00a3:
            int r2 = r9.A00
            int r3 = r3 * r2
            java.util.List r2 = X.00k.A0d(r15, r3)
            java.util.ArrayList r2 = X.00k.A0U(r2)
            r5.put(r8, r2)
            java.util.Iterator r11 = r15.iterator()
        L_0x00b5:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L_0x012d
            X.6o8 r10 = X.JTO.A0a(r11)
            java.lang.String r9 = r10.A0O
            X.KiO[] r8 = X.C62591KiO.values()
            int r7 = r8.length
            r4 = 0
        L_0x00c7:
            if (r4 >= r7) goto L_0x00d6
            r3 = r8[r4]
            java.lang.String r2 = r3.A02
            boolean r2 = X.0qQ.A0K(r2, r9)
            if (r2 != 0) goto L_0x00d8
            int r4 = r4 + 1
            goto L_0x00c7
        L_0x00d6:
            X.KiO r3 = X.C62591KiO.LIFESTYLE
        L_0x00d8:
            java.lang.Object r2 = X.JTS.A0h(r3, r5)
            java.util.List r2 = (java.util.List) r2
            r2.add(r10)
            goto L_0x00b5
        L_0x00e2:
            boolean r2 = r4.A0O()
            goto L_0x00eb
        L_0x00e7:
            boolean r2 = r0.A0O()
        L_0x00eb:
            X.LCa r6 = new X.LCa
            r6.<init>(r5, r2)
            goto L_0x0080
        L_0x00f1:
            boolean r2 = r3.A0H
            goto L_0x00fd
        L_0x00f4:
            r3 = r0
            boolean r2 = r0 instanceof X.K3N
            if (r2 == 0) goto L_0x012a
            X.K3N r3 = (X.K3N) r3
            boolean r2 = r3.A02
        L_0x00fd:
            if (r2 == 0) goto L_0x0023
            r2 = 2131953510(0x7f130766, float:1.9543493E38)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r2)
            X.6ny r3 = r0.A0A()
            X.6ny r2 = X.C317866ny.STORIES
            boolean r2 = X.AnonymousClass7TF.A1W(r3, r2)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r2)
            android.content.Context r6 = r0.requireContext()
            X.Kzg r7 = r0.A0T
            r11 = 2131953508(0x7f130764, float:1.9543489E38)
            r12 = 0
            X.Nj1 r8 = X.C69300Nj1.AVATAR_EDIT
            X.JyL r5 = new X.JyL
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r1.A00(r5)
            goto L_0x0023
        L_0x012a:
            boolean r2 = r0.A0H
            goto L_0x00fd
        L_0x012d:
            X.MPK r4 = X.MPK.A00
            r3 = 2
            X.MAZ r2 = new X.MAZ
            r2.<init>((X.0sL) r4, (int) r3)
            java.util.TreeMap r3 = new java.util.TreeMap
            r3.<init>(r2)
            r3.putAll(r5)
            java.util.ArrayList r10 = X.AnonymousClass7TE.A1C()
            java.util.Collection r2 = r3.values()
            java.util.ArrayList r2 = X.0Yv.A1F(r2)
            int r9 = r2.size()
            java.util.Iterator r18 = X.AnonymousClass7TF.A0s(r3)
            r17 = 0
            r8 = 0
        L_0x0154:
            boolean r2 = r18.hasNext()
            if (r2 == 0) goto L_0x01f5
            java.lang.Object r2 = r18.next()
            int r16 = r17 + 1
            if (r17 < 0) goto L_0x01ed
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r11 = r2.getKey()
            X.KiO r11 = (X.C62591KiO) r11
            java.lang.Object r7 = r2.getValue()
            java.util.List r7 = (java.util.List) r7
            android.content.Context r5 = r6.A00
            int r4 = r11.A01
            java.lang.String r13 = X.AnonymousClass7TE.A16(r5, r4)
            java.util.List r2 = r1.A00
            int r14 = r2.size()
            r3 = 0
            int r2 = r11.A00
            X.KQu r12 = new X.KQu
            r12.<init>(r3, r13, r2)
            r11 = 11
            X.JwA r2 = new X.JwA
            r2.<init>((int) r14, (int) r11, (java.lang.Object) r12)
            r10.add(r2)
            if (r17 != 0) goto L_0x01c9
            r2 = 2131953509(0x7f130765, float:1.954349E38)
            java.lang.Integer r24 = java.lang.Integer.valueOf(r2)
            java.lang.Boolean r23 = java.lang.Boolean.valueOf(r26)
            X.Nj1 r22 = X.C69300Nj1.AVATAR_EDIT
            X.JyL r2 = new X.JyL
            r25 = r4
            r19 = r2
            r20 = r5
            r21 = r3
            r19.<init>(r20, r21, r22, r23, r24, r25, r26)
        L_0x01ac:
            X.2tL r2 = (X.C232262tL) r2
            r1.A00(r2)
            java.util.Iterator r4 = r7.iterator()
        L_0x01b5:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x01c6
            X.6o8 r3 = X.JTO.A0a(r4)
            int r2 = r8 + 1
            r6.A00(r1, r3, r8, r9)
            r8 = r2
            goto L_0x01b5
        L_0x01c6:
            r17 = r16
            goto L_0x0154
        L_0x01c9:
            X.Jy6 r2 = new X.Jy6
            r2.<init>(r13)
            goto L_0x01ac
        L_0x01cf:
            java.util.Iterator r7 = r15.iterator()
            r5 = 0
        L_0x01d4:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x01fa
            java.lang.Object r4 = r7.next()
            int r3 = r5 + 1
            if (r5 < 0) goto L_0x01ed
            X.6o8 r4 = (X.C317966o8) r4
            int r2 = r15.size()
            r6.A00(r1, r4, r5, r2)
            r5 = r3
            goto L_0x01d4
        L_0x01ed:
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x01f5:
            X.0sP r2 = r6.A02
            r2.invoke(r10)
        L_0x01fa:
            X.2t9 r2 = r0.A0C()
            r2.A05(r1)
            if (r15 == 0) goto L_0x0214
            r0.A0F()
            X.Jir r0 = r0.A0B()
            X.02m r2 = r0.A0H
            r1 = 129908197(0x7be3de5, float:2.86244E-34)
            java.lang.String r0 = "stickers_rendered"
            r2.markerPoint(r1, r0)
        L_0x0214:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61364K4g.A02(X.KlJ, X.KlN, X.K4g, com.instagram.common.recyclerview.ViewModelListUpdate, java.util.List, boolean):void");
    }

    public static final void A03(C61364K4g k4g) {
        if (k4g.A0N) {
            IgdsInlineSearchBox igdsInlineSearchBox = k4g.A0A;
            if (igdsInlineSearchBox != null) {
                igdsInlineSearchBox.setVisibility(0);
            }
        } else {
            boolean z = k4g.A0O;
            IgdsInlineSearchBox igdsInlineSearchBox2 = k4g.A0A;
            if (z) {
                if (igdsInlineSearchBox2 != null) {
                    igdsInlineSearchBox2.setVisibility(8);
                }
                C252063oV r0 = k4g.A09;
                if (r0 != null) {
                    r0.setVisibility(0);
                    return;
                }
                0qQ.A0F(DialogModule.KEY_TITLE);
                throw AnonymousClass00P.createAndThrow();
            } else if (igdsInlineSearchBox2 != null) {
                igdsInlineSearchBox2.setVisibility(8);
            }
        }
        C252063oV r02 = k4g.A09;
        if (r02 != null) {
            r02.setVisibility(8);
            return;
        }
        0qQ.A0F(DialogModule.KEY_TITLE);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A04(C61364K4g k4g, boolean z) {
        SpinnerImageView spinnerImageView;
        C255943uy r0;
        if (z) {
            JTQ.A1G(k4g.A0C());
            spinnerImageView = k4g.A0B;
            if (spinnerImageView != null) {
                r0 = C255943uy.LOADING;
            }
            0qQ.A0F("loadingSpinner");
            throw AnonymousClass00P.createAndThrow();
        }
        spinnerImageView = k4g.A0B;
        if (spinnerImageView != null) {
            r0 = C255943uy.SUCCESS;
        }
        0qQ.A0F("loadingSpinner");
        throw AnonymousClass00P.createAndThrow();
        spinnerImageView.setLoadingStatus(r0);
    }

    public static boolean A05(K3S k3s) {
        return 182.A06(0Tu.A05, ((AnonymousClass7IJ) k3s.A0E.getValue()).A00, 36329706723361040L);
    }

    public final RecyclerView A07() {
        RecyclerView recyclerView = this.A03;
        if (recyclerView != null) {
            return recyclerView;
        }
        0qQ.A0F("stickerGridRecyclerView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final C61082JwK A08() {
        long j;
        if (!(this instanceof K3S)) {
            return null;
        }
        K3S k3s = (K3S) this;
        AnonymousClass0eM r5 = k3s.A0N;
        Object value = r5.getValue();
        0qQ.A0B(value, 0);
        boolean z = false;
        if (!AnonymousClass7TF.A1Y(C51968G9o.A10(((AnonymousClass75v) k3s.A0M.getValue()).A01, value.hashCode()), false) && !AnonymousClass7TF.A1Z(k3s.A0H) && DbS.A05(r5.getValue()) == 1) {
            AnonymousClass7IJ r2 = (AnonymousClass7IJ) k3s.A0E.getValue();
            boolean A1Z = AnonymousClass7TF.A1Z(k3s.A0G);
            if (!r2.A00()) {
                UserSession userSession = r2.A00;
                0Tu r22 = 0Tu.A05;
                if (A1Z) {
                    j = 36320906335232969L;
                } else {
                    j = 36318535512758495L;
                }
                if (182.A06(r22, userSession, j)) {
                    z = true;
                }
            }
        }
        return new C61082JwK(z, JTO.A15(r5), 20);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005e, code lost:
        if (X.182.A06(X.0Tu.A05, X.DbT.A0X(((X.K3M) r6).A04), 36323719538290095L) != false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009e, code lost:
        if (X.182.A06(r3, ((X.AnonymousClass7IJ) r4.getValue()).A00, 36322267839342623L) == false) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00bb, code lost:
        if (X.182.A06(r2, r3, r0) == false) goto L_0x0060;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C317846nw A09() {
        /*
            r6 = this;
            boolean r0 = r6 instanceof X.K3S
            if (r0 == 0) goto L_0x0015
            r5 = r6
            X.K3S r5 = (X.K3S) r5
            X.NjK r1 = r5.A03
            if (r1 != 0) goto L_0x0072
            java.lang.String r0 = "entryPoint"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0015:
            boolean r0 = r6 instanceof X.K3O
            if (r0 == 0) goto L_0x001c
            X.6nw r0 = X.C317846nw.AVATAR_QR_ANIMATED_MORE_OPTIONS_STICKERS
            return r0
        L_0x001c:
            boolean r0 = r6 instanceof X.K3N
            if (r0 == 0) goto L_0x0034
            r0 = r6
            X.K3N r0 = (X.K3N) r0
            X.0eM r0 = r0.A07
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r0)
            X.0Tu r2 = X.AnonymousClass7TF.A0H(r3)
            r0 = 36315898403098270(0x81051e00040e9e, double:3.029658610280232E-306)
            goto L_0x00b7
        L_0x0034:
            boolean r0 = r6 instanceof X.K3R
            if (r0 == 0) goto L_0x0046
            r0 = r6
            X.K3R r0 = (X.K3R) r0
            X.0eM r0 = r0.A07
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.6nw r0 = X.C348197y2.A00(r0)
            return r0
        L_0x0046:
            boolean r0 = r6 instanceof X.K3M
            if (r0 == 0) goto L_0x0063
            r0 = r6
            X.K3M r0 = (X.K3M) r0
            X.0eM r0 = r0.A04
            X.0lg r3 = X.DbT.A0X(r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36323719538290095(0x810c3b00002daf, double:3.0346047276687255E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x00bd
        L_0x0060:
            X.6nw r0 = X.C317846nw.STATIC_AVATAR_STICKERS
            return r0
        L_0x0063:
            boolean r0 = r6 instanceof X.K3P
            if (r0 == 0) goto L_0x00bd
            r0 = r6
            X.K3P r0 = (X.K3P) r0
            X.0eM r0 = r0.A02
            r0.getValue()
            X.6nw r0 = X.C317846nw.STATIC_AVATAR_STICKERS
            return r0
        L_0x0072:
            X.NjK r0 = X.C69319NjK.NOTES_QUICK_REPLY_STICKER_BUTTON
            if (r1 != r0) goto L_0x00a0
            X.0eM r4 = r5.A0E
            java.lang.Object r0 = r4.getValue()
            X.7IJ r0 = (X.AnonymousClass7IJ) r0
            com.instagram.common.session.UserSession r2 = r0.A00
            X.0Tu r3 = X.0Tu.A05
            r0 = 36321245637190849(0x8109fb000124c1, double:3.033040222651962E-306)
            boolean r0 = X.182.A06(r3, r2, r0)
            if (r0 == 0) goto L_0x00a0
            java.lang.Object r0 = r4.getValue()
            X.7IJ r0 = (X.AnonymousClass7IJ) r0
            com.instagram.common.session.UserSession r2 = r0.A00
            r0 = 36322267839342623(0x810ae90000281f, double:3.033686667408822E-306)
            boolean r0 = X.182.A06(r3, r2, r0)
            if (r0 == 0) goto L_0x00bd
        L_0x00a0:
            X.0eM r0 = r5.A0E
            java.lang.Object r1 = r0.getValue()
            X.7IJ r1 = (X.AnonymousClass7IJ) r1
            boolean r0 = r1.A00()
            if (r0 != 0) goto L_0x0060
            com.instagram.common.session.UserSession r3 = r1.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36317075223876374(0x81063000001316, double:3.030402836478982E-306)
        L_0x00b7:
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0060
        L_0x00bd:
            X.6nw r0 = X.C317846nw.MIXED_AVATAR_STICKERS
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61364K4g.A09():X.6nw");
    }

    public final C317866ny A0A() {
        if (this instanceof K3N) {
            return ((K3N) this).A00;
        }
        if (this instanceof K3R) {
            return ((K3R) this).A00;
        }
        if (this instanceof K3P) {
            return ((K3P) this).A00;
        }
        C317866ny r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        0qQ.A0F("stickerTraySurface");
        throw AnonymousClass00P.createAndThrow();
    }

    public final C60294Jir A0B() {
        return (C60294Jir) this.A0U.getValue();
    }

    public final AnonymousClass2t9 A0C() {
        AnonymousClass2t9 r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        DbS.A13();
        throw AnonymousClass00P.createAndThrow();
    }

    public C62944Kow A0D() {
        UserSession A0l = AnonymousClass7TE.A0l(this.A0S);
        C317866ny A0A2 = A0A();
        return new C62094KZz(A08(), A09(), A0A2, A0l);
    }

    public final String A0E() {
        if (this instanceof K3N) {
            return ((K3N) this).A01;
        }
        if (this instanceof K3S) {
            return ((K3S) this).A05;
        }
        if (this instanceof K3R) {
            return ((K3R) this).A01;
        }
        if (this instanceof K3M) {
            return ((K3M) this).A00;
        }
        0qQ.A0F("editorLoggingSurface");
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x00a4 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0F() {
        /*
            r32 = this;
            r1 = r32
            boolean r0 = r1 instanceof X.K3S
            if (r0 == 0) goto L_0x0229
            r7 = r1
            X.K3S r7 = (X.K3S) r7
            X.0eM r0 = r7.A0O
            java.lang.Object r9 = r0.getValue()
            X.L86 r9 = (X.L86) r9
            android.graphics.Rect r3 = X.AnonymousClass7TE.A0W()
            android.view.View r0 = r9.A00
            r0.getWindowVisibleDisplayFrame(r3)
            android.content.res.Resources r2 = r0.getResources()
            com.instagram.direct.avatar.stickers.intf.DirectAvatarTrayFragmentConfig r0 = r9.A03
            int r1 = r0.A00
            r6 = 0
            r0 = -1
            if (r1 == r0) goto L_0x009e
            int r0 = r2.getDimensionPixelSize(r1)
        L_0x002a:
            android.graphics.Point r2 = new android.graphics.Point
            r2.<init>(r6, r0)
            android.graphics.Rect r8 = new android.graphics.Rect
            r8.<init>(r3)
            int r0 = r2.x
            int r1 = -r0
            int r0 = r2.y
            int r0 = -r0
            r8.offset(r1, r0)
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            X.2t9 r4 = r9.A02
            int r3 = r4.getItemCount()
            r2 = 0
        L_0x0048:
            if (r2 >= r3) goto L_0x00a0
            X.2tJ r1 = r4.A03
            int r0 = r4.getItemViewType(r2)
            X.2tF r0 = r1.A01(r0)
            boolean r0 = r0 instanceof X.KG6
            if (r0 == 0) goto L_0x009b
            androidx.recyclerview.widget.RecyclerView r0 = r9.A01
            X.3kE r0 = r0.A0W(r2)
            if (r0 == 0) goto L_0x009b
            android.view.View r13 = r0.itemView
            if (r13 == 0) goto L_0x009b
            r0 = 2
            int[] r1 = new int[r0]
            r1 = {-1, -1} // fill-array
            r13.getLocationOnScreen(r1)
            r12 = r1[r6]
            r0 = 1
            r11 = r1[r0]
            int r10 = r13.getWidth()
            int r10 = r10 + r12
            r1 = r1[r0]
            int r0 = r13.getHeight()
            int r1 = r1 + r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r12, r11, r10, r1)
            boolean r0 = r8.contains(r0)
            if (r0 == 0) goto L_0x009b
            X.2tH r0 = r4.A04
            java.util.List r0 = r0.Au8()
            java.lang.Object r1 = r0.get(r2)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.avatars.stickergrid.AvatarStickerItemViewModel"
            X.0qQ.A0C(r1, r0)
            r5.add(r1)
        L_0x009b:
            int r2 = r2 + 1
            goto L_0x0048
        L_0x009e:
            r0 = 0
            goto L_0x002a
        L_0x00a0:
            java.util.Iterator r17 = r5.iterator()
        L_0x00a4:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x0229
            java.lang.Object r1 = r17.next()
            X.JyS r1 = (X.C61176JyS) r1
            X.0eM r0 = r7.A0I
            java.lang.Object r2 = r0.getValue()
            X.L9h r2 = (X.C63852L9h) r2
            X.0eM r0 = r7.A0J
            java.lang.String r9 = X.DbS.A0t(r0)
            X.6o8 r8 = r1.A01
            X.Gms r1 = r1.A00
            com.instagram.igds.components.search.IgdsInlineSearchBox r0 = r7.A0A
            if (r0 == 0) goto L_0x00cc
            java.lang.String r24 = r0.getSearchString()
            if (r24 != 0) goto L_0x00ce
        L_0x00cc:
            java.lang.String r24 = ""
        L_0x00ce:
            r3 = 45
            X.AnonymousClass7TF.A1H(r9, r8)
            r5 = 2
            X.0qQ.A0B(r1, r5)
            boolean r0 = r2.A05
            if (r0 == 0) goto L_0x01c3
            X.L85 r14 = r2.A03
            java.lang.String r13 = r8.A0a
            X.0qQ.A07(r13)
            java.lang.String r0 = r8.A0b
            r18 = r0
            X.0qQ.A07(r18)
            int r12 = r1.A00
            int r3 = r12 / r3
            r0 = r12 ^ 45
            if (r0 >= 0) goto L_0x00f7
            int r0 = r3 * 45
            if (r0 == r12) goto L_0x00f7
            int r3 = r3 + -1
        L_0x00f7:
            int r16 = r3 + 1
            int r11 = r1.A01
            java.lang.Integer r1 = r8.A04()
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r1 != r0) goto L_0x01bf
            java.lang.Integer r10 = X.AnonymousClass05K.A00
        L_0x0105:
            int r0 = r8.A0C
            boolean r15 = X.JTQ.A1P(r0, r5)
            com.instagram.avatars.store.AvatarStore r0 = r2.A01
            X.27E r1 = r0.A01
            boolean r0 = r1 instanceof X.C293135kC
            r2 = 0
            if (r0 == 0) goto L_0x011a
            X.5kC r1 = (X.C293135kC) r1
            if (r1 == 0) goto L_0x011a
            X.5kB r2 = r1.A00
        L_0x011a:
            r8 = 0
            if (r2 == 0) goto L_0x01ba
            java.lang.Integer r1 = r2.A00
            if (r1 == 0) goto L_0x01ba
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x01b6
            java.lang.String r8 = "2"
        L_0x0127:
            java.lang.String r5 = r2.A03
        L_0x0129:
            r4 = 1
            r0 = 7
            X.0qQ.A0B(r10, r0)
            com.instagram.common.session.UserSession r3 = r14.A02
            X.0Tu r2 = X.0Tu.A05
            r0 = 36329212801466229(0x81113a00003f75, double:3.038078689420908E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x00a4
            java.util.HashSet r0 = r14.A03
            boolean r1 = r0.contains(r13)
            if (r1 != 0) goto L_0x00a4
            X.0wc r14 = r14.A01
            java.lang.String r1 = "avatar_stickers_measurement_e2ee_avatar_sticker_tray_impression"
            X.0Aj r14 = X.AnonymousClass7TE.A0e(r14, r1)
            boolean r1 = r14.isSampled()
            if (r1 == 0) goto L_0x00a4
            r0.add(r13)
            X.Jqb r1 = new X.Jqb
            r1.<init>()
            java.lang.String r0 = "avatar_session_id"
            r1.A06(r0, r9)
            java.lang.String r9 = "e2ee_ranking"
            java.lang.String r0 = "product"
            r1.A06(r0, r9)
            java.lang.Long r9 = X.DbS.A0j(r11)
            java.lang.String r0 = "avatar_results_size"
            r1.A05(r0, r9)
            java.lang.String r11 = "message_thread"
            java.lang.String r0 = "referrer_surface"
            r1.A06(r0, r11)
            java.lang.Long r11 = X.DbS.A0j(r12)
            java.lang.String r0 = "sticker_rank"
            r1.A05(r0, r11)
            int r0 = r10.intValue()
            if (r0 == r6) goto L_0x01b3
            java.lang.String r10 = "static"
        L_0x0188:
            java.lang.String r0 = "sticker_type"
            r1.A06(r0, r10)
            r0 = r16
            A01(r1, r9, r0, r4, r15)
            long r9 = X.DbZ.A07(r13)
            java.lang.Long r4 = java.lang.Long.valueOf(r9)
            java.lang.String r0 = "media_template_id"
            r1.A05(r0, r4)
            java.lang.String r4 = "media_template_name"
            r0 = r18
            r1.A06(r4, r0)
            A00(r1, r2, r3, r8, r5)
            java.lang.String r0 = "event_data"
            r14.AAK(r1, r0)
            r14.Cgf()
            goto L_0x00a4
        L_0x01b3:
            java.lang.String r10 = "animated_sticker"
            goto L_0x0188
        L_0x01b6:
            java.lang.String r8 = "1"
            goto L_0x0127
        L_0x01ba:
            if (r2 != 0) goto L_0x0127
            r5 = r8
            goto L_0x0129
        L_0x01bf:
            java.lang.Integer r10 = X.AnonymousClass05K.A01
            goto L_0x0105
        L_0x01c3:
            X.LGV r12 = r2.A00
            int r0 = r24.length()
            if (r0 != 0) goto L_0x0226
            java.lang.Integer r19 = X.AnonymousClass05K.A00
        L_0x01cd:
            java.lang.String r11 = r8.A0a
            X.0qQ.A07(r11)
            int r4 = r1.A00
            int r2 = r4 / r3
            r14 = r2
            r13 = r4 ^ 45
            if (r13 >= 0) goto L_0x01e1
            int r0 = r2 * 45
            if (r0 == r4) goto L_0x01e1
            int r2 = r2 + -1
        L_0x01e1:
            int r26 = r2 + 1
            int r10 = r1.A01
            double r2 = (double) r10
            r0 = 4631530004285489152(0x4046800000000000, double:45.0)
            int r27 = X.JTP.A01(r2, r0)
            java.lang.Integer r1 = r8.A04()
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r1 != r0) goto L_0x0223
            java.lang.Integer r20 = X.AnonymousClass05K.A00
        L_0x01f9:
            if (r13 >= 0) goto L_0x0201
            int r0 = r14 * 45
            if (r0 == r4) goto L_0x0201
            int r14 = r14 + -1
        L_0x0201:
            int r0 = r14 * 45
            int r29 = r4 - r0
            java.lang.Integer r21 = X.AnonymousClass05K.A00
            java.lang.String r0 = r8.A0b
            X.0qQ.A07(r0)
            int r1 = r8.A0C
            boolean r31 = X.JTQ.A1P(r1, r5)
            r18 = r12
            r22 = r9
            r23 = r11
            r25 = r0
            r28 = r4
            r30 = r10
            r18.A01(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            goto L_0x00a4
        L_0x0223:
            java.lang.Integer r20 = X.AnonymousClass05K.A01
            goto L_0x01f9
        L_0x0226:
            java.lang.Integer r19 = X.AnonymousClass05K.A01
            goto L_0x01cd
        L_0x0229:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61364K4g.A0F():void");
    }

    public final void A0G() {
        if (this.A0J) {
            25x.A00(AnonymousClass7TE.A0l(this.A0S)).A04(new C59099J6h(this, 17));
        } else {
            A0B().A02();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0022, code lost:
        if (r0 != false) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0K(X.AnonymousClass2tC r13) {
        /*
            r12 = this;
            X.0eM r1 = r12.A0S
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r1)
            X.Jir r0 = r12.A0B()
            boolean r4 = r0.A0A
            boolean r0 = r12.A0I
            if (r0 != 0) goto L_0x0024
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r1)
            X.0Tu r2 = X.AnonymousClass7TF.A0H(r3)
            r0 = 36327297246050631(0x810f7c00003947, double:3.0368672844627613E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r3 = 0
            if (r0 == 0) goto L_0x0025
        L_0x0024:
            r3 = 1
        L_0x0025:
            X.L8m r2 = r12.A0Q
            r1 = 0
            r6 = 0
            X.KG6 r0 = new X.KG6
            r0.<init>(r2, r5, r4, r3)
            r13.A01(r0)
            r2 = r12
            boolean r0 = r12 instanceof X.K3N
            if (r0 == 0) goto L_0x00ef
            X.K3N r2 = (X.K3N) r2
            boolean r0 = r2.A02
        L_0x003a:
            if (r0 == 0) goto L_0x0072
            r2 = r12
            boolean r0 = r12 instanceof X.K3S
            if (r0 == 0) goto L_0x00ec
            X.K3S r2 = (X.K3S) r2
            X.7L0 r0 = r2.A04
            if (r0 == 0) goto L_0x00ec
            android.content.Context r3 = r2.getContext()
            int r0 = r0.A0E
            android.view.ContextThemeWrapper r2 = new android.view.ContextThemeWrapper
            r2.<init>(r3, r0)
            r0 = 2130971409(0x7f040b11, float:1.7551556E38)
            int r0 = X.2Yu.A0F(r2, r0)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
        L_0x005d:
            X.Nj1 r3 = X.C69300Nj1.AVATAR_EDIT
            r2 = 10
            X.MMP r0 = new X.MMP
            r0.<init>(r12, r2)
            java.util.Map r2 = X.AnonymousClass7TF.A0w(r3, r0)
            X.KG9 r0 = new X.KG9
            r0.<init>(r4, r2)
            r13.A01(r0)
        L_0x0072:
            X.Jir r0 = r12.A0B()
            boolean r0 = r0.A0A
            if (r0 == 0) goto L_0x0089
            r0 = 16
            X.MIh r2 = new X.MIh
            r2.<init>(r12, r0)
            X.KGZ r0 = new X.KGZ
            r0.<init>(r12, r2)
            r13.A01(r0)
        L_0x0089:
            boolean r0 = r12.A0G
            if (r0 == 0) goto L_0x00d1
            X.0eM r0 = r12.A0R
            X.6i2 r0 = X.DbZ.A0O(r0)
            X.0eM r0 = r0.A08
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            if (r0 == 0) goto L_0x00d1
            X.6ny r2 = r12.A0A()
            X.6ny r0 = X.C317866ny.STORIES
            if (r2 == r0) goto L_0x00da
            X.6ny r2 = r12.A0A()
            X.6ny r0 = X.C317866ny.MUSIC
            if (r2 == r0) goto L_0x00da
            android.content.Context r0 = r12.requireContext()
            int r11 = X.2Yu.A07(r0)
            r7 = r1
        L_0x00b4:
            r0 = 11
            X.MMP r8 = new X.MMP
            r8.<init>(r12, r0)
            r0 = 12
            X.MMP r9 = new X.MMP
            r9.<init>(r12, r0)
            r0 = 16
            X.J6h r10 = new X.J6h
            r10.<init>(r12, r0)
            X.KGq r5 = new X.KGq
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r13.A01(r5)
        L_0x00d1:
            X.EGK r0 = new X.EGK
            r0.<init>(r1)
            r13.A01(r0)
            return
        L_0x00da:
            r11 = 2131100036(0x7f060184, float:1.7812442E38)
            r0 = 2131100261(0x7f060265, float:1.7812898E38)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            r0 = 2131099843(0x7f0600c3, float:1.781205E38)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            goto L_0x00b4
        L_0x00ec:
            r4 = 0
            goto L_0x005d
        L_0x00ef:
            boolean r0 = r12.A0H
            goto L_0x003a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61364K4g.A0K(X.2tC):void");
    }

    /* JADX WARNING: type inference failed for: r1v10, types: [androidx.fragment.app.Fragment, X.K3R] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0M(java.lang.String r22) {
        /*
            r21 = this;
            r1 = r21
            boolean r0 = r1 instanceof X.K3R
            r17 = r22
            if (r0 == 0) goto L_0x0029
            X.K3R r1 = (X.K3R) r1
            X.GUi r11 = X.C63556Kz5.A01
            X.0eM r0 = r1.A07
            com.instagram.common.session.UserSession r14 = X.AnonymousClass7TE.A0l(r0)
            androidx.fragment.app.FragmentActivity r12 = r1.requireActivity()
            java.lang.String r15 = r1.A01
            if (r22 != 0) goto L_0x0026
            java.lang.String r16 = "ig_stories_creation_avatar_sticker_sheet"
        L_0x001c:
            r0 = 5
        L_0x001d:
            X.LdB r13 = new X.LdB
            r13.<init>(r1, r0)
            r11.A02(r12, r13, r14, r15, r16, r17)
        L_0x0025:
            return
        L_0x0026:
            java.lang.String r16 = "mux_banner"
            goto L_0x001c
        L_0x0029:
            boolean r0 = r1 instanceof X.K3O
            if (r0 == 0) goto L_0x006f
            X.K3O r1 = (X.K3O) r1
            X.GUi r11 = X.C63556Kz5.A01
            X.0eM r6 = r1.A0A
            com.instagram.common.session.UserSession r14 = X.AnonymousClass7TE.A0l(r6)
            androidx.fragment.app.FragmentActivity r12 = r1.requireActivity()
            r0 = 12
            X.LdB r13 = new X.LdB
            r13.<init>(r1, r0)
            X.6nx r5 = X.C317846nw.A01
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r6)
            X.6ny r4 = X.C317866ny.STORIES
            X.6nw r0 = X.C317846nw.AVATAR_QR_ANIMATED_MORE_OPTIONS_STICKERS
            r3 = 0
            java.lang.String r2 = r5.A00(r0, r4, r1, r3)
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r6)
            X.6nw r0 = X.C317846nw.AVATAR_QR_ANIMATED_MAIN_STICKERS
            java.lang.String r0 = r5.A00(r0, r4, r1, r3)
            java.lang.String[] r0 = new java.lang.String[]{r2, r0}
            java.util.List r18 = X.0sr.A1P(r0)
            java.lang.String r15 = "ig_stories_consumption"
            r0 = 745(0x2e9, float:1.044E-42)
            java.lang.String r16 = X.C273654mx.A00(r0)
        L_0x006b:
            r11.A04(r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x006f:
            boolean r0 = r1 instanceof X.K3N
            if (r0 == 0) goto L_0x00dd
            r7 = r1
            X.K3N r7 = (X.K3N) r7
            X.6nw r5 = r7.A09()
            X.6nw r4 = X.C317846nw.MUSIC_AVATAR_STICKERS_ICON
            X.0eM r6 = r7.A07
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r6)
            X.0Tu r2 = X.AnonymousClass7TF.A0H(r3)
            r0 = 36315898403098270(0x81051e00040e9e, double:3.029658610280232E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x00da
            X.6nw r0 = X.C317846nw.MUSIC_AVATAR_STICKERS_ANIMATED_DEFAULT_STICKER
        L_0x0093:
            X.6nw[] r0 = new X.C317846nw[]{r5, r4, r0}
            java.util.List r1 = X.0sr.A1P(r0)
            X.GUi r9 = X.C63556Kz5.A01
            com.instagram.common.session.UserSession r12 = X.AnonymousClass7TE.A0l(r6)
            androidx.fragment.app.FragmentActivity r10 = r7.requireActivity()
            java.lang.String r13 = r7.A01
            if (r22 != 0) goto L_0x00d7
            java.lang.String r14 = "ig_music_search_avatar_toggle"
        L_0x00ab:
            r0 = 8
            X.LdB r11 = new X.LdB
            r11.<init>(r7, r0)
            java.util.ArrayList r4 = X.AnonymousClass7TG.A0r(r1)
            java.util.Iterator r8 = r1.iterator()
        L_0x00ba:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0138
            java.lang.Object r5 = r8.next()
            X.6nw r5 = (X.C317846nw) r5
            X.6nx r3 = X.C317846nw.A01
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r6)
            X.6ny r1 = r7.A00
            r0 = 0
            java.lang.String r0 = r3.A00(r5, r1, r2, r0)
            r4.add(r0)
            goto L_0x00ba
        L_0x00d7:
            java.lang.String r14 = "mux_banner"
            goto L_0x00ab
        L_0x00da:
            X.6nw r0 = X.C317846nw.MUSIC_AVATAR_STICKERS_DEFAULT_STICKER
            goto L_0x0093
        L_0x00dd:
            boolean r0 = r1 instanceof X.K3S
            if (r0 == 0) goto L_0x00fb
            X.K3S r1 = (X.K3S) r1
            X.GUi r11 = X.C63556Kz5.A01
            X.0eM r0 = r1.A0K
            com.instagram.common.session.UserSession r14 = X.AnonymousClass7TE.A0l(r0)
            androidx.fragment.app.FragmentActivity r12 = r1.requireActivity()
            java.lang.String r15 = r1.A05
            if (r22 != 0) goto L_0x00f8
            java.lang.String r16 = "ig_direct_thread_sticker_tray_from_grid"
        L_0x00f5:
            r0 = 6
            goto L_0x001d
        L_0x00f8:
            java.lang.String r16 = "mux_banner"
            goto L_0x00f5
        L_0x00fb:
            boolean r0 = r1 instanceof X.K3M
            if (r0 == 0) goto L_0x0025
            r5 = r1
            X.K3M r5 = (X.K3M) r5
            X.GUi r11 = X.C63556Kz5.A01
            X.0eM r1 = r5.A04
            com.instagram.common.session.UserSession r14 = X.AnonymousClass7TE.A0l(r1)
            androidx.fragment.app.FragmentActivity r12 = r5.requireActivity()
            java.lang.String r15 = r5.A00
            if (r22 != 0) goto L_0x0135
            r0 = 3292(0xcdc, float:4.613E-42)
            java.lang.String r16 = X.AnonymousClass000.A00(r0)
        L_0x0118:
            r0 = 1
            X.LdB r13 = new X.LdB
            r13.<init>(r5, r0)
            X.6nx r4 = X.C317846nw.A01
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r1)
            X.6ny r2 = X.C317866ny.COMMENTS
            X.6nw r1 = r5.A09()
            r0 = 0
            java.lang.String r0 = r4.A00(r1, r2, r3, r0)
            java.util.List r18 = X.AnonymousClass7TE.A1I(r0)
            goto L_0x006b
        L_0x0135:
            java.lang.String r16 = "mux_banner"
            goto L_0x0118
        L_0x0138:
            r15 = 0
            r19 = 1
            r20 = 0
            r16 = r15
            r18 = r4
            r9.A03(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61364K4g.A0M(java.lang.String):void");
    }

    public final boolean A0O() {
        if (!(this instanceof K3S)) {
            return false;
        }
        K3S k3s = (K3S) this;
        if (AnonymousClass7TF.A1Z(k3s.A0H) || AnonymousClass7TF.A1Z(k3s.A0G)) {
            return true;
        }
        return false;
    }

    public C61364K4g() {
        MMP mmp = new MMP(this, 20);
        MMP mmp2 = new MMP(this, 14);
        0eO r4 = 0eO.A02;
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(r4, new MMP(mmp2, 15));
        this.A0U = DbS.A0I(new MMP(A002, 16), mmp, new MMX(32, (Object) null, (Object) A002), DbS.A0z(C60294Jir.class));
        MMP mmp3 = new MMP(this, 13);
        AnonymousClass0eM A003 = AnonymousClass0eN.A00(r4, new MMP(new MMP(this, 17), 18));
        this.A0R = DbS.A0I(new MMP(A003, 19), mmp3, new MMX(33, (Object) null, (Object) A003), DbS.A0z(C314336i2.class));
        this.A0N = true;
        this.A06 = DbS.A0R();
        this.A00 = 3;
        this.A0G = true;
        this.A0T = new C63593Kzg(this);
        this.A0P = C64284LYk.A00;
    }

    public static void A01(0bb r2, Long l, int i, boolean z, boolean z2) {
        r2.A03(C66579MXk.A00(924), Boolean.valueOf(z));
        r2.A03("is_social_sticker", Boolean.valueOf(z2));
        r2.A05("page_number", Long.valueOf((long) i));
        r2.A05("result_size", l);
    }

    public AnonymousClass3B3 A06() {
        int dimensionPixelSize;
        int dimensionPixelSize2;
        int dimensionPixelSize3;
        boolean z;
        Resources A052 = DbV.A05(this);
        if (this.A00 == 3) {
            dimensionPixelSize = A052.getDimensionPixelOffset(R.dimen.ad4ad_button_bottom_margin);
            dimensionPixelSize2 = A052.getDimensionPixelOffset(R.dimen.asset_picker_cell_margin);
            dimensionPixelSize3 = A052.getDimensionPixelOffset(R.dimen.ad4ad_button_bottom_margin);
        } else {
            dimensionPixelSize = A052.getDimensionPixelSize(R.dimen.abc_control_corner_material);
            dimensionPixelSize2 = A052.getDimensionPixelSize(R.dimen.abc_control_corner_material);
            dimensionPixelSize3 = A052.getDimensionPixelSize(R.dimen.abc_control_corner_material);
        }
        int i = this.A00;
        if (this instanceof K3N) {
            z = ((K3N) this).A02;
        } else {
            z = this.A0H;
        }
        return new C62137Kaq(A052, i, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, z ? 1 : 0);
    }

    public final void A0H() {
        C60294Jir A0B2 = A0B();
        A0B2.A09 = true;
        A0B2.A00 = 0;
        A0B2.A0R.clear();
        A0B().A0N.A01();
    }

    public final void A0I() {
        String str;
        C60294Jir A0B2 = A0B();
        A0B2.A09 = true;
        A0B2.A00 = 0;
        A0B2.A0R.clear();
        A0B().A0N.A01();
        this.A06 = DbS.A0R();
        IgdsInlineSearchBox igdsInlineSearchBox = this.A0A;
        if (igdsInlineSearchBox == null || (str = igdsInlineSearchBox.getSearchString()) == null) {
            str = "";
        }
        A0B().A05(str);
    }

    public final void A0L(C317966o8 r6) {
        A0B().A04(r6);
        0eP A1L = AnonymousClass7TE.A1L(AnonymousClass000.A00(387), r6.A0S);
        Bundle A0P2 = AnonymousClass7TG.A0P(AnonymousClass000.A00(388), C48081EUz.AVATAR, A1L);
        AnonymousClass6W8 A022 = AnonymousClass6W8.A02(requireActivity(), A0P2, DbT.A0X(this.A0S), TransparentModalActivity.class, "attribution_quick_camera_fragment");
        Dbc.A0y(A022);
        A022.A0D(this, 60571);
    }

    public void A0N(List list) {
        A02((C62719KlJ) null, (C62723KlN) null, this, DbS.A0R(), list, true);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1719272859);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.avatar_sticker_grid_fragment, viewGroup, false);
        AnonymousClass0fD.A09(287638897, A022);
        return inflate;
    }

    public void onDestroy() {
        int A022 = AnonymousClass0fD.A02(1260224594);
        if (isAdded()) {
            A0B().A0H.markerEnd(129908197, 4);
        }
        super.onDestroy();
        AnonymousClass0fD.A09(1681866342, A022);
    }

    public void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1303607860);
        super.onDestroyView();
        this.A0A = null;
        A07().A0b();
        AnonymousClass0fD.A09(741342942, A022);
    }

    public static void A00(0bb r2, 0Tu r3, 0lg r4, String str, String str2) {
        if (182.A06(r3, r4, 36329212801531766L)) {
            r2.A06(C273654mx.A00(1516), str);
            r2.A06("avatar_revision_id", str2);
        }
    }
}
