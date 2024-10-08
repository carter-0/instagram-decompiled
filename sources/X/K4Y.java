package X;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import com.instagram.igds.components.button.IgdsButton;

public final class K4Y extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "FxIgUnifiedACUpsellBottomSheet";
    public IgLinearLayout A00;
    public IgLinearLayout A01;
    public IgTextView A02;
    public IgTextView A03;
    public IgTextView A04;
    public IgTextView A05;
    public IgTextView A06;
    public IgTextView A07;
    public IgImageView A08;
    public IgImageView A09;
    public RoundedCornerImageView A0A;
    public C323586xk A0B;
    public IgdsButton A0C;
    public IgdsButton A0D;
    public String A0E;
    public final AnonymousClass0eM A0F = C227642jf.A02(this);

    public final String getModuleName() {
        return "fx_ig_unified_ac_upsell_bottom_sheet";
    }

    /* JADX WARNING: type inference failed for: r0v74, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.view.View] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01d2  */
    /* JADX WARNING: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r9, android.os.Bundle r10) {
        /*
            r8 = this;
            r2 = 0
            X.0qQ.A0B(r9, r2)
            super.onViewCreated(r9, r10)
            r0 = 2131433338(0x7f0b177a, float:1.8488459E38)
            com.instagram.common.ui.base.IgTextView r0 = X.DbT.A0a(r9, r0)
            r8.A06 = r0
            r0 = 2131433339(0x7f0b177b, float:1.848846E38)
            com.instagram.common.ui.base.IgTextView r0 = X.DbT.A0a(r9, r0)
            r8.A07 = r0
            r0 = 2131433335(0x7f0b1777, float:1.8488453E38)
            com.instagram.igds.components.button.IgdsButton r0 = X.DbU.A0b(r9, r0)
            r8.A0C = r0
            r0 = 2131433336(0x7f0b1778, float:1.8488455E38)
            com.instagram.igds.components.button.IgdsButton r0 = X.DbU.A0b(r9, r0)
            r8.A0D = r0
            r0 = 2131433327(0x7f0b176f, float:1.8488437E38)
            com.instagram.common.ui.base.IgTextView r0 = X.DbT.A0a(r9, r0)
            r8.A02 = r0
            r0 = 2131433337(0x7f0b1779, float:1.8488457E38)
            com.instagram.common.ui.base.IgTextView r0 = X.DbT.A0a(r9, r0)
            r8.A05 = r0
            r0 = 2131433330(0x7f0b1772, float:1.8488443E38)
            android.view.View r0 = r9.requireViewById(r0)
            com.instagram.common.ui.base.IgLinearLayout r0 = (com.instagram.common.ui.base.IgLinearLayout) r0
            r8.A00 = r0
            r0 = 2131433333(0x7f0b1775, float:1.8488449E38)
            android.view.View r0 = r9.requireViewById(r0)
            com.instagram.common.ui.base.IgLinearLayout r0 = (com.instagram.common.ui.base.IgLinearLayout) r0
            r8.A01 = r0
            r0 = 2131433328(0x7f0b1770, float:1.8488439E38)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = X.DbT.A0b(r9, r0)
            r8.A08 = r0
            r0 = 2131433331(0x7f0b1773, float:1.8488445E38)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = X.DbT.A0b(r9, r0)
            r8.A09 = r0
            r0 = 2131433329(0x7f0b1771, float:1.848844E38)
            com.instagram.common.ui.base.IgTextView r0 = X.DbT.A0a(r9, r0)
            r8.A03 = r0
            r0 = 2131433332(0x7f0b1774, float:1.8488447E38)
            com.instagram.common.ui.base.IgTextView r0 = X.DbT.A0a(r9, r0)
            r8.A04 = r0
            r0 = 2131433334(0x7f0b1776, float:1.848845E38)
            android.view.View r0 = r9.requireViewById(r0)
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r0 = (com.instagram.common.ui.widget.imageview.RoundedCornerImageView) r0
            r8.A0A = r0
            java.lang.String r3 = r8.A0E
            if (r3 == 0) goto L_0x010a
            int r1 = r3.hashCode()
            r0 = -1574224499(0xffffffffa22b3d8d, float:-2.3207406E-18)
            if (r1 == r0) goto L_0x01e7
            r0 = -789610632(0xffffffffd0ef7f78, float:-3.21448673E10)
            if (r1 == r0) goto L_0x010b
            r0 = -614788096(0xffffffffdb5b1400, float:-6.166501E16)
            if (r1 != r0) goto L_0x010a
            java.lang.String r0 = "IG_DEFAULT"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x010a
        L_0x00a1:
            X.6xk r0 = r8.A0B
            if (r0 == 0) goto L_0x01f0
            X.MVx r4 = r0.getUpsellContent()
            android.content.Context r0 = r8.requireContext()
            java.lang.String r3 = r4.B7D(r0)
            com.instagram.common.ui.base.IgTextView r1 = r8.A06
            if (r1 == 0) goto L_0x00c0
            android.content.Context r0 = r8.requireContext()
            java.lang.String r0 = r4.BCj(r0)
            r1.setText(r0)
        L_0x00c0:
            com.instagram.common.ui.base.IgTextView r1 = r8.A02
            if (r1 == 0) goto L_0x00cf
            android.content.Context r0 = r8.requireContext()
            java.lang.String r0 = r4.AqX(r0)
            r1.setText(r0)
        L_0x00cf:
            com.instagram.igds.components.button.IgdsButton r1 = r8.A0C
            if (r1 == 0) goto L_0x00de
            android.content.Context r0 = r8.requireContext()
            java.lang.String r0 = r4.BfX(r0)
            r1.setText((java.lang.String) r0)
        L_0x00de:
            com.instagram.igds.components.button.IgdsButton r1 = r8.A0D
            if (r1 == 0) goto L_0x00ed
            android.content.Context r0 = r8.requireContext()
            java.lang.String r0 = r4.Bqe(r0)
            r1.setText((java.lang.String) r0)
        L_0x00ed:
            if (r3 == 0) goto L_0x00fd
            com.instagram.common.ui.base.IgTextView r0 = r8.A05
            if (r0 == 0) goto L_0x00f6
            r0.setText(r3)
        L_0x00f6:
            com.instagram.common.ui.base.IgTextView r0 = r8.A05
            if (r0 == 0) goto L_0x00fd
            r0.setVisibility(r2)
        L_0x00fd:
            com.instagram.common.ui.base.IgLinearLayout r0 = r8.A00
            int r1 = X.JTQ.A02(r0)
            com.instagram.common.ui.base.IgLinearLayout r0 = r8.A01
            if (r0 == 0) goto L_0x010a
            r0.setVisibility(r1)
        L_0x010a:
            return
        L_0x010b:
            java.lang.String r0 = "IG_FB_STORY_CROSS_POSTING_AFTER_SHARE_UPSELL"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x010a
            X.6xk r0 = r8.A0B
            if (r0 == 0) goto L_0x01f0
            X.MVx r4 = r0.getUpsellContent()
            com.instagram.common.typedurl.ImageUrl r7 = r4.BGK()
            r3 = 8
            if (r7 == 0) goto L_0x01d6
            X.0eM r0 = r8.A0F
            X.0lg r6 = X.DbT.A0X(r0)
            X.0Tu r5 = X.0Tu.A06
            r0 = 36329762557280577(0x8111ba00004141, double:3.038426357211591E-306)
            boolean r0 = X.182.A06(r5, r6, r0)
            if (r0 == 0) goto L_0x01d6
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r0 = r8.A0A
            if (r0 == 0) goto L_0x013d
            r0.setUrl(r7, r8)
        L_0x013d:
            com.instagram.common.ui.base.IgTextView r1 = r8.A07
            if (r1 == 0) goto L_0x014c
            android.content.Context r0 = r8.requireContext()
            java.lang.String r0 = r4.BCj(r0)
            r1.setText(r0)
        L_0x014c:
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r0 = r8.A0A
            if (r0 == 0) goto L_0x0153
            r0.setVisibility(r2)
        L_0x0153:
            com.instagram.common.ui.base.IgTextView r0 = r8.A07
            if (r0 == 0) goto L_0x015a
            r0.setVisibility(r2)
        L_0x015a:
            com.instagram.common.ui.base.IgTextView r0 = r8.A06
            if (r0 == 0) goto L_0x0161
            r0.setVisibility(r3)
        L_0x0161:
            com.instagram.common.ui.base.IgTextView r1 = r8.A03
            if (r1 == 0) goto L_0x0170
            android.content.Context r0 = r8.requireContext()
            java.lang.String r0 = r4.Agm(r0)
            r1.setText(r0)
        L_0x0170:
            com.instagram.common.ui.base.IgTextView r1 = r8.A04
            if (r1 == 0) goto L_0x017f
            android.content.Context r0 = r8.requireContext()
            java.lang.String r0 = r4.Agn(r0)
            r1.setText(r0)
        L_0x017f:
            com.instagram.igds.components.button.IgdsButton r1 = r8.A0C
            if (r1 == 0) goto L_0x018e
            android.content.Context r0 = r8.requireContext()
            java.lang.String r0 = r4.BfX(r0)
            r1.setText((java.lang.String) r0)
        L_0x018e:
            com.instagram.igds.components.button.IgdsButton r1 = r8.A0D
            if (r1 == 0) goto L_0x019d
            android.content.Context r0 = r8.requireContext()
            java.lang.String r0 = r4.Bqe(r0)
            r1.setText((java.lang.String) r0)
        L_0x019d:
            com.instagram.common.ui.widget.imageview.IgImageView r2 = r8.A08
            android.content.Context r0 = r8.requireContext()
            java.lang.String r1 = r4.Agh(r0)
            android.content.Context r0 = r8.requireContext()
            java.lang.String r0 = r4.Agj(r0)
            r8.A00(r2, r1, r0)
            com.instagram.common.ui.widget.imageview.IgImageView r2 = r8.A09
            android.content.Context r0 = r8.requireContext()
            java.lang.String r1 = r4.Agi(r0)
            android.content.Context r0 = r8.requireContext()
            java.lang.String r0 = r4.Agk(r0)
            r8.A00(r2, r1, r0)
            com.instagram.common.ui.base.IgTextView r0 = r8.A02
            if (r0 == 0) goto L_0x01ce
            r0.setVisibility(r3)
        L_0x01ce:
            com.instagram.common.ui.base.IgTextView r0 = r8.A05
            if (r0 == 0) goto L_0x010a
            r0.setVisibility(r3)
            return
        L_0x01d6:
            com.instagram.common.ui.base.IgTextView r1 = r8.A06
            if (r1 == 0) goto L_0x0161
            android.content.Context r0 = r8.requireContext()
            java.lang.String r0 = r4.BCj(r0)
            r1.setText(r0)
            goto L_0x0161
        L_0x01e7:
            java.lang.String r0 = "IG_FB_FEED_CROSS_POSTING_AFTER_SHARE_CHAINING_UPSELL"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x00a1
            return
        L_0x01f0:
            java.lang.String r0 = "unifiedUpsellManager"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K4Y.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    private final void A00(IgImageView igImageView, String str, String str2) {
        C52337GOf gOf;
        Integer A042;
        int intValue;
        if (str != null && str2 != null) {
            XDU A032 = C14091Tpi.A03(str);
            if (str2.equals("outline")) {
                gOf = C52337GOf.OUTLINE;
            } else {
                gOf = C52337GOf.FILLED;
            }
            if (A032 != null && (A042 = C14091Tpi.A04(A032, GOg.SIZE_24, gOf)) != null && (intValue = A042.intValue()) != 0) {
                Drawable drawable = requireContext().getDrawable(intValue);
                if (igImageView != null) {
                    igImageView.setImageDrawable(drawable);
                }
            }
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0F);
    }

    public final void A01(C66520MUy mUy, Activity activity) {
        0xY r1;
        int i;
        String A002;
        AnonymousClass37D A0i = DbT.A0i(activity);
        if (A0i == null || !((AnonymousClass37F) A0i).A0g) {
            AnonymousClass0eM r6 = this.A0F;
            C331127Pr A0f = DbX.A0f(r6);
            A0f.A0U = new C65741Lyv(1, mUy, this);
            DbS.A1S(A0f, false);
            DbU.A0y(activity, this, A0f);
            IgdsButton igdsButton = this.A0C;
            if (igdsButton != null) {
                LY7.A00(igdsButton, 11, mUy, this);
            }
            IgdsButton igdsButton2 = this.A0D;
            if (igdsButton2 != null) {
                LY7.A00(igdsButton2, 12, mUy, this);
            }
            if (this.A0E != null) {
                0lg A0X = DbT.A0X(r6);
                String valueOf = String.valueOf(this.A0E);
                0qQ.A0B(A0X, 0);
                0qQ.A0B(valueOf, 1);
                FG9.A00(A0X, "upsell_screen_shown", valueOf);
                if (!0qQ.A0K(this.A0E, "IG_FB_FEED_CROSS_POSTING_AFTER_SHARE_CHAINING_UPSELL") || !C63269KuE.A00(DbT.A0X(r6)).booleanValue()) {
                    C46402DeP deP = new C46402DeP(AnonymousClass7TE.A0l(r6));
                    String valueOf2 = String.valueOf(this.A0E);
                    0qQ.A0B(valueOf2, 0);
                    int hashCode = valueOf2.hashCode();
                    if (hashCode != -1574224499) {
                        if (hashCode != -773734548) {
                            if (hashCode == 1949671265 && valueOf2.equals("IG_LOGOUT_UPSELL")) {
                                r1 = AnonymousClass7TF.A0N(deP.A00);
                                A002 = C273654mx.A00(293);
                            } else {
                                return;
                            }
                        } else if (valueOf2.equals(C273654mx.A00(218))) {
                            r1 = AnonymousClass7TF.A0N(deP.A00);
                            i = 612;
                            A002 = AnonymousClass000.A00(i);
                        } else {
                            return;
                        }
                    } else if (valueOf2.equals("IG_FB_FEED_CROSS_POSTING_AFTER_SHARE_CHAINING_UPSELL")) {
                        r1 = AnonymousClass7TF.A0N(deP.A00);
                        i = 291;
                        A002 = AnonymousClass000.A00(i);
                    } else {
                        return;
                    }
                    r1.E5T(A002, true);
                    r1.apply();
                    return;
                }
                new C46402DeP(AnonymousClass7TE.A0l(r6)).A01(String.valueOf(this.A0E));
                return;
            }
            return;
        }
        Bundle requireArguments = requireArguments();
        requireArguments.putString(C66579MXk.A00(4), AnonymousClass000.A00(4148));
        JTU.A0e(activity, requireArguments, DbT.A0X(this.A0F));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0088, code lost:
        r7.A0B = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0039, code lost:
        throw X.AnonymousClass7TE.A0w(X.002.A0S("Unknown entry point '", r6, '\''));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r8, android.view.ViewGroup r9, android.os.Bundle r10) {
        /*
            r7 = this;
            r0 = 1228644605(0x493ba0fd, float:768527.8)
            int r3 = X.AnonymousClass0fD.A02(r0)
            r4 = 0
            X.0qQ.A0B(r8, r4)
            java.lang.String r0 = X.DbX.A0o(r7)
            r7.A0E = r0
            if (r0 == 0) goto L_0x008c
            X.0eM r0 = r7.A0F
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r0)
            android.content.Context r1 = r7.requireContext()
            java.lang.String r0 = r7.A0E
            java.lang.String r6 = java.lang.String.valueOf(r0)
            X.AnonymousClass7TF.A1B(r5, r4, r6)
            int r0 = r6.hashCode()
            switch(r0) {
                case -1574224499: goto L_0x003a;
                case -789610632: goto L_0x004b;
                case -614788096: goto L_0x005c;
                case 1949671265: goto L_0x0078;
                default: goto L_0x002d;
            }
        L_0x002d:
            java.lang.String r1 = "Unknown entry point '"
            r0 = 39
            java.lang.String r0 = X.002.A0S(r1, r6, r0)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x003a:
            java.lang.String r0 = "IG_FB_FEED_CROSS_POSTING_AFTER_SHARE_CHAINING_UPSELL"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x002d
            android.content.Context r0 = X.DbT.A05(r1)
            X.KRq r0 = X.C63266KuB.A00(r0, r5, r6)
            goto L_0x0088
        L_0x004b:
            java.lang.String r0 = "IG_FB_STORY_CROSS_POSTING_AFTER_SHARE_UPSELL"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x002d
            android.content.Context r0 = X.DbT.A05(r1)
            X.KRs r0 = X.C63267KuC.A00(r0, r5, r6)
            goto L_0x0088
        L_0x005c:
            java.lang.String r0 = "IG_DEFAULT"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x002d
            android.content.Context r2 = X.DbT.A05(r1)
            r0 = 17
            X.Phm r1 = new X.Phm
            r1.<init>(r2, r5, r6, r0)
            java.lang.Class<X.KRr> r0 = X.C61922KRr.class
            java.lang.Object r0 = r5.A01(r0, r1)
            X.KRr r0 = (X.C61922KRr) r0
            goto L_0x0088
        L_0x0078:
            java.lang.String r0 = "IG_LOGOUT_UPSELL"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x002d
            android.content.Context r0 = X.DbT.A05(r1)
            com.instagram.fxcal.upsell.common.FxIgLogoutACUpsellImpl r0 = X.C323576xi.A00(r5, r0, r6)
        L_0x0088:
            X.6xk r0 = (X.C323586xk) r0
            r7.A0B = r0
        L_0x008c:
            r0 = 2131625819(0x7f0e075b, float:1.8878857E38)
            android.view.View r1 = r8.inflate(r0, r9, r4)
            r0 = 1026237514(0x3d2b244a, float:0.041782655)
            X.AnonymousClass0fD.A09(r0, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K4Y.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(612376717);
        super.onDestroyView();
        this.A0C = null;
        this.A0D = null;
        this.A06 = null;
        this.A02 = null;
        this.A05 = null;
        this.A00 = null;
        this.A01 = null;
        this.A08 = null;
        this.A09 = null;
        this.A03 = null;
        this.A04 = null;
        AnonymousClass0fD.A09(-1060500529, A022);
    }
}
