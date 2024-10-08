package X;

import com.facebook.react.bridge.BaseJavaModule;
import java.util.Map;

/* renamed from: X.3XZ  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3XZ implements 0sP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ C251263mp A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    public /* synthetic */ AnonymousClass3XZ(C251263mp r1, String str, int i, int i2, int i3, boolean z) {
        this.A04 = str;
        this.A00 = i;
        this.A03 = r1;
        this.A05 = z;
        this.A01 = i2;
        this.A02 = i3;
    }

    public final Object invoke(Object obj) {
        String str;
        String str2;
        String str3;
        String str4 = this.A04;
        int i = this.A00;
        C251263mp r8 = this.A03;
        boolean z = this.A05;
        int i2 = this.A01;
        int i3 = this.A02;
        Map map = (Map) obj;
        if ((str4 == null || str4.length() <= 0) && 2SN.A00().compareTo(2SO.A05) > 0) {
            StackTraceElement[] stackTrace = new RuntimeException().getStackTrace();
            0qQ.A0A(stackTrace);
            int length = stackTrace.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i4];
                String className = stackTraceElement.getClassName();
                0qQ.A07(className);
                if (!00l.A0d(className, "com.facebook.litho.ComponentTree", false)) {
                    String className2 = stackTraceElement.getClassName();
                    0qQ.A07(className2);
                    if (!00l.A0d(className2, "com.facebook.litho.debug.", false)) {
                        String className3 = stackTraceElement.getClassName();
                        0qQ.A07(className3);
                        if (!00l.A0d(className3, "com.facebook.rendercore.debug", false)) {
                            String obj2 = stackTraceElement.toString();
                            if (obj2 != null) {
                                str4 = obj2;
                            }
                        }
                    } else {
                        continue;
                    }
                }
                i4++;
            }
        }
        switch (i) {
            case 0:
            case 1:
                str = "set-root";
                break;
            case 2:
            case 3:
                str = "set-size";
                break;
            case 4:
            case 5:
                str = "update-state";
                break;
            default:
                str = "measure";
                break;
        }
        map.put("source", str);
        switch (i) {
            case 0:
            case 2:
            case 4:
            case 6:
                str2 = BaseJavaModule.METHOD_TYPE_SYNC;
                break;
            default:
                str2 = BaseJavaModule.METHOD_TYPE_ASYNC;
                break;
        }
        map.put("execution-mode", str2);
        map.put("attribution", str4);
        if (r8 != null) {
            str3 = r8.A0J();
        } else {
            str3 = "null";
        }
        map.put("root", str3);
        map.put("forced", Boolean.valueOf(z));
        if (!(i2 == -1 && i3 == -1)) {
            map.put("widthSpec", AnonymousClass3XX.A00(i2));
            map.put("heightSpec", AnonymousClass3XX.A00(i3));
        }
        map.put("stack", C11145SCa.A00());
        return C60340gF.A00;
    }
}
