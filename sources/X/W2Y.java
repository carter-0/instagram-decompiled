package X;

import com.instagram.api.schemas.AudioFilterInfo;
import com.instagram.api.schemas.AudioFilterInfoIntf;
import com.instagram.api.schemas.AudioFilterType;
import com.instagram.api.schemas.AudioMetadataLabels;
import com.instagram.api.schemas.AudioMutingInfo;
import com.instagram.api.schemas.MusicMuteAudioReason;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;
import org.webrtc.EglBase14Impl;

public abstract class W2Y {
    public static final MusicOverlayStickerModel A01(ULm uLm) {
        ArrayList<AudioFilterInfoIntf> arrayList;
        SimpleImageUrl simpleImageUrl;
        ArrayList arrayList2;
        User user;
        AudioMetadataLabels audioMetadataLabels;
        AudioFilterType audioFilterType;
        ULm uLm2 = uLm;
        0qQ.A0B(uLm2, 0);
        boolean z = uLm2.A0p;
        ImageUrl simpleImageUrl2 = new SimpleImageUrl(uLm2.A0S);
        String str = uLm2.A0Z;
        boolean z2 = uLm2.A0q;
        String str2 = uLm2.A0d;
        boolean z3 = uLm2.A0r;
        String str3 = uLm2.A0h;
        C51972G9s.A1C(str, str2);
        0qQ.A0B(str3, 6);
        ArrayList arrayList3 = null;
        new 1E9(new 1hu((UserSession) null), 6, false);
        AudioMutingInfo audioMutingInfo = null;
        MusicProduct musicProduct = null;
        AudioMutingInfo audioMutingInfo2 = null;
        MusicMuteAudioReason musicMuteAudioReason = null;
        MusicOverlayStickerModel musicOverlayStickerModel = new MusicOverlayStickerModel((AudioMutingInfo) null, (MusicMuteAudioReason) null, (MusicProduct) null, (ImageUrl) null, simpleImageUrl2, (User) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, str, (String) null, (String) null, (String) null, str2, (String) null, (String) null, (String) null, str3, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, z, z2, z3);
        boolean z4 = musicOverlayStickerModel.A0r;
        ImageUrl imageUrl = musicOverlayStickerModel.A04;
        String str4 = musicOverlayStickerModel.A0b;
        Boolean bool = musicOverlayStickerModel.A0C;
        boolean z5 = musicOverlayStickerModel.A0s;
        String str5 = musicOverlayStickerModel.A0f;
        boolean z6 = musicOverlayStickerModel.A0t;
        String str6 = musicOverlayStickerModel.A0j;
        Boolean bool2 = musicOverlayStickerModel.A0I;
        String str7 = uLm2.A0M;
        Boolean bool3 = uLm2.A04;
        String str8 = uLm2.A0N;
        String str9 = uLm2.A0O;
        Integer num = uLm2.A0G;
        Integer num2 = uLm2.A0H;
        String str10 = uLm2.A0P;
        List<C16578UxX> list = uLm2.A0m;
        MusicMuteAudioReason musicMuteAudioReason2 = null;
        if (list != null) {
            arrayList = AnonymousClass7TF.A0p(list);
            for (C16578UxX ordinal : list) {
                switch (ordinal.ordinal()) {
                    case 0:
                        audioFilterType = AudioFilterType.CRUNCHY;
                        break;
                    case 1:
                        audioFilterType = AudioFilterType.DREAMY;
                        break;
                    case 2:
                        audioFilterType = AudioFilterType.RADIO;
                        break;
                    case 3:
                        audioFilterType = AudioFilterType.SLOWED;
                        break;
                    case 4:
                        audioFilterType = AudioFilterType.SPED_UP;
                        break;
                    case 5:
                        audioFilterType = AudioFilterType.VINYL;
                        break;
                    default:
                        audioFilterType = AudioFilterType.UNRECOGNIZED;
                        break;
                }
                arrayList.add(new AudioFilterInfo(audioFilterType));
            }
        } else {
            arrayList = null;
        }
        C61007Jv6 jv6 = uLm2.A00;
        if (jv6 != null) {
            boolean z7 = jv6.A02;
            boolean z8 = jv6.A03;
            RFN rfn = (RFN) jv6.A00;
            if (rfn != null) {
                musicMuteAudioReason = A00(rfn);
            }
            audioMutingInfo2 = new AudioMutingInfo(musicMuteAudioReason, jv6.A01, z7, z8, jv6.A04);
        }
        String str11 = uLm2.A0Q;
        String str12 = uLm2.A0R;
        if (str12 != null) {
            simpleImageUrl = new SimpleImageUrl(str12);
        } else {
            simpleImageUrl = null;
        }
        String str13 = uLm2.A0T;
        String str14 = uLm2.A0U;
        String str15 = uLm2.A0V;
        Integer num3 = uLm2.A0I;
        String str16 = uLm2.A0W;
        List<C16563UxF> list2 = uLm2.A0n;
        if (list2 != null) {
            arrayList2 = AnonymousClass7TF.A0p(list2);
            for (C16563UxF ordinal2 : list2) {
                int ordinal3 = ordinal2.ordinal();
                if (ordinal3 == 1) {
                    audioMetadataLabels = AudioMetadataLabels.PRE_RELEASE;
                } else if (ordinal3 == 2) {
                    audioMetadataLabels = AudioMetadataLabels.NEW_RELEASE;
                } else if (ordinal3 != 3) {
                    audioMetadataLabels = AudioMetadataLabels.UNRECOGNIZED;
                } else {
                    audioMetadataLabels = AudioMetadataLabels.SPOTIFY_PLAYLIST_AS_SPOTLIGHT_BANNER_SONG;
                }
                arrayList2.add(audioMetadataLabels);
            }
        } else {
            arrayList2 = null;
        }
        Integer num4 = uLm2.A0J;
        String str17 = uLm2.A0X;
        String str18 = uLm2.A0Y;
        Boolean bool4 = uLm2.A05;
        Boolean bool5 = uLm2.A06;
        List list3 = uLm2.A0o;
        C15036UKp uKp = uLm2.A01;
        if (uKp != null) {
            user = C18230Vnu.A01(uKp);
        } else {
            user = null;
        }
        String str19 = uLm2.A0a;
        Boolean bool6 = uLm2.A07;
        Boolean bool7 = uLm2.A08;
        Boolean bool8 = uLm2.A0A;
        Boolean bool9 = uLm2.A0B;
        Boolean bool10 = uLm2.A0C;
        String str20 = uLm2.A0b;
        C16589Uxj uxj = uLm2.A03;
        if (uxj != null) {
            switch (uxj.ordinal()) {
                case 0:
                    musicProduct = MusicProduct.BOOST_AUDIO_BROWSER;
                    break;
                case 1:
                    musicProduct = MusicProduct.CLIPS_CAMERA_FORMAT;
                    break;
                case 2:
                    musicProduct = MusicProduct.CLIPS_CAMERA_FORMAT_V2;
                    break;
                case 3:
                    musicProduct = MusicProduct.CLIPS_EDIT_METADATA;
                    break;
                case 4:
                    musicProduct = MusicProduct.IG_GLOBAL_SEARCH;
                    break;
                case 5:
                    musicProduct = MusicProduct.MEMORY_RESHARE;
                    break;
                case 6:
                    musicProduct = MusicProduct.MENTION_RESHARE;
                    break;
                case 7:
                    musicProduct = MusicProduct.MUSIC_AR_EFFECT;
                    break;
                case 8:
                    musicProduct = MusicProduct.MUSIC_AR_EFFECT_DEMO;
                    break;
                case 9:
                    musicProduct = MusicProduct.MUSIC_CAMERA_FORMAT;
                    break;
                case 10:
                    musicProduct = MusicProduct.MUSIC_IN_FEED;
                    break;
                case 11:
                    musicProduct = MusicProduct.MUSIC_NOTES;
                    break;
                case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                    musicProduct = MusicProduct.MUSIC_ON_PROFILE;
                    break;
                case 13:
                    musicProduct = MusicProduct.POST_CAPTURE_STICKER;
                    break;
                case 14:
                    musicProduct = MusicProduct.QUESTION_RESPONSE;
                    break;
                case 15:
                    musicProduct = MusicProduct.QUESTION_RESPONSE_RESHARE;
                    break;
                case 16:
                    musicProduct = MusicProduct.STATUS;
                    break;
                case 17:
                    musicProduct = MusicProduct.UNSET;
                    break;
                default:
                    musicProduct = MusicProduct.UNRECOGNIZED;
                    break;
            }
        }
        String str21 = uLm2.A0c;
        Integer num5 = uLm2.A0K;
        Boolean bool11 = uLm2.A0D;
        String str22 = uLm2.A0e;
        String str23 = uLm2.A0f;
        String str24 = uLm2.A0g;
        Boolean bool12 = uLm2.A0E;
        RFN rfn2 = uLm2.A02;
        if (rfn2 != null) {
            musicMuteAudioReason2 = A00(rfn2);
        }
        Boolean bool13 = uLm2.A0F;
        String str25 = uLm2.A0i;
        String str26 = uLm2.A0j;
        String str27 = uLm2.A0k;
        Integer num6 = uLm2.A0L;
        String str28 = uLm2.A0l;
        new 1E9(new 1hu((UserSession) null), 6, false);
        if (arrayList != null) {
            arrayList3 = AnonymousClass7TF.A0p(arrayList);
            for (AudioFilterInfoIntf F0c : arrayList) {
                arrayList3.add(F0c.F0c());
            }
        }
        if (audioMutingInfo2 != null) {
            audioMutingInfo = audioMutingInfo2.F0f();
        }
        return new MusicOverlayStickerModel(audioMutingInfo, musicMuteAudioReason2, musicProduct, simpleImageUrl, imageUrl, user, bool3, false, bool4, bool5, bool6, bool7, bool, bool8, bool9, bool10, bool11, bool12, bool2, bool13, num, num2, num3, num4, num5, num6, str7, str8, str9, str10, str11, str13, str14, str15, str16, str17, str18, str4, str19, str20, str21, str5, str22, str23, str24, str6, str25, str26, str27, str28, arrayList3, arrayList2, list3, z4, z5, z6);
    }

    public static final AnonymousClass6KJ A02(C16585Uxf uxf) {
        switch (DbU.A02(uxf, 0)) {
            case 0:
                return AnonymousClass6KJ.MUSIC_OVERLAY_SIMPLE;
            case 1:
                return AnonymousClass6KJ.MUSIC_OVERLAY_ALBUM_ART;
            case 2:
                return AnonymousClass6KJ.LYRICS_KARAOKE;
            case 3:
                return AnonymousClass6KJ.LYRICS_CUBE_REVEAL;
            case 4:
                return AnonymousClass6KJ.LYRICS_DYNAMIC_REVEAL;
            case 5:
                return AnonymousClass6KJ.LYRICS_TYPEWRITER;
            case 6:
                return AnonymousClass6KJ.LYRICS_LINE_BY_LINE_CUBE_REVEAL;
            case 7:
                return AnonymousClass6KJ.MUSIC_ONLY;
            case 8:
                return AnonymousClass6KJ.HIDDEN;
            default:
                return AnonymousClass6KJ.UNKNOWN;
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.ULm] */
    public static final ULm A04(MusicOverlayStickerModel musicOverlayStickerModel) {
        ArrayList arrayList;
        C61007Jv6 jv6;
        String str;
        ArrayList arrayList2;
        C15036UKp uKp;
        C16563UxF uxF;
        RFN rfn;
        C16578UxX uxX;
        C16589Uxj uxj = null;
        RFN rfn2 = null;
        ? obj = new Object();
        obj.A0M = null;
        obj.A04 = null;
        obj.A0p = false;
        obj.A0N = null;
        obj.A0O = null;
        obj.A0G = null;
        obj.A0H = null;
        obj.A0P = null;
        obj.A0m = null;
        obj.A00 = null;
        ULm.A01(obj);
        obj.A0I = null;
        obj.A0W = null;
        obj.A0n = null;
        obj.A0J = null;
        obj.A0X = null;
        obj.A0Y = null;
        obj.A05 = null;
        obj.A06 = null;
        obj.A0o = null;
        obj.A0Z = "";
        obj.A01 = null;
        obj.A0a = null;
        ULm.A00(obj);
        obj.A0b = null;
        obj.A03 = null;
        obj.A0c = null;
        obj.A0K = null;
        obj.A0D = null;
        obj.A0d = "";
        obj.A0e = null;
        obj.A0f = null;
        obj.A0g = null;
        obj.A0E = null;
        obj.A0r = false;
        obj.A0h = "";
        obj.A02 = null;
        obj.A0F = null;
        obj.A0i = null;
        obj.A0j = null;
        obj.A0k = null;
        obj.A0L = null;
        obj.A0l = null;
        obj.A0M = musicOverlayStickerModel.A0Q;
        obj.A04 = musicOverlayStickerModel.A06;
        obj.A0p = musicOverlayStickerModel.A0r;
        obj.A0N = musicOverlayStickerModel.A0R;
        obj.A0O = musicOverlayStickerModel.A0S;
        obj.A0G = musicOverlayStickerModel.A0K;
        obj.A0H = musicOverlayStickerModel.A0L;
        obj.A0P = musicOverlayStickerModel.A0T;
        List<AudioFilterInfo> list = musicOverlayStickerModel.A0o;
        if (list != null) {
            arrayList = AnonymousClass7TF.A0p(list);
            for (AudioFilterInfo audioFilterInfo : list) {
                switch (audioFilterInfo.A00.ordinal()) {
                    case 1:
                        uxX = C16578UxX.CRUNCHY;
                        break;
                    case 2:
                        uxX = C16578UxX.DREAMY;
                        break;
                    case 3:
                        uxX = C16578UxX.RADIO;
                        break;
                    case 4:
                        uxX = C16578UxX.SLOWED;
                        break;
                    case 5:
                        uxX = C16578UxX.SPED_UP;
                        break;
                    case 7:
                        uxX = C16578UxX.VINYL;
                        break;
                    default:
                        uxX = C16578UxX.UNKNOWN;
                        break;
                }
                arrayList.add(uxX);
            }
        } else {
            arrayList = null;
        }
        obj.A0m = arrayList;
        AudioMutingInfo audioMutingInfo = musicOverlayStickerModel.A00;
        if (audioMutingInfo != null) {
            jv6 = new C61007Jv6();
            jv6.A02 = audioMutingInfo.A02;
            jv6.A03 = audioMutingInfo.A03;
            MusicMuteAudioReason musicMuteAudioReason = audioMutingInfo.A00;
            if (musicMuteAudioReason != null) {
                rfn = A03(musicMuteAudioReason);
            } else {
                rfn = null;
            }
            jv6.A00 = rfn;
            String str2 = audioMutingInfo.A01;
            0qQ.A0B(str2, 0);
            jv6.A01 = str2;
            jv6.A04 = audioMutingInfo.A04;
        } else {
            jv6 = null;
        }
        obj.A00 = jv6;
        obj.A0Q = musicOverlayStickerModel.A0U;
        ImageUrl imageUrl = musicOverlayStickerModel.A03;
        if (imageUrl != null) {
            str = imageUrl.getUrl();
        } else {
            str = null;
        }
        obj.A0R = str;
        String url = musicOverlayStickerModel.A04.getUrl();
        0qQ.A0B(url, 0);
        obj.A0S = url;
        obj.A0T = musicOverlayStickerModel.A0V;
        obj.A0U = musicOverlayStickerModel.A0W;
        obj.A0V = musicOverlayStickerModel.A0X;
        obj.A0I = musicOverlayStickerModel.A0M;
        obj.A0W = musicOverlayStickerModel.A0Y;
        List<AudioMetadataLabels> list2 = musicOverlayStickerModel.A0p;
        if (list2 != null) {
            arrayList2 = AnonymousClass7TF.A0p(list2);
            for (AudioMetadataLabels ordinal : list2) {
                int ordinal2 = ordinal.ordinal();
                if (ordinal2 == 2) {
                    uxF = C16563UxF.PRE_RELEASE;
                } else if (ordinal2 == 1) {
                    uxF = C16563UxF.NEW_RELEASE;
                } else if (ordinal2 != 3) {
                    uxF = C16563UxF.UNKNOWN;
                } else {
                    uxF = C16563UxF.SPOTIFY_PLAYLIST_AS_SPOTLIGHT_BANNER_SONG;
                }
                arrayList2.add(uxF);
            }
        } else {
            arrayList2 = null;
        }
        obj.A0n = arrayList2;
        obj.A0J = musicOverlayStickerModel.A0N;
        obj.A0X = musicOverlayStickerModel.A0Z;
        obj.A0Y = musicOverlayStickerModel.A0a;
        obj.A05 = musicOverlayStickerModel.A08;
        obj.A06 = musicOverlayStickerModel.A09;
        obj.A0o = musicOverlayStickerModel.A0q;
        String str3 = musicOverlayStickerModel.A0b;
        0qQ.A0B(str3, 0);
        obj.A0Z = str3;
        User user = musicOverlayStickerModel.A05;
        if (user != null) {
            uKp = C18230Vnu.A00(user);
        } else {
            uKp = null;
        }
        obj.A01 = uKp;
        obj.A0a = musicOverlayStickerModel.A0c;
        obj.A07 = musicOverlayStickerModel.A0A;
        obj.A08 = musicOverlayStickerModel.A0B;
        obj.A0q = musicOverlayStickerModel.A0s;
        obj.A0A = musicOverlayStickerModel.A0D;
        obj.A0B = musicOverlayStickerModel.A0E;
        obj.A0C = musicOverlayStickerModel.A0F;
        obj.A0b = musicOverlayStickerModel.A0d;
        MusicProduct musicProduct = musicOverlayStickerModel.A02;
        if (musicProduct != null) {
            switch (musicProduct.ordinal()) {
                case 2:
                    uxj = C16589Uxj.AUDIO_GLOBAL_SEARCH;
                    break;
                case 3:
                    uxj = C16589Uxj.BOOST_AUDIO_BROWSER;
                    break;
                case 4:
                    uxj = C16589Uxj.CLIPS_CAMERA_FORMAT;
                    break;
                case 5:
                    uxj = C16589Uxj.CLIPS_CAMERA_FORMAT_V2;
                    break;
                case 6:
                    uxj = C16589Uxj.CLIPS_EDIT_METADATA;
                    break;
                case 7:
                    uxj = C16589Uxj.MEMORY_RESHARE;
                    break;
                case 8:
                    uxj = C16589Uxj.MENTION_RESHARE;
                    break;
                case 9:
                    uxj = C16589Uxj.MUSIC_AR_EFFECT;
                    break;
                case 10:
                    uxj = C16589Uxj.MUSIC_AR_EFFECT_DEMO;
                    break;
                case 11:
                    uxj = C16589Uxj.MUSIC_CAMERA_FORMAT;
                    break;
                case 13:
                    uxj = C16589Uxj.MUSIC_IN_FEED;
                    break;
                case 14:
                    uxj = C16589Uxj.MUSIC_NOTES;
                    break;
                case 15:
                    uxj = C16589Uxj.MUSIC_ON_PROFILE;
                    break;
                case EglBase14Impl.EGLExt_SDK_VERSION /*18*/:
                    uxj = C16589Uxj.POST_CAPTURE_STICKER;
                    break;
                case 19:
                    uxj = C16589Uxj.QUESTION_RESPONSE;
                    break;
                case 20:
                    uxj = C16589Uxj.QUESTION_RESPONSE_RESHARE;
                    break;
                case 21:
                    uxj = C16589Uxj.STATUS;
                    break;
                case 22:
                    uxj = C16589Uxj.UNSET;
                    break;
                default:
                    uxj = C16589Uxj.UNKNOWN;
                    break;
            }
        }
        obj.A03 = uxj;
        obj.A0c = musicOverlayStickerModel.A0e;
        obj.A0K = musicOverlayStickerModel.A0O;
        obj.A0D = musicOverlayStickerModel.A0G;
        String str4 = musicOverlayStickerModel.A0f;
        0qQ.A0B(str4, 0);
        obj.A0d = str4;
        obj.A0e = musicOverlayStickerModel.A0g;
        obj.A0f = musicOverlayStickerModel.A0h;
        obj.A0g = musicOverlayStickerModel.A0i;
        obj.A0E = musicOverlayStickerModel.A0H;
        obj.A0r = musicOverlayStickerModel.A0t;
        String str5 = musicOverlayStickerModel.A0j;
        0qQ.A0B(str5, 0);
        obj.A0h = str5;
        MusicMuteAudioReason musicMuteAudioReason2 = musicOverlayStickerModel.A01;
        if (musicMuteAudioReason2 != null) {
            rfn2 = A03(musicMuteAudioReason2);
        }
        obj.A02 = rfn2;
        obj.A0F = musicOverlayStickerModel.A0J;
        obj.A0i = musicOverlayStickerModel.A0k;
        obj.A0j = musicOverlayStickerModel.A0l;
        obj.A0k = musicOverlayStickerModel.A0m;
        obj.A0L = musicOverlayStickerModel.A0P;
        obj.A0l = musicOverlayStickerModel.A0n;
        return obj;
    }

    public static final MusicMuteAudioReason A00(RFN rfn) {
        int ordinal = rfn.ordinal();
        if (ordinal == 0) {
            return MusicMuteAudioReason.A08;
        }
        if (ordinal == 1) {
            return MusicMuteAudioReason.A07;
        }
        if (ordinal == 2) {
            return MusicMuteAudioReason.A04;
        }
        if (ordinal == 3) {
            return MusicMuteAudioReason.A05;
        }
        if (ordinal != 4) {
            return MusicMuteAudioReason.A09;
        }
        return MusicMuteAudioReason.A06;
    }

    public static final RFN A03(MusicMuteAudioReason musicMuteAudioReason) {
        int ordinal = musicMuteAudioReason.ordinal();
        if (ordinal == 5) {
            return RFN.SONG_NOT_AVAILABLE;
        }
        if (ordinal == 4) {
            return RFN.OUTSIDE_TERRITORY;
        }
        if (ordinal == 1) {
            return RFN.LABEL_GO_DARK;
        }
        if (ordinal == 2) {
            return RFN.MUSIC_RIGHTS_NOT_LAUNCHED_TO_COUNTRY;
        }
        if (ordinal != 3) {
            return RFN.UNKNOWN;
        }
        return RFN.ORIGINAL_AUDIO_MUTED;
    }

    public static final C16585Uxf A05(AnonymousClass6KJ r0) {
        switch (r0.ordinal()) {
            case 0:
                return C16585Uxf.MUSIC_OVERLAY_SIMPLE;
            case 1:
                return C16585Uxf.MUSIC_OVERLAY_ALBUM_ART;
            case 2:
                return C16585Uxf.LYRICS_KARAOKE;
            case 3:
                return C16585Uxf.LYRICS_CUBE_REVEAL;
            case 4:
                return C16585Uxf.LYRICS_DYNAMIC_REVEAL;
            case 5:
                return C16585Uxf.LYRICS_TYPEWRITER;
            case 6:
                return C16585Uxf.LYRICS_LINE_BY_LINE_CUBE_REVEAL;
            case 7:
                return C16585Uxf.MUSIC_ONLY;
            case 9:
                return C16585Uxf.MUSIC_HIDDEN;
            default:
                return C16585Uxf.UNKNOWN;
        }
    }
}
