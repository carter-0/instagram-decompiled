package X;

import android.os.Bundle;
import android.os.Parcelable;
import com.instagram.direct.sharetostory.data.ChannelChallengeStickerData;
import java.io.File;

/* renamed from: X.UvH  reason: case insensitive filesystem */
public final class C16461UvH extends C15291UZw {
    public static final String __redex_internal_original_name = "ReelChannelChallengeWinnersShareFragment";
    public 28D A00;
    public ChannelChallengeStickerData A01;
    public File A02;

    public final String getModuleName() {
        return "reel_channel_challenge_winners_share_fragment";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003c, code lost:
        if (r0.intValue() <= 1) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r13, android.os.Bundle r14) {
        /*
            r12 = this;
            r0 = 0
            X.0qQ.A0B(r13, r0)
            super.onViewCreated(r13, r14)
            com.instagram.common.session.UserSession r0 = r12.A00
            X.0qQ.A06(r0)
            X.OyR r2 = X.C69869NtX.A00(r0)
            com.instagram.direct.sharetostory.data.ChannelChallengeStickerData r1 = r12.A01
            java.lang.String r0 = "stickerData"
            if (r1 != 0) goto L_0x001e
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x001e:
            java.lang.String r4 = r1.A06
            java.lang.String r5 = r1.A07
            java.lang.String r6 = r1.A0C
            java.lang.String r7 = r1.A09
            java.lang.String r8 = r1.A03
            java.lang.String r9 = r1.A0A
            int r0 = r1.A00
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.lang.String r10 = r1.A0D
            java.lang.Integer r0 = r1.A08
            if (r0 == 0) goto L_0x003e
            int r1 = r0.intValue()
            r0 = 1
            r11 = 1
            if (r1 > r0) goto L_0x003f
        L_0x003e:
            r11 = 0
        L_0x003f:
            r2.A04(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16461UvH.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final void onCreate(Bundle bundle) {
        ChannelChallengeStickerData channelChallengeStickerData;
        int A022 = AnonymousClass0fD.A02(-1440226766);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = C13991Tnr.A0A(requireArguments, AnonymousClass000.A00(466));
        this.A02 = new File(JTP.A0m(requireArguments, AnonymousClass000.A00(2429)));
        Parcelable parcelable = requireArguments.getParcelable(AnonymousClass000.A00(467));
        if (!(parcelable instanceof ChannelChallengeStickerData) || (channelChallengeStickerData = (ChannelChallengeStickerData) parcelable) == null) {
            IllegalArgumentException A0h = DbU.A0h();
            AnonymousClass0fD.A09(1652325862, A022);
            throw A0h;
        }
        this.A01 = channelChallengeStickerData;
        AnonymousClass0fD.A09(1045219347, A022);
    }
}
