package X;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.T4a  reason: case insensitive filesystem */
public final class C12716T4a implements C13745TgH, C13746TgI {
    public final JsonWriter A00;
    public final boolean A01;
    public final C13961TmO A02;
    public final Map A03;
    public final Map A04;

    public final void A00(Object obj) {
        JsonWriter jsonWriter;
        JsonWriter jsonWriter2;
        int i = 0;
        if (obj != null) {
            if (obj instanceof Number) {
                this.A00.value((Number) obj);
                return;
            }
            Class<?> cls = obj.getClass();
            if (cls.isArray()) {
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    if (bArr != null) {
                        this.A00.value(Base64.encodeToString(bArr, 2));
                        return;
                    }
                } else {
                    jsonWriter = this.A00;
                    jsonWriter.beginArray();
                    if (obj instanceof int[]) {
                        int[] iArr = (int[]) obj;
                        int length = iArr.length;
                        while (i < length) {
                            jsonWriter.value((long) iArr[i]);
                            i++;
                        }
                    } else if (obj instanceof long[]) {
                        long[] jArr = (long[]) obj;
                        int length2 = jArr.length;
                        while (i < length2) {
                            jsonWriter.value(jArr[i]);
                            i++;
                        }
                    } else if (obj instanceof double[]) {
                        double[] dArr = (double[]) obj;
                        int length3 = dArr.length;
                        while (i < length3) {
                            jsonWriter.value(dArr[i]);
                            i++;
                        }
                    } else if (obj instanceof boolean[]) {
                        boolean[] zArr = (boolean[]) obj;
                        int length4 = zArr.length;
                        while (i < length4) {
                            jsonWriter.value(zArr[i]);
                            i++;
                        }
                    } else if (obj instanceof Number[]) {
                        for (Number A002 : (Number[]) obj) {
                            A00(A002);
                        }
                    } else {
                        for (Object A003 : (Object[]) obj) {
                            A00(A003);
                        }
                    }
                }
            } else if (obj instanceof Collection) {
                jsonWriter = this.A00;
                jsonWriter.beginArray();
                for (Object A004 : (Collection) obj) {
                    A00(A004);
                }
            } else {
                if (obj instanceof Map) {
                    jsonWriter2 = this.A00;
                    jsonWriter2.beginObject();
                    Iterator A0u = AnonymousClass7TF.A0u((Map) obj);
                    while (A0u.hasNext()) {
                        Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                        Object key = A1J.getKey();
                        try {
                            String str = (String) key;
                            Object value = A1J.getValue();
                            if (!this.A01) {
                                jsonWriter2.name(str);
                                if (value == null) {
                                    jsonWriter2.nullValue();
                                }
                            } else if (value != null) {
                                jsonWriter2.name(str);
                            }
                            A00(value);
                        } catch (ClassCastException e) {
                            throw new RuntimeException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", new Object[]{key, key.getClass()}), e);
                        }
                    }
                } else {
                    C13654TeL teL = (C13654TeL) this.A03.get(cls);
                    if (teL == null) {
                        C13654TeL teL2 = (C13654TeL) this.A04.get(cls);
                        if (teL2 != null) {
                            teL2.ARq(obj, this);
                            return;
                        } else if (obj instanceof Enum) {
                            this.A00.value(((Enum) obj).name());
                            return;
                        } else {
                            teL = this.A02;
                        }
                    }
                    jsonWriter2 = this.A00;
                    jsonWriter2.beginObject();
                    teL.ARq(obj, this);
                }
                jsonWriter2.endObject();
                return;
            }
            jsonWriter.endArray();
            return;
        }
        this.A00.nullValue();
    }

    public final C13745TgH A7P(C11357SOt sOt, long j) {
        String str = sOt.A00;
        JsonWriter jsonWriter = this.A00;
        jsonWriter.name(str);
        jsonWriter.value(j);
        return this;
    }

    public final C13745TgH A7Q(C11357SOt sOt, Object obj) {
        String str = sOt.A00;
        if (this.A01) {
            if (obj != null) {
                this.A00.name(str);
            }
            return this;
        }
        JsonWriter jsonWriter = this.A00;
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        A00(obj);
        return this;
    }

    public final /* bridge */ /* synthetic */ C13746TgI A7R(String str) {
        this.A00.value(str);
        return this;
    }

    public final /* bridge */ /* synthetic */ C13746TgI A7S(boolean z) {
        this.A00.value(z);
        return this;
    }

    public C12716T4a(C13961TmO tmO, Writer writer, Map map, Map map2, boolean z) {
        this.A00 = new JsonWriter(writer);
        this.A03 = map;
        this.A04 = map2;
        this.A02 = tmO;
        this.A01 = z;
    }
}
