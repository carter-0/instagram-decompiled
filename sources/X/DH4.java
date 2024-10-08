package X;

import com.instagram.api.schemas.MessagingOffPlatformShareType;
import com.instagram.model.direct.DirectThreadKey;

public final /* synthetic */ class DH4 implements B1V {
    public final /* synthetic */ MessagingOffPlatformShareType A00;
    public final /* synthetic */ AnonymousClass7Z6 A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    public /* synthetic */ DH4(MessagingOffPlatformShareType messagingOffPlatformShareType, AnonymousClass7Z6 r2, String str, String str2, String str3, boolean z) {
        this.A01 = r2;
        this.A05 = z;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A00 = messagingOffPlatformShareType;
    }

    public final 1bp AXP(C70621ODs oDs, DirectThreadKey directThreadKey, Boolean bool, Long l) {
        AnonymousClass7Z6 r3 = this.A01;
        boolean z = this.A05;
        String str = this.A02;
        String str2 = this.A03;
        String str3 = this.A04;
        MessagingOffPlatformShareType messagingOffPlatformShareType = this.A00;
        DirectThreadKey directThreadKey2 = directThreadKey;
        Long l2 = l;
        1bp r32 = new 1bp(C66669Mac.A04(r3.A00, oDs, AnonymousClass1lH.class, str, (String) null, z), directThreadKey2, l2, AnonymousClass7TG.A0H());
        r32.A01 = str2;
        r32.A02 = str3;
        r32.A00 = messagingOffPlatformShareType;
        return r32;
    }
}
