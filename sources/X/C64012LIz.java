package X;

import android.text.TextPaint;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.LIz  reason: case insensitive filesystem */
public abstract class C64012LIz {
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004c, code lost:
        r1[0] = r0;
        r0 = 2131960141;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0051, code lost:
        r1[1] = r0;
        r1[2] = 2131975851;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001f, code lost:
        return A01(r5, r1, 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int A00(android.widget.TextView r5, java.lang.Integer r6) {
        /*
            r4 = 0
            int r1 = X.C51967G9n.A03(r6, r4)
            r3 = 2
            r2 = 1
            r0 = 3
            switch(r1) {
                case 1: goto L_0x002b;
                case 2: goto L_0x000b;
                case 3: goto L_0x000b;
                case 4: goto L_0x0031;
                case 5: goto L_0x003c;
                case 6: goto L_0x0047;
                case 7: goto L_0x0020;
                case 8: goto L_0x0020;
                default: goto L_0x000b;
            }
        L_0x000b:
            r3 = 2131973082(0x7f1353da, float:1.958319E38)
            r2 = 2131960390(0x7f132246, float:1.9557447E38)
            r1 = 2131960141(0x7f13214d, float:1.9556942E38)
            r0 = 2131975851(0x7f135eab, float:1.9588806E38)
            int[] r1 = new int[]{r3, r2, r1, r0}
        L_0x001b:
            int r0 = A01(r5, r1, r4)
            return r0
        L_0x0020:
            int[] r1 = new int[r0]
            r0 = 2131964477(0x7f13323d, float:1.9565737E38)
            r1[r4] = r0
            r0 = 2131964507(0x7f13325b, float:1.9565798E38)
            goto L_0x0051
        L_0x002b:
            int[] r1 = new int[r0]
            r0 = 2131973441(0x7f135541, float:1.9583918E38)
            goto L_0x004c
        L_0x0031:
            int[] r1 = new int[r0]
            r0 = 2131960307(0x7f1321f3, float:1.9557279E38)
            r1[r4] = r0
            r0 = 2131960311(0x7f1321f7, float:1.9557287E38)
            goto L_0x0051
        L_0x003c:
            int[] r1 = new int[r0]
            r0 = 2131952258(0x7f130282, float:1.9540954E38)
            r1[r4] = r0
            r0 = 2131952452(0x7f130344, float:1.9541347E38)
            goto L_0x0051
        L_0x0047:
            int[] r1 = new int[r0]
            r0 = 2131961425(0x7f132651, float:1.9559547E38)
        L_0x004c:
            r1[r4] = r0
            r0 = 2131960141(0x7f13214d, float:1.9556942E38)
        L_0x0051:
            r1[r2] = r0
            r0 = 2131975851(0x7f135eab, float:1.9588806E38)
            r1[r3] = r0
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64012LIz.A00(android.widget.TextView, java.lang.Integer):int");
    }

    public static final int A01(TextView textView, int[] iArr, int i) {
        TextPaint paint = textView.getPaint();
        int i2 = 0;
        for (int A0i : iArr) {
            String A0i2 = JTS.A0i(textView.getResources(), i, A0i);
            0qQ.A07(A0i2);
            i2 = Math.max(i2, (int) paint.measureText(A0i2));
        }
        return Math.min(Math.max(0nA.A09(AnonymousClass7TE.A0S(textView)) / 3, textView.getResources().getDimensionPixelOffset(R.dimen.avatar_size_ridiculously_xxlarge)), i2);
    }
}
