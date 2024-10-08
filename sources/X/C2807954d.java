package X;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.stream.JsonReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.54d  reason: invalid class name and case insensitive filesystem */
public final class C2807954d extends JsonReader {
    public static final Reader A04 = new RD5();
    public static final Object A05 = new Object();
    public int A00 = 0;
    public Object[] A01 = new Object[32];
    public String[] A02 = new String[32];
    public int[] A03 = new int[32];

    public final String A0H() {
        return A01(false);
    }

    public final String A0I() {
        return A01(true);
    }

    public final void close() {
        this.A01 = new Object[]{A05};
        this.A00 = 1;
    }

    public C2807954d(JsonElement jsonElement) {
        super(A04);
        A03(this, jsonElement);
    }

    private Object A00() {
        Object[] objArr = this.A01;
        int i = this.A00 - 1;
        this.A00 = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    private String A01(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i = 0;
        while (true) {
            int i2 = this.A00;
            if (i >= i2) {
                return sb.toString();
            }
            Object[] objArr = this.A01;
            Object obj = objArr[i];
            if (obj instanceof JsonArray) {
                i++;
                if (i < i2 && (objArr[i] instanceof Iterator)) {
                    int i3 = this.A03[i];
                    if (z && i3 > 0 && (i == i2 - 1 || i == i2 - 2)) {
                        i3--;
                    }
                    sb.append('[');
                    sb.append(i3);
                    sb.append(']');
                }
            } else if ((obj instanceof JsonObject) && (i = i + 1) < i2 && (objArr[i] instanceof Iterator)) {
                sb.append('.');
                String str = this.A02[i];
                if (str != null) {
                    sb.append(str);
                }
            }
            i++;
        }
    }

    public static void A03(C2807954d r3, Object obj) {
        int i = r3.A00;
        Object[] objArr = r3.A01;
        if (i == objArr.length) {
            int i2 = i * 2;
            r3.A01 = Arrays.copyOf(objArr, i2);
            r3.A03 = Arrays.copyOf(r3.A03, i2);
            r3.A02 = (String[]) Arrays.copyOf(r3.A02, i2);
        }
        Object[] objArr2 = r3.A01;
        int i3 = r3.A00;
        r3.A00 = i3 + 1;
        objArr2[i3] = obj;
    }

    public final Integer A0G() {
        int i = this.A00;
        if (i == 0) {
            return AnonymousClass05K.A1I;
        }
        Object[] objArr = this.A01;
        Object obj = objArr[i - 1];
        if (obj instanceof Iterator) {
            boolean z = objArr[i - 2] instanceof JsonObject;
            Iterator it = (Iterator) obj;
            if (it.hasNext()) {
                if (z) {
                    return AnonymousClass05K.A0Y;
                }
                A03(this, it.next());
                return A0G();
            } else if (z) {
                return AnonymousClass05K.A0N;
            } else {
                return AnonymousClass05K.A01;
            }
        } else if (obj instanceof JsonObject) {
            return AnonymousClass05K.A0C;
        } else {
            if (obj instanceof JsonArray) {
                return AnonymousClass05K.A00;
            }
            if (obj instanceof JsonPrimitive) {
                Object obj2 = ((JsonPrimitive) obj).value;
                if (obj2 instanceof String) {
                    return AnonymousClass05K.A0j;
                }
                if (obj2 instanceof Boolean) {
                    return AnonymousClass05K.A15;
                }
                if (obj2 instanceof Number) {
                    return AnonymousClass05K.A0u;
                }
                throw new AssertionError();
            } else if (obj instanceof R2D) {
                return AnonymousClass05K.A1F;
            } else {
                if (obj == A05) {
                    throw new IllegalStateException(AnonymousClass000.A00(2337));
                }
                throw new IOException(002.A0g("Custom JsonElement subclass ", obj.getClass().getName(), AnonymousClass000.A00(396)));
            }
        }
    }

    public final String A0J() {
        A02(this, AnonymousClass05K.A0Y);
        Map.Entry entry = (Map.Entry) ((Iterator) this.A01[this.A00 - 1]).next();
        String str = (String) entry.getKey();
        this.A02[this.A00 - 1] = str;
        A03(this, entry.getValue());
        return str;
    }

    public final void A0M() {
        A02(this, AnonymousClass05K.A00);
        A03(this, ((JsonArray) this.A01[this.A00 - 1]).iterator());
        this.A03[this.A00 - 1] = 0;
    }

    public final void A0N() {
        A02(this, AnonymousClass05K.A0C);
        A03(this, ((JsonObject) this.A01[this.A00 - 1]).entrySet().iterator());
    }

    public final void A0O() {
        A02(this, AnonymousClass05K.A01);
        A00();
        A00();
        int i = this.A00;
        if (i > 0) {
            int[] iArr = this.A03;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    public final void A0P() {
        A02(this, AnonymousClass05K.A0N);
        this.A02[this.A00 - 1] = null;
        A00();
        A00();
        int i = this.A00;
        if (i > 0) {
            int[] iArr = this.A03;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    public final void A0Q() {
        A02(this, AnonymousClass05K.A1F);
        A00();
        int i = this.A00;
        if (i > 0) {
            int[] iArr = this.A03;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    public final boolean A0T() {
        A02(this, AnonymousClass05K.A15);
        boolean asBoolean = ((JsonElement) A00()).getAsBoolean();
        int i = this.A00;
        if (i > 0) {
            int[] iArr = this.A03;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return asBoolean;
    }

    public static void A02(C2807954d r6, Integer num) {
        if (r6.A0G() != num) {
            throw new IllegalStateException(002.A11("Expected ", SA9.A01(num), " but was ", SA9.A00(r6.A0G()), 002.A0R(" at path ", r6.A01(false))));
        }
    }

    public final double A0C() {
        Integer A0G = A0G();
        if (A0G == AnonymousClass05K.A0u || A0G == AnonymousClass05K.A0j) {
            double asDouble = ((JsonElement) this.A01[this.A00 - 1]).getAsDouble();
            if (this.A07 || (!Double.isNaN(asDouble) && !Double.isInfinite(asDouble))) {
                A00();
                int i = this.A00;
                if (i > 0) {
                    int[] iArr = this.A03;
                    int i2 = i - 1;
                    iArr[i2] = iArr[i2] + 1;
                }
                return asDouble;
            }
            throw new IOException(002.A0M(AnonymousClass000.A00(452), asDouble));
        }
        throw new IllegalStateException(002.A11("Expected ", "NUMBER", " but was ", SA9.A00(A0G), 002.A0R(" at path ", A01(false))));
    }

    public final int A0D() {
        Integer A0G = A0G();
        if (A0G == AnonymousClass05K.A0u || A0G == AnonymousClass05K.A0j) {
            int asInt = ((JsonElement) this.A01[this.A00 - 1]).getAsInt();
            A00();
            int i = this.A00;
            if (i > 0) {
                int[] iArr = this.A03;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return asInt;
        }
        throw new IllegalStateException(002.A11("Expected ", "NUMBER", " but was ", SA9.A00(A0G), 002.A0R(" at path ", A01(false))));
    }

    public final long A0F() {
        Integer A0G = A0G();
        if (A0G == AnonymousClass05K.A0u || A0G == AnonymousClass05K.A0j) {
            long asLong = ((JsonElement) this.A01[this.A00 - 1]).getAsLong();
            A00();
            int i = this.A00;
            if (i > 0) {
                int[] iArr = this.A03;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return asLong;
        }
        throw new IllegalStateException(002.A11("Expected ", "NUMBER", " but was ", SA9.A00(A0G), 002.A0R(" at path ", A01(false))));
    }

    public final String A0K() {
        Integer A0G = A0G();
        if (A0G == AnonymousClass05K.A0j || A0G == AnonymousClass05K.A0u) {
            String asString = ((JsonElement) A00()).getAsString();
            int i = this.A00;
            if (i > 0) {
                int[] iArr = this.A03;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return asString;
        }
        throw new IllegalStateException(002.A11("Expected ", "STRING", " but was ", SA9.A00(A0G), 002.A0R(" at path ", A01(false))));
    }

    public final void A0R() {
        int intValue = A0G().intValue();
        if (intValue == 4) {
            A02(this, AnonymousClass05K.A0Y);
            Map.Entry entry = (Map.Entry) ((Iterator) this.A01[this.A00 - 1]).next();
            entry.getKey();
            this.A02[this.A00 - 1] = "<skipped>";
            A03(this, entry.getValue());
        } else if (intValue == 1) {
            A0O();
        } else if (intValue == 3) {
            A0P();
        } else if (intValue != 9) {
            A00();
            int i = this.A00;
            if (i > 0) {
                int[] iArr = this.A03;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
        }
    }

    public final boolean A0S() {
        Integer A0G = A0G();
        if (A0G == AnonymousClass05K.A0N || A0G == AnonymousClass05K.A01 || A0G == AnonymousClass05K.A1I) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return 002.A0R(getClass().getSimpleName(), 002.A0R(" at path ", A01(false)));
    }
}
