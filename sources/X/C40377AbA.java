package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.ui.text.ConstrainedEditText;
import com.instagram.ui.text.fittingtextview.FittingTextView;
import com.instagram.ui.widget.drawing.EyedropperColorPickerTool;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import com.instagram.user.model.Product;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.AbA  reason: case insensitive filesystem */
public final class C40377AbA implements AnonymousClass8MF, AnonymousClass8MG, AnonymousClass88G, C252213ok, C3493580b, AnonymousClass8MW, AnonymousClass8MX, AnonymousClass89Y, AnonymousClass8MY, AnonymousClass84H {
    public AnonymousClass8BE A00;
    public Integer A01;
    public HashMap A02 = AnonymousClass7TE.A1E();
    public C279284yO A03;
    public C369458un A04;
    public Integer A05;
    public final Context A06;
    public final SparseArray A07 = new SparseArray();
    public final View A08;
    public final ViewGroup A09;
    public final AnonymousClass4DH A0A;
    public final AnonymousClass0iw A0B;
    public final UserSession A0C;
    public final AnonymousClass3E6 A0D;
    public final C357638Yz A0E;
    public final C354538Mk A0F;
    public final TargetViewSizeProvider A0G;
    public final C3499582p A0H;
    public final AnonymousClass88K A0I;
    public final C354508Mh A0J;
    public final C314446iH A0K;
    public final AnonymousClass88Z A0L;
    public final AnonymousClass80U A0M;
    public final C314676if A0N;
    public final C314676if A0O;
    public final C314676if A0P;
    public final FittingTextView A0Q;
    public final InteractiveDrawableContainer A0R;
    public final C354518Mi A0S;
    public final C354468Md A0T;
    public final ConstrainedEditText A0U;
    public final EyedropperColorPickerTool A0V;
    public final C65025Lm3 A0W;
    public final List A0X = AnonymousClass7TE.A1C();
    public final Map A0Y = AnonymousClass7TE.A1E();
    public final boolean A0Z;

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0076, code lost:
        if (r10.A0M.CQ0(X.AnonymousClass80V.COMPOSE_TEXT_IN_STACKED_TIMELINE) != false) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0102, code lost:
        if (X.AnonymousClass7TF.A0R(X.0Tu.A05, r10.A0C, 36320962169283563L).booleanValue() != false) goto L_0x0104;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0049  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(java.lang.Integer r11) {
        /*
            r10 = this;
            r5 = 0
            java.lang.Integer r4 = r10.A01
            if (r4 == r11) goto L_0x0055
            boolean r9 = r10.A03()
            r10.A01 = r11
            int r0 = r11.intValue()
            r3 = 1
            switch(r0) {
                case 0: goto L_0x0079;
                case 1: goto L_0x00ac;
                case 2: goto L_0x0146;
                case 3: goto L_0x010b;
                case 4: goto L_0x0013;
                case 5: goto L_0x0129;
                case 6: goto L_0x0013;
                case 7: goto L_0x0013;
                case 8: goto L_0x014c;
                default: goto L_0x0013;
            }
        L_0x0013:
            boolean r0 = r10.A03()
            if (r0 == 0) goto L_0x0056
            if (r9 != 0) goto L_0x0038
            X.Lm3 r0 = r10.A0W
            r0.DV9(r10)
        L_0x0020:
            X.88K r2 = r10.A0I
            X.6if r1 = r10.A0P
            java.lang.Object r0 = r1.get()
            X.8LV r0 = (X.AnonymousClass8LV) r0
            r2.A06(r0)
            java.lang.Object r0 = r1.get()
            X.8an r0 = (X.C358368an) r0
            com.instagram.ui.widget.drawing.StrokeWidthTool r0 = r0.A1m
            r0.A07()
        L_0x0038:
            java.lang.Integer r0 = X.AnonymousClass05K.A1F
            if (r0 != r4) goto L_0x0041
            X.Lm3 r0 = r10.A0W
            r0.D48(r10)
        L_0x0041:
            java.lang.Integer r1 = X.AnonymousClass05K.A15
            boolean r0 = X.AnonymousClass7TF.A1W(r4, r1)
            if (r11 == r1) goto L_0x004c
            r3 = 0
            if (r0 == 0) goto L_0x0055
        L_0x004c:
            X.8an r0 = A01(r10)
            r0.A0d = r3
            X.C358368an.A0F(r0)
        L_0x0055:
            return
        L_0x0056:
            if (r9 == 0) goto L_0x006e
            X.Lm3 r0 = r10.A0W
            r0.D48(r10)
            X.88K r2 = r10.A0I
            X.6if r0 = r10.A0P
            java.lang.Object r1 = r0.get()
            X.0qQ.A0B(r1, r5)
            java.util.List r0 = r2.A09
            r0.remove(r1)
            goto L_0x0038
        L_0x006e:
            X.80U r1 = r10.A0M
            X.80V r0 = X.AnonymousClass80V.COMPOSE_TEXT_IN_STACKED_TIMELINE
            boolean r0 = r1.CQ0(r0)
            if (r0 == 0) goto L_0x0038
            goto L_0x0020
        L_0x0079:
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r2 = r10.A0R
            X.AWS r0 = X.AWS.A00
            r2.A0w(r0)
            X.6if r1 = r10.A0P
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x008f
            java.lang.Object r0 = r1.get()
            X.8an r0 = (X.C358368an) r0
            r0.A0Y()
        L_0x008f:
            r0 = 0
            r2.removeCallbacks(r0)
            X.3E6 r0 = r10.A0D
            r0.EEH(r10)
            r2.A0z(r10)
            r2.A0T = r5
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x0013
            java.lang.Object r0 = r1.get()
            X.8an r0 = (X.C358368an) r0
            r0.A0W()
            goto L_0x0013
        L_0x00ac:
            X.3E6 r0 = r10.A0D
            r0.A9Y(r10)
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r8 = r10.A0R
            r8.A0y(r10)
            r8.A0S = r3
            X.8an r1 = A01(r10)
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            boolean r0 = X.AnonymousClass7TF.A1W(r4, r0)
            r1.A0h(r0)
            X.80U r1 = r10.A0M
            X.80V r0 = X.AnonymousClass80V.VIDEO_TRIMMING
            boolean r0 = r1.CQ0(r0)
            if (r0 != 0) goto L_0x00d8
            com.instagram.ui.text.fittingtextview.FittingTextView r0 = r10.A0Q
            android.view.View[] r0 = new android.view.View[]{r0}
            X.C315596kB.A08(r0, r5)
        L_0x00d8:
            X.8BE r0 = r10.A00
            boolean r0 = r0.CRa()
            r8.A0T = r0
            boolean r0 = r1.CZU()
            r7 = 1
            if (r0 == 0) goto L_0x0109
            java.util.List r0 = r8.getAllDrawables()
            int r0 = r0.size()
            if (r0 <= r3) goto L_0x0109
            com.instagram.common.session.UserSession r6 = r10.A0C
            X.0Tu r2 = X.0Tu.A05
            r0 = 36320962169283563(0x8109b9000023eb, double:3.032860956405961E-306)
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0R(r2, r6, r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0109
        L_0x0104:
            r8.setLongPressEnabled(r7)
            goto L_0x0013
        L_0x0109:
            r7 = 0
            goto L_0x0104
        L_0x010b:
            com.instagram.ui.text.fittingtextview.FittingTextView r2 = r10.A0Q
            if (r2 == 0) goto L_0x011a
            X.8BE r1 = r10.A00
            android.content.Context r0 = r10.A06
            java.lang.String r0 = r1.Ayb(r0)
            r2.setText(r0)
        L_0x011a:
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r0 = r10.A0R
            r0.A0S = r5
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            X.8an r0 = A01(r10)
            r0.A0f(r1)
            goto L_0x0013
        L_0x0129:
            com.instagram.ui.text.fittingtextview.FittingTextView r2 = r10.A0Q
            if (r2 == 0) goto L_0x0138
            X.8BE r1 = r10.A00
            android.content.Context r0 = r10.A06
            java.lang.String r0 = r1.Ayb(r0)
            r2.setText(r0)
        L_0x0138:
            com.instagram.ui.text.ConstrainedEditText r0 = r10.A0U
            android.view.View[] r0 = new android.view.View[]{r0}
            X.C315596kB.A08(r0, r5)
            X.AnonymousClass7TG.A1A(r2, r3)
            goto L_0x0013
        L_0x0146:
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r0 = r10.A0R
            r0.A0S = r5
            goto L_0x0013
        L_0x014c:
            X.Lm3 r0 = r10.A0W
            r0.DV9(r10)
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40377AbA.A06(java.lang.Integer):void");
    }

    public final /* bridge */ /* synthetic */ boolean A76(Object obj, Object obj2) {
        0qQ.A0B(obj, 0);
        if ((AnonymousClass80V.MEDIA_EDIT == obj || AnonymousClass80V.CAPTURE == obj) && this.A01 == AnonymousClass05K.A0Y) {
            return false;
        }
        return true;
    }

    public final boolean AFr() {
        return false;
    }

    public final void AR7(Drawable drawable, Object obj) {
        0qQ.A0B(obj, 0);
        this.A0M.E3H(obj);
    }

    public final int AoK() {
        return 0;
    }

    public final int B9T() {
        return 0;
    }

    public final void CtK(Drawable drawable) {
        0qQ.A0B(drawable, 0);
        if ((drawable instanceof C354798Nk) && ((C354798Nk) drawable).A0B.A0M()) {
            this.A04 = this.A0R.A0O(drawable);
        }
    }

    public final /* synthetic */ void CtX() {
    }

    public final /* synthetic */ void CtY() {
    }

    public final /* synthetic */ void CuV(Drawable drawable, int i) {
    }

    public final void DAq(Drawable drawable, int i) {
    }

    public final void DNj() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        if (r6.A0Z == false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DP7(android.graphics.drawable.Drawable r7, int r8, float r9, float r10) {
        /*
            r6 = this;
            r2 = 1
            X.0qQ.A0B(r7, r2)
            boolean r0 = r7 instanceof X.C347017w8
            r1 = 0
            if (r0 == 0) goto L_0x0012
            r0 = r7
            X.7w8 r0 = (X.C347017w8) r0
            if (r0 == 0) goto L_0x0012
            android.graphics.drawable.Drawable r1 = r0.A04()
        L_0x0012:
            boolean r0 = r1 instanceof X.C300655xZ
            if (r0 == 0) goto L_0x001b
            boolean r0 = r6.A0Z
            r5 = 1
            if (r0 != 0) goto L_0x001c
        L_0x001b:
            r5 = 0
        L_0x001c:
            X.80U r4 = r6.A0M
            boolean r0 = r4.CZU()
            if (r0 == 0) goto L_0x004c
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r0 = r6.A0R
            java.util.List r0 = r0.getAllDrawables()
            int r0 = r0.size()
            if (r0 <= r2) goto L_0x004c
            com.instagram.common.session.UserSession r3 = r6.A0C
            X.0Tu r2 = X.0Tu.A05
            r0 = 36320962169283563(0x8109b9000023eb, double:3.032860956405961E-306)
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0R(r2, r3, r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x004c
            X.8VI r0 = new X.8VI
            r0.<init>(r8, r10, r5)
            r4.E3H(r0)
        L_0x004b:
            return
        L_0x004c:
            if (r5 == 0) goto L_0x004b
            X.7w8 r7 = (X.C347017w8) r7
            java.lang.Integer r0 = X.AnonymousClass05K.A1F
            r6.A06(r0)
            r7.A08()
            android.util.SparseArray r0 = r6.A07
            java.lang.Object r1 = r0.get(r8)
            r1.getClass()
            X.4nO r1 = (X.C273914nO) r1
            int r0 = r7.A00
            r1.A01(r0)
            X.8Mh r0 = r6.A0J
            r0.A00 = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40377AbA.DP7(android.graphics.drawable.Drawable, int, float, float):void");
    }

    public final /* synthetic */ void DPH() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0077, code lost:
        if (r13 != false) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DdI(android.graphics.drawable.Drawable r11, int r12, boolean r13) {
        /*
            r10 = this;
            r3 = 1
            X.0qQ.A0B(r11, r3)
            boolean r0 = r11 instanceof X.AnonymousClass5MH
            if (r0 == 0) goto L_0x000c
            X.5MH r11 = (X.AnonymousClass5MH) r11
            android.graphics.drawable.Drawable r11 = r11.A0A
        L_0x000c:
            java.lang.String r6 = ""
            boolean r0 = r11 instanceof X.C306386Ly
            r1 = 0
            if (r0 == 0) goto L_0x007c
            X.6if r2 = r10.A0P
            boolean r0 = r2.A03
            if (r0 == 0) goto L_0x007a
            java.lang.Object r0 = r2.get()
            X.8an r0 = (X.C358368an) r0
            X.6Ly r0 = r0.A0L
        L_0x0021:
            if (r11 != r0) goto L_0x002d
            java.lang.Object r0 = r2.get()
            X.8an r0 = (X.C358368an) r0
            r0.A0L = r1
            r0.A04 = r1
        L_0x002d:
            r0 = r1
        L_0x002e:
            boolean r2 = r11 instanceof X.C347017w8
            if (r2 == 0) goto L_0x0077
            if (r13 == 0) goto L_0x006f
            X.82p r2 = r10.A0H
            X.82o r2 = r2.A02
            X.82Y r2 = r2.A01
            boolean r2 = r2.A07()
            if (r2 == 0) goto L_0x004a
            r2 = r11
            X.7w8 r2 = (X.C347017w8) r2
            android.graphics.drawable.Drawable r2 = r2.A04()
            X.0qQ.A07(r2)
        L_0x004a:
            com.instagram.common.session.UserSession r2 = r10.A0C
            X.27r r2 = X.27p.A01(r2)
            X.9tN r5 = X.AED.A01(r1, r0)
            X.82p r0 = r10.A0H
            X.82o r0 = r0.A02
            X.82Y r0 = r0.A01
            X.50r r0 = r0.A0g
            if (r0 == 0) goto L_0x0075
            int r0 = r0.ordinal()
            if (r0 != r3) goto L_0x0075
            X.4yP r3 = X.C279294yP.FEED
        L_0x0066:
            X.JVj r4 = X.C59725JVj.LIVE
            r8 = 0
            java.lang.String r7 = "TRASH_CAN"
            r9 = r8
            r2.A12(r3, r4, r5, r6, r7, r8, r9)
        L_0x006f:
            X.88Z r0 = r10.A0L
            r0.DnD(r11)
            return
        L_0x0075:
            r3 = 0
            goto L_0x0066
        L_0x0077:
            if (r13 == 0) goto L_0x006f
            goto L_0x004a
        L_0x007a:
            r0 = 0
            goto L_0x0021
        L_0x007c:
            android.util.SparseArray r2 = r10.A07
            java.lang.Object r0 = r2.get(r12)
            X.4nO r0 = (X.C273914nO) r0
            if (r0 == 0) goto L_0x0092
            java.lang.String r6 = r0.A00()
            java.lang.String r1 = r0.A04
            java.lang.String r0 = r0.A05
        L_0x008e:
            r2.remove(r12)
            goto L_0x002e
        L_0x0092:
            r0 = r1
            goto L_0x008e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40377AbA.DdI(android.graphics.drawable.Drawable, int, boolean):void");
    }

    public final void DlC(Drawable drawable, int i, float f, float f2) {
        ArrayList A1C;
        C391529tE[] r1;
        C391529tE r0;
        0qQ.A0B(drawable, 1);
        Drawable drawable2 = drawable;
        if (drawable instanceof AnonymousClass5MH) {
            drawable2 = ((AnonymousClass5MH) drawable2).A0A;
        }
        if ((drawable2 instanceof C306386Ly) && !(drawable2 instanceof C369898vV)) {
            this.A0M.E3H(new C356178Sw(drawable, (C306386Ly) drawable2));
        } else if (drawable2 instanceof C347017w8) {
            0qQ.A0B(drawable2, 1);
            if (drawable2 instanceof AnonymousClass5MH) {
                drawable2 = ((AnonymousClass5MH) drawable2).A0A;
            }
            if (drawable2 instanceof C347017w8) {
                C347017w8 r6 = (C347017w8) drawable2;
                Drawable A042 = r6.A04();
                0qQ.A07(A042);
                if (A042 instanceof C389739q7) {
                    C389739q7 r12 = (C389739q7) A042;
                    if (r12.A02) {
                        this.A0M.E3H(new AnonymousClass8UF(r12.A00, r12.A02()));
                        return;
                    }
                }
                Class<C389639px> cls = C389639px.class;
                if (r6.A0E(cls)) {
                    ((C389639px) r6.A06(cls).get(0)).A03.A00();
                }
                if (r6.A04() instanceof C389649py) {
                    Drawable A043 = r6.A04();
                    0qQ.A0C(A043, "null cannot be cast to non-null type com.instagram.reels.notifyme.view.NotifyMeStickerV2Drawable");
                    ((C389649py) A043).A0G.A00();
                }
                if (r6.A0D() && (r6.A04() instanceof C369768vI)) {
                    Drawable A044 = r6.A04();
                    0qQ.A0C(A044, "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.drawable.StickerItemDrawable");
                    if (((C369768vI) A044).A0M == C318046oG.AVATAR_STATIC) {
                        Drawable A045 = r6.A04();
                        0qQ.A0C(A045, "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.drawable.StickerItemDrawable");
                        int intValue = ((C369768vI) A045).A07.intValue();
                        if (intValue != 0) {
                            if (intValue == 1) {
                                r1 = new C391529tE[1];
                                r0 = C391529tE.MIRROR;
                            } else if (intValue == 2) {
                                r1 = new C391529tE[1];
                                r0 = C391529tE.BLACK_AND_WHITE;
                            } else if (intValue == 3) {
                                r1 = new C391529tE[1];
                                r0 = C391529tE.MOTION_BLUR;
                            } else {
                                throw AnonymousClass7TE.A1K();
                            }
                            r1[0] = r0;
                            A1C = 0sr.A1L(r1);
                        } else {
                            A1C = AnonymousClass7TE.A1C();
                        }
                        27r A012 = 27p.A01(this.A0C);
                        C59725JVj jVj = C59725JVj.LIVE;
                        Drawable A046 = r6.A04();
                        0qQ.A0C(A046, "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.drawable.StickerItemDrawable");
                        A012.A1J(jVj, C391619tN.A04, ((C369768vI) A046).A0L.A0S, A1C);
                        Drawable A047 = r6.A04();
                        0qQ.A0C(A047, "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.drawable.StickerItemDrawable");
                        String str = ((C369768vI) A047).A0L.A0S;
                        0qQ.A07(str);
                        this.A02.put(str, A1C);
                    }
                }
            }
        }
    }

    public final void Dn7() {
        this.A04 = null;
        A01(this).A0Z();
        A06(AnonymousClass05K.A01);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x003a, code lost:
        if ((((X.C347017w8) r5).A04() instanceof X.C389669q0) == false) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Dn8(X.C2802350v r24, java.lang.String r25) {
        /*
            r23 = this;
            r2 = 0
            r4 = r23
            X.8an r0 = A01(r4)
            r0.A0Z()
            X.8BE r8 = r4.A00
            r14 = r24
            boolean r0 = r8.AFN(r14)
            r3 = 1
            if (r0 == 0) goto L_0x00f0
            android.content.Context r10 = r4.A06
            com.instagram.common.session.UserSession r11 = r4.A0C
            X.0iw r0 = r4.A0B
            java.lang.String r17 = r0.getModuleName()
            X.4yO r12 = r4.A03
            r13 = 0
            r15 = r13
            r16 = r13
            r18 = r3
            android.graphics.drawable.Drawable r5 = X.C39900AIi.A00(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            boolean r0 = r5 instanceof X.C347017w8
            r6 = 0
            if (r0 == 0) goto L_0x003c
            r0 = r5
            X.7w8 r0 = (X.C347017w8) r0
            android.graphics.drawable.Drawable r0 = r0.A04()
            boolean r0 = r0 instanceof X.C389669q0
            r9 = 1
            if (r0 != 0) goto L_0x003d
        L_0x003c:
            r9 = 0
        L_0x003d:
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r7 = r4.A0G
            boolean r0 = r7.CTv()
            if (r0 == 0) goto L_0x0128
            r1 = 0
        L_0x0046:
            if (r9 == 0) goto L_0x0122
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.drawable.RotatableDrawable"
            X.0qQ.A0C(r5, r0)
            r0 = r5
            X.7w8 r0 = (X.C347017w8) r0
            android.graphics.drawable.Drawable r7 = r0.A04()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.reels.prompt.view.AnimatedPromptMagicModStickerDrawable"
            X.0qQ.A0C(r7, r0)
            X.9q0 r7 = (X.C389669q0) r7
            int r0 = r7.A01
            int r0 = r0 - r1
            r8 = 81
            r7 = 0
            float r0 = (float) r0
            X.Ut8 r1 = new X.Ut8
            r1.<init>(r8, r7, r0)
        L_0x0067:
            X.0qQ.A0A(r1)
            java.lang.Integer r0 = r14.CAk()
            int r0 = r0.intValue()
            switch(r0) {
                case 25: goto L_0x011f;
                case 28: goto L_0x011f;
                case 29: goto L_0x011f;
                case 30: goto L_0x011f;
                case 31: goto L_0x011f;
                case 32: goto L_0x011f;
                case 33: goto L_0x011f;
                case 36: goto L_0x011f;
                case 56: goto L_0x011f;
                case 63: goto L_0x011f;
                default: goto L_0x0075;
            }
        L_0x0075:
            X.8Yz r0 = r4.A0E
            X.80m r0 = r0.A08
            java.lang.Object r0 = r0.A00
            X.4yO r0 = (X.C279284yO) r0
            java.lang.String r20 = "IgLiveStickerOverlayController"
            r15 = r10
            r16 = r11
            r17 = r0
            r18 = r14
            r19 = r1
            r21 = r2
            r22 = r2
            X.6b1 r1 = X.C39900AIi.A03(r15, r16, r17, r18, r19, r20, r21, r22)
            r1.A0P = r6
            java.lang.Integer r0 = r14.CAk()
            int r7 = r0.intValue()
            r0 = 13
            r6 = r25
            if (r7 == r0) goto L_0x0115
            r0 = 20
            if (r7 == r0) goto L_0x010b
            X.4nO r0 = r14.BkW()
            java.util.List r0 = r0.A06
            X.0qQ.A07(r0)
            r4.A05(r5, r1, r6, r0)
        L_0x00b0:
            X.8un r1 = r4.A04
            if (r1 == 0) goto L_0x00bb
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r0 = r4.A0R
            r0.A0r(r5, r1)
            r4.A04 = r13
        L_0x00bb:
            java.util.Map r7 = r4.A0Y
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x00f0
            boolean r0 = r5 instanceof X.C299875vz
            if (r0 == 0) goto L_0x00f0
            r0 = r5
            X.5vz r0 = (X.C299875vz) r0
            java.lang.String r6 = r0.A09()
            X.0qQ.A07(r6)
            java.lang.String r0 = ""
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x00f0
            boolean r0 = r7.containsKey(r6)
            if (r0 == 0) goto L_0x00f0
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r1 = r4.A0R
            java.lang.Object r0 = r7.get(r6)
            X.0qQ.A0A(r0)
            X.8un r0 = (X.C369458un) r0
            r1.A0r(r5, r0)
            r7.remove(r6)
        L_0x00f0:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r4.A06(r0)
            com.instagram.ui.text.fittingtextview.FittingTextView r1 = r4.A0Q
            if (r1 == 0) goto L_0x010a
            r1.setEnabled(r3)
            X.2co r0 = X.C315596kB.A02
            X.5nL r1 = X.C294975nL.A01(r1, r2)
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.A0I(r0)
            r1.A0H()
        L_0x010a:
            return
        L_0x010b:
            X.6nz r0 = X.C317876nz.A18
            java.util.ArrayList r0 = r0.A01()
            r4.A05(r5, r1, r6, r0)
            goto L_0x00b0
        L_0x0115:
            X.6nz r0 = X.C317876nz.A0u
            java.util.ArrayList r0 = r0.A01()
            r4.A05(r5, r1, r6, r0)
            goto L_0x00b0
        L_0x011f:
            r6 = 1
            goto L_0x0075
        L_0x0122:
            X.8BH r1 = r8.Az4()
            goto L_0x0067
        L_0x0128:
            com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl r7 = (com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r7
            int r1 = r7.A08
            int r0 = r7.A0B
            int r1 = r1 - r0
            goto L_0x0046
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40377AbA.Dn8(X.50v, java.lang.String):void");
    }

    public final void Dqy(String str) {
    }

    public final void Dr4() {
    }

    public final void EDV(Drawable drawable, boolean z) {
        0qQ.A0B(drawable, 0);
        this.A0R.A0S(drawable);
    }

    public final void FIJ(boolean z) {
    }

    public final void FJt(boolean z) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        if ((r8 instanceof X.C369948va) == false) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int A00(android.graphics.drawable.Drawable r8, X.C310416b1 r9) {
        /*
            r7 = this;
            X.80U r0 = r7.A0M
            boolean r0 = r0.CZe()
            r2 = r8
            if (r0 == 0) goto L_0x0019
            java.util.List r0 = r7.A0X
            r0.add(r8)
            boolean r0 = r8 instanceof X.AnonymousClass5MH
            if (r0 == 0) goto L_0x0019
            r1 = r2
            X.5MH r1 = (X.AnonymousClass5MH) r1
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r1.A03 = r0
        L_0x0019:
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r1 = r7.A0R
            boolean r4 = X.C306406Ma.A0A(r8)
            X.82p r0 = r7.A0H
            X.82o r0 = r0.A02
            boolean r0 = r0.A0A()
            if (r0 == 0) goto L_0x002e
            boolean r0 = r8 instanceof X.C369948va
            r5 = 1
            if (r0 != 0) goto L_0x002f
        L_0x002e:
            r5 = 0
        L_0x002f:
            r6 = 0
            r3 = r9
            int r0 = r1.A0K(r2, r3, r4, r5, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40377AbA.A00(android.graphics.drawable.Drawable, X.6b1):int");
    }

    public static C358368an A01(C40377AbA abA) {
        return (C358368an) abA.A0P.get();
    }

    private final boolean A03() {
        Integer num = this.A01;
        if (num != null) {
            C314446iH r1 = this.A0K;
            if (!r1.CJX() || r1.AYe() == this) {
                int intValue = num.intValue();
                if (intValue == 3 || intValue == 5 || intValue == 6 || intValue == 7 || intValue == 4) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0023, code lost:
        if (r1 == X.AnonymousClass05K.A0C) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04() {
        /*
            r5 = this;
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r1 = r5.A0R
            java.lang.Class<X.6Ly> r0 = X.C306386Ly.class
            java.util.ArrayList r0 = r1.A0V(r0)
            java.util.Iterator r4 = r0.iterator()
            r3 = 0
        L_0x000d:
            r2 = 0
        L_0x000e:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x002e
            java.lang.Object r0 = r4.next()
            X.6Ly r0 = (X.C306386Ly) r0
            java.lang.Integer r1 = X.C306496Mj.A00(r0)
            if (r3 != 0) goto L_0x0025
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r3 = 0
            if (r1 != r0) goto L_0x0026
        L_0x0025:
            r3 = 1
        L_0x0026:
            if (r2 != 0) goto L_0x002c
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x000d
        L_0x002c:
            r2 = 1
            goto L_0x000e
        L_0x002e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40377AbA.A04():void");
    }

    public final void A05(Drawable drawable, C310416b1 r20, String str, List list) {
        C273924nP r0;
        C391619tN A012;
        String str2;
        C279294yP r10;
        Drawable drawable2 = drawable;
        0qQ.A0B(drawable2, 2);
        AnonymousClass57C r9 = AnonymousClass57C.ASSET_PICKER;
        String str3 = null;
        C310416b1 r2 = r20;
        if ((drawable2 instanceof C386069k0) && ((C386069k0) drawable2).A08() == 1iA.A0a.A00) {
            r2.A08 = null;
        }
        int A002 = A00(drawable2, r2);
        C273914nO r1 = new C273914nO();
        r1.A06 = list;
        r1.A03 = null;
        r1.A04 = str;
        r1.A05 = null;
        boolean z = drawable2 instanceof C347017w8;
        if (z) {
            r1.A01(((C347017w8) drawable2).A00);
        }
        if (AnonymousClass9SF.A04(drawable2)) {
            r0 = C273924nP.ANIMATED_STICKERS;
        } else {
            r0 = C273924nP.STATIC_STICKERS;
        }
        r1.A01 = r0;
        SparseArray sparseArray = this.A07;
        sparseArray.put(A002, r1);
        if (drawable2 instanceof C268684dp) {
            C268684dp r22 = (C268684dp) drawable2;
            if (r22.isLoading()) {
                r22.A9D(new AZ1(1, drawable2, r22, this));
            } else {
                this.A0R.A0m(drawable2);
            }
        }
        this.A0L.Dn6(drawable2);
        if (z) {
            C347017w8 r7 = (C347017w8) drawable2;
            r7.A07();
            ArrayList A062 = r7.A06(C369768vI.class);
            if (!A062.isEmpty()) {
                Iterator it = A062.iterator();
                while (it.hasNext()) {
                    C369768vI r02 = (C369768vI) it.next();
                    r02.A04();
                    if (r02.A0M == C318046oG.AVATAR_STATIC) {
                        if (182.A06(0Tu.A05, this.A0C, 36323204142214143L)) {
                            r7.A09();
                        }
                    }
                }
            }
        }
        C273914nO r23 = (C273914nO) sparseArray.get(A002);
        if (r23 == null) {
            A012 = null;
            str2 = null;
        } else {
            A012 = AED.A01(r23.A04, r23.A05);
            str2 = r23.A05;
        }
        int i = 1;
        if (0qQ.A0K(str2, C318046oG.AI_STICKER.toString())) {
            i = 8;
        }
        AnonymousClass80U r24 = this.A0M;
        if (r24.CZU()) {
            C273914nO r03 = (C273914nO) sparseArray.get(A002);
            if (r03 != null) {
                str3 = r03.A00();
            }
            27r A013 = 27p.A01(this.A0C);
            C59725JVj jVj = C59725JVj.LIVE;
            C2801950r r04 = this.A0H.A02.A01.A0g;
            if (r04 == null || r04.ordinal() != 1) {
                r10 = null;
            } else {
                r10 = C279294yP.FEED;
            }
            A013.A0s(r9, r10, jVj, A012, (MusicOverlayStickerModel) null, (Product) null, str3, (String) null, i);
        }
        r24.E3H(new Object());
    }

    public final List B9U() {
        return 0sn.A00;
    }

    public final boolean Cd8() {
        return AnonymousClass7TF.A1W(this.A01, AnonymousClass05K.A0N);
    }

    public final void Cnq(Drawable drawable) {
        B3f A002 = InteractiveDrawableContainer.A00(drawable, this.A0R);
        if (A002 != null) {
            A002.Cno(true);
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.8TZ, java.lang.Object] */
    public final void D0n(boolean z) {
        ? obj = new Object();
        obj.A00 = z;
        this.A0M.E3H(obj);
    }

    public final void D9o() {
        this.A0M.E3H(AnonymousClass8T3.A00);
    }

    public final void DAr(float f, float f2) {
        InteractiveDrawableContainer interactiveDrawableContainer = this.A0R;
        if (interactiveDrawableContainer.getInteractiveDrawables().size() >= 2) {
            UserSession userSession = this.A0C;
            if (AnonymousClass7TF.A0R(0Tu.A05, userSession, 36320962169283563L).booleanValue()) {
                1Av A002 = 1Au.A00(userSession);
                0xa r5 = A002.A01;
                int i = r5.getInt("layering_tool_tooltip_seen_count", 0);
                boolean z = false;
                if (System.currentTimeMillis() - r5.getLong("layering_tool_tooltip_last_seen_ms", 0) < TimeUnit.DAYS.toMillis(3)) {
                    z = true;
                }
                if (!AnonymousClass7TG.A1a(A002, A002.A20, 1Av.A8a, 458) && i < 3 && !z) {
                    FragmentActivity requireActivity = this.A0A.requireActivity();
                    Context context = this.A06;
                    AnonymousClass5Gt A0f = AnonymousClass7TG.A0f(requireActivity, AnonymousClass7TE.A16(context, 2131974214));
                    A0f.A05(new AnonymousClass9UE(interactiveDrawableContainer, (int) f, (int) f2, true));
                    A0f.A01();
                    A0f.A01 = AnonymousClass7TG.A02(context);
                    A0f.A00().A06();
                    AnonymousClass7TG.A1M(r5, "layering_tool_tooltip_seen_count", r5.getInt("layering_tool_tooltip_seen_count", 0) + 1);
                    long currentTimeMillis = System.currentTimeMillis();
                    0xY AR4 = r5.AR4();
                    AR4.E5c("layering_tool_tooltip_last_seen_ms", currentTimeMillis);
                    AR4.apply();
                }
            }
        }
    }

    public final void DAs(Drawable drawable) {
        0qQ.A0B(AnonymousClass80V.CLIPS_EDITOR, 0);
    }

    public final void DDs(int i) {
        Integer num = this.A05;
        if (num != null) {
            A06(num);
            if (this.A05 == AnonymousClass05K.A0N) {
                27p.A01(this.A0C).A1I(C59725JVj.LIVE, i, 3);
                C314676if r1 = this.A0P;
                ((C358368an) r1.get()).A0a(i);
                ((C358368an) r1.get()).A0X();
            }
        }
    }

    public final void DDt() {
        this.A05 = this.A01;
        onBackPressed();
        A06(AnonymousClass05K.A0Y);
    }

    public final void DFg(boolean z) {
        AnonymousClass8A1.A01(this.A0C).A09("StickerOverlayController#onFinishEditingText");
        A06(AnonymousClass05K.A01);
        0nA.A0N(this.A0U);
        A04();
    }

    public final void DMp() {
        this.A0M.E3H(new Object());
    }

    public final void DMr(int i, boolean z) {
        switch (this.A0M.Atr().ordinal()) {
            case 17:
            case 21:
            case 25:
            case 27:
            case 30:
            case 31:
            case 32:
            case 33:
            case 59:
                return;
            default:
                A01(this).DMr(i, z);
                return;
        }
    }

    public final void DdW(Drawable drawable) {
        this.A0R.A0S(drawable);
    }

    public final void DhH(Drawable drawable, float f, float f2, float f3, float f4) {
        AnonymousClass7TF.A1O(((C60198JhH) this.A0W.A0F.getValue()).A04, true);
        A06(AnonymousClass05K.A15);
    }

    public final void DlE(Drawable drawable, float f, float f2, float f3, float f4, int i) {
        InteractiveDrawableContainer interactiveDrawableContainer = this.A0R;
        ArrayList A0V2 = interactiveDrawableContainer.A0V(C369818vN.class);
        float f5 = f;
        float f6 = f2;
        if ((!A0V2.isEmpty()) && ((Drawable) A0V2.get(0)).getBounds().contains((int) f, (int) f2)) {
            UserSession userSession = this.A0C;
            if (!182.A06(0Tu.A05, userSession, 36319858362752697L) && 25x.A00(userSession).A01.A00 == C299715vi.A00) {
                if (!A0V2.isEmpty()) {
                    ((C369818vN) A0V2.get(0)).A04.A00();
                    return;
                }
                return;
            }
        }
        C357638Yz r1 = this.A0E;
        if (!(r1.A08.A00 instanceof AnonymousClass80O) && !C357638Yz.A03(C358088aL.A0o, r1)) {
            AnonymousClass82Y r0 = this.A0H.A02.A01;
            UserSession userSession2 = this.A0C;
            C3498482b r5 = r0.A04;
            AnonymousClass81W r12 = ((NineSixteenLayoutConfigImpl) this.A0G).A0K;
            if (!AnonymousClass91L.A07(this.A06, userSession2, r5, interactiveDrawableContainer, f5, f6, (float) r12.getWidth(), (float) r12.getHeight())) {
                this.A0M.E3H(new Object());
            }
        }
    }

    public final void DmS() {
        A06(AnonymousClass05K.A0N);
    }

    public final /* bridge */ /* synthetic */ void Dmx(Object obj, Object obj2, Object obj3) {
        Integer num;
        AnonymousClass80V r6 = (AnonymousClass80V) obj;
        AnonymousClass80V r7 = (AnonymousClass80V) obj2;
        AnonymousClass7TG.A1T(r6, r7, obj3);
        int ordinal = r6.ordinal();
        if (ordinal != 12) {
            if (ordinal == 77 && r7 != AnonymousClass80V.STICKER_LAYERING) {
                this.A0R.A0F = false;
                ((C65786Lze) this.A0N.get()).A05();
            }
        } else if (r7 != AnonymousClass80V.ASSET_PICKER) {
            InteractiveDrawableContainer interactiveDrawableContainer = this.A0R;
            interactiveDrawableContainer.A0h(interactiveDrawableContainer.getActiveDrawableId(), true);
            interactiveDrawableContainer.invalidate();
        }
        switch (r7.ordinal()) {
            case 2:
                A01(this).A0U();
                if (this.A01 == AnonymousClass05K.A01 && this.A0R.getInteractiveDrawables().size() <= 0) {
                    num = AnonymousClass05K.A0C;
                    break;
                } else {
                    return;
                }
            case 11:
            case 58:
                A01(this).A0U();
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
            case 13:
                C357638Yz r1 = this.A0H.A02.A01.A0X;
                if (r1 != null) {
                    if (C357638Yz.A03(C358088aL.A0o, r1)) {
                        if (!182.A06(0Tu.A05, this.A0C, 36316800346231438L)) {
                            return;
                        }
                    }
                    A01(this).A0g(obj3);
                    return;
                }
                return;
            case 14:
                num = AnonymousClass05K.A01;
                break;
            case 15:
                A06(AnonymousClass05K.A0j);
                C314676if r0 = A01(this).A1Y;
                if (r0 != null) {
                    ((C379049Sf) r0.get()).DCS(obj3);
                    return;
                }
                return;
            case 77:
                this.A0R.A0F = true;
                AnonymousClass8VI r8 = (AnonymousClass8VI) obj3;
                ((C65786Lze) this.A0N.get()).A06(r8.A00, (float) ((NineSixteenLayoutConfigImpl) this.A0G).A0K.getHeight(), r8.A01, r8.A02);
                return;
            default:
                return;
        }
        A06(num);
    }

    public final void DnA() {
        Integer num = AnonymousClass05K.A01;
        A06(num);
        this.A05 = num;
    }

    public final void Dsb() {
        Integer num;
        Integer num2 = this.A01;
        if (num2 == AnonymousClass05K.A15) {
            AnonymousClass7TF.A1O(((C60198JhH) this.A0W.A0F.getValue()).A04, false);
            if (!this.A0M.CZe() || this.A0R.getInteractiveDrawables().size() > 0) {
                num = AnonymousClass05K.A01;
            } else {
                num = AnonymousClass05K.A0C;
            }
            A06(num);
        } else if (num2 == AnonymousClass05K.A1F) {
            C354508Mh r1 = this.A0J;
            if (r1.A00 != null) {
                AnonymousClass88K r0 = r1.A02;
                r0.A05();
                r0.A06(r1);
            }
        }
        AnonymousClass80U r12 = this.A0M;
        if (r12.CQ0(AnonymousClass80V.STICKER_LAYERING)) {
            r12.E3H(new Object());
        }
    }

    public final void E0r(int i) {
        Drawable drawable;
        B3f A0P2 = this.A0R.A0P(i);
        if (A0P2 != null) {
            drawable = ((C378669Qs) A0P2).A0B;
        } else {
            drawable = null;
        }
        if (drawable instanceof C347017w8) {
            C347017w8 r2 = (C347017w8) drawable;
            A06(AnonymousClass05K.A1F);
            r2.A08();
            Object obj = this.A07.get(i);
            obj.getClass();
            ((C273914nO) obj).A01(r2.A00);
            C354508Mh r1 = this.A0J;
            r1.A00 = r2;
            AnonymousClass88K r0 = r1.A02;
            r0.A05();
            r0.A06(r1);
        }
    }

    public final void EFO(Drawable drawable, Drawable drawable2) {
        this.A0R.A0q(drawable, drawable2);
    }

    public final void FKD(C306386Ly r2) {
        this.A0R.A0m(r2);
    }

    public final boolean onBackPressed() {
        ConstrainedEditText constrainedEditText = this.A0U;
        if (!constrainedEditText.hasFocus()) {
            return false;
        }
        constrainedEditText.clearFocus();
        return true;
    }

    public static final void A02(C279284yO r1, C40377AbA abA) {
        if (abA.A03()) {
            abA.DMp();
        }
        if (abA.A03 != r1) {
            abA.A0R.A0b();
            abA.A07.clear();
            abA.A03 = r1;
        }
        abA.A0R.setCameraDestination(r1);
    }

    public final void CIk(AnonymousClass05V r2) {
        A01(this).A0U();
    }

    public final boolean Erm() {
        return A03();
    }

    public final void CnB(Drawable drawable) {
    }

    public final void AAQ(Drawable drawable, C310416b1 r2) {
        A00(drawable, r2);
    }

    public C40377AbA(Activity activity, View view, AnonymousClass07i r10, AnonymousClass4DH r11, AnonymousClass0iw r12, UserSession userSession, AnonymousClass3E6 r14, C357638Yz r15, TargetViewSizeProvider targetViewSizeProvider, C3499582p r17, AnonymousClass8BQ r18, AnonymousClass88K r19, AnonymousClass8AL r20, C314446iH r21, AnonymousClass88Z r22, AnonymousClass8BE r23, AnonymousClass80U r24, InteractiveDrawableContainer interactiveDrawableContainer, C65025Lm3 lm3) {
        AnonymousClass80U r4 = r24;
        AnonymousClass88Z r1 = r22;
        AnonymousClass7TF.A1D(r1, 3, r4);
        0qQ.A0B(r14, 9);
        TargetViewSizeProvider targetViewSizeProvider2 = targetViewSizeProvider;
        0qQ.A0B(targetViewSizeProvider2, 10);
        AnonymousClass8AL r2 = r20;
        0qQ.A0B(r2, 18);
        this.A0H = r17;
        this.A0L = r1;
        this.A0M = r4;
        this.A0C = userSession;
        this.A08 = view;
        InteractiveDrawableContainer interactiveDrawableContainer2 = interactiveDrawableContainer;
        this.A0R = interactiveDrawableContainer2;
        this.A0D = r14;
        this.A0G = targetViewSizeProvider2;
        this.A0W = lm3;
        this.A0A = r11;
        AnonymousClass88K r5 = r19;
        this.A0I = r5;
        this.A00 = r23;
        this.A0E = r15;
        this.A0B = r12;
        this.A0K = r21;
        r4.A7w(this);
        ((AnonymousClass80T) r4).A01.A01(this, AnonymousClass80V.MEDIA_EDIT);
        this.A06 = activity;
        if (AnonymousClass7TF.A0g(userSession) == null) {
            0qQ.A07(AnonymousClass6SR.A02());
        }
        this.A0T = new C354468Md(interactiveDrawableContainer2);
        this.A09 = (ViewGroup) view.requireViewById(R.id.post_capture_interactive_contents_container);
        ConstrainedEditText constrainedEditText = (ConstrainedEditText) view.requireViewById(R.id.text_overlay_edit_text);
        this.A0U = constrainedEditText;
        constrainedEditText.setSupportedContentMimeTypes("image/*");
        FittingTextView fittingTextView = (FittingTextView) view.findViewById(R.id.done_button);
        this.A0Q = fittingTextView;
        if (fittingTextView != null) {
            2eS.A01(fittingTextView);
        }
        AnonymousClass8BE r0 = this.A00;
        this.A00 = r0;
        this.A0R.A0T = r0.CRa();
        C3494680m r3 = r15.A08;
        this.A03 = (C279284yO) r3.A00;
        C354508Mh r02 = new C354508Mh(r5);
        this.A0J = r02;
        r02.A01 = this;
        this.A0V = (EyedropperColorPickerTool) view.requireViewById(R.id.eyedropper_color_picker_tool);
        this.A0S = new C354518Mi(userSession);
        this.A0F = new C40294AZj(this);
        r15.A0F(new C378429Pt(this, 2));
        this.A0N = C314666ie.A00(new C41396AtI((Object) this, 1), new C314656id[0]);
        this.A0O = C314666ie.A00(new C41396AtI((Object) this, 2), new C314656id[0]);
        this.A0R.A0y(this);
        this.A0P = C314666ie.A00(new C41394AtG(r10, r18, r2, this), new C314656id[0]);
        A02((C279284yO) r3.A00, this);
        this.A0Z = 182.A06(0Tu.A05, userSession, 36315812503490100L);
    }
}
