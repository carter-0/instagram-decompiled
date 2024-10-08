package X;

import com.facebook.mantle.common.mantledatavalue.MantleDataValue;
import com.google.common.collect.ImmutableMap;

/* renamed from: X.LPp  reason: case insensitive filesystem */
public final class C64140LPp {
    public static final /* synthetic */ C64140LPp A00 = new Object();

    public static final ImmutableMap A00(MantleDataValue mantleDataValue, String str, boolean z, boolean z2) {
        0qQ.A0B(str, 0);
        0qQ.A0B(mantleDataValue, 2);
        ImmutableMap.Builder builder = new ImmutableMap.Builder();
        builder.put("textInput", new MantleDataValue(C301305yu.STRING, (Object) str));
        builder.put("lexiconStemmerEnabled", new MantleDataValue(C301305yu.BOOLEAN, (Object) Boolean.valueOf(z2)));
        if (z) {
            builder.put("lexiconCacheKey", mantleDataValue);
        }
        ImmutableMap build = builder.build();
        0qQ.A07(build);
        return build;
    }
}
