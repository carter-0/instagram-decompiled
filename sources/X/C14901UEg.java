package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewParent;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.reels.interactive.view.AvatarView;
import com.instagram.ui.widget.base.AspectRatioLinearLayout;

/* renamed from: X.UEg  reason: case insensitive filesystem */
public final class C14901UEg extends C249703kE implements C252203oj {
    public View.OnClickListener A00;
    public final GradientDrawable A01;
    public final GradientDrawable A02;
    public final View A03;
    public final View A04;
    public final View A05;
    public final View A06;
    public final TextView A07;
    public final TextView A08;
    public final AnonymousClass3NM A09;
    public final IgImageView A0A;
    public final IgImageView A0B;
    public final IgImageView A0C;
    public final AvatarView A0D;
    public final AspectRatioLinearLayout A0E;

    public final void DmB(2cs r1) {
    }

    public final void DmC(2cs r1) {
    }

    public final void DmD(2cs r1) {
    }

    public final void DmE(2cs r5) {
        float f = (float) r5.A09.A00;
        this.itemView.setScaleX(f);
        this.itemView.setScaleY(f);
    }

    public C14901UEg(View view, int i) {
        super(view);
        int A002;
        int A003;
        int A004;
        Resources A052 = DbU.A05(view);
        this.A03 = view.requireViewById(R.id.question_response_item_container);
        AspectRatioLinearLayout aspectRatioLinearLayout = (AspectRatioLinearLayout) view.requireViewById(R.id.question_response_card);
        this.A0E = aspectRatioLinearLayout;
        this.A05 = JTP.A0H(DbU.A0D(view, R.id.question_response), i);
        this.A08 = DbU.A0G(view, R.id.question_responder);
        this.A0D = (AvatarView) view.requireViewById(R.id.question_responder_avatar);
        View A0b = DbT.A0b(view, R.id.question_responder_overflow);
        this.A0C = A0b;
        if (A0b.getParent() != null) {
            View view2 = (View) A0b.getParent();
            int A0B2 = AnonymousClass7TE.A0B(A052);
            ViewParent parent = A0b.getParent();
            Rect rect = new Rect();
            View view3 = A0b;
            A0b.getHitRect(rect);
            while (true) {
                ViewParent parent2 = view3.getParent();
                if (parent2 == parent || parent2 == null || !(parent2 instanceof View)) {
                    boolean z = parent instanceof View;
                    int i2 = 0;
                } else {
                    view3 = (View) parent2;
                    rect.offset(view3.getLeft(), view3.getTop());
                }
            }
            boolean z2 = parent instanceof View;
            int i22 = 0;
            if (A0B2 != -1) {
                Context context = A0b.getContext();
                float f = (float) A0B2;
                A002 = C18092VlM.A00(context, f);
                A003 = C18092VlM.A00(context, f);
                A004 = C18092VlM.A00(context, f);
                i22 = C18092VlM.A00(context, f);
            } else if (z2) {
                A002 = A0b.getLeft();
                A003 = A0b.getTop();
                View view4 = (View) parent;
                A004 = view4.getWidth() - A0b.getRight();
                i22 = view4.getHeight() - A0b.getBottom();
            } else {
                A002 = 0;
                A003 = 0;
                A004 = 0;
            }
            rect.left -= A002;
            rect.top -= A003;
            rect.right += A004;
            rect.bottom += i22;
            C66581MXm.A18(rect, A0b, view2);
        }
        this.A04 = view.requireViewById(R.id.question_cta);
        this.A06 = view.requireViewById(R.id.question_unread_dot);
        this.A07 = DbU.A0G(view, R.id.question_cta_text);
        this.A0A = DbT.A0b(view, R.id.question_cta_arrow);
        this.A0B = DbT.A0b(view, R.id.question_cta_icon);
        AnonymousClass3NG r4 = new AnonymousClass3NG(view);
        r4.A04 = new C15848UjY(this, 27);
        r4.A07 = true;
        r4.A0C = true;
        AnonymousClass3NM A005 = r4.A00();
        this.A09 = A005;
        view.setOnTouchListener(A005);
        int A0E2 = AnonymousClass7TE.A0E(A052);
        float[] fArr = new float[8];
        fArr[0] = 0.0f;
        C13989Tnp.A1U(fArr, 0.0f);
        float f2 = (float) A0E2;
        fArr[4] = f2;
        C51975G9x.A1L(fArr, f2);
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.A01 = gradientDrawable;
        gradientDrawable.setCornerRadii(fArr);
        gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        this.A02 = gradientDrawable2;
        gradientDrawable2.setCornerRadii(fArr);
        aspectRatioLinearLayout.setAspectRatio(((float) A052.getDimensionPixelSize(R.dimen.intent_aware_ad_rifu_card_large_width)) / ((float) A052.getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_width)));
    }
}
