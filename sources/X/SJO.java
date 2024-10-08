package X;

import com.google.android.gms.auth.api.accounttransfer.zzo;
import com.google.android.gms.auth.api.accounttransfer.zzs;
import com.google.android.gms.auth.api.accounttransfer.zzu;
import com.google.android.gms.auth.api.accounttransfer.zzw;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import com.google.android.gms.common.server.response.SafeParcelResponse;
import com.google.android.gms.common.server.response.zan;
import java.util.Map;
import java.util.Set;

public abstract class SJO {
    public static final Object A02(FastJsonResponse$Field fastJsonResponse$Field, Object obj) {
        C13472Taz taz = fastJsonResponse$Field.A04;
        if (taz == null) {
            return obj;
        }
        StringToIntConverter stringToIntConverter = (StringToIntConverter) taz;
        Object obj2 = stringToIntConverter.A01.get(AnonymousClass7TE.A0M(obj));
        if (obj2 != null || !stringToIntConverter.A02.containsKey("gms_unknown")) {
            return obj2;
        }
        return "gms_unknown";
    }

    public static final void A03(FastJsonResponse$Field fastJsonResponse$Field, Object obj, StringBuilder sb) {
        String obj2;
        int i = fastJsonResponse$Field.A01;
        if (i == 11) {
            Class cls = fastJsonResponse$Field.A05;
            AnonymousClass3Qk.A02(cls);
            obj2 = cls.cast(obj).toString();
        } else if (i == 7) {
            obj2 = "\"";
            sb.append(obj2);
            sb.append(C11150SCf.A00((String) obj));
        } else {
            sb.append(obj);
            return;
        }
        sb.append(obj2);
    }

    public final Object A04(FastJsonResponse$Field fastJsonResponse$Field) {
        if (this instanceof zzw) {
            zzw zzw = (zzw) this;
            int i = fastJsonResponse$Field.A03;
            if (i == 1) {
                return Integer.valueOf(zzw.A05);
            }
            if (i == 2) {
                return zzw.A01;
            }
            if (i == 3) {
                return Integer.valueOf(zzw.A00);
            }
            if (i == 4) {
                return zzw.A02;
            }
            throw DbW.A0b("Unknown SafeParcelable id=", i);
        } else if (this instanceof zzu) {
            zzu zzu = (zzu) this;
            int i2 = fastJsonResponse$Field.A03;
            if (i2 == 1) {
                return Integer.valueOf(zzu.A04);
            }
            if (i2 == 2) {
                return zzu.A00;
            }
            if (i2 == 3) {
                return zzu.A01;
            }
            if (i2 == 4) {
                return zzu.A02;
            }
            throw DbW.A0b("Unknown SafeParcelable id=", i2);
        } else if (this instanceof zzs) {
            zzs zzs = (zzs) this;
            int i3 = fastJsonResponse$Field.A03;
            switch (i3) {
                case 1:
                    return Integer.valueOf(zzs.A05);
                case 2:
                    return zzs.A00;
                case 3:
                    return zzs.A01;
                case 4:
                    return zzs.A02;
                case 5:
                    return zzs.A03;
                case 6:
                    return zzs.A04;
                default:
                    throw DbW.A0b("Unknown SafeParcelable id=", i3);
            }
        } else if (this instanceof zzo) {
            zzo zzo = (zzo) this;
            int i4 = fastJsonResponse$Field.A03;
            if (i4 == 1) {
                return Integer.valueOf(zzo.A03);
            }
            if (i4 == 2) {
                return zzo.A01;
            }
            if (i4 == 4) {
                return zzo.A00;
            }
            throw DbW.A0b("Unknown SafeParcelable id=", i4);
        } else {
            String str = fastJsonResponse$Field.A06;
            boolean z = ((FastSafeParcelableJsonResponse) this) instanceof SafeParcelResponse;
            if (fastJsonResponse$Field.A05 != null) {
                if (z) {
                    throw AnonymousClass7TE.A1B("Converting to JSON does not require this method.");
                }
                try {
                    return Pxj.A0l(this, getClass(), 002.A0T("get", str.substring(1), Character.toUpperCase(str.charAt(0))));
                } catch (Exception e) {
                    throw C41845B3m.A0j(e);
                }
            } else if (!z) {
                return null;
            } else {
                throw AnonymousClass7TE.A1B("Converting to JSON does not require this method.");
            }
        }
    }

    public final Map A05() {
        if (this instanceof SafeParcelResponse) {
            SafeParcelResponse safeParcelResponse = (SafeParcelResponse) this;
            zan zan = safeParcelResponse.A03;
            if (zan == null) {
                return null;
            }
            String str = safeParcelResponse.A04;
            AnonymousClass3Qk.A02(str);
            return (Map) zan.A02.get(str);
        } else if (this instanceof zzw) {
            return zzw.A07;
        } else {
            if (this instanceof zzu) {
                return zzu.A06;
            }
            if (this instanceof zzs) {
                return zzs.A06;
            }
            return zzo.A05;
        }
    }

    public final boolean A06(FastJsonResponse$Field fastJsonResponse$Field) {
        Integer valueOf;
        Set set;
        if (this instanceof zzw) {
            valueOf = Integer.valueOf(fastJsonResponse$Field.A03);
            set = ((zzw) this).A06;
        } else if (this instanceof zzu) {
            valueOf = Integer.valueOf(fastJsonResponse$Field.A03);
            set = ((zzu) this).A05;
        } else if (this instanceof zzs) {
            return true;
        } else {
            if (this instanceof zzo) {
                valueOf = Integer.valueOf(fastJsonResponse$Field.A03);
                set = ((zzo) this).A04;
            } else if (fastJsonResponse$Field.A02 == 11) {
                if (fastJsonResponse$Field.A09) {
                    throw AnonymousClass7TE.A1B("Concrete type arrays not supported");
                }
                throw AnonymousClass7TE.A1B("Concrete types not supported");
            } else if (!(((FastSafeParcelableJsonResponse) this) instanceof SafeParcelResponse)) {
                return false;
            } else {
                throw AnonymousClass7TE.A1B("Converting to JSON does not require this method.");
            }
        }
        return set.contains(valueOf);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0095, code lost:
        r0 = android.util.Base64.encodeToString(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0099, code lost:
        r4.append(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009d, code lost:
        r0 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r9 = this;
            java.util.Map r6 = r9.A05()
            r0 = 100
            java.lang.StringBuilder r4 = X.Pxe.A14(r0)
            java.util.Iterator r8 = X.DbV.A16(r6)
        L_0x000e:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00a3
            java.lang.String r2 = X.AnonymousClass7TE.A18(r8)
            java.lang.Object r7 = r6.get(r2)
            com.google.android.gms.common.server.response.FastJsonResponse$Field r7 = (com.google.android.gms.common.server.response.FastJsonResponse$Field) r7
            boolean r0 = r9.A06(r7)
            if (r0 == 0) goto L_0x000e
            java.lang.Object r0 = r9.A04(r7)
            java.lang.Object r5 = A02(r7, r0)
            int r0 = r4.length()
            java.lang.String r3 = ","
            if (r0 != 0) goto L_0x009f
            java.lang.String r0 = "{"
            r4.append(r0)
        L_0x003a:
            java.lang.String r1 = "\""
            r4.append(r1)
            r4.append(r2)
            java.lang.String r0 = "\":"
            r4.append(r0)
            if (r5 != 0) goto L_0x0050
            java.lang.String r1 = "null"
        L_0x004c:
            r4.append(r1)
            goto L_0x000e
        L_0x0050:
            int r0 = r7.A02
            switch(r0) {
                case 8: goto L_0x008d;
                case 9: goto L_0x0083;
                case 10: goto L_0x007d;
                default: goto L_0x0055;
            }
        L_0x0055:
            boolean r0 = r7.A08
            if (r0 == 0) goto L_0x0079
            java.util.AbstractList r5 = (java.util.AbstractList) r5
            X.Pxh.A1P(r4)
            int r2 = r5.size()
            r1 = 0
        L_0x0063:
            if (r1 >= r2) goto L_0x0076
            if (r1 <= 0) goto L_0x006a
            r4.append(r3)
        L_0x006a:
            java.lang.Object r0 = r5.get(r1)
            if (r0 == 0) goto L_0x0073
            A03(r7, r0, r4)
        L_0x0073:
            int r1 = r1 + 1
            goto L_0x0063
        L_0x0076:
            java.lang.String r1 = "]"
            goto L_0x004c
        L_0x0079:
            A03(r7, r5, r4)
            goto L_0x000e
        L_0x007d:
            java.util.HashMap r5 = (java.util.HashMap) r5
            X.C9699RfI.A00(r4, r5)
            goto L_0x000e
        L_0x0083:
            r4.append(r1)
            byte[] r5 = (byte[]) r5
            if (r5 == 0) goto L_0x009d
            r0 = 10
            goto L_0x0095
        L_0x008d:
            r4.append(r1)
            byte[] r5 = (byte[]) r5
            if (r5 == 0) goto L_0x009d
            r0 = 0
        L_0x0095:
            java.lang.String r0 = android.util.Base64.encodeToString(r5, r0)
        L_0x0099:
            r4.append(r0)
            goto L_0x004c
        L_0x009d:
            r0 = 0
            goto L_0x0099
        L_0x009f:
            r4.append(r3)
            goto L_0x003a
        L_0x00a3:
            int r0 = r4.length()
            if (r0 <= 0) goto L_0x00b1
            java.lang.String r0 = "}"
        L_0x00ac:
            java.lang.String r0 = X.AnonymousClass7TF.A0l(r0, r4)
            return r0
        L_0x00b1:
            java.lang.String r0 = "{}"
            goto L_0x00ac
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SJO.toString():java.lang.String");
    }
}
