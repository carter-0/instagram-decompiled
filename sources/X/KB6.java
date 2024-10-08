package X;

import android.animation.ArgbEvaluator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import com.instagram.android.R;
import com.instagram.api.schemas.StickerTraySectionCTAType;
import com.instagram.arlink.ui.GridPatternView;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.ui.widget.nametag.NametagCardView;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.User;
import java.util.List;

public final class KB6 extends C252233om implements AnonymousClass3NL, AnonymousClass8MH, C66387MPt {
    public int A00;
    public int A01 = -16777216;
    public int A02;
    public C62590KiN A03 = C62590KiN.A07;
    public String A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final Activity A0A;
    public final View A0B;
    public final View A0C;
    public final View A0D;
    public final View A0E;
    public final View A0F;
    public final TextView A0G;
    public final C61439K7o A0H;
    public final C64126LOx A0I;
    public final C64287LYn A0J;
    public final LWg A0K;
    public final LOV A0L;
    public final GridPatternView A0M;
    public final AnonymousClass4DH A0N;
    public final UserSession A0O;
    public final KKB A0P;
    public final NametagCardView A0Q;
    public final ArgbEvaluator A0R = new ArgbEvaluator();
    public final View A0S;
    public final ImageView A0T;
    public final ImageView A0U;
    public final TextView A0V;
    public final TextView A0W;
    public final AnonymousClass4DH A0X;
    public final boolean A0Y;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x00b5, code lost:
        if (X.182.A06(X.0Tu.A05, r12, 36314859023764313L) == false) goto L_0x00b7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public KB6(android.app.Activity r15, android.view.View r16, X.C64126LOx r17, X.LBQ r18, X.LOV r19, X.AnonymousClass4DH r20, com.instagram.common.session.UserSession r21, X.AnonymousClass3E6 r22, java.lang.String r23, java.lang.String r24) {
        /*
            r14 = this;
            r3 = 1
            r14.<init>()
            r14.A0A = r15
            r11 = r20
            r14.A0N = r11
            r9 = r16
            r14.A0F = r9
            r12 = r21
            r14.A0O = r12
            r0 = r19
            r14.A0L = r0
            r0 = r17
            r14.A0I = r0
            r0 = 2131430326(0x7f0b0bb6, float:1.848235E38)
            android.view.View r0 = X.AnonymousClass7TE.A0b(r9, r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r14.A0T = r0
            r0 = 2131428551(0x7f0b04c7, float:1.847875E38)
            android.view.View r7 = X.AnonymousClass7TE.A0b(r9, r0)
            r14.A0S = r7
            r0 = 2131428552(0x7f0b04c8, float:1.8478752E38)
            android.widget.TextView r0 = X.DbW.A0B(r9, r0)
            r14.A0V = r0
            r0 = 2131441096(0x7f0b35c8, float:1.8504194E38)
            android.widget.TextView r6 = X.DbW.A0B(r9, r0)
            r14.A0W = r6
            r0 = 2131438920(0x7f0b2d48, float:1.849978E38)
            android.view.View r0 = X.AnonymousClass7TE.A0b(r9, r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r14.A0U = r0
            r0 = 2131433632(0x7f0b18a0, float:1.8489055E38)
            android.view.View r4 = X.AnonymousClass7TE.A0b(r9, r0)
            r14.A0E = r4
            r0 = 2131433646(0x7f0b18ae, float:1.8489084E38)
            android.view.View r2 = X.AnonymousClass7TE.A0b(r9, r0)
            com.instagram.arlink.ui.GridPatternView r2 = (com.instagram.arlink.ui.GridPatternView) r2
            r14.A0M = r2
            r0 = 2131429681(0x7f0b0931, float:1.8481042E38)
            android.view.View r0 = X.AnonymousClass7TE.A0b(r9, r0)
            com.instagram.ui.widget.nametag.NametagCardView r0 = (com.instagram.ui.widget.nametag.NametagCardView) r0
            r14.A0Q = r0
            r0 = 2131428548(0x7f0b04c4, float:1.8478744E38)
            android.view.View r0 = X.AnonymousClass7TE.A0b(r9, r0)
            r14.A0B = r0
            r0 = 2131433829(0x7f0b1965, float:1.8489455E38)
            android.view.View r0 = X.AnonymousClass7TE.A0b(r9, r0)
            r14.A0D = r0
            r0 = 2131433081(0x7f0b1679, float:1.8487938E38)
            android.view.View r0 = X.AnonymousClass7TE.A0b(r9, r0)
            r14.A0C = r0
            r0 = 2131428547(0x7f0b04c3, float:1.8478742E38)
            android.widget.TextView r5 = X.DbW.A0B(r9, r0)
            r14.A0G = r5
            android.animation.ArgbEvaluator r0 = new android.animation.ArgbEvaluator
            r0.<init>()
            r14.A0R = r0
            X.KiN r0 = X.C62590KiN.A07
            r14.A03 = r0
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r14.A01 = r0
            java.lang.String r0 = r12.A06
            r1 = r23
            boolean r0 = r1.equals(r0)
            r14.A0Y = r0
            if (r0 != 0) goto L_0x00b7
            X.0Tu r8 = X.0Tu.A05
            r0 = 36314859023764313(0x81042c002e0b59, double:3.029001302604193E-306)
            boolean r1 = X.182.A06(r8, r12, r0)
            r0 = 1
            if (r1 != 0) goto L_0x00b8
        L_0x00b7:
            r0 = 0
        L_0x00b8:
            r14.A09 = r0
            if (r0 != 0) goto L_0x0102
            X.3NG r0 = X.AnonymousClass7TE.A0m(r7)
            X.JTQ.A1H(r14, r0)
            android.content.Context r1 = r9.getContext()
            r0 = 2131953563(0x7f13079b, float:1.95436E38)
            java.lang.String r0 = r1.getString(r0)
            X.2eQ.A08(r7, r0)
            X.3NG r0 = X.AnonymousClass7TE.A0m(r6)
            r0.A04 = r14
            r0.A00()
            X.3NG r0 = X.AnonymousClass7TE.A0m(r5)
            r0.A04 = r14
            r0.A00()
            r1 = 0
            X.Jdi r0 = new X.Jdi
            r0.<init>(r14, r1)
            android.view.GestureDetector r1 = new android.view.GestureDetector
            r1.<init>(r15, r0)
            r0 = 3
            X.C64286LYm.A00(r4, r0, r1)
            r2.A02 = r14
            X.Jdi r0 = new X.Jdi
            r0.<init>(r14, r3)
            android.view.GestureDetector r1 = new android.view.GestureDetector
            r1.<init>(r15, r0)
            r0 = 4
            X.C64286LYm.A00(r2, r0, r1)
        L_0x0102:
            X.LYn r8 = new X.LYn
            r10 = r18
            r13 = r22
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r14.A0J = r8
            X.KKB r0 = new X.KKB
            r0.<init>(r12)
            r14.A0P = r0
            X.LWg r0 = new X.LWg
            r0.<init>(r15, r9, r14, r12)
            r14.A0K = r0
            X.0Tu r2 = X.0Tu.A05
            r0 = 36314859023633239(0x81042c002c0b57, double:3.029001302521301E-306)
            boolean r0 = X.182.A06(r2, r12, r0)
            r14.A08 = r0
            X.K7o r0 = new X.K7o
            r0.<init>()
            r14.A0H = r0
            r0.A00 = r14
            boolean r0 = r14.A09
            if (r0 == 0) goto L_0x015e
            X.1NY r2 = X.AnonymousClass7TG.A0b(r12)
            java.lang.String r0 = "nametag/nametag_lookup_by_name/{user_name}/"
            r2.A0A(r0)
            java.lang.String r0 = "user_name"
            r1 = r24
            r2.A9m(r0, r1)
            java.lang.String r1 = "is_others_nametag"
            java.lang.String r0 = "1"
            r2.A9m(r1, r0)
            java.lang.Class<X.CGA> r1 = X.CGA.class
            java.lang.Class<X.D0R> r0 = X.D0R.class
            X.1OC r1 = X.DbT.A0S(r2, r1, r0)
            r0 = 0
            X.C61500KAf.A00(r1, r14, r0)
            X.1ES.A03(r1)
        L_0x015b:
            r14.A0X = r11
            return
        L_0x015e:
            X.4Cl r0 = X.DbX.A0m(r12)
            X.16l r0 = r0.BVO()
            A01(r0, r14)
            r9.requestFocus()
            A05(r14)
            A04(r14)
            goto L_0x015b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KB6.<init>(android.app.Activity, android.view.View, X.LOx, X.LBQ, X.LOV, X.4DH, com.instagram.common.session.UserSession, X.3E6, java.lang.String, java.lang.String):void");
    }

    public final boolean CZu(boolean z) {
        return false;
    }

    public final /* synthetic */ void CgT(Medium medium, long j, long j2, boolean z) {
    }

    public final void CnL(View view, StickerTraySectionCTAType stickerTraySectionCTAType) {
    }

    public final void Csq(View view, C317966o8 r2, String str) {
    }

    public final void Ctb(C384659hg r1) {
    }

    public final void Cur() {
    }

    public final void Cut(C317966o8 r1, String str) {
    }

    public final void Cw1(View view, C317466nJ r2) {
    }

    public final void Cw2(Drawable drawable, View view, C317466nJ r6) {
        C317486nL B0p;
        0qQ.A0B(r6, 0);
        if (r6.CAW() == C317476nK.EMOJI && (B0p = r6.B0p()) != null) {
            String str = B0p.A02;
            this.A04 = str;
            this.A0M.setEmoji(str);
            this.A0J.A03(true);
            this.A0P.A05(B0p);
        }
    }

    public final void CxD() {
    }

    public final void CxF() {
    }

    public final void CxQ(Drawable drawable, C317466nJ r2) {
    }

    public final void CxR() {
    }

    public final /* synthetic */ void D4A() {
    }

    public final void D6Q(C19476WaO waO) {
    }

    public final void D6e() {
    }

    public final void D7Z() {
    }

    public final void D7a(Medium medium, Integer num) {
    }

    public final /* synthetic */ void D7b(Bitmap bitmap, String str) {
    }

    public final void D7c() {
    }

    public final /* synthetic */ void D7e() {
    }

    public final /* synthetic */ void D7f(C381579bz r1) {
    }

    public final void DBs(Drawable drawable, View view, C317486nL r5) {
        0qQ.A0B(r5, 0);
        String str = r5.A02;
        this.A04 = str;
        this.A0M.setEmoji(str);
        this.A0J.A03(true);
        this.A0P.A05(r5);
    }

    public final /* synthetic */ void DDX() {
    }

    public final void DG0(AnonymousClass9V0 r1, C317876nz r2) {
    }

    public final void DHJ(User user, String str) {
    }

    public final void DHX(Medium medium, boolean z) {
    }

    public final void DP5(View view) {
    }

    public final void DR4(Medium medium) {
    }

    public final void DRG(Drawable drawable, C317466nJ r2) {
    }

    public final /* synthetic */ void DVK() {
    }

    public final /* synthetic */ void DWc(Bitmap bitmap, String str) {
    }

    public final void DXx(Medium medium) {
    }

    public final void Dn0(View view, C317876nz r2) {
    }

    public final void Dn1(Drawable drawable, C317876nz r2, Long l) {
    }

    public final void Dn2(Drawable drawable, C317876nz r2, Long l, boolean z) {
    }

    public final void DnB() {
    }

    public final void DnF(StickerTraySectionCTAType stickerTraySectionCTAType) {
    }

    public final boolean Dqe(View view) {
        SparseArray sparseArray;
        0qQ.A0B(view, 0);
        if (view.getId() == R.id.background_mode_button) {
            int length = (this.A03.A01 + 1) % C62590KiN.values().length;
            if (this.A08) {
                sparseArray = C62590KiN.A03;
            } else {
                sparseArray = C62590KiN.A04;
            }
            if (length >= C62590KiN.A03.size()) {
                length = 0;
            }
            C62590KiN kiN = (C62590KiN) sparseArray.get(length);
            if (kiN == null) {
                kiN = C62590KiN.A07;
            }
            this.A03 = kiN;
            A05(this);
            A04(this);
        } else if (view.getId() == this.A0W.getId()) {
            if (this.A03 == C62590KiN.A0A) {
                this.A0K.A04(this.A02, true, true);
                this.A07 = true;
                return true;
            }
        } else if (view.getId() != this.A0G.getId()) {
            return false;
        } else {
            if (this.A0I.A03()) {
                C62129Kaf kaf = new C62129Kaf();
                kaf.A00 = this;
                Bundle A0a = AnonymousClass7TE.A0a();
                A0a.putBoolean("ARG_IS_BACKGROUND_IMAGE_BLURRED", this.A06);
                kaf.setArguments(A0a);
                C331127Pr A0W2 = DbS.A0W(this.A0O);
                A0W2.A0k = true;
                A0W2.A1O = true;
                A0W2.A00().A02(this.A0A, kaf);
                return true;
            }
            A08(this, false);
            return true;
        }
        return true;
    }

    public final void DvI(UpcomingEvent upcomingEvent) {
    }

    private final void A00() {
        if (this.A0Y && !this.A09) {
            boolean z = false;
            0eE r2 = AnonymousClass0t1.A01;
            UserSession userSession = this.A0O;
            16k BVO = DbS.A0h(userSession, r2).BVO();
            if (BVO == null) {
                LFZ lfz = new LFZ(new 16k((ImageUrl) null, (ImageUrl) null, (Boolean) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (String) null, (List) null));
                lfz.A04 = Integer.valueOf(this.A03.A01);
                BVO = lfz.A01();
                z = true;
            }
            Integer BTW = BVO.BTW();
            int i = this.A03.A01;
            if (BTW == null || BTW.intValue() != i) {
                LFZ AKP = BVO.AKP();
                AKP.A04 = Integer.valueOf(this.A03.A01);
                BVO = AKP.A00();
                z = true;
            }
            Integer B9f = BVO.B9f();
            int i2 = this.A00;
            if (B9f == null || B9f.intValue() != i2) {
                LFZ AKP2 = BVO.AKP();
                AKP2.A03 = Integer.valueOf(this.A00);
                BVO = AKP2.A00();
                z = true;
            }
            if (!0qQ.A0K(this.A04, BVO.getEmoji())) {
                LFZ AKP3 = BVO.AKP();
                AKP3.A06 = this.A04;
                BVO = AKP3.A00();
                z = true;
            }
            Integer B0q = BVO.B0q();
            int i3 = this.A01;
            if (B0q == null || B0q.intValue() != i3) {
                LFZ AKP4 = BVO.AKP();
                AKP4.A02 = Integer.valueOf(this.A01);
                BVO = AKP4.A00();
                z = true;
            }
            Integer Bs5 = BVO.Bs5();
            int i4 = this.A02;
            if (Bs5 == null || Bs5.intValue() != i4) {
                LFZ AKP5 = BVO.AKP();
                AKP5.A05 = Integer.valueOf(this.A02);
                BVO = AKP5.A00();
                z = true;
            }
            if (this.A05) {
                LFZ AKP6 = BVO.AKP();
                AKP6.A05 = Integer.valueOf(this.A02);
                BVO = AKP6.A00();
            } else if (!z) {
                return;
            }
            if (this.A03 == C62590KiN.A0A && !this.A0L.A02() && !this.A07) {
                this.A03 = C62590KiN.A08;
                LFZ AKP7 = BVO.AKP();
                AKP7.A04 = Integer.valueOf(this.A03.A01);
                BVO = AKP7.A00();
            }
            DbS.A0h(userSession, r2).Edz(BVO);
            int i5 = this.A03.A01;
            int i6 = this.A00;
            String str = this.A04;
            if (str == null) {
                str = "";
            }
            int i7 = this.A01;
            int i8 = this.A02;
            1NY A0N2 = DbU.A0N(userSession);
            A0N2.A0A("users/nametag_config/");
            A0N2.A9m(DatePickerDialogModule.ARG_MODE, String.valueOf(i5));
            A0N2.A9m("gradient", String.valueOf(i6));
            A0N2.A9m("emoji", str);
            A0N2.A9m("emoji_color", String.valueOf(i7));
            A0N2.A9m("selfie_sticker", String.valueOf(i8));
            1OC A0N3 = DbY.A0N(A0N2, CF4.class, D0Q.class);
            A0N3.A00 = new C68432NHr(userSession, 0);
            1ES.A03(A0N3);
        }
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [X.KHA, X.11X] */
    /* JADX WARNING: type inference failed for: r0v10, types: [X.KHA, X.11X] */
    public static final void A01(AnonymousClass16l r5, KB6 kb6) {
        SparseArray sparseArray;
        boolean A1a;
        C62590KiN kiN = C62590KiN.A07;
        kb6.A03 = kiN;
        if (kb6.A0Y && r5 != null) {
            int A0A2 = AnonymousClass7TG.A0A(r5.BTW());
            if (kb6.A08) {
                sparseArray = C62590KiN.A03;
            } else {
                sparseArray = C62590KiN.A04;
            }
            if (A0A2 >= C62590KiN.A03.size()) {
                A0A2 = 0;
            }
            C62590KiN kiN2 = (C62590KiN) sparseArray.get(A0A2);
            if (kiN2 == null) {
                kiN2 = kiN;
            }
            kb6.A03 = kiN2;
            kb6.A00 = AnonymousClass7TG.A0A(r5.B9f());
            kb6.A04 = r5.getEmoji();
            kb6.A01 = AnonymousClass7TG.A0A(r5.B0q());
            kb6.A02 = AnonymousClass7TG.A0A(r5.Bs5());
            Boolean CPI = r5.CPI();
            if (CPI != null) {
                A1a = CPI.booleanValue();
            } else {
                1Av A002 = 1Au.A00(kb6.A0O);
                A1a = AnonymousClass7TG.A1a(A002, A002.A1y, 1Av.A8a, 99);
            }
            kb6.A06 = A1a;
        }
        if (kb6.A00 >= 5) {
            kb6.A00 = 0;
        }
        String str = kb6.A04;
        if (str == null || str.length() == 0 || !C336957fS.A03(str)) {
            kb6.A04 = C317486nL.A04.A07(kb6.A0O)[0].A02;
        }
        if (kb6.A01 == 0) {
            kb6.A01 = -16777216;
        }
        C62590KiN kiN3 = kb6.A03;
        C62590KiN kiN4 = C62590KiN.A0A;
        if (kiN3 == kiN4 && !kb6.A0L.A02()) {
            kb6.A03 = C62590KiN.A08;
        }
        if (kb6.A02 >= C62594KiR.values().length) {
            kb6.A02 = 0;
        }
        LOV lov = kb6.A0L;
        if (lov.A00 == null) {
            lov.A02.schedule(new KHA(1, lov, kb6, r5));
        } else if (kb6.A0N.isResumed() && kb6.A03 == kiN4) {
            A03(kb6);
        }
        C62590KiN kiN5 = kb6.A03;
        C62590KiN kiN6 = C62590KiN.A09;
        if (kiN5 == kiN6 && !kb6.A0I.A03()) {
            kb6.A03 = C62590KiN.A08;
        }
        C64126LOx lOx = kb6.A0I;
        if (lOx.A00 != null) {
            lOx.A02(kb6);
            if (kb6.A0N.isResumed() && kb6.A03 == kiN6) {
                A07(kb6);
                return;
            }
            return;
        }
        lOx.A04.schedule(new KHA(0, r5, lOx, kb6));
    }

    public static void A02(KB6 kb6) {
        kb6.A0G.setVisibility(8);
        kb6.A0B.setVisibility(8);
        kb6.A0D.setVisibility(8);
        kb6.A0C.setVisibility(8);
    }

    public static final void A03(KB6 kb6) {
        C62594KiR kiR = (C62594KiR) C62594KiR.A04.get(kb6.A02);
        if (kiR == null) {
            kiR = C62594KiR.SUNGLASSES;
        }
        LOV lov = kb6.A0L;
        boolean A1V = AnonymousClass7TF.A1V(lov.A00);
        GridPatternView gridPatternView = kb6.A0M;
        if (A1V) {
            gridPatternView.setSelfieWithSticker(lov.A01(kiR));
        } else {
            gridPatternView.setSticker(kiR.A02);
        }
        gridPatternView.setVisibility(0);
    }

    public static final void A04(KB6 kb6) {
        int i;
        int i2;
        int ordinal = kb6.A03.ordinal();
        if (ordinal == 0) {
            kb6.A0E.setVisibility(0);
            kb6.A0M.setVisibility(8);
            A02(kb6);
            kb6.A0K.A05(false);
            kb6.A07 = false;
            A06(kb6);
        } else if (ordinal == 1) {
            kb6.A0E.setVisibility(8);
            GridPatternView gridPatternView = kb6.A0M;
            gridPatternView.setVisibility(0);
            A02(kb6);
            gridPatternView.setEmoji(kb6.A04);
            Integer num = gridPatternView.A03;
            NametagCardView nametagCardView = kb6.A0Q;
            if (num != null) {
                i = num.intValue();
            } else {
                i = kb6.A01;
            }
            nametagCardView.setTintColor(i);
        } else if (ordinal == 2) {
            kb6.A0E.setVisibility(8);
            GridPatternView gridPatternView2 = kb6.A0M;
            gridPatternView2.setVisibility(0);
            A02(kb6);
            C62594KiR kiR = (C62594KiR) C62594KiR.A04.get(kb6.A02);
            if (kiR == null) {
                kiR = C62594KiR.SUNGLASSES;
            }
            LOV lov = kb6.A0L;
            if (lov.A00 != null) {
                gridPatternView2.setSelfieWithSticker(lov.A01(kiR));
            } else if (!lov.A02()) {
                kb6.A0K.A04(kb6.A02, false, false);
                kb6.A07 = true;
                gridPatternView2.setSticker(kiR.A02);
            }
            kb6.A0Q.setTintColor(-16777216);
        } else if (ordinal == 3) {
            kb6.A0E.setVisibility(8);
            kb6.A0M.setVisibility(8);
            kb6.A0B.setVisibility(0);
            kb6.A0G.setVisibility(0);
            C64126LOx lOx = kb6.A0I;
            if (lOx.A03()) {
                kb6.A0D.setVisibility(0);
                kb6.A0C.setVisibility(0);
                Integer num2 = lOx.A02;
                if (num2 != null) {
                    i2 = num2.intValue();
                } else {
                    i2 = -16777216;
                }
                kb6.A0Q.setTintColor(i2);
            } else {
                kb6.A0Q.setTintColor(-16777216);
            }
            kb6.A0K.A05(false);
            kb6.A07 = false;
            A07(kb6);
        } else {
            throw AnonymousClass7TE.A1K();
        }
        kb6.A0J.A03(true);
    }

    public static final void A05(KB6 kb6) {
        Context context = kb6.A0F.getContext();
        boolean z = kb6.A03.A02;
        int i = R.color.grey_9;
        if (z) {
            i = R.color.design_dark_default_color_on_background;
        }
        int color = context.getColor(i);
        ColorFilter A002 = AnonymousClass37O.A00(color);
        ImageView imageView = kb6.A0T;
        imageView.setColorFilter(A002);
        ImageView imageView2 = kb6.A0U;
        imageView2.setColorFilter(A002);
        TextView textView = kb6.A0V;
        boolean z2 = kb6.A03.A02;
        int i2 = R.drawable.mode_button_background_dark;
        if (z2) {
            i2 = R.drawable.mode_button_background_light;
        }
        textView.setBackgroundResource(i2);
        textView.setText(kb6.A03.A00);
        int i3 = 0;
        kb6.A0S.setContentDescription(DbW.A0h(context, AnonymousClass7TE.A16(context, kb6.A03.A00), 2131953564));
        textView.setTextColor(color);
        if (!kb6.A03.A02) {
            textView.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        } else {
            textView.setShadowLayer(8.0f, 0.0f, 0.0f, context.getColor(R.color.black_20_transparent));
        }
        imageView2.setVisibility(DbW.A01(kb6.A0Y ? 1 : 0));
        TextView textView2 = kb6.A0W;
        textView2.setTextColor(color);
        textView2.getCompoundDrawables()[0].mutate().setColorFilter(A002);
        int i4 = 8;
        if (kb6.A03 == C62590KiN.A0A) {
            i4 = 0;
        }
        textView2.setVisibility(i4);
        C62590KiN kiN = kb6.A03;
        C62590KiN kiN2 = C62590KiN.A09;
        if (kiN == kiN2) {
            boolean A032 = kb6.A0I.A03();
            TextView textView3 = kb6.A0G;
            if (A032) {
                textView3.setText(2131953567);
                int A0A2 = AnonymousClass7TE.A0A(context);
                ColorFilter A003 = AnonymousClass37O.A00(A0A2);
                imageView.setColorFilter(A003);
                imageView2.setColorFilter(A003);
                textView3.getCompoundDrawables()[0].mutate().setColorFilter(A003);
                textView.setBackgroundResource(R.drawable.mode_button_background_light);
                textView.setTextColor(A0A2);
                textView3.setTextColor(A0A2);
            } else {
                textView3.setText(2131953565);
            }
        }
        TextView textView4 = kb6.A0G;
        if (kb6.A03 != kiN2) {
            i3 = 8;
        }
        textView4.setVisibility(i3);
    }

    public static final void A06(KB6 kb6) {
        int[] iArr = NametagCardView.A0F[kb6.A00];
        0qQ.A04(iArr);
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TL_BR, iArr);
        gradientDrawable.setDither(true);
        View view = kb6.A0E;
        RectF rectF = 0nA.A01;
        0qQ.A0B(view, 0);
        view.setBackground(gradientDrawable);
        kb6.A0Q.setGradientTintColors(kb6.A00);
    }

    public static final void A07(KB6 kb6) {
        Drawable colorDrawable;
        C64126LOx lOx = kb6.A0I;
        Bitmap bitmap = lOx.A00;
        boolean A1V = AnonymousClass7TF.A1V(bitmap);
        View view = kb6.A0F;
        if (A1V) {
            Resources resources = view.getResources();
            if (kb6.A06) {
                bitmap = lOx.A01;
            }
            colorDrawable = new BitmapDrawable(resources, bitmap);
        } else {
            colorDrawable = new ColorDrawable(AnonymousClass7TF.A03(view.getContext(), R.attr.igds_color_secondary_background));
        }
        View view2 = kb6.A0B;
        RectF rectF = 0nA.A01;
        0qQ.A0B(view2, 0);
        view2.setBackground(colorDrawable);
        view2.refreshDrawableState();
    }

    public static final void A08(KB6 kb6, boolean z) {
        C331127Pr A0W2 = DbS.A0W(kb6.A0O);
        DbS.A1S(A0W2, true);
        A0W2.A0k = true;
        A0W2.A1O = true;
        A0W2.A03 = 0.9f;
        C331157Pu A002 = A0W2.A00();
        AnonymousClass37E r0 = AnonymousClass37D.A00;
        Activity activity = kb6.A0A;
        AnonymousClass37D A012 = r0.A01(activity);
        if (A012 == null) {
            return;
        }
        if (z) {
            DbU.A1U(new C65749Lz3(1, kb6, A002), A012, A012);
        } else {
            A002.A02(activity, kb6.A0H);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0069  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A09(float r7) {
        /*
            r6 = this;
            X.KiN r1 = r6.A03
            X.KiN r0 = X.C62590KiN.A07
            r2 = 0
            r5 = 0
            if (r1 != r0) goto L_0x00b6
            android.view.View r1 = r6.A0E
        L_0x000a:
            r1.setAlpha(r7)
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            int r0 = X.JTQ.A01(r0)
            r1.setVisibility(r0)
        L_0x0016:
            android.animation.ArgbEvaluator r4 = r6.A0R
            r0 = -1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            X.KiN r1 = r6.A03
            boolean r1 = r1.A02
            if (r1 != 0) goto L_0x0030
            android.view.View r0 = r6.A0F
            android.content.Context r1 = r0.getContext()
            r0 = 2131100285(0x7f06027d, float:1.7812947E38)
            int r0 = r1.getColor(r0)
        L_0x0030:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r1 = r4.evaluate(r7, r3, r0)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Int"
            int r0 = X.DbW.A04(r1, r0)
            android.graphics.ColorFilter r1 = X.AnonymousClass37O.A00(r0)
            android.widget.ImageView r0 = r6.A0T
            r0.setColorFilter(r1)
            android.view.View r1 = r6.A0S
            r1.setAlpha(r7)
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            int r0 = X.JTQ.A01(r0)
            r1.setVisibility(r0)
            android.widget.ImageView r1 = r6.A0U
            r1.setAlpha(r7)
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            int r0 = X.JTQ.A01(r0)
            r1.setVisibility(r0)
            X.KiN r1 = r6.A03
            X.KiN r0 = X.C62590KiN.A0A
            if (r1 != r0) goto L_0x0077
            android.widget.TextView r1 = r6.A0W
            r1.setAlpha(r7)
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            int r0 = X.JTQ.A01(r0)
            r1.setVisibility(r0)
        L_0x0077:
            X.KiN r1 = r6.A03
            X.KiN r0 = X.C62590KiN.A09
            if (r1 != r0) goto L_0x00b5
            android.widget.TextView r1 = r6.A0G
            r1.setAlpha(r7)
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            int r0 = X.JTQ.A01(r0)
            r1.setVisibility(r0)
            android.view.View r1 = r6.A0B
            r1.setAlpha(r7)
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            int r0 = X.JTQ.A01(r0)
            r1.setVisibility(r0)
            android.view.View r1 = r6.A0C
            r1.setAlpha(r7)
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            int r0 = X.JTQ.A01(r0)
            r1.setVisibility(r0)
            android.view.View r1 = r6.A0D
            r1.setAlpha(r7)
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x00b2
            r2 = 8
        L_0x00b2:
            r1.setVisibility(r2)
        L_0x00b5:
            return
        L_0x00b6:
            X.KiN r0 = X.C62590KiN.A0A
            if (r1 == r0) goto L_0x00be
            X.KiN r0 = X.C62590KiN.A08
            if (r1 != r0) goto L_0x0016
        L_0x00be:
            com.instagram.arlink.ui.GridPatternView r1 = r6.A0M
            goto L_0x000a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KB6.A09(float):void");
    }

    public final long AyD() {
        return 0;
    }

    public final AnonymousClass4DH BZy() {
        return this.A0X;
    }

    public final /* synthetic */ boolean Buo() {
        return false;
    }

    public final boolean CWK() {
        return false;
    }

    public final boolean CXD() {
        return false;
    }

    public final boolean CXt() {
        return false;
    }

    public final boolean Cc2() {
        return false;
    }

    public final boolean CcX() {
        return false;
    }

    public final void onPause() {
        LWg lWg = this.A0K;
        ViewGroup viewGroup = lWg.A03;
        if (viewGroup != null && viewGroup.getVisibility() == 0) {
            C340307l3 r2 = lWg.A0H;
            if (r2.CVP()) {
                r2.EyH((AnonymousClass8GD) null);
                lWg.A01.setSurfaceTextureListener((TextureView.SurfaceTextureListener) null);
            }
        }
        A00();
    }

    public final void onResume() {
        LWg lWg = this.A0K;
        ViewGroup viewGroup = lWg.A03;
        if (viewGroup != null && viewGroup.getVisibility() == 0) {
            LWg.A02(lWg);
        }
    }

    public final void onDestroyView() {
        A00();
        C64287LYn lYn = this.A0J;
        if (lYn.A07 != null) {
            lYn.A02.setBackground((Drawable) null);
            lYn.A07.A06();
            lYn.A07 = null;
        }
        JZ7 jz7 = lYn.A0A;
        if (jz7 != null) {
            for (LMR A022 : jz7.A07) {
                jz7.A02(A022, false);
            }
        }
        LWg lWg = this.A0K;
        lWg.A05(false);
        if (lWg.A06 != null) {
            lWg.A05.setBackground((Drawable) null);
            lWg.A06.A06();
            lWg.A06 = null;
        }
    }
}
