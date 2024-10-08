package X;

import android.widget.TextView;
import com.instagram.model.hashtag.HashtagImpl;

public final class Fl2 implements XC1 {
    public final /* synthetic */ FGB A00;

    public final void D9S(AnonymousClass0iw r1, C66942Mfb mfb, C66967Mg0 mg0) {
    }

    public final void DIe(C69160Nfj nfj, C66967Mg0 mg0) {
        HashtagImpl hashtagImpl = nfj.A00;
        String str = hashtagImpl.A0C;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String str3 = hashtagImpl.A0D;
        if (str3 != null) {
            str2 = str3;
        }
        int i = mg0.A00;
        FGB fgb = this.A00;
        C47571E8j e8j = fgb.A00;
        if (e8j == null) {
            0qQ.A0F("suggestionsAdapter");
            throw AnonymousClass00P.createAndThrow();
        }
        String str4 = e8j.A00;
        AnonymousClass0iw r2 = fgb.A0A;
        AnonymousClass0xN A002 = C60510iO.A00(fgb.A0D);
        0xI A003 = 0xI.A00(r2, AnonymousClass000.A00(3803));
        A003.A0C("link_type", "hashtag");
        A003.A08(Integer.valueOf(i), "position");
        A003.A0C("link_id", str);
        A003.A0C("link_text", str2);
        if (str4 != null) {
            A003.A0C("rank_token", str4);
        }
        A002.EFq(A003);
        C294435mR.A00(fgb.A06, fgb.A0F, str2, false);
        TextView textView = fgb.A07;
        if (textView != null) {
            textView.setClickable(true);
            textView.setSelected(false);
        }
    }

    public Fl2(FGB fgb) {
        this.A00 = fgb;
    }
}
