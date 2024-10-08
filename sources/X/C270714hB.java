package X;

import android.content.Context;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;

/* renamed from: X.4hB  reason: invalid class name and case insensitive filesystem */
public final class C270714hB extends 0Yg implements C62320sa {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C270694h9 A01;
    public final /* synthetic */ ClipsViewerConfig A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ C54575HJk A04;
    public final /* synthetic */ C270654h5 A05;
    public final /* synthetic */ GF2 A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ C62320sa A09;
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ boolean A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C270714hB(Context context, C270694h9 r3, ClipsViewerConfig clipsViewerConfig, UserSession userSession, C54575HJk hJk, C270654h5 r7, GF2 gf2, String str, String str2, C62320sa r11, boolean z, boolean z2) {
        super(0);
        this.A03 = userSession;
        this.A07 = str;
        this.A06 = gf2;
        this.A05 = r7;
        this.A08 = str2;
        this.A01 = r3;
        this.A02 = clipsViewerConfig;
        this.A0A = z;
        this.A0B = z2;
        this.A04 = hJk;
        this.A00 = context;
        this.A09 = r11;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        boolean A062 = 182.A06(0Tu.A05, this.A03, 36319776758308479L);
        String str = this.A07;
        GF2 gf2 = this.A06;
        C270654h5 r5 = this.A05;
        String str2 = this.A08;
        C270694h9 r3 = this.A01;
        ClipsViewerConfig clipsViewerConfig = this.A02;
        Integer num = clipsViewerConfig.A0b;
        boolean z = this.A0A;
        boolean z2 = this.A0B;
        C54575HJk hJk = this.A04;
        Context context = this.A00;
        String str3 = clipsViewerConfig.A0v;
        C62320sa r11 = this.A09;
        if (A062) {
            return new C270734hD(context, r3, hJk, r5, gf2, num, str, str2, str3, r11, z, z2);
        }
        return new C270734hD(context, r3, hJk, r5, gf2, num, str, str2, str3, r11, z, z2);
    }
}
