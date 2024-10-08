package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.ui.widget.slidecontentlayout.SlideContentLayout;

public final class LSD {
    public float A00;
    public float A01;
    public boolean A02;
    public boolean A03;
    public final Context A04;
    public final View A05;
    public final View A06;
    public final View A07;
    public final View A08;
    public final View A09;
    public final View A0A;
    public final View A0B;
    public final View A0C;
    public final View A0D;
    public final C294975nL A0E;
    public final C294975nL A0F;
    public final C294975nL A0G;
    public final C294975nL A0H;
    public final C294975nL A0I;
    public final SlideContentLayout A0J;
    public final int A0K;
    public final View A0L;
    public final RecyclerView A0M;

    public static final int A00(LSD lsd) {
        int i;
        if (lsd.A03) {
            i = AnonymousClass7TG.A05(lsd.A04) * 2;
        } else {
            i = 0;
        }
        Context context = lsd.A04;
        int A082 = 0nA.A08(context);
        int A092 = (int) (((float) (0nA.A09(context) - i)) / 0.5625f);
        if (A092 > A082) {
            A092 = A082;
        }
        return A082 - A092;
    }

    public static final void A01(LSD lsd) {
        int dimensionPixelSize;
        boolean A1P = AnonymousClass7TF.A1P(lsd.A03 ? 1 : 0);
        SlideContentLayout slideContentLayout = lsd.A0J;
        if (A1P) {
            dimensionPixelSize = 0;
        } else {
            dimensionPixelSize = slideContentLayout.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
        }
        slideContentLayout.setPadding(0, 0, 0, dimensionPixelSize);
        ViewGroup.LayoutParams layoutParams = slideContentLayout.getLayoutParams();
        int i = 0;
        if (slideContentLayout.getChildCount() != 0) {
            i = SlideContentLayout.A00(slideContentLayout.getChildAt(0), slideContentLayout);
        }
        layoutParams.height = i;
        boolean A1T = AnonymousClass7TF.A1T(A00(lsd), lsd.A0K);
        C270354gb r7 = new C270354gb();
        View view = lsd.A0A;
        ViewParent parent = view.getParent();
        0qQ.A0C(parent, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        ConstraintLayout constraintLayout = (ConstraintLayout) parent;
        r7.A0I(constraintLayout);
        r7.A09(R.id.iglive_reactions_composer, 3);
        r7.A09(R.id.iglive_reactions_composer, 4);
        if (A1T) {
            r7.A0C(R.id.iglive_reactions_composer, 4, R.id.iglive_surface_view_frame_container, 4);
        } else {
            r7.A0C(R.id.iglive_reactions_composer, 3, R.id.iglive_surface_view_frame_container, 4);
        }
        if (view.getTranslationY() == 0.0f) {
            C14283TtH.A02(constraintLayout, (C14284TtI) null);
        }
        r7.A0G(constraintLayout);
        A02(lsd, AnonymousClass05K.A00, false);
    }

    public static final void A02(LSD lsd, Integer num, boolean z) {
        float f;
        int A002;
        if (lsd.A02) {
            f = (float) JTR.A09(lsd.A04);
        } else {
            f = 0.0f;
        }
        float max = Math.max(lsd.A00, Math.max(lsd.A01, f));
        int i = lsd.A0K;
        if (A00(lsd) < i) {
            A002 = A00(lsd);
        } else {
            A002 = A00(lsd) - i;
        }
        float A072 = (max - ((float) (C51970G9q.A07(A002, A002) / 2))) * -1.0f;
        if (A072 > 0.0f) {
            A072 = 0.0f;
        }
        View view = lsd.A05;
        if ((view != null && view.getVisibility() == 0) || (((view = lsd.A0D) != null && view.getVisibility() == 0) || ((view = lsd.A08) != null && view.getVisibility() == 0))) {
            view.setTranslationY(A072);
        }
        lsd.A06.setTranslationY(A072 - AnonymousClass7TE.A01(lsd.A04.getResources(), R.dimen.ad_not_delivering_thumbnail_height));
        if (z) {
            JTS.A1T(lsd.A0E, A072);
            JTS.A1T(lsd.A0G, A072);
            JTS.A1T(lsd.A0H, A072);
            if (num != AnonymousClass05K.A01) {
                JTS.A1T(lsd.A0F, A072);
            }
            C294975nL r0 = lsd.A0I;
            if (r0 != null) {
                JTS.A1T(r0, A072);
                return;
            }
            return;
        }
        lsd.A09.setTranslationY(A072);
        lsd.A0B.setTranslationY(A072);
        if (num != AnonymousClass05K.A01) {
            lsd.A0A.setTranslationY(A072);
        }
        View view2 = lsd.A0C;
        if (view2 != null) {
            view2.setTranslationY(A072);
        }
    }

    public LSD(Context context, View view, boolean z) {
        C294975nL r0;
        this.A0L = view;
        this.A04 = context;
        this.A03 = z;
        View findViewById = view.findViewById(R.id.iglive_reactions_shadow_bottom);
        this.A0C = findViewById;
        View A0G2 = AnonymousClass7TF.A0G(view, R.id.iglive_reactions_comments);
        this.A09 = A0G2;
        View A0G3 = AnonymousClass7TF.A0G(view, R.id.iglive_reactions_extensions);
        this.A0B = A0G3;
        View A0G4 = AnonymousClass7TF.A0G(view, R.id.iglive_reactions_composer);
        this.A0A = A0G4;
        this.A06 = AnonymousClass7TF.A0G(view, R.id.dismiss_view_background);
        this.A05 = view.findViewById(R.id.avatar_likes_container);
        this.A0D = view.findViewById(R.id.self_likes_container);
        this.A08 = view.findViewById(R.id.mixed_reactions_host_view_container);
        RecyclerView A0c = JTR.A0c(view, R.id.iglive_mention_suggestions_recycler_view);
        this.A0M = A0c;
        View A0b = AnonymousClass7TE.A0b(view, R.id.iglive_reactions_extensions);
        this.A07 = A0b;
        this.A0J = (SlideContentLayout) AnonymousClass7TF.A0F(view, R.id.interactivity_question_sticker_container);
        this.A0K = JTR.A04(context) + (DbY.A01(context) * 2);
        if (findViewById != null) {
            r0 = C294975nL.A00(findViewById);
        } else {
            r0 = null;
        }
        this.A0I = r0;
        C294975nL A002 = C294975nL.A00(A0G2);
        0qQ.A07(A002);
        this.A0E = A002;
        C294975nL A003 = C294975nL.A00(A0G3);
        0qQ.A07(A003);
        this.A0G = A003;
        C294975nL A004 = C294975nL.A00(A0c);
        0qQ.A07(A004);
        this.A0H = A004;
        C294975nL A005 = C294975nL.A00(A0G4);
        0qQ.A07(A005);
        this.A0F = A005;
        A01(this);
        LYT.A00(A0b, 12, this);
    }
}
