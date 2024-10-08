package X;

import android.net.Uri;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel;
import java.util.List;

/* renamed from: X.PSb  reason: case insensitive filesystem */
public final class C72992PSb implements 1aV {
    public final /* synthetic */ AnonymousClass77B A00;
    public final /* synthetic */ AnonymousClass77K A01;
    public final /* synthetic */ C66775McL A02;
    public final /* synthetic */ C66819MdB A03;
    public final /* synthetic */ C66809Mcv A04;

    public C72992PSb(AnonymousClass77B r1, AnonymousClass77K r2, C66775McL mcL, C66819MdB mdB, C66809Mcv mcv) {
        this.A01 = r2;
        this.A02 = mcL;
        this.A04 = mcv;
        this.A00 = r1;
        this.A03 = mdB;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        SimpleImageUrl simpleImageUrl;
        1aU A09;
        AnonymousClass77K r81 = this.A01;
        C66775McL mcL = this.A02;
        C66809Mcv mcv = this.A04;
        AnonymousClass77B r0 = this.A00;
        String url = ((ImageUrl) obj).getUrl();
        C66819MdB mdB = this.A03;
        if (url != null) {
            simpleImageUrl = DbS.A0V(url);
        } else {
            simpleImageUrl = null;
        }
        boolean z = r0.A0s;
        1aU r78 = r0.A09;
        1aU r11 = r0.A0C;
        if (simpleImageUrl == null) {
            A09 = 1aU.A00();
        } else {
            A09 = 1aU.A09(simpleImageUrl);
        }
        0qQ.A0A(A09);
        1aU A0L = r11.A0L(C72077Ovq.A00);
        UserSession userSession = r0.A0D;
        boolean z2 = r0.A0n;
        float f = r0.A02;
        String str = r0.A0U;
        String str2 = r0.A0T;
        2FW r76 = r0.A0G;
        1iA r75 = r0.A0I;
        int i = r0.A03;
        int i2 = r0.A05;
        int i3 = r0.A06;
        C300925yB r74 = r0.A0F;
        1Xj r73 = r0.A0E;
        String str3 = r0.A0S;
        String str4 = r0.A0N;
        boolean z3 = r0.A0m;
        boolean z4 = r0.A0q;
        boolean z5 = r0.A0i;
        boolean z6 = r0.A0d;
        1aU r72 = r0.A08;
        boolean z7 = r0.A0h;
        List list = r0.A0b;
        String str5 = r0.A0Z;
        boolean z8 = r0.A0j;
        Long l = r0.A0K;
        Boolean bool = r0.A0J;
        Long l2 = r0.A0L;
        PrivacyMediaOverlayViewModel privacyMediaOverlayViewModel = r0.A01;
        boolean z9 = r0.A0g;
        Long l3 = r0.A0M;
        int i4 = r0.A04;
        AnonymousClass79H r24 = r0.A00;
        boolean z10 = r0.A0p;
        String str6 = r0.A0a;
        Uri uri = r0.A07;
        String str7 = r0.A0Y;
        String str8 = r0.A0R;
        boolean z11 = r0.A0l;
        boolean z12 = r0.A0k;
        String str9 = r0.A0O;
        C254793t3 r14 = r0.A0H;
        boolean z13 = r0.A0o;
        boolean z14 = r0.A0c;
        String str10 = r0.A0V;
        String str11 = r0.A0X;
        boolean z15 = r0.A0e;
        boolean z16 = r0.A0f;
        boolean z17 = r0.A0r;
        String str12 = r0.A0Q;
        String str13 = r0.A0W;
        AnonymousClass7TG.A1S(A09, A0L);
        AnonymousClass77B r16 = new AnonymousClass77B(uri, r78, A09, A0L, r11, r72, userSession, r24, privacyMediaOverlayViewModel, r73, r74, r76, r14, r75, bool, l, l2, l3, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, list, f, i, i2, i3, i4, z, z2, z3, z4, z5, z6, z7, z8, z9, z10, z11, z12, z13, z14, z15, z16, z17);
        int i5 = mcv.A02;
        float f2 = mcv.A01;
        String str14 = mcv.A0C;
        C69605Non non = mcv.A09;
        String str15 = mcv.A0D;
        boolean z18 = mcv.A0I;
        boolean z19 = mcv.A0J;
        AnonymousClass7FE r8 = mcv.A08;
        AnonymousClass7FT r7 = mcv.A07;
        long j = mcv.A04;
        boolean z20 = mcv.A0F;
        int i6 = mcv.A03;
        C66809Mcv mcv2 = new C66809Mcv(simpleImageUrl, r16, r7, r8, non, mcv.A0A, mcv.A0E, str14, str15, mcv.A0B, f2, i5, i6, j, false, z, z18, z19, z20);
        mcv2.A00 = simpleImageUrl;
        AnonymousClass7TF.A0D().post(new C73386Pbj(r81, mcL, mdB, mcv2, mcv));
    }
}
