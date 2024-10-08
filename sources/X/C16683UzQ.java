package X;

import com.facebook.react.views.webview.ReactWebViewManager;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.UzQ  reason: case insensitive filesystem */
public enum C16683UzQ {
    Cp437((String) new String[0], (int) new int[]{0, 2}),
    ISO8859_1((String) new String[]{"ISO-8859-1"}, (int) new int[]{1, 3}),
    A0K((int) "ISO8859_2", (int) new String[]{"ISO-8859-2"}),
    A0L((int) "ISO8859_3", (int) new String[]{"ISO-8859-3"}),
    A0M((int) "ISO8859_4", (int) new String[]{"ISO-8859-4"}),
    A0N((int) "ISO8859_5", (int) new String[]{"ISO-8859-5"}),
    A0O((int) "ISO8859_6", (int) new String[]{"ISO-8859-6"}),
    A0P((int) "ISO8859_7", (int) new String[]{"ISO-8859-7"}),
    A0Q((int) "ISO8859_8", (int) new String[]{"ISO-8859-8"}),
    A0R((int) "ISO8859_9", (int) new String[]{"ISO-8859-9"}),
    A0E((int) "ISO8859_10", (int) new String[]{"ISO-8859-10"}),
    A0F((int) "ISO8859_11", (int) new String[]{"ISO-8859-11"}),
    A0G((int) "ISO8859_13", (int) new String[]{"ISO-8859-13"}),
    A0H((int) "ISO8859_14", (int) new String[]{"ISO-8859-14"}),
    A0I((int) "ISO8859_15", (int) new String[]{"ISO-8859-15"}),
    A0J((int) "ISO8859_16", (int) new String[]{"ISO-8859-16"}),
    A0S((int) "SJIS", (int) new String[]{"Shift_JIS"}),
    A07((int) "Cp1250", (int) new String[]{"windows-1250"}),
    A08((int) "Cp1251", (int) new String[]{"windows-1251"}),
    A09((int) "Cp1252", (int) new String[]{"windows-1252"}),
    A0A((int) "Cp1256", (int) new String[]{"windows-1256"}),
    A0U((int) "UnicodeBigUnmarked", (int) new String[]{"UTF-16BE", "UnicodeBig"}),
    A0T((int) "UTF8", (int) new String[]{ReactWebViewManager.HTML_ENCODING}),
    ASCII((String) new String[]{"US-ASCII"}, (int) new int[]{27, C11152SCh.MAX_FACTORIAL}),
    Big5((String) new String[0], (int) new int[]{28}),
    A0C((int) "GB18030", (int) new String[]{"GB2312", "EUC_CN", "GBK"});
    
    public static final Map A02 = null;
    public static final Map A03 = null;
    public final int[] A00;
    public final String[] A01;

    /* access modifiers changed from: public */
    static {
        A03 = new HashMap();
        A02 = new HashMap();
        for (C16683UzQ uzQ : values()) {
            for (int A1O : uzQ.A00) {
                C51967G9n.A1O(uzQ, A03, A1O);
            }
            A02.put(uzQ.name(), uzQ);
            for (String put : uzQ.A01) {
                A02.put(put, uzQ);
            }
        }
    }

    /* access modifiers changed from: public */
    C16683UzQ(String str, String... strArr) {
        this.A00 = new int[]{r3};
        this.A01 = strArr;
    }

    /* access modifiers changed from: public */
    C16683UzQ(String[] strArr, int... iArr) {
        this.A00 = iArr;
        this.A01 = strArr;
    }
}
