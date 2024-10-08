package X;

import com.instagram.model.direct.DirectThreadKey;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;

public final /* synthetic */ class DH7 implements B1V {
    public final /* synthetic */ AnonymousClass7Z6 A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    public /* synthetic */ DH7(AnonymousClass7Z6 r1, String str, String str2, String str3, String str4, boolean z) {
        this.A00 = r1;
        this.A05 = z;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
    }

    public final 1bp AXP(C70621ODs oDs, DirectThreadKey directThreadKey, Boolean bool, Long l) {
        AnonymousClass7Z6 r0 = this.A00;
        boolean z = this.A05;
        String str = this.A01;
        String str2 = this.A02;
        String str3 = this.A03;
        String str4 = this.A04;
        1bp r6 = new 1bp(C66669Mac.A05(r0.A00, oDs, AnonymousClass1eE.class, str, z), directThreadKey, l, AnonymousClass7TG.A0H());
        String format = String.format(Locale.US, "https://www.instagram.com/_n/reels_audio_page?audio_id=%s", Arrays.copyOf(new Object[]{str4}, 1));
        0qQ.A07(format);
        r6.A02 = Collections.singletonList(C71152OeO.A0I(str2, str3, format));
        r6.A01 = str4;
        return r6;
    }
}
