package X;

import android.media.AudioRecord;
import android.os.Handler;
import java.util.List;

/* renamed from: X.AhF  reason: case insensitive filesystem */
public final class C40695AhF implements C74493Pvn {
    public int A00;
    public C22018Xss A01;
    public C63822L8d A02;
    public boolean A03;
    public boolean A04 = true;
    public final Handler A05;
    public final C341647nI A06;
    public final AnonymousClass7JJ A07;
    public final MTE A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final AQX A0C;

    /* JADX WARNING: type inference failed for: r8v0, types: [X.7nA, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v0, types: [X.7mq, java.lang.Object] */
    public C40695AhF(C343967r6 r10, AnonymousClass7JJ r11, MTE mte, int i, int i2, int i3) {
        this.A07 = r11;
        this.A08 = mte;
        this.A09 = i;
        this.A0A = i2;
        this.A00 = i3;
        int minBufferSize = AudioRecord.getMinBufferSize(i2, 16, 2) * 2;
        this.A0B = minBufferSize;
        AQX aqx = new AQX(mte, i2, minBufferSize);
        aqx.A03 = new C59346JFy(this, 13);
        this.A0C = aqx;
        ? obj = new Object();
        ? obj2 = new Object();
        C341647nI r2 = new C341647nI(obj2, obj, new C341627nG(AnonymousClass7TF.A0D(), r10, obj));
        Handler handler = r2.A01;
        r2.A04.A03 = new C341667nK(handler, r10, obj);
        r2.A03(new C341707nO(handler, aqx, r10, obj2, obj));
        this.A06 = r2;
        this.A05 = AnonymousClass7TF.A0D();
    }

    public final void AHp() {
        this.A02 = null;
    }

    public final void release() {
        EyI(true);
        AnonymousClass7TE.A1S(this.A06.A00, new Object[0], 5);
        this.A01 = null;
        this.A05.removeCallbacksAndMessages((Object) null);
    }

    public static final void A01(C40695AhF ahF, String str, Throwable th) {
        Exception r0;
        0KC.A0F("IGDOneCameraVoiceRecorder", str, th);
        ATP atp = new ATP(ahF, 4);
        C22018Xss xss = ahF.A01;
        if (xss != null) {
            xss.A06(atp, ahF.A05);
        }
        ahF.A02 = null;
        AnonymousClass7JJ r2 = ahF.A07;
        if (th != null) {
            r0 = new C391719tX(40000, th);
        } else {
            r0 = new C382299dT(str);
        }
        r2.DCn(r0);
        r2.Dc1(false);
    }

    public final C63822L8d AuR() {
        return this.A02;
    }

    public final void EyI(boolean z) {
        C341647nI r3 = this.A06;
        Integer num = r3.A04.A04;
        if (num != AnonymousClass05K.A0j && num != AnonymousClass05K.A0u) {
            ATP atp = new ATP(this, 4);
            C22018Xss xss = this.A01;
            if (xss != null) {
                xss.A06(atp, this.A05);
            }
            this.A03 = z;
            r3.A01();
        }
    }

    public final boolean isRecording() {
        if (this.A06.A04.A04 != AnonymousClass05K.A0u) {
            return true;
        }
        return false;
    }

    public static final void A00(C40695AhF ahF) {
        if (ahF.isRecording()) {
            AQX aqx = ahF.A0C;
            float f = aqx.A07;
            C63822L8d l8d = ahF.A02;
            if (l8d != null) {
                l8d.A03.add(Float.valueOf(f));
            }
            ahF.A07.E0F(((long) ahF.A00) - AnonymousClass7TE.A0P(aqx.A02.get()), (double) f);
            ahF.A05.postDelayed(new C40914AlM(ahF), 100);
        }
    }

    public final void Cng() {
        if (!isRecording()) {
            Integer valueOf = Integer.valueOf(this.A09);
            Integer valueOf2 = Integer.valueOf(this.A0A);
            C343467qG r3 = new C343467qG((C343967r6) null, new ADm(true, 5, valueOf2, valueOf, AnonymousClass05K.A00), valueOf2, 2, 1, 0, Integer.valueOf(this.A0B));
            C341647nI r5 = this.A06;
            List A1I = AnonymousClass7TE.A1I(r3);
            C40079AQj aQj = new C40079AQj(this, 2);
            AnonymousClass7TE.A1S(r5.A00, new Object[]{A1I, new C40081AQl(1, aQj, r5), this.A05}, 1);
        }
    }
}
