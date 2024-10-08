package X;

import android.text.TextUtils;
import com.google.common.collect.ImmutableList;

public final class XOG extends S4U {
    public static final ImmutableList A00;

    public final void A00(String str) {
    }

    static {
        ImmutableList.Builder builder = new ImmutableList.Builder();
        builder.add("AL");
        builder.add("AK");
        builder.add("AZ");
        builder.add("AR");
        builder.add("CA");
        builder.add("CO");
        builder.add("CT");
        builder.add("DC");
        builder.add("DE");
        builder.add("FL");
        builder.add("GA");
        builder.add("HI");
        builder.add("ID");
        builder.add("IL");
        builder.add("IN");
        builder.add("IA");
        builder.add("KS");
        builder.add("KY");
        builder.add("LA");
        builder.add("ME");
        builder.add("MD");
        builder.add("MA");
        builder.add("MI");
        builder.add("MN");
        builder.add("MS");
        builder.add("MO");
        builder.add("MT");
        builder.add("NE");
        builder.add("NV");
        builder.add("NH");
        builder.add("NJ");
        builder.add("NM");
        builder.add("NY");
        builder.add("NC");
        builder.add("ND");
        builder.add("OH");
        builder.add("OK");
        builder.add("OR");
        builder.add("PA");
        builder.add("RI");
        builder.add("SC");
        builder.add("SD");
        builder.add("TN");
        builder.add("TX");
        builder.add("UT");
        builder.add("VT");
        builder.add("VA");
        builder.add("WA");
        builder.add("WV");
        builder.add("WI");
        builder.add("WY");
        A00 = builder.build();
    }

    public final boolean A01(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return A00.contains(str);
    }
}
