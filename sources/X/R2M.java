package X;

import com.google.gson.stream.JsonReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public final class R2M extends 2OZ {
    public static final Map A03;
    public final Constructor A00;
    public final Map A01 = AnonymousClass7TE.A1E();
    public final Object[] A02;

    public final /* bridge */ /* synthetic */ Object A00() {
        return this.A02.clone();
    }

    public final /* bridge */ /* synthetic */ Object A01(Object obj) {
        Object[] objArr = (Object[]) obj;
        try {
            return this.A00.newInstance(objArr);
        } catch (IllegalAccessException e) {
            2OR r0 = 2OP.A00;
            throw Pxe.A0u("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        } catch (IllegalArgumentException | InstantiationException e2) {
            throw Pxe.A0u(002.A0u("Failed to invoke constructor '", 2OP.A01(this.A00), "' with args ", Arrays.toString(objArr)), e2);
        } catch (InvocationTargetException e3) {
            throw Pxe.A0u(002.A0u("Failed to invoke constructor '", 2OP.A01(this.A00), "' with args ", Arrays.toString(objArr)), e3.getCause());
        }
    }

    public final /* bridge */ /* synthetic */ void A02(2OX r6, JsonReader jsonReader, Object obj) {
        Object[] objArr = (Object[]) obj;
        Map map = this.A01;
        String str = r6.A00;
        Number A14 = C51966G9m.A14(str, map);
        if (A14 != null) {
            int intValue = A14.intValue();
            Object read = r6.A06.read(jsonReader);
            if (read != null || !r6.A0A) {
                objArr[intValue] = read;
                return;
            }
            throw new RuntimeException(002.A0u("null is not allowed as value for record component '", str, "' of primitive type; at path ", jsonReader.A0H()));
        }
        throw AnonymousClass7TE.A0z(002.A11("Could not find the index in the constructor '", 2OP.A01(this.A00), "' for field with name '", str, "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters."));
    }

    static {
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put(Byte.TYPE, (byte) 0);
        A1E.put(Short.TYPE, (short) 0);
        C66581MXm.A1S(Integer.TYPE, A1E, 0);
        A1E.put(Long.TYPE, C51971G9r.A0m());
        A1E.put(Float.TYPE, C51967G9n.A0g());
        A1E.put(Double.TYPE, Double.valueOf(0.0d));
        A1E.put(Character.TYPE, 0);
        A1E.put(Boolean.TYPE, false);
        A03 = A1E;
    }

    public R2M(Class cls, Map map) {
        super(map);
        2OR r1 = 2OP.A00;
        Constructor A002 = r1.A00(cls);
        this.A00 = A002;
        2OP.A03(A002);
        String[] A032 = r1.A03(cls);
        for (int i = 0; i < A032.length; i++) {
            C66580MXl.A1T(A032[i], this.A01, i);
        }
        Class[] parameterTypes = this.A00.getParameterTypes();
        int length = parameterTypes.length;
        this.A02 = new Object[length];
        for (int i2 = 0; i2 < length; i2++) {
            this.A02[i2] = A03.get(parameterTypes[i2]);
        }
    }
}
