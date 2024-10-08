package X;

import android.content.Context;
import android.net.Uri;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.textview.IgAutoCompleteTextView;

public final class KFW extends C232222tE {
    public final C336207eF A00;
    public final C63643L1f A01;

    public KFW(C336207eF r2, C63643L1f l1f) {
        0qQ.A0B(r2, 2);
        this.A01 = l1f;
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        C60652Joz joz = new C60652Joz(DbU.A09(layoutInflater, viewGroup, R.layout.video_caption_cover_photo_layout, false));
        LWP.A00(joz.A04, this, 5);
        return joz;
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r14, C249703kE r15) {
        boolean z;
        int i;
        int i2;
        C71492dQ r1;
        String str;
        KGM kgm = (KGM) r14;
        C60652Joz joz = (C60652Joz) r15;
        boolean A1Z = AnonymousClass7TG.A1Z(kgm, joz);
        IgAutoCompleteTextView igAutoCompleteTextView = joz.A04;
        igAutoCompleteTextView.setText(kgm.A04);
        igAutoCompleteTextView.A07 = A1Z;
        igAutoCompleteTextView.setAdapter(this.A00);
        FrameLayout frameLayout = joz.A01;
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if ((layoutParams instanceof C71492dQ) && (r1 = (C71492dQ) layoutParams) != null) {
            if (1 - kgm.A03.intValue() != 0) {
                str = "H,1:1";
            } else {
                str = "H,0.643:1";
            }
            r1.A0z = str;
        }
        TypedValue typedValue = new TypedValue();
        IgImageView igImageView = joz.A03;
        igImageView.getResources().getValue(R.dimen.clips_minicountdown_view_parent_view_ratio, typedValue, A1Z);
        0nA.A0f(frameLayout, (int) (((float) 0nA.A09(AnonymousClass7TE.A0S(igImageView))) * typedValue.getFloat()));
        int A012 = DbW.A01(kgm.A05 ? 1 : 0);
        joz.A02.setVisibility(A012);
        joz.A00.setVisibility(A012);
        Uri uri = kgm.A00;
        if (uri != null) {
            igImageView.setImageURI(uri);
        }
        ImageUrl imageUrl = kgm.A02;
        if (imageUrl != null) {
            igImageView.A0E = new C64860LjM(this, 2);
            igImageView.setUrl(imageUrl, kgm.A01);
        }
        2eS.A01(frameLayout);
        LYB.A00(frameLayout, 5, this);
        K8A k8a = this.A01.A00;
        k8a.A00 = frameLayout;
        if (k8a instanceof C61942KSr) {
            C61942KSr kSr = (C61942KSr) k8a;
            if ((JTT.A0Y(kSr).A0J == null || JTT.A0Y(kSr).A0C != null) && kSr.A0B == null) {
                if (JTT.A0Y(kSr).A00 > 0.643f) {
                    z = true;
                    i = LJ9.A01(kSr).A0G;
                } else {
                    z = false;
                    i = (int) (((float) LJ9.A01(kSr).A0H) / 0.643f);
                }
                AnonymousClass3Q2 r0 = JTT.A0X(kSr).A02;
                if (z) {
                    i2 = (int) (((float) r0.A0G) * 0.643f);
                } else {
                    i2 = r0.A0H;
                }
                float f = 0.643f;
                if (JTT.A0Y(kSr).A00 == 1.0f) {
                    f = 1.0f;
                }
                Context requireContext = kSr.requireContext();
                AnonymousClass0eM r2 = kSr.A0W;
                C65827M0t m0t = new C65827M0t(requireContext, frameLayout, AnonymousClass7TE.A0l(r2), new C65235Lpf(kSr, 2), new C65828M0u(kSr.requireContext(), AnonymousClass7TE.A0l(r2), LJ9.A01(kSr), LJ9.A01(kSr).A02), f, i2, i);
                C378379Po r02 = m0t.A01;
                r02.A06 = m0t;
                r02.A00();
                kSr.A0B = m0t;
            }
        }
    }

    public final Class modelClass() {
        return KGM.class;
    }
}
