package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import java.io.File;
import java.util.List;

/* renamed from: X.Aba  reason: case insensitive filesystem */
public final class C40403Aba implements C13754TgQ {
    public final /* synthetic */ ImmutableList A00;
    public final /* synthetic */ MediaUploadMetadata A01;
    public final /* synthetic */ C353498Hw A02;
    public final /* synthetic */ File A03;
    public final /* synthetic */ Boolean A04;
    public final /* synthetic */ Integer A05;
    public final /* synthetic */ Integer A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ List A09;

    public final void DtT(Exception exc, boolean z) {
        C353498Hw r1 = this.A02;
        r1.A1q.A00();
        C59767JXi jXi = r1.A0F;
        if (jXi != null) {
            jXi.A0H();
        }
        C59767JXi jXi2 = r1.A0F;
        if (jXi2 != null) {
            jXi2.A0F();
        }
        C353498Hw.A16(r1, exc, this.A08, "onTranscodingFail", z, false);
    }

    public C40403Aba(ImmutableList immutableList, MediaUploadMetadata mediaUploadMetadata, C353498Hw r3, File file, Boolean bool, Integer num, Integer num2, String str, String str2, List list) {
        this.A02 = r3;
        this.A05 = num;
        this.A01 = mediaUploadMetadata;
        this.A09 = list;
        this.A08 = str;
        this.A03 = file;
        this.A07 = str2;
        this.A00 = immutableList;
        this.A06 = num2;
        this.A04 = bool;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005c, code lost:
        r1 = r4.A1d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DtS(X.C349307zv r17, int r18) {
        /*
            r16 = this;
            r2 = r16
            X.8Hw r4 = r2.A02
            X.8Hv r0 = r4.A1q
            r0.A00()
            X.4DH r0 = r4.A1B
            androidx.fragment.app.FragmentActivity r0 = r0.getActivity()
            if (r0 == 0) goto L_0x0059
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L_0x0059
            java.lang.Integer r8 = r2.A05
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r8 != r0) goto L_0x005c
            X.8IQ r0 = r4.A1k
            X.87s r0 = r0.A03
            X.4gw r0 = r0.A04
            if (r0 == 0) goto L_0x005c
        L_0x0025:
            r5 = r17
            com.instagram.common.gallery.metadata.MediaUploadMetadata r1 = r5.A02()
            com.instagram.common.gallery.metadata.MediaUploadMetadata r0 = r2.A01
            r1.A00(r0)
            java.util.List r0 = r2.A09
            r5.A0w = r0
            java.io.File r6 = r2.A03
            java.lang.String r9 = r2.A07
            com.google.common.collect.ImmutableList r1 = r2.A00
            java.lang.Integer r0 = r2.A06
            if (r0 == 0) goto L_0x005a
            int r11 = r0.intValue()
            r0 = 54
            if (r11 != r0) goto L_0x005a
        L_0x0046:
            X.886 r3 = X.AnonymousClass886.A09
            java.lang.Boolean r7 = r2.A04
            r2 = 0
            r12 = 0
            r15 = 1
            r10 = r18
            r13 = r10
            r14 = r12
            X.C353498Hw.A0J(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            X.88V r0 = r4.A1o
            r0.A01()
        L_0x0059:
            return
        L_0x005a:
            r11 = 1
            goto L_0x0046
        L_0x005c:
            X.85M r1 = r4.A1d
            android.widget.FrameLayout r0 = r1.A00
            if (r0 == 0) goto L_0x0025
            X.AnonymousClass7TG.A19(r0, r1)
            r0 = 0
            r1.A00 = r0
            X.C353498Hw.A0m(r4)
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40403Aba.DtS(X.7zv, int):void");
    }
}
