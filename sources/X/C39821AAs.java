package X;

import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import java.util.List;

/* renamed from: X.AAs  reason: case insensitive filesystem */
public abstract class C39821AAs {
    public static final AnonymousClass51R A00(C349307zv r5, int i, int i2, int i3) {
        0qQ.A0B(r5, 0);
        return A01(r5, r5.A06(), i, i2, 0, i2, i3);
    }

    public static final AnonymousClass51R A01(C349307zv r32, String str, int i, int i2, int i3, int i4, int i5) {
        int i6;
        int i7 = i2;
        if (AnonymousClass7TF.A1R(i7)) {
            int i8 = i3;
            if (i3 < 0 || i8 > i7) {
                throw AnonymousClass7TE.A0w("Failed requirement.");
            }
            int i9 = i4;
            if (1 > i9 || i9 > i7 || i8 >= i9) {
                throw AnonymousClass7TE.A0w("Failed requirement.");
            }
            C349307zv r13 = r32;
            String str2 = r13.A0k;
            String str3 = r13.A0h;
            long j = r13.A0M;
            int i10 = r13.A0K;
            int i11 = r13.A08;
            Integer num = r13.A0b;
            if (num != null) {
                i6 = num.intValue();
            } else {
                i6 = 3;
            }
            int i12 = r13.A09;
            String str4 = r13.A0f;
            int i13 = r13.A01;
            MediaUploadMetadata A02 = r13.A02();
            boolean z = r13.A1L;
            String str5 = r13.A0r;
            List list = r13.A0w;
            Boolean bool = r13.A0Y;
            if (bool == null) {
                Medium medium = r13.A0R;
                if (medium != null) {
                    bool = medium.A0K;
                } else {
                    bool = null;
                }
            }
            return new AnonymousClass51R(A02, bool, str2, str2, str3, str4, str, str5, list, i10, i11, i6, i12, i13, i, i7, i8, i9, i5, j, z);
        }
        throw AnonymousClass7TE.A0w("Failed requirement.");
    }
}
