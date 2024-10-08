package X;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import com.fbpay.util.tooltip.TooltipInfo;
import java.util.Arrays;

/* renamed from: X.Qfu  reason: case insensitive filesystem */
public final class C8047Qfu extends C8066QgI {
    public C8048Qfv A00;
    public final 0sP A01 = TY1.A00(this, 21);

    public void setViewModel(C8041Qfl qfl) {
        0qQ.A0B(qfl, 0);
        super.setViewModel(qfl);
        this.A00 = (C8048Qfv) qfl;
    }

    public String getExistingError() {
        String str;
        String A0N;
        C8049Qfw qfw;
        C8048Qfv qfv = this.A00;
        if (qfv != null) {
            String str2 = (String) SRc.A0A(qfv);
            boolean z = true;
            if (!(str2 == null || str2.length() == 0 || (qfw = qfv.A02) == null)) {
                z = qfw.A01(str2);
            }
            C8048Qfv qfv2 = this.A00;
            if (qfv2 != null) {
                String str3 = (String) SRc.A0A(qfv2);
                if (str3 == null || str3.length() == 0) {
                    str = null;
                } else {
                    str = C8946RGo.A06.A02(str3).A03;
                }
                C8048Qfv qfv3 = this.A00;
                if (qfv3 != null) {
                    if (qfv3.A03 && !z && str != null && !str.equals("Unknown")) {
                        String A0e = AnonymousClass7TF.A0e(getResources(), str, 2131954852);
                        0qQ.A07(A0e);
                        A0N = String.format(A0e, Arrays.copyOf(new Object[0], 0));
                    } else if (qfv3.A0M() != 0) {
                        Resources resources = getResources();
                        C8048Qfv qfv4 = this.A00;
                        if (qfv4 != null) {
                            A0N = resources.getString(qfv4.A0M());
                        }
                    } else {
                        C8048Qfv qfv5 = this.A00;
                        if (qfv5 != null) {
                            A0N = qfv5.A0N();
                            if (A0N == null) {
                                return "";
                            }
                            return A0N;
                        }
                    }
                    0qQ.A07(A0N);
                    return A0N;
                }
            }
        }
        0qQ.A0F("viewModel");
        throw AnonymousClass00P.createAndThrow();
    }

    public C8047Qfu(Context context) {
        super(context);
    }

    /* access modifiers changed from: private */
    public final TooltipInfo getTooltipInfo() {
        return new TooltipInfo(2131954836, 0, 0, 0, 0, (int) TypedValue.applyDimension(1, 8.0f, AnonymousClass7TF.A0E(AnonymousClass7TE.A0S(this))));
    }

    public final void onAttachedToWindow() {
        int A06 = AnonymousClass0fD.A06(445268877);
        super.onAttachedToWindow();
        C8048Qfv qfv = this.A00;
        if (qfv == null) {
            C51965G9l.A15();
            throw AnonymousClass00P.createAndThrow();
        }
        qfv.A01.A09(new C64319LZu(11, this.A01));
        AnonymousClass0fD.A0D(194202932, A06);
    }

    public final void onDetachedFromWindow() {
        int A06 = AnonymousClass0fD.A06(-1880842770);
        super.onDetachedFromWindow();
        C8048Qfv qfv = this.A00;
        if (qfv == null) {
            C51965G9l.A15();
            throw AnonymousClass00P.createAndThrow();
        }
        qfv.A01.A08(new C64319LZu(11, this.A01));
        AnonymousClass0fD.A0D(-1486030538, A06);
    }

    public /* bridge */ /* synthetic */ void setViewModel(SRc sRc) {
        setViewModel((C8041Qfl) sRc);
    }
}
