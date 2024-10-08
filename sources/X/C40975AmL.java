package X;

import com.facebook.videolite.transcoder.base.composition.MediaEffect;

/* renamed from: X.AmL  reason: case insensitive filesystem */
public final class C40975AmL implements Runnable {
    public final /* synthetic */ MediaEffect A00;
    public final /* synthetic */ AnonymousClass9Tu A01;

    public C40975AmL(MediaEffect mediaEffect, AnonymousClass9Tu r2) {
        this.A01 = r2;
        this.A00 = mediaEffect;
    }

    public final void run() {
        MediaEffect mediaEffect = this.A00;
        if (mediaEffect instanceof C40191AVf) {
            C40191AVf aVf = (C40191AVf) mediaEffect;
            if (!(aVf.A01 instanceof C382379db)) {
                C344737sL BQ9 = this.A01.A0G.BQ9();
                if (BQ9 instanceof B3U) {
                    ((B3U) BQ9).EDX(aVf);
                }
            }
        }
    }
}
