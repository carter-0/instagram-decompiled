package X;

import android.media.MediaFormat;
import android.net.Uri;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;

public final class Q1E implements C13860Tig {
    public int A00 = -1;
    public int A01 = -1;
    public long A02;
    public long A03 = -1;
    public C13725Tfv A04;
    public C266724aF A05;
    public C266714aE A06 = null;
    public MediaComposition A07;
    public C266794aM A08;
    public C12337Srj A09;
    public C13860Tig A0A;
    public C13780Tgv A0B;
    public int A0C = 0;
    public long A0D = -1;
    public boolean A0E;
    public final C7334Q4k A0F;

    private boolean A01() {
        this.A01 = -1;
        if (this.A0C == -1) {
            this.A00++;
        }
        this.A06.getClass();
        MediaComposition mediaComposition = this.A07;
        mediaComposition.getClass();
        C266794aM A042 = mediaComposition.A04(this.A06, this.A00);
        this.A08 = A042;
        if (A042 == null) {
            return false;
        }
        if (A02()) {
            return true;
        }
        throw new Exception("No segments are provided in one of the tracks");
    }

    public final void ELE(C266714aE r3, int i) {
        int i2 = i;
        if (i == -1) {
            i2 = 0;
        }
        MediaComposition mediaComposition = this.A07;
        mediaComposition.getClass();
        if (mediaComposition.A04(r3, i2) != null) {
            this.A06 = r3;
            this.A0C = i;
            A00();
        }
    }

    public final void EpM(C266724aF r3) {
        C266784aL.A06(false, C273654mx.A00(60));
        throw AnonymousClass00P.createAndThrow();
    }

    public final synchronized void release() {
        Q1V.A00("MediaCompositionDemuxer", "release mAndroidMediaDemuxer=%s", this.A0A);
        C13860Tig tig = this.A0A;
        if (tig != null) {
            tig.release();
            this.A0A = null;
        }
    }

    private boolean A02() {
        C266754aI r0;
        C266784aL.A06(AnonymousClass7TF.A1V(this.A08), "Cannot move to next Segment without a valid Track");
        C13860Tig tig = this.A0A;
        if (tig != null) {
            this.A02 += tig.AzU();
            release();
        }
        this.A01++;
        C266794aM r02 = this.A08;
        r02.getClass();
        MediaComposition mediaComposition = this.A07;
        mediaComposition.getClass();
        List A082 = mediaComposition.A08(r02.A01, this.A00);
        if (A082 == null || this.A01 == A082.size()) {
            return false;
        }
        C266794aM r2 = this.A08;
        C266784aL.A06(AnonymousClass7TF.A1V(r2), "Not a valid Track");
        r2.getClass();
        C266794aM r3 = this.A08;
        C266784aL.A06(AnonymousClass7TF.A1V(r3), "No track is selected");
        r3.getClass();
        MediaComposition mediaComposition2 = this.A07;
        mediaComposition2.getClass();
        List A083 = mediaComposition2.A08(r3.A01, this.A00);
        if (A083 == null) {
            r0 = null;
        } else {
            r0 = (C266754aI) A083.get(this.A01);
        }
        r0.getClass();
        C13860Tig AL7 = this.A09.AL7(this.A04, this.A0B, this.A0F);
        URL url = r0.A05;
        if (url != null) {
            ((Q1B) AL7).A0A = url;
        } else {
            File file = r0.A04;
            file.getClass();
            AL7.ETs(file);
        }
        C266724aF r1 = this.A05;
        if (r1 == null) {
            r1 = r0.A03;
        }
        AL7.EpM(r1);
        this.A0A = AL7;
        if (AL7.CX8(this.A08.A01)) {
            this.A0A.ELE(this.A08.A01, this.A00);
            this.A03 = this.A0A.Bjy();
            return true;
        }
        Q1V.A00("MediaCompositionDemuxer", "initAndSetupMediaExtractor: MediaDemuxerException", new Object[0]);
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Track not available in the provided source file.\n Track Type: ");
        A1A.append(this.A08.A01);
        A1A.append(" \nMedia Demuxer Stats : ");
        throw new Exception(AnonymousClass7TF.A0i(BPw(), A1A));
    }

    public final boolean AAt() {
        boolean z = false;
        if (this.A08 != null) {
            z = true;
        }
        if (z) {
            C13860Tig tig = this.A0A;
            tig.getClass();
            if (!tig.AAt()) {
                if (A02()) {
                    this.A02++;
                } else if (this.A0C == -1 && A01()) {
                    return true;
                } else {
                    this.A08 = null;
                    this.A00 = -1;
                }
            }
            return true;
        }
        return false;
    }

    public final S6U BPw() {
        C13860Tig tig = this.A0A;
        if (tig != null) {
            return tig.BPw();
        }
        return new S6U();
    }

    public final long Bjy() {
        return this.A03;
    }

    public final int BpB() {
        if (this.A08 == null) {
            return -1;
        }
        C13860Tig tig = this.A0A;
        tig.getClass();
        return tig.BpB();
    }

    public final MediaFormat BpC() {
        if (this.A08 == null) {
            return null;
        }
        C13860Tig tig = this.A0A;
        tig.getClass();
        return tig.BpC();
    }

    public final long BpD() {
        if (this.A08 == null) {
            return -1;
        }
        try {
            C13860Tig tig = this.A0A;
            tig.getClass();
            long BpD = tig.BpD();
            if (BpD >= 0) {
                return BpD + this.A02;
            }
            return BpD;
        } catch (NullPointerException e) {
            Q1V.A00("MediaCompositionDemuxer", "getSampleTime Exception=%s, mCurrentSegmentIndex=%s, mSelectedTrackIndex=%s, mSelectedTrackType=%s, mCurrentMediaTrack=%s, mCurrentMediaTrackIndex=%s", e, Integer.valueOf(this.A01), Integer.valueOf(this.A0C), this.A06, this.A08, Integer.valueOf(this.A00));
            StringBuilder sb = new StringBuilder();
            sb.append(e);
            sb.append(" mCurrentSegmentIndex: ");
            sb.append(this.A01);
            sb.append(" mSelectedTrackIndex: ");
            sb.append(this.A0C);
            sb.append(" mSelectedTrackType: ");
            sb.append(this.A06);
            sb.append(" mCurrentMediaTrack: ");
            sb.append(this.A08);
            sb.append(" mCurrentMediaTrackIndex: ");
            sb.append(this.A00);
            throw new NullPointerException(sb.toString());
        }
    }

    public final boolean CX8(C266714aE r5) {
        MediaComposition mediaComposition = this.A07;
        mediaComposition.getClass();
        int i = this.A0C;
        if (i == -1) {
            HashMap A072 = mediaComposition.A07(r5);
            A072.getClass();
            return !A072.isEmpty();
        } else if (mediaComposition.A04(r5, i) == null) {
            return false;
        } else {
            return true;
        }
    }

    public final int E6i(ByteBuffer byteBuffer) {
        if (this.A08 == null) {
            return -1;
        }
        try {
            C13860Tig tig = this.A0A;
            tig.getClass();
            return tig.E6i(byteBuffer);
        } catch (NullPointerException e) {
            Q1V.A00("MediaCompositionDemuxer", "readSampleData Exception=%s, mCurrentSegmentIndex=%s, mSelectedTrackIndex=%s, mSelectedTrackType=%s, mCurrentMediaTrack=%s, mCurrentMediaTrackIndex=%s", e, Integer.valueOf(this.A01), Integer.valueOf(this.A0C), this.A06, this.A08, Integer.valueOf(this.A00));
            StringBuilder sb = new StringBuilder();
            sb.append(e);
            sb.append(" mCurrentSegmentIndex: ");
            sb.append(this.A01);
            sb.append(" mSelectedTrackIndex: ");
            sb.append(this.A0C);
            sb.append(" mSelectedTrackType: ");
            sb.append(this.A06);
            sb.append(" mCurrentMediaTrack: ");
            sb.append(this.A08);
            sb.append(" mCurrentMediaTrackIndex: ");
            sb.append(this.A00);
            throw new NullPointerException(sb.toString());
        }
    }

    public final void EKz(long j) {
        if (this.A08 == null) {
            this.A01 = -1;
            this.A0E = false;
            A00();
        }
        C13860Tig tig = this.A0A;
        if (tig != null) {
            tig.EKz(j);
        }
    }

    public final void ETq(MediaComposition mediaComposition) {
        this.A07 = mediaComposition;
    }

    public final void FM7(C266724aF r2) {
        this.A05 = r2;
        C13860Tig tig = this.A0A;
        if (tig != null) {
            tig.EpM(r2);
            tig.FM7(r2);
        }
    }

    public Q1E(C13725Tfv tfv, C12337Srj srj, C13780Tgv tgv, C7334Q4k q4k) {
        this.A04 = tfv;
        this.A09 = srj;
        this.A0B = tgv;
        this.A0F = q4k;
    }

    private void A00() {
        Q1V.A00("MediaCompositionDemuxer", "checkAndInitialize", Pxe.A1b());
        if (!this.A0E) {
            this.A02 = 0;
            try {
                C266784aL.A06(AnonymousClass7TF.A1V(this.A06), "No tracks selected");
                int i = this.A0C;
                if (i != -1) {
                    this.A00 = i;
                }
                if (A01()) {
                    this.A0E = true;
                    return;
                }
                throw new Exception();
            } catch (Qe4 | IllegalArgumentException e) {
                Q1V.A00("MediaCompositionDemuxer", "checkAndInitialize Exception=%s", e);
                throw new Exception("Cannot checkAndInitialize", e);
            }
        }
    }

    public final long AzU() {
        A00();
        long j = this.A0D;
        if (j != -1) {
            return j;
        }
        try {
            MediaComposition mediaComposition = this.A07;
            mediaComposition.getClass();
            C266714aE r1 = this.A06;
            r1.getClass();
            long A002 = Q1Z.A00(this.A04, r1, mediaComposition);
            this.A0D = A002;
            return A002;
        } catch (IOException e) {
            Q1V.A00("MediaCompositionDemuxer", "getDurationUs IOException=%s", e);
            throw new Exception("Cannot calculate duration");
        }
    }

    public final C7232Q0d BQY() {
        A00();
        C13860Tig tig = this.A0A;
        tig.getClass();
        return tig.BQY();
    }

    public final void ETs(File file) {
        C266784aL.A06(AnonymousClass7TF.A1V(file), (String) null);
        try {
            C266754aI A002 = new C266744aH(file).A00();
            C266764aJ r0 = new C266764aJ(C266714aE.VIDEO);
            r0.A02(A002);
            C266794aM r3 = new C266794aM(r0);
            C7232Q0d AU7 = this.A04.AU7(Uri.fromFile(file));
            C266824aP r2 = new C266824aP();
            r2.A04(r3);
            if (AU7.A0K) {
                C266764aJ r02 = new C266764aJ(C266714aE.AUDIO);
                r02.A02(A002);
                Pxf.A1F(r2, r02);
            }
            this.A07 = new MediaComposition(r2);
        } catch (IOException e) {
            Q1V.A00("MediaCompositionDemuxer", "setDataSource: create media composition from file failed %s", e);
            throw new Exception("create media composition from file failed", e);
        }
    }
}
