package X;

import android.app.Application;
import android.net.Uri;
import androidx.paging.PageEvent$StaticList;
import androidx.paging.PageFetcher;
import androidx.paging.PagingConfig;
import com.instagram.api.schemas.AudioFilterType;
import com.instagram.api.schemas.OriginalAudioSubtype;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.api.schemas.TrackData;
import com.instagram.api.schemas.TrackMetadata;
import com.instagram.api.schemas.TrackOrOriginalSoundSchema;
import com.instagram.api.schemas.TrackOrOriginalSoundSchemaIntf;
import com.instagram.clips.model.metadata.AudioPageMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.music.common.model.AudioType;
import com.instagram.music.common.model.MusicDataSource;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.GgG  reason: case insensitive filesystem */
public class C52963GgG extends C361478gI {
    public Dc2 A00;
    public String A01;
    public AnonymousClass0r6 A02;
    public ArrayList A03;
    public final TrackOrOriginalSoundSchema A04;
    public final C54429HDb A05;
    public final UserSession A06;
    public final C62037KWw A07;
    public final HM8 A08;
    public final String A09;
    public final C249513ju A0A;
    public final AnonymousClass0r6 A0B;

    public final void A0H(C16181Uq6 uq6) {
        boolean A1a = C51973G9u.A1a(this.A07, uq6.A07, false);
        IXQ ixq = new IXQ(uq6, this, A1a);
        C318136oS A002 = C318116oQ.A00(this);
        AnonymousClass7TE.A1Z(new C59674JTf(uq6, ixq, this, (AnonymousClass4D7) null, 23, A1a), A002);
    }

    public final C16181Uq6 A0E(TrackOrOriginalSoundSchemaIntf trackOrOriginalSoundSchemaIntf, Integer num, String str, boolean z) {
        String str2;
        List Adj;
        List Adj2;
        String str3;
        String str4;
        Integer num2;
        Boolean Cde;
        Integer num3 = num;
        TrackMetadata BSi = trackOrOriginalSoundSchemaIntf.BSi();
        boolean z2 = true;
        boolean z3 = false;
        if (BSi == null || !BSi.isBookmarked()) {
            z2 = false;
        }
        String str5 = str;
        boolean z4 = z;
        if (trackOrOriginalSoundSchemaIntf.C92() != null) {
            TrackData C92 = trackOrOriginalSoundSchemaIntf.C92();
            if (C92 != null) {
                UserSession userSession = this.A06;
                boolean A062 = 182.A06(DbS.A0J(userSession, 0), userSession, 36328401052908874L);
                String audioClusterId = C92.getAudioClusterId();
                if (audioClusterId != null) {
                    String title = C92.getTitle();
                    if (title == null) {
                        title = "";
                    }
                    String displayArtist = C92.getDisplayArtist();
                    if (displayArtist == null) {
                        displayArtist = "";
                    }
                    TrackMetadata BSi2 = trackOrOriginalSoundSchemaIntf.BSi();
                    Integer num4 = null;
                    if (BSi2 != null) {
                        str3 = BSi2.getFormattedClipsMediaCount();
                    } else {
                        str3 = null;
                    }
                    if (str3 != null && !A062) {
                        displayArtist = DbV.A0w(A0D().getApplicationContext().getResources(), displayArtist, str3, 2131964456);
                        0qQ.A07(displayArtist);
                    }
                    if (A062) {
                        Integer AzJ = C92.AzJ();
                        if (AzJ != null) {
                            str4 = C347917xa.A01(AzJ.intValue());
                        } else {
                            str4 = null;
                        }
                    } else {
                        str4 = null;
                    }
                    SimpleImageUrl Arq = C92.Arq();
                    if (Arq == null) {
                        Arq = DbS.A0V("");
                    }
                    boolean isExplicit = C92.isExplicit();
                    TrackMetadata BSi3 = trackOrOriginalSoundSchemaIntf.BSi();
                    if (!(BSi3 == null || (Cde = BSi3.Cde()) == null)) {
                        z3 = Cde.booleanValue();
                    }
                    Integer num5 = null;
                    MusicDataSource musicDataSource = new MusicDataSource((Uri) null, AudioType.MUSIC, C92.getProgressiveDownloadUrl(), C92.getDashManifest(), C92.getId(), C92.getArtistId());
                    List BDX = C92.BDX();
                    C62037KWw kWw = this.A07;
                    String audioClusterId2 = C92.getAudioClusterId();
                    if (audioClusterId2 != null) {
                        AudioPageMetadata A032 = LT9.A03(C92, C51973G9u.A1a(kWw, audioClusterId2, z2));
                        if (num == null) {
                            TrackMetadata BSi4 = trackOrOriginalSoundSchemaIntf.BSi();
                            if (BSi4 != null) {
                                num5 = BSi4.C9r();
                            }
                        } else {
                            num5 = num3;
                        }
                        TrackMetadata BSi5 = trackOrOriginalSoundSchemaIntf.BSi();
                        if (BSi5 != null) {
                            num2 = BSi5.C9r();
                        } else {
                            num2 = null;
                        }
                        TrackMetadata BSi6 = trackOrOriginalSoundSchemaIntf.BSi();
                        if (BSi6 != null) {
                            num4 = BSi6.BfI();
                        }
                        return new C16181Uq6(A032, Arq, musicDataSource, num5, num2, num4, audioClusterId, title, displayArtist, str4, str5, C92.getAudioAssetId(), BDX, isExplicit, z3, z4, false);
                    }
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        } else if (trackOrOriginalSoundSchemaIntf.BZA() != null) {
            OriginalSoundDataIntf BZA = trackOrOriginalSoundSchemaIntf.BZA();
            if (BZA != null) {
                UserSession userSession2 = this.A06;
                boolean A063 = 182.A06(DbS.A0J(userSession2, 0), userSession2, 36328401052908874L);
                String audioAssetId = BZA.getAudioAssetId();
                String originalAudioTitle = BZA.getOriginalAudioTitle();
                String username = BZA.BEv().getUsername();
                String formattedClipsMediaCount = BZA.getFormattedClipsMediaCount();
                if (formattedClipsMediaCount != null && !A063) {
                    username = DbV.A0w(A0D().getApplicationContext().getResources(), username, formattedClipsMediaCount, 2131964456);
                    0qQ.A07(username);
                }
                if (A063) {
                    Integer AzJ2 = BZA.AzJ();
                    str2 = AzJ2 != null ? C347917xa.A01(AzJ2.intValue()) : null;
                } else {
                    str2 = null;
                    if (BZA.BYy() == OriginalAudioSubtype.A04 && (Adj = BZA.Adj()) != null && !Adj.isEmpty() && (Adj2 = BZA.Adj()) != null) {
                        str2 = C64131LPf.A00(DbT.A05(A0D()), Adj2).toString();
                    }
                }
                ImageUrl Bh3 = BZA.BEv().Bh3();
                boolean isExplicit2 = BZA.isExplicit();
                boolean isTrendingInClips = BZA.AqB().isTrendingInClips();
                MusicDataSource musicDataSource2 = new MusicDataSource((Uri) null, AudioType.ORIGINAL_AUDIO, BZA.getProgressiveDownloadUrl(), BZA.getDashManifest(), BZA.getAudioAssetId(), BZA.BEv().getId());
                List A1I = AnonymousClass7TE.A1I(0);
                AudioPageMetadata A012 = LT9.A01((AudioFilterType) null, BZA, C51973G9u.A1a(this.A07, BZA.getAudioAssetId(), z2));
                if (num == null) {
                    num3 = BZA.C9r();
                }
                return new C16181Uq6(A012, Bh3, musicDataSource2, num3, BZA.C9r(), BZA.BfI(), audioAssetId, originalAudioTitle, username, str2, str5, (String) null, A1I, isExplicit2, isTrendingInClips, z4, true);
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        } else {
            throw AnonymousClass7TE.A0w(AnonymousClass000.A00(2515));
        }
    }

    public final ArrayList A0F() {
        if (this instanceof HJG) {
            return ((HJG) this).A00;
        }
        return this.A03;
    }

    public final /* synthetic */ AnonymousClass0r6 A0G() {
        if (this instanceof HJG) {
            return ((HJG) this).A01;
        }
        return null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52963GgG(Application application, TrackOrOriginalSoundSchema trackOrOriginalSoundSchema, C54429HDb hDb, UserSession userSession, C62037KWw kWw, HM8 hm8, String str, String str2) {
        super(application);
        02z A012;
        AnonymousClass7TG.A1U(application, hDb, kWw);
        this.A05 = hDb;
        this.A07 = kWw;
        this.A06 = userSession;
        this.A09 = str;
        this.A04 = trackOrOriginalSoundSchema;
        this.A08 = hm8;
        this.A01 = str2;
        if (this instanceof HJG) {
            0rr r4 = new 0rr(new PageEvent$StaticList((LP3) null, (LP3) null, 0sn.A00));
            A012 = 106.A01(new C56521Hzs(C56521Hzs.A04, C56521Hzs.A06, C66220MJb.A00, r4));
        } else {
            int A072 = DbX.A07(hDb.A02);
            A012 = LGl.A01(C318116oQ.A00(this), new C58028IkL(13, this, new C58028IkL(12, this, new PageFetcher(new PagingConfig(A072, DbX.A07(hDb.A03), A072 * 3, false), new C58081IlI(new C51803G2m((Object) hDb, str2, str, 23), (AnonymousClass4D7) null, 1)).A03)));
        }
        this.A02 = A012;
        1HR A0w = G9w.A0w();
        this.A0A = A0w;
        this.A0B = 0u9.A04(A0w);
        this.A03 = AnonymousClass7TE.A1C();
    }
}
