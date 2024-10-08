package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewStub;
import com.instagram.android.R;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.music.common.model.TrackSnippet;

/* renamed from: X.AeM  reason: case insensitive filesystem */
public final class C40575AeM implements C357888a1, C357938a6 {
    public int A00 = 15;
    public Drawable A01;
    public MusicOverlayStickerModel A02;
    public boolean A03;
    public boolean A04;
    public final UserSession A05;
    public final C3506685r A06;
    public final AnonymousClass80U A07;
    public final AnonymousClass8ME A08;
    public final C3499982t A09;
    public final C357918a4 A0A;
    public final View A0B;
    public final View A0C;
    public final C3499582p A0D;
    public final C314676if A0E;
    public final String A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;

    public C40575AeM(View view, AnonymousClass4DH r18, UserSession userSession, TargetViewSizeProvider targetViewSizeProvider, C3499582p r21, C3506685r r22, AnonymousClass80U r23, AnonymousClass8ME r24, C3499982t r25, String str) {
        C3506685r r3 = r22;
        0qQ.A0B(r3, 3);
        C3499982t r1 = r25;
        String str2 = str;
        AnonymousClass7TF.A1G(r1, 7, str2);
        this.A0D = r21;
        this.A07 = r23;
        this.A06 = r3;
        UserSession userSession2 = userSession;
        this.A05 = userSession2;
        this.A09 = r1;
        this.A08 = r24;
        this.A0F = str2;
        View view2 = view;
        View A0G2 = AnonymousClass7TF.A0G(view2, R.id.text_overlay_edit_text_container);
        this.A0B = A0G2;
        this.A0C = AnonymousClass7TF.A0G(view2, R.id.done_button);
        AnonymousClass4DH r32 = r18;
        this.A0A = new C357918a4((ViewStub) AnonymousClass7TF.A0G(A0G2, R.id.music_overlay_sticker_editor_stub), new AnonymousClass9I6(0, 0, 7, 1, false), r32, userSession2, targetViewSizeProvider, this, C3515689j.UNKNOWN, 0, true, false, false, true, false, false);
        this.A0E = C314666ie.A00(new C41397AtJ(1, r32, this), new C314656id[0]);
        this.A0K = true;
        this.A0L = true;
        this.A0I = true;
        this.A0J = true;
        this.A0G = true;
        this.A0H = true;
    }

    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v1, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: type inference failed for: r4v2, types: [X.4yO] */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: type inference failed for: r4v7 */
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0049: MOVE  (r1v4 X.9XK) = (r4v1 ? I:?[OBJECT, ARRAY])
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    public static final void A01(X.C40575AeM r11, X.C349337zz r12, java.lang.String r13, boolean r14) {
        /*
            r4 = 0
            r6 = r12
            if (r12 == 0) goto L_0x0060
            X.6KJ r1 = r12.BV4()
            X.6KJ r0 = X.AnonymousClass6KJ.HIDDEN
            if (r1 == r0) goto L_0x0060
            X.6KJ r1 = r12.BV4()
            X.6KJ r0 = X.AnonymousClass6KJ.UNKNOWN
            if (r1 == r0) goto L_0x0060
            boolean r0 = r12 instanceof X.Af1
            if (r0 == 0) goto L_0x0056
            r0 = r6
            X.Af1 r0 = (X.Af1) r0
            X.Aen r0 = r0.A03
        L_0x001d:
            android.view.View r1 = r11.A0B
            android.content.Context r2 = X.AnonymousClass7TE.A0S(r1)
            com.instagram.common.session.UserSession r3 = r11.A05
            java.lang.String r9 = r11.A0F
            X.82p r1 = r11.A0D
            X.82o r1 = r1.A02
            X.82Y r1 = r1.A01
            X.8Yz r1 = r1.A0X
            if (r1 == 0) goto L_0x0037
            X.80m r1 = r1.A08
            java.lang.Object r4 = r1.A00
            X.4yO r4 = (X.C279284yO) r4
        L_0x0037:
            r5 = 0
            r10 = 0
            r7 = r5
            r8 = r5
            android.graphics.drawable.Drawable r4 = X.C39900AIi.A00(r2, r3, r4, r5, r6, r7, r8, r9, r10)
        L_0x003f:
            X.8a4 r1 = r11.A0A
            r1.A0F()
            boolean r1 = r4 instanceof X.AnonymousClass9XK
            if (r1 == 0) goto L_0x004f
            r1 = r4
            X.9XK r1 = (X.AnonymousClass9XK) r1
            if (r1 == 0) goto L_0x004f
            r1.A02 = r13
        L_0x004f:
            X.8ME r2 = r11.A08
            r1 = 0
            r2.A1J(r4, r0, r14, r1)
            return
        L_0x0056:
            boolean r0 = r12 instanceof X.Af0
            if (r0 == 0) goto L_0x0060
            r0 = r6
            X.Af0 r0 = (X.Af0) r0
            X.Aen r0 = r0.A02
            goto L_0x001d
        L_0x0060:
            r0 = r4
            if (r12 == 0) goto L_0x003f
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40575AeM.A01(X.AeM, X.7zz, java.lang.String, boolean):void");
    }

    public final void A04(MusicProduct musicProduct, MusicAssetModel musicAssetModel, AnonymousClass6KJ r7) {
        0qQ.A0B(musicAssetModel, 1);
        MusicOverlayStickerModel A032 = C59670JTa.A03(musicProduct, musicAssetModel, Integer.valueOf(this.A06.A05.A06.BV1()), Integer.valueOf(musicAssetModel.A05()), this.A09.BUn());
        this.A02 = A032;
        if (r7.A02()) {
            ((C39887ADj) this.A0E.get()).A00(this, musicAssetModel);
        } else if (A032 != null) {
            A03(new Af0(A032, (C40599Aen) null, r7, -1));
        }
    }

    public final boolean ACI() {
        return true;
    }

    public final void ATW() {
        A02((C349337zz) null);
    }

    public final void Cuw() {
        this.A07.E3H(new AnonymousClass8UQ(true));
    }

    public final /* synthetic */ void Cwe(AnonymousClass8IJ r1, TrackSnippet trackSnippet, boolean z) {
    }

    public final /* synthetic */ void DSF(Integer num) {
    }

    private final void A02(C349337zz r5) {
        MusicProduct musicProduct;
        Object r2;
        if (r5 != null) {
            musicProduct = r5.BUu().A02;
        } else {
            musicProduct = null;
        }
        MusicProduct musicProduct2 = MusicProduct.MUSIC_FIRST;
        AnonymousClass80U r3 = this.A07;
        if (musicProduct == musicProduct2) {
            r2 = new C356708Ux(r5);
        } else {
            r2 = new AnonymousClass8UR(r5, (String) null, false);
        }
        r3.E3H(r2);
    }

    private final void A03(C349337zz r11) {
        C279284yO r3;
        Context A0S = AnonymousClass7TE.A0S(this.A0B);
        UserSession userSession = this.A05;
        C357638Yz r0 = this.A0D.A02.A01.A0X;
        if (r0 != null) {
            r3 = (C279284yO) r0.A08.A00;
        } else {
            r3 = null;
        }
        this.A08.A1J(C39900AIi.A00(A0S, userSession, r3, (C321086tY) null, r11, (Integer) null, (Integer) null, "MusicPostcaptureEditController", false), (C40599Aen) null, false, true);
    }

    public final int BPD() {
        return this.A00;
    }

    public final MusicOverlayStickerModel BUu() {
        return this.A02;
    }

    public final String BXe(boolean z) {
        Context A0S = AnonymousClass7TE.A0S(this.A0B);
        UserSession userSession = this.A05;
        if (z || AnonymousClass7TE.A0q(userSession).getInt("music_editor_nux_seen_count", 0) < 3) {
            return null;
        }
        return A0S.getString(2131967761);
    }

    public final boolean BuA() {
        return false;
    }

    public final void CLM() {
        C357918a4 r2 = this.A0A;
        View view = r2.A03;
        if (view != null) {
            view.setVisibility(8);
            C357918a4.A07(r2);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final boolean CPG() {
        return !AnonymousClass7TF.A0R(0Tu.A05, this.A08.A0r, 36319858362752697L).booleanValue();
    }

    public final boolean CRK() {
        return false;
    }

    public final boolean CRW() {
        return this.A0G;
    }

    public final boolean CW3() {
        return this.A0H;
    }

    public final boolean CZL() {
        return this.A0I;
    }

    public final boolean Cai() {
        return this.A0J;
    }

    public final boolean CcC() {
        return this.A0K;
    }

    public final boolean CcD() {
        int ordinal;
        C3499482o r1 = this.A0D.A02;
        if (r1.A0G() || r1.A01.A0s || ((ordinal = r1.A01().ordinal()) != 0 && ordinal != 2)) {
            return false;
        }
        return true;
    }

    public final boolean CcE() {
        return this.A0L;
    }

    public final boolean CcY() {
        return AnonymousClass30D.A06(this.A08.A0r);
    }

    public final boolean CdS() {
        return false;
    }

    public final boolean Cxa() {
        if (this.A03) {
            C349337zz A0E2 = this.A0A.A0E();
            if (A0E2 == null) {
                A00();
            }
            A02(A0E2);
            return true;
        }
        this.A07.E3H(new AnonymousClass8UQ(this.A04));
        return true;
    }

    public final void D89() {
        this.A07.E3H(new Object());
    }

    public final void D9r(AnonymousClass8IJ r4, TrackSnippet trackSnippet, Integer num) {
        if (this.A06.A02().C9B().intValue() == 2) {
            C349337zz A0E2 = this.A0A.A0E();
            if (A0E2 == null) {
                A00();
            }
            A02(A0E2);
            return;
        }
        0kD.A0E("Music Not Prepared", "Cannot finish editing music sticker before the track is prepared, otherwise the sticker will have unknown behavior due to all fields (e.g. snippet duration) not being properly set.", (Throwable) null);
    }

    public final void DPT(Integer num) {
        AnonymousClass6KJ A082 = C271404in.A08(1Au.A00(this.A05), false);
        MusicOverlayStickerModel musicOverlayStickerModel = this.A02;
        if (musicOverlayStickerModel != null) {
            A03(new Af0(musicOverlayStickerModel, (C40599Aen) null, A082, -1));
        }
    }

    public final void DPU(AnonymousClass9SE r7) {
        AnonymousClass6KJ A082 = C271404in.A08(1Au.A00(this.A05), true);
        MusicOverlayStickerModel musicOverlayStickerModel = this.A02;
        if (musicOverlayStickerModel != null) {
            A03(new Af1(r7, musicOverlayStickerModel, (C40599Aen) null, A082, -1));
        }
    }

    public final void DSq() {
        AnonymousClass7TE.A1U(this.A0B, false);
        AnonymousClass7TG.A1A(this.A0C, false);
    }

    public final void DSr() {
        AnonymousClass7TG.A1A(this.A0B, false);
        C294975nL.A06(new View[]{this.A0C}, false);
    }

    public final void DvW(int i) {
        MusicOverlayStickerModel musicOverlayStickerModel = this.A02;
        if (musicOverlayStickerModel != null) {
            Integer valueOf = Integer.valueOf(i);
            A9I a9i = new A9I(musicOverlayStickerModel);
            a9i.A0O = valueOf;
            this.A02 = a9i.A00();
        }
    }

    public final void DvX(int i) {
        MusicOverlayStickerModel musicOverlayStickerModel = this.A02;
        if (musicOverlayStickerModel != null) {
            Integer valueOf = Integer.valueOf(i);
            A9I a9i = new A9I(musicOverlayStickerModel);
            a9i.A0K = valueOf;
            this.A02 = a9i.A00();
        }
    }

    public final void EuN() {
        C357918a4 r3 = this.A0A;
        View view = r3.A02;
        if (view != null) {
            view.setVisibility(8);
            View view2 = r3.A03;
            if (view2 != null) {
                view2.setVisibility(0);
                return;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    private final void A00() {
        boolean z;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("User tapped to edit the music sticker, but the model is null. isStickerReady=");
        C357918a4 r1 = this.A0A;
        AJ9 aj9 = r1.A0Z;
        if (aj9 != null) {
            z = AnonymousClass7TF.A1V(aj9.A06);
        } else {
            z = false;
        }
        A1A.append(z);
        A1A.append(" isStickerEditEnabled=");
        A1A.append(r1.A0y.CcY());
        A1A.append(" isFetchingLyrics=");
        A1A.append(r1.A0k);
        A1A.append(" isBoundOnTrackPrepared=");
        A1A.append(r1.A0i);
        0kD.A0E("MusicPostcaptureEditController", A1A.toString(), (Throwable) null);
    }
}
