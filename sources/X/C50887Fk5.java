package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.Map;

/* renamed from: X.Fk5  reason: case insensitive filesystem */
public final class C50887Fk5 implements C231932se {
    public final AnonymousClass0iw A00;

    /* renamed from: A00 */
    public final void ADo(2bv r7, AnonymousClass4UC r8, C47018DpA dpA) {
        0qQ.A0B(dpA, 0);
        AnonymousClass4V7 r5 = r8.A08;
        C283905Ju r0 = r5.A07;
        if (r0 != null) {
            ImageUrl imageUrl = r0.A00;
            IgImageView igImageView = dpA.A05;
            igImageView.setUrl(imageUrl, this.A00);
            igImageView.setVisibility(0);
        } else {
            dpA.A05.setVisibility(8);
        }
        String A0n = DbZ.A0n(r5.A09);
        TextView textView = dpA.A04;
        textView.setText(A0n);
        textView.setVisibility(0);
        ImageView imageView = dpA.A01;
        imageView.setVisibility(0);
        C283845Jo r02 = r5.A03;
        if (r02 != null) {
            String A0n2 = DbZ.A0n(r02);
            TextView textView2 = dpA.A02;
            textView2.setText(A0n2);
            textView2.setVisibility(0);
        } else {
            dpA.A02.setVisibility(8);
        }
        AnonymousClass4VG r03 = r5.A01;
        if (r03 != null) {
            AnonymousClass4V8 r04 = r03.A00;
            TextView textView3 = dpA.A03;
            textView3.setText(DbZ.A0n(r04));
            textView3.setVisibility(0);
            FPG.A00(textView3, 41, r7, r8);
        } else {
            dpA.A03.setVisibility(8);
        }
        FPH.A00(imageView, dpA, r8, r7, 51);
        if (r7 != null) {
            r7.DbK(r8);
        }
    }

    public final View CrT(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.audio_browser_megaphone, viewGroup, false);
        if (inflate != null) {
            inflate.setTag(new C47018DpA(inflate));
            return inflate;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final /* bridge */ /* synthetic */ void ADr(C249703kE r2, 2bv r3, AnonymousClass4UC r4, Map map) {
        C47018DpA dpA = (C47018DpA) r2;
        0qQ.A0B(dpA, 0);
        ADo(r3, r4, dpA);
    }

    public C50887Fk5(AnonymousClass0iw r1) {
        this.A00 = r1;
    }
}
