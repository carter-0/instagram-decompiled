package X;

import android.os.Build;
import android.os.Handler;
import android.text.DynamicLayout;
import android.text.Layout;
import android.text.TextPaint;
import java.util.List;

public final class OZP {
    public int A00;
    public int A01;
    public O70 A02;
    public Runnable A03;
    public String A04;
    public String A05 = "";
    public String A06 = "";
    public final C70836ONi A07;
    public final List A08 = AnonymousClass7TE.A1C();
    public final Handler A09 = AnonymousClass7TF.A0D();

    public static final void A01(OZP ozp) {
        int length;
        ozp.A04 = null;
        int i = ozp.A00;
        if (i >= 0) {
            List list = ozp.A08;
            if (i < list.size()) {
                int i2 = ozp.A00;
                int A0I = C51971G9r.A0I(list, i2);
                if (i2 < C51966G9m.A06(list)) {
                    length = C51971G9r.A0I(list, i2 + 1);
                } else {
                    length = ozp.A05.length();
                }
                String str = ozp.A05;
                if (A0I < str.length() && A0I < length) {
                    String A0q = C51967G9n.A0q(str, A0I, length);
                    O70 o70 = ozp.A02;
                    if (o70 != null) {
                        o70.A00.setText(A0q);
                    }
                    ozp.A04 = A0q;
                    ozp.A01 = length;
                    ozp.A06 = C66580MXl.A0z(ozp.A05, length);
                    ozp.A00++;
                    C73155PXq pXq = new C73155PXq(ozp);
                    ozp.A03 = pXq;
                    ozp.A09.postDelayed(pXq, ozp.A07.A06 * ((long) DbV.A18(A0q, " ").size()));
                }
            }
        }
    }

    private final void A00() {
        O70 o70 = this.A02;
        if (o70 != null) {
            o70.A00.setText("");
        }
        this.A05 = "";
        this.A06 = "";
        this.A01 = 0;
        this.A00 = 0;
        this.A04 = null;
        this.A03 = null;
        this.A08.clear();
    }

    public final void A02(String str, C62320sa r17) {
        String str2;
        DynamicLayout dynamicLayout;
        int lineStart;
        String str3 = str;
        if (str == null || str3.length() == 0) {
            Runnable runnable = this.A03;
            if (runnable != null) {
                this.A09.removeCallbacks(runnable);
            }
            A00();
        } else if (!0qQ.A0K(this.A05, str3)) {
            String str4 = this.A05;
            boolean A1X = DbW.A1X(str4);
            if (str3.startsWith(str4)) {
                String A0z = C66580MXl.A0z(str3, this.A05.length());
                str2 = 002.A0R(this.A06, A0z);
                this.A06 = str2;
                str3 = 002.A0R(this.A05, A0z);
            } else {
                A00();
                this.A06 = str3;
                str2 = str3;
            }
            this.A05 = str3;
            C70836ONi oNi = this.A07;
            TextPaint textPaint = oNi.A07;
            int A0H = JTR.A0H(r17);
            int i = oNi.A02;
            int i2 = oNi.A03;
            float f = oNi.A00;
            float f2 = oNi.A01;
            boolean z = oNi.A08;
            int i3 = (A0H - i) - i2;
            if (Build.VERSION.SDK_INT >= 29) {
                dynamicLayout = DynamicLayout.Builder.obtain(str2, textPaint, i3).setAlignment(Layout.Alignment.ALIGN_CENTER).setLineSpacing(f, f2).setBreakStrategy(A1X ? 1 : 0).setIncludePad(z).build();
                0qQ.A0A(dynamicLayout);
            } else {
                dynamicLayout = new DynamicLayout(str2, textPaint, i3, Layout.Alignment.ALIGN_CENTER, f2, f, z);
            }
            int lineCount = dynamicLayout.getLineCount();
            for (int i4 = 0; i4 < lineCount; i4++) {
                if (i4 % oNi.A04 == 0 && (lineStart = dynamicLayout.getLineStart(i4) + this.A01) >= 0) {
                    String str5 = this.A05;
                    if (lineStart < str5.length()) {
                        if (!Character.isWhitespace(str5.codePointAt(lineStart))) {
                            while (true) {
                                if (lineStart == 0) {
                                    break;
                                }
                                int i5 = lineStart - 1;
                                if (Character.isWhitespace(this.A05.codePointAt(i5))) {
                                    break;
                                }
                                lineStart = i5;
                                if (-1 >= i5) {
                                    break;
                                }
                            }
                        }
                        List list = this.A08;
                        Integer valueOf = Integer.valueOf(lineStart);
                        if (!list.contains(valueOf)) {
                            list.add(valueOf);
                        }
                    }
                }
            }
            if (this.A04 == null) {
                A01(this);
            }
        }
    }

    public OZP(C70836ONi oNi) {
        this.A07 = oNi;
    }
}
