package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.widget.TextView;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.android.R;
import go.Seq;
import org.webrtc.EglBase14Impl;

public abstract class SRn {
    public static final void A01(TextView textView, int i, int i2) {
        int i3;
        Context context = textView.getContext();
        AnonymousClass2E0.A0A();
        switch (i) {
            case 0:
            case 36:
                i3 = R.style.FBPayUIPrimaryTextStyle;
                break;
            case 1:
                i3 = 2132017628;
                break;
            case 2:
            case 20:
            case 27:
                i3 = 2132017626;
                break;
            case 3:
            case 9:
            case 11:
            case 13:
            case 16:
            case 17:
                i3 = R.style.FBPayUISecondaryTexStyle;
                break;
            case 4:
                i3 = R.style.FBPayUIButtonTexStyle;
                break;
            case 5:
                i3 = R.style.FBPayUIPrimaryTitleStyle;
                break;
            case 6:
                i3 = 2132017630;
                break;
            case 7:
                i3 = 2132017631;
                break;
            case EglBase14Impl.EGLExt_SDK_VERSION /*18*/:
                i3 = 2132017633;
                break;
            case 21:
            case 22:
            case 25:
            case 34:
                throw DbW.A0a("Invalid typography type: ", i);
            case 23:
            case 24:
                i3 = R.style.FBPayUISelectionButtonTextStyle;
                break;
            case 26:
                i3 = R.style.igds_emphasized_body_2;
                break;
            case 28:
                i3 = R.style.igds_headline_2_emphasized;
                break;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
                i3 = R.style.igds_emphasized_label;
                break;
            case 30:
            case 33:
                i3 = R.style.PrivacyTextStyle;
                break;
            case 31:
                i3 = R.style.control_option_title_text;
                break;
            case 32:
                i3 = R.style.FBPayUIButtonTextEmphasizedStyle;
                break;
            case 35:
                i3 = R.style.FBPayUIFooterTexTStyle;
                break;
            case 37:
                i3 = 2132017627;
                break;
            case 38:
                i3 = 2132017632;
                break;
            case 39:
                i3 = R.style.FBPayUIBadgeIconTextStyle;
                break;
            case 40:
            case Seq.NULL_REFNUM /*41*/:
            case 44:
                i3 = 2132017635;
                break;
            case Seq.RefTracker.REF_OFFSET /*42*/:
                i3 = R.style.FBPayUIOrderSummaryOrginalPriceStyle;
                break;
            case 43:
                i3 = 2132017636;
                break;
            case 45:
                i3 = R.style.FBPayUICheckoutOptionalityTextStyle;
                break;
            default:
                i3 = 2132017637;
                break;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i3, C71382cm.A0i);
        textView.setTypeface(Typeface.create(obtainStyledAttributes.getString(4), obtainStyledAttributes.getInt(1, 0)));
        int i4 = obtainStyledAttributes.getInt(5, -1);
        if (i4 != -1) {
            textView.setTypeface(Typeface.create(textView.getTypeface(), i4, false));
        }
        textView.setTextSize(0, obtainStyledAttributes.getDimension(0, 0.0f));
        textView.setTextColor(SPB.A00(context, i2));
        AnonymousClass2E0.A0A();
        textView.setLinkTextColor(context.getColor(R.color.igds_link));
        textView.setLineSpacing((float) obtainStyledAttributes.getDimensionPixelSize(2, 0), obtainStyledAttributes.getFloat(3, 1.0f));
        obtainStyledAttributes.recycle();
    }

    public static final void A03(TextView textView, CharSequence charSequence) {
        if (charSequence == null || 00l.A0W(charSequence)) {
            textView.setVisibility(4);
            return;
        }
        textView.setText(charSequence);
        textView.setVisibility(0);
    }

    public static final void A04(TextView textView, CharSequence charSequence) {
        if (charSequence == null || 00l.A0W(charSequence)) {
            textView.setVisibility(8);
            return;
        }
        textView.setText(charSequence);
        textView.setVisibility(0);
    }

    public static final void A00(TextView textView) {
        Context context = textView.getContext();
        AnonymousClass2E0.A0A();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.FBPayUITextButtonBackground, C71382cm.A0d);
        StateListDrawable stateListDrawable = new StateListDrawable();
        int[] iArr = {16842919};
        AnonymousClass2E0.A0A();
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        if (drawable != null) {
            AnonymousClass2E0.A0A();
            DbU.A10(context, drawable, R.color.context_line_color);
            stateListDrawable.addState(iArr, drawable);
            stateListDrawable.addState(new int[]{-16842919}, (Drawable) null);
            int[] iArr2 = {16842908};
            AnonymousClass2E0.A0A();
            Drawable drawable2 = obtainStyledAttributes.getDrawable(1);
            if (drawable2 != null) {
                AnonymousClass2E0.A0A();
                DbU.A10(context, drawable2, R.color.context_line_color);
                stateListDrawable.addState(iArr2, drawable2);
                stateListDrawable.addState(new int[]{-16842908}, (Drawable) null);
                textView.setBackground(stateListDrawable);
                obtainStyledAttributes.recycle();
                return;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public static final void A02(TextView textView, RH2 rh2) {
        AnonymousClass7TG.A1N(textView, rh2);
        A01(textView, rh2.A01, rh2.A00);
    }
}
