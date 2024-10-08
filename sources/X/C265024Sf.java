package X;

import com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor2;
import java.util.List;

/* renamed from: X.4Sf  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C265024Sf implements C265034Sg {
    public final C264994Sc AMh(C256683wB r4, C264894Rs r5, C265994Xd r6, List list, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4) {
        AnonymousClass4XT r0;
        Integer num;
        String str = r4.A0S;
        if (2Kn.A05(str)) {
            return null;
        }
        if (str == null || (!str.startsWith("video/webm") && !str.startsWith("audio/webm") && !str.startsWith("application/webm") && !str.startsWith("video/x-matroska") && !str.startsWith("audio/x-matroska") && !str.startsWith("application/x-matroska"))) {
            int i3 = 0;
            if (z) {
                i3 = 4;
            }
            if (i2 == 2) {
                num = AnonymousClass05K.A01;
            } else {
                num = AnonymousClass05K.A00;
            }
            if (num == AnonymousClass05K.A01) {
                r0 = new FragmentedMp4Extractor2(r6, list, i3);
            } else {
                r0 = new AnonymousClass4XS(r6, list, i3, z3);
            }
        } else {
            try {
                r0 = (AnonymousClass4XT) Class.forName("com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor").getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return new C264994Sc(r4, r0, i);
    }
}
