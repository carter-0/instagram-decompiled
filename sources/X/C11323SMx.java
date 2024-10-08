package X;

import android.graphics.Color;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.SMx  reason: case insensitive filesystem */
public abstract class C11323SMx {
    public static final Map A00;
    public static final Pattern A01 = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");
    public static final Pattern A02 = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    public static final Pattern A03 = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    static {
        HashMap A1E = AnonymousClass7TE.A1E();
        A00 = A1E;
        A1E.put("aliceblue", -984833);
        A1E.put("antiquewhite", -332841);
        A1E.put("aqua", -16711681);
        A1E.put("aquamarine", -8388652);
        A1E.put("azure", -983041);
        A1E.put("beige", -657956);
        A1E.put("bisque", -6972);
        A1E.put("black", -16777216);
        A1E.put("blanchedalmond", -5171);
        A1E.put("blue", -16776961);
        A1E.put("blueviolet", -7722014);
        A1E.put("brown", -5952982);
        A1E.put("burlywood", -2180985);
        A1E.put("cadetblue", -10510688);
        A1E.put("chartreuse", -8388864);
        A1E.put("chocolate", -2987746);
        A1E.put("coral", -32944);
        A1E.put("cornflowerblue", -10185235);
        A1E.put("cornsilk", -1828);
        A1E.put("crimson", -2354116);
        A1E.put("cyan", -16711681);
        A1E.put("darkblue", -16777077);
        A1E.put("darkcyan", -16741493);
        A1E.put("darkgoldenrod", -4684277);
        A1E.put("darkgray", -5658199);
        A1E.put("darkgreen", -16751616);
        A1E.put("darkgrey", -5658199);
        A1E.put("darkkhaki", -4343957);
        A1E.put("darkmagenta", -7667573);
        A1E.put("darkolivegreen", -11179217);
        A1E.put("darkorange", -29696);
        A1E.put("darkorchid", -6737204);
        A1E.put("darkred", -7667712);
        A1E.put("darksalmon", -1468806);
        A1E.put("darkseagreen", -7357297);
        A1E.put("darkslateblue", -12042869);
        A1E.put("darkslategray", -13676721);
        A1E.put("darkslategrey", -13676721);
        A1E.put("darkturquoise", -16724271);
        A1E.put("darkviolet", -7077677);
        A1E.put("deeppink", -60269);
        A1E.put("deepskyblue", -16728065);
        A1E.put("dimgray", -9868951);
        A1E.put("dimgrey", -9868951);
        A1E.put("dodgerblue", -14774017);
        A1E.put("firebrick", -5103070);
        A1E.put("floralwhite", -1296);
        A1E.put("forestgreen", -14513374);
        A1E.put("fuchsia", -65281);
        A1E.put("gainsboro", -2302756);
        A1E.put("ghostwhite", -460545);
        A1E.put("gold", -10496);
        A1E.put("goldenrod", -2448096);
        A1E.put("gray", -8355712);
        A1E.put("green", -16744448);
        A1E.put("greenyellow", -5374161);
        A1E.put("grey", -8355712);
        A1E.put("honeydew", -983056);
        A1E.put("hotpink", -38476);
        A1E.put("indianred", -3318692);
        A1E.put("indigo", -11861886);
        A1E.put("ivory", -16);
        A1E.put("khaki", -989556);
        A1E.put("lavender", -1644806);
        A1E.put("lavenderblush", -3851);
        A1E.put("lawngreen", -8586240);
        A1E.put("lemonchiffon", -1331);
        A1E.put("lightblue", -5383962);
        A1E.put("lightcoral", -1015680);
        A1E.put("lightcyan", -2031617);
        A1E.put("lightgoldenrodyellow", -329006);
        A1E.put("lightgray", -2894893);
        A1E.put("lightgreen", -7278960);
        A1E.put("lightgrey", -2894893);
        A1E.put("lightpink", -18751);
        A1E.put("lightsalmon", -24454);
        A1E.put("lightseagreen", -14634326);
        A1E.put("lightskyblue", -7876870);
        A1E.put("lightslategray", -8943463);
        A1E.put("lightslategrey", -8943463);
        A1E.put("lightsteelblue", -5192482);
        A1E.put("lightyellow", -32);
        A1E.put("lime", -16711936);
        A1E.put("limegreen", -13447886);
        A1E.put("linen", -331546);
        A1E.put("magenta", -65281);
        A1E.put("maroon", -8388608);
        A1E.put("mediumaquamarine", -10039894);
        A1E.put("mediumblue", -16777011);
        A1E.put("mediumorchid", -4565549);
        A1E.put("mediumpurple", -7114533);
        A1E.put("mediumseagreen", -12799119);
        A1E.put("mediumslateblue", -8689426);
        A1E.put("mediumspringgreen", -16713062);
        A1E.put("mediumturquoise", -12004916);
        A1E.put("mediumvioletred", -3730043);
        A1E.put("midnightblue", -15132304);
        A1E.put("mintcream", -655366);
        A1E.put("mistyrose", -6943);
        A1E.put("moccasin", -6987);
        A1E.put("navajowhite", -8531);
        A1E.put("navy", -16777088);
        A1E.put("oldlace", -133658);
        A1E.put("olive", -8355840);
        A1E.put("olivedrab", -9728477);
        A1E.put("orange", -23296);
        A1E.put("orangered", -47872);
        A1E.put("orchid", -2461482);
        A1E.put("palegoldenrod", -1120086);
        A1E.put("palegreen", -6751336);
        A1E.put("paleturquoise", -5247250);
        A1E.put("palevioletred", -2396013);
        A1E.put("papayawhip", -4139);
        A1E.put("peachpuff", -9543);
        A1E.put("peru", -3308225);
        A1E.put("pink", -16181);
        A1E.put("plum", -2252579);
        A1E.put("powderblue", -5185306);
        A1E.put("purple", -8388480);
        A1E.put("rebeccapurple", -10079335);
        A1E.put("red", -65536);
        A1E.put("rosybrown", -4419697);
        A1E.put("royalblue", -12490271);
        A1E.put("saddlebrown", -7650029);
        A1E.put("salmon", -360334);
        A1E.put("sandybrown", -744352);
        A1E.put("seagreen", -13726889);
        A1E.put("seashell", -2578);
        A1E.put("sienna", -6270419);
        A1E.put("silver", -4144960);
        A1E.put("skyblue", -7876885);
        A1E.put("slateblue", -9807155);
        A1E.put("slategray", -9404272);
        A1E.put("slategrey", -9404272);
        A1E.put("snow", -1286);
        A1E.put("springgreen", -16711809);
        A1E.put("steelblue", -12156236);
        A1E.put("tan", -2968436);
        A1E.put("teal", -16744320);
        A1E.put("thistle", -2572328);
        A1E.put("tomato", -40121);
        A1E.put("transparent", C51967G9n.A0k());
        A1E.put("turquoise", -12525360);
        A1E.put("violet", -1146130);
        A1E.put("wheat", -663885);
        A1E.put("white", C51967G9n.A0j());
        A1E.put("whitesmoke", -657931);
        A1E.put("yellow", -256);
        A1E.put("yellowgreen", -6632142);
    }

    public static int A01(Matcher matcher, int i) {
        String group = matcher.group(i);
        group.getClass();
        return Integer.parseInt(group, 10);
    }

    public static int A00(String str, boolean z) {
        Pattern pattern;
        int A012;
        int i;
        C11366SPh.A01(!TextUtils.isEmpty(str));
        String replace = str.replace(" ", "");
        if (Pxe.A00(replace) == '#') {
            int parseLong = (int) Long.parseLong(replace.substring(1), 16);
            int length = replace.length();
            if (length == 7) {
                i = -16777216;
            } else if (length == 9) {
                i = (parseLong & 255) << 24;
                parseLong >>>= 8;
            } else {
                throw Pxe.A0g();
            }
            return i | parseLong;
        }
        if (replace.startsWith("rgba")) {
            if (z) {
                pattern = A01;
            } else {
                pattern = A02;
            }
            Matcher matcher = pattern.matcher(replace);
            if (matcher.matches()) {
                if (z) {
                    A012 = (int) (Pxj.A07(matcher, 4) * 255.0f);
                } else {
                    A012 = A01(matcher, 4);
                }
                return Color.argb(A012, A01(matcher, 1), A01(matcher, 2), A01(matcher, 3));
            }
        } else if (replace.startsWith("rgb")) {
            Matcher matcher2 = A03.matcher(replace);
            if (matcher2.matches()) {
                return Color.rgb(A01(matcher2, 1), A01(matcher2, 2), A01(matcher2, 3));
            }
        } else {
            Number A14 = C51966G9m.A14(C256643w7.A00(replace), A00);
            if (A14 != null) {
                return A14.intValue();
            }
        }
        throw Pxe.A0g();
    }
}
