package X;

import com.instagram.debug.quickexperiment.dumper.QuickExperimentDumperPlugin;

/* renamed from: X.Rza  reason: case insensitive filesystem */
public final class C10874Rza {
    public final int A00(String str) {
        int i;
        boolean z;
        if (str != null) {
            String A0j = AnonymousClass7TF.A0j(str);
            switch (A0j.hashCode()) {
                case -1953166733:
                    z = A0j.equals("src_out");
                    i = 7;
                    break;
                case -1338968417:
                    z = A0j.equals("darken");
                    i = 16;
                    break;
                case -1322296865:
                    z = A0j.equals("dst_in");
                    i = 6;
                    break;
                case -1091287984:
                    if (A0j.equals("overlay")) {
                        return 15;
                    }
                    break;
                case -907689876:
                    z = A0j.equals("screen");
                    i = 14;
                    break;
                case -894289568:
                    z = A0j.equals("src_in");
                    i = 5;
                    break;
                case -419044657:
                    z = A0j.equals("src_atop");
                    i = 9;
                    break;
                case 114148:
                    z = A0j.equals("src");
                    i = 1;
                    break;
                case 118875:
                    z = A0j.equals("xor");
                    i = 11;
                    break;
                case 94746189:
                    z = A0j.equals(QuickExperimentDumperPlugin.CLEAR_CMD);
                    i = 0;
                    break;
                case 170546239:
                    z = A0j.equals("lighten");
                    i = 17;
                    break;
                case 582803342:
                    z = A0j.equals("dst_atop");
                    i = 10;
                    break;
                case 583222030:
                    z = A0j.equals("dst_over");
                    i = 4;
                    break;
                case 653829668:
                    z = A0j.equals("multiply");
                    i = 13;
                    break;
                case 1958476244:
                    z = A0j.equals("dst_out");
                    i = 8;
                    break;
            }
            if (!z) {
                return 3;
            }
            return i;
        }
        return 3;
    }
}
