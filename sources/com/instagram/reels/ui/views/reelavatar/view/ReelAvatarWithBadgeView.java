package com.instagram.reels.ui.views.reelavatar.view;

import X.0eO;
import X.0mk;
import X.0nA;
import X.0qQ;
import X.2Su;
import X.2Yu;
import X.AZK;
import X.AnonymousClass0eM;
import X.AnonymousClass0iw;
import X.AnonymousClass1GB;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C240943Ng;
import X.C252063oV;
import X.C262364Dk;
import X.C66580MXl;
import X.C66581MXm;
import X.C67273Ml8;
import X.C73901Plc;
import X.DbU;
import X.DbY;
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
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.CornerPunchedImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ReelAvatarWithBadgeView extends FrameLayout {
    public CircularImageView A00;
    public CornerPunchedImageView A01;
    public C252063oV A02;
    public int A03;
    public int A04;
    public Drawable A05;
    public final AnonymousClass0eM A06;
    public final int A07;
    public final boolean A08;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ReelAvatarWithBadgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.common.ui.widget.imageview.CornerPunchedImageView, android.view.View] */
    public final void A04(ImageUrl imageUrl, AnonymousClass0iw r4) {
        0qQ.A0B(r4, 1);
        C66581MXm.A1A(this.A01, -1);
        setSingleAvatarUrlAndVisibility(imageUrl, r4);
    }

    public final void dispatchDraw(Canvas canvas) {
        float width;
        0qQ.A0B(canvas, 0);
        super.dispatchDraw(canvas);
        Drawable drawable = this.A05;
        if (drawable != null) {
            canvas.save();
            int width2 = getWidth();
            int height = getHeight();
            Rect A0X = AnonymousClass7TE.A0X(drawable);
            float height2 = (((float) height) - (((float) A0X.height()) / 2.0f)) - ((float) this.A04);
            if (this.A08) {
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

    public final void setDoubleAvatarUrlsAndVisibility(ImageUrl imageUrl, ImageUrl imageUrl2, AnonymousClass0iw r7) {
        AnonymousClass7TF.A1B(imageUrl, 0, r7);
        IgImageView view = this.A02.getView();
        IgImageView igImageView = this.A01;
        int i = this.A07;
        igImageView.setPlaceHolderColor(i);
        view.setPlaceHolderColor(i);
        igImageView.setUrl(imageUrl, r7);
        if (imageUrl2 != null) {
            view.setUrl(imageUrl2, r7);
        } else {
            view.A0B();
        }
        igImageView.setVisibility(0);
        view.setVisibility(0);
        setSingleAvatarBirthdayConfettiAnimation(false);
    }

    public final void setSingleAvatarUrlAndVisibility(ImageUrl imageUrl, AnonymousClass0iw r4) {
        0qQ.A0B(r4, 1);
        IgImageView igImageView = this.A01;
        igImageView.setPlaceHolderColor(this.A07);
        if (imageUrl != null) {
            igImageView.setUrl(imageUrl, r4);
        } else {
            igImageView.A09();
        }
        igImageView.setVisibility(0);
        this.A02.setVisibility(8);
    }

    private final View getBadgeClickDelegate() {
        return AnonymousClass7TE.A0c(this.A06);
    }

    /* access modifiers changed from: private */
    public final Rect getBadgeDrawableRect() {
        int i;
        Drawable drawable = this.A05;
        if (drawable == null) {
            return null;
        }
        int width = getWidth();
        int height = (getHeight() - (JTP.A06(drawable) / 2)) - this.A04;
        boolean z = this.A08;
        int A062 = AnonymousClass7TF.A06(drawable);
        if (z) {
            i = A062 / 2;
        } else {
            i = width - (A062 / 2);
        }
        int i2 = i - this.A03;
        return C66580MXl.A0C(i2, height, AnonymousClass7TF.A06(drawable) + i2, JTP.A06(drawable) + height);
    }

    public final void A01(Drawable drawable) {
        IgImageView igImageView = this.A01;
        C66581MXm.A1A(igImageView, -1);
        igImageView.setPlaceHolderColor(this.A07);
        if (drawable == null) {
            igImageView.A09();
        } else if (drawable instanceof C262364Dk) {
            ((C262364Dk) drawable).A01(new AZK(this, 8));
        } else {
            igImageView.setImageDrawable(drawable);
        }
        igImageView.setVisibility(0);
        this.A02.setVisibility(8);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [com.instagram.common.ui.widget.imageview.CornerPunchedImageView, android.view.View] */
    public final void A02(Drawable drawable, int i) {
        Drawable drawable2 = this.A05;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            this.A05 = drawable;
            ? r1 = this.A01;
            if (drawable != null) {
                r1.A00 = true;
                r1.invalidate();
                drawable.setCallback(this);
                drawable.setBounds(0, 0, i, i);
            } else {
                r1.A00 = false;
                r1.invalidate();
                post(new C67273Ml8(this));
            }
            invalidate();
        }
    }

    public final void setBadgeOffset(int i) {
        this.A03 = i;
        this.A04 = i;
        invalidate();
    }

    public final void setBadgeOffsetX(int i) {
        this.A03 = i;
        invalidate();
    }

    public final void setBadgeOffsetY(int i) {
        this.A04 = i;
        invalidate();
    }

    public final void setForceTrackingForProfileImageEnabled(boolean z) {
        this.A01.A0M = z;
    }

    public final void setFrontAvatarPunchOffsetX(int i) {
        this.A01.setPunchOffsetX(i);
    }

    public final void setFrontAvatarPunchOffsetY(int i) {
        this.A01.setPunchOffsetY(i);
    }

    public final void setFrontAvatarPunchRadius(int i) {
        this.A01.setPunchRadius(i);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.common.ui.widget.imageview.CornerPunchedImageView, android.widget.ImageView] */
    public final void setScaleType(ImageView.ScaleType scaleType) {
        this.A01.setScaleType(scaleType);
        C252063oV r1 = this.A02;
        if (r1.CVM()) {
            ((ImageView) r1.getView()).setScaleType(scaleType);
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r1v1, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView, android.view.View] */
    public final void setSingleAvatarBirthdayConfettiAnimation(boolean z) {
        Context context;
        if (!z || (context = getContext()) == null) {
            this.A00.setVisibility(8);
            return;
        }
        ? r1 = this.A00;
        r1.setVisibility(0);
        C240943Ng.A00(context, r1);
        C240943Ng.A01(r1.getDrawable());
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [com.instagram.common.ui.widget.imageview.CornerPunchedImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v5, types: [com.instagram.common.ui.widget.imageview.CornerPunchedImageView, android.view.View] */
    public final void A03(AnonymousClass0iw r7, ImageUrl imageUrl, ImageUrl imageUrl2, int i) {
        DbY.A1S(imageUrl, r7);
        float f = (float) i;
        float f2 = 0.8125f * f;
        float f3 = f - f2;
        float f4 = f2 / 2.0f;
        float f5 = f3 - f4;
        int A012 = AnonymousClass1GB.A01(f2);
        int A013 = AnonymousClass1GB.A01(f3);
        int A014 = AnonymousClass1GB.A01(f5);
        int A015 = AnonymousClass1GB.A01(f4 * 1.154f);
        ? r0 = this.A01;
        C66581MXm.A1A(r0, A012);
        0nA.A0d(r0, A013);
        0nA.A0e(r0, A013);
        ? r02 = (CornerPunchedImageView) this.A02.getView();
        C66581MXm.A1A(r02, A012);
        r02.setPunchOffsetX(A014);
        r02.setPunchOffsetY(A014);
        r02.setPunchRadius(A015);
        setDoubleAvatarUrlsAndVisibility(imageUrl, imageUrl2, r7);
    }

    /* JADX WARNING: type inference failed for: r0v12, types: [com.instagram.common.ui.widget.imageview.CornerPunchedImageView, android.view.View] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReelAvatarWithBadgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        this.A08 = 0mk.A02(context);
        this.A06 = C73901Plc.A00(context, 0eO.A02, 35);
        LayoutInflater from = LayoutInflater.from(context);
        0qQ.A07(from);
        View A012 = 2Su.A01(from, (ViewGroup.LayoutParams) null, this, R.layout.reel_avatar_with_badge_view, false, false);
        addView(A012);
        this.A01 = (CornerPunchedImageView) A012.requireViewById(R.id.reel_viewer_front_avatar);
        this.A00 = DbU.A0X(A012, R.id.birthday_confetti_circular_imageview);
        this.A02 = DbU.A0Y(A012, R.id.reel_viewer_back_avatar_stub);
        ? r0 = this.A01;
        r0.A00 = false;
        r0.invalidate();
        this.A07 = getContext().getColor(2Yu.A04(context));
        int A032 = AnonymousClass7TG.A03(context);
        this.A03 = A032;
        this.A04 = A032;
    }

    public /* synthetic */ ReelAvatarWithBadgeView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ReelAvatarWithBadgeView(Context context) {
        this(context, (AttributeSet) null);
        0qQ.A0B(context, 1);
    }
}
