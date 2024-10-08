package X;

import com.instagram.creation.capture.quickcapture.sundial.widget.progressbar.ClipsReviewProgressBar;

/* renamed from: X.Lmc  reason: case insensitive filesystem */
public final class C65058Lmc implements C355208Pb {
    public final int A00;
    public final Integer A01;
    public final /* synthetic */ K5W A02;

    public final void DSn() {
    }

    public final void Dgq() {
    }

    public C65058Lmc(K5W k5w) {
        this.A02 = k5w;
        C61009Jv9 jv9 = k5w.A09;
        if (jv9 == null) {
            0qQ.A0F("trimData");
            throw AnonymousClass00P.createAndThrow();
        }
        this.A00 = jv9.A02;
        this.A01 = Integer.valueOf(k5w.A0R);
    }

    public final Integer BPR() {
        return this.A01;
    }

    public final int BlP() {
        return this.A00;
    }

    public final AnonymousClass51M CEK() {
        String str;
        K5W k5w = this.A02;
        AnonymousClass8Q3 r1 = k5w.A0C;
        if (r1 == null) {
            str = "currentReviewMode";
        } else {
            AnonymousClass8Q2 r0 = k5w.A0G;
            if (r0 == null) {
                str = "clipsReviewTrimMode";
            } else if (r1 == r0) {
                return (AnonymousClass51M) C60295Jit.A01(k5w.A0X).A03(k5w.A04);
            } else {
                throw DbT.A0m();
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void D0a() {
        this.A02.onBackPressed();
    }

    public final void D5Y() {
        K5W k5w = this.A02;
        AnonymousClass0eM r6 = k5w.A0Y;
        AnonymousClass8A1.A01(AnonymousClass7TE.A0l(r6)).A0L(C51971G9r.A0g(r6).A04.A0L, "gallery_review");
        AnonymousClass0eM r3 = k5w.A0X;
        AnonymousClass51M r5 = (AnonymousClass51M) C60295Jit.A01(r3).A03(k5w.A04);
        int i = k5w.A01;
        int i2 = k5w.A00;
        if (i < i2) {
            C51971G9r.A0g(r6).A0m((double) JTP.A08(r5));
            AnonymousClass8Q2 r0 = k5w.A0G;
            if (r0 == null) {
                0qQ.A0F("clipsReviewTrimMode");
                throw AnonymousClass00P.createAndThrow();
            } else if (r0.A02.intValue() == 4) {
                k5w.A05();
                AnonymousClass8IT r62 = (AnonymousClass8IT) k5w.A0W.getValue();
                AnonymousClass51R r7 = r5.A0F;
                AnonymousClass7TE.A1Z(new MGI(r62, r7, (AnonymousClass4D7) null, i, i2), JTP.A0J(r62, r7, 0));
                AnonymousClass831 r02 = (AnonymousClass831) LSY.A04(C60295Jit.A01(r3)).A00;
                0qQ.A0B(r02, 0);
                ((C60295Jit) r3.getValue()).A00 = r02;
            }
        } else {
            AnonymousClass8A1.A01(AnonymousClass7TE.A0l(r6)).A0A("Video is too short");
            C59689JTv.A07(k5w.getContext(), 2131975540);
        }
    }

    public final void DFU() {
        K5W k5w = this.A02;
        if (k5w.A0E != null) {
            if (k5w.A0O) {
                k5w.A0X.getValue();
            }
            C66567MWv mWv = k5w.A0E;
            if (mWv != null) {
                mWv.start();
            }
            k5w.A0N = false;
            k5w.A0O = false;
        }
    }

    public final void DFV() {
        K5W k5w = this.A02;
        k5w.A0N = true;
        C66567MWv mWv = k5w.A0E;
        if (mWv != null) {
            mWv.pause();
        }
    }

    public final void DiT(int i) {
        K5W k5w = this.A02;
        C66567MWv mWv = k5w.A0E;
        if (mWv == null) {
            A00(k5w, "Failure user trimming video: startTimeInMs=", AnonymousClass7TE.A1A(), i);
        } else {
            mWv.seekTo(i);
        }
    }

    public final void DuD(int i) {
        K5W k5w = this.A02;
        if (k5w.A0E == null) {
            A00(k5w, "Failure user trimming video: endTimeInMs=", AnonymousClass7TE.A1A(), i);
            return;
        }
        k5w.A0O = false;
        K5W.A02((AnonymousClass8Q2) null, k5w, (C349307zv) null, (Integer) null, (Integer) null, Integer.valueOf(i), (Integer) null);
        ClipsReviewProgressBar clipsReviewProgressBar = k5w.A0I;
        if (clipsReviewProgressBar == null) {
            0qQ.A0F("reviewProgressBar");
            throw AnonymousClass00P.createAndThrow();
        }
        clipsReviewProgressBar.A01(k5w.A04, k5w.A00 - k5w.A01);
        C66567MWv mWv = k5w.A0E;
        if (mWv != null) {
            mWv.seekTo(i);
        }
    }

    public final void DuF(int i) {
        K5W k5w = this.A02;
        if (k5w.A0E == null) {
            A00(k5w, "Failure user trimming video: startTimeInMs=", AnonymousClass7TE.A1A(), i);
            return;
        }
        k5w.A0O = true;
        K5W.A02((AnonymousClass8Q2) null, k5w, (C349307zv) null, (Integer) null, Integer.valueOf(i), (Integer) null, (Integer) null);
        ClipsReviewProgressBar clipsReviewProgressBar = k5w.A0I;
        if (clipsReviewProgressBar == null) {
            0qQ.A0F("reviewProgressBar");
            throw AnonymousClass00P.createAndThrow();
        }
        clipsReviewProgressBar.A01(k5w.A04, k5w.A00 - k5w.A01);
        C66567MWv mWv = k5w.A0E;
        if (mWv != null) {
            mWv.seekTo(i);
        }
    }

    public static void A00(K5W k5w, String str, StringBuilder sb, int i) {
        sb.append(str);
        sb.append(i);
        sb.append(" mSurface=");
        sb.append(k5w.A05);
        C64169LRs.A02(k5w.requireContext(), AnonymousClass05K.A0Y, sb.toString(), 2131974093);
    }
}
