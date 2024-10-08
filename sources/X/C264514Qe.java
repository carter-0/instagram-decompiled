package X;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.4Qe  reason: invalid class name and case insensitive filesystem */
public abstract class C264514Qe {
    public int A00;
    public int A01;
    public int A02;
    public int A03 = Integer.MAX_VALUE;
    public int A04 = Integer.MAX_VALUE;
    public int A05 = Integer.MAX_VALUE;
    public int A06 = Integer.MAX_VALUE;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E = Integer.MAX_VALUE;
    public int A0F = Integer.MAX_VALUE;
    public HashMap A0G;
    public HashSet A0H;
    public List A0I;
    public List A0J;
    public List A0K;
    public List A0L;
    public List A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q = true;

    public C264514Qe A02(int i, int i2, boolean z) {
        this.A0F = i;
        this.A0E = i2;
        this.A0Q = true;
        return this;
    }

    public final C264514Qe A03(Context context, boolean z) {
        Display display;
        Point point;
        String str;
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager == null || (display = displayManager.getDisplay(0)) == null) {
            Object systemService = context.getSystemService("window");
            systemService.getClass();
            display = ((WindowManager) systemService).getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && Util.A0H(context)) {
            String A002 = Pxd.A00(928);
            try {
                Class<?> cls = Class.forName(AnonymousClass000.A00(2602));
                str = (String) cls.getMethod("get", new Class[]{String.class}).invoke(cls, new Object[]{A002});
            } catch (Exception e) {
                2AG.A05("Util", 002.A0R(Pxd.A00(495), A002), e);
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                try {
                    String[] split = str.trim().split("x", -1);
                    if (split.length == 2) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            point = new Point(parseInt, parseInt2);
                            A02(point.x, point.y, true);
                            return this;
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                2AG.A03("Util", 002.A0R(Pxd.A00(515), str));
            }
            if ("Sony".equals(Util.A03) && Util.A04.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature(Pxd.A00(689))) {
                point = new Point(3840, 2160);
                A02(point.x, point.y, true);
                return this;
            }
        }
        point = new Point();
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
        A02(point.x, point.y, true);
        return this;
    }

    public C264514Qe A04(String str) {
        String[] strArr;
        if (str == null) {
            strArr = new String[0];
        } else {
            strArr = new String[]{str};
        }
        A05(strArr);
        return this;
    }

    public final void A07(String str) {
        if (2BY.A02(2BQ.A0b)) {
            A04(str);
        } else if (str == null) {
            A05(new String[0]);
        } else {
            this.A0I = AnonymousClass4R7.A00(str);
        }
    }

    public final void A08(String str) {
        String[] strArr;
        List A002;
        if (2BY.A02(2BQ.A0b)) {
            if (str != null) {
                strArr = new String[]{str};
            }
            strArr = new String[0];
        } else {
            if (str != null) {
                A002 = AnonymousClass4R7.A00(str);
                this.A0L = A002;
            }
            strArr = new String[0];
        }
        A002 = A01(strArr);
        this.A0L = A002;
    }

    @Deprecated
    public C264514Qe() {
        0sn r1 = 0sn.A00;
        this.A0M = r1;
        this.A0D = 0;
        this.A0L = r1;
        this.A0I = r1;
        this.A0B = 0;
        this.A02 = Integer.MAX_VALUE;
        this.A01 = Integer.MAX_VALUE;
        this.A0J = r1;
        this.A0K = r1;
        this.A0C = 0;
        this.A00 = 0;
        this.A0P = false;
        this.A0O = false;
        this.A0N = false;
        this.A0G = new HashMap();
        this.A0H = new HashSet();
    }

    public static ImmutableList A01(String[] strArr) {
        ImmutableList.Builder builder = ImmutableList.builder();
        strArr.getClass();
        int length = strArr.length;
        for (int i = 0; i < length; i = 1) {
            String str = strArr[i];
            str.getClass();
            builder.add(Util.A0C(str));
        }
        return builder.build();
    }

    public C264514Qe A05(String... strArr) {
        this.A0I = A01(strArr);
        return this;
    }

    public C264514Qe A06(String... strArr) {
        this.A0K = A01(strArr);
        return this;
    }
}
