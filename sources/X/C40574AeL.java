package X;

import com.instagram.api.schemas.AudioFilterInfo;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.music.common.model.TrackSnippet;
import java.util.List;

/* renamed from: X.AeL  reason: case insensitive filesystem */
public final class C40574AeL implements C357888a1 {
    public final /* synthetic */ C384919i6 A00;

    public final int BPD() {
        return 15;
    }

    public final /* synthetic */ void CLM() {
    }

    public final boolean CPG() {
        return false;
    }

    public final void Cwe(AnonymousClass8IJ r5, TrackSnippet trackSnippet, boolean z) {
        List list;
        0qQ.A0B(trackSnippet, 1);
        C384919i6 r2 = this.A00;
        r2.A06 = r5;
        MusicOverlayStickerModel musicOverlayStickerModel = r2.A09;
        if (musicOverlayStickerModel != null) {
            if (r5 != null) {
                list = AnonymousClass7TE.A1I(new AudioFilterInfo(r5.A04));
            } else {
                list = null;
            }
            A9I a9i = new A9I(musicOverlayStickerModel);
            a9i.A0o = list;
            r2.A09 = a9i.A00();
        }
        MusicAssetModel musicAssetModel = r2.A08;
        if (musicAssetModel != null && r2.A0A != null) {
            if (C384919i6.A01(r2) && !AnonymousClass8IK.A0A(AnonymousClass7TE.A0l(r2.A0P))) {
                C3506785t r0 = r2.A0B;
                if (r5 != null) {
                    if (r0 != null) {
                        r0.Cot();
                    }
                } else if (r0 != null) {
                    r0.FIf();
                }
            }
            C3516289p r02 = r2.A05;
            if (r02 != null) {
                r02.DFW(r5, musicAssetModel, trackSnippet, z);
            }
        }
    }

    public final void D9r(AnonymousClass8IJ r11, TrackSnippet trackSnippet, Integer num) {
        C357918a4 r1;
        MusicAssetModel musicAssetModel;
        C3506785t r0;
        TrackSnippet trackSnippet2 = trackSnippet;
        Integer num2 = num;
        AnonymousClass7TF.A1B(trackSnippet, 1, num);
        C384919i6 r2 = this.A00;
        AnonymousClass0eM r12 = r2.A0P;
        if (AnonymousClass8IK.A04(AnonymousClass7TE.A0l(r12)) && !AnonymousClass8IK.A0A(AnonymousClass7TE.A0l(r12)) && (r0 = r2.A0B) != null) {
            r0.FIf();
        }
        C3516289p r4 = r2.A05;
        if (r4 != null && (r1 = r2.A0A) != null && (musicAssetModel = r2.A08) != null && musicAssetModel.A00 > 0 && trackSnippet.A01 >= 0) {
            r2.A0F = true;
            C349337zz r8 = null;
            if (C384919i6.A00(r2)) {
                r8 = r1.A0E();
                ClipsCreationViewModel clipsCreationViewModel = r2.A07;
                if (clipsCreationViewModel == null) {
                    0qQ.A0F("clipsCreationViewModel");
                    throw AnonymousClass00P.createAndThrow();
                }
                clipsCreationViewModel.A0Z.Epw(r8);
            } else if (C384919i6.A01(r2)) {
                AnonymousClass6KJ r22 = AnonymousClass6KJ.MUSIC_ONLY;
                MusicOverlayStickerModel BUu = r1.A0y.BUu();
                if (BUu != null) {
                    r8 = C271404in.A07((AnonymousClass9SE) null, BUu, (C40599Aen) null, r22, -1);
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            }
            r4.D9q(r11, musicAssetModel, trackSnippet2, r8, num2);
        }
    }

    public final /* synthetic */ void DSF(Integer num) {
    }

    public final /* synthetic */ void DSq() {
    }

    public final /* synthetic */ void DSr() {
    }

    public final /* synthetic */ void EuN() {
    }

    public C40574AeL(C384919i6 r1) {
        this.A00 = r1;
    }

    public final boolean ACI() {
        return this.A00.A0J;
    }

    public final MusicOverlayStickerModel BUu() {
        MusicOverlayStickerModel musicOverlayStickerModel;
        C384919i6 r1 = this.A00;
        if (C384919i6.A01(r1) && (musicOverlayStickerModel = r1.A09) != null) {
            return musicOverlayStickerModel;
        }
        throw AnonymousClass7TE.A0z("Trying to add music sticker to reels in a bad state");
    }

    public final String BXe(boolean z) {
        String str = this.A00.A0E;
        if (str != null) {
            return str;
        }
        0qQ.A0F("musicEditorNux");
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean BuA() {
        return C384919i6.A00(this.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        if (r1 != X.AnonymousClass80X.PRE_CAPTURE) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean CRK() {
        /*
            r3 = this;
            X.9i6 r2 = r3.A00
            boolean r0 = r2.A0H
            if (r0 == 0) goto L_0x0018
            X.80X r1 = r2.A0D
            if (r1 != 0) goto L_0x0014
            java.lang.String r0 = "captureState"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0014:
            X.80X r0 = X.AnonymousClass80X.PRE_CAPTURE
            if (r1 == r0) goto L_0x001d
        L_0x0018:
            boolean r1 = r2.A0I
            r0 = 0
            if (r1 == 0) goto L_0x001e
        L_0x001d:
            r0 = 1
        L_0x001e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40574AeL.CRK():boolean");
    }

    public final boolean CRW() {
        return true;
    }

    public final boolean CW3() {
        return true;
    }

    public final boolean CZL() {
        return false;
    }

    public final boolean Cai() {
        return C384919i6.A00(this.A00);
    }

    public final boolean CcC() {
        return false;
    }

    public final boolean CcD() {
        return false;
    }

    public final boolean CcE() {
        return true;
    }

    public final boolean CcY() {
        return C384919i6.A00(this.A00);
    }

    public final boolean CdS() {
        return true;
    }

    public final void Cuw() {
        C3516289p r1 = this.A00.A05;
        if (r1 != null) {
            r1.Cxc(false);
        }
    }

    public final boolean Cxa() {
        String str;
        C384919i6 r5 = this.A00;
        C357918a4 r0 = r5.A0A;
        if (r0 != null) {
            r0.A0I();
        }
        C357918a4 r02 = r5.A0A;
        if (r02 != null) {
            r02.A0F();
        }
        if (r5.A0I) {
            C3516289p r03 = r5.A05;
            if (r03 != null) {
                r03.D89();
            }
        } else {
            if (!C384919i6.A00(r5)) {
                ClipsCreationViewModel clipsCreationViewModel = r5.A07;
                if (clipsCreationViewModel == null) {
                    str = "clipsCreationViewModel";
                } else {
                    Integer num = clipsCreationViewModel.A05;
                    AnonymousClass80X r1 = r5.A0D;
                    if (r1 == null) {
                        str = "captureState";
                    } else if (r1 != AnonymousClass80X.PRE_CAPTURE && num == AnonymousClass05K.A0C) {
                        return false;
                    }
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            C3516289p r04 = r5.A05;
            if (r04 != null) {
                r04.Cxc(false);
                return true;
            }
        }
        return true;
    }

    public final void D89() {
        C3516289p r0 = this.A00.A05;
        if (r0 != null) {
            r0.D89();
        }
    }

    public final void DvW(int i) {
        C384919i6 r3 = this.A00;
        MusicOverlayStickerModel musicOverlayStickerModel = r3.A09;
        if (musicOverlayStickerModel != null) {
            Integer valueOf = Integer.valueOf(i);
            A9I a9i = new A9I(musicOverlayStickerModel);
            a9i.A0O = valueOf;
            r3.A09 = a9i.A00();
        }
    }

    public final void DvX(int i) {
        C384919i6 r3 = this.A00;
        MusicOverlayStickerModel musicOverlayStickerModel = r3.A09;
        if (musicOverlayStickerModel != null) {
            Integer valueOf = Integer.valueOf(i);
            A9I a9i = new A9I(musicOverlayStickerModel);
            a9i.A0K = valueOf;
            r3.A09 = a9i.A00();
        }
    }

    public final void ATW() {
        Cxa();
    }
}
