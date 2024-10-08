package X;

import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;

/* renamed from: X.Xr2  reason: case insensitive filesystem */
public abstract class C22012Xr2 {
    public static final String[] A00;

    public static Id3Frame A00(AnonymousClass4XV r3, String str, int i, boolean z, boolean z2) {
        int i2;
        r3.A0H(4);
        if (r3.A01() == 1684108385) {
            r3.A0H(8);
            i2 = r3.A02();
        } else {
            2AG.A04("MetadataUtil", Pxd.A00(493));
            i2 = -1;
        }
        if (z2) {
            i2 = Math.min(1, i2);
        }
        if (i2 < 0) {
            2AG.A04("MetadataUtil", 002.A0R(Pxd.A00(494), AnonymousClass4Y9.A00(i)));
            return null;
        } else if (z) {
            return new TextInformationFrame(str, (String) null, AnonymousClass4R7.A00(Integer.toString(i2)));
        } else {
            return new CommentFrame("und", str, Integer.toString(i2));
        }
    }

    static {
        String[] strArr = new String[192];
        System.arraycopy(new String[]{"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient"}, 0, strArr, 0, 27);
        System.arraycopy(new String[]{"Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk"}, 0, strArr, 27, 27);
        System.arraycopy(new String[]{"Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk"}, 0, strArr, 54, 27);
        System.arraycopy(new String[]{"Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass"}, 0, strArr, 81, 27);
        System.arraycopy(new String[]{"Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk"}, 0, strArr, 108, 27);
        System.arraycopy(new String[]{"Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo"}, 0, strArr, 135, 27);
        System.arraycopy(new String[]{"Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk"}, 0, strArr, 162, 27);
        System.arraycopy(new String[]{"Dubstep", "Garage Rock", "Psybient"}, 0, strArr, 189, 3);
        A00 = strArr;
    }

    public static TextInformationFrame A01(AnonymousClass4XV r4, String str, int i) {
        int A01 = r4.A01();
        if (r4.A01() == 1684108385 && A01 >= 22) {
            r4.A0H(10);
            int A05 = r4.A05();
            if (A05 > 0) {
                String A0O = 002.A0O("", A05);
                int A052 = r4.A05();
                if (A052 > 0) {
                    A0O = 002.A0b(A0O, "/", A052);
                }
                return new TextInformationFrame(str, (String) null, AnonymousClass4R7.A00(A0O));
            }
        }
        2AG.A04("MetadataUtil", 002.A0R(Pxd.A00(491), AnonymousClass4Y9.A00(i)));
        return null;
    }

    public static TextInformationFrame A02(AnonymousClass4XV r4, String str, int i) {
        int A01 = r4.A01();
        if (r4.A01() == 1684108385) {
            r4.A0H(8);
            return new TextInformationFrame(str, (String) null, AnonymousClass4R7.A00(r4.A0A(A01 - 16)));
        }
        2AG.A04("MetadataUtil", 002.A0R(Pxd.A00(492), AnonymousClass4Y9.A00(i)));
        return null;
    }
}
