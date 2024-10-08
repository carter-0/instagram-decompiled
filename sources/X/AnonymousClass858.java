package X;

/* renamed from: X.858  reason: invalid class name */
public class AnonymousClass858 {
    public final AnonymousClass859[] A00;

    public AnonymousClass858(String str) {
        AnonymousClass859[] r8;
        int i;
        AnonymousClass85A r6;
        if (str.equals("pre_capture")) {
            r8 = new AnonymousClass859[5];
            i = Integer.MAX_VALUE;
            r8[0] = new AnonymousClass859(3, Integer.MAX_VALUE, true);
            r8[1] = new AnonymousClass859(2, Integer.MAX_VALUE, true);
            r6 = new AnonymousClass85A(0);
        } else if (str.equals("post_capture")) {
            r8 = new AnonymousClass859[]{new AnonymousClass859(0, Integer.MAX_VALUE, false), new AnonymousClass859(4, Integer.MAX_VALUE, false), new AnonymousClass859(2, Integer.MAX_VALUE, false), new AnonymousClass859(3, Integer.MAX_VALUE, false), new AnonymousClass859(1, 4, false), new AnonymousClass859(1, Integer.MAX_VALUE, false)};
            this.A00 = r8;
        } else {
            r8 = new AnonymousClass859[5];
            i = Integer.MAX_VALUE;
            r8[0] = new AnonymousClass859(0, Integer.MAX_VALUE, false);
            r8[1] = new AnonymousClass859(2, Integer.MAX_VALUE, true);
            r6 = new AnonymousClass85A(3);
            r6.A00 = true;
        }
        r8[2] = new AnonymousClass859(r6);
        r8[3] = new AnonymousClass859(1, 4, false);
        r8[4] = new AnonymousClass859(1, i, false);
        this.A00 = r8;
    }
}
