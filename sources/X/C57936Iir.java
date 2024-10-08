package X;

import android.content.Context;
import android.view.View;
import android.widget.PopupWindow;
import java.util.List;

/* renamed from: X.Iir  reason: case insensitive filesystem */
public final /* synthetic */ class C57936Iir implements Runnable {
    public final /* synthetic */ C55431Hhb A00;
    public final /* synthetic */ C307786Rm A01;
    public final /* synthetic */ C276544tV A02;
    public final /* synthetic */ Object A03;

    public /* synthetic */ C57936Iir(C55431Hhb hhb, C307786Rm r2, C276544tV r3, Object obj) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = hhb;
        this.A03 = obj;
    }

    public final void run() {
        String str;
        String str2;
        String str3;
        C276544tV A002;
        C307786Rm r12 = this.A01;
        C276544tV r5 = this.A02;
        C55431Hhb hhb = this.A00;
        Object obj = this.A03;
        try {
            str = r5.A0K(35);
            if (str == null) {
                throw new RuntimeException("Popup does not have an anchor view id");
            }
        } catch (ClassCastException unused) {
            long A04 = r5.A04(35, 0);
            if (A04 != 0) {
                str = Long.toString(A04);
            } else {
                throw new RuntimeException("Popup does not have an anchor view id");
            }
        }
        C276544tV A05 = C307476Qg.A02(r12).A05();
        if (A05 == null || (A002 = C7299Q2y.A00(A05, new C7296Q2v(str))) == null) {
            1Kn.A02("BKBloksComponentsCdsInternalPopupBinderUtil", String.format("Could not find component with anchor view id: %s", new Object[]{str}));
        } else {
            View A052 = A002.A05(r12);
            if (!(A052 == null && (A052 = C54766HRy.A00(r12, A002)) == null)) {
                PopupWindow popupWindow = hhb.A00;
                List A0N = r5.A0N(32);
                if (A0N.size() < 1) {
                    str2 = "BKBloksComponentsCdsInternalPopupBinderUtil";
                    str3 = "Popup must have a child element.";
                    1Kn.A02(str2, str3);
                }
                int[] iArr = (int[]) obj;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(A052.getWidth(), View.MeasureSpec.getMode(iArr[0]));
                Context context = r12.A00;
                C245603dB[] A003 = C307806Ro.A00(r12);
                C308006Si r9 = C307996Sh.A04;
                C244943c0 A012 = r9.A01(context, (C307996Sh) null, r12, A003, -1);
                AnonymousClass2TS r1 = (AnonymousClass2TS) A0N.get(0);
                int i = iArr[1];
                0qQ.A0B(r1, 1);
                C245663dH r6 = r9.A03(A012, r1, (Object) null, C244873bt.A00(makeMeasureSpec, i)).A01;
                View contentView = popupWindow.getContentView();
                0Sd.A00(contentView);
                ((C299025uS) contentView).setRenderTree(r6);
                float A022 = r5.A02(36, 0.0f);
                float A023 = r5.A02(38, 0.0f);
                int round = Math.round(C14573Tyc.A00(context, A022));
                int round2 = Math.round(C14573Tyc.A00(context, A023));
                if (AnonymousClass6T5.A00(context)) {
                    round = (-r6.A01()) - round;
                }
                popupWindow.showAsDropDown(A052, round, round2);
                return;
            }
        }
        str2 = "BKBloksComponentsCdsInternalPopupBinderUtil";
        str3 = "Popup cannot find text input view to anchor to";
        1Kn.A02(str2, str3);
    }
}
