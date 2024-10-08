package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.MaD  reason: case insensitive filesystem */
public final class C66644MaD {
    public static final String A00 = C66644MaD.class.getName();

    public static final int A00(C328497Fa r11, C272074k3 r12, 2FW r13, Integer num, boolean z, boolean z2) {
        0qQ.A0B(r11, 1);
        if (!z2) {
            int ordinal = r11.ordinal();
            if (!(ordinal == 4 || ordinal == 3)) {
                String str = A00;
                0qQ.A08(str);
                String format = String.format("Unexpected Message lifecycle state for message from other: %s", C66581MXm.A1b(r11, 1));
                0qQ.A07(format);
                0wb.A03(str, format);
            }
            return 0;
        }
        int ordinal2 = r11.ordinal();
        if (ordinal2 != 3) {
            if (ordinal2 == 0) {
                return 3;
            }
            if (ordinal2 == 1) {
                return 7;
            }
            if (ordinal2 == 2) {
                return 8;
            }
            String str2 = A00;
            0qQ.A08(str2);
            0wb.A03(str2, "Invalid message lifecycle state");
            return 7;
        } else if (z) {
            return 3;
        } else {
            if (2FW.A0q != r13 && 2FW.A1j != r13) {
                return 1;
            }
            if (r12 == null || num == null || num.intValue() <= 0) {
                String str3 = A00;
                0qQ.A08(str3);
                0wb.A03(str3, "actionLogs null or empty");
                return 1;
            }
            int ordinal3 = r12.ordinal();
            if (ordinal3 == 7) {
                return 4;
            }
            if (ordinal3 == 9) {
                return 5;
            }
            if (ordinal3 == 8) {
                return 6;
            }
            return 1;
        }
    }

    public static final GAV A01(Context context, int i) {
        boolean z;
        int i2;
        int i3;
        int i4;
        float f;
        if (i == 2 || i == 3) {
            i3 = R.drawable.direct_visual_message_sending;
            i2 = 2131973114;
            z = true;
            i4 = 0;
        } else {
            if (i == 6) {
                i2 = 2131960389;
                i3 = R.drawable.screenshot_icon;
            } else if (i == 7 || i == 8) {
                i2 = 2131961937;
                i3 = R.drawable.direct_visual_media_failed;
            } else {
                z = false;
                i3 = 0;
                i4 = 8;
                i2 = 0;
            }
            z = false;
            i4 = 0;
        }
        if (i != 3) {
            f = 0.0f;
        } else {
            f = -27.0f;
            if (0mk.A02(context)) {
                f = 27.0f;
            }
        }
        return new GAV(f, i3, i4, i2, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0013, code lost:
        return new X.GAV(0.0f, r2, 0, 0, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (r0 != false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        r2 = com.instagram.android.R.drawable.direct_visual_message_status_arrow_left;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        if (r0 != false) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        r2 = com.instagram.android.R.drawable.direct_visual_message_status_arrow_right;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.GAV A02(android.content.Context r4, int r5) {
        /*
            r3 = 0
            boolean r0 = X.0mk.A02(r4)
            switch(r5) {
                case 0: goto L_0x001a;
                case 1: goto L_0x0014;
                case 2: goto L_0x0008;
                case 3: goto L_0x0008;
                case 4: goto L_0x0020;
                case 5: goto L_0x0024;
                default: goto L_0x0008;
            }
        L_0x0008:
            r2 = 2131231144(0x7f0801a8, float:1.807836E38)
        L_0x000b:
            r1 = 0
            X.GAV r0 = new X.GAV
            r4 = r3
            r5 = r3
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        L_0x0014:
            if (r0 == 0) goto L_0x001c
        L_0x0016:
            r2 = 2131231648(0x7f0803a0, float:1.8079383E38)
            goto L_0x000b
        L_0x001a:
            if (r0 == 0) goto L_0x0016
        L_0x001c:
            r2 = 2131231649(0x7f0803a1, float:1.8079385E38)
            goto L_0x000b
        L_0x0020:
            r2 = 2131231645(0x7f08039d, float:1.8079377E38)
            goto L_0x000b
        L_0x0024:
            r2 = 2131231646(0x7f08039e, float:1.8079379E38)
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66644MaD.A02(android.content.Context, int):X.GAV");
    }

    public static final void A03(TextView textView, GAV gav, int i) {
        Context context = textView.getContext();
        Drawable drawable = context.getDrawable(gav.A02);
        if (drawable != null) {
            drawable.mutate();
            AnonymousClass7TE.A1R(drawable, i);
        }
        if (0mk.A02(context)) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        textView.setCompoundDrawablePadding(context.getResources().getDimensionPixelSize(R.dimen.accent_edge_thickness));
    }
}
