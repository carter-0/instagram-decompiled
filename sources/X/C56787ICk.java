package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import java.lang.ref.WeakReference;

/* renamed from: X.ICk  reason: case insensitive filesystem */
public final class C56787ICk implements View.OnClickListener {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ ImageUrl A01;
    public final /* synthetic */ 1Xj A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ WeakReference A0B;

    public C56787ICk(UserSession userSession, ImageUrl imageUrl, 1Xj r3, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, WeakReference weakReference) {
        this.A00 = userSession;
        this.A0B = weakReference;
        this.A07 = str;
        this.A08 = str2;
        this.A05 = str3;
        this.A09 = str4;
        this.A0A = str5;
        this.A04 = num;
        this.A06 = str6;
        this.A03 = num2;
        this.A01 = imageUrl;
        this.A02 = r3;
    }

    public final void onClick(View view) {
        int A052 = AnonymousClass0fD.A05(-667517396);
        UserSession userSession = this.A00;
        WeakReference weakReference = this.A0B;
        String str = this.A07;
        String str2 = this.A08;
        String str3 = this.A05;
        GPK gpk = GPK.UFI_RESHARE_SHEET;
        String str4 = this.A09;
        String str5 = this.A0A;
        Integer num = this.A04;
        String str6 = this.A06;
        I4E.A00(gpk, userSession, this.A01, this.A02, num, this.A03, str, str2, str3, str4, str5, str6, weakReference);
        AnonymousClass0fD.A0C(654995430, A052);
    }
}
