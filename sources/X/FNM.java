package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.newsfeed.fragment.NewsfeedFragment;

public final class FNM implements View.OnClickListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ ViewGroup A01;
    public final /* synthetic */ NewsfeedFragment A02;

    public FNM(ViewGroup viewGroup, NewsfeedFragment newsfeedFragment, float f) {
        this.A01 = viewGroup;
        this.A00 = f;
        this.A02 = newsfeedFragment;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(34589764);
        ViewGroup viewGroup = this.A01;
        C71392co r0 = C315596kB.A02;
        C294975nL A012 = C294975nL.A01(viewGroup, 0);
        A012.A0G();
        A012.A0T(viewGroup.getTranslationY(), this.A00);
        A012.A03 = 8;
        A012.A0H();
        C49646F0d f0d = (C49646F0d) this.A02.A09.getValue();
        0xa r11 = f0d.A03;
        String str = "NF_REACHABILITY_UPSELL_DISMISS_COUNTER";
        String str2 = str;
        String str3 = f0d.A04;
        int length = str3.length();
        if (length != 0) {
            str2 = 002.A0g(str3, "::", str);
        }
        int i = r11.getInt(str2, 0) + 1;
        long A0R = AnonymousClass7TE.A0R(f0d.A06.invoke());
        C51910G7e g7e = f0d.A01;
        long AK3 = g7e.AK3(i) + A0R;
        0xY AR4 = r11.AR4();
        if (g7e.CRT()) {
            if (length != 0) {
                str = 002.A0g(str3, "::", str);
            }
            AR4.E5Z(str, i);
        }
        String AK4 = g7e.AK4();
        if (length != 0) {
            AK4 = 002.A0g(str3, "::", AK4);
        }
        AR4.E5c(AK4, AK3);
        AR4.apply();
        NewsfeedFragment.A0D = true;
        AnonymousClass0fD.A0C(382065877, A05);
    }
}
