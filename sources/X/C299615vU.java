package X;

/* renamed from: X.5vU  reason: invalid class name and case insensitive filesystem */
public abstract /* synthetic */ class C299615vU {
    public static C61082JwK A00() {
        return new C61082JwK((N49) null, 3, false);
    }

    public static String A01(C299575vQ r4, String str, String str2) {
        String str3;
        0qQ.A0B(str2, 3);
        StringBuilder sb = new StringBuilder();
        String replace = str.replace('_', '-');
        0qQ.A07(replace);
        sb.append(replace);
        sb.append('_');
        C299505vJ Be5 = r4.Be5();
        sb.append(Be5.A06);
        sb.append('_');
        sb.append(str2);
        String str4 = Be5.A04;
        if (str4 != null) {
            str3 = 002.A0D(str4, '_');
        } else {
            str3 = "";
        }
        sb.append(str3);
        return sb.toString();
    }
}
