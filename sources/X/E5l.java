package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.textview.ComposerAutoCompleteTextView;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class E5l extends AnonymousClass4DH implements C268594df {
    public static final String __redex_internal_original_name = "DirectGenericInterstitialReplyModalFragment";
    public float A00;
    public JVH A01;
    public FEo A02;
    public C71003OWa A03;
    public C51868G5f A04;
    public User A05;
    public boolean A06;
    public boolean A07;
    public boolean A08 = true;
    public final AnonymousClass0eM A09 = AnonymousClass0eN.A01(new C46570DhC(this, 31));

    public final int AqL() {
        return -2;
    }

    public final float CMx() {
        return 1.0f;
    }

    public final float Cmb() {
        return 1.0f;
    }

    public final void DMu(int i) {
        this.A07 = true;
        if (this.A06 && i != 0) {
            View view = this.mView;
            if (view != null) {
                View requireViewById = view.requireViewById(R.id.ice_breaker_scroll_view);
                float f = (((float) Dbb.A09(this, requireViewById).getDisplayMetrics().heightPixels) - ((float) i)) - this.A00;
                if (((float) requireViewById.getMeasuredHeight()) > f) {
                    ViewGroup.LayoutParams layoutParams = requireViewById.getLayoutParams();
                    0qQ.A07(layoutParams);
                    layoutParams.height = (int) f;
                    requireViewById.setLayoutParams(layoutParams);
                    return;
                }
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public final boolean Erf() {
        return true;
    }

    public final void onBottomSheetPositionChanged(int i, int i2) {
    }

    /* JADX WARNING: type inference failed for: r1v14, types: [X.4ou, java.lang.Object] */
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        View requireViewById;
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        TextView A0R = AnonymousClass7TG.A0R(view2, R.id.banner_title);
        TextView A0R2 = AnonymousClass7TG.A0R(view2, R.id.banner_subtitle);
        IgImageView A0b = DbX.A0b(view2, R.id.avatar);
        TextView A0R3 = AnonymousClass7TG.A0R(view2, R.id.content_title);
        TextView A0R4 = AnonymousClass7TG.A0R(view2, R.id.content_subtitle);
        DbZ.A14(A0R, ((N4R) A01().A02).A02);
        DbZ.A14(A0R3, ((C61084JwM) A01().A01).A02);
        DbZ.A14(A0R4, ((C61084JwM) A01().A01).A01);
        A0b.setUrl((ImageUrl) ((C61084JwM) A01().A01).A00, this);
        CharSequence charSequence = (CharSequence) ((N4R) A01().A02).A00;
        if (charSequence == null || charSequence.length() == 0) {
            A0R2.setVisibility(8);
        } else {
            DbZ.A14(A0R2, ((N4R) A01().A02).A00);
            A0R2.setVisibility(0);
        }
        Context A0S = AnonymousClass7TE.A0S(view2);
        view2.setOnTouchListener(new C71439Oke((Object) new GestureDetector(A0S, new N1Q(A0S, new C50393Faw(this))), 1));
        List list = (List) A01().A03;
        if (list == null || list.isEmpty()) {
            z = false;
        } else {
            FragmentActivity requireActivity = requireActivity();
            LayoutInflater from = LayoutInflater.from(getContext());
            0qQ.A07(from);
            C71003OWa oWa = new C71003OWa(requireActivity, from, view2, this, AnonymousClass7TE.A0l(this.A09), this.A05, "", new JJR(this, 12), false);
            this.A03 = oWa;
            oWa.A02 = C69339Nje.A03;
            ArrayList A1C = AnonymousClass7TE.A1C();
            List list2 = (List) A01().A03;
            if (list2 != null) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    String A18 = AnonymousClass7TE.A18(it);
                    ? obj = new Object();
                    obj.A05 = A18;
                    obj.A03 = "";
                    obj.A00 = null;
                    obj.A06 = null;
                    obj.A04 = null;
                    obj.A02 = null;
                    obj.A01 = null;
                    A1C.add(obj);
                }
                oWa.A02((AnonymousClass9IV) null, (C45275Cte) null, (C254703su) null, A1C, false, false, false, false, false);
                view2.findViewById(R.id.instant_reply_bar).setBackgroundColor(2Yu.A0F(getContext(), R.attr.igds_color_elevated_background));
                z = true;
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        this.A06 = z;
        if (z && (requireViewById = view2.requireViewById(R.id.ice_breaker)) != null) {
            requireViewById.setVisibility(0);
        }
        FEo fEo = this.A02;
        if (fEo == null) {
            0qQ.A0F("composerController");
            throw AnonymousClass00P.createAndThrow();
        }
        C71003OWa oWa2 = this.A03;
        fEo.A00 = (ComposerAutoCompleteTextView) view2.requireViewById(R.id.messaging_edittext);
        View A0G = AnonymousClass7TF.A0G(view2, R.id.messaging_send_button);
        ComposerAutoCompleteTextView composerAutoCompleteTextView = fEo.A00;
        if (composerAutoCompleteTextView != null) {
            composerAutoCompleteTextView.setHint(fEo.A02.A05);
            ComposerAutoCompleteTextView composerAutoCompleteTextView2 = fEo.A00;
            if (composerAutoCompleteTextView2 != null) {
                composerAutoCompleteTextView2.addTextChangedListener(new FKj(2, A0G, oWa2));
                ComposerAutoCompleteTextView composerAutoCompleteTextView3 = fEo.A00;
                if (composerAutoCompleteTextView3 != null) {
                    FQe.A00(composerAutoCompleteTextView3, fEo, 1);
                    FPI.A01(A0G, 46, fEo);
                    if (this.A06) {
                        View view3 = this.mView;
                        if (view3 != null) {
                            View A0G2 = AnonymousClass7TF.A0G(view3, R.id.header);
                            View view4 = this.mView;
                            if (view4 != null) {
                                View A0G3 = AnonymousClass7TF.A0G(view4, R.id.content);
                                View view5 = this.mView;
                                if (view5 != null) {
                                    View A0G4 = AnonymousClass7TF.A0G(view5, R.id.reply_modal_composer);
                                    A0G2.measure(0, 0);
                                    A0G3.measure(0, 0);
                                    A0G4.measure(0, 0);
                                    this.A00 = DbV.A05(this).getDimension(R.dimen.account_group_management_clickable_width) + ((float) A0G2.getMeasuredHeight()) + ((float) A0G3.getMeasuredHeight()) + ((float) A0G4.getMeasuredHeight());
                                } else {
                                    throw AnonymousClass7TE.A0z("Required value was null.");
                                }
                            } else {
                                throw AnonymousClass7TE.A0z("Required value was null.");
                            }
                        } else {
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                    }
                    if (!this.A08) {
                        DbX.A1B(view2, R.id.bottom_sheet_drag_handle);
                        return;
                    }
                    return;
                }
            }
        }
        0qQ.A0F("composerEditTextView");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A00(E5l e5l) {
        FEo fEo = e5l.A02;
        if (fEo == null) {
            0qQ.A0F("composerController");
            throw AnonymousClass00P.createAndThrow();
        }
        fEo.A02();
        DbX.A14(e5l.getContext(), AnonymousClass37D.A00);
        View view = e5l.mView;
        if (view != null) {
            C294975nL A002 = C294975nL.A00(view);
            A002.A0G();
            C294975nL A0B = A002.A0A().A0B(0.5f);
            A0B.A0K((float) view.getHeight());
            A0B.A0H();
        }
    }

    public final JVH A01() {
        JVH jvh = this.A01;
        if (jvh != null) {
            return jvh;
        }
        0qQ.A0F("viewModel");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* synthetic */ boolean AB6() {
        return false;
    }

    public final /* synthetic */ boolean ANU() {
        return false;
    }

    public final View C4U() {
        return this.mView;
    }

    public final int C8P() {
        return 0;
    }

    public final boolean CPc() {
        return false;
    }

    public final /* synthetic */ float CoU() {
        return 1.0f;
    }

    public final void DMt() {
        String str;
        if (this.A07) {
            FEo fEo = this.A02;
            if (fEo == null) {
                str = "composerController";
            } else {
                ComposerAutoCompleteTextView composerAutoCompleteTextView = fEo.A00;
                if (composerAutoCompleteTextView == null) {
                    str = "composerEditTextView";
                } else {
                    String A12 = DbV.A12(AnonymousClass7TF.A0f(composerAutoCompleteTextView));
                    if (A12 == null || A12.length() == 0) {
                        A00(this);
                        return;
                    }
                    return;
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final String getModuleName() {
        return "direct_interstitial_reply_modal";
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A09);
    }

    public final boolean isScrolledToTop() {
        return false;
    }

    public final void onBottomSheetClosed() {
        FEo fEo = this.A02;
        if (fEo == null) {
            0qQ.A0F("composerController");
            throw AnonymousClass00P.createAndThrow();
        } else {
            fEo.A02();
        }
    }

    public final int AhP(Context context) {
        return Dbb.A02(context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0156, code lost:
        if (r6 != null) goto L_0x00bb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0165  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r25) {
        /*
            r24 = this;
            r0 = 1728473075(0x670667f3, float:6.347146E23)
            int r5 = X.AnonymousClass0fD.A02(r0)
            r7 = r24
            r0 = r25
            X.E5l.super.onCreate(r0)
            android.os.Bundle r2 = r7.mArguments
            java.lang.String r15 = "Required value was null."
            if (r2 == 0) goto L_0x0182
            r1 = 1
            r0 = 2206(0x89e, float:3.091E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r2.getBoolean(r0, r1)
            r7.A08 = r0
            android.os.Bundle r2 = r7.mArguments
            if (r2 == 0) goto L_0x017a
            android.content.Context r12 = r7.getContext()
            if (r12 == 0) goto L_0x018a
            X.0eM r10 = r7.A09
            com.instagram.common.session.UserSession r11 = X.AnonymousClass7TE.A0l(r10)
            com.instagram.user.model.User r9 = r7.A05
            r0 = 3
            X.0qQ.A0B(r11, r0)
            r0 = 220(0xdc, float:3.08E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r3 = r2.getString(r0)
            X.C320236s2.A03(r2, r3, r0)
            r0 = 52
            java.lang.String r0 = X.C273654mx.A00(r0)
            boolean r0 = X.0qQ.A0K(r3, r0)
            if (r0 == 0) goto L_0x016f
            r0 = 432(0x1b0, float:6.05E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            android.os.Parcelable r8 = r2.getParcelable(r0)
            r0 = 1641(0x669, float:2.3E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r8, r0)
            com.instagram.user.model.Product r8 = (com.instagram.user.model.Product) r8
            r0 = 433(0x1b1, float:6.07E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            android.os.Parcelable r6 = r2.getParcelable(r0)
            com.instagram.shopping.model.pdp.link.secondarytext.SecondaryTextContent r6 = (com.instagram.shopping.model.pdp.link.secondarytext.SecondaryTextContent) r6
            com.instagram.model.mediasize.ImageInfo r4 = r8.A08
            if (r4 == 0) goto L_0x016a
            X.Veg r16 = X.C18497Vss.A06
            r3 = 0
            r21 = r3
            r22 = r1
            r23 = r1
            r20 = r3
            r19 = r8
            r18 = r11
            r17 = r12
            android.text.SpannableStringBuilder r0 = r16.A00(r17, r18, r19, r20, r21, r22, r23)
            android.text.SpannableStringBuilder r13 = X.DbS.A0C(r0)
            int r14 = r0.length()
            r2 = 0
            r0 = 2132018624(0x7f1405c0, float:1.967556E38)
            android.text.style.TextAppearanceSpan r1 = new android.text.style.TextAppearanceSpan
            r1.<init>(r12, r0)
            r0 = 33
            r13.setSpan(r1, r2, r14, r0)
            if (r6 == 0) goto L_0x0155
            java.lang.String r0 = r6.A00
            if (r0 == 0) goto L_0x0155
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0155
            X.0Tu r2 = X.0Tu.A05
            r0 = 36312844681086230(0x81025700000516, double:3.027727424183466E-306)
            boolean r0 = X.182.A06(r2, r11, r0)
            if (r0 == 0) goto L_0x0155
            java.lang.String r0 = r6.A00
        L_0x00bb:
            java.util.List r1 = r6.A01
            if (r1 == 0) goto L_0x015a
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x015a
            X.0Tu r14 = X.0Tu.A05
            r1 = 36312844681151767(0x81025700010517, double:3.027727424224912E-306)
            boolean r1 = X.182.A06(r14, r11, r1)
            if (r1 == 0) goto L_0x015a
            java.util.List r1 = r6.A01
        L_0x00d4:
            r11 = 2131959818(0x7f13200a, float:1.9556287E38)
            com.instagram.user.model.User r6 = r8.A0B
            if (r6 == 0) goto L_0x0153
            X.4Cl r2 = r6.A03
            java.lang.String r2 = r2.getUsername()
        L_0x00e1:
            java.lang.String r14 = X.DbY.A0c(r12, r2, r11)
            r11 = 6
            X.N4R r2 = new X.N4R
            r2.<init>((java.lang.CharSequence) r14, (java.lang.CharSequence) r0, (int) r11)
            com.instagram.model.mediasize.ExtendedImageUrl r11 = X.1iI.A01(r12, r4)
            if (r11 == 0) goto L_0x0165
            java.lang.String r0 = r8.A0J
            X.JwM r4 = new X.JwM
            r4.<init>((com.instagram.common.typedurl.ImageUrl) r11, (java.lang.CharSequence) r0, (java.lang.CharSequence) r13)
            r0 = 2131966197(0x7f1338f5, float:1.9569225E38)
            java.lang.String r20 = r12.getString(r0)
            if (r9 != 0) goto L_0x011f
            android.os.Parcelable$Creator r0 = com.instagram.user.model.User.CREATOR
            if (r6 == 0) goto L_0x0150
            java.lang.String r8 = X.AnonymousClass3ZA.A00(r6)
            X.4Cl r0 = r6.A03
            java.lang.String r0 = r0.getUsername()
        L_0x010f:
            com.instagram.user.model.User r9 = new com.instagram.user.model.User
            r9.<init>(r8, r0)
            if (r6 == 0) goto L_0x011c
            X.4Cl r0 = r6.A03
            com.instagram.common.typedurl.ImageUrl r3 = r0.Bh3()
        L_0x011c:
            r9.A0l(r3)
        L_0x011f:
            X.JVH r0 = new X.JVH
            r18 = r4
            r19 = r9
            r21 = r1
            r17 = r2
            r16 = r0
            r16.<init>((X.N4R) r17, (X.C61084JwM) r18, (com.instagram.user.model.User) r19, (java.lang.String) r20, (java.util.List) r21)
            r7.A01 = r0
            android.content.Context r9 = r7.getContext()
            if (r9 == 0) goto L_0x015d
            com.instagram.common.session.UserSession r12 = X.AnonymousClass7TE.A0l(r10)
            X.JVH r10 = r7.A01()
            X.G5f r0 = r7.A04
            X.FEo r8 = new X.FEo
            r11 = r7
            r13 = r0
            r8.<init>(r9, r10, r11, r12, r13)
            r7.A02 = r8
            r0 = 10592999(0xa1a2e7, float:1.4843953E-38)
            X.AnonymousClass0fD.A09(r0, r5)
            return
        L_0x0150:
            r8 = r3
            r0 = r3
            goto L_0x010f
        L_0x0153:
            r2 = r3
            goto L_0x00e1
        L_0x0155:
            r0 = r3
            if (r6 == 0) goto L_0x015a
            goto L_0x00bb
        L_0x015a:
            r1 = r3
            goto L_0x00d4
        L_0x015d:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r15)
            r0 = 744371172(0x2c5e33e4, float:3.1576903E-12)
            goto L_0x0191
        L_0x0165:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r15)
            throw r1
        L_0x016a:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r15)
            throw r1
        L_0x016f:
            r0 = 628(0x274, float:8.8E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            java.lang.IllegalArgumentException r1 = X.AnonymousClass7TF.A0W(r0, r3)
            throw r1
        L_0x017a:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r15)
            r0 = -1493646623(0xffffffffa6f8c2e1, float:-1.7261279E-15)
            goto L_0x0191
        L_0x0182:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r15)
            r0 = 1057968345(0x3f0f50d9, float:0.5598274)
            goto L_0x0191
        L_0x018a:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r15)
            r0 = 1326815909(0x4f159aa5, float:2.50993997E9)
        L_0x0191:
            X.AnonymousClass0fD.A09(r0, r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E5l.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-86365914);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_interstitial_reply_modal, viewGroup, false);
        AnonymousClass0fD.A09(1381366834, A022);
        return inflate;
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(1587909075);
        E5l.super.onPause();
        FEo fEo = this.A02;
        if (fEo == null) {
            0qQ.A0F("composerController");
            throw AnonymousClass00P.createAndThrow();
        }
        fEo.A02();
        this.A07 = false;
        AnonymousClass0fD.A09(-418976155, A022);
    }

    public final void onResume() {
        String str;
        Window window;
        int A022 = AnonymousClass0fD.A02(266545979);
        super.onResume();
        FEo fEo = this.A02;
        if (fEo == null) {
            str = "composerController";
        } else {
            ComposerAutoCompleteTextView composerAutoCompleteTextView = fEo.A00;
            str = "composerEditTextView";
            if (composerAutoCompleteTextView != null) {
                composerAutoCompleteTextView.requestFocus();
                ComposerAutoCompleteTextView composerAutoCompleteTextView2 = fEo.A00;
                if (composerAutoCompleteTextView2 != null) {
                    0nA.A0R(composerAutoCompleteTextView2);
                    Activity rootActivity = getRootActivity();
                    if (!(rootActivity == null || (window = rootActivity.getWindow()) == null)) {
                        window.setSoftInputMode(48);
                    }
                    AnonymousClass0fD.A09(-398188411, A022);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
