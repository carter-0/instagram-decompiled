package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.S9a  reason: case insensitive filesystem */
public abstract class C11080S9a {
    public static final S6Z A00(QT5 qt5) {
        boolean z;
        String str;
        String A07 = qt5.A07(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        String A09 = qt5.A09("user_input_email_address");
        String A0A = qt5.A0A("normalized_email_address");
        boolean coercedBooleanField = qt5.getCoercedBooleanField(1, "is_default");
        Class<QTE> cls = QTE.class;
        boolean A1V = AnonymousClass7TF.A1V(qt5.reinterpretIfFulfillsType(4, "PAYOneTimeEmail", cls, 860570050));
        C250663lr reinterpretIfFulfillsType = qt5.reinterpretIfFulfillsType(4, "PAYOneTimeEmail", cls, 860570050);
        if (reinterpretIfFulfillsType != null) {
            z = reinterpretIfFulfillsType.getCoercedBooleanField(0, "is_editable");
        } else {
            z = true;
        }
        C250663lr reinterpretIfFulfillsType2 = qt5.reinterpretIfFulfillsType(4, "PAYOneTimeEmail", cls, 860570050);
        if (reinterpretIfFulfillsType2 != null) {
            str = reinterpretIfFulfillsType2.A08("external_source_label");
        } else {
            str = null;
        }
        return new S6Z(A07, A09, A0A, str, coercedBooleanField, A1V, z);
    }

    public static final S6V A01(QTI qti) {
        boolean z;
        String str;
        String A07 = qti.A07(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        String A09 = qti.A09("normalized_phone_number");
        String A0A = qti.A0A("formatted_intl_number_with_plus");
        boolean coercedBooleanField = qti.getCoercedBooleanField(1, "is_default");
        Class<QTF> cls = QTF.class;
        C250663lr reinterpretIfFulfillsType = qti.reinterpretIfFulfillsType(4, "PAYOneTimePhone", cls, -498669657);
        if (reinterpretIfFulfillsType != null) {
            z = reinterpretIfFulfillsType.getCoercedBooleanField(0, "is_editable");
        } else {
            z = true;
        }
        C250663lr reinterpretIfFulfillsType2 = qti.reinterpretIfFulfillsType(4, "PAYOneTimePhone", cls, -498669657);
        if (reinterpretIfFulfillsType2 != null) {
            str = reinterpretIfFulfillsType2.A08("external_source_label");
        } else {
            str = null;
        }
        return new S6V(A07, A09, A0A, str, coercedBooleanField, z);
    }
}
