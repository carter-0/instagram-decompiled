package X;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewConfiguration;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.AudioFilterType;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.sundial.api.ClipsAssetRecommendationService$fetchEffectAssetRecommendation$1;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.DownloadedTrack;
import com.instagram.music.common.model.InstagramAudioApplySource;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.MusicBrowseCategory;
import com.instagram.music.common.model.MusicSearchPlaylistType;
import com.instagram.music.common.model.TrackSnippet;
import com.instagram.music.search.tabloader.MusicOverlaySearchTab;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.89k  reason: invalid class name and case insensitive filesystem */
public final class C3515789k {
    public C3515189e A00;
    public C331157Pu A01;
    public AudioOverlayTrack A02;
    public AudioOverlayTrack A03;
    public MusicBrowseCategory A04;
    public C3506785t A05;
    public AnonymousClass80X A06;
    public 0eP A07;
    public boolean A08;
    public boolean A09;
    public final int A0A;
    public final Context A0B;
    public final AnonymousClass4DH A0C;
    public final UserSession A0D;
    public final C3506485o A0E;
    public final C3502083s A0F;
    public final C3516289p A0G;
    public final C3515489h A0H;
    public final C3515289f A0I;
    public final C3514789a A0J;
    public final ClipsCreationViewModel A0K;
    public final C3515689j A0L;
    public final boolean A0M;
    public final int A0N;
    public final ImmutableList A0O;
    public final MusicProduct A0P;
    public final TargetViewSizeProvider A0Q;
    public final C3516089n A0R;
    public final C3514889b A0S;
    public final AnonymousClass861 A0T;
    public final MusicAttributionConfig A0U;
    public final C3515989m A0V = new C3515889l(this);
    public final String A0W;
    public final boolean A0X;
    public final boolean A0Y;
    public final boolean A0Z;
    public final boolean A0a;

    public final void A0A(AudioOverlayTrack audioOverlayTrack, MusicOverlaySearchTab musicOverlaySearchTab, boolean z, boolean z2) {
        A09(audioOverlayTrack, (AudioOverlayTrack) null, musicOverlaySearchTab, (0eP) null, z, z2);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.07Z, X.4DH] */
    public final void A0B(C66569MWx mWx, MusicBrowseCategory musicBrowseCategory) {
        String str;
        MusicSearchPlaylistType musicSearchPlaylistType;
        MusicAssetModel A022 = MusicAssetModel.A02(mWx);
        C3514889b r2 = this.A0S;
        UserSession userSession = this.A0D;
        0qQ.A0A(A022);
        C3514989c r15 = r2.A01;
        String str2 = A022.A0B;
        if (A022.A0U) {
            str = A022.A0E;
        } else {
            str = null;
        }
        C226292g8.A00(C318116oQ.A00(r2).A00, new C66106MBp(new AnonymousClass05E(new ClipsAssetRecommendationService$fetchEffectAssetRecommendation$1(userSession, r15, str2, (String) null, str, (AnonymousClass4D7) null)))).A06(this.A0C, new C41483Auh(new C377089Km(A022, 1)));
        if (this.A0M) {
            List list = A022.A0J;
            int i = A022.A00;
            ClipsCreationViewModel clipsCreationViewModel = this.A0K;
            int A002 = C63349KvW.A00(i, clipsCreationViewModel.A0E(), list);
            int i2 = A022.A00;
            int A0E2 = clipsCreationViewModel.A0E();
            if (i2 > A0E2) {
                i2 = A0E2;
            }
            AudioOverlayTrack audioOverlayTrack = new AudioOverlayTrack(A022, A002, i2);
            MusicBrowseCategory musicBrowseCategory2 = musicBrowseCategory;
            audioOverlayTrack.A09 = musicBrowseCategory2;
            audioOverlayTrack.A04 = 0;
            audioOverlayTrack.A01 = ClipsCreationViewModel.A00(clipsCreationViewModel).A00;
            if (musicBrowseCategory != null) {
                musicSearchPlaylistType = musicBrowseCategory2.A01;
            } else {
                musicSearchPlaylistType = null;
            }
            if (musicSearchPlaylistType == MusicSearchPlaylistType.SPOTIFY) {
                audioOverlayTrack.A07 = InstagramAudioApplySource.SPOTIFY_PLAYLIST;
            }
            this.A0I.Dt2(audioOverlayTrack);
            A04(this);
            return;
        }
        this.A0K.A05 = AnonymousClass05K.A01;
        A07(this, (AnonymousClass8IJ) null, A022, (AnonymousClass6KJ) null, (Integer) null, (String) null, 1.0f, 0, false, true, false, false);
    }

    public static final C331127Pr A00(C3515789k r2, K6I k6i) {
        C331127Pr r1 = new C331127Pr(r2.A0D);
        r1.A0a = true;
        r1.A03 = 1.0f;
        r1.A06 = r2.A0N;
        r1.A1O = r2.A0Y;
        r1.A0U = new AgL(r2);
        r1.A0T = k6i;
        return r1;
    }

    public static final C331127Pr A01(C3515789k r3, C273494mf r4) {
        C331127Pr r2 = new C331127Pr(r3.A0D);
        r2.A0a = true;
        r2.A19 = true;
        r2.A1E = true;
        r2.A06 = r3.A0N;
        r2.A1O = r3.A0Y;
        r2.A0U = new AgL(r3);
        r2.A0T = r4;
        return r2;
    }

    public static final AudioOverlayTrack A02(C3515789k r20, AnonymousClass8IJ r21, MusicAssetModel musicAssetModel, TrackSnippet trackSnippet) {
        AudioOverlayTrack audioOverlayTrack;
        MusicSearchPlaylistType musicSearchPlaylistType;
        String str;
        C3515789k r3 = r20;
        0eP r1 = r3.A07;
        int i = trackSnippet.A01;
        MusicAssetModel musicAssetModel2 = musicAssetModel;
        if (r1 != null) {
            int i2 = musicAssetModel2.A00;
            int A0E2 = r3.A0K.A0E();
            if (i2 > A0E2) {
                i2 = A0E2;
            }
            int intValue = ((Number) r1.A00).intValue();
            int intValue2 = ((Number) r1.A01).intValue();
            int i3 = i;
            audioOverlayTrack = new AudioOverlayTrack((AnonymousClass8IJ) null, (DownloadedTrack) null, (InstagramAudioApplySource) null, musicAssetModel2, (MusicBrowseCategory) null, musicAssetModel2.A0B, musicAssetModel2.A0E, musicAssetModel2.A0G, (String) null, 1.0f, i3, i2, intValue, intValue2);
            if (i < 0) {
                throw new IllegalStateException(002.A0O(C273654mx.A00(1386), i));
            } else if (i2 <= 0) {
                throw new IllegalStateException(002.A0O(C273654mx.A00(1385), i2));
            } else if (intValue < 0) {
                throw new IllegalStateException(002.A0O("Start Time in Video must be greater than or equal to zero: ", intValue));
            } else if (intValue2 < 0) {
                throw new IllegalStateException(002.A0O("End Time in Video must be greater than or equal to zero: ", intValue2));
            }
        } else {
            int i4 = musicAssetModel2.A00;
            int A0E3 = r3.A0K.A0E();
            if (i4 > A0E3) {
                i4 = A0E3;
            }
            audioOverlayTrack = new AudioOverlayTrack(musicAssetModel2, i, i4);
        }
        audioOverlayTrack.A05 = r21;
        if (musicAssetModel2.A0T && (str = musicAssetModel2.A0F) != null) {
            File file = new File(str);
            0qQ.A0B(file, 0);
            String path = file.getPath();
            0qQ.A07(path);
            audioOverlayTrack.A06 = new DownloadedTrack(path, -1, -1);
        }
        MusicBrowseCategory musicBrowseCategory = r3.A04;
        audioOverlayTrack.A09 = musicBrowseCategory;
        if (musicBrowseCategory != null) {
            musicSearchPlaylistType = musicBrowseCategory.A01;
        } else {
            musicSearchPlaylistType = null;
        }
        if (musicSearchPlaylistType == MusicSearchPlaylistType.SPOTIFY) {
            audioOverlayTrack.A07 = InstagramAudioApplySource.SPOTIFY_PLAYLIST;
        }
        return audioOverlayTrack;
    }

    /* JADX WARNING: type inference failed for: r0v17, types: [com.instagram.music.common.model.MusicModelEffectPair, java.lang.Object] */
    public static final K6I A03(C3515789k r18, MusicOverlaySearchTab musicOverlaySearchTab) {
        ImmutableList immutableList;
        List<C361278fx> list;
        String str;
        C3515789k r2 = r18;
        AnonymousClass0Ud r1 = r2.A0K.A0K.A0V;
        Collection collection = (Collection) r1.getValue();
        if (collection == null || collection.isEmpty() || (list = (List) r1.getValue()) == null || list.isEmpty()) {
            immutableList = null;
        } else {
            ArrayList arrayList = new ArrayList();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (C361278fx r0 : list) {
                AudioOverlayTrack audioOverlayTrack = (AudioOverlayTrack) r0.A01;
                if (audioOverlayTrack != null) {
                    MusicAssetModel musicAssetModel = audioOverlayTrack.A08;
                    AnonymousClass8IJ r3 = audioOverlayTrack.A05;
                    if (!(musicAssetModel == null || (str = musicAssetModel.A0E) == null || linkedHashSet.contains(str))) {
                        if (r3 == null) {
                            r3 = C263304Kd.A02(AudioFilterType.UNRECOGNIZED);
                        }
                        ? obj = new Object();
                        obj.A01 = musicAssetModel;
                        obj.A00 = r3;
                        arrayList.add(obj);
                        linkedHashSet.add(str);
                    }
                }
            }
            immutableList = ImmutableList.copyOf((Collection) arrayList);
        }
        UserSession userSession = r2.A0D;
        AnonymousClass80X r12 = r2.A06;
        String BUn = r2.A0I.BUn();
        MusicProduct musicProduct = r2.A0P;
        ImmutableList immutableList2 = r2.A0O;
        MusicAttributionConfig musicAttributionConfig = r2.A0U;
        K6I A002 = LJS.A00((C62642Kk4) null, r2.A0J.A00, (C371088xY) null, immutableList2, immutableList, musicProduct, userSession, musicAttributionConfig, musicOverlaySearchTab, r12, BUn, (String) null, r2.A0W, (Map) null, false, r2.A0a, r2.A0X);
        A002.A03 = r2.A0V;
        A002.A02 = r2.A0R;
        return A002;
    }

    public static final void A06(C3515789k r3) {
        AnonymousClass861 r2 = r3.A0T;
        r2.A04();
        if (r3.A06 == AnonymousClass80X.POST_CAPTURE && AnonymousClass8IK.A04(r3.A0D)) {
            r2.A09(r3.A0K.A0C);
            C3506485o r1 = r3.A0E;
            if (r1 != null) {
                r1.A01 = false;
                C3506485o.A00(r1, false);
            }
        }
    }

    public static final void A07(C3515789k r15, AnonymousClass8IJ r16, MusicAssetModel musicAssetModel, AnonymousClass6KJ r18, Integer num, String str, float f, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        int intValue;
        C3506485o r1;
        int i2;
        boolean z5 = z;
        r15.A09 = z5;
        r15.A08 = z3;
        MusicAssetModel musicAssetModel2 = musicAssetModel;
        if (r15.A07 == null) {
            if (musicAssetModel != null) {
                i2 = musicAssetModel2.A00;
            } else {
                i2 = 90000;
            }
            int min = Math.min(i2, 90000);
            if (ClipsCreationViewModel.A00(r15.A0K).A00 > min) {
                r15.A07 = new 0eP(0, Integer.valueOf(min));
            }
        }
        if (r15.A06 == AnonymousClass80X.POST_CAPTURE) {
            UserSession userSession = r15.A0D;
            if (AnonymousClass8IK.A04(userSession)) {
                r15.A0T.A09(r15.A0K.A0D);
                if (AnonymousClass8IK.A0A(userSession) && (r1 = r15.A0E) != null) {
                    r1.A01 = true;
                    C3506485o.A00(r1, false);
                }
            }
        }
        0eP r12 = r15.A07;
        if (r12 != null) {
            AnonymousClass861 r4 = r15.A0T;
            int intValue2 = ((Number) r12.A00).intValue();
            Number number = (Number) r12.A01;
            if (number.intValue() == 0) {
                intValue = ClipsCreationViewModel.A00(r15.A0K).A00;
            } else {
                intValue = number.intValue();
            }
            r4.A08(intValue2, intValue);
        }
        UserSession userSession2 = r15.A0D;
        boolean z6 = r15.A0Z;
        AnonymousClass80X r11 = r15.A06;
        boolean z7 = !z3;
        TargetViewSizeProvider targetViewSizeProvider = r15.A0Q;
        C3515589i r6 = r15.A0J.A00;
        boolean A002 = AnonymousClass8IK.A00(userSession2);
        int i3 = 0;
        ClipsCreationViewModel clipsCreationViewModel = r15.A0K;
        if (A002) {
            i3 = clipsCreationViewModel.A0K.A02(false);
        } else {
            List<C361278fx> list = (List) clipsCreationViewModel.A0K.A0V.getValue();
            if (list != null) {
                for (C361278fx r0 : list) {
                    int i4 = r0.A00;
                    if (!(i4 == 0 || i4 == 4)) {
                        i3++;
                    }
                }
            }
        }
        boolean A0m = clipsCreationViewModel.A0m();
        MusicProduct musicProduct = MusicProduct.CLIPS_CAMERA_FORMAT_V2;
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession2.A05);
        bundle.putParcelable("args_music_asset", musicAssetModel2);
        bundle.putBoolean("args_is_existing_track", z5);
        bundle.putInt("args_existing_start_time_in_ms", i);
        bundle.putBoolean("args_should_sync_video_and_music", z6);
        bundle.putBoolean("args_should_support_edit_controls", z2);
        bundle.putSerializable("args_capture_state", r11);
        bundle.putBoolean("args_is_album_art_enabled", z7);
        bundle.putSerializable(AnonymousClass000.A00(324), musicProduct);
        bundle.putBoolean("args_should_remove_audio_track_on_back", z4);
        bundle.putParcelable("ARGS_TARGET_VIEW_SIZE_PROVIDER", targetViewSizeProvider);
        if (r16 != null) {
            bundle.putString("ARGS_PRE_SELECTED_AUDIO_FILTER", r16.name());
        }
        String str2 = str;
        if (str != null) {
            bundle.putString("ARG_PRE_SELECTED_AUDIO_FILTER_FILE_PATH", str2);
        }
        if (num != null) {
            bundle.putInt("args_music_sticker_color", num.intValue());
        }
        if (r18 != null) {
            bundle.putInt("args_music_sticker_type", r18.ordinal());
        }
        bundle.putSerializable("ARGS_CAMERA_MUSIC_BROWSER_ENTRY_POINT", r6);
        bundle.putInt("ARGS_CURRENTLY_ATTACHED_TRACKS_COUNT", i3);
        bundle.putBoolean("ARGS_HAS_MIX_ATTACHED", A0m);
        bundle.putFloat("ARGS_PRESET_PLAYBACK_VOLUME", f);
        C384919i6 r122 = new C384919i6();
        r122.setArguments(bundle);
        r122.A05 = r15.A0G;
        C331127Pr r13 = new C331127Pr(userSession2);
        r13.A0a = true;
        r13.A03 = 1.0f;
        r13.A06 = r15.A0A;
        r13.A1O = true;
        Context context = r15.A0B;
        r13.A0F = ViewConfiguration.get(context).getScaledPagingTouchSlop();
        r13.A0U = new AgL(r15);
        r13.A0T = r122;
        C331157Pu r112 = r15.A01;
        if (r112 == null) {
            r15.A01 = r13.A00().A03(context, r122);
            r15.A0H.Cxu();
            return;
        }
        r112.A0H(r122, r13, true, true, false, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0044, code lost:
        if (r2 != null) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A08(X.C3515789k r11, com.instagram.music.common.model.AudioOverlayTrack r12, boolean r13, boolean r14, boolean r15) {
        /*
            X.8IJ r0 = r12.A05
            r7 = 0
            if (r0 == 0) goto L_0x0049
            com.instagram.music.common.model.DownloadedTrack r0 = r12.A06
            if (r0 == 0) goto L_0x0049
            java.lang.String r9 = r0.A02
        L_0x000b:
            r4 = r11
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r11.A0K
            X.05G r0 = r0.A0Z
            java.lang.Object r2 = r0.getValue()
            X.7zz r2 = (X.C349337zz) r2
            if (r2 == 0) goto L_0x0047
            com.instagram.music.common.model.MusicOverlayStickerModel r0 = r2.BUu()
            java.lang.String r1 = r0.A0S
        L_0x001e:
            java.lang.String r0 = r12.A0A
            boolean r0 = X.0qQ.A0K(r1, r0)
            com.instagram.music.common.model.MusicAssetModel r6 = r12.A08
            int r11 = r12.A03
            if (r0 == 0) goto L_0x0041
            if (r2 == 0) goto L_0x0041
            int r0 = r2.BzW()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
        L_0x0034:
            X.6KJ r7 = r2.BV4()
        L_0x0038:
            X.8IJ r5 = r12.A05
            float r10 = r12.A00
            r12 = 1
            A07(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        L_0x0041:
            r8 = r7
            if (r0 == 0) goto L_0x0038
            if (r2 == 0) goto L_0x0038
            goto L_0x0034
        L_0x0047:
            r1 = r7
            goto L_0x001e
        L_0x0049:
            r9 = r7
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3515789k.A08(X.89k, com.instagram.music.common.model.AudioOverlayTrack, boolean, boolean, boolean):void");
    }

    public final void A09(AudioOverlayTrack audioOverlayTrack, AudioOverlayTrack audioOverlayTrack2, MusicOverlaySearchTab musicOverlaySearchTab, 0eP r8, boolean z, boolean z2) {
        if (this.A0C.mFragmentManager != null) {
            if (audioOverlayTrack != null) {
                this.A03 = audioOverlayTrack;
            }
            this.A02 = audioOverlayTrack2;
            if (audioOverlayTrack2 != null) {
                r8 = new 0eP(Integer.valueOf(audioOverlayTrack2.A04), Integer.valueOf(audioOverlayTrack2.A01));
            }
            this.A07 = r8;
            if (audioOverlayTrack == null || audioOverlayTrack.A08 == null || this.A06 == AnonymousClass80X.POST_CAPTURE) {
                K6I A032 = A03(this, musicOverlaySearchTab);
                this.A01 = A00(this, A032).A00().A03(this.A0B, A032);
                if (this.A0L == C3515689j.GALLERY) {
                    if (182.A06(0Tu.A05, this.A0D, 36321361601373487L)) {
                        C318136oS A002 = C318116oQ.A00(this.A0K);
                        1Eo.A05(19B.A00, new C66183MGu(this, (AnonymousClass4D7) null, 42), A002);
                    }
                }
                this.A0K.A05 = AnonymousClass05K.A00;
                this.A0H.DT4();
            } else {
                A08(this, audioOverlayTrack, z, false, z2);
            }
            this.A0I.DT3(true);
        }
    }

    public static final void A04(C3515789k r2) {
        A06(r2);
        if (r2.A06 == AnonymousClass80X.POST_CAPTURE && AnonymousClass8IK.A04(r2.A0D)) {
            r2.A0K.A0Y(C361268fw.A00);
        }
        C331157Pu r0 = r2.A01;
        if (r0 != null) {
            r0.A07();
        }
    }

    public static final void A05(C3515789k r2) {
        A06(r2);
        C3506785t r0 = r2.A05;
        if (r0 != null) {
            r0.release();
        }
        r2.A09 = false;
        r2.A08 = false;
        r2.A07 = null;
        r2.A0I.DT3(false);
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [X.07Z, androidx.fragment.app.Fragment, java.lang.Object, X.4DH] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C3515789k(android.content.Context r7, X.C3515589i r8, com.google.common.collect.ImmutableList r9, com.instagram.api.schemas.MusicProduct r10, X.AnonymousClass4DH r11, com.instagram.common.session.UserSession r12, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r13, X.C3506485o r14, X.C3502083s r15, X.C3515489h r16, X.C3515289f r17, com.instagram.music.common.config.MusicAttributionConfig r18, X.C3515689j r19, X.AnonymousClass80X r20, java.lang.String r21, boolean r22, boolean r23, boolean r24, boolean r25, boolean r26) {
        /*
            r6 = this;
            r2 = r17
            r0 = 1
            X.0qQ.A0B(r7, r0)
            r0 = 2
            X.0qQ.A0B(r12, r0)
            r0 = 3
            X.0qQ.A0B(r11, r0)
            r0 = 4
            r1 = r20
            X.0qQ.A0B(r1, r0)
            r0 = 5
            X.0qQ.A0B(r9, r0)
            r6.<init>()
            r6.A0B = r7
            r6.A0D = r12
            r6.A0C = r11
            r6.A06 = r1
            r6.A0O = r9
            r6.A0I = r2
            r0 = r16
            r6.A0H = r0
            r0 = r18
            r6.A0U = r0
            r0 = r22
            r6.A0Z = r0
            r0 = r23
            r6.A0M = r0
            r6.A0F = r15
            r6.A0E = r14
            r6.A0P = r10
            r0 = r24
            r6.A0Y = r0
            r4 = r25
            r6.A0a = r4
            r3 = r19
            r6.A0L = r3
            r6.A0Q = r13
            r0 = r21
            r6.A0W = r0
            r0 = r26
            r6.A0X = r0
            X.89l r0 = new X.89l
            r0.<init>(r6)
            r6.A0V = r0
            androidx.fragment.app.FragmentActivity r0 = r11.requireActivity()
            X.2YN r1 = new X.2YN
            r1.<init>(r0)
            java.lang.Class<X.860> r0 = X.AnonymousClass860.class
            X.2YL r1 = r1.A00(r0)
            X.860 r1 = (X.AnonymousClass860) r1
            java.lang.String r0 = "post_capture"
            X.861 r0 = r1.A00(r0)
            r6.A0T = r0
            X.89n r0 = new X.89n
            r0.<init>(r6)
            r6.A0R = r0
            X.89o r0 = new X.89o
            r0.<init>(r6)
            r6.A0G = r0
            if (r25 == 0) goto L_0x00f5
            r0 = 2130970269(0x7f04069d, float:1.7549243E38)
            int r1 = X.2Yu.A0H(r7, r0)
        L_0x008a:
            int r0 = r7.getColor(r1)
            r6.A0N = r0
            r0 = 2131099790(0x7f06008e, float:1.7811943E38)
            int r0 = r7.getColor(r0)
            r6.A0A = r0
            androidx.fragment.app.FragmentActivity r4 = r11.requireActivity()
            X.82v r0 = new X.82v
            r0.<init>(r12, r4)
            X.2YN r1 = new X.2YN
            r1.<init>(r0, r4)
            java.lang.Class<com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel> r0 = com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel.class
            X.2YL r3 = r1.A00(r0)
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r3 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel) r3
            r6.A0K = r3
            X.2YN r1 = new X.2YN
            r1.<init>(r4)
            java.lang.Class<X.89b> r0 = X.C3514889b.class
            X.2YL r0 = r1.A00(r0)
            X.89b r0 = (X.C3514889b) r0
            r6.A0S = r0
            X.2YN r1 = new X.2YN
            r1.<init>(r4)
            java.lang.Class<X.89a> r0 = X.C3514789a.class
            X.2YL r5 = r1.A00(r0)
            X.89a r5 = (X.C3514789a) r5
            r6.A0J = r5
            X.80X r0 = r6.A06
            X.80X r4 = X.AnonymousClass80X.POST_CAPTURE
            if (r0 != r4) goto L_0x00e4
            X.2Fj r3 = r3.A0H
            X.89q r1 = new X.89q
            r1.<init>(r6)
            X.6q2 r0 = new X.6q2
            r0.<init>(r1)
            r3.A06(r11, r0)
        L_0x00e4:
            X.80X r0 = r6.A06
            if (r0 != r4) goto L_0x00f0
            boolean r0 = r2 instanceof X.C3515189e
            if (r0 == 0) goto L_0x00f0
            X.89e r2 = (X.C3515189e) r2
            r6.A00 = r2
        L_0x00f0:
            if (r8 == 0) goto L_0x00f4
            r5.A00 = r8
        L_0x00f4:
            return
        L_0x00f5:
            X.89j r0 = X.C3515689j.GALLERY
            r1 = 2131099697(0x7f060031, float:1.7811755E38)
            if (r3 != r0) goto L_0x008a
            r1 = 2131100247(0x7f060257, float:1.781287E38)
            goto L_0x008a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3515789k.<init>(android.content.Context, X.89i, com.google.common.collect.ImmutableList, com.instagram.api.schemas.MusicProduct, X.4DH, com.instagram.common.session.UserSession, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider, X.85o, X.83s, X.89h, X.89f, com.instagram.music.common.config.MusicAttributionConfig, X.89j, X.80X, java.lang.String, boolean, boolean, boolean, boolean, boolean):void");
    }
}
