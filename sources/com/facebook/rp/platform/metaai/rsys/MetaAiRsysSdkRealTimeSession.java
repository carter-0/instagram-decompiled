package com.facebook.rp.platform.metaai.rsys;

import X.0eO;
import X.0sr;
import X.19E;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass19G;
import X.AnonymousClass7TG;
import X.C262094Cc;
import X.C262204Co;
import X.C262224Cq;
import X.C73912Pln;
import X.Dba;
import X.JTS;
import X.LAB;
import X.LB4;
import X.NCY;
import X.NDK;
import com.facebook.rsys.audio.gen.AudioApi;
import com.facebook.rsys.audio.gen.EnableAudioParameters;

public final class MetaAiRsysSdkRealTimeSession {
    public final LB4 A00;
    public final NCY A01;
    public final NDK A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05;
    public final C262094Cc A06;
    public final C262224Cq A07;

    public final void A02(boolean z) {
        EnableAudioParameters enableAudioParameters = new EnableAudioParameters((String) null, 1, z);
        AudioApi audioApi = (AudioApi) JTS.A0g(this.A01);
        if (audioApi != null) {
            audioApi.enableAudio(0sr.A1L(new EnableAudioParameters[]{enableAudioParameters}));
        }
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.MDw, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.AnonymousClass4D7 r12) {
        /*
            r11 = this;
            r3 = 29
            boolean r0 = X.C66144MDw.A02(r3, r12)
            if (r0 == 0) goto L_0x0053
            r6 = r12
            X.MDw r6 = (X.C66144MDw) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0053
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r6.A02
            X.1Hj r4 = X.1Hj.A02
            int r0 = r6.A00
            r3 = 1
            if (r0 == 0) goto L_0x0031
            if (r0 != r3) goto L_0x0059
            java.lang.Object r0 = r6.A01
            com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession r0 = (com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession) r0
            X.0eS.A00(r1)
        L_0x0028:
            X.4Cq r1 = r0.A07
            r0 = 0
            X.19E.A05(r0, r1)
            X.0gF r4 = X.C60340gF.A00
        L_0x0030:
            return r4
        L_0x0031:
            X.0eS.A00(r1)
            X.NCY r2 = r11.A01
            com.facebook.rsys.callmanager.gen.CallApi r1 = r2.A00()
            java.lang.String r0 = "end_from_MetaAiRsysSdkRealTimeSession"
            r1.end(r3, r0, r3)
            java.lang.String r5 = r2.A05
            X.PnP r7 = X.C73998PnP.A00
            X.MNN r8 = X.MNN.A00
            r6.A01 = r11
            r6.A00 = r3
            r9 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r0 = X.OOX.A00(r5, r6, r7, r8, r9)
            if (r0 == r4) goto L_0x0030
            r0 = r11
            goto L_0x0028
        L_0x0053:
            X.MDw r6 = new X.MDw
            r6.<init>(r11, r12, r3)
            goto L_0x0016
        L_0x0059:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession.A00(X.4D7):java.lang.Object");
    }

    public final void A01(boolean z) {
        LAB lab = (LAB) this.A05.getValue();
        Boolean valueOf = Boolean.valueOf(z);
        if (lab.A01) {
            lab.A00 = valueOf;
            if (valueOf != null) {
                lab.A02.Epw(valueOf);
            }
        }
        Dba.A1S(this, this.A07, 0, z);
    }

    public MetaAiRsysSdkRealTimeSession(NCY ncy, NDK ndk, C262094Cc r6) {
        AnonymousClass7TG.A1Q(ndk, r6);
        this.A01 = ncy;
        this.A02 = ndk;
        this.A06 = r6;
        this.A07 = 19E.A02(new AnonymousClass19G((C262204Co) null).plus(r6));
        this.A00 = new LB4(ncy, r6);
        0eO r2 = 0eO.A04;
        this.A05 = AnonymousClass0eN.A00(r2, new C73912Pln(this, 9));
        this.A03 = AnonymousClass0eN.A00(r2, new C73912Pln(this, 7));
        this.A04 = AnonymousClass0eN.A00(r2, new C73912Pln(this, 8));
    }
}
