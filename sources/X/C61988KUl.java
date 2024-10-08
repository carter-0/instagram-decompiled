package X;

import com.instagram.creation.capture.quickcapture.sundial.sfx.widget.CircularProgressImageView;

/* renamed from: X.KUl  reason: case insensitive filesystem */
public final class C61988KUl extends C65502LuQ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C61988KUl(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj;
        this.A02 = obj2;
        this.A01 = obj3;
    }

    public final void onCurrentTrackCompleted() {
        if (this.A00 == 0) {
            C71036OZy.A01((C71036OZy) this.A03, (N3C) this.A02);
        }
    }

    public final void onCurrentTrackPlayTimeUpdated(int i) {
        float f;
        AnonymousClass8ZI r1;
        switch (this.A00) {
            case 0:
                N3C n3c = (N3C) this.A02;
                int i2 = i - n3c.A01;
                int i3 = n3c.A00;
                float f2 = (((float) i2) / ((float) i3)) * 360.0f;
                C71036OZy oZy = (C71036OZy) this.A03;
                CircularProgressImageView circularProgressImageView = oZy.A06;
                if (circularProgressImageView != null) {
                    circularProgressImageView.setAngle(f2);
                }
                if (i2 >= i3) {
                    C71036OZy.A01(oZy, n3c);
                }
                AnonymousClass9XK r0 = (AnonymousClass9XK) this.A01;
                if (r0 != null) {
                    r0.EXC(i2, i);
                    return;
                }
                return;
            case 1:
                JVV jvv = (JVV) this.A03;
                f = ((float) (i - jvv.A01)) / ((float) jvv.A00);
                if (f < 1.0f) {
                    r1 = (AnonymousClass8ZI) this.A02;
                    r1.A01(AnonymousClass8ZH.STOP);
                    break;
                } else {
                    C234502xy r12 = (C234502xy) this.A01;
                    if (r12.isPlaying()) {
                        r12.pause();
                        return;
                    }
                    return;
                }
            default:
                C59830Ja5 ja5 = (C59830Ja5) this.A03;
                f = ((float) (i - ja5.A01)) / ((float) ja5.A00);
                if (f >= 1.0f) {
                    ja5.A02.EHu(false);
                    return;
                }
                r1 = (AnonymousClass8ZI) this.A01;
                if (r1 == null) {
                    return;
                }
                break;
        }
        r1.A00(f);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.creation.capture.quickcapture.sundial.sfx.widget.CircularProgressImageView, android.widget.ImageView] */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = (X.C71036OZy) r2.A03;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCurrentTrackPlaybackStarted() {
        /*
            r2 = this;
            int r0 = r2.A00
            if (r0 != 0) goto L_0x0011
            java.lang.Object r0 = r2.A03
            X.OZy r0 = (X.C71036OZy) r0
            com.instagram.creation.capture.quickcapture.sundial.sfx.widget.CircularProgressImageView r1 = r0.A06
            if (r1 == 0) goto L_0x0011
            android.graphics.drawable.Drawable r0 = r0.A02
            r1.setImageDrawable(r0)
        L_0x0011:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61988KUl.onCurrentTrackPlaybackStarted():void");
    }

    public final void onCurrentTrackPrepared(int i) {
        if (2 - this.A00 == 0) {
            C59830Ja5 ja5 = (C59830Ja5) this.A03;
            int A002 = C63348KvV.A00(i, 30000, ((C66569MWx) this.A02).BDX());
            ja5.A01 = A002;
            int i2 = i - A002;
            int i3 = 30000;
            if (30000 > i2) {
                i3 = i2;
            }
            ja5.A00 = i3;
            C234502xy r0 = ja5.A02;
            r0.seekTo(A002);
            r0.E2p();
            AnonymousClass8ZI r1 = (AnonymousClass8ZI) this.A01;
            if (r1 != null) {
                r1.A01(AnonymousClass8ZH.STOP);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [com.instagram.creation.capture.quickcapture.sundial.sfx.widget.CircularProgressImageView, android.widget.ImageView] */
    public final void onCurrentTrackStopped() {
        switch (this.A00) {
            case 0:
                C71036OZy oZy = (C71036OZy) this.A03;
                ? r1 = oZy.A06;
                if (r1 != 0) {
                    r1.setImageDrawable(oZy.A03);
                    return;
                }
                return;
            case 1:
                ((AnonymousClass8ZI) this.A02).A01(AnonymousClass8ZH.PLAY);
                return;
            default:
                ((C59830Ja5) this.A03).A02.AHY();
                AnonymousClass8ZI r12 = (AnonymousClass8ZI) this.A01;
                if (r12 != null) {
                    r12.A01(AnonymousClass8ZH.PLAY);
                    r12.A00(0.0f);
                    return;
                }
                return;
        }
    }

    public C61988KUl(C234502xy r2, JVV jvv) {
        this.A00 = 1;
        this.A03 = jvv;
        this.A01 = r2;
        this.A02 = jvv.A08;
    }
}
