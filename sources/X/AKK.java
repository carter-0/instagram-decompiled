package X;

import android.content.DialogInterface;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import com.instagram.react.modules.base.IgReactQEModule;

public final class AKK implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;

    public AKK(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        JYD jyd;
        switch (this.A00) {
            case 0:
                AnonymousClass8BA.A06((AnonymousClass8BA) this.A01);
                return;
            case 1:
                C357088Wk.A03((C357088Wk) this.A01);
                return;
            case 2:
                jyd = (JYD) this.A01;
                29R r4 = 27p.A01(jyd.A0H).A09;
                1Ln A08 = 1Ln.A08(r4.A01);
                if (A08.A00.isSampled()) {
                    A08.A0t("IG_CAMERA_TAP_CANCEL_BUTTON");
                    A08.A0r("TAP_CANCEL_BUTTON");
                    29R.A00(A08, r4);
                    A08.A0M(r4.A0I(), "capture_type");
                    A08.A0b(r4.A04.A09);
                    A08.A0T();
                    A08.A0n(27x.A08.getModuleName());
                    A08.A0d(C59725JVj.PRE_CAPTURE);
                    AnonymousClass7TF.A18(A08);
                    A08.Cgf();
                    break;
                }
                break;
            case 3:
                jyd = (JYD) this.A01;
                break;
            case 4:
                C39963ALf.A02((C39963ALf) this.A01, true);
                return;
            case 5:
                C39963ALf aLf = (C39963ALf) this.A01;
                Window window = aLf.A0J.getWindow();
                if (window != null) {
                    window.setSoftInputMode(5);
                }
                aLf.A04();
                return;
            case 6:
                C353498Hw r1 = (C353498Hw) this.A01;
                r1.A1s.A0A();
                FragmentActivity fragmentActivity = r1.A15;
                fragmentActivity.setResult(0);
                fragmentActivity.finish();
                return;
            case 7:
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                }
                27p.A01(((AnonymousClass9QZ) this.A01).A04);
                return;
            case 8:
                ((C62320sa) this.A01).invoke();
                return;
            case 9:
                ((0sL) this.A01).invoke(dialogInterface, Integer.valueOf(i));
                return;
            case 10:
                C357918a4.A08((C357918a4) this.A01);
                return;
            case 11:
                C357918a4.A0A((C357918a4) this.A01, "AUDIO_EDITOR_PAGE_REPLACE_CANCEL_TAP", false);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                ((C336187eD) this.A01).CpL();
                return;
            default:
                ((C336187eD) this.A01).Cqd();
                return;
        }
        jyd.A0K(false);
        jyd.A0R.E3H(new Object());
    }
}
