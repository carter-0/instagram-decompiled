package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;

/* renamed from: X.MmD  reason: case insensitive filesystem */
public final class C67337MmD {
    public C255773uh A00;
    public C250973mM A01;
    public String A02;
    public boolean A03;
    public final float A04;
    public final float A05;
    public final Context A06;
    public final 2cs A07;
    public final UserSession A08;
    public final C67339MmF A09;
    public final C273394mV A0A;
    public final C67340MmG A0B;
    public final C67338MmE A0C;
    public final String A0D;
    public final AnonymousClass0eM A0E;
    public final AnonymousClass0eM A0F = AnonymousClass0eN.A01(new C73901Plc(this, 4));
    public final float A0G;
    public final View A0H;
    public final C252203oj A0I;

    public C67337MmD(View view, UserSession userSession, C273394mV r10, C67338MmE mmE, String str, String str2, float f) {
        int A032 = DbW.A03(2, str, str2);
        this.A08 = userSession;
        this.A0D = str;
        this.A0H = view;
        this.A04 = f;
        this.A0A = r10;
        this.A0C = mmE;
        Context context = view.getContext();
        this.A06 = context;
        NC9 nc9 = new NC9(this, 2);
        this.A0I = nc9;
        2cs A022 = C61340me.A00().A02();
        A022.A06 = true;
        A022.A0A(nc9);
        this.A07 = A022;
        this.A0E = AnonymousClass0eN.A01(new C73901Plc(this, A032));
        this.A0B = new C67340MmG(DbU.A0Z(view, R.id.story_viewer_scrubber_view_stub), this);
        Resources resources = view.getResources();
        this.A0G = ((float) resources.getDisplayMetrics().widthPixels) / ((float) resources.getDisplayMetrics().heightPixels);
        0qQ.A07(context);
        this.A05 = 0nA.A04(context, 6);
        this.A09 = new C67339MmF(userSession, str);
        this.A02 = "unknown";
    }

    public static final void A00(C67337MmD mmD) {
        if (mmD.A03) {
            C67340MmG mmG = mmD.A0B;
            ReboundViewPager reboundViewPager = (ReboundViewPager) mmG.A03.getValue();
            int measuredWidth = mmD.A0H.getMeasuredWidth();
            int measuredHeight = (int) (mmD.A0G * ((float) AnonymousClass7TE.A0c(mmG.A02).getMeasuredHeight()));
            AnonymousClass0eM r3 = mmD.A0E;
            if (measuredHeight != ((C67342MmI) r3.getValue()).A00) {
                ((C67342MmI) r3.getValue()).A00 = measuredHeight;
                reboundViewPager.A0C = measuredHeight;
                float f = (float) measuredWidth;
                float f2 = mmD.A05;
                reboundViewPager.A0M(((int) (f / (((float) measuredHeight) + (2.0f * f2)))) + 1, false);
                reboundViewPager.A0J = new AnonymousClass4HC(measuredHeight, (int) f2, 0.8f);
            }
            int A002 = ((C67342MmI) r3.getValue()).A00(mmD.A00);
            reboundViewPager.A0H((float) A002);
            C52088GEi gEi = (C52088GEi) 00k.A0O(((C67342MmI) r3.getValue()).A01, A002);
            if (gEi != null) {
                mmD.A09.A00(gEi.A01, (long) A002);
            }
        }
    }
}
