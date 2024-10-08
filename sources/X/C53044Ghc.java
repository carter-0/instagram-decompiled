package X;

import android.content.Context;
import com.instagram.api.schemas.AudioFilterType;
import com.instagram.api.schemas.MusicInfoImpl;
import com.instagram.api.schemas.MusicPageTabType;
import com.instagram.api.schemas.TrackData;
import com.instagram.clips.audio.model.AudioPageAssetModel;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioType;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.MusicDataSource;
import java.util.List;

/* renamed from: X.Ghc  reason: case insensitive filesystem */
public final class C53044Ghc extends 2YL implements MU9 {
    public N49 A00;
    public AudioFilterType A01;
    public AudioPageAssetModel A02;
    public List A03;
    public final 2Fk A04;
    public final 2Fk A05;
    public final 2Fk A06;
    public final 2Fk A07;
    public final MusicPageTabType A08;
    public final C321676uZ A09;
    public final UserSession A0A;
    public final C62037KWw A0B;
    public final C55878Hoz A0C;
    public final String A0D;
    public final String A0E;
    public final AnonymousClass0eM A0F = C58679Ivo.A00(this, 14);
    public final C249513ju A0G;
    public final C249513ju A0H;
    public final AnonymousClass0r6 A0I;
    public final AnonymousClass0r6 A0J;
    public final 05G A0K;
    public final 05G A0L;
    public final 05G A0M;
    public final 05G A0N;
    public final 05G A0O;
    public final 05G A0P;
    public final AnonymousClass07i A0Q;
    public final 05G A0R;
    public final 05G A0S;
    public final 05G A0T;

    public final void A02(Context context, AudioFilterType audioFilterType, UserSession userSession, int i, boolean z) {
        C2606046i r5;
        C55709Hm6 hm6;
        TrackData trackData;
        Context context2 = context;
        if (context != null) {
            MusicAssetModel musicAssetModel = null;
            this.A0K.Epw((Object) null);
            AudioFilterType audioFilterType2 = AudioFilterType.UNRECOGNIZED;
            AudioFilterType audioFilterType3 = audioFilterType;
            if (audioFilterType != audioFilterType2) {
                AnonymousClass7TF.A1O(this.A0M, true);
            }
            C53305Glr glr = (C53305Glr) this.A06.A02();
            MusicDataSource musicDataSource = null;
            if (glr != null) {
                r5 = glr.A01;
            } else {
                r5 = null;
            }
            GVR gvr = (GVR) this.A04.A02();
            if (gvr != null) {
                hm6 = gvr.A05;
            } else {
                hm6 = null;
            }
            if (r5 != null && hm6 != null) {
                if (r5.Adv() == AudioType.ORIGINAL_AUDIO) {
                    musicAssetModel = MusicAssetModel.A00(hm6.A01, r5.COz());
                } else {
                    MusicInfoImpl musicInfoImpl = hm6.A00;
                    if (!(musicInfoImpl == null || (trackData = musicInfoImpl.A00) == null)) {
                        musicAssetModel = MusicAssetModel.A01(trackData, false);
                    }
                }
                int i2 = i;
                boolean z2 = z;
                if (audioFilterType == audioFilterType2) {
                    if (musicAssetModel != null) {
                        musicDataSource = musicAssetModel.A05;
                    }
                    A01(musicDataSource, this, 1.0f, i2, z2);
                } else if (musicAssetModel != null) {
                    UserSession userSession2 = userSession;
                    T83 t83 = new T83(context2, audioFilterType3, userSession2, musicAssetModel, this, i2, z2);
                    C353638Im r3 = new C353638Im(context, userSession2, new IW5(), 0);
                    String str = musicAssetModel.A0H;
                    0qQ.A07(str);
                    r3.A04(musicAssetModel, t83, str, 0, musicAssetModel.A00, false);
                }
            }
        }
    }

    public final void A04(C2606046i r8, String str) {
        AnonymousClass7TG.A1N(str, r8);
        C318136oS A002 = C318116oQ.A00(this);
        AnonymousClass7TE.A1Z(new C66173MGk(r8, this, str, (AnonymousClass4D7) null, 43), A002);
    }

    public final void Dol(boolean z) {
    }

    public C53044Ghc(AnonymousClass07i r31, MusicPageTabType musicPageTabType, C321676uZ r33, UserSession userSession, C62037KWw kWw, C55878Hoz hoz, String str, String str2) {
        AnonymousClass07i r2 = r31;
        0qQ.A0B(r2, 4);
        MusicPageTabType musicPageTabType2 = musicPageTabType;
        C62037KWw kWw2 = kWw;
        AnonymousClass7TF.A1F(musicPageTabType2, 6, kWw2);
        this.A0A = userSession;
        String str3 = str;
        this.A0D = str3;
        this.A0Q = r2;
        C55878Hoz hoz2 = hoz;
        this.A0C = hoz2;
        this.A08 = musicPageTabType2;
        this.A09 = r33;
        this.A0B = kWw2;
        this.A0E = str2;
        02z A012 = 106.A01((Object) null);
        this.A0L = A012;
        02z A10 = C51970G9q.A10(true);
        this.A0P = A10;
        02z A102 = DbS.A10(false);
        this.A0O = A102;
        02z A103 = DbS.A10(false);
        this.A0N = A103;
        AnonymousClass0r6 A013 = 106.A01((Object) null);
        this.A0T = A013;
        AnonymousClass0r6 A014 = 106.A01((Object) null);
        this.A0K = A014;
        AnonymousClass0r6 A104 = DbS.A10(false);
        this.A0M = A104;
        AnonymousClass0r6 A105 = DbS.A10(C51967G9n.A0h());
        this.A0S = A105;
        AnonymousClass0r6 A106 = DbS.A10(false);
        this.A0R = A106;
        0pq A015 = AnonymousClass10H.A01(new C58115Imf(this, (AnonymousClass4D7) null, 1), A102, A103, A012, kWw2.A03(str3, false));
        C318136oS A002 = C318116oQ.A00(this);
        AnonymousClass109 r7 = AnonymousClass10A.A01;
        List list = 0sn.A00;
        List list2 = list;
        05F A022 = 10b.A02(new C53315Gm1((C59721JVf) null, (N49) null, (1ro) null, (C2606046i) null, (String) null, list2, true, true, false, false), A002, A015, r7);
        19B r3 = 19B.A00;
        this.A05 = C226292g8.A00(r3, A022);
        this.A04 = C226292g8.A00(r3, A012);
        this.A06 = C226292g8.A00(r3, new C58028IkL(10, this, new AnonymousClass0r6[]{A012, A013, A014, A104, A105, A106}));
        this.A03 = list;
        0pp A023 = AnonymousClass10H.A02(new GVV(this, (AnonymousClass4D7) null), AnonymousClass0Zq.A00(new MGC(hoz2, (AnonymousClass4D7) null, 48)), A102, A10, A103, A012);
        this.A07 = C226292g8.A00(r3, 10b.A02(new GVW((C53368Gms) null, (C61037Jvb) null, MusicPageTabType.CLIPS, (1ro) null, (C2606046i) null, (MusicAssetModel) null, (String) null, list2, true, true, false, false), C318116oQ.A00(this), A023, r7));
        1HR r0 = new 1HR(Integer.MAX_VALUE);
        this.A0H = r0;
        this.A0J = 0u9.A04(r0);
        1HR r02 = new 1HR(Integer.MAX_VALUE);
        this.A0G = r02;
        this.A0I = 0u9.A04(r02);
        DbY.A19(this, new GVU(this, (AnonymousClass4D7) null), AnonymousClass10H.A03(new C67296MlV(7, (AnonymousClass4D7) null), 10q.A02(new C66194MHk((Object) hoz2, (AnonymousClass4D7) null, 45), hoz2.A09), hoz2.A01));
    }

    public static GVW A00(C53044Ghc ghc) {
        return (GVW) ghc.A07.A02();
    }

    public static final void A01(MusicDataSource musicDataSource, C53044Ghc ghc, float f, int i, boolean z) {
        ghc.A0K.Epw(musicDataSource);
        ghc.A0T.Epw(Integer.valueOf(i));
        ghc.A0S.Epw(Float.valueOf(f));
        AnonymousClass7TF.A1O(ghc.A0R, z);
    }

    public final void A03(AudioPageAssetModel audioPageAssetModel) {
        AudioPageAssetModel audioPageAssetModel2 = audioPageAssetModel;
        if (audioPageAssetModel != null) {
            this.A02 = audioPageAssetModel2;
            C58099ImL.A01(this, C318116oQ.A00(this), 13);
        }
        AnonymousClass7TF.A1O(this.A0P, AnonymousClass7TF.A1V(audioPageAssetModel2));
        C55878Hoz hoz = this.A0C;
        AnonymousClass07i r11 = this.A0Q;
        0qQ.A0B(r11, 1);
        Integer num = hoz.A00;
        Integer num2 = AnonymousClass05K.A0C;
        if (num == num2 || num == AnonymousClass05K.A01) {
            AnonymousClass0eM r3 = hoz.A08;
            if (r3.getValue() == C294895nD.DEFER_STREAMING || r3.getValue() == C294895nD.CHUNK_STREAMING) {
                AnonymousClass7TF.A1O(hoz.A01, AnonymousClass7TF.A1W(hoz.A00, num2));
                return;
            }
        }
        if (audioPageAssetModel != null) {
            05G r0 = hoz.A09;
            Context context = hoz.A02;
            UserSession userSession = hoz.A05;
            r0.Epw(new C320416sL(context, r11, new C57035IMb(hoz.A03, audioPageAssetModel2, 0, true, false), DbS.A0O("audio_page"), userSession));
        }
        Object value = hoz.A09.getValue();
        if (value != null) {
            hoz.A00 = AnonymousClass05K.A01;
            C51972G9s.A19((C320416sL) value);
            return;
        }
        throw AnonymousClass7TE.A0z("Called fetch without initializing fetcher");
    }

    public final void onCleared() {
        C55878Hoz hoz = this.A0C;
        hoz.A04.A07(hoz.A07);
    }

    public final void DCu(Integer num, String str, boolean z) {
        AnonymousClass7TG.A1O(num, str);
        C55123HcW.A00(num, str, z);
        AnonymousClass7TE.A1Z(new MGB(this, (AnonymousClass4D7) null, 20, z), C318116oQ.A00(this));
    }
}
