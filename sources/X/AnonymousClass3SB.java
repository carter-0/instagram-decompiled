package X;

import com.google.common.collect.RegularImmutableMap;
import com.instagram.direct.model.DirectThreadThemeInfo;
import java.util.Map;

/* renamed from: X.3SB  reason: invalid class name */
public abstract class AnonymousClass3SB {
    public OG8 A00;
    public final C61410nE A01 = C61410nE.A00;

    public final synchronized Object A01() {
        Object obj;
        OG8 og8 = this.A00;
        if (og8 != null) {
            obj = og8.A02;
        } else {
            obj = A00();
        }
        return obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if ((java.lang.System.currentTimeMillis() - r1.A00) > com.facebook.proxygen.LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A03(java.lang.Object r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            X.OG8 r1 = r5.A00     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x0027
            boolean r0 = r1.A01     // Catch:{ all -> 0x002c }
            if (r0 == 0) goto L_0x0027
            java.lang.Object r0 = r1.A02     // Catch:{ all -> 0x002c }
            boolean r0 = X.2Ob.A00(r0, r6)     // Catch:{ all -> 0x002c }
            if (r0 != 0) goto L_0x0024
            X.OG8 r1 = r5.A00     // Catch:{ all -> 0x002c }
            boolean r0 = r1.A01     // Catch:{ all -> 0x002c }
            if (r0 == 0) goto L_0x0027
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x002c }
            long r0 = r1.A00     // Catch:{ all -> 0x002c }
            long r3 = r3 - r0
            r1 = 5000(0x1388, double:2.4703E-320)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0027
        L_0x0024:
            r0 = 0
            r5.A00 = r0     // Catch:{ all -> 0x002c }
        L_0x0027:
            r5.A02(r6)     // Catch:{ all -> 0x002c }
            monitor-exit(r5)
            return
        L_0x002c:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3SB.A03(java.lang.Object):void");
    }

    public final synchronized void A04(Object obj, String str, boolean z) {
        if (z) {
            A02(obj);
        }
        OG8 og8 = this.A00;
        if (og8 != null && og8.A03.equals(str)) {
            if (!z) {
                this.A00 = null;
            } else if (!og8.A01) {
                og8.A01 = true;
                og8.A00 = System.currentTimeMillis();
            }
        }
    }

    public final synchronized void A05(String str, Object obj) {
        this.A00 = new OG8(this.A01, obj, str);
    }

    public Object A00() {
        int i;
        boolean z;
        if (this instanceof AnonymousClass3SJ) {
            i = ((AnonymousClass3SJ) this).A00.A04;
        } else if (this instanceof AnonymousClass3SO) {
            Map map = ((AnonymousClass3SO) this).A00.A2C;
            if (map == null) {
                return RegularImmutableMap.A02;
            }
            return map;
        } else if (this instanceof AnonymousClass3ST) {
            return ((AnonymousClass3ST) this).A00.A0w;
        } else {
            if (this instanceof AnonymousClass3SH) {
                z = ((AnonymousClass3SH) this).A00.A2j;
            } else if (this instanceof AnonymousClass3SW) {
                return Boolean.valueOf(Boolean.TRUE.equals(((AnonymousClass3SW) this).A00.A1V));
            } else {
                if (this instanceof AnonymousClass3SQ) {
                    return ((AnonymousClass3SQ) this).A00.A1o;
                }
                if (this instanceof AnonymousClass3SA) {
                    i = ((AnonymousClass3SA) this).A00.A0H;
                } else if (this instanceof AnonymousClass3SG) {
                    z = ((AnonymousClass3SG) this).A00.A2k;
                } else if (this instanceof AnonymousClass3SP) {
                    z = ((AnonymousClass3SP) this).A00.A2m;
                } else if (this instanceof AnonymousClass3SX) {
                    i = ((AnonymousClass3SX) this).A00.A0A;
                } else if (this instanceof AnonymousClass3SC) {
                    z = ((AnonymousClass3SC) this).A00.A2a;
                } else if (this instanceof AnonymousClass3SF) {
                    z = ((AnonymousClass3SF) this).A00.A2g;
                } else if (this instanceof AnonymousClass3SK) {
                    return ((AnonymousClass3SK) this).A00.A1i;
                } else {
                    if (this instanceof AnonymousClass3SD) {
                        z = ((AnonymousClass3SD) this).A00.A2c;
                    } else if (this instanceof AnonymousClass3SE) {
                        z = ((AnonymousClass3SE) this).A00.A2b;
                    } else if (this instanceof AnonymousClass3SV) {
                        i = ((AnonymousClass3SV) this).A00.A05;
                    } else if (this instanceof AnonymousClass3SN) {
                        z = ((AnonymousClass3SN) this).A00.A2H;
                    } else if (this instanceof AnonymousClass3SM) {
                        z = ((AnonymousClass3SM) this).A00.A2l;
                    } else if (this instanceof AnonymousClass3SL) {
                        z = ((AnonymousClass3SL) this).A00.A2R;
                    } else if (this instanceof AnonymousClass3SI) {
                        z = ((AnonymousClass3SI) this).A00.A2S;
                    } else if (this instanceof AnonymousClass3SU) {
                        return ((AnonymousClass3SU) this).A00.A0Q;
                    } else {
                        if (this instanceof AnonymousClass3SS) {
                            return ((AnonymousClass3SS) this).A00.A1P;
                        }
                        i = ((AnonymousClass3SR) this).A00.A0G;
                    }
                }
            }
            return Boolean.valueOf(z);
        }
        return Integer.valueOf(i);
    }

    public void A02(Object obj) {
        if (this instanceof AnonymousClass3SX) {
            AnonymousClass3SX r0 = (AnonymousClass3SX) this;
            Number number = (Number) obj;
            if (number != null) {
                r0.A00.A0A = number.intValue();
            }
        } else if (this instanceof AnonymousClass3SV) {
            AnonymousClass3SV r02 = (AnonymousClass3SV) this;
            Number number2 = (Number) obj;
            if (number2 != null) {
                r02.A00.A05 = number2.intValue();
            }
        } else if (this instanceof AnonymousClass3SO) {
            AnonymousClass3SO r03 = (AnonymousClass3SO) this;
            Map map = (Map) obj;
            if (map != null) {
                r03.A00.A2C = map;
            }
        } else if (this instanceof AnonymousClass3SC) {
            AnonymousClass3SC r04 = (AnonymousClass3SC) this;
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                r04.A00.A2a = bool.booleanValue();
            }
        } else if (this instanceof AnonymousClass3SW) {
            ((AnonymousClass3SW) this).A00.A1V = (Boolean) obj;
        } else if (this instanceof AnonymousClass3ST) {
            ((AnonymousClass3ST) this).A00.A0w = (DirectThreadThemeInfo) obj;
        } else if (this instanceof AnonymousClass3SJ) {
            AnonymousClass3SJ r05 = (AnonymousClass3SJ) this;
            Number number3 = (Number) obj;
            if (number3 != null) {
                r05.A00.A04 = number3.intValue();
            }
        } else if (this instanceof AnonymousClass3SH) {
            AnonymousClass3SH r06 = (AnonymousClass3SH) this;
            Boolean bool2 = (Boolean) obj;
            if (bool2 != null) {
                r06.A00.A2j = bool2.booleanValue();
            }
        } else if (this instanceof AnonymousClass3SG) {
            AnonymousClass3SG r07 = (AnonymousClass3SG) this;
            Boolean bool3 = (Boolean) obj;
            if (bool3 != null) {
                r07.A00.A2k = bool3.booleanValue();
            }
        } else if (this instanceof AnonymousClass3SF) {
            AnonymousClass3SF r08 = (AnonymousClass3SF) this;
            Boolean bool4 = (Boolean) obj;
            if (bool4 != null) {
                r08.A00.A2g = bool4.booleanValue();
            }
        } else if (this instanceof AnonymousClass3SE) {
            AnonymousClass3SE r09 = (AnonymousClass3SE) this;
            Boolean bool5 = (Boolean) obj;
            if (bool5 != null) {
                r09.A00.A2b = bool5.booleanValue();
            }
        } else if (this instanceof AnonymousClass3SD) {
            AnonymousClass3SD r010 = (AnonymousClass3SD) this;
            Boolean bool6 = (Boolean) obj;
            if (bool6 != null) {
                r010.A00.A2c = bool6.booleanValue();
            }
        } else if (this instanceof AnonymousClass3SA) {
            AnonymousClass3SA r011 = (AnonymousClass3SA) this;
            Number number4 = (Number) obj;
            if (number4 != null) {
                r011.A00.A0H = number4.intValue();
            }
        } else if (this instanceof AnonymousClass3SQ) {
            ((AnonymousClass3SQ) this).A00.A1o = (String) obj;
        } else if (this instanceof AnonymousClass3SP) {
            AnonymousClass3SP r012 = (AnonymousClass3SP) this;
            Boolean bool7 = (Boolean) obj;
            if (bool7 != null) {
                r012.A00.A2m = bool7.booleanValue();
            }
        } else if (this instanceof AnonymousClass3SK) {
            ((AnonymousClass3SK) this).A00.A1i = (String) obj;
        } else if (this instanceof AnonymousClass3SS) {
            ((AnonymousClass3SS) this).A00.A1P = (C272964li) obj;
        } else if (this instanceof AnonymousClass3SN) {
            AnonymousClass3SN r013 = (AnonymousClass3SN) this;
            Boolean bool8 = (Boolean) obj;
            if (bool8 != null) {
                r013.A00.A2H = bool8.booleanValue();
            }
        } else if (this instanceof AnonymousClass3SM) {
            AnonymousClass3SM r014 = (AnonymousClass3SM) this;
            Boolean bool9 = (Boolean) obj;
            if (bool9 != null) {
                r014.A00.A2l = bool9.booleanValue();
            }
        } else if (this instanceof AnonymousClass3SL) {
            AnonymousClass3SL r015 = (AnonymousClass3SL) this;
            Boolean bool10 = (Boolean) obj;
            if (bool10 != null) {
                r015.A00.A2R = bool10.booleanValue();
            }
        } else if (this instanceof AnonymousClass3SR) {
            AnonymousClass3SR r016 = (AnonymousClass3SR) this;
            Number number5 = (Number) obj;
            if (number5 != null) {
                r016.A00.A0G = number5.intValue();
            }
        } else if (this instanceof AnonymousClass3SI) {
            AnonymousClass3SI r017 = (AnonymousClass3SI) this;
            Boolean bool11 = (Boolean) obj;
            if (bool11 != null) {
                r017.A00.A2S = bool11.booleanValue();
            }
        } else {
            ((AnonymousClass3SU) this).A00.A0Q = (AnonymousClass9IM) obj;
        }
    }
}
