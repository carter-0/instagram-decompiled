package X;

import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.instagram.android.R;

public final class PAY implements AnonymousClass7D2 {
    public final AnonymousClass7DZ A00;

    public final /* bridge */ /* synthetic */ void ADp(C328007Db r4, AnonymousClass7FW r5) {
        C72570PBb pBb = (C72570PBb) r4;
        C68816NYa nYa = (C68816NYa) r5;
        FrameLayout frameLayout = pBb.A01;
        float[] fArr = C3265577g.A01(frameLayout.getContext(), nYa.A00).A01;
        GradientDrawable gradientDrawable = (GradientDrawable) frameLayout.getBackground();
        if (gradientDrawable != null) {
            gradientDrawable.setCornerRadii(fArr);
            frameLayout.setBackground(gradientDrawable);
        }
        TextView textView = pBb.A04;
        Resources A05 = DbU.A05(textView);
        DbU.A1A(A05, textView, 2131976734);
        String string = A05.getString(2131976733);
        TextView textView2 = pBb.A03;
        if (!string.contentEquals(textView2.getText())) {
            textView2.setText(string);
            0nA.A0q(textView2, new PW4(textView2));
        }
        this.A00.A02(pBb, nYa);
    }

    public final /* bridge */ /* synthetic */ void FIP(C328007Db r2) {
        this.A00.A01(r2);
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [X.7XR, X.7XA, X.7XX] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PAY(X.AnonymousClass7XA r8, X.AnonymousClass9HC r9) {
        /*
            r7 = this;
            r7.<init>()
            r6 = r9
            boolean r1 = r9.A1X
            X.77j r0 = new X.77j
            r0.<init>(r1)
            X.P8F r2 = new X.P8F
            r5 = r8
            r2.<init>(r8, r7)
            X.77k r3 = r0.A00(r8)
            X.7DV r4 = new X.7DV
            r4.<init>(r8, r1)
            X.77l r1 = new X.77l
            r1.<init>(r2, r3, r4, r5, r6)
            X.7DY[] r0 = new X.AnonymousClass7DY[]{r1, r0}
            java.util.List r1 = java.util.Arrays.asList(r0)
            X.7DZ r0 = new X.7DZ
            r0.<init>(r1)
            r7.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PAY.<init>(X.7XA, X.9HC):void");
    }

    public final /* bridge */ /* synthetic */ C328007Db ANK(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.direct_voting_share_message);
        AnonymousClass7PV.A01(A0C);
        C72570PBb pBb = new C72570PBb(A0C);
        float A09 = ((float) 0nA.A09(viewGroup.getContext())) / 2.5f;
        FrameLayout frameLayout = pBb.A01;
        0nA.A0f(frameLayout, (int) A09);
        0nA.A0V(frameLayout, (int) (A09 / 0.75f));
        this.A00.A00(pBb);
        return pBb;
    }
}
