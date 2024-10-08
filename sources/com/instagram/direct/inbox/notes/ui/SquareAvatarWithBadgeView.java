package com.instagram.direct.inbox.notes.ui;

import X.0eO;
import X.0mk;
import X.0qQ;
import X.2Su;
import X.AnonymousClass0eM;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C240943Ng;
import X.C66580MXl;
import X.C73924Pm4;
import X.DbU;
import X.JTP;
import X.JTT;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class SquareAvatarWithBadgeView extends FrameLayout {
    public Drawable A00;
    public CircularImageView A01;
    public CornerPunchedRoundedCornerImageView A02;
    public int A03;
    public int A04;
    public final AnonymousClass0eM A05;
    public final boolean A06;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SquareAvatarWithBadgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    public final void dispatchDraw(Canvas canvas) {
        float width;
        0qQ.A0B(canvas, 0);
        super.dispatchDraw(canvas);
        Drawable drawable = this.A00;
        if (drawable != null) {
            canvas.save();
            int width2 = getWidth();
            int height = getHeight();
            Rect A0X = AnonymousClass7TE.A0X(drawable);
            float height2 = (((float) height) - (((float) A0X.height()) / 2.0f)) - ((float) this.A04);
            if (this.A06) {
                width = ((float) A0X.width()) / 2.0f;
            } else {
                width = ((float) width2) - (((float) A0X.width()) / 2.0f);
            }
            canvas.translate(width - ((float) this.A03), height2);
            float max = Math.max(((float) A0X.width()) / ((float) drawable.getIntrinsicWidth()), ((float) A0X.height()) / ((float) drawable.getIntrinsicHeight()));
            if (max > 1.0f) {
                canvas.scale(max, max, A0X.exactCenterX(), A0X.exactCenterY());
            }
            drawable.draw(canvas);
            canvas.restore();
        }
    }

    private final View getBadgeClickDelegate() {
        return AnonymousClass7TE.A0c(this.A05);
    }

    /* access modifiers changed from: private */
    public final Rect getBadgeDrawableRect() {
        int i;
        Drawable drawable = this.A00;
        if (drawable == null) {
            return null;
        }
        int width = getWidth();
        int height = (getHeight() - (JTP.A06(drawable) / 2)) - this.A04;
        boolean z = this.A06;
        int A062 = AnonymousClass7TF.A06(drawable);
        if (z) {
            i = A062 / 2;
        } else {
            i = width - (A062 / 2);
        }
        int i2 = i - this.A03;
        return C66580MXl.A0C(i2, height, AnonymousClass7TF.A06(drawable) + i2, JTP.A06(drawable) + height);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r1v1, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView, android.view.View] */
    public final void setSingleAvatarBirthdayConfettiAnimation(boolean z) {
        Context context;
        if (!z || (context = getContext()) == null) {
            this.A01.setVisibility(8);
            return;
        }
        ? r1 = this.A01;
        r1.setVisibility(0);
        C240943Ng.A00(context, r1);
        C240943Ng.A01(r1.getDrawable());
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [android.view.View, com.instagram.direct.inbox.notes.ui.CornerPunchedRoundedCornerImageView] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SquareAvatarWithBadgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        this.A06 = 0mk.A02(context);
        this.A05 = C73924Pm4.A00(context, 0eO.A02, 44);
        LayoutInflater from = LayoutInflater.from(context);
        0qQ.A07(from);
        View A012 = 2Su.A01(from, (ViewGroup.LayoutParams) null, this, R.layout.square_avatar_with_badge_view, false, false);
        addView(A012);
        this.A02 = (CornerPunchedRoundedCornerImageView) A012.requireViewById(R.id.square_avatar);
        this.A01 = DbU.A0X(A012, R.id.birthday_confetti_circular_imageview);
        ? r0 = this.A02;
        r0.A00 = false;
        r0.invalidate();
        int A032 = AnonymousClass7TG.A03(context);
        this.A03 = A032;
        this.A04 = A032;
    }

    public /* synthetic */ SquareAvatarWithBadgeView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SquareAvatarWithBadgeView(Context context) {
        this(context, (AttributeSet) null);
        0qQ.A0B(context, 1);
    }
}
