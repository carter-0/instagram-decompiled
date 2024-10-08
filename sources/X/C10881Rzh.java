package X;

import android.media.MediaCodecInfo;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Rzh  reason: case insensitive filesystem */
public final class C10881Rzh {
    public final ArrayList A00(C7232Q0d q0d, MediaComposition mediaComposition, C10864RzP rzP, int i, int i2, int i3, boolean z, boolean z2) {
        int i4;
        C11326SNc sNc;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        SJC sjc;
        long j;
        long j2;
        int i5 = i;
        C10864RzP rzP2 = rzP;
        ArrayList A0q = AnonymousClass7TF.A0q(rzP2, 1);
        MediaCodecInfo.CodecCapabilities A00 = SSg.A00();
        if (A00 == null || A00.getVideoCapabilities() == null) {
            i4 = Integer.MAX_VALUE;
        } else {
            i4 = Math.max(Pxg.A03(A00.getVideoCapabilities().getSupportedHeights()), Pxg.A03(A00.getVideoCapabilities().getSupportedWidths()));
        }
        C11222SFw sFw = rzP2.A0A;
        MediaComposition mediaComposition2 = mediaComposition;
        int i6 = i2;
        if (i2 > 0) {
            C7232Q0d q0d2 = q0d;
            if (q0d != null) {
                int i7 = i3;
                boolean z9 = z;
                if (z2) {
                    sNc = new C11326SNc(z9, i5, -1, i6, i7);
                } else {
                    if (i4 < i5) {
                        C10882Rzi rzi = rzP2.A01;
                        if (rzi instanceof C7969QeH) {
                            if (182.A06(0Tu.A05, ((C7969QeH) rzi).A01, 36330050320155049L)) {
                                i5 = i4;
                            }
                        }
                    }
                    sNc = new C11326SNc(z9, -1, i5, i6, i7);
                }
                C10882Rzi rzi2 = rzP2.A01;
                C11354SOn sOn = rzP2.A0H;
                if (rzi2 instanceof C7969QeH) {
                    z3 = ((C7969QeH) rzi2).A00.A08();
                } else {
                    z3 = false;
                }
                boolean z10 = rzi2 instanceof C7969QeH;
                if (z10) {
                    z4 = 182.A06(0Tu.A05, ((C7969QeH) rzi2).A01, 36316632842310177L);
                } else {
                    z4 = true;
                }
                C10882Rzi rzi3 = rzi2;
                if (z10) {
                    z5 = ((C7969QeH) rzi3).A00.A08();
                } else {
                    z5 = false;
                }
                if (z10) {
                    z6 = 182.A06(0Tu.A05, ((C7969QeH) rzi2).A01, 36330050320155049L);
                } else {
                    z6 = false;
                }
                if (z10) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                C11354SOn A02 = SSg.A02(q0d2, sOn, sNc, mediaComposition2, z3, z4, z5, z6, z7);
                if (rzP2.A0T) {
                    sjc = Pxh.A0R(A02, REA.NON_SEGMENTED_TRANSCODE);
                } else {
                    if (z10) {
                        z8 = 182.A06(0Tu.A05, ((C7969QeH) rzi2).A01, 36310297765806089L);
                    } else {
                        z8 = false;
                    }
                    boolean z11 = true;
                    boolean z12 = false;
                    if (z8) {
                        List Avn = rzP2.A00.Avn(q0d2, mediaComposition2, rzP2);
                        if (AnonymousClass7TE.A1b(Avn)) {
                            j = ((SJC) Avn.get(0)).A01;
                        } else {
                            j = -1;
                        }
                        if (AnonymousClass7TE.A1b(Avn)) {
                            j2 = ((SJC) Avn.get(0)).A00;
                        } else {
                            j2 = -1;
                        }
                        if (j != -1) {
                            sjc = new SJC(A02, REA.SEGMENTED_TRANSCODE, j, j2, false, true);
                        }
                    }
                    long j3 = rzP2.A04;
                    if (j3 < 0) {
                        j3 = 0;
                    }
                    long j4 = rzP2.A03;
                    if (j4 < 0) {
                        j4 = q0d2.A07;
                    }
                    long j5 = j4 - j3;
                    if (j5 <= 0) {
                        j5 = -1;
                    }
                    if (sFw.A09.AFx()) {
                        z12 = Dba.A1U((j5 > 30000 ? 1 : (j5 == 30000 ? 0 : -1)));
                        if (j5 <= 30000) {
                            z11 = false;
                        }
                    }
                    sjc = new SJC(A02, REA.SEGMENTED_TRANSCODE, -1, 2500000, z12, z11);
                }
                A0q.add(sjc);
            }
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        if (STq.A04(mediaComposition2, rzP2)) {
            A1C.add(Pxh.A0R((C11354SOn) null, REA.RAW));
        }
        A0q.addAll(A1C);
        return A0q;
    }
}
