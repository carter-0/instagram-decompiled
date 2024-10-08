package X;

import com.instagram.direct.messagethread.nullstate.threaddata.theme.ThemeViewModelDelegate;
import com.instagram.direct.model.DirectThreadThemeInfo;

public abstract class OSB {
    public static final ThemeViewModelDelegate A00 = new ThemeViewModelDelegate("", (String) null, (String) null, (String) null, (String) null, (String) null, new int[0], new int[0], -1, -1, -1, -1, -1);

    public static final ThemeViewModelDelegate A00(DirectThreadThemeInfo directThreadThemeInfo) {
        DirectThreadThemeInfo directThreadThemeInfo2;
        if (directThreadThemeInfo == null) {
            return A00;
        }
        String str = directThreadThemeInfo.A0o;
        if (!(str == null || ((directThreadThemeInfo2 = (DirectThreadThemeInfo) AnonymousClass6BI.A0f.get(str)) == null && (directThreadThemeInfo2 = (DirectThreadThemeInfo) AnonymousClass6BI.A00.get(str)) == null))) {
            directThreadThemeInfo = directThreadThemeInfo2;
        }
        String str2 = directThreadThemeInfo.A0o;
        int i = directThreadThemeInfo.A04;
        String str3 = directThreadThemeInfo.A0k;
        if (str3 == null) {
            str3 = directThreadThemeInfo.A0f;
        }
        int i2 = directThreadThemeInfo.A07;
        int i3 = directThreadThemeInfo.A03;
        return new ThemeViewModelDelegate(str2, str3, directThreadThemeInfo.A0n, directThreadThemeInfo.A0j, directThreadThemeInfo.A0l, directThreadThemeInfo.A0i, DirectThreadThemeInfo.A00(directThreadThemeInfo.A0s), DirectThreadThemeInfo.A00(directThreadThemeInfo.A0q), i, i2, i3, directThreadThemeInfo.A02(), directThreadThemeInfo.A01());
    }
}
