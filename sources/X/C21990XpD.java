package X;

import android.util.Base64;
import androidx.media3.common.Metadata;
import androidx.media3.extractor.metadata.flac.PictureFrame;
import androidx.media3.extractor.metadata.flac.VorbisComment;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.XpD  reason: case insensitive filesystem */
public abstract class C21990XpD {
    public static C21364XYs A01(C11389SRd sRd, boolean z, boolean z2) {
        if (z) {
            A02(sRd, 3, false);
        }
        Charset charset = AnonymousClass2RN.A05;
        sRd.A0I(charset, (int) sRd.A0A());
        long A0A = sRd.A0A();
        String[] strArr = new String[((int) A0A)];
        for (int i = 0; ((long) i) < A0A; i++) {
            strArr[i] = sRd.A0I(charset, (int) sRd.A0A());
        }
        if (!z2 || (sRd.A05() & 1) != 0) {
            return new C21364XYs(strArr);
        }
        throw Pxf.A0L("framing bit expected to be set", (Throwable) null);
    }

    public static Metadata A00(List list) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            String[] split = str.split("=", 2);
            if (split.length != 2) {
                STH.A03("VorbisUtil", 002.A0R("Failed to parse Vorbis comment: ", str));
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    A1C.add(PictureFrame.A00(new C11389SRd(Base64.decode(split[1], 0))));
                } catch (RuntimeException e) {
                    STH.A05("VorbisUtil", "Failed to parse vorbis picture", e);
                }
            } else {
                A1C.add(new VorbisComment(split[0], split[1]));
            }
        }
        if (A1C.isEmpty()) {
            return null;
        }
        return new Metadata((List) A1C);
    }

    public static boolean A02(C11389SRd sRd, int i, boolean z) {
        String str;
        StringBuilder A1A;
        int A06 = Pxe.A06(sRd);
        if (A06 < 7) {
            if (!z) {
                A1A = AnonymousClass7TE.A1A();
                A1A.append("too short header: ");
                A1A.append(A06);
            }
            return false;
        }
        if (sRd.A05() != i) {
            if (!z) {
                A1A = AnonymousClass7TE.A1A();
                A1A.append("expected header type ");
                A1A.append(Integer.toHexString(i));
            }
        } else if (sRd.A05() == 118 && sRd.A05() == 111 && sRd.A05() == 114 && sRd.A05() == 98 && sRd.A05() == 105 && sRd.A05() == 115) {
            return true;
        } else {
            if (!z) {
                str = "expected characters 'vorbis'";
                throw Pxf.A0L(str, (Throwable) null);
            }
        }
        return false;
        str = A1A.toString();
        throw Pxf.A0L(str, (Throwable) null);
    }
}
