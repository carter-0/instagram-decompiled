package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class HTQ {
    public static Map A00(C278014w6 r4) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r4.AYG() != null) {
            A1H.put("action", r4.AYG());
        }
        if (r4.getActionUrl() != null) {
            A1H.put("action_url", r4.getActionUrl());
        }
        if (r4.Aiw() != null) {
            A1H.put(C273654mx.A00(587), r4.Aiw());
        }
        if (r4.BAn() != null) {
            A1H.put("has_chevron", r4.BAn());
        }
        if (r4.BCq() != null) {
            A1H.put(AnonymousClass000.A00(1409), r4.BCq());
        }
        TreeUpdaterJNI treeUpdaterJNI3 = null;
        if (r4.BE7() != null) {
            C278034w8 BE7 = r4.BE7();
            if (BE7 != null) {
                treeUpdaterJNI2 = BE7.FHC();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1H.put(PublicKeyCredentialControllerUtility.JSON_KEY_ICON, treeUpdaterJNI2);
        }
        if (r4.Cd6() != null) {
            A1H.put(AnonymousClass000.A00(4981), r4.Cd6());
        }
        if (r4.getSecondaryText() != null) {
            A1H.put(AnonymousClass000.A00(3933), r4.getSecondaryText());
        }
        if (r4.Bqj() != null) {
            C46269DSy Bqj = r4.Bqj();
            if (Bqj != null) {
                treeUpdaterJNI = Bqj.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put(C66579MXk.A00(161), treeUpdaterJNI);
        }
        if (r4.getText() != null) {
            A1H.put("text", r4.getText());
        }
        if (r4.C53() != null) {
            C46269DSy C53 = r4.C53();
            if (C53 != null) {
                treeUpdaterJNI3 = C53.FHC();
            }
            A1H.put("text_color", treeUpdaterJNI3);
        }
        return 0Yt.A0B(A1H);
    }
}
