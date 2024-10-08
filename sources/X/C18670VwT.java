package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.VwT  reason: case insensitive filesystem */
public final class C18670VwT {
    public static boolean A00(View view, C16483Uvd uvd) {
        if (view == null) {
            return true;
        }
        int ordinal = uvd.ordinal();
        switch (ordinal) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
            case 13:
                return true;
            default:
                Number number = (Number) view.getTag(R.id.pointer_events);
                return (number == null || (number.intValue() & (1 << ordinal)) == 0) ? false : true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:2:0x0009 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A01(java.lang.String r3) {
        /*
            int r0 = r3.hashCode()
            r2 = 1
            r1 = 0
            switch(r0) {
                case -1780335505: goto L_0x0010;
                case -1065042973: goto L_0x000d;
                case 1343400710: goto L_0x000a;
                default: goto L_0x0009;
            }
        L_0x0009:
            return r1
        L_0x000a:
            java.lang.String r0 = "topPointerOut"
            goto L_0x0012
        L_0x000d:
            java.lang.String r0 = "topPointerUp"
            goto L_0x0012
        L_0x0010:
            java.lang.String r0 = "topPointerLeave"
        L_0x0012:
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0009
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18670VwT.A01(java.lang.String):boolean");
    }
}
