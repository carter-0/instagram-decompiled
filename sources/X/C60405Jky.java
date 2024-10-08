package X;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.Jky  reason: case insensitive filesystem */
public final class C60405Jky extends 2Rw {
    public final UserSession A00;
    public final LinkedHashMap A01;
    public final Activity A02;
    public final LinkedHashMap A03;
    public final LinkedHashMap A04;
    public final List A05;

    public final void onBindViewHolder(C249703kE r12, int i) {
        Float f;
        0qQ.A0B(r12, 0);
        if (r12 instanceof C60612JoL) {
            String A19 = AnonymousClass7TE.A19(this.A05, i);
            C60612JoL joL = (C60612JoL) r12;
            IgImageView igImageView = joL.A02;
            int dimensionPixelSize = DbU.A05(igImageView).getDimensionPixelSize(R.dimen.alt_text_carousel_card_width);
            Number A0z = JTO.A0z(A19, this.A03);
            Bitmap bitmap = null;
            if (A0z != null) {
                float floatValue = ((float) dimensionPixelSize) / A0z.floatValue();
                f = Float.valueOf(floatValue);
                if (f != null) {
                    bitmap = 1MF.A0E(A19, dimensionPixelSize, (int) floatValue);
                }
            } else {
                f = null;
            }
            igImageView.setImageBitmap(bitmap);
            String A0r = DbS.A0r(A19, this.A04);
            IgTextView igTextView = joL.A01;
            DbZ.A14(igTextView, this.A01.get(A0r));
            AnonymousClass0fU.A00(new C64251LXd(this, A0z, A19, A0r, 0), igTextView);
            if (f != null) {
                joL.A00.getLayoutParams().height = (int) (f.floatValue() + AnonymousClass7TE.A01(DbU.A05(igTextView), R.dimen.alt_text_carousel_input_height));
            }
            ViewTreeObserver viewTreeObserver = igTextView.getViewTreeObserver();
            if (viewTreeObserver != null) {
                LZ0.A00(viewTreeObserver, r12, 5);
            }
        }
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        0qQ.A0B(viewGroup, 0);
        return new C60612JoL(DbU.A09(LayoutInflater.from(this.A02), viewGroup, R.layout.alt_text_carousel_card_layout, false));
    }

    public C60405Jky(Activity activity, UserSession userSession, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, LinkedHashMap linkedHashMap3, List list) {
        C51972G9s.A1B(activity, linkedHashMap2);
        0qQ.A0B(userSession, 6);
        this.A02 = activity;
        this.A05 = list;
        this.A03 = linkedHashMap;
        this.A01 = linkedHashMap2;
        this.A04 = linkedHashMap3;
        this.A00 = userSession;
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(1575395510);
        int size = this.A05.size();
        AnonymousClass0fD.A0A(654883563, A032);
        return size;
    }
}
