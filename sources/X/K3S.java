package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.avatar.stickers.intf.DirectAvatarTrayFragmentConfig;
import com.instagram.direct.avatar.stickers.search.AvatarLocalStickerSearchUseCase;
import com.instagram.direct.fragment.stickertray.hscroll.tabs.IgdExpressionTrayHscrollLayout;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;

public final class K3S extends C61364K4g implements C268594df, C74568PxH, C74472PvS {
    public static final String __redex_internal_original_name = "DirectThreadAvatarTrayFragment";
    public C66513MUr A00;
    public IgdExpressionTrayHscrollLayout A01;
    public C60471Jm3 A02;
    public C69319NjK A03;
    public AnonymousClass7L0 A04;
    public String A05 = "ig_direct_thread";
    public C62320sa A06 = new MMO(this, 46);
    public C62320sa A07 = C66251MKm.A00;
    public C62320sa A08 = new C73657PhW(this, 8);
    public 0sP A09 = C66197MIe.A00;
    public 0sP A0A = new C74193PqZ(this, 14);
    public C63229Kta A0B = new Object();
    public OLS A0C;
    public String A0D;
    public final AnonymousClass0eM A0E = AnonymousClass1YB.A00(new MMO(this, 43));
    public final AnonymousClass0eM A0F = AnonymousClass1YB.A00(new MMO(this, 44));
    public final AnonymousClass0eM A0G = AnonymousClass1YB.A00(new MMO(this, 45));
    public final AnonymousClass0eM A0H = AnonymousClass1YB.A00(new MMO(this, 47));
    public final AnonymousClass0eM A0I = JTQ.A0l(this, 2);
    public final AnonymousClass0eM A0J = JTQ.A0l(this, 3);
    public final AnonymousClass0eM A0K = C227642jf.A02(this);
    public final AnonymousClass0eM A0L = JTQ.A0l(this, 4);
    public final AnonymousClass0eM A0M = JTQ.A0l(this, 5);
    public final AnonymousClass0eM A0N = JTQ.A0l(this, 6);
    public final AnonymousClass0eM A0O = JTQ.A0l(this, 7);
    public final AnonymousClass0eM A0P = JTQ.A0l(this, 9);
    public final AnonymousClass0eM A0Q = JTQ.A0l(this, 10);
    public final boolean A0R = true;

    public final void A0J(ULT ult, C62719KlJ klJ, C62723KlN klN, List list) {
        0qQ.A0B(list, 0);
        super.A0J(ult, klJ, (C62723KlN) null, list);
        if (ult != null) {
            C63852L9h l9h = (C63852L9h) this.A0I.getValue();
            String A0t = DbS.A0t(this.A0J);
            0qQ.A0B(A0t, 0);
            if (!l9h.A05) {
                LGV lgv = l9h.A00;
                int i = ult.A01;
                int i2 = i / 45;
                if ((i ^ 45) < 0 && i2 * 45 != i) {
                    i2--;
                }
                int i3 = ult.A02;
                int A012 = JTP.A01((double) ult.A03, 45.0d);
                0Aj A0e = AnonymousClass7TE.A0e(lgv.A01, "avatar_stickers_measurement_avatar_sticker_tray_fetch");
                0bb r2 = new 0bb();
                JTS.A1D(r2, i2 + 1, A012);
                r2.A05("result_size", DbS.A0j(i3));
                if (A0e.isSampled()) {
                    JTR.A1I(A0e, r2, A0t);
                    JTQ.A15(A0e, "ranking");
                }
            }
        }
    }

    public final void A0N(List list) {
        String str;
        super.A0N(list);
        C63852L9h l9h = (C63852L9h) this.A0I.getValue();
        String A0t = DbS.A0t(this.A0J);
        IgdsInlineSearchBox igdsInlineSearchBox = this.A0A;
        if (igdsInlineSearchBox == null || (str = igdsInlineSearchBox.getSearchString()) == null) {
            str = "";
        }
        int size = list.size();
        0qQ.A0B(A0t, 0);
        if (!l9h.A05) {
            l9h.A00.A04(A0t, str, (String) l9h.A04.invoke(), size);
        }
    }

    public final int AqL() {
        return -1;
    }

    public final float CMx() {
        return 0.8f;
    }

    public final float Cmb() {
        return 1.0f;
    }

    public final void DMt() {
    }

    public final void DMu(int i) {
    }

    public final void Dhu(String str) {
        String str2;
        IgdsInlineSearchBox igdsInlineSearchBox;
        0qQ.A0B(str, 0);
        IgdsInlineSearchBox igdsInlineSearchBox2 = this.A0A;
        if (igdsInlineSearchBox2 == null || (str2 = igdsInlineSearchBox2.getSearchString()) == null) {
            str2 = "";
        }
        if (!str.equals(str2) && (igdsInlineSearchBox = this.A0A) != null) {
            igdsInlineSearchBox.A0E.setText(str);
        }
    }

    public final boolean Erf() {
        return true;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AnonymousClass7L0 r4 = this.A04;
        if (r4 != null) {
            view.getBackground().setColorFilter(r4.A09, PorterDuff.Mode.SRC);
            IgdsInlineSearchBox igdsInlineSearchBox = this.A0A;
            if (igdsInlineSearchBox != null) {
                igdsInlineSearchBox.A05(r4.A0E);
            }
        }
        IgdsInlineSearchBox igdsInlineSearchBox2 = this.A0A;
        if (igdsInlineSearchBox2 != null) {
            igdsInlineSearchBox2.setHint(((DirectAvatarTrayFragmentConfig) this.A0Q.getValue()).A01);
        }
        if (this.A0L) {
            C252063oV r0 = this.A07;
            if (r0 != null) {
                ImageView imageView = (ImageView) r0.getView();
                AnonymousClass7L0 r02 = this.A04;
                if (r02 != null) {
                    imageView.setColorFilter(AnonymousClass37O.A00(2Yu.A01(new ContextThemeWrapper(imageView.getContext(), r02.A0E))));
                }
            } else {
                0qQ.A0F("backButton");
                throw AnonymousClass00P.createAndThrow();
            }
        }
        if (((DirectAvatarTrayFragmentConfig) this.A0Q.getValue()).A02) {
            this.A0C = new OLS(requireContext(), view);
        }
        if (C61364K4g.A05(this)) {
            ViewStub A0X = JTR.A0X(view, R.id.sticker_tray_hscroll_container);
            A0X.setLayoutResource(R.layout.direct_sticker_tray_hscroll_container);
            this.A01 = (IgdExpressionTrayHscrollLayout) 2b1.A01(A0X, false, false).getView();
        }
    }

    public final AnonymousClass3B3 A06() {
        UserSession userSession = ((AnonymousClass7IJ) this.A0E.getValue()).A00;
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession, 36320257794646152L) || 182.A06(r2, userSession, 36328328038792429L)) {
            return C69922NuO.A00(requireContext(), (Integer) null, 1, false, true);
        }
        return super.A06();
    }

    public final C62944Kow A0D() {
        String str;
        AnonymousClass0eM r4 = this.A0K;
        UserSession A0l = AnonymousClass7TE.A0l(r4);
        DirectThreadKey directThreadKey = (DirectThreadKey) this.A0P.getValue();
        if (directThreadKey != null) {
            str = directThreadKey.A00;
        } else {
            str = null;
        }
        0qQ.A0B(A0l, 0);
        if ((str != null && str.length() != 0 && !C63227KtY.A00(A0l, new DirectThreadKey(str))) || !182.A06(0Tu.A05, A0l, 36320906334970821L)) {
            return super.A0D();
        }
        return new AvatarLocalStickerSearchUseCase(A09(), AnonymousClass7TE.A0l(r4));
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
        return this.A0R;
    }

    public final String getModuleName() {
        String str = this.A0D;
        if (str != null) {
            return 002.A0R(str, "direct_avatar_sticker_picker_grid");
        }
        0qQ.A0F("previousModuleName");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0K);
    }

    public final void onBottomSheetClosed() {
        C66513MUr mUr = this.A00;
        if (mUr == null) {
            JTO.A1K();
            throw AnonymousClass00P.createAndThrow();
        } else {
            mUr.Du2();
        }
    }

    public final void onBottomSheetPositionChanged(int i, int i2) {
        OLS ols = this.A0C;
        if (ols != null) {
            ols.A00(i);
        }
        if (i == 0) {
            A0F();
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.2tF, java.lang.Object] */
    public final void A0K(AnonymousClass2tC r2) {
        super.A0K(r2);
        if (C61364K4g.A05(this)) {
            r2.A01(new Object());
        }
    }

    public final int AhP(Context context) {
        return Dbb.A02(context);
    }

    public final /* synthetic */ float CoU() {
        return 0.8f;
    }

    public final boolean isScrolledToTop() {
        return C2808154f.A05(A07());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00aa, code lost:
        if (X.C63227KtY.A00(r9, new com.instagram.model.direct.DirectThreadKey(r4)) == false) goto L_0x022e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b7, code lost:
        if (X.182.A06(X.0Tu.A05, r9, 36320906334970821L) != false) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00da, code lost:
        if (X.182.A06(X.0Tu.A05, r1.A00, 36322246364506137L) == false) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01fb, code lost:
        if (r8 != null) goto L_0x0130;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0231  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r15) {
        /*
            r14 = this;
            r0 = 1247307321(0x4a586639, float:3545486.2)
            int r3 = X.AnonymousClass0fD.A02(r0)
            X.K3S.super.onCreate(r15)
            android.os.Bundle r1 = r14.requireArguments()
            java.lang.String r0 = "args_previous_module_name"
            java.lang.String r0 = r1.getString(r0)
            if (r0 == 0) goto L_0x0240
            r14.A0D = r0
            java.lang.String r0 = "args_entrypoint"
            java.lang.Object r1 = r1.get(r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.direct.intf.DirectStickerTrayEntryPoint"
            X.0qQ.A0C(r1, r0)
            X.NjK r1 = (X.C69319NjK) r1
            r14.A03 = r1
            java.lang.String r13 = "entryPoint"
            r2 = 0
            if (r1 == 0) goto L_0x0238
            X.NjK r7 = X.C69319NjK.NOTES_QUICK_REPLY_STICKER_BUTTON
            if (r1 != r7) goto L_0x0234
            X.0eM r0 = r14.A0E
            java.lang.Object r0 = r0.getValue()
            X.7IJ r0 = (X.AnonymousClass7IJ) r0
            com.instagram.common.session.UserSession r5 = r0.A00
            X.0Tu r4 = X.0Tu.A05
            r0 = 36321245637190849(0x8109fb000124c1, double:3.033040222651962E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            if (r0 == 0) goto L_0x0234
            X.6ny r0 = X.C317866ny.NOTE_REPLY
        L_0x0049:
            r14.A04 = r0
            X.0eM r1 = r14.A0Q
            java.lang.Object r0 = r1.getValue()
            com.instagram.direct.avatar.stickers.intf.DirectAvatarTrayFragmentConfig r0 = (com.instagram.direct.avatar.stickers.intf.DirectAvatarTrayFragmentConfig) r0
            boolean r0 = r0.A04
            r14.A0L = r0
            java.lang.Object r0 = r1.getValue()
            com.instagram.direct.avatar.stickers.intf.DirectAvatarTrayFragmentConfig r0 = (com.instagram.direct.avatar.stickers.intf.DirectAvatarTrayFragmentConfig) r0
            boolean r0 = r0.A05
            r14.A0M = r0
            java.lang.Object r0 = r1.getValue()
            com.instagram.direct.avatar.stickers.intf.DirectAvatarTrayFragmentConfig r0 = (com.instagram.direct.avatar.stickers.intf.DirectAvatarTrayFragmentConfig) r0
            boolean r0 = r0.A03
            r14.A0K = r0
            r8 = 1
            r14.A0H = r8
            X.0eM r0 = r14.A0K
            com.instagram.common.session.UserSession r9 = X.AnonymousClass7TE.A0l(r0)
            X.0eM r0 = r14.A0H
            boolean r1 = X.AnonymousClass7TF.A1Z(r0)
            X.0eM r5 = r14.A0P
            java.lang.Object r0 = r5.getValue()
            com.instagram.model.direct.DirectThreadKey r0 = (com.instagram.model.direct.DirectThreadKey) r0
            if (r0 == 0) goto L_0x0231
            java.lang.String r4 = r0.A00
        L_0x0086:
            r6 = 0
            X.0qQ.A0B(r9, r6)
            if (r1 != 0) goto L_0x022e
            if (r4 == 0) goto L_0x00ac
            int r1 = r4.length()
            if (r1 == 0) goto L_0x009f
            com.instagram.model.direct.DirectThreadKey r0 = new com.instagram.model.direct.DirectThreadKey
            r0.<init>((java.lang.String) r4)
            boolean r0 = X.C63227KtY.A00(r9, r0)
            if (r0 == 0) goto L_0x00b9
        L_0x009f:
            if (r1 == 0) goto L_0x00ac
            com.instagram.model.direct.DirectThreadKey r0 = new com.instagram.model.direct.DirectThreadKey
            r0.<init>((java.lang.String) r4)
            boolean r0 = X.C63227KtY.A00(r9, r0)
            if (r0 == 0) goto L_0x022e
        L_0x00ac:
            X.0Tu r4 = X.0Tu.A05
            r0 = 36320906334970821(0x8109ac000423c5, double:3.032825646561756E-306)
            boolean r0 = X.182.A06(r4, r9, r0)
            if (r0 == 0) goto L_0x022e
        L_0x00b9:
            r0 = 1
        L_0x00ba:
            r14.A0N = r0
            r14.A0J = r8
            X.0eM r4 = r14.A0E
            java.lang.Object r1 = r4.getValue()
            X.7IJ r1 = (X.AnonymousClass7IJ) r1
            boolean r0 = r1.A00()
            if (r0 != 0) goto L_0x00dc
            com.instagram.common.session.UserSession r9 = r1.A00
            X.0Tu r8 = X.0Tu.A05
            r0 = 36322246364506137(0x810ae400002819, double:3.033673086635756E-306)
            boolean r1 = X.182.A06(r8, r9, r0)
            r0 = 1
            if (r1 != 0) goto L_0x00dd
        L_0x00dc:
            r0 = 0
        L_0x00dd:
            r14.A0F = r0
            X.NjK r0 = r14.A03
            if (r0 == 0) goto L_0x0238
            if (r0 != r7) goto L_0x0209
            java.lang.Object r0 = r4.getValue()
            X.7IJ r0 = (X.AnonymousClass7IJ) r0
            com.instagram.common.session.UserSession r8 = r0.A00
            X.0Tu r7 = X.0Tu.A05
            r0 = 36321245637190849(0x8109fb000124c1, double:3.033040222651962E-306)
            boolean r0 = X.182.A06(r7, r8, r0)
            if (r0 == 0) goto L_0x0209
            r0 = 3
            r14.A00 = r0
        L_0x00fd:
            X.0eM r0 = r14.A0I
            java.lang.Object r1 = r0.getValue()
            X.L9h r1 = (X.C63852L9h) r1
            X.0eM r0 = r14.A0J
            java.lang.String r10 = X.DbS.A0t(r0)
            X.0qQ.A0B(r10, r6)
            boolean r0 = r1.A05
            if (r0 == 0) goto L_0x01ff
            X.L85 r6 = r1.A03
            com.instagram.avatars.store.AvatarStore r0 = r1.A01
            X.27E r1 = r0.A01
            boolean r0 = r1 instanceof X.C293135kC
            r8 = 0
            if (r0 == 0) goto L_0x0123
            X.5kC r1 = (X.C293135kC) r1
            if (r1 == 0) goto L_0x0123
            X.5kB r8 = r1.A00
        L_0x0123:
            r11 = 0
            if (r8 == 0) goto L_0x01fa
            java.lang.Integer r1 = r8.A00
            if (r1 == 0) goto L_0x01fa
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x01f6
            java.lang.String r12 = "2"
        L_0x0130:
            java.lang.String r11 = r8.A03
        L_0x0132:
            com.instagram.common.session.UserSession r9 = r6.A02
            r0 = 36329212801466229(0x81113a00003f75, double:3.038078689420908E-306)
            boolean r0 = X.182.A06(r7, r9, r0)
            if (r0 == 0) goto L_0x0188
            java.lang.String r0 = r6.A00
            boolean r0 = X.0qQ.A0K(r0, r10)
            if (r0 != 0) goto L_0x014e
            r6.A00 = r10
            java.util.HashSet r0 = r6.A03
            r0.clear()
        L_0x014e:
            X.0wc r1 = r6.A01
            java.lang.String r0 = "avatar_stickers_measurement_e2ee_avatar_sticker_tray_launch"
            X.0Aj r8 = X.AnonymousClass7TE.A0e(r1, r0)
            X.Jqc r6 = new X.Jqc
            r6.<init>()
            java.lang.String r0 = "avatar_session_id"
            r6.A06(r0, r10)
            java.lang.String r1 = "e2ee_ranking"
            java.lang.String r0 = "product"
            r6.A06(r0, r1)
            java.lang.Long r1 = X.C51971G9r.A0m()
            java.lang.String r0 = "avatar_results_size"
            r6.A05(r0, r1)
            java.lang.String r1 = "message_thread"
            java.lang.String r0 = "referrer_surface"
            r6.A06(r0, r1)
            X.C61364K4g.A00(r6, r7, r9, r12, r11)
            boolean r0 = r8.isSampled()
            if (r0 == 0) goto L_0x0188
            java.lang.String r0 = "event_data"
            r8.AAK(r6, r0)
            r8.Cgf()
        L_0x0188:
            X.0eM r0 = r14.A0F
            java.lang.Object r1 = r0.getValue()
            X.7IR r1 = (X.AnonymousClass7IR) r1
            java.lang.Object r0 = r5.getValue()
            com.instagram.model.direct.DirectThreadKey r0 = (com.instagram.model.direct.DirectThreadKey) r0
            if (r0 == 0) goto L_0x01f4
            java.lang.String r6 = r0.A00
        L_0x019a:
            java.lang.Object r0 = r5.getValue()
            com.instagram.model.direct.DirectThreadKey r0 = (com.instagram.model.direct.DirectThreadKey) r0
            if (r0 == 0) goto L_0x01a4
            java.util.List r2 = r0.A02
        L_0x01a4:
            X.NjK r8 = r14.A03
            if (r8 == 0) goto L_0x0238
            X.0wc r1 = r1.A00
            java.lang.String r0 = "direct_composer_tap_avatar"
            X.0Aj r5 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r5.isSampled()
            if (r0 == 0) goto L_0x01d1
            X.NjK r0 = X.C69319NjK.AVATAR_STICKER_TAP
            if (r8 != r0) goto L_0x01f1
            java.lang.String r1 = "avatar_sticker"
        L_0x01bc:
            if (r2 != 0) goto L_0x01c0
            X.0sn r2 = X.0sn.A00
        L_0x01c0:
            java.lang.String r0 = "recipient_ids"
            r5.AAe(r0, r2)
            r0 = 5098(0x13ea, float:7.144E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r5.AAJ(r0, r6)
            X.DbV.A1J(r5, r1)
        L_0x01d1:
            java.lang.Object r0 = r4.getValue()
            X.7IJ r0 = (X.AnonymousClass7IJ) r0
            com.instagram.common.session.UserSession r2 = r0.A00
            r0 = 36329706723361040(0x8111ad000a4110, double:3.0383910476160504E-306)
            boolean r0 = X.182.A06(r7, r2, r0)
            if (r0 == 0) goto L_0x01ea
            java.lang.Integer r0 = X.C51967G9n.A0j()
            r14.A0C = r0
        L_0x01ea:
            r0 = -2049825150(0xffffffff85d22682, float:-1.976245E-35)
            X.AnonymousClass0fD.A09(r0, r3)
            return
        L_0x01f1:
            java.lang.String r1 = "composer"
            goto L_0x01bc
        L_0x01f4:
            r6 = r2
            goto L_0x019a
        L_0x01f6:
            java.lang.String r12 = "1"
            goto L_0x0130
        L_0x01fa:
            r12 = r2
            if (r8 == 0) goto L_0x0132
            goto L_0x0130
        L_0x01ff:
            X.LGV r6 = r1.A00
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r6.A02(r1, r0, r10)
            goto L_0x0188
        L_0x0209:
            java.lang.Object r0 = r4.getValue()
            X.7IJ r0 = (X.AnonymousClass7IJ) r0
            com.instagram.common.session.UserSession r8 = r0.A00
            X.0Tu r7 = X.0Tu.A05
            r0 = 36320257794646152(0x81091500002088, double:3.032415507048973E-306)
            boolean r0 = X.182.A06(r7, r8, r0)
            if (r0 != 0) goto L_0x0229
            r0 = 36328328038792429(0x81106c00093ced, double:3.0375191619433436E-306)
            boolean r0 = X.182.A06(r7, r8, r0)
            if (r0 == 0) goto L_0x00fd
        L_0x0229:
            r0 = 4
            r14.A00 = r0
            goto L_0x00fd
        L_0x022e:
            r0 = 0
            goto L_0x00ba
        L_0x0231:
            r4 = r2
            goto L_0x0086
        L_0x0234:
            X.6ny r0 = X.C317866ny.DIRECT
            goto L_0x0049
        L_0x0238:
            X.0qQ.A0F(r13)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x0240:
            java.lang.String r0 = "previous module required"
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r0)
            r0 = -716325363(0xffffffffd54dbe0d, float:-1.41385091E13)
            X.AnonymousClass0fD.A09(r0, r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K3S.onCreate(android.os.Bundle):void");
    }

    public final void onDestroyView() {
        String str;
        int A022 = AnonymousClass0fD.A02(-1514969645);
        C63852L9h l9h = (C63852L9h) this.A0I.getValue();
        String A0t = DbS.A0t(this.A0J);
        IgdsInlineSearchBox igdsInlineSearchBox = this.A0A;
        if (igdsInlineSearchBox == null || (str = igdsInlineSearchBox.getSearchString()) == null) {
            str = "";
        }
        0qQ.A0B(A0t, 0);
        if (!l9h.A05) {
            l9h.A00.A03(A0t, str);
        }
        super.onDestroyView();
        this.A01 = null;
        AnonymousClass0fD.A09(830100867, A022);
    }

    public final void ADi(AnonymousClass7L0 r1) {
        this.A04 = r1;
    }
}
