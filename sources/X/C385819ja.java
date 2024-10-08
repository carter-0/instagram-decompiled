package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import java.io.File;
import java.util.List;

/* renamed from: X.9ja  reason: invalid class name and case insensitive filesystem */
public final class C385819ja extends 2Cn {
    public final /* synthetic */ Medium A00;
    public final /* synthetic */ C353498Hw A01;

    public final void onFail(Exception exc) {
        0qQ.A0B(exc, 0);
        C353498Hw.A16(this.A01, exc, String.valueOf(this.A00.A05), "prefillMedium failed", true, false);
    }

    public C385819ja(Medium medium, C353498Hw r2) {
        this.A01 = r2;
        this.A00 = medium;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C349307zv r6 = (C349307zv) obj;
        0qQ.A0B(r6, 0);
        if (r6.A07 <= 0) {
            onFail(AnonymousClass7TE.A15("video with <= 0 duration"));
            return;
        }
        C353498Hw r14 = this.A01;
        Boolean bool = (Boolean) r14.A1G.A05.A02();
        if (bool == null || !bool.booleanValue()) {
            r14.A07 = new C59721JVf(this.A00, r6);
            return;
        }
        String valueOf = String.valueOf(this.A00.A05);
        File A0t = AnonymousClass7TE.A0t(r6.A0k);
        int i = r6.A07;
        int i2 = r6.A0K;
        int i3 = r6.A08;
        int i4 = r6.A09;
        String A06 = r6.A06();
        ImmutableList of = ImmutableList.of();
        0qQ.A07(of);
        int A02 = C353498Hw.A02(r14);
        int i5 = r6.A07;
        if (A02 > i5) {
            A02 = i5;
        }
        Integer num = AnonymousClass05K.A01;
        boolean z = r6.A1L;
        String str = r6.A0r;
        MediaUploadMetadata A022 = r6.A02();
        List list = r6.A0w;
        int i6 = r6.A0F;
        int i7 = 54;
        if (i6 != 54) {
            i7 = 1;
        }
        C353498Hw.A0I(of, (ImmutableList) null, A022, r14, A0t, (Boolean) null, num, Integer.valueOf(i7), valueOf, A06, str, list, i, i2, i3, i4, 0, A02, true, z);
    }
}
