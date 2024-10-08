package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.contentnotes.data.immersive.params.ContentNotesImmersiveMimicryParams;
import java.lang.ref.WeakReference;

/* renamed from: X.Ioh  reason: case insensitive filesystem */
public final class C58239Ioh extends 0Yg implements C62320sa {
    public final /* synthetic */ GPK A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ ImageUrl A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ WeakReference A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58239Ioh(GPK gpk, UserSession userSession, ImageUrl imageUrl, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, WeakReference weakReference) {
        super(0);
        this.A01 = userSession;
        this.A0B = weakReference;
        this.A07 = str;
        this.A08 = str2;
        this.A05 = str3;
        this.A00 = gpk;
        this.A09 = str4;
        this.A0A = str5;
        this.A04 = num;
        this.A06 = str6;
        this.A03 = num2;
        this.A02 = imageUrl;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        C71071Oaq oaq = C71071Oaq.A00;
        UserSession userSession = this.A01;
        WeakReference weakReference = this.A0B;
        String str = this.A07;
        String str2 = this.A08;
        String str3 = this.A05;
        GPK gpk = this.A00;
        String str4 = this.A09;
        String str5 = this.A0A;
        Integer num = this.A04;
        String str6 = this.A06;
        oaq.A02(userSession, new N2M(gpk, this.A02, (ContentNotesImmersiveMimicryParams) null, num, this.A03, str, str2, str3, str4, str5, str6, (String) null, false), weakReference);
        return C60340gF.A00;
    }
}
