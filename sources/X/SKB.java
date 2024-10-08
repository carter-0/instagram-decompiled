package X;

import androidx.media3.extractor.metadata.id3.TextInformationFrame;
import com.google.common.collect.ImmutableList;

public abstract class SKB {
    public static int A00(C11389SRd sRd) {
        int A01 = sRd.A01();
        if (sRd.A01() == 1684108385) {
            sRd.A0P(8);
            int i = A01 - 16;
            if (i == 1) {
                return sRd.A05();
            }
            if (i == 2) {
                return sRd.A08();
            }
            if (i == 3) {
                return sRd.A06();
            }
            if (i == 4 && (sRd.A02[sRd.A01] & 255 & 128) == 0) {
                return sRd.A07();
            }
        }
        STH.A03("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    public static TextInformationFrame A01(C11389SRd sRd, String str, int i) {
        int A01 = sRd.A01();
        if (sRd.A01() == 1684108385 && A01 >= 22) {
            sRd.A0P(10);
            int A08 = sRd.A08();
            if (A08 > 0) {
                String A0O = 002.A0O("", A08);
                int A082 = sRd.A08();
                if (A082 > 0) {
                    A0O = 002.A0b(A0O, "/", A082);
                }
                return new TextInformationFrame(str, (String) null, ImmutableList.of(A0O));
            }
        }
        C11340SNw.A01(i, "Failed to parse index/count attribute: ");
        return null;
    }

    public static TextInformationFrame A02(C11389SRd sRd, String str, int i) {
        int A01 = sRd.A01();
        if (sRd.A01() == 1684108385) {
            sRd.A0P(8);
            return new TextInformationFrame(str, (String) null, ImmutableList.of(sRd.A0G(A01 - 16)));
        }
        C11340SNw.A01(i, "Failed to parse text attribute: ");
        return null;
    }
}
