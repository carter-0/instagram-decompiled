package com.instagram.avatars.convergence2;

import X.07U;
import X.0eO;
import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass07Z;
import X.AnonymousClass07a;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass4D7;
import X.AnonymousClass4DH;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TH;
import X.C227642jf;
import X.C252063oV;
import X.C267624bv;
import X.C314336i2;
import X.C317846nw;
import X.C47391DxN;
import X.C51799G2i;
import X.C52480GUi;
import X.C63556Kz5;
import X.C66579MXk;
import X.DbS;
import X.DbT;
import X.DbU;
import X.DbV;
import X.DbX;
import X.DbZ;
import X.Dba;
import X.DxO;
import X.FP6;
import X.MHH;
import X.MMX;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.spinner.SpinnerImageView;

public abstract class AvatarConvergenceUpsellBottomSheetFragment extends AnonymousClass4DH {
    public int A00 = R.drawable.ig_avatars_style_2_g6_casual_alpha_style2;
    public Resources A01;
    public View A02;
    public TextView A03;
    public TextView A04;
    public TextView A05;
    public ConstraintLayout A06;
    public IgImageView A07;
    public C252063oV A08;
    public SpinnerImageView A09;
    public final AnonymousClass0eM A0A = C227642jf.A02(this);
    public final AnonymousClass0eM A0B;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: android.graphics.drawable.Drawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: X.4Dk} */
    /* JADX WARNING: type inference failed for: r6v1, types: [X.MDg, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00cf A[Catch:{ Exception -> 0x00dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d8 A[Catch:{ Exception -> 0x00dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.avatars.convergence2.AvatarConvergenceUpsellBottomSheetFragment r12, java.lang.String r13, X.AnonymousClass4D7 r14) {
        /*
            r2 = 0
            boolean r0 = X.C66128MDg.A01(r2, r14)
            if (r0 == 0) goto L_0x0026
            r6 = r14
            X.MDg r6 = (X.C66128MDg) r6
            int r3 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x0026
            int r3 = r3 - r1
            r6.A00 = r3
        L_0x0015:
            java.lang.Object r1 = r6.A02
            X.1Hj r5 = X.1Hj.A02
            int r0 = r6.A00
            r7 = 1
            if (r0 == 0) goto L_0x0031
            if (r0 != r7) goto L_0x002c
            java.lang.Object r12 = r6.A01
            com.instagram.avatars.convergence2.AvatarConvergenceUpsellBottomSheetFragment r12 = (com.instagram.avatars.convergence2.AvatarConvergenceUpsellBottomSheetFragment) r12
            goto L_0x00c8
        L_0x0026:
            X.MDg r6 = new X.MDg
            r6.<init>(r12, r14, r2)
            goto L_0x0015
        L_0x002c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0031:
            X.0eS.A00(r1)
            r11 = 0
            X.3Ns r8 = new X.3Ns
            r8.<init>()
            X.3Ns r4 = new X.3Ns
            r4.<init>()
            X.3Ns r3 = new X.3Ns
            r3.<init>()
            android.view.View r1 = r12.mView
            if (r1 == 0) goto L_0x0070
            r0 = 2131428398(0x7f0b042e, float:1.847844E38)
            android.widget.ImageView r10 = X.DbS.A0G(r1, r0)
            if (r10 == 0) goto L_0x0070
            android.content.Context r1 = r12.requireContext()
            r0 = 2131237509(0x7f081a85, float:1.809127E38)
            android.graphics.drawable.Drawable r9 = r1.getDrawable(r0)
            boolean r0 = r9 instanceof X.C262364Dk
            if (r0 == 0) goto L_0x00b7
            r1 = r9
            X.4Dk r1 = (X.C262364Dk) r1
        L_0x0063:
            if (r1 == 0) goto L_0x006d
            X.LjP r0 = new X.LjP
            r0.<init>(r7, r1, r4)
            r1.A01(r0)
        L_0x006d:
            r10.setImageDrawable(r9)
        L_0x0070:
            android.view.View r1 = r12.mView
            if (r1 == 0) goto L_0x009d
            r0 = 2131428400(0x7f0b0430, float:1.8478443E38)
            android.widget.ImageView r10 = X.DbS.A0G(r1, r0)
            if (r10 == 0) goto L_0x009d
            android.content.Context r1 = r12.requireContext()
            r0 = 2131237510(0x7f081a86, float:1.8091272E38)
            android.graphics.drawable.Drawable r9 = r1.getDrawable(r0)
            boolean r0 = r9 instanceof X.C262364Dk
            if (r0 == 0) goto L_0x008f
            r11 = r9
            X.4Dk r11 = (X.C262364Dk) r11
        L_0x008f:
            if (r11 == 0) goto L_0x009a
            r1 = 2
            X.LjP r0 = new X.LjP
            r0.<init>(r1, r11, r3)
            r11.A01(r0)
        L_0x009a:
            r10.setImageDrawable(r9)
        L_0x009d:
            android.view.View r1 = r12.mView
            if (r1 == 0) goto L_0x00b9
            r0 = 2131428396(0x7f0b042c, float:1.8478435E38)
            android.view.View r1 = r1.findViewById(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r1 = (com.instagram.common.ui.widget.imageview.IgImageView) r1
            if (r1 == 0) goto L_0x00b9
            X.LjM r0 = new X.LjM
            r0.<init>(r8, r2)
            r1.A0E = r0
            X.DbV.A1P(r12, r1, r13)
            goto L_0x00b9
        L_0x00b7:
            r1 = r11
            goto L_0x0063
        L_0x00b9:
            X.2Q9[] r0 = new X.AnonymousClass2Q9[]{r8, r4, r3}     // Catch:{ Exception -> 0x00dc }
            r6.A01 = r12     // Catch:{ Exception -> 0x00dc }
            r6.A00 = r7     // Catch:{ Exception -> 0x00dc }
            java.lang.Object r0 = X.AnonymousClass42T.A02(r6, r0)     // Catch:{ Exception -> 0x00dc }
            if (r0 != r5) goto L_0x00cb
            return r5
        L_0x00c8:
            X.0eS.A00(r1)     // Catch:{ Exception -> 0x00dc }
        L_0x00cb:
            com.instagram.ui.widget.spinner.SpinnerImageView r1 = r12.A09     // Catch:{ Exception -> 0x00dc }
            if (r1 == 0) goto L_0x00d4
            X.3uy r0 = X.C255943uy.LOADED     // Catch:{ Exception -> 0x00dc }
            r1.setLoadingStatus(r0)     // Catch:{ Exception -> 0x00dc }
        L_0x00d4:
            androidx.constraintlayout.widget.ConstraintLayout r0 = r12.A06     // Catch:{ Exception -> 0x00dc }
            if (r0 == 0) goto L_0x00f3
            r0.setVisibility(r2)     // Catch:{ Exception -> 0x00dc }
            goto L_0x00f3
        L_0x00dc:
            androidx.constraintlayout.widget.ConstraintLayout r0 = r12.A06
            X.AnonymousClass7TH.A0R(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r12.A07
            X.AnonymousClass7TF.A16(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r2 = r12.A07
            if (r2 == 0) goto L_0x00f3
            android.content.Context r1 = r12.requireContext()
            int r0 = r12.A00
            X.DbU.A13(r1, r2, r0)
        L_0x00f3:
            X.0gF r5 = X.C60340gF.A00
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.avatars.convergence2.AvatarConvergenceUpsellBottomSheetFragment.A00(com.instagram.avatars.convergence2.AvatarConvergenceUpsellBottomSheetFragment, java.lang.String, X.4D7):java.lang.Object");
    }

    public void onViewCreated(View view, Bundle bundle) {
        View view2;
        TextView textView;
        int i;
        int A072;
        int i2;
        int i3;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A01 = DbV.A05(this);
        this.A05 = DbU.A0G(view, R.id.avatar_convergence_upsell_title);
        this.A04 = DbU.A0G(view, R.id.avatar_convergence_upsell_subtitle);
        this.A03 = DbU.A0G(view, R.id.avatar_convergence_upsell_cta_button);
        this.A07 = DbT.A0b(view, R.id.avatar_convergence_no_avatar_upsell_icon);
        this.A08 = DbU.A0Y(view, R.id.avatar_convergence_upsell_secondary_cta_button);
        this.A02 = view.findViewById(R.id.bottom_sheet_drag_handle);
        this.A09 = (SpinnerImageView) view.findViewById(R.id.avatar_convergence_upsell_loading_spinner);
        this.A06 = (ConstraintLayout) view.findViewById(R.id.avatar_convergence_with_avatar_upsell_image_container);
        TextView textView2 = this.A05;
        if (textView2 != null) {
            Resources resources = this.A01;
            if (resources != null) {
                if (this instanceof DxO) {
                    i3 = DbX.A07(((DxO) this).A07);
                } else {
                    i3 = 2131956736;
                }
                textView2.setText(resources.getText(i3));
            }
            0qQ.A0F("contextResources");
            throw AnonymousClass00P.createAndThrow();
        }
        TextView textView3 = this.A04;
        if (textView3 != null) {
            Resources resources2 = this.A01;
            if (resources2 != null) {
                if (this instanceof DxO) {
                    i2 = DbX.A07(((DxO) this).A06);
                } else {
                    i2 = 2131956735;
                }
                textView3.setText(resources2.getText(i2));
            }
            0qQ.A0F("contextResources");
            throw AnonymousClass00P.createAndThrow();
        }
        TextView textView4 = this.A03;
        if (textView4 != null) {
            Resources resources3 = this.A01;
            if (resources3 != null) {
                if (this instanceof DxO) {
                    A072 = DbX.A07(((DxO) this).A03);
                } else {
                    A072 = DbX.A07(((C47391DxN) this).A02);
                }
                textView4.setText(resources3.getText(A072));
            }
            0qQ.A0F("contextResources");
            throw AnonymousClass00P.createAndThrow();
        }
        TextView textView5 = this.A03;
        if (textView5 != null) {
            FP6.A00(textView5, 38, this);
        }
        boolean z = this instanceof DxO;
        if (!z || AnonymousClass7TF.A1Z(((DxO) this).A05)) {
            C252063oV r0 = this.A08;
            if (r0 != null) {
                r0.setVisibility(0);
            }
            C252063oV r02 = this.A08;
            if (!(r02 == null || (textView = (TextView) r02.getView()) == null)) {
                Resources resources4 = this.A01;
                if (resources4 != null) {
                    if (z) {
                        i = DbX.A07(((DxO) this).A04);
                    } else {
                        i = 2131956734;
                    }
                    textView.setText(resources4.getText(i));
                }
                0qQ.A0F("contextResources");
                throw AnonymousClass00P.createAndThrow();
            }
            C252063oV r03 = this.A08;
            if (!(r03 == null || (view2 = r03.getView()) == null)) {
                FP6.A00(view2, 39, this);
            }
        }
        AnonymousClass7TH.A0R(this.A02);
        AnonymousClass0eM r2 = this.A0B;
        if (Dba.A1a(r2)) {
            AnonymousClass7TH.A0R(this.A07);
            ConstraintLayout constraintLayout = this.A06;
            if (constraintLayout != null) {
                constraintLayout.setVisibility(4);
            }
            07U r6 = 07U.A05;
            AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
            AnonymousClass7TE.A1Z(new MHH(r6, this, viewLifecycleOwner, (AnonymousClass4D7) null, 30), AnonymousClass07a.A00(viewLifecycleOwner));
            DbZ.A0O(r2).A02(C317846nw.CONVERGENCE_2_GROUP_PIC_UPSELL_STICKER_PACK);
            return;
        }
        IgImageView igImageView = this.A07;
        if (igImageView != null) {
            igImageView.setVisibility(0);
        }
        IgImageView igImageView2 = this.A07;
        if (igImageView2 != null) {
            DbU.A13(requireContext(), igImageView2, this.A00);
        }
    }

    public final String A01() {
        String str;
        if (this instanceof DxO) {
            str = ((DxO) this).A02;
        } else {
            str = ((C47391DxN) this).A01;
        }
        if (str != null) {
            return str;
        }
        0qQ.A0F("editorLoggingSurface");
        throw AnonymousClass00P.createAndThrow();
    }

    public void A02() {
        String str;
        C52480GUi gUi = C63556Kz5.A01;
        UserSession A0l = AnonymousClass7TE.A0l(this.A0A);
        FragmentActivity requireActivity = requireActivity();
        String A012 = A01();
        if (this instanceof DxO) {
            str = ((DxO) this).A01;
            if (str == null) {
                0qQ.A0F("editorLoggingMechanism");
                throw AnonymousClass00P.createAndThrow();
            }
        } else {
            str = "mux_identity_sheet";
        }
        gUi.A02(requireActivity, (C267624bv) null, A0l, A012, str, C66579MXk.A00(62));
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0A);
    }

    public AvatarConvergenceUpsellBottomSheetFragment() {
        C51799G2i A002 = C51799G2i.A00(this, 30);
        AnonymousClass0eM A003 = AnonymousClass0eN.A00(0eO.A02, C51799G2i.A00(C51799G2i.A00(this, 27), 28));
        this.A0B = DbS.A0I(C51799G2i.A00(A003, 29), A002, new MMX(22, (Object) null, (Object) A003), DbS.A0z(C314336i2.class));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-644064248);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.avatar_convergence_upsell_sheet_fragment, viewGroup, false);
        AnonymousClass0fD.A09(504430892, A022);
        return inflate;
    }

    public void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1215805179);
        super.onDestroyView();
        this.A05 = null;
        this.A04 = null;
        this.A03 = null;
        this.A08 = null;
        this.A07 = null;
        this.A02 = null;
        this.A09 = null;
        this.A06 = null;
        AnonymousClass0fD.A09(1717475448, A022);
    }
}
