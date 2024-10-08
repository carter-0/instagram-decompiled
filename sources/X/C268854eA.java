package X;

import com.fasterxml.jackson.annotation.JacksonAnnotationsInside;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import com.fasterxml.jackson.annotation.JsonKey;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonMerge;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.Closeable;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: X.4eA  reason: invalid class name and case insensitive filesystem */
public abstract class C268854eA implements Serializable {
    public final C11243SHd A0I(C269064eW r8, C11243SHd sHd) {
        C11243SHd sHd2 = sHd;
        if (!(this instanceof C268844e9)) {
            return sHd;
        }
        JsonIdentityReference jsonIdentityReference = (JsonIdentityReference) r8.A06(JsonIdentityReference.class);
        if (jsonIdentityReference == null) {
            return sHd2;
        }
        if (sHd == null) {
            sHd2 = C11243SHd.A05;
        }
        boolean alwaysAsId = jsonIdentityReference.alwaysAsId();
        if (sHd2.A04 != alwaysAsId) {
            return new C11243SHd(sHd2.A00, sHd2.A03, sHd2.A01, sHd2.A02, alwaysAsId);
        }
        return sHd2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0057, code lost:
        if (r2 == null) goto L_0x0024;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C12834T9g A02(X.C8208QkH r5) {
        /*
            r4 = this;
            boolean r0 = r4 instanceof X.C268844e9
            if (r0 == 0) goto L_0x006a
            java.lang.Class<com.fasterxml.jackson.annotation.JacksonInject> r0 = com.fasterxml.jackson.annotation.JacksonInject.class
            java.lang.annotation.Annotation r0 = r5.A06(r0)
            com.fasterxml.jackson.annotation.JacksonInject r0 = (com.fasterxml.jackson.annotation.JacksonInject) r0
            if (r0 == 0) goto L_0x006a
            java.lang.String r2 = r0.value()
            X.RDA r1 = r0.useInput()
            X.RDA r0 = X.RDA.DEFAULT
            if (r1 != r0) goto L_0x0060
            r1 = 0
        L_0x001b:
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0057
            r2 = 0
        L_0x0024:
            if (r1 != 0) goto L_0x005a
            X.T9g r3 = X.C12834T9g.A02
        L_0x0028:
            java.lang.Object r2 = r3.A01
            if (r2 != 0) goto L_0x0051
            boolean r0 = r5 instanceof X.C8206QkF
            if (r0 == 0) goto L_0x0052
            r1 = r5
            X.QkG r1 = (X.C8207QkG) r1
            int r0 = r1.A0F()
            if (r0 == 0) goto L_0x0052
            r0 = 0
            java.lang.Class r0 = r1.A0I(r0)
        L_0x003e:
            java.lang.String r1 = r0.getName()
            if (r1 == 0) goto L_0x0051
            boolean r0 = r1.equals(r2)
            if (r0 != 0) goto L_0x0051
            java.lang.Boolean r0 = r3.A00
            X.T9g r3 = new X.T9g
            r3.<init>(r0, r1)
        L_0x0051:
            return r3
        L_0x0052:
            java.lang.Class r0 = r5.A04()
            goto L_0x003e
        L_0x0057:
            if (r2 != 0) goto L_0x005a
            goto L_0x0024
        L_0x005a:
            X.T9g r3 = new X.T9g
            r3.<init>(r1, r2)
            goto L_0x0028
        L_0x0060:
            X.RDA r0 = X.RDA.TRUE
            if (r1 != r0) goto L_0x0067
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            goto L_0x001b
        L_0x0067:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            goto L_0x001b
        L_0x006a:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C268854eA.A02(X.QkH):X.T9g");
    }

    public final REE A03(C269064eW r2) {
        JsonCreator jsonCreator;
        if (!(this instanceof C268844e9) || (jsonCreator = (JsonCreator) r2.A06(JsonCreator.class)) == null) {
            return null;
        }
        return jsonCreator.mode();
    }

    public final C269314ev A04(C269064eW r17) {
        Boolean bool;
        Locale locale;
        if (!(this instanceof C268844e9)) {
            return C269314ev.A07;
        }
        JsonFormat jsonFormat = (JsonFormat) r17.A06(JsonFormat.class);
        if (jsonFormat == null) {
            return null;
        }
        C269314ev r0 = C269314ev.A07;
        String pattern = jsonFormat.pattern();
        C269324ew shape = jsonFormat.shape();
        String locale2 = jsonFormat.locale();
        String timezone = jsonFormat.timezone();
        RDC[] with = jsonFormat.with();
        RDC[] without = jsonFormat.without();
        int i = 0;
        for (RDC ordinal : with) {
            i |= 1 << ordinal.ordinal();
        }
        int i2 = 0;
        for (RDC ordinal2 : without) {
            i2 |= 1 << ordinal2.ordinal();
        }
        C269334ex r9 = new C269334ex(i, i2);
        RDA lenient = jsonFormat.lenient();
        if (lenient == RDA.DEFAULT) {
            bool = null;
        } else if (lenient == RDA.TRUE) {
            bool = Boolean.TRUE;
        } else {
            bool = Boolean.FALSE;
        }
        if (locale2 == null || locale2.length() == 0 || "##default".equals(locale2)) {
            locale = null;
        } else {
            locale = new Locale(locale2);
        }
        if (timezone == null || timezone.length() == 0 || "##default".equals(timezone)) {
            timezone = null;
        }
        return new C269314ev(r9, shape, bool, pattern, timezone, locale, (TimeZone) null);
    }

    public final T9o A05(C269064eW r7) {
        JsonIgnoreProperties jsonIgnoreProperties;
        HashSet hashSet;
        int length;
        if (!(this instanceof C268844e9) || (jsonIgnoreProperties = (JsonIgnoreProperties) r7.A06(JsonIgnoreProperties.class)) == null) {
            return T9o.A05;
        }
        T9o t9o = T9o.A05;
        String[] value = jsonIgnoreProperties.value();
        if (value == null || (length = value.length) == 0) {
            hashSet = Collections.emptySet();
        } else {
            HashSet hashSet2 = new HashSet(length);
            int i = 0;
            do {
                hashSet2.add(value[i]);
                i++;
            } while (i < length);
            hashSet = hashSet2;
        }
        return T9o.A00(hashSet, jsonIgnoreProperties.ignoreUnknown(), jsonIgnoreProperties.allowGetters(), jsonIgnoreProperties.allowSetters());
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C269194ej A06(X.C269064eW r8) {
        /*
            r7 = this;
            boolean r0 = r7 instanceof X.C268844e9
            if (r0 == 0) goto L_0x0070
            java.lang.Class<com.fasterxml.jackson.annotation.JsonInclude> r0 = com.fasterxml.jackson.annotation.JsonInclude.class
            java.lang.annotation.Annotation r6 = r8.A06(r0)
            com.fasterxml.jackson.annotation.JsonInclude r6 = (com.fasterxml.jackson.annotation.JsonInclude) r6
            if (r6 == 0) goto L_0x001c
            X.4ek r5 = r6.value()
            X.4ek r4 = r6.content()
            X.4ek r0 = X.C269204ek.USE_DEFAULTS
            if (r5 != r0) goto L_0x0059
            if (r4 != r0) goto L_0x0059
        L_0x001c:
            X.4ej r6 = X.C269194ej.A04
        L_0x001e:
            X.4ek r1 = r6.A01
            X.4ek r0 = X.C269204ek.USE_DEFAULTS
            if (r1 != r0) goto L_0x004f
            java.lang.Class<com.fasterxml.jackson.databind.annotation.JsonSerialize> r0 = com.fasterxml.jackson.databind.annotation.JsonSerialize.class
            java.lang.annotation.Annotation r0 = r8.A06(r0)
            com.fasterxml.jackson.databind.annotation.JsonSerialize r0 = (com.fasterxml.jackson.databind.annotation.JsonSerialize) r0
            if (r0 == 0) goto L_0x004f
            X.RDM r0 = r0.include()
            int r1 = r0.ordinal()
            r0 = 0
            if (r1 == r0) goto L_0x0056
            r0 = 1
            if (r1 == r0) goto L_0x0053
            r0 = 2
            if (r1 == r0) goto L_0x0050
            r0 = 3
            if (r1 != r0) goto L_0x004f
            X.4ek r3 = X.C269204ek.NON_EMPTY
        L_0x0044:
            X.4ek r2 = r6.A00
            java.lang.Class r1 = r6.A03
            java.lang.Class r0 = r6.A02
            X.4ej r6 = new X.4ej
            r6.<init>(r3, r2, r1, r0)
        L_0x004f:
            return r6
        L_0x0050:
            X.4ek r3 = X.C269204ek.NON_DEFAULT
            goto L_0x0044
        L_0x0053:
            X.4ek r3 = X.C269204ek.NON_NULL
            goto L_0x0044
        L_0x0056:
            X.4ek r3 = X.C269204ek.ALWAYS
            goto L_0x0044
        L_0x0059:
            java.lang.Class r3 = r6.valueFilter()
            java.lang.Class<java.lang.Void> r2 = java.lang.Void.class
            r1 = 0
            if (r3 != r2) goto L_0x0063
            r3 = r1
        L_0x0063:
            java.lang.Class r0 = r6.contentFilter()
            if (r0 == r2) goto L_0x006a
            r1 = r0
        L_0x006a:
            X.4ej r6 = new X.4ej
            r6.<init>(r5, r4, r3, r1)
            goto L_0x001e
        L_0x0070:
            X.4ej r6 = X.C269194ej.A04
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C268854eA.A06(X.4eW):X.4ej");
    }

    public final C12833T9f A07(C269064eW r6) {
        JsonIncludeProperties jsonIncludeProperties;
        HashSet hashSet;
        int length;
        if (!(this instanceof C268844e9) || (jsonIncludeProperties = (JsonIncludeProperties) r6.A06(JsonIncludeProperties.class)) == null) {
            return C12833T9f.A01;
        }
        String[] value = jsonIncludeProperties.value();
        if (value == null || (length = value.length) == 0) {
            hashSet = Collections.emptySet();
        } else {
            HashSet hashSet2 = new HashSet(length);
            int i = 0;
            do {
                hashSet2.add(value[i]);
                i++;
            } while (i < length);
            hashSet = hashSet2;
        }
        return new C12833T9f(hashSet);
    }

    public final C48072EUq A08(C269064eW r2) {
        JsonProperty jsonProperty;
        if (!(this instanceof C268844e9) || (jsonProperty = (JsonProperty) r2.A06(JsonProperty.class)) == null) {
            return null;
        }
        return jsonProperty.access();
    }

    public final C269214el A09(C269064eW r4) {
        JsonSetter jsonSetter;
        if ((this instanceof C268844e9) && (jsonSetter = (JsonSetter) r4.A06(JsonSetter.class)) != null) {
            C269224em nulls = jsonSetter.nulls();
            C269224em contentNulls = jsonSetter.contentNulls();
            if (nulls == null) {
                nulls = C269224em.DEFAULT;
            }
            if (contentNulls == null) {
                contentNulls = C269224em.DEFAULT;
            }
            C269224em r0 = C269224em.DEFAULT;
            if (!(nulls == r0 && contentNulls == r0)) {
                return new C269214el(nulls, contentNulls);
            }
        }
        return C269214el.A02;
    }

    public final C10433RsA A0A(C8208QkH qkH) {
        String value;
        Integer num;
        if (!(this instanceof C268844e9)) {
            return null;
        }
        JsonManagedReference jsonManagedReference = (JsonManagedReference) qkH.A06(JsonManagedReference.class);
        if (jsonManagedReference != null) {
            value = jsonManagedReference.value();
            num = AnonymousClass05K.A00;
        } else {
            JsonBackReference jsonBackReference = (JsonBackReference) qkH.A06(JsonBackReference.class);
            if (jsonBackReference == null) {
                return null;
            }
            value = jsonBackReference.value();
            num = AnonymousClass05K.A01;
        }
        return new C10433RsA(num, value);
    }

    public final C268894eF A0B(C268894eF r8, C269144ee r9, C269064eW r10) {
        Class as;
        Object[] objArr;
        String str;
        Class contentAs;
        Class keyAs;
        if (this instanceof C268844e9) {
            AnonymousClass4eE r3 = r9.A01.A07;
            JsonDeserialize jsonDeserialize = (JsonDeserialize) r10.A06(JsonDeserialize.class);
            if (jsonDeserialize == null) {
                as = null;
            } else {
                as = jsonDeserialize.as();
                if (as == null || C269574fL.A0I(as)) {
                    as = null;
                }
            }
            if (!(as == null || r8.A00 == as || C268844e9.A00(r8, as))) {
                try {
                    r8 = r3.A05(r8, as, false);
                } catch (IllegalArgumentException e) {
                    e = e;
                    objArr = new Object[]{r8, as.getName(), r10.A05(), e.getMessage()};
                    str = "Failed to narrow type %s with annotation (value %s), from '%s': %s";
                    throw new AnonymousClass4iD((Closeable) null, String.format(str, objArr), e);
                }
            }
            if (r8.A0O()) {
                C268894eF A04 = r8.A04();
                if (jsonDeserialize != null && (keyAs = jsonDeserialize.keyAs()) != null && !C269574fL.A0I(keyAs) && !C268844e9.A00(A04, keyAs)) {
                    try {
                        r8 = ((Qly) r8).A0S(r3.A05(A04, keyAs, false));
                    } catch (IllegalArgumentException e2) {
                        e = e2;
                        objArr = new Object[]{r8, keyAs.getName(), r10.A05(), e.getMessage()};
                        str = "Failed to narrow key type of %s with concrete-type annotation (value %s), from '%s': %s";
                    }
                }
            }
            C268894eF A03 = r8.A03();
            if (!(A03 == null || jsonDeserialize == null || (contentAs = jsonDeserialize.contentAs()) == null || C269574fL.A0I(contentAs) || C268844e9.A00(A03, contentAs))) {
                try {
                    return r8.A08(r3.A05(A03, contentAs, false));
                } catch (IllegalArgumentException e3) {
                    e = e3;
                    objArr = new Object[]{r8, contentAs.getName(), r10.A05(), e.getMessage()};
                    str = "Failed to narrow value type of %s with concrete-type annotation (value %s), from '%s': %s";
                    throw new AnonymousClass4iD((Closeable) null, String.format(str, objArr), e);
                }
            }
        }
        return r8;
    }

    public final C268894eF A0C(C268894eF r9, C269144ee r10, C269064eW r11) {
        Class as;
        Object[] objArr;
        String str;
        Class contentAs;
        C268894eF A06;
        Class keyAs;
        C268894eF A062;
        if (!(this instanceof C268844e9)) {
            return r9;
        }
        AnonymousClass4eE r4 = r10.A01.A07;
        JsonSerialize jsonSerialize = (JsonSerialize) r11.A06(JsonSerialize.class);
        if (jsonSerialize == null) {
            as = null;
        } else {
            as = jsonSerialize.as();
            if (as == null || C269574fL.A0I(as)) {
                as = null;
            }
        }
        if (as != null) {
            Class cls = r9.A00;
            if (cls == as) {
                r9 = r9.A06();
            } else {
                try {
                    if (as.isAssignableFrom(cls)) {
                        r9 = AnonymousClass4eE.A00(r9, as);
                    } else if (cls.isAssignableFrom(as)) {
                        r9 = r4.A05(r9, as, false);
                    } else if (C268844e9.A01(cls, as)) {
                        r9 = r9.A06();
                    } else {
                        throw new AnonymousClass4iD((Closeable) null, String.format("Cannot refine serialization type %s into %s; types not related", new Object[]{r9, as.getName()}));
                    }
                } catch (IllegalArgumentException e) {
                    e = e;
                    objArr = new Object[]{r9, as.getName(), r11.A05(), e.getMessage()};
                    str = "Failed to widen type %s with annotation (value %s), from '%s': %s";
                    throw new AnonymousClass4iD((Closeable) null, String.format(str, objArr), e);
                }
            }
        }
        if (r9.A0O()) {
            C268894eF A04 = r9.A04();
            if (!(jsonSerialize == null || (keyAs = jsonSerialize.keyAs()) == null || C269574fL.A0I(keyAs))) {
                Class cls2 = A04.A00;
                if (cls2 == keyAs) {
                    A062 = A04.A06();
                } else {
                    try {
                        if (keyAs.isAssignableFrom(cls2)) {
                            A062 = AnonymousClass4eE.A00(A04, keyAs);
                        } else if (cls2.isAssignableFrom(keyAs)) {
                            A062 = r4.A05(A04, keyAs, false);
                        } else if (C268844e9.A01(cls2, keyAs)) {
                            A062 = A04.A06();
                        } else {
                            throw new AnonymousClass4iD((Closeable) null, String.format("Cannot refine serialization key type %s into %s; types not related", new Object[]{A04, keyAs.getName()}));
                        }
                    } catch (IllegalArgumentException e2) {
                        e = e2;
                        objArr = new Object[]{r9, keyAs.getName(), r11.A05(), e.getMessage()};
                        str = "Failed to widen key type of %s with concrete-type annotation (value %s), from '%s': %s";
                        throw new AnonymousClass4iD((Closeable) null, String.format(str, objArr), e);
                    }
                }
                r9 = ((Qly) r9).A0S(A062);
            }
        }
        C268894eF A03 = r9.A03();
        if (A03 == null || jsonSerialize == null || (contentAs = jsonSerialize.contentAs()) == null || C269574fL.A0I(contentAs)) {
            return r9;
        }
        Class cls3 = A03.A00;
        if (cls3 == contentAs) {
            A06 = A03.A06();
        } else {
            try {
                if (contentAs.isAssignableFrom(cls3)) {
                    A06 = AnonymousClass4eE.A00(A03, contentAs);
                } else if (cls3.isAssignableFrom(contentAs)) {
                    A06 = r4.A05(A03, contentAs, false);
                } else if (C268844e9.A01(cls3, contentAs)) {
                    A06 = A03.A06();
                } else {
                    throw new AnonymousClass4iD((Closeable) null, String.format("Cannot refine serialization content type %s into %s; types not related", new Object[]{A03, contentAs.getName()}));
                }
            } catch (IllegalArgumentException e3) {
                e = e3;
                objArr = new Object[]{r9, contentAs.getName(), r11.A05(), e.getMessage()};
                str = "Internal error: failed to refine value type of %s with concrete-type annotation (value %s), from '%s': %s";
                throw new AnonymousClass4iD((Closeable) null, String.format(str, objArr), e);
            }
        }
        return r9.A08(A06);
    }

    public final C269434f7 A0D(C269064eW r5) {
        boolean z;
        if (!(this instanceof C268844e9)) {
            return null;
        }
        JsonSetter jsonSetter = (JsonSetter) r5.A06(JsonSetter.class);
        if (jsonSetter != null) {
            String value = jsonSetter.value();
            if (!value.isEmpty()) {
                return C269434f7.A00(value);
            }
            z = true;
        } else {
            z = false;
        }
        JsonProperty jsonProperty = (JsonProperty) r5.A06(JsonProperty.class);
        String str = null;
        if (jsonProperty != null) {
            String namespace = jsonProperty.namespace();
            if (namespace == null || !namespace.isEmpty()) {
                str = namespace;
            }
            return C269434f7.A01(jsonProperty.value(), str);
        } else if (z || r5.A08(C268844e9.A01)) {
            return C269434f7.A04;
        } else {
            return null;
        }
    }

    public final C269434f7 A0E(C269064eW r5) {
        boolean z;
        if (!(this instanceof C268844e9)) {
            return null;
        }
        JsonGetter jsonGetter = (JsonGetter) r5.A06(JsonGetter.class);
        if (jsonGetter != null) {
            String value = jsonGetter.value();
            if (!value.isEmpty()) {
                return C269434f7.A00(value);
            }
            z = true;
        } else {
            z = false;
        }
        JsonProperty jsonProperty = (JsonProperty) r5.A06(JsonProperty.class);
        String str = null;
        if (jsonProperty != null) {
            String namespace = jsonProperty.namespace();
            if (namespace == null || !namespace.isEmpty()) {
                str = namespace;
            }
            return C269434f7.A01(jsonProperty.value(), str);
        } else if (z || r5.A08(C268844e9.A02)) {
            return C269434f7.A04;
        } else {
            return null;
        }
    }

    public final RDB A0F(C269064eW r2) {
        JsonSerialize jsonSerialize;
        if (!(this instanceof C268844e9) || (jsonSerialize = (JsonSerialize) r2.A06(JsonSerialize.class)) == null) {
            return null;
        }
        return jsonSerialize.typing();
    }

    public final C8206QkF A0G(C8206QkF qkF, C8206QkF qkF2) {
        if (!(this instanceof C268844e9)) {
            return null;
        }
        Class<String> A0I = qkF.A0I(0);
        Class<String> A0I2 = qkF2.A0I(0);
        if (A0I.isPrimitive()) {
            if (!A0I2.isPrimitive()) {
                return qkF;
            }
        } else if (A0I2.isPrimitive()) {
            return qkF2;
        } else {
            Class<String> cls = String.class;
            if (A0I == cls) {
                if (A0I2 != cls) {
                    return qkF;
                }
            } else if (A0I2 == cls) {
                return qkF2;
            }
        }
        return null;
    }

    public final C11243SHd A0H(C269064eW r8) {
        JsonIdentityInfo jsonIdentityInfo;
        Class<C8135QhU> generator;
        if (!(this instanceof C268844e9) || (jsonIdentityInfo = (JsonIdentityInfo) r8.A06(JsonIdentityInfo.class)) == null || (generator = jsonIdentityInfo.generator()) == C8135QhU.class) {
            return null;
        }
        C269434f7 A00 = C269434f7.A00(jsonIdentityInfo.property());
        C11243SHd sHd = C11243SHd.A05;
        return new C11243SHd(A00, jsonIdentityInfo.scope(), generator, jsonIdentityInfo.resolver(), false);
    }

    public final C13733Tg5 A0J(C268894eF r3, C269144ee r4, C8208QkH qkH) {
        if (!(this instanceof C268844e9)) {
            return null;
        }
        C268844e9 r1 = (C268844e9) this;
        if (r3.A03() != null) {
            return r1.A0s(r4, qkH);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Must call method with a container or reference type (got ");
        sb.append(r3);
        sb.append(")");
        throw new IllegalArgumentException(sb.toString());
    }

    public final C13733Tg5 A0K(C269144ee r2, C269054eV r3) {
        if (this instanceof C268844e9) {
            return ((C268844e9) this).A0s(r2, r3);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        if (r4.isEmpty() != false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.SGT A0L(X.C8208QkH r6) {
        /*
            r5 = this;
            boolean r0 = r5 instanceof X.C268844e9
            if (r0 == 0) goto L_0x004e
            java.lang.Class<com.fasterxml.jackson.annotation.JsonUnwrapped> r0 = com.fasterxml.jackson.annotation.JsonUnwrapped.class
            java.lang.annotation.Annotation r1 = r6.A06(r0)
            com.fasterxml.jackson.annotation.JsonUnwrapped r1 = (com.fasterxml.jackson.annotation.JsonUnwrapped) r1
            if (r1 == 0) goto L_0x004e
            boolean r0 = r1.enabled()
            if (r0 == 0) goto L_0x004e
            java.lang.String r4 = r1.prefix()
            java.lang.String r3 = r1.suffix()
            X.SGT r0 = X.SGT.A00
            r2 = 1
            if (r4 == 0) goto L_0x0028
            boolean r0 = r4.isEmpty()
            r1 = 1
            if (r0 == 0) goto L_0x0029
        L_0x0028:
            r1 = 0
        L_0x0029:
            if (r3 == 0) goto L_0x003b
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x003b
        L_0x0031:
            if (r1 == 0) goto L_0x0043
            if (r2 == 0) goto L_0x003d
            X.Qm1 r0 = new X.Qm1
            r0.<init>(r4, r3)
            return r0
        L_0x003b:
            r2 = 0
            goto L_0x0031
        L_0x003d:
            X.Qlz r0 = new X.Qlz
            r0.<init>(r4)
            return r0
        L_0x0043:
            if (r2 == 0) goto L_0x004b
            X.Qm0 r0 = new X.Qm0
            r0.<init>(r3)
            return r0
        L_0x004b:
            X.SGT r0 = X.SGT.A00
            return r0
        L_0x004e:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C268854eA.A0L(X.QkH):X.SGT");
    }

    public final Boolean A0M(C269064eW r3) {
        JsonMerge jsonMerge;
        RDA value;
        if (!(this instanceof C268844e9) || (jsonMerge = (JsonMerge) r3.A06(JsonMerge.class)) == null || (value = jsonMerge.value()) == RDA.DEFAULT) {
            return null;
        }
        if (value == RDA.TRUE) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public final Boolean A0N(C269064eW r2) {
        JsonPropertyOrder jsonPropertyOrder;
        if (!(this instanceof C268844e9) || (jsonPropertyOrder = (JsonPropertyOrder) r2.A06(JsonPropertyOrder.class)) == null || !jsonPropertyOrder.alphabetic()) {
            return null;
        }
        return Boolean.TRUE;
    }

    public final Boolean A0O(C269064eW r2) {
        JsonAnyGetter jsonAnyGetter;
        if (!(this instanceof C268844e9) || (jsonAnyGetter = (JsonAnyGetter) r2.A06(JsonAnyGetter.class)) == null) {
            return null;
        }
        return Boolean.valueOf(jsonAnyGetter.enabled());
    }

    public final Boolean A0P(C269064eW r2) {
        JsonAnySetter jsonAnySetter;
        if (!(this instanceof C268844e9) || (jsonAnySetter = (JsonAnySetter) r2.A06(JsonAnySetter.class)) == null) {
            return null;
        }
        return Boolean.valueOf(jsonAnySetter.enabled());
    }

    public final Boolean A0Q(C269064eW r2) {
        JsonKey jsonKey;
        if (!(this instanceof C268844e9) || (jsonKey = (JsonKey) r2.A06(JsonKey.class)) == null) {
            return null;
        }
        return Boolean.valueOf(jsonKey.value());
    }

    public final Boolean A0R(C269064eW r2) {
        JsonValue jsonValue;
        if (!(this instanceof C268844e9) || (jsonValue = (JsonValue) r2.A06(JsonValue.class)) == null) {
            return null;
        }
        return Boolean.valueOf(jsonValue.value());
    }

    public final Boolean A0S(C8208QkH qkH) {
        JsonProperty jsonProperty;
        if (!(this instanceof C268844e9) || (jsonProperty = (JsonProperty) qkH.A06(JsonProperty.class)) == null) {
            return null;
        }
        return Boolean.valueOf(jsonProperty.required());
    }

    public final Boolean A0T(C8208QkH qkH) {
        if (this instanceof C268844e9) {
            return Boolean.valueOf(qkH.A0E());
        }
        return null;
    }

    public final Enum A0U(Class cls) {
        if (this instanceof C268844e9) {
            Class cls2 = JsonEnumDefaultValue.class;
            C269584fM[] r0 = C269574fL.A01;
            for (Field field : cls.getDeclaredFields()) {
                if (field.isEnumConstant() && field.getAnnotation(cls2) != null) {
                    String name = field.getName();
                    for (Enum enumR : (Enum[]) cls.getEnumConstants()) {
                        if (name.equals(enumR.name())) {
                            return enumR;
                        }
                    }
                    continue;
                }
            }
        }
        return null;
    }

    public final Integer A0V(C269064eW r3) {
        JsonProperty jsonProperty;
        int index;
        if (!(this instanceof C268844e9) || (jsonProperty = (JsonProperty) r3.A06(JsonProperty.class)) == null || (index = jsonProperty.index()) == -1) {
            return null;
        }
        return Integer.valueOf(index);
    }

    public final Object A0W(C269064eW r3) {
        JsonDeserialize jsonDeserialize;
        Class<JsonDeserializer.None> contentUsing;
        if (!(this instanceof C268844e9) || (jsonDeserialize = (JsonDeserialize) r3.A06(JsonDeserialize.class)) == null || (contentUsing = jsonDeserialize.contentUsing()) == JsonDeserializer.None.class) {
            return null;
        }
        return contentUsing;
    }

    public final Object A0X(C269064eW r3) {
        JsonSerialize jsonSerialize;
        Class<JsonSerializer.None> contentUsing;
        if (!(this instanceof C268844e9) || (jsonSerialize = (JsonSerialize) r3.A06(JsonSerialize.class)) == null || (contentUsing = jsonSerialize.contentUsing()) == JsonSerializer.None.class) {
            return null;
        }
        return contentUsing;
    }

    public final Object A0Y(C269064eW r4) {
        JsonDeserialize jsonDeserialize;
        if ((this instanceof C268844e9) && (jsonDeserialize = (JsonDeserialize) r4.A06(JsonDeserialize.class)) != null) {
            Class<C12448Suf> converter = jsonDeserialize.converter();
            Class<C12448Suf> cls = C12448Suf.class;
            if (converter == null || C269574fL.A0I(converter) || converter == cls) {
                return null;
            }
            return converter;
        }
        return null;
    }

    public final Object A0Z(C269064eW r3) {
        JsonDeserialize jsonDeserialize;
        Class<JsonDeserializer.None> using;
        if (!(this instanceof C268844e9) || (jsonDeserialize = (JsonDeserialize) r3.A06(JsonDeserialize.class)) == null || (using = jsonDeserialize.using()) == JsonDeserializer.None.class) {
            return null;
        }
        return using;
    }

    public final Object A0a(C269064eW r3) {
        JsonFilter jsonFilter;
        if (!(this instanceof C268844e9) || (jsonFilter = (JsonFilter) r3.A06(JsonFilter.class)) == null) {
            return null;
        }
        String value = jsonFilter.value();
        if (!value.isEmpty()) {
            return value;
        }
        return null;
    }

    public final Object A0b(C269064eW r3) {
        JsonDeserialize jsonDeserialize;
        Class<C8162QiN> keyUsing;
        if (!(this instanceof C268844e9) || (jsonDeserialize = (JsonDeserialize) r3.A06(JsonDeserialize.class)) == null || (keyUsing = jsonDeserialize.keyUsing()) == C8162QiN.class) {
            return null;
        }
        return keyUsing;
    }

    public final Object A0c(C269064eW r3) {
        JsonSerialize jsonSerialize;
        Class<JsonSerializer.None> keyUsing;
        if (!(this instanceof C268844e9) || (jsonSerialize = (JsonSerialize) r3.A06(JsonSerialize.class)) == null || (keyUsing = jsonSerialize.keyUsing()) == JsonSerializer.None.class) {
            return null;
        }
        return keyUsing;
    }

    public final Object A0d(C269064eW r4) {
        JsonSerialize jsonSerialize;
        if ((this instanceof C268844e9) && (jsonSerialize = (JsonSerialize) r4.A06(JsonSerialize.class)) != null) {
            Class<C12448Suf> converter = jsonSerialize.converter();
            Class<C12448Suf> cls = C12448Suf.class;
            if (converter == null || C269574fL.A0I(converter) || converter == cls) {
                return null;
            }
            return converter;
        }
        return null;
    }

    public final Object A0e(C269054eV r2) {
        JsonNaming jsonNaming;
        if (!(this instanceof C268844e9) || (jsonNaming = (JsonNaming) r2.A06(JsonNaming.class)) == null) {
            return null;
        }
        return jsonNaming.value();
    }

    public final Object A0f(C8208QkH qkH) {
        JsonDeserialize jsonDeserialize;
        if ((this instanceof C268844e9) && (jsonDeserialize = (JsonDeserialize) qkH.A06(JsonDeserialize.class)) != null) {
            Class<C12448Suf> contentConverter = jsonDeserialize.contentConverter();
            Class<C12448Suf> cls = C12448Suf.class;
            if (contentConverter == null || C269574fL.A0I(contentConverter) || contentConverter == cls) {
                return null;
            }
            return contentConverter;
        }
        return null;
    }

    public final Object A0g(C8208QkH qkH) {
        JsonSerialize jsonSerialize;
        if ((this instanceof C268844e9) && (jsonSerialize = (JsonSerialize) qkH.A06(JsonSerialize.class)) != null) {
            Class<C12448Suf> contentConverter = jsonSerialize.contentConverter();
            Class<C12448Suf> cls = C12448Suf.class;
            if (contentConverter == null || C269574fL.A0I(contentConverter) || contentConverter == cls) {
                return null;
            }
            return contentConverter;
        }
        return null;
    }

    public final String A0h(C269064eW r4) {
        JsonProperty jsonProperty;
        if ((this instanceof C268844e9) && (jsonProperty = (JsonProperty) r4.A06(JsonProperty.class)) != null) {
            String defaultValue = jsonProperty.defaultValue();
            if (!defaultValue.isEmpty()) {
                return defaultValue;
            }
        }
        return null;
    }

    public final String A0i(C269064eW r2) {
        JsonPropertyDescription jsonPropertyDescription;
        if (!(this instanceof C268844e9) || (jsonPropertyDescription = (JsonPropertyDescription) r2.A06(JsonPropertyDescription.class)) == null) {
            return null;
        }
        return jsonPropertyDescription.value();
    }

    public final String A0j(C269054eV r2) {
        JsonTypeName jsonTypeName;
        if (!(this instanceof C268844e9) || (jsonTypeName = (JsonTypeName) r2.A06(JsonTypeName.class)) == null) {
            return null;
        }
        return jsonTypeName.value();
    }

    public final List A0k(C269064eW r6) {
        JsonAlias jsonAlias;
        if (!(this instanceof C268844e9) || (jsonAlias = (JsonAlias) r6.A06(JsonAlias.class)) == null) {
            return null;
        }
        String[] value = jsonAlias.value();
        int length = value.length;
        if (length == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(length);
        int i = 0;
        do {
            arrayList.add(C269434f7.A00(value[i]));
            i++;
        } while (i < length);
        return arrayList;
    }

    public final List A0l(C269064eW r12) {
        JsonSubTypes jsonSubTypes;
        if (!(this instanceof C268844e9) || (jsonSubTypes = (JsonSubTypes) r12.A06(JsonSubTypes.class)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(r8);
        for (JsonSubTypes.Type type : jsonSubTypes.value()) {
            arrayList.add(new T9Y(type.value(), type.name()));
            for (String t9y : type.names()) {
                arrayList.add(new T9Y(type.value(), t9y));
            }
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [java.lang.String[]] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0m(java.lang.Class r9, java.lang.Enum[] r10, java.lang.String[] r11) {
        /*
            r8 = this;
            boolean r0 = r8 instanceof X.C268844e9
            if (r0 == 0) goto L_0x0051
            java.lang.reflect.Field[] r7 = r9.getDeclaredFields()
            int r6 = r7.length
            r4 = 0
            r3 = 0
            r5 = 0
        L_0x000c:
            if (r5 >= r6) goto L_0x003b
            r2 = r7[r5]
            boolean r0 = r2.isEnumConstant()
            if (r0 == 0) goto L_0x0038
            java.lang.Class<com.fasterxml.jackson.annotation.JsonProperty> r0 = com.fasterxml.jackson.annotation.JsonProperty.class
            java.lang.annotation.Annotation r0 = r2.getAnnotation(r0)
            com.fasterxml.jackson.annotation.JsonProperty r0 = (com.fasterxml.jackson.annotation.JsonProperty) r0
            if (r0 == 0) goto L_0x0038
            java.lang.String r1 = r0.value()
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0038
            if (r3 != 0) goto L_0x0031
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
        L_0x0031:
            java.lang.String r0 = r2.getName()
            r3.put(r0, r1)
        L_0x0038:
            int r5 = r5 + 1
            goto L_0x000c
        L_0x003b:
            if (r3 == 0) goto L_0x0051
            int r1 = r10.length
        L_0x003e:
            if (r4 >= r1) goto L_0x0051
            r0 = r10[r4]
            java.lang.String r0 = r0.name()
            java.lang.Object r0 = r3.get(r0)
            if (r0 == 0) goto L_0x004e
            r11[r4] = r0
        L_0x004e:
            int r4 = r4 + 1
            goto L_0x003e
        L_0x0051:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C268854eA.A0m(java.lang.Class, java.lang.Enum[], java.lang.String[]):void");
    }

    public final void A0n(Class cls, Enum[] enumArr, String[][] strArr) {
        JsonAlias jsonAlias;
        if (this instanceof C268844e9) {
            for (Field field : cls.getDeclaredFields()) {
                if (field.isEnumConstant() && (jsonAlias = (JsonAlias) field.getAnnotation(JsonAlias.class)) != null) {
                    String[] value = jsonAlias.value();
                    if (value.length != 0) {
                        String name = field.getName();
                        int length = enumArr.length;
                        for (int i = 0; i < length; i++) {
                            if (name.equals(enumArr[i].name())) {
                                strArr[i] = value;
                            }
                        }
                    }
                }
            }
        }
    }

    public final boolean A0o(C8208QkH qkH) {
        JsonIgnore jsonIgnore;
        if (!(this instanceof C268844e9) || (jsonIgnore = (JsonIgnore) qkH.A06(JsonIgnore.class)) == null) {
            return false;
        }
        return jsonIgnore.value();
    }

    public final boolean A0p(Annotation annotation) {
        if (!(this instanceof C268844e9)) {
            return false;
        }
        Class<? extends Annotation> annotationType = annotation.annotationType();
        C268874eC r2 = ((C268844e9) this).A00;
        Boolean bool = (Boolean) r2.A00.get(annotationType);
        if (bool == null) {
            boolean z = false;
            if (annotationType.getAnnotation(JacksonAnnotationsInside.class) != null) {
                z = true;
            }
            bool = Boolean.valueOf(z);
            r2.putIfAbsent(annotationType, bool);
        }
        return bool.booleanValue();
    }

    public final Class[] A0q(C269064eW r2) {
        JsonView jsonView;
        if (!(this instanceof C268844e9) || (jsonView = (JsonView) r2.A06(JsonView.class)) == null) {
            return null;
        }
        return jsonView.value();
    }

    public final String[] A0r(C269054eV r2) {
        JsonPropertyOrder jsonPropertyOrder;
        if (!(this instanceof C268844e9) || (jsonPropertyOrder = (JsonPropertyOrder) r2.A06(JsonPropertyOrder.class)) == null) {
            return null;
        }
        return jsonPropertyOrder.value();
    }
}
