package X;

import com.instagram.model.direct.DirectThreadKey;
import com.instagram.pendingmedia.model.ClipInfo;
import java.util.concurrent.Callable;

/* renamed from: X.Asm  reason: case insensitive filesystem */
public final class C41365Asm implements Callable {
    public final /* synthetic */ AnonymousClass9JH A00;
    public final /* synthetic */ C53401GnY A01;
    public final /* synthetic */ C254933tI A02;
    public final /* synthetic */ C333537Zi A03;
    public final /* synthetic */ OCA A04;
    public final /* synthetic */ DirectThreadKey A05;
    public final /* synthetic */ ClipInfo A06;
    public final /* synthetic */ Boolean A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ boolean A0C;

    public C41365Asm(AnonymousClass9JH r1, C53401GnY gnY, C254933tI r3, C333537Zi r4, OCA oca, DirectThreadKey directThreadKey, ClipInfo clipInfo, Boolean bool, String str, String str2, String str3, String str4, boolean z) {
        this.A03 = r4;
        this.A01 = gnY;
        this.A05 = directThreadKey;
        this.A0C = z;
        this.A02 = r3;
        this.A0B = str;
        this.A04 = oca;
        this.A0A = str2;
        this.A08 = str3;
        this.A06 = clipInfo;
        this.A09 = str4;
        this.A07 = bool;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C333537Zi r4 = this.A03;
        C53401GnY gnY = this.A01;
        DirectThreadKey directThreadKey = this.A05;
        boolean z = this.A0C;
        C254933tI r3 = this.A02;
        String str = this.A0B;
        OCA oca = this.A04;
        String str2 = this.A0A;
        String str3 = this.A08;
        ClipInfo clipInfo = this.A06;
        String str4 = this.A09;
        C333537Zi.A01(gnY, r3, r4, oca, directThreadKey, str, str2, str3, new C41575Awh(this.A00, gnY, r3, r4, oca, directThreadKey, clipInfo, this.A07, str4, str, str2, str3, z), z);
        return C60340gF.A00;
    }
}
