package X;

import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.instagram.ui.text.TextColorScheme;
import com.instagram.ui.text.fittingtextview.FittingTextView;
import com.instagram.ui.widget.drawing.EyedropperColorPickerTool;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.AaC  reason: case insensitive filesystem */
public final class C40317AaC implements AnonymousClass8LV, AnonymousClass89Y {
    public TextColorScheme A00;
    public boolean A01 = true;
    public TextColorScheme A02;
    public final AnonymousClass88K A03;
    public final C314446iH A04;
    public final TextColorScheme A05;
    public final TextColorScheme A06;
    public final EyedropperColorPickerTool A07;
    public final 01W A08;
    public final A8V A09;
    public final C3499482o A0A;
    public final AnonymousClass8BQ A0B;
    public final FittingTextView A0C;
    public final FittingTextView A0D;
    public final int[] A0E;

    public C40317AaC(A8V a8v, C3499482o r8, AnonymousClass8BQ r9, AnonymousClass88K r10, C314446iH r11, FittingTextView fittingTextView, FittingTextView fittingTextView2, EyedropperColorPickerTool eyedropperColorPickerTool) {
        AnonymousClass7TF.A1D(r8, 2, r9);
        this.A09 = a8v;
        this.A0A = r8;
        this.A04 = r11;
        this.A0B = r9;
        this.A07 = eyedropperColorPickerTool;
        this.A03 = r10;
        this.A0D = fittingTextView;
        this.A0C = fittingTextView2;
        int[] iArr = {0, 0};
        this.A0E = iArr;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        C353818Jf r1 = new C353818Jf();
        r1.A02(Arrays.copyOf(iArr, 2));
        0qQ.A0B(orientation, 0);
        r1.A03 = orientation;
        TextColorScheme textColorScheme = new TextColorScheme(r1);
        this.A05 = textColorScheme;
        C353818Jf r2 = new C353818Jf();
        r2.A02(Arrays.copyOf(C355118Os.A08, 7));
        r2.A03 = orientation;
        this.A06 = new TextColorScheme(r2);
        this.A02 = textColorScheme;
        this.A00 = textColorScheme;
        this.A08 = new 01W();
    }

    public static final void A03(C40317AaC aaC, boolean z) {
        AnonymousClass8BQ r0 = aaC.A0B;
        if (z) {
            r0.A03(true, false);
            EyedropperColorPickerTool eyedropperColorPickerTool = aaC.A07;
            if (eyedropperColorPickerTool != null) {
                AnonymousClass7TG.A1A(eyedropperColorPickerTool, true);
            }
            A00(aaC);
            FittingTextView fittingTextView = aaC.A0C;
            if (fittingTextView != null) {
                AnonymousClass7TG.A1A(fittingTextView, true);
            }
        } else {
            r0.A02(false);
            EyedropperColorPickerTool eyedropperColorPickerTool2 = aaC.A07;
            if (eyedropperColorPickerTool2 != null) {
                AnonymousClass7TE.A1U(eyedropperColorPickerTool2, false);
            }
            FittingTextView fittingTextView2 = aaC.A0D;
            if (fittingTextView2 != null) {
                AnonymousClass7TE.A1U(fittingTextView2, false);
            }
            FittingTextView fittingTextView3 = aaC.A0C;
            if (fittingTextView3 != null) {
                AnonymousClass7TE.A1U(fittingTextView3, false);
            }
        }
        ((C355038Oi) aaC.A09.A00.A1f.get()).EPT(z);
    }

    public final void A05(int[] iArr, boolean z, boolean z2) {
        int i = iArr[0];
        C353818Jf r1 = new C353818Jf();
        r1.A02(Arrays.copyOf(new int[]{i, i}, 2));
        A01(this, new TextColorScheme(r1), z, z2);
    }

    public final /* synthetic */ void DDq() {
    }

    public final void DDs(int i) {
        A05(new int[]{i}, true, true);
        A03(this, true);
    }

    public final /* synthetic */ void DDt() {
    }

    public final void DDu() {
        A03(this, false);
    }

    public final /* synthetic */ void DDv(int i) {
    }

    public static final void A00(C40317AaC aaC) {
        FittingTextView fittingTextView = aaC.A0D;
        if (fittingTextView != null) {
            View[] viewArr = {fittingTextView};
            if (!aaC.A08.isEmpty()) {
                C294975nL.A04((C295005nO) null, viewArr, true);
            } else {
                C294975nL.A05(viewArr, false);
            }
        }
    }

    public static final void A01(C40317AaC aaC, TextColorScheme textColorScheme, boolean z, boolean z2) {
        Number number;
        EyedropperColorPickerTool eyedropperColorPickerTool;
        if (z) {
            AnonymousClass7TF.A1I(aaC.A00, Boolean.valueOf(aaC.A01), aaC.A08);
            A00(aaC);
        }
        AnonymousClass82Y r1 = aaC.A0A.A01;
        C352218Cl A032 = r1.A03();
        if (A032 != null) {
            A032.A19 = true;
        }
        C349307zv A042 = r1.A04();
        if (A042 != null) {
            A042.A1K = true;
        }
        if (z || z2) {
            aaC.A01 = false;
            aaC.A00 = textColorScheme;
        }
        List list = textColorScheme.A07;
        if (!(list == null || (number = (Number) 00k.A0O(list, 0)) == null || (eyedropperColorPickerTool = aaC.A07) == null)) {
            eyedropperColorPickerTool.setColor(number.intValue());
        }
        aaC.A09.A00(textColorScheme, textColorScheme, 0);
    }

    public static final void A02(C40317AaC aaC, boolean z) {
        if (z) {
            aaC.A08.clear();
            A00(aaC);
        }
        AnonymousClass82Y r1 = aaC.A0A.A01;
        C352218Cl A032 = r1.A03();
        if (A032 != null) {
            A032.A19 = false;
        }
        C349307zv A042 = r1.A04();
        if (A042 != null) {
            A042.A1K = false;
        }
        aaC.A01 = true;
        aaC.A00 = aaC.A02;
        EyedropperColorPickerTool eyedropperColorPickerTool = aaC.A07;
        if (eyedropperColorPickerTool != null) {
            eyedropperColorPickerTool.setColor(-1);
        }
        aaC.A09.A00(aaC.A06, aaC.A00, 2);
    }

    public final void A04() {
        AnonymousClass88K r1 = this.A03;
        r1.A09.remove(this);
        r1.A04();
        Bitmap bitmap = r1.A02;
        if (bitmap != null) {
            bitmap.recycle();
            r1.A02 = null;
        }
        this.A08.clear();
        A03(this, false);
        this.A04.D48(this);
    }

    public final boolean onBackPressed() {
        A04();
        return true;
    }
}
