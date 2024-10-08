package X;

import android.view.View;
import android.widget.SeekBar;
import androidx.fragment.app.Fragment;
import com.instagram.reels.prompt.model.PromptStickerModel;

/* renamed from: X.3Xc  reason: invalid class name and case insensitive filesystem */
public final class C243023Xc implements C243033Xd {
    public final AnonymousClass311 A00;
    public final AnonymousClass2xS A01;
    public final AnonymousClass32S A02;

    public C243023Xc(AnonymousClass311 r2, AnonymousClass2xS r3, AnonymousClass32S r4) {
        0qQ.A0B(r4, 3);
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
    }

    public final void DWW(1Xj r8, AnonymousClass3V3 r9, AnonymousClass3W1 r10, int i) {
        1Xj r0;
        1Xj r2 = r8;
        0qQ.A0B(r8, 0);
        AnonymousClass3W1 r4 = r10;
        0qQ.A0B(r10, 1);
        if (r8.A5D()) {
            r0 = r8.A1c(r10.A03);
            if (r0 == null) {
                return;
            }
        } else {
            r0 = r8;
        }
        if (r0.BR7() == 1iA.A0a) {
            this.A01.A08(r2, r9, r4, (C262864Gh) null, i);
        }
    }

    public final void DeZ(View view, 1Xj r3, int i) {
        0qQ.A0B(r3, 0);
        this.A00.Aly().DeZ(view, r3, i);
    }

    public final C246893fP Ahs() {
        return this.A00.Ahs();
    }

    public final AnonymousClass4G1 Aow() {
        return this.A00.Aow();
    }

    public final AnonymousClass33B Aqg() {
        return this.A00.Aqg();
    }

    public final C246833fJ B5P() {
        return this.A00.B5P();
    }

    public final C253863rX BNF() {
        return this.A00.BNF();
    }

    public final AnonymousClass4JX BQG() {
        return this.A00.BQG();
    }

    public final C246453ed BQd() {
        return this.A00.BQd();
    }

    public final C246873fN BQx() {
        return this.A00.BQx();
    }

    public final C262864Gh BR1() {
        return this.A00.BR1();
    }

    public final AnonymousClass47O BR2() {
        return this.A00.BR2();
    }

    public final C246753fB BRN() {
        return this.A00.BRN();
    }

    public final C2361432p BSx() {
        return this.A00.BSx();
    }

    public final SeekBar.OnSeekBarChangeListener Br7() {
        return this.A00.Br7();
    }

    public final AnonymousClass339 CGA() {
        return this.A00.CGA();
    }

    public final void DF6(C54697HPc hPc) {
        AnonymousClass32T r2;
        AnonymousClass4WK r5;
        C249693kD r1;
        String sessionId;
        String sessionId2;
        AnonymousClass32S r6 = this.A02;
        if (hPc instanceof C54399HBq) {
            C54399HBq hBq = (C54399HBq) hPc;
            r6.A01.A06(hBq.A00, hBq.A01);
        } else if (hPc instanceof C54398HBp) {
            AnonymousClass32T r22 = r6.A01;
            C54398HBp hBp = (C54398HBp) hPc;
            boolean z = hBp.A01;
            C265804Wi r3 = hBp.A00;
            0qQ.A0B(r3, 1);
            if (z) {
                r3.A06.post(new C20225WnP(r3, r22.A04));
            }
        } else if (hPc instanceof C54403HBu) {
            C54403HBu hBu = (C54403HBu) hPc;
            r6.A01.A07(hBu.A01, hBu.A02, hBu.A04, hBu.A03, hBu.A00);
        } else if (hPc instanceof C54404HBv) {
            AnonymousClass32T r0 = r6.A01;
            C54404HBv hBv = (C54404HBv) hPc;
            C249693kD r23 = hBv.A02;
            C19471WaJ waJ = hBv.A04;
            int i = hBv.A00;
            r0.A05(hBv.A01, r23, hBv.A03, waJ, i);
        } else if (hPc instanceof C54401HBs) {
            AnonymousClass32T r4 = r6.A01;
            C54401HBs hBs = (C54401HBs) hPc;
            PromptStickerModel promptStickerModel = hBs.A02;
            1Xj r24 = hBs.A01;
            C249763kK r12 = r6.A02;
            if (r12 instanceof AnonymousClass93U) {
                sessionId2 = ((AnonymousClass93U) r12).CFD();
            } else {
                sessionId2 = r12.getSessionId();
            }
            r4.A04(hBs.A00, r24, promptStickerModel, sessionId2);
        } else if (hPc instanceof C54397HBo) {
            AnonymousClass32T r52 = r6.A01;
            Fragment fragment = r6.A00;
            C54397HBo hBo = (C54397HBo) hPc;
            PromptStickerModel promptStickerModel2 = hBo.A01;
            1Xj r25 = hBo.A00;
            C249763kK r13 = r6.A02;
            if (r13 instanceof AnonymousClass93U) {
                sessionId = ((AnonymousClass93U) r13).CFD();
            } else {
                sessionId = r13.getSessionId();
            }
            r52.A03(fragment, r25, promptStickerModel2, sessionId);
        } else if (hPc instanceof C54402HBt) {
            C54402HBt hBt = (C54402HBt) hPc;
            r6.A01.A02(hBt.A00, hBt.A01, hBt.A02, r6.A02.getSessionId());
        } else {
            if (hPc instanceof C54400HBr) {
                r2 = r6.A01;
                C54400HBr hBr = (C54400HBr) hPc;
                r5 = hBr.A00;
                r1 = hBr.A01;
            } else if (hPc instanceof C54396HBn) {
                r2 = r6.A01;
                C54396HBn hBn = (C54396HBn) hPc;
                r5 = hBn.A00;
                r1 = hBn.A01;
            } else {
                throw new RuntimeException();
            }
            String sessionId3 = r6.A02.getSessionId();
            0qQ.A0B(r5, 0);
            0qQ.A0B(r1, 1);
            0qQ.A0B(sessionId3, 2);
            C52086GEg.A0b(r2.A03, r2.A02, r1.BPf(), sessionId3, r5.CcZ());
        }
    }
}
