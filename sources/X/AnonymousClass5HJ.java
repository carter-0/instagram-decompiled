package X;

import android.text.TextUtils;
import com.instagram.common.notifications.push.intf.PushChannelType;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.5HJ  reason: invalid class name */
public final class AnonymousClass5HJ {
    public float A00 = -1.0f;
    public int A01 = 0;
    public int A02 = 0;
    public long A03 = System.currentTimeMillis();
    public long A04;
    public N4O A05 = null;
    public C61081JwJ A06;
    public 2HA A07 = 2HA.A0c;
    public AnonymousClass5ER A08;
    public C74303Psd A09;
    public C284305Lz A0A;
    public PushChannelType A0B = PushChannelType.A0D;
    public ImageUrl A0C;
    public ImageUrl A0D;
    public ImageUrl A0E;
    public Boolean A0F;
    public Boolean A0G;
    public Integer A0H;
    public Integer A0I;
    public Long A0J;
    public Long A0K = 0L;
    public Long A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public String A0P;
    public String A0Q;
    public String A0R;
    public String A0S;
    public String A0T;
    public String A0U;
    public String A0V;
    public String A0W;
    public String A0X;
    public String A0Y;
    public String A0Z = null;
    public String A0a;
    public String A0b;
    public String A0c;
    public String A0d;
    public String A0e;
    public String A0f;
    public String A0g;
    public String A0h;
    public String A0i;
    public String A0j;
    public String A0k;
    public String A0l;
    public String A0m;
    public String A0n;
    public String A0o;
    public String A0p;
    public String A0q;
    public String A0r;
    public String A0s;
    public String A0t;
    public String A0u;
    public String A0v;
    public String A0w;
    public String A0x;
    public String A0y;
    public String A0z;
    public String A10;
    public String A11;
    public String A12;
    public String A13;
    public String A14 = null;
    public String A15;
    public String A16;
    public String A17;
    public String A18;
    public String A19;
    public String A1A;
    public String A1B;
    public String A1C;
    public String A1D;
    public String A1E;
    public String A1F;
    public String A1G;
    public String A1H;
    public String A1I;
    public HashMap A1J;
    public List A1K;
    public List A1L = null;
    public boolean A1M = false;
    public boolean A1N = false;
    public boolean A1O = true;
    public boolean A1P;
    public boolean A1Q;
    public boolean A1R;
    public boolean A1S;
    public boolean A1T = false;
    public boolean A1U;
    public transient String A1V;

    public AnonymousClass5HJ(AnonymousClass5ER r5, ImageUrl imageUrl, Boolean bool, Boolean bool2, Boolean bool3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.A1I = str;
        this.A0r = str2;
        this.A1D = null;
        this.A1H = null;
        this.A0g = str3;
        this.A0X = str4;
        this.A0D = null;
        this.A0C = imageUrl;
        this.A0E = null;
        this.A1C = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
        this.A12 = str5;
        this.A11 = str6;
        this.A0j = str7;
        this.A08 = r5;
        this.A0h = null;
        this.A1V = null;
        this.A1K = null;
        this.A0e = null;
        this.A0s = null;
        this.A16 = null;
        this.A0f = str8;
        this.A17 = null;
        this.A1A = str9;
        this.A0P = null;
        this.A1Q = bool.booleanValue();
        this.A1P = bool2.booleanValue();
        this.A1O = bool3.booleanValue();
        this.A0z = str10;
        this.A0v = str11;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r0 = r3.getStringExtra("data");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass5HJ A00(android.content.Intent r3, java.lang.String r4, boolean r5) {
        /*
            r2 = 0
            java.lang.String r1 = "data"
            boolean r0 = r3.hasExtra(r1)
            if (r0 == 0) goto L_0x0028
            java.lang.String r0 = r3.getStringExtra(r1)
            X.5HJ r1 = A01(r0, r4)
            if (r1 == 0) goto L_0x0028
            if (r5 == 0) goto L_0x0017
            r1.A14 = r0
        L_0x0017:
            java.lang.String r0 = r1.A0X
            if (r0 != 0) goto L_0x0027
            java.lang.String r0 = "collapse_key"
            java.lang.String r0 = r3.getStringExtra(r0)
            if (r0 != 0) goto L_0x0025
            java.lang.String r0 = "default"
        L_0x0025:
            r1.A0X = r0
        L_0x0027:
            return r1
        L_0x0028:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5HJ.A00(android.content.Intent, java.lang.String, boolean):X.5HJ");
    }

    public final C74303Psd A03() {
        if (this.A09 == null && !TextUtils.isEmpty(this.A0a)) {
            this.A09 = new C71944OtV(Integer.parseInt(this.A0a));
        }
        return this.A09;
    }

    public final String A04() {
        try {
            StringWriter stringWriter = new StringWriter();
            17W A0A2 = AnonymousClass15o.A00.A0A(stringWriter);
            A0A2.A0c();
            String str = this.A1I;
            if (str != null) {
                A0A2.A0R("t", str);
            }
            String str2 = this.A0r;
            if (str2 != null) {
                A0A2.A0R("m", str2);
            }
            String str3 = this.A0t;
            if (str3 != null) {
                A0A2.A0R("brf", str3);
            }
            String str4 = this.A1D;
            if (str4 != null) {
                A0A2.A0R("st", str4);
            }
            String str5 = this.A1H;
            if (str5 != null) {
                A0A2.A0R("tt", str5);
            }
            if (this.A06 != null) {
                A0A2.A0q("dedup");
                C61081JwJ jwJ = this.A06;
                A0A2.A0c();
                String str6 = jwJ.A01;
                if (str6 != null) {
                    A0A2.A0R("ch", str6);
                }
                Number number = (Number) jwJ.A00;
                if (number != null) {
                    A0A2.A0Q("ttl", number.longValue());
                }
                A0A2.A0Z();
            }
            String str7 = this.A0g;
            if (str7 != null) {
                A0A2.A0R("ig", str7);
            }
            String str8 = this.A15;
            if (str8 != null) {
                A0A2.A0R("r_cc", str8);
            }
            String str9 = this.A0X;
            if (str9 != null) {
                A0A2.A0R("collapse_key", str9);
            }
            if (this.A0D != null) {
                A0A2.A0q("i");
                16h.A01(A0A2, this.A0D);
            }
            if (this.A0C != null) {
                A0A2.A0q("a");
                16h.A01(A0A2, this.A0C);
            }
            if (this.A0E != null) {
                A0A2.A0q("ei");
                16h.A01(A0A2, this.A0E);
            }
            String str10 = this.A1C;
            if (str10 != null) {
                A0A2.A0R("sound", str10);
            }
            String str11 = this.A12;
            if (str11 != null) {
                A0A2.A0R("pi", str11);
            }
            if (this.A0A != null) {
                A0A2.A0q("pim");
                C284295Ly.A00(A0A2, this.A0A);
            }
            String str12 = this.A11;
            if (str12 != null) {
                A0A2.A0R("c", str12);
            }
            String str13 = this.A13;
            if (str13 != null) {
                A0A2.A0R("ti", str13);
            }
            String str14 = this.A0j;
            if (str14 != null) {
                A0A2.A0R("u", str14);
            }
            if (this.A08 != null) {
                A0A2.A0q("bc");
                A0A2.A0t(AnonymousClass5HL.A00(this.A08));
            }
            String str15 = this.A0h;
            if (str15 != null) {
                A0A2.A0R("ia", str15);
            }
            String str16 = this.A0e;
            if (str16 != null) {
                A0A2.A0R("hpa", str16);
            }
            String str17 = this.A0s;
            if (str17 != null) {
                A0A2.A0R("cc", str17);
            }
            String str18 = this.A0f;
            if (str18 != null) {
                A0A2.A0R("gid", str18);
            }
            String str19 = this.A16;
            if (str19 != null) {
                A0A2.A0R("rid", str19);
            }
            String str20 = this.A17;
            if (str20 != null) {
                A0A2.A0R("rtc_m", str20);
            }
            String str21 = this.A18;
            if (str21 != null) {
                A0A2.A0R("rtc_z", str21);
            }
            String str22 = this.A1A;
            if (str22 != null) {
                A0A2.A0R("s", str22);
            }
            String str23 = this.A19;
            if (str23 != null) {
                A0A2.A0R("sna", str23);
            }
            A0A2.A0S("shh", this.A1U);
            String str24 = this.A0l;
            if (str24 != null) {
                A0A2.A0R("lat", str24);
            }
            String str25 = this.A0n;
            if (str25 != null) {
                A0A2.A0R("long", str25);
            }
            String str26 = this.A0m;
            if (str26 != null) {
                A0A2.A0R("loc", str26);
            }
            String str27 = this.A0k;
            if (str27 != null) {
                A0A2.A0R("device_name", str27);
            }
            String str28 = this.A0o;
            if (str28 != null) {
                A0A2.A0R(MYM.A00(0, 9, 19), str28);
            }
            String str29 = this.A0p;
            if (str29 != null) {
                A0A2.A0R("time", str29);
            }
            String str30 = this.A0q;
            if (str30 != null) {
                A0A2.A0R("tf_id", str30);
            }
            Boolean bool = this.A0G;
            if (bool != null) {
                A0A2.A0S("cf", bool.booleanValue());
            }
            String str31 = this.A0u;
            if (str31 != null) {
                A0A2.A0R("ts", str31);
            }
            String str32 = this.A0O;
            if (str32 != null) {
                A0A2.A0R("message_type_id", str32);
            }
            String str33 = this.A0N;
            if (str33 != null) {
                A0A2.A0R("message_type", str33);
            }
            String str34 = this.A0P;
            if (str34 != null) {
                A0A2.A0R("payload", str34);
            }
            String str35 = this.A0U;
            if (str35 != null) {
                A0A2.A0R("wa_push_id", str35);
            }
            String str36 = this.A0S;
            if (str36 != null) {
                A0A2.A0R("sn", str36);
            }
            String str37 = this.A0R;
            if (str37 != null) {
                A0A2.A0R("su", str37);
            }
            String str38 = this.A0M;
            if (str38 != null) {
                A0A2.A0R("gn", str38);
            }
            String str39 = this.A0Q;
            if (str39 != null) {
                A0A2.A0R("rn", str39);
            }
            String str40 = this.A0T;
            if (str40 != null) {
                A0A2.A0R("tid", str40);
            }
            A0A2.A0S("is_thread_muted", this.A1Q);
            A0A2.A0S("is_thread_hidden", this.A1P);
            A0A2.A0S("is_fg", this.A1O);
            String str41 = this.A0z;
            if (str41 != null) {
                A0A2.A0R("atid", str41);
            }
            String str42 = this.A0x;
            if (str42 != null) {
                A0A2.A0R("mtr_id", str42);
            }
            String str43 = this.A0c;
            if (str43 != null) {
                A0A2.A0R("exp", str43);
            }
            String str44 = this.A0a;
            if (str44 != null) {
                A0A2.A0R("tp", str44);
            }
            String str45 = this.A0b;
            if (str45 != null) {
                A0A2.A0R("t_t", str45);
            }
            A0A2.A0S("is_e2ee_badge_calculated", this.A1R);
            Boolean bool2 = this.A0F;
            if (bool2 != null) {
                A0A2.A0S("mw", bool2.booleanValue());
            }
            Long l = this.A0J;
            if (l != null) {
                A0A2.A0Q("ntlt", l.longValue());
            }
            A0A2.A0Q("NOTIFICATION_CREATED_TIMESTAMP", this.A03);
            A0A2.A0Q("nf", this.A04);
            String str46 = this.A0W;
            if (str46 != null) {
                A0A2.A0R("jl_hash", str46);
            }
            String str47 = this.A0V;
            if (str47 != null) {
                A0A2.A0R("di_id", str47);
            }
            A0A2.A0S("is_instamadillo", this.A1S);
            String str48 = this.A0i;
            if (str48 != null) {
                A0A2.A0R("itt", str48);
            }
            String str49 = this.A1G;
            if (str49 != null) {
                A0A2.A0R("thread_igid", str49);
            }
            String str50 = this.A1F;
            if (str50 != null) {
                A0A2.A0R("t_id", str50);
            }
            String str51 = this.A10;
            if (str51 != null) {
                A0A2.A0R("pay_nonce", str51);
            }
            String str52 = this.A0d;
            if (str52 != null) {
                A0A2.A0R("grpid", str52);
            }
            if (this.A1J != null) {
                A0A2.A0q("tkids");
                A0A2.A0c();
                for (Map.Entry entry : this.A1J.entrySet()) {
                    if (!16P.A04(A0A2, entry)) {
                        A0A2.A0t((String) entry.getValue());
                    }
                }
                A0A2.A0Z();
            }
            String str53 = this.A0y;
            if (str53 != null) {
                A0A2.A0R("muid", str53);
            }
            PushChannelType pushChannelType = this.A0B;
            if (pushChannelType != null) {
                A0A2.A0R("delivery_channel", pushChannelType.A01);
            }
            2HA r0 = this.A07;
            if (r0 != null) {
                A0A2.A0R("achid", r0.A00);
            }
            String str54 = this.A1E;
            if (str54 != null) {
                A0A2.A0R("f", str54);
            }
            String str55 = this.A0Y;
            if (str55 != null) {
                A0A2.A0R("ch", str55);
            }
            A0A2.A0O("sndtm", this.A00);
            A0A2.A0P("cdlw", this.A01);
            A0A2.A0P("ls", this.A02);
            String str56 = this.A1B;
            if (str56 != null) {
                A0A2.A0R("sort_key", str56);
            }
            if (this.A05 != null) {
                A0A2.A0q("direct_metadata");
                N4O n4o = this.A05;
                A0A2.A0c();
                Number number2 = (Number) n4o.A01;
                if (number2 != null) {
                    A0A2.A0Q("expire_ms", number2.longValue());
                }
                Boolean bool3 = (Boolean) n4o.A00;
                if (bool3 != null) {
                    A0A2.A0S("is_dm", bool3.booleanValue());
                }
                A0A2.A0Z();
            }
            A0A2.A0Z();
            A0A2.close();
            return stringWriter.toString();
        } catch (IOException e) {
            0KC.A05(AnonymousClass5HJ.class, "Unexpected IO exception", e);
            return "";
        }
    }

    public final boolean A05() {
        if (this.A0B == PushChannelType.MSYS) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass5HJ)) {
            return false;
        }
        AnonymousClass5HJ r4 = (AnonymousClass5HJ) obj;
        if (!2PP.A00(this.A1I, r4.A1I) || !2PP.A00(this.A0r, r4.A0r) || !2PP.A00(this.A1D, r4.A1D)) {
            return false;
        }
        String str = this.A1H;
        if (str == null) {
            str = this.A0r;
        }
        String str2 = r4.A1H;
        if (str2 == null) {
            str2 = r4.A0r;
        }
        if (!2PP.A00(str, str2) || !2PP.A00(this.A0g, r4.A0g) || !2PP.A00(this.A0X, r4.A0X) || !2PP.A00(this.A1C, r4.A1C) || !2PP.A00(this.A08, r4.A08) || !2PP.A00(this.A0h, r4.A0h) || !2PP.A00(this.A1K, r4.A1K) || !2PP.A00(this.A0s, r4.A0s) || !2PP.A00(this.A17, r4.A17) || !2PP.A00(this.A0G, r4.A0G) || !2PP.A00(this.A0D, r4.A0D) || !2PP.A00(this.A0C, r4.A0C) || !2PP.A00(this.A0E, r4.A0E) || !2PP.A00(this.A0j, r4.A0j) || !2PP.A00(this.A16, r4.A16) || !2PP.A00(this.A0f, r4.A0f) || !2PP.A00(this.A1A, r4.A1A) || !2PP.A00(this.A12, r4.A12) || !2PP.A00(this.A11, r4.A11) || !2PP.A00(this.A0B, r4.A0B) || !2PP.A00(this.A0l, r4.A0l) || !2PP.A00(this.A0n, r4.A0n) || !2PP.A00(this.A0m, r4.A0m) || !2PP.A00(this.A0k, r4.A0k) || !2PP.A00(this.A0o, r4.A0o) || !2PP.A00(this.A0p, r4.A0p) || !2PP.A00(this.A0q, r4.A0q) || !2PP.A00(this.A0O, r4.A0O) || !2PP.A00(this.A0N, r4.A0N) || !2PP.A00(this.A0P, r4.A0P) || !2PP.A00(this.A0U, r4.A0U) || !2PP.A00(this.A0S, r4.A0S) || !2PP.A00(this.A0R, r4.A0R) || !2PP.A00(this.A0M, r4.A0M) || !2PP.A00(this.A0Q, r4.A0Q) || !2PP.A00(this.A0T, r4.A0T) || !2PP.A00(Boolean.valueOf(this.A1P), Boolean.valueOf(r4.A1P)) || !2PP.A00(Boolean.valueOf(this.A1Q), Boolean.valueOf(r4.A1Q)) || !2PP.A00(Boolean.valueOf(this.A1O), Boolean.valueOf(r4.A1O)) || !2PP.A00(this.A0c, r4.A0c) || !2PP.A00(this.A0a, r4.A0a) || !2PP.A00(this.A0b, r4.A0b) || !2PP.A00(this.A0Z, r4.A0Z) || !2PP.A00(Boolean.valueOf(this.A1U), Boolean.valueOf(r4.A1U)) || !2PP.A00(this.A0W, r4.A0W) || !2PP.A00(this.A0V, r4.A0V) || !2PP.A00(this.A0I, r4.A0I) || !2PP.A00(this.A0d, r4.A0d) || !2PP.A00(this.A0H, r4.A0H) || !2PP.A00(this.A0A, r4.A0A) || !2PP.A00(this.A0Y, r4.A0Y) || !2PP.A00(Float.valueOf(this.A00), Float.valueOf(r4.A00)) || !2PP.A00(Integer.valueOf(this.A01), Integer.valueOf(r4.A01)) || !2PP.A00(Integer.valueOf(this.A02), Integer.valueOf(r4.A02))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object[] objArr = new Object[68];
        String str = this.A1I;
        String str2 = this.A0r;
        String str3 = this.A1D;
        String str4 = this.A1H;
        String str5 = this.A0g;
        ImageUrl imageUrl = this.A0D;
        ImageUrl imageUrl2 = this.A0C;
        ImageUrl imageUrl3 = this.A0E;
        String str6 = this.A0X;
        String str7 = this.A1C;
        String str8 = this.A12;
        String str9 = this.A11;
        String str10 = str2;
        String str11 = str3;
        String str12 = str4;
        String str13 = str5;
        ImageUrl imageUrl4 = imageUrl;
        ImageUrl imageUrl5 = imageUrl2;
        ImageUrl imageUrl6 = imageUrl3;
        String str14 = str6;
        String str15 = str7;
        String str16 = str8;
        String str17 = str9;
        String str18 = str;
        System.arraycopy(new Object[]{str18, str10, str11, str12, str13, imageUrl4, imageUrl5, imageUrl6, str14, str15, str16, str17, this.A13, this.A0j, this.A08, this.A0h, this.A1K, this.A0s, this.A16, this.A0f, this.A17, this.A1A, this.A19, Boolean.valueOf(this.A1U), this.A0l, this.A0n, this.A0m}, 0, objArr, 0, 27);
        String str19 = this.A0k;
        String str20 = this.A0o;
        String str21 = this.A0p;
        String str22 = this.A0q;
        Boolean bool = this.A0G;
        PushChannelType pushChannelType = this.A0B;
        String str23 = this.A0O;
        String str24 = this.A0N;
        String str25 = this.A0P;
        String str26 = this.A0U;
        String str27 = this.A0S;
        String str28 = this.A0R;
        String str29 = str28;
        String str30 = str19;
        System.arraycopy(new Object[]{str30, str20, str21, str22, bool, pushChannelType, str23, str24, str25, str26, str27, str29, this.A0M, this.A0Q, this.A0T, Boolean.valueOf(this.A1Q), Boolean.valueOf(this.A1P), Boolean.valueOf(this.A1O), Boolean.valueOf(this.A1S), this.A0i, this.A1F, this.A1G, this.A1E, this.A0z, this.A0v, this.A0x, this.A0c}, 0, objArr, 27, 27);
        System.arraycopy(new Object[]{this.A0a, this.A0b, this.A0Z, Boolean.valueOf(this.A1R), this.A0W, this.A0V, this.A0I, this.A0H, this.A0d, this.A0A, this.A0Y, Float.valueOf(this.A00), Integer.valueOf(this.A01), Integer.valueOf(this.A02)}, 0, objArr, 54, 14);
        return Arrays.hashCode(objArr);
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        String str4;
        StringBuilder sb = new StringBuilder("IgNotification{");
        A02("mTitle", this.A1I, sb);
        A02("mMessage", this.A0r, sb);
        A02("mSubtext", this.A1D, sb);
        A02("mTickerText", this.A1H, sb);
        A02("mIgAction", this.A0g, sb);
        ImageUrl imageUrl = this.A0D;
        String str5 = "";
        if (imageUrl != null) {
            str = imageUrl.getUrl();
        } else {
            str = str5;
        }
        A02("mOptionalImage", str, sb);
        ImageUrl imageUrl2 = this.A0C;
        if (imageUrl2 != null) {
            str2 = imageUrl2.getUrl();
        } else {
            str2 = str5;
        }
        A02("OptionalAvatarUrl", str2, sb);
        ImageUrl imageUrl3 = this.A0E;
        if (imageUrl3 != null) {
            str5 = imageUrl3.getUrl();
        }
        A02("OptionalMediaUrl", str5, sb);
        A02("mCollapseKey", this.A0X, sb);
        A02("mSound", this.A1C, sb);
        A02("mPushId", this.A12, sb);
        A02("mPushCategory", this.A11, sb);
        A02("mPushTraceId", this.A13, sb);
        A02("mIntendedRecipientUserid", this.A0j, sb);
        try {
            A02("mBadgeCount", AnonymousClass5HL.A00(this.A08), sb);
        } catch (IOException | NullPointerException unused) {
        }
        A02("mInAppActors", this.A0h, sb);
        A02("mHigherPriorityApps", String.valueOf(this.A1K), sb);
        A02("mMessageClientContext", this.A0s, sb);
        A02("mId", this.A0f, sb);
        A02("mRevokedId", this.A16, sb);
        A02("mRtcMessage", this.A17, sb);
        A02("mRtcZippedMessage", this.A18, sb);
        A02("mSenderUserId", this.A1A, sb);
        A02("mSenderName", this.A19, sb);
        A02("mIsShhModeMessage", String.valueOf(this.A1U), sb);
        A02("mLoginNotificationLatitude", this.A0l, sb);
        A02("mLoginNotificationLongitude", this.A0n, sb);
        A02("mLoginNotificationLocationName", this.A0m, sb);
        A02("mLoginNotificationDeviceName", this.A0k, sb);
        A02("mLoginNotificationRequestDeviceId", this.A0o, sb);
        A02("mLoginNotificationTimestamp", this.A0p, sb);
        A02("mLoginNotificationTimestamp", this.A0q, sb);
        A02("mIsCloseFriendsThread", String.valueOf(this.A0G), sb);
        A02("mPushChannelType", this.A0B.A01, sb);
        A02("mGroupId", this.A0d, sb);
        A02("mArmadilloMessageTypeId", this.A0O, sb);
        A02("mArmadilloMessageType", this.A0N, sb);
        A02("mArmadilloPayload", this.A0P, sb);
        A02("mArmadilloWAPushId", this.A0U, sb);
        A02("mArmadilloSenderName", this.A0S, sb);
        A02("mArmadilloSenderImageUrl", this.A0R, sb);
        A02("mArmadilloGroupName", this.A0M, sb);
        A02("mArmadilloReceiverName", this.A0Q, sb);
        A02("mArmadilloThreadKey", this.A0T, sb);
        A02("mArmadilloIsThreadMuted", String.valueOf(this.A1Q), sb);
        A02("mArmadilloIsThreadHidden", String.valueOf(this.A1P), sb);
        A02("mArmadilloIsForegroundAccount", String.valueOf(this.A1O), sb);
        A02("mIsInstamadillo", String.valueOf(this.A1S), sb);
        A02("mInstamadilloThreadType", this.A0i, sb);
        A02("mThreadId", this.A1F, sb);
        A02("mThreadIgId", this.A1G, sb);
        A02("mThreadFbId", this.A1E, sb);
        A02("mNotificationTraceId", this.A0z, sb);
        A02("mMessageTraceId", this.A0v, sb);
        A02("mMiTraceId", this.A0x, sb);
        A02("mExperimentsMask", this.A0c, sb);
        A02("mDirectThreadPropertiesMask", this.A0a, sb);
        A02("mDirectThreadTitle", this.A0b, sb);
        A02("mDirectReplyMessage", this.A0Z, sb);
        A02("mIsE2EEBadgeCountCalculated", String.valueOf(this.A1R), sb);
        A02("mChannelDirectInvitesJoinLink", this.A0W, sb);
        A02("mChannelDirectInvitesInviteId", this.A0V, sb);
        Integer num = this.A0I;
        String str6 = null;
        if (num != null) {
            str3 = num.toString();
        } else {
            str3 = null;
        }
        A02("mPushPriority", str3, sb);
        Integer num2 = this.A0H;
        if (num2 != null) {
            str4 = num2.toString();
        } else {
            str4 = null;
        }
        A02("mOriginalPushPriority", str4, sb);
        A02("mContentHash", this.A0Y, sb);
        A02("mServerSendTime", String.valueOf(this.A00), sb);
        A02("mContentDedupLookbackWindow", String.valueOf(this.A01), sb);
        A02("mLockedStatus", String.valueOf(this.A02), sb);
        try {
            C284305Lz r2 = this.A0A;
            if (r2 != null) {
                StringWriter stringWriter = new StringWriter();
                17W A0A2 = AnonymousClass15o.A00.A0A(stringWriter);
                C284295Ly.A00(A0A2, r2);
                A0A2.close();
                str6 = stringWriter.toString();
            }
            A02("mPushInfraMetadata", str6, sb);
        } catch (IOException unused2) {
        }
        sb.append('}');
        return sb.toString();
    }

    public static AnonymousClass5HJ A01(String str, String str2) {
        AnonymousClass5HJ parseFromJson = AnonymousClass5HK.parseFromJson(16P.A00(str));
        if (parseFromJson == null) {
            return null;
        }
        parseFromJson.A1V = str2;
        return parseFromJson;
    }

    public static void A02(String str, String str2, StringBuilder sb) {
        if (sb.length() > 0 && sb.charAt(sb.length() - 1) == '\'') {
            sb.append(", ");
        }
        sb.append(str);
        sb.append("='");
        if (str2 == null) {
            str2 = "";
        }
        sb.append(str2);
        sb.append('\'');
    }

    public AnonymousClass5HJ() {
    }
}
