package X;

import android.app.Dialog;
import android.content.Context;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.igds.components.headline.IgdsHeadline;

/* renamed from: X.Pn2  reason: case insensitive filesystem */
public final class C73984Pn2 extends 0Yg implements 0sP {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C270284gU A02;
    public final /* synthetic */ C53398GnV A03;
    public final /* synthetic */ C53398GnV A04;
    public final /* synthetic */ C53398GnV A05;
    public final /* synthetic */ AnonymousClass0iw A06;
    public final /* synthetic */ ImageUrl A07;
    public final /* synthetic */ Integer A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ boolean A0B;
    public final /* synthetic */ boolean A0C;
    public final /* synthetic */ boolean A0D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73984Pn2(Context context, View view, C270284gU r4, C53398GnV gnV, C53398GnV gnV2, C53398GnV gnV3, AnonymousClass0iw r8, ImageUrl imageUrl, Integer num, String str, String str2, boolean z, boolean z2, boolean z3) {
        super(1);
        this.A00 = context;
        this.A0A = str;
        this.A09 = str2;
        this.A0D = z;
        this.A03 = gnV;
        this.A04 = gnV2;
        this.A05 = gnV3;
        this.A01 = view;
        this.A07 = imageUrl;
        this.A0B = z2;
        this.A0C = z3;
        this.A02 = r4;
        this.A08 = num;
        this.A06 = r8;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ViewGroup viewGroup;
        C358248ab A0Y = DbS.A0Y(this.A00);
        C71250OgH.A00(A0Y, this.A02, 0);
        A0Y.A05 = this.A0A;
        String str = this.A09;
        if (!(str == null || str.length() == 0)) {
            if (!this.A0D) {
                A0Y.A0q(str);
            } else {
                Spanned fromHtml = Html.fromHtml(str);
                0qQ.A07(fromHtml);
                A0Y.A0q(fromHtml);
            }
        }
        C53398GnV gnV = this.A03;
        if (gnV != null) {
            String str2 = gnV.A04;
            if (str2.length() > 0) {
                String str3 = gnV.A03;
                A0Y.A0V(C71249OgE.A00(gnV, 9), C69827Nso.A00((Integer) gnV.A02), str2, str3, gnV.A05);
            }
        }
        C53398GnV gnV2 = this.A04;
        if (gnV2 != null) {
            String str4 = gnV2.A04;
            if (str4.length() > 0) {
                String str5 = gnV2.A03;
                A0Y.A0T(C71249OgE.A00(gnV2, 10), C69827Nso.A00((Integer) gnV2.A02), str4, str5, gnV2.A05);
            }
        }
        C53398GnV gnV3 = this.A05;
        if (gnV3 != null) {
            String str6 = gnV3.A04;
            if (str6.length() > 0) {
                String str7 = gnV3.A03;
                A0Y.A0U(C71249OgE.A00(gnV3, 11), C69827Nso.A00((Integer) gnV3.A02), str6, str7, gnV3.A05);
            }
        }
        View view = this.A01;
        if (view != null) {
            if (view.getParent() != null) {
                ViewParent parent = view.getParent();
                if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                    viewGroup.removeView(view);
                }
            }
            A0Y.A0k(view);
        }
        ImageUrl imageUrl = this.A07;
        if (imageUrl != null) {
            Integer num = this.A08;
            AnonymousClass0iw r8 = this.A06;
            if (num != null) {
                A0Y.A08 = true;
                IgdsHeadline igdsHeadline = A0Y.A0Z;
                igdsHeadline.setCircularImageUrl(imageUrl, (String) null, r8, num, (View.OnClickListener) null);
                igdsHeadline.setVisibility(0);
                A0Y.A09 = true;
            } else {
                A0Y.A0n(imageUrl, r8);
            }
        }
        A0Y.A0r(this.A0B);
        A0Y.A0s(this.A0C);
        Dialog A022 = A0Y.A02();
        AnonymousClass0fN.A00(A022);
        return new GP2(A022, 16);
    }
}
