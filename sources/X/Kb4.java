package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.igds.components.imagebutton.IgMultiImageButton;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

public final class Kb4 extends MediaFrameLayout {
    public C66426MRg A00;
    public C60072Jf5 A01;
    public IgMultiImageButton A02;

    /* JADX WARNING: type inference failed for: r5v0, types: [androidx.constraintlayout.widget.ConstraintLayout, android.view.View, X.Jf5, android.view.ViewGroup] */
    public Kb4(Context context) {
        super(context, (AttributeSet) null, 0);
        ? constraintLayout = new ConstraintLayout(context);
        View inflate = LayoutInflater.from(context).inflate(R.layout.insights_media_overlay_view, constraintLayout);
        constraintLayout.A00 = inflate;
        if (inflate != null) {
            constraintLayout.A02 = (CircularImageView) inflate.findViewById(R.id.media_owner_image);
            View view = constraintLayout.A00;
            if (view != null) {
                IgTextView A0a = DbT.A0a(view, R.id.media_metric_value);
                constraintLayout.A01 = A0a;
                String str = "metricText";
                if (A0a != null) {
                    A0a.setTextColor(-1);
                    IgTextView igTextView = constraintLayout.A01;
                    if (igTextView != null) {
                        igTextView.setGravity(17);
                        IgTextView igTextView2 = constraintLayout.A01;
                        if (igTextView2 != null) {
                            igTextView2.setMaxLines(1);
                            GradientDrawable gradientDrawable = new GradientDrawable();
                            gradientDrawable.setShape(0);
                            gradientDrawable.setColor(context.getColor(R.color.grey_9_10_transparent));
                            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material);
                            IgTextView igTextView3 = constraintLayout.A01;
                            if (igTextView3 != null) {
                                gradientDrawable.setCornerRadius(((float) (igTextView3.getLineHeight() + (dimensionPixelSize * 2))) / 2.0f);
                                View view2 = constraintLayout.A00;
                                if (view2 != null) {
                                    view2.setBackground(gradientDrawable);
                                    constraintLayout.setImportantForAccessibility(2);
                                    IgTextView igTextView4 = constraintLayout.A01;
                                    if (igTextView4 != null) {
                                        igTextView4.setImportantForAccessibility(2);
                                        this.A01 = constraintLayout;
                                        setupImageButton(context);
                                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 81);
                                        layoutParams.bottomMargin = JTT.A05(this, R.dimen.abc_button_padding_horizontal_material);
                                        C60072Jf5 jf5 = this.A01;
                                        if (jf5 == null) {
                                            str = "overlayView";
                                        } else {
                                            addView(jf5, layoutParams);
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
        }
        0qQ.A0F("view");
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.widget.ImageView, com.instagram.igds.components.imagebutton.IgMultiImageButton] */
    /* JADX WARNING: type inference failed for: r2v2, types: [android.view.View, com.instagram.igds.components.imagebutton.IgMultiImageButton] */
    private final void setupImageButton(Context context) {
        ? igMultiImageButton = new IgMultiImageButton(context, (AttributeSet) null, 0);
        this.A02 = igMultiImageButton;
        igMultiImageButton.setScaleType(ImageView.ScaleType.CENTER_CROP);
        IgMultiImageButton igMultiImageButton2 = this.A02;
        if (igMultiImageButton2 != null) {
            igMultiImageButton2.setPlaceHolderColor(context.getColor(2Yu.A04(context)));
            ? r2 = this.A02;
            if (r2 != 0) {
                addView(r2, new FrameLayout.LayoutParams(-1, -1));
                return;
            }
        }
        0qQ.A0F("imageButton");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void setAspect(float f) {
        this.A00 = f;
        IgMultiImageButton igMultiImageButton = this.A02;
        if (igMultiImageButton == null) {
            0qQ.A0F("imageButton");
            throw AnonymousClass00P.createAndThrow();
        } else {
            igMultiImageButton.A00 = f;
        }
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [android.view.View, com.instagram.igds.components.imagebutton.IgMultiImageButton] */
    /* JADX WARNING: type inference failed for: r2v1, types: [android.view.View, com.instagram.igds.components.imagebutton.IgMultiImageButton] */
    /* JADX WARNING: type inference failed for: r0v5, types: [android.view.View, com.instagram.igds.components.imagebutton.IgMultiImageButton] */
    /* JADX WARNING: type inference failed for: r1v2, types: [android.view.View, com.instagram.igds.components.imagebutton.IgMultiImageButton] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0037  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setData(java.lang.String r6, com.instagram.common.typedurl.ImageUrl r7, X.C16528UwY r8, java.lang.String r9, boolean r10, boolean r11, X.AnonymousClass0iw r12, com.instagram.common.typedurl.ImageUrl r13) {
        /*
            r5 = this;
            java.lang.String r2 = "Required value was null."
            java.lang.String r4 = "imageButton"
            if (r7 == 0) goto L_0x000f
            com.instagram.igds.components.imagebutton.IgMultiImageButton r0 = r5.A02
            if (r0 == 0) goto L_0x008c
            if (r12 == 0) goto L_0x0095
            r0.setUrl(r7, r12)
        L_0x000f:
            if (r8 == 0) goto L_0x0084
            int r1 = r8.ordinal()
            r0 = 3
            if (r1 == r0) goto L_0x007d
            r0 = 9
            if (r1 == r0) goto L_0x0076
            r0 = 12
            if (r1 != r0) goto L_0x0084
            com.instagram.igds.components.imagebutton.IgMultiImageButton r1 = r5.A02
            if (r1 == 0) goto L_0x008c
            X.6uM r0 = X.C321546uM.A0L
        L_0x0026:
            r1.setIcon(r0)
        L_0x0029:
            X.Jf5 r3 = r5.A01
            java.lang.String r0 = "overlayView"
            if (r3 != 0) goto L_0x0037
            X.0qQ.A0F(r0)
        L_0x0032:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0037:
            r1 = 0
            r3.setVisibility(r1)
            if (r11 == 0) goto L_0x006c
            if (r13 == 0) goto L_0x006c
            if (r12 == 0) goto L_0x0090
            r3.setWithAvatarImage(r12, r13, r9)
        L_0x0044:
            com.instagram.igds.components.imagebutton.IgMultiImageButton r0 = r5.A02
            if (r0 == 0) goto L_0x008c
            r0.setVisibility(r1)
            com.instagram.igds.components.imagebutton.IgMultiImageButton r2 = r5.A02
            if (r2 == 0) goto L_0x008c
            r1 = 5
            X.LXK r0 = new X.LXK
            r0.<init>(r6, r5, r1)
            r2.setOnClickListener(r0)
            com.instagram.igds.components.imagebutton.IgMultiImageButton r0 = r5.A02
            if (r0 == 0) goto L_0x008c
            r0.setContentDescription(r9)
            com.instagram.igds.components.imagebutton.IgMultiImageButton r1 = r5.A02
            if (r1 == 0) goto L_0x008c
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.2eS.A04(r1, r0)
            X.2eS.A04(r3, r0)
            return
        L_0x006c:
            if (r10 == 0) goto L_0x0072
            r3.setWithEyeIcon(r9)
            goto L_0x0044
        L_0x0072:
            r3.setMetricOnly(r9)
            goto L_0x0044
        L_0x0076:
            com.instagram.igds.components.imagebutton.IgMultiImageButton r1 = r5.A02
            if (r1 == 0) goto L_0x008c
            X.6uM r0 = X.C321546uM.A08
            goto L_0x0026
        L_0x007d:
            com.instagram.igds.components.imagebutton.IgMultiImageButton r1 = r5.A02
            if (r1 == 0) goto L_0x008c
            X.6uM r0 = X.C321546uM.A0N
            goto L_0x0026
        L_0x0084:
            com.instagram.igds.components.imagebutton.IgMultiImageButton r0 = r5.A02
            if (r0 == 0) goto L_0x008c
            r0.A0H()
            goto L_0x0029
        L_0x008c:
            X.0qQ.A0F(r4)
            goto L_0x0032
        L_0x0090:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        L_0x0095:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Kb4.setData(java.lang.String, com.instagram.common.typedurl.ImageUrl, X.UwY, java.lang.String, boolean, boolean, X.0iw, com.instagram.common.typedurl.ImageUrl):void");
    }

    public final void setDelegate(C66426MRg mRg) {
        this.A00 = mRg;
    }
}
