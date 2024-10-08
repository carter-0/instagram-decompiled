package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.pando.TreeUpdaterJNI;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.model.reels.netego.BloksStoryNetegoCTAStyle;

/* renamed from: X.CRl  reason: case insensitive filesystem */
public final class C44028CRl extends 17P implements C239643Hk {
    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CRl] */
    public final String AgB() {
        String stringValue = getStringValue("bloks_app_id");
        if (stringValue != null) {
            return stringValue;
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CRl] */
    public final String AtC() {
        return getStringValue("cta_button_text");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.facebook.pando.TreeJNI, X.CRl] */
    public final BloksStoryNetegoCTAStyle AtP() {
        String str;
        DOU dou = DOU.A00;
        0qQ.A0B(dou, 1);
        Object field_UNTYPED = getField_UNTYPED("cta_style");
        if (field_UNTYPED != null) {
            str = field_UNTYPED.toString();
        } else {
            str = null;
        }
        return (BloksStoryNetegoCTAStyle) dou.invoke(str);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CRl] */
    public final boolean B7I() {
        Boolean optionalBooleanValue = getOptionalBooleanValue(AnonymousClass000.A00(609));
        if (optionalBooleanValue != null) {
            return optionalBooleanValue.booleanValue();
        }
        throw AnonymousClass7TE.A0y();
    }

    public final C61076JwE Bax() {
        return new C61076JwE(new R9S());
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CRl] */
    public final String C9L() {
        String stringValue = getStringValue("tracking_token");
        if (stringValue != null) {
            return stringValue;
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CRl] */
    public final boolean CQv() {
        Boolean optionalBooleanValue = getOptionalBooleanValue(AnonymousClass000.A00(671));
        if (optionalBooleanValue != null) {
            return optionalBooleanValue.booleanValue();
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CRl, X.3Hk] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44894Cmk.A00(this));
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CRl] */
    public final int getDuration() {
        Integer optionalIntValue = getOptionalIntValue(TraceFieldType.Duration);
        if (optionalIntValue != null) {
            return optionalIntValue.intValue();
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CRl] */
    public final String getId() {
        String stringValue = getStringValue(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        if (stringValue != null) {
            return stringValue;
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CRl] */
    public final String getTitle() {
        return getStringValue(DialogModule.KEY_TITLE);
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [com.facebook.pando.TreeJNI, X.CRl] */
    public final C239633Hj FEx() {
        String AgB = AgB();
        String stringValue = getStringValue("cta_button_text");
        BloksStoryNetegoCTAStyle AtP = AtP();
        int duration = getDuration();
        boolean B7I = B7I();
        return new C239633Hj(Bax(), AtP, AgB, stringValue, getId(), getStringValue(DialogModule.KEY_TITLE), C9L(), duration, B7I, CQv());
    }
}
