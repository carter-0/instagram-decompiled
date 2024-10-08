package X;

/* renamed from: X.Qka  reason: case insensitive filesystem */
public final class C8227Qka extends C8228Qkb {
    public final String A00;
    public final String A01;

    public final C268894eF A00(C269514fF r4, String str) {
        if (str.startsWith(".")) {
            int length = str.length();
            String str2 = this.A01;
            StringBuilder A15 = Pxe.A15(length, str2.length());
            if (str2.isEmpty()) {
                str = str.substring(1);
            } else {
                A15.append(str2);
            }
            str = AnonymousClass7TF.A0l(str, A15);
        }
        return super.A00(r4, str);
    }

    public C8227Qka(C268894eF r5, C269004eQ r6, AnonymousClass4eE r7) {
        super(r5, r6, r7);
        String name = r5.A00.getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf < 0) {
            this.A01 = "";
            this.A00 = ".";
            return;
        }
        this.A00 = name.substring(0, lastIndexOf + 1);
        this.A01 = name.substring(0, lastIndexOf);
    }
}
