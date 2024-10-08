package com.instagram.music.common.model;

import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C2606246k;
import X.C51970G9q;
import X.C51971G9r;
import X.C66569MWx;
import X.DHT;
import X.LVO;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.api.schemas.OriginalAudioPartMetadataIntf;
import com.instagram.api.schemas.OriginalAudioSubtype;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.api.schemas.TrackData;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.creation.capture.quickcapture.sundial.toast.model.ClipsPreloadedSettingItem;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

public final class MusicAssetModel implements Parcelable, C2606246k {
    public static final Parcelable.Creator CREATOR = LVO.A00(49);
    public int A00;
    public OriginalAudioSubtype A01 = OriginalAudioSubtype.A05;
    public ImageUrl A02;
    public ImageUrl A03;
    public ClipsPreloadedSettingItem A04;
    public MusicDataSource A05;
    public User A06;
    public Boolean A07;
    public Boolean A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public List A0J;
    public List A0K = AnonymousClass7TE.A1C();
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;

    public final int describeContents() {
        return 0;
    }

    public static MusicAssetModel A00(OriginalSoundDataIntf originalSoundDataIntf, boolean z) {
        MusicAssetModel musicAssetModel = new MusicAssetModel();
        musicAssetModel.A0E = originalSoundDataIntf.getAudioAssetId();
        musicAssetModel.A0H = originalSoundDataIntf.getProgressiveDownloadUrl();
        musicAssetModel.A0C = originalSoundDataIntf.getDashManifest();
        musicAssetModel.A0I = originalSoundDataIntf.getOriginalAudioTitle();
        musicAssetModel.A06 = originalSoundDataIntf.BEv();
        musicAssetModel.A0D = originalSoundDataIntf.BEv().getUsername();
        musicAssetModel.A02 = new SimpleImageUrl(originalSoundDataIntf.BEv().Bh3());
        musicAssetModel.A03 = new SimpleImageUrl(originalSoundDataIntf.BEv().Bh3());
        musicAssetModel.A00 = originalSoundDataIntf.AzJ().intValue();
        musicAssetModel.A0S = originalSoundDataIntf.isExplicit();
        Boolean bool = Boolean.TRUE;
        musicAssetModel.A0Q = bool.equals(originalSoundDataIntf.CRq());
        musicAssetModel.A0P = z;
        musicAssetModel.A0U = true;
        musicAssetModel.A0G = originalSoundDataIntf.getOriginalMediaId();
        musicAssetModel.A01 = originalSoundDataIntf.BYy();
        musicAssetModel.A0R = bool.equals(originalSoundDataIntf.CSQ());
        A04(musicAssetModel);
        return musicAssetModel;
    }

    public static MusicAssetModel A01(TrackData trackData, boolean z) {
        MusicAssetModel musicAssetModel = new MusicAssetModel();
        musicAssetModel.A0E = trackData.getId();
        musicAssetModel.A0B = trackData.getAudioClusterId();
        musicAssetModel.A0H = trackData.getProgressiveDownloadUrl();
        musicAssetModel.A0C = trackData.getDashManifest();
        musicAssetModel.A0J = trackData.BDX();
        musicAssetModel.A0I = trackData.getTitle();
        musicAssetModel.A0D = trackData.getDisplayArtist();
        musicAssetModel.A02 = new SimpleImageUrl(trackData.Arr());
        musicAssetModel.A03 = new SimpleImageUrl(trackData.Arq());
        musicAssetModel.A00 = trackData.AzJ().intValue();
        musicAssetModel.A0S = trackData.isExplicit();
        Boolean bool = Boolean.TRUE;
        musicAssetModel.A0Q = bool.equals(trackData.CRq());
        musicAssetModel.A0R = bool.equals(trackData.CSQ());
        musicAssetModel.A0O = trackData.BBW().booleanValue();
        musicAssetModel.A09 = null;
        musicAssetModel.A0P = z;
        musicAssetModel.A0L = trackData.getAllowsSaving();
        A04(musicAssetModel);
        return musicAssetModel;
    }

    public static MusicAssetModel A02(C66569MWx mWx) {
        Boolean bool;
        MusicAssetModel musicAssetModel = new MusicAssetModel();
        musicAssetModel.A0E = mWx.getId();
        musicAssetModel.A0B = mWx.getAudioClusterId();
        musicAssetModel.A0H = mWx.C9F();
        musicAssetModel.A0C = mWx.C94();
        musicAssetModel.A0J = mWx.BDX();
        musicAssetModel.A0I = mWx.getTitle();
        musicAssetModel.A0D = mWx.getDisplayArtist();
        musicAssetModel.A0A = mWx.getArtistId();
        musicAssetModel.A02 = mWx.As3();
        musicAssetModel.A03 = mWx.As5();
        musicAssetModel.A00 = mWx.C95();
        musicAssetModel.A0S = mWx.isExplicit();
        Boolean bool2 = Boolean.TRUE;
        musicAssetModel.A0Q = bool2.equals(Boolean.valueOf(mWx.isEligibleForAudioEffects()));
        musicAssetModel.A0O = mWx.CK6();
        musicAssetModel.A09 = mWx.Aab();
        musicAssetModel.A0P = mWx.isBookmarked();
        musicAssetModel.A0L = mWx.ABC();
        musicAssetModel.A08 = Boolean.valueOf(mWx.Cdd());
        if (AudioType.ORIGINAL_AUDIO.equals(mWx.CAc())) {
            musicAssetModel.A0U = true;
            OriginalSoundDataIntf originalSoundDataIntf = ((DHT) mWx).A02;
            musicAssetModel.A06 = originalSoundDataIntf.BEv();
            musicAssetModel.A0G = originalSoundDataIntf.getOriginalMediaId();
            musicAssetModel.A0M = AnonymousClass7TG.A1X(originalSoundDataIntf.AkO());
            musicAssetModel.A0N = AnonymousClass7TG.A1X(originalSoundDataIntf.AkP());
            musicAssetModel.A01 = originalSoundDataIntf.BYy();
            List<OriginalAudioPartMetadataIntf> Adj = originalSoundDataIntf.Adj();
            ArrayList A0m = C51970G9q.A0m(Adj);
            for (OriginalAudioPartMetadataIntf originalAudioPartMetadataIntf : Adj) {
                A0m.add(new OriginalPartsAttributionModel(originalAudioPartMetadataIntf.C72(), originalAudioPartMetadataIntf.getDisplayArtist(), originalAudioPartMetadataIntf.getDisplayTitle(), originalAudioPartMetadataIntf.isExplicit()));
            }
            musicAssetModel.A0K = A0m;
            bool = originalSoundDataIntf.CSQ();
        } else {
            bool = Boolean.valueOf(mWx.CSR());
        }
        musicAssetModel.A0R = bool2.equals(bool);
        A04(musicAssetModel);
        return musicAssetModel;
    }

    public static MusicAssetModel A03(MusicOverlayStickerModel musicOverlayStickerModel) {
        ImageUrl imageUrl;
        MusicAssetModel musicAssetModel = new MusicAssetModel();
        musicAssetModel.A0E = musicOverlayStickerModel.A0S;
        musicAssetModel.A0B = musicOverlayStickerModel.A0T;
        musicAssetModel.A0H = musicOverlayStickerModel.A0g;
        musicAssetModel.A0C = musicOverlayStickerModel.A0W;
        musicAssetModel.A0J = musicOverlayStickerModel.A0q;
        musicAssetModel.A0S = musicOverlayStickerModel.A0s;
        Boolean bool = Boolean.TRUE;
        musicAssetModel.A0Q = bool.equals(musicOverlayStickerModel.A0B);
        musicAssetModel.A0R = bool.equals(musicOverlayStickerModel.A0C);
        musicAssetModel.A0O = musicOverlayStickerModel.A08.booleanValue();
        musicAssetModel.A00 = musicOverlayStickerModel.A0N.intValue();
        musicAssetModel.A09 = musicOverlayStickerModel.A0Q;
        musicAssetModel.A0L = musicOverlayStickerModel.A0r;
        musicAssetModel.A0P = musicOverlayStickerModel.A0A.booleanValue();
        Boolean bool2 = musicOverlayStickerModel.A0E;
        if (bool2 == null || !bool2.booleanValue()) {
            musicAssetModel.A0I = musicOverlayStickerModel.A0m;
            musicAssetModel.A0D = musicOverlayStickerModel.A0Y;
            musicAssetModel.A0A = musicOverlayStickerModel.A0R;
            musicAssetModel.A02 = musicOverlayStickerModel.A04;
            musicAssetModel.A03 = musicOverlayStickerModel.A03;
            musicAssetModel.A0U = false;
        } else {
            musicAssetModel.A0I = musicOverlayStickerModel.A0m;
            musicAssetModel.A0U = true;
            musicAssetModel.A0G = musicOverlayStickerModel.A0e;
            User user = musicOverlayStickerModel.A05;
            if (user != null) {
                musicAssetModel.A0D = user.getUsername();
                musicAssetModel.A0A = user.getId();
                musicAssetModel.A02 = user.A0D();
                imageUrl = user.Bh3();
            } else {
                musicAssetModel.A0D = musicOverlayStickerModel.A0Y;
                musicAssetModel.A0A = musicOverlayStickerModel.A0R;
                musicAssetModel.A02 = musicOverlayStickerModel.A04;
                imageUrl = musicOverlayStickerModel.A03;
            }
            musicAssetModel.A03 = imageUrl;
        }
        A04(musicAssetModel);
        return musicAssetModel;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A04(com.instagram.music.common.model.MusicAssetModel r9) {
        /*
            java.lang.String r5 = r9.A0H
            java.lang.String r1 = "MusicAssetModel"
            if (r5 != 0) goto L_0x0054
            java.lang.String r0 = r9.A0C
            if (r0 != 0) goto L_0x0054
            boolean r0 = r9.A0T
            if (r0 == 0) goto L_0x0044
            java.lang.String r0 = r9.A0F
            if (r0 == 0) goto L_0x0044
            r5 = 0
            android.net.Uri r3 = X.JTQ.A09(r0)
            java.lang.String r7 = r9.A0E
            java.lang.String r8 = r9.A0A
            boolean r0 = r9.A0U
            if (r0 == 0) goto L_0x0041
            com.instagram.music.common.model.AudioType r4 = com.instagram.music.common.model.AudioType.ORIGINAL_AUDIO
        L_0x0021:
            com.instagram.music.common.model.MusicDataSource r2 = new com.instagram.music.common.model.MusicDataSource
            r6 = r5
            r2.<init>(r3, r4, r5, r6, r7, r8)
        L_0x0027:
            r9.A05 = r2
        L_0x0029:
            int r0 = r9.A00
            if (r0 > 0) goto L_0x0040
            r0 = 15000(0x3a98, float:2.102E-41)
            r9.A00 = r0
            java.lang.String r0 = r9.A0E
            java.lang.Object[] r2 = new java.lang.Object[]{r0}
            java.lang.String r0 = "MusicAssetModel has invalid mTrackDurationInMs for music asset id: %s"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            X.0wb.A03(r1, r0)
        L_0x0040:
            return
        L_0x0041:
            com.instagram.music.common.model.AudioType r4 = com.instagram.music.common.model.AudioType.MUSIC
            goto L_0x0021
        L_0x0044:
            java.lang.String r0 = r9.A0E
            java.lang.Object[] r2 = new java.lang.Object[]{r0}
            java.lang.String r0 = "Progressive Download Url and Dash Manifest cannot both be null for music asset id: %s"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            X.0wb.A03(r1, r0)
            goto L_0x0029
        L_0x0054:
            java.lang.String r6 = r9.A0C
            r3 = 0
            java.lang.String r7 = r9.A0E
            java.lang.String r8 = r9.A0A
            boolean r0 = r9.A0U
            if (r0 == 0) goto L_0x0067
            com.instagram.music.common.model.AudioType r4 = com.instagram.music.common.model.AudioType.ORIGINAL_AUDIO
        L_0x0061:
            com.instagram.music.common.model.MusicDataSource r2 = new com.instagram.music.common.model.MusicDataSource
            r2.<init>(r3, r4, r5, r6, r7, r8)
            goto L_0x0027
        L_0x0067:
            com.instagram.music.common.model.AudioType r4 = com.instagram.music.common.model.AudioType.MUSIC
            goto L_0x0061
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.music.common.model.MusicAssetModel.A04(com.instagram.music.common.model.MusicAssetModel):void");
    }

    public final int A05() {
        List list = this.A0J;
        if (list == null || list.size() <= 0) {
            return 0;
        }
        return C51971G9r.A0I(this.A0J, 0);
    }

    public final MusicDataSource BUq() {
        return this.A05;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A0E);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0H);
        parcel.writeString(this.A0C);
        parcel.writeList(this.A0J);
        parcel.writeString(this.A0I);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0A);
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A03, i);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A0S ? 1 : 0);
        parcel.writeInt(this.A0Q ? 1 : 0);
        parcel.writeInt(this.A0R ? 1 : 0);
        parcel.writeInt(this.A0O ? 1 : 0);
        parcel.writeInt(this.A0U ? 1 : 0);
        parcel.writeInt(this.A0L ? 1 : 0);
        parcel.writeString(this.A0G);
        parcel.writeInt(this.A0P ? 1 : 0);
        parcel.writeInt(this.A0T ? 1 : 0);
        parcel.writeString(this.A0F);
        parcel.writeInt(this.A0M ? 1 : 0);
        parcel.writeInt(this.A0N ? 1 : 0);
        AnonymousClass7TE.A1T(parcel, this.A01);
        parcel.writeList(this.A0K);
        parcel.writeInt(this.A07.booleanValue() ? 1 : 0);
        parcel.writeInt(this.A08.booleanValue() ? 1 : 0);
    }

    public MusicAssetModel() {
        Boolean A0u = AnonymousClass7TE.A0u();
        this.A07 = A0u;
        this.A04 = null;
        this.A08 = A0u;
    }
}
