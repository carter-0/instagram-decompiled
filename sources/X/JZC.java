package X;

import com.instagram.api.schemas.OriginalSoundData;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.api.schemas.TrackData;
import com.instagram.api.schemas.TrackDataImpl;
import com.instagram.api.schemas.TrackMetadata;
import com.instagram.music.common.model.MusicSearchArtist;
import com.instagram.music.common.model.MusicSearchPlaylist;
import com.instagram.music.common.model.MusicSearchPlaylistType;
import java.util.Arrays;
import java.util.List;

public final class JZC {
    public static final LQp A0J = new Object();
    public JV7 A00;
    public JV7 A01;
    public C61094Jx5 A02;
    public C61095Jx6 A03;
    public BE3 A04;
    public OriginalSoundData A05;
    public OriginalSoundData A06;
    public C61111JxN A07;
    public TrackDataImpl A08;
    public TrackMetadata A09;
    public TrackMetadata A0A;
    public MusicSearchArtist A0B;
    public C65493LuH A0C;
    public C62925Kod A0D;
    public MusicSearchPlaylist A0E;
    public DHT A0F;
    public Integer A0G;
    public JVX A0H;
    public DHT A0I;

    public JZC(C66564MWs mWs) {
        0qQ.A0B(mWs, 1);
        this.A09 = mWs.BSi();
        OriginalSoundDataIntf BZA = mWs.BZA();
        if (BZA != null) {
            0wb.A03("unexpected_original_sound", "OriginalSound found as search item for browse request");
            this.A0F = new DHT(BZA);
        }
        TrackData C92 = mWs.C92();
        if (C92 != null) {
            this.A0H = new JVX(C92);
        }
        A02();
    }

    public final C66569MWx A00() {
        C66569MWx mWx = this.A0H;
        if (mWx == null && (mWx = this.A0F) == null) {
            mWx = this.A0I;
        }
        return mWx;
    }

    public final String A01() {
        int intValue;
        String A0i;
        JV7 jv7;
        Integer num = this.A0G;
        if (num == null) {
            intValue = -1;
        } else {
            intValue = num.intValue();
        }
        switch (intValue) {
            case 1:
                C66569MWx A002 = A00();
                if (A002 != null) {
                    A0i = A002.BfO();
                    break;
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            case 2:
                jv7 = this.A01;
                if (jv7 == null) {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
                break;
            case 3:
                jv7 = this.A00;
                if (jv7 == null) {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
                break;
            case 5:
            case 6:
                MusicSearchPlaylist musicSearchPlaylist = this.A0E;
                if (musicSearchPlaylist != null) {
                    A0i = JTP.A0s(musicSearchPlaylist);
                    break;
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            case 7:
                C65493LuH luH = this.A0C;
                if (luH != null) {
                    A0i = luH.A00.getId();
                    break;
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            case 8:
                MusicSearchArtist musicSearchArtist = this.A0B;
                if (musicSearchArtist != null) {
                    A0i = ((C61094Jx5) musicSearchArtist.A01).A03;
                    break;
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            case 9:
                C62925Kod kod = this.A0D;
                if (kod != null) {
                    StringBuilder A1A = AnonymousClass7TE.A1A();
                    A1A.append(AnonymousClass000.A00(2819));
                    A0i = AnonymousClass7TF.A0i(((C61095Jx6) kod.A00).A00, A1A);
                    break;
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            default:
                A0i = null;
                break;
        }
        A0i = jv7.A01;
        String str = null;
        if (A0i == null) {
            return null;
        }
        Integer num2 = this.A0G;
        if (num2 != null) {
            str = C49008Enk.A00(num2);
        }
        return 002.A0T(A0i, str, '_');
    }

    /* JADX WARNING: type inference failed for: r0v27, types: [X.Kod, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v28, types: [X.LuH, java.lang.Object] */
    public final void A02() {
        Integer num;
        Boolean Cde;
        TrackDataImpl trackDataImpl = this.A08;
        if (trackDataImpl != null) {
            this.A0H = new JVX(trackDataImpl);
        }
        OriginalSoundData originalSoundData = this.A05;
        if (originalSoundData != null) {
            this.A0F = new DHT(originalSoundData);
        }
        OriginalSoundData originalSoundData2 = this.A06;
        if (originalSoundData2 != null) {
            this.A0I = new DHT(originalSoundData2);
        }
        C61094Jx5 jx5 = this.A02;
        MusicSearchPlaylistType musicSearchPlaylistType = null;
        if (jx5 != null) {
            this.A0B = new MusicSearchArtist(jx5);
        }
        C61111JxN jxN = this.A07;
        if (jxN != null) {
            this.A0E = new MusicSearchPlaylist(jxN);
        }
        BE3 be3 = this.A04;
        if (be3 != null) {
            ? obj = new Object();
            obj.A00 = be3;
            this.A0C = obj;
        }
        C61095Jx6 jx6 = this.A03;
        if (jx6 != null) {
            ? obj2 = new Object();
            obj2.A00 = jx6;
            this.A0D = obj2;
        }
        JVX jvx = this.A0H;
        if (jvx != null) {
            TrackMetadata trackMetadata = this.A09;
            if (!(trackMetadata == null || (Cde = trackMetadata.Cde()) == null)) {
                jvx.A02 = Cde.booleanValue();
            }
            jvx.A00 = this.A0A;
        }
        if (A00() != null) {
            num = AnonymousClass05K.A01;
        } else if (this.A01 != null) {
            num = AnonymousClass05K.A0C;
        } else if (this.A00 != null) {
            num = AnonymousClass05K.A0N;
        } else {
            MusicSearchPlaylist musicSearchPlaylist = this.A0E;
            if (musicSearchPlaylist != null) {
                List Bf2 = musicSearchPlaylist.A00().Bf2();
                if (Bf2 == null || Bf2.isEmpty()) {
                    num = AnonymousClass05K.A0u;
                } else {
                    MusicSearchPlaylist musicSearchPlaylist2 = this.A0E;
                    if (musicSearchPlaylist2 != null) {
                        musicSearchPlaylistType = musicSearchPlaylist2.A01();
                    }
                    if (musicSearchPlaylistType == MusicSearchPlaylistType.ARTIST_SPOTLIGHT) {
                        num = AnonymousClass05K.A0Y;
                    } else {
                        num = AnonymousClass05K.A0j;
                    }
                }
            } else if (this.A0C != null) {
                num = AnonymousClass05K.A15;
            } else if (this.A0D != null) {
                num = AnonymousClass05K.A1I;
            } else if (this.A0B != null) {
                num = AnonymousClass05K.A1F;
            } else {
                num = AnonymousClass05K.A00;
            }
        }
        this.A0G = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !DbY.A1b(this, obj)) {
            return false;
        }
        return 0qQ.A0K(A01(), ((JZC) obj).A01());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{A01()});
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.LuH, java.lang.Object] */
    public JZC(DSN dsn) {
        0qQ.A0B(dsn, 1);
        C66566MWu BdJ = dsn.BdJ();
        if (BdJ != null) {
            this.A0E = new MusicSearchPlaylist(BdJ);
        }
        C66563MWr AmG = dsn.AmG();
        if (AmG != null) {
            ? obj = new Object();
            obj.A00 = AmG;
            this.A0C = obj;
        }
        A02();
    }

    public JZC() {
    }
}
