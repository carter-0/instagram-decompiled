package X;

import com.instagram.api.schemas.AudioFilterInfoIntf;
import com.instagram.api.schemas.AudioFilterType;
import com.instagram.api.schemas.MusicCanonicalType;
import com.instagram.api.schemas.MusicInfo;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.music.common.model.MusicConsumptionModel;
import java.util.List;

/* renamed from: X.4Kd  reason: invalid class name and case insensitive filesystem */
public abstract class C263304Kd {
    public static final AnonymousClass8IJ A02(AudioFilterType audioFilterType) {
        0qQ.A0B(audioFilterType, 0);
        switch (audioFilterType.ordinal()) {
            case 1:
                return AnonymousClass8IJ.A0A;
            case 2:
                return AnonymousClass8IJ.A0B;
            case 3:
                return AnonymousClass8IJ.A0D;
            case 4:
                return AnonymousClass8IJ.A0E;
            case 5:
                return AnonymousClass8IJ.A0F;
            case 6:
                return AnonymousClass8IJ.A0G;
            case 7:
                return AnonymousClass8IJ.A0H;
            default:
                return AnonymousClass8IJ.A0C;
        }
    }

    public static final int A00(AudioFilterType audioFilterType) {
        if (audioFilterType == null) {
            return 2131955522;
        }
        switch (audioFilterType.ordinal()) {
            case 1:
                return 2131955769;
            case 2:
                return 2131955770;
            case 3:
                return 2131955771;
            case 4:
                return 2131955772;
            case 5:
                return 2131955773;
            case 6:
                return 2131955774;
            case 7:
                return 2131955775;
            default:
                return 2131955522;
        }
    }

    public static final boolean A04(C67231sQ r4) {
        MusicCanonicalType musicCanonicalType;
        MusicInfo BUr;
        MusicConsumptionModel BUp;
        List Adc;
        if (r4 != null) {
            musicCanonicalType = r4.Adu();
        } else {
            musicCanonicalType = null;
        }
        if (musicCanonicalType != MusicCanonicalType.A04 || (BUr = r4.BUr()) == null || (BUp = BUr.BUp()) == null || (Adc = BUp.Adc()) == null || !(!Adc.isEmpty())) {
            return false;
        }
        return true;
    }

    public static final boolean A05(C67231sQ r4) {
        MusicCanonicalType musicCanonicalType;
        OriginalSoundDataIntf BZB;
        List Adc;
        if (r4 != null) {
            musicCanonicalType = r4.Adu();
        } else {
            musicCanonicalType = null;
        }
        if (musicCanonicalType != MusicCanonicalType.A05 || (BZB = r4.BZB()) == null || (Adc = BZB.Adc()) == null || !(!Adc.isEmpty())) {
            return false;
        }
        return true;
    }

    public static final AudioFilterType A01(C67231sQ r2) {
        OriginalSoundDataIntf BZB;
        List Adc;
        AudioFilterInfoIntf audioFilterInfoIntf;
        MusicInfo BUr;
        MusicConsumptionModel BUp;
        if (A04(r2)) {
            if (r2 == null || (BUr = r2.BUr()) == null || (BUp = BUr.BUp()) == null) {
                return null;
            }
            Adc = BUp.Adc();
        } else if (!A05(r2) || r2 == null || (BZB = r2.BZB()) == null) {
            return null;
        } else {
            Adc = BZB.Adc();
        }
        if (Adc == null || (audioFilterInfoIntf = (AudioFilterInfoIntf) 00k.A0J(Adc)) == null) {
            return null;
        }
        return audioFilterInfoIntf.B5w();
    }

    public static final boolean A03(C67231sQ r1) {
        if (A05(r1) || A04(r1)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0086, code lost:
        if (X.AnonymousClass8IK.A03(r4) != false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a8, code lost:
        if (X.0qQ.A0K(r0.CRq(), true) != false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        if (X.0qQ.A0K(r0.CRq(), true) != false) goto L_0x0025;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0090  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A06(X.C67231sQ r3, com.instagram.common.session.UserSession r4) {
        /*
            boolean r0 = A03(r3)
            if (r0 == 0) goto L_0x0057
            if (r3 == 0) goto L_0x00b1
            com.instagram.api.schemas.MusicCanonicalType r1 = r3.Adu()
        L_0x000c:
            com.instagram.api.schemas.MusicCanonicalType r0 = com.instagram.api.schemas.MusicCanonicalType.A05
            r2 = 1
            if (r1 != r0) goto L_0x0089
            com.instagram.api.schemas.OriginalSoundDataIntf r0 = r3.BZB()
            if (r0 == 0) goto L_0x00ac
            java.lang.Boolean r1 = r0.CRq()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x00ac
        L_0x0025:
            com.instagram.api.schemas.MusicCanonicalType r0 = r3.Adu()
            if (r0 == 0) goto L_0x0082
            int r1 = r0.ordinal()
            r0 = 2
            if (r1 == r0) goto L_0x0059
            if (r1 != r2) goto L_0x0082
            com.instagram.api.schemas.MusicInfo r0 = r3.BUr()
            if (r0 == 0) goto L_0x0082
            com.instagram.music.common.model.MusicConsumptionModel r0 = r0.BUp()
            if (r0 == 0) goto L_0x0082
            java.util.List r1 = r0.Adc()
        L_0x0044:
            if (r1 == 0) goto L_0x0082
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0064
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0064
        L_0x0050:
            boolean r1 = X.AnonymousClass8IK.A02(r4)
            r0 = 1
            if (r1 != 0) goto L_0x0058
        L_0x0057:
            r0 = 0
        L_0x0058:
            return r0
        L_0x0059:
            com.instagram.api.schemas.OriginalSoundDataIntf r0 = r3.BZB()
            if (r0 == 0) goto L_0x0082
            java.util.List r1 = r0.Adc()
            goto L_0x0044
        L_0x0064:
            java.util.Iterator r2 = r1.iterator()
        L_0x0068:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0050
            java.lang.Object r0 = r2.next()
            com.instagram.api.schemas.AudioFilterInfoIntf r0 = (com.instagram.api.schemas.AudioFilterInfoIntf) r0
            com.instagram.api.schemas.AudioFilterType r0 = r0.B5w()
            X.8IJ r0 = A02(r0)
            java.lang.Integer r1 = r0.A06
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x0068
        L_0x0082:
            boolean r0 = X.AnonymousClass8IK.A03(r4)
            if (r0 == 0) goto L_0x0057
            goto L_0x0050
        L_0x0089:
            if (r3 != 0) goto L_0x00ac
            r1 = 0
        L_0x008c:
            com.instagram.api.schemas.MusicCanonicalType r0 = com.instagram.api.schemas.MusicCanonicalType.A04
            if (r1 != r0) goto L_0x0057
            com.instagram.api.schemas.MusicInfo r0 = r3.BUr()
            if (r0 == 0) goto L_0x0057
            com.instagram.api.schemas.TrackData r0 = r0.BUk()
            if (r0 == 0) goto L_0x0057
            java.lang.Boolean r1 = r0.CRq()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0057
            goto L_0x0025
        L_0x00ac:
            com.instagram.api.schemas.MusicCanonicalType r1 = r3.Adu()
            goto L_0x008c
        L_0x00b1:
            r1 = 0
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C263304Kd.A06(X.1sQ, com.instagram.common.session.UserSession):boolean");
    }
}
