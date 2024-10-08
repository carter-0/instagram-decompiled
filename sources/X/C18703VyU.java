package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.TypedValue;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.bridge.ReadableMap;

/* renamed from: X.VyU  reason: case insensitive filesystem */
public final class C18703VyU {
    public static final TypedValue A00 = new TypedValue();

    public static Drawable A00(Context context, ReadableMap readableMap) {
        int color;
        ColorDrawable colorDrawable;
        Drawable rippleDrawable;
        String str;
        boolean hasKey;
        int identifier;
        String string = readableMap.getString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        if ("ThemeAttrAndroid".equals(string)) {
            String string2 = readableMap.getString("attribute");
            if (string2 != null) {
                if ("selectableItemBackground".equals(string2)) {
                    identifier = 16843534;
                } else if ("selectableItemBackgroundBorderless".equals(string2)) {
                    identifier = 16843868;
                } else {
                    identifier = context.getResources().getIdentifier(string2, "attr", "android");
                }
                Resources.Theme theme = context.getTheme();
                TypedValue typedValue = A00;
                if (theme.resolveAttribute(identifier, typedValue, true)) {
                    rippleDrawable = context.getResources().getDrawable(typedValue.resourceId, context.getTheme());
                    str = "rippleRadius";
                    if (readableMap.hasKey(str)) {
                        hasKey = rippleDrawable instanceof RippleDrawable;
                    }
                    return rippleDrawable;
                }
                throw new RuntimeException(002.A09(identifier, "Attribute ", string2, " with id ", " couldn't be resolved into a drawable"));
            }
            throw new RuntimeException("JS description missing 'attribute' field");
        } else if ("RippleAndroid".equals(string)) {
            if (!readableMap.hasKey("color") || readableMap.isNull("color")) {
                Resources.Theme theme2 = context.getTheme();
                TypedValue typedValue2 = A00;
                if (theme2.resolveAttribute(16843820, typedValue2, true)) {
                    color = context.getResources().getColor(typedValue2.resourceId);
                } else {
                    throw new RuntimeException("Attribute colorControlHighlight couldn't be resolved into a drawable");
                }
            } else {
                color = readableMap.getInt("color");
            }
            if (!readableMap.hasKey("borderless") || readableMap.isNull("borderless") || !readableMap.getBoolean("borderless")) {
                colorDrawable = new ColorDrawable(-1);
            } else {
                colorDrawable = null;
            }
            rippleDrawable = new RippleDrawable(new ColorStateList(new int[][]{new int[0]}, new int[]{color}), (Drawable) null, colorDrawable);
            str = "rippleRadius";
            hasKey = readableMap.hasKey(str);
        } else {
            throw new RuntimeException(002.A0R("Invalid type for android drawable: ", string));
        }
        if (hasKey) {
            ((RippleDrawable) rippleDrawable).setRadius((int) W2U.A04(readableMap, str));
        }
        return rippleDrawable;
    }
}
