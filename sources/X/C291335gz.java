package X;

import com.instagram.api.schemas.MusicInfo;
import com.instagram.api.schemas.OriginalAudioPartMetadataIntf;
import com.instagram.api.schemas.OriginalAudioSubtype;
import com.instagram.api.schemas.OriginalSoundConsumptionInfoIntf;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.api.schemas.TrackData;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.music.common.model.MusicConsumptionModel;
import com.instagram.music.common.model.OriginalPartsAttributionModel;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5gz  reason: invalid class name and case insensitive filesystem */
public abstract class C291335gz {
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0044, code lost:
        if (java.lang.Integer.valueOf(r9) != null) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.instagram.music.common.config.MusicAttributionConfig A03(X.C67231sQ r19) {
        /*
            r10 = 0
            com.instagram.api.schemas.MusicInfo r1 = r19.BUr()
            r11 = 0
            if (r1 == 0) goto L_0x004b
            com.instagram.api.schemas.TrackData r0 = r1.BUk()
            if (r0 == 0) goto L_0x0049
            com.instagram.music.common.model.MusicAssetModel r6 = com.instagram.music.common.model.MusicAssetModel.A01(r0, r10)
        L_0x0012:
            com.instagram.music.common.model.MusicConsumptionModel r1 = r1.BUp()
            java.lang.Integer r0 = r1.AdU()
            if (r0 == 0) goto L_0x003a
            int r9 = r0.intValue()
        L_0x0020:
            r5 = 0
            boolean r10 = r1.getShouldMuteAudio()
            java.lang.String r8 = r1.getShouldMuteAudioReason()
            java.lang.Boolean r0 = r1.Ab6()
            if (r0 == 0) goto L_0x0033
            boolean r11 = r0.booleanValue()
        L_0x0033:
            com.instagram.music.common.config.MusicAttributionConfig r4 = new com.instagram.music.common.config.MusicAttributionConfig
            r7 = r5
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            return r4
        L_0x003a:
            if (r6 == 0) goto L_0x0047
            int r9 = r6.A05()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            if (r0 == 0) goto L_0x0047
            goto L_0x0020
        L_0x0047:
            r9 = 0
            goto L_0x0020
        L_0x0049:
            r6 = 0
            goto L_0x0012
        L_0x004b:
            com.instagram.api.schemas.OriginalSoundDataIntf r0 = r19.BZB()
            if (r0 == 0) goto L_0x00f1
            X.5Bc r13 = new X.5Bc
            r13.<init>(r0)
            java.lang.String r15 = r13.A0F
            if (r15 != 0) goto L_0x0061
            java.lang.String r1 = "ClipsMetadata"
            java.lang.String r0 = "progressive download url can't be null"
            X.0wb.A03(r1, r0)
        L_0x0061:
            r11 = 0
            java.lang.String r0 = r13.A09
            r18 = r0
            java.lang.String r16 = ""
            if (r15 != 0) goto L_0x006c
            r15 = r16
        L_0x006c:
            java.lang.String r0 = r13.A0A
            r17 = r0
            com.instagram.user.model.User r1 = r13.A05
            java.lang.String r14 = r1.getUsername()
            java.lang.String r0 = r13.A0D
            if (r0 == 0) goto L_0x007c
            r16 = r0
        L_0x007c:
            com.instagram.common.typedurl.ImageUrl r12 = r1.A0D()
            com.instagram.common.typedurl.ImageUrl r9 = r1.Bh3()
            int r8 = r13.A00
            boolean r7 = r13.A0H
            boolean r6 = r13.A0I
            java.lang.String r5 = r13.A0E
            com.instagram.api.schemas.OriginalAudioSubtype r4 = r13.A01
            java.util.ArrayList r3 = A07(r19)
            boolean r0 = r13.A0L
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            com.instagram.music.common.model.MusicAssetModel r1 = new com.instagram.music.common.model.MusicAssetModel
            r1.<init>()
            r0 = r18
            r1.A0E = r0
            r1.A0B = r11
            r1.A0H = r15
            r0 = r17
            r1.A0C = r0
            r1.A0J = r11
            r0 = r16
            r1.A0I = r0
            r1.A0D = r14
            r1.A0A = r11
            r1.A02 = r12
            r1.A03 = r9
            r1.A00 = r8
            r1.A0S = r10
            r1.A0Q = r10
            r1.A0R = r10
            r1.A0O = r10
            r8 = 1
            r1.A0U = r8
            r1.A0G = r5
            r1.A09 = r11
            r1.A0M = r7
            r1.A0N = r6
            r1.A0T = r10
            r1.A0F = r11
            r1.A01 = r4
            r1.A0K = r3
            r1.A07 = r2
            com.instagram.music.common.model.MusicAssetModel.A04(r1)
            boolean r2 = r13.A0N
            com.instagram.api.schemas.OriginalSoundConsumptionInfoIntf r0 = r13.A02
            java.lang.String r16 = r0.getShouldMuteAudioReason()
            com.instagram.music.common.config.MusicAttributionConfig r4 = new com.instagram.music.common.config.MusicAttributionConfig
            r12 = r4
            r14 = r1
            r15 = r11
            r17 = r10
            r18 = r2
            r19 = r8
            r13 = r11
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            return r4
        L_0x00f1:
            java.lang.String r1 = "either mMusicInfo or mOriginalSoundInfo must not be NULL"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C291335gz.A03(X.1sQ):com.instagram.music.common.config.MusicAttributionConfig");
    }

    public static final ArrayList A07(C67231sQ r7) {
        List<OriginalAudioPartMetadataIntf> Adj;
        ArrayList arrayList = new ArrayList();
        OriginalSoundDataIntf BZB = r7.BZB();
        if (!(BZB == null || A00(r7) == null || ((A00(r7) != OriginalAudioSubtype.A06 && A00(r7) != OriginalAudioSubtype.A04) || (Adj = BZB.Adj()) == null))) {
            for (OriginalAudioPartMetadataIntf originalAudioPartMetadataIntf : Adj) {
                arrayList.add(new OriginalPartsAttributionModel(originalAudioPartMetadataIntf.C72(), originalAudioPartMetadataIntf.getDisplayArtist(), originalAudioPartMetadataIntf.getDisplayTitle(), originalAudioPartMetadataIntf.isExplicit()));
            }
        }
        return arrayList;
    }

    public static final OriginalAudioSubtype A00(C67231sQ r0) {
        OriginalSoundDataIntf BZB = r0.BZB();
        if (BZB != null) {
            return BZB.BYy();
        }
        return null;
    }

    public static final C2606046i A01(C67231sQ r1) {
        C2606046i r12;
        MusicInfo BUr = r1.BUr();
        if (BUr != null) {
            r12 = new C2605946h(BUr);
        } else {
            OriginalSoundDataIntf BZB = r1.BZB();
            if (BZB != null) {
                r12 = new C282025Bc(BZB);
            } else {
                r12 = null;
            }
        }
        return r12;
    }

    public static final ImageUrl A02(C67231sQ r1) {
        User BEv;
        TrackData BUk;
        ImageUrl Arr;
        MusicInfo BUr = r1.BUr();
        if (BUr != null && (BUk = BUr.BUk()) != null && (Arr = BUk.Arr()) != null) {
            return Arr;
        }
        OriginalSoundDataIntf BZB = r1.BZB();
        if (BZB == null || (BEv = BZB.BEv()) == null) {
            return null;
        }
        return BEv.A0D();
    }

    public static final Long A04(C67231sQ r1) {
        C2606046i A01 = A01(r1);
        if (A01 != null) {
            return Long.valueOf(A01.AdT());
        }
        return null;
    }

    public static final String A05(C67231sQ r1) {
        User BEv;
        TrackData BUk;
        String displayArtist;
        MusicInfo BUr = r1.BUr();
        if (BUr != null && (BUk = BUr.BUk()) != null && (displayArtist = BUk.getDisplayArtist()) != null) {
            return displayArtist;
        }
        OriginalSoundDataIntf BZB = r1.BZB();
        if (BZB == null || (BEv = BZB.BEv()) == null) {
            return "";
        }
        return BEv.getUsername();
    }

    public static final String A06(C67231sQ r1) {
        TrackData BUk;
        String title;
        MusicInfo BUr = r1.BUr();
        if (BUr != null && (BUk = BUr.BUk()) != null && (title = BUk.getTitle()) != null) {
            return title;
        }
        OriginalSoundDataIntf BZB = r1.BZB();
        if (BZB != null) {
            return BZB.getOriginalAudioTitle();
        }
        0wb.A03("ClipsMetadata", "Audio track has no title");
        return "";
    }

    public static final boolean A08(C67231sQ r1) {
        OriginalSoundConsumptionInfoIntf AqB;
        MusicConsumptionModel BUp;
        Boolean CPZ;
        MusicInfo BUr = r1.BUr();
        if (BUr != null && (BUp = BUr.BUp()) != null && (CPZ = BUp.CPZ()) != null) {
            return CPZ.booleanValue();
        }
        OriginalSoundDataIntf BZB = r1.BZB();
        if (BZB == null || (AqB = BZB.AqB()) == null) {
            return false;
        }
        return AqB.isBookmarked();
    }
}
