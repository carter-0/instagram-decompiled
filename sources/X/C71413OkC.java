package X;

import android.view.View;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.rtc.presentation.participants.RtcCallParticipantCellView;
import com.meta.metaai.components.voice.animation.transrcipt.widget.DisabledHorizontalScrollView;
import com.meta.metaai.components.voice.animation.transrcipt.widget.UserInputTextView;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.OkC  reason: case insensitive filesystem */
public final class C71413OkC implements View.OnLayoutChangeListener {
    public final int A00;
    public final Object A01;

    public C71413OkC(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        0sL r2;
        switch (this.A00) {
            case 2:
                view.removeOnLayoutChangeListener(this);
                PME pme = (PME) this.A01;
                AnonymousClass0eM r9 = pme.A0B;
                ViewParent parent = AnonymousClass7TE.A0c(r9).getParent();
                View findViewById = pme.A06.findViewById(R.id.bloks_fragment_container);
                0hq r11 = pme.A07;
                Fragment A0P = r11.A0P(R.id.bloks_fragment_container);
                List<Fragment> A04 = r11.A0U.A04();
                0qQ.A07(A04);
                int A0M = r11.A0M();
                String str = null;
                Fragment fragment = null;
                for (Fragment fragment2 : A04) {
                    if (fragment2 instanceof AnonymousClass3M3) {
                        fragment = fragment2;
                    }
                }
                try {
                    AnonymousClass0eM r3 = pme.A09;
                    if (!0qQ.A0K(A0P, r3.getValue())) {
                        0s1 r1 = new 0s1(r11);
                        r1.A0A((Fragment) r3.getValue(), R.id.bloks_fragment_container);
                        r1.A06();
                        AnonymousClass7TE.A0c(r9).setFitsSystemWindows(true);
                        AnonymousClass03j.A00(AnonymousClass7TE.A0c(r9), C71494Olj.A00);
                        return;
                    }
                    return;
                } catch (IllegalArgumentException e) {
                    StringBuilder A0j = C66583MXo.A0j(parent, findViewById, A0P, A0M);
                    Iterator it = A04.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                    A0j.append(C60340gF.A00);
                    A0j.append(" \nBloksSreenFragment: ");
                    AnonymousClass3M3 r4 = (AnonymousClass3M3) fragment;
                    if (r4 != null) {
                        str = r4.getUrl();
                    }
                    A0j.append(str);
                    0wb.A07("RtcCoWatchBloksContentPickerViewHolder", new IllegalArgumentException(AnonymousClass7TF.A0l(" \n", A0j), e));
                    return;
                }
            case 3:
                int i9 = i8 - i6;
                int i10 = i3 - i;
                int i11 = i4 - i2;
                if ((i7 - i5 != i10 || i9 != i11) && (r2 = ((RtcCallParticipantCellView) this.A01).A04) != null) {
                    r2.invoke(Integer.valueOf(i10), Integer.valueOf(i11));
                    return;
                }
                return;
            case 4:
                C70973OTu oTu = (C70973OTu) this.A01;
                oTu.A01 = ((float) (i3 - i)) / 2.0f;
                UserInputTextView userInputTextView = oTu.A0B;
                CharSequence text = userInputTextView.getText();
                if (text == null || text.length() == 0) {
                    userInputTextView.setTranslationX(oTu.A01);
                    return;
                }
                return;
            case 5:
                C70973OTu oTu2 = (C70973OTu) this.A01;
                float A02 = AnonymousClass7TE.A02(view);
                DisabledHorizontalScrollView disabledHorizontalScrollView = oTu2.A0A;
                float A022 = AnonymousClass7TE.A02(disabledHorizontalScrollView);
                float f = oTu2.A06;
                int i12 = (A02 > (A022 - f) ? 1 : (A02 == (A022 - f) ? 0 : -1));
                float A023 = (AnonymousClass7TE.A02(disabledHorizontalScrollView) - f) - AnonymousClass7TE.A02(view);
                if (i12 < 0) {
                    A023 /= 2.0f;
                }
                oTu2.A02 = A023;
                C70973OTu.A00(oTu2);
                return;
            default:
                view.removeOnLayoutChangeListener(this);
                P3E p3e = (P3E) this.A01;
                p3e.A0E.A0t((AnonymousClass52T) p3e.A0V.getValue());
                return;
        }
    }
}
