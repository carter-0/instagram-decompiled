package X;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

public final class PAV implements AnonymousClass7D2 {
    public final AnonymousClass7DZ A00;

    public final /* bridge */ /* synthetic */ void ADp(C328007Db r6, AnonymousClass7FW r7) {
        PBR pbr = (PBR) r6;
        C68820NYe nYe = (C68820NYe) r7;
        TextView textView = pbr.A01;
        textView.setText(nYe.A01);
        AnonymousClass7FE r3 = nYe.A00;
        AnonymousClass7L2 r2 = r3.A03;
        boolean z = r3.A07;
        0qQ.A0B(r2, 0);
        textView.setTextColor(AnonymousClass7FB.A04(r2, z).A05);
        Drawable A0D = JTO.A0D(r3.A05);
        if (A0D != null) {
            C3265577g.A06(A0D, textView, r3, false);
        }
        this.A00.A02(pbr, nYe);
    }

    public final /* bridge */ /* synthetic */ void FIP(C328007Db r2) {
        this.A00.A01(r2);
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [X.7XR, X.7XA, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PAV(X.AnonymousClass7XA r10, X.AnonymousClass9HC r11) {
        /*
            r9 = this;
            r9.<init>()
            r0 = 2
            X.P88 r2 = new X.P88
            r5 = r10
            r2.<init>(r10, r0)
            X.P8U r4 = new X.P8U
            r4.<init>(r10)
            X.77m r7 = new X.77m
            r7.<init>(r10)
            X.7DT r3 = new X.7DT
            r3.<init>(r10)
            r1 = 0
            r8 = 0
            X.77l r0 = new X.77l
            r6 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            java.util.List r1 = java.util.Collections.singletonList(r0)
            X.7DZ r0 = new X.7DZ
            r0.<init>(r1)
            r9.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PAV.<init>(X.7XA, X.9HC):void");
    }

    public final /* bridge */ /* synthetic */ C328007Db ANK(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.direct_hidden_message, viewGroup, false);
        AnonymousClass7PV.A01(inflate);
        PBR pbr = new PBR(inflate);
        TextView textView = pbr.A01;
        C66580MXl.A1F(textView, textView.getContext());
        this.A00.A00(pbr);
        return pbr;
    }
}
