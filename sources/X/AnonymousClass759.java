package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.759  reason: invalid class name */
public final class AnonymousClass759 {
    public final Context A00;
    public final View A01;
    public final UserSession A02;
    public final IgImageView A03;
    public final C231672s5 A04;
    public final C252063oV A05;
    public final AnonymousClass75A A06;
    public final AnonymousClass0eM A07;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: X.75A} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: X.75A} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: X.75A} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AnonymousClass759(android.content.Context r3, android.view.View r4, com.instagram.common.session.UserSession r5, com.instagram.common.ui.widget.imageview.IgImageView r6, X.C231672s5 r7, X.C252063oV r8, X.0t0 r9, int r10) {
        /*
            r2 = this;
            r1 = 0
            r0 = r10 & 32
            if (r0 == 0) goto L_0x000b
            X.PkK r0 = X.C73821PkK.A00
            X.0t0 r9 = X.AnonymousClass0eN.A01(r0)
        L_0x000b:
            r0 = r10 & 64
            if (r0 == 0) goto L_0x0019
            java.lang.Object r0 = r9.getValue()
            X.3Us r0 = (X.C242553Us) r0
            X.77D r7 = X.C3265577g.A04(r0, r6)
        L_0x0019:
            r0 = r10 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0022
            X.75A r1 = new X.75A
            r1.<init>()
        L_0x0022:
            r0 = 3
            X.0qQ.A0B(r8, r0)
            r0 = 4
            X.0qQ.A0B(r6, r0)
            r0 = 5
            X.0qQ.A0B(r4, r0)
            r0 = 6
            X.0qQ.A0B(r9, r0)
            r0 = 7
            X.0qQ.A0B(r7, r0)
            r0 = 8
            X.0qQ.A0B(r1, r0)
            r2.<init>()
            r2.A02 = r5
            r2.A00 = r3
            r2.A05 = r8
            r2.A03 = r6
            r2.A01 = r4
            r2.A07 = r9
            r2.A04 = r7
            r2.A06 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass759.<init>(android.content.Context, android.view.View, com.instagram.common.session.UserSession, com.instagram.common.ui.widget.imageview.IgImageView, X.2s5, X.3oV, X.0eM, int):void");
    }

    public static final ShapeDrawable A00(AnonymousClass759 r3) {
        C328047Df r2 = new C328047Df((C242553Us) null, 127);
        r2.A02((C242553Us) r3.A07.getValue(), AnonymousClass05K.A00);
        return new ShapeDrawable(r2);
    }

    public final void A03(int i, boolean z) {
        ShapeDrawable shapeDrawable;
        int i2;
        String str;
        Context context;
        int i3;
        if (!182.A06(0Tu.A05, this.A02, 36328813369769577L)) {
            shapeDrawable = A00(this);
            this.A07.getValue();
        } else {
            shapeDrawable = null;
        }
        if (i == 0) {
            context = this.A00;
            i2 = context.getColor(2Yu.A0H(context, R.attr.igds_color_creation_tools_grey_08));
            int i4 = 2131966202;
            if (z) {
                i4 = 2131966203;
            }
            str = context.getString(i4);
            i3 = 2131960437;
            if (z) {
                i3 = 2131960438;
            }
        } else if (i == 1) {
            context = this.A00;
            i2 = context.getColor(2Yu.A0H(context, R.attr.igds_color_secondary_button_on_media_panavision));
            int i5 = 2131966202;
            if (z) {
                i5 = 2131966203;
            }
            str = context.getString(i5);
            i3 = 2131960435;
            if (z) {
                i3 = 2131960436;
            }
        } else if (i == 2) {
            A01((Drawable) null, (ShapeDrawable) null, this, (Float) null, (Integer) null, (String) null, (String) null, (C62320sa) null, 0, 0, false);
            return;
        } else {
            throw new IllegalStateException("Not a valid ImageRevealStatus");
        }
        String string = context.getString(i3);
        if (shapeDrawable == null) {
            shapeDrawable = A00(this);
        }
        A01((Drawable) null, shapeDrawable, this, (Float) null, (Integer) null, str, string, (C62320sa) null, 1, i2, false);
    }

    public final void A04(PrivacyMediaOverlayViewModel privacyMediaOverlayViewModel, C62320sa r22, int i) {
        ShapeDrawable shapeDrawable;
        Drawable drawable;
        Integer num;
        Float f = null;
        PrivacyMediaOverlayViewModel privacyMediaOverlayViewModel2 = privacyMediaOverlayViewModel;
        if (!182.A06(0Tu.A05, this.A02, 36328813369769577L)) {
            shapeDrawable = A00(this);
            Integer num2 = privacyMediaOverlayViewModel2.A01;
            if (num2 != null) {
                int intValue = num2.intValue();
                Context context = this.A00;
                drawable = AnonymousClass4Ed.A01(context, intValue, 2Yu.A05(context));
            } else {
                drawable = null;
            }
            this.A07.getValue();
        } else {
            shapeDrawable = null;
            drawable = null;
        }
        int i2 = i;
        if (i == 0) {
            Context context2 = this.A00;
            int color = context2.getColor(2Yu.A0H(context2, R.attr.igds_color_creation_tools_grey_08));
            String str = privacyMediaOverlayViewModel2.A06;
            String str2 = privacyMediaOverlayViewModel2.A04;
            if (shapeDrawable == null) {
                shapeDrawable = A00(this);
            }
            A01((Drawable) null, shapeDrawable, this, (Float) null, (Integer) null, str, str2, (C62320sa) null, 2, color, false);
        } else if (i2 == 1) {
            Context context3 = this.A00;
            int color2 = context3.getColor(2Yu.A0H(context3, R.attr.igds_color_secondary_button_on_media_panavision));
            boolean z = privacyMediaOverlayViewModel2.A07;
            if (z) {
                num = Integer.valueOf(context3.getResources().getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material));
            } else {
                num = null;
            }
            String str3 = privacyMediaOverlayViewModel2.A05;
            if (z) {
                f = Float.valueOf(context3.getResources().getDimension(R.dimen.music_attribution_trending_icon_size));
            }
            String str4 = privacyMediaOverlayViewModel2.A03;
            if (shapeDrawable == null) {
                shapeDrawable = A00(this);
            }
            if (drawable == null) {
                Integer num3 = privacyMediaOverlayViewModel2.A01;
                if (num3 != null) {
                    drawable = AnonymousClass4Ed.A01(context3, num3.intValue(), 2Yu.A05(context3));
                } else {
                    drawable = null;
                }
            }
            boolean z2 = true;
            if (privacyMediaOverlayViewModel2.A00 != 1) {
                z2 = false;
            }
            A01(drawable, shapeDrawable, this, f, num, str3, str4, r22, 2, color2, z2);
        } else if (i2 == 2) {
            A01((Drawable) null, (ShapeDrawable) null, this, (Float) null, (Integer) null, (String) null, (String) null, (C62320sa) null, 0, 0, false);
        } else {
            throw new IllegalStateException("Not a valid ImageRevealStatus");
        }
    }

    public static final void A01(Drawable drawable, ShapeDrawable shapeDrawable, AnonymousClass759 r13, Float f, Integer num, String str, String str2, C62320sa r18, int i, int i2, boolean z) {
        int i3;
        int i4;
        int i5 = i;
        if (182.A06(0Tu.A05, r13.A02, 36328813369769577L) && i == 0) {
            C252063oV r1 = r13.A05;
            if (!r1.CVM() || r1.getView().getVisibility() != 0) {
                return;
            }
        }
        IgImageView igImageView = r13.A03;
        AnonymousClass75B.A00(igImageView, i5);
        if (i == 0) {
            r13.A01.setForeground((Drawable) null);
            r13.A05.setVisibility(8);
            igImageView.setImageRendererAndReset(r13.A04);
            return;
        }
        C252063oV r10 = r13.A05;
        TextView textView = (TextView) r10.getView().findViewById(R.id.privacy_overlay_title);
        TextView textView2 = (TextView) r10.getView().findViewById(R.id.privacy_overlay_subtitle);
        ImageView imageView = (ImageView) r10.getView().findViewById(R.id.privacy_overlay_icon);
        SpinnerImageView spinnerImageView = (SpinnerImageView) r10.getView().findViewById(R.id.spinner);
        View findViewById = r10.getView().findViewById(R.id.reveal_content_container);
        if (num != null) {
            int intValue = num.intValue();
            r10.getView().setPadding(intValue, intValue, intValue, intValue);
        }
        if (spinnerImageView != null) {
            if (z) {
                spinnerImageView.setLoadingStatus(C255943uy.LOADING);
                i4 = 0;
            } else {
                i4 = 8;
            }
            spinnerImageView.setVisibility(i4);
        }
        if (findViewById != null) {
            int i6 = 0;
            if (z) {
                i6 = 8;
            }
            findViewById.setVisibility(i6);
        }
        if (imageView != null) {
            if (drawable != null) {
                imageView.setImageDrawable(drawable);
                i3 = 0;
            } else {
                i3 = 8;
            }
            imageView.setVisibility(i3);
        }
        if (textView != null) {
            int i7 = 0;
            String str3 = str;
            if (str == null || str3.length() == 0) {
                i7 = 8;
            } else {
                textView.setText(str3);
                if (f != null) {
                    textView.setTextSize(0, f.floatValue());
                }
            }
            textView.setVisibility(i7);
        }
        if (textView2 != null) {
            int i8 = 0;
            String str4 = str2;
            if (str2 == null || str4.length() == 0) {
                i8 = 8;
            } else {
                textView2.setText(str4);
            }
            textView2.setVisibility(i8);
        }
        r10.setVisibility(0);
        if (shapeDrawable != null) {
            C308486Ul.A02(Paint.Style.FILL, shapeDrawable, shapeDrawable.getShape(), 0.0f, i2);
            r13.A01.setForeground(shapeDrawable);
        } else {
            r13.A01.setForeground((Drawable) null);
        }
        igImageView.setImageRendererAndReset(r13.A04);
        if (r18 != null) {
            r18.invoke();
        }
    }

    public final void A02() {
        if (182.A06(0Tu.A05, this.A02, 36328813369769577L)) {
            C252063oV r1 = this.A05;
            if (!r1.CVM() || r1.getView().getVisibility() != 0) {
                return;
            }
        }
        this.A05.setVisibility(8);
        IgImageView igImageView = this.A03;
        AnonymousClass75B.A00(igImageView, 0);
        this.A01.setForeground((Drawable) null);
        igImageView.setImageRendererAndReset(this.A04);
    }
}
