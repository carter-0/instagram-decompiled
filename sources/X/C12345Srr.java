package X;

import android.media.MediaFormat;
import android.os.FileObserver;

/* renamed from: X.Srr  reason: case insensitive filesystem */
public final class C12345Srr implements C13850TiT {
    public int A00;
    public FileObserver A01;
    public boolean A02;
    public final RC3 A03;
    public final C13850TiT A04;
    public final boolean A05;

    public final void AJ0(String str) {
        this.A04.AJ0(this.A03.getCanonicalPath());
    }

    public final String BVE() {
        return this.A04.BVE();
    }

    public final void EPD(MediaFormat mediaFormat) {
        this.A04.EPD(mediaFormat);
    }

    public final void Eev(int i) {
        this.A04.Eev(i);
    }

    public final void EqH(MediaFormat mediaFormat) {
        this.A04.EqH(mediaFormat);
    }

    public final void FNk(C13779Tgu tgu) {
        this.A04.FNk(tgu);
        this.A00++;
    }

    public final void FOI(C13779Tgu tgu) {
        this.A04.FOI(tgu);
        this.A00++;
    }

    public final boolean isStarted() {
        return this.A02;
    }

    public final void start() {
        this.A04.start();
        this.A02 = true;
        if (this.A05) {
            Q7f q7f = new Q7f(this, this.A03.getPath());
            this.A01 = q7f;
            q7f.startWatching();
        }
    }

    public final void stop() {
        this.A04.stop();
        this.A02 = false;
        RC3 rc3 = this.A03;
        rc3.A01 = true;
        synchronized (rc3) {
        }
        synchronized (rc3) {
        }
        FileObserver fileObserver = this.A01;
        if (fileObserver != null) {
            fileObserver.stopWatching();
        }
    }

    public C12345Srr(RC3 rc3, C13850TiT tiT, boolean z) {
        this.A04 = tiT;
        this.A03 = rc3;
        this.A05 = z;
    }
}
