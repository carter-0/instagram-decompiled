package X;

import android.util.Pair;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.ClipInfo;
import java.io.File;

/* renamed from: X.OvR  reason: case insensitive filesystem */
public final /* synthetic */ class C72052OvR implements AnonymousClass68Z {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C304566Ea A01;
    public final /* synthetic */ ClipInfo A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ Long A04;
    public final /* synthetic */ Long A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ boolean A08;

    public /* synthetic */ C72052OvR(C304566Ea r1, ClipInfo clipInfo, Integer num, Long l, Long l2, String str, String str2, long j, boolean z) {
        this.A01 = r1;
        this.A02 = clipInfo;
        this.A06 = str;
        this.A00 = j;
        this.A03 = num;
        this.A05 = l;
        this.A08 = z;
        this.A07 = str2;
        this.A04 = l2;
    }

    public final Object apply(Object obj) {
        String A022;
        C304566Ea r8 = this.A01;
        ClipInfo clipInfo = this.A02;
        String str = this.A06;
        long j = this.A00;
        Integer num = this.A03;
        Long l = this.A05;
        boolean z = this.A08;
        String str2 = this.A07;
        Long l2 = this.A04;
        Pair pair = (Pair) obj;
        C68314NAb nAb = (C68314NAb) pair.first;
        AnonymousClass67N r7 = (AnonymousClass67N) pair.second;
        String A023 = C304566Ea.A02(nAb, clipInfo.A0F);
        17k.A07(A023, "Failed to resolve video ID");
        int i = clipInfo.A09;
        int i2 = clipInfo.A06;
        int i3 = clipInfo.A05 - clipInfo.A07;
        UserSession userSession = r8.A03;
        File A002 = C64188LSv.A00(C60960kU.A00, clipInfo, str, i, i2);
        if (A002 == null) {
            A022 = null;
        } else {
            A022 = C304566Ea.A02(nAb, A002.getPath());
        }
        Integer valueOf = Integer.valueOf(i2);
        Integer valueOf2 = Integer.valueOf(i);
        String str3 = clipInfo.A0F;
        long A003 = clipInfo.A00();
        String A0k = DbS.A0k();
        boolean z2 = z;
        Long l3 = l;
        return 1aU.A07(new OxY(r7, userSession, valueOf, valueOf2, valueOf, valueOf2, num, l2, l3, "video/mp4", str3, A022, A023, str2, A0k, 4, i3, j, A003, z2), AnonymousClass6F9.A00("rxmailbox_send_secure_video_message"));
    }
}
