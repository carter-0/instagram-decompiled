package X;

import android.content.Context;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.metadata.ImmersiveMediaFields;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class M0D implements MUR {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C53401GnY A02;
    public final /* synthetic */ Medium A03;
    public final /* synthetic */ AnonymousClass7IG A04;
    public final /* synthetic */ C381779cJ A05;
    public final /* synthetic */ AnonymousClass3Q2 A06;
    public final /* synthetic */ Long A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ ConcurrentLinkedQueue A09;
    public final /* synthetic */ boolean A0A;

    public final void DX1(Exception exc) {
    }

    public M0D(C53401GnY gnY, Medium medium, AnonymousClass7IG r3, C381779cJ r4, AnonymousClass3Q2 r5, Long l, String str, ConcurrentLinkedQueue concurrentLinkedQueue, int i, int i2, boolean z) {
        this.A04 = r3;
        this.A00 = i;
        this.A09 = concurrentLinkedQueue;
        this.A01 = i2;
        this.A08 = str;
        this.A0A = z;
        this.A03 = medium;
        this.A06 = r5;
        this.A05 = r4;
        this.A02 = gnY;
        this.A07 = l;
    }

    public final void DX2(C352218Cl r28) {
        String str;
        String str2;
        AnonymousClass7IG r7 = this.A04;
        int i = this.A00;
        ConcurrentLinkedQueue concurrentLinkedQueue = this.A09;
        int i2 = this.A01;
        String str3 = this.A08;
        boolean z = this.A0A;
        Medium medium = this.A03;
        String str4 = medium.A0X;
        MediaUploadMetadata mediaUploadMetadata = medium.A0G;
        AnonymousClass3Q2 r2 = this.A06;
        C381779cJ r10 = this.A05;
        C53401GnY gnY = this.A02;
        Long l = this.A07;
        0qQ.A0B(concurrentLinkedQueue, 2);
        C352218Cl r8 = r28;
        if (!(str4 == null || str4.length() == 0)) {
            r8.A0k = str4;
        }
        MediaUploadMetadata mediaUploadMetadata2 = null;
        if (str4 != null) {
            C62948Kp0 A002 = C59737JVv.A00((Context) null, r7.A02, str4, true);
            if (A002 != null) {
                str = A002.A01();
                str2 = A002.A02();
            } else {
                str = null;
                str2 = null;
            }
            mediaUploadMetadata.A00(new MediaUploadMetadata((ImmersiveMediaFields) null, str, (String) null, (String) null, (String) null, (String) null, C364678lo.A05(str4), str2, (String) null, (String) null, (String) null, false));
        }
        r8.A01().A00(mediaUploadMetadata);
        MediaUploadMetadata A012 = r8.A01();
        if (r2 != null) {
            mediaUploadMetadata2 = r2.A13;
        }
        A012.A01(mediaUploadMetadata2);
        if (str4 != null) {
            r8.A01().A01(C59778JXx.A03(r7.A02, str4));
        }
        if (i != -1) {
            concurrentLinkedQueue.offer(AnonymousClass7TE.A1L(Integer.valueOf(i), new KR0(r2, r8)));
            AnonymousClass7IG.A01(gnY, r7, l, str3, concurrentLinkedQueue);
            return;
        }
        11Z.A02(new MAG(gnY, r7, r10, r2, r8, l, i2, z));
    }
}
