package X;

import android.content.Context;
import com.instagram.android.R;

/* renamed from: X.5pj  reason: invalid class name and case insensitive filesystem */
public enum C296235pj {
    PRIMARY(0),
    SECONDARY(1),
    DEFAULT_ON_BLACK(2),
    CREATION_FLOW(3),
    CREATION_FLOW_RED_LABEL(4),
    SECONDARY_ON_BLACK(5),
    PRIMARY_DESTRUCTIVE(6),
    CREATION_FLOW_DESTRUCTIVE(7),
    CREATION_FLOW_BLUE(8),
    CREATION_FLOW_NO_BG(9),
    CREATION_FLOW_CHANGES_BLUE(10),
    CREATION_FLOW_CHANGES_YELLOW(11),
    CREATION_FLOW_FEED_PRIMARY(12),
    CREATION_FLOW_BLUE_DARK_BACKGROUND_OVERRIDE(13);
    
    public final int A00;

    /* access modifiers changed from: public */
    static {
        C296235pj[] r0;
        A01 = 0oU.A00(r0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0043, code lost:
        if (r1 != 12) goto L_0x0045;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A00(android.content.Context r4) {
        /*
            r3 = this;
            int r1 = r3.A00
            r0 = 1
            if (r1 != r0) goto L_0x000d
            r2 = 2130970301(0x7f0406bd, float:1.7549308E38)
        L_0x0008:
            int r0 = X.2Yu.A0H(r4, r2)
            return r0
        L_0x000d:
            r0 = 2
            if (r1 == r0) goto L_0x004d
            r0 = 5
            if (r1 == r0) goto L_0x004d
            r0 = 3
            if (r1 == r0) goto L_0x0049
            r0 = 4
            if (r1 == r0) goto L_0x0049
            r0 = 11
            if (r1 == r0) goto L_0x0049
            r0 = 10
            if (r1 == r0) goto L_0x0049
            r0 = 7
            if (r1 != r0) goto L_0x0028
            r0 = 2131100329(0x7f0602a9, float:1.7813036E38)
            return r0
        L_0x0028:
            r0 = 8
            if (r1 == r0) goto L_0x0051
            r0 = 13
            if (r1 == r0) goto L_0x0051
            r0 = 9
            if (r1 != r0) goto L_0x0038
            r0 = 2131100175(0x7f06020f, float:1.7812724E38)
            return r0
        L_0x0038:
            r0 = 0
            if (r1 == r0) goto L_0x0045
            r0 = 6
            if (r1 == r0) goto L_0x0045
            r0 = 12
            r2 = 2130970273(0x7f0406a1, float:1.7549251E38)
            if (r1 == r0) goto L_0x0008
        L_0x0045:
            r2 = 2130970272(0x7f0406a0, float:1.754925E38)
            goto L_0x0008
        L_0x0049:
            r2 = 2130970166(0x7f040636, float:1.7549034E38)
            goto L_0x0008
        L_0x004d:
            r2 = 2130970308(0x7f0406c4, float:1.7549322E38)
            goto L_0x0008
        L_0x0051:
            X.1QG r0 = X.1QE.A0E()
            int r0 = X.1QE.A05(r4, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C296235pj.A00(android.content.Context):int");
    }

    /* access modifiers changed from: public */
    C296235pj(int i) {
        this.A00 = i;
    }

    public final int A01(Context context) {
        int i;
        1QG A0E = 1QE.A0E();
        int i2 = this.A00;
        if (i2 == 8 || i2 == 13) {
            return 1QE.A06(context, A0E);
        }
        if (i2 == 0) {
            i = R.attr.igds_color_text_on_white;
        } else if (i2 == 4 || i2 == 7 || i2 == 6) {
            i = R.attr.igds_color_error_or_destructive;
        } else if (i2 == 10) {
            i = R.attr.igds_color_primary_button;
        } else if (i2 == 11) {
            i = R.attr.igds_color_creation_tools_yellow;
        } else {
            i = R.attr.igds_color_primary_text_on_media;
            if (i2 == 12) {
                i = R.attr.igds_color_primary_background;
            }
        }
        return 2Yu.A0H(context, i);
    }
}
