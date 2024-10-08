package X;

import android.util.Log;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.mediastreaming.core.MSLogHandlerImpl;
import java.util.Arrays;

public final class W3b {
    public static MSLogHandlerImpl A00;
    public static final W3b A01 = new Object();

    public static final String A00(String str, Throwable th, Object... objArr) {
        StringBuilder sb = new StringBuilder(StringFormatUtil.formatStrLocaleSafe(str, Arrays.copyOf(objArr, objArr.length)));
        if (th != null) {
            sb.append(StringFormatUtil.formatStrLocaleSafe(" %s: %s", th.getMessage(), Log.getStackTraceString(th)));
        }
        return DbT.A10(sb);
    }

    public static final void A01(String str, String str2, Throwable th, Object... objArr) {
        0qQ.A0B(objArr, 3);
        int length = objArr.length;
        Object[] copyOf = Arrays.copyOf(objArr, length);
        if (th == null) {
            0KC.A0O(str, str2, copyOf);
        } else {
            0KC.A0L(str, str2, th, copyOf);
        }
        A01.A09();
        MSLogHandlerImpl.logNative(1, str, A00(str2, th, Arrays.copyOf(objArr, length)));
    }

    public static final void A02(String str, String str2, Throwable th, Object... objArr) {
        0qQ.A0B(objArr, 3);
        int length = objArr.length;
        Object[] copyOf = Arrays.copyOf(objArr, length);
        if (th == null) {
            0KC.A0P(str, str2, copyOf);
        } else {
            0KC.A0M(str, str2, th, copyOf);
        }
        A01.A09();
        MSLogHandlerImpl.logNative(2, str, A00(str2, th, Arrays.copyOf(objArr, length)));
    }

    public static final void A03(String str, String str2, Object... objArr) {
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        0qQ.A0B(copyOf, 3);
        int length = copyOf.length;
        Arrays.copyOf(copyOf, length);
        A01.A09();
        MSLogHandlerImpl.logNative(4, str, A00(str2, (Throwable) null, Arrays.copyOf(copyOf, length)));
    }

    public static final void A04(String str, String str2, Object... objArr) {
        A01(str, str2, (Throwable) null, Arrays.copyOf(objArr, objArr.length));
    }

    public static final void A05(String str, String str2, Object... objArr) {
        A06(str, str2, Arrays.copyOf(objArr, objArr.length));
    }

    public static final void A06(String str, String str2, Object... objArr) {
        0qQ.A0B(objArr, 3);
        int length = objArr.length;
        Arrays.copyOf(objArr, length);
        A01.A09();
        MSLogHandlerImpl.logNative(3, str, A00(str2, (Throwable) null, Arrays.copyOf(objArr, length)));
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [com.facebook.mediastreaming.core.MSLogHandlerImpl, java.lang.Object] */
    public final synchronized void A09() {
        if (A00 == null) {
            A00 = new Object();
        }
    }

    public static final void A07(String str, Object... objArr) {
        Object[] copyOf = Arrays.copyOf(objArr, 0);
        0qQ.A0B(copyOf, 3);
        String simpleName = C22230Xxl.class.getSimpleName();
        Object[] copyOf2 = Arrays.copyOf(copyOf, copyOf.length);
        0qQ.A0B(copyOf2, 3);
        int length = copyOf2.length;
        Arrays.copyOf(copyOf2, length);
        A01.A09();
        MSLogHandlerImpl.logNative(4, simpleName, A00(str, (Throwable) null, Arrays.copyOf(copyOf2, length)));
    }

    public static final void A08(String str, Object... objArr) {
        Object[] copyOf = Arrays.copyOf(objArr, 0);
        0qQ.A0B(copyOf, 3);
        int length = copyOf.length;
        Arrays.copyOf(copyOf, length);
        A01.A09();
        MSLogHandlerImpl.logNative(5, "mss:VideoEncoderSetup", A00(str, (Throwable) null, Arrays.copyOf(copyOf, length)));
    }
}
