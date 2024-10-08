package X;

import android.media.MediaFormat;
import androidx.media3.container.Mp4OrientationData;
import java.io.FileOutputStream;

/* renamed from: X.Srs  reason: case insensitive filesystem */
public final class C12346Srs implements C13850TiT {
    public MediaFormat A00;
    public MediaFormat A01;
    public TZe A02;
    public TZe A03;
    public C13793ThA A04;
    public Integer A05;
    public String A06;
    public final C10686RwQ A07;

    public final String BVE() {
        return "Media3";
    }

    private final void A00() {
        C11754Sfp sfp;
        if (this.A04 != null) {
            MediaFormat mediaFormat = this.A01;
            C11754Sfp sfp2 = null;
            if (mediaFormat != null) {
                SJM A012 = C11051S7w.A01(mediaFormat);
                C13793ThA thA = this.A04;
                if (thA != null) {
                    sfp = thA.AAY(A012);
                } else {
                    sfp = null;
                }
                this.A03 = sfp;
            }
            MediaFormat mediaFormat2 = this.A00;
            if (mediaFormat2 != null) {
                SJM A013 = C11051S7w.A01(mediaFormat2);
                C13793ThA thA2 = this.A04;
                if (thA2 != null) {
                    sfp2 = thA2.AAY(A013);
                }
                this.A02 = sfp2;
            }
            Integer num = this.A05;
            if (num != null) {
                int intValue = num.intValue();
                C13793ThA thA3 = this.A04;
                if (thA3 != null) {
                    thA3.A9N(new Mp4OrientationData(intValue));
                }
            }
        }
    }

    public final void AJ0(String str) {
        this.A06 = str;
    }

    public final void EPD(MediaFormat mediaFormat) {
        this.A00 = mediaFormat;
        A00();
    }

    public final void EqH(MediaFormat mediaFormat) {
        this.A01 = mediaFormat;
        A00();
    }

    public final void FNk(C13779Tgu tgu) {
        C13793ThA thA;
        TZe tZe = this.A02;
        if (tZe != null && (thA = this.A04) != null) {
            thA.FO6(tgu.AiO(), tZe, tgu.AjB());
        }
    }

    public final void FOI(C13779Tgu tgu) {
        C13793ThA thA;
        TZe tZe = this.A03;
        if (tZe != null && tgu != null && (thA = this.A04) != null) {
            thA.FO6(tgu.AiO(), tZe, tgu.AjB());
        }
    }

    public final boolean isStarted() {
        return AnonymousClass7TF.A1V(this.A04);
    }

    public final void start() {
        C13793ThA sfr;
        FileOutputStream fileOutputStream = new FileOutputStream(this.A06);
        if (this.A07.A03) {
            sfr = new C11755Sfq(fileOutputStream);
        } else {
            C10517RtW rtW = new C10517RtW();
            sfr = new C11756Sfr(rtW, new STK(C13870Tir.A00, new C10921S0y(rtW, 0), fileOutputStream));
        }
        this.A04 = sfr;
        A00();
    }

    public final void stop() {
        C13793ThA thA = this.A04;
        if (thA != null) {
            thA.close();
        }
        this.A04 = null;
    }

    public C12346Srs(C10686RwQ rwQ) {
        this.A07 = rwQ;
    }

    public final void Eev(int i) {
        this.A05 = Integer.valueOf(i);
        A00();
    }
}
