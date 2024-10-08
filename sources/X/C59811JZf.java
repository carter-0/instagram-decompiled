package X;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.View;
import android.view.ViewStub;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.JZf  reason: case insensitive filesystem */
public final class C59811JZf implements MXG, C229132mt {
    public static final String __redex_internal_original_name = "SavedCutoutStickerPickerGridController";
    public MediaPlayer A00;
    public View A01;
    public View A02;
    public RecyclerView A03;
    public SpinnerImageView A04;
    public String A05;
    public boolean A06;
    public final Context A07;
    public final ViewStub A08;
    public final 2Fk A09;
    public final AnonymousClass0iw A0A;
    public final C61500KAf A0B;
    public final UserSession A0C;
    public final C279284yO A0D;
    public final AnonymousClass8MH A0E;
    public final C62496Kgm A0F;
    public final C59810JZe A0G;
    public final C321086tY A0H;
    public final C3251771i A0I;
    public final C229122ms A0J;
    public final String A0K;
    public final Set A0L = DbS.A0y();
    public final AnonymousClass0eM A0M;
    public final 0sK A0N;
    public final boolean A0O;
    public final boolean A0P;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0036, code lost:
        if (r6 == X.C62496Kgm.A04) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C59811JZf(android.content.Context r15, android.view.View r16, X.AnonymousClass0iw r17, com.instagram.common.session.UserSession r18, X.C279284yO r19, X.AnonymousClass8MH r20, X.C62496Kgm r21) {
        /*
            r14 = this;
            r5 = 1
            r4 = 2
            r3 = 3
            r10 = r18
            X.0qQ.A0B(r10, r4)
            r2 = 0
            r0 = 5
            r9 = r17
            r6 = r21
            X.AnonymousClass7TF.A1G(r9, r0, r6)
            r14.<init>()
            r8 = r15
            r14.A07 = r15
            r14.A0C = r10
            r0 = r19
            r14.A0D = r0
            r14.A0A = r9
            r11 = r20
            r14.A0E = r11
            r14.A0F = r6
            boolean r0 = r0 instanceof X.AnonymousClass80O
            r14.A0P = r0
            java.util.LinkedHashSet r0 = X.DbS.A0y()
            r14.A0L = r0
            X.Kgm r0 = X.C62496Kgm.GALLERY_SAVED
            if (r6 == r0) goto L_0x0038
            X.Kgm r0 = X.C62496Kgm.GALLERY_TRENDING
            r13 = 0
            if (r6 != r0) goto L_0x0039
        L_0x0038:
            r13 = 1
        L_0x0039:
            r14.A0O = r13
            r1 = 10
            X.KAf r0 = new X.KAf
            r0.<init>(r14, r1)
            r14.A0B = r0
            X.PRL r12 = new X.PRL
            r12.<init>(r14, r2)
            r14.A0J = r12
            X.6tY r1 = X.C353578Ie.A00(r10)
            r14.A0H = r1
            X.Kgm r0 = X.C62496Kgm.GALLERY_TRENDING
            if (r6 != r0) goto L_0x008b
            X.0Ud r0 = r1.A08
        L_0x0057:
            androidx.lifecycle.CoroutineLiveData r0 = X.DbT.A0G(r0)
            r14.A09 = r0
            r1 = 18
            X.MMT r0 = new X.MMT
            r0.<init>(r14, r1)
            X.0t0 r0 = X.AnonymousClass0eN.A01(r0)
            r14.A0M = r0
            r1 = 41
            X.JJQ r0 = new X.JJQ
            r0.<init>(r14, r1)
            r14.A0N = r0
            X.JZe r7 = new X.JZe
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r14.A0G = r7
            int r1 = r6.ordinal()
            if (r1 == r4) goto L_0x0091
            if (r1 == r3) goto L_0x0091
            if (r1 == r2) goto L_0x008e
            if (r1 == r5) goto L_0x008e
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x008b:
            X.0Ud r0 = r1.A07
            goto L_0x0057
        L_0x008e:
            X.71i r0 = X.C3251771i.A03
            goto L_0x0093
        L_0x0091:
            X.71i r0 = X.C3251771i.A0E
        L_0x0093:
            r14.A0I = r0
            java.lang.String r0 = "saved_cutout_sticker_picker_grid"
            r14.A0K = r0
            if (r1 == r4) goto L_0x00aa
            if (r1 == r3) goto L_0x00aa
            if (r1 == r2) goto L_0x00a6
            if (r1 == r5) goto L_0x00a6
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00a6:
            r0 = 2131428166(0x7f0b0346, float:1.8477969E38)
            goto L_0x00ad
        L_0x00aa:
            r0 = 2131440670(0x7f0b341e, float:1.850333E38)
        L_0x00ad:
            r1 = r16
            android.view.ViewStub r0 = X.JTR.A0X(r1, r0)
            r14.A08 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59811JZf.<init>(android.content.Context, android.view.View, X.0iw, com.instagram.common.session.UserSession, X.4yO, X.8MH, X.Kgm):void");
    }

    public final /* synthetic */ void Cw3() {
    }

    public final /* synthetic */ void Dfq() {
    }

    public static final void A00(C59811JZf jZf, String str) {
        KKA kka;
        C62476KgR kgR;
        jZf.A05 = str;
        C59810JZe jZe = jZf.A0G;
        ArrayList arrayList = jZe.A05;
        ArrayList A0r = AnonymousClass7TG.A0r(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C317876nz BzU = ((C317466nJ) it.next()).BzU();
            if (BzU != null) {
                String str2 = BzU.A0Z;
                if (0qQ.A0K(str2, str)) {
                    kgR = C62476KgR.PLAYING;
                } else {
                    C376649Iu r0 = (C376649Iu) C321086tY.A00(jZf.A0H).get(str2);
                    if (r0 == null || r0.A01 == null) {
                        kgR = C62476KgR.A03;
                    } else {
                        kgR = C62476KgR.LOADED;
                    }
                }
                kka = new KKA(kgR, BzU, jZf.A0N, jZf.A0O, jZf.A06);
            } else {
                kka = null;
            }
            A0r.add(kka);
        }
        List A0X = 00k.A0X(A0r);
        arrayList.clear();
        jZe.A01(A0X);
    }

    public final RecyclerView A01() {
        RecyclerView recyclerView = this.A03;
        if (recyclerView != null) {
            return recyclerView;
        }
        0qQ.A0F("recyclerView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void ACw() {
        1OC A0M2;
        1P0 r2;
        C59810JZe jZe = this.A0G;
        if (jZe.A01 && !jZe.A02) {
            jZe.A02 = true;
            if (this.A0P) {
                C321086tY r7 = this.A0H;
                String str = jZe.A00;
                C279284yO r5 = this.A0D;
                L07 l07 = new L07(this);
                C353588If r3 = r7.A01;
                r2 = new C61499KAe(2, l07, r7);
                A0M2 = LNM.A00.A00(r3.A00, r5, str).A0M();
            } else {
                A0M2 = LNM.A00.A00(this.A0C, this.A0D, jZe.A00).A0M();
                r2 = this.A0B;
            }
            A0M2.A00 = r2;
            1ES.A05(A0M2, 759527209, 2, true, false);
        }
    }

    public final Set Acf() {
        return this.A0L;
    }

    public final /* synthetic */ boolean CII() {
        return false;
    }

    public final void E0h() {
        View findViewById;
        if (this.A02 == null) {
            View inflate = this.A08.inflate();
            Set set = this.A0L;
            set.clear();
            0qQ.A0A(inflate);
            set.add(inflate);
            RecyclerView A0F2 = DbZ.A0F(inflate, R.id.sticker_picker_grid_recycler_view);
            0qQ.A0B(A0F2, 0);
            this.A03 = A0F2;
            C59810JZe jZe = this.A0G;
            jZe.setHasStableIds(true);
            A01().setAdapter(jZe);
            DbV.A1B(this.A07, A01());
            this.A02 = inflate;
            View view = null;
            SpinnerImageView spinnerImageView = (SpinnerImageView) inflate.findViewById(R.id.sticker_picker_grid_loading_spinner);
            if (spinnerImageView != null) {
                C62496Kgm kgm = this.A0F;
                if (kgm == C62496Kgm.GALLERY_TRENDING || kgm == C62496Kgm.GALLERY_SAVED) {
                    0nA.A0j(spinnerImageView, 0, 0, 0, 0);
                    LY0.A00(spinnerImageView, 19, this);
                    spinnerImageView.bringToFront();
                }
            } else {
                spinnerImageView = null;
            }
            this.A04 = spinnerImageView;
            View view2 = this.A02;
            if (!(view2 == null || (findViewById = view2.findViewById(R.id.sticker_grid_back_button)) == null)) {
                AOX.A00(findViewById, 2, this);
            }
            if (this.A0F == C62496Kgm.GALLERY_SAVED) {
                View view3 = this.A02;
                if (view3 != null) {
                    view = view3.findViewById(R.id.saved_cutout_stickers_section_empty_state);
                }
                this.A01 = view;
            }
        }
        JTQ.A0y(A01().A0D, A01(), this, this.A0I);
        C59810JZe jZe2 = this.A0G;
        jZe2.A01 = true;
        jZe2.A02 = false;
        jZe2.A00 = null;
        jZe2.A05.clear();
        ACw();
        if (this.A0P) {
            this.A09.A09((AnonymousClass2gO) this.A0M.getValue());
        }
    }

    public final void close() {
        if (this.A0P) {
            this.A0G.A05.clear();
            this.A09.A08((AnonymousClass2gO) this.A0M.getValue());
            MediaPlayer mediaPlayer = this.A00;
            if (mediaPlayer != null) {
                mediaPlayer.release();
            }
            this.A00 = null;
            this.A05 = null;
        }
        AnonymousClass7TH.A0R(this.A02);
        A01().A0b();
        A01().A0o(0);
    }

    public final String getModuleName() {
        return this.A0K;
    }

    public final boolean isScrolledToBottom() {
        return C2808154f.A04(A01());
    }

    public final boolean isScrolledToTop() {
        return C2808154f.A05(A01());
    }
}
