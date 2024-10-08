package X;

import android.content.Context;
import android.widget.CompoundButton;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

public final class ESY extends PR9 {
    public final Context A00;
    public final CompoundButton.OnCheckedChangeListener A01;
    public final Fragment A02;
    public final UserSession A03;
    public final C49882FBg A04;
    public final String A05;
    public final C61410nE A06;
    public final 1Av A07;

    public ESY(Context context, Fragment fragment, UserSession userSession, C61410nE r7, 1Av r8, C49882FBg fBg, CharSequence charSequence, String str, boolean z) {
        super((CompoundButton.OnCheckedChangeListener) null, charSequence, z);
        FQO fqo = new FQO(this, 25);
        this.A01 = fqo;
        this.A05 = str;
        this.A08 = fqo;
        this.A00 = context;
        this.A03 = userSession;
        this.A02 = fragment;
        this.A04 = fBg;
        this.A07 = r8;
        this.A06 = r7;
        if (182.A06(0Tu.A05, userSession, 36316001482051424L) && new AnonymousClass3FW(userSession).A07(AnonymousClass7TG.A0I())) {
            this.A0D = true;
            this.A0E = true;
        }
    }

    public static void A00(CompoundButton compoundButton, ESY esy, String str) {
        double d;
        1Av r5;
        long currentTimeMillis;
        String str2 = str;
        boolean equals = str.equals("cancel");
        ESY esy2 = esy;
        C49882FBg fBg = esy.A04;
        String str3 = esy.A05;
        fBg.A01(str3, str, "toggle");
        if (equals) {
            r5 = esy.A07;
            currentTimeMillis = -1;
        } else {
            if ("15_minutes".equals(str)) {
                d = 0.25d;
            } else if ("1_hour".equals(str)) {
                d = 1.0d;
            } else if ("2_hour".equals(str)) {
                d = 2.0d;
            } else if ("4_hour".equals(str)) {
                d = 4.0d;
            } else if ("8_hour".equals(str)) {
                d = 8.0d;
            } else {
                d = 0.0d;
            }
            r5 = esy.A07;
            currentTimeMillis = System.currentTimeMillis() + ((long) (d * 60.0d * 60.0d * 1000.0d));
        }
        r5.A0j(currentTimeMillis);
        Context context = esy.A00;
        Fragment fragment = esy.A02;
        0gy A002 = AnonymousClass07i.A00(fragment);
        1OC A012 = F7X.A01(esy.A03, str3, str);
        A012.A00 = new EQV(compoundButton, fragment.mFragmentManager, esy2, str2, equals);
        1ES.A00(context, A002, A012);
    }
}
