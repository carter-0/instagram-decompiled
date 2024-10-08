package X;

import java.util.Map;

/* renamed from: X.EoZ  reason: case insensitive filesystem */
public abstract class C49055EoZ {
    public static final EWG A00(String str) {
        String str2;
        Map map = EWG.A01;
        if (str != null) {
            str2 = AnonymousClass7TF.A0j(str);
        } else {
            str2 = null;
        }
        EWG ewg = (EWG) map.get(str2);
        if (ewg == null) {
            return EWG.SETTINGS;
        }
        return ewg;
    }
}
