package X;

import android.view.View;
import android.widget.ScrollView;

/* renamed from: X.Umj  reason: case insensitive filesystem */
public final class C16002Umj extends C15308UaF {
    public static final String __redex_internal_original_name = "LeadGenCustomQuestionWithBaseFragment";
    public View A00;
    public ScrollView A01;
    public AnonymousClass3E6 A02;
    public final C252213ok A03 = new WTW(this, 5);
    public final AnonymousClass0eM A04;

    public final String getModuleName() {
        return "lead_gen_custom_question_fragment";
    }

    public C16002Umj() {
        C20700WxW wxW = new C20700WxW(this, 2);
        AnonymousClass0eM A002 = C20700WxW.A00(new C20691WxN(this, 49), 0eO.A02, 0);
        this.A04 = new C227862kA(new C20700WxW(A002, 1), wxW, new C20612Wvt(17, (Object) null, A002), new 0Yh(C16049Unc.class));
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(63584055);
        super.onDestroy();
        AnonymousClass3E6 r0 = this.A02;
        if (r0 != null) {
            r0.onDestroy();
        }
        AnonymousClass0fD.A09(226435499, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(837680655);
        super.onDestroyView();
        this.A00 = null;
        this.A01 = null;
        AnonymousClass3E6 r1 = this.A02;
        if (r1 != null) {
            r1.EEH(this.A03);
        }
        AnonymousClass0fD.A09(1803010341, A022);
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(-1589748918);
        super.onStart();
        AnonymousClass3E6 r0 = this.A02;
        if (r0 != null) {
            JTP.A17(this, r0);
        }
        AnonymousClass0fD.A09(1825315785, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(-1346289967);
        super.onStop();
        AnonymousClass3E6 r0 = this.A02;
        if (r0 != null) {
            r0.onStop();
        }
        AnonymousClass0fD.A09(-1227971251, A022);
    }
}
