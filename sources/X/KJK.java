package X;

import android.os.Build;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.ClipInfo;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class KJK extends 0ng {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C53401GnY A02;
    public final /* synthetic */ Medium A03;
    public final /* synthetic */ C60926Jtk A04;
    public final /* synthetic */ AnonymousClass7IG A05;
    public final /* synthetic */ C381779cJ A06;
    public final /* synthetic */ AnonymousClass3Q2 A07;
    public final /* synthetic */ Long A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ ConcurrentLinkedQueue A0A;
    public final /* synthetic */ boolean A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KJK(C53401GnY gnY, Medium medium, C60926Jtk jtk, AnonymousClass7IG r7, C381779cJ r8, AnonymousClass3Q2 r9, Long l, String str, ConcurrentLinkedQueue concurrentLinkedQueue, int i, int i2, boolean z) {
        super(117, 2, false, false);
        this.A03 = medium;
        this.A05 = r7;
        this.A07 = r9;
        this.A04 = jtk;
        this.A00 = i;
        this.A0A = concurrentLinkedQueue;
        this.A09 = str;
        this.A02 = gnY;
        this.A08 = l;
        this.A01 = i2;
        this.A0B = z;
        this.A06 = r8;
    }

    public final void run() {
        String str;
        MediaUploadMetadata mediaUploadMetadata;
        Medium medium = this.A03;
        C59796JYp A012 = C59796JYp.A01(medium.A0X, 0);
        0qQ.A07(A012);
        if (medium.A0G.A0B || Build.VERSION.SDK_INT < 29) {
            str = medium.A0a;
        } else {
            str = medium.A02().toString();
        }
        AnonymousClass7IG r9 = this.A05;
        boolean z = false;
        if (ABQ.A01(A012, r9.A06, false, true)) {
            String str2 = A012.A07;
            0qQ.A07(str2);
            long j = A012.A03;
            UserSession userSession = r9.A02;
            ClipInfo A032 = Q0X.A03(userSession, str2, j, 90000);
            A032.A00 = ((float) A032.A09) / ((float) A032.A06);
            MediaUploadMetadata mediaUploadMetadata2 = A032.A0B;
            AnonymousClass3Q2 r6 = this.A07;
            if (r6 != null) {
                mediaUploadMetadata = r6.A13;
            } else {
                mediaUploadMetadata = null;
            }
            mediaUploadMetadata2.A00(mediaUploadMetadata);
            A032.A0B.A00(medium.A0G);
            A032.A0B.A00(C59778JXx.A00(r9.A01, medium.A02(), userSession, medium.A0X));
            AnonymousClass3Q2 r0 = this.A04.A01;
            if (r0 != null && r0.A5F) {
                z = true;
            }
            A032.A0I = z;
            int i = this.A00;
            if (i == -1) {
                int i2 = this.A01;
                boolean z2 = this.A0B;
                11Z.A02(new MAH(this.A02, r9, this.A06, A032, this.A08, str, i2, z2));
            } else if (str != null) {
                KR1 kr1 = new KR1(A032, r6, str);
                ConcurrentLinkedQueue concurrentLinkedQueue = this.A0A;
                concurrentLinkedQueue.offer(AnonymousClass7TE.A1L(Integer.valueOf(i), kr1));
                AnonymousClass7IG.A01(this.A02, r9, this.A08, this.A09, concurrentLinkedQueue);
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
    }
}
