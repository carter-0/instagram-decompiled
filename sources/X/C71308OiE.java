package X;

import android.view.View;
import com.instagram.util.fragment.IgFragmentFactoryImpl;

/* renamed from: X.OiE  reason: case insensitive filesystem */
public final class C71308OiE implements View.OnClickListener {
    public final /* synthetic */ C66762Mc7 A00;
    public final /* synthetic */ Integer A01;

    public C71308OiE(C66762Mc7 mc7, Integer num) {
        this.A00 = mc7;
        this.A01 = num;
    }

    public final void onClick(View view) {
        String str;
        int A05 = AnonymousClass0fD.A05(-2104462840);
        C66762Mc7 mc7 = this.A00;
        C3725791l r9 = mc7.A07;
        String str2 = mc7.A0D;
        if (str2 == null) {
            str = "threadIdV2";
        } else {
            String str3 = mc7.A0C;
            if (str3 == null) {
                str = "participantId";
            } else {
                String A002 = C69931NuX.A00(this.A01);
                String str4 = mc7.A0B;
                str = "adMediaId";
                if (str4 != null) {
                    C3725791l.A00(r9, "direct_in_thread_ctd_banner_thumbnail_click", str2, str3, DbY.A0p("media_id", str4, AnonymousClass7TE.A1L("cta_type", A002)));
                    IgFragmentFactoryImpl A003 = IgFragmentFactoryImpl.A00();
                    String str5 = mc7.A0B;
                    if (str5 != null) {
                        F3W A03 = A003.A03(str5);
                        A03.A0K = true;
                        A03.A0J = true;
                        Dba.A12(A03.A01(), DbS.A0M(mc7.A0E, mc7.A0G));
                        AnonymousClass0fD.A0C(-1535389870, A05);
                        return;
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
