package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.feed.media.CreativeConfigIntf;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import java.io.File;
import java.net.URI;
import java.util.List;

/* renamed from: X.OsP  reason: case insensitive filesystem */
public final class C71881OsP implements C74383Pty {
    public final /* synthetic */ C271374ik A00;
    public final /* synthetic */ C271434iq A01;
    public final /* synthetic */ OLA A02;
    public final /* synthetic */ OCL A03;

    public final /* synthetic */ void DCq(String str, int i, String str2) {
        0qQ.A0B(str, 1);
        this.A03.A00.post(new PWR(this.A02));
    }

    public final void Dog(String str, boolean z) {
        String str2 = str;
        0qQ.A0B(str2, 0);
        C271374ik r12 = this.A00;
        C271434iq r0 = this.A01;
        String canonicalPath = new File(URI.create(str2)).getCanonicalPath();
        String str3 = r0.A0F;
        Long l = r0.A0C;
        float f = r0.A01;
        Integer num = r0.A0B;
        CreativeConfigIntf creativeConfigIntf = r0.A00;
        String str4 = r0.A0G;
        long j = r0.A02;
        boolean z2 = r0.A0N;
        boolean z3 = r0.A0Q;
        boolean z4 = r0.A0P;
        String str5 = r0.A0H;
        AnonymousClass3WR r10 = r0.A09;
        ImageInfo imageInfo = r0.A06;
        String str6 = r0.A0I;
        boolean z5 = r0.A0R;
        boolean z6 = r0.A0S;
        boolean z7 = r0.A0T;
        boolean z8 = r0.A0V;
        1iA r9 = r0.A07;
        Long l2 = r0.A0D;
        MusicOverlayStickerModel musicOverlayStickerModel = r0.A08;
        String str7 = r0.A0L;
        Long l3 = r0.A0E;
        List list = r0.A0M;
        ImageUrl imageUrl = r0.A04;
        C635813i r2 = r0.A03;
        C271424ip r1 = r0.A05;
        DbW.A1P(str4, 5, r10);
        0qQ.A0B(r9, 20);
        0qQ.A0B(list, 25);
        0qQ.A0B(r2, 27);
        r12.A04 = new C271434iq(r2, imageUrl, r1, creativeConfigIntf, imageInfo, r9, musicOverlayStickerModel, r10, num, l, l2, l3, str3, str4, str5, str6, canonicalPath, str7, list, f, j, z2, true, z3, z4, z5, z6, z7, z8);
        this.A03.A00.post(new PWS(this.A02));
    }

    public C71881OsP(C271374ik r1, C271434iq r2, OLA ola, OCL ocl) {
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = ocl;
        this.A02 = ola;
    }
}
