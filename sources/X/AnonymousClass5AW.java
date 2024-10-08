package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.5AW  reason: invalid class name */
public abstract class AnonymousClass5AW {
    public static C281905Aa parseFromJson(16F r35) {
        0LH r1;
        String str;
        String A1P;
        String A1P2;
        16F r7 = r35;
        0qQ.A0B(r7, 0);
        try {
            Integer num = null;
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            Integer num2 = null;
            Integer num3 = null;
            String str2 = null;
            String str3 = null;
            ArrayList arrayList = null;
            C281915Ab r23 = null;
            String str4 = null;
            ArrayList arrayList2 = null;
            ArrayList arrayList3 = null;
            String str5 = null;
            ArrayList arrayList4 = null;
            String str6 = null;
            BIJ bij = null;
            while (r7.A1J() != 16L.A09) {
                String A0q = r7.A0q();
                r7.A1J();
                if ("carrier_id".equals(A0q)) {
                    if (r7.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r7.A1P();
                    }
                } else if ("carrier_name".equals(A0q)) {
                    if (r7.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r7.A1P();
                    }
                } else if ("carrier_signal_config".equals(A0q)) {
                    if (r7.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r7.A1J() != 16L.A08) {
                            C15070UNn parseFromJson = C16853V8i.parseFromJson(r7);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("content_type_pricing_map".equals(A0q)) {
                    r23 = C393659wn.parseFromJson(r7);
                } else if ("deadline".equals(A0q)) {
                    if (r7.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r7.A1P();
                    }
                } else if ("enabled_wallet_defs_keys".equals(A0q)) {
                    if (r7.A11() == 16L.A0C) {
                        arrayList2 = new ArrayList();
                        while (r7.A1J() != 16L.A08) {
                            if (!(r7.A11() == 16L.A0G || (A1P2 = r7.A1P()) == null)) {
                                arrayList2.add(A1P2);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("features".equals(A0q)) {
                    if (r7.A11() == 16L.A0C) {
                        arrayList3 = new ArrayList();
                        while (r7.A1J() != 16L.A08) {
                            if (!(r7.A11() == 16L.A0G || (A1P = r7.A1P()) == null)) {
                                arrayList3.add(A1P);
                            }
                        }
                    } else {
                        arrayList3 = null;
                    }
                } else if ("mqtt_host".equals(A0q)) {
                    if (r7.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r7.A1P();
                    }
                } else if ("request_time".equals(A0q)) {
                    num = Integer.valueOf(r7.A1D());
                } else if ("rewrite_rules".equals(A0q)) {
                    if (r7.A11() == 16L.A0C) {
                        arrayList4 = new ArrayList();
                        while (r7.A1J() != 16L.A08) {
                            AnonymousClass5AY parseFromJson2 = AnonymousClass5AX.parseFromJson(r7);
                            if (parseFromJson2 != null) {
                                arrayList4.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList4 = null;
                    }
                } else if ("token_hash".equals(A0q)) {
                    if (r7.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r7.A1P();
                    }
                } else if ("ttl".equals(A0q)) {
                    num2 = Integer.valueOf(r7.A1D());
                } else if ("zero_balance_detection_config".equals(A0q)) {
                    bij = C44589ChN.parseFromJson(r7);
                } else if ("zero_cms_fetch_interval_seconds".equals(A0q)) {
                    num3 = Integer.valueOf(r7.A1D());
                }
                r7.A0z();
            }
            if (str2 == null && (r7 instanceof 0c9)) {
                ((0c9) r7).A03.A00("carrier_id", "ZeroToken");
            } else if (str3 == null && (r7 instanceof 0c9)) {
                ((0c9) r7).A03.A00("carrier_name", "ZeroToken");
            } else if (arrayList == null && (r7 instanceof 0c9)) {
                ((0c9) r7).A03.A00("carrier_signal_config", "ZeroToken");
            } else if (str4 == null && (r7 instanceof 0c9)) {
                ((0c9) r7).A03.A00("deadline", "ZeroToken");
            } else if (arrayList2 == null && (r7 instanceof 0c9)) {
                ((0c9) r7).A03.A00("enabled_wallet_defs_keys", "ZeroToken");
            } else if (arrayList3 == null && (r7 instanceof 0c9)) {
                ((0c9) r7).A03.A00("features", "ZeroToken");
            } else if (num == null && (r7 instanceof 0c9)) {
                ((0c9) r7).A03.A00("request_time", "ZeroToken");
            } else if (arrayList4 != null || !(r7 instanceof 0c9)) {
                if (str6 == null && (r7 instanceof 0c9)) {
                    r1 = ((0c9) r7).A03;
                    str = "token_hash";
                } else if (num2 == null && (r7 instanceof 0c9)) {
                    r1 = ((0c9) r7).A03;
                    str = "ttl";
                } else if (num3 != null || !(r7 instanceof 0c9)) {
                    return new C281905Aa(bij, r23, str2, str3, str4, str5, str6, arrayList, arrayList2, arrayList3, arrayList4, num.intValue(), num2.intValue(), num3.intValue());
                } else {
                    r1 = ((0c9) r7).A03;
                    str = "zero_cms_fetch_interval_seconds";
                }
                r1.A00(str, "ZeroToken");
            } else {
                ((0c9) r7).A03.A00("rewrite_rules", "ZeroToken");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
