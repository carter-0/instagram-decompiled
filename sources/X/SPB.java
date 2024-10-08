package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebookpay.widget.listcell.ListCell;
import com.instagram.android.R;
import org.webrtc.EglBase14Impl;

public final class SPB {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        r1 = com.instagram.android.R.color.igds_stroke;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0030, code lost:
        r1 = com.instagram.android.R.color.canvas_bottom_sheet_description_text_color;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        r1 = com.instagram.android.R.color.igds_separator;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
        r1 = com.instagram.android.R.color.igds_success;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0066, code lost:
        r1 = com.instagram.android.R.color.igds_error_or_destructive;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0072, code lost:
        r1 = com.instagram.android.R.color.igds_secondary_icon;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007e, code lost:
        r1 = com.instagram.android.R.color.igds_primary_text;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0089, code lost:
        if (r0 != false) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008b, code lost:
        r1 = com.instagram.android.R.attr.igds_color_controls;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009c, code lost:
        r1 = X.2Yu.A0H(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ac, code lost:
        if (r0 == false) goto L_0x00ae;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A03(android.content.Context r3, int r4) {
        /*
            r2 = this;
            r0 = 1
            X.0qQ.A0B(r3, r0)
            r0 = 51
            if (r4 == r0) goto L_0x008f
            switch(r4) {
                case 0: goto L_0x007e;
                case 1: goto L_0x007a;
                case 2: goto L_0x0076;
                case 3: goto L_0x0072;
                case 4: goto L_0x006e;
                case 5: goto L_0x006a;
                case 6: goto L_0x0066;
                case 7: goto L_0x0030;
                case 8: goto L_0x0062;
                case 9: goto L_0x008f;
                case 10: goto L_0x0054;
                case 11: goto L_0x0050;
                case 12: goto L_0x004c;
                case 13: goto L_0x0072;
                case 14: goto L_0x0072;
                case 15: goto L_0x007e;
                case 16: goto L_0x008b;
                case 17: goto L_0x0048;
                case 18: goto L_0x0044;
                case 19: goto L_0x0034;
                case 20: goto L_0x0040;
                case 21: goto L_0x003c;
                case 22: goto L_0x0076;
                case 23: goto L_0x0050;
                case 24: goto L_0x007a;
                case 25: goto L_0x0072;
                case 26: goto L_0x0038;
                case 27: goto L_0x007a;
                case 28: goto L_0x0072;
                case 29: goto L_0x008f;
                default: goto L_0x000b;
            }
        L_0x000b:
            switch(r4) {
                case 34: goto L_0x007e;
                case 35: goto L_0x0028;
                case 36: goto L_0x002c;
                case 37: goto L_0x0034;
                default: goto L_0x000e;
            }
        L_0x000e:
            switch(r4) {
                case 41: goto L_0x0066;
                case 42: goto L_0x0072;
                case 43: goto L_0x0072;
                case 44: goto L_0x008b;
                case 45: goto L_0x0020;
                case 46: goto L_0x0030;
                case 47: goto L_0x0024;
                default: goto L_0x0011;
            }
        L_0x0011:
            switch(r4) {
                case 56: goto L_0x002c;
                case 57: goto L_0x0082;
                case 58: goto L_0x007e;
                case 59: goto L_0x001b;
                case 60: goto L_0x0034;
                case 61: goto L_0x0034;
                case 62: goto L_0x00a5;
                case 63: goto L_0x003c;
                case 64: goto L_0x0034;
                case 65: goto L_0x0034;
                case 66: goto L_0x0093;
                default: goto L_0x0014;
            }
        L_0x0014:
            java.lang.String r0 = "Invalid color type: "
            java.lang.IllegalArgumentException r0 = X.DbW.A0a(r0, r4)
            throw r0
        L_0x001b:
            r1 = 2131100468(0x7f060334, float:1.7813318E38)
            goto L_0x00a0
        L_0x0020:
            r1 = 2130970313(0x7f0406c9, float:1.7549333E38)
            goto L_0x009c
        L_0x0024:
            r1 = 2131100052(0x7f060194, float:1.7812475E38)
            goto L_0x00a0
        L_0x0028:
            r1 = 2131100202(0x7f06022a, float:1.7812779E38)
            goto L_0x00a0
        L_0x002c:
            r1 = 2131100480(0x7f060340, float:1.7813343E38)
            goto L_0x00a0
        L_0x0030:
            r1 = 2131099843(0x7f0600c3, float:1.781205E38)
            goto L_0x00a0
        L_0x0034:
            r1 = 2131100476(0x7f06033c, float:1.7813335E38)
            goto L_0x00a0
        L_0x0038:
            r1 = 2131100376(0x7f0602d8, float:1.7813132E38)
            goto L_0x00a0
        L_0x003c:
            r1 = 2131100481(0x7f060341, float:1.7813345E38)
            goto L_0x00a0
        L_0x0040:
            r1 = 2130970253(0x7f04068d, float:1.754921E38)
            goto L_0x009c
        L_0x0044:
            r1 = 2131100342(0x7f0602b6, float:1.7813063E38)
            goto L_0x00a0
        L_0x0048:
            r1 = 2131100462(0x7f06032e, float:1.7813306E38)
            goto L_0x00a0
        L_0x004c:
            r1 = 2131099989(0x7f060155, float:1.7812347E38)
            goto L_0x00a0
        L_0x0050:
            r1 = 2131099948(0x7f06012c, float:1.7812264E38)
            goto L_0x00a0
        L_0x0054:
            r0 = 2131100375(0x7f0602d7, float:1.781313E38)
            int r1 = r3.getColor(r0)
            r0 = 77
            int r0 = X.2eL.A06(r1, r0)
            return r0
        L_0x0062:
            r1 = 2131100370(0x7f0602d2, float:1.781312E38)
            goto L_0x00a0
        L_0x0066:
            r1 = 2131100341(0x7f0602b5, float:1.781306E38)
            goto L_0x00a0
        L_0x006a:
            r1 = 2131100361(0x7f0602c9, float:1.7813101E38)
            goto L_0x00a0
        L_0x006e:
            r1 = 2131100175(0x7f06020f, float:1.7812724E38)
            goto L_0x00a0
        L_0x0072:
            r1 = 2131100473(0x7f060339, float:1.7813328E38)
            goto L_0x00a0
        L_0x0076:
            r1 = 2131100339(0x7f0602b3, float:1.7813057E38)
            goto L_0x00a0
        L_0x007a:
            r1 = 2131100475(0x7f06033b, float:1.7813332E38)
            goto L_0x00a0
        L_0x007e:
            r1 = 2131100377(0x7f0602d9, float:1.7813134E38)
            goto L_0x00a0
        L_0x0082:
            boolean r0 = X.AnonymousClass3HA.A00(r3)
            r1 = 2130970328(0x7f0406d8, float:1.7549363E38)
            if (r0 == 0) goto L_0x009c
        L_0x008b:
            r1 = 2130970165(0x7f040635, float:1.7549032E38)
            goto L_0x009c
        L_0x008f:
            r1 = 2131100375(0x7f0602d7, float:1.781313E38)
            goto L_0x00a0
        L_0x0093:
            boolean r0 = X.AnonymousClass3HA.A00(r3)
            if (r0 != 0) goto L_0x00ae
            r1 = 2130970321(0x7f0406d1, float:1.7549349E38)
        L_0x009c:
            int r1 = X.2Yu.A0H(r3, r1)
        L_0x00a0:
            int r0 = r3.getColor(r1)
            return r0
        L_0x00a5:
            boolean r0 = X.AnonymousClass3HA.A00(r3)
            r1 = 2131100036(0x7f060184, float:1.7812442E38)
            if (r0 != 0) goto L_0x00a0
        L_0x00ae:
            r1 = 2131099778(0x7f060082, float:1.7811919E38)
            goto L_0x00a0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SPB.A03(android.content.Context, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0255, code lost:
        r1 = A03(r9, r11);
        r2.mutate();
        r2.setColorFilter(r1, android.graphics.PorterDuff.Mode.SRC_IN);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0261, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x029a, code lost:
        r2.setTint(A03(r9, r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x02a1, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable A05(android.content.Context r9, int r10, int r11) {
        /*
            r8 = this;
            r0 = 2
            X.0qQ.A0B(r9, r0)
            java.lang.String r1 = "Required value was null."
            switch(r10) {
                case 0: goto L_0x0010;
                case 1: goto L_0x001e;
                case 2: goto L_0x002c;
                case 3: goto L_0x003a;
                case 4: goto L_0x0048;
                case 5: goto L_0x0056;
                case 6: goto L_0x0064;
                case 7: goto L_0x0072;
                case 8: goto L_0x0009;
                case 9: goto L_0x0048;
                case 10: goto L_0x0009;
                case 11: goto L_0x0080;
                case 12: goto L_0x008e;
                case 13: goto L_0x009c;
                case 14: goto L_0x00aa;
                case 15: goto L_0x00b8;
                case 16: goto L_0x00c6;
                case 17: goto L_0x00d4;
                case 18: goto L_0x00e2;
                case 19: goto L_0x00f0;
                case 20: goto L_0x00fe;
                case 21: goto L_0x0009;
                case 22: goto L_0x010c;
                case 23: goto L_0x011a;
                case 24: goto L_0x0128;
                case 25: goto L_0x0009;
                case 26: goto L_0x0009;
                case 27: goto L_0x0136;
                case 28: goto L_0x0009;
                case 29: goto L_0x0144;
                case 30: goto L_0x0152;
                case 31: goto L_0x0160;
                case 32: goto L_0x0009;
                case 33: goto L_0x003a;
                case 34: goto L_0x016e;
                case 35: goto L_0x0009;
                case 36: goto L_0x017c;
                case 37: goto L_0x018a;
                case 38: goto L_0x0009;
                case 39: goto L_0x0198;
                case 40: goto L_0x0048;
                case 41: goto L_0x0009;
                case 42: goto L_0x01a6;
                case 43: goto L_0x01b4;
                case 44: goto L_0x01c2;
                case 45: goto L_0x01d0;
                case 46: goto L_0x01de;
                case 47: goto L_0x01ec;
                case 48: goto L_0x01fa;
                case 49: goto L_0x0208;
                case 50: goto L_0x0247;
                case 51: goto L_0x0262;
                case 52: goto L_0x0270;
                case 53: goto L_0x027e;
                case 54: goto L_0x0009;
                case 55: goto L_0x028c;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.String r0 = "Invalid icon type: "
            java.lang.IllegalArgumentException r0 = X.DbW.A0a(r0, r10)
            throw r0
        L_0x0010:
            r0 = 2131238090(0x7f081cca, float:1.8092449E38)
            android.graphics.drawable.Drawable r2 = r9.getDrawable(r0)
            if (r2 != 0) goto L_0x029a
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x001e:
            r0 = 2131237915(0x7f081c1b, float:1.8092094E38)
            android.graphics.drawable.Drawable r2 = r9.getDrawable(r0)
            if (r2 != 0) goto L_0x029a
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x002c:
            r0 = 2131238507(0x7f081e6b, float:1.8093295E38)
            android.graphics.drawable.Drawable r2 = r9.getDrawable(r0)
            if (r2 != 0) goto L_0x029a
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x003a:
            r0 = 2131238511(0x7f081e6f, float:1.8093303E38)
            android.graphics.drawable.Drawable r2 = r9.getDrawable(r0)
            if (r2 != 0) goto L_0x029a
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x0048:
            r0 = 2131238512(0x7f081e70, float:1.8093305E38)
            android.graphics.drawable.Drawable r2 = r9.getDrawable(r0)
            if (r2 != 0) goto L_0x029a
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x0056:
            r0 = 2131238617(0x7f081ed9, float:1.8093518E38)
            android.graphics.drawable.Drawable r2 = r9.getDrawable(r0)
            if (r2 != 0) goto L_0x029a
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x0064:
            r0 = 2131238114(0x7f081ce2, float:1.8092498E38)
            android.graphics.drawable.Drawable r2 = r9.getDrawable(r0)
            if (r2 != 0) goto L_0x029a
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x0072:
            r0 = 2131238124(0x7f081cec, float:1.8092518E38)
            android.graphics.drawable.Drawable r2 = r9.getDrawable(r0)
            if (r2 != 0) goto L_0x029a
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x0080:
            r0 = 2131238292(0x7f081d94, float:1.8092859E38)
            android.graphics.drawable.Drawable r2 = r9.getDrawable(r0)
            if (r2 != 0) goto L_0x029a
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x008e:
            r0 = 2131237258(0x7f08198a, float:1.8090761E38)
            android.graphics.drawable.Drawable r2 = r9.getDrawable(r0)
            if (r2 != 0) goto L_0x029a
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x009c:
            r0 = 2131238125(0x7f081ced, float:1.809252E38)
            android.graphics.drawable.Drawable r2 = r9.getDrawable(r0)
            if (r2 != 0) goto L_0x029a
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x00aa:
            r0 = 2131238778(0x7f081f7a, float:1.8093844E38)
            android.graphics.drawable.Drawable r2 = r9.getDrawable(r0)
            if (r2 != 0) goto L_0x029a
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x00b8:
            r0 = 2131238620(0x7f081edc, float:1.8093524E38)
            android.graphics.drawable.Drawable r2 = r9.getDrawable(r0)
            if (r2 != 0) goto L_0x0241
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x00c6:
            r0 = 2131238780(0x7f081f7c, float:1.8093848E38)
            android.graphics.drawable.Drawable r2 = r9.getDrawable(r0)
            if (r2 != 0) goto L_0x0241
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x00d4:
            r0 = 2131238715(0x7f081f3b, float:1.8093717E38)
            android.graphics.drawable.Drawable r2 = r9.getDrawable(r0)
            if (r2 != 0) goto L_0x0241
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x00e2:
            r0 = 2131238514(0x7f081e72, float:1.8093309E38)
            android.graphics.drawable.Drawable r2 = r9.getDrawable(r0)
            if (r2 != 0) goto L_0x0241
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x00f0:
            r0 = 2131238671(0x7f081f0f, float:1.8093627E38)
            android.graphics.drawable.Drawable r2 = r9.getDrawable(r0)
            if (r2 != 0) goto L_0x0241
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x00fe:
            r0 = 2131239025(0x7f082071, float:1.8094345E38)
            android.graphics.drawable.Drawable r2 = r9.getDrawable(r0)
            if (r2 != 0) goto L_0x029a
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x010c:
            r0 = 2131238616(0x7f081ed8, float:1.8093516E38)
            android.graphics.drawable.Drawable r2 = r9.getDrawable(r0)
            if (r2 != 0) goto L_0x0241
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x011a:
            r0 = 2131238108(0x7f081cdc, float:1.8092485E38)
            android.graphics.drawable.Drawable r2 = r9.getDrawable(r0)
            if (r2 != 0) goto L_0x029a
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x0128:
            r0 = 2131238114(0x7f081ce2, float:1.8092498E38)
            android.graphics.drawable.Drawable r2 = r9.getDrawable(r0)
            if (r2 != 0) goto L_0x029a
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x0136:
            r0 = 2131239432(0x7f082208, float:1.809517E38)
            android.graphics.drawable.Drawable r2 = r9.getDrawable(r0)
            if (r2 != 0) goto L_0x0241
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x0144:
            r0 = 2131238804(0x7f081f94, float:1.8093897E38)
            android.graphics.drawable.Drawable r2 = r9.getDrawable(r0)
            if (r2 != 0) goto L_0x029a
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x0152:
            r0 = 2131238495(0x7f081e5f, float:1.809327E38)
            android.graphics.drawable.Drawable r2 = r9.getDrawable(r0)
            if (r2 != 0) goto L_0x029a
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x0160:
            r0 = 2131238208(0x7f081d40, float:1.8092688E38)
            android.graphics.drawable.Drawable r2 = r9.getDrawable(r0)
            if (r2 != 0) goto L_0x029a
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x016e:
            r0 = 2131231514(0x7f08031a, float:1.8079111E38)
            android.graphics.drawable.Drawable r2 = r9.getDrawable(r0)
            if (r2 != 0) goto L_0x0241
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x017c:
            r0 = 2131239105(0x7f0820c1, float:1.8094508E38)
            android.graphics.drawable.Drawable r2 = r9.getDrawable(r0)
            if (r2 != 0) goto L_0x0241
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x018a:
            r0 = 2131238618(0x7f081eda, float:1.809352E38)
            android.graphics.drawable.Drawable r2 = r9.getDrawable(r0)
            if (r2 != 0) goto L_0x029a
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x0198:
            r0 = 2131239440(0x7f082210, float:1.8095187E38)
            android.graphics.drawable.Drawable r2 = r9.getDrawable(r0)
            if (r2 != 0) goto L_0x0241
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x01a6:
            r0 = 2131238077(0x7f081cbd, float:1.8092423E38)
            android.graphics.drawable.Drawable r2 = r9.getDrawable(r0)
            if (r2 != 0) goto L_0x0255
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x01b4:
            r0 = 2131238095(0x7f081ccf, float:1.809246E38)
            android.graphics.drawable.Drawable r2 = r9.getDrawable(r0)
            if (r2 != 0) goto L_0x029a
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x01c2:
            r0 = 2131238132(0x7f081cf4, float:1.8092534E38)
            android.graphics.drawable.Drawable r2 = r9.getDrawable(r0)
            if (r2 != 0) goto L_0x029a
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x01d0:
            r0 = 2131238124(0x7f081cec, float:1.8092518E38)
            android.graphics.drawable.Drawable r2 = r9.getDrawable(r0)
            if (r2 != 0) goto L_0x029a
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x01de:
            r0 = 2131238260(0x7f081d74, float:1.8092794E38)
            android.graphics.drawable.Drawable r2 = r9.getDrawable(r0)
            if (r2 != 0) goto L_0x0255
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x01ec:
            r0 = 2131239439(0x7f08220f, float:1.8095185E38)
            android.graphics.drawable.Drawable r2 = r9.getDrawable(r0)
            if (r2 != 0) goto L_0x0241
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x01fa:
            r0 = 2131231451(0x7f0802db, float:1.8078983E38)
            android.graphics.drawable.Drawable r2 = r9.getDrawable(r0)
            if (r2 != 0) goto L_0x0241
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x0208:
            r0 = 2131238081(0x7f081cc1, float:1.809243E38)
            android.graphics.drawable.Drawable r2 = r9.getDrawable(r0)
            if (r2 == 0) goto L_0x0242
            int r0 = r8.A03(r9, r11)
            r2.setTint(r0)
            r0 = 2130970330(0x7f0406da, float:1.7549367E38)
            int r1 = X.AnonymousClass7TF.A03(r9, r0)
            r0 = 2130969487(0x7f04038f, float:1.7547657E38)
            int r4 = X.SSH.A00(r9, r0)
            r3 = 1
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>()
            r0.setColor(r1)
            r0.setShape(r3)
            android.graphics.drawable.Drawable[] r0 = new android.graphics.drawable.Drawable[]{r0, r2}
            android.graphics.drawable.LayerDrawable r2 = new android.graphics.drawable.LayerDrawable
            r2.<init>(r0)
            r5 = r4
            r6 = r4
            r7 = r4
            r2.setLayerInset(r3, r4, r5, r6, r7)
        L_0x0241:
            return r2
        L_0x0242:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x0247:
            r0 = 2131238108(0x7f081cdc, float:1.8092485E38)
            android.graphics.drawable.Drawable r2 = r9.getDrawable(r0)
            if (r2 != 0) goto L_0x0255
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x0255:
            int r1 = r8.A03(r9, r11)
            r2.mutate()
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            r2.setColorFilter(r1, r0)
            return r2
        L_0x0262:
            r0 = 2131238793(0x7f081f89, float:1.8093875E38)
            android.graphics.drawable.Drawable r2 = r9.getDrawable(r0)
            if (r2 != 0) goto L_0x029a
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x0270:
            r0 = 2131238514(0x7f081e72, float:1.8093309E38)
            android.graphics.drawable.Drawable r2 = r9.getDrawable(r0)
            if (r2 != 0) goto L_0x029a
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x027e:
            r0 = 2131238461(0x7f081e3d, float:1.8093201E38)
            android.graphics.drawable.Drawable r2 = r9.getDrawable(r0)
            if (r2 != 0) goto L_0x029a
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x028c:
            r0 = 2131238869(0x7f081fd5, float:1.8094029E38)
            android.graphics.drawable.Drawable r2 = r9.getDrawable(r0)
            if (r2 != 0) goto L_0x029a
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x029a:
            int r0 = r8.A03(r9, r11)
            r2.setTint(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SPB.A05(android.content.Context, int, int):android.graphics.drawable.Drawable");
    }

    public final Drawable A04(Context context) {
        return A05(context, 45, 41);
    }

    public static int A00(Context context, int i) {
        return AnonymousClass2E0.A0A().A03(context, i);
    }

    public static TypedArray A01(Context context, ListCell listCell) {
        return context.obtainStyledAttributes(AnonymousClass2E0.A0A().A02(listCell.getFbpayWidgetStyleType()), C71382cm.A0e);
    }

    public final int A02(int i) {
        switch (i) {
            case 0:
                return R.style.FBPayUIListCell;
            case 1:
                return R.style.FBPayUIListCellLeftAddOnLabel;
            case 2:
                return R.style.FBPayUIButton;
            case 3:
                return R.style.FBPayUINavigationBar;
            case 4:
                return R.style.FBPayUIPriceTable;
            case 5:
                return 2132017579;
            case 6:
                return 2132017642;
            case 7:
                return 2132017641;
            case 8:
                return R.style.FbPayProgressSpinner;
            case 9:
                return R.style.FbPayUIPayButtonAnimation;
            case 10:
                return R.style.FBPayUITextButtonBackground;
            case 11:
                return R.style.FbPayUICheckbox;
            case 13:
                return R.style.FbpayNuxContinueButtonStyle;
            case 14:
                return 2132017647;
            case 15:
                return R.style.FbpayBannerPrimaryTextStyle;
            case 16:
                return R.style.FbPayFulfillmentOptionsListStyle;
            case 17:
                return 2132017617;
            case EglBase14Impl.EGLExt_SDK_VERSION /*18*/:
                return R.style.FbpayFormSaveButtonStyle;
            case 19:
                return R.style.FbpayFormContainerStyle;
            case 20:
                return R.style.FbpayFormContainerElevatedStyle;
            case 22:
                return R.style.FbpayNUXFormContainerElevatedStyle;
            case 23:
                return R.style.FbpayStickyFooterNuxContinueButtonStyle;
            case 24:
                return R.style.FbPayNuxFormLayoutStyle;
            case 25:
                return R.style.FbPayAccordionStyle;
            case 26:
                return 2132017681;
            case 27:
                return 2132017680;
            case 28:
                return R.style.FbPayListSelectionComponent;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
                return 2132017601;
            case 30:
                return 2132017721;
            case 31:
                return R.style.FbpayAutoAdvanceButton;
            case 32:
                return R.style.FbpayBannerStyle;
            case 33:
                return 2132017713;
            case 34:
                return R.style.FbPayIncentiveInlineSummaryIconStyle;
            case 35:
                return R.style.FbPayIncentiveInlineStyle;
            default:
                return R.style.FBPayAnimationButtonContainer;
        }
    }
}
